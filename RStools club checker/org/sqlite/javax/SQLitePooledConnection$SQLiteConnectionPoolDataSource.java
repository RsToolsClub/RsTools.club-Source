// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.javax;

import java.math.BigInteger;

public class SQLitePooledConnection$SQLiteConnectionPoolDataSource extends Thread
{
    private static volatile Object[] A;
    private final int K;
    private static final BigInteger[] b;
    
    SQLitePooledConnection$SQLiteConnectionPoolDataSource(final int k) {
        this.K = k;
    }
    
    static {
        b = new BigInteger[1];
    }
    
    @Override
    public void run() {
        d(this.K, null);
    }
    
    private static final void d(final int n, final Object o) {
        switch (n) {
            case 0: {
                SQLitePooledConnection$SQLiteConnectionPoolDataSource.A = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                d(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[1];
                final int[] array5 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[2];
                final int[] array6 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[3];
                final int[] array7 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[4];
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
                final char[] charArray = "\u272a\u626e\u7772\u2605\u24f7\u6b5a\ua2fc\u62ba\ud3f7\u7bb9\u81cd\u8d5b\u8856\uddf6\ud51a\uff87\ue5ce\ue428\ued7d\u4a39\u2a9f\u43c3\u9970\u01ee\u577a\u989a\u2c71\u0ea1\ube04\u04d1\u941e\u0b2e\u1d47\u0ef8\uecf4\u14ec\u2fd9\udb31\u7de0\uaf54\u4aba\u4cf0\ub110\ub955\ufa17\ua377\u421a\u3557\ubf6e\u43ed\u8114\u7d27\u6988\uabd2\u7fc2\u30bc\u0a76\ua242\u3b06\u9239\u88b1\ubcc2\u156f\ua20e\ub3c5\u5cc0\u4788\u8834\ub15f\ub58b\u1001\u619f\ub87d\u0fe7\u809e\u3e87\udae1\ud357\u1bfc\ua4fc\uafe5\u3a0f\ua1e7\u72bc\u5942\u08f6\u7c20\u9c80\uae87\u5a69\u7418\ud9fb\u0c4d\u7b4e\u4413\u72c0\ua4c3\u2296\u7ad7\uccc9\ufaca\uc329\u8164\u2382\u3ba5\ud5ff\u142e\u3bde\u1661\u3f6f\u7aff\ua97a\ua225\u28c1\u3b08\u9d8a\u02d6\u427c\ue90c\udfc3\uc836\u2d27\u7841\ubaad\uf6f0\u8695\uc2cd\u84fe".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\u4121\ud70d\u8e6d\u74b6\ue511\u1a9a\uf924\u07a7\u6f93\u1a16\u2515\uaced\u9b38\ufd4d\uffab\u5a3f\ucdc1\u0f74\ua695\ub174\u3acc\u2247\u652d\u33fa\u361b\ud0f3\u4705\ua948\u2a61\u7aed\uc5ef\ue668\u7d0c\u64c4\u22b3\u6e5e\ucfda\u1940\u0a39\u82d3\u85f2\u322d\uc3b3\u1736\u223e\u6a5b\u2f90\uf08d\u177c\u4384\u489b\ua041\u279b\u4f1e\u5316\u0923\u7ea4\u772a\ud646\u8f4b\ud153\uc466\u8559\ud303\u8206\uedb9\u98ad\u12dd\uabfe\ue41c\u3ad8\uf4a5\u0918\u6375\ub898\u8c55\u23e3\uaf30\uc3e0\u080e\u5225\ue005\u7474\u9c82\uccad\u27dc\ue17b\u9ef0\uc033\u1d3d\u29b5\u8021\u36fc\ud5e0\ud169\ue53d\uc24d\udf04\u0cbe\u0ed1\uaac9\u58df\uc742\uf6a0\ufab9\ue21d\u3022\u8a99\u0e6a\u6766\ub086\u933b\u8093\u9b16\u2d2b\uf7ac\ubaf4\ud33f\u8e6f\u51fa\uacef\u71dc\ud077\u892b\u84f4\ue3a1\u767b\uea04".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[195] & 0xFF];
                    array10[1] = array8[array9[136] & 0xFF];
                    array10[2] = array8[array9[27] & 0xFF];
                    array10[3] = array8[array9[13] & 0xFF];
                    array10[4] = array8[array9[181] & 0xFF];
                    array10[5] = array8[array9[91] & 0xFF];
                    array10[6] = array8[array9[180] & 0xFF];
                    array10[7] = array8[array9[221] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[94] & 0xFF];
                    array10[9] = array8[array9[151] & 0xFF];
                    array10[10] = array8[array9[144] & 0xFF];
                    array10[11] = array8[array9[222] & 0xFF];
                    array10[12] = array8[array9[66] & 0xFF];
                    array10[13] = array8[array9[129] & 0xFF];
                    array10[14] = array8[array9[179] & 0xFF];
                    array10[15] = array8[array9[250] & 0xFF];
                }
                d(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { -827517647, -1746494931, 425545342, -1382281979 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[6] = array11;
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
                SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[5] = array13;
                d(6, null);
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
                final int[] array15 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[5];
                final byte[] array16 = (byte[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (R(array16, u(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] b = SQLitePooledConnection$SQLiteConnectionPoolDataSource.b;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("o2mbglpwaxw4", 36);
                BigInteger xor = new BigInteger("5yxuquqvzz68", 36);
                final BigInteger val = new BigInteger("1kar53k25eiyl", 36);
                BigInteger modPow = new BigInteger("i9mu6ato81pa", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (b) {
                        while (b[0] == null) {
                            b.wait(5000L);
                        }
                        xor = xor.xor(b[0]);
                        b[0] = null;
                    }
                }
                final int[] array17 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] b2 = SQLitePooledConnection$SQLiteConnectionPoolDataSource.b;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("j56aua2ev30j", 36);
                final BigInteger val2 = new BigInteger("3iphlyfk0v7s", 36);
                final BigInteger val3 = new BigInteger("oxrfbyqaz0p5", 36);
                BigInteger modPow2 = new BigInteger("y5j2n28743wj", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (b2) {
                            if (b2[0] != null) {
                                b2.notifyAll();
                                continue;
                            }
                            b2[0] = modPow2;
                            b2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int u(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int R(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void o19044() {
        d(0, null);
        F();
        final SQLitePooledConnection$SQLiteConnectionPoolDataSource sqLitePooledConnection$SQLiteConnectionPoolDataSource = new SQLitePooledConnection$SQLiteConnectionPoolDataSource(1);
        sqLitePooledConnection$SQLiteConnectionPoolDataSource.start();
        sqLitePooledConnection$SQLiteConnectionPoolDataSource.join();
        final SQLitePooledConnection$SQLiteConnectionPoolDataSource sqLitePooledConnection$SQLiteConnectionPoolDataSource2 = new SQLitePooledConnection$SQLiteConnectionPoolDataSource(3);
        sqLitePooledConnection$SQLiteConnectionPoolDataSource2.start();
        final SQLitePooledConnection$SQLiteConnectionPoolDataSource sqLitePooledConnection$SQLiteConnectionPoolDataSource3 = new SQLitePooledConnection$SQLiteConnectionPoolDataSource(4);
        sqLitePooledConnection$SQLiteConnectionPoolDataSource3.start();
        sqLitePooledConnection$SQLiteConnectionPoolDataSource2.join();
        sqLitePooledConnection$SQLiteConnectionPoolDataSource3.join();
        final SQLitePooledConnection$SQLiteConnectionPoolDataSource sqLitePooledConnection$SQLiteConnectionPoolDataSource4 = new SQLitePooledConnection$SQLiteConnectionPoolDataSource(7);
        final SQLitePooledConnection$SQLiteConnectionPoolDataSource sqLitePooledConnection$SQLiteConnectionPoolDataSource5 = new SQLitePooledConnection$SQLiteConnectionPoolDataSource(8);
        sqLitePooledConnection$SQLiteConnectionPoolDataSource4.start();
        sqLitePooledConnection$SQLiteConnectionPoolDataSource5.start();
        sqLitePooledConnection$SQLiteConnectionPoolDataSource4.join();
        sqLitePooledConnection$SQLiteConnectionPoolDataSource5.join();
    }
    
    private static final void F() {
        null;
        goto Label_0009;
    }
    
    static final String F(Object charArray) {
        if (SQLitePooledConnection$SQLiteConnectionPoolDataSource.A == null) {
            o19044();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[7]].getClassName() + stackTrace[(int)SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[7]].getMethodName()).hashCode();
        final int[] array = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[5];
        final int[] array3 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[1];
        final int[] array4 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[2];
        final int[] array5 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[3];
        final int[] array6 = (int[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[4];
        final byte[] array7 = (byte[])SQLitePooledConnection$SQLiteConnectionPoolDataSource.A[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
