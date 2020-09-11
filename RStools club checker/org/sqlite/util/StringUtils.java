// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.util;

import java.util.List;

public class StringUtils
{
    public static String join(final List<String> list, final String s) {
        final Object v = n.v(1301167416, null);
        int n = 1;
        final Object s2 = org.sqlite.util.n.s(list, 1473330489, null);
        while (org.sqlite.util.n.s(s2, -1908458182, null)) {
            final Object s3 = org.sqlite.util.n.s(s2, -1683014341, null);
            if (n != 0) {
                n = 0;
            }
            else {
                org.sqlite.util.n.s(v, 925515052, new Object[] { s });
            }
            org.sqlite.util.n.s(v, 925515052, new Object[] { s3 });
        }
        return (String)org.sqlite.util.n.s(v, -1724170963, null);
    }
}
