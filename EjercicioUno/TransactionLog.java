public class TransactionLog implements AutoCloseable {
  private boolean open = true;

  public void log(String message) {
    if (!open)
      throw new IllegalStateException("Log cerrado");
    System.out.println("[LOG] " + message);
  }

  @Override
  public void close() {
    // TODO: marcar como cerrado e imprimir mensaje
    open = true;
    System.out.println("[LOG] TransactionLog cerrado.");
  }
}