public class Piedra implements Jugada{

    @Override
    public Resultado partida(Jugada contrincante) {
        return contrincante.vsPiedra();
    }

    @Override
    public Resultado vsPiedra() {
        return Resultado.EMPATE;
    }

    @Override
    public Resultado vsPapel() {
        return Resultado.DERROTA;
    }

    @Override
    public Resultado vsTijera() {
        return Resultado.VICTORIA;
    }
}
