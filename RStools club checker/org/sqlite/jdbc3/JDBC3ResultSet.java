// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc3;

import java.sql.ResultSetMetaData;
import java.sql.SQLWarning;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.Calendar;
import java.sql.Date;
import java.io.Reader;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.SQLException;
import org.sqlite.core.CoreStatement;
import java.util.regex.Pattern;
import org.sqlite.core.CoreResultSet;

public abstract class JDBC3ResultSet extends CoreResultSet
{
    protected static final Pattern COLUMN_TYPENAME;
    protected static final Pattern COLUMN_TYPECAST;
    protected static final Pattern COLUMN_PRECISION;
    
    protected JDBC3ResultSet(final CoreStatement coreStatement) {
        super(coreStatement);
    }
    
    public int findColumn(final String s) throws SQLException {
        j.g(this, 542619658, null);
        final Object g = j.g(this, -1139165173, new Object[] { s });
        if (g != null) {
            return (int)j.g(g, -2127972340, null);
        }
        for (int i = 0; i < ((Object[])j.Y(this, -1555974131)).length; ++i) {
            if (j.g(s, 1370667022, new Object[] { ((Object[])j.Y(this, -1555974131))[i] })) {
                return (int)j.g(this, -1287997473, new Object[] { s, i + 1 });
            }
        }
        throw (Throwable)j.H(223000547, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u1e6e\u1cf9\udbe2\u1ba0\u7488\uf16c\ucdc8\u6d06\u8e75\u72e9\u3a74\uaae9\u29fe\u4997\uf1f5\u0d29\uf39c") }), 566474721, new Object[] { s }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u1e27") }), 705148898, null) });
    }
    
    public boolean next() throws SQLException {
        if (!(boolean)j.Y(this, 54900708)) {
            return false;
        }
        j.i(this, -582633499, -1);
        if ((int)j.Y(this, -1714243610) == 0) {
            j.i(this, -1714243610, (int)j.Y(this, -1714243610) + 1);
            return true;
        }
        if ((int)j.Y(this, 1176221687) != 0 && (int)j.Y(this, -1714243610) == (int)j.Y(this, 1176221687)) {
            return false;
        }
        final int intValue = (int)j.g(j.g(this, 319272952, null), 331986939, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642) });
        switch (intValue) {
            case 101: {
                j.g(this, 942323708, null);
                return false;
            }
            case 100: {
                j.i(this, -1714243610, (int)j.Y(this, -1714243610) + 1);
                return true;
            }
            default: {
                j.g(j.g(this, 319272952, null), 161527805, new Object[] { intValue });
                return false;
            }
        }
    }
    
    public int getType() throws SQLException {
        return 1003;
    }
    
    public int getFetchSize() throws SQLException {
        return (int)j.Y(this, 1562753022);
    }
    
    public void setFetchSize(final int n) throws SQLException {
        if (0 > n || ((int)j.Y(this, 1176221687) != 0 && n > (int)j.Y(this, 1176221687))) {
            throw (Throwable)j.H(223000547, new Object[] { j.g(j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u8dbd\u7960\u3d97\ue88c\u53ab\u528c\u6037\ua061\u9f4a\ud237\u1211") }), -1750288369, new Object[] { n }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u8dfb\u796a\u3d96\ue89b\u53e3\u52c3\u6022\ua028\u9f52\ud23d\u1244\u1c37\u0b51\ud8ea\u19a2") }), -1750288369, new Object[] { (int)j.Y(this, 1176221687) }), 705148898, null) });
        }
        j.i(this, 1562753022, n);
    }
    
    public int getFetchDirection() throws SQLException {
        j.g(this, 542619658, null);
        return 1000;
    }
    
    public void setFetchDirection(final int n) throws SQLException {
        j.g(this, 542619658, null);
        if (n != 1000) {
            throw (Throwable)j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u7723\u5419\ud8e6\u10cd\ud5f3\ud9c6\uc308\ub8c2\u4666\u133d\uc000\ufe6f\u5f53\u20fd\u3d8a\u73ec\u8d7b\u0440\ue260\u3824\u22bc\uef6c\ubd1d\u40b0\ue23b\ubf58\u870a\uc659\ud1bd\u81df\uf802\u4186\uc99e\u337f\u9484\u3ab7\u118a\u9a28") });
        }
    }
    
    public boolean isAfterLast() throws SQLException {
        return !(boolean)j.Y(this, 54900708);
    }
    
    public boolean isBeforeFirst() throws SQLException {
        return (boolean)j.Y(this, 54900708) && (int)j.Y(this, -1714243610) == 0;
    }
    
    public boolean isFirst() throws SQLException {
        return (int)j.Y(this, -1714243610) == 1;
    }
    
    public boolean isLast() throws SQLException {
        throw (Throwable)j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u8960\ua597\ud512\u2d86\uff7b\ue582\u2bd9\ud16d\ud106\ube0c\ufc27\u1b9b\u29f5\u2674\u8134\u3efd\u4418\u35a8\ud0c1\u5cdc\ue0b8\u3989\u1ced\u248e\u9459\ub31b\u0134\u4c43\ufb49\u9c24\ud7eb\u9cd9\u0da6\u8fa9\u6ccb\u0c5b\u9a89\ubead\ud81f") });
    }
    
    @Override
    protected void finalize() throws SQLException {
        j.g(this, 942323708, null);
    }
    
    public int getRow() throws SQLException {
        return (int)j.Y(this, -1714243610);
    }
    
    public boolean wasNull() throws SQLException {
        return (int)j.g(j.g(this, 319272952, null), 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { (int)j.Y(this, -582633499) }) }) == 5;
    }
    
    public BigDecimal getBigDecimal(final int i) throws SQLException {
        final Object g = j.g(this, -1671645166, new Object[] { i });
        if (g == null) {
            return null;
        }
        try {
            return (BigDecimal)j.H(-738150381, new Object[] { g });
        }
        catch (NumberFormatException ex) {
            throw (Throwable)j.H(223000547, new Object[] { j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ubb31\ud7ef\u6238\u5cca\u68d9\u60b2\u2fa0\ub6b2\u40be\u2ae0\u8200\ua6d3\ucbc7\uf327\uc59f\u5570\u0253\ucefe\u7164\u23b1\uac5f\u0320\u38ad\u3092\u0760\uc471\ucb1c\u9a45\uac24\u4f01\u5aee\ue2b7") }), 566474721, new Object[] { g }), 705148898, null) });
        }
    }
    
    public BigDecimal getBigDecimal(final String s) throws SQLException {
        return (BigDecimal)j.g(this, -100878315, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public boolean getBoolean(final int i) throws SQLException {
        return (int)j.g(this, 1261877270, new Object[] { i }) != 0;
    }
    
    public boolean getBoolean(final String s) throws SQLException {
        return (boolean)j.g(this, -30951385, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public InputStream getBinaryStream(final int i) throws SQLException {
        final byte[] array = (byte[])j.g(this, 1743829032, new Object[] { i });
        if (array != null) {
            return (InputStream)j.H(-801654743, new Object[] { array });
        }
        return null;
    }
    
    public InputStream getBinaryStream(final String s) throws SQLException {
        return (InputStream)j.g(this, 832288810, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public byte getByte(final int i) throws SQLException {
        return (byte)(int)j.g(this, 1261877270, new Object[] { i });
    }
    
    public byte getByte(final String s) throws SQLException {
        return (byte)j.g(this, 1352251435, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public byte[] getBytes(final int i) throws SQLException {
        return (byte[])j.g(j.g(this, 319272952, null), 593606700, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { i }) });
    }
    
    public byte[] getBytes(final String s) throws SQLException {
        return (byte[])j.g(this, 1743829032, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public Reader getCharacterStream(final int i) throws SQLException {
        final Object g = j.g(this, -1671645166, new Object[] { i });
        return (Reader)((g == null) ? null : j.H(766490669, new Object[] { g }));
    }
    
    public Reader getCharacterStream(final String s) throws SQLException {
        return (Reader)j.g(this, 1603975214, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public Date getDate(final int n) throws SQLException {
        final Object g = j.g(this, 319272952, null);
        switch ((int)j.g(g, 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) })) {
            case 5: {
                return null;
            }
            case 3: {
                try {
                    return (Date)j.H(-337922044, new Object[] { (long)j.g(j.g(j.g(j.g(this, -1552500737, null), 2083108864, null), 1118943234, new Object[] { j.g(g, -1032013823, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) }), 805091331, null) });
                }
                catch (Exception ex) {
                    final Object h = j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0206\u9c88\u20bbx\u1bf0\ueb64\u9dba\u1a22\u6ded\ucf75\u5b61\u7631\u4728\u8b39\ud865\u96e5\ud3cb\ufc62") });
                    j.g(h, 118208517, new Object[] { ex });
                    throw (Throwable)h;
                }
            }
            case 2: {
                return (Date)j.H(-337922044, new Object[] { (long)j.g(j.g(this, -2022787048, new Object[] { j.x(788183063, new Object[] { (double)j.g(g, 118994950, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) }) }), 213563417, null) });
            }
            default: {
                return (Date)j.H(-337922044, new Object[] { (long)j.g(g, 956610586, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) * (long)j.g(j.g(this, -1552500737, null), 458405915, null) });
            }
        }
    }
    
    public Date getDate(final int n, final Calendar calendar) throws SQLException {
        j.g(this, -1959544804, new Object[] { calendar });
        final Object g = j.g(this, 319272952, null);
        switch ((int)j.g(g, 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) })) {
            case 5: {
                return null;
            }
            case 3: {
                try {
                    return (Date)j.H(-337922044, new Object[] { (long)j.g(j.g(j.x(2000271407, new Object[] { j.g(j.g(this, -1552500737, null), 670414877, null), j.g(calendar, -942557154, null) }), 1118943234, new Object[] { j.g(g, -1032013823, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) }), 805091331, null) });
                }
                catch (Exception ex) {
                    final Object h = j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0206\u9c88\u20bbx\u1bf0\ueb64\u9dba\u1a22\u6ded\ucf75\u5b61\u7631\u4728\u8b39\ud875\u96ed\ud3d2\ufc62\ucce7\u2670\u52a6\ud5c5\ub976\u9afa") });
                    j.g(h, 118208517, new Object[] { ex });
                    throw (Throwable)h;
                }
            }
            case 2: {
                return (Date)j.H(-337922044, new Object[] { (long)j.g(j.g(this, 743946288, new Object[] { j.x(788183063, new Object[] { (double)j.g(g, 118994950, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) }), calendar }), 213563417, null) });
            }
            default: {
                j.g(calendar, -1068124111, new Object[] { (long)j.g(g, 956610586, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) * (long)j.g(j.g(this, -1552500737, null), 458405915, null) });
                return (Date)j.H(-337922044, new Object[] { (long)j.g(j.g(calendar, -620185550, null), 805091331, null) });
            }
        }
    }
    
    public Date getDate(final String s) throws SQLException {
        return (Date)j.g(this, -1904822220, new Object[] { (int)j.g(this, 55359508, new Object[] { s }), j.x(-1519798221, null) });
    }
    
    public Date getDate(final String s, final Calendar calendar) throws SQLException {
        return (Date)j.g(this, -1904822220, new Object[] { (int)j.g(this, 55359508, new Object[] { s }), calendar });
    }
    
    public double getDouble(final int n) throws SQLException {
        final Object g = j.g(this, 319272952, null);
        if ((int)j.g(g, 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) == 5) {
            return 0.0;
        }
        return (double)j.g(g, 118994950, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) });
    }
    
    public double getDouble(final String s) throws SQLException {
        return (double)j.g(this, 1494333493, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public float getFloat(final int n) throws SQLException {
        final Object g = j.g(this, 319272952, null);
        if ((int)j.g(g, 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) == 5) {
            return 0.0f;
        }
        return (float)(double)j.g(g, 118994950, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) });
    }
    
    public float getFloat(final String s) throws SQLException {
        return (float)j.g(this, -1510557642, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public int getInt(final int i) throws SQLException {
        return (int)j.g(j.g(this, 319272952, null), 290306119, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { i }) });
    }
    
    public int getInt(final String s) throws SQLException {
        return (int)j.g(this, 1261877270, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public long getLong(final int i) throws SQLException {
        return (long)j.g(j.g(this, 319272952, null), 956610586, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { i }) });
    }
    
    public long getLong(final String s) throws SQLException {
        return (long)j.g(this, 739883080, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public short getShort(final int i) throws SQLException {
        return (short)(int)j.g(this, 1261877270, new Object[] { i });
    }
    
    public short getShort(final String s) throws SQLException {
        return (short)j.g(this, 649771081, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public String getString(final int i) throws SQLException {
        return (String)j.g(j.g(this, 319272952, null), -1032013823, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { i }) });
    }
    
    public String getString(final String s) throws SQLException {
        return (String)j.g(this, -1671645166, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public Time getTime(final int n) throws SQLException {
        final Object g = j.g(this, 319272952, null);
        switch ((int)j.g(g, 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) })) {
            case 5: {
                return null;
            }
            case 3: {
                try {
                    return (Time)j.H(-1277314998, new Object[] { (long)j.g(j.g(j.g(j.g(this, -1552500737, null), 2083108864, null), 1118943234, new Object[] { j.g(g, -1032013823, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) }), 805091331, null) });
                }
                catch (Exception ex) {
                    final Object h = j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u526c\u87a9\u384e\u39ee\uf209\u8fc3\uadbc\u6eb9\u0cbe\u115a\u8613\u9591\u3caa\uf674\u8577\u7b2f\ued43\u1811") });
                    j.g(h, 118208517, new Object[] { ex });
                    throw (Throwable)h;
                }
            }
            case 2: {
                return (Time)j.H(-1277314998, new Object[] { (long)j.g(j.g(this, -2022787048, new Object[] { j.x(788183063, new Object[] { (double)j.g(g, 118994950, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) }) }), 213563417, null) });
            }
            default: {
                return (Time)j.H(-1277314998, new Object[] { (long)j.g(g, 956610586, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) * (long)j.g(j.g(this, -1552500737, null), 458405915, null) });
            }
        }
    }
    
    public Time getTime(final int n, final Calendar calendar) throws SQLException {
        j.g(this, -1959544804, new Object[] { calendar });
        final Object g = j.g(this, 319272952, null);
        switch ((int)j.g(g, 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) })) {
            case 5: {
                return null;
            }
            case 3: {
                try {
                    return (Time)j.H(-1277314998, new Object[] { (long)j.g(j.g(j.x(2000271407, new Object[] { j.g(j.g(this, -1552500737, null), 670414877, null), j.g(calendar, -942557154, null) }), 1118943234, new Object[] { j.g(g, -1032013823, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) }), 805091331, null) });
                }
                catch (Exception ex) {
                    final Object h = j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u526c\u87a9\u384e\u39ee\uf209\u8fc3\uadbc\u6eb9\u0cbe\u115a\u8613\u9591\u3caa\uf674\u8577\u7b2f\ued43\u1811") });
                    j.g(h, 118208517, new Object[] { ex });
                    throw (Throwable)h;
                }
            }
            case 2: {
                return (Time)j.H(-1277314998, new Object[] { (long)j.g(j.g(this, 743946288, new Object[] { j.x(788183063, new Object[] { (double)j.g(g, 118994950, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) }), calendar }), 213563417, null) });
            }
            default: {
                j.g(calendar, -1068124111, new Object[] { (long)j.g(g, 956610586, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) * (long)j.g(j.g(this, -1552500737, null), 458405915, null) });
                return (Time)j.H(-1277314998, new Object[] { (long)j.g(j.g(calendar, -620185550, null), 805091331, null) });
            }
        }
    }
    
    public Time getTime(final String s) throws SQLException {
        return (Time)j.g(this, 987609163, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public Time getTime(final String s, final Calendar calendar) throws SQLException {
        return (Time)j.g(this, 148486220, new Object[] { (int)j.g(this, 55359508, new Object[] { s }), calendar });
    }
    
    public Timestamp getTimestamp(final int n) throws SQLException {
        final Object g = j.g(this, 319272952, null);
        switch ((int)j.g(g, 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) })) {
            case 5: {
                return null;
            }
            case 3: {
                try {
                    return (Timestamp)j.H(-1608075187, new Object[] { (long)j.g(j.g(j.g(j.g(this, -1552500737, null), 2083108864, null), 1118943234, new Object[] { j.g(g, -1032013823, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) }), 805091331, null) });
                }
                catch (Exception ex) {
                    final Object h = j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u1658\ua821\uec74\ueb0a\u7d90\uf02a\u63a9\u571d\u327e\ua94c\ua8e3\u0cc8\uc6fa\u9ca7\u2d5a\u3df9\ufc70\udc3b\uc0a7\ud9e8\u07dd\u7134\u9796\u2ec7") });
                    j.g(h, 118208517, new Object[] { ex });
                    throw (Throwable)h;
                }
            }
            case 2: {
                return (Timestamp)j.H(-1608075187, new Object[] { (long)j.g(j.g(this, -2022787048, new Object[] { j.x(788183063, new Object[] { (double)j.g(g, 118994950, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) }) }), 213563417, null) });
            }
            default: {
                return (Timestamp)j.H(-1608075187, new Object[] { (long)j.g(g, 956610586, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { n }) }) * (long)j.g(j.g(this, -1552500737, null), 458405915, null) });
            }
        }
    }
    
    public Timestamp getTimestamp(final int i, final Calendar calendar) throws SQLException {
        if (calendar == null) {
            return (Timestamp)j.g(this, -772097970, new Object[] { i });
        }
        final Object g = j.g(this, 319272952, null);
        switch ((int)j.g(g, 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { i }) })) {
            case 5: {
                return null;
            }
            case 3: {
                try {
                    return (Timestamp)j.H(-1608075187, new Object[] { (long)j.g(j.g(j.x(2000271407, new Object[] { j.g(j.g(this, -1552500737, null), 670414877, null), j.g(calendar, -942557154, null) }), 1118943234, new Object[] { j.g(g, -1032013823, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { i }) }) }), 805091331, null) });
                }
                catch (Exception ex) {
                    final Object h = j.H(223000547, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u3327\ue9fe\ua998\u44bf\u2f68\u09fa\u7fb6\u6cac\ubf86\u2833\ue51c\u0f89\ub36c\uccaf\uddbb\u08de\u3e45\u2291\u1b98\uab4c\uce02\u2dfa\ufe8f\uc1a2") });
                    j.g(h, 118208517, new Object[] { ex });
                    throw (Throwable)h;
                }
            }
            case 2: {
                return (Timestamp)j.H(-1608075187, new Object[] { (long)j.g(j.g(this, 743946288, new Object[] { j.x(788183063, new Object[] { (double)j.g(g, 118994950, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { i }) }) }), calendar }), 213563417, null) });
            }
            default: {
                j.g(calendar, -1068124111, new Object[] { (long)j.g(g, 956610586, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { i }) }) * (long)j.g(j.g(this, -1552500737, null), 458405915, null) });
                return (Timestamp)j.H(-1608075187, new Object[] { (long)j.g(j.g(calendar, -620185550, null), 805091331, null) });
            }
        }
    }
    
    public Timestamp getTimestamp(final String s) throws SQLException {
        return (Timestamp)j.g(this, -772097970, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public Timestamp getTimestamp(final String s, final Calendar calendar) throws SQLException {
        return (Timestamp)j.g(this, -653477857, new Object[] { (int)j.g(this, 55359508, new Object[] { s }), calendar });
    }
    
    public Object getObject(final int i) throws SQLException {
        switch ((int)j.g(j.g(this, 319272952, null), 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -600000496, new Object[] { i }) })) {
            case 1: {
                final long longValue = (long)j.g(this, 739883080, new Object[] { i });
                if (longValue > 2147483647L || longValue < -2147483648L) {
                    return j.H(-595609568, new Object[] { longValue });
                }
                return j.H(1235597345, new Object[] { (int)longValue });
            }
            case 2: {
                return j.H(1327020066, new Object[] { (double)j.g(this, 1494333493, new Object[] { i }) });
            }
            case 4: {
                return j.g(this, 1743829032, new Object[] { i });
            }
            case 5: {
                return null;
            }
            default: {
                return j.g(this, -1671645166, new Object[] { i });
            }
        }
    }
    
    public Object getObject(final String s) throws SQLException {
        return j.g(this, 1585821731, new Object[] { (int)j.g(this, 55359508, new Object[] { s }) });
    }
    
    public Statement getStatement() {
        return (Statement)j.Y(this, 508409849);
    }
    
    public String getCursorName() throws SQLException {
        return null;
    }
    
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }
    
    public void clearWarnings() throws SQLException {
    }
    
    public ResultSetMetaData getMetaData() throws SQLException {
        return (ResultSetMetaData)this;
    }
    
    public String getCatalogName(final int i) throws SQLException {
        return (String)j.g(j.g(this, 319272952, null), -1502431195, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -1280395228, new Object[] { i }) });
    }
    
    public String getColumnClassName(final int i) throws SQLException {
        (int)j.g(this, -1280395228, new Object[] { i });
        return JDBC3ResultSet$JDBC3Savepoint.i("\u8c20\ud30e\uda18\ua4e8\u0c19\u80bf\ufba5\u7ce3\u8b0d\u9c93\u6b4e\u3df7\u870d\u40db\ua20f\uffea");
    }
    
    public int getColumnCount() throws SQLException {
        (int)j.g(this, -1280395228, new Object[] { 1 });
        return ((Object[])j.Y(this, -1038043098)).length;
    }
    
    public int getColumnDisplaySize(final int n) throws SQLException {
        return Integer.MAX_VALUE;
    }
    
    public String getColumnLabel(final int i) throws SQLException {
        return (String)j.g(this, 2009249847, new Object[] { i });
    }
    
    public String getColumnName(final int i) throws SQLException {
        return (String)j.g(j.g(this, 319272952, null), 636401720, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -1280395228, new Object[] { i }) });
    }
    
    public int getColumnType(final int n) throws SQLException {
        final Object g = j.g(this, -147736519, new Object[] { n });
        final int intValue = (int)j.g(j.g(this, 319272952, null), 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -1280395228, new Object[] { n }) });
        if (intValue == 1 || intValue == 5) {
            if (j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0422\u307a\uc4ef\uf952\u824c\ub3df\ue92b"), -145835974, new Object[] { g })) {
                return 16;
            }
            if (j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0434\u307c\uc4ee\uf947\u8240\ub3d0\ue931"), -145835974, new Object[] { g })) {
                return -6;
            }
            if ((boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0433\u3078\uc4e1\uf952\u8245\ub3d7\ue92b\u134a"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0429\u307b\uc4f4\uf92c"), -145835974, new Object[] { g })) {
                return 5;
            }
            if ((boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0422\u307c\uc4e7\uf957\u8247\ub3ca"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0429\u307b\uc4f4\uf926"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0435\u307b\uc4f3\uf957\u824e\ub3d0\ue920\u135a\u496b\u058f\u52d7\u7359\ubd6d\ufcd8\u8707\ud1f2"), -145835974, new Object[] { g })) {
                return -5;
            }
            if ((boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0424\u3074\uc4f4\uf95b"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0424\u3074\uc4f4\uf95b\u825d\ub3d7\ue928\u135b"), -145835974, new Object[] { g })) {
                return 91;
            }
            if (j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0434\u307c\uc4ed\uf95b\u825a\ub3ca\ue924\u1353\u491b"), -145835974, new Object[] { g })) {
                return 93;
            }
            if (intValue == 1 || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0429\u307b\uc4f4"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0429\u307b\uc4f4\uf95b\u824e\ub3db\ue937"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u042d\u3070\uc4e4\uf957\u825c\ub3d3\ue92c\u1350\u491f"), -145835974, new Object[] { g })) {
                return 4;
            }
        }
        if (intValue == 2 || intValue == 5) {
            if (j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0424\u3070\uc4e3\uf957\u8244\ub3df\ue929"), -145835974, new Object[] { g })) {
                return 3;
            }
            if ((boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0424\u307a\uc4f5\uf95c\u8245\ub3db"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0424\u307a\uc4f5\uf95c\u8245\ub3db\ue945\u134e\u4919\u0588\u52dd\u7357\ubd1e\ufcd8\u8706\ud1e8"), -145835974, new Object[] { g })) {
                return 8;
            }
            if (j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u042e\u3060\uc4ed\uf95b\u825b\ub3d7\ue926"), -145835974, new Object[] { g })) {
                return 2;
            }
            if (j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0432\u3070\uc4e1\uf952"), -145835974, new Object[] { g })) {
                return 7;
            }
            if (intValue == 2 || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0426\u3079\uc4ef\uf95f\u825d"), -145835974, new Object[] { g })) {
                return 6;
            }
        }
        if (intValue == 3 || intValue == 5) {
            if ((boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0423\u307d\uc4e1\uf94c\u8248\ub3dd\ue931\u135b\u4919"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u042e\u3076\uc4e8\uf95f\u825b"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u042e\u3074\uc4f4\uf957\u825f\ub3db\ue945\u135d\u4903\u058c\u52cc\u735f\ubd0e\ufcc5\u870c\ud1f4"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0423\u307d\uc4e1\uf94c"), -145835974, new Object[] { g })) {
                return 1;
            }
            if (j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0423\u3079\uc4ef\uf95c"), -145835974, new Object[] { g })) {
                return 2005;
            }
            if ((boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0424\u3074\uc4f4\uf95b"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0424\u3074\uc4f4\uf95b\u825d\ub3d7\ue928\u135b"), -145835974, new Object[] { g })) {
                return 91;
            }
            if (intValue == 3 || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0436\u3074\uc4f2\uf95d\u8241\ub3df\ue937"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0436\u3074\uc4f2\uf947\u8240\ub3d0\ue922\u133e\u4908\u0585\u52df\u734c\ubd0c\ufcd2\u871d\ud1e3\ueb1b"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u042e\u3063\uc4e1\uf94c\u824a\ub3d6\ue924\u134c"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0434\u3070\uc4f8\uf94a"), -145835974, new Object[] { g })) {
                return 12;
            }
        }
        if (intValue == 4 || intValue == 5) {
            if (j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0422\u307c\uc4ee\uf95f\u825b\ub3c7"), -145835974, new Object[] { g })) {
                return -2;
            }
            if (intValue == 4 || (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u0422\u3079\uc4ef\uf95c"), -145835974, new Object[] { g })) {
                return 2004;
            }
        }
        return 2;
    }
    
    public String getColumnTypeName(final int n) throws SQLException {
        final Object g = j.g(this, -162285509, new Object[] { n });
        if (g != null) {
            final Object g2 = j.g(j.B(1873721404), -1198278595, new Object[] { g });
            (boolean)j.g(g2, 252426302, null);
            return (String)j.g(j.g(g2, 1774762063, new Object[] { 1 }), 1882044497, new Object[] { j.B(-2060928944) });
        }
        switch ((int)j.g(j.g(this, 319272952, null), 109033489, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -1280395228, new Object[] { n }) })) {
            case 1: {
                return JDBC3Connection$JDBC3PreparedStatement.N("\u6339\u4563\u6b82\u8c14\u7422\u49e1\u860b");
            }
            case 2: {
                return JDBC3Connection$JDBC3PreparedStatement.N("\u6336\u4561\u6b99\u8c10\u7431");
            }
            case 4: {
                return JDBC3Connection$JDBC3PreparedStatement.N("\u6332\u4561\u6b99\u8c13");
            }
            case 5: {
                return JDBC3Connection$JDBC3PreparedStatement.N("\u633e\u4578\u6b9b\u8c14\u7437\u49ed\u861a");
            }
            case 3: {
                return JDBC3Connection$JDBC3PreparedStatement.N("\u6324\u4568\u6b8e\u8c05");
            }
            default: {
                return JDBC3Connection$JDBC3PreparedStatement.N("\u633e\u4578\u6b9b\u8c14\u7437\u49ed\u861a");
            }
        }
    }
    
    public int getPrecision(final int i) throws SQLException {
        final Object g = j.g(this, -162285509, new Object[] { i });
        if (g != null) {
            final Object g2 = j.g(j.B(757053522), -1198278595, new Object[] { g });
            return (int)(j.g(g2, 252426302, null) ? j.x(-1063208875, new Object[] { j.g(((Object[])j.g(j.g(g2, 1774762063, new Object[] { 1 }), 1783543891, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u0235") }))[0], 1251719252, null) }) : 0);
        }
        return 0;
    }
    
    private String getColumnDeclType(final int n) throws SQLException {
        final Object g = j.g(this, 319272952, null);
        Object g2 = j.g(g, -42354602, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -1280395228, new Object[] { n }) });
        if (g2 == null) {
            final Object g3 = j.g(j.B(-1551386521), -1198278595, new Object[] { j.g(g, 636401720, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -1280395228, new Object[] { n }) }) });
            g2 = (((boolean)j.g(g3, 252426302, null)) ? j.g(g3, 1774762063, new Object[] { 1 }) : null);
        }
        return (String)g2;
    }
    
    public int getScale(final int i) throws SQLException {
        final Object g = j.g(this, -162285509, new Object[] { i });
        if (g != null) {
            final Object g2 = j.g(j.B(757053522), -1198278595, new Object[] { g });
            if (j.g(g2, 252426302, null)) {
                final Object[] array = (Object[])j.g(j.g(g2, 1774762063, new Object[] { 1 }), 1783543891, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u3569") });
                if (array.length == 2) {
                    return (int)j.x(-1063208875, new Object[] { j.g(array[1], 1251719252, null) });
                }
            }
        }
        return 0;
    }
    
    public String getSchemaName(final int n) throws SQLException {
        return "";
    }
    
    public String getTableName(final int i) throws SQLException {
        final Object g = j.g(j.g(this, 319272952, null), -1502431195, new Object[] { (long)j.Y(j.Y(this, 508409849), 1566619642), (int)j.g(this, -1280395228, new Object[] { i }) });
        if (g == null) {
            return "";
        }
        return (String)g;
    }
    
    public int isNullable(final int i) throws SQLException {
        j.g(this, -1533691800, null);
        return ((boolean[][])j.Y(this, -886327191))[(int)j.g(this, -1280395228, new Object[] { i })][1] ? 0 : 1;
    }
    
    public boolean isAutoIncrement(final int i) throws SQLException {
        j.g(this, -1533691800, null);
        return ((boolean[][])j.Y(this, -886327191))[(int)j.g(this, -1280395228, new Object[] { i })][2];
    }
    
    public boolean isCaseSensitive(final int n) throws SQLException {
        return true;
    }
    
    public boolean isCurrency(final int n) throws SQLException {
        return false;
    }
    
    public boolean isDefinitelyWritable(final int n) throws SQLException {
        return true;
    }
    
    public boolean isReadOnly(final int n) throws SQLException {
        return false;
    }
    
    public boolean isSearchable(final int n) throws SQLException {
        return true;
    }
    
    public boolean isSigned(final int i) throws SQLException {
        final Object g = j.g(this, -147736519, new Object[] { i });
        return (boolean)j.g(JDBC3Connection$JDBC3PreparedStatement.N("\u61c9\ub9f4\u2386\u85ec\uad29\uafb7\u0087"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3Connection$JDBC3PreparedStatement.N("\u61ce\ub9ef\u239f\u85ec\uad3c\uafbb\u0096"), -145835974, new Object[] { g }) || (boolean)j.g(JDBC3Connection$JDBC3PreparedStatement.N("\u61d5\ub9e4\u238a\u85e5"), -145835974, new Object[] { g });
    }
    
    public boolean isWritable(final int n) throws SQLException {
        return true;
    }
    
    public int getConcurrency() throws SQLException {
        return 1007;
    }
    
    public boolean rowDeleted() throws SQLException {
        return false;
    }
    
    public boolean rowInserted() throws SQLException {
        return false;
    }
    
    public boolean rowUpdated() throws SQLException {
        return false;
    }
    
    private Calendar julianDateToCalendar(final Double n) {
        return (Calendar)j.g(this, 743946288, new Object[] { n, j.x(-1519798221, null) });
    }
    
    private Calendar julianDateToCalendar(final Double n, final Calendar calendar) {
        if (n == null) {
            return null;
        }
        final double n2 = (double)j.g(n, -392120214, null) + 0.5;
        final int n3 = (int)n2;
        final double n4 = n2 - n3;
        int n5;
        if (n3 < 2299161) {
            n5 = n3;
        }
        else {
            final int n6 = (int)((n3 - 1867216.25) / 36524.25);
            n5 = n3 + 1 + n6 - (int)(n6 / 4.0);
        }
        final int n7 = n5 + 1524;
        final int n8 = (int)((n7 - 122.1) / 365.25);
        final int n9 = (int)(365.25 * n8);
        final int n10 = (int)((n7 - n9) / 30.6001);
        final int n11 = n10 - ((n10 < 13.5) ? 1 : 13);
        final int i = n8 - ((n11 > 2.5) ? 4716 : 4715);
        final double n12 = n7 - n9 - (int)(30.6001 * n10) + n4;
        final int j = (int)n12;
        final double n13 = n12 - j;
        final int k = (int)(24.0 * n13);
        final double n14 = 24.0 * n13 - k;
        final int l = (int)(60.0 * n14);
        final double n15 = 60.0 * n14 - l;
        final int m = (int)(60.0 * n15);
        final int i2 = (int)(1000.0 * (60.0 * n15 - m));
        org.sqlite.jdbc3.j.g(calendar, 289585259, new Object[] { i, n11 - 1, j, k, l, m });
        org.sqlite.jdbc3.j.g(calendar, 1269872748, new Object[] { 14, i2 });
        if (i < 1) {
            org.sqlite.jdbc3.j.g(calendar, 1269872748, new Object[] { 0, 0 });
            org.sqlite.jdbc3.j.g(calendar, 1269872748, new Object[] { 1, -(i - 1) });
        }
        return calendar;
    }
    
    public void checkCalendar(final Calendar calendar) throws SQLException {
        if (calendar != null) {
            return;
        }
        final Object h = j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u7f59\uca80\u60be\u7c1c\ub793\uba3f\ucd7c\ub2c8\ufc4a\uba32\u3124\ue324\u2b2c\u8f05\u911e\u076d\u8671\u03df\ube57\ua7e9\uf0de\u59e1\ua1ee\u48e3\u3d0f\uc535\ub81f\u4d8d\u4d7c") });
        j.g(h, 118208517, new Object[] { j.H(-184960915, null) });
        throw (Throwable)h;
    }
    
    static {
        j.T(1873721404, j.x(1884141678, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u62ce\u04e4\ubb60\u34bb\u11ca\u55f4\u9854\uafe4") }));
        j.T(-1551386521, j.x(1884141678, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6285\u04de\ubb4d\u3493\u11be\u5581\u9850\uafe7\ud19a\ub772\ucf9c\u7006\u4c8b\u1d95\u50b7\uaad9\u40a6\u8b19\u2ed5\u4439\u8afb\uc69f\u0f5f\u7c81\u6707\u93ab\u2343") }));
        j.T(757053522, j.x(1884141678, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u62c8\u0495\ubb01\u34bb\u11ca\u5581\u9850\uafe7\ud19a\ub707\ucfb3\u7004") }));
    }
}
