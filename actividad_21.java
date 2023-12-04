import javax.swing.JOptionPane;

public class actividad_21 {

/*Implemente una función llamada sonAmigos que reciba como parámetros dos números
enteros y retorne si estos son o no números amigos.*/
    public static void main(String[] args){

        int num1=0;
        int num2=0;
        String mensaje="";

        mensaje = "Ingrese el primer  número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
        mensaje = "Ingrese el segundo número entero";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        if (Funciones.sonAmigos(num1,num2)){
            mensaje = "Los números "+ num1 + " y el numero "+ num2 + " son amigos ";      
        } else {
            mensaje = "Los números "+ num1 + " y el numero "+ num2 + " no son amigos ";
        }
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }