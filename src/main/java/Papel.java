public class Papel implements Jugada{

    @Override
    public Ganador partida(Jugada contrincante) {
        return contrincante.vsPapel();
    }

    @Override
    public Ganador vsPiedra() {
        return Ganador.PAPEL;
    }

    @Override
    public Ganador vsPapel() {
        return Ganador.PAPEL;
    }

    @Override
    public Ganador vsTijera() {
        return Ganador.TIJERA;
    }
}
