// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Set;
import java.util.Properties;

public class SQLiteConfig
{
    public static final String DEFAULT_DATE_STRING_FORMAT;
    private final Properties pragmaTable;
    private int openModeFlag;
    private final int busyTimeout;
    private final SQLiteConnectionConfig defaultConnectionConfig;
    private static final String[] OnOff;
    static final Set<String> pragmaSet;
    
    public SQLiteConfig() {
        this((Properties)mn.k(1914436680, null));
    }
    
    public SQLiteConfig(final Properties properties) {
        mn.L(this, 429587527, 0);
        mn.L(this, -643498938, properties);
        final Object t = mn.t(mn.J(this, -643498938), -594478005, new Object[] { mn.J(mn.j(1673657421), -209191860) });
        if (t != null) {
            mn.L(this, 429587527, (int)mn.W(2139094090, new Object[] { t }));
        }
        else {
            mn.t(this, -1449264064, new Object[] { mn.j(68549697) });
            mn.t(this, -1449264064, new Object[] { mn.j(28310591) });
        }
        mn.t(this, 551091267, new Object[] { Boolean.valueOf((boolean)mn.W(866122820, new Object[] { mn.t(mn.J(this, -643498938), -500958139, new Object[] { mn.J(mn.j(-637076418), -209191860), Function$SQLiteConnection.c("\uab2b\u7ee1\u939d\u0e9d\uacd4") }) })) });
        mn.t(this, -1449264064, new Object[] { mn.j(16120898) });
        mn.L(this, -777585640, (int)mn.W(2139094090, new Object[] { mn.t(mn.J(this, -643498938), -500958139, new Object[] { mn.J(mn.j(-1170736103), -209191860), Function$SQLiteConnection.c("\uab7e\u7eb0\u93c1\u0ede") }) }));
        mn.L(this, -78644202, mn.W(-1866335209, new Object[] { mn.J(this, -643498938) }));
    }
    
    public SQLiteConnectionConfig newConnectionConfig() {
        return (SQLiteConnectionConfig)mn.t(mn.J(this, -78644202), 945028125, null);
    }
    
    public Connection createConnection(final String s) throws SQLException {
        return (Connection)mn.W(859044891, new Object[] { s, mn.t(this, -1352008676, null) });
    }
    
    public void apply(final Connection connection) throws SQLException {
        final Object k = mn.k(2113600538, null);
        final Object[] array = (Object[])mn.W(-1195705327, null);
        for (int length = array.length, i = 0; i < length; ++i) {
            (boolean)mn.t(k, -1038615536, new Object[] { mn.J(array[i], -209191860) });
        }
        (boolean)mn.t(k, -632685553, new Object[] { mn.J(mn.j(1673657421), -209191860) });
        (boolean)mn.t(k, -632685553, new Object[] { mn.J(mn.j(-637076418), -209191860) });
        (boolean)mn.t(k, -632685553, new Object[] { mn.J(mn.j(-394331122), -209191860) });
        (boolean)mn.t(k, -632685553, new Object[] { mn.J(mn.j(-1628177387), -209191860) });
        (boolean)mn.t(k, -632685553, new Object[] { mn.J(mn.j(413662228), -209191860) });
        (boolean)mn.t(k, -632685553, new Object[] { mn.J(mn.j(1600125971), -209191860) });
        (boolean)mn.t(k, -632685553, new Object[] { mn.J(mn.j(2113469458), -209191860) });
        (boolean)mn.t(k, -632685553, new Object[] { mn.J(mn.j(1376779305), -209191860) });
        final Object t = mn.t(connection, -1513817112, null);
        try {
            if (mn.t(mn.J(this, -643498938), -555549721, new Object[] { mn.J(mn.j(2113469458), -209191860) })) {
                final Object t2 = mn.t(mn.J(this, -643498938), -594478005, new Object[] { mn.J(mn.j(2113469458), -209191860) });
                if (t2 != null && !(boolean)mn.t(t2, 1600125926, null)) {
                    final Object t3 = mn.t(mn.J(this, -643498938), -594478005, new Object[] { mn.J(mn.j(1376779305), -209191860) });
                    String s;
                    if (mn.t(mn.t(mn.j(2141584365), -1494615060, null), -1309148181, new Object[] { t3 })) {
                        s = Function$ProgressHandler.Y("\u7d60\u8e95\ubbef\u2a8c\u6072\u3f02\ubeef\u76e2\u1133\ud8f5\u409d\u66bb\uc51a\u6143\u2198\u2348\u4ed4\u0c45\u61cc\ufa30");
                    }
                    else if (mn.t(mn.t(mn.j(-258737174), -1494615060, null), -1309148181, new Object[] { t3 })) {
                        s = Function$ProgressHandler.Y("\u7d60\u8e95\ubbef\u2a8c\u6072\u3f02\ubeef\u76e1\u1133\ud8f4\u40d6\u66e3\uc543\u6141\u21dd\u234f\u4ed6\u0c13\u6198\ufa35");
                    }
                    else {
                        s = Function$ProgressHandler.Y("\u7d60\u8e95\ubbef\u2a8c\u6072\u3f02\ubeef\u76e1\u1133\ud8f4\u40d6\u66e3\uc543\u6144\u2180\u231b\u4ed4");
                    }
                    (boolean)mn.t(t, -801637408, new Object[] { mn.W(1560738420, new Object[] { s, { mn.t(t2, -1571423263, new Object[] { Function$ProgressHandler.Y("\u7d37"), Function$ProgressHandler.Y("\u7d37\u8ec0") }) } }) });
                    (boolean)mn.t(t, -801637408, new Object[] { Function$ProgressHandler.Y("\u7d63\u8e82\ubbe2\u2a8e\u607c\u3f17\ubeef\u76bb\u1176\ud8eb\u4084\u66b1\uc50e\u6143\u21d6\u2319\u4e9f\u0c09\u61cb\ufa72\u49bf\u49d3\u1840\ua675\ue596\u9d2f\uc004") });
                }
            }
            final Object t4 = mn.t(mn.t(mn.J(this, -643498938), -6423585, null), -523895842, null);
            while (mn.t(t4, 754121701, null)) {
                final Object t5 = mn.t(mn.t(t4, -1581646876, null), -581108765, null);
                if (!(boolean)mn.t(k, 1037040610, new Object[] { t5 })) {
                    continue;
                }
                final Object t6 = mn.t(mn.J(this, -643498938), -594478005, new Object[] { t5 });
                if (t6 == null) {
                    continue;
                }
                (boolean)mn.t(t, -801637408, new Object[] { mn.W(1560738420, new Object[] { Function$ProgressHandler.Y("\u7d60\u8e95\ubbef\u2a8c\u6072\u3f02\ubeef\u76af\u1125\ud8b0\u40d3\u66ad"), { t5, t6 } }) });
            }
            if (t != null) {
                mn.t(t, -519898055, null);
            }
        }
        finally {
            if (t != null) {
                mn.t(t, -519898055, null);
            }
            throw;
        }
    }
    
