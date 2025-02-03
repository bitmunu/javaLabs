import java.util.Scanner;

public class five {
    public static void main(String[] args) {
    System.out.println("введите число");

    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

    int sum=0;
    int pr=1;
    int last_digit;
    while(num!=0)
    {
        last_digit=num%10;
        sum+=last_digit;
        pr*=last_digit;
        num=num/10;
    }

    System.out.println("сумма цифр: " + sum);
    System.out.println("произведение цифр: " + pr);

    if (pr==sum) System.out.println("данное число является дважды четным.");
    else System.out.println("данное число не является дважды четным.");


    }
}
