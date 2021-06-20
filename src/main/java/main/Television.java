
package main;


public class Television {
    
    private int volume = 0;  
    private int currentProgram = 1;
    private boolean turnON;
  
    public int getVolume (){
        return this.volume;  
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    
    public int getCurrentProgram (){
        return this.currentProgram;
    }
    
    public void setCurrentProgram (int currentProgram) {
        this.currentProgram = currentProgram;
    }
    
    
    
    public boolean getTurnOn (){
        return this.turnON;
    }

    public void setTurnON(boolean turnON) {
        this.turnON = turnON;
    }
    

  







}






