// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.core;

import java.math.BigInteger;

public class CoreStatement$CoreStatement extends Thread
{
    private static volatile Object[] s;
    private final int G;
    private static final BigInteger[] O;
    
    CoreStatement$CoreStatement(final int g) {
        this.G = g;
    }
    
    static {
        O = new BigInteger[1];
    }
    
    @Override
    public void run() {
        U(this.G, null);
    }
    
    private static final void U(final int n, final Object o) {
        switch (n) {
            case 0: {
                CoreStatement$CoreStatement.s = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                U(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])CoreStatement$CoreStatement.s[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])CoreStatement$CoreStatement.s[1];
                final int[] array5 = (int[])CoreStatement$CoreStatement.s[2];
                final int[] array6 = (int[])CoreStatement$CoreStatement.s[3];
                final int[] array7 = (int[])CoreStatement$CoreStatement.s[4];
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
                final char[] charArray = "\uf0d3\ub597\ua08b\uf1fc\u1960\u6c0f\u106b\ue415\u80ca\u4902\ubc57\u81fb\uc611\ubee3\u889f\u9c62\u62b9\uc466\u1a2b\u9228\udad4\udf1f\uea53\u58b5\u2ae8\u7905\u11e6\u09f4\u0c93\u827e\uc723\u3995\u20dd\u0258\ua2b3\u77f9\u725c\ub8d4\ufa97\u8f1a\ubdec\u94e1\u415b\u2589\u8934\ufa2c\u3f88\ud4c8\ueb22\u9a0b\u244e\u48c1\ub717\u28c4\u87dc\ucfff\u4ed6\u3962\ua82d\u336b\ude6d\u3998\ue6f3\u8254\uf3ee\u7783\ue3d0\u1a21\ud2cd\u9680\u378c\uf318\uda7c\u91de\u99e1\uebe9\ue79e\u8bc8\u4a44\uab13\ufee1\uda98\u502a\ua4e1\u9950\uefa2\ud6e5\u8db2\u0c6e\u7e32\ua3a8\u0c87\u59ea\u206b\u12f1\ub40e\uaf24\u1eb7\ube70\u0fba\u4de4\ucc8b\u59cc\u09d1\u49ce\ud367\ucd7a\u0f93\u9a6f\u1130\u114d\udfb9\u9470\u3e9a\uc0c4\ua3cd\uecba\u5a31\u1834\u1241\ucd7f\u13af\u1405\u26a7\u9075\ud863\uc938\ufa77".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\u36d2\ubbda\uc418\u1a4c\u64d2\u16f6\u7968\u8633\u01bf\u2445\u5b31\u2224\u6097\u9f42\uc8af\uef62\u09b9\u8b81\u6d10\ue747\u592c\u0e9f\uaa9d\u9426\u3c7c\u4d3c\u2cf7\uf980\u63da\u9258\u98a0\u0320\u93ea\u7cff\u7024\uf27e\u9cd9\u6437\u0c66\u7d8f\u8145\u2bfa\u4c19\u0981\ubbe0\u418b\u3948\u964b\ud6b7\u350b\u331c\uec37\u7153\u4412\u553f\ueb92\uf700\u0cbe\ua7bc\u1986\uc0d3\u4ca8\ue9a0\u8271\u6e84\u49ff\u6e31\u8dd9\u33de\ubf64\u02bd\u7264\u256c\u64f2\u44ec\u4bca\u95c9\uca84\ub737\uaf45\u882a\u6808\u5df2\u1f5a\u7c65\ub826\uc876\u59bf\u99b4\uee17\u0f4a\u1896\ua9fd\ub1c7\ud59e\uf3f2\ua274\uf68e\u97fe\ue2e1\uaef4\u849c\ua30b\ue41f\u96d8\u0dc6\uf5aa\ud9ca\ue1ab\u1c64\uec09\u6943\uf21c\u34f1\u1a0a\u5db2\u0fea\u7e41\uf675\u7f34\ue3d4\u9a15\u988d\u2d9d\uc19f\u408a\u2b87\u13ca".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[27] & 0xFF];
                    array10[1] = array8[array9[139] & 0xFF];
                    array10[2] = array8[array9[25] & 0xFF];
                    array10[3] = array8[array9[113] & 0xFF];
                    array10[4] = array8[array9[209] & 0xFF];
                    array10[5] = array8[array9[253] & 0xFF];
                    array10[6] = array8[array9[123] & 0xFF];
                    array10[7] = array8[array9[211] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[244] & 0xFF];
                    array10[9] = array8[array9[106] & 0xFF];
                    array10[10] = array8[array9[227] & 0xFF];
                    array10[11] = array8[array9[236] & 0xFF];
                    array10[12] = array8[array9[1] & 0xFF];
                    array10[13] = array8[array9[122] & 0xFF];
                    array10[14] = array8[array9[154] & 0xFF];
                    array10[15] = array8[array9[81] & 0xFF];
                }
                U(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { -1536760618, -963295800, -1813201440, 1124891644 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                CoreStatement$CoreStatement.s[6] = array11;
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
                CoreStatement$CoreStatement.s[5] = array13;
                U(6, null);
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
                final int[] array15 = (int[])CoreStatement$CoreStatement.s[5];
                final byte[] array16 = (byte[])CoreStatement$CoreStatement.s[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (D(array16, N(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] o2 = CoreStatement$CoreStatement.O;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("f3utwre8xavt", 36);
                BigInteger xor = new BigInteger("1x1waxrkct4wz", 36);
                final BigInteger val = new BigInteger("ksx6svswzfyv", 36);
                BigInteger modPow = new BigInteger("dqwm1g0l1vc8", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (o2) {
                        while (o2[0] == null) {
                            o2.wait(5000L);
                        }
                        xor = xor.xor(o2[0]);
                        o2[0] = null;
                    }
                }
                final int[] array17 = (int[])CoreStatement$CoreStatement.s[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] o3 = CoreStatement$CoreStatement.O;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("1l53k2n5ze037", 36);
                final BigInteger val2 = new BigInteger("lgmfxvgrt76x", 36);
                final BigInteger val3 = new BigInteger("pmt84z64yxlu", 36);
                BigInteger modPow2 = new BigInteger("qponvj4gnqzb", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (o3) {
                            if (o3[0] != null) {
                                o3.notifyAll();
                                continue;
                            }
                            o3[0] = modPow2;
                            o3.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])CoreStatement$CoreStatement.s[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int N(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int D(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void n26328() {
        U(0, null);
        Z();
        final CoreStatement$CoreStatement coreStatement$CoreStatement = new CoreStatement$CoreStatement(1);
        coreStatement$CoreStatement.start();
        coreStatement$CoreStatement.join();
        final CoreStatement$CoreStatement coreStatement$CoreStatement2 = new CoreStatement$CoreStatement(3);
        coreStatement$CoreStatement2.start();
        final CoreStatement$CoreStatement coreStatement$CoreStatement3 = new CoreStatement$CoreStatement(4);
        coreStatement$CoreStatement3.start();
        coreStatement$CoreStatement2.join();
        coreStatement$CoreStatement3.join();
        final CoreStatement$CoreStatement coreStatement$CoreStatement4 = new CoreStatement$CoreStatement(7);
        final CoreStatement$CoreStatement coreStatement$CoreStatement5 = new CoreStatement$CoreStatement(8);
        coreStatement$CoreStatement4.start();
        coreStatement$CoreStatement5.start();
        coreStatement$CoreStatement4.join();
        coreStatement$CoreStatement5.join();
    }
    
    private static final void Z() {
        null;
        goto Label_0009;
    }
    
    static final String F(Object charArray) {
        if (CoreStatement$CoreStatement.s == null) {
            n26328();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)CoreStatement$CoreStatement.s[7]].getClassName() + stackTrace[(int)CoreStatement$CoreStatement.s[7]].getMethodName()).hashCode();
        final int[] array = (int[])CoreStatement$CoreStatement.s[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])CoreStatement$CoreStatement.s[5];
        final int[] array3 = (int[])CoreStatement$CoreStatement.s[1];
        final int[] array4 = (int[])CoreStatement$CoreStatement.s[2];
        final int[] array5 = (int[])CoreStatement$CoreStatement.s[3];
        final int[] array6 = (int[])CoreStatement$CoreStatement.s[4];
        final byte[] array7 = (byte[])CoreStatement$CoreStatement.s[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
