public class UseArray {
    static double[] root2 = new double[100];

    static double getRoot(int i){
        if(root2[i] == 0){
            root2[i] = Math.sqrt(i);
        }
        return root2[i];
    }
    public static void main(String args[]){

        String pop = "Yesterday all my troubles seemed so far away" +
                "Now it looks as though they're here to stay" +
                "Oh, I believe in Yesterday" +
                "Suddenly I'm not half the man I used to be";

        pop = pop.toLowerCase();
        int[] alpha = new int[26];

        for(int a : alpha) System.out.print(a);
        System.out.println();

        for(int i=0; i< pop.length(); i++){
            char ch = pop.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                alpha[ch - 'a']++;
            }
        }

        for(int i=0; i < alpha.length; i++){
            char ch = (char)(i + 'a');
            System.out.println(ch + ":" + alpha[i]);
        }

        int[] arDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int month = 5;

        int days = arDays[month];
        System.out.println(month + " 월은 " + days + "일까지 있습니다.");

        int score = 5;
        String[] message = {
                "",
                "최고의 성적입니다. 축하합니다.",
                "우수한 성적입니다.",
                "보통입니다.",
                "다소 부진합니다. 더 노력하세요.",
                "왜 사니?"
        };
        int[] rank = {5, 4, 4, 3, 3, 3, 2, 2, 2, 1, 1};


        System.out.println(message[rank[score]]);

        double[] root1 = new double[100];

        for(int i=0; i<100; i++){
            root1[i] = Math.sqrt(i);
        }

        System.out.println("2의 제곱근 : " + root1[2]);
        System.out.println("2의 제곱근 : " + getRoot(2));
        System.out.println("5의 제곱근 : " + getRoot(5));
        System.out.println("2의 제곱근 : " + getRoot(2));

        int sum = 0;
        for(int i=0; i< args.length; i++){
            sum += Integer.parseInt(args[i]);
        }

        System.out.println("총합계 = " + sum);

        int[][] scores = {
                {77, 56, 70, 82},
                {99, 96, 89, 88},
                {81, 69, 62, 80}
        };

        int classSum = 0;
        for(int student = 0; student < scores.length; student++){
            sum = 0;
            for(int subject = 0; subject < scores[0].length; subject++){
                sum += scores[student][subject];
            }
            System.out.println( (student + 1) + "번 => 총점 : " + sum + ", 평균 : " + (float)sum/scores[0].length );
            classSum += sum;
        }
        System.out.println();
        sum=0;
        for(int i=0; i<scores[0].length; i++){
            sum = 0;
            for(int k=0; k<scores.length; k++){
                sum += scores[k][i];
            }
            System.out.println((i+1) + "번 과목의 총점 : " + sum + " 평균 : " + (float)sum/scores.length);
        }
    }
}
