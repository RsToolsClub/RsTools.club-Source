// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.util.Properties;
import java.util.Map;
import org.sqlite.date.FastDateFormat;

public class SQLiteConnectionConfig implements Cloneable
{
    private SQLiteConfig.DateClass dateClass;
    private SQLiteConfig.DatePrecision datePrecision;
    private String dateStringFormat;
    private FastDateFormat dateFormat;
    private int transactionIsolation;
    private SQLiteConfig.TransactionMode transactionMode;
    private boolean autoCommit;
    private static final Map<SQLiteConfig.TransactionMode, String> beginCommandMap;
    
    public static SQLiteConnectionConfig fromPragmaTable(final Properties properties) {
        return (SQLiteConnectionConfig)mn.k(1773206287, new Object[] { mn.W(-1785005148, new Object[] { mn.t(properties, -500958139, new Object[] { mn.J(mn.j(413662228), -209191860), mn.t(mn.j(-219612387), -524158180, null) }) }), mn.W(-147260514, new Object[] { mn.t(properties, -500958139, new Object[] { mn.J(mn.j(-1628177387), -209191860), mn.t(mn.j(491518747), 294320922, null) }) }), mn.t(properties, -500958139, new Object[] { mn.J(mn.j(1600125971), -209191860), Function$SQLiteConnection.c("\u0f76\ued80\ub671\u18d8\u5f3f\u26e9\ua955\u62b5\u2c70\uc4e1\u032a\u964e\uc4ff\u135b\ub9b6\u56ea\u0c90\u5f96\u84d6\u15ff\u2aa0\u10db\u3dbc") }), 8, mn.W(2620320, new Object[] { mn.t(properties, -500958139, new Object[] { mn.J(mn.j(-672859078), -209191860), mn.t(mn.j(468974353), -1951335664, null) }) }), true });
    }
    
    public SQLiteConnectionConfig(final SQLiteConfig.DateClass dateClass, final SQLiteConfig.DatePrecision datePrecision, final String s, final int i, final SQLiteConfig.TransactionMode transactionMode, final boolean b) {
        mn.L(this, -436602098, mn.j(-219612387));
        mn.L(this, 672201493, mn.j(491518747));
        mn.L(this, 498727700, Function$ProgressHandler.Y("\ud414\u1d82\u9e17\u77b0\u6ebc\ud9a4\ubff4\u64d6\uf325\uc2ad\uf85d\uaa49\u7814\u7657\uf4cd\u7c54\u8d0e\u7355\uef8c\ubd6d\uccc1\ub9c7\uc9c8"));
        mn.L(this, 654899986, mn.W(1959197459, new Object[] { mn.J(this, 498727700) }));
        mn.L(this, 1936980777, 8);
        mn.L(this, 1453914856, mn.j(468974353));
        mn.L(this, -1461388569, true);
        mn.t(this, -1529414749, new Object[] { dateClass });
        mn.t(this, -912655451, new Object[] { datePrecision });
        mn.t(this, -490603614, new Object[] { s });
        mn.t(this, -1737491560, new Object[] { i });
        mn.t(this, -1099891807, new Object[] { transactionMode });
        mn.t(this, -1658586190, new Object[] { b });
    }
    
    public SQLiteConnectionConfig copyConfig() {
        return (SQLiteConnectionConfig)mn.k(1773206287, new Object[] { mn.J(this, -436602098), mn.J(this, 672201493), mn.J(this, 498727700), (int)mn.J(this, 1936980777), mn.J(this, 1453914856), Boolean.valueOf((boolean)mn.J(this, -1461388569)) });
    }
    
    public long getDateMultiplier() {
        return (mn.J(this, 672201493) == mn.j(491518747)) ? 1L : 1000L;
    }
    
    public SQLiteConfig.DateClass getDateClass() {
        return (SQLiteConfig.DateClass)mn.J(this, -436602098);
    }
    
    public void setDateClass(final SQLiteConfig.DateClass dateClass) {
        mn.L(this, -436602098, dateClass);
    }
    
    public SQLiteConfig.DatePrecision getDatePrecision() {
        return (SQLiteConfig.DatePrecision)mn.J(this, 672201493);
    }
    
    public void setDatePrecision(final SQLiteConfig.DatePrecision datePrecision) {
        mn.L(this, 672201493, datePrecision);
    }
    
    public String getDateStringFormat() {
        return (String)mn.J(this, 498727700);
    }
    
    public void setDateStringFormat(final String s) {
        mn.L(this, 498727700, s);
        mn.L(this, 654899986, mn.W(1959197459, new Object[] { s }));
    }
    
    public FastDateFormat getDateFormat() {
        return (FastDateFormat)mn.J(this, 654899986);
    }
    
    public boolean isAutoCommit() {
        return (boolean)mn.J(this, -1461388569);
    }
    
    public void setAutoCommit(final boolean b) {
        mn.L(this, -1461388569, b);
    }
    
    public int getTransactionIsolation() {
        return (int)mn.J(this, 1936980777);
    }
    
    public void setTransactionIsolation(final int i) {
        mn.L(this, 1936980777, i);
    }
    
    public SQLiteConfig.TransactionMode getTransactionMode() {
        return (SQLiteConfig.TransactionMode)mn.J(this, 1453914856);
    }
    
    public void setTransactionMode(SQLiteConfig.TransactionMode j) {
        if (j == mn.j(1728248550)) {
            j = (SQLiteConfig.TransactionMode)mn.j(468974353);
        }
        mn.L(this, 1453914856, j);
    }
    
    String transactionPrefix() {
        return (String)mn.t(mn.j(1880488685), -1524040980, new Object[] { mn.J(this, 1453914856) });
    }
    
    static {
        mn.z(1880488685, mn.k(-492700949, new Object[] { SQLiteConfig.TransactionMode.class }));
        mn.t(mn.j(1880488685), 987626218, new Object[] { mn.j(468974353), Function$ProgressHandler.Y("\ubcaf\u0007\u4cda\uc026\ua210\udfb4") });
        mn.t(mn.j(1880488685), 987626218, new Object[] { mn.j(1718287073), Function$ProgressHandler.Y("\ubcaf\u0007\u4cda\uc026\ua210\udfaf\ufa8d\u2717\u4fcd\ucffb\u11d6\u968e\ud44e\u13a4\u4278\u50d6") });
        mn.t(mn.j(1880488685), 987626218, new Object[] { mn.j(1275394784), Function$ProgressHandler.Y("\ubcaf\u0007\u4cda\uc026\ua210\udfaf\ufa81\u2702\u4fc3\ucff2\u11c7\u9694\ud446\u13a6\u4278\u50d6") });
    }
}
