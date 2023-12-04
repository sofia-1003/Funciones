import javax.swing.JOptionPane;

public class actividad_6 {


 /*Implemente una función llamada esNegativo que reciba como parámetro un número entero
y retorne si este es o no un número negativo.*/
    public static void main(String[] args){

        int numero=0;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
       
        if (Funciones.esNegativo(numero)){
            mensaje = "El número ingresado es negativo";      
        } else {
            mensaje = "El número ingresado no es negativo";
        }
        JOptionPane.showMessageDialog(null, mensaje);       
    


        
    }

}