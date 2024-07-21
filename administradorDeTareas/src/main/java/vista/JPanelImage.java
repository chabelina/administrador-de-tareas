/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class JPanelImage extends JLabel{
  private int x,y;
  private final String direccion;
  
  public JPanelImage (JPanel panel, String direccion){
    this.direccion = direccion;
    this.x = panel.getWidth();
    this.y = panel.getHeight();
    this.setSize(x,y);
  }
  
  /* @override*/
  public void paint (Graphics g){
    ImageIcon img = new ImageIcon(getClass().getResource(this.direccion));
  }
  
}
