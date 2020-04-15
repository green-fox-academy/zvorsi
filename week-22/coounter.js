'use strict';

const button = document.querySelector('button');
const list = document.querySelectorAll('li');
const result = document.getElementsByClassName('result');

button.addEventListener('click', () => {
    console.log(button);
});

button.addEventListener('click', function () {
    result.innerText = list.length;
});