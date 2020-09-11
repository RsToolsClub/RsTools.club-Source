// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.date;

import java.math.BigInteger;

public class FormatCache$0 extends Thread
{
    private static volatile Object[] N;
    private final int Z;
    private static final BigInteger[] l;
    
    FormatCache$0(final int z) {
        this.Z = z;
    }
    
    static {
        l = new BigInteger[1];
    }
    
    @Override
    public void run() {
        o(this.Z, null);
    }
    
    private static final void o(final int n, final Object o) {
        switch (n) {
            case 0: {
                FormatCache$0.N = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                o(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])FormatCache$0.N[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])FormatCache$0.N[1];
                final int[] array5 = (int[])FormatCache$0.N[2];
                final int[] array6 = (int[])FormatCache$0.N[3];
                final int[] array7 = (int[])FormatCache$0.N[4];
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
                final char[] charArray = "\u25d4\u6090\u758c\u24fb\u532e\u1c68\u054a\u4284\u2a5d\uf90a\u5f03\u5ce4\uf2eb\ueb73\u7f1f\u7f94\ueb0f\ud62e\u7b54\u25e0\ufeca\u185a\u3f01\ua560\ua2ec\u70ba\u5ba8\u7993\u19b2\u24ef\u6db4\u899d\uc389\udf47\u9649\u2269\u85dc\u5b22\u7321\u9d52\udc93\u2329\u6545\ue2cc\u5c66\u07f9\ub78c\udd77\u55fd\u1472\u355d\u0cb8\ud3cd\uee7f\u911a\ubb6d\u6d6b\u0dc1\u2482\u64bd\u910b\ua7af\ue6ee\ub00b\u3dfc\uddec\u8938\u4e93\u9ca6\udc6e\u6cb8\u70aa\u9adf\ua065\u6d58\u41a8\u16ac\u0f18\u9dae\ubb66\u354c\u0a96\ub06c\u75c3\u3ba1\ua48c\u08ea\udb39\u47ce\u3bd5\u70c0\u0352\ue0c8\u4f10\u3759\u5c68\u31c0\u3966\uf301\u3348\ueb5f\u4d1d\ud0d6\ub124\u7c57\uf10b\ue8aa\u9c40\u016a\u1359\ub970\u0b3e\ucb64\u629c\ue1a9\u21ed\u0704\u56e2\u6b21\u0106\uddb4\u45f5\u396f\u5109\u0980\u1afa\ud5ee\ua52d".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\uda94\u5f03\u666b\u494e\u97c1\ub0c7\u1fa0\u9692\u9d0d\u5787\u7e00\ud593\u434d\u756b\ub555\uc1bf\ubdfd\ub6fc\ubf75\uf8ef\ub708\u01b1\u4ffd\u1651\u5db9\ueaa4\u265d\udb2c\udf3d\u500b\u29eb\uf2ab\u2b1d\u34c5\u1fc2\u1c7d\u2a72\u9b20\u12db\u8ff4\u58e5\u27d9\u83b6\u041e\uc972\u5f0a\u7ff7\uf039\u09d0\u9323\u882b\u12da\u6482\ub8ae\u4cea\u9a58\ub95a\u1078\u32c1\u9123\ud596\u69e8\u1c63\u7106\u22cb\u0d4e\u3748\u98bd\uf609\udbf3\u1ec7\ufa2a\u5c5c\ub04c\u2d12\u9dbc\u0cb6\ude2c\u4ec1\uf2fe\u8f24\uc00e\u916a\u7376\u40c2\u8c08\ua1ff\uecc5\uc537\ub392\ub17d\u61bc\u6c45¦\uc89c\uba08\uc847\uadbc\uab4a\u01f9\u891b\u2f22\u70dd\u5726\u502d\u06c8\ud804\u5fcf\uad92\u3d8c\u4822\u3551\u2097\u864d\u90f4\u4a12\uac46\ue778\u92cc\u0bef\u51cd\ue410\u12f8\u1e73\u0fcc\uabf3\uff47\ube71".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[30] & 0xFF];
                    array10[1] = array8[array9[172] & 0xFF];
                    array10[2] = array8[array9[204] & 0xFF];
                    array10[3] = array8[array9[188] & 0xFF];
                    array10[4] = array8[array9[198] & 0xFF];
                    array10[5] = array8[array9[135] & 0xFF];
                    array10[6] = array8[array9[120] & 0xFF];
                    array10[7] = array8[array9[137] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[4] & 0xFF];
                    array10[9] = array8[array9[109] & 0xFF];
                    array10[10] = array8[array9[45] & 0xFF];
                    array10[11] = array8[array9[171] & 0xFF];
                    array10[12] = array8[array9[210] & 0xFF];
                    array10[13] = array8[array9[50] & 0xFF];
                    array10[14] = array8[array9[71] & 0xFF];
                    array10[15] = array8[array9[93] & 0xFF];
                }
                o(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { 1328349207, 1274942126, 1242794294, -580307645 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                FormatCache$0.N[6] = array11;
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
                FormatCache$0.N[5] = array13;
                o(6, null);
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
                final int[] array15 = (int[])FormatCache$0.N[5];
                final byte[] array16 = (byte[])FormatCache$0.N[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (Z(array16, V(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] m = FormatCache$0.l;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("1ugnr7id5ux31", 36);
                BigInteger xor = new BigInteger("6d6gnx8fhygi", 36);
                final BigInteger val = new BigInteger("1m29a2r6vmgxg", 36);
                BigInteger modPow = new BigInteger("1gnrgc7t0xest", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m2);
                    }
                    synchronized (m) {
                        while (m[0] == null) {
                            m.wait(5000L);
                        }
                        xor = xor.xor(m[0]);
                        m[0] = null;
                    }
                }
                final int[] array17 = (int[])FormatCache$0.N[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] l2 = FormatCache$0.l;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m3 = new BigInteger("1elaq63agog5w", 36);
                final BigInteger val2 = new BigInteger("lk30xgjap9pq", 36);
                final BigInteger val3 = new BigInteger("18keyjqhnn63y", 36);
                BigInteger modPow2 = new BigInteger("1t2akeb49y2r7", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m3);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (l2) {
                            if (l2[0] != null) {
                                l2.notifyAll();
                                continue;
                            }
                            l2[0] = modPow2;
                            l2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])FormatCache$0.N[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int V(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int Z(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void O26094() {
        o(0, null);
        F();
        final FormatCache$0 formatCache$0 = new FormatCache$0(1);
        formatCache$0.start();
        formatCache$0.join();
        final FormatCache$0 formatCache$2 = new FormatCache$0(3);
        formatCache$2.start();
        final FormatCache$0 formatCache$3 = new FormatCache$0(4);
        formatCache$3.start();
        formatCache$2.join();
        formatCache$3.join();
        final FormatCache$0 formatCache$4 = new FormatCache$0(7);
        final FormatCache$0 formatCache$5 = new FormatCache$0(8);
        formatCache$4.start();
        formatCache$5.start();
        formatCache$4.join();
        formatCache$5.join();
    }
    
    private static final void F() {
        null;
        goto Label_0009;
    }
    
    static final String Z(Object charArray) {
        if (FormatCache$0.N == null) {
            O26094();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)FormatCache$0.N[7]].getClassName() + stackTrace[(int)FormatCache$0.N[7]].getMethodName()).hashCode();
        final int[] array = (int[])FormatCache$0.N[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])FormatCache$0.N[5];
        final int[] array3 = (int[])FormatCache$0.N[1];
        final int[] array4 = (int[])FormatCache$0.N[2];
        final int[] array5 = (int[])FormatCache$0.N[3];
        final int[] array6 = (int[])FormatCache$0.N[4];
        final byte[] array7 = (byte[])FormatCache$0.N[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
