package se.week4.oopEx;
    /**
     * 1. Make a program that can print out “drive” method in a OOP way.
     * a. Create a class “Car” with the following fields:
     * id, year, model, colour, motorSize.
     * b. Create a public method “drive” inside “Car” which will print:
     * model + ” with motor ” + motorSize + ” can drive now.”
     * c. In the main program make instance of “Car” and call the method “drive”.
     * - Covering class design and instances
     */
    public class Car {
        private String id;
        private int year;
        private String model;
        private String colour;
        private String motorSize;
        public String drive(){
            return model + " with motor " + motorSize + " can drive now.";
        }
        public Car (String model, String motorSize){
            this.model = model;
            this.motorSize = motorSize;
        }
}
