// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.util;

import java.math.BigInteger;

public class ResourceFinder$OSInfo extends Thread
{
    private static volatile Object[] o;
    private final int D;
    private static final BigInteger[] C;
    
    ResourceFinder$OSInfo(final int d) {
        this.D = d;
    }
    
    static {
        C = new BigInteger[1];
    }
    
    @Override
    public void run() {
        k(this.D, null);
    }
    
    private static final void k(final int n, final Object o) {
        switch (n) {
            case 0: {
                ResourceFinder$OSInfo.o = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                k(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])ResourceFinder$OSInfo.o[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])ResourceFinder$OSInfo.o[1];
                final int[] array5 = (int[])ResourceFinder$OSInfo.o[2];
                final int[] array6 = (int[])ResourceFinder$OSInfo.o[3];
                final int[] array7 = (int[])ResourceFinder$OSInfo.o[4];
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
                final char[] charArray = "\ue4c2\ua186\ub49a\ue5ed\uf2f3\u35b2\u630c\ub99b\uae74\u4506\u8c3d\u0ef5\u40c7\ud0d0\ue14d\u40d9\u72bd\ufb71\u4887\u619c\ub8dd\uff87\u776b\u832c\u9f00\uf7ed\ufa75\u5049\u7ff4\udff0\ue99d\u3591\u10b7\u8d56\u2465\u19ca\u1b8e\u646f\uea93\ub00d\uef40\u6755\u2352\u0511\u140c\u21b5\u8a60\u5a20\ud2cb\u29b7\u0444\u7761\ubb90\u3fdc\ue6d7\u4c08\u76b0\ub8a4\u07ce\u163f\uf67e\ub698\u5345§\ufed4\ufd6c\u9e97\u28f3\u4a8f\uc4ec\uc3f8\u4d0d\u7992\u8a1b\ue8cc\u0b5a\u2784\u91fa\ua1e1\u5106\uf6b2\u4eb9\uaaf6\ud1b7\uea54\u1166\ubd95\ue63f\u8c30\ubc6b\u32f1\u209d\ue2f1\u181d\u5f38\u82a4\u6502\uec5e\u0493\u1425\ua2ea\u32e1\u34a1\u03f9\ue43c\u2b45\u868a\uc25d\uadca\u3f33\u2772\u443c\u1e55\ufaf2\u9c2b\u8f8d\ua120\ufae2\u811c\uc027\u975b\u39ea\u39df\uc945\u24f8\ub255\u0c72\u182c".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\uf166\u8178\uafba\u3294\ue3a6\u15ab\u7564\uca06\ub527\uae10\ub961\udfed\u91e8\u3286\ub819\uf655\ub52c\u1411\ubc3c\u0726\u5ceb\udebf\u4862\uf167\u0b40\uffb7\u94d7\ub7f1\uf77f\u2553\u0ab5\u72a9\uae88\ue119\u3888\ufed5\u05f2\u0680\ub509\u484b\u6d63\u41e5\u4eea\ud7fd\u19e9\u9ddc\ud0ec\u9c30\u8a29\u6220\u57cb\u046c\uc739\uc4d1\uf6ff\u77f5\u8b42\uf238\u7323\u1737\u3b72\uea4f\u2b2a\u77d6\u6828\u5fe3\ubdf0\u9d69\ua40d\u4a60\u9c26\uf786\u6a57\ub0cd\ud775\u3198\u9a58\u300a\u1cf6\udbc4\u9e97\u9b0f\u57ba\u2651\u1ee6\ua164\ufbcd\u8c21\uac0a\u72f4\u399c\u5716\u0b8c\uaad4\u31af\u18ff\u5ce4\u1b0d\u9658\u56f3\ufcd0\uefe7\uebc3\u2372\uf622\ud95b\ua19d\uef87\u6005\u1129\u7541\u6fb1\u0798\ufa09\u60b9\ue1c1\uec4a\ud393\uc569\u00e1\ud543\uc931\uaa42\ua31e\u7ebf\u9299\ua709\u58e6".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[48] & 0xFF];
                    array10[1] = array8[array9[173] & 0xFF];
                    array10[2] = array8[array9[228] & 0xFF];
                    array10[3] = array8[array9[52] & 0xFF];
                    array10[4] = array8[array9[6] & 0xFF];
                    array10[5] = array8[array9[115] & 0xFF];
                    array10[6] = array8[array9[166] & 0xFF];
                    array10[7] = array8[array9[245] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[127] & 0xFF];
                    array10[9] = array8[array9[105] & 0xFF];
                    array10[10] = array8[array9[66] & 0xFF];
                    array10[11] = array8[array9[192] & 0xFF];
                    array10[12] = array8[array9[130] & 0xFF];
                    array10[13] = array8[array9[246] & 0xFF];
                    array10[14] = array8[array9[213] & 0xFF];
                    array10[15] = array8[array9[131] & 0xFF];
                }
                k(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { -388287755, 1172057397, -1018231442, 2037548907 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                ResourceFinder$OSInfo.o[6] = array11;
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
                ResourceFinder$OSInfo.o[5] = array13;
                k(6, null);
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
                final int[] array15 = (int[])ResourceFinder$OSInfo.o[5];
                final byte[] array16 = (byte[])ResourceFinder$OSInfo.o[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (J(array16, M(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] c = ResourceFinder$OSInfo.C;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("n0jkg7sd946t", 36);
                BigInteger xor = new BigInteger("1hi5oasfeuo0h", 36);
                final BigInteger val = new BigInteger("6u61ors5z7ji", 36);
                BigInteger modPow = new BigInteger("1kp8a2f0qdyc7", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (c) {
                        while (c[0] == null) {
                            c.wait(5000L);
                        }
                        xor = xor.xor(c[0]);
                        c[0] = null;
                    }
                }
                final int[] array17 = (int[])ResourceFinder$OSInfo.o[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] c2 = ResourceFinder$OSInfo.C;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("yo8if7xtjh4g", 36);
                final BigInteger val2 = new BigInteger("11129tjghcnzu", 36);
                final BigInteger val3 = new BigInteger("jifxic8xyl3k", 36);
                BigInteger modPow2 = new BigInteger("1gf2br4lrau9n", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (c2) {
                            if (c2[0] != null) {
                                c2.notifyAll();
                                continue;
                            }
                            c2[0] = modPow2;
                            c2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])ResourceFinder$OSInfo.o[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int M(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int J(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void a16997() {
        k(0, null);
        s();
        final ResourceFinder$OSInfo resourceFinder$OSInfo = new ResourceFinder$OSInfo(1);
        resourceFinder$OSInfo.start();
        resourceFinder$OSInfo.join();
        final ResourceFinder$OSInfo resourceFinder$OSInfo2 = new ResourceFinder$OSInfo(3);
        resourceFinder$OSInfo2.start();
        final ResourceFinder$OSInfo resourceFinder$OSInfo3 = new ResourceFinder$OSInfo(4);
        resourceFinder$OSInfo3.start();
        resourceFinder$OSInfo2.join();
        resourceFinder$OSInfo3.join();
        final ResourceFinder$OSInfo resourceFinder$OSInfo4 = new ResourceFinder$OSInfo(7);
        final ResourceFinder$OSInfo resourceFinder$OSInfo5 = new ResourceFinder$OSInfo(8);
        resourceFinder$OSInfo4.start();
        resourceFinder$OSInfo5.start();
        resourceFinder$OSInfo4.join();
        resourceFinder$OSInfo5.join();
    }
    
    private static final void s() {
        null;
        goto Label_0009;
    }
    
    static final String Z(Object charArray) {
        if (ResourceFinder$OSInfo.o == null) {
            a16997();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)ResourceFinder$OSInfo.o[7]].getClassName() + stackTrace[(int)ResourceFinder$OSInfo.o[7]].getMethodName()).hashCode();
        final int[] array = (int[])ResourceFinder$OSInfo.o[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])ResourceFinder$OSInfo.o[5];
        final int[] array3 = (int[])ResourceFinder$OSInfo.o[1];
        final int[] array4 = (int[])ResourceFinder$OSInfo.o[2];
        final int[] array5 = (int[])ResourceFinder$OSInfo.o[3];
        final int[] array6 = (int[])ResourceFinder$OSInfo.o[4];
        final byte[] array7 = (byte[])ResourceFinder$OSInfo.o[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
