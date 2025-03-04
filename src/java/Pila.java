
package pila;
public class Pila {
    private long arreglo[];
    private int top;
    private int n;
    public Pila (int n){
        this .top=0;
        this.n=n;
        arreglo=new long[n+1];
    }
    public void push(long e){
        this.top=this.top+1;
        arreglo[this.top]=e;
        System.out.println( +e);
    }
    public long pop(){
        long e=arreglo[this.top];
        this.top=this.top-1;
        return e;
    }
    public long peek (){
        return arreglo[this.top];
    }
    public boolean isEmpty(){
        if (this.top==0){
            return true;
        }
        else{
            return false;}
    }
    public boolean isFull(){
        if(this.top==this.n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Pila pila=new Pila(4);
        pila.push(5);
        pila.push(3);
        pila.push(220);
        System.out.println("el ultimo elemento de la pila es:"+pila.peek());
        System.out.println("eleminado:"+pila.pop());
        System.out.println("la pila esta lleno:"+pila.isFull());
        System.out.println("¿esta vacia?:"+pila.isFull());
    }
    }
    

