/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author youndzofrancine
 */
public class Flute implements IInstrument{
        private int soundVolume = 6;
        @Override
    public String play(){
    return "";
    }
    
    public String getColor(){
    return "";
    }
    
        @Override
     public int getSoundVolume(){
         return soundVolume;
     }
    
}
