import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> list;
        list = new ArrayList<>();
        Random ran = new Random();
        Scanner sc =new Scanner(System.in);
        System.out.println("a : ");
        int a= sc.nextInt();
        System.out.println("b : ");
        int b= sc.nextInt();

        int c;
        if (a > b){
            c=a;
            a=b;
            b=c;
        }
        int i;
        int count_even=0;
        int count_odd=0;
        int sum_even=0;
        int sum_odd=0;
        for(i=a;i<b+1;i++){
            int rand = a + ran.nextInt(b - a + 1);
            list.add(rand);

        }
        System.out.println(list.toString());

        for (int number:list) {
            if(number%2==0){
                count_even++;
                sum_even+=i;
            }
            else {
                count_odd++;
                sum_odd+=i;
            }

        }
        System.out.println(count_even);
        System.out.println(sum_even);
        System.out.println(count_odd);
        System.out.println(sum_odd);

        if (sum_even>sum_odd){
            c=sum_even;
            sum_even=sum_odd;
            sum_odd=c;
        }

        for(i=a;i<5;i++){
            int rand = sum_even + ran.nextInt(sum_odd - sum_even + 1);
            System.out.println(rand);

        }





    }
}