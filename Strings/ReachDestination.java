public class ReachDestination {

    public static float disPlacement(String path){
        int x = 0, y = 0;
        
        for(int i = 0; i < path.length(); i++){
            int dir = path.charAt(i);
            if(dir == 'W'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'E'){
                x++;
            }
            else if(dir == 'S'){
                x--;
            }
        }
        
        return (float)Math.sqrt((x*x) + (y*y));
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(disPlacement(path));;

    }
}
