// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.core;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import java.sql.PreparedStatement;
import org.sqlite.SQLiteConnection;
import java.sql.DatabaseMetaData;

public abstract class CoreDatabaseMetaData implements DatabaseMetaData
{
    protected SQLiteConnection conn;
    protected PreparedStatement getTables;
    protected PreparedStatement getTableTypes;
    protected PreparedStatement getTypeInfo;
    protected PreparedStatement getCatalogs;
    protected PreparedStatement getSchemas;
    protected PreparedStatement getUDTs;
    protected PreparedStatement getColumnsTblName;
    protected PreparedStatement getSuperTypes;
    protected PreparedStatement getSuperTables;
    protected PreparedStatement getTablePrivileges;
    protected PreparedStatement getIndexInfo;
    protected PreparedStatement getProcedures;
    protected PreparedStatement getProcedureColumns;
    protected PreparedStatement getAttributes;
    protected PreparedStatement getBestRowIdentifier;
    protected PreparedStatement getVersionColumns;
    protected PreparedStatement getColumnPrivileges;
    protected PreparedStatement getGeneratedKeys;
    protected static final Pattern PK_UNNAMED_PATTERN;
    protected static final Pattern PK_NAMED_PATTERN;
    
    protected CoreDatabaseMetaData(final SQLiteConnection sqLiteConnection) {
        b.J(this, -1845273677, null);
        b.J(this, 1743805368, null);
        b.J(this, -817079371, null);
        b.J(this, -774415438, null);
        b.J(this, -1340187721, null);
        b.J(this, 686250940, null);
        b.J(this, -1246864455, null);
        b.J(this, 2125814710, null);
        b.J(this, 1527274427, null);
        b.J(this, 227171232, null);
        b.J(this, 902978493, null);
        b.J(this, 1609194426, null);
        b.J(this, 1137204127, null);
        b.J(this, -1106158684, null);
        b.J(this, -859284575, null);
        b.J(this, 1624726430, null);
        b.J(this, 1001872291, null);
        b.J(this, 1739152296, null);
        b.J(this, 1289575333, sqLiteConnection);
    }
    
    public abstract ResultSet getGeneratedKeys() throws SQLException;
    
    protected void checkOpen() throws SQLException {
        if (b.h(this, 1289575333) == null) {
            throw (Throwable)b.j(-108635167, new Object[] { CoreStatement$CoreStatement.F("\uedbb\ua503\u8919\u5e48\ua23b\uc21f\u8124\ub489\ua4bc\udfe4\u1088\ued9e\u5801\u9881\u5a8c\u829d\ue2a3") });
        }
    }
    
