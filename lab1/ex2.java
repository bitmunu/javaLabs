import java.util.*;

public class two {
    public static void main(String[] args) {
        System.out.print("введите количество чисел");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("введите числа");
        int sum=0;

        for(int i=0;i<=num-1;i++)
        {
            Scanner in2 = new Scanner(System.in);
            int num_n = in2.nextInt();

            if(i%2==0) sum+=num_n;
            else sum-=num_n;
        }
        System.out.print("сумма знакочередующегося ряда введенных чисел: " + sum);
    }
}
