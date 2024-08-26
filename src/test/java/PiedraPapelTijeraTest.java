import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PiedraPapelTijeraTest {

    private final Jugada piedra = new Piedra();
    private final Jugada papel = new Papel();
    private final Jugada tijera = new Tijera();

    @Test
    public void testPiedraGanaVsTijera() {
        assertEquals(Resultado.PIEDRA, piedra.partida(tijera));
    }

    @Test
    public void testPiedraPierdeVsPapel() {
        assertEquals(Resultado.PAPEL, piedra.partida(papel));
    }

    @Test
    public void testPiedraEmpataVsPiedra() {
        assertEquals(Resultado.PIEDRA, piedra.partida(piedra));
    }

    @Test
    public void testPapelGanaVsPiedra() {
        assertEquals(Resultado.PAPEL, papel.partida(piedra));
    }

    @Test
    public void testPapelPierdeVsTijera() {
        assertEquals(Resultado.TIJERA, papel.partida(tijera));
    }

    @Test
    public void testPapelEmpataVsPapel() {
        assertEquals(Resultado.PAPEL, papel.partida(papel));
    }

    @Test
    public void testTijeraGanaVsPapel() {
        assertEquals(Resultado.TIJERA, tijera.partida(papel));
    }

    @Test
    public void testTijeraPierdeVsPiedra() {
        assertEquals(Resultado.PIEDRA, tijera.partida(piedra));
    }

    @Test
    public void testTijeraEmpataVsTijera() {
        assertEquals(Resultado.TIJERA, tijera.partida(tijera));
    }
}
