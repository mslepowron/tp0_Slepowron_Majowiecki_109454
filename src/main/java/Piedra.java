public class Piedra implements Jugada{

    @Override
    public Resultado partida(Jugada contrincante) {
        return contrincante.vsPiedra();
    }

    @Override
    public Resultado vsPiedra() {
        return Resultado.PIEDRA;
    }

    @Override
    public Resultado vsPapel() {
        return Resultado.PAPEL;
    }

    @Override
    public Resultado vsTijera() {
        return Resultado.PIEDRA;
    }
}
