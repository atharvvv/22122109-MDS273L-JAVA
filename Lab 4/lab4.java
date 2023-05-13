


import java.util.*;

public class lab4 {
    public static Scanner scan = new Scanner(System.in);
    public static int balance;
    public static String holder_name;
    public static String account_number;

    public static void customer() {
        System.out.println("Enter your name: ");
        holder_name = scan.next();
        System.out.println("Enter your account balance: ");
        balance = scan.nextInt();

        System.out.println("Enter your account number: ");
        account_number = scan.next();
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
        System.out.println("***************************************************");
        System.out.println("    BANK ACCOUNT SUMMARY    ");
        System.out.println("***************************************************");
        System.out.println("Account holder name: " + holder_name);
        System.out.println("*************************************");
        System.out.println("Account number: " + account_number);
        System.out.println("*************************************");
        System.out.println("Balance remaining: " + balance);
        System.out.println("***************************************************");
    }

    public static void transaction(int[] a, int[] b, String[] c, int[] d, int[] e, int i) {
        System.out.println("|" + a[i] + " || " + b[i] + "||  " + c[i] + " || " + d[i] + " || " + e[i] + "|");
        System.out.println("***********************************************************");
    }

    public static void main(String[] args) {
        int i = 0;
        int[] serial = new int[10];
        int[] earlybalance = new int[10];
        String[] typeoftranscation = new String[10];
        int[] callamount = new int[10];
        int[] afterbalance = new int[10];
        int cont;
        customer();

        do {
            System.out.println("Atharva National Bank");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Print transactions");
            System.out.println("4. Print account summary");
            int menu = scan.nextInt();

            if (menu == 1) {
                System.out.println("Enter the amount you want to deposit: ");
                int amount = scan.nextInt();
                earlybalance[i] = balance;
                deposit(amount);
                typeoftranscation[i] = "Deposits";
                callamount[i] = amount;
                afterbalance[i] = balance;
                serial[i] = i + 1;
                i++;
            } else if (menu == 2) {
                System.out.println("Enter the amount you want to withdraw:");
                int widamount = scan.nextInt();

                earlybalance[i] = balance;
                withdraw(widamount);
                typeoftranscation[i] = "Withdraw";
                callamount[i] = widamount;
                afterbalance[i] = balance;
                serial[i] = i + 1;
                i++;
            } else if (menu == 3) {
                System.out.println("********************************************************************");
                System.out.println("          TRANSACTION SHEET              ");
                System.out.println("********************************************************************");
                System.out.println("T.No|" + "Balance|" + "Trans.Type|" + "Amt  |" + " FinalBal.|");
                System.out.println("*********************************************************************");
                for (int k = 0; k < i; k++) {
                    transaction(serial, earlybalance, typeoftranscation, callamount, afterbalance, k);
                }
            } else if (menu == 4) {
                summary();
            }

            System.out.println("PRESS 0 TO END, ANY OTHER KEY TO CONTINUE");
            cont = scan.nextInt();

        } while (cont != 0);
    }
}
                  