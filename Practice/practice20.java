import java.util.*;
public class practice20 {
    public static int linearsearch(int number[],int key) {
        for(int i=0; i<number.length; i++){
        if(number[i]==key){
            return i;
        }
        }
        return -1;
    }
public static void main(String[] args) {
    int number [] = {2,4,6,8,10,12,14,16};

System.out.println("Enter kye value number :"); 

   Scanner sc = new Scanner(System.in);
    int key = sc.nextInt();
   
    
    int index= linearsearch(number, key);
    if(index==-1){
        System.out.println("key is not find");

    }else{
        System.out.println("key is at index :"+index);
        System.out.println("Key is found ............");
        
    }
    
}


        
    }
    

