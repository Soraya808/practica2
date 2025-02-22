
package ejer1;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Linea extends JPanel{
public float p1;
public float p1y;
public float p2;
public float p2y;
public 
        Linea(float a, float b, float c,float d ){
            p1=a;
            p1y=b;
            p2=c;
            p2y=d;
        }
        Linea(float b,float a){
            p1=b;
            p1y=a;
        }
        float obtx(){
            return p1;
        }
        float obty(){
            return p2;
        }
          public String toString() {
        return "Punto(x=" + p1 + ", y=" +p1y + ", x1=" + p2 + ", y1=" + p2y+ ")";
    }
        public void paint(Graphics g) {
        super.paint(g);
        // Dibuja la línea con color negro
        g.setColor(Color.BLUE);
       g.drawLine(50, 50, 200, 150);
    }
        public void dibujaLinea(){
               Linea recta = new Linea(50, 50, 200, 150);
            JFrame ventana = new JFrame("Dibujar");
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800, 800);
        ventana.add(recta); // Agregar el panel Linea que contiene el gráfico
        ventana.setVisible(true);
        }
    public static void main(String[] args) {
       Linea p1=new Linea(50,50,200,150);
       System.out.println(p1);
       Linea dibuja=new Linea(50,50,200,150);
       dibuja.dibujaLinea();
}}


