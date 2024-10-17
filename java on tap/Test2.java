import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = sc.nextLine();
        System.out.print("Your sage: ");
        int age = sc.nextInt();
        System.out.println("Name: " + name + ", Age: " + age);
        sc.close();
    }

}
