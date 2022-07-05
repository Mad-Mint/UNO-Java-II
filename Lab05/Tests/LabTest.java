import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the lab.
 *
 * @author Agatha Owora
 * @see Furniture
 * @see Chair
 * @see Table
 */
class LabTest {

    /**
     * Unit test for Furniture class.
     */
    @Test
    void testFurniture() {
        // Valid name - Valid number
        Furniture f1 = new Furniture("Product", 10000);
        assertEquals("Product", f1.getProductName());
        assertEquals(10000, f1.getProductNumber());
        assertEquals("Product Name: Product, Product Number: 10000", f1.toString());

        // Invalid name - Valid number
        Furniture f2 = new Furniture(null, 10000);
        assertEquals("Invalid", f2.getProductName());
        assertEquals(10000, f2.getProductNumber());
        assertEquals("Product Name: Invalid, Product Number: 10000", f2.toString());

        // Invalid name - Valid number
        Furniture f3 = new Furniture("", 10000);
        assertEquals("Invalid", f3.getProductName());
        assertEquals(10000, f3.getProductNumber());
        assertEquals("Product Name: Invalid, Product Number: 10000", f3.toString());

        // Valid name - Invalid number
        Furniture f4 = new Furniture("Product", 1);
        assertEquals("Product", f4.getProductName());
        assertEquals(-1, f4.getProductNumber());
        assertEquals("Product Name: Product, Product Number: -1", f4.toString());

        // Valid name - Invalid number
        Furniture f5 = new Furniture("Product", 100000);
        assertEquals("Product", f5.getProductName());
        assertEquals(-1, f5.getProductNumber());
        assertEquals("Product Name: Product, Product Number: -1", f5.toString());

        // Invalid name - Invalid number
        Furniture f6 = new Furniture(null, 1);
        assertEquals("Invalid", f6.getProductName());
        assertEquals(-1, f6.getProductNumber());
        assertEquals("Product Name: Invalid, Product Number: -1", f6.toString());

        // Invalid name - Invalid number
        Furniture f7 = new Furniture(null, 100000);
        assertEquals("Invalid", f7.getProductName());
        assertEquals(-1, f7.getProductNumber());
        assertEquals("Product Name: Invalid, Product Number: -1", f7.toString());

        // Invalid name - Invalid number
        Furniture f8 = new Furniture("", 1);
        assertEquals("Invalid", f8.getProductName());
        assertEquals(-1, f8.getProductNumber());
        assertEquals("Product Name: Invalid, Product Number: -1", f8.toString());

        // Invalid name - Invalid number
        Furniture f9 = new Furniture("", 100000);
        assertEquals("Invalid", f9.getProductName());
        assertEquals(-1, f9.getProductNumber());
        assertEquals("Product Name: Invalid, Product Number: -1", f9.toString());

        // Same name - Same number
        assertTrue(f1.equals(f1));

        // Same name - Different number
        assertFalse(f1.equals(f4));

        // Different name - Same number
        assertTrue(f1.equals(f2));

        // Different name - Different number
        assertFalse(f1.equals(f6));
    }

    /**
     * Unit test for Chair class.
     */
    @Test
    void testChair() {
        // Valid name - Valid number
        Chair c1 = new Chair("Product", 10000, true);
        assertEquals("Product", c1.getProductName());
        assertEquals(10000, c1.getProductNumber());
        assertTrue(c1.isCushioned());
        assertEquals("Product Name: Product, Product Number: 10000, Is Cushioned: true", c1.toString());

        // Invalid name - Valid number
        Chair c2 = new Chair(null, 10000, false);
        assertEquals("Invalid", c2.getProductName());
        assertEquals(10000, c2.getProductNumber());
        assertFalse(c2.isCushioned());
        assertEquals("Product Name: Invalid, Product Number: 10000, Is Cushioned: false", c2.toString());

        // Invalid name - Valid number
        Chair c3 = new Chair("", 10000, false);
        assertEquals("Invalid", c3.getProductName());
        assertEquals(10000, c3.getProductNumber());
        assertFalse(c3.isCushioned());
        assertEquals("Product Name: Invalid, Product Number: 10000, Is Cushioned: false", c3.toString());

        // Valid name - Invalid number
        Chair c4 = new Chair("Product", 1, false);
        assertEquals("Product", c4.getProductName());
        assertEquals(-1, c4.getProductNumber());
        assertFalse(c4.isCushioned());
        assertEquals("Product Name: Product, Product Number: -1, Is Cushioned: false", c4.toString());

        // Valid name - Invalid number
        Chair c5 = new Chair("Product", 100000, false);
        assertEquals("Product", c5.getProductName());
        assertEquals(-1, c5.getProductNumber());
        assertFalse(c5.isCushioned());
        assertEquals("Product Name: Product, Product Number: -1, Is Cushioned: false", c5.toString());

        // Invalid name - Invalid number
        Chair c6 = new Chair(null, 1, false);
        assertEquals("Invalid", c6.getProductName());
        assertEquals(-1, c6.getProductNumber());
        assertFalse(c6.isCushioned());
        assertEquals("Product Name: Invalid, Product Number: -1, Is Cushioned: false", c6.toString());

        // Invalid name - Invalid number
        Chair c7 = new Chair(null, 100000, false);
        assertEquals("Invalid", c7.getProductName());
        assertEquals(-1, c7.getProductNumber());
        assertFalse(c7.isCushioned());
        assertEquals("Product Name: Invalid, Product Number: -1, Is Cushioned: false", c7.toString());

        // Invalid name - Invalid number
        Chair c8 = new Chair("", 1, false);
        assertEquals("Invalid", c8.getProductName());
        assertEquals(-1, c8.getProductNumber());
        assertFalse(c8.isCushioned());
        assertEquals("Product Name: Invalid, Product Number: -1, Is Cushioned: false", c8.toString());

        // Invalid name - Invalid number
        Chair c9 = new Chair("", 100000, false);
        assertEquals("Invalid", c9.getProductName());
        assertEquals(-1, c9.getProductNumber());
        assertFalse(c9.isCushioned());
        assertEquals("Product Name: Invalid, Product Number: -1, Is Cushioned: false", c9.toString());

        // Same name - Same number
        assertTrue(c1.equals(c1));

        // Same name - Different number
        assertFalse(c1.equals(c4));

        // Different name - Same number
        assertTrue(c1.equals(c2));

        // Different name - Different number
        assertFalse(c1.equals(c6));
    }

