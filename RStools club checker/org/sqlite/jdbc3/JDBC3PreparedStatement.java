// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc3;

import java.net.URL;
import java.sql.Ref;
import java.sql.Clob;
import java.sql.Blob;
import java.sql.Array;
import java.sql.ResultSetMetaData;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.Calendar;
import java.io.Reader;
import java.util.Date;
import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.Statement;
import java.sql.ParameterMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.sqlite.SQLiteConnection;
import org.sqlite.core.CorePreparedStatement;

public abstract class JDBC3PreparedStatement extends CorePreparedStatement
{
    protected JDBC3PreparedStatement(final SQLiteConnection sqLiteConnection, final String s) throws SQLException {
        super(sqLiteConnection, s);
    }
    
    public void clearParameters() throws SQLException {
        j.g(this, 115520792, null);
        (int)j.g(j.g(j.Y(this, 639415577), 950908995, null), -501107429, new Object[] { (long)j.Y(this, 962901274) });
        j.g(j.Y(this, 1866577180), -1329416931, null);
        if (j.Y(this, 1332983070) != null) {
            for (int i = (int)j.Y(this, 940946735); i < (int)j.Y(this, 940946735) + (int)j.Y(this, -1911179984); ++i) {
                ((Object[])j.Y(this, 1332983070))[i] = null;
            }
        }
    }
    
    public boolean execute() throws SQLException {
        j.g(this, 115520792, null);
        j.g(j.Y(this, 721728817), -1281313486, null);
        (int)j.g(j.g(j.Y(this, 639415577), 950908995, null), 3126579, new Object[] { (long)j.Y(this, 962901274) });
        j.g(this, -415451852, null);
        boolean b = false;
        try {
            j.i(this, -1037322954, (boolean)j.g(j.g(j.Y(this, 639415577), 950908995, null), 1756738869, new Object[] { this, (Object[])j.Y(this, 1332983070) }));
            b = true;
            final boolean b2 = (int)j.Y(this, -2129349305) != 0;
            if (!b && (long)j.Y(this, 962901274) != 0L) {
                (int)j.g(j.g(j.Y(this, 639415577), 950908995, null), 3126579, new Object[] { (long)j.Y(this, 962901274) });
            }
            return b2;
        }
        finally {
            if (!b && (long)j.Y(this, 962901274) != 0L) {
                (int)j.g(j.g(j.Y(this, 639415577), 950908995, null), 3126579, new Object[] { (long)j.Y(this, 962901274) });
            }
            throw;
        }
    }
    
    public ResultSet executeQuery() throws SQLException {
        j.g(this, 115520792, null);
        if ((int)j.Y(this, -2129349305) == 0) {
            throw (Throwable)j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u9174\u12be\ucece\u9c87\u98e0\uaadc\u1eed\u686e\u8762\u13a2\u9f7f\uc686\u5d9d\u1955\u31f1\u70a2\u410b\udb80\u61dc\uad70\u844b\u5419\u401f\ubbb1\u09bc\u7163\u1490\u3b14\u4df1") });
        }
        j.g(j.Y(this, 721728817), -1281313486, null);
        (int)j.g(j.g(j.Y(this, 639415577), 950908995, null), 3126579, new Object[] { (long)j.Y(this, 962901274) });
        j.g(this, -415451852, null);
        boolean b = false;
        try {
            j.i(this, -1037322954, (boolean)j.g(j.g(j.Y(this, 639415577), 950908995, null), 1756738869, new Object[] { this, (Object[])j.Y(this, 1332983070) }));
            b = true;
            if (!b && (long)j.Y(this, 962901274) != 0L) {
                (int)j.g(j.g(j.Y(this, 639415577), 950908995, null), 3126579, new Object[] { (long)j.Y(this, 962901274) });
            }
        }
        finally {
            if (!b && (long)j.Y(this, 962901274) != 0L) {
                (int)j.g(j.g(j.Y(this, 639415577), 950908995, null), 3126579, new Object[] { (long)j.Y(this, 962901274) });
            }
            throw;
        }
        return (ResultSet)j.g(this, 985969992, null);
    }
    
