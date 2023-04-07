package items;

// The visitor pattern is used when you have to perform
// the same action on many objects of different types
public interface Visitor {

    double visit(Liquor liquorItem);
    double visit(Tobacco tobaccoItem);
    double visit(Necessity necessityItem);

}
