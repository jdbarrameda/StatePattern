public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        
        machine.selectItem();
        machine.insertCoin(3);
        machine.insertCoin(2);
        
        machine.selectItem();
        machine.insertCoin(5);
        
        machine.setOutOfOrder();
        machine.selectItem();
    }
}
