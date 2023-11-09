public class TextBlock3 {
    public static void main(String args[]){
        String human = """
                이름 : 김상형    \s
                나이 : 39       \s
                직업 : 프로그래머 \s
                """;

        System.out.println(human);

        String str1 = """
                <body>
                    <p>문단</p>
                </body>
                """;

        System.out.println(str1);

        String name = "노명준";
        String str2 = """
                안녕하세요.
                제 이름은\s""" + name + """
                입니다.
                잘 부탁 드립니다.
                """;

        System.out.println(str2);


        int width = 8;
        int height = 12;
        int area = width * height;
        System.out.println(area);
    }
}
