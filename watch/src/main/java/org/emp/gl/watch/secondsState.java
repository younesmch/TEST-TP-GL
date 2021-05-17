/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.watch;

import org.emp.gl.reglable.Reglable;

/**
 *
 * @author pc
 */
public class secondsState implements Reglable {

  Watch context;;
    public secondsState(Watch newState) {
           context=newState;
    }

    

    @Override
    public void onMode() {
       System.out.println("you transfered frome seconds state to minutes state ");
        context.setState( context.getMinuteState());
    }

    @Override
    public void doconfig() {
       System.out.println("you transfered frome seconds state to init state ");
        context.setState( context.getInitState());
    }

    @Override
    public void increment() {
         context.IncrementSecondes(); 
      System.out.println("now seconds incremented");
    }
    
}
