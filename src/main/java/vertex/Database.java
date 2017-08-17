package vertex;

public class Database
{
    private String [] mas = {"Владимир Дубовский","Джон Доу","Джейн Доу","Алекс Кулер","Алан Монек","Карлос Минстор","Джон Купер"
            ,"Александр Карликов"};

    public String[] getMas()
    {
        return mas;
    }

    public String[] getAll()
    {
        Database database = new Database();
        return database.getMas();
    }

    public String getFirst()
    {
        Database database = new Database();
        return database.getMas()[0];
    }

    public String getLast()
    {
        Database database = new Database();
        return database.getMas()[7];
    }

    public String[] getByName(String name)
    {
        Database database = new Database();
        String[] mas = database.getMas();
        int count = 0;
        for (int i = 0; i<mas.length; i++)
        {
            if (mas[i].startsWith(name))
            {
                count++;
            }
        }

        String[] byNames = new String[count];
        count = 0;
        for (String elem : mas)
        {
            if(elem.startsWith(name))
            {
                byNames[count] = elem;
                count++;
            }
        }
        return byNames;
    }

    public String getBySurname(String surname)
    {
        Database database = new Database();
        String[] mas = database.getMas();
        return surname;
    }
}