    private void set(final Pragma pragma, final boolean b) {
        mn.t(this, 2090925111, new Object[] { pragma, mn.W(-359793608, new Object[] { b }) });
    }
    
    private void set(final Pragma pragma, final int i) {
        mn.t(this, 2090925111, new Object[] { pragma, mn.W(1828584502, new Object[] { i }) });
    }
    
    private boolean getBoolean(final Pragma pragma, final String s) {
        return (boolean)mn.W(866122820, new Object[] { mn.t(mn.J(this, -643498938), -500958139, new Object[] { mn.J(pragma, -209191860), s }) });
    }
    
    public boolean isEnabledSharedCache() {
        return (boolean)mn.t(this, -999031747, new Object[] { mn.j(-637076418), SQLiteDataSource$SQLiteDataSource.G("\u032e\ufcf2\u1360\u3cbc\ueab5") });
    }
    
    public boolean isEnabledLoadExtension() {
        return (boolean)mn.t(this, -999031747, new Object[] { mn.j(-394331122), Function$SQLiteConnection.c("\ufdf5\u6727\u3235\u14f2\u158b") });
    }
    
    public int getOpenModeFlags() {
        return (int)mn.J(this, 429587527);
    }
    
    public void setPragma(final Pragma pragma, final String s) {
        mn.t(mn.J(this, -643498938), -1081082820, new Object[] { mn.J(pragma, -209191860), s });
    }
    
    public Properties toProperties() {
        mn.t(mn.J(this, -643498938), -2123301829, new Object[] { mn.J(mn.j(1673657421), -209191860), mn.W(1828584502, new Object[] { (int)mn.J(this, 429587527) }) });
        mn.t(mn.J(this, -643498938), -2123301829, new Object[] { mn.J(mn.j(-672859078), -209191860), mn.t(mn.t(mn.J(this, -78644202), 1048902705, null), 1371077680, null) });
        mn.t(mn.J(this, -643498938), -2123301829, new Object[] { mn.J(mn.j(413662228), -209191860), mn.t(mn.t(mn.J(this, -78644202), 1213135919, null), -2035352530, null) });
        mn.t(mn.J(this, -643498938), -2123301829, new Object[] { mn.J(mn.j(-1628177387), -209191860), mn.t(mn.t(mn.J(this, -78644202), -139461579, null), -595592140, null) });
        mn.t(mn.J(this, -643498938), -2123301829, new Object[] { mn.J(mn.j(1600125971), -209191860), mn.t(mn.J(this, -78644202), -1433928653, null) });
        return (Properties)mn.J(this, -643498938);
    }
    
    static DriverPropertyInfo[] getDriverPropertyInfo() {
        final DriverPropertyInfo[] array = new DriverPropertyInfo[((Object[])mn.W(-1195705327, null)).length];
        int n = 0;
        for (final Object o : (Object[])mn.W(-1195705327, null)) {
            final Object k = mn.k(1535704114, new Object[] { mn.J(o, -209191860), null });
            mn.L(k, -535102456, mn.J(o, 318897225));
            mn.L(k, 1046215686, mn.J(o, -1081476089));
            mn.L(k, 195820557, false);
            array[n++] = (DriverPropertyInfo)k;
        }
        return array;
    }
    
