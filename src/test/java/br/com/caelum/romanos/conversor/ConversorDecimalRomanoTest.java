package br.com.caelum.romanos.conversor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ConversorDecimalRomanoTest {

    private ConversorDecimalRomano conversor;

    @Before
    public void before() {
        conversor = new ConversorDecimalRomano();
    }
    
    @Test
    public void deveConverterNumeroDecimalParaRomano() {
        int n = 3999;
        String romano = conversor.converte(n);
        
        assertEquals("MMMCMXCIX", romano);
    }
}
