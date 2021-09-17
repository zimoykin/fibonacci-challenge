 
import Foundation

func main () {
    let start = NSDate()
    let fibonacci = fib(44)
    let end = NSDate()
    print("swift")
    print("fibonacci: " + String(fibonacci))
    print( String(format: "%.02f", end.timeIntervalSince1970 - start.timeIntervalSince1970) )
    print("---")
    
}
func fib(_ n: Int) -> Int {
    return n <= 1 ? n : fib(n-1) + fib(n-2)
}


main();
