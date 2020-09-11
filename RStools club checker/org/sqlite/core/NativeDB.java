// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.core;

import org.sqlite.ProgressHandler;
import java.io.UnsupportedEncodingException;
import org.sqlite.Function;
import org.sqlite.BusyHandler;
import java.sql.SQLException;
import org.sqlite.SQLiteConfig;

public final class NativeDB extends DB
{
    long pointer;
    private static boolean isLoaded;
    private static boolean loadSucceeded;
    private final long udfdatalist = 0L;
    
    public NativeDB(final String s, final String s2, final SQLiteConfig sqLiteConfig) throws SQLException {
        super(s, s2, sqLiteConfig);
        b.J(this, 323574537, 0L);
        b.J(this, 214457094, 0L);
    }
    
    public static boolean load() throws Exception {
        if (b.b(1051417355)) {
            return (boolean)b.b(832264944);
        }
        b.l(832264944, (boolean)b.K(-1305715955, null));
        b.l(1051417355, true);
        return (boolean)b.b(832264944);
    }
    
    @Override
    protected synchronized void _open(final String s, final int i) throws SQLException {
        b.N(this, 2078104303, new Object[] { (byte[])b.K(-487761142, new Object[] { s }), i });
    }
    
    synchronized native void _open_utf8(final byte[] p0, final int p1) throws SQLException;
    
    @Override
    protected synchronized native void _close() throws SQLException;
    
    @Override
    public synchronized int _exec(final String s) throws SQLException {
        return (int)b.N(this, -169059596, new Object[] { (byte[])b.K(-487761142, new Object[] { s }) });
    }
    
    synchronized native int _exec_utf8(final byte[] p0) throws SQLException;
    
    @Override
    public synchronized native int shared_cache(final boolean p0);
    
    @Override
    public synchronized native int enable_load_extension(final boolean p0);
    
    @Override
    public native void interrupt();
    
    @Override
    public synchronized native void busy_timeout(final int p0);
    
    @Override
    public synchronized native void busy_handler(final BusyHandler p0);
    
    @Override
    protected synchronized long prepare(final String s) throws SQLException {
        return (long)b.N(this, 919427825, new Object[] { (byte[])b.K(-487761142, new Object[] { s }) });
    }
    
    synchronized native long prepare_utf8(final byte[] p0) throws SQLException;
    
    @Override
    synchronized String errmsg() {
        return (String)b.K(-502310157, new Object[] { (byte[])b.N(this, 650468078, null) });
    }
    
    synchronized native byte[] errmsg_utf8();
    
    @Override
    public synchronized String libversion() {
        return (String)b.K(-502310157, new Object[] { (byte[])b.N(this, 806705912, null) });
    }
    
    native byte[] libversion_utf8();
    
    @Override
    public synchronized native int changes();
    
    @Override
    public synchronized native int total_changes();
    
    @Override
    protected synchronized native int finalize(final long p0);
    
    @Override
    public synchronized native int step(final long p0);
    
    @Override
    public synchronized native int reset(final long p0);
    
    @Override
    public synchronized native int clear_bindings(final long p0);
    
    @Override
    synchronized native int bind_parameter_count(final long p0);
    
    @Override
    public synchronized native int column_count(final long p0);
    
    @Override
    public synchronized native int column_type(final long p0, final int p1);
    
    @Override
    public synchronized String column_decltype(final long l, final int i) {
        return (String)b.K(-502310157, new Object[] { (byte[])b.N(this, 2046384885, new Object[] { l, i }) });
    }
    
    synchronized native byte[] column_decltype_utf8(final long p0, final int p1);
    
    @Override
    public synchronized String column_table_name(final long l, final int i) {
        return (String)b.K(-502310157, new Object[] { (byte[])b.N(this, -328508686, new Object[] { l, i }) });
    }
    
    synchronized native byte[] column_table_name_utf8(final long p0, final int p1);
    
    @Override
    public synchronized String column_name(final long l, final int i) {
        return (String)b.K(-502310157, new Object[] { (byte[])b.N(this, -1189520649, new Object[] { l, i }) });
    }
    
    synchronized native byte[] column_name_utf8(final long p0, final int p1);
    
    @Override
    public synchronized String column_text(final long l, final int i) {
        return (String)b.K(-502310157, new Object[] { (byte[])b.N(this, -77636868, new Object[] { l, i }) });
    }
    
    synchronized native byte[] column_text_utf8(final long p0, final int p1);
    
    @Override
    public synchronized native byte[] column_blob(final long p0, final int p1);
    
    @Override
    public synchronized native double column_double(final long p0, final int p1);
    
    @Override
    public synchronized native long column_long(final long p0, final int p1);
    
    @Override
    public synchronized native int column_int(final long p0, final int p1);
    
    @Override
    synchronized native int bind_null(final long p0, final int p1);
    
    @Override
    synchronized native int bind_int(final long p0, final int p1, final int p2);
    
    @Override
    synchronized native int bind_long(final long p0, final int p1, final long p2);
    
    @Override
    synchronized native int bind_double(final long p0, final int p1, final double p2);
    
    @Override
    synchronized int bind_text(final long l, final int i, final String s) {
        return (int)b.N(this, 192109305, new Object[] { l, i, (byte[])b.K(-487761142, new Object[] { s }) });
    }
    
    synchronized native int bind_text_utf8(final long p0, final int p1, final byte[] p2);
    
    @Override
    synchronized native int bind_blob(final long p0, final int p1, final byte[] p2);
    
    @Override
    public synchronized native void result_null(final long p0);
    
    @Override
    public synchronized void result_text(final long l, final String s) {
        b.N(this, 1701272310, new Object[] { l, (byte[])b.K(-487761142, new Object[] { s }) });
    }
    
