public class Trio implements MenuItem {
    private Sandwhich sandwhich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwhich sandwhich, Salad salad, Drink drink) {
        this.sandwhich = sandwhich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName() {
        return sandwhich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }

    public double getPrice() {
        double x = this.sandwhich.getPrice();
        double y = this.salad.getPrice();
        double z = this.drink.getPrice();
        double total = 0.0;
        if (x > y) {
            total = x;
            if (z > y) {
                total = total + z;
            } else if (y > z) {
                total = total + y;
            } else {
                total = total + z;
            }
        }
        if (y > x) {
            total = y;
            if (z > x) {
                total = total + z;
            } else if (x > z) {
                total = total + x;
            } else {
                total = total + z;
            }
        } else {
            total = x;
            if (z > x) {
                total = total + z;
            } else {
                total = total + y;
            }
        }
        return total;
    }
}
