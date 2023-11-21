package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static CarroUsado cu;

    @BeforeAll public static void setUp() {
        try
        {
            cu = new CarroUsado(5678,"Honda", 10000, 500000, 2021);
        }
        catch (CarroUsadoException cue )
        {
        }
    }

    @Test public void testPrecioBase() {
        assertTrue(cu.getPrecioBase()==500000.0);
    }

    @Test public void testDescuento() {
        assertTrue(cu.descuento()==5.0);
    }

    @Test public void testPrecioFinal() {
        assertTrue(cu.precioFinal()==475000.0);
    }

    @Test public void testModelo() {
        assertTrue(cu.getModelo()==2021);
    }
}