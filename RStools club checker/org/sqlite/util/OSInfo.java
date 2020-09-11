// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.util;

import java.io.IOException;
import java.util.HashMap;

public class OSInfo
{
    private static HashMap<String, String> archMapping;
    public static final String X86;
    public static final String X86_64;
    public static final String IA64_32;
    public static final String IA64;
    public static final String PPC;
    public static final String PPC64;
    
    public static void main(final String[] array) {
        if (array.length >= 1) {
            if (n.s(ResourceFinder$OSInfo.Z("\u9f81\u532b\ub779\ueb76"), 1261649198, new Object[] { array[0] })) {
                n.s(n.L(1943223599), -2041168591, new Object[] { n.g(844250416, null) });
                return;
            }
            if (n.s(ResourceFinder$OSInfo.Z("\u9f81\u532b\ub777\ueb77\ufc7a\u3dba"), 1261649198, new Object[] { array[0] })) {
                n.s(n.L(1943223599), -2041168591, new Object[] { n.g(-1635500750, null) });
                return;
            }
        }
        n.s(n.L(1943223599), -2041168591, new Object[] { n.g(506936627, null) });
    }
    
    public static String getNativeLibFolderPathForCurrentOS() {
        return (String)n.s(n.s(n.s(n.s(n.v(1301167416, null), 925515052, new Object[] { n.g(844250416, null) }), 925515052, new Object[] { StringUtils$StringUtils.p("\ueced") }), 925515052, new Object[] { n.g(-1635500750, null) }), -1724170963, null);
    }
    
    public static String getOSName() {
        return (String)n.g(-1238352571, new Object[] { n.g(-2023080636, new Object[] { StringUtils$StringUtils.p("\u514b\ud22a\u5eb8\u52db\u7161\u2052\u319e") }) });
    }
    
    public static boolean isAndroid() {
        return (boolean)n.s(n.s(n.g(1118846278, new Object[] { ResourceFinder$OSInfo.Z("\u5c17\ud85e\u21d8\uaccc\ub24a\uf57b\ubfc0\ua9a7\u67bd\u9412\ue1b3\u511c\u7428\uea6d\u52c4\u9598\u46db"), "" }), 1908686151, null), 1522285896, new Object[] { ResourceFinder$OSInfo.Z("\u5c1c\ud851\u21ca\uacdf\ub20b\uf560\ubfd1") });
    }
    
    static String getHardwareName() {
        try {
            final Object s = n.s(n.g(1602370889, null), -321110710, new Object[] { ResourceFinder$OSInfo.Z("\u3b0e\u5a93\udc76\u0f8e\ufab1\u5a94\ua7bb\u302e") });
            (int)n.s(s, 1983069515, null);
            final Object s2 = n.s(s, 1443118396, null);
            try {
                final Object v = n.v(650263869, null);
                final byte[] array = new byte[32];
                int intValue;
                while ((intValue = (int)n.s(s2, -51430082, new Object[] { array, 0, array.length })) >= 0) {
                    n.s(v, 1624784191, new Object[] { array, 0, intValue });
                }
                final Object s3 = n.s(v, -732414656, null);
                if (s2 != null) {
                    n.s(s2, 1404452161, null);
                }
                return (String)s3;
            }
            finally {
                if (s2 != null) {
                    n.s(s2, 1404452161, null);
                }
                throw;
            }
        }
        catch (Throwable t2) {
            n.s(n.L(-1312539326), -523748076, new Object[] { n.s(n.s(n.s(n.v(1301167416, null), 925515052, new Object[] { ResourceFinder$OSInfo.Z("\u3b3e\u5a8f\udc65\u0f8c\ufaa6\u5a94\ua7e1\u302b\u7f7a\u8b22\uffa0\u66fd\u4fc6\u538b\uaeea\u173b\u742e\u3f02\u60b3\uefbe\ube4c\u5dd2\ue12a\u271d\u31d7\ua610\u5226\u63a0\u27aa\u897a") }), 925515052, new Object[] { n.s(t2, 1070611779, null) }), -1724170963, null) });
            return ResourceFinder$OSInfo.Z("\u3b0e\u5a93\udc7c\u0f8d\ufabb\u5ac3\ua7f8");
        }
    }
    
