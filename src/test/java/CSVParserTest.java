import org.example.CSVParser;
import org.example.Cliente;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class CSVParserTest {

    @Test
    public void testParse() {
        List<Cliente> clientes = CSVParser.parse("src/test/resources/test_data.csv");
        assertEquals(2, clientes.size());

        Cliente cliente1 = clientes.get(0);
        assertEquals("1", cliente1.getCodigoCliente());
        assertEquals("Empresa1", cliente1.getNombreEmpresa());
        assertEquals("Ciudad1", cliente1.getLocalidad());
        assertEquals("correo1@example.com", cliente1.getCorreoElectronico());
        assertEquals("Responsable1", cliente1.getNombreResponsable());

        Cliente cliente2 = clientes.get(1);
        assertEquals("2", cliente2.getCodigoCliente());
        assertEquals("Empresa2", cliente2.getNombreEmpresa());
        assertEquals("Ciudad2", cliente2.getLocalidad());
        assertEquals("correo2@example.com", cliente2.getCorreoElectronico());
        assertEquals("Responsable2", cliente2.getNombreResponsable());
    }
}