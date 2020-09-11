// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.date;

import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.text.Format;

abstract class FormatCache<F extends Format>
{
    static final int NONE = -1;
    private final ConcurrentMap<MultipartKey, F> cInstanceCache;
    private static final ConcurrentMap<MultipartKey, String> cDateTimeInstanceCache;
    
    FormatCache() {
        b.W(this, 382653859, b.b(1582552482, new Object[] { 7 }));
    }
    
    public F getInstance() {
        return (F)b.W(this, 708367790, new Object[] { 3, 3, b.q(-1483156064, null), b.q(1577244081, null) });
    }
    
    public F getInstance(final String s, TimeZone q, Locale q2) {
        if (s == null) {
            throw (Throwable)b.b(292738479, new Object[] { FormatCache$1.d("\u4cd8\u0f71\u287d\udec0\ufb40\u4f7e\u39bd\u1687\uf742\uaebe\u6569\uf5c2\u6143\ub22a\u8c06\u6649\u1b79\udbfc\u7d03\u2069\ua064\u2b13\u1c49\u8bca") });
        }
        if (q == null) {
            q = (TimeZone)b.q(-1483156064, null);
        }
        if (q2 == null) {
            q2 = (Locale)b.q(1577244081, null);
        }
        final Object b = org.sqlite.date.b.b(1186583980, new Object[] { { s, q, q2 } });
        Object o = org.sqlite.date.b.W(org.sqlite.date.b.F(this, 382653859), -1545415251, new Object[] { b });
        if (o == null) {
            o = org.sqlite.date.b.W(this, 794875306, new Object[] { s, q, q2 });
            final Object w = org.sqlite.date.b.W(org.sqlite.date.b.F(this, 382653859), -303704661, new Object[] { b, o });
            if (w != null) {
                o = w;
            }
        }
        return (F)o;
    }
    
    protected abstract F createInstance(final String p0, final TimeZone p1, final Locale p2);
    
    private F getDateTimeInstance(final Integer n, final Integer n2, final TimeZone timeZone, Locale q) {
        if (q == null) {
            q = (Locale)b.q(1577244081, null);
        }
        return (F)b.W(this, 374330873, new Object[] { b.q(1762907560, new Object[] { n, n2, q }), timeZone, q });
    }
    
    F getDateTimeInstance(final int i, final int j, final TimeZone timeZone, final Locale locale) {
        return (F)b.W(this, 685954551, new Object[] { b.q(-1963207178, new Object[] { i }), b.q(-1963207178, new Object[] { j }), timeZone, locale });
    }
    
    F getDateInstance(final int i, final TimeZone timeZone, final Locale locale) {
        return (F)b.W(this, 685954551, new Object[] { b.q(-1963207178, new Object[] { i }), null, timeZone, locale });
    }
    
    F getTimeInstance(final int i, final TimeZone timeZone, final Locale locale) {
        return (F)b.W(this, 685954551, new Object[] { null, b.q(-1963207178, new Object[] { i }), timeZone, locale });
    }
    
    static String getPatternForStyle(final Integer n, final Integer n2, final Locale locale) {
        final Object b = org.sqlite.date.b.b(1186583980, new Object[] { { n, n2, locale } });
        Object o = org.sqlite.date.b.W(org.sqlite.date.b.O(-242231820), -1545415251, new Object[] { b });
        if (o == null) {
            try {
                Object o2;
                if (n == null) {
                    o2 = org.sqlite.date.b.q(1870255605, new Object[] { (int)org.sqlite.date.b.W(n2, 836425124, null), locale });
                }
                else if (n2 == null) {
                    o2 = org.sqlite.date.b.q(-1449077262, new Object[] { (int)org.sqlite.date.b.W(n, 836425124, null), locale });
                }
                else {
                    o2 = org.sqlite.date.b.q(-756689421, new Object[] { (int)org.sqlite.date.b.W(n, 836425124, null), (int)org.sqlite.date.b.W(n2, 836425124, null), locale });
                }
                o = org.sqlite.date.b.W(o2, -2038376976, null);
                final Object w = org.sqlite.date.b.W(org.sqlite.date.b.O(-242231820), -303704661, new Object[] { b, o });
                if (w != null) {
                    o = w;
                }
            }
            catch (ClassCastException ex) {
                throw (Throwable)org.sqlite.date.b.b(49337767, new Object[] { org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.W(org.sqlite.date.b.b(-793717247, null), -171256418, new Object[] { FormatCache$ExceptionUtils.i("\u8426\ub9ca\uba00\u3d1a\u3c4e\ude77\u05b3\u4c99\ubf3f\u56f1\u06b9\ufb93\u8fd6\u3e6b\u8c94\ub237\u5eae\u45dd\ucde5\ua6ff\u0d0a\ue2e7\u1edb\ub20d\u3e6b\u9798\u4cd5\u8ae6\ua687\uf315\uc5f2\uc414\u49bb") }), 1727190526, new Object[] { locale }), 1279448486, null) });
            }
        }
        return (String)o;
    }
    
    static {
        b.L(-242231820, b.b(1582552482, new Object[] { 7 }));
    }
    
    private static class MultipartKey
    {
        private final Object[] keys;
        private int hashCode;
        
        public MultipartKey(final Object... array) {
            b.W(this, -283912325, (Object)array);
        }
        
        @Override
        public boolean equals(final Object o) {
            return (boolean)b.q(1196873592, new Object[] { (Object[])b.F(this, -283912325), (Object[])b.F(o, -283912325) });
        }
        
        @Override
        public int hashCode() {
            if ((int)b.F(this, -1782917239) == 0) {
                int i = 0;
                for (final Object o : (Object[])b.F(this, -283912325)) {
                    if (o != null) {
                        i = i * 7 + (int)b.W(o, -565389847, null);
                    }
                }
                b.W(this, -1782917239, i);
            }
            return (int)b.F(this, -1782917239);
        }
    }
}
