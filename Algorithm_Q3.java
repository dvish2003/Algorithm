import java.util.Scanner;

public class Algorithm_Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input number for reverse : ");
        int num = input.nextInt();
        int reverseNumber = 0;

        // out put 123

    //    int f = 321 % 10;
    //    System.out.println(f);

    //    int s = 32 % 10;
    //    System.out.println(s);


    //    int t = 3 % 10;
    //    System.out.println(t);

while (num > 0) {
    int digit = num % 10;
    reverseNumber = reverseNumber * 10 + digit;
    num = num/10;
}

System.out.println(reverseNumber);
    
    
    
    }
}
