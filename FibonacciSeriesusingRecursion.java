class FibonacciSeriesusingRec
{
public static void main(String[]args)
{
//Static variable Declare
static int a = 0, b = 1;
// condition provide 
System.out.println(a+""+b);
FibonacciSeriesUsingRec ob = new FibonacciSeriesusingRec();//object create
ob.printFib(10);//methodcall
}
voidprintFib(int i)
// methodcreate krna pdega jo apne aap ko baar baar call krega//
// apne aap ko call krwata rhega(infinity time call kraega)//
if(i>=1) //conditon jb tak ki value greater than aur equal to one h tb tak ye apne aaap ko call krega// 
{
c=a+b;
System.out.println(""+c);
a=b;
b=c;
printFib(i-1);
}
}
}


