package dkff;


import java.awt.Image;
import java.awt.Graphics;

public class Coinflip
{
    //fields

    private Image heads;
    private Image tails;
    private int currentFace = 0; //0 is heads, 1 is tails

    //Constructors

    public Coinflip(Image headsImg, Image tailsImg){
        heads = headsImg;
        tails = tailsImg;
    }

    public void flip(){
        if (currentFace == 0){
            currentFace = 1;
        } else{
            currentFace = 0;
        }
    }

    public void draw(Graphics g, int x, int y){    
        if (currentFace ==0){
            g.drawImage(heads, x , y , null);
        } else {
            g.drawImage(tails, x , y , null);
        }
    }
}
