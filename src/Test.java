import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Creat_Array_List myArray = new Creat_Array_List();
        int[] myList = myArray.creatIntList(100);
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter index of array: ");
            int index = scan.nextInt();
            System.out.println("Element " + index+"th is "+ myList[index]);
        }
        catch (IndexOutOfBoundsException e){
            System.err.println("Element out of bound array");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
