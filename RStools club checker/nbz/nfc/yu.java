// 
// Decompiled by Procyon v0.5.36
// 

package nbz.nfc;

import java.io.InputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class yu extends URLConnection
{
    URLConnection S;
    
    public yu(final URL url) throws IOException {
        super(url);
        this.S = url.openConnection();
    }
    
    @Override
    public void connect() throws IOException {
        this.S.connect();
    }
    
    @Override
    public InputStream getInputStream() throws IOException {
        return new kq(this.S.getInputStream());
    }
}
