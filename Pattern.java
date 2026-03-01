public class Pattern {
    public static void main(String[] a){
    Pattern p = new Pattern();
    //p.pattern1(); 
    p.pattern3();
    }
    public void pattern1(){
        int i;
        int j;
        for(i=6; i>0; i--){
            for(j=0; j<6; j++){
                System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
    public void pattern2(){
        int n = 5;
        for(int i=0; i<5; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pattern3(){
        int n=5;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //this is my code for pattern 3
                //if(i==0 || j==0 || i==4 || j==4)
                //if((i==0 || i==n-1) && j!=0 || (j==0 && i!=0 && i!=n-1))
                if(((i==0 || i==n-1) && j!=0) || (j==0 && i>0 && i<n-1) || i==n/2)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

