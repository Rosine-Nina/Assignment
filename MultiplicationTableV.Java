public class MultiplicationTableV {

    private int  multiplicationNumber;
    private int rangeFrom;
    private int rangeTo;

    public MultiplicationTableV() {
    }
    public MultiplicationTableV(int multiplicationNumber, int rangeFrom, int rangeTo) {
        this.multiplicationNumber = multiplicationNumber;
        this.rangeFrom = rangeFrom;
        this.rangeTo = rangeTo;
    }

    public void setMultiplicationTableV(int multiplicationNumber,int rangeFrom,int rangeTo) {
        this.multiplicationNumber = multiplicationNumber;
         this.rangeFrom = rangeFrom;
          this.rangeTo = rangeTo;
    }

    public int getMultiplicationTable() {
        return multiplicationNumber;
    }

    public int getRangeFrom() {
        return rangeFrom;
    }

    public int getRangeTo() {
        return rangeTo;
    }
    public void title(){
        System.out.print("Multiplication Table of");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print("Range from");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.println("Range To");
    }
    public void printTable(){

         System.out.print( multiplicationNumber);
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print( rangeFrom);
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(" \t");
         System.out.print(rangeTo);
         System.out.println();


    }


    public static void main(String[] args) {
        MultiplicationTableV object1 = new MultiplicationTableV();
        MultiplicationTableV object2 = new MultiplicationTableV();
         MultiplicationTableV object3 = new MultiplicationTableV(0,1,5);
        object1.setMultiplicationTableV(3, 17, 27);
        object2.setMultiplicationTableV(0, 1, 5);
        object3.setMultiplicationTableV(17, 3, 49);
        object1.title();
        object1.printTable();
        object3.printTable();
        object2.printTable();



    }

}