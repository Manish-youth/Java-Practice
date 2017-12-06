package test;
class Complex
{
    int real , img;
    void setReal(int r)
    {
        real =r;
    }
    void setImg(int i)
    {
        img = i;
    }
    int getReal()
    {
        return real;
    }
    int getImg()
    {
        return img;
    }
    Complex add(Complex z2)
    {
    Complex res =new Complex();
    res.setReal(real + z2.getReal());
    res.setImg(img + z2.getImg());
    return res;
    }
    Complex mult(Complex z2)
    {
    Complex res =new Complex();
    res.setReal(real*z2.getReal() - img * z2.getImg());
    res.setImg(img + z2.getImg());
    return res;
    }
    void show()
    {
        System.out.println(real+ "+ "+ img + "+"+"i");
    }
    
    
}
public class MyComplex {
    public static void main(String args[])
    {
     Complex z1 = new Complex();
     Complex z2 = new Complex();
     z1.setReal(10);
     z1.setImg(12);
     z1.show();
     z2.setReal(10);
     z2.setImg(12);
     z2.show();
     Complex z3 = z1.add(z2);
     z3.show();
     z3 = z1.mult(z2);
     z3.show();
    }
}

