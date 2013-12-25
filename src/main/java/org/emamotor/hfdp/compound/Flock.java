package org.emamotor.hfdp.compound;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yoshimasa Tanabe
 */
public class Flock implements Quackable {
    private List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        for (Quackable quacker : quackers) {
            quacker.quack();
        }
    }
}