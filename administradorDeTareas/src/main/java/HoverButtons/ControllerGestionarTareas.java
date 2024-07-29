package HoverButtons;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import vista.TareasPendientesPorRealizar;

/**
 * Controlador para la clase TareasPendientesPorRealizar
 * 
 * @autor HP
 */
public class ControllerGestionarTareas implements MouseListener {
    private final TareasPendientesPorRealizar view;

    // Constructor que inicializa la vista y los eventos
    public ControllerGestionarTareas(TareasPendientesPorRealizar view) {
        this.view = view;
        events();
    }

    public final void events() {
        view.BtnAgregarNuevaTarea.addMouseListener(this);
        view.BtnEliminarTarea.addMouseListener(this);
        view.BtnLimpiarListaTareas.addMouseListener(this);
        view.ModificarTarea.addMouseListener(this);
        view.ComboFiltrar.addMouseListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(view.BtnAgregarNuevaTarea)){
            changeBackground(view.jPanel5, new Color(149, 165, 166));
        } else if(evt.equals(view.BtnEliminarTarea)){
            changeBackground(view.jPanel6, new Color(149, 165, 166));
        } else if(evt.equals(view.BtnLimpiarListaTareas)){
            changeBackground(view.jPanel7, new Color(149, 165, 166));
        } else if(evt.equals(view.ModificarTarea)){
            changeBackground(view.jPanel4, new Color(149, 165, 166));
        } else if(evt.equals(view.ComboFiltrar)){
            changeBackground(view.jPanel3, new Color(149, 165, 166));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(view.BtnAgregarNuevaTarea)){
            changeBackground(view.jPanel5, Color.WHITE);
        } else if(evt.equals(view.BtnEliminarTarea)){
            changeBackground(view.jPanel6, Color.WHITE);
        } else if(evt.equals(view.BtnLimpiarListaTareas)){
            changeBackground(view.jPanel7, Color.WHITE);
        } else if(evt.equals(view.ModificarTarea)){
            changeBackground(view.jPanel4, Color.WHITE);
        } else if(evt.equals(view.ComboFiltrar)){
            changeBackground(view.jPanel3, Color.WHITE);
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
