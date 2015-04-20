
import static java.lang.Math.pow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gustavopguto
 */
public class Pratica32 {    
        public static double densidade(double x, double media, double desvio) {
            
        double d = ( pow(Math.E, -0.5*pow( (x-media)/desvio, 2) ) )/( Math.sqrt(2*Math.PI) * desvio);
        return d;
    }
}
