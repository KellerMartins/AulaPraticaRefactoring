public class HtmlStatement extends Statement {
    public String header(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
               "</EM></H1><P>\n";
    }

    public String figures(Rental aRental) {
        return aRental.getMovie().getTitle()+ ": " +
               String.valueOf(aRental.getCharge()) + "<BR>\n";
    }

    public String footer(Customer aCustomer) {
        String result = "<P>You owe <EM>" +
        String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        result += "On this rental you earned <EM>" + 
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        "</EM> frequent renter points<P>";
        return result;
    }
}