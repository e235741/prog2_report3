package jp.ac.uryukyu.ie.e235741;

public class Warrior extends Hero{
    public Warrior(String name,int hitPoint,int attack){
        super(name, hitPoint, attack);
    }

    public void attackWithWeponSkill(LivingThing livingThing){
        if (getHitPoint() > 0 && livingThing.getHitPoint() > 0){
            int plusdamage = getAttack() / 2;
            int damage = getAttack() + plusdamage;
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n",getName(),livingThing.getName(),damage);
            livingThing.wounded(damage);
        }
    }
}
