'use strict';

const express = require('express');
const app = express();
const PORT = 3000;

app.set('view engine', 'ejs');
app.use('/assets', express.static(__dirname + '/assets'));

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
  

app.get('/', (req, res) => {

  conn.query('select * from reddit.reddit', (err, rows) =>{
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

app.listen(3000, () => {
  console.log('the app is listening');
});
