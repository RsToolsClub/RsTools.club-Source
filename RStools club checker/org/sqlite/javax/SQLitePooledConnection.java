// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.javax;

import java.sql.SQLException;
import javax.sql.ConnectionEventListener;
import java.util.List;
import java.sql.Connection;
import org.sqlite.SQLiteConnection;
import org.sqlite.jdbc4.JDBC4PooledConnection;

public class SQLitePooledConnection extends JDBC4PooledConnection
{
    protected SQLiteConnection physicalConn;
    protected volatile Connection handleConn;
    protected List<ConnectionEventListener> listeners;
    
    protected SQLitePooledConnection(final SQLiteConnection sqLiteConnection) {
        j.f(this, 1712892327, j.h(-448812626, null));
        j.f(this, -177296984, sqLiteConnection);
    }
    
    public SQLiteConnection getPhysicalConn() {
        return (SQLiteConnection)j.e(this, -177296984);
    }
    
    public void close() throws SQLException {
        if (j.e(this, 1242474921) != null) {
            j.o(j.e(this, 1712892327), -148461142, null);
            j.o(j.e(this, 1242474921), 960604595, null);
        }
        if (j.e(this, -177296984) != null) {
            try {
                j.o(j.e(this, -177296984), -952784460, null);
                j.f(this, -177296984, null);
            }
            finally {
                j.f(this, -177296984, null);
                throw;
            }
        }
    }
    
    public Connection getConnection() throws SQLException {
        if (j.e(this, 1242474921) != null) {
            j.o(j.e(this, 1242474921), 960604595, null);
        }
        j.f(this, 1242474921, j.C(-447567392, new Object[] { j.o(j.o(this, 257927653, null), -1384404506, null), { Connection.class }, j.h(-1320769057, new Object[] { this }) }));
        return (Connection)j.e(this, 1242474921);
    }
    
    public void addConnectionEventListener(final ConnectionEventListener connectionEventListener) {
        (boolean)j.o(j.e(this, 1712892327), -433739295, new Object[] { connectionEventListener });
    }
    
    public void removeConnectionEventListener(final ConnectionEventListener connectionEventListener) {
        (boolean)j.o(j.e(this, 1712892327), 2082318818, new Object[] { connectionEventListener });
    }
    
    public List<ConnectionEventListener> getListeners() {
        return (List<ConnectionEventListener>)j.e(this, 1712892327);
    }
}
