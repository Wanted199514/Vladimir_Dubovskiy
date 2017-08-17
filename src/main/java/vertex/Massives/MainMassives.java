package vertex.Massives;

import java.util.Arrays;

public class MainMassives
{
    public static void main(String[] args)
    {
        int mas [] = {1,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(mas));


        String first = "Glory";
        String second = "to";
        String third = "Empire";

        final StringBuilder builder = new StringBuilder();
        final StringBuilder append = new StringBuilder();
        builder.append(first)
                .append(" ")
                .append(second)
                .append(" ")
                .append(third);

        final String result = builder.toString();

        System.out.println(result);

        StringBuffer buffer = new StringBuffer();

    }
}
