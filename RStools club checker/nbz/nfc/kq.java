// 
// Decompiled by Procyon v0.5.36
// 

package nbz.nfc;

import java.io.IOException;
import java.io.PushbackInputStream;
import java.io.InputStream;
import java.io.FilterInputStream;

public class kq extends FilterInputStream
{
    private static Object[] R;
    int B;
    int[] U;
    
    public kq(final InputStream in) throws IOException {
        super(new PushbackInputStream(in, 4));
        null;
        goto Label_0019;
    }
    
    public static final void M() {
        final int[] array = new int[256];
        final byte[] array2 = new byte[256];
        final int[] array3 = new int[256];
        final int[] array4 = new int[256];
        final int[] array5 = new int[256];
        final int[] array6 = new int[256];
        final int[] array7 = new int[30];
        goto Label_0896;
    }
    
    private static int m(final int n, final int n2) {
        null;
        goto Label_0018;
    }
    
    private static int x(final byte[] array, final int n) {
        final int n2 = array[14] << 16;
        null;
        goto Label_0014;
    }
    
    final void Y(final byte[] array, final int n, final int n2) {
        final int[][] array2 = (int[][])kq.R[5];
        final int[] array3 = (int[])kq.R[1];
        final int[] array4 = (int[])kq.R[2];
        final int[] array5 = (int[])kq.R[3];
        final int[] array6 = (int[])kq.R[4];
        final byte[] array7 = (byte[])kq.R[0];
        for (int i = 0; i < n2; ++i) {
            final int n3 = this.B % 16 / 4;
            final int n4 = this.B % 16 % 4;
            if (this.B % 16 == 0) {
                null;
                goto Label_0125;
            }
            array[n + i] ^= (byte)(this.U[n3] >> 8 * n4);
            ++this.B;
        }
    }
    
    public static final String G(final Object o) {
        null;
        goto Label_0006;
    }
}
