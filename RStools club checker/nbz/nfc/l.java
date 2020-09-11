// 
// Decompiled by Procyon v0.5.36
// 

package nbz.nfc;

import java.math.BigInteger;

public class l extends Thread
{
    private static volatile Object[] T;
    private final int L;
    private static final BigInteger[] J;
    
    l(final int l) {
        this.L = l;
    }
    
    static {
        J = new BigInteger[1];
    }
    
    @Override
    public void run() {
        J(this.L, null);
    }
    
    private static final void J(final int n, final Object o) {
        switch (n) {
            case 0: {
                l.T = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                J(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])l.T[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])l.T[1];
                final int[] array5 = (int[])l.T[2];
                final int[] array6 = (int[])l.T[3];
                final int[] array7 = (int[])l.T[4];
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
                final char[] charArray = "\ubefb\ufbbf\ueea3\ubfd4\u2298\u77a5\u2ec5\u28d0\u3f8e\u4baa\u01fe\ub971\u34cf\u7bbc\u61ca\u2188\ubd51\ue3df\u3671\ufdb5\ue643\u8ebc\ud94e\u5240\u0c02\u8a8d\u2a1e\u125e\u323d\u4ebb\u7867\u3b3d\u9d74\u3ad2\u506d\ub2a6\u9b09\u053e\u257f\ua8a3\u91b6\ufb7c\u7dcc\u742a\uba29\uf0d9\u1962\u2740\u89ba\ud3dd\u1860\u019a\u0ddb\u53e1\ub71b\u1402\u5570\uf9a9\u15d9\ud57e\ueb6d\ua567\uf970\u27f2\u24d2\u49d9\u4270\u5e83\u575f\u314a\u0105\u8864\u9f89\u712a\u1403\ud019\u0c48\u1a06\ueb46\ud211\u0637\u14fc\u863f\u6198\ua585\ufdfc\u066d\ub5b9\ua748\ue994\u5d1f\u8f7d\u42cf\u087f\uf208\ufc79\uae33\u4547\u4434\u26a6\u25d1\u62f7\u044b\u94d7\u8cf3\u22e3\u7777\ub7b2\u7a23\u6ccf\u9116\u6f91\u7265\ua07f\ua3e6\u53e6\ufd19\uf477\u8a5c\uccbe\uaee8\uf11a\ucd87\u0894\ud5be\u836b\u430d\u5bdc".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\u346c\u73e0\u0f00\u5854\ue1a3\u2892\u932b\ufa79\u3671\u8d1d\u049e\uf91d\uac8f\ucf82\u4535\u9be3\u9820\u8221\u3e01\ufa4c\u989b\u5c17\u53f7\u814b\u132a\u17f0\u994a\u1000\u9ff7\u02e6\u1473\ub25d\ue863\u7a19\uf938\u7d13\ub6ed\u4d6a\u51e9\u8b33\u1b4b\uce3b\ufe6e\u4f37\u7c7c\ua453\u2628\u8c9c\u3111\ufb29\ubf16\uee00\uad67\u5b23\u976f\uf965\u56d8\ucfa2\u12fa\u9257\ufb63\ua3a6\u41a0\u43ef\uf6ef\udba8\u8055\ua96a\u2297\u7a07\u5ed4\u183c\ud038\u193f\u5cc5\u553f\u5386\uec57\ud585\u89e5\u3869\u9ebb\u1256\u4235\u6707\u04c6\u5d22\u3f14\u317e\u84d8\u866a\u8984\ue60b\u2528\u0ea0\ufd90\ub916\u07c9\u453b\ua684\ua14f\u369e\ud304\u8764\u211d\u064b\u2a6f\ue6f2\u59b5\u717c\uf026\u2faf\u095e\u305b\ue782\u2363\u0adb\u4b1b\uf68c\u73b4\u313f\ue0d8\uc1e3\u9998\u3c39\ue684\ua66d\u123e".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[202] & 0xFF];
                    array10[1] = array8[array9[206] & 0xFF];
                    array10[2] = array8[array9[39] & 0xFF];
                    array10[3] = array8[array9[193] & 0xFF];
                    array10[4] = array8[array9[169] & 0xFF];
                    array10[5] = array8[array9[200] & 0xFF];
                    array10[6] = array8[array9[5] & 0xFF];
                    array10[7] = array8[array9[236] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[166] & 0xFF];
                    array10[9] = array8[array9[159] & 0xFF];
                    array10[10] = array8[array9[86] & 0xFF];
                    array10[11] = array8[array9[215] & 0xFF];
                    array10[12] = array8[array9[199] & 0xFF];
                    array10[13] = array8[array9[81] & 0xFF];
                    array10[14] = array8[array9[149] & 0xFF];
                    array10[15] = array8[array9[243] & 0xFF];
                }
                J(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { -1975755214, -1269094609, 2068591372, -1496964310 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                l.T[6] = array11;
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
                l.T[5] = array13;
                J(6, null);
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
                final int[] array15 = (int[])l.T[5];
                final byte[] array16 = (byte[])l.T[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (Z(array16, Z(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] m = l.J;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("ipf3xsmituyj", 36);
                BigInteger xor = new BigInteger("1jk67pmt88x4y", 36);
                final BigInteger val = new BigInteger("qcgx5eowr0tb", 36);
                BigInteger modPow = new BigInteger("zh24d7b7kiv5", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m2);
                    }
                    synchronized (m) {
                        while (m[0] == null) {
                            m.wait(5000L);
                        }
                        xor = xor.xor(m[0]);
                        m[0] = null;
                    }
                }
                final int[] array17 = (int[])l.T[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] j2 = l.J;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m3 = new BigInteger("1fbv93hs64f9f", 36);
                final BigInteger val2 = new BigInteger("mub37hkvmyjf", 36);
                final BigInteger val3 = new BigInteger("19diabm6uoe21", 36);
                BigInteger modPow2 = new BigInteger("11dm8yycn7ky8", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m3);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (j2) {
                            if (j2[0] != null) {
                                j2.notifyAll();
                                continue;
                            }
                            j2[0] = modPow2;
                            j2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])l.T[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int Z(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int Z(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void k23347() {
        J(0, null);
        G();
        final l l = new l(1);
        l.start();
        l.join();
        final l i = new l(3);
        i.start();
        final l j = new l(4);
        j.start();
        i.join();
        j.join();
        final l k = new l(7);
        final l m = new l(8);
        k.start();
        m.start();
        k.join();
        m.join();
    }
    
    private static final void G() {
        null;
        goto Label_0009;
    }
    
    static final String P(Object charArray) {
        if (l.T == null) {
            k23347();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)l.T[7]].getClassName() + stackTrace[(int)l.T[7]].getMethodName()).hashCode();
        final int[] array = (int[])l.T[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])l.T[5];
        final int[] array3 = (int[])l.T[1];
        final int[] array4 = (int[])l.T[2];
        final int[] array5 = (int[])l.T[3];
        final int[] array6 = (int[])l.T[4];
        final byte[] array7 = (byte[])l.T[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
