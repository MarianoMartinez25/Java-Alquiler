
package inmuebles;


public abstract class Edificio {
    protected float avaluoXmtr;
    
    public Edificio(float avaluoXmtr){
        this.avaluoXmtr = avaluoXmtr;
    }
    
    public void setAvaluo(float avaluo){
        this.avaluoXmtr = avaluo;
    }
    
    public float getAvaluo(){
        return this.avaluoXmtr;
    }
}
