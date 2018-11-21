public class MenuItemRunner {
    public static void main(String[] args) {
        Sandwhich reuben = new Sandwhich("Reuben", 5.75);
        Sandwhich bec = new Sandwhich("BEC", 2.00);
        Salad waldorf = new Salad("Waldorf", 4.50);
        Salad caeser = new Salad("Ceaser", 1.50);
        Drink icedTea = new Drink("Iced Tea", 1.50);
        Drink smoothie = new Drink("Smoothie", 5.50);

        Trio trio1 = new Trio(reuben, waldorf, icedTea);
        Trio trio2 = new Trio(bec, caeser, smoothie);
        Trio trio3 = new Trio(bec, caeser, icedTea);

        System.out.println(trio1.getName() + " Price: " + trio1.getPrice());
        System.out.println(trio2.getName() + " Price: " + trio2.getPrice());
        System.out.println(trio3.getName() + " Price: " + trio3.getPrice());
    }
}
