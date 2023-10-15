import org.example.Cliente;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClienteTest {

    @Test
    public void testConstructorYGetters() {
        Cliente cliente = new Cliente("1", "Empresa1", "Ciudad1", "correo1@example.com", "Responsable1");
        assertEquals("1", cliente.getCodigoCliente());
        assertEquals("Empresa1", cliente.getNombreEmpresa());
        assertEquals("Ciudad1", cliente.getLocalidad());
        assertEquals("correo1@example.com", cliente.getCorreoElectronico());
        assertEquals("Responsable1", cliente.getNombreResponsable());
    }
}