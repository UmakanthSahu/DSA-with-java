import java.util.Scanner;
class Factorial {
    int factRec(int n, int result){
        if(n==1)
            return result;
        
        return(fact(n-1,n*result));
    }
    
    int factRec(int n){
        if(n == 1 || n == 0)
            return 1;
        return n * fact(n-1);
    }
    
    int fact(int n){
        int ans = 1;
        
        for(int i=2;i<n;i++)
            ans *= i;
        
        return ans;
    }
}
class FactorialDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Factorial f=new Factorial();
        System.out.print("Enter a number ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is "+f.fact(n));
        System.out.println("Factorial of "+n+" using Recusion is "+f.factRec(n,1));
        
    }
}
