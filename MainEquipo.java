import java.util.ArrayList;

public class MainEquipo {

    public static void main(String[] args) {

        Jugador j1 = new Jugador("Oliver", 10);
        Jugador j2 = new Jugador("Cristiano", 7);
        Jugador j3 = new Jugador("Messi", 30);

        EquipoFutbol equisd = new EquipoFutbol("Dinamita", "Nuncajamas", new ArrayList<Jugador>());

        equisd.agregarJugadores(j1);
        equisd.agregarJugadores(j2);
        equisd.agregarJugadores(j3);

        System.out.println(equisd.mostrarInformacion());

    }

}