public class Papel implements Jugada{

    @Override
    public Resultado partida(Jugada contrincante) {
        return contrincante.vsPapel();
    }

    @Override
    public Resultado vsPiedra() {
        return Resultado.PAPEL;
    }

    @Override
    public Resultado vsPapel() {
        return Resultado.PAPEL;
    }

    @Override
    public Resultado vsTijera() {
        return Resultado.TIJERA;
    }
}
