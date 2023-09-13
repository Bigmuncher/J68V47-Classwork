import java.util.*;




public class L2E3 {

    public static void main(String[] args) {

        Scanner imput = new Scanner (System.in);

        System.out.println("Name Of Item 1");
        String name1 = imput.nextLine();

        System.out.println("Name Of Item2");
        String name2 = imput.nextLine();

        System.out.println("Name Of Item3");
        String name3 = imput.nextLine();

        System.out.println("Price Of Item 1");
        float price1 = imput.nextFloat();

        System.out.println("Price Of Item 2");
        float price2 = imput.nextFloat();

        System.out.println("Price Of Item 3");
        float price3 = imput.nextFloat();

        float subtotal = price1 + price2 + price3;




        System.out.println("NESMART");

        System.out.println("Item 1" + name1 + "£ " + price1);
        System.out.println("Item 2" + name2 + "£ " + price2);
        System.out.println("Item 3" + name3 + "£ " + price3);

        System.out.println("Subtotal: £" + subtotal);









    }










}
