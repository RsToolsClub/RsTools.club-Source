// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc4;

import java.sql.Array;
import java.sql.SQLClientInfoException;
import java.sql.SQLXML;
import java.sql.NClob;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Properties;
import org.sqlite.jdbc3.JDBC3Connection;

public class JDBC4Connection extends JDBC3Connection
{
    public JDBC4Connection(final String s, final String s2, final Properties properties) throws SQLException {
        super(s, s2, properties);
    }
    
    @Override
    public Statement createStatement(final int i, final int j, final int k) throws SQLException {
        kt.R(this, 567185209, null);
        kt.R(this, -2088661186, new Object[] { i, j, k });
        return (Statement)kt.k(-2074898625, new Object[] { this });
    }
    
    @Override
    public PreparedStatement prepareStatement(final String s, final int i, final int j, final int k) throws SQLException {
        kt.R(this, 567185209, null);
        kt.R(this, -2088661186, new Object[] { i, j, k });
        return (PreparedStatement)kt.k(1871744836, new Object[] { this, s });
    }
    
    @Override
    public boolean isClosed() throws SQLException {
        return (boolean)kt.R(this, 988254013, null);
    }
    
    public <T> T unwrap(final Class<T> clazz) throws ClassCastException {
        return (T)kt.R(clazz, 1632538426, new Object[] { this });
    }
    
    public boolean isWrapperFor(final Class<?> clazz) {
        return (boolean)kt.R(clazz, 1439207227, new Object[] { this });
    }
    
    public Clob createClob() throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public Blob createBlob() throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public NClob createNClob() throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public SQLXML createSQLXML() throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public boolean isValid(final int n) throws SQLException {
        if (kt.R(this, 1996263234, null)) {
            return false;
        }
        final Object r = kt.R(this, -64254141, null);
        try {
            final boolean booleanValue = (boolean)kt.R(r, 517508936, new Object[] { JDBC4Statement$JDBC4PreparedStatement.q("\u5bb6\uaf7d\u4579\u5fc7\u8978\uea67\u786c\ub860") });
            kt.R(r, -860647615, null);
            return booleanValue;
        }
        finally {
            kt.R(r, -860647615, null);
            throw;
        }
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
}
