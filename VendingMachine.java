public class VendingMachine {
    private VendingMachineState state;
    private int inventory = 10;
    private int balance = 0;
    private final int itemPrice = 5;
    
    public VendingMachine() {
        this.state = new IdleState();
    }
    
    public void setState(VendingMachineState state) {
        this.state = state;
    }
    
    public VendingMachineState getState() {
        return state;
    }
    
    public void selectItem() {
        state.selectItem(this);
    }
    
    public void insertCoin(int amount) {
        state.insertCoin(this, amount);
    }
    
    public void dispenseItem() {
        state.dispenseItem(this);
    }
    
    public void setOutOfOrder() {
        state.setOutOfOrder(this);
    }
    
    public int getInventory() {
        return inventory;
    }
    
    public void decreaseInventory() {
        inventory--;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void addBalance(int amount) {
        balance += amount;
    }
    
    public void resetBalance() {
        balance = 0;
    }
    
    public int getItemPrice() {
        return itemPrice;
    }
}
