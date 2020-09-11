// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc4;

import java.math.BigInteger;

public class JDBC4Statement$JDBC4PreparedStatement extends Thread
{
    private static volatile Object[] i;
    private final int g;
    private static final BigInteger[] y;
    
    JDBC4Statement$JDBC4PreparedStatement(final int g) {
        this.g = g;
    }
    
    static {
        y = new BigInteger[1];
    }
    
    @Override
    public void run() {
        s(this.g, null);
    }
    
    private static final void s(final int n, final Object o) {
        switch (n) {
            case 0: {
                JDBC4Statement$JDBC4PreparedStatement.i = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                final byte[] array2 = (byte[])JDBC4Statement$JDBC4PreparedStatement.i[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[1];
                final int[] array5 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[2];
                final int[] array6 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[3];
                final int[] array7 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[4];
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
                final char[] charArray = "\uf00d\ub549\ua055\uf122\ua9ba\u3efc\u172b\u1d4b\u160d\u10d8\u3ebf\uc274\u163b\u950d\u12f5\ue295\ucbdd\uc93a\u2cb0\ue611\ua04b\u217d\u5134\ueb49\u1707\u8d06\ua13c\u5b07\u0bd3\u7b20\u51e4\u604f\ua235\u41d7\u7299\u5c17\ue836\uc623\u53f3\u8246\u8b77\ue0d8\u3bc4\udbeb\u3253\u49d0\u0267\u20cb\ud690\udee2\u9e37\u6a83\u4141\uf306\u231a\ucd82\u34ef\uaa9b\u9c3c\u6bcc\u29c2\u918e\ude14\ue0c0\u4575\ud502\u226b\ua1cb\u78d0\u1d3f\u8c86\ud161\u751f\u0129\u2e6d\u223b\u3a0a\ucb59\u6d08\udd99\u2ade\uce6d\u150f\u84fb\u3d05\u8f86\udca0\u1f92\uabbf\u1fff\u8c7d\u30b7\u171e\u0aaa\u0202\uf211\u3c75\u9a60\uee88\ube4e\u5214\uf6bc\u0db0\u68ae\uef68\u8071\u7fff\u4ef3\u5abc\u9e69\u6926\u9e2b\ua504\uaa32\u3378\u62f2\uaf16\ue76d\ua877\uc03f\u67d1\udc89\u7ab3\u6c06\u2eb4\u3120\ue5d2\u76ce".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\ubf9a\u8b0b\u9e55\ub7b1\uc29b\ua1c6\ubc7b\u1560\ud43d\uc8ca\u8cfb\udca4\uada4\u6654\ude3e\ua8a1\uc082\uc243\uae9b\u803c\uc597\u033a\u1173\u2c8a\u2fbd\u8971\u93ed\ubeeb\ufb2e\u9a06\u38d8\ub709\uf7f8\uf8ee\u0f7f\u137a\u8ece\uff5a\u70c0\uc534\u0796\u441c\u03fa\u4a88\u6c98\ua1b9\u6eda\uf364\ud68f\ucc4b\u5fd5\u52f4\u2d80\u1b3d\ucb4f\u2504\u1ea0\u3561\udeeb\u3e25\u455b\ub1c5\u85cb\uc531\u0f7f\u9ee5\ud10d\u1d97\ud90f\u6713\ufffb\u9aaa\u2c29\u28bc\u41fe\u9787\u98e6\u4e86\u0e22\u13e8\ub38f\ubb42\u75ad\u59e2\u3454\uced0\ua0f8\uf6be\u70cc\u8e80\u3b90\ucb3b\u4f31\u1e41\u4633\u7fbf\ue2cf\u0d88\u90da\ud0e1\u19eb\u637b\u8973\u12ed\u3f9b\u3275\u1196\u73f2\u0559\u0740\u3a4c\uec28\ua8ed\u14fe\u0726\u4b97\u4968\uc96e\u1d43\u279e\u3024\u51a5\udd8b\u5917\u46fe\u0193\u8c0a\u4cee".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[245] & 0xFF];
                    array10[1] = array8[array9[156] & 0xFF];
                    array10[2] = array8[array9[23] & 0xFF];
                    array10[3] = array8[array9[175] & 0xFF];
                    array10[4] = array8[array9[97] & 0xFF];
                    array10[5] = array8[array9[231] & 0xFF];
                    array10[6] = array8[array9[53] & 0xFF];
                    array10[7] = array8[array9[195] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[73] & 0xFF];
                    array10[9] = array8[array9[224] & 0xFF];
                    array10[10] = array8[array9[211] & 0xFF];
                    array10[11] = array8[array9[103] & 0xFF];
                    array10[12] = array8[array9[210] & 0xFF];
                    array10[13] = array8[array9[242] & 0xFF];
                    array10[14] = array8[array9[38] & 0xFF];
                    array10[15] = array8[array9[119] & 0xFF];
                }
                s(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { -1908607259, -761004328, 308294971, -156301514 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                JDBC4Statement$JDBC4PreparedStatement.i[6] = array11;
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
                JDBC4Statement$JDBC4PreparedStatement.i[5] = array13;
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
                final int[] array15 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[5];
                final byte[] array16 = (byte[])JDBC4Statement$JDBC4PreparedStatement.i[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (u(array16, E(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] y = JDBC4Statement$JDBC4PreparedStatement.y;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("oej1a4p858br", 36);
                BigInteger xor = new BigInteger("1ty3egt4p6896", 36);
                final BigInteger val = new BigInteger("10ik9lg2lnkgv", 36);
                BigInteger modPow = new BigInteger("1a9j13c63a0oy", 36);
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
                final int[] array17 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] y2 = JDBC4Statement$JDBC4PreparedStatement.y;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("1xbuw0ped4upp", 36);
                final BigInteger val2 = new BigInteger("xlxgzznhhmau", 36);
                final BigInteger val3 = new BigInteger("1vo0rywyq7eqp", 36);
                BigInteger modPow2 = new BigInteger("yarmiw85ccix", 36);
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
                final int[] array18 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int E(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int u(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void I32303() {
        s(0, null);
        o();
        final JDBC4Statement$JDBC4PreparedStatement jdbc4Statement$JDBC4PreparedStatement = new JDBC4Statement$JDBC4PreparedStatement(1);
        jdbc4Statement$JDBC4PreparedStatement.start();
        jdbc4Statement$JDBC4PreparedStatement.join();
        final JDBC4Statement$JDBC4PreparedStatement jdbc4Statement$JDBC4PreparedStatement2 = new JDBC4Statement$JDBC4PreparedStatement(3);
        jdbc4Statement$JDBC4PreparedStatement2.start();
        final JDBC4Statement$JDBC4PreparedStatement jdbc4Statement$JDBC4PreparedStatement3 = new JDBC4Statement$JDBC4PreparedStatement(4);
        jdbc4Statement$JDBC4PreparedStatement3.start();
        jdbc4Statement$JDBC4PreparedStatement2.join();
        jdbc4Statement$JDBC4PreparedStatement3.join();
        final JDBC4Statement$JDBC4PreparedStatement jdbc4Statement$JDBC4PreparedStatement4 = new JDBC4Statement$JDBC4PreparedStatement(7);
        final JDBC4Statement$JDBC4PreparedStatement jdbc4Statement$JDBC4PreparedStatement5 = new JDBC4Statement$JDBC4PreparedStatement(8);
        jdbc4Statement$JDBC4PreparedStatement4.start();
        jdbc4Statement$JDBC4PreparedStatement5.start();
        jdbc4Statement$JDBC4PreparedStatement4.join();
        jdbc4Statement$JDBC4PreparedStatement5.join();
    }
    
    private static final void o() {
        null;
        goto Label_0009;
    }
    
    static final String q(Object charArray) {
        if (JDBC4Statement$JDBC4PreparedStatement.i == null) {
            I32303();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)JDBC4Statement$JDBC4PreparedStatement.i[7]].getClassName() + stackTrace[(int)JDBC4Statement$JDBC4PreparedStatement.i[7]].getMethodName()).hashCode();
        final int[] array = (int[])JDBC4Statement$JDBC4PreparedStatement.i[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[5];
        final int[] array3 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[1];
        final int[] array4 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[2];
        final int[] array5 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[3];
        final int[] array6 = (int[])JDBC4Statement$JDBC4PreparedStatement.i[4];
        final byte[] array7 = (byte[])JDBC4Statement$JDBC4PreparedStatement.i[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
