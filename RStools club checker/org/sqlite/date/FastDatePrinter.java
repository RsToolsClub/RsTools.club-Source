// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.date;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;
import java.text.FieldPosition;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.Locale;
import java.util.TimeZone;
import java.io.Serializable;

public class FastDatePrinter implements DatePrinter, Serializable
{
    private static final long serialVersionUID = 1L;
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private final String mPattern;
    private final TimeZone mTimeZone;
    private final Locale mLocale;
    private transient Rule[] mRules;
    private transient int mMaxLengthEstimate;
    private static final ConcurrentMap<TimeZoneDisplayKey, String> cTimeZoneDisplayCache;
    
    protected FastDatePrinter(final String s, final TimeZone timeZone, final Locale locale) {
        b.W(this, -2022582472, s);
        b.W(this, 759945033, timeZone);
        b.W(this, -1982998714, locale);
        b.W(this, -126691513, null);
    }
    
    private void init() {
        final Object w = b.W(this, -2083530940, null);
        b.W(this, 1831851843, b.W(w, -1776036030, new Object[] { new Rule[(int)b.W(w, -296102075, null)] }));
        int i = 0;
        int length = ((Object[])b.F(this, 1831851843)).length;
        while (--length >= 0) {
            i += (int)b.W(((Object[])b.F(this, 1831851843))[length], -1845897408, null);
        }
        b.W(this, -897722927, i);
    }
    
