package org.example;

public class Triangle {
  static class TriangleException extends Exception{
    int wrongEdge[] = new int[3];
    // 自訂例外並封裝邊長
    public TriangleException(int a, int b, int c){
      super("The edges are wrong.");
      wrongEdge[0] = a;
      wrongEdge[1] = b;
      wrongEdge[2] = c;
    }

    // 取得封裝的邊長
    public int[] getEdge(){
      return wrongEdge;
    }
  }

  // 判別三角形類型
  static String getTriangle(int a, int b, int c) throws TriangleException{
    if(!(a + b > c && a + c > b && b + c > a) || a < 0 || b < 0 || c < 0){
      TriangleException triangleException = new TriangleException(a, b, c);
      int edge[] = triangleException.getEdge();
      System.out.println("Wrong edges:"); // 發生錯誤時輸出邊長
      for (int s:edge) {
        System.out.print(s + " ");
      }
      System.out.println("");
      throw triangleException;
    }
    if(a == b && b == c){
      return "equilateral triangle";
    }else if(a == b || b == c || a == c){
      return "isosceles triangle";
    }else{
      return "triangle" ;
    }
  }
}
