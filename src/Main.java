import java.util.List;

public class Main {
    public static void main (String[] args) {
        Customer phil = new Customer(0, "Alex");
        CustomerDatabase db = new CustomerDatabase();
        List<Customer> customers = db.getCustomer();
        try {
            db.addCustomer(phil);
        }
        catch (IllegalAccessException e) {
            System.out.println("Caught exception");
        }

        for (Customer c : db.getCustomer()) {
            System.out.println(c);
        }

        CustomerDatabase.helloWorld();
    }

}
