package vista;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

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
        view.regresar.addMouseListener(this);
        view.BtnAgregarNuevaTarea.addMouseListener(this);
        view.BtnEliminarTarea.addMouseListener(this);
        view.BtnLimpiarListaTareas.addMouseListener(this);
        view.ModificarTarea.addMouseListener(this);
        view.ComboFiltrar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // Implementa la funcionalidad al hacer clic en los botones
        Object evt = e.getSource();
        
        if(evt.equals(view.regresar)){
            System.out.println("Regresar clicked");
            // Agrega la funcionalidad para el botón regresar
        }else if(evt.equals(view.BtnAgregarNuevaTarea)){
            System.out.println("Agregar Nueva Tarea clicked");
            // Agrega la funcionalidad para agregar una nueva tarea
        }else if(evt.equals(view.BtnEliminarTarea)){
            System.out.println("Eliminar Tarea clicked");
            // Agrega la funcionalidad para eliminar una tarea
        }else if(evt.equals(view.BtnLimpiarListaTareas)){
            System.out.println("Limpiar Lista de Tareas clicked");
            // Agrega la funcionalidad para limpiar la lista de tareas
        }else if(evt.equals(view.ModificarTarea)){
            System.out.println("Modificar Tarea clicked");
            // Agrega la funcionalidad para modificar una tarea
        }else if(evt.equals(view.ComboFiltrar)){
            System.out.println("Filtrar clicked");
            // Agrega la funcionalidad para filtrar
        }
    }

    @Override
    public void mousePressed(MouseEvent e) { }

    @Override
    public void mouseReleased(MouseEvent e) { }

    @Override
    public void mouseEntered(MouseEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(view.regresar)){
            changeBackground(view.jPanel1, new Color(149, 165, 166));
        } else if(evt.equals(view.BtnAgregarNuevaTarea)){
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
        
        if(evt.equals(view.regresar)){
            changeBackground(view.jPanel1, Color.WHITE);
        } else if(evt.equals(view.BtnAgregarNuevaTarea)){
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
}
