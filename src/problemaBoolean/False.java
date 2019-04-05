
package problemaBoolean;

public class False extends Boolean{
    
    @Override
    public Boolean not() {
        return new True();
    }

    @Override
    public String toString() {
        return "False";
    }

    @Override
    public Boolean or(Boolean b) {
        return b;
    }

    @Override
    public Boolean xor(Boolean b) {
        return b;
    }

    @Override
    public Boolean and(Boolean b) {
        return this;
    }

    
    
}
