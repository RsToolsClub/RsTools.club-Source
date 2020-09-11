// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.date;

import java.util.SortedMap;
import java.util.Map;
import java.text.ParsePosition;
import java.text.ParseException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;
import java.util.TimeZone;
import java.util.Locale;
import java.io.Serializable;

public class FastDateParser implements DateParser, Serializable
{
    private static final long serialVersionUID = 2L;
    static final Locale JAPANESE_IMPERIAL;
    private final String pattern;
    private final TimeZone timeZone;
    private final Locale locale;
    private final int century;
    private final int startYear;
    private transient Pattern parsePattern;
    private transient Strategy[] strategies;
    private transient String currentFormatField;
    private transient Strategy nextStrategy;
    private static final Pattern formatPattern;
    private static final ConcurrentMap<Locale, Strategy>[] caches;
    private static final Strategy ABBREVIATED_YEAR_STRATEGY;
    private static final Strategy NUMBER_MONTH_STRATEGY;
    private static final Strategy LITERAL_YEAR_STRATEGY;
    private static final Strategy WEEK_OF_YEAR_STRATEGY;
    private static final Strategy WEEK_OF_MONTH_STRATEGY;
    private static final Strategy DAY_OF_YEAR_STRATEGY;
    private static final Strategy DAY_OF_MONTH_STRATEGY;
    private static final Strategy DAY_OF_WEEK_IN_MONTH_STRATEGY;
    private static final Strategy HOUR_OF_DAY_STRATEGY;
    private static final Strategy HOUR24_OF_DAY_STRATEGY;
    private static final Strategy HOUR12_STRATEGY;
    private static final Strategy HOUR_STRATEGY;
    private static final Strategy MINUTE_STRATEGY;
    private static final Strategy SECOND_STRATEGY;
    private static final Strategy MILLISECOND_STRATEGY;
    private static final Strategy ISO_8601_STRATEGY;
    
    protected FastDateParser(final String s, final TimeZone timeZone, final Locale locale) {
        this(s, timeZone, locale, null);
    }
    
    protected FastDateParser(final String s, final TimeZone timeZone, final Locale locale, final Date date) {
        b.W(this, 199219055, s);
        b.W(this, -968435860, timeZone);
        b.W(this, -1973823635, locale);
        final Object q = b.q(-1060251798, new Object[] { timeZone, locale });
        int intValue;
        if (date != null) {
            b.W(q, -1917593813, new Object[] { date });
            intValue = (int)b.W(q, 784651855, new Object[] { 1 });
        }
        else if (b.W(locale, 2110313959, new Object[] { b.O(-1785669781) })) {
            intValue = 0;
        }
        else {
            b.W(q, -1917593813, new Object[] { b.b(1670436712, null) });
            intValue = (int)b.W(q, 784651855, new Object[] { 1 }) - 80;
        }
        b.W(this, 302239929, intValue / 100 * 100);
        b.W(this, -678506314, intValue - (int)b.F(this, 302239929));
        b.W(this, 591450295, new Object[] { q });
    }
    
