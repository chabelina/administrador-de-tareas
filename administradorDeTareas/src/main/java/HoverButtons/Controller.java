/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoverButtons;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import vista.TareasEliminadas;
/**
 *
 * @author HP
 */
public class Controller implements MouseListener {
    private final TareasEliminadas view;

    public final void events(){
      view.regresar.addMouseListener(this);
      view.recuperar.addMouseListener(this);
    }
    public Controller( TareasEliminadas view){
      this.view=view;
      events();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
        Object evt = e.getSource();
        
        if(evt.equals(view.regresar)){
         changebackground(view.jPanel1,new Color(149, 165, 166 ));
        
        }else if(evt.equals(view.recuperar)){
        changebackground(view.jPanel3,new Color(149, 165, 166  ));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        Object evt = e.getSource();
        
        if(evt.equals(view.regresar)){
          changebackground(view.jPanel1,new Color(251, 252, 252));
        }else if(evt.equals(view.recuperar)){  
          changebackground(view.jPanel3,new Color(251, 252, 252 ));    
        } 
    }
    
    private void changebackground(JPanel panel,Color color){
        panel.setBackground(color);
    }
}
