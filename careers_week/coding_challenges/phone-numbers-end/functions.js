function createPhoneNumber(numbers) {
    // Simple array manipulation and formatted string version:
    const diallingCode = numbers.slice(0, 3).join('');
    const firstPart = numbers.slice(3, 6).join('');
    const lastPart = numbers.slice(6, 10).join('');

    return `(${diallingCode}) ${firstPart}-${lastPart}`
    
    // Regular expression (regex) version:
    // return numbers.join('').replace(/(\d{3})(\d{3})(\d{4})/, "($1) $2-$3");
}

module.exports = createPhoneNumber;