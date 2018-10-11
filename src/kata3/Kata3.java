/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author pablo
 */
public class Kata3 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Histogram histogram = new Histogram();
        histogram.increment("ulpgc.org");
        histogram.increment("ulpgc.org");
        histogram.increment("ulpgc.org");
        histogram.increment("ulpgc.org");
        
        histogram.increment("google.es");
        histogram.increment("google.es");
        histogram.increment("hola.com");
        histogram.increment("hola.com");
        histogram.increment("hola.com");
        histogram.increment("mellamo.blog");
        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
        
        
    }
    
}