    protected List<Rule> parsePattern() {
        final Object b = org.sqlite.date.b.b(199873998, new Object[] { org.sqlite.date.b.F(this, -1982998714) });
        final Object b2 = org.sqlite.date.b.b(656987599, null);
        final Object[] array = (Object[])org.sqlite.date.b.W(b, -1297492532, null);
        final Object[] array2 = (Object[])org.sqlite.date.b.W(b, -1330194995, null);
        final Object[] array3 = (Object[])org.sqlite.date.b.W(b, -350628406, null);
        final Object[] array4 = (Object[])org.sqlite.date.b.W(b, -1346972213, null);
        final Object[] array5 = (Object[])org.sqlite.date.b.W(b, -1577199800, null);
        final Object[] array6 = (Object[])org.sqlite.date.b.W(b, 251647769, null);
        final int intValue = (int)org.sqlite.date.b.W(org.sqlite.date.b.F(this, -2022582472), 387569088, null);
        final int[] array7 = { 0 };
        for (int i = 0; i < intValue; ++i) {
            array7[0] = i;
            final Object w = org.sqlite.date.b.W(this, -1223436522, new Object[] { org.sqlite.date.b.F(this, -2022582472), array7 });
            i = array7[0];
            final int intValue2 = (int)org.sqlite.date.b.W(w, 387569088, null);
            if (intValue2 == 0) {
                break;
            }
            Object o = null;
            switch ((char)org.sqlite.date.b.W(w, 1169085918, new Object[] { 0 })) {
                case 'G': {
                    o = org.sqlite.date.b.b(-2020878569, new Object[] { 0, array });
                    break;
                }
                case 'y': {
                    if (intValue2 == 2) {
                        o = org.sqlite.date.b.O(1863112468);
                        break;
                    }
                    o = org.sqlite.date.b.W(this, -1255614699, new Object[] { 1, (intValue2 < 4) ? 4 : intValue2 });
                    break;
                }
                case 'M': {
                    if (intValue2 >= 4) {
                        o = org.sqlite.date.b.b(-2020878569, new Object[] { 2, array2 });
                        break;
                    }
                    if (intValue2 == 3) {
                        o = org.sqlite.date.b.b(-2020878569, new Object[] { 2, array3 });
                        break;
                    }
                    if (intValue2 == 2) {
                        o = org.sqlite.date.b.O(-128788718);
                        break;
                    }
                    o = org.sqlite.date.b.O(22468371);
                    break;
                }
                case 'd': {
                    o = org.sqlite.date.b.W(this, -1255614699, new Object[] { 5, intValue2 });
                    break;
                }
                case 'h': {
                    o = org.sqlite.date.b.b(1739642640, new Object[] { org.sqlite.date.b.W(this, -1255614699, new Object[] { 10, intValue2 }) });
                    break;
                }
                case 'H': {
                    o = org.sqlite.date.b.W(this, -1255614699, new Object[] { 11, intValue2 });
                    break;
                }
                case 'm': {
                    o = org.sqlite.date.b.W(this, -1255614699, new Object[] { 12, intValue2 });
                    break;
                }
                case 's': {
                    o = org.sqlite.date.b.W(this, -1255614699, new Object[] { 13, intValue2 });
                    break;
                }
                case 'S': {
                    o = org.sqlite.date.b.W(this, -1255614699, new Object[] { 14, intValue2 });
                    break;
                }
                case 'E': {
                    o = org.sqlite.date.b.b(-2020878569, new Object[] { 7, (intValue2 < 4) ? array5 : array4 });
                    break;
                }
                case 'D': {
                    o = org.sqlite.date.b.W(this, -1255614699, new Object[] { 6, intValue2 });
                    break;
                }
                case 'F': {
                    o = org.sqlite.date.b.W(this, -1255614699, new Object[] { 8, intValue2 });
                    break;
                }
                case 'w': {
                    o = org.sqlite.date.b.W(this, -1255614699, new Object[] { 3, intValue2 });
                    break;
                }
                case 'W': {
                    o = org.sqlite.date.b.W(this, -1255614699, new Object[] { 4, intValue2 });
                    break;
                }
                case 'a': {
                    o = org.sqlite.date.b.b(-2020878569, new Object[] { 9, array6 });
                    break;
                }
                case 'k': {
                    o = org.sqlite.date.b.b(1426708257, new Object[] { org.sqlite.date.b.W(this, -1255614699, new Object[] { 11, intValue2 }) });
                    break;
                }
                case 'K': {
                    o = org.sqlite.date.b.W(this, -1255614699, new Object[] { 10, intValue2 });
                    break;
                }
                case 'X': {
                    o = org.sqlite.date.b.q(-392571106, new Object[] { intValue2 });
                    break;
                }
                case 'z': {
                    if (intValue2 >= 4) {
                        o = org.sqlite.date.b.b(-1747134689, new Object[] { org.sqlite.date.b.F(this, 759945033), org.sqlite.date.b.F(this, -1982998714), 1 });
                        break;
                    }
                    o = org.sqlite.date.b.b(-1747134689, new Object[] { org.sqlite.date.b.F(this, 759945033), org.sqlite.date.b.F(this, -1982998714), 0 });
                    break;
                }
                case 'Z': {
                    if (intValue2 == 1) {
                        o = org.sqlite.date.b.O(-721823972);
                        break;
                    }
                    if (intValue2 == 2) {
                        o = org.sqlite.date.b.O(-57288931);
                        break;
                    }
                    o = org.sqlite.date.b.O(1918687002);
                    break;
                }
                case '\'': {
                    final Object w2 = org.sqlite.date.b.W(w, -1625172197, new Object[] { 1 });
                    if ((int)org.sqlite.date.b.W(w2, 387569088, null) == 1) {
                        o = org.sqlite.date.b.b(1791285016, new Object[] { (char)org.sqlite.date.b.W(w2, 1169085918, new Object[] { 0 }) });
                        break;
                    }
                    o = org.sqlite.date.b.b(-1493313751, new Object[] { w2 });
                    break;
                }
                default: {
                    throw (Throwable)org.sqlite.date.b.b(49337767, new Object[] { org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.b(-793717247, null), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\ucf74\u1e94\u83c7\u91ab\udcb6\u0919\u3cce\u9f00\uf30e\u5806\uca5b\udfb3\u933b\u6184\u195b\ud7e4\ua893\udf1c\u4590\u9bbb\u2638\u1379\ud6ed\u77c3\u70a1\u13e7\u70c6") }), -171256418, new Object[] { w }), 1279448486, null) });
                }
            }
            (boolean)org.sqlite.date.b.W(b2, 513660710, new Object[] { o });
        }
        return (List<Rule>)b2;
    }
    
    protected String parseToken(final String s, final int[] array) {
        final Object b = org.sqlite.date.b.b(-793717247, null);
        int i = array[0];
        final int intValue = (int)org.sqlite.date.b.W(s, 387569088, null);
        final char charValue = (char)org.sqlite.date.b.W(s, 1169085918, new Object[] { i });
        if ((charValue >= 'A' && charValue <= 'Z') || (charValue >= 'a' && charValue <= 'z')) {
            org.sqlite.date.b.W(b, 205378973, new Object[] { charValue });
            while (i + 1 < intValue && (char)org.sqlite.date.b.W(s, 1169085918, new Object[] { i + 1 }) == charValue) {
                org.sqlite.date.b.W(b, 205378973, new Object[] { charValue });
                ++i;
            }
        }
        else {
            org.sqlite.date.b.W(b, 205378973, new Object[] { '\'' });
            boolean b2 = false;
            while (i < intValue) {
                final char charValue2 = (char)org.sqlite.date.b.W(s, 1169085918, new Object[] { i });
                if (charValue2 == '\'') {
                    if (i + 1 < intValue && (char)org.sqlite.date.b.W(s, 1169085918, new Object[] { i + 1 }) == '\'') {
                        ++i;
                        org.sqlite.date.b.W(b, 205378973, new Object[] { charValue2 });
                    }
                    else {
                        b2 = !b2;
                    }
                }
                else {
                    if (!b2 && ((charValue2 >= 'A' && charValue2 <= 'Z') || (charValue2 >= 'a' && charValue2 <= 'z'))) {
                        --i;
                        break;
                    }
                    org.sqlite.date.b.W(b, 205378973, new Object[] { charValue2 });
                }
                ++i;
            }
        }
        array[0] = i;
        return (String)org.sqlite.date.b.W(b, 1279448486, null);
    }
    
    protected NumberRule selectNumberRule(final int i, final int j) {
        switch (j) {
            case 1: {
                return (NumberRule)b.b(-677652697, new Object[] { i });
            }
            case 2: {
                return (NumberRule)b.b(-2017339612, new Object[] { i });
            }
            default: {
                return (NumberRule)b.b(61921061, new Object[] { i, j });
            }
        }
    }
    
    public StringBuffer format(final Object o, final StringBuffer sb, final FieldPosition fieldPosition) {
        if (o instanceof Date) {
            return (StringBuffer)b.W(this, -1257121994, new Object[] { o, sb });
        }
        if (o instanceof Calendar) {
            return (StringBuffer)b.W(this, -1117989065, new Object[] { o, sb });
        }
        if (o instanceof Long) {
            return (StringBuffer)b.W(this, -423766215, new Object[] { (long)b.W(o, -181348574, null), sb });
        }
        throw (Throwable)b.b(49337767, new Object[] { b.W(b.W(b.W(b.b(-793717247, null), -171256418, new Object[] { FormatCache$FormatCache.U("\ufc17\u9766\udf8c\uf3f3\u970b\u13d1\u7e89\u0b3b\u349a\udc37\uc778\u018b\ua99b\u5efe\ua345") }), -171256418, new Object[] { (o == null) ? FormatCache$FormatCache.U("\ufc7e\u9766\udf92\uf3f1\u9708\u1398") : b.W(b.W(o, -956508381, null), 295556896, null) }), 1279448486, null) });
    }
    
    public String format(final long l) {
        final Object w = b.W(this, -788211919, null);
        b.W(w, -1100622034, new Object[] { l });
        return (String)b.W(this, -1146955985, new Object[] { w });
    }
    
    private String applyRulesToString(final Calendar calendar) {
        return (String)b.W(b.W(this, 1507448634, new Object[] { calendar, b.b(235394860, new Object[] { (int)b.F(this, -897722927) }) }), 1390335789, null);
    }
    
    private GregorianCalendar newCalendar() {
        return (GregorianCalendar)b.b(1724241706, new Object[] { b.F(this, 759945033), b.F(this, -1982998714) });
    }
    
    public String format(final Date date) {
        final Object w = b.W(this, -788211919, null);
        b.W(w, -1917593813, new Object[] { date });
        return (String)b.W(this, -1146955985, new Object[] { w });
    }
    
    public String format(final Calendar calendar) {
        return (String)b.W(b.W(this, -1117989065, new Object[] { calendar, b.b(235394860, new Object[] { (int)b.F(this, -897722927) }) }), 1390335789, null);
    }
    
    public StringBuffer format(final long l, final StringBuffer sb) {
        return (StringBuffer)b.W(this, -1257121994, new Object[] { b.b(-455485953, new Object[] { l }), sb });
    }
    
    public StringBuffer format(final Date date, final StringBuffer sb) {
        final Object w = b.W(this, -788211919, null);
        b.W(w, -1917593813, new Object[] { date });
        return (StringBuffer)b.W(this, 1507448634, new Object[] { w, sb });
    }
    
    public StringBuffer format(final Calendar calendar, final StringBuffer sb) {
        return (StringBuffer)b.W(this, 1507448634, new Object[] { calendar, sb });
    }
    
    protected StringBuffer applyRules(final Calendar calendar, final StringBuffer sb) {
        final Object[] array = (Object[])b.F(this, 1831851843);
        for (int length = array.length, i = 0; i < length; ++i) {
            b.W(array[i], 571332392, new Object[] { sb, calendar });
        }
        return sb;
    }
    
    public String getPattern() {
        return (String)b.F(this, -2022582472);
    }
    
    public TimeZone getTimeZone() {
        return (TimeZone)b.F(this, 759945033);
    }
    
    public Locale getLocale() {
        return (Locale)b.F(this, -1982998714);
    }
    
    public int getMaxLengthEstimate() {
        return (int)b.F(this, -897722927);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof FastDatePrinter && (boolean)b.W(b.F(this, -2022582472), -1986603143, new Object[] { b.F(o, -2022582472) }) && (boolean)b.W(b.F(this, 759945033), -1807493658, new Object[] { b.F(o, 759945033) }) && (boolean)b.W(b.F(this, -1982998714), 2110313959, new Object[] { b.F(o, -1982998714) });
    }
    
    @Override
    public int hashCode() {
        return (int)b.W(b.F(this, -2022582472), 538564470, null) + 13 * ((int)b.W(b.F(this, 759945033), -565389847, null) + 13 * (int)b.W(b.F(this, -1982998714), -2114333224, null));
    }
    
    @Override
    public String toString() {
        return (String)b.W(b.W(b.W(b.W(b.W(b.W(b.W(b.W(b.b(-793717247, null), -171256418, new Object[] { FormatCache$1.d("\ua93c\ue8b7\u49a1\u5c3a\ueb57\u2912\u042c\uc235\u7118\ud722\ub83c\u6da6\u3655\u7663\uf4d6\u2112") }), -171256418, new Object[] { b.F(this, -2022582472) }), -171256418, new Object[] { FormatCache$1.d("\ua956") }), 1727190526, new Object[] { b.F(this, -1982998714) }), -171256418, new Object[] { FormatCache$1.d("\ua956") }), -171256418, new Object[] { b.W(b.F(this, 759945033), 1105778493, null) }), -171256418, new Object[] { FormatCache$1.d("\ua927") }), 1279448486, null);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        b.W(objectInputStream, -1747462281, null);
        b.W(this, -126691513, null);
    }
    
    private static void appendDigits(final StringBuffer sb, final int n) {
        b.W(sb, 1088542580, new Object[] { (char)(n / 10 + 48) });
        b.W(sb, 1088542580, new Object[] { (char)(n % 10 + 48) });
    }
    
    static String getTimeZoneDisplay(final TimeZone timeZone, final boolean b, final int n, final Locale locale) {
        final Object b2 = b.b(-1241524363, new Object[] { timeZone, b, n, locale });
        Object o = b.W(b.O(-864692366), -1545415251, new Object[] { b2 });
        if (o == null) {
            o = b.W(timeZone, -646457485, new Object[] { b, n, locale });
            final Object w = b.W(b.O(-864692366), -303704661, new Object[] { b2, o });
            if (w != null) {
                o = w;
            }
        }
        return (String)o;
    }
    
    static {
        b.L(-864692366, b.b(1582552482, new Object[] { 7 }));
    }
    
    private static class CharacterLiteral implements Rule
    {
        private final char mValue;
        
        CharacterLiteral(final char c) {
            b.W(this, 1861603496, c);
        }
        
        public int estimateLength() {
            return 1;
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            b.W(sb, 1088542580, new Object[] { (char)b.F(this, 1861603496) });
        }
    }
    
    private static class StringLiteral implements Rule
    {
        private final String mValue;
        
        StringLiteral(final String s) {
            b.W(this, -2032806131, s);
        }
        
        public int estimateLength() {
            return (int)b.W(b.F(this, -2032806131), 387569088, null);
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            b.W(sb, -170338740, new Object[] { b.F(this, -2032806131) });
        }
    }
    
    private static class TextField implements Rule
    {
        private final int mField;
        private final String[] mValues;
        
        TextField(final int i, final String[] array) {
            b.W(this, -611854507, i);
            b.W(this, -940583086, (Object)array);
        }
        
        public int estimateLength() {
            int n = 0;
            int length = ((Object[])b.F(this, -940583086)).length;
            while (--length >= 0) {
                final int intValue = (int)b.W(((Object[])b.F(this, -940583086))[length], 387569088, null);
                if (intValue > n) {
                    n = intValue;
                }
            }
            return n;
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            b.W(sb, -170338740, new Object[] { ((Object[])b.F(this, -940583086))[(int)b.W(calendar, 784651855, new Object[] { (int)b.F(this, -611854507) })] });
        }
    }
    
    private static class UnpaddedNumberField implements NumberRule
    {
        private final int mField;
        
        UnpaddedNumberField(final int i) {
            b.W(this, 837867278, i);
        }
        
        public int estimateLength() {
            return 4;
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            b.W(this, -408299761, new Object[] { sb, (int)b.W(calendar, 784651855, new Object[] { (int)b.F(this, 837867278) }) });
        }
        
        public final void appendTo(final StringBuffer sb, final int n) {
            if (n < 10) {
                b.W(sb, 1088542580, new Object[] { (char)(n + 48) });
            }
            else if (n < 100) {
                b.q(-541927555, new Object[] { sb, n });
            }
            else {
                b.W(sb, -1306732788, new Object[] { n });
            }
        }
    }
    
    private static class UnpaddedMonthField implements NumberRule
    {
        static final UnpaddedMonthField INSTANCE;
        
        UnpaddedMonthField() {
        }
        
        public int estimateLength() {
            return 2;
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            b.W(this, 860346210, new Object[] { sb, (int)b.W(calendar, 784651855, new Object[] { 2 }) + 1 });
        }
        
        public final void appendTo(final StringBuffer sb, final int i) {
            if (i < 10) {
                b.W(sb, 1088542580, new Object[] { (char)(i + 48) });
            }
            else {
                b.q(-541927555, new Object[] { sb, i });
            }
        }
        
        static {
            b.L(22468371, b.b(-792275101, null));
        }
    }
    
    private static class PaddedNumberField implements NumberRule
    {
        private final int mField;
        private final int mSize;
        
        PaddedNumberField(final int i, final int j) {
            if (j < 3) {
                throw (Throwable)b.b(-1230907516, null);
            }
            b.W(this, -1027025019, i);
            b.W(this, 1356584834, j);
        }
        
        public int estimateLength() {
            return (int)b.F(this, 1356584834);
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            b.W(this, 166320003, new Object[] { sb, (int)b.W(calendar, 784651855, new Object[] { (int)b.F(this, -1027025019) }) });
        }
        
        public final void appendTo(final StringBuffer sb, int i) {
            for (int j = 0; j < (int)b.F(this, 1356584834); ++j) {
                b.W(sb, 1088542580, new Object[] { '0' });
            }
            int intValue = (int)b.W(sb, 93837184, null);
            while (i > 0) {
                b.W(sb, -1347299567, new Object[] { --intValue, (char)(48 + i % 10) });
                i /= 10;
            }
        }
    }
    
    private static class TwoDigitNumberField implements NumberRule
    {
        private final int mField;
        
        TwoDigitNumberField(final int i) {
            b.W(this, -800663725, i);
        }
        
        public int estimateLength() {
            return 2;
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            b.W(this, 1130747728, new Object[] { sb, (int)b.W(calendar, 784651855, new Object[] { (int)b.F(this, -800663725) }) });
        }
        
        public final void appendTo(final StringBuffer sb, final int n) {
            if (n < 100) {
                b.q(-541927555, new Object[] { sb, n });
            }
            else {
                b.W(sb, -1306732788, new Object[] { n });
            }
        }
    }
    
    private static class TwoDigitYearField implements NumberRule
    {
        static final TwoDigitYearField INSTANCE;
        
        TwoDigitYearField() {
        }
        
        public int estimateLength() {
            return 2;
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            b.W(this, 1788925783, new Object[] { sb, (int)b.W(calendar, 784651855, new Object[] { 1 }) % 100 });
        }
        
        public final void appendTo(final StringBuffer sb, final int i) {
            b.q(-541927555, new Object[] { sb, i });
        }
        
        static {
            b.L(1863112468, b.b(-975841452, null));
        }
    }
    
    private static class TwoDigitMonthField implements NumberRule
    {
        static final TwoDigitMonthField INSTANCE;
        
        TwoDigitMonthField() {
        }
        
        public int estimateLength() {
            return 2;
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            b.W(this, -1113073823, new Object[] { sb, (int)b.W(calendar, 784651855, new Object[] { 2 }) + 1 });
        }
        
        public final void appendTo(final StringBuffer sb, final int i) {
            b.q(-541927555, new Object[] { sb, i });
        }
        
        static {
            b.L(-128788718, b.b(-1639327906, null));
        }
    }
    
    private static class TwelveHourField implements NumberRule
    {
        private final NumberRule mRule;
        
        TwelveHourField(final NumberRule numberRule) {
            b.W(this, -44902551, numberRule);
        }
        
        public int estimateLength() {
            return (int)b.W(b.F(this, -44902551), 1453119368, null);
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            int intValue = (int)b.W(calendar, 784651855, new Object[] { 10 });
            if (intValue == 0) {
                intValue = (int)b.W(calendar, 519034726, new Object[] { 10 }) + 1;
            }
            b.W(b.F(this, -44902551), -1651124394, new Object[] { sb, intValue });
        }
        
        public void appendTo(final StringBuffer sb, final int i) {
            b.W(b.F(this, -44902551), -1651124394, new Object[] { sb, i });
        }
    }
    
    private static class TwentyFourHourField implements NumberRule
    {
        private final NumberRule mRule;
        
        TwentyFourHourField(final NumberRule numberRule) {
            b.W(this, -2061052149, numberRule);
        }
        
        public int estimateLength() {
            return (int)b.W(b.F(this, -2061052149), 1453119368, null);
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            int intValue = (int)b.W(calendar, 784651855, new Object[] { 11 });
            if (intValue == 0) {
                intValue = (int)b.W(calendar, 963565401, new Object[] { 11 }) + 1;
            }
            b.W(b.F(this, -2061052149), -1651124394, new Object[] { sb, intValue });
        }
        
        public void appendTo(final StringBuffer sb, final int i) {
            b.W(b.F(this, -2061052149), -1651124394, new Object[] { sb, i });
        }
    }
    
    private static class TimeZoneNameRule implements Rule
    {
        private final Locale mLocale;
        private final int mStyle;
        private final String mStandard;
        private final String mDaylight;
        
        TimeZoneNameRule(final TimeZone timeZone, final Locale locale, final int i) {
            b.W(this, 1654248903, locale);
            b.W(this, 569300420, i);
            b.W(this, 77059522, b.q(920507845, new Object[] { timeZone, false, i, locale }));
            b.W(this, -2037000765, b.q(920507845, new Object[] { timeZone, true, i, locale }));
        }
        
        public int estimateLength() {
            return (int)b.q(1234294353, new Object[] { (int)b.W(b.F(this, 77059522), 387569088, null), (int)b.W(b.F(this, -2037000765), 387569088, null) });
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            final Object w = b.W(calendar, 1502467662, null);
            if ((int)b.W(calendar, 784651855, new Object[] { 16 }) != 0) {
                b.W(sb, -170338740, new Object[] { b.q(920507845, new Object[] { w, true, (int)b.F(this, 569300420), b.F(this, 1654248903) }) });
            }
            else {
                b.W(sb, -170338740, new Object[] { b.q(920507845, new Object[] { w, false, (int)b.F(this, 569300420), b.F(this, 1654248903) }) });
            }
        }
    }
    
    private static class TimeZoneNumberRule implements Rule
    {
        static final TimeZoneNumberRule INSTANCE_COLON;
        static final TimeZoneNumberRule INSTANCE_NO_COLON;
        static final TimeZoneNumberRule INSTANCE_ISO_8601;
        final boolean mColon;
        final boolean mISO8601;
        
        TimeZoneNumberRule(final boolean b, final boolean b2) {
            b.W(this, 664524640, b);
            b.W(this, 1629804401, b2);
        }
        
        public int estimateLength() {
            return 5;
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            if ((boolean)b.F(this, 1629804401) && (boolean)b.W(b.W(b.W(calendar, 1502467662, null), 1105778493, null), -1986603143, new Object[] { FormatCache$ExceptionUtils.i("\u4ba7\uce65\udaa2") })) {
                b.W(sb, -170338740, new Object[] { FormatCache$ExceptionUtils.i("\u4ba8") });
                return;
            }
            int n = (int)b.W(calendar, 784651855, new Object[] { 15 }) + (int)b.W(calendar, 784651855, new Object[] { 16 });
            if (n < 0) {
                b.W(sb, 1088542580, new Object[] { '-' });
                n = -n;
            }
            else {
                b.W(sb, 1088542580, new Object[] { '+' });
            }
            final int i = n / 3600000;
            b.q(-541927555, new Object[] { sb, i });
            if (b.F(this, 664524640)) {
                b.W(sb, 1088542580, new Object[] { ':' });
            }
            b.q(-541927555, new Object[] { sb, n / 60000 - 60 * i });
        }
        
        static {
            b.L(1918687002, b.b(641193838, new Object[] { true, false }));
            b.L(-721823972, b.b(641193838, new Object[] { false, false }));
            b.L(-57288931, b.b(641193838, new Object[] { true, true }));
        }
    }
    
    private static class Iso8601_Rule implements Rule
    {
        static final Iso8601_Rule ISO8601_HOURS;
        static final Iso8601_Rule ISO8601_HOURS_MINUTES;
        static final Iso8601_Rule ISO8601_HOURS_COLON_MINUTES;
        final int length;
        
        static Iso8601_Rule getRule(final int n) {
            switch (n) {
                case 1: {
                    return (Iso8601_Rule)b.O(-897198207);
                }
                case 2: {
                    return (Iso8601_Rule)b.O(1904662398);
                }
                case 3: {
                    return (Iso8601_Rule)b.O(-1182279809);
                }
                default: {
                    throw (Throwable)b.b(49337767, new Object[] { FormatCache$0.Z("\u3de0\u452a\u84e2\uae8c\u0e15\u9c21\u7047\ud9a7\u0097\u88f1\u6b8c\u3375\u2148\ueb0a\u9d85\u09ff\u3ae0\ue91b\u76fe") });
                }
            }
        }
        
        Iso8601_Rule(final int i) {
            b.W(this, -2108762244, i);
        }
        
        public int estimateLength() {
            return (int)b.F(this, -2108762244);
        }
        
        public void appendTo(final StringBuffer sb, final Calendar calendar) {
            final int intValue = (int)b.W(calendar, 784651855, new Object[] { 15 });
            if (intValue == 0) {
                b.W(sb, -170338740, new Object[] { FormatCache$FormatCache.U("\u8d28") });
                return;
            }
            int n = intValue + (int)b.W(calendar, 784651855, new Object[] { 16 });
            if (n < 0) {
                b.W(sb, 1088542580, new Object[] { '-' });
                n = -n;
            }
            else {
                b.W(sb, 1088542580, new Object[] { '+' });
            }
            final int i = n / 3600000;
            b.q(-541927555, new Object[] { sb, i });
            if ((int)b.F(this, -2108762244) < 5) {
                return;
            }
            if ((int)b.F(this, -2108762244) == 6) {
                b.W(sb, 1088542580, new Object[] { ':' });
            }
            b.q(-541927555, new Object[] { sb, n / 60000 - 60 * i });
        }
        
        static {
            b.L(-897198207, b.b(965924730, new Object[] { 3 }));
            b.L(1904662398, b.b(965924730, new Object[] { 5 }));
            b.L(-1182279809, b.b(965924730, new Object[] { 6 }));
        }
    }
    
    private static class TimeZoneDisplayKey
    {
        private final TimeZone mTimeZone;
        private final int mStyle;
        private final Locale mLocale;
        
        TimeZoneDisplayKey(final TimeZone timeZone, final boolean b, final int i, final Locale locale) {
            b.W(this, -282733091, timeZone);
            if (b) {
                b.W(this, 1722406362, i | Integer.MIN_VALUE);
            }
            else {
                b.W(this, 1722406362, i);
            }
            b.W(this, -613820965, locale);
        }
        
        @Override
        public int hashCode() {
            return ((int)b.F(this, 1722406362) * 31 + (int)b.W(b.F(this, -613820965), -2114333224, null)) * 31 + (int)b.W(b.F(this, -282733091), -565389847, null);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof TimeZoneDisplayKey && (boolean)b.W(b.F(this, -282733091), -1807493658, new Object[] { b.F(o, -282733091) }) && (int)b.F(this, 1722406362) == (int)b.F(o, 1722406362) && (boolean)b.W(b.F(this, -613820965), 2110313959, new Object[] { b.F(o, -613820965) }));
        }
    }
    
    private interface Rule
    {
        int estimateLength();
        
        void appendTo(final StringBuffer p0, final Calendar p1);
    }
    
    private interface NumberRule extends Rule
    {
        void appendTo(final StringBuffer p0, final int p1);
    }
}
