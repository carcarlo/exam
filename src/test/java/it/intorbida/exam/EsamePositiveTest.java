package it.intorbida.exam;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EsamePositiveTest {

    private String nome;
    private int CFU;
    private int voto;
    private int data;

    public EsamePositiveTest(String nome, int CFU, int voto, int data) {
        this.nome = nome;
        this.CFU = CFU;
        this.voto = voto;
        this.data = data;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            { "Matematica", 12, 28, 20220315 },
            { "Informatica", 8, 24, 20211020 },
            { "Fisica", 6, 30, 20231201 },
            { "Chimica", 10, 20, 20200601 },
        });
    }

    @Test
    public void testEsameSostenuto() {
        Esame esame = new Esame(nome, CFU);
        esame.esameSostenuto(voto, data);
        assertEquals(voto, esame.getVoto());
        assertEquals(data, esame.getData());
    }
}
