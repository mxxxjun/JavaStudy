public class Switch {
    public static void main(String args[]){
        int ranking = 2;

        if(ranking == 1){
            System.out.println("축하합니다.금메달이에요.");
        } else if(ranking == 2){
            System.out.println("은메달을 수여합니다.");
        } else if(ranking == 3){
            System.out.println("동메달입니다.");
        } else{
            System.out.println("참가상을 드립니다.");
        }

        switch(ranking){
            case 1:
                System.out.println("축하합니다. 금메달이에요.");
                break;
            case 2:
                System.out.println("은메달을 수여합니다.");
                break;
            case 3:
                System.out.println("동메달입니다.");
                break;
            default:
                System.out.println("참가상을 드립니다.");
                break;
        }

        switch(ranking){
            case 1:
                System.out.println("대상입니다.");
                break;
            case 2:
            case 3:
                System.out.println("우수상입니다.");
                break;
            case 4:
            case 5:
                System.out.println("장려상입니다.");
                break;
        }

        int days;
        int month = 5;

        switch(month){
            case 2:
                days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            default:
                days = 31;
                break;
        }

        System.out.println(month + "월은 " + days + "일까지 있습니다.");

        String country = "China";

        switch(country){
            case "Korea":
                System.out.println("Seoul");
                break;
            case "China":
                System.out.println("Beijing");
                break;
            case "Japan":
                System.out.println("Tokyo");
                break;
        }

        country = "CHINA";
        switch(country.toLowerCase()){
            case "korea":
                System.out.println("Seoul");
                break;
            case "china":
                System.out.println("Beijing");
                break;
            case "japan":
                System.out.println("Tokyo");
                break;
        }

        int score = 82;

        switch(score/10){
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }

        double richter = 6.5;

        if(richter < 3.5){
            System.out.println("느낄 수 없거나 피해가 거의 없음");
        } else if(richter < 4.8){
            System.out.println("물건이 흔들리거나 경미한 피해를 입힌다.");
        } else if(richter < 6.1){
            System.out.println("좁은 지역에 부실한 건물에만 피해를 입힌다.");
        } else if(richter < 7.5){
            System.out.println("반경 160Km 영역의 건물을 파괴한다.");
        } else if(richter < 8.9){
            System.out.println("넓은 지역에 심각한 피해를 입힌다.");
        } else{
            System.out.println("수천 Km 영역을 초토화시킨다.");
        }

        ranking = 2;
        String medal =
                switch (ranking){
                    case 1 -> "금메달";
                    case 2 -> "은메달";
                    case 3 -> "동메달";
                    default -> "참가상";
                };

        System.out.println(medal + "을 수여합니다.");

        ranking = 1;
        switch (ranking){
            case 1 -> System.out.println("축하합니다. 금메달이에요.");
            case 2 -> System.out.println("은메달을 수여합니다.");
            case 3 -> System.out.println("동메달입니다.");
            default -> System.out.println("참가상을 드립니다.");
        };

        medal = switch (ranking){
            case 1 -> {
                System.out.println("축하합니다.");
                yield "금메달";
            }
            case 2 -> "은메달";
            case 3 -> "동메달";
            default -> "참가상";
        };

        System.out.println(medal + "을 수여합니다.");

        boolean card = false;
        int money = 6000;

        if(card){
            System.out.println("탕수육을 먹겠다.");
        } else{
            if(money>5000){
                System.out.println("짬뽕을 먹겠다.");
            } else{
                System.out.println("짜장면을 먹겠다.");
            }
        }
    }
}
