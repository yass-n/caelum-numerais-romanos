package br.com.caelum.romanos.conversor;

import java.util.Map;
import java.util.TreeMap;

public class ConversorNumeroRomano {

    private static Map<Integer, String> simbolos = new TreeMap<>();

    public ConversorNumeroRomano() {
        simbolos.put(1, "I");
        simbolos.put(2, "II");
        simbolos.put(3, "III");
        simbolos.put(4, "IV");
        simbolos.put(5, "V");

        simbolos.put(9, "IX");
        simbolos.put(10, "X");

        simbolos.put(40, "XL");
        simbolos.put(50, "L");

        simbolos.put(90, "XC");
        simbolos.put(100, "C");

        simbolos.put(400, "CD");
        simbolos.put(500, "D");

        simbolos.put(900, "CM");
        simbolos.put(1000, "M");
    }

    public String converte(int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException();
        }

        String romano = "";

        while (numero > 0) {
            int maior = 1;
            for (Integer i : simbolos.keySet()) {
                if (numero - i > -1) {
                    maior = i;
                }
            }
            numero -= maior;
            romano += simbolos.get(maior);
        }

        return romano;
    }
}
