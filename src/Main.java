import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for which you want the factorial:");
        int number = scanner.nextInt();

        System.out.println("Factorial of "+number+" using LOOP is: "+fact_loop(number));
        System.out.println();
        System.out.println("Factorial of "+number+" using RECURSION is: "+fact_recursive(number));
    }

    /***********************************
     FACTORIAL USING LOOP
     ***********************************/
    public static int fact_loop(int num){
        int result = 1;

        for(int i=1; i<=num; i++){
            result = result * i;
        }
        return result;
    }

    /***********************************
     FACTORIAL USING RECURSION
     ***********************************/
    public static int fact_recursive(int num){
        if(num==0 || num ==1){
            return 1;
        }
         return num * fact_recursive(num-1);
    }
}