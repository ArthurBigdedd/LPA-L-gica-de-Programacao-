public class Main
{
	public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ( (i+j) * 4 ) + 12;
            }
        }
        System.out.println("   C0 C1 C3");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0){
                    System.out.print("L"+i+" ");
                }
                if (i == j){
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("x  ");
                }
                
                if (j == 2) {
                    System.out.print("\n");
                }
            }
        }
        
	}
}
