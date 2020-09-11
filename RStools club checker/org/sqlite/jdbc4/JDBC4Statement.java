// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc4;

import java.sql.SQLException;
import org.sqlite.SQLiteConnection;
import java.sql.Statement;
import org.sqlite.jdbc3.JDBC3Statement;

public class JDBC4Statement extends JDBC3Statement implements Statement
{
    private boolean closed;
    boolean closeOnCompletion;
    
    public JDBC4Statement(final SQLiteConnection sqLiteConnection) {
        super(sqLiteConnection);
        kt.e(this, 1491111750, false);
    }
    
    public <T> T unwrap(final Class<T> clazz) throws ClassCastException {
        return (T)kt.R(clazz, 1632538426, new Object[] { this });
    }
    
    public boolean isWrapperFor(final Class<?> clazz) {
        return (boolean)kt.R(clazz, 1439207227, new Object[] { this });
    }
    
    @Override
    public void close() throws SQLException {
        kt.R(this, -1096249529, null);
        kt.e(this, 1491111750, true);
    }
    
    public boolean isClosed() {
        return (boolean)kt.P(this, 1491111750);
    }
    
    public void closeOnCompletion() throws SQLException {
        if (kt.P(this, 1491111750)) {
            throw (Throwable)kt.k(574656332, new Object[] { JDBC4Statement$JDBC4PreparedStatement.q("\u79dd\u24b7\u2696\u040b\u380a\u4137\u3b88\udd50\uc4e3\uccf3\u662a\ua367\u446d\ua32f\u1ae3\u7090\ua49f\u243a\ub39e") });
        }
        kt.e(this, 2081787717, true);
    }
    
    public boolean isCloseOnCompletion() throws SQLException {
        if (kt.P(this, 1491111750)) {
            throw (Throwable)kt.k(574656332, new Object[] { JDBC4DatabaseMetaData$JDBC4ResultSet.I("\ud3a5\u29d1\u1dc2\udd3e\u9c3a\ubde1\uf063\u2f95\u3b28\u0645\u0b39\u2f37\ua9da\u0272\uea50\u233f\u32f3\ue296\u15e5") });
        }
        return (boolean)kt.P(this, 2081787717);
    }
    
    public void setPoolable(final boolean b) throws SQLException {
    }
    
    public boolean isPoolable() throws SQLException {
        return false;
    }
}
