'use strict';

const test = require('tape');
const request = require('supertest');
const app = require('../routes');

test('testing get /yondu endpoint with query', (t) => {
    request(app)
        .get('/yondu?distance=100&time=20')
        .expect(200)
        .expect('Content-Type', /json/)
        .end((err, res) => {
            if (err) throw err;
            t.same(res.body, {
                "distance": "100",
                "time": "20";
                "speed": "5.0"
            }, 'all good');
            t.end();
        });
});

test('testing fet /yondu endpoint without query', (t) => {
    request(app)
        .get('/yondu?distance=100&time=0')
        .expect(404)
        .expect('Content-Type', /json/)
        .end((err, res) => {
            if (err) throw err;
            t.same(res.body, {
                "error": "please provide not null valid distance"
            }, 'not good');
        });
});

test('testing get /yondu endpoint without query', (t) => {
    request(app)
        .get('/yondu?distance=100')
        .expect(404)
        .expect('Content-Type', /json/)
        .end((err, res) => {
            if (err) throw err;
            t.same(res.body, {
                "error": "please provide a not null valid time and distance"
            }, 'not good, no time');
            t.end();
        });
});

test('testing get /yondu endpoint without query', (t) => {
    request(app)
        .get('/yondu?time=0')
        .expect(404)
        .expect('Content-Type', /json/)
        .end((err, res) => {
            if (err) throw err;
            t.same(res.body, {
                "error": "please provide a not null valid time and distance"
            }, 'not good, no distance');
            t.end();
        });
});