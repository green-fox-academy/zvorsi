'use strict';

console.log('Hello world!');

let myName: string = 'Orsi';
console.log(`hello ${myName}`);

// humpty Dumpty
console.log('Humpty Dumpty sat on a wall,');
console.log('Humpty Dumpty had a great fall.');
console.log('All the king\'s horses and all the king\'s men');
console.log('Couldn\'t put Humpty together again.');

// Greet 3 of your classmates
let greet: string = "Hello";
console.log(greet + ", Esther!");
console.log(greet + ", Mary!");
console.log(greet + ", Joe!");

// introduce yourself
let age: number = 46;
let height: number = 1.72;

console.log(myName);
console.log(age);
console.log(height);

// coding hours
let semester: number = 17;
let daily: number = 6;
let totalHours: number = semester * daily * 5;
console.log(totalHours);
let averageDailyWorkHours: number = 52 / 5;
console.log((daily / averageDailyWorkHours * 100 ).toFixed(2)  + '%');


//cuboid
let sideA: number = 2;
let sideB: number = 3;
let sideC: number = 4;
console.log("surface area: " + 2 * (sideA * sideB + sideA * sideC + sideB * sideC));
console.log("volume: " + sideA * sideB * sideC);


//conditional variable mutation
let a: number = 24;
let out: number = 0;
if(a % 2 == 0){
    out++;
}
console.log(out);

let b: number = 20;
let out2: string = '';
if (b < 10){
    out2 = "less";
}else if (b > 20){
    out2 = "more";
} else {
    out2 = "sweet";
}
console.log(out2);

let c: number = 123;
let credits: number = 10;
let isBonus: boolean = false;

if(credits >= 50 && isBonus == false){
    c = c - 2;
}else if (credits < 50 && isBonus == false){
    c = c - 1;
}
console.log(c);

//fizzbuzz
for (let i: number = 1; i < 101; i++){
    if(i % 3 === 0){
        console.log("fizz");
    } else if (i % 5 === 0){
        console.log("buzz");
    } else if (i % 3 === 0 && i % 5 === 0){
        console.log("fizzbuzz");
    }else{
        console.log(i);
    }
}

// diamond
let lineCount: number = 3;
/*let mySpace: string = "";
let star: string = "*";
for (let i: number = 1; i <= lineCount; i++){
    for (let j: number = 1; j <= lineCount - 1; j++){
        //console.log(oneSpace);
        mySpace += " ";
    }
    for (let k: number = 1; k <= (2 * i) - 1; k++){
        //console.log(star);
        star += "*";
    }
    console.log(mySpace + star);
}
for (let i: number = lineCount - 1; i > 0; i--){
    for (let j: number = 1; j <= lineCount - i; j++){
        console.log(mySpace);
    }
    for (let k: number = 1; k <= (2 * i) - 1; k++){
        console.log(star);
    }
    console.log(mySpace);
}*/

let output = "";          
let mySpace = "";

for (let i = 0; i < lineCount; i++) { 
    for (let j = 1; j < (lineCount - i); j++) { 
        mySpace += " ";
    }
    for (let k = 1; k <= (2 * i) + 1; k++) {
        output += "*";
    }
  console.log(mySpace + output);
    output = "";
}
for (let i = lineCount - 2; i >= 0; i--) { 
    for (let j = lineCount - 1; j < i; j--) { 
        mySpace += " ";
    }
    for (let k = 1; k <= (2 * i) + 1; k++) {
        output += "*";
    }
    console.log(mySpace + output);
    output = "";
}
