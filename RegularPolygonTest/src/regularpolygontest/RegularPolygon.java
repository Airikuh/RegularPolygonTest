/*
Erika Valle-Baird
CIS 296
001
Project 1
10/20/2021
File For Class Definitions of RegularPolygon
*/

package regularpolygontest;


public class RegularPolygon {
    //Private Data Members
    private int numSides;
    private double side;
    private double x;
    private double y;
    
    //No Argument Constructor
    public RegularPolygon() {
        this.numSides = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
}
    
    //Constructor with 2 arguments
    public RegularPolygon(int nSides, double lengthSides) {
        this.numSides = nSides;
        this.side = lengthSides;
        this.x = 0;
        this.y = 0;
    }
    
    //Constructor with 4 arguments
    public RegularPolygon(int nSides, double lengthSides, double xValue, double yValue) {
        this.numSides = nSides;
        this.side = lengthSides;
        this.x = xValue;
        this.y = yValue;
    }
    
    //Method to get the number of sides
    public int getNumberSides() {
        return numSides;
    }
    
//Method to set the number of sides
    public void setNumberSides(int nSides) {
        this.numSides = nSides;
    }
    
     //Method to get the length of each side 
    public double getSideLength() {
        return side;
    }
    
   //Method to set the length of each side
    public void setSideLength(double lengthSides) {
        this.side = lengthSides;
    }
    
     //Method to get the X Coordinate
    public double getXCord() {
        return x;
    }
    
     //Method to set the X Coordinate
    public void setXCord(double xValue) {
        this.x = xValue;
    }
    
     //Method to get the Y Coordinate    
    public double getYCord() {
        return y;
    }
    
    //Method to set the Y Coordinate   
    public void setYValue(double yValue) {
        this.y = yValue;
    }
    
     //Method to get the Perimeter of a RegularPolygon    
    public double perimeter() {
        return numSides*side;
    }
    
    //Method to get the area of a RegularPolygon    
    public double area() {
        double numerator = this.numSides * Math.pow(side, 2);
        double denomiator = 4 * Math.tan(Math.PI/this.numSides);
        return numerator/denomiator;
    }

 //Method to Allow String output outside of class   
    @Override
    public String toString(){
        String message;
        message = " " + numSides;
        message += " " + side;
        message += " " + x;
        message += " " + y;
        message += " " + area();
        message += " " + perimeter();
        return message;
        
    }
}



