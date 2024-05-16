class Pattern1 {
    public static void main(String[] args) {
        pattern1(4);
    }
    static void pattern1(int n){
        for(int row = 1; row<= 2*n-1; row++){
            int rc = 0;
            if(row>n){
                rc = n - (row-n);
            }else rc=row;
            
            int spaces = n - rc;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int col=rc; col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=rc;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}