public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i == 0) 
            continue;
                {
                    System.out.println(i * 1);
                    if (i == 10 ) {
                        break;
                    }
                }
        }
    }
}