

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Golubaya laguna", 10, "here");
        Restaurant rest = new Restaurant("John Doe", 10, "100 Linda Ln.");
        Restaurant rest1 = new Restaurant();

        System.out.println(rest1);
        System.out.println(restaurant);
        System.out.println(rest.name());
        System.out.println(rest.menuCapacity());
        System.out.println(rest.address());
        System.out.println(rest);

    }
}