    /**
     * Unit test for Table class.
     */
    @Test
    void testTable() {
        // Valid name - Valid number - Valid seats
        Table t1 = new Table("Product", 10000, 2);
        assertEquals("Product", t1.getProductName());
        assertEquals(10000, t1.getProductNumber());
        assertEquals(2, t1.getSeats());
        assertEquals("Product Name: Product, Product Number: 10000, Table Seats: 2", t1.toString());

        // Invalid name - Valid number - Valid seats
        Table t2 = new Table(null, 10000, 1);
        assertEquals("Invalid", t2.getProductName());
        assertEquals(10000, t2.getProductNumber());
        assertEquals(1, t2.getSeats());
        assertEquals("Product Name: Invalid, Product Number: 10000, Table Seats: 1", t2.toString());

        // Invalid name - Valid number - Valid seats
        Table t3 = new Table("", 10000, 1);
        assertEquals("Invalid", t3.getProductName());
        assertEquals(10000, t3.getProductNumber());
        assertEquals(1, t3.getSeats());
        assertEquals("Product Name: Invalid, Product Number: 10000, Table Seats: 1", t3.toString());

        // Valid name - Invalid number - Valid seats
        Table t4 = new Table("Product", 1, 1);
        assertEquals("Product", t4.getProductName());
        assertEquals(-1, t4.getProductNumber());
        assertEquals(1, t4.getSeats());
        assertEquals("Product Name: Product, Product Number: -1, Table Seats: 1", t4.toString());

        // Valid name - Invalid number - Valid seats
        Table t5 = new Table("Product", 100000, 1);
        assertEquals("Product", t5.getProductName());
        assertEquals(-1, t5.getProductNumber());
        assertEquals(1, t5.getSeats());
        assertEquals("Product Name: Product, Product Number: -1, Table Seats: 1", t5.toString());

        // Invalid name - Invalid number - Valid seats
        Table t6 = new Table(null, 1, 1);
        assertEquals("Invalid", t6.getProductName());
        assertEquals(-1, t6.getProductNumber());
        assertEquals(1, t5.getSeats());
        assertEquals("Product Name: Invalid, Product Number: -1, Table Seats: 1", t6.toString());

        // Invalid name - Invalid number - Valid seats
        Table t7 = new Table(null, 100000, 1);
        assertEquals("Invalid", t7.getProductName());
        assertEquals(-1, t7.getProductNumber());
        assertEquals(1, t7.getSeats());
        assertEquals("Product Name: Invalid, Product Number: -1, Table Seats: 1", t7.toString());

        // Invalid name - Invalid number - Valid seats
        Table t8 = new Table("", 1, 1);
        assertEquals("Invalid", t8.getProductName());
        assertEquals(-1, t8.getProductNumber());
        assertEquals(1, t8.getSeats());
        assertEquals("Product Name: Invalid, Product Number: -1, Table Seats: 1", t8.toString());

        // Invalid name - Invalid number - Valid seats
        Table t9 = new Table("", 100000, 1);
        assertEquals("Invalid", t9.getProductName());
        assertEquals(-1, t9.getProductNumber());
        assertEquals(1, t9.getSeats());
        assertEquals("Product Name: Invalid, Product Number: -1, Table Seats: 1", t9.toString());

        // Invalid name - Invalid number - Invalid seats
        Table t10 = new Table(null, 1, -1);
        assertEquals("Invalid", t10.getProductName());
        assertEquals(-1, t10.getProductNumber());
        assertEquals(1, t5.getSeats());
        assertEquals("Product Name: Invalid, Product Number: -1, Table Seats: 1", t10.toString());

        // Invalid name - Invalid number - Invalid seats
        Table t11 = new Table(null, 100000, -1);
        assertEquals("Invalid", t11.getProductName());
        assertEquals(-1, t11.getProductNumber());
        assertEquals(1, t11.getSeats());
        assertEquals("Product Name: Invalid, Product Number: -1, Table Seats: 1", t11.toString());

        // Invalid name - Invalid number - Invalid seats
        Table t12 = new Table("", 1, -1);
        assertEquals("Invalid", t12.getProductName());
        assertEquals(-1, t12.getProductNumber());
        assertEquals(1, t12.getSeats());
        assertEquals("Product Name: Invalid, Product Number: -1, Table Seats: 1", t12.toString());

        // Invalid name - Invalid number - Invalid seats
        Table t13 = new Table("", 100000, -1);
        assertEquals("Invalid", t13.getProductName());
        assertEquals(-1, t13.getProductNumber());
        assertEquals(1, t13.getSeats());
        assertEquals("Product Name: Invalid, Product Number: -1, Table Seats: 1", t13.toString());

        // Same name - Same number
        assertTrue(t1.equals(t1));

        // Same name - Different number
        assertFalse(t1.equals(t4));

        // Different name - Same number
        assertTrue(t1.equals(t2));

        // Different name - Different number
        assertFalse(t1.equals(t6));
    }
}