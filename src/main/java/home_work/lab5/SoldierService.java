package home_work.lab5;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public interface SoldierService {
    void addSoldier(Soldier soldier);

    int maxAge();

    double avgAge();

    int sumAge();

    void printAllNames();



}
