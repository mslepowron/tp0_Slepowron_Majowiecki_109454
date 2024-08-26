public interface Jugada {
    Resultado partida(Jugada contrincante);
    Resultado vsPiedra();
    Resultado vsPapel();
    Resultado vsTijera();
}
