
class AntMove {
    public static void main(String[] args) {
        System.out.println(isRobotBounded("GGLLGG"));
        System.out.println(isRobotBounded("GG"));
        System.out.println(isRobotBounded("GL"));
    }
    static public boolean isRobotBounded(String instructions) {
        int top=0;
        int right=0;
        int dir=0;
         for(int i=0;i<instructions.length();i++){
            if(instructions.charAt(i)== 'G'){
                if (dir%2==0) {
                    
                }
                
            }else{
                dir++;
             }
    
             if (dir%2==0) {
                
            dir=dir%2;
             }
        }
        return top==0 && right==0;
        }
}

