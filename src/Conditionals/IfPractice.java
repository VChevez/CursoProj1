package Conditionals;

import java.util.Scanner;
public class IfPractice {
    static Scanner scanner = new Scanner(System.in);

    public void IfPractice(){

     /*
        System.out.println("Enter you're age:");
         Para evitar errores con el Buffer cuando hay antes un salto de linea el programa cree que ya has terminado
        entonces lo que se debe hacer es colocar otro scanner.nextline para solucionar el problema y evitar estos errores.
        Una solución más profesional seria la siguiente:
        (---Segun Gemini---)
        Scanner sc = new Scanner(System. some);

 System.out.print("Introduce tu edad: ");
 int age = sc.nextInt(); // Aquí dejas el "Enter" en el búfer

 sc.nextLine(); // <-- ¡ESTA ES LA CLAVE! Limpia el "Enter" residual

 System.out.print("Introduce tu nombre: ");
 String name = sc.nextLine(); // Ahora sí se detendrá a preguntarte

 System.out.println("Te llamas " + name + " y tienes " + age + " años.");

       int age = scanner.nextInt();
        scanner.nextLine();

       if (age >= 18 ){
           System.out.println(String.format("You are of legal age and you are %d years old", age));
       } else{
           System.out.println("You are under the legal age ");
       } */

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a
        // 18).

        System.out.println("Enter your age: ");
        int userAge = 0;
        do {
            userAge = scanner.nextInt();
        if (userAge < 18 ){
            System.out.println("No puede votar");
        } else  {
            System.out.println("Puede votar");
        }
    } while (userAge < 18);

        // 2. Declara dos nÃºmeros y muestra cuÃ¡l es mayor, o si son iguales.

        int numberOne  = 13;
        int numberTwo = 13;
         if (numberOne == numberTwo) {
             System.out.println("They are equals");
         } else if (numberOne < numberTwo) {
             System.out.println("numberOne is greater than numberTwo");
         } else {
             System.out.println("Number Two is greater than numberOne");
         }

        // 3. Dado un nÃºmero, verifica si es positivo, negativo o cero.
        System.out.println("Enter a number to see if is negative, positive or 0");
         int myNumber = scanner.nextInt();
         if (myNumber == 0){
             System.out.println("is 0");
         } else if (myNumber >= 1) {
             System.out.println("is positive");
         } else if(myNumber <= -1) {
            System.out.println("is negative");
        }
        // 4. Crea un programa que diga si un nÃºmero es par o impar.
        System.out.println("Enter a number to see if it's even or odd");
        int myParOrNotNumber = scanner.nextInt();
        if (myParOrNotNumber % 2 == 0) {

            if (myParOrNotNumber == 0) {
                System.out.println("is 0");
            } else {
                System.out.println("is even");
            }
        } else {

            System.out.println("is odd");
        }

        // 5. Verifica si un nÃºmero estÃ¡ en el rango de 1 a 100.
        System.out.println("Enter a number to see if it's from 1 to 100");

        if (scanner.hasNextInt()) {
            int numberOfUser = scanner.nextInt();

            if (numberOfUser >= 1 && numberOfUser <= 100){
                System.out.println("Your number is in the range from 1 to 100");
            } else {
                System.out.println("Your number is NOT in the range from 1 to 100");
            }

        } else {
            System.out.println("Error: Please enter a valid number.");
        }


        // 6. Declara una variable con el dia de la semana (1-7) y muestra su nombre con
        // switch.
        System.out.println("Enter a number from 1 to 7, to indicate the day of the week");
        int dayOfWeek = scanner.nextInt(); // Puedes cambiar este valor para probar

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day. Please enter a number between 1 and 7.");
                break;
        }
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o
        // "Suspenso" segÃºn la nota (0-100).
        System.out.println("Enter your score from 0 to 100 to indicate your status: ");
        int score = scanner.nextInt();
        do { if (score < 0 || score > 100) {
            System.out.println("Pls enter a valid number from 1 to 100");
            score = scanner.nextInt();
        }
        }while (score < 0 || score > 100);
        if (score >= 0 && score <= 50){
            System.out.println("you have failed ");
        } else if (score >= 51 && score <= 79) {
            System.out.println("You have passed ");
        } else if (score >= 80  && score <= 100) {
            System.out.println("¡¡You have done great!!");
        }


        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al
        // menos 15 aÃ±os o ir acompaÃ±ado.
        System.out.println("If you want to enter into the cinema, " +
                "\nyou have to be at least 15 years old or be accompanied by an adult\n Enter your age:");
        int ageCinema = scanner.nextInt();
        scanner.nextLine(); // <- Limpiamos el salto de línea que dejó el nextInt()

        if (ageCinema >= 15) {
            System.out.println("You can go into the cinema");
        } else {
            // Entra aquí automáticamente si es menor de 15
            System.out.println("You need to be at least 15 years old or be accompanied. \nAre you accompanied? (yes/no)");
            String accompanied = scanner.nextLine(); // Ahora solo necesitas uno

            if (accompanied.equalsIgnoreCase("yes")) {
                System.out.println("You can go into the cinema");
            } else {
                System.out.println("You cannot go into the cinema");
            }
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        System.out.println("Enter a letter to see if it's a vowel or consonant");
        char letter = scanner.next().charAt(0);
        letter = Character.toLowerCase(letter);
        if (Character.isLetter(letter)) {
        switch (letter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It's a vowel");
                break;
            default:
                System.out.println("It's a consonant");
                break;
        }} else {
            System.out.println("That's not a valid letter of the alphabet.");
        }

        // 10. Usa tres variables a, b, c y muestra cuÃ¡l es el mayor de las tres.
        int a = 10;
        int b = 15;
        int c = 20;

        if (a >= b && a >= c) {
            System.out.println("The largest number is a: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is b: " + b);
        } else {
            System.out.println("The largest number is c: " + c);
        }





    }
}
