package math;

import java.util.Scanner;

public class Smallest_Integer_Divisible_by_K
{
    public static int smallestRepunitDivByK(int k)
    {
        if (k % 2 == 0 || k % 5 == 0)
            return -1;
        int remainder = 0;
        for (int i = 1; i <= k; i++)
        {
            remainder = (remainder * 10 + 1) % k;
            if (remainder == 0)
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(smallestRepunitDivByK(k));
    }
}
