package com.umesh.jan42024;

public class DefaultInterfaceTest {

  public static void main(String[] args) {

    Payment p = new VisaPmt();
    p.logPayment();
    p.doTransaction();
    Payment.logTrxDetails();

    Payment g = new GooglePmt();
    g.logPayment();
    g.doTransaction();
    Payment.logTrxDetails();

  }

}


interface Payment {

  default void logPayment(){
    System.out.println(" Log payment");
  }

  void doTransaction();

  static void logTrxDetails(){
    System.out.println(" log trx details at the end...");
  }
}

class VisaPmt implements Payment{

  @Override
  public void doTransaction() {
    System.out.println(" visa pmt");
  }
}


class GooglePmt implements Payment{

  @Override
  public void logPayment() {
    System.out.println(" Google loggin.....");
  }

  @Override
  public void doTransaction() {
    System.out.println(" Google pmt");
  }




}