    static String resolveArmArchType() {
        if (n.s(n.g(-2023080636, new Object[] { StringUtils$StringUtils.p("\udc7f\u52ff\u5dd9\u370c\u70f3\uc8c8\uf824") }), 1522285896, new Object[] { StringUtils$StringUtils.p("\udc5c\u52e5\u5d99\u3717\u70ea") })) {
            final Object g = n.g(923680021, null);
            if (n.s(g, -2084618986, new Object[] { StringUtils$StringUtils.p("\udc71\u52fe\u5d9a\u3714\u70a4") })) {
                return StringUtils$StringUtils.p("\udc71\u52fe\u5d9a\u3714\u70a4");
            }
            if (n.s(g, -2084618986, new Object[] { StringUtils$StringUtils.p("\udc71\u52fe\u5d9a\u3714\u70a5") })) {
                return StringUtils$StringUtils.p("\udc71\u52fe\u5d9a\u3714\u70a5");
            }
            if (n.s(g, -2084618986, new Object[] { StringUtils$StringUtils.p("\udc71\u52fe\u5d9a\u3714\u70a7") })) {
                return StringUtils$StringUtils.p("\udc71\u52fe\u5d9a");
            }
            if (n.s(g, 1261649198, new Object[] { StringUtils$StringUtils.p("\udc71\u52ed\u5d85\u3701\u70fa\uc893\uf875") })) {
                return StringUtils$StringUtils.p("\udc71\u52fe\u5d9a\u3754\u70a6");
            }
            final Object g2 = n.g(-2023080636, new Object[] { StringUtils$StringUtils.p("\udc63\u52f9\u5d99\u374c\u70f3\uc8d7\uf822\u30e9\uffb0\u77aa\ub71f\u61a9") });
            if (g2 != null && (boolean)n.s(g2, -2084618986, new Object[] { StringUtils$StringUtils.p("\udc77\u52e2\u5d82\u3707\u70f3\uc8c7\uf828\u30e9\ufff8") })) {
                return StringUtils$StringUtils.p("\udc71\u52fe\u5d9a\u3714\u70a5");
            }
            final Object g3 = n.g(-2023080636, new Object[] { StringUtils$StringUtils.p("\udc7a\u52ed\u5d81\u3703\u70bc\uc8cd\uf82e\u30ec\ufffb") });
            try {
                if ((int)n.s(n.s(n.g(1602370889, null), -321110710, new Object[] { StringUtils$StringUtils.p("\udc67\u52e4\u5d9e\u3701\u70fa\uc885\uf833\u30e4\uffff\u77af\ub718\u61ac\u66bb") }), 1983069515, null) == 0) {
                    if ((int)n.s(n.s(n.g(1602370889, null), -939770601, new Object[] { { StringUtils$StringUtils.p("\udc3f\u52ee\u5d9e\u370c\u70bd\uc8d6\uf829"), StringUtils$StringUtils.p("\udc3d\u52ef"), (String)n.s(n.s(n.s(n.s(n.v(1301167416, null), 925515052, new Object[] { StringUtils$StringUtils.p("\udc76\u52e5\u5d99\u3706\u70b2\uc882") }), 925515052, new Object[] { g3 }), 925515052, new Object[] { StringUtils$StringUtils.p("\udc37\u52ac\u5dda\u370c\u70f3\uc8c8\uf824\u30a1\uffb9\u77a7\ub714\u61a2\u66b7\u31ae\uf0c7\u6149\u5f20\u4240\ua918\u247f\u0518\ud8c6\u15ea\ue26a\u477a\u5785\udea8\uc7dc\u9a05\ub496\u362b\u872c\u56e3\u42b3\u888c\u94cc\u67ed\uad1f\uc8dc\u8f14\u836a\u6a4c\u9984\u4640\ub8af\uf945\u4659\ua186\ufc57\u767b\u29e5\u4da3\u8f9d\u014d\u8b84\u0f5c\u9d96\u8667\uf6ca\uaa68\uc6e4\u7c90\u62d7\ua9bb\ue544\uc712\u80d3\ub867\ufce0\uff66\u6db4\uee23\u526b\ub587\uc8df\u6e86\u7b76\ued1c\ue535\u7d7b\u615b\uca52\u13f8\u5d28\u46cb\uc5f4\u8198\u2d16\u6eb3") }), -1724170963, null) } }), 1983069515, null) == 0) {
                        return StringUtils$StringUtils.p("\udc71\u52fe\u5d9a\u3714\u70a5");
                    }
                }
                else {
                    n.s(n.L(-1312539326), -523748076, new Object[] { StringUtils$StringUtils.p("\udc47\u52cd\u5da5\u372c\u70db\uc8eb\uf806\u30a0\uffbe\u77b9\ub718\u61a1\u66b9\u31bd\uf0c6\u6101\u5f73\u4241\ua950\u242b\u0544\ud880\u15ed\ue27a\u4775\u5785\udea6\uc7d1\u9a77\ub4d7\u3639\u8762\u56f4\u42a6\u88de\u94c8\u67f6\uad5a\uc8cd\u8f1a\u832b\u6a41\u9987\u460c\ub8bb\uf910\u461a\ua1a9\ufc1e\u7669\u29a2\u4de4\u8f80\u0146\u8bd4\u0f1d\u9ddf\u8613\uf6ca\uaa7d\uc6d6\u7cb9\u62f3\ua9d2\ue568\uc73d\u80e6\ub843\ufcda\uff6a\u6dea\uee64\u5279\ub5cf\uc892\u6eb5\u7b5c\ued6c\ue574\u7d7b\u615d\uca5d\u13f8\u5d2f\u46da\uc5f2\u819e\u2d10\u6ee6\u7df6\u5c1f\u351d\u33fa\u875d\u3c16\uf2e5\u25f8\u2035\ud28d\u00e3\ud0bf\u8700\uf2da\u2919\ucabf\u7c93\u3a57\u5c15") });
                }
            }
            catch (IOException ex) {}
            catch (InterruptedException ex2) {}
        }
        return StringUtils$StringUtils.p("\udc71\u52fe\u5d9a");
    }
    
