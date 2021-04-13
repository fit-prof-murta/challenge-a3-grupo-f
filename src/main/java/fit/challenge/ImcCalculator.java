package fit.challenge;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ImcCalculator {

    public static String calculate(Double weight, Double height) {

        Double imc = new BigDecimal(weight/ Math.pow(height, 2)).setScale(3, RoundingMode.HALF_UP).doubleValue();
        String resultado = "n/a";

        if(imc <18.50)
            resultado = "Magreza";

        if(imc >= 18.50 && imc <= 24.90)
            resultado = "Normal";

        if(imc >= 25.00 && imc < 30.00)
            resultado = "Sobrepeso";

        if(imc >= 30.00 && imc <= 34.99)
            resultado = "Obesidade";

        if(imc >= 40.00 )
            resultado = "Obesidade";

        return resultado;
    }
}
