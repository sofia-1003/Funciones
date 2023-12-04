import javax.swing.JOptionPane;

public class actividad_20 {

/*Implemente una función llamada esPerfecto que reciba como parámetro un número entero
y diga si este es o no es un número perfecto.*/
    public static void main(String[] args){

        int num1=0;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        if (Funciones.esPerfecto(num1)){
            mensaje = "El número "+ num1 + " es perfecto ";      
        } else {
            mensaje = "El numero " + num1 +" no es perfecto ";
        }
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }
