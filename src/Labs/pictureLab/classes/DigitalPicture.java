package Labs.pictureLab.classes;

import java.awt.Image;
import java.awt.image.BufferedImage;

public interface DigitalPicture {
    String getFileName(); // get the file name that the picture came from
    String getTitle(); // get the title of the picture
    void setTitle(String title); // set the title of the picture
    int getWidth(); // get the width of the picture in pixels
    int getHeight(); // get the height of the picture in pixels
    Image getImage(); // get the image from the picture
    BufferedImage getBufferedImage(); // get the buffered image
    int getBasicPixel(int x, int y); // get the pixel information as an int
    void setBasicPixel(int x, int y, int rgb); // set the pixel information
    Pixel getPixel(int x, int y); // get the pixel information as an object
    Pixel[] getPixels(); // get all pixels in row-major order
    Pixel[][] getPixels2D(); // get 2-D array of pixels in row-major order
    void load(Image image); // load the image into the picture
    boolean load(String fileName); // load the picture from a file
    void show(); // show the picture
    void explore(); // explore the picture
    boolean write(String fileName); // write out a file
}