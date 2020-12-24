public class Loop2 {
    public static void main(String[] args) {
        int term= 4;
        for(int i = 1;i <= term ; i++ ){
            for(int j = term - i;j<=5;j++){
                if (j == 1||j == 3||j == 5) {
                    System.out.print("x ");
                } else
                    System.out.print("o ");
            }
            for(int k = 3;k >= i;k--) {
                if(k == 3||k  == 1){
                    System.out.print("o ");
                } else
                    System.out.print("x ");
            }
            System.out.println();
        }
    }
}
