import java.util.*;
import java.util.stream.*;

class Invoice {
    int id;

    Invoice(int id) {
        this.id = id;
    }

    void display() {
        System.out.println("Invoice ID: " + id);
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        List<Integer> ids = Arrays.asList(1, 2, 3);

        List<Invoice> invoices = ids.stream()
                                    .map(Invoice::new)
                                    .collect(Collectors.toList());

        invoices.forEach(i -> i.display());
    }
}
