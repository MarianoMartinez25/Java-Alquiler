
package inmuebles;

import edificios.*;


public class Inmuebles  {

    public static void main(String[] args){
        
        Escritura e1 = new Escritura(123, 500, "Rodriguez 225");
        Escritura e2 = new Escritura(e1);
        
        Lote lote1 = new Lote(123, e1.GetDomicilio(), 522, e1.superficie);
        Lote lote2 = new Lote(556, e1.GetDomicilio(), 6489, e1.superficie);
       
        Registro registroMendoza = new Registro(50);
        registroMendoza.registrar(lote1);
        registroMendoza.registrar(lote2);
        
        registroMendoza.guardar(e1);
        registroMendoza.recuperar();
        
        registroMendoza.emitirBoletos();
        
        Casa casa1 = new Casa(250);
        Departamento depto1=new Departamento((byte) 2,'B',110);
        PH ph1 = new PH(250, depto1);
        
        try {
            lote1.SetConstruccion(casa1);
            lote1.SetConstruccion(ph1); //Esta linea lanza la excepcion
        }
        catch (ErrorLote e) {
            System.out.println("Imposible asignar construcción: "+e.getMessage()); 
        }
    }
}
