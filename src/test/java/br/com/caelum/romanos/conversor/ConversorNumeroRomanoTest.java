package br.com.caelum.romanos.conversor;

import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

public class ConversorNumeroRomanoTest {

    private ConversorNumeroRomano conversor;
    private static Map<Integer, String> simbolos;

    @Before
    public void before() {
        conversor = new ConversorNumeroRomano();
        simbolos = getSimbolos();
    }

    @Test(expected=IllegalArgumentException.class)
    public void naoDeveConverterZero() {
        conversor.converte(0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void naoDeveConverterNumerosNegativos() {
        conversor.converte(-1);
    }


    @Test
    public void deveConverterNumeroParaRomano() {
        int n = 3999;
        for (Integer i : simbolos.keySet()) {
            assertEquals(simbolos.get(i), conversor.converte(i));
        }

    }

    private Map<Integer, String> getSimbolos() {
        TreeMap<Integer, String> m = new TreeMap<>();
        m.put(1, "I");
        m.put(2, "II");
        m.put(3, "III");
        m.put(4, "IV");
        m.put(5, "V");
        m.put(6, "VI");
        m.put(7, "VII");
        m.put(8, "VIII");
        m.put(9, "IX");
        m.put(10, "X");
        m.put(3999, "MMMCMXCIX");
        return m;
    }
}
