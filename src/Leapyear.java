import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year %400 ==0){
            System.out.println("Enter is leap year ");
        }else if(year %100 ==0){
            System.out.println("Number is not leap year");
        }else if(year %4==0){
            System.out.println("NUmber is leap year");
        }else{
            System.out.println("Nu ber is not leap year");
        }

    }
}
