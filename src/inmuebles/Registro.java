
package inmuebles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Registro {
    public static float coefAvaluoEdificio;
    public String municipio;
    private float tasa;
    public Lote inmueble[];
    
    public Registro(int cantidadLotes){
        inmueble = new Lote[cantidadLotes];        
    }
    
    public static void setCoeficiente(float coeficiente){
        coefAvaluoEdificio = coeficiente;
    }
    
    public static float getCoeficiente(){
        return coefAvaluoEdificio;
    }
    public void setTasa(float t){
        this.tasa = t;
    }
    
    public float getTasa(){
        return this.tasa;
    }
    
    public void valuar(){
        for (Lote lote : inmueble) {
            if (lote != null) {
                System.out.println("Valor " + lote.idPadron + ": " + lote.Valuar());
            }
        }
    }
    
    //establece la relacion entre lote y registro
    public void registrar(Lote lote){
        for (int i = 0; i < inmueble.length; i++) {
            if (inmueble[i] == null) {
                inmueble[i] = lote;
                lote.inscripto = this;
                break;
            }
        }
    }
    
    public void emitirBoletos(){
        
        System.out.println("Los datos de los lotes son:");
        for (Lote lote : inmueble) {
            if (lote != null) {
                lote.Mostrar();
            }
        }
        for (int i = 0; i < inmueble.length; i++) {
            if (inmueble[i] != null) {
                inmueble[i].Mostrar();
            }
        }
    }    
    
    public void guardar(Escritura e){
         try{
            FileOutputStream file = new FileOutputStream("escritura.obj");
            ObjectOutputStream salida=new ObjectOutputStream(file);
            salida.writeObject(e);
            salida.close();
        }
        catch(Exception ex){
            System.out.println("Error al guardar la Escritura" +ex.getMessage());
        }
    }
    
    public void recuperar(){
        try {
            ObjectInputStream entrada= new ObjectInputStream(new FileInputStream("escritura.obj"));
            Escritura escritura=(Escritura)entrada.readObject();
            entrada.close();
            escritura.MostrarDatos();
        }
        catch(Exception ex){
            System.out.println("Error al leer Registro" +ex.getMessage());
        }
    }
}
