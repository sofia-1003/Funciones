import javax.swing.JOptionPane;

public class actividad_12 {


 /*Implemente una función llamada cantDivisoresNeg que reciba como parámetro un número
entero y retorne la cantidad de divisores negativos que tiene ese número.*/
    public static void main(String[] args){

        int num1=0;
        int ncantDivisoresNeg= 1;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        ncantDivisoresNeg = Funciones.cantDivisoresNeg(num1);
        mensaje = "La cantidad de divisores negativos es " + ncantDivisoresNeg;
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }