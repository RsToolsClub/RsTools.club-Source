// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.sql.SQLException;
import java.sql.Connection;

public abstract class BusyHandler
{
    private static void commitHandler(final Connection connection, final BusyHandler busyHandler) throws SQLException {
        if (connection == null || !(connection instanceof SQLiteConnection)) {
            throw (Throwable)mn.k(-886637961, new Object[] { Function$ProgressHandler.Y("\uce7d\u5ddb\u1a89\uf903\u034c\ud2d3\ua865\u739b\uc4fe\ufe98\u99fe\ua615\u3374\u751c\u896c\u71eb\ud807\u074d\u069b\uf67c\ua09e\uc90c\u0081\u4733\u184c\u5773\uf1b1\u90b3\u4e77\ub84b\u28a2\u587c\u7d53\uc89d") });
        }
        if (mn.t(connection, -272369034, null)) {
            throw (Throwable)mn.k(-886637961, new Object[] { Function$ProgressHandler.Y("\uce7d\u5ddb\u1a89\uf903\u034c\ud2d3\ua865\u739b\uc4fe\ufe98\u99fe\ua61b\u336d\u7500\u896b\u71ae\ud801") });
        }
        mn.t(mn.t(connection, 1420556925, null), -1237910916, new Object[] { busyHandler });
    }
    
    public static final void setHandler(final Connection connection, final BusyHandler busyHandler) throws SQLException {
        mn.W(-479528325, new Object[] { connection, busyHandler });
    }
    
    public static final void clearHandler(final Connection connection) throws SQLException {
        mn.W(-479528325, new Object[] { connection, null });
    }
    
    protected abstract int callback(final int p0) throws SQLException;
}
