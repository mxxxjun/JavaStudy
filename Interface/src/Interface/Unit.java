package Interface;

abstract class Unit {
    abstract void move();
    abstract void attack();
    int health = 100;
    void minusHealth(){
        if(health > 0) health--;
        else die();
    }

    void die(){
        System.out.println("으으읔~~");
    }
}
