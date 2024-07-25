package EstilosComponents;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


/**
 * Esta clase permite gestionar la tabla y los eventos realizados sobre ella
 * cada celda seria un objeto personalizable
 * @author CHENAO
 *
 */
public class GestionCeldas extends DefaultTableCellRenderer{
	
	private String tipo="text";

	//se definen por defecto los tipos de datos a usar
	private Font normal = new Font( "Verdana",Font.PLAIN ,12 );
	private Font bold = new Font( "Verdana",Font.BOLD ,12 );
	//etiqueta que almacenar� el icono a mostrar
	private JLabel label = new JLabel();
	//iconos disponibles para ser mostrados en la etiqueta dependiendo de la columna que lo contenga
	private ImageIcon iconoGuardar = new ImageIcon(getClass().getResource("/recursos/iconos/ico_guardar.png"));
	private ImageIcon iconoBuscar = new ImageIcon(getClass().getResource("/recursos/iconos/ico_buscar.png"));
	   
	
	
	public GestionCeldas(){
		
	}

	/**
	 * Constructor explicito con el tipo de dato que tendr� la celda
	 * @param tipo
	 */
	public GestionCeldas(String tipo){
		this.tipo=tipo;
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
		
		/*
		 * Este metodo controla toda la tabla, podemos obtener el valor que contiene
		 * definir que celda est� seleccionada, la fila y columna al tener el foco en ella.
		 * 
		 * cada evento sobre la tabla invocar� a este metodo
		 */
		
		//definimos colores por defecto
    //Color colorFondo = null;
    Color colorFondoPorDefecto=new Color( 19,30 , 35);
    //Color colorFondoSeleccion=new Color( 140, 140 , 140);
    this.setBackground(colorFondoPorDefecto ); 
		return this;
		
		
	}
	
	
	
}
