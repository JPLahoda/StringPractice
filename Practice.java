public class Practice {
  public static void whatHappens(int A[]) {
    int []B = new int[A.length];

    for (int i=0; i<A.length; i++) {
      B[i] = A[i] * 2 + 1;
    }
    
    A = B;
  }
    
  public static void main(String args[]) {
    int A[] = {10, 20, 30};
    whatHappens(A);
    System.out.println(A[0]);
  }
}
