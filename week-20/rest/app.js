'use strict';

const express = require('express');
const path = require('path');
const bodyParser = require('body-parser');

const app = express();
const PORT = 8080;

app.use(bodyParser.json());
app.use(express.static('assets'));

app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'index.html'));
});

app.listen(PORT, () => {
    console.log(`The server is up and running on ${PORT}`);
});

app.get('/doubling', (req, res) => {

    const doubling = Number(req.query.input * 2);

    if (!req.query.input) {
        res.json(
            {
                error: "Please provide an input!",
            }
        );
    } else {
        res.json(
            {
                received: Number(req.query.input),
                result: doubling
            }
        );
    }
}
);

app.get('/greeter', (req, res) => {

    if (!req.query.name && !req.query.title) {
        res.status(400).send(
            {
                error: "Please provide a name and a title!"
            }

        );
    } else if (!req.query.name) {
        res.status(400).send(
            {
                error: "Please provide a name!"
            }
        );
    } else if (!req.query.title) {
        res.status(400).send(
            {
                error: "Please provide a title!"
            }
        );
    } else {
        res.json(
            {
                welcome_message: `Oh, hi there ${req.query.name}, my dear ${req.query.title}!`
            }
        );
    }
}
);

app.get('/appenda/:appendable', (req, res) => {
    let appended = req.params.appendable + "a";
    let responseObject = {
        "appended": appended
    };
    res.send(responseObject);
}
);

app.post('/dountil/:action', (req, res) => {
    let number = req.body.until;
    let action = req.params.action;
    let result;
    let responseObject = {};
  
    if (!number) {
      responseObject = {
        "error": "Please provide a number!"
      };
    } else {
      if (action === 'sum') {
        let sum = 0;
        for (let i = 1; i <= number; i++) {
          sum += i;
        }
        result = sum;
      } else if (action === 'factor') {
        let fac = 1;
        for (let i = 1; i <= number; i++) {
          fac *= i;
        }
        result = fac;
      }
      responseObject = {
        "result": result
      }
    }
    res.send(responseObject);
  });
