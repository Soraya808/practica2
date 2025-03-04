
package pila;
public class Cola {
    private long arreglo[];
    private int inicio;
    private int fin;
    private int n;
    public Cola(int n){
        this.arreglo=new long[n+1];
        this.inicio=0;
        this.fin=-1;
        this.n=n;
    }
    public  void insert( long e){
        if (fin==n){
            System.out.println("la cola esta llena");
        }
        else{
             fin = (fin + 1) % n; // Manejo circular
        arreglo[fin] = e;
        }
        System.out.println("cola:"+e);
        }
    public float remove(){
      if(this.inicio==0 && this.fin==0){
          System.out.print("la cola esta vacia");
          return-1;
          
      }
           long e = this.arreglo[this.inicio]; // Guardar el primer elemento
               inicio = (inicio + 1) % this.n; // Avanzar en la cola circular
         n--; // Reducir el número de elemento
                return e;
     }
    public boolean isEmpty(){
        if (this.fin+1==inicio){
            return true;
        }
        else{
            return false;}
    }
    public boolean isFull(){
        if(this.fin+2==this.n){
            return true;
        }
        else{
            return false;
        }}
      public int size() {
        return fin+1;
    }
    
     public static void main(String[] args) {
        Cola cola=new Cola(4);
        cola.insert(10);
        cola.insert(20);
        cola.insert(30);
        System.out.println("eliminado"+cola.remove());System.out.println("eliminado"+cola.remove());
                 System.out.println("la cola esta llena"+cola.isFull());
                 System.out.println("¿esta vacia?"+cola.isEmpty());
                 System.out.println("tamaño de la cola: "+cola.size());
        }
    }


