// 
// Decompiled by Procyon v0.5.36
// 

package andre;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class g
{
    private static final Object[] Du;
    private static final Class[] D;
    private static final int[] f;
    private static final short[] o;
    private static final int B;
    private static final int z;
    
    static {
        B = Integer.parseInt(l.h("\u5267\u0f38\u8ce8\u30ba\ua2b5\ud64d\u16f7\u7687\ub188"));
        z = Integer.parseInt(l.h("\u5279\u0f3c\u8cec\u30b8\ua2ba\ud64f\u16f5\u7685\ub188\u219a"));
        Du = new Object[65];
        D = new Class[20];
        f = new int[65];
        final char[] charArray = l.h("\u4485\u5961\u521b\ub84d\u53ff\u097e\u5605\u26df\u40c7\ucf00\u7c64\u78d6\udb70\u2c5e\u774c\ufa50\ud629\u859d\u1d8c\ube67\u3cc0\u5a3c\u6f2c\u3700\u1b79\u0c42\u6691\u4d6b\u7e2b\u3b4e\u9468\ud30c\u4608\u28d7\u3f9c\u6978\u6faf\u4767\u8605\ub269\u5e74\u1575\uf2a8\u5dab\u8de1\u0ea5\uf4c2\u57d8\ucdda\u8357\u65bf\u9727\u0f0b\u5cb3\u4b15\u99b1\uf3b3\uea85\ubff5\u2923\ua9b1\u33de\uefa9\u9f5e\ua132\u30c9\u4fdb\uda23\ue344\u2c6a\uf15e\u0fd7\u3018\uf2d6\ub992\ud528\u8225\uc7c0\uc6b7\u1d07\ud030\ub43e\uabe4\ub3f1\u9be2\uef83\u72c2\udbab\u83d5\u62d7\u184a\u26d4\u0894\u9c6e\ubc48\ufc67\u7d1a\u64be\udef9\u696b\u4217\u0cd0\u7f93\ud214\u3edc\u38a5\u9176\u3117\uf69f\uf5b6\u43db\uc930\u1c63\u2d99\u5591\u3e0f\ub741\u56ca\u16ab\u45f7\u27f4\u628f\u9b86\u6a31\u9cd6\ud75f\ufe61\uf4a9\u1657\u45ec").toCharArray();
        for (int i = 0; i < 65; ++i) {
            g.f[i] = (charArray[i * 2] | charArray[i * 2 + 1] << 16);
        }
        o = new short[65];
        final char[] charArray2 = l.h("\u525c\u0f09\u8cde\u3087\ua28d\ud670\u16c3\u76b3\ub1a3\u21a5\u408d\udb28\u0b8b\u0a46\u40ff\u70d1\ubf71\u4ac7\u6c2b\u3084\u8b2e\u2d39\ud8f4\u1b9d\ud79b\u974e\ueb19\u8cf6\u100e\u5fd8\ub9e6\u345f\ua52a\uee85\ub56a\u7541\u0da1\u729d\u382b\ua526\u9ca1\u82df\ua2f7\u2b6b\ue4c0\u5cf1\u6bf2\uf066\uf0a4\ud145\u6b67\ue0c8\u6454\u10cc\u28af\u3539\ua5a5\u965c\ucf56\uf7d4\uc693\uba64\u9f56\uc58a\ubb38").toCharArray();
        for (int j = 0; j < 65; ++j) {
            g.o[j] = (short)charArray2[j];
        }
    }
    
    private static Class u(final int n, final int n2) {
        final int n3 = ((g.o[n] & 0xFFFF) + n2) % 20;
        final Class clazz = g.D[n3];
        if (clazz != null) {
            return clazz;
        }
        return g.D[n3] = T(n3);
    }
    
    private static Class T(final int i) {
        String className = null;
        switch (i) {
            case 0: {
                className = l.h("\ud584\u71c8\ufdfa\udf8d\ube45\u80dd\ud4f9\u3d32\u0586\uf1ab\uf2b1\uf6b5\u65f2\u2487\u1af4");
                break;
            }
            case 1: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809f\ud4d2\u3d3d\u0593\uf1d7\uf2a9\uf6ba\u65f2\u2483\u1ae1\uf45f\uc387\u2514\u91b8\u6554\uf694\u802b\ued0b\u6d72\ud267\ud9f6\uf7db\uf7b1\u0fb2\u96e0\u0f5e\u6877\u8167\uf8f7\u46be\u1598\u99f4\ua11b");
                break;
            }
            case 2: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809f\ud4d2\u3d3d\u0593\uf1d7\uf297\uf6af\u65ee\u248b\u1ae8\uf45d");
                break;
            }
            case 3: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809f\ud4d2\u3d3d\u0593\uf1d7\uf297\uf6a2\u65ef\u2496\u1ae3\uf457");
                break;
            }
            case 4: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809f\ud4d2\u3d3d\u0593\uf1d7\uf297\uf6af\u65ee\u248b\u1ae8\uf45d\uc3a8\u2504\u91bf\u654c\uf6de\u8003\ued18");
                break;
            }
            case 5: {
                className = l.h("\ud584\u71c8\ufdfa\udf8d\ube45\u80dd\ud4f1\u3d36\u0593\uf190\uf2aa");
                break;
            }
            case 6: {
                className = l.h("\ud584\u71c8\ufdfa\udf8d\ube45\u80dd\ud4fd\u3d32\u0599\uf19c\uf283\uf6be\u65f2\u2487\u1af4\uf45b\uc39e\u251e\u91a4");
                break;
            }
            case 7: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u8086\ud4c7\u3d3a\u0598\uf1d7\uf296\uf6ba\u65f2\u2486\u1ae9\uf457");
                break;
            }
            case 8: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809a\ud4dc\u3d7d\u05a4\uf18b\uf2ad\uf6b5\u65e8\u24b1\u1af2\uf448\uc38f\u2510\u91bb");
                break;
            }
            case 9: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809f\ud4d2\u3d3d\u0593\uf1d7\uf281\uf6b5\u65e9\u248f");
                break;
            }
            case 10: {
                className = l.h("\ud584\u71c8\ufdfa\udf8d\ube45\u80dd\ud4f9\u3d32\u0586\uf1ba\uf2a8\uf6ba\u65ef\u2491\u1aca\uf455\uc38b\u2515\u91b3\u6552");
                break;
            }
            case 11: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809d\ud4d6\u3d27\u05da\uf1ac\uf296\uf697");
                break;
            }
            case 12: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809d\ud4d6\u3d27\u05da\uf1b3\uf2a5\uf6a9\u65c9\u24b0\u1aca\uf479\uc385\u251f\u91b8\u6545\uf6d9\u8012\ued03\u6d73\ud268");
                break;
            }
            case 13: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u8086\ud4c7\u3d3a\u0598\uf1d7\uf2ae\uf6ba\u65ee\u24cc\u1ac7\uf44e\uc39e\u2503\u91bf\u6542\uf6cf\u8012\ued0f\u6d6f\ud222\ud9df\uf7df\uf7b1\u0fb2");
                break;
            }
            case 14: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u8086\ud4c7\u3d3a\u0598\uf1d7\uf2ae\uf6ba\u65ee\u24cc\u1ac7\uf44e\uc39e\u2503\u91bf\u6542\uf6cf\u8012\ued0f\u6d6f");
                break;
            }
            case 15: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809f\ud4d2\u3d3d\u0593\uf1d7\uf28b\uf6b9\u65f6\u2487\u1ae5\uf44e");
                break;
            }
            case 16: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809f\ud4d2\u3d3d\u0593\uf1d7\uf287\uf6b7\u65fd\u2491\u1af5");
                break;
            }
            case 17: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809f\ud4d2\u3d3d\u0593\uf1d7\uf2b6\uf6be\u65fa\u248e\u1ae3\uf459\uc39e\u255f\u919b\u6545\uf6ce\u800e\ued05\u6d78");
                break;
            }
            case 18: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809f\ud4d2\u3d3d\u0593\uf1d7\uf292\uf6b4\u65f5\u2486");
                break;
            }
            case 19: {
                className = l.h("\ud58f\u71c7\ufde8\udf9e\ube0e\u809f\ud4d2\u3d3d\u0593\uf1d7\uf2b6\uf6be\u65fa\u248e\u1ae3\uf459\uc39e\u255f\u919b\u654f\uf6de\u800f\ued0c\u6d75\ud263\ud9e3");
                break;
            }
            default: {
                throw new NoClassDefFoundError(Integer.toString(i));
            }
        }
        return Class.forName(className);
    }
    
    static Method v(int n) {
        n = ((n + 1502577472 ^ g.B) - 273025230 ^ 0xD349B706) + g.z;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Method method = (Method)g.Du[n];
        if (method != null) {
            return method;
        }
        final Class u;
        Class superclass = u = u(n, n2);
        final int n3 = g.f[n];
        while (superclass != null) {
            for (final Method method2 : superclass.isInterface() ? superclass.getMethods() : superclass.getDeclaredMethods()) {
                int n4 = 31 * (n2 * 31 + method2.getName().hashCode()) + 40;
                final Class<?>[] parameterTypes = method2.getParameterTypes();
                for (int j = 0; j < parameterTypes.length; ++j) {
                    final Class<?> clazz = parameterTypes[j];
                    if (j != 0) {
                        n4 = 31 * n4 + 44;
                    }
                    n4 = 31 * n4 + clazz.getName().hashCode();
                }
                if (n3 == 31 * (31 * (31 * n4 + 41) + method2.getReturnType().getName().hashCode()) + n2) {
                    method2.setAccessible(true);
                    return (Method)(g.Du[n] = method2);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class superclass2 = u; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
            final Class[] interfaces = superclass2.getInterfaces();
            for (int length2 = interfaces.length, k = 0; k < length2; ++k) {
                for (final Method method3 : interfaces[k].getMethods()) {
                    int n5 = 31 * (n2 * 31 + method3.getName().hashCode()) + 40;
                    final Class<?>[] parameterTypes2 = method3.getParameterTypes();
                    for (int n6 = 0; n6 < parameterTypes2.length; ++n6) {
                        final Class<?> clazz2 = parameterTypes2[n6];
                        if (n6 != 0) {
                            n5 = 31 * n5 + 44;
                        }
                        n5 = 31 * n5 + clazz2.getName().hashCode();
                    }
                    if (n3 == 31 * (31 * (31 * n5 + 41) + method3.getReturnType().getName().hashCode()) + n2) {
                        method3.setAccessible(true);
                        return (Method)(g.Du[n] = method3);
                    }
                }
            }
        }
        return null;
    }
    
    static Object O(final int i, final Object[] args) {
        try {
            final Method v = v(i);
            if (v == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return v.invoke(null, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object z(final Object obj, final int i, final Object[] args) {
        try {
            final Method v = v(i);
            if (v == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return v.invoke(obj, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object g(int i, final Object[] initargs) {
        try {
            i = ((i + 1502577472 ^ g.B) - 273025230 ^ 0xD349B706) + g.z;
            final int n = i >>> 16;
            i &= 0xFFFF;
            final Class u = u(i, n);
            Constructor constructor = (Constructor)g.Du[i];
            if (constructor == null) {
                final int n2 = g.f[i];
                for (final Constructor constructor2 : u.getDeclaredConstructors()) {
                    int n3 = n * 31 + 40;
                    final Class[] parameterTypes = constructor2.getParameterTypes();
                    for (int k = 0; k < parameterTypes.length; ++k) {
                        final Class clazz = parameterTypes[k];
                        if (k != 0) {
                            n3 = 31 * n3 + 44;
                        }
                        n3 = 31 * n3 + clazz.getName().hashCode();
                    }
                    if (n2 == 31 * (31 * n3 + 41) + n) {
                        constructor2.setAccessible(true);
                        g.Du[i] = constructor2;
                        constructor = constructor2;
                        break;
                    }
                }
            }
            if (constructor == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return constructor.newInstance(initargs);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    private static Field z(int n) throws Throwable {
        n = ((n + 1502577472 ^ g.B) - 273025230 ^ 0xD349B706) + g.z;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Class u;
        Class superclass = u = u(n, n2);
        final Field field = (Field)g.Du[n];
        if (field != null) {
            return field;
        }
        final int n3 = g.f[n];
        while (superclass != null) {
            for (final Field obj : superclass.getDeclaredFields()) {
                if (n3 == 31 * (31 * (31 * (31 * n2 + obj.getName().hashCode()) + 58) + obj.getType().getName().hashCode()) + n2) {
                    obj.setAccessible(true);
                    if (Modifier.isStatic(obj.getModifiers()) && Modifier.isFinal(obj.getModifiers())) {
                        final Field declaredField = Field.class.getDeclaredField(l.h("\u38f2\u3bf5\u857c\u83fe\ua3e9\ucf4e\u1ca1\u8bca\uf67f"));
                        declaredField.setAccessible(true);
                        declaredField.setInt(obj, obj.getModifiers() & 0xFFFFFFEF);
                    }
                    return (Field)(g.Du[n] = obj);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class clazz = u; clazz != null; clazz = clazz.getSuperclass()) {
            final Class[] interfaces = clazz.getInterfaces();
            for (int length2 = interfaces.length, j = 0; j < length2; ++j) {
                for (final Field obj2 : interfaces[j].getFields()) {
                    if (n3 == 31 * (31 * (31 * (31 * n2 + obj2.getName().hashCode()) + 58) + obj2.getType().getName().hashCode()) + n2) {
                        obj2.setAccessible(true);
                        if (Modifier.isStatic(obj2.getModifiers()) && Modifier.isFinal(obj2.getModifiers())) {
                            final Field declaredField2 = Field.class.getDeclaredField(l.h("\u38f2\u3bf5\u857c\u83fe\ua3e9\ucf4e\u1ca1\u8bca\uf67f"));
                            declaredField2.setAccessible(true);
                            declaredField2.setInt(obj2, obj2.getModifiers() & 0xFFFFFFEF);
                        }
                        return (Field)(g.Du[n] = obj2);
                    }
                }
                clazz = clazz.getSuperclass();
            }
        }
        return null;
    }
    
    static Object o(final Object obj, final int i) {
        final Field z = z(i);
        if (z == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        return z.get(obj);
    }
    
    static void w(final Object obj, final int i, final Object value) throws Throwable {
        final Field z = z(i);
        if (z == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        z.set(obj, value);
    }
    
    static Object S(final int n) {
        return o(null, n);
    }
    
    static void C(final int n, final Object o) {
        w(null, n, o);
    }
}
