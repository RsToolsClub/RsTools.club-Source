// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc4;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.RowIdLifetime;
import org.sqlite.SQLiteConnection;
import org.sqlite.jdbc3.JDBC3DatabaseMetaData;

public class JDBC4DatabaseMetaData extends JDBC3DatabaseMetaData
{
    public JDBC4DatabaseMetaData(final SQLiteConnection sqLiteConnection) {
        super(sqLiteConnection);
    }
    
    public <T> T unwrap(final Class<T> clazz) throws ClassCastException {
        return (T)kt.R(clazz, 1632538426, new Object[] { this });
    }
    
    public boolean isWrapperFor(final Class<?> clazz) {
        return (boolean)kt.R(clazz, 1439207227, new Object[] { this });
    }
    
    public RowIdLifetime getRowIdLifetime() throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public ResultSet getSchemas(final String s, final String s2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public boolean autoCommitFailureClosesAllResultSets() throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public ResultSet getClientInfoProperties() throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public ResultSet getFunctions(final String s, final String s2, final String s3) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public ResultSet getPseudoColumns(final String s, final String s2, final String s3, final String s4) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public boolean generatedKeyAlwaysReturned() throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
}
