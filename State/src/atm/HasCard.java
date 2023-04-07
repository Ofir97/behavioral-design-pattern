package atm;

public class HasCard implements ATMState {

    private ATMMachine atmMachine;

    public HasCard(ATMMachine newATMMachine) {
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected.");
        atmMachine.setATMState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pinEntered) {
        if (pinEntered == 1234) {
            System.out.println("You entered the correct PIN");
            atmMachine.setCorrectPinEntered(true);
            atmMachine.setATMState(atmMachine.getHasCorrectPin());
        } else {
            System.out.println("You entered the wrong PIN");
            atmMachine.setCorrectPinEntered(false);
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("You have not entered your PIN");
    }
}
