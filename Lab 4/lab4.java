import java.util.*;
public class lab4 {
  public static Scanner scan = new Scanner(System.in);
  public static int balance;
  public static String name;
  public static String acc_no;

  public static void initCust() {
    System.out.println("Enter your name: ");
    name = scan.next();
    System.out.println("Enter your account balance: ");
    balance = scan.nextInt();

    System.out.println("Enter your account number: ");
    acc_no = scan.next();
  }

  public static void deposit(int amount) {
    balance = balance + amount;
    System.out.println("Amount deposited Successfully!");
  }

  public static void withdraw(int amount) {
    if (balance >= amount) {
      balance = balance - amount;
      System.out.println("Amount withdrawn Successfully!");
    } else {
      System.out.println("Oops! You do not have enough balance to make that transaction!");
    }
  }

  public static void summary() {
    System.out.println("============================");
    System.out.println("    BANK ACCOUNT SUMMARY    ");
    System.out.println("============================");    
    System.out.println("Account holder name: " + name);
    System.out.println("____________________________");
    System.out.println("Account number: " + acc_no);
    System.out.println("____________________________");
    System.out.println("Balance remaining: " + balance);
    System.out.println("============================");
  }

  public static void transaction(int[] a, int[] b, String[] c, int[] d, int[] e, int i) {
    System.out.println("|"+a[i] + " || " + b[i] + "||  " + c[i] + " || " + d[i] + " || " + e[i]+"|");
    System.out.println("_________________________________________");
}

  public static void main(String[] args) {
    int i = 0;
    int[] serial = new int[10];
    int[] initialbalance = new int[10];
    String[] typeoftrancation = new String[10];
    int[] callamount = new int[10];
    int[] postbalance = new int[10];
    int cont;
    initCust();

    do {

      System.out.println("Christ University National Bank");
      System.out.println("1. Deposit Money");
      System.out.println("2. Withdraw Money");
      System.out.println("3. Print transactions");
      System.out.println("4. Print account summary");
      int menu = scan.nextInt();
      switch (menu) {
      case 1:
        System.out.println("Enter the amount you want to deposit: ");
        int amount = scan.nextInt();
        initialbalance[i] = balance;
        deposit(amount);
        typeoftrancation[i] = "Deposits";
        callamount[i] = amount;
        postbalance[i] = balance;
        serial[i] = i + 1;
        i++;
        break;
      case 2:
        System.out.println("Enter the amount you want to withdraw:");
        int widamount = scan.nextInt();

        initialbalance[i] = balance;
        withdraw(widamount);
        typeoftrancation[i] = "Withdraw";
        callamount[i] = widamount;
        postbalance[i] = balance;
        serial[i] = i + 1;
        i++;
        break;
      case 3:
     ;
      System.out.println("          TRANSACTION SHEET              ");
     ;
      System.out.println("T.No|"+"Balance|"+"Trans.Type|"+"  Amt  |"+" FinalBal.|" );
      System.out.println("_________________________________________");
      for (int k = 0; k < i; k++) {
          transaction(serial, initialbalance, typeoftrancation, callamount, postbalance, k);
        }
        break;
      case 4:
        summary();
        break;
      }
      System.out.println("PRESS 0 to exit , Or other key");
      cont = scan.nextInt();

    } while (cont != 0);
  }
}