package com.allthelucky.perst;

import org.garret.perst.Persistent;

/**
 * 信�?�类
 */
public class Bin extends Persistent {
    public   String number;
    public   String message;
    
    public Bin() {

    }
    
    @Override
    public String toString() {
        return this.number+","+this.message;
    }
}
