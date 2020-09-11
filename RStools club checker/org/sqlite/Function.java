// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.sql.SQLException;
import java.sql.Connection;
import org.sqlite.core.DB;

public abstract class Function
{
    public static final int FLAG_DETERMINISTIC = 2048;
    private SQLiteConnection conn;
    private DB db;
    long context;
    long value;
    int args;
    
    public Function() {
        mn.L(this, -405996886, 0L);
        mn.L(this, 27589281, 0L);
        mn.L(this, 1166408352, 0);
    }
    
    public static final void create(final Connection connection, final String s, final Function function) throws SQLException {
        mn.W(-615712097, new Object[] { connection, s, function, 0 });
    }
    
    public static final void create(final Connection connection, final String s, final Function function, final int i) throws SQLException {
        mn.W(706542238, new Object[] { connection, s, function, -1, i });
    }
    
    public static final void create(final Connection connection, final String s, final Function function, final int n, final int i) throws SQLException {
        if (connection == null || !(connection instanceof SQLiteConnection)) {
            throw (Throwable)mn.k(-886637961, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u7a3b\u89c2\ufb00\ud0fc\u2a8a\u4a3a\u8f39\u2a0a\u413e\u7e50\ud4b4\ub17c\u3dda\ub372\u86b2\uc221\u2637\u9531\u3c38\u0adc\u54ea\udbc0\u95c6\ued4a\u80b0\uf1b4\uae32\u60bd\uc98e\ud7eb\u1c66\ua083\uab16\u2ffe") });
        }
        if (mn.t(connection, -272369034, null)) {
            throw (Throwable)mn.k(-886637961, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u7a3b\u89c2\ufb00\ud0fc\u2a8a\u4a3a\u8f39\u2a0a\u413e\u7e50\ud4b4\ub172\u3dc3\ub36e\u86b5\uc264\u2631") });
        }
        mn.L(function, 1571420837, connection);
        mn.L(function, -1823671644, mn.t(mn.J(function, 1571420837), 1420556925, null));
        if (n < -1 || n > 127) {
            throw (Throwable)mn.k(-886637961, new Object[] { mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u7a31\u89c3\ufb18\ud0f3\u2a83\u4a30\u8f29\u2a43\u4130\u7e4c\ud4f3\ub162\u3d8f\ub371\u86b4\uc26e\u2623\u953d\u3c7c\u0acd\u54e1\udbda\u9587") }), 673774243, new Object[] { n }), 948763657, null) });
        }
        if (s == null || (int)mn.t(s, -1436222475, null) > 255) {
            throw (Throwable)mn.k(-886637961, new Object[] { mn.t(mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u7a31\u89c3\ufb18\ud0f3\u2a83\u4a30\u8f29\u2a43\u4137\u7e4b\ud4fa\ub172\u3ddb\ub368\u86a9\uc26f\u2675\u953a\u3c79\u0ac5\u54e0\udbda\u9587\ued03") }), -542770190, new Object[] { s }), -542770190, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u7a7f") }), 948763657, null) });
        }
        if ((int)mn.t(mn.J(function, -1823671644), -1920009566, new Object[] { s, function, n, i }) != 0) {
            throw (Throwable)mn.k(-886637961, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u7a3d\u89df\ufb1c\ud0fd\u2a9d\u4a79\u8f2e\u2a11\u4134\u7e5f\ud4e0\ub178\u3dc1\ub366\u86e6\uc267\u2620\u953a\u3c7b\u0adc\u54ec\udb8f\u95c9") });
        }
    }
    
    public static final void destroy(final Connection connection, final String s, final int i) throws SQLException {
        if (connection == null || !(connection instanceof SQLiteConnection)) {
            throw (Throwable)mn.k(-886637961, new Object[] { Function$SQLiteConnection.c("\u0be5\u129c\u4a4b\u6800\u2574\u97a1\u9307\ue624\uae67\u9f91\uc07b\u8bad\uf59c\u8926\u308a\u533a\u7474\u1109\uf9ec\ude3e\uf034\ua7ac\u9995\u8253\u5197\u1c88\u89af\ucc9e\ua6df\ub278\u5079\ubbd6\ueb29\u83fe") });
        }
        (int)mn.t(mn.t(connection, 1420556925, null), -280102151, new Object[] { s, i });
    }
    
    public static final void destroy(final Connection connection, final String s) throws SQLException {
        mn.W(432536312, new Object[] { connection, s, -1 });
    }
    
    protected abstract void xFunc() throws SQLException;
    
    protected final synchronized int args() throws SQLException {
        mn.t(this, 1072757495, null);
        return (int)mn.J(this, 1166408352);
    }
    
    protected final synchronized void result(final byte[] array) throws SQLException {
        mn.t(this, 1072757495, null);
        mn.t(mn.J(this, -1823671644), -915932426, new Object[] { (long)mn.J(this, -405996886), array });
    }
    
    protected final synchronized void result(final double d) throws SQLException {
        mn.t(this, 1072757495, null);
        mn.t(mn.J(this, -1823671644), 469433085, new Object[] { (long)mn.J(this, -405996886), d });
    }
    
    protected final synchronized void result(final int i) throws SQLException {
        mn.t(this, 1072757495, null);
        mn.t(mn.J(this, -1823671644), -165414148, new Object[] { (long)mn.J(this, -405996886), i });
    }
    
    protected final synchronized void result(final long l) throws SQLException {
        mn.t(this, 1072757495, null);
        mn.t(mn.J(this, -1823671644), -1862731013, new Object[] { (long)mn.J(this, -405996886), l });
    }
    
    protected final synchronized void result() throws SQLException {
        mn.t(this, 1072757495, null);
        mn.t(mn.J(this, -1823671644), 210303738, new Object[] { (long)mn.J(this, -405996886) });
    }
    
    protected final synchronized void result(final String s) throws SQLException {
        mn.t(this, 1072757495, null);
        mn.t(mn.J(this, -1823671644), 1749744369, new Object[] { (long)mn.J(this, -405996886), s });
    }
    
    protected final synchronized void error(final String s) throws SQLException {
        mn.t(this, 1072757495, null);
        mn.t(mn.J(this, -1823671644), -2112750864, new Object[] { (long)mn.J(this, -405996886), s });
    }
    
    protected final synchronized String value_text(final int n) throws SQLException {
        mn.t(this, -793707793, new Object[] { n });
        return (String)mn.t(mn.J(this, -1823671644), 2081290990, new Object[] { this, n });
    }
    
    protected final synchronized byte[] value_blob(final int n) throws SQLException {
        mn.t(this, -793707793, new Object[] { n });
        return (byte[])mn.t(mn.J(this, -1823671644), -312608011, new Object[] { this, n });
    }
    
    protected final synchronized double value_double(final int n) throws SQLException {
        mn.t(this, -793707793, new Object[] { n });
        return (double)mn.t(mn.J(this, -1823671644), 444594932, new Object[] { this, n });
    }
    
    protected final synchronized int value_int(final int n) throws SQLException {
        mn.t(this, -793707793, new Object[] { n });
        return (int)mn.t(mn.J(this, -1823671644), -1042089229, new Object[] { this, n });
    }
    
    protected final synchronized long value_long(final int n) throws SQLException {
        mn.t(this, -793707793, new Object[] { n });
        return (long)mn.t(mn.J(this, -1823671644), 1521679090, new Object[] { this, n });
    }
    
    protected final synchronized int value_type(final int n) throws SQLException {
        mn.t(this, -793707793, new Object[] { n });
        return (int)mn.t(mn.J(this, -1823671644), -483067127, new Object[] { this, n });
    }
    
    private void checkContext() throws SQLException {
        if (mn.J(this, 1571420837) == null || mn.t(mn.J(this, 1571420837), 1420556925, null) == null || (long)mn.J(this, -405996886) == 0L) {
            throw (Throwable)mn.k(-886637961, new Object[] { Function$ProgressHandler.Y("\u4bc5\u5c60\u4d5f\u8e26\ubf3a\uee45\uaf37\uae19\u12c8\u7613\ue2f2\u8b83\u8cdd\u7917\u3e4f\u2fd8\u96da\u8135\u0c96\uff48\uee1f\u26ea\ub14d\uef16\u075b\u9191\u0664\u845e\ud33f\u200d\u9ef3\u5ccf#\ud466\ub079\uae13\u196f") });
        }
    }
    
    private void checkValue(final int i) throws SQLException {
        if (mn.J(this, 1571420837) == null || mn.t(mn.J(this, 1571420837), 1420556925, null) == null || (long)mn.J(this, 27589281) == 0L) {
            throw (Throwable)mn.k(-886637961, new Object[] { Function$ProgressHandler.Y("\u4578\uef82\ub52c\u0d17\u1816\u8631\uf78f\u7664\uee43\u4935\u58ab\ub826\ufb5a\ub27e\u44f1\u348d\uc4aa\u79f8\u1769\u1653\u3c22\u3373\u1770\u6cc2\u7548") });
        }
        if (i >= (int)mn.J(this, 1166408352)) {
            throw (Throwable)mn.k(-886637961, new Object[] { mn.t(mn.t(mn.t(mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { Function$ProgressHandler.Y("\u4577\uef9f\ub53f\u0d17") }), 673774243, new Object[] { i }), -542770190, new Object[] { Function$ProgressHandler.Y("\u4536\uef82\ub52d\u0d43\u185f\u863d\uf7c0\u7667\uee4c\u493d\u58ad\ub863\ufb21\ub22f\u44be") }), 673774243, new Object[] { (int)mn.J(this, 1166408352) }), -542770190, new Object[] { Function$ProgressHandler.Y("\u453f") }), 948763657, null) });
        }
    }
    
    public abstract static class Aggregate extends Function implements Cloneable
    {
        @Override
        protected final void xFunc() {
        }
        
        protected abstract void xStep() throws SQLException;
        
        protected abstract void xFinal() throws SQLException;
        
        public Object clone() throws CloneNotSupportedException {
            return mn.t(this, -1639974177, null);
        }
    }
    
    public abstract static class Window extends Aggregate
    {
        protected abstract void xInverse() throws SQLException;
        
        protected abstract void xValue() throws SQLException;
    }
}
