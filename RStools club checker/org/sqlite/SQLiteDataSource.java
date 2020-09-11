// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.Connection;
import java.io.PrintWriter;
import javax.sql.DataSource;

public class SQLiteDataSource implements DataSource
{
    private SQLiteConfig config;
    private transient PrintWriter logger;
    private int loginTimeout;
    private String url;
    private String databaseName;
    
    public SQLiteDataSource() {
        mn.L(this, -1959920848, 1);
        mn.L(this, -534709457, Function$SQLiteConnection.c("\u9e5e\u85f0\u8914\u8e07\ucd08\ue58e\ud1f2\u3376\u8ca1\u26a2\u0cb4\ub55d"));
        mn.L(this, -1857815762, "");
        mn.L(this, 1054669620, mn.k(-2063533259, null));
    }
    
    public SQLiteDataSource(final SQLiteConfig sqLiteConfig) {
        mn.L(this, -1959920848, 1);
        mn.L(this, -534709457, Function$SQLiteConnection.c("\u9e5e\u85f0\u8914\u8e07\ucd08\ue58e\ud1f2\u3376\u8ca1\u26a2\u0cb4\ub55d"));
        mn.L(this, -1857815762, "");
        mn.L(this, 1054669620, sqLiteConfig);
    }
    
    public void setConfig(final SQLiteConfig sqLiteConfig) {
        mn.L(this, 1054669620, sqLiteConfig);
    }
    
    public SQLiteConfig getConfig() {
        return (SQLiteConfig)mn.J(this, 1054669620);
    }
    
    public void setUrl(final String s) {
        mn.L(this, -534709457, s);
    }
    
    public String getUrl() {
        return (String)mn.J(this, -534709457);
    }
    
    public void setDatabaseName(final String s) {
        mn.L(this, -1857815762, s);
    }
    
    public String getDatabaseName() {
        return (String)mn.J(this, -1857815762);
    }
    
    public void setSharedCache(final boolean b) {
        mn.t(mn.J(this, 1054669620), 551091267, new Object[] { b });
    }
    
    public void setLoadExtension(final boolean b) {
        mn.t(mn.J(this, 1054669620), -186778829, new Object[] { b });
    }
    
    public void setReadOnly(final boolean b) {
        mn.t(mn.J(this, 1054669620), 1430649650, new Object[] { b });
    }
    
    public void setCacheSize(final int i) {
        mn.t(mn.J(this, 1054669620), -1491010743, new Object[] { i });
    }
    
    public void setCaseSensitiveLike(final boolean b) {
        mn.t(mn.J(this, 1054669620), -1544029432, new Object[] { b });
    }
    
    public void setCountChanges(final boolean b) {
        mn.t(mn.J(this, 1054669620), 796982023, new Object[] { b });
    }
    
    public void setDefaultCacheSize(final int i) {
        mn.t(mn.J(this, 1054669620), 1089272582, new Object[] { i });
    }
    
    public void setEncoding(final String s) {
        mn.t(mn.J(this, 1054669620), -1371079924, new Object[] { mn.W(766180109, new Object[] { s }) });
    }
    
    public void setEnforceForeignKeys(final boolean b) {
        mn.t(mn.J(this, 1054669620), -528221429, new Object[] { b });
    }
    
    public void setFullColumnNames(final boolean b) {
        mn.t(mn.J(this, 1054669620), 524090122, new Object[] { b });
    }
    
    public void setFullSync(final boolean b) {
        mn.t(mn.J(this, 1054669620), -336856319, new Object[] { b });
    }
    
    public void setIncrementalVacuum(final int i) {
        mn.t(mn.J(this, 1054669620), -1786119424, new Object[] { i });
    }
    
    public void setJournalMode(final String s) {
        mn.t(mn.J(this, 1054669620), -1555432706, new Object[] { mn.W(-1902904577, new Object[] { s }) });
    }
    
