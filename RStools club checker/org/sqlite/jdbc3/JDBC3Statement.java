// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc3;

import org.sqlite.core.DB;
import java.sql.Connection;
import java.sql.SQLWarning;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.sqlite.SQLiteConnection;
import org.sqlite.core.CoreStatement;

public abstract class JDBC3Statement extends CoreStatement
{
    protected JDBC3Statement(final SQLiteConnection sqLiteConnection) {
        super(sqLiteConnection);
    }
    
    public void close() throws SQLException {
        j.g(this, -2117224385, null);
    }
    
    @Override
    protected void finalize() throws SQLException {
        j.g(this, -621758400, null);
    }
    
    public boolean execute(final String s) throws SQLException {
        j.g(this, -2117224385, null);
        final Object x = j.x(-273827775, new Object[] { s });
        if (x != null) {
            j.g(x, -17123260, new Object[] { j.g(j.Y(this, 966965314), 950908995, null) });
            return false;
        }
        j.i(this, -843925435, s);
        j.g(j.g(j.Y(this, 966965314), 950908995, null), -202459066, new Object[] { this });
        return (boolean)j.g(this, -112674729, null);
    }
    
    @Override
    public ResultSet executeQuery(final String s, final boolean b) throws SQLException {
        j.i(j.Y(this, 508541016), -47007655, b);
        return (ResultSet)j.g(this, 2001647706, new Object[] { s });
    }
    
