import java.util.Scanner;
public class Recursividad {

    public static void Factorial(int number){
        if (number < 0) {
            System.out.println("No son válidos los valores negativos.");
        }

        long fac = 1;

        for (int i = 1; i <= number; i++) {
            fac *= i;
        }
        System.out.print("El factorial de [" + number + "] es [" + fac + "].");;
    }

    public static void punto1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----FACTORIAL DE UN NÚMERO-----");
        System.out.println("Ingrese el número a operar:");
        int fac = 1;
        int n = scanner.nextInt();
        Factorial(n);
    }

    public static int cumsum(int x) {
        if (x <= 0) {
            return 0;
        }
        return x + cumsum(x-1);
    }

    public static void punto2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----SUMA SUCESIVA-----");
        System.out.println("Ingrese el valor a sumar sucesivamente:");
        int valor = scanner.nextInt();
        System.out.println("El valor de la suma sucesiva de [" + valor + "] es [" + cumsum(valor) + "].");
    }

    public static double Potencia(double base, double exponente){
        double re = 1;
        if (exponente == 1) {
            return 1;
        }
        if (exponente < 0) {
            double exponentePO = -exponente;
        }

        if (exponente > 0) {
            for (int i = 0; i < exponente; i++) {
                re *= base;
            }
            System.out.println("La potencia [" + base + "^" + exponente + "] es igual a [" + re + "].");

            if (exponente < 0) {
                System.out.println("La potencia [" + base + "^" + exponente + "] es igual a [" + 1/re + "].");
                return 1 / re;
            }
        }
        return re;
    }

    public static void punto3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----POTENCIA DE UN NÚMERO-----");
        System.out.println("Ingrese el valor de la base:");
        double b = scanner.nextInt();
        System.out.println("Ingrese el valor de la exponente:");
        double ex = scanner.nextInt();

        Potencia(b, ex);

        if (ex == 0) {
            System.out.println("Todo valor elevado a la [0] es igual a [1].");
        }
    }


    public static void contarDigitos(int nd) {
        String tnd = String.valueOf(nd);
        if (nd > 0) {
            System.out.println("La cantidad de dígitos en el valor [" + nd + "] es de [" + tnd.length() + "].");
        }
        if (nd < 0) {
            int tndm = tnd.length() - 1;
            System.out.println("La cantidad de dígitos en el valor [" + nd + "] es de [" + tndm + "].");
        }
    }

    public static void punto4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----RECUENTO DE DIGITOS EN ENTEROS-----");
        System.out.println("Ingrese un número entero:");
        int ent = scanner.nextInt();

        contarDigitos(ent);
    }

    public static String invertir(String cadena) {
        if (cadena.length() <= 1) {
            return cadena;
        }

        return cadena.charAt(cadena.length() - 1)
                + invertir(cadena.substring(0, cadena.length() - 1));
    }

    public static void punto5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----INVERTIR TEXTO-----");
        System.out.println("Ingrese el texto a invertir:");
        String txet = scanner.next();
        System.out.println("El texto [" + txet + "] invertido es [" + invertir(txet) + "].");
    }

}
