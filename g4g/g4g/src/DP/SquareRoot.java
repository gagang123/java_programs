package DP;

import java.text.DecimalFormat;

public class SquareRoot {
	 static double squareRoot (double n)
	    {
	        double x = n/2;
	        double sq = x*x;
	 
	        while ( Math.abs(n - sq) > 0.00001)
	        {
	            x = (x + n/x) / 2;
	            sq = x*x;
	        }
	 
	        return x;
	    }
	 
	 
	    static java.text.DecimalFormat df = new DecimalFormat ("###.####");
	    public static void main(String[] args) 
	    {
	        for (int i=1; i<100; i++)
	        {
	            double d = Math.random()*(i);
	            System.out.println ( "squareRoot("  + df.format(d) + ") = " +   
	                df.format(squareRoot(d)));
	        }
	    }
}
