// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.javax;

import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class j
{
    private static final Object[] Mn;
    private static final Class[] R;
    private static final int[] K;
    private static final short[] M;
    private static final int J;
    private static final int u;
    
    static {
        J = Integer.parseInt(SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\uba1f\u4968\ufe85\ud1fd\u491e\uedb2\u9a23\u3822\u6b72"));
        u = Integer.parseInt(SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\uba19\u496e\ufe86\ud1fe\u4917\uedbe\u9a2b\u3828\u6b77\uf6c6"));
        Mn = new Object[45];
        R = new Class[21];
        K = new int[45];
        final char[] charArray = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\u5130\ub921\ub72a\u118b\u3071\u20cc\uca06\uea88\u5a31\u8148\u72fc\u77d5\u0a41\u3c9d\u639d\u93bd\uf5f1\u223a\u1df7\ue926\u7510\u35d4\u85d8\uc2f6\ufac8\u4851\u9a5c\uc06e\u0b76\ucb82\ud3d4\u2b97\ud8f5\uc60b\u1c72\u4d7f\u1e61\u0630\uc04a\ucf3f\uc536\u0a8e\ufab0\uc87d\u0cda\ue40c\ufa9f\uc68f\ud4d3\u0fb5\u2d46\u9066\u8791\u57e8\u88af\u0abf\u7bb5\u0cf6\u2798\ub5aa\u30d2\u4e6c\ua356\uea17\u78af\u9fd3\u8ec0\u9a5b\u9e12\u93b8\u952c\ue324\uef3b\u1750\uea7d\uf600\uc4d5\uab48\ueb7b\u2ac6\u17a9\ubfc9\u870f\ubfe2\u3942\uaa99\u332b\ue58a\u8c62\u5703").toCharArray();
        for (int i = 0; i < 45; ++i) {
            j.K[i] = (charArray[i * 2] | charArray[i * 2 + 1] << 16);
        }
        M = new short[45];
        final char[] charArray2 = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\uba2c\u495b\ufeb9\ud1dd\u4922\ued8b\u9a1b\u3813\u6b40\uf6e4\u8ab6\u83a6\u4288\u7821\uc6c6\uadf3\u36f6\u2de7\u8fb5\ud348\u9865\u66f3\u6cef\ude54\uee71\uffbc\ufc2c\u07b9\uee53\u9472\u6942\u6576\ud119\ubd14\u236a\u54d1\u75f9\u4fd8\u8cc6\ua66c\u4d87\u7f5b\u6e3e\u440c\u7f3c").toCharArray();
        for (int j = 0; j < 45; ++j) {
            j.M[j] = (short)charArray2[j];
        }
    }
    
    private static Class F(final int n, final int n2) {
        final int n3 = ((j.M[n] & 0xFFFF) + n2) % 21;
        final Class clazz = j.R[n3];
        if (clazz != null) {
            return clazz;
        }
        return j.R[n3] = r(n3);
    }
    
    private static Class r(final int i) {
        String className = null;
        switch (i) {
            case 0: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6b9\ub0b8\u9e29\ua75e\u8ae3\u2e6d\u8b7c\u3347\u731f\ub682\u6749\u4c51\ua430\u99f2\ue64d\u65f9\u3f03\u39ae\ud395\u57b3\u75f6\ubeb4\u2833\u8306\u0c01\u3afc\uc958\u1b04\u6cc9\u7eda\ubcc6\ua5af\u5666\u992b\uc5de\ub12c\uc5de\u762a\ud52b");
                break;
            }
            case 1: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6b9\ub0b8\u9e29\ua75e\u8ae3\u2e6d\u8b7c\u3347\u731f\ub682\u6749\u4c68\ua400\u99c8\ue645\u65f5\u3f48\u39be\ud3ab\u5791\u75f1\ubea5\u2835\u8322\u0c07\u3afc\uc95a");
                break;
            }
            case 2: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e69\u8b64\u3347\u7307\ub6c9\u6704\u4c54\ua43f\u99e7\ue659\u65f3\u3f5f\u3998\ud3aa\u578b\u75b1\ubea1\u2822\u8339\u0c03\u3afa\uc957\u1b4f\u6cec\u7eed\ubcc6\ua5ac\u5661\u992d\uc5ff\ub137\uc5d8\u7629\ud520\u8f00\u035f");
                break;
            }
            case 3: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6b9\ub0b8\u9e29\ua75e\u8ae3\u2e6d\u8b7c\u3347\u731f\ub682\u6749\u4c51\ua430\u99f2\ue64d\u65f9\u3f03\u39ae\ud395\u57b3\u75f6\ubeb4\u2833\u8306\u0c01\u3afc\uc958\u1b04\u6cc9\u7eda\ubcc6\ua5af\u5666\u992b\uc5de\ub12c\uc5de\u762a\ud52b\u8f29\u0350\uf192\uf417\uf22e\u751c");
                break;
            }
            case 4: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6b9\ub0b8\u9e29\ua75e\u8ae3\u2e6d\u8b7c\u3347\u731f\ub682\u6749\u4c51\ua435\u99e6\ue64f\u65b5\u3f03\u39b7\ud380\u57bd\u75dc\ubef4\u2805\u8322\u0c0f\u3ae7\uc951\u1b0c\u6cc8\u7ef7\ubcdd");
                break;
            }
            case 5: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6b9\ub0b8\u9e29\ua75e\u8ae3\u2e6d\u8b7c\u3347\u731f\ub682\u6749\u4c51\ua435\u99e6\ue64f\u65b5\u3f03\u39b7\ud380\u57bd\u75dc\ubef4\u2806\u8324\u0c0b\u3ae3\uc955\u1b13\u6cc8\u7efd\ubcfa\ua5b5\u5669\u993a\uc5d8\ub135\uc5d2\u762b\ud531");
                break;
            }
            case 6: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8ae8\u2e32\u8b63\u335f\u7307\ub6c9\u6724\u4c54\ua43f\u99ea\ue649\u65e2\u3f59\u3994\ud3ab\u5791\u75da\ubeb6\u2833\u8338\u0c1a");
                break;
            }
            case 7: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e69\u8b64\u3347\u7307\ub6c9\u672b\u4c52\ua422\u99f0");
                break;
            }
            case 8: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8ae8\u2e32\u8b63\u335f\u7307\ub6c9\u6724\u4c54\ua43f\u99ea\ue649\u65e2\u3f59\u3994\ud3ab\u5791\u75da\ubeb6\u2833\u8338\u0c1a\u3adf\uc95d\u1b12\u6cd9\u7efc\ubcc7\ua5a4\u567a");
                break;
            }
            case 9: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e69\u8b64\u3347\u7307\ub6c9\u6726\u4c49\ua423\u99e5\ue655\u65cd\u3f44\u398e\ud3b0");
                break;
            }
            case 10: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e6f\u8b61\u3342\u7345\ub6a4\u6708\u4c55\ua43f\u99e1\ue64f\u65f5\u3f44\u3992\ud3aa");
                break;
            }
            case 11: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e70\u8b71\u3340\u730c\ub6c9\u6728\u4c59\ua43b\u99e1\ue64f\u65f5");
                break;
            }
            case 12: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e70\u8b71\u3340\u730c\ub6c9\u6724\u4c57\ua430\u99f7\ue65f");
                break;
            }
            case 13: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6b9\ub0b8\u9e29\ua75e\u8ae3\u2e6d\u8b7c\u3347\u731f\ub682\u6749\u4c51\ua430\u99f2\ue64d\u65f9\u3f03\u39ae\ud395\u57b3\u75f6\ubeb4\u2833\u8306\u0c01\u3afc\uc958\u1b04\u6cc9\u7eda\ubcc6\ua5af\u5666\u992b\uc5de\ub12c\uc5de\u762a\ud52b\u8f45\u0300");
                break;
            }
            case 14: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e70\u8b71\u3340\u730c\ub6c9\u6715\u4c5e\ua437\u99e8\ue649\u65e2\u3f59\u39d3\ud394\u578d\u75f0\ubeb8\u282f");
                break;
            }
            case 15: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6b9\ub0b8\u9e29\ua75e\u8ae3\u2e6d\u8b7c\u3347\u731f\ub682\u6749\u4c51\ua430\u99f2\ue64d\u65f9\u3f03\u39ae\ud395\u57b3\u75f6\ubeb4\u2833\u8315\u0c01\u3afd\uc95a\u1b04\u6cce\u7eed\ubcc0\ua5ae\u5666\u991e\uc5d2\ub137\uc5db\u7601\ud524\u8f15\u0350\uf1af\uf41c\uf237\u750b\u959d\u4e40");
                break;
            }
            case 16: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e70\u8b71\u3340\u730c\ub6c9\u6715\u4c5e\ua437\u99e8\ue649\u65e2\u3f59\u39d3\ud389\u579a\u75eb\ubea8\u2839\u8332");
                break;
            }
            case 17: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e70\u8b71\u3340\u730c\ub6c9\u6734\u4c4f\ua423\u99ed\ue642\u65e6");
                break;
            }
            case 18: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e70\u8b71\u3340\u730c\ub6c9\u6725\u4c54\ua43e\u99e8\ue649\u65e0\u3f43");
                break;
            }
            case 19: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e6f\u8b61\u3342\u7345\ub6b4\u6736\u4c77\ua414\u99fc\ue64f\u65e4\u3f5d\u3989\ud3ad\u5790\u75f1");
                break;
            }
            case 20: {
                className = SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\ue6bc\ub0ab\u9e38\ua711\u8abe\u2e70\u8b71\u3340\u730c\ub6c9\u6715\u4c5e\ua437\u99e8\ue649\u65e2\u3f59\u39d3\ud38d\u5791\u75e9\ubeaf\u2835\u8337\u0c1a\u3afa\uc95b\u1b0f\u6cf9\u7ef8\ubcdb\ua5a6\u566d\u993a\uc5f8\ub120\uc5d4\u7620\ud535\u8f15\u0358\uf193\uf41d");
                break;
            }
            default: {
                throw new NoClassDefFoundError(Integer.toString(i));
            }
        }
        return Class.forName(className);
    }
    
    static Method H(int n) {
        n = ((n + 1919124097 ^ j.J) + 1139576438 ^ 0x4C1EAB18) - j.u;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Method method = (Method)j.Mn[n];
        if (method != null) {
            return method;
        }
        final Class f;
        Class superclass = f = F(n, n2);
        final int n3 = j.K[n];
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
                    return (Method)(j.Mn[n] = method2);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class superclass2 = f; superclass2 != null; superclass2 = superclass2.getSuperclass()) {
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
                        return (Method)(j.Mn[n] = method3);
                    }
                }
            }
        }
        return null;
    }
    
    static Object C(final int i, final Object[] args) {
        try {
            final Method h = H(i);
            if (h == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return h.invoke(null, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object o(final Object obj, final int i, final Object[] args) {
        try {
            final Method h = H(i);
            if (h == null) {
                throw new NoSuchMethodError(Integer.toString(i));
            }
            return h.invoke(obj, args);
        }
        catch (InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
    
    static Object h(int i, final Object[] initargs) {
        try {
            i = ((i + 1919124097 ^ j.J) + 1139576438 ^ 0x4C1EAB18) - j.u;
            final int n = i >>> 16;
            i &= 0xFFFF;
            final Class f = F(i, n);
            Constructor constructor = (Constructor)j.Mn[i];
            if (constructor == null) {
                final int n2 = j.K[i];
                for (final Constructor constructor2 : f.getDeclaredConstructors()) {
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
                        j.Mn[i] = constructor2;
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
    
    private static Field g(int n) throws Throwable {
        n = ((n + 1919124097 ^ j.J) + 1139576438 ^ 0x4C1EAB18) - j.u;
        final int n2 = n >>> 16;
        n &= 0xFFFF;
        final Class f;
        Class superclass = f = F(n, n2);
        final Field field = (Field)j.Mn[n];
        if (field != null) {
            return field;
        }
        final int n3 = j.K[n];
        while (superclass != null) {
            for (final Field obj : superclass.getDeclaredFields()) {
                if (n3 == 31 * (31 * (31 * (31 * n2 + obj.getName().hashCode()) + 58) + obj.getType().getName().hashCode()) + n2) {
                    obj.setAccessible(true);
                    if (Modifier.isStatic(obj.getModifiers()) && Modifier.isFinal(obj.getModifiers())) {
                        final Field declaredField = Field.class.getDeclaredField(SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\u93a7\ucd73\ufed8\ua2f2\u9aa2\ufc52\uc2bd\u3809\ub97f"));
                        declaredField.setAccessible(true);
                        declaredField.setInt(obj, obj.getModifiers() & 0xFFFFFFEF);
                    }
                    return (Field)(j.Mn[n] = obj);
                }
            }
            superclass = superclass.getSuperclass();
        }
        for (Class clazz = f; clazz != null; clazz = clazz.getSuperclass()) {
            final Class[] interfaces = clazz.getInterfaces();
            for (int length2 = interfaces.length, j = 0; j < length2; ++j) {
                for (final Field obj2 : interfaces[j].getFields()) {
                    if (n3 == 31 * (31 * (31 * (31 * n2 + obj2.getName().hashCode()) + 58) + obj2.getType().getName().hashCode()) + n2) {
                        obj2.setAccessible(true);
                        if (Modifier.isStatic(obj2.getModifiers()) && Modifier.isFinal(obj2.getModifiers())) {
                            final Field declaredField2 = Field.class.getDeclaredField(SQLitePooledConnection$SQLiteConnectionPoolDataSource.F("\u93a7\ucd73\ufed8\ua2f2\u9aa2\ufc52\uc2bd\u3809\ub97f"));
                            declaredField2.setAccessible(true);
                            declaredField2.setInt(obj2, obj2.getModifiers() & 0xFFFFFFEF);
                        }
                        return (Field)(j.Mn[n] = obj2);
                    }
                }
                clazz = clazz.getSuperclass();
            }
        }
        return null;
    }
    
    static Object e(final Object obj, final int i) {
        final Field g = g(i);
        if (g == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        return g.get(obj);
    }
    
    static void f(final Object obj, final int i, final Object value) throws Throwable {
        final Field g = g(i);
        if (g == null) {
            throw new NoSuchFieldError(Integer.toString(i));
        }
        g.set(obj, value);
    }
    
    static Object b(final int n) {
        return e(null, n);
    }
    
    static void u(final int n, final Object o) {
        f(null, n, o);
    }
}
