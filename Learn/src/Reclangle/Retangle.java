
package Reclangle;

import java.awt.Graphics;
import java.awt.Color;

public class Retangle {
    protected int x , y , w , h , weight ;
    protected float xC , yC;
    protected Color lineColor , fillColor; 
    
    public Retangle ( int x ,int y , float xC , float yC , int w , int h , int weight ,
            Color lineColor , Color fillColor ){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.weight = weight;
        this.lineColor = lineColor;
        this.fillColor = fillColor;
        this.lineColor = lineColor;
        this.fillColor = fillColor;
    }
    
    public Retangle(){
        this.x = 0;
        this.y = 0;
        this.w = 20;
        this.h = 10;
        this.weight = 1;
        this.lineColor = Color.RED;
        this.fillColor = Color.BLACK;
    }
    //---------------------------------------
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

    public void setW(int w) {
        this.w = w;
    }

    public float getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getFillcolor() {
        return fillColor;
    }

    public void setFillcolor(Color fillcolor) {
        this.fillColor = fillcolor;
    }
    //------------------------------------
    
    public void moveTo(int x , int y){
        this.x = x;
        this.y = y;
        calcCenterCoordinate();
    }
    
    public void resize(int w , int h){
        this.w = w;
        this.h = h;
        calcCenterCoordinate();
    }
    
    public int calcPerimeter(){
        return 2*(this.w + this.h);
    }
    
    public int calcArea(){
        return this.w * this.h;
    }
    
    private void calcCenterCoordinate(){
        this.xC = x + w/2;
        this.yC = y + h/2;
    }
    
    public void drawRect (Graphics g){
        g.setColor(lineColor); //thiet lap mau duong vien
        g.drawRect(x, y, w, h); // ve hinh chu nhat
        g.setColor(fillColor);  // thiet lap mau to cho HCM
        g.fillRect(x, y, w, h); // To mau cho hinh chu nhat
    }
    //-----------------------------------------
}
