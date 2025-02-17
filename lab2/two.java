import java.util.Scanner;
import java.util.Arrays;


public class two {
    public static void main(String[] args)
    {
    int[] ar1 = {1,5,3,2,6,7,0};
    int[] ar2 = {4,8,4,-1,-7,0,5};
    int[][] ar3 = {{1, 2, 3, 4, 5}, {3, 8, 2, 1, 2}, {1, 4, 6, 7, 1}, {0, 2, 4, 3, 5}, {4, 1, 1, 2, 0}};
    String ss = "i don't know what i'm doing";
    //int[] ar4 = pair(ar1, 7); //№5
    //merge_sorted_arrays(ar1, ar2); //№2
    //max_sum_of_inner_array(ar1); //№3
    //int[][] ar5= turnleft(ar3); //№8
    //int[][] ar6= turnright(ar3); //№4
    //String pepega= stronk(ss); //№1
    //int[] max_of_rows=max_of_rows(ar3); //№7
    //int sum_2d=sum_of_elements(ar3); //№6
    }

    static int[] buble_sort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            int min = a[i];
            int pos = i;

            for(int j=i+1;j<a.length;j++)
            {
                if(min > a[j]){
                    pos = j;
                    min = a[j];
                }
            }
            int t = a[i];
            a[i]=a[pos];
            a[pos]=t;
        }
        return a;
    }

    static int[] merge_sorted_arrays(int[] a, int[] b) //22222222
    {
        buble_sort(a);
        buble_sort(b);
        int[] c = new int[a.length+b.length];
        System.arraycopy(a, 0, c, 0, a.length);

        System.arraycopy(b, 0, c, 0 + a.length, b.length);

        buble_sort(c);

        for(int i=0;i<c.length;i++)
            System.out.print(c[i] + " ");

        return c;
    }

    static void max_sum_of_inner_array(int[] a) //3333333
    {
        int[] maxes = new int[a.length-1];

        for(int i=0;i<a.length-1;i++)
        {
            int looking_at = a[i];
            int sum=a[i];

            for(int j=i+1;j<a.length;j++)
            {
                if (a[j]>looking_at)
                {
                    sum+=a[j];
                    looking_at = a[j];
                }
            }
            maxes[i]=sum;
            sum=0;
        }

        int bestest_max = 0;

        for (int max : maxes) {
            if (max > bestest_max)
                bestest_max = max;
        }
        System.out.println(bestest_max);
    }

    static int[][] turnright(int[][] a) //4444444
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j] + " ");
            }

        System.out.print("\n");
        }

        System.out.print("\n");
        int[][] b = new int[a[0].length][a.length];

        for(int j=0;j<a.length;j++)
        {
            for(int i=a[0].length-1; i>=0; i--)
            {
                b[j][a.length-i-1]=a[i][j];
            }

        }

        for(int j=0;j<b.length;j++)
        {
            for(int i=0;i<b[0].length;i++)
            {
                System.out.print(b[j][i] + " ");
            }

            System.out.print("\n");
        }

        return b;
    }

    static int[][] turnleft(int[][] a) //888888
    {
        for(int i=0;i<a[0].length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j] + " ");
            }

            System.out.print("\n");
        }
        System.out.print("\n");
        int[][] b = new int[a[0].length][a.length];

        for(int j=a[0].length-1;j>=0;j--)
        {
            for(int i=0; i<a.length; i++)
            {
                b[a[0].length-j-1][i]=a[i][j];
            }

        }

        for(int j=0;j<b.length;j++)
        {
            for(int i=0;i<b[0].length;i++)
            {
                System.out.print(b[j][i] + " ");
            }

            System.out.print("\n");
        }

        return b;
    }

    static int sum_of_elements(int[][]a) //666666
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                sum+=a[i][j];
            }
        }
        System.out.println("Sum of elements in two-d array:" + sum);
        return sum;
    }

    static int[] max_of_rows(int[][]a) //777777
    {
        int[] maxes_of_rows = new int[a.length];

        for(int i=0;i<a.length;i++)
        {
            int max=0;

            for(int j=0; j<a[i].length; j++)
            {
                if(a[i][j]>max)
                {
                    max=a[i][j];
                }
            }
            maxes_of_rows[i]=max;
        }
        for(int i=0;i<maxes_of_rows.length;i++)
        {
            System.out.printf("max of elements in row %d",i);
            System.out.printf( ": %d", maxes_of_rows[i]);
            System.out.print("\n");
        }

        return maxes_of_rows;
    }

    static int[] pair(int[]a, int target) //5555555
    {
        int[] pair = new int[2];

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]+a[j]==target)
                {
                    pair[0] = a[i];
                    pair[1] = a[j];
                    System.out.print(a[i]+ ", ");
                    System.out.println(a[j]);
                    return pair;
                }
            }
        }

        return null;
    }

    static String stronk(String s) //111111
    {
        char[] str = s.toCharArray();
        char[][] arr_of_inner_ars = new char[str.length-1][];

        for(int i=0;i<str.length-1;i++)
        {
            char current = str[i];
            String inner_arr = "";
            inner_arr+=current;
            //char[] inner_arr=inner_ar.toCharArray();

            for(int j=i+1;j<str.length;j++)
            {
                if(inner_arr.indexOf(str[j])==-1)
                {
                    inner_arr+=str[j];
                    char[] inner_arr_to_char = inner_arr.toCharArray();
                    arr_of_inner_ars[i]=inner_arr_to_char;
                }
                else
                {
                    char[] inner_arr_to_char = inner_arr.toCharArray();
                    arr_of_inner_ars[i]=inner_arr_to_char;
                    break;
                }
            }

        }
        int max_length=0;
        int max_index=0;
        for(int i=0;i<arr_of_inner_ars.length;i++)
        {
            if(arr_of_inner_ars[i].length>max_length)
            {
                max_length = arr_of_inner_ars[i].length;
                max_index=i;
            }
        }
        for(int j=0;j<arr_of_inner_ars[max_index].length;j++)
            System.out.print(arr_of_inner_ars[max_index][j]);
        String a = arr_of_inner_ars[max_index].toString();
        return a;
    }
}
