public class main {
    static Integer fib(Integer n) {
        return n <= 1 ? n : fib(n - 1) + fib(n - 2);
    }
    public static void main(String args[]) {
        long start = System.currentTimeMillis();
        Integer fibonacci = main.fib(44);
        long finish = System.currentTimeMillis();
        Double elapsed = (finish - start) / 1000.0;
        System.out.println("java");
        System.out.println(fibonacci);
        System.out.println(elapsed);
        System.out.println("---");
    };
}