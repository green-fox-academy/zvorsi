'use strict';

//change string part
let example: string = 'In a dishwasher far far away';
console.log(example);
let toChange: string = 'dishwasher';
let changeWith: string = 'galaxy';
let newstr = example.replace(toChange, changeWith); 
console.log(newstr)


//colors
let colors = [
    ["lime", "forest green", "olive", "pale green", "spring green"],
    ["orange red", "red", "tomato"],
    ["orchid", "violet", "pink", "hot pink"]
  ];
console.log(colors[0]);
console.log(colors[1]);
console.log(colors[2]);


//doubling
let baseNum: number = 12;
function doubling (baseNum: number){
    return baseNum * 2;
}
console.log(doubling(baseNum));


//unique
function unique(myArray: any) {
    let uniqueElements: any[] = [];
    for(let i: number = 0; i < myArray.length; i++){
        if (myArray.indexOf(myArray[i]) == i){
            uniqueElements.push(myArray[i]);
        } 
    console.log(uniqueElements);
    }
}
console.log(unique([1, 11, 34, 11, 52, 61, 1, 34]));
