// 
// Decompiled by Procyon v0.5.36
// 

package andre;

import java.math.BigInteger;

public class i extends Thread
{
    private static volatile Object[] xk;
    private final int Y;
    private static final BigInteger[] x;
    
    i(final int y) {
        this.Y = y;
    }
    
    static {
        x = new BigInteger[1];
    }
    
    @Override
    public void run() {
        R(this.Y, null);
    }
    
    private static final void R(final int n, final Object o) {
        switch (n) {
            case 0: {
                i.xk = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                R(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])i.xk[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])i.xk[1];
                final int[] array5 = (int[])i.xk[2];
                final int[] array6 = (int[])i.xk[3];
                final int[] array7 = (int[])i.xk[4];
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
                final char[] charArray = "\u62d4\u2790\u328c\u63fb\u8c98\u247d\u67a4\u6bd6\u90ca\u2c57\u9779\u4bd0\ud4f0\ucd6f\u9409\u29b9\uff78\u2bf2\ucef1\u2ed0\u515a\ua1fa\uda5d\u1b7c\uaec9\u6733\u841e\u4186\u7b5c\u0dbd\ud723\u5cc0\u0bf3\uc873\ub052\u0475\u6eca\u0d0f\u6756\u608e\u6936\u2819\ucad5\u5b6c\ub93a\ub9e5\ubba9\ucafe\uea4f\u2e98\u9039\u2f4b\u1c9f\ueb35\udd11\u69eb\uacdc\uc33c\ufecb\udc8b\u95d9\u0b92\u914e\u4fd0\u6752\udc43\u36db\u023b\u3015\u6af5\uc435\u01c2\u3ac7\u0af8\u6ba7\u184e\u9719\ue450\uf993\u263d\ua744\u056d\ue9b5\u1056\u5d48\uce3c\u0611\u01a2\u0cae\u7d85\ub8bf\u3945\ub74d\ube61\uc80f\ub5ec\ucf43\u9de5\ue41a\u8c81\ue24a\u7211\u496a\u4713\u636d\u353b\ufcbb\u28c4\u9788\u2e5b\u7b62\u1e6a\u08bf\uf933\uf908\ue2dd\ufe67\u74bc\u9384\ubf2e\u1fef\u0195\uddde\uee81\u2bcc\u63ae\u4aeb\udc49".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\ucd17\ud601\u123c\u68d9\u0c42\u037f\uc2ed\u7741\ubd61\u6e8c\ud8bc\u56c3\u56be\uf940\u244b\u5f31\u6475\ud392\u8aa9\u5f49\u568e\ue6e7\ue1e8\u46bf\u3341\u42d0\ue518\uf215\u6a7c\uac68\ufe0c\u4401\ua215\ube98\ub5aa\u09d2\u3111\u7870\u54bc\uce4f\u4df1\u5ea4\ud8ce\u661c\ud34b\u1880\u2453\u6224\u5071\u6a53\u3a97\ua45a\u1214\ud171\u84fd\ue9ac\u165b\ud9cf\u2a4e\ud001\u8293\uf861\u3ef9\u53f1\u46fb\u36ad\uac74\udad3\u578f\u1b76\udec4\u41c8\u5edc\u7545\uf83c\u443a\uedb4\u53f7\u161c\uc1e8\ue218\u391b\u410c\u9e21\ucfbc\u689c\u5e3f\u0757\u447e\ucabe\uc149\u691c\ude21\u5aba\ud38e\ud092\ud80a\u7bf3\uf67a\ud949\ucbbd\u756c\u2cb4\u2b9c\u3ec2\u70bd\u0cdf\u6d4b\u8a8f\u3473\u0f2b\u8c56\uc4ee\ub9e5\u1b15\ud20f\u0699\u8f21\u9b72\u6116\ue45e\u878c\ue2f8\u52c0\u2f1c\u2d95\ue9d4\ue0da".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[46] & 0xFF];
                    array10[1] = array8[array9[29] & 0xFF];
                    array10[2] = array8[array9[192] & 0xFF];
                    array10[3] = array8[array9[205] & 0xFF];
                    array10[4] = array8[array9[81] & 0xFF];
                    array10[5] = array8[array9[126] & 0xFF];
                    array10[6] = array8[array9[249] & 0xFF];
                    array10[7] = array8[array9[119] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[40] & 0xFF];
                    array10[9] = array8[array9[49] & 0xFF];
                    array10[10] = array8[array9[59] & 0xFF];
                    array10[11] = array8[array9[111] & 0xFF];
                    array10[12] = array8[array9[0] & 0xFF];
                    array10[13] = array8[array9[52] & 0xFF];
                    array10[14] = array8[array9[182] & 0xFF];
                    array10[15] = array8[array9[181] & 0xFF];
                }
                R(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { 1800168945, -173109510, -1744625158, 1067429480 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                i.xk[6] = array11;
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
                i.xk[5] = array13;
                R(6, null);
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
                final int[] array15 = (int[])i.xk[5];
                final byte[] array16 = (byte[])i.xk[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (s(array16, B(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] x = i.x;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("1mnm57sycmpd5", 36);
                BigInteger xor = new BigInteger("1nzuo2odyqhsf", 36);
                final BigInteger val = new BigInteger("1cx9ek78q63sl", 36);
                BigInteger modPow = new BigInteger("t4fkngwvza1k", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (x) {
                        while (x[0] == null) {
                            x.wait(5000L);
                        }
                        xor = xor.xor(x[0]);
                        x[0] = null;
                    }
                }
                final int[] array17 = (int[])i.xk[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] x2 = i.x;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("urzhtyl70fy5", 36);
                final BigInteger val2 = new BigInteger("1q1zy5ndvs1cj", 36);
                final BigInteger val3 = new BigInteger("ny1lo6ujmzbp", 36);
                BigInteger modPow2 = new BigInteger("1xtzxq3wfoevp", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (x2) {
                            if (x2[0] != null) {
                                x2.notifyAll();
                                continue;
                            }
                            x2[0] = modPow2;
                            x2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])i.xk[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int B(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int s(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void d19719() {
        R(0, null);
        H();
        final i i = new i(1);
        i.start();
        i.join();
        final i j = new i(3);
        j.start();
        final i k = new i(4);
        k.start();
        j.join();
        k.join();
        final i l = new i(7);
        final i m = new i(8);
        l.start();
        m.start();
        l.join();
        m.join();
    }
    
    private static final void H() {
        null;
        goto Label_0009;
    }
    
    static final String Ut(Object charArray) {
        if (i.xk == null) {
            d19719();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)i.xk[7]].getClassName() + stackTrace[(int)i.xk[7]].getMethodName()).hashCode();
        final int[] array = (int[])i.xk[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])i.xk[5];
        final int[] array3 = (int[])i.xk[1];
        final int[] array4 = (int[])i.xk[2];
        final int[] array5 = (int[])i.xk[3];
        final int[] array6 = (int[])i.xk[4];
        final byte[] array7 = (byte[])i.xk[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
