package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CuentaAhorroTest {
    private static final Logger LOG = Logger.getLogger(CuentaAhorro.class.getName());

    @Test
    public void retirarDineroCuentaAhorro (){
        LOG.info("Iniciando Test");
        CuentaAhorro cuentaAhorro = new CuentaAhorro("19290128", 100.000, true, new Titular("Juan", "Smith"), 12.7);
        cuentaAhorro.retirarDinero(50.000);
        assertEquals(50.000, cuentaAhorro.getSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void retirarTodoElSaldo(){
        LOG.info("Iniciando Test");
        CuentaAhorro cuentaAhorro = new CuentaAhorro(
            "182991020", 100.000, true, new Titular(
                "Juan", 
                "Smith"), 12.9);
            cuentaAhorro.retirarDinero(100.00);
            assertEquals(0.0, cuentaAhorro.getSaldo());
            assertFalse(cuentaAhorro.isEstadoCuenta());
        LOG.info("Finalizando Test");
    }

    @Test
    public void depositarDineroCuentaAhorro (){
        LOG.info("Iniciando Test");
        CuentaAhorro cuentaAhorro = new CuentaAhorro("1829182", 100.000, true, new Titular("Juan", "Smith"), 0.007);
        cuentaAhorro.depositarDinero(50.000);
        assertEquals(150.000, cuentaAhorro.getSaldo());
        LOG.info("Terminando Test");
    }

    @Test
    public void consultarSaldoCuentaActiva (){
        LOG.info("Iniciando Test");
        CuentaAhorro cuentaAhorro = new CuentaAhorro("1829182", 100.000, true, new Titular("Juan", "Smith"), 0.007);
        cuentaAhorro.consultarSaldo();
        assertEquals(100.000, cuentaAhorro.consultarSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void consultarSaldoCuentaInactiva (){
        CuentaAhorro cuentaAhorro = new CuentaAhorro("1829182", 0.0, false, new Titular("Juan", "Smith"), 0.007);
        cuentaAhorro.consultarSaldo();
        assertEquals(0.0, cuentaAhorro.consultarSaldo());
    }

    @Test
    public void testCuentaActivaYExiste() {
        LOG.info("Iniciando Test");
        Titular titular = new Titular("Juan", "12345678A");
        CuentaAhorro cuenta = new CuentaAhorro("1234567890", 100.0, true, titular, 50.0);
        boolean resultado1 = cuenta.cuentaActivaYExiste("1234567890"); 
        boolean resultado2 = cuenta.cuentaActivaYExiste("1234567891");
        assertTrue(resultado1); 
        assertFalse(resultado2);
        LOG.info("Finalizando Test");
    }

    @Test
    public void transferirDinero (){
        LOG.info("Iniciando Test");
        Titular titularOrigen = new Titular("Juan", "12345678A");
        Titular titularDestino = new Titular("Maria", "98765432B");
        CuentaAhorro cuentaOrigen = new CuentaAhorro("1234567890", 100.0, true, titularOrigen, 50.0);
        CuentaAhorro cuentaDestino = new CuentaAhorro("0987654321", 50.0, true, titularDestino, 0.0);
        cuentaOrigen.transferirDinero(50.0, cuentaDestino);
        assertEquals(50.0, cuentaOrigen.getSaldo(), 0.001); 
        assertEquals(100.0, cuentaDestino.getSaldo(), 0.001);
        LOG.info("Finalizando Test");
    }

}
