// 
// Decompiled by Procyon v0.5.36
// 

package nbz.nfc;

import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

public class bv extends FilterInputStream
{
    kq p;
    private byte[] i;
    
    public bv(final InputStream in, final kq p2) {
        super(in);
        this.i = new byte[1];
        this.p = p2;
    }
    
    @Override
    public synchronized int read() throws IOException {
        return (this.read(this.i, 0, 1) == -1) ? -1 : (this.i[0] & 0xFF);
    }
    
    @Override
    public boolean markSupported() {
        return false;
    }
    
    @Override
    public int read(final byte[] array) throws IOException {
        return this.read(array, 0, array.length);
    }
    
    @Override
    public int read(final byte[] b, final int off, int read) throws IOException {
        read = super.read(b, off, read);
        if (read > 0) {
            this.p.Y(b, off, read);
        }
        return read;
    }
}
