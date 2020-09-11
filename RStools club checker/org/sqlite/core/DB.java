// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.core;

import org.sqlite.SQLiteException;
import org.sqlite.ProgressHandler;
import org.sqlite.Function;
import org.sqlite.BusyHandler;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.sqlite.SQLiteConfig;

public abstract class DB implements Codes
{
    private final String url;
    private final String fileName;
    private final SQLiteConfig config;
    private final AtomicBoolean closed;
    long begin;
    long commit;
    private final Map<Long, CoreStatement> stmts;
    
    public DB(final String s, final String s2, final SQLiteConfig sqLiteConfig) throws SQLException {
        b.J(this, -842441835, b.j(807295896, new Object[] { true }));
        b.J(this, -1416471662, 0L);
        b.J(this, -1044096105, 0L);
        b.J(this, 263412633, b.j(-2059117668, null));
        b.J(this, 1782209430, s);
        b.J(this, -248685669, s2);
        b.J(this, 1199463296, sqLiteConfig);
    }
    
    public String getUrl() {
        return (String)b.h(this, 1782209430);
    }
    
    public boolean isClosed() {
        return (boolean)b.N(b.h(this, -842441835), -1383572579, null);
    }
    
    public SQLiteConfig getConfig() {
        return (SQLiteConfig)b.h(this, 1199463296);
    }
    
    public abstract void interrupt() throws SQLException;
    
    public abstract void busy_timeout(final int p0) throws SQLException;
    
    public abstract void busy_handler(final BusyHandler p0) throws SQLException;
    
    abstract String errmsg() throws SQLException;
    
    public abstract String libversion() throws SQLException;
    
    public abstract int changes() throws SQLException;
    
    public abstract int total_changes() throws SQLException;
    
    public abstract int shared_cache(final boolean p0) throws SQLException;
    
    public abstract int enable_load_extension(final boolean p0) throws SQLException;
    
    public final synchronized void exec(final String s, final boolean b) throws SQLException {
        long longValue = 0L;
        try {
            longValue = (long)b.N(this, 1310940058, new Object[] { s });
            final int intValue = (int)b.N(this, -1632806017, new Object[] { longValue });
            switch (intValue) {
                case 101: {
                    b.N(this, 1781160836, new Object[] { b });
                    (int)b.N(this, 2110675841, new Object[] { longValue });
                }
                case 100: {
                    (int)b.N(this, 2110675841, new Object[] { longValue });
                }
                default: {
                    b.N(this, -1001825410, new Object[] { intValue });
                    (int)b.N(this, 2110675841, new Object[] { longValue });
                    break;
                }
            }
        }
        finally {
            (int)b.N(this, 2110675841, new Object[] { longValue });
            throw;
        }
    }
    
    public final synchronized void open(final String s, final int i) throws SQLException {
        b.N(this, -1608426621, new Object[] { s, i });
        b.N(b.h(this, -842441835), 506026888, new Object[] { false });
        if ((boolean)b.N(b.h(this, -248685669), 14441349, new Object[] { CorePreparedStatement$CoreStatement.H("\u76fd\uc95a\u9303\u3de6\u7a03") }) && !(boolean)b.N(b.h(this, -248685669), 32922498, new Object[] { CorePreparedStatement$CoreStatement.H("\u76f8\uc952\u930c\u3deb\u7a5c\u74b7") })) {
            (int)b.N(this, 993483660, new Object[] { Boolean.valueOf((boolean)b.N(b.h(this, 1199463296), -434480249, null)) });
        }
        (int)b.N(this, -516793466, new Object[] { Boolean.valueOf((boolean)b.N(b.h(this, 1199463296), -1473094775, null)) });
        b.N(this, 1668635504, new Object[] { (int)b.N(b.h(this, 1199463296), 1658608523, null) });
    }
    
