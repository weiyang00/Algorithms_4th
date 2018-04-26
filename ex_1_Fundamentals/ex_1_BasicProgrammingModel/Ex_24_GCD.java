package ex_1_Fundamentals.ex_1_BasicProgrammingModel;

public class Ex_24_GCD {

    //假设我们的最大公约数表示为f(a,b),并且有a>=b>0,
    //欧几里德定理，f(a,b)=f(b,a%b),
    //证明:
//    设有 p=a/b, q=a%b
//    所以就有 a=a/b*b+q  ----(这里的a/b*b!=a   ，原因就是我们用的是整数来计算的)
//    也就是a=p*b+q     变换一下有：q=a-p*b      设d=f(a,b)，a/d=m,b/d=n;则  有q=dm-p*dn=d(m-pn)
//    所以q/d也为0；设d|q表示d是q的约数；以下相同；
//    又有d|b;所以有d|(b,q),设D是(b,q)的最大公约数，则会有d<=D=f(b,q);
//
//    再回到前面r=a/b,q=a%b这两个条件有
//    a=r*b+q,由于D|(b,q),所以D|a,所以有D|(a,b)
//    所以有D<=d=f(a,b),结合上部分就有d<=D <+d,及D=d;
//    所以得证；
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int a =105;
        int b =24;
        System.out.println(a + " 和 "+b+" 的欧几里得最大公约数 === "+ oujilide(a, b));
    }


    public static int oujilide(int a,int b){
        if(a<b){
            int temp;
            temp=a;
            a=b;
            b=temp;
        }
        if(0==b){
            return a;
        }
        System.out.println("p 的值 === "+ b +"， q的值 ===" + a%b);
        return oujilide(b,a%b);
    }

}
