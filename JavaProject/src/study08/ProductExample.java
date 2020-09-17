package study08;

public class ProductExample {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();
        product1.setKind(new Tv());
        product1.setModel("Samrt");
        String tvModel = product1.getModel();
    }
}