    public final synchronized void close() throws SQLException {
        // monitorenter(b.h((Object)this, 263412633))
        try {
            final Object n = b.N(b.N(b.h(this, 263412633), 1805212557, null), 1337875338, null);
            while (b.N(n, 1790597999, null)) {
                final Object n2 = b.N(n, 684743540, null);
                final Object n3 = b.N(n2, -1123722383, null);
                (int)b.N(this, 2110675841, new Object[] { (long)b.N(b.N(n2, 1459968878, null), -1008706640, null) });
                if (n3 != null) {
                    b.J(n3, 1906203507, 0L);
                }
                b.N(n, -1145480328, null);
            }
        }
        // monitorexit(b.h((Object)this, 263412633))
        finally {
            // monitorexit(b.h((Object)this, 263412633))
            throw;
        }
        b.N(this, -1405723787, null);
        if ((long)b.h(this, -1416471662) != 0L) {
            (int)b.N(this, 2110675841, new Object[] { (long)b.h(this, -1416471662) });
            b.J(this, -1416471662, 0L);
        }
        if ((long)b.h(this, -1044096105) != 0L) {
            (int)b.N(this, 2110675841, new Object[] { (long)b.h(this, -1044096105) });
            b.J(this, -1044096105, 0L);
        }
        b.N(b.h(this, -842441835), 506026888, new Object[] { true });
        b.N(this, -198681742, null);
    }
    
    public final synchronized void prepare(final CoreStatement coreStatement) throws SQLException {
        if (b.h(coreStatement, 58743671) == null) {
            throw (Throwable)b.j(-414491780, null);
        }
        if ((long)b.h(coreStatement, 1906203507) != 0L) {
            (int)b.N(this, -1566811271, new Object[] { coreStatement });
        }
        b.J(coreStatement, 1906203507, (long)b.N(this, 1310940058, new Object[] { b.h(coreStatement, 58743671) }));
        b.N(b.h(this, 263412633), -791717002, new Object[] { b.j(-1237951570, new Object[] { (long)b.h(coreStatement, 1906203507) }), coreStatement });
    }
    
    public final synchronized int finalize(final CoreStatement coreStatement) throws SQLException {
        if ((long)b.h(coreStatement, 1906203507) == 0L) {
            return 0;
        }
        int intValue = 1;
        try {
            intValue = (int)b.N(this, 2110675841, new Object[] { (long)b.h(coreStatement, 1906203507) });
            b.N(b.h(this, 263412633), -1348707461, new Object[] { b.j(-1237951570, new Object[] { (long)b.h(coreStatement, 1906203507) }) });
            b.J(coreStatement, 1906203507, 0L);
        }
        finally {
            b.N(b.h(this, 263412633), -1348707461, new Object[] { b.j(-1237951570, new Object[] { (long)b.h(coreStatement, 1906203507) }) });
            b.J(coreStatement, 1906203507, 0L);
            throw;
        }
        return intValue;
    }
    
    protected abstract void _open(final String p0, final int p1) throws SQLException;
    
    protected abstract void _close() throws SQLException;
    
    public abstract int _exec(final String p0) throws SQLException;
    
    protected abstract long prepare(final String p0) throws SQLException;
    
    protected abstract int finalize(final long p0) throws SQLException;
    
    public abstract int step(final long p0) throws SQLException;
    
    public abstract int reset(final long p0) throws SQLException;
    
    public abstract int clear_bindings(final long p0) throws SQLException;
    
    abstract int bind_parameter_count(final long p0) throws SQLException;
    
    public abstract int column_count(final long p0) throws SQLException;
    
    public abstract int column_type(final long p0, final int p1) throws SQLException;
    
    public abstract String column_decltype(final long p0, final int p1) throws SQLException;
    
    public abstract String column_table_name(final long p0, final int p1) throws SQLException;
    
    public abstract String column_name(final long p0, final int p1) throws SQLException;
    
    public abstract String column_text(final long p0, final int p1) throws SQLException;
    
    public abstract byte[] column_blob(final long p0, final int p1) throws SQLException;
    
    public abstract double column_double(final long p0, final int p1) throws SQLException;
    
    public abstract long column_long(final long p0, final int p1) throws SQLException;
    
    public abstract int column_int(final long p0, final int p1) throws SQLException;
    
    abstract int bind_null(final long p0, final int p1) throws SQLException;
    
    abstract int bind_int(final long p0, final int p1, final int p2) throws SQLException;
    
    abstract int bind_long(final long p0, final int p1, final long p2) throws SQLException;
    
    abstract int bind_double(final long p0, final int p1, final double p2) throws SQLException;
    
    abstract int bind_text(final long p0, final int p1, final String p2) throws SQLException;
    
    abstract int bind_blob(final long p0, final int p1, final byte[] p2) throws SQLException;
    
    public abstract void result_null(final long p0) throws SQLException;
    
    public abstract void result_text(final long p0, final String p1) throws SQLException;
    
