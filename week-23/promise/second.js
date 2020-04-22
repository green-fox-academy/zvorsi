'use strict';

let calculateFutureValue = (resolve) => {
    setTimeout(() => {
        resolve('FULFILLED!');
    }, 300);
}

const promise = new Promise(calculateFutureValue)
    .then((fulfill) => console.log(fulfill));