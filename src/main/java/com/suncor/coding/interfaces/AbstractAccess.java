package com.suncor.coding.interfaces;

/**
 * @Author sunc
 * @Description TODO
 * @info com.suncor.coding.interfaces AbstractAccess 2020/1/16 13:30
 */
abstract class AbstractAccess {

    private void m1() {}

    // private abstract void m1a(); // illegal

    protected void m2() {}

    protected abstract void m2a();

    void m3() {}

    abstract void m3a();

    public void m4() {}

    public abstract void m4a();
}
