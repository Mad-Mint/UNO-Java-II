public class Furniture {

    private String productName;
    private int productNumber;

    public static final int MINIMUM_PRODUCT_NUMBER = 10000;
    public static final int MAXIMUM_PRODUCT_NUMBER = 99999;

    public Furniture(String productName, int productNumber) {
        setProductName(productName);
        setProductNumber(productNumber);
    }

    public String getProductName() {
        return productName;
    }

    private void setProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            this.productName = "Invalid";
        } else {
            this.productName = productName;
        }
    }

    public int getProductNumber() {
        return productNumber;
    }

    private void setProductNumber(int productNumber) {
        if (productNumber <= MAXIMUM_PRODUCT_NUMBER && productNumber >= MINIMUM_PRODUCT_NUMBER) {
            this.productNumber = productNumber;
        } else this.productNumber = -1;
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Furniture && this.productNumber == ((Furniture) object).productNumber) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Product Name: " + productName + "," + " Product Number: " + productNumber;
    }
}