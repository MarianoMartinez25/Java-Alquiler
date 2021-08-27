/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

import inmuebles.Edificio;
import java.util.ArrayList;

/**
 *
 * @author rpalmieri
 */
public class PH extends Edificio{
    public byte cantPisos;
    public ArrayList<Departamento> unidad;
    
    public PH(float avaluoXmtr, Departamento depto){
        super(avaluoXmtr);
        unidad = new ArrayList();
        unidad.add(depto);
    }
}
