import java.util.Scanner;

class A {
    int x;

    public A() {
        System.out.println("Hello");
    }

    public void initial_x() {
        Scanner num = new Scanner(System.in);
        x = num.nextInt();
    }


    public void sum() {
        System.out.println(x + 12);
    }


    public void check() {
        if (x % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }
    }

    public void initial_y() {
    }

    public boolean sum2() {
        return false;
    }
}

