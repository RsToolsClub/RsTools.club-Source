// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.date;

import java.text.ParsePosition;
import java.text.ParseException;
import java.util.Calendar;
import java.text.FieldPosition;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.text.Format;

public class FastDateFormat extends Format implements DateParser, DatePrinter
{
    private static final long serialVersionUID = 2L;
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final FormatCache<FastDateFormat> cache;
    private final FastDatePrinter printer;
    private final FastDateParser parser;
    
    public static FastDateFormat getInstance() {
        return (FastDateFormat)b.W(b.O(1961154020), 1046664677, null);
    }
    
    public static FastDateFormat getInstance(final String s) {
        return (FastDateFormat)b.W(b.O(1961154020), 374330873, new Object[] { s, null, null });
    }
    
    public static FastDateFormat getInstance(final String s, final TimeZone timeZone) {
        return (FastDateFormat)b.W(b.O(1961154020), 374330873, new Object[] { s, timeZone, null });
    }
    
    public static FastDateFormat getInstance(final String s, final Locale locale) {
        return (FastDateFormat)b.W(b.O(1961154020), 374330873, new Object[] { s, null, locale });
    }
    
    public static FastDateFormat getInstance(final String s, final TimeZone timeZone, final Locale locale) {
        return (FastDateFormat)b.W(b.O(1961154020), 374330873, new Object[] { s, timeZone, locale });
    }
    
    public static FastDateFormat getDateInstance(final int i) {
        return (FastDateFormat)b.W(b.O(1961154020), -998386206, new Object[] { i, null, null });
    }
    
    public static FastDateFormat getDateInstance(final int i, final Locale locale) {
        return (FastDateFormat)b.W(b.O(1961154020), -998386206, new Object[] { i, null, locale });
    }
    
    public static FastDateFormat getDateInstance(final int i, final TimeZone timeZone) {
        return (FastDateFormat)b.W(b.O(1961154020), -998386206, new Object[] { i, timeZone, null });
    }
    
    public static FastDateFormat getDateInstance(final int i, final TimeZone timeZone, final Locale locale) {
        return (FastDateFormat)b.W(b.O(1961154020), -998386206, new Object[] { i, timeZone, locale });
    }
    
    public static FastDateFormat getTimeInstance(final int i) {
        return (FastDateFormat)b.W(b.O(1961154020), 1276630499, new Object[] { i, null, null });
    }
    
    public static FastDateFormat getTimeInstance(final int i, final Locale locale) {
        return (FastDateFormat)b.W(b.O(1961154020), 1276630499, new Object[] { i, null, locale });
    }
    
    public static FastDateFormat getTimeInstance(final int i, final TimeZone timeZone) {
        return (FastDateFormat)b.W(b.O(1961154020), 1276630499, new Object[] { i, timeZone, null });
    }
    
    public static FastDateFormat getTimeInstance(final int i, final TimeZone timeZone, final Locale locale) {
        return (FastDateFormat)b.W(b.O(1961154020), 1276630499, new Object[] { i, timeZone, locale });
    }
    
    public static FastDateFormat getDateTimeInstance(final int i, final int j) {
        return (FastDateFormat)b.W(b.O(1961154020), 708367790, new Object[] { i, j, null, null });
    }
    
    public static FastDateFormat getDateTimeInstance(final int i, final int j, final Locale locale) {
        return (FastDateFormat)b.W(b.O(1961154020), 708367790, new Object[] { i, j, null, locale });
    }
    
    public static FastDateFormat getDateTimeInstance(final int i, final int j, final TimeZone timeZone) {
        return (FastDateFormat)b.q(-1144531488, new Object[] { i, j, timeZone, null });
    }
    
    public static FastDateFormat getDateTimeInstance(final int i, final int j, final TimeZone timeZone, final Locale locale) {
        return (FastDateFormat)b.W(b.O(1961154020), 708367790, new Object[] { i, j, timeZone, locale });
    }
    
    protected FastDateFormat(final String s, final TimeZone timeZone, final Locale locale) {
        this(s, timeZone, locale, null);
    }
    
