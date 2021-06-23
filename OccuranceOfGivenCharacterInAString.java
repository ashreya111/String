import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter the character of whose frequency you want");
        char search = sc.next().charAt(0);
        int count = 0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == search)
            {
                count++;
            }
        }
        System.out.println("Occurance of " + search + " is " + count + " times.");
    }
}
