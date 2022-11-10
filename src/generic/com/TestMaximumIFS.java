package generic.com;


public class TestMaximumIFS < T extends Comparable<T>>  {
  T x,y,z;
  public TestMaximumIFS(T x,T y,T z){
      this.x=x;
      this.y=y;
      this.z=z;
  }
  public T maximum(){
      return TestMaximumIFS.maximum(x,y,z);
      }
      //determines the largest of three comparable objects
    public static <T extends Comparable<T>> T maximum(T x,T y,T z){
           T  max=x;
      if (y.compareTo(max)>0){
           max=y;
      }
      if (z.compareTo(max)>0){
           max=z;
      }
      printMax(x,y,z,max);
      return max;   //return largest object
  }
        public static String testMaximum(String x,String y,String z){
        String max=x;
        if (y.compareTo(max) > 0){
          max=y;
        }
        if (z.compareTo(max) > 0){
          max=z;
        }
        printMax(x,y,z,max);
        return max;
        }
        public static <T> void printMax(T x,T y,T z,T max){
        System.out.printf("Max %s,%s and %s is %s \n",x,y,z,max);
        }

        public static void main(String [] args){

        Integer xInt=2,yInt=8,zInt=3;
        String xStr="Apple" ,yStr="Banana",zStr="Pear";
        Float xFlt=2.2f,yFlt=4.4f,zFlt=8.9f;

        new TestMaximumIFS(xInt,yInt,zInt).maximum();
        new TestMaximumIFS(xStr,yStr,zStr).maximum();
        new TestMaximumIFS(xFlt,yFlt,zFlt).maximum();
    }
}
