import javax.swing.JOptionPane;

public class actividad_19 {

 /*Implemente una función llamada primordial que reciba como parámetros un número entero
y retorne el primorial de este.*/
    public static void main(String[] args){

        int num1=0;
        long nprimordial= 0;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        nprimordial = Funciones.primordial(num1);
        mensaje = "El número primordial es de " + num1 + " es " +nprimordial;
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }
