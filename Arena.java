import java.util.ArrayList;
import java.util.List;
import java.util.Random;
// import java.util.*

class Arena {

    public static void main(String[] args) {
        Random random = new Random();
        // create two monsters
        Monster monster1 = new AirMonster("Djamel", random.nextInt(20));
        Monster monster2 = new WaterMonster("Marko", random.nextInt(20));
        Monster monster3 = new FireMonster("NicoBanana", random.nextInt(20));

        // System.out.println("Combat entre " + monster1.getName() + " et " + monster2.getName() + " :");

        System.out.println(monster1.getName() + " a " + monster1.getLife() + " points de vie et " + monster1.getAttack() + " points d'attaque");
        System.out.println(monster2.getName() + " a " + monster2.getLife() + " points de vie et " + monster2.getAttack() + " points d'attaque");
        System.out.println(monster3.getName() + " a " + monster3.getLife() + " points de vie et " + monster3.getAttack() + " points d'attaque");

        // monsters attack each other
        // while (monster1.getLife() > 0 && monster2.getLife() > 0) {
        //     monster1.attack(monster2);
        //     if (monster2.getLife() > 0) {
        //         monster2.attack(monster1);
        //     }
        // }
        // Monster monsterRandom1 = monster(random.nextInt(3)+1);
        // Monster monsterRandom2 = monster(random.nextInt(3)+1);

        List<Monster> monsters = new ArrayList<>();
        monsters.add(monster1);
        monsters.add(monster2);
        monsters.add(monster3);

        Monster monsterRandom1 = monsters.get(random.nextInt(monsters.size()));
        
        Monster monsterRandom2 = monsters.get(random.nextInt(monsters.size()));
        
        System.out.println("Combat entre " + monsterRandom1.getName() + " et " + monsterRandom2.getName() + " :");

        
        // while (monsterRandom1.getLife() > 0 && monsterRandom2.getLife() > 0) {
        //     monsterRandom1.attack(monsterRandom2);
        //     if (monsterRandom2.getLife() > 0) {
        //         monsterRandom2.attack(monsterRandom1);
        //     }
        // }
        
        if (monsterRandom1 != monsterRandom2) {
            while (monsterRandom1.getLife() > 0 && monsterRandom2.getLife() > 0) {
                monsterRandom1.attack(monsterRandom2);
                if (monsterRandom2.getLife() > 0) {
                monsterRandom2.attack(monsterRandom1);
                }
            }
        } else {
            System.out.println("Tiens ton canoë, tiens ton canoë !");
        }        
    }
}