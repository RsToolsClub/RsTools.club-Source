// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.date;

import java.util.Calendar;
import java.util.Locale;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatUtils
{
    private static final TimeZone UTC_TIME_ZONE;
    public static final FastDateFormat ISO_DATETIME_FORMAT;
    public static final FastDateFormat ISO_DATETIME_TIME_ZONE_FORMAT;
    public static final FastDateFormat ISO_DATE_FORMAT;
    public static final FastDateFormat ISO_DATE_TIME_ZONE_FORMAT;
    public static final FastDateFormat ISO_TIME_FORMAT;
    public static final FastDateFormat ISO_TIME_TIME_ZONE_FORMAT;
    public static final FastDateFormat ISO_TIME_NO_T_FORMAT;
    public static final FastDateFormat ISO_TIME_NO_T_TIME_ZONE_FORMAT;
    public static final FastDateFormat SMTP_DATETIME_FORMAT;
    
    public static String formatUTC(final long l, final String s) {
        return (String)b.q(1532679677, new Object[] { b.b(-455485953, new Object[] { l }), s, b.O(321967612), null });
    }
    
    public static String formatUTC(final Date date, final String s) {
        return (String)b.q(1532679677, new Object[] { date, s, b.O(321967612), null });
    }
    
    public static String formatUTC(final long l, final String s, final Locale locale) {
        return (String)b.q(1532679677, new Object[] { b.b(-455485953, new Object[] { l }), s, b.O(321967612), locale });
    }
    
    public static String formatUTC(final Date date, final String s, final Locale locale) {
        return (String)b.q(1532679677, new Object[] { date, s, b.O(321967612), locale });
    }
    
    public static String format(final long l, final String s) {
        return (String)b.q(1532679677, new Object[] { b.b(-455485953, new Object[] { l }), s, null, null });
    }
    
    public static String format(final Date date, final String s) {
        return (String)b.q(1532679677, new Object[] { date, s, null, null });
    }
    
    public static String format(final Calendar calendar, final String s) {
        return (String)b.q(-2089822726, new Object[] { calendar, s, null, null });
    }
    
    public static String format(final long l, final String s, final TimeZone timeZone) {
        return (String)b.q(1532679677, new Object[] { b.b(-455485953, new Object[] { l }), s, timeZone, null });
    }
    
    public static String format(final Date date, final String s, final TimeZone timeZone) {
        return (String)b.q(1532679677, new Object[] { date, s, timeZone, null });
    }
    
    public static String format(final Calendar calendar, final String s, final TimeZone timeZone) {
        return (String)b.q(-2089822726, new Object[] { calendar, s, timeZone, null });
    }
    
    public static String format(final long l, final String s, final Locale locale) {
        return (String)b.q(1532679677, new Object[] { b.b(-455485953, new Object[] { l }), s, null, locale });
    }
    
    public static String format(final Date date, final String s, final Locale locale) {
        return (String)b.q(1532679677, new Object[] { date, s, null, locale });
    }
    
    public static String format(final Calendar calendar, final String s, final Locale locale) {
        return (String)b.q(-2089822726, new Object[] { calendar, s, null, locale });
    }
    
    public static String format(final long l, final String s, final TimeZone timeZone, final Locale locale) {
        return (String)b.q(1532679677, new Object[] { b.b(-455485953, new Object[] { l }), s, timeZone, locale });
    }
    
    public static String format(final Date date, final String s, final TimeZone timeZone, final Locale locale) {
        return (String)b.W(b.q(-719006213, new Object[] { s, timeZone, locale }), -1780427272, new Object[] { date });
    }
    
    public static String format(final Calendar calendar, final String s, final TimeZone timeZone, final Locale locale) {
        return (String)b.W(b.q(-719006213, new Object[] { s, timeZone, locale }), -619915767, new Object[] { calendar });
    }
    
    static {
        b.L(321967612, b.q(-861481466, new Object[] { FormatCache$0.Z("\u2331\u3194\u95ce") }));
        b.L(-135932412, b.q(-351218169, new Object[] { FormatCache$0.Z("\u230f\u31a0\u95e3\ud145\uf901\u552e\u61b1\uf798\uff71\uaa9a\u35c7\ub404\u0248\u3019\ue8c9\ub823\u8c08\u2b0c\u2e9f\u2ea7/") }));
        b.L(142792197, b.q(-351218169, new Object[] { FormatCache$0.Z("\u230f\u31a0\u95e3\ud145\uf901\u552e\u61b1\uf798\uff71\uaa9a\u35c7\ub404\u0248\u3019\ue8c9\ub823\u8c08\u2b0c\u2e9f\u2ea7/\udb38\u242c") }));
        b.L(-1267804670, b.q(-351218169, new Object[] { FormatCache$0.Z("\u230f\u31a0\u95e3\ud145\uf901\u552e\u61b1\uf798\uff71\uaa9a") }));
        b.L(1988613635, b.q(-351218169, new Object[] { FormatCache$0.Z("\u230f\u31a0\u95e3\ud145\uf901\u552e\u61b1\uf798\uff71\uaa9a\u35ba\ub40a") }));
        b.L(-1033185792, b.q(-351218169, new Object[] { FormatCache$0.Z("\u2351\u318d\u95bd\ud174\uf964\u5559\u6191\uf7d8\uff2f\uaa8d\u3593") }));
        b.L(-1800481391, b.q(-351218169, new Object[] { FormatCache$0.Z("\u2351\u318d\u95bd\ud174\uf964\u5559\u6191\uf7d8\uff2f\uaa8d\u3593\ub40a\u0235") }));
        b.L(1202115982, b.q(-351218169, new Object[] { FormatCache$0.Z("\u233e\u3191\u95a0\ud151\uf941\u5559\u618f\uf7c6") }));
        b.L(1971836303, b.q(-351218169, new Object[] { FormatCache$0.Z("\u233e\u3191\u95a0\ud151\uf941\u5559\u618f\uf7c6\uff4f\uaaa4") }));
        b.L(-1517234806, b.q(92001677, new Object[] { FormatCache$0.Z("\u2333\u319c\u95df\ud110\uf90c\u5507\u6198\uf795\uff58\uaab3\u35ad\ub470\u0216\u3028\ue8f8\ub860\u8c45\u2b29\u2eed\u2eee1\udb0f\u244c\u3026\u750b\ue538\ubc04"), b.O(-109587060) }));
    }
}