    public void setOpenMode(final SQLiteOpenMode sqLiteOpenMode) {
        mn.L(this, 429587527, (int)mn.J(this, 429587527) | (int)mn.J(sqLiteOpenMode, 296549388));
    }
    
    public void resetOpenMode(final SQLiteOpenMode sqLiteOpenMode) {
        mn.L(this, 429587527, (int)mn.J(this, 429587527) & ~(int)mn.J(sqLiteOpenMode, 296549388));
    }
    
    public void setSharedCache(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(-637076418), b });
    }
    
    public void enableLoadExtension(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(-394331122), b });
    }
    
    public void setReadOnly(final boolean b) {
        if (b) {
            mn.t(this, -1449264064, new Object[] { mn.j(1952906250) });
            mn.t(this, 1619983361, new Object[] { mn.j(28310591) });
            mn.t(this, 1619983361, new Object[] { mn.j(68549697) });
        }
        else {
            mn.t(this, -1449264064, new Object[] { mn.j(68549697) });
            mn.t(this, -1449264064, new Object[] { mn.j(28310591) });
            mn.t(this, 1619983361, new Object[] { mn.j(1952906250) });
        }
    }
    
    public void setCacheSize(final int i) {
        mn.t(this, -1532822529, new Object[] { mn.j(-1624245248), i });
    }
    
    public void enableCaseSensitiveLike(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(-302187522), b });
    }
    
    @Deprecated
    public void enableCountChanges(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(1358625797), b });
    }
    
    public void setDefaultCacheSize(final int i) {
        mn.t(this, -1532822529, new Object[] { mn.j(-503776252), i });
    }
    
    public void deferForeignKeys(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(-590808061), b });
    }
    
    @Deprecated
    public void enableEmptyResultCallBacks(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(1835990018), b });
    }
    
    private static String[] toStringArray(final PragmaValue[] array) {
        final String[] array2 = new String[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = (String)mn.t(array[i], 576388057, null);
        }
        return array2;
    }
    
    public void setEncoding(final Encoding encoding) {
        mn.t(this, 2090925111, new Object[] { mn.j(-1188758568), mn.J(encoding, -1317798953) });
    }
    
    public void enforceForeignKeys(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(-1950680106), b });
    }
    
    @Deprecated
    public void enableFullColumnNames(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(-277611555), b });
    }
    
    public void enableFullSync(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(1680473052), b });
    }
    
    public void incrementalVacuum(final int i) {
        mn.t(this, -1532822529, new Object[] { mn.j(1949563867), i });
    }
    
    public void setJournalMode(final JournalMode journalMode) {
        mn.t(this, 2090925111, new Object[] { mn.j(1036581850), mn.t(journalMode, -2105083255, null) });
    }
    
    public void setJounalSizeLimit(final int i) {
        mn.t(this, -1532822529, new Object[] { mn.j(-1572209711), i });
    }
    
    public void useLegacyFileFormat(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(300940240), b });
    }
    
    public void setLockingMode(final LockingMode lockingMode) {
        mn.t(this, 2090925111, new Object[] { mn.j(518978511), mn.t(lockingMode, 2069101518, null) });
    }
    
    public void setPageSize(final int i) {
        mn.t(this, -1532822529, new Object[] { mn.j(1552022485), i });
    }
    
    public void setMaxPageCount(final int i) {
        mn.t(this, -1532822529, new Object[] { mn.j(-1636369452), i });
    }
    
    public void setReadUncommited(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(-909247533), b });
    }
    
    public void enableRecursiveTriggers(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(1276771282), b });
    }
    
    public void enableReverseUnorderedSelects(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(-1035404311), b });
    }
    
    public void enableShortColumnNames(final boolean b) {
        mn.t(this, 1814363147, new Object[] { mn.j(694156200), b });
    }
    
    public void setSynchronous(final SynchronousMode synchronousMode) {
        mn.t(this, 2090925111, new Object[] { mn.j(1740831655), mn.t(synchronousMode, 623639462, null) });
    }
    
    public void setHexKeyMode(final HexKeyMode hexKeyMode) {
        mn.t(this, 2090925111, new Object[] { mn.j(1376779305), mn.t(hexKeyMode, -1494615060, null) });
    }
    
    public void setTempStore(final TempStore tempStore) {
        mn.t(this, 2090925111, new Object[] { mn.j(1853881261), mn.t(tempStore, 1489238648, null) });
    }
    
    public void setTempStoreDirectory(final String s) {
        mn.t(this, 2090925111, new Object[] { mn.j(-379585620), mn.W(1560738420, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u17f0\u7fe3\u8bcd\uc884"), { s } }) });
    }
    
    public void setUserVersion(final int i) {
        mn.t(this, -1532822529, new Object[] { mn.j(-1385170005), i });
    }
    
    public void setApplicationId(final int i) {
        mn.t(this, -1532822529, new Object[] { mn.j(379255722), i });
    }
    
    public void setTransactionMode(final TransactionMode transactionMode) {
        mn.t(mn.J(this, -78644202), -1099891807, new Object[] { transactionMode });
    }
    
    public void setTransactionMode(final String s) {
        mn.t(this, -1542325345, new Object[] { mn.W(2620320, new Object[] { s }) });
    }
    
    public TransactionMode getTransactionMode() {
        return (TransactionMode)mn.t(mn.J(this, -78644202), 1048902705, null);
    }
    
    public void setDatePrecision(final String s) throws SQLException {
        mn.t(mn.J(this, -78644202), -912655451, new Object[] { mn.W(-147260514, new Object[] { s }) });
    }
    
    public void setDateClass(final String s) {
        mn.t(mn.J(this, -78644202), -1529414749, new Object[] { mn.W(-1785005148, new Object[] { s }) });
    }
    
    public void setDateStringFormat(final String s) {
        mn.t(mn.J(this, -78644202), -490603614, new Object[] { s });
    }
    
    public void setBusyTimeout(final int i) {
        mn.t(this, 2090925111, new Object[] { mn.j(-1170736103), mn.W(1828584502, new Object[] { i }) });
    }
    
    public int getBusyTimeout() {
        return (int)mn.J(this, -777585640);
    }
    
    static /* synthetic */ String[] access$000() {
        return (String[])mn.j(126286841);
    }
    
    static /* synthetic */ String[] access$100(final PragmaValue[] array) {
        return (String[])mn.W(781908984, new Object[] { array });
    }
    
    static {
        DEFAULT_DATE_STRING_FORMAT = Function$SQLiteConnection.c("\uc9fc\ue46b\u9cea\u4023\uebb5\ud65a\ufa86\ua519\u498d\u2d65\uc0da\u2033\ue9e2\u1ced\u0b72\u66cd\u79cc\ua563\u0437\u3bb5\u09d9\ue212\uec47");
        mn.z(126286841, new String[] { Function$SQLiteConnection.c("\uc9f1\ue460\u9ce6\u403f"), Function$SQLiteConnection.c("\uc9e3\ue473\u9cff\u4029\uebfd") });
        mn.z(-1906574346, mn.k(1874656247, null));
        final Object[] array = (Object[])mn.W(-1195705327, null);
        for (int length = array.length, i = 0; i < length; ++i) {
            (boolean)mn.t(mn.j(-1906574346), 1828060157, new Object[] { mn.J(array[i], -209191860) });
        }
    }
    
    public enum Pragma
    {
        OPEN_MODE(Function$ProgressHandler.Y("\ue914\u455b\ub5b3\u9c1e\u763d\u3034\ube94\u348d\ubd83"), Function$ProgressHandler.Y("\ue93f\u454a\ub5a2\u9c11\u7600\u3038\ube88\u348c\ubdc6\u0869\u986a\ub568\u0b03\u0f64\u5d69\uac03\u2108\u7456\u8e9f\u4a0a\u946c\u4452\u4087"), (String[])null), 
        SHARED_CACHE(Function$ProgressHandler.Y("\ue908\u4543\ub5b7\u9c02\u7607\u303d\ubea4\u348a\ubd87\u0865\u9872\ub568"), Function$ProgressHandler.Y("\ue93e\u4545\ub5b7\u9c12\u760e\u303c\ubedb\u34ba\ubdb7\u084a\u9873\ub579\u0b08\u0f69\u5d57\uac04\u210d\u7441\u8eda\u4a08\u942d\u4470\u4081\u431b\u9ae5\u2bc0\u0704\ua085\ucb1c\uda56\u1926\uf679\ub1c5\u63c1\u6585\u926a\u00f6\u8da9\u5da4\ubffa\ub154\u97fc\u49d7\u7999\u5b02\u155d\u7b0d\u0ad9\ud0ae\udb0f\u494c"), SQLiteConfig.access$000()), 
        LOAD_EXTENSION(Function$ProgressHandler.Y("\ue91e\u4545\ub5b7\u9c12\u760e\u303c\ubea4\u3485\ubd89\u0867\u987e\ub552\u0b08\u0f31\u5d70\uac09\u2102\u7440\u8ed6\u4a03\u946e"), Function$ProgressHandler.Y("\ue93e\u4545\ub5b7\u9c12\u760e\u303c\ubedb\u34ba\ubdb7\u084a\u9873\ub579\u0b08\u0f69\u5d68\uac03\u210d\u7457\u8ee0\u4a09\u9478\u4447\u4085\u4316\u9af9\u2bcc\u074b\ua086\ucb5b\uda1b\u1963\uf633\ub190\u63c1\u6587\u926a\u00f6\u8db0\u5daf\ubff6\ub110\u97e0\u49df\u799b\u5b0e\u1559\u7b48\u0a96\ud0a4\udb11\u495c\u1533\u70e4\u693f\u99d5\u9ac1\u87dc\u0290\u796b"), SQLiteConfig.access$000()), 
        CACHE_SIZE(Function$ProgressHandler.Y("\ue918\u454a\ub5b5\u9c18\u7607\u3006\ube88\u3480\ubd9c\u0863")), 
        MMAP_SIZE(Function$ProgressHandler.Y("\ue916\u4546\ub5b7\u9c00\u763d\u302a\ube92\u3493\ubd83")), 
        CASE_SENSITIVE_LIKE(Function$ProgressHandler.Y("\ue918\u454a\ub5a5\u9c15\u763d\u302a\ube9e\u3487\ubd95\u086f\u986e\ub564\u0b1b\u0f2c\u5d5b\uac00\u2105\u7458\u8eda"), SQLiteConfig.access$000()), 
        COUNT_CHANGES(Function$ProgressHandler.Y("\ue918\u4544\ub5a3\u9c1e\u7616\u3006\ube98\u3481\ubd87\u0868\u987d\ub568\u0b1e"), SQLiteConfig.access$000()), 
        DEFAULT_CACHE_SIZE(Function$ProgressHandler.Y("\ue91f\u454e\ub5b0\u9c11\u7617\u3035\ube8f\u34b6\ubd85\u0867\u9879\ub565\u0b08\u0f16\u5d77\uac05\u2116\u7456")), 
        DEFER_FOREIGN_KEYS(Function$ProgressHandler.Y("\ue91f\u454e\ub5b0\u9c15\u7610\u3006\ube9d\u3486\ubd94\u0863\u9873\ub56a\u0b03\u0f16\u5d6f\uac09\u2115\u7440"), SQLiteConfig.access$000()), 
        EMPTY_RESULT_CALLBACKS(Function$ProgressHandler.Y("\ue91e\u4546\ub5a6\u9c04\u761b\u3006\ube89\u348c\ubd95\u0873\u9876\ub579\u0b32\u0f2a\u5d65\uac00\u2100\u7451\u8ede\u4a0f\u946b"), SQLiteConfig.access$000()), 
        ENCODING(Function$ProgressHandler.Y("\ue91e\u4545\ub5b5\u9c1f\u7606\u3030\ube95\u348e"), SQLiteConfig.access$100(Encoding.values())), 
        FOREIGN_KEYS(Function$ProgressHandler.Y("\ue91d\u4544\ub5a4\u9c15\u760b\u303e\ube95\u34b6\ubd8d\u0863\u9863\ub57e"), SQLiteConfig.access$000()), 
        FULL_COLUMN_NAMES(Function$ProgressHandler.Y("\ue91d\u455e\ub5ba\u9c1c\u763d\u303a\ube94\u3485\ubd93\u086b\u9874\ub552\u0b03\u0f28\u5d69\uac09\u211f"), SQLiteConfig.access$000()), 
        FULL_SYNC(Function$ProgressHandler.Y("\ue91d\u455e\ub5ba\u9c1c\u7611\u3020\ube95\u348a"), SQLiteConfig.access$000()), 
        INCREMENTAL_VACUUM(Function$ProgressHandler.Y("\ue912\u4545\ub5b5\u9c02\u7607\u3034\ube9e\u3487\ubd92\u0867\u9876\ub552\u0b1b\u0f28\u5d67\uac19\u2119\u745e")), 
        JOURNAL_MODE(Function$ProgressHandler.Y("\ue911\u4544\ub5a3\u9c02\u760c\u3038\ube97\u34b6\ubd8b\u0869\u987e\ub568"), SQLiteConfig.access$100(JournalMode.values())), 
        JOURNAL_SIZE_LIMIT(Function$ProgressHandler.Y("\ue911\u4544\ub5a3\u9c02\u760c\u3038\ube97\u34b6\ubd95\u086f\u9860\ub568\u0b32\u0f25\u5d6d\uac01\u2105\u7447")), 
        LEGACY_FILE_FORMAT(Function$ProgressHandler.Y("\ue917\u454e\ub5b1\u9c11\u7601\u3020\ubea4\u348f\ubd8f\u086a\u987f\ub552\u0b0b\u0f26\u5d76\uac01\u210d\u7447"), SQLiteConfig.access$000()), 
        LOCKING_MODE(Function$ProgressHandler.Y("\ue917\u4544\ub5b5\u9c1b\u760b\u3037\ube9c\u34b6\ubd8b\u0869\u987e\ub568"), SQLiteConfig.access$100(LockingMode.values())), 
        PAGE_SIZE(Function$ProgressHandler.Y("\ue90b\u454a\ub5b1\u9c15\u763d\u302a\ube92\u3493\ubd83")), 
        MAX_PAGE_COUNT(Function$ProgressHandler.Y("\ue916\u454a\ub5ae\u9c2f\u7612\u3038\ube9c\u348c\ubdb9\u0865\u9875\ub578\u0b03\u0f3d")), 
        READ_UNCOMMITED(Function$ProgressHandler.Y("\ue909\u454e\ub5b7\u9c14\u763d\u302c\ube95\u348a\ubd89\u086b\u9877\ub564\u0b19\u0f2c\u5d60"), SQLiteConfig.access$000()), 
        RECURSIVE_TRIGGERS(Function$ProgressHandler.Y("\ue909\u454e\ub5b5\u9c05\u7610\u302a\ube92\u349f\ubd83\u0859\u986e\ub57f\u0b04\u0f2e\u5d63\uac09\u211e\u7440"), SQLiteConfig.access$000()), 
        REVERSE_UNORDERED_SELECTS(Function$ProgressHandler.Y("\ue909\u454e\ub5a0\u9c15\u7610\u302a\ube9e\u34b6\ubd93\u0868\u9875\ub57f\u0b09\u0f2c\u5d76\uac09\u2108\u746c\u8ecc\u4a09\u946c\u4456\u4083\u430c\u9afe"), SQLiteConfig.access$000()), 
        SECURE_DELETE(Function$ProgressHandler.Y("\ue908\u454e\ub5b5\u9c05\u7610\u303c\ubea4\u348d\ubd83\u086a\u987f\ub579\u0b08"), new String[] { Function$ProgressHandler.Y("\ue90f\u4559\ub5a3\u9c15"), Function$ProgressHandler.Y("\ue91d\u454a\ub5ba\u9c03\u7607"), Function$ProgressHandler.Y("\ue91d\u454a\ub5a5\u9c04") }), 
        SHORT_COLUMN_NAMES(Function$ProgressHandler.Y("\ue908\u4543\ub5b9\u9c02\u7616\u3006\ube98\u3486\ubd8a\u0873\u9877\ub563\u0b32\u0f27\u5d65\uac01\u2109\u7440"), SQLiteConfig.access$000()), 
        SYNCHRONOUS(Function$ProgressHandler.Y("\ue908\u4552\ub5b8\u9c13\u760a\u302b\ube94\u3487\ubd89\u0873\u9869"), SQLiteConfig.access$100(SynchronousMode.values())), 
        TEMP_STORE(Function$ProgressHandler.Y("\ue90f\u454e\ub5bb\u9c00\u763d\u302a\ube8f\u3486\ubd94\u0863"), SQLiteConfig.access$100(TempStore.values())), 
        TEMP_STORE_DIRECTORY(Function$ProgressHandler.Y("\ue90f\u454e\ub5bb\u9c00\u763d\u302a\ube8f\u3486\ubd94\u0863\u9845\ub569\u0b04\u0f3b\u5d61\uac0f\u2118\u745c\u8ecd\u4a15")), 
        USER_VERSION(Function$ProgressHandler.Y("\ue90e\u4558\ub5b3\u9c02\u763d\u302f\ube9e\u349b\ubd95\u086f\u9875\ub563")), 
        APPLICATION_ID(Function$ProgressHandler.Y("\ue91a\u455b\ub5a6\u9c1c\u760b\u303a\ube9a\u349d\ubd8f\u0869\u9874\ub552\u0b04\u0f2d")), 
        TRANSACTION_MODE(Function$ProgressHandler.Y("\ue90f\u4559\ub5b7\u9c1e\u7611\u3038\ube98\u349d\ubd8f\u0869\u9874\ub552\u0b00\u0f26\u5d60\uac09"), SQLiteConfig.access$100(TransactionMode.values())), 
        DATE_PRECISION(Function$ProgressHandler.Y("\ue91f\u454a\ub5a2\u9c15\u763d\u3029\ube89\u348c\ubd85\u086f\u9869\ub564\u0b02\u0f27"), Function$ProgressHandler.Y("\ue959\u4558\ub5b3\u9c13\u760d\u3037\ube9f\u349a\ubdc4\u083c\u983a\ub55f\u0b08\u0f28\u5d60\uac4c\u210d\u745d\u8edb\u4a4c\u9473\u4447\u408f\u430a\u9ae8\u2b85\u074d\ua086\ucb07\uda57\u1924\uf630\ub197\u638f\u6580\u927f\u00eb\u8dba\u5db2\ubffa\ub151\u97fd\u499e\u799c\u5b02\u154c\u7b42\u0ad8\ud0a4\udb10\u4915\u1523\u70f3\u6922\u9998\u9a8e\u87c6\u0294\u7977\u823f\uac71\u1b71\uf5e7\u9e88\u6f7c\u1339\uc953\uf2c0\ud01e\ub76d\u57a6\uf741\u8b46\u2874\u4c9d\u24c1\u1ed8\uf8bb\u3b00\ud964\ud415\u9ba9\ucfbb\ua538\u9dad\u2e22\u3e9c\ucd24\u623b\u2c69\ubeec\u88dd\u195f\ubf66\u3c1a\ue8db\u97cd\u6a8f\u4870\u6647\uc0eb\u0c52\ud556\ua568\uba90\u1f32\u7ae3\u8733\ud4bb\u6ead\ub12a\ucfaf\u2716\u9b38\u2993\u212b\u08a3\uae75\ua29a\u86b5\uf5bd\ub151\u3a0b\u9118\u427c\ua029\u1f57\u181d\u35f0\u7024\ue234\u6d3a\u4642\ua615\ua631\uc099\uec29\u95fa\u239e\u9526\u3e05\u174a\udb03\u7730\ue3a6\u3934\u933e\u2a7a\u28af\ucabe\ua2ad\u28d7\u4100\ube3e\u154e\ucf18\u4093\u306e\ueb9e\u9773\u71e6\u50ee\u2c68\u3c67\u1ddc\ub829\u6c0e\ud25e\u596f\ua075\u6845\u483d\u00da\ud6af\u0cfb\uec4f\u7e67\u11fd\ufc59\u00c8\u4dfd\u19ce\u9d43\u02ce\ud5e3\u8fd9\u9bc2\u3b5a\u6e94\uad55\u6a10\u667c\u3291\u0e15\u8673\ue419\ua069"), SQLiteConfig.access$100(DatePrecision.values())), 
        DATE_CLASS(Function$ProgressHandler.Y("\ue91f\u454a\ub5a2\u9c15\u763d\u303a\ube97\u3488\ubd95\u0875"), Function$ProgressHandler.Y("\ue959\u4542\ub5b8\u9c04\u7607\u303e\ube9e\u349b\ubdc4\u083c\u983a\ub525\u0b29\u0f2c\u5d62\uac0d\u2119\u745f\u8ecb\u4a45\u9420\u4440\u4094\u4317\u9aff\u2bc0\u0704\ua08c\ucb12\uda46\u1926\uf626\ub1c5\u63ce\u6597\u923e\u00f1\u8daa\u5dac\ubfb8\ub155\u97fc\u499e\u7980\u5b01\u150f\u7b5e\u0ad3\ud0a3\udb0c\u495b\u1521\u70f2\u696d\u999a\u9adc\u8792\u0291\u797b\u8273\uac48\u1b76\uf5fd\u9e95\u6f3f\u1313\uc94d\uf2cb\ud00e\ub725\u57e0\uf71b\u8b7a\u2848\u4cf1\u24dc\u1ec4\uf8bb\u3b00\ud942\ud40f\u9ba1\ucfad\ua57c\u9d89\u2e20\u3e97\ucd6e\u627d\u2c69\ubeec\u88c4\u1953\ubf72\u3c02\ue890\u9784\u6aca\u4860\u665c\uc0ea\u0c44\ud540\ua56a\ubace\u1f73\u7abf\u8712\ud48d\u6ecb\ub10a\ucf89\u277a\u9b0d\u299a\u2178\u0885\uae62\ua292\u86bf\uf5fa\ub110\u3a0a\u911a\u427c\ua02e\u1f46\u180a\u35f6\u704b\ue236\u6d21\u4649\ua600\ua638\uc0dc\uec76\u95a8\u23cd\u9536\u3e0b\u174c\udb03\u7763\ue3e2\u3934\u9339\u2a3f\u28b1\ucaf7\ua2a0\u28c8\u4149\ube07\u155e\ucf17\u4095\u3061\ueb94\u9720\u7182\u50e9\u2c6e\u3c6d\u1dc2"), SQLiteConfig.access$100(DateClass.values())), 
        DATE_STRING_FORMAT(Function$ProgressHandler.Y("\ue91f\u454a\ub5a2\u9c15\u763d\u302a\ube8f\u349b\ubd8f\u0868\u987d\ub552\u0b0b\u0f26\u5d76\uac01\u210d\u7447"), Function$ProgressHandler.Y("\ue93d\u4544\ub5a4\u9c1d\u7603\u302d\ubedb\u349d\ubd89\u0826\u9869\ub579\u0b02\u0f3b\u5d61\uac4c\u210d\u745d\u8edb\u4a4c\u9472\u4456\u4094\u430a\u9ae4\u2bc0\u0752\ua08d\ucb53\uda56\u1922\uf621\ub180\u63dc\u65c4\u926d\u00eb\u8db0\u5db3\ubfbf\ub154\u97ae\u49df\u799c\u5b47\u155b\u7b48\u0ace\ud0b4\udb4d\u4915\u1501\u70e4\u692b\u9994\u9adb\u87de\u0288\u7961\u823f\uac50\u1b70\uf5ae\u9ed2\u6f25\u1305\uc95a\uf2d6\ud050\ub748\u57cb\uf744\u8b71\u2841\u4cf1\u24e0\u1ee4\uf8e4\u3b4d\ud97a\ud45b\u9bbb\ucfa6\ua572\u9d9f\u2e03\u3eab\ucd2f"), (String[])null), 
        BUSY_TIMEOUT(Function$ProgressHandler.Y("\ue919\u455e\ub5a5\u9c09\u763d\u302d\ube92\u3484\ubd83\u0869\u986f\ub579"), (String[])null), 
        HEXKEY_MODE(Function$ProgressHandler.Y("\ue913\u454e\ub5ae\u9c1b\u7607\u3020\ubea4\u3484\ubd89\u0862\u987f"), SQLiteConfig.access$100(HexKeyMode.values())), 
        PASSWORD(Function$ProgressHandler.Y("\ue90b\u454a\ub5a5\u9c03\u7615\u3036\ube89\u348d"), (String[])null);
        
        public final String pragmaName;
        public final String[] choices;
        public final String description;
        
        private Pragma(final String s2) {
            this(s2, null);
        }
        
        private Pragma(final String s2, final String[] array) {
            this(s2, null, array);
        }
        
        private Pragma(final String s, final String s2, final String[] array) {
            mn.L(this, -209191860, s);
            mn.L(this, -1081476089, s2);
            mn.L(this, 318897225, array);
        }
        
        public final String getPragmaName() {
            return (String)mn.J(this, -209191860);
        }
    }
    
    public enum Encoding implements PragmaValue
    {
        UTF8(Function$SQLiteConnection.c("\u2f8b\uec68\u5828\u24ed\uf5e2\uf22e\u9371")), 
        UTF16(Function$SQLiteConnection.c("\u2f8b\uec68\u5828\u24ed\uf5e2\uf227\u9360\u2b95")), 
        UTF16_LITTLE_ENDIAN(Function$SQLiteConnection.c("\u2f8b\uec68\u5828\u24ed\uf5e2\uf227\u9360\u2bde\ua44b\u6141")), 
        UTF16_BIG_ENDIAN(Function$SQLiteConnection.c("\u2f8b\uec68\u5828\u24ed\uf5e2\uf227\u9360\u2bd0\ua44b\u6141")), 
        UTF_8(Encoding.UTF8), 
        UTF_16(Encoding.UTF16), 
        UTF_16LE(Encoding.UTF16_LITTLE_ENDIAN), 
        UTF_16BE(Encoding.UTF16_BIG_ENDIAN);
        
        public final String typeName;
        
        private Encoding(final String s) {
            mn.L(this, -1317798953, s);
        }
        
        private Encoding(final Encoding encoding) {
            mn.L(this, -1317798953, mn.t(encoding, 88079162, null));
        }
        
        public String getValue() {
            return (String)mn.J(this, -1317798953);
        }
        
        public static Encoding getEncoding(final String s) {
            return (Encoding)mn.W(471792433, new Object[] { mn.t(mn.t(s, 822737726, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\ud9d4"), SQLiteDataSource$SQLiteDataSource.G("\ud9a6") }), 1957034808, null) });
        }
    }
    
    public enum JournalMode implements PragmaValue
    {
        DELETE, 
        TRUNCATE, 
        PERSIST, 
        MEMORY, 
        WAL, 
        OFF;
        
        public String getValue() {
            return (String)mn.t(this, -2105083255, null);
        }
    }
    
    public enum LockingMode implements PragmaValue
    {
        NORMAL, 
        EXCLUSIVE;
        
        public String getValue() {
            return (String)mn.t(this, 2069101518, null);
        }
    }
    
    public enum SynchronousMode implements PragmaValue
    {
        OFF, 
        NORMAL, 
        FULL;
        
        public String getValue() {
            return (String)mn.t(this, 623639462, null);
        }
    }
    
    public enum TempStore implements PragmaValue
    {
        DEFAULT, 
        FILE, 
        MEMORY;
        
        public String getValue() {
            return (String)mn.t(this, 1489238648, null);
        }
    }
    
    public enum HexKeyMode implements PragmaValue
    {
        NONE, 
        SSE, 
        SQLCIPHER;
        
        public String getValue() {
            return (String)mn.t(this, -1494615060, null);
        }
    }
    
    public enum TransactionMode implements PragmaValue
    {
        @Deprecated
        DEFFERED, 
        DEFERRED, 
        IMMEDIATE, 
        EXCLUSIVE;
        
        public String getValue() {
            return (String)mn.t(this, -1951335664, null);
        }
        
        public static TransactionMode getMode(final String s) {
            if (mn.t(SQLiteDataSource$SQLiteDataSource.G("\u0fa5\uc900\u0394\u8327\u7d18\u5aef\u8dfd\u8c39"), -1309148181, new Object[] { s })) {
                return (TransactionMode)mn.j(468974353);
            }
            return (TransactionMode)mn.W(-1913586996, new Object[] { mn.t(s, 1957034808, null) });
        }
    }
    
    public enum DatePrecision implements PragmaValue
    {
        SECONDS, 
        MILLISECONDS;
        
        public String getValue() {
            return (String)mn.t(this, 294320922, null);
        }
        
        public static DatePrecision getPrecision(final String s) {
            return (DatePrecision)mn.W(953416503, new Object[] { mn.t(s, 1957034808, null) });
        }
    }
    
    public enum DateClass implements PragmaValue
    {
        INTEGER, 
        TEXT, 
        REAL;
        
        public String getValue() {
            return (String)mn.t(this, -524158180, null);
        }
        
        public static DateClass getDateClass(final String s) {
            return (DateClass)mn.W(1719204518, new Object[] { mn.t(s, 1957034808, null) });
        }
    }
    
    private interface PragmaValue
    {
        String getValue();
    }
}
