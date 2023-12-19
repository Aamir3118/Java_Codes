class Task2
{
    public static void main(String args[])
    {
        int a,b;
        int n1,n2;
        a=10;
        b=19;
        n1=9;
        n2=9;
        System.out.println("Arrithmetic");
        System.out.println("a+b: "+(a+b));
        System.out.println("a-b: "+(a-b));
        System.out.println("a*b: "+(a*b));
        System.out.println("a/b: "+(a/b));
        System.out.println("a%b: "+(a%b));
        
        System.out.println("Assignment");
        System.out.println("n1+=: "+(n1+=2));
        System.out.println("n1-=: "+(n1-=2));
        System.out.println("n1*=: "+(n1*=2));
        System.out.println("n1/=: "+(n1/=2));
        System.out.println("n1%=: "+(n1%=2));

        System.out.println("Relational");
        System.out.println("n1==a: "+(n1==a));
        System.out.println("n1!=a: "+(n1!=a));
        System.out.println("n1>=a: "+(n1>=a));
        System.out.println("n1<=a: "+(n1<=a));

        System.out.println("Logical");
        System.out.println("(n1<5 || n1>10): "+((n1<5 || n1>10)));
        System.out.println("(n1<5 && n1>10): "+(n1<5 && n1>10));
        System.out.println("(n2>5 && n2==9): "+((n2>5 && n2==9)));

        System.out.println("Unary");
        int ans=n2;
        ans++;
        System.out.println("ans: "+ans++);
        System.out.println("ans: "+(++ans));
        System.out.println("ans: "+ans--);
        System.out.println("ans: "+(--ans));

        System.out.println("Bitwise");
        int num=2;
        System.out.println("10|5"+(10|5));
        System.out.println("10&5"+(10&5));
        System.out.println("10^5"+(10^5));
        System.out.println(">>2:"+(-4 >> 2));
        System.out.println("<<2:"+(num << 2));
    
    }
}