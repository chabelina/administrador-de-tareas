package HoverButtons;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import vista.AdministrarProyectos;

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
        view.BntGesProyecAdmin.addMouseListener(this);
        view.GestProyParticipante.addMouseListener(this);
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
        
        if(evt.equals(view.BntGesProyecAdmin)){
            changeBackground(view.jPanel4, new Color(0,153,0));
        } else if(evt.equals(view.GestProyParticipante)){
            changeBackground(view.jPanel3, new Color(153,0,204));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(view.BntGesProyecAdmin)){
            changeBackground(view.jPanel4, new Color(0,255,51));
        } else if(evt.equals(view.GestProyParticipante)){
            changeBackground(view.jPanel3, new Color(153,0,255));
        }
    }
    
    private void changeBackground(JPanel panel, Color color) {
        panel.setBackground(color);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
