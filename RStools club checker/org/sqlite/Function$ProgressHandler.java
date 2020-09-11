// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.math.BigInteger;

public class Function$ProgressHandler extends Thread
{
    private static volatile Object[] C;
    private final int Q;
    private static final BigInteger[] K;
    
    Function$ProgressHandler(final int q) {
        this.Q = q;
    }
    
    static {
        K = new BigInteger[1];
    }
    
    @Override
    public void run() {
        E(this.Q, null);
    }
    
    private static final void E(final int n, final Object o) {
        switch (n) {
            case 0: {
                Function$ProgressHandler.C = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                E(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])Function$ProgressHandler.C[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])Function$ProgressHandler.C[1];
                final int[] array5 = (int[])Function$ProgressHandler.C[2];
                final int[] array6 = (int[])Function$ProgressHandler.C[3];
                final int[] array7 = (int[])Function$ProgressHandler.C[4];
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
                final char[] charArray = "\u5e87\u1bc3\u0edf\u5fa8\u37e8\u3846\u73e4\u6dd0\u5cba\uf18c\ud166\u8b94\u6831\ud08f\ufd7a\u52ac\u98c4\u82cd\u0190\u6081\ub84f\u5cb8\ucd2c\ueba1\uc0eb\u4b83\u3f6e\u5dbd\u6f1c\u0bbb\u1b53\u811b\u4dec\u0837\u0c93\u1995\u07b9\u761a\u00ea\uc9b1\ua657\u6648\u23c0\ua62e\uae4b\u4938\ud58b\ue64e\u83ec\ud71a\ub765\u9b82\uf355\ua8ab\u2bb0\u2c15\u3df6\u9af9\uee02\u920b\u0f49\u42f7\ua844\u07d1\u6056\u7e70\u0b63\ud809\u7336\uc39a\uf182\u98dc\ue429\ua951\u36a3\u2243\u5a88\ud308\u6c8f\uab25\u1c67\uc65d\u981e\ueb8b\ufcf8\ue563\ub2c7\u0210\u648f\u51bc\u34bd\ue964\u81b6\u192c\u51e0\u957b\u751f\ubdc7\u8efa\udcd0\ufca4\u210a\uf08d\u1c78\ub404\u3495\ua48c\ucc52\u3ca6\ubc94\u781b\u5a70\u40a5\u269c\u0e69\u0fd2\u3832\ubf40\u1e15\u8ade\ud031\u6c04\uf61d\u8258\uc35a\uc0ba\u37a3\u03cd".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\ud538\u892f\u5bba\u1ab3\u91d5\u77c5\u9deb\ud41c\u0eea\u588c\udd32\uc10e\u1f64\uf8e8\uabb0\ub07f\u98e9\uf16b\ud148\u3e1d\uca9e\u8d9c\ua04c\u9a50\u899e\u5749\u3984\u9f67\u5356\ue2b3\uce32\u24fb\udafb\uede7\u64fe\u2e58\u486f\u82d6\u3d67\u5d53\uab3d\u73e3\u39f6\ue1ce\u6cd2\u37c8\u7c5a\uc412\u22ff\u69cf\uafeb\u1c73\ua189\u1b0c\u12e7\u6fba\ua9a1\uc43d\u50e0\u9424\u01d8\u52cd\u5cbd\u5585\u2bf3\u1091\ua814\u3178\udc16\u168b\u1272\u2cab\u996a\ucdf5\u9c3b\u2734\u8c22\uc50d\ub386\uc134\u969e\ue9e6\u9616\u6f8f\ueb04\u06c0\u3b53\u1328\u6257\u9fa9\uf5a9\ud6ae\ud83a\u190e\u70ae\u49d1\u1c84\u1617\u983b\ud056\u156a\u9e39\u2ae5\u433b\u5b56\u8782\u573e\ub442\u82e9\ud10e\u13b0\uabac\u2733\u84e1\u55d3\uc403\uf00b\u03c4\u6117\ue001\ubd15\u2c32\uca55\u57cd\u8410\ud791\ud87b\u9638".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[68] & 0xFF];
                    array10[1] = array8[array9[4] & 0xFF];
                    array10[2] = array8[array9[145] & 0xFF];
                    array10[3] = array8[array9[84] & 0xFF];
                    array10[4] = array8[array9[255] & 0xFF];
                    array10[5] = array8[array9[128] & 0xFF];
                    array10[6] = array8[array9[219] & 0xFF];
                    array10[7] = array8[array9[220] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[233] & 0xFF];
                    array10[9] = array8[array9[122] & 0xFF];
                    array10[10] = array8[array9[41] & 0xFF];
                    array10[11] = array8[array9[211] & 0xFF];
                    array10[12] = array8[array9[156] & 0xFF];
                    array10[13] = array8[array9[125] & 0xFF];
                    array10[14] = array8[array9[77] & 0xFF];
                    array10[15] = array8[array9[87] & 0xFF];
                }
                E(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { 370330805, -1453477313, 926540979, -66719269 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                Function$ProgressHandler.C[6] = array11;
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
                Function$ProgressHandler.C[5] = array13;
                E(6, null);
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
                final int[] array15 = (int[])Function$ProgressHandler.C[5];
                final byte[] array16 = (byte[])Function$ProgressHandler.C[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (S(array16, w(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] m = Function$ProgressHandler.K;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("ojhboqovopta", 36);
                BigInteger xor = new BigInteger("raii3yd0xv27", 36);
                final BigInteger val = new BigInteger("qhsqzz94sz83", 36);
                BigInteger modPow = new BigInteger("1pgyp7vajdyjf", 36);
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
                final int[] array17 = (int[])Function$ProgressHandler.C[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] k2 = Function$ProgressHandler.K;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m3 = new BigInteger("a4836c6it6gd", 36);
                final BigInteger val2 = new BigInteger("tdzfjnp6brxu", 36);
                final BigInteger val3 = new BigInteger("1ab0vkzdeuryz", 36);
                BigInteger modPow2 = new BigInteger("10wbue0mi7xqb", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m3);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (k2) {
                            if (k2[0] != null) {
                                k2.notifyAll();
                                continue;
                            }
                            k2[0] = modPow2;
                            k2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])Function$ProgressHandler.C[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int w(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int S(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void e28423() {
        E(0, null);
        T();
        final Function$ProgressHandler function$ProgressHandler = new Function$ProgressHandler(1);
        function$ProgressHandler.start();
        function$ProgressHandler.join();
        final Function$ProgressHandler function$ProgressHandler2 = new Function$ProgressHandler(3);
        function$ProgressHandler2.start();
        final Function$ProgressHandler function$ProgressHandler3 = new Function$ProgressHandler(4);
        function$ProgressHandler3.start();
        function$ProgressHandler2.join();
        function$ProgressHandler3.join();
        final Function$ProgressHandler function$ProgressHandler4 = new Function$ProgressHandler(7);
        final Function$ProgressHandler function$ProgressHandler5 = new Function$ProgressHandler(8);
        function$ProgressHandler4.start();
        function$ProgressHandler5.start();
        function$ProgressHandler4.join();
        function$ProgressHandler5.join();
    }
    
    private static final void T() {
        null;
        goto Label_0009;
    }
    
    static final String Y(Object charArray) {
        if (Function$ProgressHandler.C == null) {
            e28423();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)Function$ProgressHandler.C[7]].getClassName() + stackTrace[(int)Function$ProgressHandler.C[7]].getMethodName()).hashCode();
        final int[] array = (int[])Function$ProgressHandler.C[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])Function$ProgressHandler.C[5];
        final int[] array3 = (int[])Function$ProgressHandler.C[1];
        final int[] array4 = (int[])Function$ProgressHandler.C[2];
        final int[] array5 = (int[])Function$ProgressHandler.C[3];
        final int[] array6 = (int[])Function$ProgressHandler.C[4];
        final byte[] array7 = (byte[])Function$ProgressHandler.C[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
