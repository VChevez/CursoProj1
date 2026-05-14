public class PracticaString {


    public void Practica () {
        String name = "Pepinillos";
        //chartAt
   /* El charAt te da el carácter de un String, y si lo usas con el .
      lenght puedes obtener el ultimo caracter sin saber el numero total de caracteres */


        // toUpperCase, toLowerCase
        System.out.println(name.charAt(name.length()-1));
        // toUpperCase convierte un String en mayúsculas.
        System.out.println(name.toUpperCase());
        //toLowerCase convierte un String en minúsculas.
        System.out.println(name.toLowerCase());

        // Contains
        /* .contains  sirve para poder identificar si un String contiene un patrón de caracteres
        devolviendo un booleano. */
        System.out.println("Esto es un String".toLowerCase().contains("esto es un string".toLowerCase())); // Devuelve true
        System.out.println(name.contains("illo")); // Devuelve true.


        //Equals
     /* .equals a diferencia de contains "equals" solo
     devuelve true si es exactamente (Compara contenido) igual al String a comparar */
        //Salto de linea
        System.out.println();
        System.out.println(name.equals("pepinillos")); // false
        // tambien esta la opción de ignorar las mayúsculas o minúsculas
        System.out.println(name.equalsIgnoreCase("pepinillos")); // true


        //Trim and Replace
        /* Trim hace que se eliminen los espacios en blanco
          al final  al inicio de texto */
        System.out.println();
        System.out.println(" Prueba de trim  ".trim());
        System.out.println(" Prueba de sin trim  ");
        System.out.println(" Prueba de replace ".replace(" ", "0"));
        //Para usar replace afecta si son mayúsculas o minúsculas


        //Format
        String nombres = "Vicente";
        int edad = 20;
        // Tiene que estar en orden, al final del formato. %s es para strings, %d es para enteros, y %f es para decimales.
        System.out.println(String.format("Hola mi nombre es, %s, y mi edad es %d ", nombres, edad));
        System.out.printf("Hola mi nombre es, %s, y mi edad es %d ", nombres, edad); }




    }


