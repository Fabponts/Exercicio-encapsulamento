package app;
import java.util.Scanner;
import entities.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();

        System.out.println("------Welcome to our system insert your name and Account number below------"  );

        System.out.print("Name: " );
        String name = sc.nextLine();
        contaBancaria.setName(name);

        System.out.print("Number Account: ");
        int numberAccount = sc.nextInt();
        contaBancaria.setNumberAccount(numberAccount);

        System.out.print("Insert your initial amount to start:");
        double initialAmount = sc.nextDouble();
        contaBancaria.setInitialAmount(initialAmount);

        System.out.print("Quantity of deposit: ");
        double depositAmount = sc.nextDouble();
        contaBancaria.deposit(depositAmount);

        System.out.print("How much to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        contaBancaria.withdraw(withdrawAmount);

        System.out.println("-----Data uploaded-----");
        System.out.println(contaBancaria);
        }
}