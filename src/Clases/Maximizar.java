/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author hferr
 */
public class Maximizar extends Bidimensional{
    int Mres[][] = new int[10][10];
    int varx=0;
    
    public String interaccion(){
        
        //Iteracciones
        int correr; // Corre el bucle
        int val=1;  // Validador
        
         // restriccion
        
        //Texto que se enviara como resultado
        String textoPrueba ="";
                
                
        //Bucle de iteracciones
        for (correr=0;correr!=1000000;correr++) {
            
            
            float Menor=999999999;
            int Columpivot=0;
            int Filapivot=1, x1=nfila-1;
            float div=1;
            float ElementoMulti=0;
            int i, j;
            
            //Definir columna pivot

            for (i=0;  i<nfila ; i++) {
                if (Ma[i][0]<Menor) {
                    Menor=Ma[i][0];
                    Columpivot=i;
                }
                else if(Ma[i][0]>0){
                    val=0; // Valida si hay valores negativos en la Fo
                }
            }
        
            //Definir fila pivot
        
            Menor=999999999;
            for(j=1;j<ncol;j++){

                if(Ma[Columpivot][j]>0){
                    div=Ma[x1][j]/Ma[Columpivot][j];
                    if(div>0 && div<Menor){
                        Menor =div;
                        Filapivot=j;
                    }
                }
            }
            

            //Filapivot y Columpivot
            Mres[0][varx]=Columpivot;
            Mres[1][varx]=Filapivot;
            varx++;
            
            float elempivot=Ma[Columpivot][Filapivot];
            
            textoPrueba=textoPrueba+"\n\nIteracción Nro."+varx+"\nElemento Pivot: "+elempivot+"\n";
            textoPrueba=textoPrueba+"Fila, Columna: "+Filapivot+", "+Columpivot+"\n";

        
        
            //Volver el elemento pivote 1
            //Dividimos entre el elemento pivote a la fila pivote 
        
            j=Filapivot;
            for(i=0;i<nfila;i++){
                Ma[i][j]=Ma[i][j]/elempivot;
            }
        
            //En Construccion para poner toda la columna pivot = 0
        
            for(j=0;j<ncol;j++){
                if(j!=Filapivot){
                    ElementoMulti=-1*Ma[Columpivot][j];
                    for(i=0;i<nfila;i++){
                        Ma[i][j]= ElementoMulti*Ma[i][Filapivot] + Ma[i][j];
                    }   
                    
                }
            }

           //Mostramos las interacciones de Matrices
           
            //Armando cabecera
            int ny=nfila-1;
            int nx=-ncol+nfila;
            int temp=0;
            textoPrueba+= " Z "+ " \t";
            for (i=1;i<nfila; i++) {
                if(i<nx)
                    textoPrueba+= " X"+i+ " \t";
                else if(i>=nx && i<nfila-1){
                    temp= i-nx+1;
                    textoPrueba+= " S"+temp+ " \t";
                }
                else if(i<nfila)
                    textoPrueba+= " Sol"+" \n";

                }
            //Resultados de iteracción
            for(j=0;j<ncol;j++){
                //textoPrueba=textoPrueba+"Fila "+j+"\n";
                for (i=0;i<nfila; i++) {
                    textoPrueba=textoPrueba+" "+ Ma[i][j] + " \t";
                }
                textoPrueba=textoPrueba+"\n";
            
            }
        
            if(val==0){
                break; // Salir del bucle
            }
        
        }
        return textoPrueba;
        }
    public String MostraRespuesta(){
        
         float ASol[] = new float[10];// Matriz temporal almacena y ordena resultados
         //Mostrar resultados
         int cc;
         int a,b,finx= nfila-1;
         String FinalResp="Resultados \n";
         FinalResp= FinalResp+"Z = "+Ma[finx][0]+" \n";
         for(cc=0;cc<varx;cc++){
             a=Mres[0][cc]; // informacion del X 
             b=Mres[1][cc]; // informacion de la indice de la solucion
             ASol[a]=Ma[finx][b];
         
         }
         
         for(a=1;a<=ncol-1;a++){
             FinalResp= FinalResp+"X"+a+" = "+ASol[a]+ "\n"; 
         }
        
        
        return FinalResp;
    }        
   
    
}
