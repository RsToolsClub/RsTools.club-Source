// 
// Decompiled by Procyon v0.5.36
// 

package org.sqlite.jdbc3;

import java.util.List;
import nbz.nfc.kq;
import java.io.InputStream;
import java.sql.Struct;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import org.sqlite.SQLiteConnection;
import java.util.Map;
import java.util.regex.Pattern;
import org.sqlite.core.CoreDatabaseMetaData;

public abstract class JDBC3DatabaseMetaData extends CoreDatabaseMetaData
{
    private static String driverName;
    private static String driverVersion;
    protected static final Pattern TYPE_INTEGER;
    protected static final Pattern TYPE_VARCHAR;
    protected static final Pattern TYPE_FLOAT;
    private static final Map<String, Integer> RULE_MAP;
    protected static final Pattern PK_UNNAMED_PATTERN;
    protected static final Pattern PK_NAMED_PATTERN;
    
    protected JDBC3DatabaseMetaData(final SQLiteConnection sqLiteConnection) {
        super(sqLiteConnection);
    }
    
    public Connection getConnection() {
        return (Connection)j.Y(this, 2034283754);
    }
    
    public int getDatabaseMajorVersion() throws SQLException {
        return (int)j.g(j.x(673559788, new Object[] { ((Object[])j.g(j.g(j.Y(this, 2034283754), 571192555, null), 1783543891, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ua21e\uab92") }))[0] }), -2127972340, null);
    }
    
    public int getDatabaseMinorVersion() throws SQLException {
        return (int)j.g(j.x(673559788, new Object[] { ((Object[])j.g(j.g(j.Y(this, 2034283754), 571192555, null), 1783543891, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ua2a5\uc079") }))[1] }), -2127972340, null);
    }
    
    public int getDriverMajorVersion() {
        return (int)j.g(j.x(673559788, new Object[] { ((Object[])j.g(j.B(885961965), 1783543891, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ucda3\u8f38") }))[0] }), -2127972340, null);
    }
    
    public int getDriverMinorVersion() {
        return (int)j.g(j.x(673559788, new Object[] { ((Object[])j.g(j.B(885961965), 1783543891, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6c1b\uef86") }))[1] }), -2127972340, null);
    }
    
    public int getJDBCMajorVersion() {
        return 2;
    }
    
    public int getJDBCMinorVersion() {
        return 1;
    }
    
    public int getDefaultTransactionIsolation() {
        return 8;
    }
    
    public int getMaxBinaryLiteralLength() {
        return 0;
    }
    
    public int getMaxCatalogNameLength() {
        return 0;
    }
    
    public int getMaxCharLiteralLength() {
        return 0;
    }
    
    public int getMaxColumnNameLength() {
        return 0;
    }
    
    public int getMaxColumnsInGroupBy() {
        return 0;
    }
    
    public int getMaxColumnsInIndex() {
        return 0;
    }
    
    public int getMaxColumnsInOrderBy() {
        return 0;
    }
    
    public int getMaxColumnsInSelect() {
        return 0;
    }
    
    public int getMaxColumnsInTable() {
        return 0;
    }
    
    public int getMaxConnections() {
        return 0;
    }
    
    public int getMaxCursorNameLength() {
        return 0;
    }
    
    public int getMaxIndexLength() {
        return 0;
    }
    
    public int getMaxProcedureNameLength() {
        return 0;
    }
    
    public int getMaxRowSize() {
        return 0;
    }
    
    public int getMaxSchemaNameLength() {
        return 0;
    }
    
    public int getMaxStatementLength() {
        return 0;
    }
    
    public int getMaxStatements() {
        return 0;
    }
    
    public int getMaxTableNameLength() {
        return 0;
    }
    
    public int getMaxTablesInSelect() {
        return 0;
    }
    
    public int getMaxUserNameLength() {
        return 0;
    }
    
    public int getResultSetHoldability() {
        return 2;
    }
    
    public int getSQLStateType() {
        return 2;
    }
    
    public String getDatabaseProductName() {
        return JDBC3Connection$JDBC3PreparedStatement.N("\u2552\u07f5\u3dd8\u2da4\ub0d8\u0c33");
    }
    
    public String getDatabaseProductVersion() throws SQLException {
        return (String)j.g(j.Y(this, 2034283754), 571192555, null);
    }
    
    public String getDriverName() {
        return (String)j.B(-2119846674);
    }
    
    public String getDriverVersion() {
        return (String)j.B(885961965);
    }
    
    public String getExtraNameCharacters() {
        return "";
    }
    
    public String getCatalogSeparator() {
        return JDBC3ResultSet$JDBC3Savepoint.i("\uaf18");
    }
    
    public String getCatalogTerm() {
        return JDBC3Connection$JDBC3PreparedStatement.N("\udf6b\u9406\ub3a9\u3bc3\uacfd\uc314\ub279");
    }
    
    public String getSchemaTerm() {
        return JDBC3ResultSet$JDBC3Savepoint.i("\u81e3\u71e4\ua613\u7d53\u26a9\ufa73");
    }
    
    public String getProcedureTerm() {
        return JDBC3ResultSet$JDBC3Savepoint.i("\udb22\ud7d4\u0404\uc0d7\u658b\u595c\u738c\ue483\u40ce\u744e\uef79\u76b7\u1c7c\ua6a9\u6beb");
    }
    
    public String getSearchStringEscape() {
        return null;
    }
    
    public String getIdentifierQuoteString() {
        return JDBC3ResultSet$JDBC3Savepoint.i("\ue7d2");
    }
    
    public String getSQLKeywords() {
        return JDBC3Connection$JDBC3PreparedStatement.N("\u611d\u130b\ubf78\uc768\ue2e1\ub30c\u988d\ua409\u3c6b\u84a7\u7f0d\ua0fa\uef60\u8fc5\u33a4\ude4f\u124a\ub8c0\u363a\ub417\uc092\ubebf\u1ee4\u17ea\u2122\u06b4\u11bd\ud4f6\ue092\ue6af\u76cb\u6808\u6601\u1925\uf38e\ud2e2\u0767\u277d\u7475\u8085\uee9a\u83fe\uacb3\u96ea\ubb8c\u7732\ua091\u58eb\u5839\ue103\u4963\u89fa\u7291\u587e\ud75c\udc80\u27b8\uadfe\u814d#\ucdfa\u5c6d\uf105\u67db\u1e67\u2914\ub7eb\u78bb\u032c\u6fa2\u0f91\ue170\u7ddf\u7504\u8469\u718d\u3056\ud3c3\u5d18\u602d\u2d8e\u6277\uc306\ubc48\ue995\udab1\u7d5b\u654f\u48fd\u8d4c\u77f3\u9dbb\u55cf\u12c8\ua620\u9b02\u2aec\u4d40\ub26e\u3702\ud5b8\u01dd\u6269\udf14\u26db\u8464\uddf3\u72e5\uc0da\u71b5\ud932\u0b1f\uf75f\u35e0\ubd16\u5fe4\u43e6\u9093\uc4d7\ue8d4\u70c2\udab3\u4899\ub78d\ufc15\u2332\ued0c\ub3dc\u9f01\ubd39\u74f6\ue504\u076d\u8315\u89cf\ucf17\uee5b\u7f1b\u32ec\ud788\ua92d\u84f6\uf42d\ua834\u44c7\ubba1\u6dc2\u442f\uc815\u06bd\ucd08\u6dc1\u1b38\u3fdd\u8281\u9bd5\u8179\u9038\uc0dc\ub245\uf20c\u999e\ud368\u3cbb\ue11b\u6ad9\u7e49\ue910\u6764\u2a2b\uae1e\u8ae2\uc345\u923a\u5ade\u7f3e\u9c20\u8aeb\u42da\ua692\ua121\ua7d0\u6c2e\ubcef\u0784\u9277\u5b6e\u9f5b\u77c4\uf379\u44f6\uc3a9\u5abf\ue3ad\u7f14\u987f\u9798\u4602\u2805\ue66c\u018c\u7840\u18b8\u662c\u4097\ud5f7\ub124\ufc07\ubaaa\u5a5d\ub6a2\u1b22\u51c9\ua7eb\u024e\ua669\u1986\u8ed5\u6a5a\u0bf2\u5c36\u7fc2\u2ac7\u73e7\u802e\u8eae\ucba5\ua7e8\u6737\u744e\u89db\uc4f2\u3d12\uba0c\ua36c\u43d2\u49c0\uc74c\u6b19\ue237\u6081\u7a55\u4d4c\uf651\udf01\u0ef0\ubfce\u82b6\uc3c8\ufe32\u4e30\u4614\ud25e\u8f68\udb8c\u60f2\u68f6\u1e92\u59ad\u7a22\uca8f\ud25b\ua0f1\ua61b\uc364\u8a99\u3560\u84ec\u8af9\u2e25\ud9b2\u3880\u68fd\u648f\u2760\uccec\uc026\u838f\udd1b\ucb82\u52e7\u329d\u63f3\ufa96\u35fb\u8db7\u2442\uc76c\u17cb\u10b7\u7d22\ucce0\u3ed7\ufa3c\ubf9e\u8a1f\u3143\u91b5\u1654\uca0e\u2d9e\u030d\ub62d\u16a2\ue8e8\ua7f9\u4ba2\u7174\ue09c\ucfba\u908c\u15d2\ud103\uf671\u14b2\uf229\ucd26\u4286\u1afd\u1bd6\u6e37");
    }
    
    public String getNumericFunctions() {
        return "";
    }
    
    public String getStringFunctions() {
        return "";
    }
    
    public String getSystemFunctions() {
        return "";
    }
    
    public String getTimeDateFunctions() {
        return JDBC3ResultSet$JDBC3Savepoint.i("\ucf4e\ucb0a\u0fa0\u66bd\u3107\u4b1f\uca70\u0e25\ubed1\u7a0e\u61cd\uccd6\ue3ee\u147b\u261b\u4259\u8bd9\u9cc2\u690c\u2ebc\ua195\ud391\u95f4\u341f\uebbf\u9759\ueee3\uceae\u568d\u240b\u26c9\u4724\u7e46\u0243\ue230\ud128\u86f5");
    }
    
    public String getURL() {
        return (String)j.g(j.Y(this, 2034283754), 2070000831, null);
    }
    
    public String getUserName() {
        return null;
    }
    
    public boolean allProceduresAreCallable() {
        return false;
    }
    
    public boolean allTablesAreSelectable() {
        return true;
    }
    
    public boolean dataDefinitionCausesTransactionCommit() {
        return false;
    }
    
    public boolean dataDefinitionIgnoredInTransactions() {
        return false;
    }
    
    public boolean doesMaxRowSizeIncludeBlobs() {
        return false;
    }
    
    public boolean deletesAreDetected(final int n) {
        return false;
    }
    
    public boolean insertsAreDetected(final int n) {
        return false;
    }
    
    public boolean isCatalogAtStart() {
        return true;
    }
    
    public boolean locatorsUpdateCopy() {
        return false;
    }
    
    public boolean nullPlusNonNullIsNull() {
        return true;
    }
    
    public boolean nullsAreSortedAtEnd() {
        return !(boolean)j.g(this, 856667328, null);
    }
    
    public boolean nullsAreSortedAtStart() {
        return true;
    }
    
    public boolean nullsAreSortedHigh() {
        return true;
    }
    
    public boolean nullsAreSortedLow() {
        return !(boolean)j.g(this, -1528974143, null);
    }
    
    public boolean othersDeletesAreVisible(final int n) {
        return false;
    }
    
    public boolean othersInsertsAreVisible(final int n) {
        return false;
    }
    
    public boolean othersUpdatesAreVisible(final int n) {
        return false;
    }
    
    public boolean ownDeletesAreVisible(final int n) {
        return false;
    }
    
    public boolean ownInsertsAreVisible(final int n) {
        return false;
    }
    
    public boolean ownUpdatesAreVisible(final int n) {
        return false;
    }
    
    public boolean storesLowerCaseIdentifiers() {
        return false;
    }
    
    public boolean storesLowerCaseQuotedIdentifiers() {
        return false;
    }
    
    public boolean storesMixedCaseIdentifiers() {
        return true;
    }
    
    public boolean storesMixedCaseQuotedIdentifiers() {
        return false;
    }
    
    public boolean storesUpperCaseIdentifiers() {
        return false;
    }
    
    public boolean storesUpperCaseQuotedIdentifiers() {
        return false;
    }
    
    public boolean supportsAlterTableWithAddColumn() {
        return false;
    }
    
    public boolean supportsAlterTableWithDropColumn() {
        return false;
    }
    
    public boolean supportsANSI92EntryLevelSQL() {
        return false;
    }
    
    public boolean supportsANSI92FullSQL() {
        return false;
    }
    
    public boolean supportsANSI92IntermediateSQL() {
        return false;
    }
    
    public boolean supportsBatchUpdates() {
        return true;
    }
    
    public boolean supportsCatalogsInDataManipulation() {
        return false;
    }
    
    public boolean supportsCatalogsInIndexDefinitions() {
        return false;
    }
    
    public boolean supportsCatalogsInPrivilegeDefinitions() {
        return false;
    }
    
    public boolean supportsCatalogsInProcedureCalls() {
        return false;
    }
    
    public boolean supportsCatalogsInTableDefinitions() {
        return false;
    }
    
    public boolean supportsColumnAliasing() {
        return true;
    }
    
    public boolean supportsConvert() {
        return false;
    }
    
    public boolean supportsConvert(final int n, final int n2) {
        return false;
    }
    
    public boolean supportsCorrelatedSubqueries() {
        return false;
    }
    
    public boolean supportsDataDefinitionAndDataManipulationTransactions() {
        return true;
    }
    
    public boolean supportsDataManipulationTransactionsOnly() {
        return false;
    }
    
    public boolean supportsDifferentTableCorrelationNames() {
        return false;
    }
    
    public boolean supportsExpressionsInOrderBy() {
        return true;
    }
    
    public boolean supportsMinimumSQLGrammar() {
        return true;
    }
    
    public boolean supportsCoreSQLGrammar() {
        return true;
    }
    
    public boolean supportsExtendedSQLGrammar() {
        return false;
    }
    
    public boolean supportsLimitedOuterJoins() {
        return true;
    }
    
    public boolean supportsFullOuterJoins() {
        return false;
    }
    
    public boolean supportsGetGeneratedKeys() {
        return true;
    }
    
    public boolean supportsGroupBy() {
        return true;
    }
    
    public boolean supportsGroupByBeyondSelect() {
        return false;
    }
    
    public boolean supportsGroupByUnrelated() {
        return false;
    }
    
    public boolean supportsIntegrityEnhancementFacility() {
        return false;
    }
    
    public boolean supportsLikeEscapeClause() {
        return false;
    }
    
    public boolean supportsMixedCaseIdentifiers() {
        return true;
    }
    
    public boolean supportsMixedCaseQuotedIdentifiers() {
        return false;
    }
    
    public boolean supportsMultipleOpenResults() {
        return false;
    }
    
    public boolean supportsMultipleResultSets() {
        return false;
    }
    
    public boolean supportsMultipleTransactions() {
        return true;
    }
    
    public boolean supportsNamedParameters() {
        return true;
    }
    
    public boolean supportsNonNullableColumns() {
        return true;
    }
    
    public boolean supportsOpenCursorsAcrossCommit() {
        return false;
    }
    
    public boolean supportsOpenCursorsAcrossRollback() {
        return false;
    }
    
    public boolean supportsOpenStatementsAcrossCommit() {
        return false;
    }
    
    public boolean supportsOpenStatementsAcrossRollback() {
        return false;
    }
    
    public boolean supportsOrderByUnrelated() {
        return false;
    }
    
    public boolean supportsOuterJoins() {
        return true;
    }
    
    public boolean supportsPositionedDelete() {
        return false;
    }
    
    public boolean supportsPositionedUpdate() {
        return false;
    }
    
    public boolean supportsResultSetConcurrency(final int n, final int n2) {
        return n == 1003 && n2 == 1007;
    }
    
    public boolean supportsResultSetHoldability(final int n) {
        return n == 2;
    }
    
    public boolean supportsResultSetType(final int n) {
        return n == 1003;
    }
    
    public boolean supportsSavepoints() {
        return true;
    }
    
    public boolean supportsSchemasInDataManipulation() {
        return false;
    }
    
    public boolean supportsSchemasInIndexDefinitions() {
        return false;
    }
    
    public boolean supportsSchemasInPrivilegeDefinitions() {
        return false;
    }
    
    public boolean supportsSchemasInProcedureCalls() {
        return false;
    }
    
    public boolean supportsSchemasInTableDefinitions() {
        return false;
    }
    
    public boolean supportsSelectForUpdate() {
        return false;
    }
    
    public boolean supportsStatementPooling() {
        return false;
    }
    
    public boolean supportsStoredProcedures() {
        return false;
    }
    
    public boolean supportsSubqueriesInComparisons() {
        return false;
    }
    
    public boolean supportsSubqueriesInExists() {
        return true;
    }
    
    public boolean supportsSubqueriesInIns() {
        return true;
    }
    
    public boolean supportsSubqueriesInQuantifieds() {
        return false;
    }
    
    public boolean supportsTableCorrelationNames() {
        return false;
    }
    
    public boolean supportsTransactionIsolationLevel(final int n) {
        return n == 8;
    }
    
    public boolean supportsTransactions() {
        return true;
    }
    
    public boolean supportsUnion() {
        return true;
    }
    
    public boolean supportsUnionAll() {
        return true;
    }
    
    public boolean updatesAreDetected(final int n) {
        return false;
    }
    
    public boolean usesLocalFilePerTable() {
        return false;
    }
    
    public boolean usesLocalFiles() {
        return true;
    }
    
    public boolean isReadOnly() throws SQLException {
        return (boolean)j.g(j.Y(this, 2034283754), -1714834238, null);
    }
    
    public ResultSet getAttributes(final String s, final String s2, final String s3, final String s4) throws SQLException {
        if (j.Y(this, -779438909) == null) {
            j.i(this, -779438909, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b11\ube55\u887b\u65ce\u1bd0\u5979\u4a21\u26ad\u4382\u3239\u7a2f\u623a\u3315\uc9d5\ud720\ubf4d\ub2c8\ud479\u2bdb\u3e5d\u95f3\ua2ec\u4959\u424c\ue9b2\u760f\u941e\uba66\u4905\ufe2b\ucecf\ucb20\ud570\u729d\ucb65\ua87e\ua5e1\u6651\u25fd\ua373\ub5aa\u1812\ua36e\ue603\ua0ec\u8a05\u42ce\u9fbb\u7d42\uc33e\u6a78\u0ed2\u1084\u19b4\u68be\u7c2d\uacce\ufe16\u7e2f\u06f0\u949c\u8939\u5954\u6b1b\u4a5a\u9bbb\u9e3b\u24c8\u04f1\uf561\u206a\u1153\u37c4\u456e\u029b\uaefe\uc325\uff7e\u742a\u5d72\u98b7\ud29e\ufff5\u105b\u23ee\u3ba6\u5c7a\u4d7a\u2a49\ufa9f\uf01a\u3fb8\u463a\u2861\u014b\ub949\u8d5c\uaeec\uab4e\u264f\uff7f\u5757\u2b7f\u6eca\u7937\uea6c\ud180\u692a\u575d\uaab5\udf54\u4b6f\u5bc9\uf0a2\ubed2\u2c35\uf540\u1d13\ue92b\u9b39\u0374\u0a53\u39cc\u7066\ua044\uec3a\ub387\u5e21\u95f1\u2337\u44e6\udcb7\u39fe\ud80d\u9364\u43ec\u5f19\u16eb\u5d04\ud185\u5de0\u03cf\u83c4\u7293\uef63\u50a8\u35c1\u8d4f\u07d5\u11fa\u6051\u0953\uf651\uba99\u0289\uc546\u72ad\ue53f\ub9a2\u692b\u798f\u5f6b\uada5\ud9d5\ue1d6\u05dd\u2ec5\ub111\u2579\u48c3\uab7a\u5baf\u303b\u74a1\u3a07\u8980\ud53a\u38c5\u223e\ue459\u3281\uccdd\u13eb\u2089\u984d\uecda\ucb2f\u89b3\ua067\u2431\u38db\u7483\u5766\uee11\u5a5e\u5daa\ud98c\ufa00\u853a\u6ee4\uc99c\u38d7\u4235\ub84c\u7b26\ue74a\u6561\uc0da\uce32\u6b93\ufe07\u9127\u04e4\uaec0\udd1d\u0b74\uefdf\u0ab1\u8805\u1242\u3a74\u1ba7\u0e8d\u97dc\u3f80\u0afb\ubaa1\u2282\u93f0\u0bef\uf130\u437e\u64df\uff6a\ue4f7\u3ed8\u4595\u1d9d\u39f4\u8fba\u835f\ucb65\u7e30\ufee8\u8adf\u804e\ub542\u31f4\u65cb\u69ea\udd18\uc074\u4ab3\ueedd\u60c2\ua1d4\u4e89\u94a1\uf645\u47e1\u68eb\ub516\u7220\ud8b5\u4d6d\uef6c\u23a5\u8a9f\ufa26\u7f8b\ua19d\u152a\u7514\ub36b\uc060\ud5d3\ua572\u5d0e\u6b55\u6e57\u504a\ued05\uafe2\u4f7c\u2d11\u04e2\ucfb7\u4baf\u2e75\u3214\uccc5\u68a0\u94c0\ufe15\ub5e8\u8d8b\u7c42\u3942\u74f6\uf899\u50fe\ua1b4\ue04a\u03c7\u9975\uac14\u3366\ued75\u1e75\u867e\uaf28\ud7f6\uda41\ueb09\u2be0\u81c9\u8b9c\udf71\u95ec\u3932\ud648\u7ccd\ub0f8\u9b73\u208e\uf8ae\uc6e3\u51db\ua9bf\u58a3\u983a\u6330\u6dcb\u4bf1\u39ba\u0ffa\u05bb\uc160\u1281\u9545\udb90\udf47\u17d0\u45d7\ub3a3\u6190\u8262\u5c7d\u49b7\u2ffd\u50f0\u6222\u8331\u9311\ude7c\u4065\uadb5\uaf08\u1867\u094b\u4405\u7c0b\u4ed7\uc885\ucb72\udf13\uc6d3\u3d46\u4c9d\ub85a\u8516\u4ae8\ud49d\u2b38\u4933\ubb2e\u1b22\u9f83\udd8c\u45c5\u38f9\u6268\u20ea\u09ee\u5507\u4747\u18cb\ua9dc\u6e8b\u295f\u8a39\uaa82\u498b\u20be\u17bc\udfec\udb72\ue7a2\uf691\u66e8\u4219\u1c81\ue85c\u6e0a\ue560\ud655\u43af\uc47c\u9d31\u0e4f\u66a8\u0d30\u688c\uec24\uee22\u2f62\uf3ba\u5bd9\u4e1d\udfb0\u1737\uf7b5\uf3ea\u1a30\udba7\ubee4\u55ea\u8f11\ua419\u1203\ufc17\ufad7\ubfc8\uef47\u1205\u2b8e\u469e\ub72e\u08ea\u70fc\u2934\u63e9\u0b88\u8c69\ud602\u05b2\udfbc\ud8b1\u8398\u4eab\ue5b8\ue718\uc923\u3d48\uc648\u8934\u2df4\u961d\ud9ff\u4720\udaea\u84fb\u173a\u7f05\uee37\uf9da\ufb6f\uaed4") }));
        }
        return (ResultSet)j.g(j.Y(this, -779438909), 1040430277, null);
    }
    
    public ResultSet getBestRowIdentifier(final String s, final String s2, final String s3, final int n, final boolean b) throws SQLException {
        if (j.Y(this, -1906920250) == null) {
            j.i(this, -1906920250, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u66ce\u6c87\u026a\u940f\u00ef\u2cb4\ubf57\u3922\u5c9b\u89fb\u7852\u356c\u26e8\u6ff4\u5e58\uf3a0\ua6e6\ue6b1\u2779\u5dca\ud04c\ufc31\u20d2\ucf69\u283e\u9568\ued35\u24b7\u3181\u66c1\u33ff\uab4c\ufa78\uf3a1\u1572\u7755\uf414\u2145\udc18\uf199\u23e8\u8174\ud703\u6875\u23e5\u1be6\ua0a2\ub580\u81ed\u2f6b\ua888\ue624\udf3a\ud162\u373b\u059b\uc4cd\ub01a\u53ab\u0ded\u0da1\u1720\ud81d\ubf69\u84e8\u5f05\u654a\u8c18\u14be\uf01c\ua28a\ueb7c\ucc0f\u404c\uefa2\uf3ca\uf466\uc58d\u257e\u1e06\u51c8\u0d47\ue237\u8539\uf129\u41cc\u4959\uf321\ud2cd\u2602\u8162\ue3ff\uf530\uf5e7\u34e3\udde8\u581a\u6b45\u5faf\u99c5\ueccc\u82e1\u07c7\uef7d\u316f\u104b\u3978\u5fa4\u7e47\u7fff\u3aef\ue843\u36e8\udae6\u20ef\u3b1e\u5f58\u7203\u740c\ua592\ue7c7\u42ec\u3f88\u83db\u0f45\ude36\uaa9d\u6072\u723e\u3bfd\ub390\ua771\u799e\udaab\ub7dc\u44da\u7d4b\u8b99\uf43f\uf62a\ueadb\ub8e5\u3f54\u1b12\ua378\u6363\u19e4\uca93\udb20\ud471\uaf19\u1043\u6965\u5f46\u51de\u7c4a\u42fd\u673a\u1111\ufb3b\u4061\u79df\u0c54\u5dba\uf784\ubbe6\u566f\uc4e6\ubfe5\u8422\u7c1e\u10b3\u903c\u49a0\uc270\u79cc\u9461\ub92d\u555a") }));
        }
        return (ResultSet)j.g(j.Y(this, -1906920250), 1040430277, null);
    }
    
    public ResultSet getColumnPrivileges(final String s, final String s2, final String s3, final String s4) throws SQLException {
        if (j.Y(this, 503755991) == null) {
            j.i(this, 503755991, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ufe47\u05bf\u1af1\u047b\u81c1\u41b1\ud6b8\u0269\uca53\u3ffb\u2bc8\u2be9\u95ae\u239a\u98f8\u64c3\uc5b2\u24b9\u026a\uaad2\u511e\u6d18\u0572\u5e03\ufbd1\u7f4f\ub036\uca28\u54e8\u8930\u9f44\ud448\u1d68\ucb5c\ucd34\u021f\ubdaa\u4e2b\uf6c0\u5d13\udd4e\udde9\u19a9\uc683\u6554\u1371\uebaf\u1cca\udcf9\u117c\uaad8\u9d88\u7f68\u148f\u7e43\u0167\u221f\udd29\u9418\ue326\u5dd2\u3580\u0e3a\u7dde\uee53\u690d\ud2f7\u0e61\ue91a\ud7ac\u3e27\u62f4\u87dd\u47e5\u0ce6\u97f2\u34cf\ubd76\ue3b3\u80ee\u37ac\u9824\uddda\u595f\uc42a\u77f5\ue9d6\u7edc\ucb4f\u8645\udd29\u74e5\uaabd\u90eb\u992d\u8a7e\uacd3\u9f92\ud42a\u1d7e\ue02d\uec76\ue93e\u3dae\u8468\ua766\ud8eb\u4888\uc0bb\u96fa\u4748\u254c\u9594\u7de4\uce45\uc64c\u474f\u359f\u335f\u1308\uc3db\u9af7\u76d0\u73e9\u39c5\u2e99\u3241\ub062\u2bda\ua66e\u7b3f\u6675\u2070\uf1b0\u97fa\u30ad\u449e\u13ea\u5d07\ua413\u48b8\u6738\u979b\u6cbf\u2e2f\u0b75\ue20a\ued70\u8b12\u729a\uface\u2cd3\u6d05\u9cbd\uf585\u6948\u72e0\ufd85\u4734\u0ce0\u0f8b\u9aee\u17ca\u6fbb\u72c0\u527a\u0aac\u9130\u6bec\u0fe7") }));
        }
        return (ResultSet)j.g(j.Y(this, 503755991), 1040430277, null);
    }
    
    public ResultSet getColumns(final String s, final String s2, final String s3, final String s4) throws SQLException {
        j.g(this, 1659679960, null);
        final Object h = j.H(394245337, new Object[] { 700 });
        j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(h, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95e7\u3b40\ua635\u4dea\u418e\ua271\u072a\u6507\ua236\u1793\uba23\u553d\ue488\u2169\u8800\ud4a1\ue5dd\u422f\u14af\u8212\uee79\ub4d2\ub686\u232e\u17c3\u2846\u8f1e\u984e\u2e50\u7374\u519e\ub7be\u12ac\uc9a3\u81bc\u4caa\ua112\u3f49\ue571\u4c6d\u2491\uf6bf\u5c4e\u64b3\ubb81\uac10\u0499\u660e\ue8c7\u88af\ue306\udd66\u412a\u47b3\u26fe\u66fc\ub263\ue16e\ufd05\u6d2c\u2fca\uea63\u5399\u3f80\u8364\u83af\u91b9\uae7b\u9b95\u940e") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95f7\u3b4b\ua679\u4dee\u419e\ua225\u0749\u6526\ua20f\u17aa\uba02\u5553\ue4b6\u2154\u8861\ud4b8\ue5d9\u4241\u14c3\u8234\uee52\ub4b1\ub6a6\u2309\u17cf\u2822\u8f31\u986f\u2e7d\u7347\u51ea\ub786\u128f\uc9c6\u81c4\u4ccb\ua124\u3f6b\ue514\u4c53\u24b1\uf6dc\u5c52\u64af\ubb9c\uac79\u04e6\u6634\ue8e4\u888e\ue32d\udd2b\u4167\u47e4\u26ee\u66ad\ub220\ue17e\ufd61\u6d5d\u2fb8\uea1f\u53ec\u3fff\u834b\u839d\u91d4\uae7d\u9bf6\u9462\uf4d9\u6ec4\u83cb\u3205\ua10a\u2276\u7769\u3583\udd71\ub1e8") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95a6\u3b15\ua669\u4dbf\u41dd\ua235\u073a\u6559\ua273\u17cf\uba6f\u557c\ue49a\u213a\u8862\ud4a0\ue5da\u422b\u14a6\u8205\uee79\ub4dd\ub682\u2334\u17a8\u2832\u8f38\u9817\u2e1c\u7329\u518e\ub7ff\u12ff\uc9a3\u8189\u4c98\ua170\u3f41\ue571\u4c71\u248b\uf6b1\u5c47\u64ba\ubb93\uac78\u04f0\u663d\ue8ec\u8897\ue33b\udd2b\u4167\u47e7\u26ee\u66bd\ub230\ue16e\ufd30\u6d1e\u2fa8\uea61\u5389\u3f92\u8375\u83be\u91a6\uae7b\u9bfa\u9471\uf4de\u6ec8\u83c1\u3213\ua101\u2213\u7713") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95f7\u3b4a\ua635\u4de1\u4198\ua269\u0766\u6508\ua221\u1793\uba2a\u553d\ue488\u2169\u8800\ud4bb\ue5c9\u4221\u14af\u8216\uee64\ub4dd\ub682\u2356\u17cf\u2808\u8f05\u9857\u2e50\u7338\u51df\ub7ac\u12ff\uc9d1\u81ad\u4ca6\ua111\u3f57\ue57f\u4c61\u24ee\uf6dc\u5c65\u6499\ubba0\uac78\u04dc\u661c\ue8c4\u88b6\ue304\udd73\u4167\u47b7\u26ad\u66bd\ub253\ue101\ufd1d\u6d38\u2fc5\uea61\u5383\u3f9b\u836f\u83a8\u91d8\uae1e") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95a4\u3b05\ua679\u4daf\u41cd\ua264\u0779\u6549\ua210\u17ae\uba03\u5542\ue4ad\u215b\u8874\ud4b4\ue5c3\u4239\u14ba\u8207\uee63\ub4bd\ub6e7\u234a\u17cf\u2846\u8f50\u981b\u2e5d\u736b\u519e\ub78c\u128e\uc9cf\u81b7\u4caf\ua111\u3f51\ue571\u4c66\u248b\uf6b1\u5c43\u64a9\ubb9f\uac69\u04fb\u6656\ue885\u88f1\ue358\udd37\u4177\u47e6\u26ee\u66ad\ub220\ue17e\ufd61\u6d4d\u2fe9\uea5c\u53fc\u3f9c\u8362\u83af\u91a6\uae61\u9bf6\u946d\uf4d8\u6ecc\u83d1\u3205\ua115\u227a\u777d\u3581\udd09\ub180\u923f\ubc63") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95fb\u3b57\ua63d\u4dff\u4182\ua276\u072a\u6508\ua230\u17df\uba00\u554f\ue4ad\u2153\u886e\ud4b4\ue5d0\u4232\u14b3\u8218\uee75\ub4d8\ub693\u2333\u17a0\u2828\u8f5c\u981b\u2e14\u737b\u51df\ub7ac\u12ba\uc9a3\u818b\u4c84\ua13c\u3f6b\ue541\u4c5e\u24ae\uf69d\u5c64\u649a\ubba9\uac1c\u04ce\u6612\ue8c0\u88ad\ue348\udd37\u4167\u47a2\u26b6\u66f8\ub27e\ue16e\ufd76\u6d23\u2fc7\uea08\u53fc\u3fa8\u8342\u838b\u919a\uae1e\u9b88\u940e\uf4f8\u6ee1\u83e0\u3234\ua179\u2218\u776a\u3583\udd0e\ub1ef\u9233\ubc26\u1a0d\u1026\u9b53\u6d67\u8d7d\uf380\uec06\ue47b\u38e9\ue05a\u68cd") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b4\u3b05\ua679\u4daf\u418c\ua276\u072a\u6520\ua210\u17a0\uba01\u5548\ue4a5\u2156\u8861\ud4b7\ue5d0\u4228\u14cf\u8277\uee48\ub4e4\ub6ab\u2316\u17cf\u2807\u8f03\u981b\u2e6f\u735b\u51f1\ub78f\u129a\uc9dc\u81ab\u4caa\ua104\u3f49\ue57b\u4c75\u24ee\uf6dc\u5c68\u6483\ubba0\uac50\u0499\u661b\ue8d6\u88e3\ue33b\udd44\u4108\u4786\u269b\u66c2\ub243\ue10d\ufd19\u6d28\u2fc5\uea6e\u53f0\u3fff") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95fa\u3b50\ua635\u4de3\u41cd\ua264\u0779\u6549\ua210\u17bc\uba00\u554d\ue4ac\u2145\u8874\ud4b4\ue5de\u4221\u14a6\u827b\uee06\ub4ff\ub6b2\u2316\u1783\u2846\u8f11\u9848\u2e1c\u734b\u51f1\ub78a\u128d\uc9c0\u81ad\u4cb4\ua114\u3f44\ue560\u4c73\u249d\uf6a8\u5c5f\u64a6\ubb89\uac10\u0499") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95bc\u3b46\ua638\u4dfc\u4188\ua225\u0769\u6506\ua22f\u179e\uba3a\u5569\ue486\u2173\u884e\ud496\ue5ee\u4208\u148e\u8232\uee48\ub4e5\ub6e7\u230d\u1787\u2803\u8f1e\u981b\u2e0c\u7338\u51ca\ub7b7\u12ba\uc9ed\u81c8\u4ccc\ua11e\u3f4a\ue513\u4c12\u24b5\uf694\u5c63\u6498\ubbec\uac0d\u0499\u660e\ue8cd\u88a6\ue306\udd27\u4160\u478f\u269b\u66ce\ub237\ue16e\ufd34\u6d01\u2ffb\uea4a\u53fc\u3ff8\u830d\u83ce\u9191\uae50\u9bdd\u9407\uf4ac\u6ee8\u83f6\u327a\ua110\u226c\u776c\u3587\udd08\ub19c\u925c\ubc0a\u1a2f\u1016\u9b64\u6d02\u8d17\uf3e2\uec68\ue44a\u38ab\ue01e") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3\u3b02\ua679\u4dee\u419e\ua225\u0743\u653a\ua21c\u17b8\uba0a\u5553\ue4ac\u2148\u8861\ud4a1\ue5d9\u4229\u14a0\u8218\uee6a\ub4c4\ub68a\u2334\u17cf\u2800\u8f02\u9854\u2e51\u7338\u5196") });
        int n = 0;
        Object g = null;
        try {
            g = j.g(this, -2137017126, new Object[] { s, s2, s3, { JDBC3ResultSet$JDBC3Savepoint.i("\u95c0\u3b64\ua61b\u4dc3\u41a8"), JDBC3ResultSet$JDBC3Savepoint.i("\u95c2\u3b6c\ua61c\u4dd8") } });
            while (j.g(g, 1531033760, null)) {
                final Object g2 = j.g(g, 791918754, new Object[] { 3 });
                boolean b = false;
                Object o = j.g(j.Y(this, 2034283754), 1472248013, null);
                Object g3 = null;
                try {
                    o = j.g(j.Y(this, 2034283754), 1472248013, null);
                    g3 = j.g(o, 649902239, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95c7\u3b60\ua615\u4dca\u41ae\ua251\u072a\u6525\ua20a\u17b4\uba0a\u5535\ue4ce\u213f\u8841\ud480\ue5e8\u4202\u148a\u8239\uee45\ub4e3\ub6a2\u2317\u178a\u2808\u8f04\u981e\u2e1b\u7334\u519e\ub793\u1290\uc9d4\u81ad\u4cb9\ua178\u3f76\ue545\u4c5e\u24eb\uf6d5\u5c26\u64b0\ubb9e\uac73\u04f4\u665a\ue8d6\u88b2\ue304\udd6e\u4133\u47b3\u2681\u66f0\ub271\ue13d\ufd25\u6d08\u2ffa\uea0f\u538b\u3f97\u836f\u83bc\u91b1\uae1e\u9bf5\u9461\uf4db\u6ecc\u83d7\u3272\ua137\u225e\u775e\u35a3\udd74\ub1e8\u922e\ubc63\u1a2d\u101a\u9b61\u6d02\u8d08\uf38f\uec01") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { g2 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3\u3b0c\ua679\u4dce\u41a3\ua241\u072a\u653d\ua21a\u17af\uba0a\u553d\ue4a0\u2154\u8800\ud4dd\ue5bb\u4219\u1482\u8235\uee4a\ub4f4\ub6e0\u2356\u17cf\u2841\u8f06\u9852\u2e59\u736f\u5199\ub7f6") }), 705148898, null) });
                    (boolean)j.g(g3, 1531033760, null);
                    b = ((int)j.g(g3, -977619757, new Object[] { 1 }) == 1);
                    if (g3 != null) {
                        try {
                            j.g(g3, 1907931320, null);
                        }
                        catch (Exception ex) {
                            j.g(ex, -221006628, null);
                        }
                    }
                    if (o != null) {
                        try {
                            j.g(o, 1289599161, null);
                        }
                        catch (Exception ex2) {
                            j.g(ex2, -221006628, null);
                        }
                    }
                }
                finally {
                    if (g3 != null) {
                        try {
                            j.g(g3, 1907931320, null);
                        }
                        catch (Exception ex3) {
                            j.g(ex3, -221006628, null);
                        }
                    }
                    if (o != null) {
                        try {
                            j.g(o, 1289599161, null);
                        }
                        catch (Exception ex4) {
                            j.g(ex4, -221006628, null);
                        }
                    }
                    throw;
                }
                final Object g4 = j.g(j.Y(this, 2034283754), 1472248013, null);
                Object g5 = null;
                try {
                    g5 = j.g(g4, 649902239, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95c4\u3b77\ua618\u4dc8\u41a0\ua244\u072a\u651d\ua222\u179d\uba23\u5578\ue4b6\u2173\u884e\ud493\ue5f3\u4245\u14c4") }), 566474721, new Object[] { g2 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3\u3b0c") }), 705148898, null) });
                    int n2 = 0;
                    while (j.g(g5, 1531033760, null)) {
                        final Object g6 = j.g(g5, 791918754, new Object[] { 2 });
                        final Object g7 = j.g(g5, 791918754, new Object[] { 3 });
                        final Object g8 = j.g(g5, 791918754, new Object[] { 4 });
                        final Object g9 = j.g(g5, 791918754, new Object[] { 5 });
                        final boolean booleanValue = (boolean)j.g(JDBC3ResultSet$JDBC3Savepoint.i("\u95a5"), -145835974, new Object[] { j.g(g5, 791918754, new Object[] { 6 }) });
                        int booleanValue2 = 2;
                        if (g8 != null) {
                            booleanValue2 = (((boolean)j.g(g8, -145835974, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95a4") })) ? 1 : 0);
                        }
                        if (n != 0) {
                            j.g(h, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b4\u3b50\ua637\u4de6\u4182\ua26b\u072a\u6508\ua22f\u1793\uba6f") });
                        }
                        n = 1;
                        final Object o2 = (g7 == null) ? JDBC3ResultSet$JDBC3Savepoint.i("\u95c0\u3b60\ua601\u4ddb") : j.g(g7, 956544221, null);
                        int i = 0;
                        if (booleanValue && b) {
                            i = 1;
                        }
                        int j;
                        if (org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.B(-1058622242), -1198278595, new Object[] { o2 }), 252426302, null)) {
                            j = 4;
                        }
                        else if (org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.B(-930302737), -1198278595, new Object[] { o2 }), 252426302, null)) {
                            j = 12;
                        }
                        else if (org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.B(-1089293072), -1198278595, new Object[] { o2 }), 252426302, null)) {
                            j = 6;
                        }
                        else {
                            j = 12;
                        }
                        org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(h, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95e7\u3b40\ua635\u4dea\u418e\ua271\u072a") }), -1750288369, new Object[] { n2 + 1 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b4\u3b44\ua62a\u4daf\u4182\ua277\u076e\u6519\ua22c\u178c\uba63\u553d") }), -1750288369, new Object[] { booleanValue2 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b4\u3b44\ua62a\u4daf\u418e\ua26a\u0766\u6507\ua236\u1793\uba23\u557c\ue48b\u2176\u8845\ud4d9") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3") }), -1750288369, new Object[] { j }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3\u3b05\ua638\u4dfc\u41cd\ua266\u077e\u6545\ua263") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3") }), 566474721, new Object[] { g2 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3\u3b05\ua638\u4dfc\u41cd\ua271\u0768\u6505\ua22d\u179e\uba22\u5578\ue4c5\u213a") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3") }), 566474721, new Object[] { org.sqlite.jdbc3.j.g(this, 1992602843, new Object[] { g6 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3\u3b05\ua638\u4dfc\u41cd\ua266\u0764\u6545\ua263") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3") }), 566474721, new Object[] { org.sqlite.jdbc3.j.g(this, 1992602843, new Object[] { o2 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3\u3b05\ua638\u4dfc\u41cd\ua271\u0764\u6545\ua263") }), 566474721, new Object[] { org.sqlite.jdbc3.j.x(2003350769, new Object[] { (g9 == null) ? null : org.sqlite.jdbc3.j.g(this, 1992602843, new Object[] { g9 }) }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b4\u3b44\ua62a\u4daf\u418e\ua26a\u0766\u652d\ua226\u1799\uba2e\u5568\ue485\u216e\u880c") }), -1750288369, new Object[] { i }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b4\u3b44\ua62a\u4daf\u418e\ua26a\u0766\u6508\ua236\u178b\uba20\u5574\ue487\u2179\u8852\ud490\ue5f1\u4208\u148d\u8223") });
                        if (s4 != null) {
                            org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(h, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b4\u3b52\ua631\u4dea\u419f\ua260\u072a\u651c\ua233\u178f\uba2a\u556f\ue4c1\u2179\u884e\ud4dc\ue5bc\u4201\u148a\u823c\uee43\ub4b1\ub6b2\u230a\u179f\u2803\u8f02\u9813\u2e1b") }), 566474721, new Object[] { org.sqlite.jdbc3.j.g(this, 1992602843, new Object[] { s4 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95b3\u3b0c") });
                        }
                        ++n2;
                    }
                    if (g5 != null) {
                        try {
                            j.g(g5, 1907931320, null);
                        }
                        catch (SQLException ex7) {}
                    }
                    if (g4 == null) {
                        continue;
                    }
                    try {
                        j.g(g4, 1289599161, null);
                    }
                    catch (SQLException ex8) {}
                }
                finally {
                    if (g5 != null) {
                        try {
                            j.g(g5, 1907931320, null);
                        }
                        catch (SQLException ex9) {}
                    }
                    if (g4 != null) {
                        try {
                            j.g(g4, 1289599161, null);
                        }
                        catch (SQLException ex10) {}
                    }
                    throw;
                }
            }
            if (g != null) {
                try {
                    j.g(g, 1907931320, null);
                }
                catch (Exception ex5) {
                    j.g(ex5, -221006628, null);
                }
            }
        }
        finally {
            if (g != null) {
                try {
                    j.g(g, 1907931320, null);
                }
                catch (Exception ex6) {
                    j.g(ex6, -221006628, null);
                }
            }
            throw;
        }
        if (n != 0) {
            j.g(h, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95bd\u3b05\ua636\u4dfd\u4189\ua260\u0778\u6549\ua221\u1786\uba6f\u5549\ue4a8\u2158\u886c\ud4b0\ue5c3\u423e\u14a0\u821f\uee63\ub4dc\ub6eb\u235a\u17bb\u2827\u8f32\u9877\u2e79\u7347\u51f0\ub79e\u1292\uc9c6\u81c4\u4ccb\ua11f\u3f57\ue570\u4c7b\u248c\uf6bd\u5c4a\u64a9\ubb9c\uac73\u04ea\u6633\ue8f1\u888a\ue327\udd49\u417c") });
        }
        else {
            j.g(h, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u95e7\u3b40\ua635\u4dea\u418e\ua271\u072a\u6507\ua236\u1793\uba23\u553d\ue488\u2169\u8800\ud49a\ue5ee\u4209\u1493\u8238\uee55\ub4bd\ub6e7\u2314\u179a\u280a\u8f1c\u981b\u2e5d\u736b\u519e\ub7bc\u12b0\uc9ef\u8186\u4c9e\ua13c\u3f69\ue555\u4c50\u24ae\uf699\u5c2a\u64d6\ubba2\uac49\u04d5\u6616\ue885\u88a2\ue31b\udd27\u4124\u47a2\u26f2\u66bd\ub27e\ue13b\ufd3d\u6d01\u2fa8\uea4e\u53af\u3fff\u835e\u838c\u9198\uae50\u9bd8\u9443\uf4e9\u6ea5\u83a5\u3234\ua12c\u2253\u775f\u35e6\udd3c\ub1bb\u9233\ubc20\u1a0f\u1079\u9b16\u6d29\u8d2f\uf3cb\uec4a\ue43e\u38e6\ue04d\u68c4\uf48f\u87f2\u84b9\ua71d\u45b0\u8597\ue923\u9fde\u4426\u12e2\ub5cb\ud382\ua480\u460d\u25ba\ua55a\u098a\ue289~\uac7b\u8466\udcc5\u3a74\u88c1\uba81\u0789\u4b27\u2ac1\ufb43\u1c5c\u6af7\uba86\u4161\u894e\u5b71\u1a59\u5ba2\u6a6f\u5270\u9479\u0fee\uc0e0\u0d95\u4286\ubcb8\ub4e7\u386d\u84ed\u5c2d\ud194\u9d35\u971c\u5139\uf9d1\uf089\uff24\u3850\u6f32") });
        }
        return (ResultSet)j.g(j.g(j.Y(this, 2034283754), 1472248013, null), 1979626738, new Object[] { j.g(h, 705148898, null), true });
    }
    
    public ResultSet getCrossReference(final String s, final String s2, final String s3, final String s4, final String s5, final String s6) throws SQLException {
        if (s3 == null) {
            return (ResultSet)j.g(this, -756894477, new Object[] { s4, s5, s6 });
        }
        if (s6 == null) {
            return (ResultSet)j.g(this, 1108587764, new Object[] { s, s2, s3 });
        }
        final Object h = j.H(-1931495456, null);
        j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua359\u1351\uc4e0\u577f\u2031\ub0c1\u9413") }), 566474721, new Object[] { j.x(2003350769, new Object[] { s }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua30a\u1355\uc4ff\u573a\u2002\ub0fe\u9467\u243b\udc8d\u3ac2\u0956\u4cb9\uef5f\u73dc\u3b86\u56a5\u7723") }), 566474721, new Object[] { j.x(2003350769, new Object[] { s2 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua30a\u1355\uc4ff\u573a\u2002\ub0fe\u9467\u243b\udc8d\u3ac2\u0956\u4cb9\uef4f\u73de\u3b9a\u56cc\u774e\u6370\ud137") }), 566474721, new Object[] { j.x(2003350769, new Object[] { s3 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua30a\u1355\uc4ff\u573a\u2002\ub0fe\u9467\u243b\udc8d\u3ac2\u0956\u4cb9\uef52\u73dc\u3b9f\u56cc\u772f\u637c") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua30d\u1313\uc4ac\u577b\u2021\ub095\u9463\u2431\udc8c\u3ac1\u095f\u4cb3\uef51\u73d3\u3b8d\u56c7\u7742\u6311\ud152\ufd1b\u9311") }), 566474721, new Object[] { j.x(2003350769, new Object[] { s4 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua30a\u1355\uc4ff\u573a\u2014\ub0fe\u9467\u243b\udc8d\u3ac2\u0956\u4cb9\uef5f\u73dc\u3b86\u56a5\u7723") }), 566474721, new Object[] { j.x(2003350769, new Object[] { s5 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua30a\u1355\uc4ff\u573a\u2014\ub0fe\u9467\u243b\udc8d\u3ac2\u0956\u4cb9\uef4f\u73de\u3b9a\u56cc\u774e\u6370\ud137") }), 566474721, new Object[] { j.x(2003350769, new Object[] { s6 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua30a\u1355\uc4ff\u573a\u2014\ub0fe\u9467\u243b\udc8d\u3ac2\u0956\u4cb9\uef52\u73dc\u3b9f\u56cc\u772f\u637c") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua30d\u1313\uc4ac\u577b\u2021\ub095\u9475\u2431\udc8c\u3ac1\u095f\u4cb3\uef51\u73d3\u3b8d\u56c7\u7742\u6311\ud152\ufd1b\u9311\u4190\u4152\u38be\ub6d6\u87c0\udf8f\ub7b6\ub24a\u7968\ua497\uf24b\ub0c3\ufa9f\u2900\u8d10\ueddd\u496b\ub297\udb0f\ud0b4\u073f\u7db3\ue6fd\u2c55\u02d2\u9dc5\u5471\u4e49\ud5dd\u866f\u89ee\ud9bd\uaafc\u0575\u56fd\u1f28\uea39\u4765\ufdcd\u9439\u0180\u6dbc\u7f4e\uff0a\u23de\uc5e0\u9c35\uc20a\u1ab5\udf5e\uad8c\uee52\ub766\u13af\u1982\u7688\u6605\u35d8\u9043\ud934\ua05b\uc6eb\ue3dc\u73cf\ue685\ua0d1\u3be5\ue6ce\uaad7\u4771\ucc8b\u3e8f\u9e05\u7ee5\u9311\u4d77\ue8ab\u9cdd\u7806\u9bc2\u64a5") }), 566474721, new Object[] { j.x(-61229835, new Object[] { 5 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua30a\u1355\uc4ff\u573a\u2016\ub0f0\u9475\u243f\udc9d\u3adc\u0952\u4ca4\uef55\u73d1\u3b9b\u56dd\u775a\u637c\ud17b\ufd5e\u935c\u41d4\u4117\u38be\ub687\u8793") });
        return (ResultSet)j.g(j.g(j.Y(this, 2034283754), 1472248013, null), 1979626738, new Object[] { j.g(h, 705148898, null), true });
    }
    
    public ResultSet getSchemas() throws SQLException {
        if (j.Y(this, -1580616458) == null) {
            j.i(this, -1580616458, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u81d0\u9d56\u99ef\u4b32\u260c\ua688\uc7a3\u4076\uefa2\uaaad\u6e0f\u9d77\u55d5\u69d4\u5cf9\u3b5e\u0aba\u1cd9\ub948\ua778\u8faf\u9af4\u20e8\uf81f\u5605\u52df\ud243\uf355\u582e\ub38d\u0cd0\u73e7\u47b9\uf836\ua66e\u5deb\u4f6d\u8151\uc31a\uf6dd\uc59a\ub045\u291d\ub2b1\u5436\ued65\u19ae\u3376\uda28\ubf3d\uf3ef\ue7af\uc4b6\u42c3\u2921\udf21\u8690\u7d61") }));
        }
        return (ResultSet)j.g(j.Y(this, -1580616458), 1040430277, null);
    }
    
    public ResultSet getCatalogs() throws SQLException {
        if (j.Y(this, 1115469063) == null) {
            j.i(this, 1115469063, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u62aa\u2349\u4a41\ua397\u2db8\ubc5f\u542e\ub655\u868e\u4679\ueba8\u0c03\uef31\uc3d2\ud7de\u9b7e\u591b\uc261\u64d9\u817d\u2a02\u72c4\ue702\ud44c\u8b13\u304d\ub1a8\ubf6a\udcfa\uc575\ue0f7\u289f\u2595") }));
        }
        return (ResultSet)j.g(j.Y(this, 1115469063), 1040430277, null);
    }
    
    public ResultSet getPrimaryKeys(final String s, final String s2, final String s3) throws SQLException {
        final Object h = j.H(-372591352, new Object[] { this, s3 });
        final Object[] array = (Object[])j.g(h, -982731511, null);
        final Object g = j.g(j.Y(this, 2034283754), 1472248013, null);
        final Object h2 = j.H(394245337, new Object[] { 512 });
        j.g(j.g(j.g(h2, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6ea0\u0a3a\u0759\u699f\uab56\ud254\u2ebf\u2139\ue71c\ub0c1\u61a2\uc556\u47d2\uef79\u1888\u30cd\u7922\ubb2c\uaabf\u3320\ubca0\u9011\u9603\u871f\u5e83\ud5ff\u4255\u6619\u1db7\uda31\ub5fd\u71ee\u4f38\u864e\u8155\ufd97\u74b8\u7334\uf231\u66aa\ubae1\ue178\u1ee5\ucc62\u8120\u95be\u9184\ue86a") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { s3 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6ef4\u0a7f\u0754\u6989\uab15\ud274\u2ede\u2115\ue725\ub0e8\u6191\uc538\u47f2\uef47\u18ed\u30b5\u7943\ubb0d\uaa9d\u3345\ubc9e\u9021\u9662\u8708\u5ee0\ud593\u426e\u6621\u1d95\uda02\ub593\u71ce\u4f06\u862b\u812d\ufdf6\u7491\u730b\uf254\u6694\ubac1\ue11b\u1ee6\ucc62\u8134\u95cd\u91f7\ue808\u568d\uf6de\u976eq\u1e0a\u21c6\ube3b\u6f76\ubb08\u8f4b\u5bb8\ub1b2\ud35f\u94ef\ue3c0\u705f\uea25\ufeea\u6fd3\ub970\ub602\u7920\u857f") });
        if (array == null) {
            j.g(h2, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6ea0\u0a3a\u0759\u699f\uab56\ud254\u2ebf\u2139\ue71c\ub0c1\u61a2\uc556\u47d2\uef79\u1888\u30fa\u790d\ubb42\uaad3\u330b\ubc8a\u903e\u962e\u876b\u5ece\ud5ac\u421b\u661c\u1db0\uda71\ub5fd\u71bf\u4f6b\u860f\u8172\ufdf6\u7491\u730b\uf25d\u66d5\ubade\ue152\u1ec0\ucc4e\u8119\u95b2\u9194\ue876") });
            return (ResultSet)j.g(g, 1979626738, new Object[] { j.g(h2, 705148898, null), true });
        }
        Object o = j.g(h, -1662995190, null);
        if (o != null) {
            o = j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6ef4") }), 566474721, new Object[] { o }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6ef4") }), 705148898, null);
        }
        for (int i = 0; i < array.length; ++i) {
            if (i > 0) {
                j.g(h2, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6ef3\u0a2a\u075b\u6993\uab5a\ud24e\u2ebf") });
            }
            j.g(j.g(j.g(j.g(j.g(j.g(j.g(h2, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6ea0\u0a3a\u0759\u699f\uab56\ud254\u2ebf") }), 566474721, new Object[] { o }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6ef3\u0a3e\u0746\u69da\uab45\ud24b\u2eb3\u2177\ue74e") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { j.g(this, -1066552053, new Object[] { array[i] }) }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6ef4\u0a7f\u0754\u6989\uab15\ud243\u2ef1\u217b\ue749") }), -1750288369, new Object[] { i + 1 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6ef3\u0a3e\u0746\u69da\uab5e\ud253") });
        }
        return (ResultSet)j.g(g, 1979626738, new Object[] { j.g(j.g(h2, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6efa\u0a7f\u075a\u6988\uab51\ud245\u2eed\u2177\ue70b\ub0d4\u61ee\uc515\u47dd\uef31") }), 705148898, null), true });
    }
    
    public ResultSet getExportedKeys(String s, String s2, final String s3) throws SQLException {
        final Object h = j.H(-372591352, new Object[] { this, s3 });
        final Object[] array = (Object[])j.g(h, -982731511, null);
        final Object g = j.g(j.Y(this, 2034283754), 1472248013, null);
        s = (String)((s != null) ? j.x(2003350769, new Object[] { s }) : null);
        s2 = (String)((s2 != null) ? j.x(2003350769, new Object[] { s2 }) : null);
        final Object h2 = j.H(394245337, new Object[] { 512 });
        Object o = null;
        int n = 0;
        if (array != null) {
            final Object g2 = j.g(g, 649902239, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b54\ua3a2\u59c1\u0809\udb95\uad56\uae8e\u8912\uc4c3\uba00\u4a96\ud720\u1c2d\u404c\u03fa\uce94\uc43d\u00c7\uc88f\u6852\ub504\ubac9\u6b44\uef67\u65ee\u11c4\u61f5\u866b\u6a20\u3751\u33c7\uff90\u90cb\u0a4c\u2b85\ue730\u44ee\u5970\u2c7d\uce8b\u3bba\ue2f6\ub01a\ud5da\u1e88\u6b73\ud64a\uac23\ue879\uede7\u02db") });
            final Object h3 = j.H(457226395, null);
            while (j.g(g2, 1531033760, null)) {
                final Object g3 = j.g(g2, 791918754, new Object[] { 1 });
                (boolean)j.g(h3, -1325943540, new Object[] { g3 });
                if (j.g(g3, 1370667022, new Object[] { s3 })) {
                    o = g3;
                }
            }
            j.g(g2, 1907931320, null);
            final Object g4 = j.g(h3, 53916941, null);
            while (j.g(g4, -423250674, null)) {
                final Object g5 = j.g(g4, 961000671, null);
                try {
                    final Object g6 = j.g(j.g(j.H(2077603040, new Object[] { this, g5 }), 1840559329, null), -1322273566, null);
                    while (j.g(g6, -423250674, null)) {
                        final Object g7 = j.g(g6, 961000671, null);
                        final Object g8 = j.g(g7, 283751651, null);
                        if (g8 != null) {
                            if (!(boolean)j.g(g8, 1370667022, new Object[] { o })) {
                                continue;
                            }
                            for (int i = 0; i < (int)j.g(g7, 1143518436, null); ++i) {
                                final int j = i + 1;
                                final Object[] array2 = (Object[])org.sqlite.jdbc3.j.g(g7, -1559317275, new Object[] { i });
                                final Object o2 = array2[1];
                                final String s4 = (String)((o2 == null) ? "" : o2);
                                final Object o3 = array2[0];
                                final String s5 = (String)((o3 == null) ? "" : o3);
                                boolean b = false;
                                for (int k = 0; k < array.length; ++k) {
                                    if (array[k] != null && (boolean)org.sqlite.jdbc3.j.g(array[k], 1370667022, new Object[] { s4 })) {
                                        b = true;
                                        break;
                                    }
                                }
                                org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(h2, 566474721, new Object[] { (n > 0) ? JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3b2\u59c3\u0805\udb99\uad4c\uae8e\u891d\uc4ce\uba01\u4ad3\ud773\u1c2e\u4052\u03f0\uce9a\uc469\u0094") : JDBC3ResultSet$JDBC3Savepoint.i("\u5b54\ua3a2\u59c1\u0809\udb95\uad56\uae8e") }), 566474721, new Object[] { org.sqlite.jdbc3.j.x(-61229835, new Object[] { j }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udb9d\uad51\uae82\u895c\uc485") }), 566474721, new Object[] { org.sqlite.jdbc3.j.g(this, 1992602843, new Object[] { g5 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b00\ua3e7\u59cc\u081f\udbd6\uad44\uaec5\u8908\uc48e\uba4d\u4ad4") }), 566474721, new Object[] { org.sqlite.jdbc3.j.g(this, 1992602843, new Object[] { s5 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b00\ua3e7\u59cc\u081f\udbd6\uad44\uaecd\u8912\uc48e\uba4d\u4ad4") }), 566474721, new Object[] { org.sqlite.jdbc3.j.g(this, 1992602843, new Object[] { s4 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b00\ua3e7\u59cc\u081f\udbd6\uad52\uaecd\u8912\uc48e\uba4d\u4ad4") }), 566474721, new Object[] { org.sqlite.jdbc3.j.g(this, 1992602843, new Object[] { (b && org.sqlite.jdbc3.j.g(h, -1662995190, null) != null) ? org.sqlite.jdbc3.j.g(h, -1662995190, null) : "" }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b00\ua3e7\u59cc\u081f\udbd6\uad52\uaec5\u8912\uc48e\uba4d") }), -944326457, new Object[] { org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.B(-1792428826), -216353544, new Object[] { org.sqlite.jdbc3.j.g(g7, -1424378633, null) }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udb83\uad50\uae82\u895c") }), -944326457, new Object[] { org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.B(-1792428826), -216353544, new Object[] { org.sqlite.jdbc3.j.g(g7, 972928249, null) }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udb92\uad50\uae82\u895c") });
                                final Object g9 = org.sqlite.jdbc3.j.g(g7, 1574155514, null);
                                if (g9 != null) {
                                    org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(org.sqlite.jdbc3.j.g(h2, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b00") }), 566474721, new Object[] { org.sqlite.jdbc3.j.g(this, 1992602843, new Object[] { g9 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b00\ua3e7\u59cc\u081f\udbd6\uad44\uaec5\u8912") });
                                }
                                else {
                                    org.sqlite.jdbc3.j.g(h2, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b00\ua3e0\u598d\u080d\udb85\uad02\uaec8\u8917\uc4cc") });
                                }
                                ++n;
                            }
                        }
                    }
                    try {
                        if (g2 == null) {
                            continue;
                        }
                        j.g(g2, 1907931320, null);
                    }
                    catch (SQLException ex) {}
                }
                finally {
                    try {
                        if (g2 != null) {
                            j.g(g2, 1907931320, null);
                        }
                    }
                    catch (SQLException ex2) {}
                    throw;
                }
            }
        }
        final boolean b2 = n > 0;
        final Object h4 = j.H(394245337, new Object[] { 512 });
        j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(h4, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b54\ua3a2\u59c1\u0809\udb95\uad56\uae8e") }), 566474721, new Object[] { s }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udba6\uad69\uaefa\u893d\uc4e0\uba21\u4ab6\ud75f\u1c08\u407f\u03c1\uced5\uc43d") }), 566474721, new Object[] { s2 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udba6\uad69\uaefa\u893d\uc4e0\uba21\u4ab6\ud75f\u1c18\u407d\u03dd\ucebc\uc450\u0098\uc8de") }), 566474721, new Object[] { j.x(2003350769, new Object[] { o }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udba6\uad69\uaefa\u893d\uc4e0\uba21\u4ab6\ud75f\u1c05\u407f\u03d8\ucebc\uc431\u0094") }), 566474721, new Object[] { b2 ? JDBC3ResultSet$JDBC3Savepoint.i("\u5b57\ua3a4\u59c3") : JDBC3ResultSet$JDBC3Savepoint.i("\u5b00\ua3e0") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udba6\uad69\uaeed\u8933\uc4ee\uba38\u4abe\ud74e\u1c14\u4070\u03d4\uceb4\uc458\u0098\uc8de") }), 566474721, new Object[] { s }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udbb0\uad69\uaefa\u893d\uc4e0\uba21\u4ab6\ud75f\u1c08\u407f\u03c1\uced5\uc43d") }), 566474721, new Object[] { s2 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udbb0\uad69\uaefa\u893d\uc4e0\uba21\u4ab6\ud75f\u1c18\u407d\u03dd\ucebc\uc450\u0098\uc8de") }), 566474721, new Object[] { b2 ? JDBC3ResultSet$JDBC3Savepoint.i("\u5b41\ua3ac\u59d9") : JDBC3ResultSet$JDBC3Savepoint.i("\u5b00\ua3e0") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udbb0\uad69\uaefa\u893d\uc4e0\uba21\u4ab6\ud75f\u1c05\u407f\u03d8\ucebc\uc431\u0094") }), 566474721, new Object[] { b2 ? JDBC3ResultSet$JDBC3Savepoint.i("\u5b41\ua3a4\u59c3") : JDBC3ResultSet$JDBC3Savepoint.i("\u5b00\ua3e0") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udbb0\uad69\uaeed\u8933\uc4ee\uba38\u4abe\ud74e\u1c14\u4070\u03d4\uceb4\uc458\u0098\uc8de") }), 566474721, new Object[] { b2 ? JDBC3ResultSet$JDBC3Savepoint.i("\u5b4c\ua3b4") : JDBC3ResultSet$JDBC3Savepoint.i("\u5b0a\ua3f6") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udbbd\uad67\uaef7\u8923\uc4f1\uba28\u4aa2\ud72c\u1c6b") }), 566474721, new Object[] { b2 ? JDBC3ResultSet$JDBC3Savepoint.i("\u5b52\ua3b5") : JDBC3ResultSet$JDBC3Savepoint.i("\u5b14") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udba3\uad72\uaeea\u893d\uc4f6\uba28\u4aac\ud752\u1c1e\u4072\u03d0\uced5\uc43d") }), 566474721, new Object[] { b2 ? JDBC3ResultSet$JDBC3Savepoint.i("\u5b43\ua3b5") : JDBC3ResultSet$JDBC3Savepoint.i("\u5b14") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udbb2\uad67\uaee2\u8939\uc4f6\uba28\u4aac\ud752\u1c1e\u4072\u03d0\uced5\uc43d") }), 566474721, new Object[] { b2 ? JDBC3ResultSet$JDBC3Savepoint.i("\u5b41\ua3ac\u59c3") : JDBC3ResultSet$JDBC3Savepoint.i("\u5b00\ua3e0") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udbb0\uad69\uaef1\u8932\uc4e3\uba20\u4ab6\ud72c\u1c6b") }), 566474721, new Object[] { b2 ? JDBC3ResultSet$JDBC3Savepoint.i("\u5b57\ua3ac\u59c3") : JDBC3ResultSet$JDBC3Savepoint.i("\u5b00\ua3e0") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udba6\uad69\uaef1\u8932\uc4e3\uba20\u4ab6\ud72c\u1c6b") }), 566474721, new Object[] { j.x(-61229835, new Object[] { 5 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b07\ua3a6\u59de\u084c\udbb2\uad67\uaee8\u8939\uc4f0\uba3f\u4ab2\ud742\u1c02\u4072\u03dc\ucead\uc444\u0094") });
        if (b2) {
            j.g(j.g(j.g(h4, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b41\ua3b5\u59c2\u0801\udbd6\uad0a") }), -1761430277, new Object[] { h2 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b0e\ua3e7\u59e2\u083e\udbb2\uad67\uaefc\u895c\uc4e0\uba34\u4ad3\ud746\u1c00\u406a\u03d4\ucebb\uc451\u00f1\uc8a1\u687d\ub52c\ubae9\u6b0d\uef18\u65c5\u11ee\u61d2\u865e\u6a07\u376f\u33a2\uffb8\u90f0\u0a6a\u2bbf\ue710\u4483\u5928\u2c24\ucebd\u3b94\ue282\ub066\ud5b8\u1ee3\u6b42\ud674\uac0f\ue854\uedcf\u02b9\u4e30\u03df\u6dfd\u15e0\u081f\u3b10\u42b4\ueefc\ub7a6") });
        }
        else {
            j.g(h4, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5b4b\ua3ae\u59c0\u0805\udb82\uad02\uae9e") });
        }
        return (ResultSet)j.g(g, 1979626738, new Object[] { j.g(h4, 705148898, null), true });
    }
    
    private StringBuilder appendDummyForeignKeyList(final StringBuilder sb) {
        j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(sb, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua70a\ufd9a\u25cd\u953d\u1b05\u9da8\u9399\uf098\ufaad\u21fa\uf16c\uf284\uaa6d\uf617\u4cb2\uad1c\u6290\ud390\u5ad5\u1a21\u0c53\u1bc3\u7de9\ubaa2\u2a00\u66eb\ufbad\u0481\ue49f\ua32b\u6fbe\u02c9\ud167\uec0e\uc782\uf84b\ub6ff\u161a\u7fa0\u1c08\u7153\uba9c\uf3ba\u3d5c\u4275\uf9d1\u1bac\ue78e\u98da\u5555") }), -1750288369, new Object[] { 3 }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua759\ufd9e\u25d2\u9578\u1b13\u9dae\u9395\uf095") }), -1750288369, new Object[] { 3 }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua759\ufd9e\u25d2\u9578\u1b02\u9dae\u9395\uf095") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua759\ufdd8\u2586\u9578\u1b07\u9daf\u9399\uf0d3\ufaf7\u21b4\uf121\uf2d7") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua759\ufdd8\u2586\u9578\u1b07\u9daf\u9399\uf0c5\ufaf7\u21b4\uf12d") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua750\ufddf\u25cd\u9531\u1b0b\u9db5\u93cd\uf095\ufaac\u21e1") });
        return sb;
    }
    
    public ResultSet getImportedKeys(final String s, final String s2, final String s3) throws SQLException {
        final Object g = j.g(j.Y(this, 2034283754), 1472248013, null);
        Object o = j.H(394245337, new Object[] { 700 });
        j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(o, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc10\u941d\u642c\u59e6\u54d0\u5683\u9348") }), 566474721, new Object[] { j.x(2003350769, new Object[] { s }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u9419\u6433\u59a3\u54e3\u56bc\u933c\u0134\u76c2\ua1cd\u6e74\u0606\u90d1\u9529\ucdae\uc97e\u3071") }), 566474721, new Object[] { j.x(2003350769, new Object[] { s2 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u9419\u6433\u59a3\u54e3\u56bc\u933c\u0134\u76c2\ua1cd\u6e74\u0606\u90c1\u952b\ucdb2\uc917\u301c\u3a68\uf6b1") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc13\u940c\u642e\u59a3\u54d2\u5684\u9348\u0125\u76cb\ua1d5\u6e70\u061b\u90de\u952d\ucda5\uc91c\u3010\u3a09\uf6d4\ud2c2\u1e12\u2092\u3f64\u3761\u6abc\ua113\u84e1\ud49e\u4d7e\udec1\u08ca\u6a94\u0560\u8b79\u6a1b\u95bc\u29fe\ufa47\ua5cb\u415f\u2863\u0bdc\u4aa1") }), 566474721, new Object[] { j.x(2003350769, new Object[] { s }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u9419\u6433\u59a3\u54f5\u56bc\u933c\u0134\u76c2\ua1cd\u6e74\u0606\u90d1\u9529\ucdae\uc97e\u3071") }), 566474721, new Object[] { j.x(2003350769, new Object[] { s2 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u9419\u6433\u59a3\u54f5\u56bc\u933c\u0134\u76c2\ua1cd\u6e74\u0606\u90c1\u952b\ucdb2\uc917\u301c\u3a68\uf6b1") }), 566474721, new Object[] { j.x(2003350769, new Object[] { s3 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u9419\u6433\u59a3\u54f5\u56bc\u933c\u0134\u76c2\ua1cd\u6e74\u0606\u90dc\u9529\ucdb7\uc917\u307d\u3a64") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc05\u941b\u642e\u59a3\u54d2\u5684\u9348\u0133\u76cb\ua1c2\u6e7e\u0615\u90c7\u9525\ucdb4\uc90d\u301f\u3a05\uf6dc\ud2ab\u1e1e\u20c2\u3f6c\u377c\u6abc\ua113\u84e1\ud49e\u4d65\udecf\u08d0\u6a84\u057f\u8b69\u6a07\u95de\u2981\ufa7c\ua5f8\u4132\u2847\u0b83\u4aa1\ue7fe\u6ad9\ud969\ua64a\uf046\u6e9d\ud7d1\ud0c1\u2db2\ued1c\u9beb\ua7ae\u7df0\uc9ab\u933e\ufe13\uc8de\uf045\ubfca\u8ea8\ub28d\u7934\ue0af\ue9e3\ucfa6\u97b5\u4091\u437b\u0624\u9768\uc740\u08f3\uebef\u57fd\u264e\u9f3d\uf570\ua507\u6bd3\ufdf1\u12de\ubb2b\u687a\uad6f\u0dc5\u0a97\u919b\u9870\u4c12\u93e7\u152a\u272b\u746d\u50f4\u56c2\u958f\ud395\uc042\ua3ef\ue311\u386f\ud616\u8015\u253c") }), 566474721, new Object[] { j.x(-61229835, new Object[] { 5 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u9419\u6433\u59a3\u54f7\u56b2\u932e\u0130\u76d2\ua1d3\u6e70\u061b\u90db\u9524\ucdb3\uc906\u3008\u3a64\uf6f7\ud29c\u1e5d\u208f\u3f27\u3727") });
        Object g2;
        try {
            g2 = j.g(g, 649902239, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc13\u940a\u6421\u59e4\u54de\u5696\u9348\u0113\u76ef\ua1f3\u6e54\u0630\u90f5\u9506\ucda5\uc939\u3034\u3a3d\uf6ce\ud282\u1e5b\u2091\u3f73\u3727\u6abb") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { s3 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc44\u9451\u647b") }), 705148898, null) });
        }
        catch (SQLException ex) {
            return (ResultSet)j.g(g, 1979626738, new Object[] { j.g(j.g(this, 742896892, new Object[] { o }), 705148898, null), true });
        }
        final Object g3 = j.g(j.H(2077603040, new Object[] { this, s3 }), 1840559329, null);
        int n = 0;
        while (j.g(g2, 1531033760, null)) {
            final int i = (int)j.g(g2, -977619757, new Object[] { 2 }) + 1;
            final int intValue = (int)j.g(g2, -977619757, new Object[] { 1 });
            final Object g4 = j.g(g2, 791918754, new Object[] { 3 });
            final Object g5 = j.g(g2, 791918754, new Object[] { 4 });
            Object g6 = j.g(g2, 791918754, new Object[] { 5 });
            final Object h = j.H(-372591352, new Object[] { this, g4 });
            final Object g7 = j.g(h, -1662995190, null);
            if (g6 == null) {
                g6 = ((Object[])j.g(h, -982731511, null))[0];
            }
            final Object g8 = j.g(g2, 791918754, new Object[] { 6 });
            final Object g9 = j.g(g2, 791918754, new Object[] { 7 });
            if (n > 0) {
                j.g(o, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u940d\u642e\u59ea\u54dc\u5699\u9348\u0114\u76ec\ua1ed\u6e11") });
            }
            Object g10 = null;
            if ((int)j.g(g3, 1338620086, null) > intValue) {
                g10 = j.g(j.g(g3, -432097099, new Object[] { intValue }), 1574155514, null);
            }
            j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(o, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc10\u941d\u642c\u59e6\u54d0\u5683\u9348") }), -1750288369, new Object[] { i }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u9419\u6433\u59a3\u54d8\u5684\u9344") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc44") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { g4 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc44\u9458\u6421\u59f0\u5493\u5687\u931c\u011b\u76ac\ua1a1\u6e16") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { g5 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc44\u9458\u6421\u59f0\u5493\u5691\u930b\u011b\u76ac\ua1a1\u6e16") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { g6 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc44\u9458\u6421\u59f0\u5493\u5687\u930b\u011b\u76ac") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc00\u9419\u6433\u59e6\u5493\u56d0") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { g8 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc44") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u940f\u6428\u59e6\u54dd\u56d7\u934f\u013b\u76cf\ua1a1\u6e70\u061a\u90c6\u9521\ucdb5\uc91c\u3076\u3a64\uf6e5\ud286\u1e57\u208c\u3f27") }), -1750288369, new Object[] { 3 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u940f\u6428\u59e6\u54dd\u56d7\u934f\u0136\u76c1\ua1d2\u6e72\u0618\u90d6\u952d\ucddd\uc972\u3025\u3a2c\uf6f4\ud280\u1e12") }), -1750288369, new Object[] { 0 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u940f\u6428\u59e6\u54dd\u56d7\u934f\u0127\u76c5\ua1d2\u6e65\u060b\u90db\u952b\ucdae\uc975\u3071\u3a30\uf6f9\ud28b\u1e5c\u20c2") }), -1750288369, new Object[] { 1 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u940f\u6428\u59e6\u54dd\u56d7\u934f\u0126\u76c5\ua1d5\u6e11\u0617\u90c7\u9524\ucdb6\uc975\u3071\u3a30\uf6f9\ud28b\u1e5c\u20c2") }), -1750288369, new Object[] { 2 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u940f\u6428\u59e6\u54dd\u56d7\u934f\u0126\u76c5\ua1d5\u6e11\u061d\u90d7\u952e\ucdbb\uc907\u301d\u3a10\uf6b6\ud2ce\u1e46\u208a\u3f62\u3761\u6abc") }), -1750288369, new Object[] { 4 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u941d\u642e\u59e7\u5493\u5696\u931b\u0155\u76f5\ua1f3\u6e1d\u0679") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc00\u9419\u6433\u59e6\u5493\u56d0") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { g9 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc44") }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u940f\u6428\u59e6\u54dd\u56d7\u934f\u013b\u76cf\ua1a1\u6e70\u061a\u90c6\u9521\ucdb5\uc91c\u3076\u3a64\uf6e5\ud286\u1e57\u208c\u3f27") }), -1750288369, new Object[] { 3 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u940f\u6428\u59e6\u54dd\u56d7\u934f\u0136\u76c1\ua1d2\u6e72\u0618\u90d6\u952d\ucddd\uc972\u3025\u3a2c\uf6f4\ud280\u1e12") }), -1750288369, new Object[] { 0 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u940f\u6428\u59e6\u54dd\u56d7\u934f\u0127\u76c5\ua1d2\u6e65\u060b\u90db\u952b\ucdae\uc975\u3071\u3a30\uf6f9\ud28b\u1e5c\u20c2") }), -1750288369, new Object[] { 1 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u940f\u6428\u59e6\u54dd\u56d7\u934f\u0126\u76c5\ua1d5\u6e11\u0617\u90c7\u9524\ucdb6\uc975\u3071\u3a30\uf6f9\ud28b\u1e5c\u20c2") }), -1750288369, new Object[] { 2 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u940f\u6428\u59e6\u54dd\u56d7\u934f\u0126\u76c5\ua1d5\u6e11\u061d\u90d7\u952e\ucdbb\uc907\u301d\u3a10\uf6b6\ud2ce\u1e46\u208a\u3f62\u3761\u6abc") }), -1750288369, new Object[] { 4 }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u941d\u642e\u59e7\u5493\u5696\u931b\u0155\u76e4\ua1f3\u6e1d\u0679") }), 566474721, new Object[] { (g10 == null) ? JDBC3ResultSet$JDBC3Savepoint.i("\ucc44\u945f") : j.x(2003350769, new Object[] { g10 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u9419\u6433\u59a3\u54d5\u569c\u9306\u0159\u76a0") }), 566474721, new Object[] { (g7 == null) ? JDBC3ResultSet$JDBC3Savepoint.i("\ucc44\u945f") : j.x(2003350769, new Object[] { g7 }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc43\u9419\u6433\u59a3\u54c3\u569c\u9306") });
            ++n;
        }
        j.g(g2, 1907931320, null);
        if (n == 0) {
            o = j.g(this, 742896892, new Object[] { o });
        }
        j.g(o, 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ucc4a\u9458\u640f\u59d1\u54f7\u56b2\u933a\u0155\u76c2\ua1d8\u6e11\u0609\u90d9\u953c\ucdbb\uc910\u301d\u3a01\uf6ce\ud2ad\u1e73\u20b6\u3f2b\u372f\u6acc\ua139\u84c6\ud4ff\u4d6c\udec6\u08cc\u6a84\u057f\u8b6f\u6a1e\u95b7\u29ec\ufa25\ua5aa\u4142\u286d\u0ba4\u4ac0\ue7e9\u6ac5\ud968\ua654\uf05c\u6e99\ud7c3\ud0d6\u2dcb\ued70\u9be5\ua7c7\u7d89\uc990\u931f\ufe76\uc8ee\uf00d") });
        return (ResultSet)j.g(g, 1979626738, new Object[] { j.g(o, 705148898, null), true });
    }
    
    public ResultSet getIndexInfo(final String s, final String s2, final String s3, final boolean b, final boolean b2) throws SQLException {
        final Object g = j.g(j.Y(this, 2034283754), 1472248013, null);
        final Object h = j.H(394245337, new Object[] { 500 });
        j.g(j.g(j.g(j.g(j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0d80\u0b0f\ub824\ub2b9\u5439\u0fe3\u3617\u05ce\u91f7\u79fe\u5f58\u96cd\uf0e6\u3c9c\uf5f4\u5bfe\u4689\uf92e\u2c35\ua9a9\u38a1\u33d0\uab36\u2e9b\uc961\ude66\ub8e8\u6ec7\u156a\u4dd1\ue684\ud19d\ude18\u20f3\u8997\u4303\u503f\ubdfd\u2384\u59f3\u8762\u3b82\u8eea\ubb5e\ud241\u5db1\u256b\ud18e") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { s3 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0dd4\u0b4a\ub829\ub2af\u547a\u0fc3\u3676\u05e2\u91ce\u79d7\u5f6b\u96a3\uf0c6\u3ca2\uf591\u5b86\u46e8\uf919\u2c17\ua9cc\u389f\u33e0\uab57\u2e81\uc902\ude08\ub8d9\u6ee7\u1548\u4df4\ue6f5\ud1a9\ude2e\u20ff\u89e3\u432c\u5008\ubddd\u23ad\u598c\u8750\u3bb2\u8e82\ubb52\ud242\u5dd9\u250e\ud1f1\u32cc\uc7d8\u52bb\uab52\u9b48\u2637\u4a31\ue121\udafd\u9397\u4a31\ua93f\u5c44\ucfd7\u5157\u3a20\ucc59\uf3ea\u1d77\u3e30\u06bb\uc2cc\u6143\uf17b\u3290\ucb47\u377c\u2e05\u5605") }), 566474721, new Object[] { j.x(-61229835, new Object[] { 3 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0dd3\u0b0b\ub83b\ub2fc\u540e\u0fce\u3667\u05e5\u91ae\u79b2\u5f5b\u969d\uf0a7\u3c8e\uf5a7\u5b8a\u4687\uf93e\u2c3d\ua9a5\u38b0\u33d2\uab3b\u2e90\uc91d\ude09\ub8d5\u6efb\u1552\u4df4\ue6eb\ud1b2\ude47\u20f3") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0d90\u0b04\ub868\ub2bd\u5429\u0fb7\u3674\u05ef\u91ce\u79c7\u5f79\u96a3\uf0d8\u3ca1\uf595\u5be7\u468d\uf940\u2c59\ua982\u388b\u33ff\uab1b\u2eef\uc92c\ude35\ub8a6\u6ef3\u1555\u4dfe\ue6fb\ud1b3\ude39\u208c\u8987\u4307\u502e\ubdf2\u23ed\u598c\u8701\u3be1\u8ec3\ubb68\ud22c\u5dde\u250a\ud1fb\u32d7\uc7c0\u52a0\uab52\u9b48\u2637\u4a23\ue131\uda94\u93e5\u4a2d\ua93f\u5c4b\ucf84\u5116\u3a03\ucc38\uf3e4\u1d7c\u3e27\u06d2\uc2b4\u6172\uf140\u32bd\ucb66\u3719\u2e48\u5656\ud0a4\u519a\u7085\u4825\u9f49\ue5f5\u59ee\ucc71\u1863\ubdea\ub64e\u97a3\u67b3\ua631\ue60c\u9529\uc4b1\u5df6\u656d\u2172\u6b29\uf79f\ud5c9\u3b5f") });
        final Object g2 = j.g(g, 649902239, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0d83\u0b18\ub829\ub2bb\u5437\u0ff6\u3617\u05c9\u91ec\u79f6\u5f51\u9695\uf0d8\u3c83\uf5bd\u5bd9\u46bc\uf944\u2c5e") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { s3 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0dd4\u0b43\ub873") }), 705148898, null) });
        final Object h2 = j.H(457226395, null);
        while (j.g(g2, 1531033760, null)) {
            (boolean)j.g(h2, -1325943540, new Object[] { j.H(457226395, null) });
            (boolean)j.g(j.g(h2, -984697602, new Object[] { (int)j.g(h2, 1872540925, null) - 1 }), -1325943540, new Object[] { j.g(g2, 791918754, new Object[] { 2 }) });
            (boolean)j.g(j.g(h2, -984697602, new Object[] { (int)j.g(h2, 1872540925, null) - 1 }), -1325943540, new Object[] { j.x(2111158425, new Object[] { (int)j.g(g2, -977619757, new Object[] { 3 }) }) });
        }
        j.g(g2, 1907931320, null);
        if ((int)j.g(h2, 1872540925, null) == 0) {
            j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0d80\u0b0f\ub824\ub2b9\u5439\u0fe3\u3617\u05ce\u91f7\u79fe\u5f58\u96cd\uf0e6\u3c9c\uf5f4\u5bdf\u46a6\uf940\u2c59\ua982\u388b\u33ff\uab1b\u2eef\uc92c\ude35\ub8a6\u6edc\u152a\u4d9d\ue6ca\ud189\ude07\u20bf\u89e3\u4323\u500e\ubd91\u23ae\u59dc\u871d\u3be1\u8ecc\ubb6e\ud260\u5df1\u256b\ud1c8\u32e0\uc7a9\u528d\uab7d\u9b2d\u265e\u4a1b\ue101\udad5\u93ac\u4a69\ua93f\u5c1a\ucfcc") });
            return (ResultSet)j.g(g, 1979626738, new Object[] { j.g(h, 705148898, null), true });
        }
        final Object g3 = j.g(h2, 53916941, null);
        final Object h3 = j.H(457226395, null);
        while (j.g(g3, -423250674, null)) {
            final Object g4 = j.g(g3, 961000671, null);
            final Object g5 = j.g(j.g(g4, -984697602, new Object[] { 0 }), -834816753, null);
            final Object g6 = j.g(g, 649902239, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0d83\u0b18\ub829\ub2bb\u5437\u0ff6\u3617\u05c9\u91ec\u79f6\u5f51\u9695\uf0d8\u3c86\uf5ba\u5bcc\u46a7\uf944\u2c5e") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { g5 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0dd4\u0b43\ub873") }), 705148898, null) });
            while (j.g(g6, 1531033760, null)) {
                final Object h4 = j.H(-1931495456, null);
                final Object g7 = j.g(g6, 791918754, new Object[] { 3 });
                j.g(j.g(j.g(j.g(j.g(j.g(j.g(h4, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0d80\u0b0f\ub824\ub2b9\u5439\u0fe3\u3617") }), 566474721, new Object[] { j.x(-61229835, new Object[] { 1 - (int)j.g(j.g(g4, -984697602, new Object[] { 1 }), -2127972340, null) }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0dd3\u0b0b\ub83b\ub2fc\u542f\u0ff9\u361b\u0587") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { g5 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0dd4\u0b4a\ub829\ub2af\u547a\u0ff9\u361b") }), 566474721, new Object[] { j.x(-61229835, new Object[] { (int)j.g(g6, -977619757, new Object[] { 1 }) + 1 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0dd3\u0b0b\ub83b\ub2fc\u5435\u0fe7\u361b") });
                if (g7 == null) {
                    j.g(h4, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0d9d\u0b1f\ub824\ub2b0") });
                }
                else {
                    j.g(j.g(j.g(h4, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0dd4") }), 566474721, new Object[] { j.g(this, 1992602843, new Object[] { g7 }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0dd4") });
                }
                j.g(h4, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0dd3\u0b0b\ub83b\ub2fc\u5439\u0ff9") });
                (boolean)j.g(h3, -1325943540, new Object[] { j.g(h4, 705148898, null) });
            }
            j.g(g6, 1907931320, null);
        }
        return (ResultSet)j.g(g, 1979626738, new Object[] { j.g(j.g(j.g(h, 566474721, new Object[] { j.x(105886992, new Object[] { h3, JDBC3Connection$JDBC3PreparedStatement.N("\u0dd3\u0b1f\ub826\ub2b5\u5435\u0ff9\u3617\u05c1\u91ee\u79fe\u5f14") }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0dda\u0b51") }), 705148898, null), true });
    }
    
    public ResultSet getProcedureColumns(final String s, final String s2, final String s3, final String s4) throws SQLException {
        if (j.Y(this, -1465338607) == null) {
            j.i(this, -1465338607, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\ua3b1\udf52\u008e\ud596\ud0a7\u3b79\ue5b4\uda6a\u167b\u302a\u7fcc\u28d7\u87c4\u0fd2\ucd90\ua974\ufe73\u78f8\ubd1a\ub1ac\u2261\u17c7\u90ed\ue907\u22af\uab49\u206b\u7407\u5141\u2ab3\u622b\u2aac\ua1ba\udae9\uba92\ue592\u7c28\u19bb\ufbfc\u4b16\u9f3c\ue27e\u5c0b\u6570\u086d\u9e20\u12c5\udb54\ucc75\u77d0\uc409\ub844\u89f4\u32c4\u8376\udd35\u2650\ud2ae\uc12f\u8f8f\uff17\u7b5c\u9fe4\u0f29\ud08a\ub37a\u3ab2\u1038\u9287\u871d\u3e30\uc225\u24bc\u71c2\u4f57\ud091\u60a0\ua7f8\u4387\u22df\u6fbf\ucf53\u238a\ucdd8\ucbae\uefbf\ub215\ue834\u6c65\u930c\u251f\u0df9\ud284\u31df\u610e\u0ec7\u404a\u73b6\u6196\u480b\ua745\ub980\u7f63\u5084\ua1d1\ud565\ua188\u9350\ud935\u7e08\u607c\u34ad\u54f4\u64eb\u3b2a\u2b1d\u85d1\u68d2\ufabc\u9f92\u2f5d\u639c\u94ad\u7cef\u4efb\uae41\uca7d\ue0e2\u6773\u2704\ud958\uf562\ud024\u1328\u4057\ub651\u9100\u3e13\u05c1\u1e8b\u6899\uc750\ua421\ua19c\u7495\u2c40\u9d41\u037e\u82b3\ube65\u3003\u6683\ue2bc\ue75a\u1245\u40b4\u6a34\ub5c4\u2d27\uc65f\u0e7c\u3b0f\u0fdc\u27e9\u4561\u341d\uffad\u7521\u57f1\u651d\u7ce1\ube23\u8342\u0672\u6f53\u84a3\u8f28\u12f8\u7078\uf4ff\ubf08\uba8d\ub037\u97d3\u3a27\u7284\u0f87\u2799\u8a2b\u055b\u591a\u2d44\uec4b\ub2a9\ud088\u9b7a\u2497\u6b54\ueade\u9b00\ue396\ud88f\ub74f\ufb7e\u1248\u8437\u831f\u68b7\u83e8\ufd7a\ue877\ub4ca\u60a0\uc193\udbc9\u918f\u732a\u74f5\ue3d2\ued7c\u34d1\u2242\u6d4a\u60c3\uc80b\uf1c9\ua85a\udbf3\ueeff\uac54\u86dd\uf24f\ucb89\u4c00\u1eda\u7366\u45d2\ud549\u21f2\uda80\u234f\ucc70\u328d\uea97\uba19\u5cd3\uf3ca\ue4ad\ua031\u82ea\u6327\u5814\u3ec6\ue5be\ueff5\ude9a\u0cd6\uf01e\ue70c\u43a1\udfdb\u29a6\u24bb\uac51\ua5eb\ub09b") }));
        }
        return (ResultSet)j.g(j.Y(this, -1465338607), 1040430277, null);
    }
    
    public ResultSet getProcedures(final String s, final String s2, final String s3) throws SQLException {
        if (j.Y(this, 1016444178) == null) {
            j.i(this, 1016444178, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u563c\u79b4\u03e6\ue127\u4537\ub9af\uf3ee\u92bc\uaf6f\u0af9\ua783\ubb27\u086e\u0d2e\ua8d4\uef25\u45ce\u3791\u7f5e\ua547\u6560\u2667\uec73\u63b9\u9ac3\u9a63\uee5e\u2791\ue743\u1f7b\ue85f\ud58e\u4a82\ud954\u3022\ud0e2\u8b3c\uece4\ud2f3\uf438\uec52\u159a\u34c7\ub4ed\ueb06\u794c\u11f6\u8681\ud085\u21cb\ube95\u3c7c\u1a07\uc915\u485a\u8eed\u1857\u3047\u050a\u7737\ua454\udef6\uf561\u2620\ucccaw\ue570\uc2e8\u944b\ubdda\ud8f1\uc21c\uda29\u0cf0\u12ed\uea84\u36ad\u26c4\ud6d3\uebc5\ub4ce\u57ad\uda7a\ueb39\u7090\u979d\u042a\u4912\uba71\u25ce\ubb48\u0a32\u4715\ubcbd\u9ff9\u4c53\u7831\ue92f\u2a22\u7ba0\uc3a0\u077d\ube19\u06f2\u3e52\u3ef6\u85e1\u2372\uaaeb\uc9c8\ua4a9\u60e5\u62d8\u75b4\uc46a\uf745\u3655\u3ae1\u621f\u78e4\u86fe\uc2ce\ub604\ubdfb\u1e4f\ue4e7\ub125\ub499\u444b\u07ea\u8d61\ubccd\ud2d7\u4025\u5d2d\u4f09\uae74\u88d2\uf157\uef8e\uf96c\u6e0d\u617e\ub5f4\u5a19\uea1e\ub403\u63ed\ua381\ue1e5\u8170\u647c\u1d15\u64ca\u85fc\u7fb3\u4cc5\u5574\u34e3\u77b8\u7296\u59a1\u7f5a\uee0e\u9ef8\u0e19\u4f8a\u058a\u3cc7\u8ac8\u6dff\ub78b\u042b\u3647\u319c") }));
        }
        return (ResultSet)j.g(j.Y(this, 1016444178), 1040430277, null);
    }
    
    public ResultSet getSuperTables(final String s, final String s2, final String s3) throws SQLException {
        if (j.Y(this, -82856685) == null) {
            j.i(this, -82856685, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\uc058\u77f0\ub787\u7bf2\ubea4\u9001\u1b71\u5f5c\uf82d\uc6fe\ud2c8\u8871\u71db\u75c7\u407c\uc10c\u669d\ub47e\u85c3\u2ca1\u6ff6\u0b16\u6575\u5454\u7f82\ufb57\u8d5a\ue7bd\u0972\u0ed2\u94fb\u51d4\u1f89\u3e65\u6fd7\u016c\u82f2\u77b9\u04c7\u3ffe\u6484\ufc15\u4bc8\u8fab\u7f14\u9c08\u80ef\u8881\u9ff9\u067b\u5871\u12f1\u507a\u6a1b\u6a2b\u65f8\u890f\uff93\u8ea1\u344c\u18b5\u2a66\u7817\u266c\u0f62\uff34\uc2d5\u8e98\ufe30\ufe41\ufeef\u10c7\ue456\ua73f\u1f5c\u9c21\u5768\ud469\u13bf\uf192\u70dd\ucfa4\ue738\uf852\u35ee\u9474\ud0c8\uafb7\u3eb5\ua7d8\u8d03\u5b2c\u0170\ub330\uc0f3\u931d\u7747\u3626\u9d99") }));
        }
        return (ResultSet)j.g(j.Y(this, -82856685), 1040430277, null);
    }
    
    public ResultSet getSuperTypes(final String s, final String s2, final String s3) throws SQLException {
        if (j.Y(this, -654985964) == null) {
            j.i(this, -654985964, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u041b\ubb9a\ued66\uae6c\u8b13\u151e\u51b4\u449f\u46db\u8ee3\u1ad6\uec81\u0760\u0be8\uebfd\u6101\ub249\u481f\ue360\u42ee\u27de\u5eaa\u0d7c\ud1f1\u1d71\u1554\ua66e\u28dd\u0a4b\u7bec\u8f00\u9ce4\u57d1\u30f8\u4720\ua2fc\uf83f\u06d0\u6053\u518d\u38c1\u756d\u1777\ude32\uae80\u3720\u881b\ua5a1\uc395\uaf93$\uc965\ua4a5\ue8c5\u14ff\u814e\uad1f\ue0ed\u815d\uafa5\u95b7\uc95a\uf7fb\u4f75\u1a9f\u1750\uf99c\u81c1\u00d6\u3985\u698b\uf250\u4d4b\u80a0\ub62c\u775e\u938d\uf33e\u4f7c\ue801\u313d\ue4f2\ua58d\uf098\uc976\u7ab3\u93eb\uf0e8\u065c\ud484\u49f5\u8dca\u2252\ue927\u67b9\u0a63\u8027\uc72f\u0e9a\u3408\ue8f5\u4284\u0d8f\u0fc0\u7a46\uc427\udf10\u023b\u9a3f\uac63\ud064\u21c0\ue87d\u82cf\u1ac6\ua55e\ue5bd\u4833\udcf6\ub4d4\u9d6e\ua1bd\uff1c\ufc35\u7047\u5870\u5ba9\u5a32\u4bb0\ue932\u06bf\uf3a1\u72cf\u6199\u8891\u9ccb\ub7af\u3db2\u63ef\uc9a9\ud507\u2a13\uec93") }));
        }
        return (ResultSet)j.g(j.Y(this, -654985964), 1040430277, null);
    }
    
    public ResultSet getTablePrivileges(final String s, final String s2, final String s3) throws SQLException {
        if (j.Y(this, -1909672683) == null) {
            j.i(this, -1909672683, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\uf9a5\u58f2\u9e09\u6cc9\uc0b0\ue299\u45c5\u2870\u0d1c\uba29\ua7ed\u77f5\uf7bc\udae3\uc953\u93df\u276f\u6fd2\u9340\u50f3\u9f80\uc146\u9809\u8d42\ud61d\u4ca3\ubc0e\ue60d\u6bf0\uc656\u62a5\u1839\u8b79\uc476\u8daa\u081f\u8809\u14b2\uca32\u2068\u55dc\ud05a\ueec9\u4e0f\u26bf\u0306\u4ed1\ucfad\u1ee7\u32fc\u82f2\u8c3e\u74d5\u61c6\u45af\u3775\uf92f\uea82\ua68a\u65e8\u998e\u8253\u28d5\uca6a\u8036\u93a1\u78fb\u452c\ue834\ua855\udbb1\u3af3\uc99a\u4b90\uf03d\ua634\u70ee\ubcd6\ue162\u534c\ubba0\u89dd\uac5a\uef69\u41b6\u3dd9\u17d6\ue2d9\uba90\u4994\u80cc\u6e30\ud8d5\u5da3\u716a\u1c1d\u4a42\u4205\ubcf5\ub04f\u5f05\u2cc8\u3a3d\ua01f\uecf4\ube37\u3123\uaf77\u0bf9\u05e8\u58b7\ud826\u1768\u8337\u1714\ucfc3\uccdb\u6c77\u6a98\u0597\u37b5\u8969\ud8cc\ufbba\uc1d7\uf0c7\u4204\u4fa5\ub020\ue8f5\ub00a\uc08a\ua04e\u8226\u3bf7\uafc0\u5251\uc197\u246d\u7ba0\u6d88\u7c88\u0136\ub13b\ub4bc\u6237\u8cd3\ua3f0") }));
        }
        return (ResultSet)j.g(j.Y(this, -1909672683), 1040430277, null);
    }
    
    public synchronized ResultSet getTables(final String s, final String s2, final String s3, final String[] array) throws SQLException {
        j.g(this, 1659679960, null);
        final Object o = (s3 == null || (boolean)j.g("", -145835974, new Object[] { s3 })) ? JDBC3Connection$JDBC3PreparedStatement.N("\u6133") : j.g(this, 1992602843, new Object[] { s3 });
        final Object h = j.H(-1931495456, null);
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6145\ued98\u4fee\u3def\ud237\u2213") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4fec\u3dff\ud238\u220b\u7814\u8037\u1dbb\u5d54\uae90\u7bfb\ud4f2\u7501\u98f0\u966e\u2f8c\u4d38\udb95\u8dd6") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4fec\u3dff\ud238\u220b\u7814\u8037\u1dbb\u5d54\uae90\u7bfb\ud4f2\u7501\u98f0\u966e\u2f9c\u4d3a\udb89\u8dbf\u2b08\u7d8d") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4fec\u3deb\ud239\u2202\u7814\u8037\u1dbb\u5d54\uae90\u7bfb\ud4f2\u7501\u98f0\u966e\u2f81\u4d38\udb8c\u8dbf\u2b69") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4ff6\u3df3\ud224\u2202\u7814\u8037\u1dbb\u5d54\uae90\u7bfb\ud4f2\u7501\u98f0\u966e\u2f9b\u4d20\udb91\u8dbf\u2b69") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4fec\u3dff\ud238\u220b\u7814\u8037\u1dbb\u5d54\uae96\u7bff\ud4fd\u750c\u98e7\u967a\u2f9c\u4d55") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4fec\u3dff\ud238\u220b\u7814\u8037\u1dbb\u5d54\uae90\u7be3\ud4e0\u7508\u98ea\u9672\u2f8e\u4d2d\udbed") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4fec\u3dff\ud238\u220b\u7814\u8037\u1dbb\u5d54\uae90\u7be3\ud4e0\u7508\u98ea\u9662\u2f8c\u4d31\udb84\u8db7\u2b69") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4fec\u3dff\ud238\u220b\u7814\u8037\u1dbb\u5d54\uae90\u7be3\ud4e0\u7508\u98ea\u967f\u2f8e\u4d34\udb84\u8dd6") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4fec\u3dff\ud238\u220b\u7814\u8037\u1dbb\u5d54\uae97\u7bff\ud4fc\u750b\u98ea\u9663\u2f8a\u4d3f\udb84\u8da8\u2b00\u7def\u3c5a\u3064\uadbd\u7fda\u41c6\uaeec\u93ce\u6fa0\u9a47\u4303\uf1cd\u43b5\ud4db\u46db") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4fec\u3dff\ud238\u220b\u7814\u8037\u1dbb\u5d54\uae96\u7bff\ud4f6\u7512\u98f2\u9674\u2f81\u4d3c\udb93\u8dbb\u2b11\u7de8\u3c56\u3063") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6150\ued8f\u4fed\u3de7") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f8a") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud227\u2202\u7878\u8033\u1dab\u5d20") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u787a\u8037\u1da5\u5d31\uaee8") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u7861\u8026\u1db8\u5d31\uae96\u7b92\ud4e4\u7514\u98e5\u9674\u2fe6\u4d59\udb80\u8da9\u2b65\u7df5\u3c40\u307d\uadb6") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud232\u2215\u787b\u803b") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u7847\u8007\u1d84\u5d1d\uaeb0\u7bdf\ud4ef\u7520\u98d4\u9642\u2fbb\u4d1c\udbb3") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud223\u220f\u7871\u8024\u1dad") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u787a\u8037\u1da5\u5d31\uaee4\u7bf4\ud4ff\u7519\u9895\u967d\u2f86\u4d32\udb84\u8dda\u2b62\u7dd2\u3c68\u3041\uad9a\u7fe9\u41fc\uaef3\u93de\u6fc9\u9a3f\u436d\uf1c9\u43ab\ud4dd\u46b6\u9cb4\ud647\u588d\u6342\ufcbe\uae3c") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u7875\u8038\u1dac\u5d54\uae91\u7bea\ud4e0\u7508\u98e7\u9619\u2f9b\u4d20\udb91\u8dbf\u2b6c\u7d81\u3c50\u3063\uadd3\u7fb5\u41be\uaefb\u93c0\u6fae\u9a54\u4308\uf1ab\u43d4\ud4be\u46d0\u9cb2\ud64b\u58e8\u6332\ufcc5\uae32") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud221\u2209\u787d\u8039\u1da6\u5d54\uae85\u7bf6\ud4fc") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud227\u2202\u7878\u8033\u1dab\u5d20") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u787a\u8037\u1da5\u5d31\uaee8") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u7813\u8031\u1da4\u5d3b\uae86\u7bfb\ud4fc\u756d\u98e1\u9674\u2f82\u4d29\udb8e\u8da8\u2b04\u7df3\u3c40\u300a\uadd3\u7fdc\u41ca\uae8f\u93d5\u6fb5\u9a48\u4308") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud232\u2215\u787b\u803b") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u7847\u8007\u1d84\u5d1d\uaeb0\u7bdf\ud4ef\u7539\u98d0\u965c\u2fbf\u4d26\udbac\u8d9b\u2b36\u7dd5\u3c7c\u305f") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud221\u2209\u787d\u8039\u1da6\u5d54\uae85\u7bf6\ud4fc") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud227\u2202\u7878\u8033\u1dab\u5d20") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u787a\u8037\u1da5\u5d31\uaee8") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u7813\u8025\u1db1\u5d27\uae90\u7bff\ud4fd\u756d\u98e1\u9670\u2f8d\u4d35\udb84\u8ddd\u2b65\u7de0\u3c4a\u300d\uada7\u7fc4\u41c9\uaeea") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud232\u2215\u787b\u803b") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u7847\u8007\u1d84\u5d1d\uaeb0\u7bdf\ud4ef\u7520\u98d4\u9642\u2fbb\u4d1c\udbb3") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud223\u220f\u7871\u8024\u1dad") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f82\u3d8a\ud254\u2267\u787a\u8037\u1da5\u5d31\uaee4\u7bf6\ud4f9\u7506\u98f0\u9611\u2fe8\u4d0a\udbb0\u8d96\u2b2c\u7dd5\u3c7c\u3071\uadac\u7fb8\u41be\uae8f\u93c4\u6fbf\u9a5b\u430c\uf1dc\u43bd\ud4be\u46d0\u9cb8\ud625") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\uedfd\u4f8b") }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u611c") });
        j.g(j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6136\ued8a\u4fea\u3def\ud226\u2202\u7814\u8022\u1da9\u5d36\uae88\u7bff\ud4ef\u7503\u98f4\u967c\u2f8a\u4d59\udb8d\u8db3\u2b0e\u7de4\u3c39\u300a") }), 566474721, new Object[] { o }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6131\uedfd\u4fe3\u3de4\ud230\u2267\u7860\u8037\u1daa\u5d38\uae81\u7be5\ud4e4\u7514\u98e5\u9674\u2fef\u4d30\udb8f\u8dda\u2b6d") });
        if (array == null || array.length == 0) {
            j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6131\ued89\u4fe3\u3de8\ud238\u2202\u7813\u805a\u1dcf\u5d22\uae8d\u7bff\ud4e7\u756a") });
        }
        else {
            j.g(j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6131") }), 566474721, new Object[] { j.g(array[0], 956544221, null) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6131") });
            for (int i = 1; i < array.length; ++i) {
                j.g(j.g(j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u613a\uedfa") }), 566474721, new Object[] { j.g(array[i], 956544221, null) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u6131") });
            }
        }
        j.g(h, 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u613f\uedfd\u4fed\u3df8\ud230\u2202\u7866\u8056\u1daa\u5d2d\uaee4\u7bee\ud4f1\u750f\u98f9\u9674\u2f90\u4d2d\udb98\u8daa\u2b00\u7d8d\u3c39\u3079\uadb2\u7fdf\u41d5\uaeea\u93de\u6fa2\u9a59\u4300\uf1c9\u43c3") });
        return (ResultSet)j.g(j.g(j.Y(this, 2034283754), 1472248013, null), 1979626738, new Object[] { j.g(h, 705148898, null), true });
    }
    
    public ResultSet getTableTypes() throws SQLException {
        j.g(this, 1659679960, null);
        final String i = JDBC3ResultSet$JDBC3Savepoint.i("\uc58b\uef39\u8561\u7ada\u861c\u3406\u4d08\ua3dc\u3864\u93bc\ub9da\u814b\u6c0d\u0c1c\u0dc8\u6427\uf16c\udbd4\u4776\u5270\u08c2\u860e\u5dd1\u04f2\ubc32\u97ed\u1d05\u3c32\u5f68\ufc1a\uf886\ube41\uf75a\u5ee7\u97df\ue4ac\u1ca1\ubeab\ud452\u668f\uf3c1\ua56b\u8e39\ud9a8\u99ac\u749a\ub0e8\u78fc\u18f4\u6973\ua3d6\u9e4c\u0bd7\u4e30\ud2a9\ud8b0\u8b0b\u0cdf\ub77d\u8c59\u4c06\ub53d\u0591\u3057\u4c16\u4e30\u882e\u9a27\u2dac\u81b3\uf42e\u8031\uf14d\ub6a1\udfca\u89be\u04fc\u826c\uff3a\ue738\u0603\u1768\ud224\uc8d8\u8545\u0d67\uf4da\ua351\u9611\u646f\u7c72\ua9e4\u6a48\u66fb\ua1e6\ud58f\u1e0d\ua377\u996d\u35c2\u1529\u5efe\ub9de\u4219\ud57e\u9653\ue43c\u10fe\ufcef\uc70b\ud471\u23f9\u6c91\u733f\u91a5\u2f19\uca3d\u5509\u3c4c\ud78d\u2928\u0a3b\uccbb\u6f21\ub5ee\u9c45\u7823\ue0a9\ue1d8\u29b4\u32a8\u629f\u1598\u89d1\u9474\uc2d1\u1a49\uf1e1\u9dbe\u0426\ufd43\u72c2\u8bf1\ucab9\u7028\u2805\u6f5a\ua7ae\u9c61\u8e60\u7806");
        if (j.Y(this, 1310766358) == null) {
            j.i(this, 1310766358, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { i }));
        }
        j.g(j.Y(this, 1310766358), -801065689, null);
        return (ResultSet)j.g(j.Y(this, 1310766358), 1040430277, null);
    }
    
    public ResultSet getTypeInfo() throws SQLException {
        if (j.Y(this, 1293202728) == null) {
            j.i(this, 1293202728, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\uc46e\u595f\u90f8\uc712\ucd5b\u8c0c\u9543\u9d1e\u68ea\u9c8b\uc016\u27e2\uc72d\u631c\u9aea\ub76f\u142b\u0864\u1685\u54e0\uc445\u74f6\ue741\u63d6\uade7\ua2ce\uc1a2\u528e\ufcae\u927a\u9ca2\u3a29\ue3ae\u9fa4\ud039\u0d42\u60a8\u63eb\u8eef\u8d26\uabd9\u5ddf\u3599\ub11b\u4c34\u51f7\ua8fc\u1681\u56ad\u882f\u659f\u1996\ufc91\ubed3\u3c8d\uef35\ua13e\u98e9\ue73a\u1984\u275b\ua507\u4127\u845b\uf464\u34af\uef8c\u1639\ud1cc\u3d17\u4f29\u1908\ufb70\u62d6\u3264\ua336\u874d\u1915\u254f\u2491\ubf46\uac1b\uc725\u13f7\u3780\u3772\ub336\u6fe1\u78cc\ucfa6\uf55a\u0792\uaf9e\u197f\u6c0e\ua6e7\u2d5d\u49d0\u277a\u955d\u4ce8\u7242\u6955\uf7e0\u1cef\ud384\ufeda\uc8c1\u1436\u5237\uda86\u6441\u608f\u11d9\ue51b\u3738\uabbf\ue160\u83b9\u7125\udce2\u3c94\u046a\u958b\u2ec5\uc6e7\u5d0e\u0b32\ufe42\u7cdb\u9acb\u1b53\u61d8\u1c2b\u768e\uc089\u43e6\u676d\u79bc\u824e\u0b59\ud8ca\uecd1\u72f4\uee0c\ueece\uf11c\ub6ed\ud781\u715e\u5550\uac0f\ub90d\uc004\u3185\ubfbd\ud8b9\u50ca\u4d6f\u7c7d\ub6ca\ue522\uf149\u5756\u4d85\uba53\ud7e4\ue36d\u6584\u99c7\u6f40\uda83\u859b\u891c\ub35c\uf179\u76eb\u42d0\u6eae\u0966\uafe6\uc81d\u242c\u4088\u1ec3\ud58a\ud87d\u9b36\ud2bd\ua48a\ufc57\ubdf6\ua4e6\uc039\u1577\u2a2a\uda4d\u2072\u18a6\u6a3b\ufc4c\u40ec\udfd6\ue6e0\u3789\u79da\ucef2\u30e5\u3463\udecf\u92f3\u4921\uf6d2\ub68a\u1a47\ub5be\u5e54\u98fc\u77a6\u67b9\ue9df\u64e6\ud8f5\u3923\uf061\uccf9\u8e66\ueedb\ubba9\u479c\u6a29\u4ad7\ud3e6\u83c2\u6a51\u47f8\u2552\ud436\u9182\u8893\u9404\u9f44\u556e\uba87\u6b45\uc29a\ueeed\uf383\u9388\ue276\ub7f0\u5d7b\ucd54\u5132\u706e\u32fb\u8938\u6178\ucf6b\u3c30\u399f\ue015\u9bc9\u095b\uefb2\u6a9f\uf336\ue27c\ub217\u9e7e\u89d5\u7c82\ud923\u6b85\u732e\u8e11\u4f77\ua6c0\u64ff\ueae3\u8a1b\udc77\u7176\ucd6d\u2a60\u3c65\u2779\uf15f\uab8c\u59ee\u69fc\uf967\u27b3\uc5e5\u8a6b\ub943\u5e3e\ufa4c\uc52d\ue205\u99e1\u3ca8\uf701\u03df\ud57a\u75e0\u83b9\u8253\ud972\u6bb5\u6132\u91a3\u30ab\u0133\ud952\uc8f7\u5c36\u9957\u1a38\u0215\ue743\uea53\u8d40\ud415\u8010\u479f\ufaa2\u3bce\u67a4\ud6ea\uefc1\u1663\u0298\u8657\u4462\u919a\ucdca\udbc1\u6cec\u54cb\u6d5b\u0939\u3558\u2350\u07ab\u3b73\ud58e\uccc9\ud4e0\udb70\u5de7\u80e1\uf0f5\u5cee\u5f26\u9ad2\u29cd\uc4a7\u9707\u6f85\u7de7\uc661\u9173\u30db\u96ee\ueaa1\u84f0\u25d6\uaffd\u145a\u284b\u562c\u893e\ub969\u4a9a\ud6c3\u4742\uaac2\u0b31\u3e54\u68c0\u5bea\uc017\ufdbc\ua8d3\u0715\u444f\u70da\u5cc9\ud253\ubdb1\u0319\u97a7\u65b2-\u390c\u2014\u82be\u393d\uee48\ue610\udb1b\u84b9\u9906\u6d2f\uf550\u76eb\u34e4\uad40\ua23c\u71db\ufb77\ua5b6\uff0f\u205b\uc196\ud1cd\uaeea\u9eb3\udeba\u61b0\ua949\ue7ea\u26d1\u552e\u4fb7\uda52\uc566\uef26\uc4a9\uf6a3\ua84b\u1679\u5b9c\u1610\u2f5c\u6517\u373c\u0c28\u17cf\u65f8\u7cbf\u6054\uc99f\u13ec\u7df9\u886f\u8931\u416f\ub607\ub2de\u5fac\u5222\uda84\u3571\uaf02\u7745\u08f3\ucefd\u0112\ue243\u8d02\uf877\u7a74\udaa9\u1f8c\ufd89\u39e1\u57ca\u2846\u096a\u8b44\u6f65\u5559\ufe36\ueba6\udc2d\u84b3\ufa00\u13a4\u9cdb\u42ac\u2541\ucc52\u5b73\ue5cb\u61d6\u8c99\u1c8e\u922a\ue9cc\u6d1a\u456b\u145b\ud4c1\u6c20\u0e8f\ud39b\u74ce\u21c9\ud20a\u31c5\u03c8\uc21f\u56c9\u9f7c\u7183\u1e23\u8bcd\ucfa9\u19d5\u43d5\u9076\u17be\u7906\uac49\u4d81\u5a0b\uf085\u4a0a\u2566\u7012\ud4fe\u39a8\uf40e\u080c\uafb9\u4817\ue2ed\ue73d\ue5f4\u09a6\u6c80\u5842\u8d42\ub070\u359c\ufcc7\u5679\ucaf7\u9345\ue2b6\u725e\u83ea\u3eb7\ubfd8\u19a8\u3260\ubc2e\u0110\u3b93\uc448\u43a7\ucb90\u93fd\u2d5c\u0513\u5da1\uaf63\u9995\ub183\ub91c\u7847\u5ef5\u90d6\u6103\u95ff\ue35b\ucbfa\u45d0\u0df1\u0111\u87cf\u58e1\ua9c2\ubde9\u73ea\u76f7\udb78\u7f73\u0a72\u7253\u56c3\u1760\ufc9d\ua456\ue10c\uded4\u8ccd\u6a4e\uca61\u7cd6\u75e6\ubc28\uec9d\ud506\ubdc6") }));
        }
        j.g(j.Y(this, 1293202728), -801065689, null);
        return (ResultSet)j.g(j.Y(this, 1293202728), 1040430277, null);
    }
    
    public ResultSet getUDTs(final String s, final String s2, final String s3, final int[] array) throws SQLException {
        if (j.Y(this, -1646349015) == null) {
            j.i(this, -1646349015, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5136\u888d\u1216\u371c\u0eec\uf972\u222c\u33b0\u36c0\u3671\u9c28\ua330\u4c1d\u1cbb\u8979\u9b53\ub5a3\ue677\u7e75\u2389\uc104\ua196\ufd8b\ub788\u1f56\ufba5\u569e\u4c93\u1458\u634c\u2b06\u64a6\ua748\u6808\ufb6a\u0b13\u5ba4\ue5ac\u37a8\ua22a\ub73a\u9af3\ua29e\u9e4e\ubf21\u4b89\uc36b\u164b\u95b8\u4922\u3491\u156e\u197e\uc779\u0019\ua70e\ubbda\u2033\u2a75\u4a42\ube17\u0d09\u1958\ube8f\u05b8\ub489\ua138\u6709\uf81c\u6966\u346a\u61d6\uf5a0\u11ce\ud6e8\u1dc6\u8bfb\u5559\u175b\u96da\u0c6e\uc398\ufe67\ubfd0\uc251\u5880\u2c68\ua518\ua342\u05d9\ud1b7\u1f71\ubd67\ua643\uccb2\u1ae2\u083c\u3258\u6b6d\u40ba\ud43e\ufb03\u9dd1\u93ab\u02d8\uffcf\u932d\u8bd1\u5d6f\ufd28\u6e60\ub084\u3098\ucbdc\u1a98\uefe2\u5d8d\u2a60\u59ae\u9d01\u3350\u7310\u3d5e\uc4c8\u7b45\u03ee\u6bc9\ub463\u7537\ufda3\u3e81\u8fcf\u4d6f\u0efe\ub817\u04ad\uf7e1\u1aff\u6fd5\u25ce\ua109\ua6fb\u5342\u76d8\u71ca\u6ae2\u6fe5\ubf33\ue9c8") }));
        }
        j.g(j.Y(this, -1646349015), -801065689, null);
        return (ResultSet)j.g(j.Y(this, -1646349015), 1040430277, null);
    }
    
    public ResultSet getVersionColumns(final String s, final String s2, final String s3) throws SQLException {
        if (j.Y(this, 1160492330) == null) {
            j.i(this, 1160492330, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u56e4\uc8df\u3ee9\u13e9\u7f94\u723b\u8984\u17e9\ud94b\uc562\u71dc\uad90\u992c\u5b17\u3f40\u7a4a\u5ca2\ud577\ud7c2\ud361\u8f3a\u8df8\uccde\u4e90\ub9af\u62f2\u400c\u6bab\u597d\u335c\uc637\u429b\u8184\u2bbe\u343f\ude2e\ub386\u4345\ub253\u486b\u6c3a\u7ec5\u430c\u9eca\u1156\ubdc9\ud35b\u1b97\ue6c0\ud760\u2d52\u60cb\u3b1c\u12d8\u3a16\u67bd\u04e0\u69a5\uf7af\udcb5\ua035\u4251\ub2c5\u140c\u2c1b\ueb5a\u4787\u0df6\udea9\uf194\u4797\ub42c\u5259\ueffe\u22c7\ucc73\u1c5b\u52db\uc204\u1aaa\uc06b\u44dc\uaa69\u1d36\ub049\u3232\u104c\u8eac\u710a\u7255\u1953\u66ce\u7ac6\ud40e\ua47b\ucd5e\ua4cf\uc993\ueb73\ua369\u5d8c\udcf7\u8513\ub95a\u1440\u5ac0\ufee9\ua2e0\u2fcb\u1442\u61a7\udf8c\u0182\u2978\u6b09\u7ff5\u982a\ubdb4\u8ecf\ucf53\u8941\uc212\ua7ee\u78a8\u6639\u25f8\u7fc4\ufa7b\u8708\ud880\u6055\u622e\u153f\u88f6\udaa9\u4b29\udf9c\ua368\u99d4\u08e2\uede0\uddab\ue464\uf24f\ucd2c\uf0e1\u9faf\u8da7\u2f45\u887b\u26ad\ua9d7\u642d\ubc65\u552f\ud1bf\uddb6\u75cd\u4e8b\u555a\u298b\u979b\u51e4\u66ed\u2277\u417d\udf05\ud004\u5dac\u823c\u0404\u4616\u86f4\u47f4\u0084\u49a6\ucf17\u162e\uf418") }));
        }
        return (ResultSet)j.g(j.Y(this, 1160492330), 1040430277, null);
    }
    
    @Override
    public ResultSet getGeneratedKeys() throws SQLException {
        if (j.Y(this, -1091521237) == null) {
            j.i(this, -1091521237, j.g(j.Y(this, 2034283754), 1262924996, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ub8bd\u37d2\u2487\u31f6\ucc65\u95ff\u330f\u495a\u0155\u47da\u473e\u6220\u13fa\u0328\u019c\uabbe\u0486\ua09f\u115a\u6344\u61f7\ue777\ue592\u45ec\u0dbd\uf24e\u7627") }));
        }
        return (ResultSet)j.g(j.Y(this, -1091521237), 1040430277, null);
    }
    
    public Struct createStruct(final String s, final Object[] array) throws SQLException {
        throw (Throwable)j.H(223000547, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u3b22\ud9cd\ueda4\ud287\u1810\ua030\u9abf\ue1f3\u66c3\ubbd5\udded\u1bfc\ua4b8\uf03d\u1230\ub0dc\u97b4\u92d1\ue587\u6746\u7850\u6aa1\u38fd\uaeef\u1d5a\u1715\u0441\u64de\u287e\ufe15\u9b50\u61a9\u8e59\ub16a\u03dd\uc5e6\u21b0\u314a\u34cf\u66f5\u57a8") });
    }
    
    public ResultSet getFunctionColumns(final String s, final String s2, final String s3, final String s4) throws SQLException {
        throw (Throwable)j.H(223000547, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u177c\u348a\u72e9\u69fd\uf141\uc989\ub7a7\ub96a\u8ab7\ufc30\u1efd\ue202\ua576\ud7de\u6ede\udfc5\u0e6d\u5c1b\u7d82\u7a1b\ua2b4\u80dd\u53ce\u0739\ub8ce\u9a9f\u3164\ub451\uf2c1\u25b8\u8c67\ub3a3\u4381\ud25c\uad64\u7a01\udf63\u8177\u4440\ub1ca\u9bda") });
    }
    
    @Override
    protected void finalize() throws Throwable {
        j.g(this, 146847020, null);
    }
    
    private String unquoteIdentifier(final String s) {
        if (s == null) {
            return s;
        }
        Object o = j.g(s, 1251719252, null);
        if ((int)j.g(o, -1748977461, null) > 2 && (((boolean)j.g(o, -100944595, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5c8b") }) && (boolean)j.g(o, -270093010, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5c8b") })) || ((boolean)j.g(o, -100944595, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5cc9") }) && (boolean)j.g(o, -270093010, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5cc9") })) || ((boolean)j.g(o, -100944595, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5cb0") }) && (boolean)j.g(o, -270093010, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u5cb6") })))) {
            o = j.g(o, 1814607103, new Object[] { 1, (int)j.g(o, -1748977461, null) - 1 });
        }
        return (String)o;
    }
    
    static {
        Object x = null;
        try {
            x = j.x(-1824148223, new Object[] { j.g(JDBC3DatabaseMetaData.class, -1654278912, null), JDBC3Connection$JDBC3PreparedStatement.N("\u0e24\u09fb\ua4f6\u4aee\ub38e\ub430\u8ee2\u915b\u21ef\u2fa5\u1653\u36d6\ue01c\ubeab\ue0f0\ua2e8\u8d08\u6e4a\uc198\u1c13\u5a8d\u2006") });
            if (x == null) {
                throw (Throwable)j.H(2006299906, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e14\u09eb\ua4f4\u4ae9\ub395\ub421\u8eef\u915d\u21e4\u2fa6\u1654\u36d8\ue01f\ubea8\ue0f3\ua2f1\u8d19\u6e5d\uc1c1\u1c10\u5a8c\u2017\u330a\u5474\ufb49\u63c1\uee5f\u708d\ub3f0\u8e7c\ubbb8\u73fb\u4862\u3896\u91b5\u3991\uf1fe\ub776\u91db\u67c6\u2227\udc81\u7e25") });
            }
            final Object h = j.H(-875383549, null);
            j.g(h, 725333252, new Object[] { x });
            j.T(-2119846674, j.g(h, 1554822405, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e39\u09eb\ua4f7\u4ae2") }));
            j.T(885961965, j.g(h, 1554822405, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e21\u09ef\ua4e8\u4af4\ub393\ub43a\u8ea1") }));
            if (null != x) {
                try {
                    j.g(x, -778717946, null);
                }
                catch (Exception ex) {}
            }
        }
        catch (Exception ex2) {
            j.T(-2119846674, JDBC3Connection$JDBC3PreparedStatement.N("\u0e04\u09db\ua4d6\u4aee\ub38e\ub430\u8eef\u917b\u21cf\u2f85\u1673"));
            j.T(885961965, JDBC3Connection$JDBC3PreparedStatement.N("\u0e64\u09a4\ua4aa\u4aa9\ub3ca\ub478\u8e9a\u917f\u21c0\u2f89\u167f\u36af\ue022"));
            if (null != x) {
                try {
                    j.g(x, -778717946, null);
                }
                catch (Exception ex3) {}
            }
        }
        finally {
            if (null != x) {
                try {
                    j.g(x, -778717946, null);
                }
                catch (Exception ex4) {}
            }
            throw;
        }
        j.T(-1058622242, j.x(1884141678, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e79\u09a0\ua4b2\u4ace\ub3b4\ub401\u8eb3\u9173\u21c4\u2f88\u167c\u36d1\ue042\ubef3") }));
        j.T(-930302737, j.x(1884141678, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e79\u09a0\ua4b2\u4ac4\ub3b2\ub414\u8e9d\u914d\u21c8\u2f8b\u167f\u36ba\ue010\ube8d\ue0da\ua2c0\u8d39\u6e44\uc1ae\u1c36\u5aa7\u2037\u3340\u5474\ufb13") }));
        j.T(-1089293072, j.x(1884141678, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e79\u09a0\ua4b2\u4ad5\ub3bf\ub414\u8e83\u914d\u21cd\u2f8b\u167f\u36b9\ue010\ube9d\ue0d0\ua2cd\u8d2f\u6e44\uc1a8\u1c3f\u5aab\u2009\u3327\u540f\ufb74\u639a\uee1e\u70d7") }));
        j.T(-1792428826, j.H(-893142893, null));
        j.g(j.B(-1792428826), 2086057239, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e19\u09c5\ua4ba\u4ac6\ub3b9\ub401\u8e86\u917e\u21c5"), j.x(2111158425, new Object[] { 3 }) });
        j.g(j.B(-1792428826), 2086057239, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e14\u09cb\ua4c9\u4ac4\ub3bb\ub411\u8e8a"), j.x(2111158425, new Object[] { 0 }) });
        j.g(j.B(-1792428826), 2086057239, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e05\u09cf\ua4c9\u4ad3\ub3a8\ub41c\u8e8c\u9165"), j.x(2111158425, new Object[] { 1 }) });
        j.g(j.B(-1792428826), 2086057239, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e04\u09cf\ua4ce\u4aa7\ub3b4\ub400\u8e83\u917d"), j.x(2111158425, new Object[] { 2 }) });
        j.g(j.B(-1792428826), 2086057239, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e04\u09cf\ua4ce\u4aa7\ub3be\ub410\u8e89\u9170\u21de\u2f8b\u1664"), j.x(2111158425, new Object[] { 4 }) });
        j.T(-2066696027, j.x(709605564, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e79\u09a0\ua4ca\u4ad5\ub3b3\ub418\u8e8e\u9163\u21d2\u2f9b\u1643\u36d3\ue027\ube9c\ue0c6\ua2c4\u8d1e\u6e12\uc1b0\u1c52\u5ac0\u205b\u3343\u5465\ufb10\u63ef\uee19\u70d3\ub3bf"), 34 }));
        j.T(2063382689, j.x(709605564, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\u0e79\u09a0\ua4d9\u4ac8\ub3b4\ub406\u8e9b\u9163\u21ca\u2f8e\u167e\u36ac\ue030\ubeaa\ue0b5\ua2b0\u8d43\u6e12\uc1d3\u1c53\u5ab4\u2006\u3343\u540a\ufb6b\u63fa\uee7d\u70bc\ub3c7\u8e57\ubb90\u73e1\u482c\u38ae\u91d0\u39ae\uf1d0\ub76a\u919c\u67ba\u2265\udcc8\u7e79\uf989\u90a3\u079b\u15b0\u45cd\u7415\ub728"), 34 }));
    }
    
    static InputStream r(final ClassLoader classLoader, final String name) {
        return new kq(classLoader.getResourceAsStream(name));
    }
    
    class PrimaryKeyFinder
    {
        String table;
        String pkName;
        String[] pkColumns;
        
        public PrimaryKeyFinder(final String s) throws SQLException {
            j.i(this, 1133754568, null);
            j.i(this, 1353038025, null);
            j.i(this, -1236682550, s);
            if (s == null || (int)j.g(j.g(s, 1251719252, null), -1748977461, null) == 0) {
                throw (Throwable)j.H(223000547, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9e15\udeaa\u8d93\ue12f\uc212\u5102\u0a38\u898e\u3382\u5038\u806e\u6e38\ua884\uc908\u7868\uf8f1\u3c4b\u1b9f\u96aa\ua0be\ub14e") }), 566474721, new Object[] { j.Y(this, -1236682550) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9e7b") }), 705148898, null) });
            }
            Object g = null;
            Object o = null;
            try {
                g = j.g(j.x(1077786828, new Object[] { JDBC3DatabaseMetaData.this }), 1472248013, null);
                o = j.g(g, 649902239, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9e2f\udea1\u8d89\ue12b\uc21d\u511f\u0a7c\u89dd\u3387\u5035\u802c\u6e32\ua893\uc947\u786b\uf8b0\u3c55\u1b8b\u96fc\ua0f7\ub11d\u0ab0\ufc3b\u1852\ub864\u87ff\u6c91\ude94\u4a23\u7e21\u711c\u37eb\u15d7\u23bd\udd6a\u40c6\ucf1c\u7b14\u8c2b\u9171\u6089\u290f\u7d51\uff68\u5c72\uf9de\ue6a6\udc54\u9d6e\ucfce\ue664\u708e\u15e1\u9981\u8bd2\u0086\u58c7") }), 566474721, new Object[] { j.x(340900046, new Object[] { JDBC3DatabaseMetaData.this, s }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9e7b\udeed\u8dc5\ue12f\uc210\u510f\u0a7c\u89da\u338f\u5029\u8069\u6e74\ua888\uc946\u7826\uf8b8\u3c01\u1b8e\u96f1\ua0fc\ub105\u0ab0\ufc43\u1813\ub825\u87ab\u6c93\ude98\u4a34\u7e76\u714c\u37aa") }), 705148898, null) });
                if (!(boolean)j.g(o, 1531033760, null)) {
                    throw (Throwable)j.H(223000547, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9e08\udea5\u8d87\ue122\uc21b\u514b\u0a32\u89c1\u3382\u5079\u806a\u6e3b\ua894\uc946\u7862\uf8aa\u3c06\u1bdd") }), 566474721, new Object[] { s }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9e7b") }), 705148898, null) });
                }
                final Object g2 = j.g(j.B(2063382689), -1198278595, new Object[] { j.g(o, 791918754, new Object[] { 1 }) });
                if (j.g(g2, 252426302, null)) {
                    j.i(this, 1133754568, j.x(1827256484, new Object[] { JDBC3DatabaseMetaData.this, j.x(-1024935773, new Object[] { JDBC3DatabaseMetaData.this, j.g(g2, 1774762063, new Object[] { 1 }) }) }));
                    j.i(this, 1353038025, j.g(j.g(g2, 1774762063, new Object[] { 2 }), 1783543891, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9e70") }));
                }
                else {
                    final Object g3 = j.g(j.B(-2066696027), -1198278595, new Object[] { j.g(o, 791918754, new Object[] { 1 }) });
                    if (j.g(g3, 252426302, null)) {
                        j.i(this, 1353038025, j.g(j.g(g3, 1774762063, new Object[] { 1 }), 1783543891, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9e70") }));
                    }
                }
                if (j.Y(this, 1353038025) == null) {
                    o = j.g(g, 649902239, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9e2c\udeb6\u8d84\ue129\uc213\u510a\u0a7c\u89da\u3397\u503b\u8060\u6e31\ua8be\uc941\u7868\uf8f6\u3c49\u1bd2\u96b7") }), 566474721, new Object[] { j.x(-2143438682, new Object[] { JDBC3DatabaseMetaData.this, s }) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u9e7b\udeed\u8dde") }), 705148898, null) });
                    while (j.g(o, 1531033760, null)) {
                        if (j.g(o, 1490270391, new Object[] { 6 })) {
                            j.i(this, 1353038025, new String[] { (String)j.g(o, 791918754, new Object[] { 2 }) });
                        }
                    }
                }
                if (j.Y(this, 1353038025) != null) {
                    for (int i = 0; i < ((Object[])j.Y(this, 1353038025)).length; ++i) {
                        ((Object[])j.Y(this, 1353038025))[i] = j.x(1827256484, new Object[] { JDBC3DatabaseMetaData.this, ((Object[])j.Y(this, 1353038025))[i] });
                    }
                }
                try {
                    if (o != null) {
                        j.g(o, 1907931320, null);
                    }
                }
                catch (Exception ex) {}
                try {
                    if (g != null) {
                        j.g(g, 1289599161, null);
                    }
                }
                catch (Exception ex2) {}
            }
            finally {
                try {
                    if (o != null) {
                        j.g(o, 1907931320, null);
                    }
                }
                catch (Exception ex3) {}
                try {
                    if (g != null) {
                        j.g(g, 1289599161, null);
                    }
                }
                catch (Exception ex4) {}
                throw;
            }
        }
        
        public String getName() {
            return (String)j.Y(this, 1133754568);
        }
        
        public String[] getColumns() {
            return (String[])j.Y(this, 1353038025);
        }
    }
    
    class ImportedKeyFinder
    {
        private final Pattern FK_NAMED_PATTERN;
        private String fkTableName;
        private List<ForeignKey> fkList;
        
        public ImportedKeyFinder(final String s) throws SQLException {
            j.i(this, -664815427, j.x(709605564, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u65e1\u7587\u0f30\u4d64\u9d18\u7dbd\uc162\u3cc0\ufe3f\u025d\uedae\u09b4\u1041\u5268\ubad1\u11a8\u1199\ub6cd\uf4e0\u14d0\u6832\u6fc6\u7d8c\u94f6\u91fb\uc7d8\u6cd5\u3a81\u3f19\u5f28\u202f\u0eb1\ud1c5\u0620\udb74\u787b\uba8f\u4200\u039a\u9a84\u1884\u5fc1\u1ddd\u0110\u369f\uc900\uab95\u5b6b\ud187\u8d55\u6de3\udcce\u6ccb\u2296\ub60f\u1891\ud0a5\u913b\u3e94\uf8ba\u5ab1\u36f8\u36b5\ub4d7\u7ff4"), 34 }));
            j.i(this, 1744156862, j.H(457226395, null));
            if (s == null || (int)j.g(j.g(s, 1251719252, null), -1748977461, null) == 0) {
                throw (Throwable)j.H(223000547, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u65eb\u75a6\u0f08\u4d56\u9d20\u7d86\uc147\u3ca9\ufe05\u0268\ued90\u09ab\u100e\u5260\ubae4\u1188\u11d9\ub6f2\uf4bb\u14dd\u686f") }), 566474721, new Object[] { s }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6585") }), 705148898, null) });
            }
            j.i(this, -602360625, s);
            final Object g = j.g(this, -1742359344, new Object[] { j.Y(this, -602360625) });
            Object g2 = null;
            Object g3 = null;
            try {
                g2 = j.g(j.x(921482449, new Object[] { JDBC3DatabaseMetaData.this }), 1472248013, null);
                g3 = j.g(g2, 649902239, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u65d2\u75ba\u0f1f\u4d50\u9d21\u7d8e\uc103\u3cef\ufe1e\u027b\ued97\u09ae\u100c\u522e\ubad5\u1182\u11d1\ub6ee\uf4de\u1491\u6821\u6fea\u7da5\u9485\u919d") }), 566474721, new Object[] { j.g(j.Y(this, -602360625), 321303762, null) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\u6585\u75e1") }), 705148898, null) });
                int n = -1;
                int i = 0;
                Object h = null;
                while (j.g(g3, 1531033760, null)) {
                    final int intValue = (int)j.g(g3, -977619757, new Object[] { 1 });
                    (int)j.g(g3, -977619757, new Object[] { 2 });
                    final Object g4 = j.g(g3, 791918754, new Object[] { 3 });
                    final Object g5 = j.g(g3, 791918754, new Object[] { 4 });
                    final Object g6 = j.g(g3, 791918754, new Object[] { 5 });
                    final Object g7 = j.g(g3, 791918754, new Object[] { 6 });
                    final Object g8 = j.g(g3, 791918754, new Object[] { 7 });
                    final Object g9 = j.g(g3, 791918754, new Object[] { 8 });
                    Object g10 = null;
                    if ((int)j.g(g, 1338620086, null) > i) {
                        g10 = j.g(g, -432097099, new Object[] { i });
                    }
                    if (intValue != n) {
                        h = j.H(1613804756, new Object[] { this, g10, g4, j.Y(this, -602360625), g7, g8, g9 });
                        (boolean)j.g(j.Y(this, 1744156862), 1881192628, new Object[] { h });
                        n = intValue;
                        ++i;
                    }
                    j.g(h, -1315851051, new Object[] { g5, g6 });
                }
                try {
                    if (g3 != null) {
                        j.g(g3, 1907931320, null);
                    }
                }
                catch (Exception ex) {}
                try {
                    if (g2 != null) {
                        j.g(g2, 1289599161, null);
                    }
                }
                catch (Exception ex2) {}
            }
            finally {
                try {
                    if (g3 != null) {
                        j.g(g3, 1907931320, null);
                    }
                }
                catch (Exception ex3) {}
                try {
                    if (g2 != null) {
                        j.g(g2, 1289599161, null);
                    }
                }
                catch (Exception ex4) {}
                throw;
            }
        }
        
        private List<String> getForeignKeyNames(final String s) throws SQLException {
            final Object h = j.H(457226395, null);
            if (s == null) {
                return (List<String>)h;
            }
            Object g = null;
            Object g2 = null;
            try {
                g = j.g(j.x(-50547481, new Object[] { j.Y(this, 1793570006) }), 1472248013, null);
                g2 = j.g(g, 649902239, new Object[] { j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\uf078\ue7dc\ud5ed\ud8ef\ua475\u1b5f\u8146\uc666\u61f3\ua724\u953b\u8ee8\uad35\ufe4d\u1f39\uc5a5\uf328\u576f\u9342\ub2b2\u7d79\uee26\udd00\u0461\u589b\u4a41\u09aa\uac81\ud988\ue38c\u4018\u9be8\u1ea1\u93b7\u844c\uc613\u4530\uc46b\u4b67\ub66c\uc8b2\uf568\udcfa\u898d\u1ce5\uab16\u8cf5\u5a44\ub933\ueeca\u4afa\ude55\ud9b8\ufc43\u01ab\u2812\u3347") }), 566474721, new Object[] { j.x(752268520, new Object[] { j.Y(this, 1793570006), s }) }), 566474721, new Object[] { JDBC3Connection$JDBC3PreparedStatement.N("\uf02c\ue790") }), 705148898, null) });
                if (j.g(g2, 1531033760, null)) {
                    final Object g3 = j.g(j.Y(this, -664815427), -1198278595, new Object[] { j.g(g2, 791918754, new Object[] { 1 }) });
                    while (j.g(g3, 252426302, null)) {
                        (boolean)j.g(h, 1881192628, new Object[] { j.g(g3, 1774762063, new Object[] { 1 }) });
                    }
                }
                try {
                    if (g2 != null) {
                        j.g(g2, 1907931320, null);
                    }
                }
                catch (SQLException ex) {}
                try {
                    if (g != null) {
                        j.g(g, 1289599161, null);
                    }
                }
                catch (SQLException ex2) {}
            }
            finally {
                try {
                    if (g2 != null) {
                        j.g(g2, 1907931320, null);
                    }
                }
                catch (SQLException ex3) {}
                try {
                    if (g != null) {
                        j.g(g, 1289599161, null);
                    }
                }
                catch (SQLException ex4) {}
                throw;
            }
            j.x(1897641193, new Object[] { h });
            return (List<String>)h;
        }
        
        public String getFkTableName() {
            return (String)j.Y(this, -602360625);
        }
        
        public List<ForeignKey> getFkList() {
            return (List<ForeignKey>)j.Y(this, 1744156862);
        }
        
        class ForeignKey
        {
            private String fkName;
            private String pkTableName;
            private String fkTableName;
            private List<String> fkColNames;
            private List<String> pkColNames;
            private String onUpdate;
            private String onDelete;
            private String match;
            
            ForeignKey(final String s, final String s2, final String s3, final String s4, final String s5, final String s6) {
                j.i(this, 344111260, j.H(457226395, null));
                j.i(this, 1566750877, j.H(457226395, null));
                j.i(this, -1284720482, s);
                j.i(this, -61949777, s2);
                j.i(this, 218347696, s3);
                j.i(this, -1030637391, s4);
                j.i(this, 1049147570, s5);
                j.i(this, 1342027955, s6);
            }
            
            public String getFkName() {
                return (String)j.Y(this, -1284720482);
            }
            
            void addColumnMapping(final String s, final String s2) {
                (boolean)j.g(j.Y(this, 344111260), 1881192628, new Object[] { s });
                (boolean)j.g(j.Y(this, 1566750877), 1881192628, new Object[] { s2 });
            }
            
            public String[] getColumnMapping(final int n) {
                return new String[] { (String)j.g(j.Y(this, 344111260), -432097099, new Object[] { n }), (String)j.g(j.Y(this, 1566750877), -432097099, new Object[] { n }) };
            }
            
            public int getColumnMappingCount() {
                return (int)j.g(j.Y(this, 344111260), 1338620086, null);
            }
            
            public String getPkTableName() {
                return (String)j.Y(this, -61949777);
            }
            
            public String getFkTableName() {
                return (String)j.Y(this, 218347696);
            }
            
            public String getOnUpdate() {
                return (String)j.Y(this, -1030637391);
            }
            
            public String getOnDelete() {
                return (String)j.Y(this, 1049147570);
            }
            
            public String getMatch() {
                return (String)j.Y(this, 1342027955);
            }
            
            @Override
            public String toString() {
                return (String)j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.g(j.H(-1931495456, null), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ud560\ubbbc\u5169\ub3c9\u2903\uf15f\u5d93\u627f\u2fe8\uc307\u3f5f\u1c7c\u94c5\u1067\u12d8\u8b03\ub567\ufc37\ub60b") }), 566474721, new Object[] { j.Y(this, -1284720482) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ud50a\ubbf3\u516b\ub3c7\u293e\uf159\u5d9f\u6258\u2fe8\uc330\u3f1e\u1c4a\u94c6\u1031") }), 566474721, new Object[] { j.Y(this, -61949777) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ud50a\ubbf3\u517d\ub3c7\u293e\uf159\u5d9f\u6258\u2fe8\uc330\u3f1e\u1c4a\u94c6\u1031") }), 566474721, new Object[] { j.Y(this, 218347696) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ud50a\ubbf3\u516b\ub3c7\u2929\uf157\u5d91\u627a\u2fec\uc313\u3f1a\u1c54\u949e") }), -944326457, new Object[] { j.Y(this, 1566750877) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ud50a\ubbf3\u517d\ub3c7\u2929\uf157\u5d91\u627a\u2fec\uc313\u3f1a\u1c54\u949e") }), -944326457, new Object[] { j.Y(this, 344111260) }), 566474721, new Object[] { JDBC3ResultSet$JDBC3Savepoint.i("\ud57b") }), 705148898, null);
            }
        }
    }
}
