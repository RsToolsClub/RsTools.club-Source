// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc3;

import java.math.BigInteger;

public class JDBC3ResultSet$JDBC3Savepoint extends Thread
{
    private static volatile Object[] L;
    private final int c;
    private static final BigInteger[] h;
    
    JDBC3ResultSet$JDBC3Savepoint(final int c) {
        this.c = c;
    }
    
    static {
        h = new BigInteger[1];
    }
    
    @Override
    public void run() {
        j(this.c, null);
    }
    
    private static final void j(final int n, final Object o) {
        switch (n) {
            case 0: {
                JDBC3ResultSet$JDBC3Savepoint.L = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                j(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])JDBC3ResultSet$JDBC3Savepoint.L[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[1];
                final int[] array5 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[2];
                final int[] array6 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[3];
                final int[] array7 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[4];
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
                final char[] charArray = "\ud254\u9710\u820c\ud37b\ue244\ud993\u8274\ud062\udb14\ua9ad\u0fd4\u4d0b\u2e05\u0846\u8f21\u17be\u3b29\u864e\u3194\u54a1\ud9c6\ub818\u7ce4\u9020\ua762\u367f\ueac2\ubc68\u9e8c\ub609\u9cfd\ud93a\u935e\ucea8\u4aa7\uc15c\u75e2\u3308\ua307\ucd32\u9653\u5268\u4249\u428e\u1f83\u32b9\ub202\u9bb2\u7cfa\ub705\u56f5\ua8e2\u808e\ub317\u8baf\u9453\uc2d6\u5211\u24c9\uc67f\u1454\u60ec\u0c16\u4688\u6694\uc16d\u6308\u47ca\u3f93\ua612\ue41a\ub891\u336c\u523c\u44d3\u6f50\u80c9\ub70b\ue54b\u4538\ufeea\u9512\uf1d4\u3d03\uad4d\ua529\u732e\u6171\u6c18\ud2ac\u8032\u8d25\u81a2\ufdb0\u485d\u10b4\u9d69\uee8c\ubbb9\u4919\u51e8\u6afa\u5ff5\u028f\ue4ad\u2b7c\u944b\uf57d\u5249\uc9cb\ue2eb\u9da3\u9ea4\u02aa\uc223\u3a1b\u0cd6\u69ae\u999a\u8d2d\u767e\uc405\u5b97\u2c14\u0f80\u7a57\ucd3d\ubed9".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\udd08\u1f0f\u543b\ue841\u3b77\u70d3\u3da0\u5d6d\u441d\u7a42\u046f\u7c09\uc156\ubb2b\u0532\u8c17\uf16b\u286d\u790a\u6cd2\u7246\u9fa4\uaf33\u7b78\u2eb9\ub5d1\u8829\uf0ee\ua3e8\u7097\u564e\uecb5\u43b5\uabc0\udd10\ue462\ub7f4\u2baf\u677b\ucb6d\u34fa\u616d\uf75a\u4afa\u7a54\u2279\uda8a\u1932\u6c7f\u1733\u1500\u3ce2\uc0dc\u66ce\uc05d\udf6f\u3999\u5f38\u8518\ub970\u6720\uaa86\u08f2\u6c8d\u8d09\u07c2\u6e45\u8fe8\u7b08\u4097\u0144\ucd40\u87b6\u1ddf\ua3c4\u9bbb\u8840\uef52\u6047\ucd33\ua1d5\u452a\ua8da\ud79e\ue945\uf29a\uc1bb\u56f3\u19f3\u446d\u4295\ue2fd\u0bc7\udf56\u71c9\u60d3\u1166\u5f0e\u1b0d\u39e3\ud289\u9cf4\u75ee\ub3a2\u0699\udfdf\u6b07\uad14\u839d\ua83c\u40b2\uf16e\u21f1\u3045\u217c\uf099\u6bc8\u49fd\ud67f\ue303\u643d\u884f\u94cb\u6fe1\u276f\ue008\u87d9\u3735".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[146] & 0xFF];
                    array10[1] = array8[array9[191] & 0xFF];
                    array10[2] = array8[array9[27] & 0xFF];
                    array10[3] = array8[array9[230] & 0xFF];
                    array10[4] = array8[array9[119] & 0xFF];
                    array10[5] = array8[array9[250] & 0xFF];
                    array10[6] = array8[array9[202] & 0xFF];
                    array10[7] = array8[array9[190] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[178] & 0xFF];
                    array10[9] = array8[array9[227] & 0xFF];
                    array10[10] = array8[array9[200] & 0xFF];
                    array10[11] = array8[array9[113] & 0xFF];
                    array10[12] = array8[array9[9] & 0xFF];
                    array10[13] = array8[array9[13] & 0xFF];
                    array10[14] = array8[array9[102] & 0xFF];
                    array10[15] = array8[array9[195] & 0xFF];
                }
                j(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { -1933179308, -727252802, -1122144137, 1044452772 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                JDBC3ResultSet$JDBC3Savepoint.L[6] = array11;
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
                JDBC3ResultSet$JDBC3Savepoint.L[5] = array13;
                j(6, null);
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
                final int[] array15 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[5];
                final byte[] array16 = (byte[])JDBC3ResultSet$JDBC3Savepoint.L[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (s(array16, W(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] h = JDBC3ResultSet$JDBC3Savepoint.h;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("122q5v0mdheku", 36);
                BigInteger xor = new BigInteger("rftqsvsqngl2", 36);
                final BigInteger val = new BigInteger("10u53qjqys4ls", 36);
                BigInteger modPow = new BigInteger("yo8kgvadncvh", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (h) {
                        while (h[0] == null) {
                            h.wait(5000L);
                        }
                        xor = xor.xor(h[0]);
                        h[0] = null;
                    }
                }
                final int[] array17 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] h2 = JDBC3ResultSet$JDBC3Savepoint.h;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("1k4bcq9xm3fm0", 36);
                final BigInteger val2 = new BigInteger("108fafhrgkwks", 36);
                final BigInteger val3 = new BigInteger("18swl8228uvf9", 36);
                BigInteger modPow2 = new BigInteger("rtrrte9a4jkg", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (h2) {
                            if (h2[0] != null) {
                                h2.notifyAll();
                                continue;
                            }
                            h2[0] = modPow2;
                            h2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int W(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int s(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void D17143() {
        j(0, null);
        V();
        final JDBC3ResultSet$JDBC3Savepoint jdbc3ResultSet$JDBC3Savepoint = new JDBC3ResultSet$JDBC3Savepoint(1);
        jdbc3ResultSet$JDBC3Savepoint.start();
        jdbc3ResultSet$JDBC3Savepoint.join();
        final JDBC3ResultSet$JDBC3Savepoint jdbc3ResultSet$JDBC3Savepoint2 = new JDBC3ResultSet$JDBC3Savepoint(3);
        jdbc3ResultSet$JDBC3Savepoint2.start();
        final JDBC3ResultSet$JDBC3Savepoint jdbc3ResultSet$JDBC3Savepoint3 = new JDBC3ResultSet$JDBC3Savepoint(4);
        jdbc3ResultSet$JDBC3Savepoint3.start();
        jdbc3ResultSet$JDBC3Savepoint2.join();
        jdbc3ResultSet$JDBC3Savepoint3.join();
        final JDBC3ResultSet$JDBC3Savepoint jdbc3ResultSet$JDBC3Savepoint4 = new JDBC3ResultSet$JDBC3Savepoint(7);
        final JDBC3ResultSet$JDBC3Savepoint jdbc3ResultSet$JDBC3Savepoint5 = new JDBC3ResultSet$JDBC3Savepoint(8);
        jdbc3ResultSet$JDBC3Savepoint4.start();
        jdbc3ResultSet$JDBC3Savepoint5.start();
        jdbc3ResultSet$JDBC3Savepoint4.join();
        jdbc3ResultSet$JDBC3Savepoint5.join();
    }
    
    private static final void V() {
        null;
        goto Label_0009;
    }
    
    static final String i(Object charArray) {
        if (JDBC3ResultSet$JDBC3Savepoint.L == null) {
            D17143();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)JDBC3ResultSet$JDBC3Savepoint.L[7]].getClassName() + stackTrace[(int)JDBC3ResultSet$JDBC3Savepoint.L[7]].getMethodName()).hashCode();
        final int[] array = (int[])JDBC3ResultSet$JDBC3Savepoint.L[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[5];
        final int[] array3 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[1];
        final int[] array4 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[2];
        final int[] array5 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[3];
        final int[] array6 = (int[])JDBC3ResultSet$JDBC3Savepoint.L[4];
        final byte[] array7 = (byte[])JDBC3ResultSet$JDBC3Savepoint.L[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