    private void init(final Calendar calendar) {
        final Object b = org.sqlite.date.b.b(-793717247, null);
        final Object b2 = org.sqlite.date.b.b(656987599, null);
        final Object w = org.sqlite.date.b.W(org.sqlite.date.b.O(-1849503564), 160092341, new Object[] { org.sqlite.date.b.F(this, 199219055) });
        if (!(boolean)org.sqlite.date.b.W(w, 869781682, null)) {
            throw (Throwable)org.sqlite.date.b.b(49337767, new Object[] { org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.b(-793717247, null), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\ua437\u6dab\ubfb1\uc940\u2099\ucf26\uf134\u8f32p\uf12c\ude80\u82f3\u6cef\uf85c\u5dbd\u9d62\u5f73\u4d3c\ubcdd\uec19\uccd8\u81f1\u7dfb\u8563\u24cc\u9364\u5ff2") }), 205378973, new Object[] { (char)org.sqlite.date.b.W(org.sqlite.date.b.F(this, 199219055), 1169085918, new Object[] { (int)org.sqlite.date.b.W(w, -700526413, null) }) }), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\ua459") }), 1279448486, null) });
        }
        org.sqlite.date.b.W(this, -1984180031, org.sqlite.date.b.W(w, 2052968624, null));
        Object o = org.sqlite.date.b.W(this, -1835216706, new Object[] { org.sqlite.date.b.F(this, -1984180031), calendar });
        while (true) {
            org.sqlite.date.b.W(w, 166187197, new Object[] { (int)org.sqlite.date.b.W(w, -1379020609, null), (int)org.sqlite.date.b.W(w, 699125948, null) });
            if (!(boolean)org.sqlite.date.b.W(w, 869781682, null)) {
                break;
            }
            final Object w2 = org.sqlite.date.b.W(w, 2052968624, null);
            org.sqlite.date.b.W(this, 797429946, org.sqlite.date.b.W(this, -1835216706, new Object[] { w2, calendar }));
            if (org.sqlite.date.b.W(o, 1706414267, new Object[] { this, b })) {
                (boolean)org.sqlite.date.b.W(b2, 513660710, new Object[] { o });
            }
            org.sqlite.date.b.W(this, -1984180031, w2);
            o = org.sqlite.date.b.F(this, 797429946);
        }
        org.sqlite.date.b.W(this, 797429946, (Object)null);
        if ((int)org.sqlite.date.b.W(w, -700526413, null) != (int)org.sqlite.date.b.W(w, 699125948, null)) {
            throw (Throwable)org.sqlite.date.b.b(49337767, new Object[] { org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.b(-793717247, null), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\ua438\u6da6\ubfb4\uc949\u209b\ucf23\uf178\u8f66o\uf16d\ude84\u82e6\u6cf8\uf85d\u5db6\u9d62\u5f32") }), -171256418, new Object[] { org.sqlite.date.b.F(this, 199219055) }), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\ua45c\u6de7\ubfe6\uc905\u2099\ucf26\uf12e\u8f77 \uf138\ude84\u82a7\u6ceb\uf85a\u5df3\u9d2b\u5f7e\u4d30\ubcd9\uec13\ucc99") }), 109500250, new Object[] { (int)org.sqlite.date.b.W(w, -700526413, null) }), 1279448486, null) });
        }
        if (org.sqlite.date.b.W(o, 1706414267, new Object[] { this, b })) {
            (boolean)org.sqlite.date.b.W(b2, 513660710, new Object[] { o });
        }
        org.sqlite.date.b.W(this, -1984180031, (Object)null);
        org.sqlite.date.b.W(this, -589967176, org.sqlite.date.b.W(b2, -1776036030, new Object[] { new Strategy[(int)org.sqlite.date.b.W(b2, -296102075, null)] }));
        org.sqlite.date.b.W(this, -1473064762, org.sqlite.date.b.q(-582954807, new Object[] { org.sqlite.date.b.W(b, 1279448486, null) }));
    }
    
    public String getPattern() {
        return (String)b.F(this, 199219055);
    }
    
    public TimeZone getTimeZone() {
        return (TimeZone)b.F(this, -968435860);
    }
    
    public Locale getLocale() {
        return (Locale)b.F(this, -1973823635);
    }
    
    Pattern getParsePattern() {
        return (Pattern)b.F(this, -1473064762);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof FastDateParser && (boolean)b.W(b.F(this, 199219055), -1986603143, new Object[] { b.F(o, 199219055) }) && (boolean)b.W(b.F(this, -968435860), -1807493658, new Object[] { b.F(o, -968435860) }) && (boolean)b.W(b.F(this, -1973823635), 2110313959, new Object[] { b.F(o, -1973823635) });
    }
    
    @Override
    public int hashCode() {
        return (int)b.W(b.F(this, 199219055), 538564470, null) + 13 * ((int)b.W(b.F(this, -968435860), -565389847, null) + 13 * (int)b.W(b.F(this, -1973823635), -2114333224, null));
    }
    
    @Override
    public String toString() {
        return (String)b.W(b.W(b.W(b.W(b.W(b.W(b.W(b.W(b.b(-793717247, null), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\u5f67\u8857\u41fc\ucb4d\ucf82\uc24a\ue5a3\u145d\u120b\u2d3f\u7dbc\ub0e4\u686b\u5fda\ue4dd") }), -171256418, new Object[] { b.F(this, 199219055) }), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\u5f0d") }), 1727190526, new Object[] { b.F(this, -1973823635) }), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\u5f0d") }), -171256418, new Object[] { b.W(b.F(this, -968435860), 1105778493, null) }), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\u5f7c") }), 1279448486, null);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        b.W(objectInputStream, -1747462281, null);
        b.W(this, 591450295, new Object[] { b.q(-1060251798, new Object[] { b.F(this, -968435860), b.F(this, -1973823635) }) });
    }
    
    public Object parseObject(final String s) throws ParseException {
        return b.W(this, 1783945012, new Object[] { s });
    }
    
    public Date parse(final String s) throws ParseException {
        final Object w = b.W(this, -781658315, new Object[] { s, b.b(761647303, new Object[] { 0 }) });
        if (w != null) {
            return (Date)w;
        }
        if (b.W(b.F(this, -1973823635), 2110313959, new Object[] { b.O(-1785669781) })) {
            throw (Throwable)b.b(-118894395, new Object[] { b.W(b.W(b.W(b.W(b.W(b.W(b.W(b.b(-793717247, null), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\ud16b\u8013\u95b7\u33c2\u8a1d") }), 1727190526, new Object[] { b.F(this, -1973823635) }), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\ud163\u802b\u95b0\u33c4\u8a5c\u88a2¬\u8bff\uff55\u0278\u446b\u63c6\u6863\u8142\u4f00\u83a5\u378b\u1a21\ub0b5\uf3f1\u46ec\u1dee\u7398\uc9be\u3389\u0c4f\u600a\u03a5\ueeb8\u2fd1\u4803\u79c3\u656c\ud96f\u4078\u8f9f\u6ccb\u3517\ue301\ub1ab\ub9df\ua008\ua754\ub087\uaa79\u6d54\u31a6\u5492\u5200\uc28f\uf39e\u117b\u523d\uf68a\uaecc\u2c40\u109b\ua575\uce09\uba51\ud497\u86d1\u333e\u4ffd\u23aa\u68f2") }), -171256418, new Object[] { s }), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\ud161\u8067\u95bb\u33c8\u8a58\u88bd\u00e9\u8bb1\uff5e\u0263\u442e\u63d8\u6822\u8158\u4f0c\u83b9\u378b") }), -171256418, new Object[] { b.W(b.F(this, -1473064762), 1361891524, null) }), 1279448486, null), 0 });
        }
        throw (Throwable)b.b(-118894395, new Object[] { b.W(b.W(b.W(b.W(b.W(b.b(-793717247, null), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\ud116\u8029\u95af\u33c6\u8a4f\u88bd¬\u8bbe\uff53\u027b\u446b\u6395\u6827\u814d\u4f1b\u83b4\u3791\u1a72\ub0e2") }), -171256418, new Object[] { s }), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\ud161\u8067\u95bb\u33c8\u8a58\u88bd\u00e9\u8bb1\uff5e\u0263\u442e\u63d8\u6822\u8158\u4f0c\u83b9\u378b") }), -171256418, new Object[] { b.W(b.F(this, -1473064762), 1361891524, null) }), 1279448486, null), 0 });
    }
    
    public Object parseObject(final String s, final ParsePosition parsePosition) {
        return b.W(this, -781658315, new Object[] { s, parsePosition });
    }
    
    public Date parse(final String s, final ParsePosition parsePosition) {
        final int intValue = (int)b.W(parsePosition, 1812713666, null);
        final Object w = b.W(b.F(this, -1473064762), 160092341, new Object[] { b.W(s, -1625172197, new Object[] { intValue }) });
        if (!(boolean)b.W(w, 869781682, null)) {
            return null;
        }
        final Object q = b.q(-1060251798, new Object[] { b.F(this, -968435860), b.F(this, -1973823635) });
        b.W(q, 2057752771, null);
        int i = 0;
        while (i < ((Object[])b.F(this, -589967176)).length) {
            b.W(((Object[])b.F(this, -589967176))[i++], -884682415, new Object[] { this, q, b.W(w, -850800448, new Object[] { i }) });
        }
        b.W(parsePosition, 1626263886, new Object[] { intValue + (int)b.W(w, -1379020609, null) });
        return (Date)b.W(q, 1990644047, null);
    }
    
    private static StringBuilder escapeRegex(final StringBuilder sb, final String s, final boolean b) {
        b.W(sb, -171256418, new Object[] { FormatCache$FormatCache.U("\uabd0\u1066") });
        for (int i = 0; i < (int)b.W(s, 387569088, null); ++i) {
            char c = (char)b.W(s, 1169085918, new Object[] { i });
            switch (c) {
                case 39: {
                    if (!b) {
                        break;
                    }
                    if (++i == (int)b.W(s, 387569088, null)) {
                        return sb;
                    }
                    c = (char)b.W(s, 1169085918, new Object[] { i });
                    break;
                }
                case 92: {
                    if (++i == (int)b.W(s, 387569088, null)) {
                        break;
                    }
                    b.W(sb, 205378973, new Object[] { c });
                    c = (char)b.W(s, 1169085918, new Object[] { i });
                    if (c == 'E') {
                        b.W(sb, -171256418, new Object[] { FormatCache$FormatCache.U("\uabc9\u106b\u2052\u8c60\u0914") });
                        c = 'Q';
                        break;
                    }
                    break;
                }
            }
            b.W(sb, 205378973, new Object[] { c });
        }
        b.W(sb, -171256418, new Object[] { FormatCache$FormatCache.U("\uabd0\u1072") });
        return sb;
    }
    
    private static Map<String, Integer> getDisplayNames(final int i, final Calendar calendar, final Locale locale) {
        return (Map<String, Integer>)b.W(calendar, 1181536588, new Object[] { i, 0, locale });
    }
    
    private int adjustYear(final int n) {
        final int n2 = (int)b.F(this, 302239929) + n;
        return (n >= (int)b.F(this, -678506314)) ? n2 : (n2 + 100);
    }
    
    boolean isNextNumber() {
        return b.F(this, 797429946) != null && (boolean)b.W(b.F(this, 797429946), -829107891, null);
    }
    
    int getFieldWidth() {
        return (int)b.W(b.F(this, -1984180031), 387569088, null);
    }
    
    private Strategy getStrategy(final String s, final Calendar calendar) {
        switch ((char)b.W(s, 1169085918, new Object[] { 0 })) {
            case '\'': {
                if ((int)b.W(s, 387569088, null) > 2) {
                    return (Strategy)b.b(1430704459, new Object[] { b.W(s, 1864225098, new Object[] { 1, (int)b.W(s, 387569088, null) - 1 }) });
                }
                break;
            }
            case 'D': {
                return (Strategy)b.O(1928384712);
            }
            case 'E': {
                return (Strategy)b.W(this, 1632555161, new Object[] { 7, calendar });
            }
            case 'F': {
                return (Strategy)b.O(726782102);
            }
            case 'G': {
                return (Strategy)b.W(this, 1632555161, new Object[] { 0, calendar });
            }
            case 'H': {
                return (Strategy)b.O(1124257943);
            }
            case 'K': {
                return (Strategy)b.O(-1220751212);
            }
            case 'M': {
                return (Strategy)(((int)b.W(s, 387569088, null) >= 3) ? b.W(this, 1632555161, new Object[] { 2, calendar }) : b.O(1496109205));
            }
            case 'S': {
                return (Strategy)b.O(421384338);
            }
            case 'W': {
                return (Strategy)b.O(-128659309);
            }
            case 'a': {
                return (Strategy)b.W(this, 1632555161, new Object[] { 9, calendar });
            }
            case 'd': {
                return (Strategy)b.O(-1722429296);
            }
            case 'h': {
                return (Strategy)b.O(344838305);
            }
            case 'k': {
                return (Strategy)b.O(1720635550);
            }
            case 'm': {
                return (Strategy)b.O(-1603809121);
            }
            case 's': {
                return (Strategy)b.O(1284821148);
            }
            case 'w': {
                return (Strategy)b.O(1640681629);
            }
            case 'y': {
                return (Strategy)(((int)b.W(s, 387569088, null) > 2) ? b.O(-821899110) : b.O(-11743077));
            }
            case 'X': {
                return (Strategy)b.q(522047640, new Object[] { (int)b.W(s, 387569088, null) });
            }
            case 'Z': {
                if (b.W(s, -1986603143, new Object[] { FormatCache$1.d("\u58ca\u981f") })) {
                    return (Strategy)b.O(-1469722455);
                }
                return (Strategy)b.W(this, 1632555161, new Object[] { 15, calendar });
            }
            case 'z': {
                return (Strategy)b.W(this, 1632555161, new Object[] { 15, calendar });
            }
        }
        return (Strategy)b.b(1430704459, new Object[] { s });
    }
    
    private static ConcurrentMap<Locale, Strategy> getCache(final int n) {
        // monitorenter((Object[])b.O(-558575450))
        try {
            if (((Object[])b.O(-558575450))[n] == null) {
                ((Object[])b.O(-558575450))[n] = b.b(1582552482, new Object[] { 3 });
            }
            final Object o = ((Object[])b.O(-558575450))[n];
            // monitorexit((Object[])b.O(-558575450))
            return (ConcurrentMap<Locale, Strategy>)o;
        }
        finally {
            // monitorexit((Object[])b.O(-558575450))
            throw;
        }
    }
    
    private Strategy getLocaleSpecificStrategy(final int n, final Calendar calendar) {
        final Object q = b.q(366923943, new Object[] { n });
        Object w = b.W(q, -1545415251, new Object[] { b.F(this, -1973823635) });
        if (w == null) {
            w = ((n == 15) ? b.b(-1144532828, new Object[] { b.F(this, -1973823635) }) : b.b(1485492389, new Object[] { n, calendar, b.F(this, -1973823635) }));
            final Object w2 = b.W(q, -303704661, new Object[] { b.F(this, -1973823635), w });
            if (w2 != null) {
                return (Strategy)w2;
            }
        }
        return (Strategy)w;
    }
    
    static {
        b.L(-1785669781, b.b(99668145, new Object[] { FormatCache$FormatCache.U("\u5378\ufe5c"), FormatCache$FormatCache.U("\u5358\ufe6d"), FormatCache$FormatCache.U("\u5358\ufe6d") }));
        b.L(-1849503564, b.q(-582954807, new Object[] { FormatCache$FormatCache.U("\u5356\ufe16\uf334\ua744\ud626\ub107\u3ef2\u4bd7\u7c68\u9b33\uaa18\uc786\ue100\u2b9f\u2167\u7270\u9378\u618c\ub483\u6aa3\u9ccf\uc100\ue14c\uec2b\ua05a\ue8ac\ua773\u1373\u1695\u2232\u461a\u624f\u838e\u25b0\u5d3e\u0f54\u5591\u48fc\u961e\u5478\ucda7\u7610\ub5f7\u7b29\uf4c1\u0f97\u8045\uf579\u4890\u3288\udd7b\u559a\ue9c3\u6603\uc8dc\u27d3\u972d\ud770\u1951\u47f9\ud923\u12e6\uced5\u04ac\u4bf8\u0888\ued5e\ud8d3\u001d\ud0db\u82e7\uf9d4\u20ba\u99a8\u5977\u359f\uca8a\u6817\uef3e\ua013\u99b7\ufc65\u5700\uebb0\uf950\u4120\ud398\u14a3\u7a44\u5fec\ucf0d\ucbbd\u44f5\uffa1\u7bc3\u7042") }));
        b.L(-558575450, new ConcurrentMap[17]);
        b.L(-11743077, b.b(502517934, new Object[] { 1 }));
        b.L(1496109205, b.b(-539504465, new Object[] { 2 }));
        b.L(-821899110, b.b(-1542074196, new Object[] { 1 }));
        b.L(1640681629, b.b(-1542074196, new Object[] { 3 }));
        b.L(-128659309, b.b(-1542074196, new Object[] { 4 }));
        b.L(1928384712, b.b(-1542074196, new Object[] { 6 }));
        b.L(-1722429296, b.b(-1542074196, new Object[] { 5 }));
        b.L(726782102, b.b(-1542074196, new Object[] { 8 }));
        b.L(1124257943, b.b(-1542074196, new Object[] { 11 }));
        b.L(1720635550, b.b(-878063443, new Object[] { 11 }));
        b.L(344838305, b.b(-281816918, new Object[] { 10 }));
        b.L(-1220751212, b.b(-1542074196, new Object[] { 10 }));
        b.L(-1603809121, b.b(-1542074196, new Object[] { 12 }));
        b.L(1284821148, b.b(-1542074196, new Object[] { 13 }));
        b.L(421384338, b.b(-1542074196, new Object[] { 14 }));
        b.L(-1469722455, b.b(1671745707, new Object[] { FormatCache$FormatCache.U("\u533a\ufe67\uf334\ua729\ud632\ub141\u3eef\u4bd7\u7c39\u9b29\uaa6f\uc79e\ue133\u2b86\u2166\u7213\u936c\u61ca\ub4f4\u6ab7\u9cef\uc137\ue11c\uec65\ua070\ue8ae\ua730\u1302\u1697") }));
    }
    
    private abstract static class Strategy
    {
        boolean isNumber() {
            return false;
        }
        
        void setCalendar(final FastDateParser fastDateParser, final Calendar calendar, final String s) {
        }
        
        abstract boolean addRegex(final FastDateParser p0, final StringBuilder p1);
    }
    
    private static class CopyQuotedStrategy extends Strategy
    {
        private final String formatField;
        
        CopyQuotedStrategy(final String s) {
            b.W(this, 1645336454, s);
        }
        
        @Override
        boolean isNumber() {
            char c = (char)b.W(b.F(this, 1645336454), 1169085918, new Object[] { 0 });
            if (c == '\'') {
                c = (char)b.W(b.F(this, 1645336454), 1169085918, new Object[] { 1 });
            }
            return (boolean)b.q(1328994183, new Object[] { c });
        }
        
        @Override
        boolean addRegex(final FastDateParser fastDateParser, final StringBuilder sb) {
            b.q(-1277766244, new Object[] { sb, b.F(this, 1645336454), true });
            return false;
        }
    }
    
    private static class CaseInsensitiveTextStrategy extends Strategy
    {
        private final int field;
        private final Locale locale;
        private final Map<String, Integer> lKeyValues;
        
        CaseInsensitiveTextStrategy(final int n, final Calendar calendar, final Locale locale) {
            b.W(this, 229365325, n);
            b.W(this, 1336006218, locale);
            final Object q = b.q(-1524836789, new Object[] { n, calendar, locale });
            b.W(this, 1599002009, b.b(-2059086392, null));
            final Object w = b.W(b.W(q, 1231410582, null), -2304617, null);
            while (b.W(w, 739562900, null)) {
                final Object w2 = b.W(w, -1645161067, null);
                b.W(b.F(this, 1599002009), 1655952801, new Object[] { b.W(b.W(w2, 549770642, null), -148056685, new Object[] { locale }), b.W(w2, -2082024048, null) });
            }
        }
        
        @Override
        boolean addRegex(final FastDateParser fastDateParser, final StringBuilder sb) {
            b.W(sb, -171256418, new Object[] { FormatCache$FormatCache.U("\ud7dd\u9c49\uff0e\u8b4f\u775f\u33d8") });
            final Object w = b.W(b.W(b.F(this, 1599002009), 2100549023, null), -2304617, null);
            while (b.W(w, 739562900, null)) {
                b.W(b.q(-1277766244, new Object[] { sb, b.W(w, -1645161067, null), false }), 205378973, new Object[] { '|' });
            }
            b.W(sb, 1439749531, new Object[] { (int)b.W(sb, -684272230, null) - 1, ')' });
            return true;
        }
        
        @Override
        void setCalendar(final FastDateParser fastDateParser, final Calendar calendar, final String s) {
            final Object w = b.W(b.F(this, 1599002009), -2132814440, new Object[] { b.W(s, -148056685, new Object[] { b.F(this, 1336006218) }) });
            if (w == null) {
                final Object b = org.sqlite.date.b.b(772658601, new Object[] { s });
                org.sqlite.date.b.W(b, -171256418, new Object[] { FormatCache$ExceptionUtils.i("\u0170\u2a77\u4705\uc829\u9e00\ua81f\u317a\u8df5\u9758") });
                final Object w2 = org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.F(this, 1599002009), 2100549023, null), -2304617, null);
                while (org.sqlite.date.b.W(w2, 739562900, null)) {
                    org.sqlite.date.b.W(org.sqlite.date.b.W(b, -171256418, new Object[] { org.sqlite.date.b.W(w2, -1645161067, null) }), 205378973, new Object[] { ' ' });
                }
                org.sqlite.date.b.W(b, 1439749531, new Object[] { (int)org.sqlite.date.b.W(b, -684272230, null) - 1, ')' });
                throw (Throwable)org.sqlite.date.b.b(49337767, new Object[] { org.sqlite.date.b.W(b, 1279448486, null) });
            }
            b.W(calendar, -46606939, new Object[] { (int)b.F(this, 229365325), (int)b.W(w, 836425124, null) });
        }
    }
    
    private static class NumberStrategy extends Strategy
    {
        private final int field;
        
        NumberStrategy(final int i) {
            b.W(this, -1232677025, i);
        }
        
        @Override
        boolean isNumber() {
            return true;
        }
        
        @Override
        boolean addRegex(final FastDateParser fastDateParser, final StringBuilder sb) {
            if (b.W(fastDateParser, 276092764, null)) {
                b.W(b.W(b.W(sb, -171256418, new Object[] { FormatCache$0.Z("\uc5aa\u33f4\ua1e4\u1998\u2a35\u4acc\ufbe3\uf28d") }), 109500250, new Object[] { (int)b.W(fastDateParser, 1314641757, null) }), -171256418, new Object[] { FormatCache$0.Z("\uc5ff\u3383\ua1bd") });
            }
            else {
                b.W(sb, -171256418, new Object[] { FormatCache$0.Z("\uc5aa\u33f4\ua1e4\u1998\u2a35\u4acc\ufbe3\uf2dd\ub976\ub7f4") });
            }
            return true;
        }
        
        @Override
        void setCalendar(final FastDateParser fastDateParser, final Calendar calendar, final String s) {
            b.W(calendar, -46606939, new Object[] { (int)b.F(this, -1232677025), (int)b.W(this, 179361624, new Object[] { (int)b.q(-233777317, new Object[] { s }) }) });
        }
        
        int modify(final int n) {
            return n;
        }
    }
    
    private static class TimeZoneStrategy extends Strategy
    {
        private final String validTimeZoneChars;
        private final SortedMap<String, TimeZone> tzNames;
        private static final int ID = 0;
        private static final int LONG_STD = 1;
        private static final int SHORT_STD = 2;
        private static final int LONG_DST = 3;
        private static final int SHORT_DST = 4;
        
        TimeZoneStrategy(final Locale locale) {
            b.W(this, -1192897063, b.b(-1832790520, new Object[] { b.O(1472714123) }));
            for (final Object[] array2 : (Object[][])b.W(b.q(-866789930, new Object[] { locale }), -354036265, null)) {
                if (!(boolean)b.W(array2[0], 1508955604, new Object[] { FormatCache$ExceptionUtils.i("\uac62\u0601\ua322") })) {
                    final Object q = b.q(-861481466, new Object[] { array2[0] });
                    if (!(boolean)b.W(b.F(this, -1192897063), 463984085, new Object[] { array2[1] })) {
                        b.W(b.F(this, -1192897063), 148624850, new Object[] { array2[1], q });
                    }
                    if (!(boolean)b.W(b.F(this, -1192897063), 463984085, new Object[] { array2[2] })) {
                        b.W(b.F(this, -1192897063), 148624850, new Object[] { array2[2], q });
                    }
                    if (b.W(q, -232663597, null)) {
                        if (!(boolean)b.W(b.F(this, -1192897063), 463984085, new Object[] { array2[3] })) {
                            b.W(b.F(this, -1192897063), 148624850, new Object[] { array2[3], q });
                        }
                        if (!(boolean)b.W(b.F(this, -1192897063), 463984085, new Object[] { array2[4] })) {
                            b.W(b.F(this, -1192897063), 148624850, new Object[] { array2[4], q });
                        }
                    }
                }
            }
            final Object b = org.sqlite.date.b.b(-793717247, null);
            org.sqlite.date.b.W(org.sqlite.date.b.W(b, -171256418, new Object[] { FormatCache$ExceptionUtils.i("\uac0d\u060b\ua33b\u0b3f\u73fd\ub11d\u5e8c\ud2d9\u8691\u9c6d\uede9\u8ed5\u96ad\u3b19\ubc27\u44e4\u6cf9\uc624\u5b07\u387b\u43a5") }), 205378973, new Object[] { '|' });
            org.sqlite.date.b.W(org.sqlite.date.b.W(b, -171256418, new Object[] { FormatCache$ExceptionUtils.i("\uac7e\u0667\ua35b\u0b36\u73fa\ub152\u5eda\ud2b0\u86b0") }), 205378973, new Object[] { '|' });
            final Object w = org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.F(this, -1192897063), -1207708208, null), -2304617, null);
            while (org.sqlite.date.b.W(w, 739562900, null)) {
                org.sqlite.date.b.W(org.sqlite.date.b.q(-1277766244, new Object[] { b, org.sqlite.date.b.W(w, -1645161067, null), false }), 205378973, new Object[] { '|' });
            }
            org.sqlite.date.b.W(b, 1439749531, new Object[] { (int)org.sqlite.date.b.W(b, -684272230, null) - 1, ')' });
            org.sqlite.date.b.W(this, -803809823, org.sqlite.date.b.W(b, 1279448486, null));
        }
        
        @Override
        boolean addRegex(final FastDateParser fastDateParser, final StringBuilder sb) {
            b.W(sb, -171256418, new Object[] { b.F(this, -803809823) });
            return true;
        }
        
        @Override
        void setCalendar(final FastDateParser fastDateParser, final Calendar calendar, final String s) {
            Object o;
            if ((char)b.W(s, 1169085918, new Object[] { 0 }) == '+' || (char)b.W(s, 1169085918, new Object[] { 0 }) == '-') {
                o = b.q(-861481466, new Object[] { b.W(b.W(b.W(b.b(-793717247, null), -171256418, new Object[] { FormatCache$1.d("\u2fcb\u3461\u2ffa") }), -171256418, new Object[] { s }), 1279448486, null) });
            }
            else if (b.W(s, 1508955604, new Object[] { FormatCache$1.d("\u2fcb\u3461\u2ffa") })) {
                o = b.q(-861481466, new Object[] { s });
            }
            else {
                o = b.W(b.F(this, -1192897063), -23210529, new Object[] { s });
                if (o == null) {
                    throw (Throwable)b.b(49337767, new Object[] { b.W(b.W(b.W(b.b(-793717247, null), -171256418, new Object[] { s }), -171256418, new Object[] { FormatCache$1.d("\u2fac\u3445\u2fdd\ud272\ua031\u5fa4\u5120\u3987\u9ffd\ua2f2\u79f1\u8df8\u3222\ue0ba\uff9b\uf731\u3a59\u3ff4\ufd86\ud007\ufc64\u4710\u5df4\u8f8cn\u54eb\uef48\ue3bc\u3b8e\u7964\u40f8\u1118\udc19") }), 1279448486, null) });
                }
            }
            b.W(calendar, 1251595740, new Object[] { o });
        }
    }
    
    private static class ISO8601TimeZoneStrategy extends Strategy
    {
        private final String pattern;
        private static final Strategy ISO_8601_1_STRATEGY;
        private static final Strategy ISO_8601_2_STRATEGY;
        private static final Strategy ISO_8601_3_STRATEGY;
        
        ISO8601TimeZoneStrategy(final String s) {
            b.W(this, 1556009209, s);
        }
        
        @Override
        boolean addRegex(final FastDateParser fastDateParser, final StringBuilder sb) {
            b.W(sb, -171256418, new Object[] { b.F(this, 1556009209) });
            return true;
        }
        
        @Override
        void setCalendar(final FastDateParser fastDateParser, final Calendar calendar, final String s) {
            if (b.W(s, -1986603143, new Object[] { FormatCache$FormatCache.U("\uecc5") })) {
                b.W(calendar, 1251595740, new Object[] { b.q(-861481466, new Object[] { FormatCache$FormatCache.U("\uecca\u93f3\u0a03") }) });
            }
            else {
                b.W(calendar, 1251595740, new Object[] { b.q(-861481466, new Object[] { b.W(b.W(b.W(b.b(-793717247, null), -171256418, new Object[] { FormatCache$FormatCache.U("\uecd8\u93ea\u0a14") }), -171256418, new Object[] { s }), 1279448486, null) }) });
            }
        }
        
        static Strategy getStrategy(final int n) {
            switch (n) {
                case 1: {
                    return (Strategy)b.O(-1594240778);
                }
                case 2: {
                    return (Strategy)b.O(1226035447);
                }
                case 3: {
                    return (Strategy)b.O(91279604);
                }
                default: {
                    throw (Throwable)b.b(49337767, new Object[] { FormatCache$FormatCache.U("\ud156\u1dd1\uf10e\uf816\ua5ca\u3ea1\u97c7\u2489\u9a0f\u7f3f\u0e40\ud557\ueba4\u21d2\u56b8\u2900\ue0b2\uf4a3\udac5") });
                }
            }
        }
        
        static {
            b.L(-1594240778, b.b(1671745707, new Object[] { FormatCache$0.Z("\ue2a1\ua9a6\u5419\u52d4\u90b9\u1545\ud3a3\uce51\uebb4\u0f98\u8dc6\u8d87\udc70\uaf50\u2de2\udff2\udc0a") }));
            b.L(1226035447, b.b(1671745707, new Object[] { FormatCache$0.Z("\ue2a1\ua9a6\u5419\u52d4\u90b9\u1545\ud3a3\uce51\uebb4\u0f98\u8dc6\u8d87\udc70\uaf50\u2de2\udf87\udc47\ufff0\u7d06\u4f85\ub379\u7706") }));
            b.L(91279604, b.b(1671745707, new Object[] { FormatCache$0.Z("\ue2a1\ua9a6\u5419\u52d4\u90b9\u1545\ud3a3\uce51\uebb4\u0f98\u8dc6\u8d87\udc70\uaf50\u2de2\udff3\udc1c\uffb1\u7d0e\u4fd1\ub30c\u774b\udfb9\u75f6\uce74\u90d3\u98e1") }));
        }
    }
}
