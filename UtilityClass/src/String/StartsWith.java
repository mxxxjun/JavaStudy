package String;

public class StartsWith {
    public static void main(String[] args){
        String[] files = {
                "girl.jpg",
                "boy.png",
                "child.avi",
                "school.jpg",
                "book.gif"
        };

        for(String s : files){
            if(s.endsWith(".jpg")) System.out.println(s);
        }
    }
}
