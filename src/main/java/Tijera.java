public class Tijera implements Jugada{
    @Override
    public Resultado partida(Jugada contrincante) {
        return contrincante.vsTijera();
    }

    @Override
    public Resultado vsPiedra() {
        return Resultado.PIEDRA;
    }

    @Override
    public Resultado vsPapel() {
        return Resultado.TIJERA;
    }

    @Override
    public Resultado vsTijera() {
        return Resultado.TIJERA;
    }
}
