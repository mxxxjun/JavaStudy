public class TextBlock1 {
    public static void main(String args[]){
        /*
        이러한 형식을 텍스트 블록이라 한다.
         */
        String str = """
                    아름다운 이땅에 금수강산에
                    단군 할아버지가 "터" 잡으시고
                    '弘益人間' 뜻으로 나라 세우니
                    대대손손 훌륭한 인물도 많아.
                """;

        System.out.println(str);

        String query = """
                SELECT M.addr, M.member, O.item, O.num, O.orderDate\
                FROM tMember M\
                INNER JOIN tOrder O\
                ON M.member = O.member
                """;

        System.out.println(query);
    }
}
