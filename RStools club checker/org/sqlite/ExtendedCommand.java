// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import org.sqlite.core.DB;
import java.util.regex.Pattern;
import java.sql.SQLException;

public class ExtendedCommand
{
    public static SQLExtension parse(final String s) throws SQLException {
        if (s == null) {
            return null;
        }
        if (mn.t(s, -1289880677, new Object[] { Function$SQLiteConnection.c("\u3546\uf967\u46cc\u3d85\u3a7b\u5559") })) {
            return (SQLExtension)mn.W(-536610480, new Object[] { s });
        }
        if (mn.t(s, -1289880677, new Object[] { Function$SQLiteConnection.c("\u3556\uf963\u46dc\u3d9a\u3a61\u555b\uf7d1") })) {
            return (SQLExtension)mn.W(-769787569, new Object[] { s });
        }
        return null;
    }
    
    public static String removeQuotation(final String s) {
        if (s == null) {
            return s;
        }
        if (((boolean)mn.t(s, -1289880677, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u1c07") }) && (boolean)mn.t(s, -1103627954, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u1c07") })) || ((boolean)mn.t(s, -1289880677, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u1c02") }) && (boolean)mn.t(s, -1103627954, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u1c02") }))) {
            return (String)mn.t(s, 1499986303, new Object[] { 1, (int)mn.t(s, -1436222475, null) - 1 });
        }
        return s;
    }
    
    public static class BackupCommand implements SQLExtension
    {
        public final String srcDB;
        public final String destFile;
        private static Pattern backupCmd;
        
        public BackupCommand(final String s, final String s2) {
            mn.L(this, -1640629933, s);
            mn.L(this, 45349202, s2);
        }
        
        public static BackupCommand parse(final String s) throws SQLException {
            if (s != null) {
                final Object t = mn.t(mn.j(-380896919), 296811505, new Object[] { s });
                if (mn.t(t, -1091765264, null)) {
                    Object o = mn.W(-1257440274, new Object[] { mn.t(t, 613940207, new Object[] { 2 }) });
                    final Object w = mn.W(-1257440274, new Object[] { mn.t(t, 613940207, new Object[] { 3 }) });
                    if (o == null || (int)mn.t(o, -1436222475, null) == 0) {
                        o = Function$SQLiteConnection.c("\u27c1\u996d\u2df4\ud15a");
                    }
                    return (BackupCommand)mn.k(1975580968, new Object[] { o, w });
                }
            }
            throw (Throwable)mn.k(-886637961, new Object[] { mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { Function$SQLiteConnection.c("\u27df\u9975\u2df3\ud140\ud1ad\u250d\u6fbc\ua3ad\u94b8\u173f\u2483\udd8d\u59f7\u31e0") }), -542770190, new Object[] { s }), 948763657, null) });
        }
        
        public void execute(final DB db) throws SQLException {
            (int)mn.t(db, -1508050649, new Object[] { mn.J(this, -1640629933), mn.J(this, 45349202), null });
        }
        
        static {
            mn.z(-380896919, mn.W(-372507705, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\u8172\u8489\u7862\ufb4b\u97de\u9b63\u9866\u2b30\uf706\u1fcb\u6cb7\uf99e\u7685\u6f36\u45ee\u1d54\u322c\u9420\uc349\ua565\u6755\u7b0e\u6dc6\uc14a\u0c7a\u23df\u3fe1\u3c7f\ua028\ub383\u8ae4\ua6a3\u31fd\u45ee\u21dc\ua30d\u9a0e\u55fc\uf36b\u3d58\u1057\u314c\uef3f\ued34\u0538\uaba8\ubd41\u1f59\u6a1f\uec2d\u01e9\u62f9\u37c2\ua214\u88be\ue494\uaf40\u7aa8\ucd38\u7538\udf3b\ub445") }));
        }
    }
    
    public static class RestoreCommand implements SQLExtension
    {
        public final String targetDB;
        public final String srcFile;
        private static Pattern restoreCmd;
        
        public RestoreCommand(final String s, final String s2) {
            mn.L(this, 1966734332, s);
            mn.L(this, 331742203, s2);
        }
        
        public static RestoreCommand parse(final String s) throws SQLException {
            if (s != null) {
                final Object t = mn.t(mn.j(827718650), 296811505, new Object[] { s });
                if (mn.t(t, -1091765264, null)) {
                    Object o = mn.W(-1257440274, new Object[] { mn.t(t, 613940207, new Object[] { 2 }) });
                    final Object w = mn.W(-1257440274, new Object[] { mn.t(t, 613940207, new Object[] { 3 }) });
                    if (o == null || (int)mn.t(o, -1436222475, null) == 0) {
                        o = Function$ProgressHandler.Y("\u1005\u079a\uf8a4\ufe16");
                    }
                    return (RestoreCommand)mn.k(-325387276, new Object[] { o, w });
                }
            }
            throw (Throwable)mn.k(-886637961, new Object[] { mn.t(mn.t(mn.t(mn.k(-1510343693, null), -542770190, new Object[] { Function$ProgressHandler.Y("\u101b\u0782\uf8a3\ufe0c\u72fe\u54ee\ud5d3\u6f82\ucf41\u8427\ue7a5\ue508\u1af4\uff17") }), -542770190, new Object[] { s }), 948763657, null) });
        }
        
        public void execute(final DB db) throws SQLException {
            (int)mn.t(db, -1813185592, new Object[] { mn.J(this, 1966734332), mn.J(this, 331742203), null });
        }
        
        static {
            mn.z(827718650, mn.W(-372507705, new Object[] { SQLiteDataSource$SQLiteDataSource.G("\uc68b\u88e0\u55bd\ud312\u0c64\udba2\ua935\ucb34\u2ef2\ue8c1\u58cd\ufe4c\u32b9\uc2b1\u66e6\u84d2\ufdad\ua3f1\u2baf\u5a79\u73d3\u2476\u947a\u9df0\u05d4\u087a\ua556\ue895\u6a4c\u53b9\u449d\u8fc9\ufeec\u3a20\uef92\ub2cc\ud856\u2fed\u7c73\uea61\u68a1\ufe37\uaf2c\ud501\u7f67\u62d3\ueef0\u926f\u3821\u952b\u1ca3\u2a38\u599c\u7dd1\u5a82\u91e6\u10ba\ud6b1\u39ba\u1d43\uf2b9\u08ef\u789e\ub5cf\uf375") }));
        }
    }
    
    public interface SQLExtension
    {
        void execute(final DB p0) throws SQLException;
    }
}
