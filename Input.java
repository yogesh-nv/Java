import java.util.*;

public class Input
{
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		String name;
		int age;
		String usn;
		name=scanner.nextLine();
		age=scanner.nextInt();
		usn=scanner.next();
		System.out.println("My name is "+name+" .\nmy age is "+age+" .\nmy usn is "+usn);
	}
}  