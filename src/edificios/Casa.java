/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edificios;

import inmuebles.Edificio;

/**
 *
 * @author rpalmieri
 */
public class Casa extends Edificio{
    private boolean plantaAlta;
    private int superficie;
    
    public Casa(float avaluoXmtr){
        super(avaluoXmtr);
    }
}
