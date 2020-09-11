// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import nbz.nfc.kq;
import java.io.InputStream;
import java.net.URLStreamHandler;
import nbz.nfc.Handler;
import java.net.URISyntaxException;
import java.io.File;
import java.net.URL;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.Executor;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Properties;
import org.sqlite.core.CoreDatabaseMetaData;
import org.sqlite.core.DB;
import java.sql.Connection;

public abstract class SQLiteConnection implements Connection
{
    private static final String RESOURCE_NAME_PREFIX;
    private final DB db;
    private CoreDatabaseMetaData meta;
    private final SQLiteConnectionConfig connectionConfig;
    
    public SQLiteConnection(final DB db) {
        mn.L(this, -1883112506, null);
        mn.L(this, -1889797171, db);
        mn.L(this, 2048064458, mn.t(mn.t(db, -309986356, null), 1465449419, null));
    }
    
    public SQLiteConnection(final String s, final String s2) throws SQLException {
        this(s, s2, (Properties)mn.k(1914436680, null));
    }
    
    public SQLiteConnection(final String s, final String s2, final Properties properties) throws SQLException {
        mn.L(this, -1883112506, null);
        mn.L(this, -1889797171, mn.W(161545153, new Object[] { s, s2, properties }));
        final Object t = mn.t(mn.J(this, -1889797171), -309986356, null);
        mn.L(this, 2048064458, mn.t(mn.t(mn.J(this, -1889797171), -309986356, null), 1465449419, null));
        mn.t(t, -1195115584, new Object[] { this });
    }
    
    public SQLiteConnectionConfig getConnectionConfig() {
        return (SQLiteConnectionConfig)mn.J(this, 2048064458);
    }
    
    public CoreDatabaseMetaData getSQLiteDatabaseMetaData() throws SQLException {
        mn.t(this, -1541080129, null);
        if (mn.J(this, -1883112506) == null) {
            mn.L(this, -1883112506, mn.k(-237700162, new Object[] { this }));
        }
        return (CoreDatabaseMetaData)mn.J(this, -1883112506);
    }
    
    public DatabaseMetaData getMetaData() throws SQLException {
        return (DatabaseMetaData)mn.t(this, 1557855173, null);
    }
    
    public String getUrl() {
        return (String)mn.t(mn.J(this, -1889797171), -1343095868, null);
    }
    
    public void setSchema(final String s) throws SQLException {
    }
    
    public String getSchema() throws SQLException {
        return null;
    }
    
    public void abort(final Executor executor) throws SQLException {
    }
    
    public void setNetworkTimeout(final Executor executor, final int n) throws SQLException {
    }
    
    public int getNetworkTimeout() throws SQLException {
        return 0;
    }
    
    protected void checkCursor(final int n, final int n2, final int n3) throws SQLException {
        if (n != 1003) {
            throw (Throwable)mn.k(-886637961, new Object[] { Function$SQLiteConnection.c("\ue2a6\u8135\u7ef0\u3274\u8550\u722f\u5f8d\ua0ec\u8f6b\uafa3\u2c92\u56ec\u8d45\ua350\uf407\u71a5\u70c1\u70a4\uc688\ueccc\u81fd\u567d\u02d9\u08b9\ub0e1\uc986\u3dd8\ua70b\uf921\u0499\u1aee\u6dcc\ue983\u5451\uf645\u9904\u3d9e\u70c4\u87fd\uac76\u76c1\u68ce\ue187\u9179\u79fe\u0a22") });
        }
        if (n2 != 1007) {
            throw (Throwable)mn.k(-886637961, new Object[] { Function$SQLiteConnection.c("\ue2a6\u8135\u7ef0\u3274\u8550\u722f\u5f8d\ua0ec\u8f6b\uafa3\u2c92\u56ec\u8d45\ua350\uf407\u71a5\u70c1\u70a4\uc688\ueccc\u81fd\u566a\u02cf\u08a7\ub0e7\uc98c\u3dcc\ua71b\uf921\u048b\u1aee\u6dda\ue998\u5441\uf644\u9906\u3d8b\u70bd\u87be\uac60\u76c6\u68cf\ue19b\u9164\u79ff") });
        }
        if (n3 != 2) {
            throw (Throwable)mn.k(-886637961, new Object[] { Function$SQLiteConnection.c("\ue2a6\u8135\u7ef0\u3274\u8550\u722f\u5f8d\ua0ec\u8f6b\uafa3\u2c92\u56ec\u8d45\ua350\uf407\u71a5\u70c1\u70a4\uc688\ueccc\u81fd\u564a\u02ec\u0886\ub0d7\uc9b0\u3df0\ua723\uf953\u04ad\u1ada\u6dec\ue9b4\u5461\uf678\u9939\u3df2\u70fc\u87a9\uac35\u76d7\u68d3\ue199\u917b\u79e5\u0a25") });
        }
    }
    
