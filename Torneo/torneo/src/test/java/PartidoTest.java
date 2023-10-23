import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.torneo.Estadio;

public class PartidoTest {
    @Test
    public void estadio_se_debe_crear_en_una_ubicacion_parcial_ejercicio_ejemplo_05()
    {                
        Estadio estadioBombonera = new Estadio("La Bombonera", "Buenos Aires", "Argentina");


        assertEquals("La Bombonera", estadioBombonera.getName());
        assertEquals("Buenos Aires", estadioBombonera.getCiudad());
        assertEquals("Argentina", estadioBombonera.getPais());
        assertEquals("La Bombonera, Buenos Aires (Argentina)", estadioBombonera.toString());


    }

}
