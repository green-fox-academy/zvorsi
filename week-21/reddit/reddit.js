'use strict';

const express = require('express');
const app = express();
const PORT = 3000;
const bodyParser = require('body-parser');


app.set('view engine', 'ejs');
app.use('/assets', express.static(__dirname + '/assets'));
app.use(bodyParser.urlencoded({ extended: false }));

const mysql = require('mysql');
const conn = mysql.createConnection({
  host: 'localhost',
  user: 'orsi',
  password: 'password',
  database: 'reddit'
});


app.get('/hello', (req, res) => {
    res.send('Hello World');
  });


app.get('/reddit', (req, res) => {

  conn.query('SELECT * FROM reddit.reddit ORDER BY like_counter DESC', (err, rows) =>{ //a desc után majd egy 'limit 3' is kell, ha a lapozás meglesz
    if (err){
      console.log('error', err);
      res.status(500);
    }else{
    res.render('index', {
      rows
    });
  }
  });

});

app.get('/new-post', (req, res) => {

    conn.query('SELECT * FROM reddit.reddit ORDER BY id DESC LIMIT 10;', (err, rows) => {
      if (err) {
        res.send(err);
      } else {
        res.render('new-post', {
            rows
        });
      }
    });

});


app.post('/new-post', (req, res) => {
    let title = req.body.title;
    let url = req.body.url;
    let timestamp = new Date(); //vagy lehet, hogy ez kell ide: new date().toLocaleDateString();

    conn.query('INSERT INTO reddit.reddit (title, url, post_date) VALUES (?, ?, ?)', [title, url, timestamp], (err, rows) => {
        if(err){
            res.send(err);
        }else{
            res.redirect('/reddit');
        }
    });
});




app.put('/upvote/:id', (req, res) => {
    let post_id = req.params.id;
    conn.query(`UPDATE reddit.reddit SET like_counter = like_counter + 1 WHERE id = ${req.params.id}`, [id], (err, rows) => {
      if (err) {
        res.status(500).send('Database error');
      } else {
        conn.query(`SELECT * FROM reddit.reddit WHERE id = ${req.params.id}`, [id], (err, rows) => {
          res.redirect('/reddit');
        })
      }
    })
  });
  
  app.put('/downvote/:id', (req, res) => {
    let post_id = req.params.id;
    conn.query(`UPDATE reddit.reddit SET like_counter = like_counter - 1 WHERE id = ${req.params.id}`, [id], (err, rows) => {
      if (err) {
        res.status(500).send('Database error');
      } else {
        conn.query(`SELECT * FROM posts WHERE id = ${req.params.id}`, [id], (err, rows) => {
          res.redirect('/reddit');
        })
      }
    })
  });





app.listen(3000, () => {
  console.log('the app is listening');
});
