package it.intorbida.exam;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EsameNegativeTest {

    private String nome;
    private int CFU;
    private int voto;
    private int data;

    public EsameNegativeTest(String nome, int CFU, int voto, int data) {
        this.nome = nome;
        this.CFU = CFU;
        this.voto = voto;
        this.data = data;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { "Informatica", 20, 28, 20220315 }
//            ,
//            { "Fisica", 6, 35, 20231201 },
//            { "Chimica", 10, 25, 20190101 },
        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCostruttoreCFUInvalido() {
        new Esame(nome, CFU);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsameSostenutoVotoInvalido() {
        Esame esame = new Esame(nome, CFU);
        esame.esameSostenuto(voto, data);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEsameSostenutoDataInvalida() {
        Esame esame = new Esame(nome, CFU);
        esame.esameSostenuto(28, data);
    }
}
