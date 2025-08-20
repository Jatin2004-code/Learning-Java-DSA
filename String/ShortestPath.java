package String;

import Statements.elseif;

public class ShortestPath {
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
    String path = "WNEENESENNN";
    System.out.println(getshortestpath(path));
}
}