    public int executeUpdate() throws SQLException {
        j.g(this, 115520792, null);
        if ((int)j.Y(this, -2129349305) != 0) {
            throw (Throwable)j.H(223000547, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6eb6\u0ce1\u6a03\u14f1\u1c53\u6c8b\u94a5\ub3e8\uf380\u7bbb\u9917\u6bca\u051a\uacab\u79d1\ue010\u36ea\ud9e9\u30de\u4972\uf2f7") });
        }
        j.g(j.Y(this, 721728817), -1281313486, null);
        (int)j.g(j.g(j.Y(this, 639415577), 950908995, null), 3126579, new Object[] { (long)j.Y(this, 962901274) });
        j.g(this, -415451852, null);
        return (int)j.g(j.g(j.Y(this, 639415577), 950908995, null), 814463118, new Object[] { this, (Object[])j.Y(this, 1332983070) });
    }
    
    public void addBatch() throws SQLException {
        j.g(this, 115520792, null);
        j.g(this, -415451852, null);
        j.i(this, 940946735, (int)j.Y(this, 940946735) + (int)j.Y(this, -1911179984));
        j.i(this, -1401637559, (int)j.Y(this, -1401637559) + 1);
        if (j.Y(this, 1332983070) == null) {
            j.i(this, 1332983070, new Object[(int)j.Y(this, -1911179984)]);
            j.g(j.Y(this, 1866577180), -1329416931, null);
        }
        if ((int)j.Y(this, 940946735) + (int)j.Y(this, -1911179984) > ((Object[])j.Y(this, 1332983070)).length) {
            final Object[] array = new Object[((Object[])j.Y(this, 1332983070)).length * 2];
            j.x(-1299269491, new Object[] { (Object[])j.Y(this, 1332983070), 0, array, 0, ((Object[])j.Y(this, 1332983070)).length });
            j.i(this, 1332983070, array);
        }
        j.x(-1299269491, new Object[] { (Object[])j.Y(this, 1332983070), (int)j.Y(this, 940946735) - (int)j.Y(this, -1911179984), (Object[])j.Y(this, 1332983070), (int)j.Y(this, 940946735), (int)j.Y(this, -1911179984) });
    }
    
    public ParameterMetaData getParameterMetaData() {
        return (ParameterMetaData)this;
    }
    
    public int getParameterCount() throws SQLException {
        j.g(this, 115520792, null);
        return (int)j.Y(this, -1911179984);
    }
    
    public String getParameterClassName(final int n) throws SQLException {
        j.g(this, 115520792, null);
        return JDBC3ResultSet$JDBC3Savepoint.i("\u461e\uab50\u9eb0\ub1b5\u1757\u5778\ud5b6\u5366\ub946\ud5f1\ue972\ue1b3\u8b76\u8b50\u307e\u91ec");
    }
    
    public String getParameterTypeName(final int n) {
        return JDBC3Connection$JDBC3PreparedStatement.N("\uf9d4\u0851\u1228\ud0e7\u082c\u75a1\u617f");
    }
    
    public int getParameterType(final int n) {
        return 12;
    }
    
    public int getParameterMode(final int n) {
        return 1;
    }
    
    public int getPrecision(final int n) {
        return 0;
    }
    
    public int getScale(final int n) {
        return 0;
    }
    
    public int isNullable(final int n) {
        return 1;
    }
    
    public boolean isSigned(final int n) {
        return true;
    }
    
    public Statement getStatement() {
        return this;
    }
    
    public void setBigDecimal(final int i, final BigDecimal bigDecimal) throws SQLException {
        j.g(this, -1871465141, new Object[] { i, (bigDecimal == null) ? null : j.g(bigDecimal, 119715146, null) });
    }
    
    private byte[] readBytes(final InputStream inputStream, final int n) throws SQLException {
        if (n < 0) {
            throw (Throwable)j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u2555\u5332\u15d4\ued8a\ub48f\ue993\uac56\uaeb5\u3e0a\u8d62\u4bb6\u5df0\ubb56\u71ae\uf451\u7516\u7224\u37c2\u7f74\u1bbf\u57a0\u5627\u9525\u25db\uff6c\ud5a0\ud92c\u8a2a\u2fca\u8d27\ued13\u7834\ud3e1\u33a0\ue19d\ub7bc\u0405\ua546\uffea\ub469\uce78\u87dc\ua42e\uf969\ub056\ue74e\uda66\u05ec\u3a1f\u336b\ud5e4") });
        }
        final byte[] array = new byte[n];
        try {
            int intValue;
            for (int i = 0; i < n; i += intValue) {
                intValue = (int)j.g(inputStream, -406670004, new Object[] { array, i, n - i });
                if (intValue == -1) {
                    throw (Throwable)j.H(2006299906, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u2555\u532e\u15c2\uedc5\ub492\ue9d5\uac04\uaea3\u3e1f\u8d74\u4bba\u5dff\ubb5c\u71ae\uf44a\u7503\u7225\u3787\u7f77\u1bb7\u57eb\u5669\u9549\u25cc\uff67\ud5a6\ud93b\u8a2a\u2f8f\u8d30") });
                }
            }
            return array;
        }
        catch (IOException ex) {
            final Object h = j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u2555\u5332\u15d4\ued8a\ub48f\ue993\uac56\uaeb5\u3e0a\u8d62\u4bb6\u5df0\ubb56\u71ae\uf451\u7516\u7224\u37c2\u7f74\u1bbf") });
            j.g(h, 118208517, new Object[] { ex });
            throw (Throwable)h;
        }
    }
    
    public void setBinaryStream(final int n, final InputStream inputStream, final int i) throws SQLException {
        if (inputStream == null && i == 0) {
            j.g(this, -655182515, new Object[] { n, null });
        }
        j.g(this, -655182515, new Object[] { n, (byte[])j.g(this, 1755886926, new Object[] { inputStream, i }) });
    }
    
    public void setAsciiStream(final int i, final InputStream inputStream, final int j) throws SQLException {
        j.g(this, 989967647, new Object[] { i, inputStream, j });
    }
    
    public void setUnicodeStream(final int n, final InputStream inputStream, final int i) throws SQLException {
        if (inputStream == null && i == 0) {
            j.g(this, -1136216800, new Object[] { n, null });
        }
        try {
            j.g(this, -1136216800, new Object[] { n, j.H(848082209, new Object[] { (byte[])j.g(this, 1755886926, new Object[] { inputStream, i }), JDBC3ResultSet$JDBC3Savepoint.i("\u9887\uce1e\u9ae4\u77e7\u99cb") }) });
        }
        catch (UnsupportedEncodingException ex) {
            final Object h = j.H(223000547, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9887\uce1e\u9ae4\u77e7\u99cb\ub3ac\u084c\u5884\u3234\u6b71\ue1c5\u5d7a\u0631\uc615\uda6e\u49f9\u8c20\ub51a\u5ae9\u25ae\u45a7\ua991") });
            j.g(h, 118208517, new Object[] { ex });
            throw (Throwable)h;
        }
    }
    
    public void setBoolean(final int i, final boolean j) throws SQLException {
        j.g(this, -20925150, new Object[] { i, j ? 1 : 0 });
    }
    
    public void setByte(final int i, final byte j) throws SQLException {
        j.g(this, -20925150, new Object[] { i, j });
    }
    
    public void setBytes(final int i, final byte[] array) throws SQLException {
        j.g(this, -1871465141, new Object[] { i, array });
    }
    
    public void setDouble(final int i, final double d) throws SQLException {
        j.g(this, -1871465141, new Object[] { i, j.H(1327020066, new Object[] { d }) });
    }
    
    public void setFloat(final int i, final float f) throws SQLException {
        j.g(this, -1871465141, new Object[] { i, j.H(358855971, new Object[] { f }) });
    }
    
    public void setInt(final int i, final int j) throws SQLException {
        j.g(this, -1871465141, new Object[] { i, j.H(1235597345, new Object[] { j }) });
    }
    
    public void setLong(final int i, final long l) throws SQLException {
        j.g(this, -1871465141, new Object[] { i, j.H(-595609568, new Object[] { l }) });
    }
    
    public void setNull(final int i, final int j) throws SQLException {
        j.g(this, -1766869724, new Object[] { i, j, null });
    }
    
    public void setNull(final int i, final int n, final String s) throws SQLException {
        j.g(this, -1871465141, new Object[] { i, null });
    }
    
    public void setObject(final int i, final Object o) throws SQLException {
        if (o == null) {
            j.g(this, -1871465141, new Object[] { i, null });
        }
        else if (o instanceof Date) {
            j.g(this, 909554982, new Object[] { i, j.x(-399067867, new Object[] { (long)j.g(o, 805091331, null) }), j.x(-1519798221, null) });
        }
        else if (o instanceof Long) {
            j.g(this, -1871465141, new Object[] { i, o });
        }
        else if (o instanceof Integer) {
            j.g(this, -1871465141, new Object[] { i, o });
        }
        else if (o instanceof Short) {
            j.g(this, -1871465141, new Object[] { i, j.H(1235597345, new Object[] { (int)j.g(o, -771050185, null) }) });
        }
        else if (o instanceof Float) {
            j.g(this, -1871465141, new Object[] { i, o });
        }
        else if (o instanceof Double) {
            j.g(this, -1871465141, new Object[] { i, o });
        }
        else if (o instanceof Boolean) {
            j.g(this, -927484615, new Object[] { i, Boolean.valueOf((boolean)j.g(o, 203994424, null)) });
        }
        else if (o instanceof byte[]) {
            j.g(this, -1871465141, new Object[] { i, o });
        }
        else if (o instanceof BigDecimal) {
            j.g(this, 1029158202, new Object[] { i, o });
        }
        else {
            j.g(this, -1871465141, new Object[] { i, j.g(o, -834816753, null) });
        }
    }
    
    public void setObject(final int i, final Object o, final int n) throws SQLException {
        j.g(this, 55751995, new Object[] { i, o });
    }
    
    public void setObject(final int i, final Object o, final int n, final int n2) throws SQLException {
        j.g(this, 55751995, new Object[] { i, o });
    }
    
    public void setShort(final int i, final short j) throws SQLException {
        j.g(this, -20925150, new Object[] { i, j });
    }
    
    public void setString(final int i, final String s) throws SQLException {
        j.g(this, -1871465141, new Object[] { i, s });
    }
    
    public void setCharacterStream(final int i, final Reader reader, final int n) throws SQLException {
        try {
            final Object h = j.H(1106425148, null);
            final char[] array = new char[8192];
            int intValue;
            while ((intValue = (int)j.g(reader, -1031031491, new Object[] { array })) > 0) {
                j.g(h, 101102910, new Object[] { array, 0, intValue });
            }
            j.g(this, -1136216800, new Object[] { i, j.g(h, -1165576881, null) });
        }
        catch (IOException ex) {
            throw (Throwable)j.H(223000547, new Object[] { j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u106c\u086e\u79c1\u4dd5\uf96b\u85d7\u7116\ucb32\u47ae\ub072\u6477\u44e1\u6405\ub276\u9a81\u4601\u937f\ud708\ud2f2\udcae\u4504\u75e3\uc3bc\u65ff\uc0de\u03cb\uc1a9\u9cad\u51ad\u646c\u9508\u14dd\u489e\u4c1a\uf497\u4cc5\u034e\ud14c\ubc00\u6365\ue0d5\u767d\ud6fe\u0d25\ub94d\u0301\u9955\u8e37\u056c\ue4d2\ud501\u063d\u8391\u5ba9") }), 566474721, new Object[] { j.g(ex, -901663408, null) }), 705148898, null) });
        }
    }
    
    public void setDate(final int i, final java.sql.Date date) throws SQLException {
        j.g(this, -582044335, new Object[] { i, date, j.x(-1519798221, null) });
    }
    
    public void setDate(final int n, final java.sql.Date date, final Calendar calendar) throws SQLException {
        if (date == null) {
            j.g(this, 55751995, new Object[] { n, null });
        }
        else {
            j.g(this, 909554982, new Object[] { n, j.x(-399067867, new Object[] { (long)j.g(date, 1162261842, null) }), calendar });
        }
    }
    
    public void setTime(final int i, final Time time) throws SQLException {
        j.g(this, -805587629, new Object[] { i, time, j.x(-1519798221, null) });
    }
    
    public void setTime(final int n, final Time time, final Calendar calendar) throws SQLException {
        if (time == null) {
            j.g(this, 55751995, new Object[] { n, null });
        }
        else {
            j.g(this, 909554982, new Object[] { n, j.x(-399067867, new Object[] { (long)j.g(time, 2042082644, null) }), calendar });
        }
    }
    
    public void setTimestamp(final int i, final Timestamp timestamp) throws SQLException {
        j.g(this, -1146505899, new Object[] { i, timestamp, j.x(-1519798221, null) });
    }
    
    public void setTimestamp(final int n, final Timestamp timestamp, final Calendar calendar) throws SQLException {
        if (timestamp == null) {
            j.g(this, 55751995, new Object[] { n, null });
        }
        else {
            j.g(this, 909554982, new Object[] { n, j.x(-399067867, new Object[] { (long)j.g(timestamp, -1426279082, null) }), calendar });
        }
    }
    
    public ResultSetMetaData getMetaData() throws SQLException {
        j.g(this, 115520792, null);
        return (ResultSetMetaData)j.Y(this, 721728817);
    }
    
    @Override
    protected SQLException unused() {
        return (SQLException)j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u7932\u8035\u9218\u7a08\ub7fe\uafd7\u84fb\u2d83\u90e0\u86e2\ubfa2\uaefb\uc5dd\u800f\u7124\ucd83\u1387\u91d1\u967a\u88e4\u46f4\ua7b4\u9bec\u026f\u8d37\u5699\u2d15\u46f8\ua4a1\u1389\u9662\u2e1b\u63d9\u2f87\u67b4\u9bfc\uad91") });
    }
    
    public void setArray(final int n, final Array array) throws SQLException {
        throw (Throwable)j.g(this, -352406169, null);
    }
    
    public void setBlob(final int n, final Blob blob) throws SQLException {
        throw (Throwable)j.g(this, -352406169, null);
    }
    
    public void setClob(final int n, final Clob clob) throws SQLException {
        throw (Throwable)j.g(this, -352406169, null);
    }
    
    public void setRef(final int n, final Ref ref) throws SQLException {
        throw (Throwable)j.g(this, -352406169, null);
    }
    
    public void setURL(final int n, final URL url) throws SQLException {
        throw (Throwable)j.g(this, -352406169, null);
    }
    
    @Override
    public boolean execute(final String s) throws SQLException {
        throw (Throwable)j.g(this, -352406169, null);
    }
    
    @Override
    public int executeUpdate(final String s) throws SQLException {
        throw (Throwable)j.g(this, -352406169, null);
    }
    
    @Override
    public ResultSet executeQuery(final String s) throws SQLException {
        throw (Throwable)j.g(this, -352406169, null);
    }
    
    @Override
    public void addBatch(final String s) throws SQLException {
        throw (Throwable)j.g(this, -352406169, null);
    }
}
