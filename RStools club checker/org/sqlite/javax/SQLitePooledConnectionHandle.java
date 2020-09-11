// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.javax;

import java.util.concurrent.Executor;
import java.sql.Struct;
import java.sql.Array;
import java.util.Properties;
import java.sql.SQLClientInfoException;
import java.sql.SQLXML;
import java.sql.NClob;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Savepoint;
import java.util.Map;
import java.sql.SQLWarning;
import java.sql.DatabaseMetaData;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import org.sqlite.core.DB;
import java.util.concurrent.atomic.AtomicBoolean;
import org.sqlite.SQLiteConnection;

class SQLitePooledConnectionHandle extends SQLiteConnection
{
    private final SQLitePooledConnection parent;
    private final AtomicBoolean isClosed;
    
    public SQLitePooledConnectionHandle(final SQLitePooledConnection sqLitePooledConnection) {
        super((DB)j.o(j.o(sqLitePooledConnection, 341944765, null), 276343230, null));
        j.f(this, 122071480, j.h(-1871730249, new Object[] { false }));
        j.f(this, 1178511801, sqLitePooledConnection);
    }
    
    public Statement createStatement() throws SQLException {
        return (Statement)j.h(2075961786, new Object[] { this });
    }
    
    public PreparedStatement prepareStatement(final String s) throws SQLException {
        return (PreparedStatement)j.h(5286275, new Object[] { this, s });
    }
    
    public CallableStatement prepareCall(final String s) throws SQLException {
        return null;
    }
    
    public String nativeSQL(final String s) throws SQLException {
        return null;
    }
    
    @Override
    public void setAutoCommit(final boolean b) throws SQLException {
    }
    
    @Override
    public boolean getAutoCommit() throws SQLException {
        return false;
    }
    
    @Override
    public void commit() throws SQLException {
    }
    
    @Override
    public void rollback() throws SQLException {
    }
    
    @Override
    public void close() throws SQLException {
        final Object h = j.h(1161734532, new Object[] { j.e(this, 1178511801) });
        final Object o = j.o(j.e(this, 1178511801), 1428466101, null);
        for (int i = (int)j.o(o, -1196512842, null) - 1; i >= 0; --i) {
            j.o(j.o(o, 270510511, new Object[] { i }), -21321296, new Object[] { h });
        }
        if (!(boolean)j.o(j.o(j.e(this, 1178511801), 341944765, null), 1392028081, null)) {
            j.o(j.o(j.e(this, 1178511801), 341944765, null), -785077838, null);
        }
        j.o(j.o(j.e(this, 1178511801), 341944765, null), 311536059, new Object[] { true });
        j.o(j.e(this, 122071480), 1926670780, new Object[] { true });
    }
    
    @Override
    public boolean isClosed() {
        return (boolean)j.o(j.e(this, 122071480), -1879070291, null);
    }
    
    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return null;
    }
    
    public void setReadOnly(final boolean b) throws SQLException {
    }
    
    public boolean isReadOnly() throws SQLException {
        return false;
    }
    
    public void setCatalog(final String s) throws SQLException {
    }
    
    public String getCatalog() throws SQLException {
        return null;
    }
    
    @Override
    public void setTransactionIsolation(final int n) throws SQLException {
    }
    
    @Override
    public int getTransactionIsolation() {
        return 0;
    }
    
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }
    
    public void clearWarnings() throws SQLException {
    }
    
    public Statement createStatement(final int n, final int n2) throws SQLException {
        return null;
    }
    
    public PreparedStatement prepareStatement(final String s, final int n, final int n2) throws SQLException {
        return null;
    }
    
    public CallableStatement prepareCall(final String s, final int n, final int n2) throws SQLException {
        return null;
    }
    
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return null;
    }
    
    public void setTypeMap(final Map<String, Class<?>> map) throws SQLException {
    }
    
    public void setHoldability(final int n) throws SQLException {
    }
    
    public int getHoldability() throws SQLException {
        return 0;
    }
    
    public Savepoint setSavepoint() throws SQLException {
        return null;
    }
    
    public Savepoint setSavepoint(final String s) throws SQLException {
        return null;
    }
    
    public void rollback(final Savepoint savepoint) throws SQLException {
    }
    
    public void releaseSavepoint(final Savepoint savepoint) throws SQLException {
    }
    
    public Statement createStatement(final int n, final int n2, final int n3) throws SQLException {
        return null;
    }
    
    public PreparedStatement prepareStatement(final String s, final int n, final int n2, final int n3) throws SQLException {
        return null;
    }
    
    public CallableStatement prepareCall(final String s, final int n, final int n2, final int n3) throws SQLException {
        return null;
    }
    
    public PreparedStatement prepareStatement(final String s, final int n) throws SQLException {
        return null;
    }
    
    public PreparedStatement prepareStatement(final String s, final int[] array) throws SQLException {
        return null;
    }
    
    public PreparedStatement prepareStatement(final String s, final String[] array) throws SQLException {
        return null;
    }
    
    public Clob createClob() throws SQLException {
        return null;
    }
    
    public Blob createBlob() throws SQLException {
        return null;
    }
    
    public NClob createNClob() throws SQLException {
        return null;
    }
    
    public SQLXML createSQLXML() throws SQLException {
        return null;
    }
    
    public boolean isValid(final int n) throws SQLException {
        return false;
    }
    
    public void setClientInfo(final String s, final String s2) throws SQLClientInfoException {
    }
    
    public void setClientInfo(final Properties properties) throws SQLClientInfoException {
    }
    
    public String getClientInfo(final String s) throws SQLException {
        return null;
    }
    
    public Properties getClientInfo() throws SQLException {
        return null;
    }
    
    public Array createArrayOf(final String s, final Object[] array) throws SQLException {
        return null;
    }
    
    public Struct createStruct(final String s, final Object[] array) throws SQLException {
        return null;
    }
    
    @Override
    public void setSchema(final String s) throws SQLException {
    }
    
    @Override
    public String getSchema() throws SQLException {
        return null;
    }
    
    @Override
    public void abort(final Executor executor) throws SQLException {
    }
    
    @Override
    public void setNetworkTimeout(final Executor executor, final int n) throws SQLException {
    }
    
    @Override
    public int getNetworkTimeout() throws SQLException {
        return 0;
    }
    
    public <T> T unwrap(final Class<T> clazz) throws SQLException {
        return null;
    }
    
    public boolean isWrapperFor(final Class<?> clazz) throws SQLException {
        return false;
    }
    
    @Override
    public int getBusyTimeout() {
        return 0;
    }
    
    @Override
    public void setBusyTimeout(final int n) {
    }
    
    @Override
    public DB getDatabase() {
        return null;
    }
}
