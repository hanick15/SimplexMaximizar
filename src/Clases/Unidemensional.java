
package Clases;

public class Unidemensional extends Matriz {
    
    public Unidemensional(){
        
    }
    public Unidemensional(int nfila, float Arr[]){
        this.nfila = nfila;
        Arr = new float[nfila];
        
    }
    
    public int getnfil() {
        return nfila;
    }

    public void setnfil(int nfila) {
        this.nfila = nfila;
    }

    public float[] getArr() {
        return Arr;
    }

    public void setArr(float[] Arr) {
        this.Arr = Arr;
    }
   

}
