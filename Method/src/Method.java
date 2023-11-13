import java.time.LocalDateTime;

public class Method {
    public static void main(String[] args) {
        int sum;
        sum = 0;
        for(int i =1; i <= 10; i++){
            sum += i;
        }
        System.out.println("1 ~ 10 = " + sum);

        sum = 0;
        for(int i = 15; i <= 100; i++){
            sum += i;
        }
        System.out.println("15 ~ 100 = " + sum);
        System.out.println();

        System.out.println("1 ~ 10 = " + calcSum(1, 10));
        System.out.println("15 ~ 100 = " + calcSum(15, 100));
        System.out.println();

        int year = 2024;
        int month = 2;

        int days = getMonthDays(year, month);
        System.out.println(year + "년 " + month + "월은 " + days + "일까지 있습니다.");
        System.out.println();
        System.out.println("오늘은 " + getDate() + "일입니다.");
        System.out.println();
        System.out.println("1 ~ 10 = " + calcSum(1, 10));
        System.out.println("15 ~ 100 = " + calcSum(15, -100));
        System.out.println();
        printSum(1, 10);
        printSum(15, 100);
        System.out.println();
        for(int i = 1; i <= 10; i++){
            outStars(i);
            System.out.println();
        }
        System.out.println();
        for(int i=1; i <= 10; i++){
            outChars1(' ', 10-i);
            outChars1('*', i);
            System.out.println();
        }
        System.out.println();
        for(int i =1; i<=10; i++){
            outChars2(' ', 10-i, false);
            outChars2('*', i, true);
        }
        System.out.println();
        for(int i =1; i <= 10; i++){
            outChars1(' ', 10-i);
            outCharsln('*', i);
        }

        System.out.println();
        outCharsln('-', 5+4);
        System.out.println("| Hello |");
        outCharsln('-', 5+4);
        outCharsln('-', 14 + 4);
        System.out.println("|Congratulation|");
        outCharsln('-', 14 + 4);
        System.out.println();

        outBox("Hello");
        outBox("Congratulation");
        outBox("Good Morning");
    }

    static void outBox(String message){
        outCharsln('-', message.length() + 4);
        System.out.println("| " + message + " |");
        outCharsln('-', message.length() + 4);
    }

    static void outCharsln(char c, int num){
        outChars1(c,num);
        System.out.println();
    }

    static void outChars1(char c, int i){
        for(int k=0; k<i; k++){
            System.out.print(c);
        }
    }

    static void outChars2(char c, int i, boolean newline){
        for(int k=0; k<i; k++){
            System.out.print(c);
        }
        if(newline) System.out.println();
    }

    static void outStars(int num){
        for(int i = 0; i < num; i++){
            System.out.print('*');
        }
    }

    static void printSum(int from, int to){
        int sum = 0;
        for(int i = from; i <= to; i++){
            sum += i;
        }
        System.out.println(from + " ~ " + to + " = " + sum);
    }

    static int calcSum(int from, int to){
        if(from > to) return 0;
        int sum = 0;
        for(int i = from; i <= to; i++){
            sum += i;
        }

        return sum;
    }

    static int getMonthDays(int year, int month){
        int[] arrDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(month == 2){
            if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
                return 29;
            }
            return 28;
        } else{
            return arrDays[month];
        }
    }

    static int getDate(){
        LocalDateTime today = LocalDateTime.now();
        int day = today.getDayOfMonth();
        return day;
    }
}