    protected void setTransactionMode(final SQLiteConfig.TransactionMode transactionMode) {
        mn.t(mn.J(this, 2048064458), -1099891807, new Object[] { transactionMode });
    }
    
    public int getTransactionIsolation() {
        return (int)mn.t(mn.J(this, 2048064458), -1110377533, null);
    }
    
    public void setTransactionIsolation(final int i) throws SQLException {
        mn.t(this, -1541080129, null);
        switch (i) {
            case 8: {
                mn.t(mn.t(this, 1420556925, null), -1030554727, new Object[] { Function$ProgressHandler.Y("\uecbc\ud36b\ua26a\u64fe\uf484\u4247\u7ce1\u8371\ue2cb\u4f5b\u8c70\u39f7\u9a96\u0bf0\ucb5f\u4579\ua7b9\u47e5\udbe1\u2ffa\u3f2c\ue1b2\ua04a\u7431\u0f8a\uffee\uf250\u51ce\u3c00\ud5ca\u3a4e\u2ce5"), Boolean.valueOf((boolean)mn.t(this, 1518009282, null)) });
                break;
            }
            case 1: {
                mn.t(mn.t(this, 1420556925, null), -1030554727, new Object[] { Function$ProgressHandler.Y("\uecbc\ud36b\ua26a\u64fe\uf484\u4247\u7ce1\u8371\ue2cb\u4f5b\u8c70\u39f7\u9a96\u0bf0\ucb5f\u4579\ua7b9\u47e5\udbe1\u2ffa\u3f2c\ue1b2\ua04a\u7431\u0f8a\uffee\uf242\u51dd\u3c19\ud5dc\u3a10"), Boolean.valueOf((boolean)mn.t(this, 1518009282, null)) });
                break;
            }
            default: {
                throw (Throwable)mn.k(-886637961, new Object[] { Function$ProgressHandler.Y("\uecbf\ud368\ua267\u64d0\uf4bd\u4263\u7ce1\u8370\ue2db\u4f4a\u8c64\u39c7\u9a91\u0bea\ucb4f\u4536\ua7bb\u47e6\udbe4\u2ff7\u3f78\ue183\ua07c\u7450\u0ff9\uff9d\uf277\u51ec\u3c38\ud5f0\u3a64\u2c90\ue67a\u3cdf\u91b2\u2171\ucc22\uc7f7\uf355\u20b3\u936e\u0e3c\u815c\u4e33\uce6a\u3b5f\u1a0c\u591f\u0df9\ubef1\u49da\u7195\u950f\uc372\u74a1\uba13\u6b7a\u5f42\u1b54\ud84d\uc61c\u0170\uc14a\u0889\u13b6\u7058\u1af9\u1838\u77ec\uee08\uf2a8\u8e64\ue77b\u3c7d\u8259\u1cd1\u8e02\ufb3f\u2a37") });
            }
        }
        mn.t(mn.J(this, 2048064458), -1737491560, new Object[] { i });
    }
    
