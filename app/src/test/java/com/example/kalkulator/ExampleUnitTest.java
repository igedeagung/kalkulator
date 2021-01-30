package com.example.kalkulator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private static final double DELTA = 1e-15;

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testingMock(){
        Operan operan=new Operan(10, 20);
        Operasi mockObject= Mockito.mock(Operasi.class);
        Mockito.when(mockObject.tambah(operan)).thenReturn((double) 30);
        assertEquals(30, mockObject.tambah(operan), DELTA);
    }
}