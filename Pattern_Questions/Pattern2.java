class Pattern2 {
    public static void main(String[] args) {
        pattern2(4);
    }
    static void pattern2(int n){
        for(int row = 1; row<= n; row++){
            int spaces = n - row;
            for(int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for(int col=row; col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=row;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}