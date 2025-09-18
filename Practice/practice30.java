

import java.util.Scanner;

public class practice30 {
    public static float getshortestpath(String path) {
 int x=0 , y=0 ;
 
 for(int i=0; i<path.length(); i++){
  char dir = path.charAt(i);

//     DIRECTION:

//               N
//               . 
//          W .  .  . E
//               .
//               S




  //south
  if(dir == 's'){
    y--;

  }
  //north 
  else if (dir == 'N'){
    y++;

  }
  //west
  else if(dir == 'w'){
    x--;

  }
  //East
  else {
    x++;
  }
    
}
 int x2 = x*x;
 int y2 = y*y;
 return (float)Math.sqrt(x2 + y2);
}
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  String path = sc.nextLine();
  System.out.println(getshortestpath(path));
}
}