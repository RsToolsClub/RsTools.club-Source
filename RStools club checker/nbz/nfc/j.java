// 
// Decompiled by Procyon v0.5.36
// 

package nbz.nfc;

import java.util.zip.Inflater;

public class j extends Inflater
{
    kq t;
    
    public j(final kq t) {
        super(false);
        this.t = t;
    }
    
    @Override
    public void setInput(final byte[] input, final int off, final int len) {
        this.t.Y(input, off, len);
        super.setInput(input, off, len);
    }
}
