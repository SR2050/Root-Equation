import java.util.Scanner;
class rootequation{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a,b,c;
        double x,x1,x2;
        double D;
        System.out.println("Enter the value of a :");
        a= input.nextInt();
        System.out.println("Enter the value of b :");
        b= input.nextInt();
        System.out.println("Enter the value of c :");
        c= input.nextInt();
        D=b*b-4*a*c;
        input.close();
        if(D==0){
            x=-b/2*a;
            System.out.println("Roots are reall and equal :"+x);
        }
        else if(D>0){
            x1=(-b+Math.sqrt(D))/(2*a);
            x2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("Roots are reall and unequal :"+x2+","+x1);
        }
        else{
            System.out.println("Roots are Imagenarry");
        }
    }
}
