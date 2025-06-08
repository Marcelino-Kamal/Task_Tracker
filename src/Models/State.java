package Models;

public enum State {

    DONE(0),INPROGRESS(1),UNTOUCHED(2);

    private final int stateNumber;

    State(int stateNumber){
        this.stateNumber= stateNumber;
    }
    public int getState(){
        return this.stateNumber;
    }
}
