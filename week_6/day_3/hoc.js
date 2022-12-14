// const myNumbers = [1, 2, 3, 4];

// for (const number of myNumbers) {
//     console.log('Number was: ${number}');
// }

// myNumbers.forEach((element) => {
//     console.log(`Number was: ${element}`);
// });

// const myNumberFunction = (number) => {
//     console.log(`Number was: ${number}`);
// };

// // myNumbers.forEach(myNumberFunction);

// myNumbers.forEach((number, index) => {
//     console.log(`Next number was: ${number} at index ${index}`);
// });

// const myNumberFunction = (number, index) => {
//     console.log(`Next number was: ${number} at index ${index}`);
// }

// myNumbers.forEach(myNumberFunction);

// const multipliedByTwo = function (numbers) {
//     const multipliedNums = [];

//     numbers.forEach((number) => {
//         const multipliedNum = number * 2;
//         multipliedNums.push(multipliedNum);
//     })

//     return multipliedNums;
// }

// console.log(`Numbers before multiplication: `, myNumbers);
// console.log(`Numbers after multiplication: `, multipliedByTwo(myNumbers));


const myNumbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const FindEvenNumbers = function (numbers) {
    const evenNums = [];

    numbers.forEach((number) => {
        if (number % 2 ===0){
        evenNums.push(number);
        }
    })

    return evenNums;
}

console.log(`Even numbers from the array: `, FindEvenNumbers(myNumbers));