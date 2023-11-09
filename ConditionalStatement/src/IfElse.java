public class IfElse {
    public static void main(String[] args) {
        int age = 21;

        if(age >= 19){
            System.out.println("성인입니다.");
        }

        age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("너 몇살이니?"));

        if(age >= 19){
            System.out.println("성인입니다.");
        }

        age = 21;
        if(age >= 19){
            System.out.println("성인입니다.");
            System.out.println("술집 입장.");
        }

        age = 15;

        if(age >= 19)
            System.out.println("성인입니다.");

        System.out.println("술집 입장.");

        age = 15;

        if(age >= 19){
            System.out.println("성인입니다.");
        }
        else{
            System.out.println("어린애입니다.");
        }

        age = 15;

        if(age >= 19){
            System.out.println("성인입니다.");
            System.out.println("디스코텍 입장.");
        } else {
            System.out.println("어린애입니다.");
            System.out.println("애들은 가라!");
        }

        age = 16;

        if(age >= 19){
            System.out.println("성인입니다.");
        } else if(age > 12){
            System.out.println("청소년입니다.");
        } else{
            System.out.println("어린애입니다.");
        }

        age = 25;
        boolean man = true;

        if(age >= 19){
            if(man){
                System.out.println("성인 남성 : 25000원");
            } else{
                System.out.println("성인 여성 : 21000원");
            }
        } else{
            System.out.println("청소년 : 15000원");
        }
    }
}