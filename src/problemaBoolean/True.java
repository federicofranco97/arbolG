package problemaBoolean;

public class True extends Boolean{
    
    
    @Override
    public String toString() {
        return "True";
    }

    @Override
    public Boolean not() {
        return new False();
    }

    @Override
    public Boolean or(Boolean b) {
        return this;
    }

    @Override
    public Boolean xor(Boolean b) {
        return b.not();
    }

    @Override
    public Boolean and(Boolean b) {
        return b;
    }

    
    
    
    
}
