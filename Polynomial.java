import java.lang.Math;

public class Polynomial implements Function2D{
    private double[] arrayCoeffs;
    private int[] arrayDegrees; 

    public Polynomial(double[] coefficients, int[] exponents){
        int largestExponent = 0;
        for (int i : exponents){
            largestExponent = Math.max(largestExponent, i);
        }
        arrayCoeffs = new double[largestExponent + 1];
        
        int k = 0;
        for (int i : exponents){
            arrayCoeffs[i] = coefficients[k++];
        }
    }

    @Override
    public double eval(double x){
        double sum = 0;
        for (int i = 0; i < arrayCoeffs.length; i++){
            sum += arrayCoeffs[i] * Math.pow(x, i);
        }
        return sum;
    }

    public double getCoefficient(int degree){
        double coeff = 0;
        for(int i = 0; i < arrayCoeffs.length; i++){
            if(i == degree){
                coeff += arrayCoeffs[degree];
            }
        }
        return coeff;
    }

    public int getMaxDegree(){
        for (int i = arrayCoeffs.length - 1; i >= 0; i--){
            if(arrayCoeffs[i] > 0){
                return i;
            }
        }
        return 0;
    }
}