import javax.swing.JOptionPane;

public class actividad_9 {


/*Implemente una función llamada factorial que reciba como parámetros un número entero y
retorne el factorial de este.*/
    public static void main(String[] args){

        int num1=0;
        long nfactorial = 1;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        nfactorial = Funciones.factorial(num1);
        mensaje = "El factorial es " + nfactorial;
        JOptionPane.showMessageDialog(null, mensaje);  


            
    }
        
       
    }