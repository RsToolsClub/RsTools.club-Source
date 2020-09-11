// 
// Decompiled by Procyon v0.5.36
// 

package andre;

import java.math.BigInteger;

public class l extends Thread
{
    private static volatile Object[] d;
    private final int G;
    private static final BigInteger[] u;
    
    l(final int g) {
        this.G = g;
    }
    
    static {
        u = new BigInteger[1];
    }
    
    @Override
    public void run() {
        s(this.G, null);
    }
    
    private static final void s(final int n, final Object o) {
        switch (n) {
            case 0: {
                l.d = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                s(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])l.d[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])l.d[1];
                final int[] array5 = (int[])l.d[2];
                final int[] array6 = (int[])l.d[3];
                final int[] array7 = (int[])l.d[4];
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
                final char[] charArray = "\u9742\ud206\uc71a\u966d\ud444\u80b1\ud851\uea99\u39d6\u6985\uf58e\u8295\u2082\u83c6\u1347\u8d8f\u493c\ua3db\ue179\uce49\u3b8b\u7e50\u8c74\ue1f6\u2b00\u60da\udcc2\ue54a\uc4a9\u8cf2\u7e3f\u1912\u6904\u0136\u4420\u4adc\ue984\ua939\ud112\ue8a7\u46be\uc880\ua004\u84c6\uef13\u436f\u3e60\ucd17\u1a85\u36a6\u7727\ud099\ub15e\u591c\ue37b\u61d2\u3f18\ubbc4\u5f99\u30e1\u2816\ubfd5\ufa0a\ue985\ua4d2\u5d85\u51c7\u6d6a\u8f48\u0eb0\u3938\ub8d7\u262d\u60cc\u3b50\u1b8a\u0b96\u091c\u8ad2\u2133\u0b34\uabfa\u1460\uf02d\u1ea4\u7a86\uced0\uf7fa\ub0d9\u6e98\ub7ae\u30de\udee2\u967c\u3993\u0bc6\ucf66\uc5a0\u382f\ue8e5\u6ca7\u7ca7\uf4b1\u61f2\u51d4\u2c8e\u3779\ub4af\ub000\ue2ee\ub5bb\u7a72\ua91c\u3a71\u4def\u22d6\u2f81\ucd9c\u303b\uab30\u846a\u17b5\u436a\u11dd\ue959\u752b\uaa95\u7e1e".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\ub67a\ub21f\u7884\ua19a\ubdc6\ubbde\ub1b3\ucf81\u3c78\u0a87\u59e4\uc78d\ud496\ub22c\ubf5f\u0090\u839d\u20f1\u7fd6\u0500\u7df6\u09b6\u7bf7\u3f19\u3b37\u1bf7\uabd3\uda60\u8c9c\ua239\u3471\u2706\u37b1\uf3df\ufb25\u09cb\uc07b\u4abb\ub2c8\uec0e\u6c78\u6f82\ub3cc\u3d27\u65fe\ue1ab\u96b5\u59ff\u8757\u0d1d\u7965\u6593\uaf9e\u2a3f\uc77e\ue5cf\u62fa\ubdba\u12ed\u4d3b\u4d94\u2acd\u2a1e\u312d\u6e3c\u7883\u1fc3\u98dc\u1b15\u87d9\u2a3e\u8fad\u4b4a\u76c6\u2495\u5690\u1555\ufb09\u1600\uf77b\u23be\ue9a9\u0229\u845b\u49d7\u5134\u04c5\uc981\u0aba\u7c64\u15dd\ud395\ud845\u95d6\u6073\ub555\u08b1\uee70\u318a\uacc3\ub257\ubd1d\u0ec6\u1065\u6db0\ueeab\ua0c1\u5531\u23e9\u1b5d\u4f10\uaed8\uc93a\u374f\u64fd\u31e5\u554c\u4cbb\u48f8\u049e\u6e2a\u310d\u0e8e\u4b7f\u5b86\u4628\u3bae\uaa74".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[35] & 0xFF];
                    array10[1] = array8[array9[180] & 0xFF];
                    array10[2] = array8[array9[222] & 0xFF];
                    array10[3] = array8[array9[36] & 0xFF];
                    array10[4] = array8[array9[144] & 0xFF];
                    array10[5] = array8[array9[67] & 0xFF];
                    array10[6] = array8[array9[77] & 0xFF];
                    array10[7] = array8[array9[34] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[241] & 0xFF];
                    array10[9] = array8[array9[78] & 0xFF];
                    array10[10] = array8[array9[211] & 0xFF];
                    array10[11] = array8[array9[61] & 0xFF];
                    array10[12] = array8[array9[163] & 0xFF];
                    array10[13] = array8[array9[147] & 0xFF];
                    array10[14] = array8[array9[202] & 0xFF];
                    array10[15] = array8[array9[108] & 0xFF];
                }
                s(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { 448388136, 147110736, -1631601482, -1206488398 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                l.d[6] = array11;
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
                l.d[5] = array13;
                s(6, null);
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
                final int[] array15 = (int[])l.d[5];
                final byte[] array16 = (byte[])l.d[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (h(array16, R(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] u = l.u;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("r7w3zowb53oz", 36);
                BigInteger xor = new BigInteger("1xhe6lgurqp4y", 36);
                final BigInteger val = new BigInteger("14cgmf5svj8a8", 36);
                BigInteger modPow = new BigInteger("80p0r3r8pfnw", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (u) {
                        while (u[0] == null) {
                            u.wait(5000L);
                        }
                        xor = xor.xor(u[0]);
                        u[0] = null;
                    }
                }
                final int[] array17 = (int[])l.d[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] u2 = l.u;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("18bgga9kj4wyr", 36);
                final BigInteger val2 = new BigInteger("gxa1vwtnltt8", 36);
                final BigInteger val3 = new BigInteger("1fztju05hirej", 36);
                BigInteger modPow2 = new BigInteger("11klqjtil38sm", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (u2) {
                            if (u2[0] != null) {
                                u2.notifyAll();
                                continue;
                            }
                            u2[0] = modPow2;
                            u2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])l.d[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int R(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int h(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void d7949() {
        s(0, null);
        j();
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
    
    private static final void j() {
        null;
        goto Label_0009;
    }
    
    static final String h(Object charArray) {
        if (l.d == null) {
            d7949();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)l.d[7]].getClassName() + stackTrace[(int)l.d[7]].getMethodName()).hashCode();
        final int[] array = (int[])l.d[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])l.d[5];
        final int[] array3 = (int[])l.d[1];
        final int[] array4 = (int[])l.d[2];
        final int[] array5 = (int[])l.d[3];
        final int[] array6 = (int[])l.d[4];
        final byte[] array7 = (byte[])l.d[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
