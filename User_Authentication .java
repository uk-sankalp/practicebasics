import java.util.Scanner;
public class User_Authentication 
{
    public static void main(String args[])//program won't run if we dont ad
    {
        String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");
        username = s.nextLine();//user name is stored
        System.out.print("Enter password:");
        password = s.nextLine();//here comes password
        if(username.equals("user") && password.equals("user"))
        {
            System.out.println("Authentication Successful");
        }
        else
        {
            System.out.println("Authentication Failed");
        }
    }
}
