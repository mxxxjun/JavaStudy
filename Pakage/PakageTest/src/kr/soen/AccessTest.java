package kr.soen;

import kr.soen.library.Util;

public class AccessTest {
    public static void main(String[] args){
        Util.mpublic();
        //Util.mprivate();
        //Util.mprotected();
        //Util.mdefault();
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