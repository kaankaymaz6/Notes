package day49;

public class Customer implements Accountable{
    int id;
    String name;
    Contact owner;
    String address;
    String phoneNumber;

    private static int ID_GENERATOR;

    public Customer(int id, String name, Contact owner, String address, String phoneNumber) {
        this.id = ++ID_GENERATOR;
        this.name = name;
        this.owner = owner;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Contact getOwner() {
        return owner;
    }
    public void setOwner(Contact owner) {
        this.owner = owner;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
    @Override
    public void deposit(double amount) {
        deposit(balance+=amount);
    }
    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public void withdraw(double amount) {
        withdraw(balance-=amount);
    }
    private double balance;
}
