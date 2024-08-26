public class Tijera implements Jugada{
    @Override
    public Resultado partida(Jugada contrincante) {
        return contrincante.vsTijera();
    }

    @Override
    public Resultado vsPiedra() {
        return Resultado.DERROTA;
    }

    @Override
    public Resultado vsPapel() {
        return Resultado.VICTORIA;
    }

    @Override
    public Resultado vsTijera() {
        return Resultado.EMPATE;
    }
}
