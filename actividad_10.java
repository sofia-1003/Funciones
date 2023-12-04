import javax.swing.JOptionPane;

public class actividad_10 {


/*Implemente una función llamada dobleFactorial que reciba como parámetros un número
entero y retorne el doble factorial de este.*/
    public static void main(String[] args){

        int num1=0;
        long nfactorial = 1;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        nfactorial = Funciones.dobleFactorial(num1);
        mensaje = "El doble factorial es " + nfactorial;
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }