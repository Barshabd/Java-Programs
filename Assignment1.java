public class Assignment1 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        int largenumber;
        if (a>=b && a>=c)
        {
            largenumber=a;
        }
        else if (b>=a && b>=c)
        {
            largenumber=b;

        }else
        {
            largenumber=c;
        }

        System.out.println("Largest number is :" + largenumber);
    }
}
