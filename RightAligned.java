public class RightAligned {
    public static void main (String [] args) {
        String nameOfGoods = "Buku Tulis AAA 30lbr";
        int price = 21750;

        System.out.println("| " + nameOfGoods + " | " + price + " |");
        System.out.printf("| %30s | %10d |\n", nameOfGoods, price);
        System.out.printf("| %-30s | %10d |\n", nameOfGoods, price);
    }
}