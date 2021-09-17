package main

import (
	"fmt"
	"time"
)

func main() {
	start := time.Now()
	var fibonacci = fib(44)
	elapsed := time.Since(start)
	fmt.Println("go")
	fmt.Println(fibonacci)
	fmt.Println(elapsed)
	fmt.Println("---")
}
func fib(n int) int {
	if n <= 1 {
		return n
	}
	return fib(n-1) + fib(n-2)
}