    synchronized native void result_text_utf8(final long p0, final byte[] p1);
    
    @Override
    public synchronized native void result_blob(final long p0, final byte[] p1);
    
    @Override
    public synchronized native void result_double(final long p0, final double p1);
    
    @Override
    public synchronized native void result_long(final long p0, final long p1);
    
    @Override
    public synchronized native void result_int(final long p0, final int p1);
    
    @Override
    public synchronized void result_error(final long l, final String s) {
        b.N(this, -357868805, new Object[] { l, (byte[])b.K(-487761142, new Object[] { s }) });
    }
    
    synchronized native void result_error_utf8(final long p0, final byte[] p1);
    
    @Override
    public synchronized String value_text(final Function function, final int i) {
        return (String)b.K(-502310157, new Object[] { (byte[])b.N(this, 126049248, new Object[] { function, i }) });
    }
    
    synchronized native byte[] value_text_utf8(final Function p0, final int p1);
    
    @Override
    public synchronized native byte[] value_blob(final Function p0, final int p1);
    
    @Override
    public synchronized native double value_double(final Function p0, final int p1);
    
    @Override
    public synchronized native long value_long(final Function p0, final int p1);
    
    @Override
    public synchronized native int value_int(final Function p0, final int p1);
    
    @Override
    public synchronized native int value_type(final Function p0, final int p1);
    
    @Override
    public synchronized int create_function(final String s, final Function function, final int i, final int j) {
        return (int)b.N(this, -1724032259, new Object[] { (byte[])b.K(-487761142, new Object[] { s }), function, i, j });
    }
    
    synchronized native int create_function_utf8(final byte[] p0, final Function p1, final int p2, final int p3);
    
    @Override
    public synchronized int destroy_function(final String s, final int i) {
        return (int)b.N(this, 1967938298, new Object[] { (byte[])b.K(-487761142, new Object[] { s }), i });
    }
    
    synchronized native int destroy_function_utf8(final byte[] p0, final int p1);
    
    @Override
    synchronized native void free_functions();
    
    @Override
    public int backup(final String s, final String s2, final ProgressObserver progressObserver) throws SQLException {
        return (int)b.N(this, 269835231, new Object[] { (byte[])b.K(-487761142, new Object[] { s }), (byte[])b.K(-487761142, new Object[] { s2 }), progressObserver });
    }
    
    synchronized native int backup(final byte[] p0, final byte[] p1, final ProgressObserver p2) throws SQLException;
    
    @Override
    public synchronized int restore(final String s, final String s2, final ProgressObserver progressObserver) throws SQLException {
        return (int)b.N(this, 2126273508, new Object[] { (byte[])b.K(-487761142, new Object[] { s }), (byte[])b.K(-487761142, new Object[] { s2 }), progressObserver });
    }
    
    synchronized native int restore(final byte[] p0, final byte[] p1, final ProgressObserver p2) throws SQLException;
    
    @Override
    synchronized native boolean[][] column_metadata(final long p0);
    
    static void throwex(final String s) throws SQLException {
        throw (Throwable)b.j(-108635167, new Object[] { s });
    }
    
    static byte[] stringToUtf8ByteArray(final String s) {
        if (s == null) {
            return null;
        }
        try {
            return (byte[])b.N(s, -1143972898, new Object[] { CorePreparedStatement$CoreStatement.H("\uaf64\uc35d\u2eda\ub733\ud12a") });
        }
        catch (UnsupportedEncodingException ex) {
            throw (Throwable)b.j(-1957274653, new Object[] { CorePreparedStatement$CoreStatement.H("\uaf64\uc35d\u2eda\ub733\ud12a\u928e\u832c\uaac8\u5975\udfd0\u3f88\u4a01\u8607\u90a8\u57b1\uea15\u1e67\u0e6e\u63f9\uc168\uceac\u56f1"), ex });
        }
    }
    
    static String utf8ByteArrayToString(final byte[] array) {
        if (array == null) {
            return null;
        }
        try {
            return (String)b.j(-85107736, new Object[] { array, CoreStatement$CoreStatement.F("\u0b10\ubbf2\u95c9\u47b8\u3fe6") });
        }
        catch (UnsupportedEncodingException ex) {
            throw (Throwable)b.j(-1957274653, new Object[] { CoreStatement$CoreStatement.F("\u0b10\ubbf2\u95c9\u47b8\u3fe6\udd63\u6a05\ud0c4\u637f\u462f\u42ea\uc6dd\u41df\uca5d\u1d9b\u8423\u69dc\u88c6\ud7f4\uc995d\u5641"), ex });
        }
    }
    
    @Override
    public synchronized native void register_progress_handler(final int p0, final ProgressHandler p1) throws SQLException;
    
    @Override
    public synchronized native void clear_progress_handler() throws SQLException;
    
    static {
        if (b.N(CorePreparedStatement$CoreStatement.H("\ub8a7\u6d44\ubc5e\u42e6\ua34b\u65e2\ufb4a\u0d35\u2689\ua088\uda5b\u4c98\uafa2\uc35a\u4efc\u91af\u9a79\ud5e4\u42a4"), -1186243614, new Object[] { b.K(-99001371, new Object[] { CorePreparedStatement$CoreStatement.H("\ub899\u6d4d\ubc4d\u42a7\ua324\u65fa\ufb43\u0d69\u2690\ua084\uda51\u4cdc\uaf9d\uc35a") }) })) {
            System.loadLibrary(CorePreparedStatement$CoreStatement.H("\ub880\u6d5d\ubc57\u42af\ua37e\u65e9\ufb44\u0d23\u2684\ua082"));
            b.l(1051417355, true);
            b.l(832264944, true);
        }
        else {
            b.l(1051417355, false);
            b.l(832264944, false);
        }
    }
}
