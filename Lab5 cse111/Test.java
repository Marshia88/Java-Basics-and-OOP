public class Test {
  public int [] array;
  public int length;
  public void m1(int[] t20) {
    if (t20 == null || t20.length == 0) {
      return;
    }
    this.array = t20;
    length = t20.length;
    m2(0, length - 1);
  }
  private void m2(int a1, int a2) {
    int i = a1;
    int j = a2;
    int k2 = array[a1+(a2-a1)/2];
    while (i <= j) {
      while (array[i] < k2) {
        i++;
      }
      while (array[j] > k2) {
        j--;
      }
      if (i <= j) {
        m3(i, j);
        i++;
        j--;
      }
    }
    if (a1 < j)
      m2(a1, j);
    if (i < a2)
      m2(i, a2);
  }
  private void m3(int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}