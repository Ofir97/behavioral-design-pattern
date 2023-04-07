package atm;

public class NoCard implements ATMState {

    private ATMMachine atmMachine;

    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter your pin");
        atmMachine.setATMState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("You didn't insert a card");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("You have not inserted your card");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You have not inserted your card");
    }
}
