import javax.swing.JOptionPane;

public class actividad_1 {


    /*Implemente una función llamada esMultiplo que reciba como parámetros dos números
enteros y retorne si el primero es un múltiplo del segundo.*/

    public static void main(String[] args){

        int num1=0;
        int num2=0;
        String mensaje="";

        mensaje = "Ingrese el primer número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
        mensaje =" Ingrese el segundo número entero";
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        if (Funciones.esMultiplo(num1, num2)){
            mensaje = "El primer número es múltiplo del segundo";
        }else{
            mensaje= "El primer número no es múltiplo del segundo";
        }
        JOptionPane.showMessageDialog(null, mensaje);


        




    
}}