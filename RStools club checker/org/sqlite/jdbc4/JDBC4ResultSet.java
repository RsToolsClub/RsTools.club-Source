// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc4;

import java.io.Writer;
import java.io.OutputStream;
import java.sql.Timestamp;
import java.sql.Time;
import java.sql.Date;
import java.net.URL;
import java.sql.Ref;
import java.util.Map;
import java.sql.Clob;
import java.sql.Blob;
import java.math.BigDecimal;
import java.io.UnsupportedEncodingException;
import java.sql.Array;
import java.io.InputStream;
import java.io.Reader;
import java.sql.SQLXML;
import java.sql.NClob;
import java.sql.RowId;
import java.sql.SQLException;
import org.sqlite.core.CoreStatement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import org.sqlite.jdbc3.JDBC3ResultSet;

public class JDBC4ResultSet extends JDBC3ResultSet implements ResultSet, ResultSetMetaData
{
    public JDBC4ResultSet(final CoreStatement coreStatement) {
        super(coreStatement);
    }
    
    @Override
    public void close() throws SQLException {
        final boolean booleanValue = (boolean)kt.R(this, 914198322, null);
        kt.R(this, 1832947507, null);
        if (booleanValue && kt.P(this, -1192718536) instanceof JDBC4Statement) {
            final Object p = kt.P(this, -1192718536);
            if ((boolean)kt.P(p, 2081787717) && !(boolean)kt.R(p, 1744539441, null)) {
                kt.R(p, 59215670, null);
            }
        }
    }
    
    public <T> T unwrap(final Class<T> clazz) throws ClassCastException {
        return (T)kt.R(clazz, 1632538426, new Object[] { this });
    }
    
    public boolean isWrapperFor(final Class<?> clazz) {
        return (boolean)kt.R(clazz, 1439207227, new Object[] { this });
    }
    
    public RowId getRowId(final int n) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public RowId getRowId(final String s) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateRowId(final int n, final RowId rowId) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateRowId(final String s, final RowId rowId) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public int getHoldability() throws SQLException {
        return 0;
    }
    
    public boolean isClosed() throws SQLException {
        return !(boolean)kt.R(this, 914198322, null);
    }
    
