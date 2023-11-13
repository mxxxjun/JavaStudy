public class InitTest {
    int field = 1;

    {
        field = 2;
    }

    InitTest(){
        field = 3;
    }
}
