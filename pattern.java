class pp{
    public static void main(String[] args) {
        for( int i=1;i<=3;i++){
            for(int j=1;j<=8;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class qq{
    public static void main(String[] args) {
        for( int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if(i==1 || j==1 || i==6||j==6)
                System.out.print("*");
                else{
                    System.out.print("");
                }
            }
            System.out.println();
    }
}
}

class xx{
    public static void main(String[] args) {
        for(int i=1;i<=8;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

class rr{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class hh{
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


class ff{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1; j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}