import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Item[] item = new Item[5];

        getItems(item);    
        printItems(item);
    }

    // asks the user for size and base cost using getSize() and getCostInput() 
    // methods, then creates the instance of Item class.
    public static void getItems(Item[] item){
        for(int i = 0; i < item.length; i++){
            Size size = getSize("Enter Size Code: (XS|S|M|L|XL):");
            double base_cost = getCostInput("Enter the base cost:");

            item[i] = new Item(size, base_cost);
        }
    }

    // uses try-catch block to prevent the input of invalid data.
    // returns size if it is valid, otherwise - method itself.
    public static Size getSize(String prompt){
        try{
            Size input_size = Size.valueOf
                (JOptionPane.showInputDialog(prompt));

            for (Size sizes : Size.values()){
                if (input_size == sizes){
                    return input_size;
                }
            }
            return getSize(prompt);
        }catch(Exception e){
            JOptionPane.showMessageDialog
                (null, "There is no such size.");
            return getSize(prompt);
        }
    }

    // uses try-catch block to prevent the input of invalid data.
    // checks if the cost is valid (non-negative and not a String),
    // otherwise - returns the method itself.
    public static double getCostInput(String prompt){
        double cost;
        try{
            cost = Double.parseDouble(JOptionPane.showInputDialog(prompt));

            if (cost <= 0){
                JOptionPane.showMessageDialog
                    (null, "Error: item price must be positive.");
                return getCostInput(prompt);
            }
            return cost;
        }catch(Exception e){
            return getCostInput("Error! Please, enter a number.");
        }
    }

    // uses for loops and f-String to print the info.
    // the last for loop uses method toString from the Item class.
    public static void printItems(Item[] item){
        for (int i = 0; i < 34; i++){
            System.out.print("=");
        }

        System.out.printf("\n%-11s %-11s %-10s", "Item Name", 
            "Base Cost", "Item Price\n");

        for (int i = 0; i < 34; i++){
            System.out.print("=");
        }

        System.out.println();

        for (Item i : item){
            System.out.println(i.toString());
        }
    }
}