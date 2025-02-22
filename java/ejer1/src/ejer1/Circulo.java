package ejer1;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Circulo extends JPanel{
public float x;
public float y;
public float radio;
public 
        Circulo(float a, float b, float c){
            x=a;
            y=b;
            radio=c;
           
        
        }
        Circulo(float b,float a ){
            x=b;
            y=a;
        }
        float obtx(){
            return x;
        }
        float obty(){
            return y;
        }
        float obtradio(){
            return radio;
        }
          public String toString() {
            return "Punto(x=" + x + ", y=" +y + ", x1=" + radio +  ")";
          }
        
@Override
        public void paint(Graphics g) {
        super.paint(g);
        // Dibuja la línea con color nuevo
        g.setColor(new Color(30, 237, 97));
       g.drawOval(300,200, 100*2,100 *2);
    }
    public static void main(String[] args) {
       Circulo p1=new Circulo(50,50);
       System.out.println(p1);
      Circulo circulo = new Circulo(300, 200, 100);

        JFrame ventana = new JFrame("Dibujar");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 800);
        ventana.add(circulo); // Agregar el panel Linea que contiene el gráfico
        ventana.setVisible(true);
}}


