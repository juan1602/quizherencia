package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //---------------
    // Atributos
    // --------------
    private JLabel lx;
    private JLabel ly;
    private JLabel lz;
    private JLabel lw;
    private JTextField tfx;
    private JTextField tfy;
    private JTextField tfz;
    private JTextField tfw;
    

    //---------------
    // Metodos
    // --------------

    /*Metodo constructor */
    public PanelEntradaDatos()
    {
        /*crear y agregar imagen
        iImagen = new ImageIcon(getClass().getResource("empleado.png"));
        lImagen = new JLabel(iImagen);
        lImagen.setBounds(30,27,238,212);
        this.add(lImagen);*/

        // crear y agregar etiqueta x
        lx = new JLabel("NOmbre del autor=");
        lx.setBounds(390, 50, 120, 20);
        this.add(lx);

         // crear y agregar etiqueta x
         lw = new JLabel("Titulo del libro=");
         lw.setBounds(390, 200, 120, 20);
         this.add(lw);

        //crear caja de texto x
        tfw = new JTextField();
        tfw.setBounds(500,200,80,20);
        this.add(tfw);

        // Definicion contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //crear caja de texto x
        tfx = new JTextField();
        tfx.setBounds(500,50,80,20);
        this.add(tfx);

        // crear y agregar etiqueta y
        ly = new JLabel("Año de nacimiento =");
        ly.setBounds(390, 100, 120, 20);
        this.add(ly);

        //crear caja de texto y
        tfy = new JTextField();
        tfy.setBounds(500,100,80,20);
        this.add(tfy);

        // crear y agregar etiqueta y
        lz = new JLabel("Años en empresa =");
        lz.setBounds(390, 150, 120, 20);
        this.add(lz);

        //crear caja de texto y
        tfz = new JTextField();
        tfz.setBounds(500,150,80,20);
        this.add(tfz);

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // metodos de acceso a la informacion 
    public String getTfx()
    {
        return tfx.getText();
    }

    public String getTfy()
    {
        return tfy.getText();
    }
    public String getTfz()
    {
        return tfz.getText();
    }
    public String getTfw()
    {
        return tfw.getText();
    }
    // metodo borrar cajas de texto
    public void borrar()
    {
        tfx.setText("");
        tfy.setText("");
        tfz.setText("");
        tfw.setText("");
    }
}
