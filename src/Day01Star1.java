public class Day01Star1 {
    private String input;

    public Day01Star1(String input){
        this.input = input;
    }

    public int part1(){
        int random_value = 0;

        for(int i=0; i < input.length(); i++){
            char a = input.charAt(i);
            if(a == '('){
                random_value++;
            } else if (a == ')') {
                random_value--;
            }
        }

        return random_value;
    }

    public static void main(String[] args) {

        String input ="(()(()(";

        Day01Star1 firstAttempt =new  Day01Star1(input);

        System.out.println(firstAttempt.part1());
    }
}