    public void setJournalSizeLimit(final int i) {
        mn.t(mn.J(this, 1054669620), 1758591749, new Object[] { i });
    }
    
    public void setLegacyFileFormat(final boolean b) {
        mn.t(mn.J(this, 1054669620), -1313211644, new Object[] { b });
    }
    
    public void setLockingMode(final String s) {
        mn.t(mn.J(this, 1054669620), 1307507458, new Object[] { mn.W(719619, new Object[] { s }) });
    }
    
    public void setPageSize(final int i) {
        mn.t(mn.J(this, 1054669620), 1244396249, new Object[] { i });
    }
    
    public void setMaxPageCount(final int i) {
        mn.t(mn.J(this, 1054669620), 479328984, new Object[] { i });
    }
    
    public void setReadUncommited(final boolean b) {
        mn.t(mn.J(this, 1054669620), -217056553, new Object[] { b });
    }
    
    public void setRecursiveTriggers(final boolean b) {
        mn.t(mn.J(this, 1054669620), 138541782, new Object[] { b });
    }
    
    public void setReverseUnorderedSelects(final boolean b) {
        mn.t(mn.J(this, 1054669620), -42927395, new Object[] { b });
    }
    
    public void setShortColumnNames(final boolean b) {
        mn.t(mn.J(this, 1054669620), -1063519524, new Object[] { b });
    }
    
    public void setSynchronous(final String s) {
        mn.t(mn.J(this, 1054669620), -1059652902, new Object[] { mn.W(1457060571, new Object[] { s }) });
    }
    
    public void setTempStore(final String s) {
        mn.t(mn.J(this, 1054669620), 1515059920, new Object[] { mn.W(1898576593, new Object[] { s }) });
    }
    
    public void setTempStoreDirectory(final String s) {
        mn.t(mn.J(this, 1054669620), 1088551631, new Object[] { s });
    }
    
    public void setTransactionMode(final String s) {
        mn.t(mn.J(this, 1054669620), -2114913586, new Object[] { s });
    }
    
    public void setUserVersion(final int i) {
        mn.t(mn.J(this, 1054669620), -379716907, new Object[] { i });
    }
    
    public Connection getConnection() throws SQLException {
        return (Connection)mn.t(this, 1957165780, new Object[] { null, null });
    }
    
    public SQLiteConnection getConnection(final String s, final String s2) throws SQLException {
        final Object t = mn.t(mn.J(this, 1054669620), -1352008676, null);
        if (s != null) {
            mn.t(t, -1081082820, new Object[] { Function$SQLiteConnection.c("\u3dc9\ub030\u0865\u0348"), s });
        }
        if (s2 != null) {
            mn.t(t, -1081082820, new Object[] { Function$SQLiteConnection.c("\u3dcc\ub022\u0873\u0349"), s2 });
        }
        return (SQLiteConnection)mn.W(859044891, new Object[] { mn.J(this, -534709457), t });
    }
    
    public PrintWriter getLogWriter() throws SQLException {
        return (PrintWriter)mn.J(this, 1322711763);
    }
    
    public int getLoginTimeout() throws SQLException {
        return (int)mn.J(this, -1959920848);
    }
    
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        throw (Throwable)mn.k(-1355416878, new Object[] { Function$SQLiteConnection.c("\u5fe9\uc821\u5120\u708f\u227b\u2f73\u0bbe\ud1e8\u76fa\u4f38\u0588\udda9\u9f1e\u3bae\uee81") });
    }
    
    public void setLogWriter(final PrintWriter printWriter) throws SQLException {
        mn.L(this, 1322711763, printWriter);
    }
    
    public void setLoginTimeout(final int i) throws SQLException {
        mn.L(this, -1959920848, i);
    }
    
    public boolean isWrapperFor(final Class<?> clazz) throws SQLException {
        return (boolean)mn.t(clazz, -2057504023, new Object[] { this });
    }
    
    public <T> T unwrap(final Class<T> clazz) throws SQLException {
        return (T)this;
    }
}
