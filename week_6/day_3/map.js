const myNumbers = [1, 2, 3, 4];


const multipliedByTwo = function (arrayOfNums) {
    const mutipliedNums = arrayOfNums.map((number) => {
        return number * 2;
    });
    return mutipliedNums;
}

console.log(`Multiplied nums: `, multipliedByTwo(myNumbers));