    public static String getArchName() {
        Object o = n.g(-2023080636, new Object[] { StringUtils$StringUtils.p("\u3b66\u725c\u3a55\u2d18\u2a70\u811f\ufd6e") });
        if (n.g(-605405928, null)) {
            return StringUtils$StringUtils.p("\u3b68\u7241\u3a1f\u2d0b\u2a6d\u8115\ufd62\u93dc\u6da7\uccd8\u46ad");
        }
        if (n.s(o, -2084618986, new Object[] { StringUtils$StringUtils.p("\u3b68\u725d\u3a16") })) {
            o = n.g(483081497, null);
        }
        else {
            final Object s = n.s(o, -402309861, new Object[] { n.L(-1919206118) });
            if (n.s(n.L(-437240564), -1382990579, new Object[] { s })) {
                return (String)n.s(n.L(-437240564), 2119580942, new Object[] { s });
            }
        }
        return (String)n.g(388513039, new Object[] { o });
    }
    
    static String translateOSNameToFolderName(final String s) {
        if (n.s(s, 1522285896, new Object[] { StringUtils$StringUtils.p("\u86b0\u0b79\u34b8\uac6c\ua2b1\u9732\uf02e") })) {
            return StringUtils$StringUtils.p("\u86b0\u0b79\u34b8\uac6c\ua2b1\u9732\uf02e");
        }
        if ((boolean)n.s(s, 1522285896, new Object[] { StringUtils$StringUtils.p("\u86aa\u0b71\u34b5") }) || (boolean)n.s(s, 1522285896, new Object[] { StringUtils$StringUtils.p("\u86a3\u0b71\u34a4\uac7f\ua2b7\u972b") })) {
            return StringUtils$StringUtils.p("\u86aa\u0b71\u34b5");
        }
        if (n.s(s, 1522285896, new Object[] { StringUtils$StringUtils.p("\u86ab\u0b79\u34b8\uac7d\ua2a6") })) {
            return StringUtils$StringUtils.p("\u86ab\u0b79\u34b8\uac7d\ua2a6");
        }
        if (n.s(s, 1522285896, new Object[] { StringUtils$StringUtils.p("\u86a6\u0b59\u348e") })) {
            return StringUtils$StringUtils.p("\u86a6\u0b59\u348e");
        }
        return (String)n.s(s, 859389200, new Object[] { StringUtils$StringUtils.p("\u86bb\u0b47"), "" });
    }
    
