package vertex;

import java.util.Arrays;

public class MainDatabase
{

    public static void main(String[] args)
    {
        Database database = new Database();
        System.out.println(Arrays.toString(database.getAll()));
        System.out.println(database.getFirst());
        System.out.println(Arrays.toString(database.getByName("Джон")));
    }
}
