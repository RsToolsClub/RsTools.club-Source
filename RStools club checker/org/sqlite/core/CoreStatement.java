// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.core;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.sqlite.SQLiteConnectionConfig;
import org.sqlite.SQLiteConnection;

public abstract class CoreStatement implements Codes
{
    public final SQLiteConnection conn;
    protected final CoreResultSet rs;
    public long pointer;
    protected String sql;
    protected int batchPos;
    protected Object[] batch;
    protected boolean resultsWaiting;
    
    protected CoreStatement(final SQLiteConnection sqLiteConnection) {
        b.J(this, 58743671, null);
        b.J(this, -389391802, null);
        b.J(this, -5088693, false);
        b.J(this, 754211407, sqLiteConnection);
        b.J(this, -1686414771, b.j(-2020124112, new Object[] { this }));
    }
    
    public DB getDatbase() {
        return (DB)b.N(b.h(this, 754211407), -22979604, null);
    }
    
    public SQLiteConnectionConfig getConnectionConfig() {
        return (SQLiteConnectionConfig)b.N(b.h(this, 754211407), 1594776517, null);
    }
    
    protected final void checkOpen() throws SQLException {
        if ((long)b.h(this, 1906203507) == 0L) {
            throw (Throwable)b.j(-108635167, new Object[] { CoreStatement$CoreStatement.F("\u648b\uddb1\u1215\ucc0e\u0cfb\u946c\u48e1\u9911\ufec5\u4521\u9e0a\u76d0\u3d2e\u7efe\u2347\u6c40\u6084\uf092\ue0e6\ufbbe\uf7ed\u447a\uad33\ufcdb\u5660\ub1ac") });
        }
    }
    
    boolean isOpen() throws SQLException {
        return (long)b.h(this, 1906203507) != 0L;
    }
    
    protected boolean exec() throws SQLException {
        if (b.h(this, 58743671) == null) {
            throw (Throwable)b.j(-108635167, new Object[] { CorePreparedStatement$CoreStatement.H("\u55e4\ud8a4\u857c\ub7d3\ufad3\u179f\ud987\u88c1\u30f2\u2b83\u5b88\uf84c\ud904\u5337\u5a1e\ub202\u3620\ub7d8\u69c7\ubb28\u7280\u216f\u7972\u8980\u6297\u60e4\u7ff3\u626e\u3a93\ubf81\ub0c1\u4da9\ua71d\u187a\u82db\u3d16") });
        }
        if (b.N(b.h(this, -1686414771), -372548671, null)) {
            throw (Throwable)b.j(-108635167, new Object[] { CorePreparedStatement$CoreStatement.H("\u55e4\ud8a4\u857c\ub7d3\ufad3\u179f\ud9ed\u88cf\u30f4\u2b82\u5beb\uf805\ud903\u532d\u5a0f\ub215\u363c\ub7d7\u69ca\ubb64\u72c5\u2178\u7972\u899d\u628a\u60ac\u7fe9\u623d\u3a90\ubf9e\ub0d2\u4dfd\ua700\u1840\u82c7\u3d1f\u1edf\ude51\u0336\ucd52\uedc7\ub068\ua64d\u5d7b\u8801\u8b41\uec28\u032a") });
        }
        boolean b = false;
        boolean booleanValue = false;
        try {
            booleanValue = (boolean)org.sqlite.core.b.N(org.sqlite.core.b.N(org.sqlite.core.b.h(this, 754211407), -22979604, null), -1902552498, new Object[] { this, null });
            b = true;
            org.sqlite.core.b.J(this, -5088693, booleanValue);
            if (!b) {
                (int)org.sqlite.core.b.N(org.sqlite.core.b.N(org.sqlite.core.b.h(this, 754211407), -22979604, null), -1566811271, new Object[] { this });
            }
        }
        finally {
            org.sqlite.core.b.J(this, -5088693, booleanValue);
            if (!b) {
                (int)org.sqlite.core.b.N(org.sqlite.core.b.N(org.sqlite.core.b.h(this, 754211407), -22979604, null), -1566811271, new Object[] { this });
            }
            throw;
        }
        return (int)org.sqlite.core.b.N(org.sqlite.core.b.N(org.sqlite.core.b.h(this, 754211407), -22979604, null), 881941482, new Object[] { (long)org.sqlite.core.b.h(this, 1906203507) }) != 0;
    }
    
