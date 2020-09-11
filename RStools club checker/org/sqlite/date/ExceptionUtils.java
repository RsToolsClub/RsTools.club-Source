// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.date;

public class ExceptionUtils
{
    public static <R> R rethrow(final Throwable t) {
        return (R)b.q(1990186762, new Object[] { t });
    }
    
    private static <R, T extends Throwable> R typeErasure(final Throwable t) throws T, Throwable {
        throw t;
    }
}
