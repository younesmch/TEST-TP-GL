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
public class initState implements Reglable {
    Watch state;
    
    public initState(Watch newState) {
            state=newState;
    }

    @Override
    public void onMode() {
        System.out.println("you are in init state");
    }

    @Override
    public void doconfig() {
        System.out.println("state changed to seconds");
       state.setState(state.getSecondsState());
    }

    @Override
    public void increment() {
       
      System.out.println("can't increment you are in init state");
    }

    
}
