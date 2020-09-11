// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverPropertyInfo;
import java.util.Properties;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import java.sql.Driver;

public class JDBC implements Driver
{
    public static final String PREFIX;
    
    public int getMajorVersion() {
        return (int)mn.W(-1066010279, null);
    }
    
    public int getMinorVersion() {
        return (int)mn.W(1514076504, null);
    }
    
    public boolean jdbcCompliant() {
        return false;
    }
    
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
    
    public boolean acceptsURL(final String s) {
        return (boolean)mn.W(822081879, new Object[] { s });
    }
    
    public static boolean isValidURL(final String s) {
        return s != null && (boolean)mn.t(mn.t(s, 17037700, null), -1289880677, new Object[] { Function$ProgressHandler.Y("\ufd7e\u6b78\u34f9\u78b0\u68f0\u884e\u10e7\u34d3\uc3d0\uc336\u257e\ueb93") });
    }
    
    public DriverPropertyInfo[] getPropertyInfo(final String s, final Properties properties) throws SQLException {
        return (DriverPropertyInfo[])mn.W(-130877098, null);
    }
    
    public Connection connect(final String s, final Properties properties) throws SQLException {
        return (Connection)mn.W(859044891, new Object[] { s, properties });
    }
    
    static String extractAddress(final String s) {
        return (String)mn.t(s, 716569489, new Object[] { (int)mn.t(SQLiteDataSource$SQLiteDataSource.G("\u7436\ud54c\ub886\ud127\ua635\u5b8b\uef23\ue401\u05d0\u719c\u8f00\u829d"), -1436222475, null) });
    }
    
    public static SQLiteConnection createConnection(final String s, final Properties properties) throws SQLException {
        if (!(boolean)mn.W(822081879, new Object[] { s })) {
            return null;
        }
        final Object t;
        return (SQLiteConnection)mn.k(18807132, new Object[] { t, mn.W(-1603471011, new Object[] { t = mn.t(s, 353499525, null) }), properties });
    }
    
    static {
        PREFIX = SQLiteDataSource$SQLiteDataSource.G("\u9317\u67bf\ube15\u554a\ub062\u43d6\ua6b5\ub68a\ud202\u8f8f\u828f\u0fac");
        try {
            mn.W(-484968102, new Object[] { mn.k(374143323, null) });
        }
        catch (SQLException ex) {
            mn.t(ex, -1138230959, null);
        }
    }
}
