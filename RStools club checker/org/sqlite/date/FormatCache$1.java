// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.date;

import java.math.BigInteger;

public class FormatCache$1 extends Thread
{
    private static volatile Object[] g;
    private final int G;
    private static final BigInteger[] K;
    
    FormatCache$1(final int g) {
        this.G = g;
    }
    
    static {
        K = new BigInteger[1];
    }
    
    @Override
    public void run() {
        M(this.G, null);
    }
    
    private static final void M(final int n, final Object o) {
        switch (n) {
            case 0: {
                FormatCache$1.g = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                M(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])FormatCache$1.g[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])FormatCache$1.g[1];
                final int[] array5 = (int[])FormatCache$1.g[2];
                final int[] array6 = (int[])FormatCache$1.g[3];
                final int[] array7 = (int[])FormatCache$1.g[4];
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
                final char[] charArray = "\ua926\uec62\uf97e\ua809\u5738\u739d\u24dc\u0c22\u7825\u1ec8\ua1a6\u23d9\ua852\uaec2\u0352\u0dc4\ua371\u1fe6\u623b\u6e4b\ufa75\ue0a3\u2ff6\ub43f\ua561\u7f6e\u5fbe\u1666\u3824\u6a49\u3fcc\u6e5f\u3d2c\ua07a\uccf0\u67d8\uf991\u2972\u3b5f\u549a\uc5fc\u6882\u61fa\u1a35\u4c91\u16a6\ub001\ud2a3\ued4c\u4046\u88d2\ud838\u27b6\u9b67\u5189\u72c5\ub2a8\u30e1\u1af1\u805b\u327f\u151e\u13c8\u5910\u3f28\u4a05\u9fdf\u6d5f\ufbb3\ub991\u05d6\ue6e4\ue632\ueee4\ud645\u6e79\u87c5\u41ca\ua769\u5db4\ua0df\u93a4\u7ebc\u4851\ua12b\ubf36\u6443\u53db\u81f5\uddc4\u5b7d\ue3ee\uc9e3\u223a\u021d\u1f74\u35da\uf53a\ua7ee\ub97d\ued59\u6007\ubd2b\u2184\u21ad\u8943\ud22e\u735b\ub08e\u87f5\udf4f\u2759\ue805\uc787\u51c1\u3a07\u26f8\ud3cd\uf7b6\ubbc6\u20fe\uca4b\uba2b\u3c1c\uff33\ud585\ue000\u56b0".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\ua518\uc291\u4db6\u23d9\uf5e0\u6db0\uaf08\u0a2b\udc04\u822a\ubd59\u8ca7\u40d5\u5c60\uf1f1\ub745\u45dd\ueaf7\u24f8\u7397\u5e22\u6639\u1424\u7f26\u0a80\uccdf\ue8f4\ufa19\ub322\ubc02\uebe7\u8acb\u56ef\u0f04\u6f29\u23d4\ufdb6\u2e42\u3f86\u8576\u302c\ua379\ua708\u3c03\ud803\u83f6\u70e9\u543b\ub4b1\u4b1d\ueb11\u53fc\u4bf7\uce4c\ucd5f\ub5f6\u851f\uf569\u2c92\uc082\u7957\u98a6\u67ba\u19b4\uf27f\u0dfc\u6b29\u3c2c\u7286\u1816\u29bd\ube31\u1e6c\u2c69\u228f\uabc6\uace8\u5396\u7a77\u4723\u3cf1\ua30d\u5657\u8fa3\uc609\ue291\ud296\u3838\uad5f\uc9e4\u7865\u4262\ua034\uf6f7\u26fb\uf4fa\ua91e\u8bb2\ueb0b\u6bfe\ue656\u3d4b\uec07\u5a95\uefda\u7d38\u1d04\u74a1\u49e1\uc6c6\ua440\uabf8\uc3d5\ufb9b\uef58\ubd2d\u05c4\u412c\ue022\ued65\u045d\u54f1\u38a8\u6259\u8a75\u44e0\u3e70\u7662".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[17] & 0xFF];
                    array10[1] = array8[array9[7] & 0xFF];
                    array10[2] = array8[array9[104] & 0xFF];
                    array10[3] = array8[array9[187] & 0xFF];
                    array10[4] = array8[array9[114] & 0xFF];
                    array10[5] = array8[array9[15] & 0xFF];
                    array10[6] = array8[array9[134] & 0xFF];
                    array10[7] = array8[array9[103] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[61] & 0xFF];
                    array10[9] = array8[array9[53] & 0xFF];
                    array10[10] = array8[array9[175] & 0xFF];
                    array10[11] = array8[array9[82] & 0xFF];
                    array10[12] = array8[array9[218] & 0xFF];
                    array10[13] = array8[array9[94] & 0xFF];
                    array10[14] = array8[array9[83] & 0xFF];
                    array10[15] = array8[array9[253] & 0xFF];
                }
                M(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { 2025760516, 1450222372, -2124328420, 1083306563 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                FormatCache$1.g[6] = array11;
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
                FormatCache$1.g[5] = array13;
                M(6, null);
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
                final int[] array15 = (int[])FormatCache$1.g[5];
                final byte[] array16 = (byte[])FormatCache$1.g[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (M(array16, j(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] m = FormatCache$1.K;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("1gik8tzzfuy8a", 36);
                BigInteger xor = new BigInteger("x57ne3py4prp", 36);
                final BigInteger val = new BigInteger("fz3cg1mdyngk", 36);
                BigInteger modPow = new BigInteger("1vjoe9g90pk0i", 36);
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
                final int[] array17 = (int[])FormatCache$1.g[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] k2 = FormatCache$1.K;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m3 = new BigInteger("17uqhmivz14u5", 36);
                final BigInteger val2 = new BigInteger("ox9s395c8q4t", 36);
                final BigInteger val3 = new BigInteger("98kdkm2eqvvg", 36);
                BigInteger modPow2 = new BigInteger("flg2i4bhtmke", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m3);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (k2) {
                            if (k2[0] != null) {
                                k2.notifyAll();
                                continue;
                            }
                            k2[0] = modPow2;
                            k2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])FormatCache$1.g[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int j(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int M(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void r4785() {
        M(0, null);
        P();
        final FormatCache$1 formatCache$1 = new FormatCache$1(1);
        formatCache$1.start();
        formatCache$1.join();
        final FormatCache$1 formatCache$2 = new FormatCache$1(3);
        formatCache$2.start();
        final FormatCache$1 formatCache$3 = new FormatCache$1(4);
        formatCache$3.start();
        formatCache$2.join();
        formatCache$3.join();
        final FormatCache$1 formatCache$4 = new FormatCache$1(7);
        final FormatCache$1 formatCache$5 = new FormatCache$1(8);
        formatCache$4.start();
        formatCache$5.start();
        formatCache$4.join();
        formatCache$5.join();
    }
    
    private static final void P() {
        null;
        goto Label_0009;
    }
    
    static final String d(Object charArray) {
        if (FormatCache$1.g == null) {
            r4785();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)FormatCache$1.g[7]].getClassName() + stackTrace[(int)FormatCache$1.g[7]].getMethodName()).hashCode();
        final int[] array = (int[])FormatCache$1.g[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])FormatCache$1.g[5];
        final int[] array3 = (int[])FormatCache$1.g[1];
        final int[] array4 = (int[])FormatCache$1.g[2];
        final int[] array5 = (int[])FormatCache$1.g[3];
        final int[] array6 = (int[])FormatCache$1.g[4];
        final byte[] array7 = (byte[])FormatCache$1.g[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
