
import java.text.DecimalFormat;

class Candle {
    String name;
    int quantity;
    double burnTime;
    double dollarPerBurnTime;
    double price;

    Candle(String name, int quantity, double burnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.price = price;
        this.dollarPerBurnTime = price / burnTime;
    }

    double getSubtotal() {
        return price * quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Candle candle1 = new Candle("Apple Orchard", 4, 10, 7.50);
        Candle candle2 = new Candle("Vanilla Bean", 8, 12, 18.75);
        Candle candle3 = new Candle("Campfire Nights", 3, 9, 11.98);
        Candle candle4 = new Candle("Freshcut Grass", 2, 6, 14.99);
        Candle candle5 = new Candle("Cinnamon Roll", 5, 13, 9.99);


        int totalBurnTime = (int) (candle1.burnTime * candle1.quantity +
                candle2.burnTime * candle2.quantity +
                candle3.burnTime * candle3.quantity +
                candle4.burnTime * candle4.quantity +
                candle5.burnTime * candle5.quantity);
//calculate the total burn time
        double totalDollarPerBurnTime = (candle1.price + candle2.price + candle3.price
                + candle4.price + candle5.price) / totalBurnTime;
// calculate the total price by adding the prices of all the candles together
        double totalPrice = candle1.getSubtotal() + candle2.getSubtotal() + candle3.getSubtotal()
                + candle4.getSubtotal() + candle5.getSubtotal();
//  making a decimal format for the prices
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedTotalDollarPerBurnTime = df.format(totalDollarPerBurnTime);
//the receipt that will be printed to the console
        // Generating the receipt
        System.out.println("Receipt\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(candle1.name);
        System.out.println("Amount: " + candle1.quantity);
        System.out.println("Burn Time: " + candle1.burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(candle1.dollarPerBurnTime));
        System.out.println("Price: $" + candle1.price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println(candle2.name);
        System.out.println("Amount: " + candle2.quantity);
        System.out.println("Burn Time: " + candle2.burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(candle2.dollarPerBurnTime));
        System.out.println("Price: $" + candle2.price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println(candle3.name);
        System.out.println("Amount: " + candle3.quantity);
        System.out.println("Burn Time: " + candle3.burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(candle3.dollarPerBurnTime));
        System.out.println("Price: $" + candle3.price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println(candle4.name);
        System.out.println("Amount: " + candle4.quantity);
        System.out.println("Burn Time: " + candle4.burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(candle4.dollarPerBurnTime));
        System.out.println("Price: $" + candle4.price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println(candle5.name);
        System.out.println("Amount: " + candle5.quantity);
        System.out.println("Burn Time: " + candle5.burnTime + " hours");
        System.out.println("Dollar per Burn Time: $" + df.format(candle5.dollarPerBurnTime));
        System.out.println("Price: $" + candle5.price);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.println("Total Burn Time: " + totalBurnTime);
        System.out.println("Total Dollar per Burn Time: $" + formattedTotalDollarPerBurnTime);
        System.out.println("Total Price: $" + totalPrice);
    }


}