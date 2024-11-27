public class Day01Star2 {
    private String input;

    public Day01Star2(String input){
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


            if(random_value == -1){
                return (i+1);
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        String input ="()())";

        Day01Star2 firstAttempt =new  Day01Star2(input);

        System.out.println(firstAttempt.part1());
    }
}
