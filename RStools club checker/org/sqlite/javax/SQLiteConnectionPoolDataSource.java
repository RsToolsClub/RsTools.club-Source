// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.javax;

import java.sql.SQLException;
import javax.sql.PooledConnection;
import org.sqlite.SQLiteConfig;
import javax.sql.ConnectionPoolDataSource;
import org.sqlite.SQLiteDataSource;

public class SQLiteConnectionPoolDataSource extends SQLiteDataSource implements ConnectionPoolDataSource
{
    public SQLiteConnectionPoolDataSource() {
    }
    
    public SQLiteConnectionPoolDataSource(final SQLiteConfig sqLiteConfig) {
        super(sqLiteConfig);
    }
    
    public PooledConnection getPooledConnection() throws SQLException {
        return (PooledConnection)j.o(this, 347384299, new Object[] { null, null });
    }
    
    public PooledConnection getPooledConnection(final String s, final String s2) throws SQLException {
        return (PooledConnection)j.h(1319545245, new Object[] { j.o(this, 110209516, new Object[] { s, s2 }) });
    }
}
