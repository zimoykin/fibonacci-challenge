use std::time::Instant;

fn main() {
    let now = Instant::now();
    let sun = fib(44);
    let elapsed = now.elapsed();
    println!("RUST");
    println!("fibonacci {}", sun);
    println!("elapsed {:.2?}", elapsed);
    println!("---");
    
}
fn fib (n: i64) -> i64{
    if n <= 1 { 
        return n
    }
    else {
        return fib(n - 1) + fib(n - 2)
    }
}