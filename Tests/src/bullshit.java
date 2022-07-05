public class Chair extends FurnitureProduct
{
    /**
     * Denotes whether or not the chair has cushions.
     */
    private boolean cushioned;

    /**
     * Chair constructor, takes all information required of a chair furniture product.
     * @param productNameIn Name of the table.
     * @param productNumberIn Product number of the table.
     * @param cushionedIn True if chair has cushions, false if it does not.
     */
    public Chair(String productNameIn, int productNumberIn, boolean cushionedIn)
    {
        super(productNameIn, productNumberIn);
        this.cushioned = cushionedIn;

    }

    /**
     * Used to get String representation of the Chair. Returned String is of the format.
     * Product Name: PROD_NAME, Product Number: PROD_NUM, CUSHIONED
     * Where PROD_NAME is the name of the product, PROD_NUM is the product number, and CUSHOINED is
     * either the String "Has cushions" or "No cushions".
     * @Override toString in class FurnitureProduct
     * @return String giving the Chairs's name, number, and if it has cushions.
     */
    @Override
    public String toString()
    {
        if (cushioned)
        {
            return super.toString() + ", Has cushions";
        }
        else
        {
            return super.toString() + ", No cushions";
        }
    }

}