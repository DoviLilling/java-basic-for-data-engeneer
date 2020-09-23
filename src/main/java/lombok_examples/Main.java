package lombok_examples;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Customer customer = Customer.builder().address("Asho").lastName("Kon").name("Moshe").build();

//        customer.withAge(12).withLastName(customer.getLastName().toUpperCase())

        System.out.println(customer.getAddress());
    }
}
