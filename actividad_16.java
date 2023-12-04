import javax.swing.JOptionPane;

public class actividad_16 {

/*Implemente una función llamada sumDivisores que reciba como parámetro un número
entero y retorne la suma de sus divisores.*/
    public static void main(String[] args){

        int num1=0;
        int nsumDivisores= 1;
        String mensaje="";

        mensaje = "Ingrese un número entero";
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));

        nsumDivisores = Funciones.sumDivisores(num1);
        mensaje = "La cantidad de sumDivisoresPos es " + nsumDivisores;
        JOptionPane.showMessageDialog(null, mensaje);  
            
    }      
       
    }