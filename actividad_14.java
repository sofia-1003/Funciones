import javax.swing.JOptionPane;

public class actividad_14 {


/*Implemente una función llamada sumDivisoresPos que reciba como parámetro un número
entero y retorne la suma de sus divisores positivos.*/
    public static void main(String[] args){

        int num1=0;
        int nsumDivisoresPos= 1;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        nsumDivisoresPos = Funciones.sumDivisoresPos(num1);
        mensaje = "La cantidad de sumDivisoresPos es " + nsumDivisoresPos;
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }