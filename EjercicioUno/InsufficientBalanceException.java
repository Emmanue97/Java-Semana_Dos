public class InsufficientBalanceException extends Exception {
    private final double deficit;

    // TODO: constructor con mensaje y deficit
    public InsufficientBalanceException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() { return deficit; }
}