import javax.swing.JOptionPane;

public class actividad_5 {


 /*Implemente una función llamada esPositivo que reciba como parámetro un número entero
y retorne si este es o no un número positivo*/

    public static void main(String[] args){

        int numero=0;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
       
        if (Funciones.esPositivo(numero)){
            mensaje = "El número ingresado es positivo";      
        } else {
            mensaje = "El número ingresado no es positivo";
        }
        JOptionPane.showMessageDialog(null, mensaje);       
    


        
    }

}