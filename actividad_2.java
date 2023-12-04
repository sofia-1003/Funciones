import javax.swing.JOptionPane;

public class actividad_2 {


  /*Implemente una función llamada esDivisor que reciba como parámetros dos números
enteros y retorne si el primero es un divisor del segundo.*/

    public static void main(String[] args){

        int num1=0;
        int num2=0;
        String mensaje="";

        mensaje = "Ingrese el primer número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
        mensaje =" Ingrese el segundo número entero";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        if (Funciones.esDivisor(num1, num2)){
            mensaje = "El primer número es divisor del segundo";
        }else{
            mensaje= "El primer número no es divisor del segundo";
        }
        JOptionPane.showMessageDialog(null, mensaje);
         
      System.out.println("El primer número no es divisor del segundo");
        }

    }