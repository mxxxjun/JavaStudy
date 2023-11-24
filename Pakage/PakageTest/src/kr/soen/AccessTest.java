package kr.soen;

import kr.soen.library.Util;

import java.util.logging.Logger;


public class AccessTest {
    public static void main(String[] args){
        Util.mpublic();
        //Util.mprivate();
        //Util.mprotected();
        //Util.mdefault();

        System.out.println();

        Logger log = Logger.getLogger(AccessTest.class.getName());
        log.info("Program Start");
        log.warning("watch out");
    }
}

class SubUtil extends Util{
    void method(){
        Util.mpublic();
        //Util.mprivate();
        Util.mprotected();
        //Util.mdefault();
    }
}