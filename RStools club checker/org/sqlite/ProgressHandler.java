// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.sql.SQLException;
import java.sql.Connection;

public abstract class ProgressHandler
{
    public static final void setHandler(final Connection connection, final int i, final ProgressHandler progressHandler) throws SQLException {
        if (connection == null || !(connection instanceof SQLiteConnection)) {
            throw (Throwable)mn.k(-886637961, new Object[] { Function$ProgressHandler.Y("\ue203\u2b12\uc3a4\ucdfd\u443e\uc3de\u624a?\ubb1a\ucad7\udf55\u41d2\u34af\u3060\ud897\u54db\u7edd\u4118\u5fb5\u24f1\u67d8\ubddf\u2ef3\uc540\u91c2\ud0ce\u8699\u01c6\u8ac9\u1440\u5079\u859c\u9572\u1603") });
        }
        if (mn.t(connection, -272369034, null)) {
            throw (Throwable)mn.k(-886637961, new Object[] { Function$ProgressHandler.Y("\ue203\u2b12\uc3a4\ucdfd\u443e\uc3de\u624a?\ubb1a\ucad7\udf55\u41dc\u34b6\u307c\ud890\u549e\u7edb") });
        }
        mn.t(mn.t(connection, 1420556925, null), -175441186, new Object[] { i, progressHandler });
    }
    
    public static final void clearHandler(final Connection connection) throws SQLException {
        mn.t(mn.t(connection, 1420556925, null), 1455553253, null);
    }
    
    protected abstract int progress() throws SQLException;
}
