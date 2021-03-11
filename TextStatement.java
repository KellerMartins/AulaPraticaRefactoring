public class TextStatement extends Statement {
    public String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String figures(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" +
               String.valueOf(aRental.getCharge()) + "\n";
    }

    public String footer(Customer aCustomer) {
        String result = "Amount owed is " + 
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
        result += "You earned " + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
        return result;
    }
}