// const FindEvenNumbers = function (numbers) {
//     const evenNums = [];

//     numbers.forEach((number) => {
//         if (number % 2 ===0){
//         evenNums.push(number);
//         }
//     })

//     return evenNums;
// }

// console.log(`Even numbers from the array: `, FindEvenNumbers(myNumbers));

const getEvens = function (arrayOfNums) {
    const evenNumbers = arrayOfNums.filter((number) => {
        return number % 2 === 0; 
        
    });

    return evenNumbers;
}

const numbers = [1,2,3,4,5,6,7,8];
console.log(`Even numbers: `, getEvens(numbers));

const getOdds = function (arrayOfNums) {
    const OddNumbers = arrayOfNums.filter((number) => {
        return number % 2 !== 0;
    });

    return OddNumbers;
}

console.log(`Odd numbers: `, getOdds(numbers));