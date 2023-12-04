import javax.swing.JOptionPane;

public class actividad_11 {


 /*Implemente una función llamada cantDivisoresPos que reciba como parámetro un número
entero y retorne la cantidad de divisores positivos que tiene ese número.*/
    public static void main(String[] args){

        int num1=0;
        int ncantDivisoresPos= 1;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        ncantDivisoresPos = Funciones.cantDivisoresPos(num1);
        mensaje = "La cantidad de divisores positivos es " + ncantDivisoresPos;
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }