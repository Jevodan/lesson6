package ru.jevo.animation.pools.ships;

import ru.jevo.animation.basic.Pool;
import ru.jevo.animation.pools.weapons.BulletPool;
import ru.jevo.animation.sprites.ships.MilitarySmall;


/**
 * Created by Alexander on 08.12.2018.
 */
public class MilitarySmallPool extends Pool<MilitarySmall> {

    public MilitarySmallPool(BulletPool bulletPool) {
        this.mBulletPool = bulletPool;

    }
    @Override
    protected MilitarySmall newObject() {
        return new MilitarySmall(mBulletPool);
    }
}
