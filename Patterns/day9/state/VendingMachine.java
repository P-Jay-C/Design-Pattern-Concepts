package day9.state;

public class VendingMachine {
    private State state;

    public VendingMachine(){
        this.state = new NoCoinState();
    }

    public void setState(State state){
        this.state = state;
    }

    public void insertCoin(){
        state.insertCoin(this);
    }

    public void selectProduct(){
        state.selectProduct(this);
    }

    public void dispense(){
        state.dispense(this);
    }

}
