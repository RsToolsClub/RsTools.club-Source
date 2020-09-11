// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.javax;

import java.math.BigInteger;

public class SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource extends Thread
{
    private static volatile Object[] q;
    private final int i;
    private static final BigInteger[] R;
    
    SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource(final int i) {
        this.i = i;
    }
    
    static {
        R = new BigInteger[1];
    }
    
    @Override
    public void run() {
        V(this.i, null);
    }
    
    private static final void V(final int n, final Object o) {
        switch (n) {
            case 0: {
                SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q = new Object[] { new byte[256], new int[256], new int[256], new int[256], new int[256], null, null, null };
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
                final byte[] array2 = (byte[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[0];
                array2[0] = 99;
                final int[] array3 = (int[])o;
                for (int j = 0; j < 255; ++j) {
                    final int n3 = array3[255 - j];
                    final int n4 = n3 | n3 << 8;
                    array2[array3[j]] = (byte)(n4 ^ (n4 >> 4 ^ n4 >> 5 ^ n4 >> 6 ^ n4 >> 7) ^ 0x63);
                }
                final int[] array4 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[1];
                final int[] array5 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[2];
                final int[] array6 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[3];
                final int[] array7 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[4];
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
                final char[] charArray = "\uaa20\uef64\ufa78\uab0f\uaf29\u4314\u3ae2\u14b9\u0faa\u44d6\ud70e\ude79\uebb9\uccac\u5782\u8ab1\uc112\u8a64\u4240\u9098\u3d82\u26fa\u1f64\u6809\u5c0b\u3b41\ua7af\u26ef\u261a\u72d2\u4843\u3441\u4b84\u5dda\u8f1b\u05b6\uad41\uae07\u593c\uc118\ue587\u9651\ua60d\udc6c\u7c03\uca90\u496b\u968c\u433b\u9921\u5650\u6c1d\u7c2a\u1f9f\u1d55\u25c2\ua283\u547a\uf0c7\u0d81\u0bd6\u033f\u1b97\u50a9\u13d8\u8021\u239c\u9d42\u0d5c\u3b36\u7a84\u5b44\ueacd\u6b89\u53b1\ud18a\u94a3\u2412\u9aa8\u9048\u1084\ub0f3\u84aa\u8d5e\ued1c\u9680\u62ce\uc5db\ue0c3\ucdba\u992b\u935f\u637a\u019b\u9e0d\u9324\u85dd\ud6a8\ud4c0\u1678\u380c\u0d3b\u19ad\u6bd9\uab80\ub07d\ucc05\ub9e2\u0da1\ub727\u2266\u636b\u109a\u11bb\ueae9\u3b30\u62f1\u698e\uc32f\uda21\u5008\u3ab6\u9b4a\udb98\u3f66\u22c3\u262b\u7955".toCharArray();
                final byte[] array8 = new byte[charArray.length * 2];
                for (int l = 0; l < charArray.length; ++l) {
                    array8[l * 2] = (byte)(charArray[l] & '\u00ff');
                    array8[l * 2 + 1] = (byte)((charArray[l] & '\uff00') >> 8);
                }
                final char[] charArray2 = "\u5ade\u4e5e\u8fb3\u19e8\u3c43\uc964\uc55b\u0571\u87e6\ua307\uc670\u82a6\ub742\u9458\uadcd\u69cd\uaba0\u6424\u6480\uda1c\u7784\uf2b2\u7d06\ud4a2\uddbd\ube5d\ud010\u270b\u773b\u8b77\ub1b7\u9a73\u11fb\u7aa7\u4af1\ue636\u40d9\u91c5\u73e2\u8ed9\u384c\u4687\u980a\u2fa8\u134b\u66aa\ud9d8\u8d2b\u1f6f\u5a1b\u6333\u102f\u6aee\u5788\u2595\u3d46\u35b2\u9613\uc024\uafa6\u8221\u77fa\udf92\u7b4d\u89ec\uec6e\u1bfd\u676d\ufd88\u725b\u152a\u92a8\u9b0e\u613a\uf351\u8338\u9ce8\uf57a\ufe9c\ud5ee\u605d\u8881\udf89\u5904\u31d8\u7d2b\u3ecc\ua1c0\u698d\udde3\u7186\ub9ea\uff8f\ud25d\u2602\u914d\u7f93\ub481\ue36b\u03f1\ub2f8\u669a\u021a\u33ef\u8c8e\u5450\ua884\u6f5f\u383b\u0fc1\ue461\u1a59\ub7a7\u67ca\u6193\u360c\ufaf1\u40b7\u04a7\ue457\u8c19\uebb3\uf208\uc9e5\u2c75\u00ce\u376b\u78fd".toCharArray();
                final byte[] array9 = new byte[charArray2.length * 2];
                for (int n8 = 0; n8 < charArray2.length; ++n8) {
                    array9[n8 * 2] = (byte)(charArray2[n8] & '\u00ff');
                    array9[n8 * 2 + 1] = (byte)((charArray2[n8] & '\uff00') >> 8);
                }
                final byte[] array10 = new byte[16];
                try {
                    array10[0] = array8[array9[185] & 0xFF];
                    array10[1] = array8[array9[122] & 0xFF];
                    array10[2] = array8[array9[234] & 0xFF];
                    array10[3] = array8[array9[252] & 0xFF];
                    array10[4] = array8[array9[4] & 0xFF];
                    array10[5] = array8[array9[228] & 0xFF];
                    array10[6] = array8[array9[124] & 0xFF];
                    array10[7] = array8[array9[68] & 0xFF];
                }
                catch (Exception ex) {}
                finally {
                    array10[8] = array8[array9[241] & 0xFF];
                    array10[9] = array8[array9[113] & 0xFF];
                    array10[10] = array8[array9[123] & 0xFF];
                    array10[11] = array8[array9[150] & 0xFF];
                    array10[12] = array8[array9[26] & 0xFF];
                    array10[13] = array8[array9[180] & 0xFF];
                    array10[14] = array8[array9[21] & 0xFF];
                    array10[15] = array8[array9[19] & 0xFF];
                }
                V(5, array10);
                break;
            }
            case 4: {
                final int[] array11 = { 659608178, 166061048, 2027270338, 818705178 };
                array11[2] ^= (int)(0x0L ^ (Long.MAX_VALUE - System.currentTimeMillis() >> 63 & 0x1L));
                SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[6] = array11;
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
                SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[5] = array13;
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
                final int[] array15 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[5];
                final byte[] array16 = (byte[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[0];
                for (int n13 = 44, n14 = 4; n14 < n13; ++n14) {
                    int n15 = array15[(n14 - 1 >> 2) * 4 + (n14 - 1 & 0x3)];
                    if (n14 % 4 == 0) {
                        n15 = (f(array16, h(n15, 8)) ^ array14[n14 / 4 - 1]);
                    }
                    array15[(n14 >> 2) * 4 + (n14 & 0x3)] = (array15[(n14 - 4 >> 2) * 4 + (n14 - 4 & 0x3)] ^ n15);
                }
                break;
            }
            case 7: {
                final BigInteger[] r = SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.R;
                final BigInteger exponent = new BigInteger("10001", 16);
                final BigInteger m = new BigInteger("1emrgwkxvimj0", 36);
                BigInteger xor = new BigInteger("1tzijycutqxtq", 36);
                final BigInteger val = new BigInteger("161qlglnljvt6", 36);
                BigInteger modPow = new BigInteger("1omkeakv7y0t6", 36);
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
                final int[] array17 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[6];
                final int n18 = 0;
                array17[n18] ^= modPow.intValue();
                break;
            }
            case 8: {
                final BigInteger[] r2 = SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.R;
                final BigInteger exponent2 = new BigInteger("10001", 16);
                final BigInteger m2 = new BigInteger("1kca9ahvuplxq", 36);
                final BigInteger val2 = new BigInteger("1wsgkc2njkeq8", 36);
                final BigInteger val3 = new BigInteger("ndow8rv6vzxy", 36);
                BigInteger modPow2 = new BigInteger("1ccw7xzjkuet0", 36);
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
                final int[] array18 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[6];
                final int n21 = 1;
                array18[n21] ^= modPow2.intValue();
                break;
            }
        }
    }
    
    private static final int h(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static final int f(final byte[] array, final int n) {
        final int n2 = array[10] << 16;
        null;
        goto Label_0014;
    }
    
    private static final void j7080() {
        V(0, null);
        l();
        final SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource = new SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource(1);
        sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.start();
        sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.join();
        final SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource2 = new SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource(3);
        sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource2.start();
        final SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource3 = new SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource(4);
        sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource3.start();
        sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource2.join();
        sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource3.join();
        final SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource4 = new SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource(7);
        final SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource5 = new SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource(8);
        sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource4.start();
        sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource5.start();
        sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource4.join();
        sqLitePooledConnectionHandle$SQLiteConnectionPoolDataSource5.join();
    }
    
    private static final void l() {
        null;
        goto Label_0009;
    }
    
    static final String S(Object charArray) {
        if (SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q == null) {
            j7080();
        }
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        final int hashCode = (stackTrace[(int)SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[7]].getClassName() + stackTrace[(int)SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[7]].getMethodName()).hashCode();
        final int[] array = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[6];
        final int n = hashCode ^ array[0];
        final int n2 = hashCode ^ array[1];
        final int n3 = hashCode ^ array[2];
        final int n4 = hashCode ^ array[3];
        final int[] array2 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[5];
        final int[] array3 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[1];
        final int[] array4 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[2];
        final int[] array5 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[3];
        final int[] array6 = (int[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[4];
        final byte[] array7 = (byte[])SQLitePooledConnectionHandle$SQLiteConnectionPoolDataSource.q[0];
        charArray = ((String)charArray).toCharArray();
        null;
        goto Label_0218;
    }
}
