// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc4;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class kt
{
    private static final Object[] V;
    private static final Class[] M;
    private static final int[] n;
    private static final short[] R;
    private static final int Y;
    private static final int f;
    
    static {
        Y = Integer.parseInt(JDBC4DatabaseMetaData$JDBC4ResultSet.I("\ub8a5\u97bf\ue3e2\ub3ac\u3c43\u4646\u2654\u2ef7\u33be"));
        f = Integer.parseInt(JDBC4DatabaseMetaData$JDBC4ResultSet.I("\ub8bd\u97be\ue3e3\ub3a5\u3c48\u464b\u2655\u2eff\u33b2\u7b81"));
        V = new Object[39];
        M = new Class[13];
        n = new int[39];
        final char[] charArray = JDBC4DatabaseMetaData$JDBC4ResultSet.I("\ud5d8\ud6b6\udb9d\ud370\ue4a4\u7339\u38bf\uc5d9\u9a6a\uf815\uac5b\u8eb4\ufbd1\ud790\ua1b9\u9b15\u6dd3\u33fd\u61a7\ua37d\ue7dd\u038d\u815a\u2e52\ue7b9\u0a3f\uf4af\u7f55\u6830\u9b77\u75fc\u8a82\uf05d\u9f81\u16f6\u0ea5\u26dd\u5045\ua46f\u5de2\uf83d\u93d7\u29d5\u6289\u760e\uc941\ud5f2\u969a\ubbf4\uf925\u4127\u9bc4\u54d1\u41af\ud46a\uf29f\ub73f\u4200\uea5c\u6970\uc719\u4a6f\uf3c5\u5da4\u711f\ufbc3\u2d2d\uf27e\u3134\u00d5\uca32\ub919\u0c2a\uf6f8\u0db0\u2b08\ufb2e\u8b53").toCharArray();
        for (int i = 0; i < 39; ++i) {
            kt.n[i] = (charArray[i * 2] | charArray[i * 2 + 1] << 16);
        }
        R = new short[39];
        final char[] charArray2 = JDBC4DatabaseMetaData$JDBC4ResultSet.I("\ub890\u9785\ue3d2\ub391\u3c71\u4672\u2668\u2ec1\u3382\u7bbf\u1294\ubc78\u091c\u6b61\u4847\u9f09\u879a\u3c3f\ud197\u9b24\u11e1\u80f7\ue093\u5a0e\u75fa\u492a\u9e13\ud5e1\uda61\uec85\u5a50\u09cd\u9a64\u7e05\u2777\u7c22\ud11a\u4ee4\ua516").toCharArray();
        for (int j = 0; j < 39; ++j) {
            kt.R[j] = (short)charArray2[j];
        }
    }
    
    private static Class y(final int n, final int n2) {
        final int n3 = ((kt.R[n] & 0xFFFF) + n2) % 13;
        final Class clazz = kt.M[n3];
        if (clazz != null) {
            return clazz;
        }
        return kt.M[n3] = L(n3);
    }
    
    private static Class L(final int i) {
        String className = null;
        switch (i) {
            case 0: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc291\u4f0f\u52ea\u337e\ub7a8\u314c\ueb92\u723d\u8a14\u60df\u2428\u14aa\uf33e\u57f9\uf8aa");
                break;
            }
            case 1: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc291\u4f0f\u52ea\u337e\ub7a8\u3153\ueb82\u723f\u8a5d\u60a2\u243a\u148a\uf319\u57ef\uf8b8\u93f7\u306c\uc251\uf94d\ue062\u1e14\u43a9\uf11c\u0562\u7f46\u96a2\u7933\u0928\ub150\ucca8\u8ae2\ua6b4\u49fa\uc612\u2480\ue097\ue5f7\uec74\u2a64\u03da");
                break;
            }
            case 2: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc294\u4f1c\u52fb\u3331\ub7f5\u3151\ueb9f\u723a\u8a07\u6094\u2445\u14ac\uf33b\u57e8\uf8ba\u93b7\u3037\uc269\uf96c\ue06e\u1e38\u43e9\uf10c\u0578\u7f58\u96bc\u7939\u0939\ub150\ucca4\u8ae9\ua69f");
                break;
            }
            case 3: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc294\u4f1c\u52fb\u3331\ub7f5\u3151\ueb9f\u723a\u8a07\u6094\u2445\u14ac\uf33b\u57e8\uf8ba\u93b7\u3037\uc269\uf96c\ue06e\u1e38\u43e9\uf11c\u0563\u7f57\u96a6\u7939\u0937\ub141\ucca3\u8af2");
                break;
            }
            case 4: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc294\u4f1c\u52fb\u3331\ub7f5\u3151\ueb9f\u723a\u8a07\u6094\u2445\u14ac\uf33b\u57e8\uf8ba\u93b7\u3037\uc269\uf96c\ue06e\u1e38\u43e9\uf11f\u0565\u7f53\u96a2\u793d\u0928\ub141\ucca9\u8ad5\ua685\u49e3\uc605\u2480\ue08a\ue5e6\uec73\u2a7f");
                break;
            }
            case 5: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc291\u4f0f\u52ea\u337e\ub7a8\u3153\ueb82\u723f\u8a5d\u60a2\u241f\u14a7\uf32b\u57ef\uf8b4\u93e6\u3077\uc257");
                break;
            }
            case 6: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc291\u4f0f\u52ea\u337e\ub7a8\u3153\ueb82\u723f\u8a5d\u60a2\u243a\u148a\uf31a\u57f2\uf8ba\u93e6\u3069\uc257\uf941\ue043\u1e15");
                break;
            }
            case 7: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc294\u4f1c\u52fb\u3331\ub7f5\u3151\ueb9f\u723a\u8a07\u6094\u2445\u14ac\uf33b\u57e8\uf8ba\u93b7\u3037\uc269\uf96c\ue06e\u1e38\u43e9\uf11d\u0572\u7f45\u96a7\u7930\u092e\ub177\ucca8\u8af2\ua6d5\u49d1\uc600\u2489\ue08e\ue5f7\uec78\u2a48\u03d8\u102e\u1cbd");
                break;
            }
            case 8: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc294\u4f1c\u52fb\u3331\ub7f5\u3151\ueb9f\u723a\u8a07\u6094\u2445\u14ac\uf33b\u57e8\uf8ba\u93b7\u3037\uc269\uf96c\ue06e\u1e38\u43e9\uf11d\u0572\u7f45\u96a7\u7930\u092e\ub177\ucca8\u8af2");
                break;
            }
            case 9: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc291\u4f0f\u52ea\u337e\ub7a8\u314c\ueb92\u723d\u8a14\u60df\u2438\u14b2\uf32d\u57e3\uf8b7\u93e4");
                break;
            }
            case 10: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc291\u4f0f\u52ea\u337e\ub7a8\u314c\ueb92\u723d\u8a14\u60df\u2426\u14a7\uf32b\u57e2");
                break;
            }
            case 11: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc291\u4f0f\u52ea\u337e\ub7a8\u3149\ueb9c\u727d\u8a20\u6085\u2419\u14af\uf331\u57ed\uf88b\u93e6\u3078\uc247\uf94d\ue05e");
                break;
            }
            case 12: {
                className = JDBC4Statement$JDBC4PreparedStatement.q("\uc291\u4f0f\u52ea\u337e\ub7a8\u3149\ueb9c\u727d\u8a31\u6088\u241f\u14a3\uf31e\u57f8\uf8ab\u93e2\u3060\uc26a\uf946\ue05c\u1e0e\u43a9\uf11c\u0563\u7f44\u96b7\u793d\u0937");
                break;
            }
            default: {
                throw new NoClassDefFoundError(Integer.toString(i));
            }
        }
        return Class.forName(className);
    }
    
    static Method p(int n) {
        n = ((n + 230883107 ^ kt.Y) + 918690285 ^ 0x63D7006E) - kt.f;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Method method = (Method)kt.V[n];
        if (method != null) {
            return method;
        }
        final Class y;
        Class superclass = y = y(n, n2);
        final int n3 = kt.n[n];
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
                    return (Method)(kt.V[n] = method2);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class superclass2 = y; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
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
                        return (Method)(kt.V[n] = method3);
                    }
                }
            }
        }
        return null;
    }
    
    static Object Q(final int i, final Object[] args) {
        try {
            final Method p2 = p(i);
            if (p2 == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return p2.invoke(null, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object R(final Object obj, final int i, final Object[] args) {
        try {
            final Method p3 = p(i);
            if (p3 == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return p3.invoke(obj, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object k(int i, final Object[] initargs) {
        try {
            i = ((i + 230883107 ^ kt.Y) + 918690285 ^ 0x63D7006E) - kt.f;
            final int n = i >>> 16;
            i &= 0xFFFF;
            final Class y = y(i, n);
            Constructor constructor = (Constructor)kt.V[i];
            if (constructor == null) {
                final int n2 = kt.n[i];
                for (final Constructor constructor2 : y.getDeclaredConstructors()) {
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
                        kt.V[i] = constructor2;
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
    
    private static Field l(int n) throws Throwable {
        n = ((n + 230883107 ^ kt.Y) + 918690285 ^ 0x63D7006E) - kt.f;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Class y;
        Class superclass = y = y(n, n2);
        final Field field = (Field)kt.V[n];
        if (field != null) {
            return field;
        }
        final int n3 = kt.n[n];
        while (superclass != null) {
            for (final Field obj : superclass.getDeclaredFields()) {
                if (n3 == 31 * (31 * (31 * (31 * n2 + obj.getName().hashCode()) + 58) + obj.getType().getName().hashCode()) + n2) {
                    obj.setAccessible(true);
                    if (Modifier.isStatic(obj.getModifiers()) && Modifier.isFinal(obj.getModifiers())) {
                        final Field declaredField = Field.class.getDeclaredField(JDBC4Statement$JDBC4PreparedStatement.q("\udc24\u0bfd\ued26\u459a\u1dc1\u61ac\uacd4\u022a\u7bb0"));
                        declaredField.setAccessible(true);
                        declaredField.setInt(obj, obj.getModifiers() & 0xFFFFFFEF);
                    }
                    return (Field)(kt.V[n] = obj);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class clazz = y; clazz != null; clazz = clazz.getSuperclass()) {
            final Class[] interfaces = clazz.getInterfaces();
            for (int length2 = interfaces.length, j = 0; j < length2; ++j) {
                for (final Field obj2 : interfaces[j].getFields()) {
                    if (n3 == 31 * (31 * (31 * (31 * n2 + obj2.getName().hashCode()) + 58) + obj2.getType().getName().hashCode()) + n2) {
                        obj2.setAccessible(true);
                        if (Modifier.isStatic(obj2.getModifiers()) && Modifier.isFinal(obj2.getModifiers())) {
                            final Field declaredField2 = Field.class.getDeclaredField(JDBC4Statement$JDBC4PreparedStatement.q("\udc24\u0bfd\ued26\u459a\u1dc1\u61ac\uacd4\u022a\u7bb0"));
                            declaredField2.setAccessible(true);
                            declaredField2.setInt(obj2, obj2.getModifiers() & 0xFFFFFFEF);
                        }
                        return (Field)(kt.V[n] = obj2);
                    }
                }
                clazz = clazz.getSuperclass();
            }
        }
        return null;
    }
    
    static Object P(final Object obj, final int i) {
        final Field l = l(i);
        if (l == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        return l.get(obj);
    }
    
    static void e(final Object obj, final int i, final Object value) throws Throwable {
        final Field l = l(i);
        if (l == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        l.set(obj, value);
    }
    
    static Object r(final int n) {
        return P(null, n);
    }
    
    static void s(final int n, final Object o) {
        e(null, n, o);
    }
}
