// 
// Decompiled by Procyon v0.5.36
// 

package nbz.nfc;

import java.math.BigInteger;

public class dm extends Thread
{
    private static volatile Object[] k;
    private final int m;
    private static final BigInteger[] E;
    
    dm(final int m) {
        this.m = m;
    }
    
    static {
        E = new BigInteger[1];
    }
    
    @Override
    public void run() {
        F(this.m, null);
    }
    
    private static final void F(final int n, final Object o) {
        switch (n) {
            case 0: {
                dm.k = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                F(2, array);
                break;
            }
            case 2: {
                final byte[] array2 = (byte[])dm.k[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])dm.k[1];
                final int[] array5 = (int[])dm.k[2];
                final int[] array6 = (int[])dm.k[3];
                final int[] array7 = (int[])dm.k[4];
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
                final char[] charArray = "\u668c\u23c8\u36d4\u67a3\u1588\ub39c\uec60\u7079\u18ad\ud1e1\ubcff\u3be0\u144e\u9a68\u215a\ubb4f\u888f\u276a\udfe5\u19f5\u7059\u150f\u93e8\u92d1\uce42\u8983\u1d0e\ud667\uf098\u1612\u5f44\ua176\u2075\ub843\u70ec\u5372\udb99\u9ff9\u10a1\u6c16\u7822\u1f3c\uebd6\uef99\uf08f\u3048\udb22\u244e\u0362\ucc54\u3504\u952e\u31a5\u938e\ud857\u2d51\u50c4\u21b8\u8308\u9921\ub5cb\u2f5d\u3064\ub785\u9d63\u3ded\uf1df\uff1c\ua8a2\ud645\u6cf0\u4ea6\u511b\ub71b\ufeb1\u7f8f\u6b93\uda4c\ueab6\ue511\uab5b\u4238\u5dce\ucd49\u2680\u5a2a\u0bce\u8779\ub0e5\u945d\ua351\u12c0\u14f8\u947c\u846f\u9a4e\u9db6\u18df\u8618\u7777\ua2db\udda3\u0437\ue73f\uf993\u6c1b\u05a5\ud19c\uf3e0\u8be5\u568b\u3ccc\u9b29\ufc4f\ub83c\ucbfb\ud7ac\u30fe\ud0c6\u14b4\u6c8b\u7050\ua793\u29c2\u847d\uca21\udde4\u2cc6".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\ucb53\u522f\uebb2\u0389\ud303\u23fb\u4dce\ua737\ue0a2\u7a74\u5007\u109b\ue9d2\u5698\u8aea\ua3f1\u89f3\u7b3d\uad65\u881d\ub0f6\u6561\ue79b\u734d\u2e68\u7d0e\u8a86\ud622\u89bc\ud85d\u6574\u3870\u2ae1\u7433\u8b0a\u20f5\u089c\ufc91\u0bcc\uff97\u6653\u1af0\u9466\u38d8\uabde\ua0ee\u8878\u14a8\u5bad\uc764\u0e6f\u1c98\ube03\u23a8\u6448\uc7eb\u4117\uedd3\ua5ad\ubf96\u8a78/\u2c68\uf6d4\u280d\ucc5c\u727b\ued4e\u95e6\u6412\u8eff\u839a\u3193\u4fb4\ua2e8\u74a0\ue084\ufcf9\u0bde\u912e\ucc92\u95fe\uadbf\u4261\u1cac\u878b\uc4b3\uf3bc\u6939\ud63f\u7bbf\u3819\u2a62\udaf0\ufcab\ue162\u78f1\u9f6b\u7682\u8c4c\u8f36\ub7a5\u14f3\ub7e3\u0587\ueea2\uc607\ue261\u6114\u4d58\u8028\u724c\u1f48\u21b8\u94c3\uae62\u64c4\uea28\ub50b\u5167\u4b62\u9fd4\u3e7a\ubc48\u4513\u07dc\u359b\u564a".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[189] & 0xFF];
                    array10[1] = array8[array9[109] & 0xFF];
                    array10[2] = array8[array9[203] & 0xFF];
                    array10[3] = array8[array9[78] & 0xFF];
                    array10[4] = array8[array9[55] & 0xFF];
                    array10[5] = array8[array9[137] & 0xFF];
                    array10[6] = array8[array9[126] & 0xFF];
                    array10[7] = array8[array9[157] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[222] & 0xFF];
                    array10[9] = array8[array9[49] & 0xFF];
                    array10[10] = array8[array9[211] & 0xFF];
                    array10[11] = array8[array9[205] & 0xFF];
                    array10[12] = array8[array9[197] & 0xFF];
                    array10[13] = array8[array9[244] & 0xFF];
                    array10[14] = array8[array9[169] & 0xFF];
                    array10[15] = array8[array9[91] & 0xFF];
                }
                F(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { -876574255, 2111666635, 1797855064, 1819390359 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                dm.k[6] = array11;
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
                dm.k[5] = array13;
                F(6, null);
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
                final int[] array15 = (int[])dm.k[5];
                final byte[] array16 = (byte[])dm.k[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (u(array16, s(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] e = dm.E;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("ipzdd67bw9bq", 36);
                BigInteger xor = new BigInteger("vnkqsv3bvv9c", 36);
                final BigInteger val = new BigInteger("ry75bt2jveir", 36);
                BigInteger modPow = new BigInteger("1c2evobh2mpv1", 36);
                for (int n16 = 0; n16 < 4; ++n16) {
                    for (int n17 = 0; n17 < 8; ++n17) {
                        modPow = modPow.add(xor).xor(val).modPow(exponent, m);
                    }
                    synchronized (e) {
                        while (e[0] == null) {
                            e.wait(5000L);
                        }
                        xor = xor.xor(e[0]);
                        e[0] = null;
                    }
                }
                final int[] array17 = (int[])dm.k[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] e2 = dm.E;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("5li2owc4m6nl", 36);
                final BigInteger val2 = new BigInteger("8g1k31r8no7d", 36);
                final BigInteger val3 = new BigInteger("y6ztp3vhs0er", 36);
                BigInteger modPow2 = new BigInteger("qf0o3tjmguij", 36);
                for (int n19 = 0; n19 < 4; ++n19) {
                    for (int n20 = 0; n20 < 8; ++n20) {
                        modPow2 = modPow2.add(val2).xor(val3).modPow(exponent2, m2);
                    }
                    while (true) {
                        Thread.yield();
                        synchronized (e2) {
                            if (e2[0] != null) {
                                e2.notifyAll();
                                continue;
                            }
                            e2[0] = modPow2;
                            e2.notifyAll();
                        }
                        break;
                    }
                }
                final int[] array18 = (int[])dm.k[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int s(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int u(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void e26600() {
        F(0, null);
        C();
        final dm dm = new dm(1);
        dm.start();
        dm.join();
        final dm dm2 = new dm(3);
        dm2.start();
        final dm dm3 = new dm(4);
        dm3.start();
        dm2.join();
        dm3.join();
        final dm dm4 = new dm(7);
        final dm dm5 = new dm(8);
        dm4.start();
        dm5.start();
        dm4.join();
        dm5.join();
    }
    
    private static final void C() {
        null;
        goto Label_0009;
    }
    
    static final String S(Object charArray) {
        if (dm.k == null) {
            e26600();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)dm.k[7]].getClassName() + stackTrace[(int)dm.k[7]].getMethodName()).hashCode();
        final int[] array = (int[])dm.k[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])dm.k[5];
        final int[] array3 = (int[])dm.k[1];
        final int[] array4 = (int[])dm.k[2];
        final int[] array5 = (int[])dm.k[3];
        final int[] array6 = (int[])dm.k[4];
        final byte[] array7 = (byte[])dm.k[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
