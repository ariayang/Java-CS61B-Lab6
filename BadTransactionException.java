/* BadTransactionException.java */

/**
 *  Implements an exception that should be thrown for negative/invalide amounts.
 **/
public class BadTransactionException extends Exception {

  public int amount;  // The invalid amount.

  /**
   *  Creates an exception object for invalid amount "badAmt".
   **/
  public BadTransactionException(int badAmt) {
    super("Invalid amount: " + badAmt);

    amount = badAmt;
  }
}
