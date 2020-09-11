// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc4;

import java.sql.SQLXML;
import java.io.InputStream;
import java.sql.NClob;
import java.io.Reader;
import java.sql.RowId;
import java.sql.SQLException;
import org.sqlite.SQLiteConnection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import org.sqlite.jdbc3.JDBC3PreparedStatement;

public class JDBC4PreparedStatement extends JDBC3PreparedStatement implements PreparedStatement, ParameterMetaData
{
    public JDBC4PreparedStatement(final SQLiteConnection sqLiteConnection, final String s) throws SQLException {
        super(sqLiteConnection, s);
    }
    
    public void setRowId(final int n, final RowId rowId) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setNString(final int n, final String s) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setNCharacterStream(final int n, final Reader reader, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setNClob(final int n, final NClob nClob) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setClob(final int n, final Reader reader, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setBlob(final int n, final InputStream inputStream, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setNClob(final int n, final Reader reader, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setSQLXML(final int n, final SQLXML sqlxml) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setAsciiStream(final int n, final InputStream inputStream, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setBinaryStream(final int n, final InputStream inputStream, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setCharacterStream(final int n, final Reader reader, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setAsciiStream(final int n, final InputStream inputStream) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setBinaryStream(final int n, final InputStream inputStream) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setCharacterStream(final int n, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setNCharacterStream(final int n, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setClob(final int n, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setBlob(final int n, final InputStream inputStream) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void setNClob(final int n, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
}
