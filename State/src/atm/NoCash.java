package atm;

public class NoCash implements ATMState{

    private ATMMachine atmMachine;

    public NoCash(ATMMachine newATMMachine){
        atmMachine = newATMMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("ATM Machine is out of money");
        System.out.println("Your card is ejected");
    }

    @Override
    public void ejectCard() {
        System.out.println("ATM Machine is out of money");
        System.out.println("There is no card to eject");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("ATM Machine is out of money");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("ATM Machine is out of money");
    }
}
