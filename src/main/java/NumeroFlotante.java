import java.math.BigDecimal;

public class NumeroFlotante {
    public static void main (String []args){
        //Creamos la Variable la acual le vamos a separar la parte decimal
        double NumeroDecimal = 24.04;
        //Importamos la clase Bigdecimal
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(NumeroDecimal));

        int intValue = bigDecimal.intValue();
        //imprimimos los resultados
        System.out.println("Numero decima completo " + bigDecimal.toPlainString());
        System.out.println("Parte entera: " + intValue);
        System.out.println("Parte decimal: " + bigDecimal.subtract(
                new BigDecimal(intValue)).toPlainString());
    }
}
