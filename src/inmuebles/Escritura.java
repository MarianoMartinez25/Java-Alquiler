
package inmuebles;

import java.io.Serializable;


public class Escritura implements Serializable {
    public final Integer numero;
    public int superficie;
    private String domicilio;
    
    public Escritura(Integer numero, int sup, String dom){
        this.numero = numero;
        superficie = sup;
        this.domicilio = dom;
    }
    
    public Escritura(int n){
        numero = n;
    }
    
    public Escritura(Escritura e){//Constructor de copia
        this.numero = e.numero;
        this.superficie = e.superficie;
        this.domicilio = e.domicilio;
    }
    
    public String GetDomicilio(){
        return this.domicilio;
    }
    
    public void SetDomicilio(String dom){
        this.domicilio = dom;
    }
    
    public void MostrarDatos(){
        System.out.println("Los datos de la escritura son: ");
        System.out.println("Domicilio: "+ this.domicilio);
        System.out.println("Numero: "+ this.numero + " Sup: "+ superficie + "mts");
    }
}
