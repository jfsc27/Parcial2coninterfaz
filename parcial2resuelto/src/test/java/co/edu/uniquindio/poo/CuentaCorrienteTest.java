package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
    private static final Logger LOG = Logger.getLogger(CuentaCorriente.class.getName());

    @Test
    public void retirarDinero (){
        LOG.info("Iniciando Test");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("9289202", 100.000, true, new Titular("Juan", "Smith"), 100.000);
        cuentaCorriente.retirarDinero(90.000);
        assertEquals(10.000, cuentaCorriente.getSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void retirarDineroUtilizandoSobregiro (){
        LOG.info("Iniciando Test");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("893829", 100.000, true, new Titular("Juan", "Smith"), 50.000);
        cuentaCorriente.retirarDinero(150.000);
        assertEquals(0.0, cuentaCorriente.getSaldo());
        LOG.info("Finalizando Test");
    }
    
    @Test
    public void depositarDinero (){
        LOG.info("Iniciando Test");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("2893920", 100.000, true, new Titular("Juan", "Smith"), 50.000);
        cuentaCorriente.depositarDinero(100.000);
        assertEquals(200.000, cuentaCorriente.getSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void consultarSaldoCuentaActiva (){
        LOG.info("Iniciando Test");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("1829182", 100.000, true, new Titular("Juan", "Smith"), 0.007);
        cuentaCorriente.consultarSaldo();
        assertEquals(100.000, cuentaCorriente.consultarSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void consultarSaldoCuentaInactiva (){
        LOG.info("Iniciando Test");
        CuentaCorriente cuentaCorriente = new CuentaCorriente("1829182", 0.0, false, new Titular("Juan", "Smith"), 0.007);
        cuentaCorriente.consultarSaldo();
        assertEquals(0.0, cuentaCorriente.consultarSaldo());
        LOG.info("Finalizando Test");
    }

    @Test
    public void testCuentaActivaYExiste() {
        LOG.info("Iniciando Test");
        Titular titular = new Titular("Juan", "12345678A");
        CuentaCorriente cuenta = new CuentaCorriente("1234567890", 100.0, true, titular, 50.0);
        boolean resultado1 = cuenta.cuentaActivaYExiste("1234567890");
        boolean resultado2 = cuenta.cuentaActivaYExiste("1234567891");
        assertTrue(resultado1); 
        assertFalse(resultado2); 
        LOG.info("Finalizando Test");
    }

    @Test
    public void transferirDinero(){
        LOG.info("Iniciando Test");
        Titular titularOrigen = new Titular("Juan", "12345678A");
        Titular titularDestino = new Titular("Maria", "98765432B");
        CuentaCorriente cuentaOrigen = new CuentaCorriente("1234567890", 100.0, true, titularOrigen, 50.0);
        CuentaCorriente cuentaDestino = new CuentaCorriente("0987654321", 50.0, true, titularDestino, 0.0);
        cuentaOrigen.transferirDinero(50.0, cuentaDestino);
        assertEquals(50.0, cuentaOrigen.getSaldo(), 0.001);
        assertEquals(100.0, cuentaDestino.getSaldo(), 0.001);
        LOG.info("Finalizando Test");
    }
}

