public class Chair extends Furniture {

    private boolean cushioned;

    public Chair(String productName, int productNumber, boolean cushioned) {
        super(productName, productNumber);
        this.cushioned = cushioned;
    }

    public boolean isCushioned() {
       if(cushioned){
           return true;
       } else return false;
    }

    @Override
    public String toString() {
        return super.toString() + ", Is Cushioned: " + isCushioned();
    }
}