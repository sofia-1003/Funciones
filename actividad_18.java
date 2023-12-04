import javax.swing.JOptionPane;

public class actividad_18 {

/*Implemente una función llamada esPrimo que reciba como parámetros un número entero y
retorne si este es o no es un número primo.*/
    public static void main(String[] args){

        int num1=0;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        if (Funciones.esPrimo(num1)){
            mensaje = "El número "+ num1 + " es primo ";      
        } else {
            mensaje = "El numero " + num1 +" no es primo ";
        }
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }