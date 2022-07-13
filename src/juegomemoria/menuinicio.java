
package juegomemoria;

//librerias
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class menuinicio extends JFrame implements ActionListener {
    JLabel nomjudador, etiqueta;
    JButton creditos, iniciarjuego, salir;
    JTextField txtnomjugador;

    public menuinicio() {
        this.setTitle("Menu");
        this.setSize(1010, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        componentes();
    }

    // metodo que contiene todos los compoenentes de la ventana

    public void componentes() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

        etiqueta = new JLabel("Juego");
        etiqueta.setBounds(380, 70, 250, 60);
        etiqueta.setFont(new Font("Elvier Alejandro", Font.PLAIN, 30));
        panel.add(etiqueta);

        etiqueta = new JLabel("Nombre Del Jugador  ");
        etiqueta.setBounds(400, 250, 250, 40);
        etiqueta.setFont(new Font("Elvier Alejandro", Font.PLAIN, 20));
        panel.add(etiqueta);

        // texto donde se coloca el nombre de jugador
        txtnomjugador = new JTextField();
        txtnomjugador.setBounds(300, 300, 400, 40);
        txtnomjugador.setHorizontalAlignment(JTextField.CENTER);
        txtnomjugador.setFont(new Font("Elvier Alejandro ", Font.PLAIN, 20));
        panel.add(txtnomjugador);

        // boton iniciar juego, este mandara directamente a iniciar el juego
        iniciarjuego = new JButton("Iniciar Juego");
        iniciarjuego.setBounds(370, 400, 250, 40);
        iniciarjuego.setFont(new Font("Elvier Alejandro", Font.PLAIN, 15));
        iniciarjuego.addActionListener(this);
        panel.add(iniciarjuego);

        // este boton va a mostrar los datos del creador de la aplicación
        creditos = new JButton("Creditos");
        creditos.setBounds(370, 480, 250, 40);
        creditos.setFont(new Font("Elvier Alejandro", Font.PLAIN, 15));
        creditos.addActionListener(this);
        panel.add(creditos);

        // Boton salir
        salir = new JButton("Salir");
        salir.setBounds(370, 560, 250, 40);
        salir.setFont(new Font("Elvier Alejandro", Font.PLAIN, 15));
        salir.addActionListener(this);
        panel.add(salir);

    }

    // eventos de acción

    @Override
    public void actionPerformed(ActionEvent e) {

        // este evento realiza la acción del boton iniciar juego
        if (e.getSource() == iniciarjuego) {

            // se coloca un if para colocar una excepcion a la hora de iniciar el juego
            if (txtnomjugador.getText().equals("")) {
                // si en el txtnomjugador no se encuentra ningun valor
                JOptionPane.showMessageDialog(null, "Coloca nombre de jugador");
                // mandara un mensaje diciendo que tiene que colocar algun nombre
            } else {
                // de lo contrario, se inicializara el juego de memoria
                // se manda a llamar la clase JuegoMemoria
                JuegoMemoria ventana = new JuegoMemoria();
                // decimos que nombreju de la clase JuegoMemoria
                // va a obtener el valor que se coloco en el txtnomjugador
                ventana.nombreju.setText(txtnomjugador.getText());
                // esto se coloca para inicializar el tiempo de la clase JuegoMemoria
                ventana.tiempo.start();
                // mostramos la ventana de la clase JuegoMemoria
                ventana.setVisible(true);
                // ocultamos la ventana de menuinicial
                this.setVisible(false);

            }
        }

        // este es el evento de el boton creditos
        if (e.getSource() == creditos) {
            // se manda a llamar una imagen
            Icon g = new ImageIcon(getClass().getResource("/imagenes/col.png"));
            // se implementa que a la hora de apachar el boton creditos este mostrara una
            // ventana
            // donde se mostraran algun datos del creador del programa
            JOptionPane.showMessageDialog(null, " Instituto Emiliani Somascos\n"
                    + " Estudiante:\n Cinthya Valeska Chinchilla Sosa.\n "
                    + "Carrera:\n Bachiller Industrical y Perito con Especialidad en Computacion.       "
                    + "\n 5to grado, sección A"
                    + "\n "
                    + "\n "
                    + "\n Tercer Bimestre, 2020"
                    + "\n Proyecto: Juego de Memoria."
                    + "\n Clase: Tecnologia Vocacional II."
                    + "\n Prof Encargado: Oscar Mendez"
                    + "\n "
                    + "\n "
                    + "\n Proyecto realizado con las indicaciones del instructor encargado"
                    + "\n como parte del Tercer bimestre de 5to grado, para implementar"
                    + "\n los conocimintos basicos del lenguaje JAVA, creando un programa"
                    + "\n conocido con el nombre de Juego de Memoria el cual tiene como"
                    + "\n objetivo encontrar el par de cada carta tambien esta realizado"
                    + "\n con fines educativos por esta razón las cartas contienen las"
                    + "\n frutas con sus nombres en ingles. Este juego fue creados para"
                    + "\n la enseñanza basica de ingles para los niños pequeños con el"
                    + "\n fin de que se diviertan y aprendan al mismo tiempo. "
                    + "\n Este juego fue creado solo con codigo.   "
            // al final mandamos a llamar a la imagen para que se coloque en la ventana
                    , "Informacion del Estudiante", JOptionPane.INFORMATION_MESSAGE, g);

        }

        // este es el evento del boton salir
        if (e.getSource() == salir) {
            // se mostrara una ventana donde hace una pregunta y tiene las opciones de salir
            // o no
            if (JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de querer salir de la aplicacion?",
                    "Salir de la Calculadora", JOptionPane.YES_NO_OPTION,
                    JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
                System.exit(0);
        }

    }
}
