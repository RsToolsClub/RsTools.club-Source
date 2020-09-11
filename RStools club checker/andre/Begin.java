// 
// Decompiled by Procyon v0.5.36
// 

package andre;

import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.io.IOException;
import java.net.URL;

public class Begin
{
    public static void beginLoad(final String[] array) {
        final JarClassLoader jarClassLoader = new JarClassLoader((URL)g.S(97078067));
        String s = null;
        try {
            s = invokedynamic(173mi6m:(Ljava/lang/Object;)Ljava/lang/String;, jarClassLoader);
        }
        catch (IOException ex) {
        }
        // invokedynamic(ar4i75:(Ljava/lang/Object;)V, i.Ut((Object)"\u6209\ua8f1\u9863\u3ac6\u75f0\u5073\ud375\ue8bf\u9aba\uba50\ub4b0\ub3b0\ue306\u720f\u5dbd\u29eaT\u9035\u429c\u2bf6\u53b4\u62f4\ue573\u1f83\u755b\u64cd\u6a98\uf3e1\ua98f\ua7d4"))
        if (s == null) {
        }
        // invokedynamic(ar4i75:(Ljava/lang/Object;)V, i.Ut((Object)"\u6201\ua8ea\u9862\u3ada\u75eb\u5033\ud332\ue8d3\u9a9e\uba78\ub4fb\ub3f2\ue351\u727a\u5dba\u29e5@\u9038\u4295\u2bbf\u53a4\u62bb\ue53f\u1f8f\u7540\u64cd\u6a95\uf3e7\ua99e\ua79f"))
        final String[] array2 = new String[array.length + 1];
        // invokedynamic(-rafdoo:(Ljava/lang/Object;ILjava/lang/Object;II)V, array, false, array2, false, array.length)
        array2[array2.length - 1] = i.Ut("\u6261\ua8f0\u9864\u3aca\u75ea\u502b\ud334\ue89f\u9aba\uba5f\ub4b4\ub3b0\ue313\u7240\u5da3\u29e8M\u9035\u4294\u2bab\u53e4\u62e6\ue52d\u1fd9\u750b");
        try {
        }
        // invokedynamic(l9si74:(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V, jarClassLoader, s, array2)
        catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException ex2) {
        }
        // invokedynamic(ar4i75:(Ljava/lang/Object;)V, i.Ut((Object)"\u6209\ua8f1\u9863\u3ac6\u75f0\u507d\ud339\ue89c\u9ab2\uba5f\ub4bc\ub3b2\ue318\u720f\u5db5\u29f4R\u9038\u4299\u2bfc\u53b1\u62a0\ue576\u1f85\u7556\u6486"))
        try {
        }
        // invokedynamic(pc6i73:(Ljava/lang/Object;)V, jarClassLoader)
        catch (IOException ex3) {
        }
        // invokedynamic(ar4i75:(Ljava/lang/Object;)V, i.Ut((Object)"\u621c\ua8f1\u987e\u3acb\u75ee\u5038\ud338\ue8d3\u9ab6\uba55\ub4b1\ub3b5\ue311\u7248\u5df4\u29c7n"))
    }
    
    private static Object oh(final Object o, final Object o2, final Object o3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)o).unreflect(g.v(Integer.valueOf((String)o2, 32))).asType((MethodType)o3));
        }
        catch (ClassNotFoundException | IllegalAccessException ex) {
            final Object cause;
            throw new BootstrapMethodError((Throwable)cause);
        }
    }
}
