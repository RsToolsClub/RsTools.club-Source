// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.date;

import java.math.BigInteger;

public class FormatCache$ExceptionUtils extends Thread
{
    private static volatile Object[] r;
    private final int Z;
    private static final BigInteger[] p;
    
    FormatCache$ExceptionUtils(final int z) {
        this.Z = z;
    }
    
    static {
        p = new BigInteger[1];
    }
    
    @Override
    public void run() {
        I(this.Z, null);
    }
    
    private static final void I(final int n, final Object o) {
        switch (n) {
            case 0: {
                FormatCache$ExceptionUtils.r = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                I(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])FormatCache$ExceptionUtils.r[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])FormatCache$ExceptionUtils.r[1];
                final int[] array5 = (int[])FormatCache$ExceptionUtils.r[2];
                final int[] array6 = (int[])FormatCache$ExceptionUtils.r[3];
                final int[] array7 = (int[])FormatCache$ExceptionUtils.r[4];
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
                final char[] charArray = "\ufa3e\ubf7a\uaa66\ufb11\ud5b9\uaf28\u9a89\ub28e\u8271\u241d\ud440\u5ac2\ucec0\u0ef6\u8e40\uedfe\uf49d\u63cc\u7db5\u9b6c\u9f79\u1049\ub8e2\uef1c\ucfa8\u5c97\udd3f\ucad3\u8671\ud4e5\uc598\u548a\u48ca\ud961\uaa62\uc7ec\u7483\uc948\u6cb3\u28b0\uda72\u9da5\u04f6\ueadf\udb85\u4d85\udac8\uf15a\u1ae7\ueb04\u4838\u8ab4\ub2fa\ub7e3\ueef5\u10cf\u55b4\u32f4\u65e1\u561c\u670d\u18b3\u4b13\uc455\uc14c\u71de\ud3ad\u16ca\u10ce\u488f\u7933\ub582\ue200\uf9e2\u0f8b\u1970\u8570\ud3a3\uf57a\ude89\u3b62\u9d6b\udc06\ub4d5\u9edc\uf6fc\u49c0\u7b84\u2317\u0a9e\u0e86\u775c\u493b\u14a9\u74d9\ubb6a\uf14d\u5833\u72e8\u4ae2\u4638\u6f43\u2f40\u5399\u9118\u7f22\u229c\u3f25\uaaae\uec41\u7628\ua5ed\u7cdb\u3360\u95c4\ufe04\u0207\u51f5\u72c7\u1456\uc9f7\u2834\uc454\u1d5c\uc2c2\uda94\u0918\u7d5c".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\ua1e6\u1c68\u0952\u7d5f\u3ec1\u281e\u2f3b\u9810\ua4ca\u664a\u7c3a\u4729\ud485\ua011\u880d\u33f5\u1cc5\u76cf\ue2ad\u82c8\u8eba\u9e58\u3f8e\u1124\ubf8a\u020e\u9b25\u4285\u9f7a\u3fbf\u07dd\ub380\u753e\uce5f\ub3e6\u4555\u5117\u4102\ud428\u6e7b\uf12c\ud1a3\uf0e9\ued89\uad72\uea53\u4b96\ud7ab\ufd79\ufbe2\ua125\u9de6\u4da1\ua59e\u288d\u7099\ucde6\u6cc8\u1979\u8448\u0e4e\u9ee2\u13e0\u36a2\u997c\ud373\ua064\uc47e\uab6c\udb1e\ue98e\u4bc7\u6c12\u94a8\ufef1\udd53\ua821\u28fb\u98d6\udcd5\u0960\ue562\ufb4f\u43c8\uad8b\u794f\uf7a2\uea5a\u4f6a\udfa6\uae45\ucb93\u0615\u760d\ub734\u7f20\u6a48\uf0f4\u9411\u3497\uec31\udea0\ua2b0\ud117\u609e\ubcf4\u19c1\ufe5f\uc993\u497c\ubdb7\u1d2c\u2415\u2644\ue492\ub396\u5079\uc32c\u603d\ub86d\u8d8e\u4320\uade3\u7ca0i\u6220\udd3d\ua446".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[209] & 0xFF];
                    array10[1] = array8[array9[203] & 0xFF];
                    array10[2] = array8[array9[243] & 0xFF];
                    array10[3] = array8[array9[71] & 0xFF];
                    array10[4] = array8[array9[254] & 0xFF];
                    array10[5] = array8[array9[109] & 0xFF];
                    array10[6] = array8[array9[198] & 0xFF];
                    array10[7] = array8[array9[93] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[42] & 0xFF];
                    array10[9] = array8[array9[96] & 0xFF];
                    array10[10] = array8[array9[112] & 0xFF];
                    array10[11] = array8[array9[12] & 0xFF];
                    array10[12] = array8[array9[255] & 0xFF];
                    array10[13] = array8[array9[21] & 0xFF];
                    array10[14] = array8[array9[246] & 0xFF];
                    array10[15] = array8[array9[124] & 0xFF];
                }
                I(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { 1495843584, 1666276969, 902548923, 1383747090 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                FormatCache$ExceptionUtils.r[6] = array11;
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
                FormatCache$ExceptionUtils.r[5] = array13;
                I(6, null);
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
                final int[] array15 = (int[])FormatCache$ExceptionUtils.r[5];
                final byte[] array16 = (byte[])FormatCache$ExceptionUtils.r[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (W(array16, J(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] p2 = FormatCache$ExceptionUtils.p;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("1euaf0vnjarbm", 36);
                BigInteger xor = new BigInteger("14ux4a6uzb1pk", 36);
                final BigInteger val = new BigInteger("1eadlyicq719w", 36);
                BigInteger modPow = new BigInteger("9n8nb1ybeeb3", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (p2) {
                        while (p2[0] == null) {
                            p2.wait(5000L);
                        }
                        xor = xor.xor(p2[0]);
                        p2[0] = null;
                    }
                }
                final int[] array17 = (int[])FormatCache$ExceptionUtils.r[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] p3 = FormatCache$ExceptionUtils.p;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("eoscig10oac5", 36);
                final BigInteger val2 = new BigInteger("xuc26lizd23a", 36);
                final BigInteger val3 = new BigInteger("a6l4a3cziifp", 36);
                BigInteger modPow2 = new BigInteger("9dhpvgjkgshj", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (p3) {
                            if (p3[0] != null) {
                                p3.notifyAll();
                                continue;
                            }
                            p3[0] = modPow2;
                            p3.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])FormatCache$ExceptionUtils.r[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int J(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int W(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void d6279() {
        I(0, null);
        g();
        final FormatCache$ExceptionUtils formatCache$ExceptionUtils = new FormatCache$ExceptionUtils(1);
        formatCache$ExceptionUtils.start();
        formatCache$ExceptionUtils.join();
        final FormatCache$ExceptionUtils formatCache$ExceptionUtils2 = new FormatCache$ExceptionUtils(3);
        formatCache$ExceptionUtils2.start();
        final FormatCache$ExceptionUtils formatCache$ExceptionUtils3 = new FormatCache$ExceptionUtils(4);
        formatCache$ExceptionUtils3.start();
        formatCache$ExceptionUtils2.join();
        formatCache$ExceptionUtils3.join();
        final FormatCache$ExceptionUtils formatCache$ExceptionUtils4 = new FormatCache$ExceptionUtils(7);
        final FormatCache$ExceptionUtils formatCache$ExceptionUtils5 = new FormatCache$ExceptionUtils(8);
        formatCache$ExceptionUtils4.start();
        formatCache$ExceptionUtils5.start();
        formatCache$ExceptionUtils4.join();
        formatCache$ExceptionUtils5.join();
    }
    
    private static final void g() {
        null;
        goto Label_0009;
    }
    
    static final String i(Object charArray) {
        if (FormatCache$ExceptionUtils.r == null) {
            d6279();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)FormatCache$ExceptionUtils.r[7]].getClassName() + stackTrace[(int)FormatCache$ExceptionUtils.r[7]].getMethodName()).hashCode();
        final int[] array = (int[])FormatCache$ExceptionUtils.r[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])FormatCache$ExceptionUtils.r[5];
        final int[] array3 = (int[])FormatCache$ExceptionUtils.r[1];
        final int[] array4 = (int[])FormatCache$ExceptionUtils.r[2];
        final int[] array5 = (int[])FormatCache$ExceptionUtils.r[3];
        final int[] array6 = (int[])FormatCache$ExceptionUtils.r[4];
        final byte[] array7 = (byte[])FormatCache$ExceptionUtils.r[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
