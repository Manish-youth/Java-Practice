package test;
class Rect {
   
    double length;
    double breath;
    void setAtri(double l,double b)
    {
        length =l;
        breath = b;
    }
    double area()
    {
        return length*breath;
        
    }
    double peri()
    {
        return 2*(length+breath);
    }
   
    public static void main(String[] args) {
        
        Rect r1 = new Rect();
        Rect r2 = new Rect();
        r1.setAtri(12,10);
        System.out.println("Area of rectangel is " + r1.area());
        System.out.println("Perimetreof rectangel is " + r1.peri());
        
    }
    
}
