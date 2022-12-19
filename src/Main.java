
public class Main {
    public static void main(String[] args) {
        Object array1[] = new Object[]{0,"ahmet",1,3,0,8,"ayse",5,7,2,0};
        for(int i = 0 ; i< array1.length ; i++){
            if(array1[i].equals(0)){
                for(int j = i ; j< array1.length-1 ; j++){
                    array1[j]=array1[j+1];
                }
                array1[array1.length-1]=0;
            }
        }
        for(int i=0;i< array1.length;i++){
            System.out.print(array1[i]+", ");
        }
    }
}