package com.javaex.ks;

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface Fightable {               // 인터페이스는 public abstract
    public void move(int x, int y);
    public void attack(Fightable f);
}

class Fighter extends Unit implements Fightable{
    public void move(int x, int y){             // 오버라이딩 규칙 : 조상보다 접근 제어자가 좁으면 안된다.
        System.out.println("[" + x + "," + y+ "]로 이동");

    }
    public void attack(Fightable f){
        System.out.println(f+"를 공격");
    }

    Fightable getFightable(){
        Fighter f = new Fighter();
        return f;
    }
}


public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());

        Fightable f2 = f.getFightable();
    }
}
