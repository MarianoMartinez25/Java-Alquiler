
package inmuebles;

import edificios.ErrorLote;


public class Lote implements Cloneable {
    public final Integer idPadron;
    private String domicilio;
    private float avaluoxmt;
    public final int superficie;
    private Edificio construccion;
    public Registro inscripto;
    
    public Lote(Integer id, String dom, float avaluo, int superficie){
        this.idPadron = id;
        this.domicilio = dom;
        this.avaluoxmt = avaluo;
        this.superficie = superficie;
    }
    
    public Lote(Lote lote) throws CloneNotSupportedException{
        
        Lote lote2 = (Lote)lote.clone();
        this.idPadron = lote2.idPadron;
        this.domicilio = lote2.domicilio;
        this.avaluoxmt = lote2.avaluoxmt;
        this.superficie = lote2.superficie;
    }
    
    public String GetDomicilio(){
        return domicilio;
    }
    
    public void SetDomicilio(String domicilio){
        this.domicilio = domicilio;
    }
    
    public float GetAvaluoPorMetro(){
        return avaluoxmt;
    }
    
    public void SetAvaluoPorMetro(float avaluo){
        this.avaluoxmt = avaluo;
    }
    
    public void SetConstruccion(Edificio cons) throws ErrorLote{
        if (this.construccion != null) 
            throw new ErrorLote("Lote ya construido");
        else 
            this.construccion=cons;
    }
    
    public Edificio GetConstruccion(){
        return construccion;
    }
    
    private float CalcularAvaluo(){
        //float resultado = avaluoxmt * superficie;
        //return resultado;        
        return avaluoxmt * superficie;
    }
    
    public float Valuar(){
        return CalcularAvaluo();
    }
    
    public void Mostrar(){
        System.out.println("Los valores del Lote son: ");
        System.out.println("Padron: " + idPadron);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Avaluo: " + Valuar());
        System.out.println("Superficie: " + superficie);        
    }   
    
}
