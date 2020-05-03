public class Creat_Array_List {
    int[] creatIntList(int size){
        int[] myArrayList = new int[size];
        for(int i=0; i< myArrayList.length; i++){
            myArrayList[i] = (int) Math.floor(Math.random()*100);
        }
        return myArrayList;
    }
}
