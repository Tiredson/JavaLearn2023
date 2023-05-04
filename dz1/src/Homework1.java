public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
            byte q = 127;
            short w = -32768;
            int e = -2147483648;
            long r = 2147483648L;
            float t = 1.14f;
            double y = 3.1414141414141414;
            boolean boo = false;
            char ch = 102 ;
// Press F 2 pay respect;
        System.out.println(method1(3, 5, 2, 2));
        // answer 18
        System.out.println("summ between 10 and 20  " + method2(-10, 19));
        // summ does not converge (9)
        System.out.println(method3(-666));
        // negative number
        System.out.println(method4(-300));
        // true
        System.out.println(method5("Amshegar"));
        // Hello unnamed from arx!
        System.out.println(method6(2048));
        // vesokosn  (true)
    }
    public static int method1(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    public static boolean method2(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    public static String method3(int a) {
        return a >= 0 ? "Положительное" : "Отрицательное";
    }
    public static boolean method4(int a) {
        return a < 0;
    }
    public static String method5(String name) {
        return "Привет " + name + "!";
    }
    public static boolean method6(int year) {
        return year % 400 == 0 || (year % 100 != 0 && (year % 4 == 0));
    }
}


