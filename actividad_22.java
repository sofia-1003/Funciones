import javax.swing.JOptionPane;

public class actividad_22 {

/*Implemente una función llamada generarAleatorio que reciba como parámetros un número
limInf y limSup (números enteros) y retorne un número aleatorio que se encuentre en el
rango.*/
    public static void main(String[] args){

        int limiteinf=0;
        int limitesup= 0;
        int aleatorio=0;
        String mensaje="";

        mensaje = "Ingrese un primero numero entero";
        limiteinf = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        mensaje = "Ingrese un segundo numero entero"; ;
        limitesup = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        aleatorio = Funciones.generarAleatorio(limiteinf,limitesup);
        mensaje = "El número aleatorio es " + aleatorio ;
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }