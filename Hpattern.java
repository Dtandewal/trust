public class Hpattern {
    public static void main(String[] args) {
        int a=6;

        for(int i=0;i<a;i++){
            for(int j =0;j<a;j++){
                if(j==0 || j==a-1|| i==(a-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