    static String translateArchNameToFolderName(final String s) {
        return (String)n.s(s, 859389200, new Object[] { StringUtils$StringUtils.p("\uf399\u4ddc"), "" });
    }
    
    static {
        PPC = ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab");
        IA64 = ResourceFinder$OSInfo.Z("\u5864\u0887\u35fe\u3bdc");
        X86 = ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe");
        IA64_32 = ResourceFinder$OSInfo.Z("\u5864\u0887\u35fe\u3bdc\ucebb\u23e9\ud6c3");
        PPC64 = ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab\u3bde\uced0");
        X86_64 = ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe\u3bb7\uced2\u23ee");
        n.U(-437240564, n.v(-2083832559, null));
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe"), ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5864\u08d5\u35f0\u3bde"), ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5864\u08d2\u35f0\u3bde"), ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5864\u08d3\u35f0\u3bde"), ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5864\u08d0\u35f0\u3bde"), ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u587d\u0883\u35a6\u3b9c\uce8d\u23af\ud69c"), ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe\u3bb7\uced2\u23ee"), ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe\u3bb7\uced2\u23ee") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u586c\u088b\u35ac\u3bde\uced0"), ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe\u3bb7\uced2\u23ee") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5868\u088b\u35fe\u3bdc\uce90"), ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe\u3bb7\uced2\u23ee") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5878\u0888\u35a1\u3b9e\uce81\u23a8\ud682\u622a\u084d"), ResourceFinder$OSInfo.Z("\u5875\u08de\u35fe\u3bb7\uced2\u23ee") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5864\u0887\u35fe\u3bdc"), ResourceFinder$OSInfo.Z("\u5864\u0887\u35fe\u3bdc") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5864\u0887\u35fe\u3bdc\uce93"), ResourceFinder$OSInfo.Z("\u5864\u0887\u35fe\u3bdc") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5864\u0887\u35fe\u3bdc\ucebb\u23e9\ud6c3"), ResourceFinder$OSInfo.Z("\u5864\u0887\u35fe\u3bdc\ucebb\u23e9\ud6c3") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u5864\u0887\u35fe\u3bdc\uce8a"), ResourceFinder$OSInfo.Z("\u5864\u0887\u35fe\u3bdc\ucebb\u23e9\ud6c3") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab"), ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u587d\u0889\u35bf\u3b8d\uce96"), ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u587d\u0889\u35bf\u3b8d\uce96\u23aa\ud692"), ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u587d\u0889\u35bf\u3b8d\uce96\u2385\ud681\u6228"), ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u587d\u0889\u35bf\u3b8d\uce96\u2385\ud683\u6238"), ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab\u3bde\uced0"), ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab\u3bde\uced0") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u587d\u0889\u35bf\u3b8d\uce96\u23ec\ud6c5"), ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab\u3bde\uced0") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u587d\u0889\u35bf\u3b8d\uce96\u23aa\ud692\u627d\u0815"), ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab\u3bde\uced0") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u587d\u0889\u35bf\u3b8d\uce96\u2385\ud681\u6228\u0817\u81ab"), ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab\u3bde\uced0") });
        n.s(n.L(-437240564), 1419263250, new Object[] { ResourceFinder$OSInfo.Z("\u587d\u0889\u35bf\u3b8d\uce96\u2385\ud683\u6238\u0817\u81ab"), ResourceFinder$OSInfo.Z("\u587d\u0896\u35ab\u3bde\uced0") });
    }
}
