const uniqueInOrder = function(iterable) {
    //your code here - remember iterable can be a string or an array
    let iterableArray = iterable
    let uniqueArray = [];

    for (let i = 0; i < iterableArray.length; i++) {
        if (iterableArray[i] !== iterableArray[i + 1]) {
            uniqueArray.push(iterableArray[i])
        }
    }
    return uniqueArray
}

uniqueInOrder('AAAABBBCCDAABBB');
uniqueInOrder([1, 3, 5, 5, 1, 2, 2, 4, 3, 1]);