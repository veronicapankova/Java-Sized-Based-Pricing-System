public enum Size {
    XS ("Extra Small", 0.8),
    S ("Small", 0.9),
    M ("Medium", 1.0),
    L ("Large", 1.1),
    XL ("Extra Large", 1.2);

    private String sizeName;
    private double costCoefficient;

    private Size (String sizeName, double costCoefficient){
        this.sizeName = sizeName;
        this.costCoefficient = costCoefficient;
    }

    public String getSizeName(){
        return this.sizeName;
    }

    public double getCostCoefficient() {
        return this.costCoefficient;
    }

}
