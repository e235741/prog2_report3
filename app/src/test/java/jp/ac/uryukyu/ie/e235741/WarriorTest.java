package jp.ac.uryukyu.ie.e235741;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WarriorTest {
    @Test
    void warriorTest(){
        int defaultWarriorHp = 100;
        Warrior demoWarrior = new Warrior("デモ戦士", defaultWarriorHp, 10);
        LivingThing slime = new LivingThing("スライムもどき", 100, 10);
        for (int i = 0;i < 3;i++){
            int preSlimeHitPoint = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(preSlimeHitPoint - demoWarrior.getAttack()*1.5, slime.getHitPoint());
        }
    }
}
