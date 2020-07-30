package doviHW.com.hw20200729;

/**
 * @author Dovi Lilling
 */

public class Elf extends Hero{

    public Elf(){
        elfInception();
        setName();
    }

    public Elf(String newName){
        elfInception();
        setName(newName);
    }

    private void elfInception(){
        heroInception(10, 10);
    }

    @Override
    public void kick(Hero enemy) {
        if (isAlive()){
            if (enemy.getPower() < getPower()){
                enemy.modifyHp(-1 * enemy.getHp());
                System.out.println(getName() + " killed " + enemy.getName() + " using his special elvish attack!");
            } else {
                enemy.modifyPower(-1);
                System.out.println(getName() + " decreased 1 power point from " + enemy.getName() + ". Fighting elves is dangerous!");
            }
        }
    }
}