    protected boolean exec(final String s) throws SQLException {
        if (s == null) {
            throw (Throwable)b.j(-108635167, new Object[] { CorePreparedStatement$CoreStatement.H("\u55e4\ud8a4\u857c\ub7d3\ufad3\u179f\ud987\u88c1\u30f2\u2b83\u5b88\uf84c\ud904\u5337\u5a1e\ub202\u3620\ub7d8\u69c7\ubb28\u7280\u216f\u7972\u8980\u6297\u60e4\u7ff3\u626e\u3a93\ubf81\ub0c1\u4da9\ua71d\u187a\u82db\u3d16") });
        }
        if (b.N(b.h(this, -1686414771), -372548671, null)) {
            throw (Throwable)b.j(-108635167, new Object[] { CorePreparedStatement$CoreStatement.H("\u55e4\ud8a4\u857c\ub7d3\ufad3\u179f\ud9ed\u88cf\u30f4\u2b82\u5beb\uf805\ud903\u532d\u5a0f\ub215\u363c\ub7d7\u69ca\ubb64\u72c5\u2178\u7972\u899d\u628a\u60ac\u7fe9\u623d\u3a90\ubf9e\ub0d2\u4dfd\ua700\u1840\u82c7\u3d1f\u1edf\ude51\u0336\ucd52\uedc7\ub068\ua64d\u5d7b\u8801\u8b41\uec28\u032a") });
        }
        boolean booleanValue = false;
        boolean b = false;
        try {
            booleanValue = (boolean)org.sqlite.core.b.N(org.sqlite.core.b.N(org.sqlite.core.b.h(this, 754211407), -22979604, null), -199075254, new Object[] { s, Boolean.valueOf((boolean)org.sqlite.core.b.N(org.sqlite.core.b.h(this, 754211407), -237872165, null)) });
            b = true;
            org.sqlite.core.b.J(this, -5088693, booleanValue);
            if (!b) {
                (int)org.sqlite.core.b.N(org.sqlite.core.b.N(org.sqlite.core.b.h(this, 754211407), -22979604, null), -1566811271, new Object[] { this });
            }
        }
        finally {
            org.sqlite.core.b.J(this, -5088693, booleanValue);
            if (!b) {
                (int)org.sqlite.core.b.N(org.sqlite.core.b.N(org.sqlite.core.b.h(this, 754211407), -22979604, null), -1566811271, new Object[] { this });
            }
            throw;
        }
        return (int)org.sqlite.core.b.N(org.sqlite.core.b.N(org.sqlite.core.b.h(this, 754211407), -22979604, null), 881941482, new Object[] { (long)org.sqlite.core.b.h(this, 1906203507) }) != 0;
    }
    
    protected void internalClose() throws SQLException {
        if ((long)b.h(this, 1906203507) == 0L) {
            return;
        }
        if (b.N(b.h(this, 754211407), -1772529105, null)) {
            throw (Throwable)b.K(411064920, new Object[] { 1, CorePreparedStatement$CoreStatement.H("\u50fd\ua5a4\u580d\u656d\u2dd0\u2897\uc2bc\u2ee2\u881b\uaf6b\u7c69\u09b8\u12c0\u225e\uc07f\u1861\u0993\uc21a\ue79c\uc4fc") });
        }
        b.N(b.h(this, -1686414771), -436250060, null);
        b.J(this, -389391802, null);
        b.J(this, 536566321, 0);
        final int intValue = (int)b.N(b.N(b.h(this, 754211407), -22979604, null), -1566811271, new Object[] { this });
        if (intValue != 0 && intValue != 21) {
            b.N(b.N(b.h(this, 754211407), -22979604, null), -1001825410, new Object[] { intValue });
        }
    }
    
    public abstract ResultSet executeQuery(final String p0, final boolean p1) throws SQLException;
}
