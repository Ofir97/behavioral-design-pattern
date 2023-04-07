package stocks;

public interface Mediator {

    void saleOffer(String stock, int shares, int collCode);

    void buyOffer(String stock, int shares, int collCode);

    void addColleague(Colleague colleague);
}