    public void updateNString(final int n, final String s) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateNString(final String s, final String s2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateNClob(final int n, final NClob nClob) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateNClob(final String s, final NClob nClob) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public NClob getNClob(final int n) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public NClob getNClob(final String s) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public SQLXML getSQLXML(final int n) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public SQLXML getSQLXML(final String s) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateSQLXML(final int n, final SQLXML sqlxml) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateSQLXML(final String s, final SQLXML sqlxml) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public String getNString(final int n) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public String getNString(final String s) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public Reader getNCharacterStream(final int i) throws SQLException {
        return (Reader)kt.R(this, 1423937340, new Object[] { kt.R(this, -259551433, new Object[] { i }) });
    }
    
    private Reader getNCharacterStreamInternal(final String s) {
        if (s == null) {
            return null;
        }
        return (Reader)kt.k(474189621, new Object[] { s });
    }
    
    public Reader getNCharacterStream(final String s) throws SQLException {
        return (Reader)kt.R(this, 1423937340, new Object[] { kt.R(this, 33394522, new Object[] { s }) });
    }
    
    public void updateNCharacterStream(final int n, final Reader reader, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateNCharacterStream(final String s, final Reader reader, final long n) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateAsciiStream(final int n, final InputStream inputStream, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateBinaryStream(final int n, final InputStream inputStream, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateCharacterStream(final int n, final Reader reader, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateAsciiStream(final String s, final InputStream inputStream, final long n) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateBinaryStream(final String s, final InputStream inputStream, final long n) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateCharacterStream(final String s, final Reader reader, final long n) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateBlob(final int n, final InputStream inputStream, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateBlob(final String s, final InputStream inputStream, final long n) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateClob(final int n, final Reader reader, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateClob(final String s, final Reader reader, final long n) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateNClob(final int n, final Reader reader, final long n2) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateNClob(final String s, final Reader reader, final long n) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateNCharacterStream(final int n, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateNCharacterStream(final String s, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateAsciiStream(final int n, final InputStream inputStream) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateBinaryStream(final int n, final InputStream inputStream) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateCharacterStream(final int n, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateAsciiStream(final String s, final InputStream inputStream) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateBinaryStream(final String s, final InputStream inputStream) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateCharacterStream(final String s, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateBlob(final int n, final InputStream inputStream) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateBlob(final String s, final InputStream inputStream) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateClob(final int n, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateClob(final String s, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateNClob(final int n, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public void updateNClob(final String s, final Reader reader) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public <T> T getObject(final int n, final Class<T> clazz) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    public <T> T getObject(final String s, final Class<T> clazz) throws SQLException {
        throw (Throwable)kt.k(-1075671232, null);
    }
    
    protected SQLException unused() {
        return (SQLException)kt.k(-1075671232, null);
    }
    
    public Array getArray(final int n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public Array getArray(final String s) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public InputStream getAsciiStream(final int i) throws SQLException {
        return (InputStream)kt.R(this, 1682018139, new Object[] { kt.R(this, -259551433, new Object[] { i }) });
    }
    
    public InputStream getAsciiStream(final String s) throws SQLException {
        return (InputStream)kt.R(this, 1682018139, new Object[] { kt.R(this, 33394522, new Object[] { s }) });
    }
    
    private InputStream getAsciiStreamInternal(final String s) {
        if (s == null) {
            return null;
        }
        Object k;
        try {
            k = kt.k(-615805095, new Object[] { (byte[])kt.R(s, -70676768, new Object[] { JDBC4DatabaseMetaData$JDBC4ResultSet.I("\u31ec\uef95\u401b\u4ee0\u49d5") }) });
        }
        catch (UnsupportedEncodingException ex) {
            return null;
        }
        return (InputStream)k;
    }
    
    @Deprecated
    public BigDecimal getBigDecimal(final int n, final int n2) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    @Deprecated
    public BigDecimal getBigDecimal(final String s, final int n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public Blob getBlob(final int n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public Blob getBlob(final String s) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public Clob getClob(final int i) throws SQLException {
        return (Clob)kt.k(539004638, new Object[] { this, kt.R(this, -259551433, new Object[] { i }) });
    }
    
    public Clob getClob(final String s) throws SQLException {
        return (Clob)kt.k(539004638, new Object[] { this, kt.R(this, 33394522, new Object[] { s }) });
    }
    
    public Object getObject(final int n, final Map map) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public Object getObject(final String s, final Map map) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public Ref getRef(final int n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public Ref getRef(final String s) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public InputStream getUnicodeStream(final int i) throws SQLException {
        return (InputStream)kt.R(this, 898272991, new Object[] { i });
    }
    
    public InputStream getUnicodeStream(final String s) throws SQLException {
        return (InputStream)kt.R(this, -211644700, new Object[] { s });
    }
    
    public URL getURL(final int n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public URL getURL(final String s) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void insertRow() throws SQLException {
        throw (Throwable)kt.k(574656332, new Object[] { JDBC4DatabaseMetaData$JDBC4ResultSet.I("\u60e5\u4398\uc68c\ub26f\uc68b\ue88d\ud498\ud955\ubedf\u4529\uf931\ue1c0\u2103\ub4b0\uc925\uea59\u5ab5\u8cd6\u530e\u66b0\ub246\u4e6b\u99de\u92b4\u2563\u5b3b\u7fa1\u2be5\u28bb\u7049") });
    }
    
    public void moveToCurrentRow() throws SQLException {
        throw (Throwable)kt.k(574656332, new Object[] { JDBC4DatabaseMetaData$JDBC4ResultSet.I("\u5e3d\u664f\u9814\u2fe3\u311a\u57a1\u75cf\uda9c\u3f34\ud915\u6abe\u915e\u1d58\uf8d9\ubb88\u8c36\ucb4f\uf39a\u2fab\u795a\ud50a\u6b08\u1feb\u24a3\u0e97\u05fa\u8303\u91e5\ub796\u2cd7") });
    }
    
    public void moveToInsertRow() throws SQLException {
        throw (Throwable)kt.k(574656332, new Object[] { JDBC4Statement$JDBC4PreparedStatement.q("\u3fec\uc65a\u47b7\u032b\uc33b\u17bc\u438c\u490e\u21ed\u74a5\u9440\u3b7f\u9ae6\ud3de\u1769\u07c5\ud88e\u30ed\u0bef\u71a1\u941b\uf038\ub575\udfb7\u276a\u6185\u17bc\ub8af\ude6f\u42fa") });
    }
    
    public boolean last() throws SQLException {
        throw (Throwable)kt.k(574656332, new Object[] { JDBC4Statement$JDBC4PreparedStatement.q("\u39aa\u2166\u2c01\ufedb\uaad6\u37e4\u0371\u5410\u6ec7\ubc1b\u1717\u3c85\ub431\u5d90\u3339\ua0d1\u1e9e\u3df8\ubc17\uebac\u859a\u130a\u6821\u7096\ufcc1\ue081\ub843\ub86a\uf33a\uc732") });
    }
    
    public boolean previous() throws SQLException {
        throw (Throwable)kt.k(574656332, new Object[] { JDBC4DatabaseMetaData$JDBC4ResultSet.I("\u0518\u1e76\u9f87\ua352\u4ef4\u9dc4\u4669\uff06\uff4f\uac9f\ud2c2\u9cbe\ufb27\uf8ca\uf60d\u64c5\uaaa8\u166d\u5917\ucd18\u5848\u5193\u635d\ud8da\u876c\u5d39\u9f1f\u881c\u16e9\uab49") });
    }
    
    public boolean relative(final int n) throws SQLException {
        throw (Throwable)kt.k(574656332, new Object[] { JDBC4DatabaseMetaData$JDBC4ResultSet.I("\uc7ad\uf864\u26c4\u2558\u2c5c\ud3c4\u2f53\u3bdf\uc10a\u85d7\ud40b\u1a9d\u32b9\ude10\u5bb9\u1e28\u21bc\uf492\u7537\ue080\u8864\u4f40\u065f\u2285\u63ec\ud2af\ua4d5\u8d40\ue08e\ucb01") });
    }
    
    public boolean absolute(final int n) throws SQLException {
        throw (Throwable)kt.k(574656332, new Object[] { JDBC4Statement$JDBC4PreparedStatement.q("\u92de\ua839\u74c4\uaa1f\ufbd8\u79b7\u96f7\u3944\u3321\u52f9\u5d04\u1baf\u7fbb\ud624\ub4f9\u473c\u9e05\ue400\u83a6\uce3c\u4332\ub7a6\uec8d\u2c69\ue402\ua53f\ubf4d\uef60\u814b\u5560") });
    }
    
    public void afterLast() throws SQLException {
        throw (Throwable)kt.k(574656332, new Object[] { JDBC4DatabaseMetaData$JDBC4ResultSet.I("\ubeac\u97e1\u5d9c¶\u86ee\u1cdc\u2ef2\u264d\u1f1e\u92a7\udb0e\u3f59\u7b4e\uc342\u13a2\u6b00\u3678\ucaf7\u5b3c\ue0ab\u76f4\u78c0\u76f0\ue615\ud03c\u706f\u4751\u0fd7\ua288\u8e59") });
    }
    
    public void beforeFirst() throws SQLException {
        throw (Throwable)kt.k(574656332, new Object[] { JDBC4Statement$JDBC4PreparedStatement.q("\ue726\u7f59\u2985\uf722\u52b8\u92ed\u7451\u2de3\ueda0\uec0b\u310a\u2922\uf49c\ua094\u587d\u7ad9\u8d9a\u065e\u1971\u34b7\u7c12\ub646\ua5b4\u54df\ufe53\uf907\ub918\ub84d\uf811\uc319") });
    }
    
    public boolean first() throws SQLException {
        throw (Throwable)kt.k(574656332, new Object[] { JDBC4Statement$JDBC4PreparedStatement.q("\u4943\u0aa9\u6ab2\ua6b4\u1ac3\u3532\uf4a2\uf3a0\u47b5\u5751\u7c5c\u2863\uca57\uce34\ub8c3\u56f0\u0857\u9bcc\u540f\u8e16\u65bc\u102a\ud901\ub370\u160c\ube0b\u6fef\u81b3\uf125\u9c31") });
    }
    
    public void cancelRowUpdates() throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void deleteRow() throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateArray(final int n, final Array array) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateArray(final String s, final Array array) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateAsciiStream(final int n, final InputStream inputStream, final int n2) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateAsciiStream(final String s, final InputStream inputStream, final int n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateBigDecimal(final int n, final BigDecimal bigDecimal) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateBigDecimal(final String s, final BigDecimal bigDecimal) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateBinaryStream(final int n, final InputStream inputStream, final int n2) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateBinaryStream(final String s, final InputStream inputStream, final int n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateBlob(final int n, final Blob blob) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateBlob(final String s, final Blob blob) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateBoolean(final int n, final boolean b) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateBoolean(final String s, final boolean b) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateByte(final int n, final byte b) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateByte(final String s, final byte b) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateBytes(final int n, final byte[] array) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateBytes(final String s, final byte[] array) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateCharacterStream(final int n, final Reader reader, final int n2) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateCharacterStream(final String s, final Reader reader, final int n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateClob(final int n, final Clob clob) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateClob(final String s, final Clob clob) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateDate(final int n, final Date date) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateDate(final String s, final Date date) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateDouble(final int n, final double n2) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateDouble(final String s, final double n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateFloat(final int n, final float n2) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateFloat(final String s, final float n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateInt(final int n, final int n2) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateInt(final String s, final int n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateLong(final int n, final long n2) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateLong(final String s, final long n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateNull(final int n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateNull(final String s) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateObject(final int n, final Object o) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateObject(final int n, final Object o, final int n2) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateObject(final String s, final Object o) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateObject(final String s, final Object o, final int n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateRef(final int n, final Ref ref) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateRef(final String s, final Ref ref) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateRow() throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateShort(final int n, final short n2) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateShort(final String s, final short n) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateString(final int n, final String s) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateString(final String s, final String s2) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateTime(final int n, final Time time) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateTime(final String s, final Time time) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateTimestamp(final int n, final Timestamp timestamp) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void updateTimestamp(final String s, final Timestamp timestamp) throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    public void refreshRow() throws SQLException {
        throw (Throwable)kt.R(this, -1287418067, null);
    }
    
    class SqliteClob implements NClob
    {
        private String data;
        
        protected SqliteClob(final String s) {
            kt.e(this, 311791402, s);
        }
        
        public void free() throws SQLException {
            kt.e(this, 311791402, null);
        }
        
        public InputStream getAsciiStream() throws SQLException {
            return (InputStream)kt.Q(1673236272, new Object[] { kt.P(this, 1294307115), kt.P(this, 311791402) });
        }
        
        public Reader getCharacterStream() throws SQLException {
            return (Reader)kt.Q(-1732931799, new Object[] { kt.P(this, 1294307115), kt.P(this, 311791402) });
        }
        
        public Reader getCharacterStream(final long n, final long n2) throws SQLException {
            return (Reader)kt.Q(-1732931799, new Object[] { kt.P(this, 1294307115), kt.P(this, 311791402) });
        }
        
        public String getSubString(final long n, final int n2) throws SQLException {
            if (kt.P(this, 311791402) == null) {
                throw (Throwable)kt.k(574656332, new Object[] { JDBC4Statement$JDBC4PreparedStatement.q("\udc7c\u6ebf\u21ab\ubfa1\u12e8\u871d\u7b51") });
            }
            if (n < 1L) {
                throw (Throwable)kt.k(574656332, new Object[] { JDBC4Statement$JDBC4PreparedStatement.q("\udc42\u6ebf\u21f8\ubfac\u12fd\u8700\u7b5f\ufee3\u2b32\u2dc6\u0676\u2c0f\ubd4a\u4e0d\ub940\uc4d5\u3468\uaf33\u3b97\uec97\ua306\u8d04\ue712\u31d5\uce19\u7a17\ue646\u0d6e\u5f10\u62a2\u56ed\ua3be\ud492\ufaac\u6f1e\u4676\u8d82\ue017\u529a\ue625\u9813\u0d67\ua744") });
            }
            if (n2 < 0) {
                throw (Throwable)kt.k(574656332, new Object[] { JDBC4Statement$JDBC4PreparedStatement.q("\udc5e\u6eb5\u21e5\ubfa2\u12fd\u8701\u7b10\ufee0\u2b67\u2dd8\u0677\u2c5c\ubd5c\u4e48\ub902\uc4d7\u343a\uaf31\u3b84\uec86\ua302\u8d02\ue757\u31d3\uce51\u7a02\ue640\u0d2f\u5f11\u62f0\u56a2\ua3a9\ud4c3\ufabc\u6f0e\u466f\u8dc3\ue00f\u52d5\ue671\u984c") });
            }
            final int i = (int)n - 1;
            return (String)kt.R(kt.P(this, 311791402), 796299060, new Object[] { i, (int)kt.Q(-1761046737, new Object[] { i + n2, (int)kt.R(kt.P(this, 311791402), -432173266, null) }) });
        }
        
        public long length() throws SQLException {
            if (kt.P(this, 311791402) == null) {
                throw (Throwable)kt.k(574656332, new Object[] { JDBC4DatabaseMetaData$JDBC4ResultSet.I("\u4759\u59ed\u02b2\uc1dc\u4e70\u50bd\ude9c") });
            }
            return (int)kt.R(kt.P(this, 311791402), -432173266, null);
        }
        
        public long position(final String s, final long n) throws SQLException {
            kt.R(kt.P(this, 1294307115), -1287418067, null);
            return -1L;
        }
        
        public long position(final Clob clob, final long n) throws SQLException {
            kt.R(kt.P(this, 1294307115), -1287418067, null);
            return -1L;
        }
        
        public OutputStream setAsciiStream(final long n) throws SQLException {
            kt.R(kt.P(this, 1294307115), -1287418067, null);
            return null;
        }
        
        public Writer setCharacterStream(final long n) throws SQLException {
            kt.R(kt.P(this, 1294307115), -1287418067, null);
            return null;
        }
        
        public int setString(final long n, final String s) throws SQLException {
            kt.R(kt.P(this, 1294307115), -1287418067, null);
            return -1;
        }
        
        public int setString(final long n, final String s, final int n2, final int n3) throws SQLException {
            kt.R(kt.P(this, 1294307115), -1287418067, null);
            return -1;
        }
        
        public void truncate(final long n) throws SQLException {
            kt.R(kt.P(this, 1294307115), -1287418067, null);
        }
    }
}
