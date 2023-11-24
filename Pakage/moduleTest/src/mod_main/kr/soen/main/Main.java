package kr.soen.main;
import kr.soen.util.Util;
import java.util.logging.Logger;

public class Main{
    public static void main(String[] args){
        System.out.println(Util.add(12,34));
	Logger log = Logger.getLogger(Main.class.getName());
	log.info("Program Start");
    }
}