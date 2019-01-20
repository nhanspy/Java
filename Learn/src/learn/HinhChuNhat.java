
package learn;

import java.awt.Color;

public class HinhChuNhat {
    protected int x , y  ;
    protected float w, h , weight , angle ,  xC , yC;
    protected Color lineColor , fillColor; 
    
    public HinhChuNhat (){
        this.x = 0;
        this.y = 0;
        this.xC = 10;
        this.yC = 5;
        this.w = 20;
        this.h = 10;
        this.weight = 1;
        this.angle = 0;
        this.lineColor = Color.black;
        this.fillColor = Color.green;
    }
    
    public HinhChuNhat (int x ,int y , float xC , float yC , float w , float h , float weight , float angle , Color lineColor , Color fillColor){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.weight = weight;
        this.angle = angle;
        this.lineColor = lineColor;
        this.fillColor = fillColor;
        
        this.xC = this.x + this.h/2;
        this.yC = this.y - this.w/2;
    }

    public int getX() {
        return x;
    }

    public Color getLineColor() {
        return lineColor;
    }

    public void setLineColor(Color lineColor) {
        this.lineColor = lineColor;
    }

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public float getxC() {
        return xC;
    }

    public void setxC(int xC) {
        this.xC = xC;
    }

    public float getyC() {
        return yC;
    }

    public void setyC(int yC) {
        this.yC = yC;
    }

    public float getW() {
        return w;
    }

    public void setW(float w) {
        this.w = w;
    }

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Color getFillcolor() {
        return fillColor;
    }
    
    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }
}
