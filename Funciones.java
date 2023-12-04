import java.util.Random;

public class Funciones {

    
    public static boolean esDivisible(int dividendo, int divisor){
        boolean esDivisible = ( dividendo % divisor == 0);
        return esDivisible;   
    }    

    public static boolean esPar(int numero){
        boolean esPar = esDivisible(numero,2);
        return esPar;
    }

    public static boolean esMultiplo(int dividendo, int divisor ){
        boolean esMultiplo = esDivisible(dividendo, divisor);        
        return esMultiplo;
    }

    public static boolean esDivisor(int divisor, int dividendo ){
        boolean esDivisor = esMultiplo(dividendo, divisor);        
        return esDivisor;
    }

    public static boolean esImpar(int numero) {
        boolean esImpar = (numero % 2 != 0);
        return esImpar;
    }

    public static boolean esPositivo(int numero) {
        boolean esPositivo = (numero > 0);       
        return esPositivo;

    }
    
    public static boolean esNegativo(int numero) {
        boolean esNegativo = (numero < 0);       
        return esNegativo;
    }

    public static boolean mayor(int num1, int num2) {
        boolean mayor=(num1 > num2);
        return mayor;
    }

    public static boolean menor(int num1, int num2) {
        boolean menor=(num1 < num2);
        return menor;
    }
      
    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    
    }

    public static long dobleFactorial(int n) {           
        long dobleFactorial = 1;
        for (int i = n; i > 0; i -= 2) {
            dobleFactorial *= i;
        }
        return dobleFactorial;
    }

    public static int cantDivisoresPos(int n) {
        int cantDivisoresPos = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cantDivisoresPos++;
            }
        }
        return cantDivisoresPos;

    }

    public static int cantDivisoresNeg(int n) { 
        int opuesto = -n;
        int cantDivisoresNeg = 0;

        for (int i = 1; i <= opuesto; i++) {
            if (opuesto % i == 0) {
                cantDivisoresNeg++;
            }
        }
        return cantDivisoresNeg;

    }

    public static int cantDivisores(int n) {
        int valorAbsoluto = Math.abs(n);
        int cantDivisores = 0;

        for (int i = 1; i <= valorAbsoluto; i++) {
            if (valorAbsoluto % i == 0) {
                cantDivisores++;
            }
        }
        return cantDivisores;
           
    }

    public static int sumDivisoresPos(int n) {        
        int sumDivisoresPos = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sumDivisoresPos += i;
            }
        }
        return sumDivisoresPos;

    }

    public static int sumDivisoresNeg(int n) {
        
        int opuesto = -n;
        int sumDivisoresNeg = 0;

        for (int i = 1; i <= opuesto; i++) {
            if (opuesto % i == 0) {
                sumDivisoresNeg += i;
            }
        }

        return sumDivisoresNeg;

    }

    public static int sumDivisores(int n) {
        int valorAbsoluto = Math.abs(n);
        int sumDivisores = 0;

        for (int i = 1; i <= valorAbsoluto; i++) {
            if (valorAbsoluto % i == 0) {
                sumDivisores += i;
            }
        }

        return sumDivisores;
    }


    public static boolean esCompuesto(int n) {
        if (n < 2) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true; 
            }
        }

        return false; 
    }

    public static boolean esPrimo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; 
            }
        }

        return true;
    }

    public static long primordial(int n) {
        int contador = 0;
        long primorial = 1; 

        for (int i = 2; contador < n; i++) {
            if (esPrimo(i)) {
                primorial *= i;
                contador++;
            }
        }

        return primorial;

    }    


    public static boolean esPerfecto(int n) {                    
        int esPerfecto = 0;           
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                esPerfecto += i;
                }
                }
                   
        return esPerfecto == n;
    }

    public static boolean sonAmigos(int a, int b) {
        if (a <= 0 || b <= 0) {
            return false; 
        }

        return sumaDivisoresPropios(a) == b && sumaDivisoresPropios(b) == a;
    }

    public static int sumaDivisoresPropios(int n) {
        int sonAmigos = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sonAmigos += i;
            }
        }

        return sonAmigos;   

        
    }

    public static int generarAleatorio(int limInf, int limSup) {
        Random rand = new Random();
        int generarAleatorio =rand.nextInt((limSup - limInf) + 1) + limInf;
        return generarAleatorio;

    }    

    

}