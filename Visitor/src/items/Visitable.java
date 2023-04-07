package items;

public interface Visitable {
    // Allows the Visitor to pass the object so
    // the right operations occur on the right
    // type of object.

    double accept(Visitor visitor);
}
