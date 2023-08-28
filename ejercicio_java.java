import javax.swing.JOptionPane;

public class ejercicio_java{

    static String [] notas = new String[10];
    static int posicion= 0;

    public static void fntRegistrarNota(float n1,float n2,float n3, String nombre){
        float def = (float)((n1 * 0.30) + (n2 * 0.30) + (n3 * 0.40));
        notas[posicion] = nombre + " " + def;
        posicion++;
        JOptionPane.showMessageDialog(null,"Nota registrada con éxito", "REGISTRO", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void fntMenu(boolean m){
        while(m == true){
            int menu = Integer.parseInt(JOptionPane.showInputDialog(null,"<<< Menú principal >>>\n" +
            "1. Registrar nota\n" +
            "2. Mostrar registros\n" +
            "3. Salir\n"));

            switch(menu){
                case 1:
                    float n1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 1"));
                    float n2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 2"));
                    float n3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 3"));
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
                    fntRegistrarNota(n1,n2,n3,nombre);
                    break;
                case 2:
                    //fntMostrarNotas();
                    break;
                case 3:
                    m = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opción incorrecta");
                    break;
            }       
         }
    }

    public static void main(String[] args) {
        fntMenu(true);
    }
}