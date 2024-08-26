import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PiedraPapelTijeraTest {

    private final Jugada piedra = new Piedra();
    private final Jugada papel = new Papel();
    private final Jugada tijera = new Tijera();

    @Test
    public void testPiedraGanaVsTijera() {
        assertEquals(Ganador.PIEDRA, piedra.partida(tijera));
    }

    @Test
    public void testPiedraPierdeVsPapel() {
        assertEquals(Ganador.PAPEL, piedra.partida(papel));
    }

    @Test
    public void testPiedraEmpataVsPiedra() {
        assertEquals(Ganador.PIEDRA, piedra.partida(piedra));
    }

    @Test
    public void testPapelGanaVsPiedra() {
        assertEquals(Ganador.PAPEL, papel.partida(piedra));
    }

    @Test
    public void testPapelPierdeVsTijera() {
        assertEquals(Ganador.TIJERA, papel.partida(tijera));
    }

    @Test
    public void testPapelEmpataVsPapel() {
        assertEquals(Ganador.PAPEL, papel.partida(papel));
    }

    @Test
    public void testTijeraGanaVsPapel() {
        assertEquals(Ganador.TIJERA, tijera.partida(papel));
    }

    @Test
    public void testTijeraPierdeVsPiedra() {
        assertEquals(Ganador.PIEDRA, tijera.partida(piedra));
    }

    @Test
    public void testTijeraEmpataVsTijera() {
        assertEquals(Ganador.TIJERA, tijera.partida(tijera));
    }
}
