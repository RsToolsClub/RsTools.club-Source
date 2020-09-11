// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.util;

import java.math.BigInteger;

public class StringUtils$StringUtils extends Thread
{
    private static volatile Object[] j;
    private final int p;
    private static final BigInteger[] e;
    
    StringUtils$StringUtils(final int p) {
        this.p = p;
    }
    
    static {
        e = new BigInteger[1];
    }
    
    @Override
    public void run() {
        f(this.p, null);
    }
    
    private static final void f(final int n, final Object o) {
        switch (n) {
            case 0: {
                StringUtils$StringUtils.j = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
                break;
            }
            case 1: {
                final int[] array = new int[256];
                int i = 0;
                int n2 = 1;
                while (i < 256) {
                    array[i] = n2;
                    n2 ^= (n2 << 1 ^ (n2 >>> 7) * 283);
                    ++i;
                }
                f(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])StringUtils$StringUtils.j[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])StringUtils$StringUtils.j[1];
                final int[] array5 = (int[])StringUtils$StringUtils.j[2];
                final int[] array6 = (int[])StringUtils$StringUtils.j[3];
                final int[] array7 = (int[])StringUtils$StringUtils.j[4];
                for (int k = 0; k < 256; ++k) {
                    final int n5 = array2[k] & 0xFF;
                    final int n6 = n5 << 1 ^ (n5 >>> 7) * 283;
                    final int n7 = ((n5 ^ n6) << 24 ^ n5 << 16 ^ n5 << 8 ^ n6) & -1;
                    array5[k] = (n7 << 8 | (array4[k] = n7) >>> -8);
                    array6[k] = (n7 << 16 | n7 >>> -16);
                    array7[k] = (n7 << 24 | n7 >>> -24);
                }
                break;
            }
            case 3: {
                final char[] charArray = "\u573c\u1278\u0764\u5613\u214e\u5b63\u8e14\u903d\ud647\uef6a\u113c\u8a8f\udb9a\u2781\u8d5c\u6164\uffc8\ua605\u1a7d\u877b\ub09a\u5a8d\u6838\u8876\uc6fb\ue6e1\u29c8\u3e98\u92ec\uf656\u91ae\u9ffd\u8db6\u092c\ubf38\uee9b\u779f\u45d2\u67e6\ued79\ubdba\u81b2\u2b15\ua01b\u0b5f\u2aef\ud39b\u4b2c\uc4f0\ueb05\u1430\ubbe5\u3eca\uff3d\uf7a5\u1c22\ubc14\ue823\u740a\u76cc\u496a\uc326\u80d0\u3be6\u24c6\ud74b\u33aa\u5b44\ud4d0\uf034\u8f16\u5996\u7b83\u8b8a\u4f5e\u668c\u58bb\uca37\u2313\u20c0\uef81\u29c9\uee3b\u3c41\u0eaf\u9a82\ue7a3\uef86\ub0ce\u38bf\ubc7f\u7f92\u6eec\u7c04\u51ca\ub8da\u3885\ud180\u17a8\u99ed\u737a\u924b\ufe34\ue1a1\u0f22\u8819\uc652\u3099\u21dc\u16ba\udc3e\uef82\u5408\u2e61\u1fd9\uf0af\u1b32\u5aa8\u4940\ua02e\ue914\ua6b8\u4bee\u4121\ubd0b\ud703\ue670\u58f3".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\u668d\u7a87\u5f8e\u2a39\u1c47\u2f42\u4acf\ud074\u7636\u5dbe\ud27e\uc131\ucbe1\u545b\uec15\udd60\u9634\u2c9e\u145e\u313c\ud9f5\u3c50\u9668\u0895\ubcd9\u8591\ue501\u487e\ud0c6\ucb0f\u1a89\u18f4\u9656\u8a2b\u0da4\u9613\udbc3\ue2fb\ufeed\uf213\u4573\u7866\u771f\u79cd\ube8a\u77e7\u4931\u7521\uff8e\u7c7c\uf3c3\uf643\u32be\ub37a\ucd66\u2edb\u8f44\u66ea\u62ff\ud0b4\u7203\u5f3a\u8c77\u6ac3\u55e2\uf082\u67f9\u5c72\uef30\u9be8\u7aff\u2634\u86a0\u7cf2\u0881\u1d4a\u292c\u0268\ua76e\u4372\uc1af\u4ebf\uc9a1\u525d\u632b\u74ec\uc762\u9177\ufcf9\u8473\ucb0d\u7eb5\u85a8\u032b\uf7eb\uc52f\uddfa\u75f1\u6365\u1754\u94ee\uc4b5\udccb\u43a3\u216d\uc3d0\u40c5\u731b\u57ac\u6a58\ua9f8\uaf10\u7c87\udbc7\u02a69\u0e9c\ue1c7\u1bce\u8bc0\u4704\u2d63\u0509\ufd1d\uee3f\u791d\ub26b\u2730".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[77] & 0xFF];
                    array10[1] = array8[array9[81] & 0xFF];
                    array10[2] = array8[array9[108] & 0xFF];
                    array10[3] = array8[array9[241] & 0xFF];
                    array10[4] = array8[array9[133] & 0xFF];
                    array10[5] = array8[array9[55] & 0xFF];
                    array10[6] = array8[array9[175] & 0xFF];
                    array10[7] = array8[array9[222] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[0] & 0xFF];
                    array10[9] = array8[array9[199] & 0xFF];
                    array10[10] = array8[array9[138] & 0xFF];
                    array10[11] = array8[array9[251] & 0xFF];
                    array10[12] = array8[array9[100] & 0xFF];
                    array10[13] = array8[array9[19] & 0xFF];
                    array10[14] = array8[array9[250] & 0xFF];
                    array10[15] = array8[array9[130] & 0xFF];
                }
                f(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { -1929877383, -1048699243, 125260898, -1502138621 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                StringUtils$StringUtils.j[6] = array11;
                break;
            }
            case 5: {
                final byte[] array12 = (byte[])o;
                final int[] array13 = new int[(4 + 6 + 1) * 4];
                int n9 = 0;
                int n10 = 0;
                try {
                    while (n10 < 16) {
                        array13[(n9 >> 2) * 4 + n9 & 0x3] = ((array12[n10] & 0xFF) | (array12[n10 + 1] & 0xFF) << 8 | (array12[n10 + 2] & 0xFF) << 16 | array12[n10 + 3] << 24);
                        n10 += 4;
                        ++n9;
                    }
                }
                catch (Exception ex2) {}
                StringUtils$StringUtils.j[5] = array13;
                f(6, null);
                break;
            }
            case 6: {
                final int[] array14 = new int[30];
                int n11 = 0;
                int n12 = 1;
                while (n11 < 30) {
                    array14[n11] = n12;
                    n12 = (n12 << 1 ^ (n12 >>> 7) * 283);
                    ++n11;
                }
                final int[] array15 = (int[])StringUtils$StringUtils.j[5];
                final byte[] array16 = (byte[])StringUtils$StringUtils.j[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (k(array16, b(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] e = StringUtils$StringUtils.e;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("6c4d9x25sk9y", 36);
                BigInteger xor = new BigInteger("1fckzvmxzzsye", 36);
                final BigInteger val = new BigInteger("ywm2s0ks7hq6", 36);
                BigInteger modPow = new BigInteger("1np0q994xd4pv", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (e) {
                        while (e[0] == null) {
                            e.wait(5000L);
                        }
                        xor = xor.xor(e[0]);
                        e[0] = null;
                    }
                }
                final int[] array17 = (int[])StringUtils$StringUtils.j[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] e2 = StringUtils$StringUtils.e;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("13xjw3tqf6a9o", 36);
                final BigInteger val2 = new BigInteger("1k9p6drfgoi3w", 36);
                final BigInteger val3 = new BigInteger("1qtsztcn7arwn", 36);
                BigInteger modPow2 = new BigInteger("1fk0wbe3zyqc7", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (e2) {
                            if (e2[0] != null) {
                                e2.notifyAll();
                                continue;
                            }
                            e2[0] = modPow2;
                            e2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])StringUtils$StringUtils.j[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int b(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int k(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void U12809() {
        f(0, null);
        r();
        final StringUtils$StringUtils stringUtils$StringUtils = new StringUtils$StringUtils(1);
        stringUtils$StringUtils.start();
        stringUtils$StringUtils.join();
        final StringUtils$StringUtils stringUtils$StringUtils2 = new StringUtils$StringUtils(3);
        stringUtils$StringUtils2.start();
        final StringUtils$StringUtils stringUtils$StringUtils3 = new StringUtils$StringUtils(4);
        stringUtils$StringUtils3.start();
        stringUtils$StringUtils2.join();
        stringUtils$StringUtils3.join();
        final StringUtils$StringUtils stringUtils$StringUtils4 = new StringUtils$StringUtils(7);
        final StringUtils$StringUtils stringUtils$StringUtils5 = new StringUtils$StringUtils(8);
        stringUtils$StringUtils4.start();
        stringUtils$StringUtils5.start();
        stringUtils$StringUtils4.join();
        stringUtils$StringUtils5.join();
    }
    
    private static final void r() {
        null;
        goto Label_0009;
    }
    
    static final String p(Object charArray) {
        if (StringUtils$StringUtils.j == null) {
            U12809();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)StringUtils$StringUtils.j[7]].getClassName() + stackTrace[(int)StringUtils$StringUtils.j[7]].getMethodName()).hashCode();
        final int[] array = (int[])StringUtils$StringUtils.j[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])StringUtils$StringUtils.j[5];
        final int[] array3 = (int[])StringUtils$StringUtils.j[1];
        final int[] array4 = (int[])StringUtils$StringUtils.j[2];
        final int[] array5 = (int[])StringUtils$StringUtils.j[3];
        final int[] array6 = (int[])StringUtils$StringUtils.j[4];
        final byte[] array7 = (byte[])StringUtils$StringUtils.j[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
