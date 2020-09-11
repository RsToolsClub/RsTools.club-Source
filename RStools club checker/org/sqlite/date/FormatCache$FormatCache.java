// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.date;

import java.math.BigInteger;

public class FormatCache$FormatCache extends Thread
{
    private static volatile Object[] J;
    private final int g;
    private static final BigInteger[] y;
    
    FormatCache$FormatCache(final int g) {
        this.g = g;
    }
    
    static {
        y = new BigInteger[1];
    }
    
    @Override
    public void run() {
        o(this.g, null);
    }
    
    private static final void o(final int n, final Object o) {
        switch (n) {
            case 0: {
                FormatCache$FormatCache.J = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                o(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])FormatCache$FormatCache.J[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])FormatCache$FormatCache.J[1];
                final int[] array5 = (int[])FormatCache$FormatCache.J[2];
                final int[] array6 = (int[])FormatCache$FormatCache.J[3];
                final int[] array7 = (int[])FormatCache$FormatCache.J[4];
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
                final char[] charArray = "\u363b\u737f\u6663\u3714\ub6ac\uef9f\u3d4a\u6b4d\u31c6\u5968\u379a\u5144\u4f42\u9653\udb0f\u63d6\uc34a\ue360\u3460\uc4e0\u1703\u9949\u9f58\u4c61\u8571\ua511\ube2a\u8a64\u21b2\u0d26\u762f\u29ff\uab10\ud2e7\u2be0\u5f49\u21cc\u4760\u5b64\ua81c\u93a7\uc229\u8c8c\u63df\ufc3f\ueef8\u9011\u08dc\u1918\uf79c\u9d05\ubd1a\u4b0e\u5739\u29dd\ufba8\u6c17\u7f15\u0727\u027b\ubfc7\u3827\u33cb\u6321\ue2e0\u6cc1\u5d9f\ue80e\ub00b\u07dd\ue3e8\ufaf2\u9e81\ud8c8\ubdab\u17db\u75f1\u27de\uf7c7\u8a08\u9fc5\ud885\ufe9a\uc8cc\u9a3e\u7086\u07d2\u9375\u79f2\ub1c1\u7872\ub116\u809b\ud13c\uea43\u4f83\u82f6\ub12d\u2ee4\u4e6f\u6d6e\u5daa\ua7eb\u9714\u7ca3\ufd66\ua854\u78d6\ucc07\ud717\ubb0b\u4371\u3bfd\u01b8\uddc9\u6395\ud4ba\uadf2\ue603\ua22c\ub531\uc203\u2f19\ub809\u7d36\u75bd\u76b9\ubb97".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\ucfd0\ua97b\u14db\u8bb2\u9b9a\u9bcb\ub668\u3f84\ua3dc\ud998\uac29\u5e1a\u668a\ud008\u1dd0\ua3aa\u28f8\u30f2\uc904\u3140\u07c1\ufbbd\u784b\u1d60\u62fa\u1f13\ueb79\uf23b\u1a48\u3864\u1ab3\u2f78\u0c12\uc5ff\uc48c\ua353\ua953\u4fe3\ud35f\u9a1c\u7015\u9312\u9d56\uf06b\u238b\u1724\uae15\u96cc\u9bf0\u3da4\ua9b1\u93d0\u8c3c\u37f3\ud97d\uced6\ufa8a\u1b84\ub090\ufe63\ud0ff\u66a7\u9b26\ue494\u3922\u83d0\uba30\uf372\uf610\u3f7e\u13a4\ubbb0\uf25c\u47fe\u655a\ue33e\ucbc3\uaaf5\u157f\u9f3e\uc0b9\ue81c\ue53e\uaacb\u4abf\ue957\uaaea\u6198\ua024\ubbee\u0bbc\ufad6\u870b\u9882\u9222\u93e5\u7929\u0bac\u1bb1\u4d13\u3c49\u11b7\u8dd0\u7a3d\u97d1\u57f2\u4981\ueaba\uf5ab\u5573\ua1a5\u3b33\ucd73\u4609\uf386\u19a0\udd6d\u3445\ua99f\ub245\u8616\ub7f6\u2a32\ua6ba\u529b\u39c3\u22bb\u5d0c".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[149] & 0xFF];
                    array10[1] = array8[array9[26] & 0xFF];
                    array10[2] = array8[array9[213] & 0xFF];
                    array10[3] = array8[array9[106] & 0xFF];
                    array10[4] = array8[array9[254] & 0xFF];
                    array10[5] = array8[array9[68] & 0xFF];
                    array10[6] = array8[array9[194] & 0xFF];
                    array10[7] = array8[array9[166] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[157] & 0xFF];
                    array10[9] = array8[array9[24] & 0xFF];
                    array10[10] = array8[array9[231] & 0xFF];
                    array10[11] = array8[array9[241] & 0xFF];
                    array10[12] = array8[array9[247] & 0xFF];
                    array10[13] = array8[array9[165] & 0xFF];
                    array10[14] = array8[array9[201] & 0xFF];
                    array10[15] = array8[array9[150] & 0xFF];
                }
                o(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { 1712110937, 332222151, -1451063003, -1064650895 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                FormatCache$FormatCache.J[6] = array11;
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
                FormatCache$FormatCache.J[5] = array13;
                o(6, null);
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
                final int[] array15 = (int[])FormatCache$FormatCache.J[5];
                final byte[] array16 = (byte[])FormatCache$FormatCache.J[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (B(array16, N(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] y = FormatCache$FormatCache.y;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("1cd8l3xdhqzrh", 36);
                BigInteger xor = new BigInteger("pf2wut1kygx2", 36);
                final BigInteger val = new BigInteger("vft5n8hdg1a6", 36);
                BigInteger modPow = new BigInteger("142a8vzjvv54s", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (y) {
                        while (y[0] == null) {
                            y.wait(5000L);
                        }
                        xor = xor.xor(y[0]);
                        y[0] = null;
                    }
                }
                final int[] array17 = (int[])FormatCache$FormatCache.J[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] y2 = FormatCache$FormatCache.y;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("1i15zaw2sw3vq", 36);
                final BigInteger val2 = new BigInteger("16j2w5wm15y6o", 36);
                final BigInteger val3 = new BigInteger("1ifcswfpayrse", 36);
                BigInteger modPow2 = new BigInteger("13rl2drm8pak", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (y2) {
                            if (y2[0] != null) {
                                y2.notifyAll();
                                continue;
                            }
                            y2[0] = modPow2;
                            y2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])FormatCache$FormatCache.J[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int N(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int B(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void D916() {
        o(0, null);
        x();
        final FormatCache$FormatCache formatCache$FormatCache = new FormatCache$FormatCache(1);
        formatCache$FormatCache.start();
        formatCache$FormatCache.join();
        final FormatCache$FormatCache formatCache$FormatCache2 = new FormatCache$FormatCache(3);
        formatCache$FormatCache2.start();
        final FormatCache$FormatCache formatCache$FormatCache3 = new FormatCache$FormatCache(4);
        formatCache$FormatCache3.start();
        formatCache$FormatCache2.join();
        formatCache$FormatCache3.join();
        final FormatCache$FormatCache formatCache$FormatCache4 = new FormatCache$FormatCache(7);
        final FormatCache$FormatCache formatCache$FormatCache5 = new FormatCache$FormatCache(8);
        formatCache$FormatCache4.start();
        formatCache$FormatCache5.start();
        formatCache$FormatCache4.join();
        formatCache$FormatCache5.join();
    }
    
    private static final void x() {
        null;
        goto Label_0009;
    }
    
    static final String U(Object charArray) {
        if (FormatCache$FormatCache.J == null) {
            D916();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)FormatCache$FormatCache.J[7]].getClassName() + stackTrace[(int)FormatCache$FormatCache.J[7]].getMethodName()).hashCode();
        final int[] array = (int[])FormatCache$FormatCache.J[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])FormatCache$FormatCache.J[5];
        final int[] array3 = (int[])FormatCache$FormatCache.J[1];
        final int[] array4 = (int[])FormatCache$FormatCache.J[2];
        final int[] array5 = (int[])FormatCache$FormatCache.J[3];
        final int[] array6 = (int[])FormatCache$FormatCache.J[4];
        final byte[] array7 = (byte[])FormatCache$FormatCache.J[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
