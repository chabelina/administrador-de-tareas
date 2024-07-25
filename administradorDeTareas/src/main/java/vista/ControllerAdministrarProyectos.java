package vista;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 * Controlador para la clase AdministrarProyectos
 * 
 * @autor HP
 */
public class ControllerAdministrarProyectos implements MouseListener {
    private final AdministrarProyectos view;

    // Constructor que inicializa la vista y los eventos
    public ControllerAdministrarProyectos(AdministrarProyectos view) {
        this.view = view;
        events();
    }

    public final void events() {
        view.regresar.addMouseListener(this);
        view.BntGesProyecAdmin.addMouseListener(this);
        view.GestProyParticipante.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Implementa la funcionalidad al hacer clic en los botones
        Object evt = e.getSource();
        
        if(evt.equals(view.regresar)){
            System.out.println("Regresar clicked");
            // Agrega la funcionalidad para el botón regresar
        } else if(evt.equals(view.BntGesProyecAdmin)){
            System.out.println("Gestionar Proyectos Admin clicked");
            // Agrega la funcionalidad para gestionar proyectos como admin
        } else if(evt.equals(view.GestProyParticipante)){
            System.out.println("Gestionar Proyectos Participante clicked");
            // Agrega la funcionalidad para gestionar proyectos como participante
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Implementa la funcionalidad al presionar los botones (si es necesario)
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Implementa la funcionalidad al liberar los botones (si es necesario)
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(view.regresar)){
            changeBackground(view.jPanel1, new Color(149, 165, 166));
        } else if(evt.equals(view.BntGesProyecAdmin)){
            changeBackground(view.jPanel3, new Color(0,153,0));
        } else if(evt.equals(view.GestProyParticipante)){
            changeBackground(view.jPanel4, new Color(153,0,204));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(view.regresar)){
            changeBackground(view.jPanel1, new Color(255,255,255));
        } else if(evt.equals(view.BntGesProyecAdmin)){
            changeBackground(view.jPanel3, new Color(0,255,51));
        } else if(evt.equals(view.GestProyParticipante)){
            changeBackground(view.jPanel4, new Color(153,0,255));
        }
    }
    
    private void changeBackground(JPanel panel, Color color) {
        panel.setBackground(color);
    }
}
