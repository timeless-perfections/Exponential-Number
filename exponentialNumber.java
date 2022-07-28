import java.util.Scanner;

public class exponentialNumber {

    static int result = 1;
    static int sum(int x, int y){
        if (x == 0){
            return 1;
        }

        result *= y;
        sum(x-1, y);
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x, y;

        System.out.println("Enter Base Number : ");
        y = inp.nextInt();;
        System.out.println("Enter Exponents Number : ");
        x = inp.nextInt();

        System.out.println(sum(x,y));
    }

}
