// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.core;

import java.math.BigInteger;

public class CorePreparedStatement$CoreStatement extends Thread
{
    private static volatile Object[] F;
    private final int w;
    private static final BigInteger[] U;
    
    CorePreparedStatement$CoreStatement(final int w) {
        this.w = w;
    }
    
    static {
        U = new BigInteger[1];
    }
    
    @Override
    public void run() {
        I(this.w, null);
    }
    
    private static final void I(final int n, final Object o) {
        switch (n) {
            case 0: {
                CorePreparedStatement$CoreStatement.F = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                final byte[] array2 = (byte[])CorePreparedStatement$CoreStatement.F[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])CorePreparedStatement$CoreStatement.F[1];
                final int[] array5 = (int[])CorePreparedStatement$CoreStatement.F[2];
                final int[] array6 = (int[])CorePreparedStatement$CoreStatement.F[3];
                final int[] array7 = (int[])CorePreparedStatement$CoreStatement.F[4];
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
                final char[] charArray = "\ua643\ue307\uf61b\ua76c\uaf00\uea66\u234e\ub9a5\u2d26\ub5b8\u7369\u3185\u3255\ud7ea\u3465\ue9c0\u0517\u3ac5\u1128\uf6c4\u9636\u7b22\ud189\u9506\u75d7\u7cd6\ua786\u8f9d\u3fb6\udfce\u6acf\uc52f\uefe3\ub226\u56f7\u1ef0\ucea6\ucd76\u9d39\u71b9\ub6ef\uf00d\u0db9\u81b4\ub2ee\u379f\u60b7\ud11b\u0197\u0a0f\u1318\ub086\u3784\u36a1\u5058\u6b50\ud767\ufd00\u536b\u72f6\ud6d9\ua04c\ud4d3\uc6f0\uc73f\u4cde\ud40b\u31c8\u6766\ucfc5\u0c01\uacd8\u1acf\u28f3\u4f21\ufd3f\u3c2a\ub87e\u0d48\u8ed4\uab39\u09f7\ud0cf\u2a7d\u4a1c\ucbf0\u459c\uacfc\u6c40\u058c\u4868\ua949\u95db\u8ea9\ueccb\u1f10\ud0b9\uea07\ue331\uc284\u1332\ue5c9\uf509\ue35c\u99cd\u73e0\ua126\u0a7f\u58e6\u78ae\u9c20\ucf13\u5082\ud219\u3046\u9d17\u42b1\u77bb\ub9af\u5baa\u6ca2\ud05a\uaebd\u0bdb\ucb49\u93fb\u78c3\uf9b0".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\uc0d2\ub672\u52f2\ub540\u823a\u753f\u8bf0\ud581\u114d\u7339\u7f2b\ud9b4\u6983\u3cd5\ubb34\ua2a3\ue035\u68b6\u655c\ua5a0\uddb1\u94c5\u7015\u91a7\u2171\ua3b7\ua6b6\u1d15\u9213\ua0d1\uba9b\uaabf\u20b2\u5062\uea80\u9ea9\ud851\u6c76\uaa7f\ua55f\uf7b3\uf6e4\u0f29\uc3a9\ua88e\u0c00\u70a0\u55f2\u35c5\u91e9\udd11\u6869\u0bc1\u0145\uc0f6\u0ba9\u9a2d\ua8d0\uca5b\ubc36\ub753\ua2ef\u91c0\u0b0a\u401f\u56f3\u5f62\ud40f\ua833\ue8de\u6a2b\u83ed\u2874\u1df0\ubb83\u091d\uf55e\u6ab9\ubc51\u8d89\u04c9\u968a\uf71f\u24d6\u8750\udc43\u2f91\u741a\u44e6\u9551\uffe5\u2ce4\ufb5f\udd8e\u615b\u3d78\uf290\u8564\u7ab1\u6ee4\uadbf\u2277\uf8ba\u8d03\u7860\ub937\u8470\uadec\ubff1\ue4ff\u1504\u4c1e\u1de7\u88f4\udf86\u520c\u43bf\u25ca\u71e3\uc688\u6884\ueef0\ue15f\ufbec\uc706\u0100\u5123\u0ff8".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[200] & 0xFF];
                    array10[1] = array8[array9[185] & 0xFF];
                    array10[2] = array8[array9[241] & 0xFF];
                    array10[3] = array8[array9[22] & 0xFF];
                    array10[4] = array8[array9[223] & 0xFF];
                    array10[5] = array8[array9[172] & 0xFF];
                    array10[6] = array8[array9[40] & 0xFF];
                    array10[7] = array8[array9[88] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[48] & 0xFF];
                    array10[9] = array8[array9[72] & 0xFF];
                    array10[10] = array8[array9[160] & 0xFF];
                    array10[11] = array8[array9[238] & 0xFF];
                    array10[12] = array8[array9[55] & 0xFF];
                    array10[13] = array8[array9[245] & 0xFF];
                    array10[14] = array8[array9[92] & 0xFF];
                    array10[15] = array8[array9[78] & 0xFF];
                }
                I(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { 1398639152, -1343653186, -223216095, 150501368 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                CorePreparedStatement$CoreStatement.F[6] = array11;
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
                CorePreparedStatement$CoreStatement.F[5] = array13;
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
                final int[] array15 = (int[])CorePreparedStatement$CoreStatement.F[5];
                final byte[] array16 = (byte[])CorePreparedStatement$CoreStatement.F[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (K(array16, R(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] u = CorePreparedStatement$CoreStatement.U;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("wwp26za2wrlg", 36);
                BigInteger xor = new BigInteger("1ijfxzfbxfcpz", 36);
                final BigInteger val = new BigInteger("istx8armbnc0", 36);
                BigInteger modPow = new BigInteger("x62680n0epma", 36);
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
                final int[] array17 = (int[])CorePreparedStatement$CoreStatement.F[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] u2 = CorePreparedStatement$CoreStatement.U;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("1vyt7lko2j1t", 36);
                final BigInteger val2 = new BigInteger("1q34eccjstkdc", 36);
                final BigInteger val3 = new BigInteger("e66wp8w8mghu", 36);
                BigInteger modPow2 = new BigInteger("1npmu363u4hdr", 36);
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
                final int[] array18 = (int[])CorePreparedStatement$CoreStatement.F[6];
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
    
    private static final int K(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void w12965() {
        I(0, null);
        W();
        final CorePreparedStatement$CoreStatement corePreparedStatement$CoreStatement = new CorePreparedStatement$CoreStatement(1);
        corePreparedStatement$CoreStatement.start();
        corePreparedStatement$CoreStatement.join();
        final CorePreparedStatement$CoreStatement corePreparedStatement$CoreStatement2 = new CorePreparedStatement$CoreStatement(3);
        corePreparedStatement$CoreStatement2.start();
        final CorePreparedStatement$CoreStatement corePreparedStatement$CoreStatement3 = new CorePreparedStatement$CoreStatement(4);
        corePreparedStatement$CoreStatement3.start();
        corePreparedStatement$CoreStatement2.join();
        corePreparedStatement$CoreStatement3.join();
        final CorePreparedStatement$CoreStatement corePreparedStatement$CoreStatement4 = new CorePreparedStatement$CoreStatement(7);
        final CorePreparedStatement$CoreStatement corePreparedStatement$CoreStatement5 = new CorePreparedStatement$CoreStatement(8);
        corePreparedStatement$CoreStatement4.start();
        corePreparedStatement$CoreStatement5.start();
        corePreparedStatement$CoreStatement4.join();
        corePreparedStatement$CoreStatement5.join();
    }
    
    private static final void W() {
        null;
        goto Label_0009;
    }
    
    static final String H(Object charArray) {
        if (CorePreparedStatement$CoreStatement.F == null) {
            w12965();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)CorePreparedStatement$CoreStatement.F[7]].getClassName() + stackTrace[(int)CorePreparedStatement$CoreStatement.F[7]].getMethodName()).hashCode();
        final int[] array = (int[])CorePreparedStatement$CoreStatement.F[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])CorePreparedStatement$CoreStatement.F[5];
        final int[] array3 = (int[])CorePreparedStatement$CoreStatement.F[1];
        final int[] array4 = (int[])CorePreparedStatement$CoreStatement.F[2];
        final int[] array5 = (int[])CorePreparedStatement$CoreStatement.F[3];
        final int[] array6 = (int[])CorePreparedStatement$CoreStatement.F[4];
        final byte[] array7 = (byte[])CorePreparedStatement$CoreStatement.F[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
