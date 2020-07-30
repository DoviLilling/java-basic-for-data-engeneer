package doviHW.com.hw20200729;

public class HeroesOfMightAndMagicYeahRight {
    public static void main(String[] args) {
        Hero heroDovi = HeroFactory.createHero("Dovi");
        System.out.println(heroDovi.getName() + " is a " + heroDovi.getClass());
        heroDovi.print();
        Hero heroRandom = HeroFactory.createHero();
        System.out.println(heroRandom.getName() + " is a " + heroRandom.getClass());
        heroRandom.print();
        GameManager.fight(heroDovi, heroRandom);
    }
}
