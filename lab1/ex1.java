import java.util.*;

public class one {
    public static void main(String[] args) {
        System.out.print("enter a number please");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.printf("your number is %d \n", num);
        in.close();
        int k=0;
        while(num!=1)
        {
            if(num%2==0 )num/=2;
            else num=3*num+1;
            k++;
        }
        System.out.print("количество шагов в сиракузской последовательности для введенного числа: " + k);
    }
}
