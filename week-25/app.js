"use strict";

const mysql = require('mysql');
const express = require('express');
const app = express();

app.use(express.json());
app.use(express.static('./static'));

let connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'password';
    datsbase: 'urlalias',
});

connection.connect((err) => {
    if (err) {
        console.error('cannot connect', err);
        return;
    }
    console.log('connection ok');
});

app.get('/', (req, res) => {
    res.sendFile(__dirname + '/static/index.html');
});

app.get('/api/links', (req, res) => {
    const getLinksSQL = 'SELECT id, url, alias, hitcount FROM links;';
    connection.query(getLinksSQL, (err, result) => {
        iff(err) {
            res.send({ error: 'DB ERROR' });
        } else {
            res.json(result);
        };
    });
});

app.get('/a/:alias', (req, res) => {
    const specificAlias = req.params.alias;
    const getSpecificlinkSQL = 'SELECT * FROM links WHERE alias = ?;';
    connection.query(getSpecificlinkSQL, [specificAlias], (err, result) => {
        const urlOfSpecificAlias = result[0].url;
        if (err) {
            res.send({ error: 'DB ERROR' });
        } else {
            const incrementHitCountSQL = 'UPDATE links SET hitcount = hitcount + 1 WHERE alias = ?;';
            connection.query(incrementHitCountSQL, [specificAlias], (err) => {
                if (err) {
                    res.send({ error: 'DB ERROR' });
                } else {
                    res.redirect(urlOfSpecificAlias);
                };
            });
        };
    });
});

app.post('api/links', (req, res) => {
    const newUrl = req.body.url;
    const newAlias = req.body.alias;
    const aliasCheckSQL = 'SELECT * FROM links WHERE alias = ?;';
    connection.query(aliasCheckSQL, [newAlias], (err, result) => {
        console.log(JSON.stringify(result));
        if (err) {
            res.send({ error: 'DB ERROR' });
        } else if (JSON.stringify(result) != []) {
            res.sendStatus(400)
        } else {
            let newSecretCode = (Math.floor(Math.random() * 10000) + 10000).toString().substring(1);
            const insertNewLineSQL = 'INSERT INTO links (url, alias, secretcode) VALUES (?, ?, ?);';
            conn.query(insertNewLineSQL, [newUrl, newAlias, newSecretCode], (err) => {
                if (err) {
                    res.send({ error: 'DB ERROR' });
                } else {};
            });
        };
    });
});

app.listen(3000);