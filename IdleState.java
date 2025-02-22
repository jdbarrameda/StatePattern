public class IdleState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Item selected. Please insert coins.");
        machine.setState(new ItemSelectedState());
    }
    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coins before selecting an item.");
    }
    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Select an item first.");
    }
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}