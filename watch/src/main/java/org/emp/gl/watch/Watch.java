/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.emp.gl.watch;


import org.emp.gl.reglable.Reglable;
import org.emp.gl.time.service.impl.TimeServiceImplWithDelegation;

/**
 *
 * @author pc
 */
public class Watch  extends TimeServiceImplWithDelegation implements Reglable{
    Reglable initState;
    Reglable minuteState;
    Reglable secondsState;
    Reglable hourState;
    Reglable State;
  


    public Watch(){
          initState=new initState(this);
          minuteState=new minuteState(this);
          secondsState=new secondsState(this);
          hourState=new hourState(this);
          State=initState;
          
    
    }
    
    public void setState(Reglable newState)
    {
        State=newState;
    }
  
    

    @Override
    public void onMode() {
      State.onMode();
         
    }

    @Override
    public void doconfig() {
        State.doconfig();
    }

    @Override
    public void increment() {
       State.increment();
    }
    public Reglable getInitState(){return initState;}
    public Reglable getSecondsState(){return secondsState;}
    public Reglable getMinuteState(){return minuteState;}
    public Reglable getHourState(){return hourState;}

    public void IncrementMinutes() {
       // System.out.println(minutes);
        //minutes++;
        setMinutes(1);
        //System.out.println(minutes);
    }
       public void IncrementSecondes() {
        //System.out.println(minutes);
        
        setSecondes(1);
       // System.out.println(minutes);
    }
       public void IncrementHours() {
       // System.out.println(heures);
       // heures=(heures+1)%24;
     //   System.out.println(heures);
   setHeures(1);
    }
    
}
