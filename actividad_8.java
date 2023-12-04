import javax.swing.JOptionPane;

public class actividad_8 {


/*Implemente una función llamada menor que reciba como parámetro dos números enteros y
retorne el menor de estos.*/
    public static void main(String[] args){

        int num1=0;
        int num2=0;

        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
        mensaje = "Ingrese un número entero";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
       
        if (Funciones.menor(num1,num2)){
            mensaje = "El número "+ num1 + " es menor que el " + num2;      
        } else {
            mensaje = "El numero " + num2 + " es menor que el " + num1;
        }
        JOptionPane.showMessageDialog(null, mensaje);    
        
        
    
    
    


        
    
    

    }

        
    }