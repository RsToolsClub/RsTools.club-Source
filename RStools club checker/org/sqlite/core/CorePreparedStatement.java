// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.core;

import java.util.Calendar;
import java.sql.SQLException;
import org.sqlite.SQLiteConnection;
import java.util.BitSet;
import org.sqlite.jdbc4.JDBC4Statement;

public abstract class CorePreparedStatement extends JDBC4Statement
{
    protected int columnCount;
    protected int paramCount;
    protected int batchQueryCount;
    protected BitSet paramValid;
    
    protected CorePreparedStatement(final SQLiteConnection sqLiteConnection, final String s) throws SQLException {
        super(sqLiteConnection);
        b.J(this, -931046425, s);
        final Object n = b.N(sqLiteConnection, -22979604, null);
        b.N(n, 2110151657, new Object[] { this });
        b.J(b.h(this, 1524194278), 74931181, b.N(n, 665934800, new Object[] { (long)b.h(this, -1203938325) }));
        b.J(this, -1131258929, (int)b.N(n, 881941482, new Object[] { (long)b.h(this, -1203938325) }));
        b.J(this, -1977066543, (int)b.N(n, -44737580, new Object[] { (long)b.h(this, -1203938325) }));
        b.J(this, -2020451373, b.j(361389006, new Object[] { (int)b.h(this, -1977066543) }));
        b.J(this, 1266899928, 0);
        b.J(this, -1561437227, null);
        b.J(this, -397911086, 0);
    }
    
    @Override
    protected void finalize() throws SQLException {
        b.N(this, 936336343, null);
    }
    
    protected void checkParameters() throws SQLException {
        if ((int)b.N(b.h(this, -2020451373), -268608548, null) != (int)b.h(this, -1977066543)) {
            throw (Throwable)b.j(-108635167, new Object[] { CorePreparedStatement$CoreStatement.H("\uac7a\u8446\u0882\ue624\u0131\ua8bf\u60d5\uf92d\u95ad\u2b67\u1772\u383f\u42db\u963c\u5472\u36a2\u9927\u8df8\u711b\ue069\ud504\u41f0\ue375\u8e7a\u7ab7\u639f\u59c0\u1656\u2c33") });
        }
    }
    
    @Override
    public int[] executeBatch() throws SQLException {
        if ((int)b.h(this, 1266899928) == 0) {
            return new int[0];
        }
        b.N(this, -1493083175, null);
        try {
            final int[] array = (int[])b.N(b.N(b.h(this, -2000397354), -22979604, null), 1344428992, new Object[] { (long)b.h(this, -1203938325), (int)b.h(this, 1266899928), (Object[])b.h(this, -1561437227), Boolean.valueOf((boolean)b.N(b.h(this, -2000397354), -237872165, null)) });
            b.N(this, -1244046371, null);
            return array;
        }
        finally {
            b.N(this, -1244046371, null);
            throw;
        }
    }
    
    @Override
    public void clearBatch() throws SQLException {
        b.N(this, -962831398, null);
        b.N(b.h(this, -2020451373), 1068653503, null);
        b.J(this, 1266899928, 0);
    }
    
    @Override
    public int getUpdateCount() throws SQLException {
        if ((long)b.h(this, -1203938325) == 0L || (boolean)b.h(this, -453289020) || (boolean)b.N(b.h(this, 1524194278), -372548671, null)) {
            return -1;
        }
        return (int)b.N(b.N(b.h(this, -2000397354), -22979604, null), 1344166846, null);
    }
    
    protected void batch(final int n, final Object o) throws SQLException {
        b.N(this, -472622141, null);
        if (b.h(this, -1561437227) == null) {
            b.J(this, -1561437227, new Object[(int)b.h(this, -1977066543)]);
            b.N(b.h(this, -2020451373), 1068653503, null);
        }
        ((Object[])b.h(this, -1561437227))[(int)b.h(this, -397911086) + n - 1] = o;
        b.N(b.h(this, -2020451373), 1032543176, new Object[] { n - 1 });
    }
    
    protected void setDateByMilliseconds(final int i, final Long n, final Calendar calendar) throws SQLException {
        final Object n2 = b.N(b.h(this, -2000397354), 1594776517, null);
        switch (((int[])b.b(-1020830782))[(int)b.N(b.N(n2, -1791861817, null), -188982324, null)]) {
            case 1: {
                b.N(this, -1664984145, new Object[] { i, b.N(b.K(1177705419, new Object[] { b.N(n2, -1982702647, null), b.N(calendar, 47930310, null) }), 1271159754, new Object[] { b.j(708664269, new Object[] { (long)b.N(n, -1008706640, null) }) }) });
                break;
            }
            case 2: {
                b.N(this, -1664984145, new Object[] { i, b.j(548166580, new Object[] { (long)b.N(n, -1008706640, null) / 8.64E7 + 2440587.5 }) });
                break;
            }
            default: {
                b.N(this, -1664984145, new Object[] { i, b.j(-1237951570, new Object[] { (long)b.N(n, -1008706640, null) / (long)b.N(n2, 196893617, null) }) });
                break;
            }
        }
    }
}
