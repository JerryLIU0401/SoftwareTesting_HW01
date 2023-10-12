package org.example;

public class Triangle {
  static class TriangleException extends Exception{
    int wrongEdge[] = new int[3];
    public TriangleException(int a, int b, int c){
      super("The edges are wrong.");
      wrongEdge[0] = a;
      wrongEdge[1] = b;
      wrongEdge[2] = c;
    }

    public int[] getEdge(){
      return wrongEdge;
    }
  }

  static String getTriangle(int a, int b, int c) throws TriangleException{
    if(!(a + b > c && a + c > b && b + c > a) || a < 0 || b < 0 || c < 0){
      TriangleException triangleException = new TriangleException(a, b, c);
      int edge[] = triangleException.getEdge();
      System.out.println("Wrong edges:");
      for (int s:edge) {
        System.out.println(s);
      }
      throw triangleException;
    }
    if(a == b && b == c){
      return "正三角形";
    }else if(a == b || b == c || a == c){
      return "等腰三角形";
    }else{
      return "三角形";
    }
  }
}
