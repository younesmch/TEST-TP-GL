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
public class hourState implements Reglable {

    
    Watch context;
    public hourState(Watch newState) {
            context=newState;
    }

    @Override
    public void onMode() {
        context.setState(context.getSecondsState());
        System.out.println("now you changed from hour to seconds state ");
    }

    @Override
    public void doconfig() {
          System.out.println("you transfered frome hours state to init state ");
       context.setState(context.getInitState());
    }

    @Override
    public void increment() {
        System.out.println("now hours incremented");
       context.IncrementHours();
    }
    
}