    protected FastDateFormat(final String s, final TimeZone timeZone, final Locale locale, final Date date) {
        b.W(this, -449784338, b.b(-1279273487, new Object[] { s, timeZone, locale }));
        b.W(this, 1315100140, b.b(1962005999, new Object[] { s, timeZone, locale, date }));
    }
    
    @Override
    public StringBuffer format(final Object o, final StringBuffer sb, final FieldPosition fieldPosition) {
        return (StringBuffer)b.W(b.F(this, -449784338), -2086873619, new Object[] { o, sb, fieldPosition });
    }
    
    public String format(final long l) {
        return (String)b.W(b.F(this, -449784338), -449587734, new Object[] { l });
    }
    
    public String format(final Date date) {
        return (String)b.W(b.F(this, -449784338), -1082665493, new Object[] { date });
    }
    
    public String format(final Calendar calendar) {
        return (String)b.W(b.F(this, -449784338), -1734158872, new Object[] { calendar });
    }
    
    public StringBuffer format(final long l, final StringBuffer sb) {
        return (StringBuffer)b.W(b.F(this, -449784338), -423766215, new Object[] { l, sb });
    }
    
    public StringBuffer format(final Date date, final StringBuffer sb) {
        return (StringBuffer)b.W(b.F(this, -449784338), -1257121994, new Object[] { date, sb });
    }
    
    public StringBuffer format(final Calendar calendar, final StringBuffer sb) {
        return (StringBuffer)b.W(b.F(this, -449784338), -1117989065, new Object[] { calendar, sb });
    }
    
    public Date parse(final String s) throws ParseException {
        return (Date)b.W(b.F(this, 1315100140), 1783945012, new Object[] { s });
    }
    
    public Date parse(final String s, final ParsePosition parsePosition) {
        return (Date)b.W(b.F(this, 1315100140), -781658315, new Object[] { s, parsePosition });
    }
    
    @Override
    public Object parseObject(final String s, final ParsePosition parsePosition) {
        return b.W(b.F(this, 1315100140), -418982094, new Object[] { s, parsePosition });
    }
    
    public String getPattern() {
        return (String)b.W(b.F(this, -449784338), 193517363, null);
    }
    
    public TimeZone getTimeZone() {
        return (TimeZone)b.W(b.F(this, -449784338), -406137040, null);
    }
    
    public Locale getLocale() {
        return (Locale)b.W(b.F(this, -449784338), 1660409665, null);
    }
    
    public int getMaxLengthEstimate() {
        return (int)b.W(b.F(this, -449784338), 78894910, null);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof FastDateFormat && (boolean)b.W(b.F(this, -449784338), 2141378367, new Object[] { b.F(o, -449784338) });
    }
    
    @Override
    public int hashCode() {
        return (int)b.W(b.F(this, -449784338), 831051580, null);
    }
    
    @Override
    public String toString() {
        return (String)b.W(b.W(b.W(b.W(b.W(b.W(b.W(b.W(b.b(-793717247, null), -171256418, new Object[] { FormatCache$0.Z("\ud123\u1274\u0149\u7e94\ubbfd\u13fe\u5ea0\u457f\uf32a\u4d20\uaa5b\u242c\u7d98\u31db\ua091") }), -171256418, new Object[] { b.W(b.F(this, -449784338), 193517363, null) }), -171256418, new Object[] { FormatCache$0.Z("\ud149") }), 1727190526, new Object[] { b.W(b.F(this, -449784338), 1660409665, null) }), -171256418, new Object[] { FormatCache$0.Z("\ud149") }), -171256418, new Object[] { b.W(b.W(b.F(this, -449784338), -406137040, null), 1105778493, null) }), -171256418, new Object[] { FormatCache$0.Z("\ud138") }), 1279448486, null);
    }
    
    protected StringBuffer applyRules(final Calendar calendar, final StringBuffer sb) {
        return (StringBuffer)b.W(b.F(this, -449784338), 1507448634, new Object[] { calendar, sb });
    }
    
    static {
        b.L(1961154020, b.b(61527867, null));
    }
}
