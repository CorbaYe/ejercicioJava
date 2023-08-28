import javax.swing.JOptionPane;

public class ejercicio_java{

    static String [] notas = new String[10];
    static int posicion= 0;

    private static void fntMenu(boolean m){
        while(m == true){
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null,"<<< Menú principal >>>\n" +
            "1. Registrar nota\n" +
            "2. Mostrar registros\n" +
            "3. Salir\n"));
        }
    }

    public static void main(String[] args) {
        fntMenu(true);
    }
}