import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a*(b+1);
        System.out.println(c);
    }
}
