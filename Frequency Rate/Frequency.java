public class Frequency {
    public static void main(String[] args) {     
        int numbers [] = {1,3,4,2,4,3,4,2,3,2,3,4,2};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == -1)continue;

            int count = 1;
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                    numbers[j] = -1;
                }

                
            } 
             System.out.println(numbers[i] + " appears " + count+ " times");
        }

    }
}