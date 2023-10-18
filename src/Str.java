import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        int k=name.length();
        char last=name.charAt(k-1);
        if(last=='а'||last=='я'||last=='и')
            System.out.println("Приветик!");
        else
            System.out.println("Здарова!");
    }
}