    public ResultSet executeQuery(final String s) throws SQLException {
        j.g(this, -2117224385, null);
        j.i(this, -843925435, s);
        j.g(j.g(j.Y(this, 966965314), 950908995, null), -202459066, new Object[] { this });
        if (!(boolean)j.g(this, -112674729, null)) {
            j.g(this, -2117224385, null);
            throw (Throwable)j.H(357742683, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9a6d\ub3e6\u6ebf\u13be\ua0a5\u6b92\uba31\ua964\u53ae\ud441\u2317\u8a71\uccb5\ud066\u8ed1\u361b\u1e3c\u559d\uacdf\u54dd\u59d5\ua7dd\ucf84\ub518\u8fec\u0937\u5cdf\u2f84\u2390\u4533\u4676"), JDBC3ResultSet$JDBC3Savepoint.i("\u9a4f\ub3c2\u6e96\u1385\ua088\u6bf7\uba0a\ua94f\u5384\ud47c\u2372"), 101 });
        }
        return (ResultSet)j.g(this, 1764276316, null);
    }
    
    public int executeUpdate(final String s) throws SQLException {
        j.g(this, -2117224385, null);
        j.i(this, -843925435, s);
        final Object g = j.g(j.Y(this, 966965314), 950908995, null);
        int intValue = 0;
        final Object x = j.x(-273827775, new Object[] { s });
        if (x != null) {
            j.g(x, -17123260, new Object[] { g });
        }
        else {
            try {
                intValue = (int)j.g(g, 853063773, null);
                final int intValue2 = (int)j.g(g, 1123334238, new Object[] { s });
                if (intValue2 != 0) {
                    throw (Throwable)j.x(-393955217, new Object[] { intValue2, "" });
                }
                intValue = (int)j.g(g, 853063773, null) - intValue;
                j.g(this, -2117224385, null);
            }
            finally {
                j.g(this, -2117224385, null);
                throw;
            }
        }
        return intValue;
    }
    
    public ResultSet getResultSet() throws SQLException {
        j.g(this, 1037547632, null);
        if (j.g(j.Y(this, 508541016), 1685305457, null)) {
            throw (Throwable)j.H(223000547, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u7506\ueb86\uad5c\u3697\udbf9\ub7b7\u0d3e\ue871\u0835\ueb43\u0969\u015d\uffce\u8e38\u9261\u7a66\u51ef\ud4a5\uf2d7\ubb63\ueb8b\u7f3b\u00ff\u0133\u1595\ub2d5\uf266") });
        }
        final Object g = j.g(j.Y(this, 966965314), 950908995, null);
        if ((int)j.g(g, 924694643, new Object[] { (long)j.Y(this, -1444759438) }) == 0) {
            return null;
        }
        if (j.Y(j.Y(this, 508541016), -2125940620) == null) {
            j.i(j.Y(this, 508541016), -2125940620, j.g(g, 1350809717, new Object[] { (long)j.Y(this, -1444759438) }));
        }
        j.i(j.Y(this, 508541016), 1087158390, j.Y(j.Y(this, 508541016), -2125940620));
        j.i(j.Y(this, 508541016), -208553848, (boolean)j.Y(this, 1933162631));
        j.i(this, 1933162631, false);
        return (ResultSet)j.Y(this, 508541016);
    }
    
    public int getUpdateCount() throws SQLException {
        final Object g = j.g(j.Y(this, 966965314), 950908995, null);
        if ((long)j.Y(this, -1444759438) != 0L && !(boolean)j.g(j.Y(this, 508541016), 1685305457, null) && !(boolean)j.Y(this, 1933162631) && (int)j.g(g, 924694643, new Object[] { (long)j.Y(this, -1444759438) }) == 0) {
            return (int)j.g(g, 16889993, null);
        }
        return -1;
    }
    
    public void addBatch(final String s) throws SQLException {
        j.g(this, -2117224385, null);
        if (j.Y(this, -1959151478) == null || (int)j.Y(this, -980436853) + 1 >= ((Object[])j.Y(this, -1959151478)).length) {
            final Object[] array = new Object[(int)j.x(-1658144628, new Object[] { 10, (int)j.Y(this, -980436853) * 2 })];
            if (j.Y(this, -1959151478) != null) {
                j.x(-1299269491, new Object[] { (Object[])j.Y(this, -1959151478), 0, array, 0, ((Object[])j.Y(this, -1959151478)).length });
            }
            j.i(this, -1959151478, array);
        }
        final Object[] array2 = (Object[])j.Y(this, -1959151478);
        final int intValue = (int)j.Y(this, -980436853);
        j.i(this, -980436853, intValue + 1);
        array2[intValue] = s;
    }
    
    public void clearBatch() throws SQLException {
        j.i(this, -980436853, 0);
        if (j.Y(this, -1959151478) != null) {
            for (int i = 0; i < ((Object[])j.Y(this, -1959151478)).length; ++i) {
                ((Object[])j.Y(this, -1959151478))[i] = null;
            }
        }
    }
    
    public int[] executeBatch() throws SQLException {
        j.g(this, -2117224385, null);
        if (j.Y(this, -1959151478) == null || (int)j.Y(this, -980436853) == 0) {
            return new int[0];
        }
        final int[] array = new int[(int)j.Y(this, -980436853)];
        final Object g = j.g(j.Y(this, 966965314), 950908995, null);
        // monitorenter(g)
        try {
            try {
                for (int i = 0; i < array.length; ++i) {
                    try {
                        j.i(this, -843925435, ((Object[])j.Y(this, -1959151478))[i]);
                        j.g(g, -202459066, new Object[] { this });
                        array[i] = (int)j.g(g, 814463118, new Object[] { this, null });
                        (int)j.g(g, -1596671905, new Object[] { this });
                    }
                    catch (SQLException ex) {
                        throw (Throwable)j.H(-1380796319, new Object[] { j.g(j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u5bfa\u17e7\ua1f7\u3029\ud4c3\u61cb\u96af\ub58f\u92b7\uea2a\ubddd\u1efa") }), -1750288369, new Object[] { i }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u5ba2\u17a6") }), 566474721, new Object[] { j.g(ex, -1299204000, null) }), 705148898, null), array });
                    }
                    finally {
                        (int)j.g(g, -1596671905, new Object[] { this });
                        throw;
                    }
                }
                j.g(this, 2082781282, null);
            }
            finally {
                j.g(this, 2082781282, null);
                throw;
            }
        }
        // monitorexit(g)
        finally {
            // monitorexit(g)
            throw;
        }
        return array;
    }
    
    public void setCursorName(final String s) {
    }
    
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }
    
    public void clearWarnings() throws SQLException {
    }
    
    public Connection getConnection() throws SQLException {
        return (Connection)j.Y(this, 966965314);
    }
    
    public void cancel() throws SQLException {
        j.g(j.g(j.Y(this, 966965314), 950908995, null), -1761560477, null);
    }
    
    public int getQueryTimeout() throws SQLException {
        return (int)j.g(j.Y(this, 966965314), 672118884, null);
    }
    
    public void setQueryTimeout(final int n) throws SQLException {
        if (n < 0) {
            throw (Throwable)j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u3e2e\u5812\uaea5\u28a9\ua0bc\ucea0\ucc92\u7120\u149f\uf369\u9ac4\uabbf\ue70e\u2190\u64d1\u0d0b\uc71c\ue7eb\ub84c\ua492\u4c66\uef50\u8740\u022f\u73a0\u8379") });
        }
        j.g(j.Y(this, 966965314), -1334790043, new Object[] { 1000 * n });
    }
    
    public int getMaxRows() throws SQLException {
        return (int)j.Y(j.Y(this, 508541016), 2067708006);
    }
    
    public void setMaxRows(final int i) throws SQLException {
        if (i < 0) {
            throw (Throwable)j.H(223000547, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u09c8\ufa3d\uff5f\u8d7a\u18e9\ue9e1\u6e4e\u3437\ub496\u9239\ua198\uc299\u11f3\u0aab\u39fc\ufd3a\ud517\u6be5\uc57e\u5456\ueaa9\ue062\u2fce\uf063\u8ff3\ucdd3") });
        }
        j.i(j.Y(this, 508541016), 2067708006, i);
    }
    
    public int getMaxFieldSize() throws SQLException {
        return 0;
    }
    
    public void setMaxFieldSize(final int i) throws SQLException {
        if (i < 0) {
            throw (Throwable)j.H(223000547, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u84bf\u90a9\uac51\u959c\u3f9c\u97bb\ua419\u4e39\u5340\u8d9a\u47fd\u80e0\ua59d\ue1db\uc1c1") }), -1750288369, new Object[] { i }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u84f2\u90ab\uac48\u95d2\u3f94\u97bd\ua408\u4e75\u5346\u8ddf\u47ae\u80e7\ua582\ue1d9\uc180\u022b\u928e\ub61c\ufcfb") }), 705148898, null) });
        }
    }
    
    public int getFetchSize() throws SQLException {
        return (int)j.g(j.Y(this, 508541016), 1805891703, null);
    }
    
    public void setFetchSize(final int i) throws SQLException {
        j.g(j.Y(this, 508541016), 943962232, new Object[] { i });
    }
    
    public int getFetchDirection() throws SQLException {
        return (int)j.g(j.Y(this, 508541016), -671369095, null);
    }
    
    public void setFetchDirection(final int i) throws SQLException {
        j.g(j.Y(this, 508541016), 1094039674, new Object[] { i });
    }
    
    public ResultSet getGeneratedKeys() throws SQLException {
        return (ResultSet)j.g(j.g(j.Y(this, 966965314), 157333627, null), 157005948, null);
    }
    
    public boolean getMoreResults() throws SQLException {
        return (boolean)j.g(this, -805259139, new Object[] { 0 });
    }
    
    public boolean getMoreResults(final int n) throws SQLException {
        j.g(this, 1037547632, null);
        j.g(this, -2117224385, null);
        return false;
    }
    
    public int getResultSetConcurrency() throws SQLException {
        return 1007;
    }
    
    public int getResultSetHoldability() throws SQLException {
        return 2;
    }
    
    public int getResultSetType() throws SQLException {
        return 1003;
    }
    
    public void setEscapeProcessing(final boolean b) throws SQLException {
        if (b) {
            throw (Throwable)j.g(this, -1660307330, null);
        }
    }
    
    protected SQLException unused() {
        return (SQLException)j.H(223000547, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u66bf\u9265\u47e3\ub999\u2e81\uc582\u38f1\u20f0\u6dd2\ue4b5\u1a3e\u805a\u7e84\u163a\u0126\u188c\u20e9\ubee6\u840f\u7986\ucc49\u380f\u2c65\ua653\u3fcc\ubfc0\uebb5\u0e33\u7937\u801e\u3c3c\u2814\u2b1f\ub2db\ucca4\u9ac9\u7cc5") });
    }
    
    public boolean execute(final String s, final int[] array) throws SQLException {
        throw (Throwable)j.g(this, -1660307330, null);
    }
    
    public boolean execute(final String s, final String[] array) throws SQLException {
        throw (Throwable)j.g(this, -1660307330, null);
    }
    
    public int executeUpdate(final String s, final int n) throws SQLException {
        throw (Throwable)j.g(this, -1660307330, null);
    }
    
    public int executeUpdate(final String s, final int[] array) throws SQLException {
        throw (Throwable)j.g(this, -1660307330, null);
    }
    
    public int executeUpdate(final String s, final String[] array) throws SQLException {
        throw (Throwable)j.g(this, -1660307330, null);
    }
    
    public boolean execute(final String s, final int n) throws SQLException {
        throw (Throwable)j.g(this, -1660307330, null);
    }
    
    static class BackupObserver implements DB.ProgressObserver
    {
        public void progress(final int i, final int j) {
            j.g(j.B(-210323304), -81086310, new Object[] { j.x(1378990213, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u4f57\u70b8\u1125\uad7b\u30ea\uf652\u767d\ub2f4\u7ad4\u8fe7\ud35c\u8695\ub477\u1d9f\u1d8b\ufec3\u2a72\u1213\u0b87\uef32\ub834\uaf15\u9b2d\u3f09\u307e\u1fc2\u538c"), { j.x(2111158425, new Object[] { i }), j.x(2111158425, new Object[] { j }) } }) });
        }
    }
}
