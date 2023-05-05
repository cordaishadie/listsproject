package edu.guilford;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

public abstract class Shoe implements Comparable<Shoe> {
    // attributes
    private String brand;
    private String color;
    private double size;
    private String material;
    private double heelHeight;
    private int shaftHeight;
    private boolean gender;

    // constructors
    public Shoe(String brand, String color, double size, String material, double heelHeight, int shaftHeight, boolean gender){
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.material = material;
        this.heelHeight = heelHeight;
        this.shaftHeight = shaftHeight;
        this.gender = gender;


    }

    public Shoe() {
        // choose a shoe brand from a list of 10 possible brands
        String[] brands = {"Nike", "Adidas", "Puma", "Birkenstock,", "UGG", "Crocs", "Vans", "Converse", "New Balance", "Reebok"};
        int randomBrand = (int) (Math.random() * 10);
        brand = brands[randomBrand];

        // choose a shoe color from a list of 10 possible colors
        String[] colors = {"red", "orange", "yellow", "green", "blue", "purple", "pink", "black", "white", "brown"};
        int randomColor = (int) (Math.random() * 10);
        color = colors[randomColor];

        // choose a shoe size from a list of 10 possible sizes
        double[] sizes = {6.0, 6.5, 7.0, 7.5, 8.0, 8.5, 9.0, 9.5, 10.0, 10.5};
        int randomSize = (int) (Math.random() * 10);
        size = sizes[randomSize];

        // choose a shoe material from a list of 10 possible materials
        String[] materials = {"leather", "suede", "canvas", "rubber", "mesh", "synthetic", "knit", "patent leather", "velvet", "satin"};
        int randomMaterial = (int) (Math.random() * 10);
        material = materials[randomMaterial];

        // choose a heel height from a list of 10 possible heel heights
        double[] heelHeights = {0.0, 0.5, 1.0, 1.5, 2.0, 2.5, 3.0};
        int randomHeelHeight = (int) (Math.random() * 7);
        heelHeight = heelHeights[randomHeelHeight];

        // choose a shaft height from a list of 10 possible shaft heights
        int[] shaftHeights = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int randomShaftHeight = (int) (Math.random() * 10);
        shaftHeight = shaftHeights[randomShaftHeight];

        // choose a random gender 
        boolean randomGender = Math.random() < 0.5;
        gender = randomGender;

    }



    // getters and setters
    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getSize() {
        return size;
    }

    public String getMaterial() {
        return material;
    }

    public double getHeelHeight() {
        return heelHeight;
    }

    public int getShaftHeight() {
        return shaftHeight;
    }

    public boolean getGender() {
        return gender;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setHeelHeight(double heelHeight) {
        this.heelHeight = heelHeight;
    }

    public void setShaftHeight(int shaftHeight) {
        this.shaftHeight = shaftHeight;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    // methods
    public String toString() {
        return "Brand: " + brand + "\n" +
                "Color: " + color + "\n" +
                "Size: " + size + "\n" +
                "Material: " + material + "\n" +
                "Heel Height: " + heelHeight + "\n" +
                "Shaft Height: " + shaftHeight + "\n" +
                "Gender: " + gender + "\n";
    }

    // abstract method that will be implemented in the subclasses
    // pricing() method
    public abstract double pricing();

    // This is the method that we will need to implement in order to use the Comparable interface. 
    // This method will compare the brand of the shoe to the brand of the shoe and also the size of the shoe to the size of the shoe.
    // If the brand of the shoe is the same as the brand of the shoe, then the size of the shoe will be compared to the size of the shoe.
    // If the size of the shoe is greater than the size of the shoe, then 1 will be returned.
    // If the size of the shoe is less than the size of the shoe, then -1 will be returned.
    // If the size of the shoe is equal to the size of the shoe, then 0 will be returned.
    // If the brand of the shoe is not the same as the brand of the shoe, then the brand of the shoe will be compared to the brand of the shoe.
    // If the brand of the shoe is greater than the brand of the shoe, then 1 will be returned.
    // If the brand of the shoe is less than the brand of the shoe, then -1 will be returned.
    // If the brand of the shoe is equal to the brand of the shoe, then 0 will be returned.
    public int compareTo(Shoe shoe) {
        if (this.brand.equals(shoe.brand)) {
            if (this.size > shoe.size) {
                return 1;
            } else if (this.size < shoe.size) {
                return -1;
            } else {
                return 0;
            }
        } else {
            if (this.brand.compareTo(shoe.brand) > 0) {
                return 1;
            } else if (this.brand.compareTo(shoe.brand) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }


}
