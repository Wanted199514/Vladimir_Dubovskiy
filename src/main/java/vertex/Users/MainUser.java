package vertex.Users;

public class MainUser
{
    public static void main(String[] args)
    {
        User[] users = getUsers();

        for(int i=0;i<users.length;i++)
        {
            printUser(users[i]);
        }
    }

    private static void printUser(User user)
    {
        System.out.println("{" + user.getName() + ", " + user.getSurname() + ", " + user.getAge() + "}");
    }
    private static User[] getUsers()
    {
        User[] users = new User[2];

        User vlad = new User("Vlad","Cerofan124",26);
        User dima = new User("Dima","Gandolf567",34);

        users[0] = vlad;
        users[1] = dima;

        return users;
    }
}
