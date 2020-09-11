// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite;

import java.sql.SQLException;

public class SQLiteException extends SQLException
{
    private SQLiteErrorCode resultCode;
    
    public SQLiteException(final String reason, final SQLiteErrorCode sqLiteErrorCode) {
        super(reason, null, (int)mn.J(sqLiteErrorCode, 1970010661) & 0xFF);
        mn.L(this, 313063972, sqLiteErrorCode);
    }
    
    public SQLiteErrorCode getResultCode() {
        return (SQLiteErrorCode)mn.J(this, 313063972);
    }
}