    public abstract void result_blob(final long p0, final byte[] p1) throws SQLException;
    
    public abstract void result_double(final long p0, final double p1) throws SQLException;
    
    public abstract void result_long(final long p0, final long p1) throws SQLException;
    
    public abstract void result_int(final long p0, final int p1) throws SQLException;
    
    public abstract void result_error(final long p0, final String p1) throws SQLException;
    
    public abstract String value_text(final Function p0, final int p1) throws SQLException;
    
    public abstract byte[] value_blob(final Function p0, final int p1) throws SQLException;
    
    public abstract double value_double(final Function p0, final int p1) throws SQLException;
    
    public abstract long value_long(final Function p0, final int p1) throws SQLException;
    
    public abstract int value_int(final Function p0, final int p1) throws SQLException;
    
    public abstract int value_type(final Function p0, final int p1) throws SQLException;
    
    public abstract int create_function(final String p0, final Function p1, final int p2, final int p3) throws SQLException;
    
    public abstract int destroy_function(final String p0, final int p1) throws SQLException;
    
    abstract void free_functions() throws SQLException;
    
    public abstract int backup(final String p0, final String p1, final ProgressObserver p2) throws SQLException;
    
    public abstract int restore(final String p0, final String p1, final ProgressObserver p2) throws SQLException;
    
    public abstract void register_progress_handler(final int p0, final ProgressHandler p1) throws SQLException;
    
    public abstract void clear_progress_handler() throws SQLException;
    
    abstract boolean[][] column_metadata(final long p0) throws SQLException;
    
