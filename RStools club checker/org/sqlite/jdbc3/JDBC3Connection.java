// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc3;

import java.sql.Struct;
import java.sql.Savepoint;
import java.sql.PreparedStatement;
import java.sql.CallableStatement;
import java.sql.Statement;
import java.sql.SQLWarning;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.sqlite.SQLiteConnection;

public abstract class JDBC3Connection extends SQLiteConnection
{
    private final AtomicInteger savePoint;
    private Map<String, Class<?>> typeMap;
    
    protected JDBC3Connection(final String s, final String s2, final Properties properties) throws SQLException {
        super(s, s2, properties);
        j.i(this, -1693796208, j.H(180926607, new Object[] { 0 }));
    }
    
    public String getCatalog() throws SQLException {
        j.g(this, 501528721, null);
        return null;
    }
    
    public void setCatalog(final String s) throws SQLException {
        j.g(this, 501528721, null);
    }
    
    public int getHoldability() throws SQLException {
        j.g(this, 501528721, null);
        return 2;
    }
    
    public void setHoldability(final int n) throws SQLException {
        j.g(this, 501528721, null);
        if (n != 2) {
            throw (Throwable)j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u2975\u693f\u391e\ua2b9\uce83\u7286\ub32b\uf5a7\ue313\u358a\u61de\u83ee\uea8f\ub021\udef9\uf647\u6588\ua7c4\u9c87\ubdb3\u02d1\u0fc1\ud795\u94c4\uc0f5\u37d8\u3270\udf77\u81c6\u7b98\uf8c5\u91d9\uc129\uc9bf\ua75a\u2b5d\uce12\u2427\u0235\uf3a1\u671b\u0a6c\u3c1d\uc90a") });
        }
    }
    
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        // monitorenter(this)
        try {
            if (j.Y(this, -1822836590) == null) {
                j.i(this, -1822836590, j.H(-893142893, null));
            }
            return (Map<String, Class<?>>)j.Y(this, -1822836590);
        }
        finally {
            // monitorexit(this)
            throw;
        }
    }
    
    public void setTypeMap(final Map map) throws SQLException {
        // monitorenter(this)
        try {
            j.i(this, -1822836590, map);
        }
        finally {
            // monitorexit(this)
            throw;
        }
    }
    
    public boolean isReadOnly() throws SQLException {
        return ((int)j.g(j.g(j.g(this, -598493036, null), -1866483563, null), 1722857622, null) & (int)j.Y(j.B(1005893799), 474396840)) != 0x0;
    }
    
    public void setReadOnly(final boolean b) throws SQLException {
        if (b != (boolean)j.g(this, -464275287, null)) {
            throw (Throwable)j.H(223000547, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\uc1ae\u97b2\uf486\u4117\ueee5\ud956\u9b58\u8253\u729e\u9c1c\udc98\udf9e\u86bc\ucafa\ua32a\u89d7\u416e\u9b83\uf652\ue3c1\u7f0a\u138d\u5754\u093f\u0a1f\u404f\u8942\u9515\u7a37\ua7ca\u9633\u54a8\u8439\u0ca4\ueea7\u9565\u4b4a\u4470\u81dd\u2aac\u5cc9\ud518\u1cc5\uf27f\u15b8\u8cbc\ub1ef\u27e8\ub8f8\u58fa\u80ae\uc667\u2e8d\u7ecc\ub930\u60c5\u08a4\u5c24\u3ee0\uf341\uc208\ue607\u9ddd\u35b0\u1400\u096f\u8ccb\u8b95\u840c\u7c30\ua5b6\uc1a8\ue3b8\uf259\u3f86\ued8c\u815d\u2def\u16af\ufc97\u1378\u7bf3\u783b\u6b32\uf0a0\uaac4\u53d3\uaa14\u0980\u2390\ude65\ufd88\u3179\u46fd\u3271\uafab\u8ca7\u87df\u5416\u76e7\uda0e\uc4fd\u3820\ucbad\ufd84\u93d0\ucf47\u34d0\ue3a8\u671c\u979c\u35f8\u3069\u22f0\u2932\u18e0\ue90b\u951f\u2da8\u59d3\u5219\u300c\u44ad\u889e\u13e4\u5aaa\u5bb8") });
        }
    }
    
    public String nativeSQL(final String s) {
        return s;
    }
    
    public void clearWarnings() throws SQLException {
    }
    
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }
    
    public Statement createStatement() throws SQLException {
        return (Statement)j.g(this, -546195286, new Object[] { 1003, 1007, 2 });
    }
    
    public Statement createStatement(final int i, final int j) throws SQLException {
        return (Statement)j.g(this, -546195286, new Object[] { i, j, 2 });
    }
    
    public abstract Statement createStatement(final int p0, final int p1, final int p2) throws SQLException;
    
    public CallableStatement prepareCall(final String s) throws SQLException {
        return (CallableStatement)j.g(this, 872593579, new Object[] { s, 1003, 1007, 2 });
    }
    
    public CallableStatement prepareCall(final String s, final int i, final int j) throws SQLException {
        return (CallableStatement)j.g(this, 872593579, new Object[] { s, i, j, 2 });
    }
    
    public CallableStatement prepareCall(final String s, final int n, final int n2, final int n3) throws SQLException {
        throw (Throwable)j.H(223000547, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u285e\uf94d\u2e27\u49ec\u9450\u6e8b\u18dd\uc464\ub5db\udd06\u0aed\u5722\ua838\u8418\ua102\ue172\u66cc\ued23\uc4cb\uc608\u8211\u946b\u7399\u2994\u542a\uffeb\uc18b\u58ec\ufe74\u0b8d\u6a2a\u7614\u1123\u4106\u2ddb\u0702\u5ce6\u6173\u7ede\u5e0c\ube5b") });
    }
    
    public PreparedStatement prepareStatement(final String s) throws SQLException {
        return (PreparedStatement)j.g(this, 700102828, new Object[] { s, 1003, 1007 });
    }
    
    public PreparedStatement prepareStatement(final String s, final int n) throws SQLException {
        return (PreparedStatement)j.g(this, -853428051, new Object[] { s });
    }
    
    public PreparedStatement prepareStatement(final String s, final int[] array) throws SQLException {
        return (PreparedStatement)j.g(this, -853428051, new Object[] { s });
    }
    
    public PreparedStatement prepareStatement(final String s, final String[] array) throws SQLException {
        return (PreparedStatement)j.g(this, -853428051, new Object[] { s });
    }
    
    public PreparedStatement prepareStatement(final String s, final int i, final int j) throws SQLException {
        return (PreparedStatement)j.g(this, -737560402, new Object[] { s, i, j, 2 });
    }
    
    public abstract PreparedStatement prepareStatement(final String p0, final int p1, final int p2, final int p3) throws SQLException;
    
    public Savepoint setSavepoint() throws SQLException {
        j.g(this, 501528721, null);
        if (j.g(this, 1306638463, null)) {
            j.g(j.g(this, -258754432, null), -253708159, new Object[] { false });
        }
        final Object h = j.H(-1384204157, new Object[] { (int)j.g(j.Y(this, -1693796208), -1570523006, null) });
        j.g(j.g(this, -598493036, null), -575031162, new Object[] { j.x(1378990213, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u3a15\u44cb\u2639\uae9d\u325d\u7cdf\uca8e\ua031\u8a7a\u52f9\u2748\u7cf9"), { j.g(h, -1559250812, null) } }), false });
        return (Savepoint)h;
    }
    
    public Savepoint setSavepoint(final String s) throws SQLException {
        j.g(this, 501528721, null);
        if (j.g(this, 1306638463, null)) {
            j.g(j.g(this, -258754432, null), -253708159, new Object[] { false });
        }
        final Object h = j.H(-775178089, new Object[] { (int)j.g(j.Y(this, -1693796208), -1570523006, null), s });
        j.g(j.g(this, -598493036, null), -575031162, new Object[] { j.x(1378990213, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\uddbc\ua72d\ub90f\u4f75\u7137\u8058\u34b0\u6484\ud73d\u180e\ua148\uf56f"), { j.g(h, -1559250812, null) } }), false });
        return (Savepoint)h;
    }
    
    public void releaseSavepoint(final Savepoint savepoint) throws SQLException {
        j.g(this, 501528721, null);
        if (j.g(this, 1306638463, null)) {
            throw (Throwable)j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0400\ufea1\ud4af\u72a8\ub7c6\u6636\u59f1\u16e2\u7e21\uf130\u9d25\u8715\u39f0\u412f\u1bf2\u52ce\u627d\u38ef\u541a\u9220\uafee\u12bf\uf6aa\u0dcf\u45e1\u0eaa\ubc3e\u9fb2") });
        }
        j.g(j.g(this, -598493036, null), -575031162, new Object[] { j.x(1378990213, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0436\ufe85\ud497\u728c\ub7e5\u6604\u59c7\u16a7\u7e52\uf118\u9d1d\u8770\u39c1\u4115\u1bcf\u52ef\u6204\u38ac\u5450\u923e"), { j.g(savepoint, -1559250812, null) } }), false });
    }
    
    public void rollback(final Savepoint savepoint) throws SQLException {
        j.g(this, 501528721, null);
        if (j.g(this, 1306638463, null)) {
            throw (Throwable)j.H(223000547, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6d84\u7780\uf5ed\u3793\uf865\u0ac2\uacf8\uf042\ucd17\ud71a\udb83\ue6a1\u45d2\ucd4f\u938b\u0370\u967c\u67c0\u44d2'\uce2d\u169d\uaf10\u7ec1\udf2a\ud824\u1cc1\u4ced") });
        }
        j.g(j.g(this, -598493036, null), -575031162, new Object[] { j.x(1378990213, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6db2\u77ae\uf5d5\u37be\uf845\u0ae2\uacc8\uf06c\ucd17\ud727\udba2\ue6a1\u45e0\ucd7b\u93a9\u035a\u9601\u67ec\u44f4\u0004\uce14\u16d4\uaf41\u7e92"), { j.g(savepoint, -1559250812, null) } }), Boolean.valueOf((boolean)j.g(this, 1306638463, null)) });
    }
    
    public Struct createStruct(final String s, final Object[] array) throws SQLException {
        throw (Throwable)j.H(223000547, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9179\ucc30\udf04\u614f\u0877\u6ebc\u07e5\uba8f\u025c\u1158\u64c5\u6fcf\u0e6a\uc748\u7e4b\u5474\u6901\u2ef9\u365c\u1e06\u4c06") });
    }
}
