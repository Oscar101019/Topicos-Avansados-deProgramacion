import javax.swing.JButton; //importaciones
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JFrame;


    public class Grid{

    JFrame frame;
    JPanel ventana;
    JButton bt0 ,bt1, bt2, bt3, bt4, bt5;

     public Grid(){
      Panel();
      construyeVentana();

     }

     void Panel(){
      ventana=new JPanel();
      ventana.setLayout(new GridLayout(3,2,10,10));
        bt0=new JButton("0");
      bt1=new JButton("1");
      bt2=new JButton("2");
      bt3=new JButton("3");
      bt4=new JButton("4");
      bt5=new JButton("5");
      
     ventana.add(bt0);
     ventana.add(bt1);
     ventana.add(bt2);
     ventana.add(bt3);
     ventana.add(bt4);
     ventana.add(bt5);

 }
	void construyeVentana() { 
		frame = new JFrama("Numero");
		frame.add(ventana);
		frame.pack();
		frame.setVisible(true);


}
	public static void main (String ar[]) { 
		new Grid();
 }
    }  
					
