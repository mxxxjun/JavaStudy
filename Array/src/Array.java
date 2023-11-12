public class Array {
    public static void main(String[] args) {
        int[] score1 = new int[5];
        score1[0] = 88;
        score1[1] = 99;
        score1[2] = 70;
        score1[3] = 55;
        score1[4] = 100;

        for(int i=0; i<score1.length; i++){
            System.out.println( (i+1) + "번 학생의 성적 : " + score1[i] );
        }
        System.out.println();

        //간편한 초기화
        int[] score2 = new int[]{88, 99, 70, 55, 100};

        for(int i=0; i < score2.length; i++){
            System.out.println( (i+1) + "번 학생의 성적 : " + score2[i] );
        }

        System.out.println();
        //재초기화
        score2 = new int[]{1,2,3,4,5,6,7,8};
        for(int i=0; i<score2.length; i++){
            System.out.print(score2[i] + ",");
        }

        System.out.println("\n");
        int[] score3 = {88, 94, 72, 75, 23};
        int sum = 0;
        for(int i=0; i < score3.length; i++){
            sum += score3[i];
        }
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + (float)sum / score3.length);

        int[][] scores1 = {
                {77, 56, 70, 82},
                {99, 96, 89, 88},
                {81, 69, 62, 80}
        };

        for(int student = 0; student < scores1.length; student++){
            System.out.print( (student + 1) + "번 학생의 성적 : " );
            for(int subject=0; subject < scores1[0].length; subject++){
                System.out.print(scores1[student][subject] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] scores2 = {
                {77, 56, 70, 82},
                {99, 96, 89, 88},
                {81, 69, 62, 80}
        };

        int classSum = 0;
        for(int student = 0; student < scores2.length; student++){
            sum = 0;
            for(int subject = 0; subject < scores2[0].length; subject++){
                sum += scores2[student][subject];
            }
            System.out.println( (student + 1) + "번 => 총점 : " + sum + ", 평균 : " + (float)sum/scores2[0].length );
            classSum += sum;
        }
        System.out.println("학급 전체 평균 : " + (float)classSum/(scores2.length * scores2[0].length));
        System.out.println();
        int[][] raggedScores = {
                {77, 56, 70, 82, 95, 96, 98, 82},
                {99, 96},
                {81, 69, 62, 80, 77}
        };

        for(int student = 0; student < raggedScores.length; student++){
            System.out.print( (student + 1) + "번 학생의 성적 : " );
            for(int subject = 0; subject < raggedScores[student].length; subject++){
                System.out.print(raggedScores[student][subject] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[] score4 = { 88, 94, 72, 75, 23 };
        sum = 0;
        for(int s : score4){
            sum += s;
        }
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + (float)sum/score4.length);
        System.out.println();
        int score5[] = { 88, 94, 72, 75, 23};
        for(int s : score5){
            s++;
        }
        System.out.println("score5[0] = " + score5[0]);
        System.out.println();
        int[][] scores3 = {
                {77, 56, 70, 82},
                {99, 96, 89, 88},
                {81, 69, 62, 80}
        };

        for(int[] student : scores3){
            for(int subject : student){
                System.out.print(subject + ",");
            }
            System.out.println();
        }
    }
}