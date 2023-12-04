import javax.swing.JOptionPane;

public class actividad_7 {


/*Implemente una función llamada mayor que reciba como parámetros dos números enteros
y retorne el mayor de estos.*/
    public static void main(String[] args){

        int num1=0;
        int num2=0;

        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
        mensaje = "Ingrese un número entero";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
       
        if (Funciones.mayor(num1,num2)){
            mensaje = "El número "+ num1 + " es mayor que el " + num2;      
        } else {
            mensaje = "El numero s" + num2 + " es mayor que el " + num1;
        }
        JOptionPane.showMessageDialog(null, mensaje);       
    


        
    
    

    }

        
    }