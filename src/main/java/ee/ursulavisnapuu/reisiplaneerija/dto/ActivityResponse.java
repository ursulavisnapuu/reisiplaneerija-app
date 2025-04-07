package ee.ursulavisnapuu.reisiplaneerija.dto;

public class ActivityResponse {
    private String title;
    private String shortDescription;
    private double price;
    private String currency;
    private String bookingLink;

    // Konstruktor
    public ActivityResponse(String title, String shortDescription, double price, String currency, String bookingLink) {
        this.title = title;
        this.shortDescription = shortDescription;
        this.price = price;
        this.currency = currency;
        this.bookingLink = bookingLink;
    }

    // Getterid ja setterid (vajadusel)
    public String getTitle() { return title; }
    public String getShortDescription() { return shortDescription; }
    public double getPrice() { return price; }
    public String getCurrency() { return currency; }
    public String getBookingLink() { return bookingLink; }
}
