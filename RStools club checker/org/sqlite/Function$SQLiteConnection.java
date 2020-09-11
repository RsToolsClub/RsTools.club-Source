// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.math.BigInteger;

public class Function$SQLiteConnection extends Thread
{
    private static volatile Object[] N;
    private final int P;
    private static final BigInteger[] h;
    
    Function$SQLiteConnection(final int p) {
        this.P = p;
    }
    
    static {
        h = new BigInteger[1];
    }
    
    @Override
    public void run() {
        P(this.P, null);
    }
    
    private static final void P(final int n, final Object o) {
        switch (n) {
            case 0: {
                Function$SQLiteConnection.N = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                P(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])Function$SQLiteConnection.N[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])Function$SQLiteConnection.N[1];
                final int[] array5 = (int[])Function$SQLiteConnection.N[2];
                final int[] array6 = (int[])Function$SQLiteConnection.N[3];
                final int[] array7 = (int[])Function$SQLiteConnection.N[4];
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
                final char[] charArray = "\u76eb\u33af\u26b3\u77c4\u85a0\ufaaa\u91f1\u141b\ud2b0\ub756\u4776\u83be\u00e1\ue634\u17bd\u6c7f\u7dd3\uc653\u40b8\u0a38\u5966\ub22e\u173d\u2e6e\uf2d4\ud87a\u8d26\u9f51\u8d09\u7270\u9559\uc7c1\udbfc\u001d\u6443\u2f2e\ued7e\u48c9\ue5fd\u8d2f\ue77f\u0cf1\uc2e9\u48b8\u745a\u8cf7\ue7b4\u75b7\ua3fa\ua320\u1efe\u86f5\u0290\ue973\uaa24\u1b37\uc7fa\u8c6f\udd12\u80ed\u852b\ued9a\u90ba\u0dec\u7cf0\u3e54\u0c68\u06f3\ue9f8\u5b4f\ud18e\ucb17\u144f\uf719\ua517\ua242\uab3e\ua211\u21fb\u3444\u46ea\uc2a0\ua6be\u6e50\u4d4b\u0bb8\ue218\uf32e\u9cd2\u99de\ud669\uc19f\u0b13\ua0d9\uaba9\u3f34\u0916\u0ebf\ucd79\u8d3d\u3f8a\ue0f3\u46d1\u9367\u9057\uda52\u0110\uf442\uecf3\ucc47\ufa5f\u3453\u83ee\udddb\u0cc3\u5529\u22fe\u616b\ud529\u975d\u3433\u858d\uef3d\ube71\u6a1e\u9779\u2e8d\ue7ce".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\u5ec4\u8ed2\ucd80\u1f66\u2f10\u6362\u33e1\ue3e3\ua452\u677a\ufd7d\u6ccf\u99f2\u9a56\uc79b\u1ad8\uf05a\udbbd\ub1ce\ufd5d\u3c22\ua2eb\u2ae3\u5940\u3df3\u3940\ua05a\uf61f\u10a4\ud656\uf7de\udd08\ud8c8\ua8c4\u34ba\uec5e\ud041\ua522\u1ce3\u01e4\ud234\ubdf5\ua936\uf4c0\u5f92\u652a\u8054\ub399\u6a34\u746f\ue8a3\u7540\u2c9f\u9451\ue481\ud749\uc817\ub888\ue44f\u2c5f\u34fb\uae82\udb85\u3209\u2178\ude26\ud6f2\u0bd3\u58b2\ufbbe\ue95b\uaad4\udfe1\u4815\u6280\u66e0\u918f\ue5cd\u77ec\u885a\u7a85\u7689\uecd4\u9102\ud372\u70f7\u457a\ub987\u64f6\u8c51\uf80e\u01fa\u264b\u1572\uc445\udc5d\u26cb\ub31c\u1cbc\u124b\u179c\u354e\ud566\uf3e0\uadfd\u2dfb\uf087\u60cb\ud6ae\ua97e\u885d\uc8e6\ue453\u7b55\u8324\ua145\ufe48\u8d22\u9d42\ud172\u6dd6\ua7ea\ud8a8\u8932\u7d0f\u6bce\uf0a7\u0620".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[50] & 0xFF];
                    array10[1] = array8[array9[175] & 0xFF];
                    array10[2] = array8[array9[176] & 0xFF];
                    array10[3] = array8[array9[97] & 0xFF];
                    array10[4] = array8[array9[73] & 0xFF];
                    array10[5] = array8[array9[152] & 0xFF];
                    array10[6] = array8[array9[209] & 0xFF];
                    array10[7] = array8[array9[92] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[103] & 0xFF];
                    array10[9] = array8[array9[226] & 0xFF];
                    array10[10] = array8[array9[244] & 0xFF];
                    array10[11] = array8[array9[223] & 0xFF];
                    array10[12] = array8[array9[137] & 0xFF];
                    array10[13] = array8[array9[20] & 0xFF];
                    array10[14] = array8[array9[218] & 0xFF];
                    array10[15] = array8[array9[148] & 0xFF];
                }
                P(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { 401948390, 220359067, 137337436, -184559993 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                Function$SQLiteConnection.N[6] = array11;
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
                Function$SQLiteConnection.N[5] = array13;
                P(6, null);
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
                final int[] array15 = (int[])Function$SQLiteConnection.N[5];
                final byte[] array16 = (byte[])Function$SQLiteConnection.N[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (L(array16, o(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] h = Function$SQLiteConnection.h;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("1uhxz37kwigmx", 36);
                BigInteger xor = new BigInteger("xvzarapv15j5", 36);
                final BigInteger val = new BigInteger("i93i81gn0kt7", 36);
                BigInteger modPow = new BigInteger("v8tbei5akjbp", 36);
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
                final int[] array17 = (int[])Function$SQLiteConnection.N[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] h2 = Function$SQLiteConnection.h;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("m1kxtlw1c0z", 36);
                final BigInteger val2 = new BigInteger("4bmciygk3upr", 36);
                final BigInteger val3 = new BigInteger("1rqc7b1xm6jla", 36);
                BigInteger modPow2 = new BigInteger("qku9snnld81x", 36);
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
                final int[] array18 = (int[])Function$SQLiteConnection.N[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int o(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int L(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void n1461() {
        P(0, null);
        C();
        final Function$SQLiteConnection function$SQLiteConnection = new Function$SQLiteConnection(1);
        function$SQLiteConnection.start();
        function$SQLiteConnection.join();
        final Function$SQLiteConnection function$SQLiteConnection2 = new Function$SQLiteConnection(3);
        function$SQLiteConnection2.start();
        final Function$SQLiteConnection function$SQLiteConnection3 = new Function$SQLiteConnection(4);
        function$SQLiteConnection3.start();
        function$SQLiteConnection2.join();
        function$SQLiteConnection3.join();
        final Function$SQLiteConnection function$SQLiteConnection4 = new Function$SQLiteConnection(7);
        final Function$SQLiteConnection function$SQLiteConnection5 = new Function$SQLiteConnection(8);
        function$SQLiteConnection4.start();
        function$SQLiteConnection5.start();
        function$SQLiteConnection4.join();
        function$SQLiteConnection5.join();
    }
    
    private static final void C() {
        null;
        goto Label_0009;
    }
    
    static final String c(Object charArray) {
        if (Function$SQLiteConnection.N == null) {
            n1461();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)Function$SQLiteConnection.N[7]].getClassName() + stackTrace[(int)Function$SQLiteConnection.N[7]].getMethodName()).hashCode();
        final int[] array = (int[])Function$SQLiteConnection.N[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])Function$SQLiteConnection.N[5];
        final int[] array3 = (int[])Function$SQLiteConnection.N[1];
        final int[] array4 = (int[])Function$SQLiteConnection.N[2];
        final int[] array5 = (int[])Function$SQLiteConnection.N[3];
        final int[] array6 = (int[])Function$SQLiteConnection.N[4];
        final byte[] array7 = (byte[])Function$SQLiteConnection.N[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
