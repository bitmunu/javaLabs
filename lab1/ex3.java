
import java.util.*;

public class three {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("введите координаты сокровища");
        int X = in.nextInt();
        int Y = in.nextInt();

        System.out.println("север: y++");
        System.out.println("восток: x++");
        System.out.println("юг: x--");;
        System.out.println("запад: y--");
        System.out.println();

        System.out.println("введите указания");
        String[] direction_map = new String[20];
        int[] steps_on_map = new int[20];

        int count = 0;

        while (true)
        {
            String direction = in.next();
            if (direction.equals("финиш")) break;
            int step = in.nextInt();
            direction_map[count] = direction;
            steps_on_map[count] = step;
            count++;
            System.out.println("дальше.");
        }

        int x=0, y=0, k = 0;
        for (int i = 0; i < count; i++)
        {
            switch (direction_map[i])
            {
                case "север":
                    y += steps_on_map[i];
                    break;
                case "юг":
                    y -= steps_on_map[i];
                    break;
                case "восток":
                    x += steps_on_map[i];
                    break;
                case "запад":
                    x -= steps_on_map[i];
                    break;
                default:
                    continue;
            }

            k++;
            if (x == X && y == Y)
            {
                System.out.printf("клад найден, потребовалось указаний на карте: %d \n", + k);
                break;
            }
        }
    }
}
