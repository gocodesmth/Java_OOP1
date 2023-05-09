package Seminars.Lesson2;

import hero.*;

public class Task1 {
    public static void main(String[] args) {


        Peasant peasant = new Peasant("John", 5, 100);

        Rogue rogue = new Rogue("Alice", 5, 150);

        Sniper sniper = new Sniper("Bob", 5, 120);

        Warlock warlock = new Warlock("Eve", 5, 80);

        Spearman spearman = new Spearman("David", 5, 200);

        Crossbowman crossbowman = new Crossbowman("Olivia", 5, 110);

        Monk monk = new Monk("Grace", 5, 90);


        System.out.println(  );
        peasant.attack(rogue);
        peasant.harvest();
        rogue.attack(spearman);
        rogue.die();
        sniper.rest(50);
        sniper.aim();
        warlock.rest(30);
        warlock.curse();
        crossbowman.attack(monk);
        crossbowman.reload();
        spearman.takeDamage(50);
        spearman.brace();
        monk.rest(20);
        monk.heal();

        System.out.println( "\n" + peasant );
        System.out.println( rogue );
        System.out.println( sniper );
        System.out.println( warlock );
        System.out.println( crossbowman );
        System.out.println( spearman );
        System.out.println( monk + "\n" );
    }
}