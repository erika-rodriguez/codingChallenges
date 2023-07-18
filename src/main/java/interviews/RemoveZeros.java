package interviews;
//Remove the last zeros from a number: example: 1230100 -> 12301, 240 -> 24

public class RemoveZeros {
    public static void main(String[] args){
        System.out.println(solution(20400));
    }
    public static int solution(int input){
        if(input!=0){
            while(input%10==0){
                input/=10;
            }
        }
        return  input;
    }

}
