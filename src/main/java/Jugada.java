public interface Jugada {
    Ganador partida(Jugada contrincante);
    Ganador vsPiedra();
    Ganador vsPapel();
    Ganador vsTijera();
}
