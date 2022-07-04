package se.week4.oopEx;

/**
 * 2. Make a program that prints out the area on a rectangle in a OOP way.
 * a. Create a class “Rectangle” with the following fields:
 * height, width. (both should be double values.)
 * b. Make two constructors, one default constructor without parameters and the second
 * constructor which should take two parameters (height and weight).
 * c. Add getter and setter for height and width fields.
 * d. Write public method “getArea” which will return area (height*weight).
 * e. In the main program create instance of that “Rectangle” and ask user for height and
 * width and then print calculated area.
 * -Covering Constructors, getters, and setter
 */
public class Rectangle {

    private int height;
    private int width;

    public Rectangle(){

    }
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea (){
        return height*width;
    }
}