    public final synchronized String[] column_names(final long n) throws SQLException {
        final String[] array = new String[(int)b.N(this, 881941482, new Object[] { n })];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (String)b.N(this, -2098767264, new Object[] { n, i });
        }
        return array;
    }
    
    final synchronized int sqlbind(final long n, int n2, final Object o) throws SQLException {
        ++n2;
        if (o == null) {
            return (int)b.N(this, 416766845, new Object[] { n, n2 });
        }
        if (o instanceof Integer) {
            return (int)b.N(this, 1953520223, new Object[] { n, n2, (int)b.N(o, 306076538, null) });
        }
        if (o instanceof Short) {
            return (int)b.N(this, 1953520223, new Object[] { n, n2, (int)b.N(o, 1226791524, null) });
        }
        if (o instanceof Long) {
            return (int)b.N(this, 593123937, new Object[] { n, n2, (long)b.N(o, -1008706640, null) });
        }
        if (o instanceof Float) {
            return (int)b.N(this, 854809187, new Object[] { n, n2, (double)b.N(o, -1692116386, null) });
        }
        if (o instanceof Double) {
            return (int)b.N(this, 854809187, new Object[] { n, n2, (double)b.N(o, 1854888552, null) });
        }
        if (o instanceof String) {
            return (int)b.N(this, 623270501, new Object[] { n, n2, o });
        }
        if (o instanceof byte[]) {
            return (int)b.N(this, -1796515230, new Object[] { n, n2, (byte[])o });
        }
        throw (Throwable)b.j(-108635167, new Object[] { b.N(b.N(b.N(b.j(-1322689945, null), -253076884, new Object[] { CoreStatement$CoreStatement.F("\u39fb\uae90\ud44a\u17d1\ufa80\ue116\u224b\uee7a\uf1d9\uc9f9\u901c\u1bc8\u23f5\u1d57\ubdcf\u262f\ua450\ub838\u1984\u82de\u1ee5\u2969\uf2ce") }), 950360678, new Object[] { b.N(o, 654989929, null) }), 832527248, null) });
    }
    
    final synchronized int[] executeBatch(final long n, final int i, final Object[] array, final boolean b) throws SQLException {
        if (i < 1) {
            throw (Throwable)b.j(-108635167, new Object[] { b.N(b.N(b.N(b.N(b.j(-1322689945, null), -253076884, new Object[] { CorePreparedStatement$CoreStatement.H("\uef89\u4a45\u2d86\u0d3d\u5948\uc904\ud61e") }), -837789077, new Object[] { i }), -253076884, new Object[] { CorePreparedStatement$CoreStatement.H("\uefc3\u4a0a\u2dcf\u0d73\u590d") }), 832527248, null) });
        }
        final int intValue = (int)b.N(this, -44737580, new Object[] { n });
        final int[] array2 = new int[i];
        try {
            for (int j = 0; j < i; ++j) {
                (int)b.N(this, -1502651824, new Object[] { n });
                for (int k = 0; k < intValue; ++k) {
                    final int intValue2 = (int)b.N(this, 907696749, new Object[] { n, k, array[j * intValue + k] });
                    if (intValue2 != 0) {
                        b.N(this, -1001825410, new Object[] { intValue2 });
                    }
                }
                final int intValue3 = (int)b.N(this, -1632806017, new Object[] { n });
                if (intValue3 != 101) {
                    (int)b.N(this, -1502651824, new Object[] { n });
                    if (intValue3 == 100) {
                        throw (Throwable)b.j(2120374890, new Object[] { b.N(b.N(b.N(b.N(b.j(-1322689945, null), -253076884, new Object[] { CorePreparedStatement$CoreStatement.H("\uef88\u4a4b\u2d87\u0d30\u5954\uc904\ud653\u37fa\u45e4\ubf76\u3c81\uaccd") }), -837789077, new Object[] { j }), -253076884, new Object[] { CorePreparedStatement$CoreStatement.H("\uefd0\u4a0a\u2d82\u0d26\u5959\uc956\ud64f\u37b4\u45e2\ubf61\u3c8c\uac98\uf6e9\u292c\uc519Y\u8a32\u0c3b\ud3d2\uff5b\u313e\ueecb\u4857") }), 832527248, null), array2 });
                    }
                    b.N(this, -1001825410, new Object[] { intValue3 });
                }
                array2[j] = (int)b.N(this, 1344166846, null);
            }
            b.N(this, 1781160836, new Object[] { b });
        }
        finally {
            b.N(this, 1781160836, new Object[] { b });
            throw;
        }
        (int)b.N(this, -1502651824, new Object[] { n });
        return array2;
    }
    
    public final synchronized boolean execute(final CoreStatement coreStatement, final Object[] array) throws SQLException {
        if (array != null) {
            final int intValue = (int)b.N(this, -44737580, new Object[] { (long)b.h(coreStatement, 1906203507) });
            if (intValue > array.length) {
                throw (Throwable)b.j(-108635167, new Object[] { b.N(b.N(b.N(b.N(b.N(b.N(b.j(-1322689945, null), -253076884, new Object[] { CoreStatement$CoreStatement.F("\ue17a\ub9a3\u4cd5\uf4e1\u55db\u7d88\ufebd\u684b\uc873\u1889\u76b0\ubef7\u177f\udf11\u5010\u8863\u9e62\ucab3\u2c23\u019e\ub182\ud3ae\u7204\ude34\ub793\u950f\u1c3f\u26cc\u6b04\u609c\u4d22\u2a3f") }), -837789077, new Object[] { intValue }), -253076884, new Object[] { CoreStatement$CoreStatement.F("\ue132\ub9f0\u4c98\uf4a4\u55df\u7d9d\ufeb8\u6851\uc878\u1889\u76b5\ubef9\u1763\udf13\u5011\u8831\u9e2f") }), -837789077, new Object[] { array.length }), -253076884, new Object[] { CoreStatement$CoreStatement.F("\ue132") }), 832527248, null) });
            }
            for (int i = 0; i < intValue; ++i) {
                final int intValue2 = (int)b.N(this, 907696749, new Object[] { (long)b.h(coreStatement, 1906203507), i, array[i] });
                if (intValue2 != 0) {
                    b.N(this, -1001825410, new Object[] { intValue2 });
                }
            }
        }
        final int n = (int)b.N(this, -1632806017, new Object[] { (long)b.h(coreStatement, 1906203507) }) & 0xFF;
        switch (n) {
            case 101: {
                (int)b.N(this, -1502651824, new Object[] { (long)b.h(coreStatement, 1906203507) });
                b.N(this, 1781160836, new Object[] { Boolean.valueOf((boolean)b.N(b.h(coreStatement, 754211407), -237872165, null)) });
                return false;
            }
            case 100: {
                return true;
            }
            case 5:
            case 6:
            case 19:
            case 21: {
                throw (Throwable)b.N(this, -1276814764, new Object[] { n });
            }
            default: {
                (int)b.N(this, -1566811271, new Object[] { coreStatement });
                throw (Throwable)b.N(this, -1276814764, new Object[] { n });
            }
        }
    }
    
    final synchronized boolean execute(final String s, final boolean b) throws SQLException {
        final int intValue = (int)b.N(this, 2110610001, new Object[] { s });
        switch (intValue) {
            case 0: {
                return false;
            }
            case 101: {
                b.N(this, 1781160836, new Object[] { b });
                return false;
            }
            case 100: {
                return true;
            }
            default: {
                throw (Throwable)b.N(this, -1276814764, new Object[] { intValue });
            }
        }
    }
    
    public final synchronized int executeUpdate(final CoreStatement coreStatement, final Object[] array) throws SQLException {
        try {
            if (b.N(this, -1902552498, new Object[] { coreStatement, array })) {
                throw (Throwable)b.j(-108635167, new Object[] { CoreStatement$CoreStatement.F("\u6a97\u5eef\u6818\u4a94\uda96\u8842\u2cfd\u800a\u8456\u9688\u2747\uf480\u6e1b\uee12\udfc1\ubc8e\u636b\u8c78\u958b\u2528\u5538") });
            }
            if ((long)b.h(coreStatement, 1906203507) != 0L) {
                (int)b.N(this, -1502651824, new Object[] { (long)b.h(coreStatement, 1906203507) });
            }
        }
        finally {
            if ((long)b.h(coreStatement, 1906203507) != 0L) {
                (int)b.N(this, -1502651824, new Object[] { (long)b.h(coreStatement, 1906203507) });
            }
            throw;
        }
        return (int)b.N(this, 1344166846, null);
    }
    
    final void throwex() throws SQLException {
        throw (Throwable)b.j(-108635167, new Object[] { b.N(this, -814327213, null) });
    }
    
    public final void throwex(final int i) throws SQLException {
        throw (Throwable)b.N(this, -1276814764, new Object[] { i });
    }
    
    static final void throwex(final int i, final String s) throws SQLiteException {
        throw (Throwable)b.K(411064920, new Object[] { i, s });
    }
    
    public static SQLiteException newSQLException(final int i, final String s) {
        final Object k = b.K(214981205, new Object[] { i });
        return (SQLiteException)b.j(-169911726, new Object[] { b.K(608721831, new Object[] { CorePreparedStatement$CoreStatement.H("\u98ad\uc2c1\u31f1\u29e1\udda3\udab0\ua1ab"), { k, s } }), k });
    }
    
    private SQLiteException newSQLException(final int i) throws SQLException {
        return (SQLiteException)b.K(411064920, new Object[] { i, b.N(this, -814327213, null) });
    }
    
    final void ensureAutoCommit(final boolean b) throws SQLException {
        if (!b) {
            return;
        }
        if ((long)b.h(this, -1416471662) == 0L) {
            b.J(this, -1416471662, (long)b.N(this, 1310940058, new Object[] { CoreStatement$CoreStatement.F("\u0e38\u5154\u153c\u54cf\ucf14\u4a46") }));
        }
        if ((long)b.h(this, -1044096105) == 0L) {
            b.J(this, -1044096105, (long)b.N(this, 1310940058, new Object[] { CoreStatement$CoreStatement.F("\u0e39\u515e\u1536\u54cb\ucf13\u4a09\u891d") }));
        }
        try {
            if ((int)b.N(this, -1632806017, new Object[] { (long)b.h(this, -1416471662) }) != 101) {
                (int)b.N(this, -1502651824, new Object[] { (long)b.h(this, -1416471662) });
                (int)b.N(this, -1502651824, new Object[] { (long)b.h(this, -1044096105) });
                return;
            }
            final int intValue = (int)b.N(this, -1632806017, new Object[] { (long)b.h(this, -1044096105) });
            if (intValue != 101) {
                (int)b.N(this, -1502651824, new Object[] { (long)b.h(this, -1044096105) });
                b.N(this, -1001825410, new Object[] { intValue });
            }
            (int)b.N(this, -1502651824, new Object[] { (long)b.h(this, -1416471662) });
            (int)b.N(this, -1502651824, new Object[] { (long)b.h(this, -1044096105) });
        }
        finally {
            (int)b.N(this, -1502651824, new Object[] { (long)b.h(this, -1416471662) });
            (int)b.N(this, -1502651824, new Object[] { (long)b.h(this, -1044096105) });
            throw;
        }
    }
    
    public interface ProgressObserver
    {
        void progress(final int p0, final int p1);
    }
}
