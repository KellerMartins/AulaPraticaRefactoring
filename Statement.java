import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = header(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += figures(each);
        }
        result += footer(aCustomer);
        return result;
    }

    public abstract String header(Customer aCustomer);
    public abstract String figures(Rental aRental);
    public abstract String footer(Customer aCustomer);
}