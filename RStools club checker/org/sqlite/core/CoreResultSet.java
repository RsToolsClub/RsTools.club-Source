// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.core;

import java.sql.SQLException;
import org.sqlite.SQLiteConnectionConfig;
import java.util.Map;

public abstract class CoreResultSet implements Codes
{
    protected final CoreStatement stmt;
    public boolean open;
    public int maxRows;
    public String[] cols;
    public String[] colsMeta;
    protected boolean[][] meta;
    protected int limitRows;
    protected int row;
    protected int lastCol;
    public boolean closeStmt;
    protected Map<String, Integer> columnNameToIndex;
    
    protected CoreResultSet(final CoreStatement coreStatement) {
        b.J(this, -2011866537, false);
        b.J(this, -716154276, null);
        b.J(this, 74931181, null);
        b.J(this, -905029031, null);
        b.J(this, 1065704022, 0);
        b.J(this, 743332443, null);
        b.J(this, -526493120, coreStatement);
    }
    
    protected DB getDatabase() {
        return (DB)b.N(b.h(this, -526493120), -2063771043, null);
    }
    
    protected SQLiteConnectionConfig getConnectionConfig() {
        return (SQLiteConnectionConfig)b.N(b.h(this, -526493120), 1636981338, null);
    }
    
    public boolean isOpen() {
        return (boolean)b.h(this, -2011866537);
    }
    
    protected void checkOpen() throws SQLException {
        if (!(boolean)b.h(this, -2011866537)) {
            throw (Throwable)b.j(-108635167, new Object[] { CorePreparedStatement$CoreStatement.H("\u3602\u39c5\u0e42\ub980\u01e1\uf6b4\u1520\u33c7\u0af8\u4e24\ucbda\u59f0\u86ca\u6de7\uf8bb\u66a2") });
        }
    }
    
    public int checkCol(int i) throws SQLException {
        if (b.h(this, 74931181) == null) {
            throw (Throwable)b.j(1339578943, new Object[] { CorePreparedStatement$CoreStatement.H("\u184c\ub209\udf98\uf93e\uaeac\u533e\u2dec\ub7da\u6e25\u32a8\u0432\ue273\u7777\u4041\u1682\ud67f\u1ffb\u0e94\u5a5b\uf85a\u0eaa\ufbd4\uaed8\ub137\ua2e7\ue03b\ua57b\ueab0\u0bb7\u4e3c\ua813\uccc8\ue5aa¾\u3d43\ufaa7\u2e41\u5c8a\ua128\ube57") });
        }
        if (i < 1 || i > ((Object[])b.h(this, 74931181)).length) {
            throw (Throwable)b.j(-108635167, new Object[] { b.N(b.N(b.N(b.N(b.N(b.N(b.j(-1322689945, null), -253076884, new Object[] { CorePreparedStatement$CoreStatement.H("\u187c\ub237\udfb8\uf922\uaeb5\u5335\u2dec") }), -837789077, new Object[] { i }), -253076884, new Object[] { CorePreparedStatement$CoreStatement.H("\u183f\ub237\udfa1\uf923\uaef8\u5334\u2daa\ub7b0\u6e03\u3285\u0404\ue227\u7733\u405b\u16cc\ud647\u1fa5\u0ed6") }), -837789077, new Object[] { ((Object[])b.h(this, 74931181)).length }), -253076884, new Object[] { CorePreparedStatement$CoreStatement.H("\u1842") }), 832527248, null) });
        }
        return --i;
    }
    
    protected int markCol(int n) throws SQLException {
        b.N(this, 1817008708, null);
        (int)b.N(this, 105470529, new Object[] { n });
        b.J(this, -1092330946, n);
        return --n;
    }
    
    public void checkMeta() throws SQLException {
        (int)b.N(this, 105470529, new Object[] { 1 });
        if (b.h(this, -905029031) == null) {
            b.J(this, -905029031, b.N(b.N(b.h(this, -526493120), -2063771043, null), -662087101, new Object[] { (long)b.h(b.h(this, -526493120), 1906203507) }));
        }
    }
    
    public void close() throws SQLException {
        b.J(this, -716154276, null);
        b.J(this, 74931181, null);
        b.J(this, -905029031, null);
        b.J(this, 520051272, 0);
        b.J(this, 1065704022, 0);
        b.J(this, -1092330946, -1);
        b.J(this, 743332443, null);
        if (!(boolean)b.h(this, -2011866537)) {
            return;
        }
        final Object n = b.N(b.h(this, -526493120), -2063771043, null);
        // monitorenter(n)
        try {
            if ((long)b.h(b.h(this, -526493120), 1906203507) != 0L) {
                (int)b.N(n, -1502651824, new Object[] { (long)b.h(b.h(this, -526493120), 1906203507) });
                if (b.h(this, 1233738309)) {
                    b.J(this, 1233738309, false);
                    b.N(b.h(this, -526493120), 1161255490, null);
                }
            }
        }
        // monitorexit(n)
        finally {
            // monitorexit(n)
            throw;
        }
        b.J(this, -2011866537, false);
    }
    
    protected Integer findColumnIndexInCache(final String s) {
        if (b.h(this, 743332443) == null) {
            return null;
        }
        return (Integer)b.N(b.h(this, 743332443), -1528538553, new Object[] { s });
    }
    
    protected int addColumnIndexInCache(final String s, final int i) {
        if (b.h(this, 743332443) == null) {
            b.J(this, 743332443, b.j(-1870243252, new Object[] { ((Object[])b.h(this, -716154276)).length }));
        }
        b.N(b.h(this, 743332443), -791717002, new Object[] { s, b.K(1751865929, new Object[] { i }) });
        return i;
    }
}
