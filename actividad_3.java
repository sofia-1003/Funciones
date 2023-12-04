import javax.swing.JOptionPane;

public class actividad_3 {


 /*Implemente una función llamada esPar que reciba como parámetro un número entero y
retorne si este es o no un número par*/

    public static void main(String[] args){

        int numero=0;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
       
        if (Funciones.esPar(numero)){
            mensaje = "El número ingresado es par";      
        } else {
            mensaje = "El número ingresado no es par";
        }
        JOptionPane.showMessageDialog(null, mensaje);       
    


        
    }

}