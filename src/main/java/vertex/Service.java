package vertex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by vertex on 10.08.2017.
 */
public class Service
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Select course");
        System.out.println("1 Start");
        System.out.println("2 OOP");

        int choice = scan.nextInt();

        System.out.println("you selected: " + choice);

        int [] mas = new int[10];

        for(int i = 0; i<mas.length; i++)
        {
            mas[i] = rand.nextInt();
        }
        System.out.println(Arrays.toString(mas));

        String value = "Coding time";

        char[] chars = value.toCharArray();

        for(int i = 0; i<chars.length; i++)
        {

        }
    }
}
