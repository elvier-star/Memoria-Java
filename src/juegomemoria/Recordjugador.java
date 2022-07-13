
package juegomemoria;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Recordjugador extends JFrame implements ActionListener{
    
    JLabel lblnombrejuga, lbltiempoju, lblhorainicio, lblfechaju,etiqueta;
    JButton regresar;
    public Recordjugador(){
        this.setTitle("Record de Jugador");
        this.setSize(1010, 720);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        //agregamos panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        etiqueta = new JLabel("Tu Record");
        etiqueta.setBounds(430,60,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 35));
        panel.add(etiqueta);
        
        etiqueta = new JLabel("Nombre Jugador: ");
        etiqueta.setBounds(320,180,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label obtendra el nombre del jugador colocado anteriormente
        lblnombrejuga = new JLabel("nombre");
        lblnombrejuga.setBounds(480,180,150,40);
        lblnombrejuga.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblnombrejuga);
        
        etiqueta = new JLabel("Tiempo Final: ");
        etiqueta.setBounds(320,240,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label obtendra el tiempo final que obtuvo, mejor dicho en cuanto tiempo
        //se tardo el jugador en terminar el juego
        lbltiempoju = new JLabel("tiempo");
        lbltiempoju.setBounds(480,240,150,40);
        lbltiempoju.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lbltiempoju);
        
        etiqueta = new JLabel("Hora inicial: ");
        etiqueta.setBounds(320,300,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //este label mostrar la hora de inicio
        lblhorainicio = new JLabel("hora");
        lblhorainicio.setBounds(480,300,150,40);
        lblhorainicio.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblhorainicio);
        
        etiqueta = new JLabel("Fecha: ");
        etiqueta.setBounds(320,360,150,40);
        etiqueta.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(etiqueta);
        
        //en este label se mostrara la fecha
        lblfechaju = new JLabel("fecha");
        lblfechaju.setBounds(480,360,150,40);
        lblfechaju.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        panel.add(lblfechaju);
        
        regresar = new JButton("Regresar a Menu");
        regresar.setBounds(370,560,250,40);
        regresar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 16));
        regresar.addActionListener(this);
        panel.add(regresar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        //el boton regresar hara que regresemos a la ventana de menu
        if(e.getSource() == regresar){
            menuinicio ventana = new menuinicio();
            JuegoMemoria ventana2 = new JuegoMemoria();
            ventana2.setVisible(false);
            ventana.setVisible(true);
            this.setVisible(false);
        
        }
    }
    
}
