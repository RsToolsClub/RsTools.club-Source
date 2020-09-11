// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc3;

import java.math.BigInteger;

public class JDBC3Connection$JDBC3PreparedStatement extends Thread
{
    private static volatile Object[] M;
    private final int W;
    private static final BigInteger[] R;
    
    JDBC3Connection$JDBC3PreparedStatement(final int w) {
        this.W = w;
    }
    
    static {
        R = new BigInteger[1];
    }
    
    @Override
    public void run() {
        X(this.W, null);
    }
    
    private static final void X(final int n, final Object o) {
        switch (n) {
            case 0: {
                JDBC3Connection$JDBC3PreparedStatement.M = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                X(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])JDBC3Connection$JDBC3PreparedStatement.M[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[1];
                final int[] array5 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[2];
                final int[] array6 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[3];
                final int[] array7 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[4];
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
                final char[] charArray = "\u1c2d\u5969\u4c75\u1d02\ud101\u50b1\u54b1\u3d46\u362a\u483c\ub5b2\ud8f9\u94bc\u9b48\u5c3a\u86aa\u4fd8\u2e5c\u1436\u6250\u9134\u8254\uf212\uba05\u4233\uc965\ud987\u354a\u4849\u5b2d\u71c3\u38ab\u2938\u5b5a\uf01e\u5252\ua6f9\ua21c\ud7f6\u6520\ub3f1\u6499\u0abb\u78c2\u9175\u189c\u5753\u64a8\u77d2\u4db8\uc51a\u3e95\u9bee\u19de\ud06a\u791d\u37bb\uea7e\ub5b5\u794b\u9eb0\u3fbb\ud45b\ue835\ud4b2\u2980\u8306\uf2f9\u2ddb\u4a34\u1f51\ubc84\ud4a3\ua4f6\u8139\uf556\uf1e8\u5570\u3a37\u21dc\ud082\ud3ad\uebde\u1f37\uc6b1\u0a40\u2196\ud5a9\u1bca\uc4b3\u3636\uac4c\ub371\u9659\ub688\u59d4\u3fe7\uac20\u9a6c\ud116\u946b\uff2c\u8ce4\u663e\uab5e\u5c9e\ua371\u4191\ua551\uf5cd\u20df\u6bbc\ud7da\u766a\u5c56\ub073\u4680\uc298\u7983\ue230\u5c99\uc066\u75d1\ued1d\u0693\u3d80\uf301\ue04c".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\u16f2\u6d06\u6ca8\u3be1\ued30\u91a3\u33f4\ub02b\ua9d9\u67a6\u359f\ub868\u46a7\u39a3\uad0d\u4756\u7831\uffe5\ufa58\u2ae0\u1ceb\u8532\u01ac\u014b\ufd75\u36cc\ufbe8\u2c52\u70ff\u5ac4\ue0dc\ufc2c\ua663\ua9c7\ud08f\u898d\udcbf\u6553\u4d04\u1bc5\uf67e\ua07f\u83bf\udeff\udbf6\u3f80\udaeb\u2a66\u5f66\u99bd\uf672\ubac9\u132d\ud417\u411a\ue79b\u268a\uefa2\u1ee4\u8984\u4697\u3eaf\uc1b6\u413e\u6f02\u0ce8\u86ea\u4282\ud2e8\uca96\u7d46\u1f51\ue6c3\ue707\uefe5\u1c2e\ub752\u454d\u28cf\u4a15\u8578\u88cc\u5401\uce96\ub045\ua126\u8ee7\ua071\uf488\u5f73\u5388\u31d3\u9d92\ufbfb\u8344\u1c52\ua775\ud588\ue0bb\u3a71\u34aa\u9b1b\u2c0e\u12d2\uaac4\u2511\u9ee8\u335f\ue491\ua364\ua183\ued4b\u9fac\uc38d\u293c\ue351\u96f0\u2007\u558c\u388a\u5695\ucba6\uce8f\uf9e8\u8ae2\uc681\u9465\uda40".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[109] & 0xFF];
                    array10[1] = array8[array9[121] & 0xFF];
                    array10[2] = array8[array9[96] & 0xFF];
                    array10[3] = array8[array9[39] & 0xFF];
                    array10[4] = array8[array9[62] & 0xFF];
                    array10[5] = array8[array9[184] & 0xFF];
                    array10[6] = array8[array9[154] & 0xFF];
                    array10[7] = array8[array9[8] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[245] & 0xFF];
                    array10[9] = array8[array9[40] & 0xFF];
                    array10[10] = array8[array9[209] & 0xFF];
                    array10[11] = array8[array9[249] & 0xFF];
                    array10[12] = array8[array9[130] & 0xFF];
                    array10[13] = array8[array9[163] & 0xFF];
                    array10[14] = array8[array9[134] & 0xFF];
                    array10[15] = array8[array9[91] & 0xFF];
                }
                X(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { 538618072, -1727646244, 1215784686, 285155816 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                JDBC3Connection$JDBC3PreparedStatement.M[6] = array11;
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
                JDBC3Connection$JDBC3PreparedStatement.M[5] = array13;
                X(6, null);
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
                final int[] array15 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[5];
                final byte[] array16 = (byte[])JDBC3Connection$JDBC3PreparedStatement.M[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (P(array16, T(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] r = JDBC3Connection$JDBC3PreparedStatement.R;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("momkxop1sox7", 36);
                BigInteger xor = new BigInteger("1qv51ou62pbj5", 36);
                final BigInteger val = new BigInteger("22uyihmp35fc", 36);
                BigInteger modPow = new BigInteger("cgsmf6zzrpoe", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (r) {
                        while (r[0] == null) {
                            r.wait(5000L);
                        }
                        xor = xor.xor(r[0]);
                        r[0] = null;
                    }
                }
                final int[] array17 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] r2 = JDBC3Connection$JDBC3PreparedStatement.R;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("15urqnod6ezx2", 36);
                final BigInteger val2 = new BigInteger("17kclp189hfmo", 36);
                final BigInteger val3 = new BigInteger("pebpsbnh4xzi", 36);
                BigInteger modPow2 = new BigInteger("r8xeq6y75fq9", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (r2) {
                            if (r2[0] != null) {
                                r2.notifyAll();
                                continue;
                            }
                            r2[0] = modPow2;
                            r2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int T(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int P(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void Z26605() {
        X(0, null);
        R();
        final JDBC3Connection$JDBC3PreparedStatement jdbc3Connection$JDBC3PreparedStatement = new JDBC3Connection$JDBC3PreparedStatement(1);
        jdbc3Connection$JDBC3PreparedStatement.start();
        jdbc3Connection$JDBC3PreparedStatement.join();
        final JDBC3Connection$JDBC3PreparedStatement jdbc3Connection$JDBC3PreparedStatement2 = new JDBC3Connection$JDBC3PreparedStatement(3);
        jdbc3Connection$JDBC3PreparedStatement2.start();
        final JDBC3Connection$JDBC3PreparedStatement jdbc3Connection$JDBC3PreparedStatement3 = new JDBC3Connection$JDBC3PreparedStatement(4);
        jdbc3Connection$JDBC3PreparedStatement3.start();
        jdbc3Connection$JDBC3PreparedStatement2.join();
        jdbc3Connection$JDBC3PreparedStatement3.join();
        final JDBC3Connection$JDBC3PreparedStatement jdbc3Connection$JDBC3PreparedStatement4 = new JDBC3Connection$JDBC3PreparedStatement(7);
        final JDBC3Connection$JDBC3PreparedStatement jdbc3Connection$JDBC3PreparedStatement5 = new JDBC3Connection$JDBC3PreparedStatement(8);
        jdbc3Connection$JDBC3PreparedStatement4.start();
        jdbc3Connection$JDBC3PreparedStatement5.start();
        jdbc3Connection$JDBC3PreparedStatement4.join();
        jdbc3Connection$JDBC3PreparedStatement5.join();
    }
    
    private static final void R() {
        null;
        goto Label_0009;
    }
    
    static final String N(Object charArray) {
        if (JDBC3Connection$JDBC3PreparedStatement.M == null) {
            Z26605();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)JDBC3Connection$JDBC3PreparedStatement.M[7]].getClassName() + stackTrace[(int)JDBC3Connection$JDBC3PreparedStatement.M[7]].getMethodName()).hashCode();
        final int[] array = (int[])JDBC3Connection$JDBC3PreparedStatement.M[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[5];
        final int[] array3 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[1];
        final int[] array4 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[2];
        final int[] array5 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[3];
        final int[] array6 = (int[])JDBC3Connection$JDBC3PreparedStatement.M[4];
        final byte[] array7 = (byte[])JDBC3Connection$JDBC3PreparedStatement.M[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
