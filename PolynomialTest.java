import org.junit.*;
import static org.junit.Assert.*;

public class PolynomialTest{
    @Test
    public void testGetMaxDegree() {
        double[] coefficients = new double[] {3.2, 1.5, 5};
        int[] exponents = new int[] {100, 2, 0};
        Polynomial poly = new Polynomial(coefficients, exponents);
        
        assertEquals(poly.getMaxDegree(), 100);
    }

    @Test
    public void testGetMaxDegreeWithSameDegrees() {
        double[] coefficients = new double[] {3.2, 1.5, 5};
        int[] exponents = new int[] {100, 100, 2};
        Polynomial poly = new Polynomial(coefficients, exponents);
        
        assertEquals(poly.getMaxDegree(), 100);
    }


    @Test
    public void testGetCoefficent() {
        boolean result = false;
        double[] coefficients = new double[] {3.2, 4.5, 6.8};
        int[] exponents = new int[] {2, 1, 0};
        Polynomial poly = new Polynomial(coefficients, exponents);

        if(poly.getCoefficient(1) == 4.5){
            result = true;
        }
        assertEquals("failure: the degree does not match the coefficient", true, result); 
    }

    @Test
    public void testGetNegativeCoefficent() {
        boolean result = false;
        double[] coefficients = new double[] {3.2, -4.5, 6.8};
        int[] exponents = new int[] {2, 1, 0};
        Polynomial poly = new Polynomial(coefficients, exponents);

        if(poly.getCoefficient(1) == -4.5){
            result = true;
        }
        assertEquals("failure: does not get the negative coefficent", true, result); 
    }

    @Test
    public void testEval() {
        boolean result = false;
        double[] coefficients = new double[] {3.2, 4.5, 6.8};
        int[] exponents = new int[] {2, 1, 0};
        Polynomial poly = new Polynomial(coefficients, exponents);

        if(poly.eval(3) == 49.1){
            result = true;
        }
        assertEquals("failure: eval is incorrect", true, result);
    }

    @Test
    public void testNegativeX(){
        boolean result = false;
        double[] coefficients = new double[] {3.2, 4.5, 6.8};
        int[] exponents = new int[] {2, 1, 0};
        Polynomial poly = new Polynomial(coefficients, exponents);

        if(poly.eval(-3) == 22.1){
            result = true;
        }
        assertEquals("failure: negative x does not work", true, result);
    }

    @Test
    public void testNegativeResult(){
        boolean result = false;
        double[] coefficients = new double[] {3.2, 4.5, 6.8};
        int[] exponents = new int[] {3, 1, 0};
        Polynomial poly = new Polynomial(coefficients, exponents);

        if(poly.eval(-3) == -93.10000000000001){
            result = true;
        }
        assertEquals("failure: negative result does not work", true, result);
    }
}