    private static DB open(final String s, final String s2, final Properties properties) throws SQLException {
        final Object k = mn.k(1914436680, null);
        mn.t(k, 282721175, new Object[] { properties });
        Object o = mn.W(810941334, new Object[] { s, s2, k });
        final Object i = mn.k(-2084963427, new Object[] { k });
        if (!(boolean)mn.t(o, 1600125926, null) && !(boolean)mn.t(Function$SQLiteConnection.c("\ubcd3\ud69c\u0ba1\u957f\u94f0\u0b22\u7d4b\u5276"), -608109668, new Object[] { o }) && !(boolean)mn.t(o, -1289880677, new Object[] { Function$SQLiteConnection.c("\ubc8f\ud698\u0ba8\u9577\u94a5") }) && !(boolean)mn.t(o, -1968768102, new Object[] { Function$SQLiteConnection.c("\ubc84\ud69e\u0ba0\u9577\u94a2\u0b3d\u7d57\u5221\uf5a3\u0b2c\u9c56") })) {
            if (mn.t(o, -1289880677, new Object[] { Function$SQLiteConnection.c("\ubcd3\ud683\u0ba1\u9561\u94f0\u0b25\u7d40\u522f\uf5a9\u0b64") })) {
                final Object t = mn.t(o, 716569489, new Object[] { (int)mn.t(Function$SQLiteConnection.c("\ubcd3\ud683\u0ba1\u9561\u94f0\u0b25\u7d40\u522f\uf5a9\u0b64"), -1436222475, null) });
                Object o2 = mn.W(-1762395250, new Object[] { mn.t(mn.W(-1144915056, null), -373228657, null), t });
                if (o2 == null) {
                    try {
                        o2 = mn.k(1460730773, new Object[] { t });
                    }
                    catch (MalformedURLException ex) {
                        throw (Throwable)mn.k(-886637961, new Object[] { mn.W(1560738420, new Object[] { Function$SQLiteConnection.c("\ubc9b\ud694\u0bb7\u957d\u94ea\u0b22\u7d51\u5229\uf5ec\u0b7b\u9c5c\u2cea\u4122\u1414\uff4d\u9c90\uedba\u7f65\u3faf\u7a73\u047d\ucb43\udd3b\ued52\u4719"), { t, ex } }) });
                    }
                }
                try {
                    o = mn.t(mn.W(-1459881068, new Object[] { o2 }), 171506579, null);
                }
                catch (IOException ex2) {
                    throw (Throwable)mn.k(-886637961, new Object[] { mn.W(1560738420, new Object[] { Function$SQLiteConnection.c("\ubc8f\ud690\u0bad\u957e\u94fa\u0b34\u7d12\u5238\uf5a3\u0b7e\u9c43\u2ca5\u412d\u141f\uff19\u9c95\uedaf\u7f30\u3ffa\u7a38\u046a"), { t, ex2 } }) });
                }
            }
            else {
                final Object t2 = mn.t(mn.k(1696660370, new Object[] { o }), -1577583703, null);
                Object t3 = mn.t(t2, 71235944, null);
                if (t3 != null && !(boolean)mn.t(t3, 79427943, null)) {
                    for (Object t4 = t3; t4 != null && !(boolean)mn.t(t4, 79427943, null); t4 = mn.t(t4, 71235944, null)) {
                        t3 = t4;
                    }
                    throw (Throwable)mn.k(-886637961, new Object[] { mn.t(mn.t(mn.t(mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { Function$SQLiteConnection.c("\ubc99\ud690\u0bb0\u957a\u94bf\u0b24\u7d5d\u526c\uf5eb") }), -542770190, new Object[] { o }), -542770190, new Object[] { Function$SQLiteConnection.c("\ubcce\ud6cb\u0be4\u9535") }), 1107491174, new Object[] { t3 }), -542770190, new Object[] { Function$SQLiteConnection.c("\ubcce\ud6d1\u0ba0\u957d\u94fa\u0b23\u7d12\u5222\uf5a3\u0b2a\u9c0f\u2caf\u4134\u1412\uff4a\u9cc4") }), 948763657, null) });
                }
                try {
                    if (!(boolean)mn.t(t2, 79427943, null) && (boolean)mn.t(t2, 1286928749, null)) {
                        (boolean)mn.t(t2, -1003882132, null);
                    }
                }
                catch (Exception ex3) {
                    throw (Throwable)mn.k(-886637961, new Object[] { mn.t(mn.t(mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { Function$SQLiteConnection.c("\ubc86\ud681\u0ba1\u957c\u94f6\u0b3e\u7d55\u526c\uf5a8\u0b3c\u9c15\u2cea\u416b") }), -542770190, new Object[] { o }), -542770190, new Object[] { Function$SQLiteConnection.c("\ubcce\ud6cb\u0be4") }), -542770190, new Object[] { mn.t(ex3, -207357589, null) }), 948763657, null) });
                }
                o = mn.t(t2, 171506579, null);
            }
        }
        Object j;
        try {
            (boolean)mn.W(803666282, null);
            j = mn.k(1730738529, new Object[] { s, o, i });
        }
        catch (Exception ex4) {
            final Object l = mn.k(-886637961, new Object[] { Function$SQLiteConnection.c("\ubcac\ud683\u0bb6\u957d\u94ed\u0b70\u7d5d\u523c\uf5a9\u0b30\u9c46\u2ca4\u412b\u145b\uff5a\u9cdf\uedb2\u7f64\u3fbf\u7a7e\u046d\ucb10\udd74\ued19") });
            mn.t(l, -405866144, new Object[] { ex4 });
            throw (Throwable)l;
        }
        mn.t(j, 1264712030, new Object[] { o, (int)mn.t(i, 1755838815, null) });
        return (DB)j;
    }
    
    private static File extractResource(final URL url) throws IOException {
        if (mn.t(mn.t(url, -409274011, null), -608109668, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\uff77\u32d3\u3e48\u54ba") })) {
            try {
                return (File)mn.k(-468387485, new Object[] { mn.t(url, 671021412, null) });
            }
            catch (URISyntaxException ex) {
                throw (Throwable)mn.k(-1671103559, new Object[] { mn.t(ex, 419821922, null) });
            }
        }
        final Object k = mn.k(165215165, new Object[] { mn.t(mn.k(1696660370, new Object[] { mn.W(1109523384, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\uff7b\u32db\u3e52\u54be\ub272\u5f70\uc710\u32f7\u7045\u138d\u1ce9\u7892\u1769\ub861") }) }), 171506579, null), mn.W(1560738420, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\uff62\u32cb\u3e48\u54b6\ub228\u5f7c\uc752\u32b3\u7055\u1382\u1cfa\u78db\u1774\ub87e\u8a30\ua399\u4729\u934c\uc5a2\udc6f\u8e83"), { mn.W(-529663050, new Object[] { (int)mn.t(url, -1399063625, null) }) } }) });
        if (mn.t(k, 79427943, null)) {
            if ((long)mn.t(mn.t(url, -988808260, null), 365689787, null) < (long)mn.t(k, -564462662, null)) {
                return (File)k;
            }
            if (!(boolean)mn.t(k, -1003882132, null)) {
                throw (Throwable)mn.k(-1671103559, new Object[] { mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\uff77\u32db\u3e4d\u54b3\ub239\u5f7d\uc75f\u32ad\u705e\u13c0\u1ceb\u7893\u176d\ub87c\u8a36\ua3d1\u472c\u934d\uc5f4\udc62\u8e92\ud2d5\u94f0\uc959\u035a\ud992\u24c8\u107a\u93ff\u8a6b\uf277\uf75b\ub489\ud9ad\uee86") }), -542770190, new Object[] { mn.t(k, 171506579, null) }), 948763657, null) });
            }
        }
        final byte[] array = new byte[8192];
        final Object i = mn.k(-744424527, new Object[] { k });
        final Object w = mn.W(1715796912, new Object[] { url });
        try {
            int intValue;
            while ((intValue = (int)mn.t(w, -1659831377, new Object[] { array })) != -1) {
                mn.t(i, -2085553234, new Object[] { array, 0, intValue });
            }
            final File file = (File)k;
            mn.t(i, -1841300555, null);
            mn.t(w, 997063604, null);
            return file;
        }
        finally {
            mn.t(i, -1841300555, null);
            mn.t(w, 997063604, null);
            throw;
        }
    }
    
    public DB getDatabase() {
        return (DB)mn.J(this, -1889797171);
    }
    
    public boolean getAutoCommit() throws SQLException {
        mn.t(this, -1541080129, null);
        return (boolean)mn.t(mn.J(this, 2048064458), 326368179, null);
    }
    
    public void setAutoCommit(final boolean b) throws SQLException {
        mn.t(this, -1541080129, null);
        if ((boolean)mn.t(mn.J(this, 2048064458), 326368179, null) == b) {
            return;
        }
        mn.t(mn.J(this, 2048064458), -1658586190, new Object[] { b });
        mn.t(mn.J(this, -1889797171), -1030554727, new Object[] { ((boolean)mn.t(mn.J(this, 2048064458), 326368179, null)) ? SQLiteDataSource$SQLiteDataSource.G("\ucbc4\u59c2\ud61f\u85ab\u5cb5\u1cd2\u0eca") : mn.t(mn.J(this, 2048064458), -572654647, null), b });
    }
    
    public int getBusyTimeout() {
        return (int)mn.t(mn.t(mn.J(this, -1889797171), -309986356, null), 716110216, null);
    }
    
    public void setBusyTimeout(final int n) throws SQLException {
        mn.t(mn.t(mn.J(this, -1889797171), -309986356, null), 1100609927, new Object[] { n });
        mn.t(mn.J(this, -1889797171), 291174790, new Object[] { n });
    }
    
    public boolean isClosed() throws SQLException {
        return (boolean)mn.t(mn.J(this, -1889797171), 2070346125, null);
    }
    
    public void close() throws SQLException {
        if (mn.t(this, -912721524, null)) {
            return;
        }
        if (mn.J(this, -1883112506) != null) {
            mn.t(mn.J(this, -1883112506), 1248262539, null);
        }
        mn.t(mn.J(this, -1889797171), -1807877750, null);
    }
    
    protected void checkOpen() throws SQLException {
        if (mn.t(this, -912721524, null)) {
            throw (Throwable)mn.k(-886637961, new Object[] { Function$ProgressHandler.Y("\u41b1\u3e5d\u03b7\u445c\u04eb\u8232\u309b\udb18\ua061\udd19\u9dcd\uc278\u0790\u000b\ub22f\ucd99\u23da\u55f8\u5691\ue14e\u256b\uaf8d\u2d59\u4eff\u059f\u894c") });
        }
    }
    
    public String libversion() throws SQLException {
        mn.t(this, -1541080129, null);
        return (String)mn.t(mn.J(this, -1889797171), 1990719873, null);
    }
    
    public void commit() throws SQLException {
        mn.t(this, -1541080129, null);
        if (mn.t(mn.J(this, 2048064458), 326368179, null)) {
            throw (Throwable)mn.k(-886637961, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u1cb6\ub8f5\u94de\uc3db\u5e6a\u03df\u379d\u3434\u5d55\ub8ca\u8dd6\uc594\ua409\u64c4\u7967\u3992\u5f33\ub998\ud777\u6d4c\uc857\ue271\u4e77\ua5ca\u1a93\u57d3\u66c5\u8a10") });
        }
        mn.t(mn.J(this, -1889797171), -1030554727, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u1cb1\ub8fb\u94c7\uc3d7\u5e61\u03ca\u37d5"), Boolean.valueOf((boolean)mn.t(this, 1518009282, null)) });
        mn.t(mn.J(this, -1889797171), -1030554727, new Object[] { mn.t(mn.J(this, 2048064458), -572654647, null), Boolean.valueOf((boolean)mn.t(this, 1518009282, null)) });
    }
    
    public void rollback() throws SQLException {
        mn.t(this, -1541080129, null);
        if (mn.t(mn.J(this, 2048064458), 326368179, null)) {
            throw (Throwable)mn.k(-886637961, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u8099\u6455\u865c\u4753\u6993\uf413\u77b2\uf43b\u6fd7\uf865\u0f56\u7b44\u48e5\u97f8\u76ab\ub135\u8d14\u9277\ue39d\ud52a\u72c5\u1a9b\u8ba8\uc9d9\u849d\u9860\u476d\u1444") });
        }
        mn.t(mn.J(this, -1889797171), -1030554727, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u808f\u645b\u8644\u475e\u6993\uf413\u77a2\uf435\u6fcc"), Boolean.valueOf((boolean)mn.t(this, 1518009282, null)) });
        mn.t(mn.J(this, -1889797171), -1030554727, new Object[] { mn.t(mn.J(this, 2048064458), -572654647, null), Boolean.valueOf((boolean)mn.t(this, 1518009282, null)) });
    }
    
    protected static String extractPragmasFromFilename(final String s, final String s2, final Properties properties) throws SQLException {
        final int intValue = (int)mn.t(s2, -144246400, new Object[] { 63 });
        if (intValue == -1) {
            return s2;
        }
        final Object k = mn.k(-1510343693, null);
        mn.t(k, -542770190, new Object[] { mn.t(s2, 1499986303, new Object[] { 0, intValue }) });
        int n = 0;
        final Object[] array = (Object[])mn.t(mn.t(s2, 716569489, new Object[] { intValue + 1 }), 139393406, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u5255") });
        for (int i = 0; i < array.length; ++i) {
            final Object t = mn.t(array[array.length - 1 - i], 353499525, null);
            if (!(boolean)mn.t(t, 1600125926, null)) {
                final Object[] array2 = (Object[])mn.t(t, 139393406, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u524e") });
                final Object t2 = mn.t(mn.t(array2[0], 353499525, null), 17037700, null);
                if (mn.t(mn.j(-1906574346), -1482753661, new Object[] { t2 })) {
                    if (array2.length == 1) {
                        throw (Throwable)mn.k(-886637961, new Object[] { mn.W(1560738420, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u5223\ua4a8\u8ef4\u872a\ufc6e\u0c19\ud6c4\u0bb2\u4162\u04e7\uea86\u95cc\u46bb\u178b\u9d3e\ufe1f\ud466\uaff1\u8ef3\u3be0\uaeff\u05ba\u55b9\ud297\uda9b\u64ce\u59b0\u0ee1\ua5c3\uac08\u4115\u76d3\ua670\ud377\ub656\ue2ef\ub440\u889d\u4fd0\ud9c6\u68bc\u20f5\uc9b1\u04d1\u3321\u8899"), { t2, s } }) });
                    }
                    final Object t3 = mn.t(array2[1], 353499525, null);
                    if (!(boolean)mn.t(t3, 1600125926, null)) {
                        if (!(boolean)mn.t(properties, -555549721, new Object[] { t2 })) {
                            mn.t(properties, -2123301829, new Object[] { t2, t3 });
                        }
                    }
                }
                else {
                    mn.t(k, 390789506, new Object[] { (char)((n == 0) ? 63 : 38) });
                    mn.t(k, -542770190, new Object[] { t });
                    ++n;
                }
            }
        }
        return (String)mn.t(k, 948763657, null);
    }
    
    static URL F(final ClassLoader classLoader, final String name) {
        f();
        final URL resource = classLoader.getResource(name);
        if (resource == null) {
            return null;
        }
        return new URL(null, Function$SQLiteConnection.c("\ub5c9\ue4e3\ua195\u6869") + resource.toString(), new Handler());
    }
    
    static InputStream x(final URL url) throws IOException {
        if (url.getProtocol().startsWith(Function$SQLiteConnection.c("\uc01f\u46f1\u6e45"))) {
            return new kq(url.openStream());
        }
        return url.openStream();
    }
    
    private static void f() {
        if (System.getProperty(Function$ProgressHandler.Y("\uea54\u0158\u89ba\u4159\u3236\u2d5d\u47f3\u1d64\ubac7\u8601\uae44\ua4d7\ueccc\u1292\u1a3a\u7f86\u1c8a\u35db\u2004\uceac\u0788\u5654\u2c49\u4c36\u30b6\u5047")) == null) {
            System.setProperty(Function$ProgressHandler.Y("\uea54\u0158\u89ba\u4159\u3236\u2d5d\u47f3\u1d64\ubac7\u8601\uae44\ua4d7\ueccc\u1292\u1a3a\u7f86\u1c8a\u35db\u2004\uceac\u0788\u5654\u2c49\u4c36\u30b6\u5047"), Function$ProgressHandler.Y("\uea50\u015b\u89b6"));
        }
        else if (!System.getProperty(Function$ProgressHandler.Y("\uea54\u0158\u89ba\u4159\u3236\u2d5d\u47f3\u1d64\ubac7\u8601\uae44\ua4d7\ueccc\u1292\u1a3a\u7f86\u1c8a\u35db\u2004\uceac\u0788\u5654\u2c49\u4c36\u30b6\u5047")).contains(Function$ProgressHandler.Y("\uea50\u015b\u89b6"))) {
            System.setProperty(Function$ProgressHandler.Y("\uea54\u0158\u89ba\u4159\u3236\u2d5d\u47f3\u1d64\ubac7\u8601\uae44\ua4d7\ueccc\u1292\u1a3a\u7f86\u1c8a\u35db\u2004\uceac\u0788\u5654\u2c49\u4c36\u30b6\u5047"), System.getProperty(Function$ProgressHandler.Y("\uea54\u0158\u89ba\u4159\u3236\u2d5d\u47f3\u1d64\ubac7\u8601\uae44\ua4d7\ueccc\u1292\u1a3a\u7f86\u1c8a\u35db\u2004\uceac\u0788\u5654\u2c49\u4c36\u30b6\u5047")) + Function$ProgressHandler.Y("\uea42") + Function$ProgressHandler.Y("\uea50\u015b\u89b6"));
        }
    }
    
    static {
        RESOURCE_NAME_PREFIX = SQLiteDataSource$SQLiteDataSource.G("\udcba\u584e\u10d0\u22bb\uea8e\ubc59\ued16\ue50c\ua3a6\u156f");
    }
}
