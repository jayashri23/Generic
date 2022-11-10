package generic.com;

public class Generic {
    //default constructor
    public Generic(){
        System.out.println("---------------------------------------------");
        System.out.println("-------Welcome to Generic Problems----------- ");
        System.out.println("Comparing Integer String Float Printing Maximum");
        System.out.println("-----------------------------------------------");
    }
    public static void main(String [] args){
        //initialize object
        Generic testMaximum=new Generic();
        //define array where size=3 given
        Integer [] intArray={6,8,2};
        Float [] floatArray={2.2f,5.6f,7.8f};
        String [] stringArray={"Apple","Banana","Pear","Mango"};
        System.out.println("Considering Integer Array");
        printArray(intArray);
        getMaximum(intArray);
        System.out.println("Considering Float Array");
        printArray(floatArray);
        getMaximum(floatArray);
        System.out.println("Considering String Array");
        printArray(stringArray);
        getMaximum(stringArray);
    }
    //get maximum from array and its position
    public static <T extends Comparable <T >>void getMaximum(T [] array){
        T max=array[0];
        int position=0;
        int i;
        for(i=0;i<array.length;i++){
            int a=array[i].compareTo(max);
            if (a>0){
                max=array[i];
                position=i;
            }
        }
        System.out.println("\nMaximum integer is:"+max );
        System.out.println("Maximum integer position ="+position+" in array.");
    }
    //Printing array
    public static <T> void printArray(T [] array){
        System.out.println("Array is:");
        for (T element:array){
            System.out.println(element+"");
        }
    }
}
