package trabajo.progra.ii;
import java.util.Random;
import javax.swing.JTextField;
public class Logica {
    String Jugadas[] = new String[9];
    public char crearTurno() {
        int valor;
        char jugador;

        Random aleatorio = new Random();
        valor = (int) (aleatorio.nextDouble() * 2);
        if (valor == 0) {
            jugador = 'O';
        } else {
            jugador = 'X';
        }
        return jugador;
    }

    public char cambiarTurno(char valor) {
        char jugador = 0;
        switch (valor) {
            case 'X':
                jugador = 'O';
                break;
            case 'O':
                jugador = 'X';
                break;
        }
        return jugador;
    }

    public void guardarJugadas(JTextField campo, int jug) {

        Jugadas[jug] = campo.getText();

    }

    public int buscarGanador() {
        int ganador = 0;     
        if (Jugadas[0] != null && Jugadas[0].equals(Jugadas[4]) && Jugadas[0].equals(Jugadas[8])) {
            ganador = 1;
        }

        if (Jugadas[2] != null && Jugadas[2].equals(Jugadas[4]) && Jugadas[4].equals(Jugadas[6])) {
            ganador = 2;
        }

        if (Jugadas[0] != null && Jugadas[0].equals(Jugadas[1]) && Jugadas[0].equals(Jugadas[2])) {
            ganador = 3;
        }

        if (Jugadas[3] != null && Jugadas[3].equals(Jugadas[4]) && Jugadas[3].equals(Jugadas[5])) {
            ganador = 4;
        }

        if (Jugadas[6] != null && Jugadas[6].equals(Jugadas[7]) && Jugadas[6].equals(Jugadas[8])) {
            ganador = 5;
        }

        if (Jugadas[0] != null && Jugadas[0].equals(Jugadas[3]) && Jugadas[0].equals(Jugadas[6])) {
            ganador = 6;
        }

        if (Jugadas[1] != null && Jugadas[1].equals(Jugadas[4]) && Jugadas[1].equals(Jugadas[7])) {
            ganador = 7;
        }

        if (Jugadas[2] != null && Jugadas[2].equals(Jugadas[5]) && Jugadas[2].equals(Jugadas[8])) {
            ganador = 8;
        }
        return ganador;
    }
    public void inicializar(){
        for(int i=0; i<9;i++){
            Jugadas[i]=null;
        }
    }
}
