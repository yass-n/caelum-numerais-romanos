package br.com.caelum.romanos.conversor;

import java.util.Map;
import java.util.TreeMap;

public class ConversorDecimalRomano {
    
    private static Map<Integer, String> simbolos = new TreeMap<>();
    
    public ConversorDecimalRomano() {
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
        int divisor = 1;
        String romano = "";

        int resto = numero;
        while (resto > 0) {         
            for (int n : simbolos.keySet()) {
                if (resto % n != resto) {
                    divisor = n;
                }
            }
            resto = resto % divisor;
            romano += simbolos.get(divisor);
        }
        
        return romano;
    }
}
