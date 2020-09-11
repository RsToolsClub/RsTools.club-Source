// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.net.URLStreamHandler;
import nbz.nfc.Handler;
import java.net.URL;
import nbz.nfc.kq;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.io.InputStream;
import java.io.File;

public class SQLiteJDBCLoader
{
    private static boolean extracted;
    
    public static synchronized boolean initialize() throws Exception {
        if (!(boolean)mn.j(-1625425626)) {
            mn.W(-2105607891, null);
        }
        mn.W(1673328940, null);
        return (boolean)mn.j(-1625425626);
    }
    
    private static File getTempDir() {
        return (File)mn.k(1696660370, new Object[] { mn.W(-1473185493, new Object[] { Function$SQLiteConnection.c("\ub74d\u1a66\ub80e\u1d33\u39b5\u2d68\u7ce1\ub6d1\u3018\ub3b7\u85c9\u2f39\uf7e0\u2130\u148a\ua673\u9a65"), mn.W(1109523384, new Object[] { Function$SQLiteConnection.c("\ub748\u1a75\ub81f\u1d7c\u39e8\u2d70\u7ce2\ub696\u3018\ub3bf\u8597\u2f29\uf7e4\u2132") }) }) });
    }
    
    static void cleanup() {
        final Object[] array = (Object[])mn.t(mn.k(1696660370, new Object[] { mn.t(mn.W(-600901334, null), 171506579, null) }), -1100416736, new Object[] { mn.k(947517729, null) });
        if (array != null) {
            for (final Object o : array) {
                if (!(boolean)mn.t(mn.k(1696660370, new Object[] { mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { mn.t(o, 171506579, null) }), -542770190, new Object[] { Function$SQLiteConnection.c("\ueef7\u490f\u48a0\uaf84") }), 948763657, null) }), 79427943, null)) {
                    try {
                        (boolean)mn.t(o, -1003882132, null);
                    }
                    catch (SecurityException ex) {
                        mn.t(mn.j(-122423009), 789641509, new Object[] { mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { Function$SQLiteConnection.c("\uee9f\u4902\u48aa\uaf83\ucb38\ubb8a\u7cd7\u6874\u8a9e\uad6b\ud634\u5397\u0ff9\u2e4d\u5e1d\ud9df\uc191\ua064\u1de8\ucd1d\u8072\u379e\uf234\uca1e\u6ab5\u3e8a\ua488\u61d6\u377e\u97c6\ue507") }), -542770190, new Object[] { mn.t(ex, -433456866, null) }), 948763657, null) });
                    }
                }
            }
        }
    }
    
    @Deprecated
    static boolean getPureJavaFlag() {
        return (boolean)mn.W(866122820, new Object[] { mn.W(-1473185493, new Object[] { Function$SQLiteConnection.c("\u8bc3\ucba3\ub0d8\u2aa7\u804c\u0e2e\u2a7f\udea1\u174d\u2a63\u166e\u233a\u10b6\uba55\u811b"), Function$SQLiteConnection.c("\u8bd6\ucbb3\ub0d8\u2abd\u805d") }) });
    }
    
    @Deprecated
    public static boolean isPureJavaMode() {
        return false;
    }
    
    public static boolean isNativeMode() throws Exception {
        (boolean)mn.W(741669156, null);
        return (boolean)mn.j(-1625425626);
    }
    
    static String md5sum(final InputStream inputStream) throws IOException {
        final Object k = mn.k(-1323960029, new Object[] { inputStream });
        try {
            final Object w = mn.W(-1129580254, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\ub02d\u607e\u5be6") });
            while ((int)mn.t(mn.k(1295645049, new Object[] { k, w }), 2140141944, null) >= 0) {}
            final Object i = mn.k(-199755401, null);
            mn.t(i, 1651767677, new Object[] { (byte[])mn.t(w, -1602225802, null) });
            final Object t = mn.t(i, 335411580, null);
            mn.t(k, 1615591803, null);
            return (String)t;
        }
        catch (NoSuchAlgorithmException ex) {
            throw (Throwable)mn.k(1834875258, new Object[] { mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\ub02d\u607e\u5be6\u0b66\ue849\u68e8\u834f\ua5d1\uf389\u5d3c\ub4de\ud677\udcf7\u1dca\ude8f\uf938\u93a1\u1751\uf9b8\u0edc\u6373\u9cca\u50f7\u28d9\u179a\ucb1f\u0565\u4dac\u1f07\u09f5\uf4fe\u1596") }), 1107491174, new Object[] { ex }), 948763657, null) });
        }
        finally {
            mn.t(k, 1615591803, null);
            throw;
        }
    }
    
    private static boolean contentsEquals(InputStream k, InputStream i) throws IOException {
        if (!(k instanceof BufferedInputStream)) {
            k = (InputStream)mn.k(-1323960029, new Object[] { k });
        }
        if (!(i instanceof BufferedInputStream)) {
            i = (InputStream)mn.k(-1323960029, new Object[] { i });
        }
        for (int j = (int)mn.t(k, -176424591, null); j != -1; j = (int)mn.t(k, -176424591, null)) {
            if (j != (int)mn.t(i, -176424591, null)) {
                return false;
            }
        }
        return (int)mn.t(i, -176424591, null) == -1;
    }
    
    private static boolean extractAndLoadLibraryFile(final String s, final String s2, final String s3) {
        final Object t = mn.t(mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { s }), -542770190, new Object[] { Function$ProgressHandler.Y("\u1d41") }), -542770190, new Object[] { s2 }), 948763657, null);
        final Object w = mn.W(1560738420, new Object[] { Function$ProgressHandler.Y("\u1d1d\u2e0c\u4413\u3131\udb3e\u3bba\u8079\u24f9\u684c\ud138\ue4db\uae41\uf9e3\uc723\uc641"), { mn.W(-206374546, null), mn.t(mn.W(-370607760, null), -1139345041, null), s2 } });
        final Object t2 = mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { w }), -542770190, new Object[] { Function$ProgressHandler.Y("\u1d40\u2e11\u441c\u3133") }), 948763657, null);
        final Object k = mn.k(165215165, new Object[] { s3, w });
        final Object i = mn.k(165215165, new Object[] { s3, t2 });
        try {
            final Object w2 = mn.W(193526133, new Object[] { SQLiteJDBCLoader.class, t });
            if (!(boolean)mn.t(i, 79427943, null)) {
                mn.t(mn.k(-744424527, new Object[] { i }), -1841300555, null);
            }
            final Object j = mn.k(-744424527, new Object[] { k });
            try {
                final byte[] array = new byte[8192];
                int intValue;
                while ((intValue = (int)mn.t(w2, -1659831377, new Object[] { array })) != -1) {
                    mn.t(j, -2085553234, new Object[] { array, 0, intValue });
                }
                mn.t(k, -1709442700, null);
                mn.t(i, -1709442700, null);
                if (j != null) {
                    mn.t(j, -1841300555, null);
                }
                if (w2 != null) {
                    mn.t(w2, 997063604, null);
                }
            }
            finally {
                mn.t(k, -1709442700, null);
                mn.t(i, -1709442700, null);
                if (j != null) {
                    mn.t(j, -1841300555, null);
                }
                if (w2 != null) {
                    mn.t(w2, 997063604, null);
                }
                throw;
            }
            (boolean)mn.t(k, 29555059, new Object[] { true });
            (boolean)mn.t(k, -308414094, new Object[] { true, true });
            (boolean)mn.t(k, -523306615, new Object[] { true });
            final Object w3 = mn.W(193526133, new Object[] { SQLiteJDBCLoader.class, t });
            final Object l = mn.k(195099464, new Object[] { k });
            try {
                if (!(boolean)mn.W(2087385927, new Object[] { w3, l })) {
                    throw (Throwable)mn.k(-652215482, new Object[] { mn.W(1560738420, new Object[] { Function$ProgressHandler.Y("\u1d28\u2e1c\u4416\u3134\udb2f\u3bbb\u8074\u24a8\u6850\ud135\ue489\uae40\uf9a7\uc772\uc657\u1e17\u9829\u2430\ua3af\u2cb1\u206e\u9947\u8e34\u50f4\u91f6\ucdcd\u396b\u484d\u580d\uebef\ub422\u2fe1\ufc61\ub503\u66a2\u01d8\u67a8\uf252\u92df\ue8b7\ue86e\u9219\u271c"), { k } }) });
                }
                if (w3 != null) {
                    mn.t(w3, 997063604, null);
                }
                if (l != null) {
                    mn.t(l, 997063604, null);
                }
            }
            finally {
                if (w3 != null) {
                    mn.t(w3, 997063604, null);
                }
                if (l != null) {
                    mn.t(l, 997063604, null);
                }
                throw;
            }
            return (boolean)mn.W(-2092500147, new Object[] { s3, w });
        }
        catch (IOException ex) {
            mn.t(mn.j(-122423009), 789641509, new Object[] { mn.t(ex, -1299907764, null) });
            return false;
        }
    }
    
    private static boolean loadNativeLibrary(final String s, final String s2) {
        if (mn.t(mn.k(165215165, new Object[] { s, s2 }), 79427943, null)) {
            try {
                System.load((String)mn.t(mn.k(165215165, new Object[] { s, s2 }), 171506579, null));
                return true;
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                mn.t(mn.j(-122423009), 789641509, new Object[] { mn.t(mn.t(mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { Function$ProgressHandler.Y("\u4121\u457c\udb61\u569f\u4d43\u574e\u008f\ufb65\uae48\u897b\u6035\u738e\u2ef0\uf1f9\u372a\u1515\uacef\u9350\uaebe\u60ac\ub05b\u4393\u7344\u5de9\u105b\u5981\u6800\u7d14\u2966\u1ca7") }), -542770190, new Object[] { s2 }), -542770190, new Object[] { Function$ProgressHandler.Y("\u4149\u453d\udb67\u5680\u4d4f\u5744\u00c9\ufb7e\uae1d\u897b") }), -542770190, new Object[] { mn.W(1235286859, null) }), 948763657, null) });
                mn.t(mn.j(-122423009), -1629029558, new Object[] { unsatisfiedLinkError });
                return false;
            }
        }
        return false;
    }
    
    private static void loadSQLiteNativeLibrary() throws Exception {
        if (mn.j(-1625425626)) {
            return;
        }
        final Object w = mn.W(1109523384, new Object[] { Function$SQLiteConnection.c("\ua0c4\u784d\uce36\u4e0b\ub754\ua282\u6c15\u8d6e\u8739\ud5cb\u37f5\u4db6\u72b9\ufca6\ud277\u38f5\u5328\u7658\u3482") });
        Object o = mn.W(1109523384, new Object[] { Function$SQLiteConnection.c("\ua0c4\u784d\uce36\u4e0b\ub754\ua282\u6c15\u8d6e\u8739\ud5cb\u37f5\u4db6\u72b9\ufca6\ud277\u38eb\u5328\u7641\u348f") });
        if (o == null) {
            o = mn.W(-1553859775, new Object[] { Function$SQLiteConnection.c("\ua0d8\u784e\uce3d\u4e4c\ub753\ua296\u6c13\u8d63\u872f\ud5cd") });
            if (o != null && (boolean)mn.t(o, -1103627954, new Object[] { Function$SQLiteConnection.c("\ua085\u785b\uce28\u4e49\ub74e\ua291") })) {
                o = mn.t(o, -1571423263, new Object[] { Function$SQLiteConnection.c("\ua085\u785b\uce28\u4e49\ub74e\ua291"), Function$SQLiteConnection.c("\ua085\u7855\uce3f\u4e4c\ub74b\ua29a\u6c1b") });
            }
        }
        if (w != null && (boolean)mn.W(-2092500147, new Object[] { w, o })) {
            mn.z(-1625425626, true);
            return;
        }
        final Object w2 = mn.W(1560738420, new Object[] { Function$SQLiteConnection.c("\ua084\u781a\uce22\u4e0a\ub749\ua292\u6c0d\u8d6e\u873b\ud5cb\u37f4\u4dff\u72a3"), { mn.t(mn.t(mn.t(SQLiteJDBCLoader.class, 1694235456, null), 1196292927, null), 822737726, new Object[] { Function$SQLiteConnection.c("\ua0f7\u7811"), Function$SQLiteConnection.c("\ua084") }), mn.W(1235286859, null) } });
        int booleanValue = ((boolean)mn.W(-1634206907, new Object[] { mn.t(mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { w2 }), -542770190, new Object[] { Function$SQLiteConnection.c("\ua084") }), -542770190, new Object[] { o }), 948763657, null) })) ? 1 : 0;
        if (booleanValue == 0 && (boolean)mn.t(mn.W(1308883780, null), -608109668, new Object[] { Function$SQLiteConnection.c("\ua0e6\u785e\uce32") })) {
            final String c = Function$SQLiteConnection.c("\ua0c7\u7856\uce33\u4e56\ub756\ua29f\u6c10\u8d73\u8728\ud5c4\u37bf\u4db8\u72b3\ufcea\ud233\u38eb\u5320\u7640\u3483\ufb3f");
            if (mn.W(-1634206907, new Object[] { mn.t(mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { w2 }), -542770190, new Object[] { Function$SQLiteConnection.c("\ua084") }), -542770190, new Object[] { c }), 948763657, null) })) {
                o = c;
                booleanValue = 1;
            }
        }
        if (booleanValue == 0) {
            mn.z(-1625425626, false);
            throw (Throwable)mn.k(1994914626, new Object[] { mn.W(1560738420, new Object[] { Function$SQLiteConnection.c("\ua0e5\u7850\uce71\u4e4b\ub746\ua287\u6c10\u8d71\u8728\ud58e\u37b7\u4db3\u72b2\ufcb6\ud238\u38f7\u5330\u760c\u3483\ufb2e\u4d87\udbc5\u46c8\ubd6e\ubafd\u2ef7\ud7dd\uc606\u3be5\u9913\u9b09\uf187\ucc33\u663b\u2e90\u2aeb\u625c\u1c08\ue4e6\u3681\u235f\ue6ff\u0e67\u14b5\u2f88\ubb88\ubd9c\uc777\u3d4e\u5ac5\ubdb4\uc92c\ua12f\uf1b0\ua9a9\u624a\u9409\u436b\u1a17\u3f70\u87c0\ua481\u76ac\u1e11\uac56"), { mn.W(1308883780, null), mn.W(252246851, null), w2 } }) });
        }
        if (mn.W(843381529, new Object[] { w2, o, mn.t(mn.W(-600901334, null), 171506579, null) })) {
            mn.z(-1625425626, true);
            return;
        }
        mn.z(-1625425626, false);
    }
    
    private static boolean hasResource(final String s) {
        return mn.W(-209913064, new Object[] { SQLiteJDBCLoader.class, s }) != null;
    }
    
    private static void getNativeLibraryFolderForTheCurrentOS() {
        mn.W(1308883780, null);
        mn.W(252246851, null);
    }
    
    public static int getMajorVersion() {
        final Object[] array = (Object[])mn.t(mn.W(-206374546, null), 139393406, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u235c\u2b84") });
        return (int)((array.length > 0) ? mn.W(2139094090, new Object[] { array[0] }) : 1);
    }
    
    public static int getMinorVersion() {
        final Object[] array = (Object[])mn.t(mn.W(-206374546, null), 139393406, new Object[] { Function$ProgressHandler.Y("\u9ccb\uae83") });
        return (int)((array.length > 1) ? mn.W(2139094090, new Object[] { array[1] }) : 0);
    }
    
    public static String getVersion() {
        Object o = mn.W(-209913064, new Object[] { SQLiteJDBCLoader.class, Function$ProgressHandler.Y("\u6b10\u9b2e\u5dee\u972a\uae8f\u55c5\ue485\uec73\uf6fd\ua392\u587d\u1786\u0bfc\u0ecf\ua670\uc806\u4d07\u7cbe\u5725\ue9ae\ub023\u0ad4\u1cba\u9b21\udba0\ua8f7\ufbd9\u49d8\u1657\u29b3\uc6a3\u8bb5\u3d41\ub0eb\u8092\u6d05\u4fbb\u69ad\u5ff6\ud9db\u1cc4\u25a7\u2694\uc77f\uec2a\ud7b8\ue6cd\u33a1\u4085\uf2b0\u8de9\ub7bf\u76cf") });
        if (o == null) {
            o = mn.W(-209913064, new Object[] { SQLiteJDBCLoader.class, Function$ProgressHandler.Y("\u6b10\u9b2e\u5dee\u972a\uae8f\u55c5\ue485\uec73\uf6fd\ua392\u587d\u1786\u0bfc\u0ecf\ua670\uc806\u4d07\u7cbe\u5725\ue9ae\ub023\u0ad4\u1cba\u9b21\udba0\ua8f7\ufbd9\u49d8\u1657\u29b3\uc6a3\u8bb5\u3d41\ub0eb\u8092\u6d05\u4fbb\u69ad\u5ff6\ud9fd\u1cee\u2598\u26e9\uc746\uec17\ud799") });
        }
        Object o2 = Function$ProgressHandler.Y("\u6b4a\u9b0d\u5dc0\u9710\uaea1\u559f\ue4a2");
        try {
            if (o != null) {
                final Object k = mn.k(1914436680, null);
                mn.t(k, -1170343146, new Object[] { mn.W(1609890583, new Object[] { o }) });
                o2 = mn.t(k, -500958139, new Object[] { Function$ProgressHandler.Y("\u6b49\u9b06\u5dd9\u970d\uaea7\u5587\ue4a2"), o2 });
                o2 = mn.t(mn.t(o2, 353499525, null), 822737726, new Object[] { Function$ProgressHandler.Y("\u6b64\u9b3d\u5d9b\u9753\uaef7\u55b4\ue4e2\uec60"), "" });
            }
        }
        catch (IOException ex) {
            mn.t(mn.j(-122423009), -1629029558, new Object[] { ex });
        }
        return (String)o2;
    }
    
    static {
        mn.z(-1625425626, false);
    }
    
    static InputStream K(final Class clazz, final String name) {
        return new kq(clazz.getResourceAsStream(name));
    }
    
    static URL S(final Class clazz, final String name) {
        h();
        final URL resource = clazz.getResource(name);
        if (resource == null) {
            return null;
        }
        return new URL(null, SQLiteDataSource$SQLiteDataSource.G("\ua149\u1307\u266e\u307a") + resource.toString(), new Handler());
    }
    
    static InputStream b(final URL url) throws IOException {
        if (url.getProtocol().startsWith(SQLiteDataSource$SQLiteDataSource.G("\uaf47\u19cd\uf8e9"))) {
            return new kq(url.openStream());
        }
        return url.openStream();
    }
    
    private static void h() {
        if (System.getProperty(Function$SQLiteConnection.c("\uebb3\uadd6\u020e\u5291\u8df1\u9369\u2b94h\u4f4e\uf9d4\u12d0\u5865\u3995\uc798\uf34e\u3f54\u00c7\ue485\ubfa8\u92a5\ud799\ue970\u475e\u3d8b\ueb4c\ub516")) == null) {
            System.setProperty(Function$SQLiteConnection.c("\uebb3\uadd6\u020e\u5291\u8df1\u9369\u2b94h\u4f4e\uf9d4\u12d0\u5865\u3995\uc798\uf34e\u3f54\u00c7\ue485\ubfa8\u92a5\ud799\ue970\u475e\u3d8b\ueb4c\ub516"), Function$SQLiteConnection.c("\uebb7\uadd5\u0202"));
        }
        else if (!System.getProperty(Function$SQLiteConnection.c("\uebb3\uadd6\u020e\u5291\u8df1\u9369\u2b94h\u4f4e\uf9d4\u12d0\u5865\u3995\uc798\uf34e\u3f54\u00c7\ue485\ubfa8\u92a5\ud799\ue970\u475e\u3d8b\ueb4c\ub516")).contains(Function$SQLiteConnection.c("\uebb7\uadd5\u0202"))) {
            System.setProperty(Function$SQLiteConnection.c("\uebb3\uadd6\u020e\u5291\u8df1\u9369\u2b94h\u4f4e\uf9d4\u12d0\u5865\u3995\uc798\uf34e\u3f54\u00c7\ue485\ubfa8\u92a5\ud799\ue970\u475e\u3d8b\ueb4c\ub516"), System.getProperty(Function$SQLiteConnection.c("\uebb3\uadd6\u020e\u5291\u8df1\u9369\u2b94h\u4f4e\uf9d4\u12d0\u5865\u3995\uc798\uf34e\u3f54\u00c7\ue485\ubfa8\u92a5\ud799\ue970\u475e\u3d8b\ueb4c\ub516")) + Function$SQLiteConnection.c("\ueba5") + Function$SQLiteConnection.c("\uebb7\uadd5\u0202"));
        }
    }
}
