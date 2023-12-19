//Given a route containing 4 direction (N,S,E,W ),
//FIND the shortest path to reach destination

/* to find shortest distance which is called displacement there is a formula in phy
for it which is sqrt((x2^2-w1^2)+(y2^2-y1^2)); */

public class Shortest_Path {
    public static float getShortestPath(String path){
        int x = 0, y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //north
            else if(dir=='N'){
                y++;
            }
            //west
            else if (dir=='W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }
        int X2 = (x * x);
        int Y2 = (y*y);
        return (float)Math.sqrt(X2 + Y2); //we have did type cast in float beacause by default sqrt deals with double
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
