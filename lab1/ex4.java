import java.util.Scanner;

public class four {
    public static void main(String[] args) {
    System.out.print("введите количество дорог");

    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int[][] heights = new int[num][];
    int[] min_heights = new int[num];
    int[] min_road_numbers = new int[num];

    for(int i=0;i<num;i++)
    {
        System.out.printf("введите количество туннелей на дороге номер %d \n", + i+1);
        int tunnel_amount = in.nextInt();
        int[] tunnel = new int[tunnel_amount];

        for(int j=0;j<tunnel_amount;j++)
        {
            System.out.printf("для этой дороги введите высоту туннеля номер %d \n", + j+1);
            int height = in.nextInt();
            tunnel[j]=height;
        }
        System.out.print("------------------------------------------------------------------\n");

        int min_height=10;
        for(int j=0;j<tunnel_amount;j++)
        {
            if(tunnel[j]<min_height)
            {
                min_height=tunnel[j];
                min_road_numbers[i] = j;
            }
        }
        min_heights[i] = min_height;
        heights[i] = tunnel;
    }

    int min_of_all = 10000;
    int min_num = 0;

    for(int i=0;i<num;i++)
    {
        if (min_heights[i]<min_of_all)
        {
            min_of_all=min_heights[i];
            min_num=min_road_numbers[i];
        }
    }

    System.out.printf("максимальная высота грузовика: %d", + min_of_all);
    System.out.print("\n");
    System.out.printf("дорога номер %d", + min_num+1);
}
}
