// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.util;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class n
{
    private static final Object[] i;
    private static final Class[] M;
    private static final int[] T;
    private static final short[] E;
    private static final int o;
    private static final int I;
    
    static {
        o = Integer.parseInt(ResourceFinder$OSInfo.Z("\u5fa8\u881b\u3958\ue596\uf746\u3333\udcea\u1281\u65f5\u1d4d\u7908"));
        I = Integer.parseInt(ResourceFinder$OSInfo.Z("\u5fa8\u881f\u395d\ue59b\uf747\u3335\udcee\u128f\u65f2\u1d4d"));
        i = new Object[52];
        M = new Class[17];
        T = new int[52];
        final char[] charArray = ResourceFinder$OSInfo.Z("\uae9a\u93d6\udc88\u792a\u1c57\u502a\uf4bd\u7085\u5d20\udf88\u6873\ub2f5\u1bd2\ubeba\uf512\uba10\udbe6\u5289\u8dc7\u2adc\u6346\u4486\u80ef\u1e21\u3f9d\u85f9\u2a90\u2ffd\ue275\u6266\uadb0\u831b\u2ff2\ua190\ufd49\uee82\u4b28\ue9e5\u9ab7\uc846\u4ce2\uccf4\u65fc\ufba3\u51ad\u4349\uffc6\uf5bd\ub008\u8aff\ub0db\u4f7f\uba68\u02fe\ufcaf\uef1d\u6aa0\ubee2\ua8d5\u88c7\u3e8c\u0a56\u50ee\u68bd\ud138\u584d\u8745\ud515\u6f9c\u273b\u15a6\u8f98\u79d3\uee5d\u0f11\u5245\ua3a7\ua1c3\u95e9\u0801\u2dd3\ua20d\ue685\ucea4\uedb2\ue3a7\u901a\uee40\u4f58\u0f02\u8e2e\uc684\uaa64\u1400\u17ef\u1f59\uc1e2\uc953\u1fa2\u9672\u9517\ud0f0\uc8b9\ue2db").toCharArray();
        for (int j = 0; j < 52; ++j) {
            n.T[j] = (charArray[j * 2] | charArray[j * 2 + 1] << 16);
        }
        E = new short[52];
        final char[] charArray2 = ResourceFinder$OSInfo.Z("\u5f95\u8820\u3968\ue5af\uf761\u330d\udcd2\u12b2\u65cc\u1d7c\u7935\uc265\ue81d\uc88e\ufb0b\uc4e8\u3097\u7158\u7e5e\u95e5\u6474\u7532\u1b3c\u60f0\u5c5f\u964c\u3048\uc176\udfa3\u959f\u7e6c\u7381\u4cf1\u68c1\u2614\u8611\uc848\u3ce2\u261d\u5586\ucdcb\u3737\u566d\u9b39\u45b9\ubd51\u7db7\u47e8\u4122\uc835\u8675\ua732").toCharArray();
        for (int k = 0; k < 52; ++k) {
            n.E[k] = (short)charArray2[k];
        }
    }
    
    private static Class b(final int n, final int n2) {
        final int n3 = ((n.E[n] & 0xFFFF) + n2) % 17;
        final Class clazz = n.M[n3];
        if (clazz != null) {
            return clazz;
        }
        return n.M[n3] = A(n3);
    }
    
    private static Class A(final int i) {
        String className = null;
        switch (i) {
            case 0: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4bb0\u5db6\uf791\u509e\u0292\u9ff1\uc12e\u505c\u3138\u7142\u1c90\u3a90\uf72a\uc29b\ub023\u4832\uc949\ufc69");
                break;
            }
            case 1: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4ba9\u5da3\uf796\u5095\u0292\u9fee\uc133\u505d\u3125");
                break;
            }
            case 2: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4ba9\u5da3\uf796\u5095\u0292\u9feb\uc12e\u504b\u3123\u714d\u1c83\u3abd\uf72d");
                break;
            }
            case 3: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4bb0\u5db6\uf791\u509e\u0292\u9ff1\uc12e\u505c\u3138\u7142\u1c90");
                break;
            }
            case 4: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4bb0\u5db6\uf791\u509e\u0292\u9ff1\uc123\u505d\u3125\u7149\u1c9a");
                break;
            }
            case 5: {
                className = ResourceFinder$OSInfo.Z("\ud04f\ubc12\u3acb\u3e9c\u9373\u4bad\u5dbb\uf796\u508d\u02d9\u9f8c\uc12f\u505a\u3138\u7140\u1cd9\u3a9d\uf70c\uc2bb\ub021\u4830\uc943");
                break;
            }
            case 6: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4bb5\u5db8\uf7d1\u50a9\u02ce\u9fcb\uc134\u505a\u3102\u7158\u1c85\u3ab7\uf73e\uc29f");
                break;
            }
            case 7: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4bb0\u5db6\uf791\u509e\u0292\u9ff0\uc12f\u5040\u3125\u7145\u1c9a\u3ab7");
                break;
            }
            case 8: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4bb0\u5db6\uf791\u509e\u0292\u9ff2\uc128\u5041\u3132\u7149\u1c84\u3aa1");
                break;
            }
            case 9: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4bb5\u5db8\uf7d1\u50bb\u02c5\u9fd6\uc13f\u506f\u3123\u715e\u1c96\u3aab\uf710\uc287\ub03b\u4826\uc959\ufc6f\u0d44\uc9f5\u043e\u3d9d\u8fc8\u9bcf");
                break;
            }
            case 10: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4bb5\u5db8\uf7d1\u50b0\u02d2\u9fd2\uc12f\u505a\u3102\u7158\u1c85\u3ab7\uf73e\uc29f");
                break;
            }
            case 11: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4bb0\u5db6\uf791\u509e\u0292\u9ff6\uc132\u505c\u313e\u715b\u1c96\u3ab0\uf733\uc297");
                break;
            }
            case 12: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4ba9\u5da3\uf796\u5095\u0292\u9fee\uc135\u504d\u3130\u7140\u1c92");
                break;
            }
            case 13: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4ba9\u5da3\uf796\u5095\u0292\u9fea\uc13b\u505d\u3139\u7161\u1c96\u3aa2");
                break;
            }
            case 14: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4bb0\u5db6\uf791\u509e\u0292\u9fe1\uc136\u504f\u3122\u715f");
                break;
            }
            case 15: {
                className = ResourceFinder$OSInfo.Z("\ud04f\ubc12\u3acb\u3e9c\u9373\u4bad\u5dbb\uf796\u508d\u02d9\u9f8c\uc12f\u505a\u3138\u7140\u1cd9\u3a80\uf73a\uc281\ub020\u4823\uc95e\ufc78\u0d72\uc9c7\u0425\u3d96\u8fcd\u9bc7\u1621");
                break;
            }
            case 16: {
                className = ResourceFinder$OSInfo.Z("\ud04a\ubc01\u3ada\u3ed3\u932e\u4bb0\u5db6\uf791\u509e\u0292\u9ff2\uc13b\u504d\u313a\u714d\u1c90\u3ab7");
                break;
            }
            default: {
                throw new NoClassDefFoundError(Integer.toString(i));
            }
        }
        return Class.forName(className);
    }
    
    static Method N(int n) {
        n = ((n - 1095446604 ^ n.o) + 1250883144 ^ 0x5F084BC1) + n.I;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Method method = (Method)n.i[n];
        if (method != null) {
            return method;
        }
        final Class b;
        Class superclass = b = b(n, n2);
        final int n3 = n.T[n];
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
                    return (Method)(n.i[n] = method2);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class superclass2 = b; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
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
                        return (Method)(n.i[n] = method3);
                    }
                }
            }
        }
        return null;
    }
    
    static Object g(final int i, final Object[] args) {
        try {
            final Method n = N(i);
            if (n == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return n.invoke(null, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object s(final Object obj, final int i, final Object[] args) {
        try {
            final Method n = N(i);
            if (n == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return n.invoke(obj, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object v(int i, final Object[] initargs) {
        try {
            i = ((i - 1095446604 ^ n.o) + 1250883144 ^ 0x5F084BC1) + n.I;
            final int n = i >>> 16;
            i &= 0xFFFF;
            final Class b = b(i, n);
            Constructor constructor = (Constructor)org.sqlite.util.n.i[i];
            if (constructor == null) {
                final int n2 = org.sqlite.util.n.T[i];
                for (final Constructor constructor2 : b.getDeclaredConstructors()) {
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
                        org.sqlite.util.n.i[i] = constructor2;
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
    
    private static Field w(int n) throws Throwable {
        n = ((n - 1095446604 ^ n.o) + 1250883144 ^ 0x5F084BC1) + n.I;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Class b;
        Class superclass = b = b(n, n2);
        final Field field = (Field)n.i[n];
        if (field != null) {
            return field;
        }
        final int n3 = n.T[n];
        while (superclass != null) {
            for (final Field obj : superclass.getDeclaredFields()) {
                if (n3 == 31 * (31 * (31 * (31 * n2 + obj.getName().hashCode()) + 58) + obj.getType().getName().hashCode()) + n2) {
                    obj.setAccessible(true);
                    if (Modifier.isStatic(obj.getModifiers()) && Modifier.isFinal(obj.getModifiers())) {
                        final Field declaredField = Field.class.getDeclaredField(StringUtils$StringUtils.p("\ud8bd\u581b\u21f3\ud1cf\ucbbc\uc13a\u754f\u9da9\uf661"));
                        declaredField.setAccessible(true);
                        declaredField.setInt(obj, obj.getModifiers() & 0xFFFFFFEF);
                    }
                    return (Field)(n.i[n] = obj);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class clazz = b; clazz != null; clazz = clazz.getSuperclass()) {
            final Class[] interfaces = clazz.getInterfaces();
            for (int length2 = interfaces.length, j = 0; j < length2; ++j) {
                for (final Field obj2 : interfaces[j].getFields()) {
                    if (n3 == 31 * (31 * (31 * (31 * n2 + obj2.getName().hashCode()) + 58) + obj2.getType().getName().hashCode()) + n2) {
                        obj2.setAccessible(true);
                        if (Modifier.isStatic(obj2.getModifiers()) && Modifier.isFinal(obj2.getModifiers())) {
                            final Field declaredField2 = Field.class.getDeclaredField(StringUtils$StringUtils.p("\ud8bd\u581b\u21f3\ud1cf\ucbbc\uc13a\u754f\u9da9\uf661"));
                            declaredField2.setAccessible(true);
                            declaredField2.setInt(obj2, obj2.getModifiers() & 0xFFFFFFEF);
                        }
                        return (Field)(n.i[n] = obj2);
                    }
                }
                clazz = clazz.getSuperclass();
            }
        }
        return null;
    }
    
    static Object v(final Object obj, final int i) {
        final Field w = w(i);
        if (w == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        return w.get(obj);
    }
    
    static void m(final Object obj, final int i, final Object value) throws Throwable {
        final Field w = w(i);
        if (w == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        w.set(obj, value);
    }
    
    static Object L(final int n) {
        return v(null, n);
    }
    
    static void U(final int n, final Object o) {
        m(null, n, o);
    }
}
