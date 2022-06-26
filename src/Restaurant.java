

public record Restaurant(String name,
                         int menuCapacity,
                         String address,
                         int clientCapacity,
                         int rating,
                         int salary) {
    private static final String COUNTRY = "Ukraine";

    @Override
    public String toString() {
        return "Restaurant(" +
                "name='" + name + '\'' +
                ", menuCapacity=" + menuCapacity +
                ", address='" + address + '\'' +
                ", rating=" + rating +
                ')';
    }

    public Restaurant() {
        this("Golubaya laguna", 10, "Center of Lviv");
    }

    public Restaurant(String name, int menuCapacity, String address) {
        this(name, menuCapacity, address, 15, 7, 10000);
    }

    public static String getCountry() {
        return COUNTRY;
    }
}
