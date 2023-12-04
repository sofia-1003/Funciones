import javax.swing.JOptionPane;

public class actividad_17 {

/*Implemente una función llamada esCompuesto que reciba como parámetros un número
entero y retorne si este es o no es un número compuesto.*/
    public static void main(String[] args){

        int num1=0;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        if (Funciones.esCompuesto(num1)){
            mensaje = "El número "+ num1 + " es compuesto ";      
        } else {
            mensaje = "El numero " + num1 +" no es compuesto ";
        }
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }