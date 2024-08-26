public class Tijera implements Jugada{
    @Override
    public Ganador partida(Jugada contrincante) {
        return contrincante.vsTijera();
    }

    @Override
    public Ganador vsPiedra() {
        return Ganador.PIEDRA;
    }

    @Override
    public Ganador vsPapel() {
        return Ganador.TIJERA;
    }

    @Override
    public Ganador vsTijera() {
        return Ganador.TIJERA;
    }
}
