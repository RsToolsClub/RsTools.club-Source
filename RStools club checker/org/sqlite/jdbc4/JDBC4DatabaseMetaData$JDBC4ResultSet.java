// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc4;

import java.math.BigInteger;

public class JDBC4DatabaseMetaData$JDBC4ResultSet extends Thread
{
    private static volatile Object[] P;
    private final int a;
    private static final BigInteger[] h;
    
    JDBC4DatabaseMetaData$JDBC4ResultSet(final int a) {
        this.a = a;
    }
    
    static {
        h = new BigInteger[1];
    }
    
    @Override
    public void run() {
        J(this.a, null);
    }
    
    private static final void J(final int n, final Object o) {
        switch (n) {
            case 0: {
                JDBC4DatabaseMetaData$JDBC4ResultSet.P = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                final byte[] array2 = (byte[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[1];
                final int[] array5 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[2];
                final int[] array6 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[3];
                final int[] array7 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[4];
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
                final char[] charArray = "\u6463\u2127\u343b\u654c\u1199\u222a\u9fb7\u5a09\uedb5\ucd38\ua514\u91bb\u2eaa\u07ff\uea89\u9e08\u57e8\ued96\u9999\u2a87\uab70\ub040\u8133\u0dbe\ue43e\uc664\u191f\u47d1\u834f\u3c62\uaa5c\ubdaf\u399e\u1218\u4a08\ucee5\u104a\ubabe\ucfc6\ua6ea\u3e5e\u2c4e\u30ff\u4ad6\ue254\uaf27\uf15e\u6ba9\u48ec\ufd0a\u4d05\u9d24\ue00e\u050f\ue461\u9ecc\u97e5\ue835\uef54\u695e\u7cc1\u8c81\u6a33\u090a\u2581\u2655\u203c\u133c\ua114\u6a8d\ubd5d\u9ada\u145b\ua45e\u7fac\ub5a7\u12e2\u479e\ue849\u107f\u39fb\ub3e4\u74cb\u9c4a\ud65d\u5333\uc0d6\ud675\u115b\u676a\u135b\uc4c0\ub25d\u6998\uff15\u5e34\u8cb9\ud1ce\u0cbd\u0933\u932f\u7155\ud052\u59b7\u6cb5\u5edf\ue9bb\u8928\u50d2\uf3e8\ua2cd\u946a\ufac2\u5850\u9e4a\u04f1\u1f9a\u66b8\u36c2\u6827\u661b\udbb8\ua95e\u3c5b\u3fa4\u3fd7\u6ebf\uc94f".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\u3bca\u5498\ufa43\u2c5c\uf23f\u143a\u03b0\u5d93\ube65\ua402\ud6ea\u126b\ub6c3\ucf32\uf72e\u0994\u52e0\u8214\ue4d2\u4960\ub89b\u48b0\u8a4e\ud7c8\u0bcb\u1197\u3487\u80ae\ueb99\u6238\u1f57\u4cbc\u16aa\ue6d9\ued3e\u2ebb\ue67b\u5a26\u7758\ucdd1\u6535\ud188\u9ab0\u6653®\ub096\ueabc\u4ecd\ua7a3\u08c7\u945a\ub0ec\udbb2\u52cd\ue20f\u6fb6\ue809\u5f05\u17df\u6d98\u5f8b\u8077\ue067\u2a45\u868f\uc7f4\ub27d\u3507\ub68e\u60d4\uec0e\u4914\u975d\ucff2\ufa30\u7190\ufc7c\u85c0\u77f8\u4aae\u512a\uc312\u5270\uf1e7\u0495\u8af9\uab81\ucaad\ubde2\u5aa6\u15b1\u65a8\u8ba6\uf4bd\u2289\ud3b3\uf4ac\ue223\ufa71\uadee\u23f8\ubd50\u075d\u3562\ucadc¬\uf2cb\u1a80\u0165\uf4f0\u8136\udac4\u8828\u8e12\u7de6\ud45e\u7306\u2b19\ue517\ubbb5\ueb57\u9820\u38cc\u5b2f\udfdd\ua57a\u9dde\u4591".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[116] & 0xFF];
                    array10[1] = array8[array9[177] & 0xFF];
                    array10[2] = array8[array9[70] & 0xFF];
                    array10[3] = array8[array9[137] & 0xFF];
                    array10[4] = array8[array9[36] & 0xFF];
                    array10[5] = array8[array9[146] & 0xFF];
                    array10[6] = array8[array9[95] & 0xFF];
                    array10[7] = array8[array9[111] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[91] & 0xFF];
                    array10[9] = array8[array9[54] & 0xFF];
                    array10[10] = array8[array9[107] & 0xFF];
                    array10[11] = array8[array9[207] & 0xFF];
                    array10[12] = array8[array9[117] & 0xFF];
                    array10[13] = array8[array9[82] & 0xFF];
                    array10[14] = array8[array9[35] & 0xFF];
                    array10[15] = array8[array9[32] & 0xFF];
                }
                J(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { -1833058527, -1235813128, -245370157, -1804109192 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                JDBC4DatabaseMetaData$JDBC4ResultSet.P[6] = array11;
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
                JDBC4DatabaseMetaData$JDBC4ResultSet.P[5] = array13;
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
                final int[] array15 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[5];
                final byte[] array16 = (byte[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (v(array16, l(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] h = JDBC4DatabaseMetaData$JDBC4ResultSet.h;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("1smrrxwxljax5", 36);
                BigInteger xor = new BigInteger("1anu74er6zcnl", 36);
                final BigInteger val = new BigInteger("i1beqzjjcftl", 36);
                BigInteger modPow = new BigInteger("zugdg7nmqmbi", 36);
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
                final int[] array17 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] h2 = JDBC4DatabaseMetaData$JDBC4ResultSet.h;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("13wlozb652mmw", 36);
                final BigInteger val2 = new BigInteger("1xn5qbflu3csf", 36);
                final BigInteger val3 = new BigInteger("1o62dqxb87ykw", 36);
                BigInteger modPow2 = new BigInteger("1dp2nyz8y7gyf", 36);
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
                final int[] array18 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int l(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int v(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void h5516() {
        J(0, null);
        T();
        final JDBC4DatabaseMetaData$JDBC4ResultSet set = new JDBC4DatabaseMetaData$JDBC4ResultSet(1);
        set.start();
        set.join();
        final JDBC4DatabaseMetaData$JDBC4ResultSet set2 = new JDBC4DatabaseMetaData$JDBC4ResultSet(3);
        set2.start();
        final JDBC4DatabaseMetaData$JDBC4ResultSet set3 = new JDBC4DatabaseMetaData$JDBC4ResultSet(4);
        set3.start();
        set2.join();
        set3.join();
        final JDBC4DatabaseMetaData$JDBC4ResultSet set4 = new JDBC4DatabaseMetaData$JDBC4ResultSet(7);
        final JDBC4DatabaseMetaData$JDBC4ResultSet set5 = new JDBC4DatabaseMetaData$JDBC4ResultSet(8);
        set4.start();
        set5.start();
        set4.join();
        set5.join();
    }
    
    private static final void T() {
        null;
        goto Label_0009;
    }
    
    static final String I(Object charArray) {
        if (JDBC4DatabaseMetaData$JDBC4ResultSet.P == null) {
            h5516();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)JDBC4DatabaseMetaData$JDBC4ResultSet.P[7]].getClassName() + stackTrace[(int)JDBC4DatabaseMetaData$JDBC4ResultSet.P[7]].getMethodName()).hashCode();
        final int[] array = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[5];
        final int[] array3 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[1];
        final int[] array4 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[2];
        final int[] array5 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[3];
        final int[] array6 = (int[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[4];
        final byte[] array7 = (byte[])JDBC4DatabaseMetaData$JDBC4ResultSet.P[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
