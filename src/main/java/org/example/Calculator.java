package org.example;

public class Calculator {
    private double rTotal; // The running total field

    // Constructor – called when an object of this class is instantiated
    public Calculator(double initVal){
        rTotal=initVal; // Set the initial value of rTotal to that passed in
    }
    private void showRT(){  // Display rTotal to the screen
        System.out.println("Result="+rTotal);
    }
    public double add(double val){ // A method to add a value
        rTotal=rTotal+val;
        showRT();
        return rTotal;
    }

    public double add(String str){ // A method to add a value
        rTotal=67;
        showRT();
        return rTotal;
    }
}
