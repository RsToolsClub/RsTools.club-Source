// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc3;

import java.sql.SQLException;
import java.sql.Savepoint;

public class JDBC3Savepoint implements Savepoint
{
    final int id;
    final String name;
    
    JDBC3Savepoint(final int i) {
        j.i(this, 718649530, i);
        j.i(this, 468302011, null);
    }
    
    JDBC3Savepoint(final int i, final String s) {
        j.i(this, 718649530, i);
        j.i(this, 468302011, s);
    }
    
    public int getSavepointId() throws SQLException {
        return (int)j.Y(this, 718649530);
    }
    
    public String getSavepointName() throws SQLException {
        return (String)((j.Y(this, 468302011) == null) ? j.x(1378990213, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u4dee\ufb1a\u911b\ue382\u8092\u5daf\u5ad9\ueed9\u06fc\uf778\uf366\u9435\u9374\u1669\u25eb\ucef1\u1da6\u1029\uf768"), { j.x(2111158425, new Object[] { (int)j.Y(this, 718649530) }) } }) : j.Y(this, 468302011));
    }
}
