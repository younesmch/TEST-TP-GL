package org.emp.gl.core.launcher;

import org.emp.gl.core.lookup.Lookup;
import org.emp.gl.gui.afficheur;
import org.emp.gl.guiconfig.guiConfige;
import org.emp.gl.timer.service.TimerService;
import org.emp.gl.watch.Watch;

/**
 * Hello world!
 *
 */
public class App {

    // ce code nous permettra d'enregistrer les service que notre application utilsiera 
    // lors de l'execution
    static {
        Lookup.getInstance().register(TimerService.class, new Watch());
    }

    public static void main(String[] args) {

        TimerService ts = Lookup.getInstance().getService(TimerService.class);
        new guiConfige();
        new afficheur();
        
        
       
    }


    private static void testDuTimeService() {

        TimerService ts = Lookup.getInstance().getService(TimerService.class);
         
        ts.addTimeChangeListener(new AfficheurHeureSurConsole());
      /* for(int i=0;i<20;i++) 
       {
       ts.addTimeChangeListener(new CompteARebour(5 + (int)(Math.random() * 10)));
       }*/
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