    public synchronized void close() throws SQLException {
        if (b.h(this, 1289575333) == null) {
            return;
        }
        try {
            if (b.h(this, -1845273677) != null) {
                b.N(b.h(this, -1845273677), 451566498, null);
            }
            if (b.h(this, 1743805368) != null) {
                b.N(b.h(this, 1743805368), 451566498, null);
            }
            if (b.h(this, -817079371) != null) {
                b.N(b.h(this, -817079371), 451566498, null);
            }
            if (b.h(this, -774415438) != null) {
                b.N(b.h(this, -774415438), 451566498, null);
            }
            if (b.h(this, -1340187721) != null) {
                b.N(b.h(this, -1340187721), 451566498, null);
            }
            if (b.h(this, 686250940) != null) {
                b.N(b.h(this, 686250940), 451566498, null);
            }
            if (b.h(this, -1246864455) != null) {
                b.N(b.h(this, -1246864455), 451566498, null);
            }
            if (b.h(this, 2125814710) != null) {
                b.N(b.h(this, 2125814710), 451566498, null);
            }
            if (b.h(this, 1527274427) != null) {
                b.N(b.h(this, 1527274427), 451566498, null);
            }
            if (b.h(this, 227171232) != null) {
                b.N(b.h(this, 227171232), 451566498, null);
            }
            if (b.h(this, 902978493) != null) {
                b.N(b.h(this, 902978493), 451566498, null);
            }
            if (b.h(this, 1609194426) != null) {
                b.N(b.h(this, 1609194426), 451566498, null);
            }
            if (b.h(this, 1137204127) != null) {
                b.N(b.h(this, 1137204127), 451566498, null);
            }
            if (b.h(this, -1106158684) != null) {
                b.N(b.h(this, -1106158684), 451566498, null);
            }
            if (b.h(this, -859284575) != null) {
                b.N(b.h(this, -859284575), 451566498, null);
            }
            if (b.h(this, 1624726430) != null) {
                b.N(b.h(this, 1624726430), 451566498, null);
            }
            if (b.h(this, 1001872291) != null) {
                b.N(b.h(this, 1001872291), 451566498, null);
            }
            if (b.h(this, 1739152296) != null) {
                b.N(b.h(this, 1739152296), 451566498, null);
            }
            b.J(this, -1845273677, null);
            b.J(this, 1743805368, null);
            b.J(this, -817079371, null);
            b.J(this, -774415438, null);
            b.J(this, -1340187721, null);
            b.J(this, 686250940, null);
            b.J(this, -1246864455, null);
            b.J(this, 2125814710, null);
            b.J(this, 1527274427, null);
            b.J(this, 227171232, null);
            b.J(this, 902978493, null);
            b.J(this, 1609194426, null);
            b.J(this, 1137204127, null);
            b.J(this, -1106158684, null);
            b.J(this, -859284575, null);
            b.J(this, 1624726430, null);
            b.J(this, 1001872291, null);
            b.J(this, 1739152296, null);
            b.J(this, 1289575333, null);
        }
        finally {
            b.J(this, 1289575333, null);
            throw;
        }
    }
    
    protected static String quote(final String s) {
        if (s == null) {
            return CoreStatement$CoreStatement.F("\u6c60\u8908\u5673\u2bb6");
        }
        return (String)b.K(608721831, new Object[] { CoreStatement$CoreStatement.F("\u6c29\u8958\u566c\u2bfd"), { s } });
    }
    
    protected String escape(final String s) {
        final int intValue = (int)b.N(s, 216619948, null);
        final Object j = b.j(1106795433, new Object[] { intValue });
        for (int i = 0; i < intValue; ++i) {
            if ((char)b.N(s, 1297177510, new Object[] { i }) == '\'') {
                b.N(j, -2091820117, new Object[] { '\'' });
            }
            b.N(j, -2091820117, new Object[] { (char)b.N(s, 1297177510, new Object[] { i }) });
        }
        return (String)b.N(j, 832527248, null);
    }
    
    @Override
    protected void finalize() throws Throwable {
        b.N(this, 873749421, null);
    }
    
    static {
        b.l(201874319, b.K(1292589994, new Object[] { CorePreparedStatement$CoreStatement.H("\u6d78\uf8d5\u4919\ua0bb\u29d0\u068b\u83f9\uc20d\ued33\u7cd4\uaca0\ub2f3\uce19\u8057\ueb2d\u36d0Q\u76fc\ubf17\ua830\u4c2a\u452b\uf409\ue021\ub2fd\u07f7\ub5b1\u3786\u8dde\uca51\ue181\u1e76\u4eb5\u74e3\u14d8\u7fe5"), 34 }));
        b.l(-128754796, b.K(1292589994, new Object[] { CorePreparedStatement$CoreStatement.H("\u6d78\uf8d5\u4919\ua0bb\u29c3\u0696\u83fe\uc213\ued26\u7cd4\uacb8\ub2e6\uce24\u8028\ueb3a\u36e6#\u7688\ubf4a\ua831\u4c49\u452a\uf47d\ue07c\ub2fc\u0798\ub5cf\u37e4\u8dbd\uca3a\ue1ec\u1e06\u4eb5\u74b9\u14dd\u7f84\u2256\u12e4\u7fdf\u8762\u08e8\uc6f5\uebd7\u447c\u7cb2\u201f\ub58b\u3f36\u69f3\u25fd\ueb4c\u77a6"), 34 }));
    }
}
