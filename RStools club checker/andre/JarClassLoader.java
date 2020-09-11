// 
// Decompiled by Procyon v0.5.36
// 

package andre;

import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.IOException;
import java.util.jar.Attributes;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLClassLoader;

public class JarClassLoader extends URLClassLoader
{
    private URL url;
    
    public JarClassLoader(final URL url) {
        super(new URL[] { url });
        this.url = url;
    }
    
    public String getMainClassName() throws IOException {
        final Attributes attributes = invokedynamic(-1mrtdoh:(Ljava/lang/Object;)Ljava/util/jar/Attributes;, (JarURLConnection)invokedynamic(-1fcldp0:(Ljava/lang/Object;)Ljava/net/URLConnection;, new URL(l.h("\uf17c\u2e48\u8ff8"), "", invokedynamic(-prtd9n:(Ljava/lang/Object;)Ljava/lang/String;, invokedynamic(-sebd9m:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;, invokedynamic(-1f0bdov:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;, new StringBuilder(), (URL)g.o(this, -5289758)), l.h("\uf137\u2e06"))))));
        return (attributes != null) ? invokedynamic(-9t3do3:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;, attributes, (Attributes.Name)g.S(-1885255442)) : null;
    }
    
    public void invokeClass(final String name, final String[] array) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        final Method method = invokedynamic(1p2ii7r:(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Class;)Ljava/lang/reflect/Method;, this.loadClass(name), l.h("\u6078\u4197\uafdb\u904f"), new Class[] { invokedynamic(1hc2i7s:(Ljava/lang/Object;)Ljava/lang/Class;, array) });
        // invokedynamic(-f1rdo6:(Ljava/lang/Object;Z)V, method, true)
        final int n = invokedynamic(-nl9do7:(Ljava/lang/Object;)I, method);
        if (invokedynamic(1iggi7o:(Ljava/lang/Object;)Ljava/lang/Class;, method) != g.S(-407222041) || !invokedynamic(k3ii76:(I)Z, n) || !invokedynamic(1i6ui7l:(I)Z, n)) {
            throw new NoSuchMethodException(l.h("\u6078\u4197\uafdb\u904f"));
        }
        try {
        }
        // invokedynamic(-mr5doc:(Ljava/lang/Object;)Ljava/lang/Class;, l.h((Object)"\u607a\u4184\uafd5\u900f\u9a78\u46c7\u98eb\ube0a\ubdcb\u18a6\u9066\u68af\u1bde\u627b\ucdd2"))
        // invokedynamic(-jh1dod:(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;, method, null, new Object[] { array })
        catch (IllegalAccessException ex) {}
    }
    
    private static Object wT(final Object o, final Object o2, final Object o3) {
        try {
            return new ConstantCallSite(((MethodHandles.Lookup)o).unreflect(g.v(Integer.valueOf((String)o2, 32))).asType((MethodType)o3));
        }
        catch (ClassNotFoundException | IllegalAccessException ex) {
            final Object cause;
            throw new BootstrapMethodError((Throwable)cause);
        }
    }
}
