import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Category cat1 = new Category("Czekolada","Słodycze");
        Category cat2 = new Category("Kiełbasa", "Cos do piwa");


        Product product1 = new Product("Orzechowa", "Duże opakowanie 300 gram",15, cat1 );
        Product product2 = new Product("Mleczna", "Małe opakowanie 100 gram",15, cat1 );
        Product product3 = new Product("Krakowska","Kiełbasa podsuszana", 80, cat2);
        Product product4 = new Product("Wino","Owocowe deserowe dla smakoszy", 10, null );

        SpecialOffer offer1 = new SpecialOffer(cat1,7,2,product1 );

        System.out.println(product1.name + " " +product1.description + " " + product1.price + " "
                + product1.productCategory.productGroupDescription + " " + product1.productCategory.productGroup );

        System.out.println(offer1.Specialproduct.productCategory.productGroup +" "+offer1.Specialproduct.name
                +" "+ " w ofercie specjalnej przez " +offer1.specialOfferInDays+ " dni" );
        System.out.print("Obniżka o ");
        System.out.printf("%d0",offer1.discount);
        System.out.println(" Procent");




    }
}
