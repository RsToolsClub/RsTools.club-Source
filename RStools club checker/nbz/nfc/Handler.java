// 
// Decompiled by Procyon v0.5.36
// 

package nbz.nfc;

import java.io.IOException;
import java.net.URLConnection;
import java.net.URL;
import java.net.URLStreamHandler;

public class Handler extends URLStreamHandler
{
    @Override
    protected URLConnection openConnection(final URL url) throws IOException {
        if (url.getProtocol().equals(l.P("\ub3fd\ud12e\uaed9"))) {
            return new yu(new URL(url.toString().substring(4)));
        }
        return url.openConnection();
    }
}
