
//package Question2;



public class yearRangeV {
    private int fist_year ;
    private int seocond_year;
    private int first_divisor;
    private int second_divisor;
    private int rangeType;

    public yearRangeV(int fist_range, int seocond_range) {
        this.fist_year = fist_range;
        this.seocond_year = seocond_range;
    }


     public void setFirst_divisor(int first_divisor) {
        this.first_divisor = first_divisor;
    }

    public void setSecond_divisor(int second_divisor) {
        this.second_divisor = second_divisor;
    }

    public int getFirst_divisor() {
        return first_divisor;
    }
     public int getSecond_divisor() {
        return second_divisor;
    }

    public void setRangeType(int rangeType) {
        this.rangeType = rangeType;
    }
    public int getFistyear() {
        return fist_year;
    }

    public int getSeocondYear() {
        return seocond_year;
    }
    public void printYears(){
         if ( this.rangeType ==1){
            for(int count= this.fist_year;count<=this.seocond_year;count++){
                if(count % this.first_divisor == 0  & count %  this.second_divisor == 0){
                    System.out.print(count+",");

                }

            }
        }
        else if( this.rangeType == 2){
            for(int count= this.fist_year;count<=this.seocond_year;count++){
                if(count % 4 ==0 ){
                   System.out.print(count+",");

                }


            }
         }
        else if ( this.rangeType ==3){
            for(int count= this.fist_year;count<=this.seocond_year;count++){
                if(count % this.first_divisor == 0  & count %  this.second_divisor == 0){
                    System.out.print(count+",");

                }

            }
        }
        else{
            System.out.print("Choose either 1, or 2 or 3");
        }


    }



    public static void main(String[] args) {

        //Get all years divisible by 14 and 20

        yearRangeV myFirstRange = new yearRangeV(1314, 2014);//specifies the  borders
         myFirstRange.setRangeType(1); //specifies the Range type
        myFirstRange.setFirst_divisor(14); //specifies the first dividor
        myFirstRange.setSecond_divisor(20); //specifies the second dividor
        System.out.println("List of all years divisible by "+ myFirstRange.getFirst_divisor() + " and " + myFirstRange.getSecond_divisor()); 
        myFirstRange.printYears(); // print out
        System.out.println();

        //Get all leap years.
         System.out.println();
        yearRangeV mySecondRange = new yearRangeV(1100, 3150); //specifies the  borders
        mySecondRange.setRangeType(2);//specfies the range type
        System.out.println("List of all leap years between " + mySecondRange.getFistyear() + " and "+ mySecondRange.getSeocondYear());
        mySecondRange.printYears();
        System.out.println();

        //Get all Olympic years divisible by 3
         System.out.println();
        yearRangeV myThirdRange = new yearRangeV(1500, 1890); 
        myThirdRange.setRangeType(3);
        myThirdRange.setFirst_divisor(3); //specifies the first dividor
        myThirdRange.setSecond_divisor(4);//every olympic year comes after 4 years
        System.out.println("List of all Olympic years between " + myThirdRange.getFistyear() + 
        " and " + myThirdRange.getSeocondYear() + " that are divisible by " + myThirdRange.getFirst_divisor()); 
        myThirdRange.printYears();
        System.out.println();



    }

} 