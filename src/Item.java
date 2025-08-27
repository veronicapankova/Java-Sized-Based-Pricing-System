public class Item {
    private Size itemSize;
    private double baseCost;

    public Item(){
        this.itemSize = Size.M;
        this.baseCost = 0.0;
    }

    public Item(Size itemSize, double baseCost){
        this.itemSize = itemSize;
        this.setBaseCost(baseCost);
    }

    public Size getItemSize() {
        return itemSize;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setItemSize(Size itemSize) {
        this.itemSize = itemSize;
    }

    // checks the data for validity and throws the exception.
    public void setBaseCost(double baseCost) {
        if (baseCost < 0)
            throw new IllegalArgumentException("Base cost cannot be negative.");
        this.baseCost = baseCost;
    }

    public double getItemPrice(){
        return this.baseCost * this.itemSize.getCostCoefficient();
    }

    public String toString() {
        return String.format("%-11s %9.2f %10.2f", 
            this.itemSize.getSizeName(), this.baseCost, this.getItemPrice());
    }

}
