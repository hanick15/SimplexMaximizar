
package Clases;


public class Bidimensional extends Matriz{
    
        
    public Bidimensional(int nfila, int ncol, float Ma[][]){
        this.ncol = ncol;
        this.nfila = nfila;
        Ma = new float[nfila][ncol];
    }
    
    public Bidimensional(){
        
    }

    public int getNfila() {
        return nfila;
    }

    public void setNfila(int nfila) {
        this.nfila = nfila;
    }

    public int getNcol() {
        return ncol;
    }

    public void setNcol(int ncol) {
        this.ncol = ncol;
    }

    public float[][] getMa() {
        return Ma;
    }

    public void setMa(float[][] Ma) {
        this.Ma = Ma;
    }
    
    
}
