import java.util.Scanner;
public class ClassC {
    int a,b,c = 0;
    void method1(){
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
    }
    void method2(){
        System.out.println(" ბოლო ციფრი " + a%10);
    }
    void method3() {
        while (b >= 10)
            b /= 10;
        System.out.println(" პირველი ციფრი " + b);
    }
    void method4() {
        int k = c%10;
        while (c >= 10)
            c /= 10;
        System.out.println(" ციფრთა ჯამი " + (k + c));
    }
}
