public class Papel implements Jugada{

    @Override
    public Resultado partida(Jugada contrincante) {
        return contrincante.vsPapel();
    }

    @Override
    public Resultado vsPiedra() {
        return Resultado.VICTORIA;
    }

    @Override
    public Resultado vsPapel() {
        return Resultado.EMPATE;
    }

    @Override
    public Resultado vsTijera() {
        return Resultado.DERROTA;
    }
}
