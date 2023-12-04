import javax.swing.JOptionPane;

public class actividad_4 {


 /*Implemente una función llamada esImpar que reciba como parámetro un número entero y
retorne si este es o no un número impar*/

    public static void main(String[] args){

        int numero=0;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
       
        if (Funciones.esImpar(numero)){
            mensaje = "El número ingresado es impar";      
        } else {
            mensaje = "El número ingresado no es impar";
        }
        JOptionPane.showMessageDialog(null, mensaje);       
    


        
    }

}