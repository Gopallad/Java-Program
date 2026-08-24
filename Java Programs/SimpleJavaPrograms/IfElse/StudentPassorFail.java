import java.util.Scanner;

public class StudentPassorFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student marks: ");

        int marks = sc.nextInt();

        if(marks >=16){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
