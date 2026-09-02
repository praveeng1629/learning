import java.util.Scanner;
public class Employee
{
    public static void main(String[] args)
    {
        try (Scanner obj = new Scanner(System.in)) {
            int employee_age = obj.nextInt();
            String employee_name = obj.nextLine();
            System.out.println(employee_age);
            System.out.println(employee_name);
        }

    }
}