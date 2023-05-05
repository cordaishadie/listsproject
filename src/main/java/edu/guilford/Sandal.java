package edu.guilford;

import edu.guilford.Shoe;

public class Sandal extends Shoe {
    // attributes
    private String strapType;
    private boolean backStrap;
    private String heelType;

    // constructor
    public Sandal() {
        super();
       // choose a random value for strap type
        String[] strapTypeOptions = {"double", "single", "none"};
        int randomIndex = (int) (Math.random() * strapTypeOptions.length);
        strapType = strapTypeOptions[randomIndex];

        // choose a random value for back strap
        boolean randomBackStrap = Math.random() < 0.5;
        backStrap = randomBackStrap;

        // choose a random value for heel type
        String[] heelTypeOptions = {"flat", "wedge", "stiletto"};
        int heelTypeIndex = (int) (Math.random() * heelTypeOptions.length);
        heelType = heelTypeOptions[heelTypeIndex];
    }

    public Sandal(String brand, String color, double size, String material, double heelHeight, 
    int shaftHeight, boolean gender, String strapType, boolean backStrap, String heelType){
        super(brand, color, size, material, heelHeight, shaftHeight, gender);
        this.strapType = strapType;
        this.backStrap = backStrap;
        this.heelType = heelType;
    }

    // getters and setters
    public String getStrapType() {
        return strapType;
    }

    public boolean isBackStrap() {
        return backStrap;
    }

    public String getHeelType() {
        return heelType;
    }

    public void setStrapType(String strapType) {
        this.strapType = strapType;
    }

    public void setBackStrap(boolean backStrap) {
        this.backStrap = backStrap;
    }

    public void setHeelType(String heelType) {
        this.heelType = heelType;
    }

    // methods
    // toString() method
    @Override
    public String toString() {
        return "Sandal{" +
                "brand='" + getBrand() + '\'' +
                ", color='" + getColor() + '\'' +
                ", size=" + getSize() +
                ", material='" + getMaterial() + '\'' +
                ", heelHeight='" + getHeelHeight() + '\'' +
                ", shaftHeight='" + getShaftHeight() + '\'' +
                ", strapType='" + strapType + '\'' +
                ", backStrap=" + backStrap +
                ", heelType='" + heelType + '\'' +
                '}';
    }

    // add a pricing() method
    public double pricing() {
        // this method will return a price based on various attributes
        // the base price will be the size of the shoe multipled by 6
        double price = getSize() * 6;
        // if the brand is Birkenstock, mark up the price by 50%
        if (getBrand().equals("Birkenstock")) {
            price = price * 1.5;
        }
        // if the heel height is greater than 1.5 inches, increase the price by $20
        if (getHeelHeight() > 1.5) {
            price = price + 20;
        }
        // if there is no back strap, decrease the price by 10%
        if (!backStrap) {
            price = price * 0.9;
        }
        return price;
    }
    
}
