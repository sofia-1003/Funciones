import javax.swing.JOptionPane;

public class actividad_15 {


/*Implemente una función llamada sumDivisoresNeg que reciba como parámetro un número
entero y retorne la suma de sus divisores negativos.*/
    public static void main(String[] args){

        int num1=0;
        int nsumDivisoresNeg= 1;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        nsumDivisoresNeg = Funciones.sumDivisoresNeg(num1);
        mensaje = "La cantidad de sumDivisoresPos es " + nsumDivisoresNeg;
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }