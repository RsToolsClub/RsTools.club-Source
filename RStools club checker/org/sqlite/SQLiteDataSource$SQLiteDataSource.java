// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.math.BigInteger;

public class SQLiteDataSource$SQLiteDataSource extends Thread
{
    private static volatile Object[] k;
    private final int O;
    private static final BigInteger[] z;
    
    SQLiteDataSource$SQLiteDataSource(final int o) {
        this.O = o;
    }
    
    static {
        z = new BigInteger[1];
    }
    
    @Override
    public void run() {
        V(this.O, null);
    }
    
    private static final void V(final int n, final Object o) {
        switch (n) {
            case 0: {
                SQLiteDataSource$SQLiteDataSource.k = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                V(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])SQLiteDataSource$SQLiteDataSource.k[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])SQLiteDataSource$SQLiteDataSource.k[1];
                final int[] array5 = (int[])SQLiteDataSource$SQLiteDataSource.k[2];
                final int[] array6 = (int[])SQLiteDataSource$SQLiteDataSource.k[3];
                final int[] array7 = (int[])SQLiteDataSource$SQLiteDataSource.k[4];
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
                final char[] charArray = "\ue360\ua624\ub338\ue24f\u53a4\u8287\u1302\u8fde\u77af\ua8db\ub8c3\uaf13\u57d0\ubdf1\u813f\u24fa\u6930\u7981\u8383\u856a\uf42d\u5a06\u8b48\uf780\ucbda\u70fc\u5b22\ue77c\u0ffa\ue9b5\u3046\ud84c\u2449\u2cb0\u3372\u74eb\u7bfcL\uf11e\u32fd\u2444\u83a3\u6fa2\ua090\ue82f\u5519\udeba\udd31\ue9c2\u7e81\uc825\u1bf9\u04c6\uec37\u5975\u0a58\ub2a5\u902c\u34c1\u7566\u57f7\u06f3\ud851\u19d5\u133c\u245e\ud3aa\u941f\uea0f\u09f0\u624d\ue35c\u8905\ufd49\uf474\uf161\u43db\ub42c\ud257\u7b06\ud497\u6089\ub79b\u27e1\u11bb\ubd7e\u4148\u1172\u13ca\u2eea\u8e5f\u3252\u9efe\u19ff\ufe08\u6777\u4e28\u5482\u9c20\ub0d1\u48df\ua55e\u4d0a\u7883\u22b9\u78dd\ua294\u0188\uca4d\u0a38\ud825\u626b\u6113\u3954\u0228\u7b66\u9043\u67b9\u2521\ueb43\u8c5c\u9037\u1c4f\u25d0\ud9fe\u88c3\uaca6\u012f".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\ub9a9\ue4ca\u7f29\u63a3\u6caf\u39d1\u455e\uce41\ua027\u60f3\uc06a\uc58e\u2d53\ua1d6\u3e56\u9c6a\u7577\u5b9c\ub05b\u5dad\uf73e\u0ad4\u5856\u79c1\u9b68\u8c04\u66a4\u3a32\u6e55\uc212\u7369\u91ae\ua106\udbbd\uafe8\ua44b\u0857\u617f\ue391\u408f\u3db1\u1f76\u7df8\u882f\u7fe0\u4780\u1a1d\u7b56\ue8d4\ue3a0\ua5ef\ud7a8\u1e6a\u9a10\uaef9\uca82\u4ab7\u9ad9\uadd5\u9be2\uf0b4\ubd0f\ucb38\u6f36\u20b2\ucb18\u51c2\u9517\ubc56\u15b9\u39b9\uded9\u2bbd\ufbd9\u5d58\u9d50\ue534\u2f75\u4036\u6ef5\u905a\ua622\ucc85\u5a9a\u65f5\ub197\u749b\ud802\u263b\u0385\u2514\u8bf7\u03a7\u3120\u61a6\ua3d6\ud0c1\u3d22\uf3d1\uaa5f\u196d\u1c84\u9db5\ucb06\u4b8a\u9f29\u71b0\u3721\u2b60\ue8ec\u1b64\u76f2\u39db\u3a8a\u9780\u4546\ub538\ucdb0\ubfbc\ud390\u4bc7\u38ef\u46f2\u94bc\u2e9e\ufbb0\uae2e\ud2e5".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[157] & 0xFF];
                    array10[1] = array8[array9[162] & 0xFF];
                    array10[2] = array8[array9[31] & 0xFF];
                    array10[3] = array8[array9[224] & 0xFF];
                    array10[4] = array8[array9[115] & 0xFF];
                    array10[5] = array8[array9[53] & 0xFF];
                    array10[6] = array8[array9[43] & 0xFF];
                    array10[7] = array8[array9[80] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[127] & 0xFF];
                    array10[9] = array8[array9[62] & 0xFF];
                    array10[10] = array8[array9[163] & 0xFF];
                    array10[11] = array8[array9[178] & 0xFF];
                    array10[12] = array8[array9[52] & 0xFF];
                    array10[13] = array8[array9[81] & 0xFF];
                    array10[14] = array8[array9[12] & 0xFF];
                    array10[15] = array8[array9[83] & 0xFF];
                }
                V(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { -1817676270, -1303542414, 967242179, -1892769356 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                SQLiteDataSource$SQLiteDataSource.k[6] = array11;
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
                SQLiteDataSource$SQLiteDataSource.k[5] = array13;
                V(6, null);
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
                final int[] array15 = (int[])SQLiteDataSource$SQLiteDataSource.k[5];
                final byte[] array16 = (byte[])SQLiteDataSource$SQLiteDataSource.k[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (S(array16, R(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] z = SQLiteDataSource$SQLiteDataSource.z;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("176g2cd6ktr8d", 36);
                BigInteger xor = new BigInteger("1b5dstsala0r5", 36);
                final BigInteger val = new BigInteger("jkck1rycygx0", 36);
                BigInteger modPow = new BigInteger("y1ixar6n5nl5", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (z) {
                        while (z[0] == null) {
                            z.wait(5000L);
                        }
                        xor = xor.xor(z[0]);
                        z[0] = null;
                    }
                }
                final int[] array17 = (int[])SQLiteDataSource$SQLiteDataSource.k[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] z2 = SQLiteDataSource$SQLiteDataSource.z;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("e3vt0ezta0h", 36);
                final BigInteger val2 = new BigInteger("zadqd8nj8veo", 36);
                final BigInteger val3 = new BigInteger("1vhozw1xx93a9", 36);
                BigInteger modPow2 = new BigInteger("s29bjtpjeovw", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (z2) {
                            if (z2[0] != null) {
                                z2.notifyAll();
                                continue;
                            }
                            z2[0] = modPow2;
                            z2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])SQLiteDataSource$SQLiteDataSource.k[6];
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
    
    private static final int S(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void N5842() {
        V(0, null);
        M();
        final SQLiteDataSource$SQLiteDataSource sqLiteDataSource$SQLiteDataSource = new SQLiteDataSource$SQLiteDataSource(1);
        sqLiteDataSource$SQLiteDataSource.start();
        sqLiteDataSource$SQLiteDataSource.join();
        final SQLiteDataSource$SQLiteDataSource sqLiteDataSource$SQLiteDataSource2 = new SQLiteDataSource$SQLiteDataSource(3);
        sqLiteDataSource$SQLiteDataSource2.start();
        final SQLiteDataSource$SQLiteDataSource sqLiteDataSource$SQLiteDataSource3 = new SQLiteDataSource$SQLiteDataSource(4);
        sqLiteDataSource$SQLiteDataSource3.start();
        sqLiteDataSource$SQLiteDataSource2.join();
        sqLiteDataSource$SQLiteDataSource3.join();
        final SQLiteDataSource$SQLiteDataSource sqLiteDataSource$SQLiteDataSource4 = new SQLiteDataSource$SQLiteDataSource(7);
        final SQLiteDataSource$SQLiteDataSource sqLiteDataSource$SQLiteDataSource5 = new SQLiteDataSource$SQLiteDataSource(8);
        sqLiteDataSource$SQLiteDataSource4.start();
        sqLiteDataSource$SQLiteDataSource5.start();
        sqLiteDataSource$SQLiteDataSource4.join();
        sqLiteDataSource$SQLiteDataSource5.join();
    }
    
    private static final void M() {
        null;
        goto Label_0009;
    }
    
    static final String G(Object charArray) {
        if (SQLiteDataSource$SQLiteDataSource.k == null) {
            N5842();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)SQLiteDataSource$SQLiteDataSource.k[7]].getClassName() + stackTrace[(int)SQLiteDataSource$SQLiteDataSource.k[7]].getMethodName()).hashCode();
        final int[] array = (int[])SQLiteDataSource$SQLiteDataSource.k[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])SQLiteDataSource$SQLiteDataSource.k[5];
        final int[] array3 = (int[])SQLiteDataSource$SQLiteDataSource.k[1];
        final int[] array4 = (int[])SQLiteDataSource$SQLiteDataSource.k[2];
        final int[] array5 = (int[])SQLiteDataSource$SQLiteDataSource.k[3];
        final int[] array6 = (int[])SQLiteDataSource$SQLiteDataSource.k[4];
        final byte[] array7 = (byte[])SQLiteDataSource$SQLiteDataSource.k[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
