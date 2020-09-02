public class BuildingV {

    private String nameOfBulding;
    private int numberOfFloor;
    private int numberOfRoomsPerFloor;
    private String color;

    public BuildingV() {
    }

    public BuildingV(String nameOfBulding, int numberOfFloor, int numberOfRoomsPerFloor, String color) {
        this.nameOfBulding = nameOfBulding;
        this.numberOfFloor = numberOfFloor;
        this.numberOfRoomsPerFloor = numberOfRoomsPerFloor;
        this.color = color;
    }


    public void setNameOfBulding(String nameOfBulding) {
        this.nameOfBulding = nameOfBulding;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public void setNumberOfRoomsPerFloor(int numberOfRoomsPerFloor) {
        this.numberOfRoomsPerFloor = numberOfRoomsPerFloor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNameOfBulding() {
        return nameOfBulding;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public int getNumberOfRoomsPerFloor() {
        return numberOfRoomsPerFloor;
    }

    public String getColor() {
        return color;
    }

    public static void main(String[] args) {

        BuildingV[]building = new BuildingV[5];
        building[0] =new BuildingV("Bulding1",5,7,"Red");
        building[1] =new BuildingV("Bulding2",4,6,"Green");
        building[2] =new BuildingV("Bulding3",2,7,"Blue");
        building[3] =new BuildingV("Bulding4",8,2,"White");
        building[4] =new BuildingV("Bulding5",5,9,"Black");
        System.out.println("---------Start of report-----------------");
        for(int count =0;  count < building.length ; count ++){
            System.out.println(building[count].getNameOfBulding() + " is a " + building[count].getColor() +
                    " building and has " +(building[count].getNumberOfFloor() * building[count].getNumberOfRoomsPerFloor()) + " rooms " );
        }
        System.out.println("---------End of report-----------------");


    }

}