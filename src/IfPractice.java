import java.util.Scanner;
public class IfPractice {
    static Scanner scanner = new Scanner(System.in);
    public void IfPractice(){

        System.out.println("Enter you're age:");
        // Para evitar errores con el Buffered del next int que e
       int age = scanner.nextInt();
        scanner.nextLine();
        
       if (age >= 18 ){
           System.out.println(String.format("You are of legal age and you are %d years old", age));
       } else{
           System.out.println("You are under the legal age ");
       }

    }
}
