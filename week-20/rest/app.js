const express = require('express');
const path = require('path');

const app = express();
const PORT = 8080;

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
    // res.json(
    //     {
    //         appended: `${req.params.appendable}a`
    //     }
    // );
    let appended = req.params.appendable + "a";
    let responseObject = {
      "appended": appended
    };
    res.send(responseObject);
}
);