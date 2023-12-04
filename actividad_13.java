import javax.swing.JOptionPane;

public class actividad_13 {


 /*Implemente una función llamada cantDivisores que reciba como parámetro un número
entero y retorne la cantidad de divisores que tiene ese número.*/
    public static void main(String[] args){

        int num1=0;
        int ncantDivisores= 1;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        ncantDivisores = Funciones.cantDivisores(num1);
        mensaje = "La cantidad de divisores es " + ncantDivisores;
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }