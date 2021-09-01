function fib(n) {
    return n <= 1 ? n : fib(n-1) + fib(n-2)
};
console.log("node");
console.time('fib')
console.log(fib(44));
console.timeEnd('fib')