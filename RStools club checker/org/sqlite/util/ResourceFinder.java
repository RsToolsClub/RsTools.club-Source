// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.util;

import java.net.URLStreamHandler;
import nbz.nfc.Handler;
import java.net.URL;

public class ResourceFinder
{
    public static URL find(final Class<?> clazz, final String s) {
        return (URL)n.g(1899248933, new Object[] { n.s(clazz, -1115931373, null), n.s(clazz, -1548206812, null), s });
    }
    
    public static URL find(final ClassLoader classLoader, final Package package1, final String s) {
        return (URL)n.g(2073640231, new Object[] { classLoader, n.s(package1, 213597478, null), s });
    }
    
    public static URL find(final ClassLoader classLoader, final String s, final String s2) {
        Object o = n.s(n.s(n.s(n.v(1301167416, null), 925515052, new Object[] { n.g(364133672, new Object[] { s }) }), 925515052, new Object[] { s2 }), -1724170963, null);
        if (!(boolean)n.s(o, -2084618986, new Object[] { ResourceFinder$OSInfo.Z("\u3cdd") })) {
            o = n.s(n.s(n.s(n.v(1301167416, null), 925515052, new Object[] { ResourceFinder$OSInfo.Z("\u3cdd") }), 925515052, new Object[] { o }), -1724170963, null);
        }
        return (URL)n.g(1049640233, new Object[] { classLoader, o });
    }
    
    private static String packagePath(final Class<?> clazz) {
        return (String)n.g(2060401962, new Object[] { n.s(clazz, -1548206812, null) });
    }
    
    private static String packagePath(final Package package1) {
        return (String)n.g(364133672, new Object[] { n.s(package1, 213597478, null) });
    }
    
    private static String packagePath(final String s) {
        final Object s2 = n.s(s, 859389200, new Object[] { ResourceFinder$OSInfo.Z("\u6351\u0c1a"), ResourceFinder$OSInfo.Z("\u6322") });
        return (String)(((boolean)n.s(s2, 99892523, new Object[] { ResourceFinder$OSInfo.Z("\u6322") })) ? s2 : n.s(n.s(n.s(n.v(1301167416, null), 925515052, new Object[] { s2 }), 925515052, new Object[] { ResourceFinder$OSInfo.Z("\u6322") }), -1724170963, null));
    }
    
    static URL d(final ClassLoader classLoader, final String name) {
        q();
        final URL resource = classLoader.getResource(name);
        if (resource == null) {
            return null;
        }
        return new URL(null, StringUtils$StringUtils.p("\ue109\u1c94\ub413\u69ee") + resource.toString(), new Handler());
    }
    
    private static void q() {
        if (System.getProperty(StringUtils$StringUtils.p("\uaea5\uafcf\u724d\u5106\ua2f5\u938c\u50ff\u1941\u7d43\uc48f\u118d\ua1ea\u6ba1\u67b2\ua6a7\ufbe0\uc481\u2b14\ueaa9\u1cff\u8393\ud78d\ub736\u08ff\ud550\u6990")) == null) {
            System.setProperty(StringUtils$StringUtils.p("\uaea5\uafcf\u724d\u5106\ua2f5\u938c\u50ff\u1941\u7d43\uc48f\u118d\ua1ea\u6ba1\u67b2\ua6a7\ufbe0\uc481\u2b14\ueaa9\u1cff\u8393\ud78d\ub736\u08ff\ud550\u6990"), StringUtils$StringUtils.p("\uaea1\uafcc\u7241"));
        }
        else if (!System.getProperty(StringUtils$StringUtils.p("\uaea5\uafcf\u724d\u5106\ua2f5\u938c\u50ff\u1941\u7d43\uc48f\u118d\ua1ea\u6ba1\u67b2\ua6a7\ufbe0\uc481\u2b14\ueaa9\u1cff\u8393\ud78d\ub736\u08ff\ud550\u6990")).contains(StringUtils$StringUtils.p("\uaea1\uafcc\u7241"))) {
            System.setProperty(StringUtils$StringUtils.p("\uaea5\uafcf\u724d\u5106\ua2f5\u938c\u50ff\u1941\u7d43\uc48f\u118d\ua1ea\u6ba1\u67b2\ua6a7\ufbe0\uc481\u2b14\ueaa9\u1cff\u8393\ud78d\ub736\u08ff\ud550\u6990"), System.getProperty(StringUtils$StringUtils.p("\uaea5\uafcf\u724d\u5106\ua2f5\u938c\u50ff\u1941\u7d43\uc48f\u118d\ua1ea\u6ba1\u67b2\ua6a7\ufbe0\uc481\u2b14\ueaa9\u1cff\u8393\ud78d\ub736\u08ff\ud550\u6990")) + StringUtils$StringUtils.p("\uaeb3") + StringUtils$StringUtils.p("\uaea1\uafcc\u7241"));
        }
    }
}
