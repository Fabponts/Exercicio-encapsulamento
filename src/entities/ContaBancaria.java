package entities;

public class ContaBancaria{
    // Atributos
    private int numberAccount;
    private String name;
    private double initialAmount;
    private double currentAmount;

    //Construtores
    public ContaBancaria(){
    }

    public ContaBancaria(int numberAccount, String name, double initialAmount){
        this.numberAccount = numberAccount;
        this.name=name;
        this.initialAmount = initialAmount;
    }

    //Getters and Setters
    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setInitialAmount(double initialAmount){
        this.initialAmount = initialAmount;
        this.currentAmount = initialAmount;
    }

    public double getInitialAmount(){
        return initialAmount;
    }

    public double getCurrentAmount(){
        return currentAmount;
    }

    // Metodos
    public void deposit(double amount){
       currentAmount += amount;

    }

    public void withdraw(double amount){
        double tax = 5.0;
        currentAmount -= (amount + tax);
    }

    public String toString(){
        return "name:" + getName() +"\n"
        + "Number Account:" + getNumberAccount() +"\n"
        + "Initial Amount:" + getInitialAmount() +"\n"
        + "Current amount:" + getCurrentAmount();
    }

}
