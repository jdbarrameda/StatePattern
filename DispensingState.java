public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Dispensing in progress. Please wait.");
    }
    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Dispensing in progress. Cannot insert coins.");
    }
    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            machine.decreaseInventory();
            machine.resetBalance();
            System.out.println("Item dispensed. Returning to idle state.");
            machine.setState(new IdleState());
        } else {
            System.out.println("Out of stock. Machine out of order.");
            machine.setState(new OutOfOrderState());
        }
    }
    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine is now out of order.");
        machine.setState(new OutOfOrderState());
    }
}