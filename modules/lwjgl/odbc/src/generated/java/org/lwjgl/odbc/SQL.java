/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.odbc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SQL {

    private static final SharedLibrary ODBC = Library.loadNative(SQL.class, "org.lwjgl.odbc", Configuration.ODBC_LIBRARY_NAME, "odbc32", "odbc");

    /** Contains the function pointers loaded from the odbc {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            AllocHandle      = apiGetFunctionAddress(ODBC, "SQLAllocHandle"),
            Connect          = apiGetFunctionAddress(ODBC, "SQLConnectW"),
            DataSources      = apiGetFunctionAddressOptional(ODBC, "SQLDataSourcesW"),
            GetInfo          = apiGetFunctionAddress(ODBC, "SQLGetInfoW"),
            GetFunctions     = apiGetFunctionAddress(ODBC, "SQLGetFunctions"),
            GetTypeInfo      = apiGetFunctionAddress(ODBC, "SQLGetTypeInfoW"),
            SetConnectAttr   = apiGetFunctionAddress(ODBC, "SQLSetConnectAttrW"),
            GetConnectAttr   = apiGetFunctionAddress(ODBC, "SQLGetConnectAttrW"),
            SetEnvAttr       = apiGetFunctionAddress(ODBC, "SQLSetEnvAttr"),
            GetEnvAttr       = apiGetFunctionAddress(ODBC, "SQLGetEnvAttr"),
            SetStmtAttr      = apiGetFunctionAddress(ODBC, "SQLSetStmtAttrW"),
            GetStmtAttr      = apiGetFunctionAddress(ODBC, "SQLGetStmtAttrW"),
            GetDescField     = apiGetFunctionAddress(ODBC, "SQLGetDescFieldW"),
            GetDescRec       = apiGetFunctionAddress(ODBC, "SQLGetDescRecW"),
            SetDescField     = apiGetFunctionAddress(ODBC, "SQLSetDescFieldW"),
            SetDescRec       = apiGetFunctionAddress(ODBC, "SQLSetDescRec"),
            CopyDesc         = apiGetFunctionAddress(ODBC, "SQLCopyDesc"),
            Prepare          = apiGetFunctionAddress(ODBC, "SQLPrepareW"),
            GetCursorName    = apiGetFunctionAddress(ODBC, "SQLGetCursorNameW"),
            SetCursorName    = apiGetFunctionAddress(ODBC, "SQLSetCursorNameW"),
            Execute          = apiGetFunctionAddress(ODBC, "SQLExecute"),
            ExecDirect       = apiGetFunctionAddress(ODBC, "SQLExecDirectW"),
            ParamData        = apiGetFunctionAddress(ODBC, "SQLParamData"),
            PutData          = apiGetFunctionAddress(ODBC, "SQLPutData"),
            RowCount         = apiGetFunctionAddress(ODBC, "SQLRowCount"),
            NumResultCols    = apiGetFunctionAddress(ODBC, "SQLNumResultCols"),
            DescribeCol      = apiGetFunctionAddress(ODBC, "SQLDescribeColW"),
            ColAttribute     = apiGetFunctionAddress(ODBC, "SQLColAttributeW"),
            BindCol          = apiGetFunctionAddress(ODBC, "SQLBindCol"),
            Fetch            = apiGetFunctionAddress(ODBC, "SQLFetch"),
            FetchScroll      = apiGetFunctionAddress(ODBC, "SQLFetchScroll"),
            GetData          = apiGetFunctionAddress(ODBC, "SQLGetData"),
            GetDiagField     = apiGetFunctionAddress(ODBC, "SQLGetDiagFieldW"),
            GetDiagRec       = apiGetFunctionAddress(ODBC, "SQLGetDiagRecW"),
            FreeStmt         = apiGetFunctionAddress(ODBC, "SQLFreeStmt"),
            CloseCursor      = apiGetFunctionAddress(ODBC, "SQLCloseCursor"),
            Cancel           = apiGetFunctionAddress(ODBC, "SQLCancel"),
            CancelHandle     = apiGetFunctionAddressOptional(ODBC, "SQLCancelHandle"),
            EndTran          = apiGetFunctionAddress(ODBC, "SQLEndTran"),
            Disconnect       = apiGetFunctionAddress(ODBC, "SQLDisconnect"),
            FreeHandle       = apiGetFunctionAddress(ODBC, "SQLFreeHandle"),
            CompleteAsync    = apiGetFunctionAddressOptional(ODBC, "SQLCompleteAsync"),
            Columns          = apiGetFunctionAddress(ODBC, "SQLColumnsW"),
            SpecialColumns   = apiGetFunctionAddress(ODBC, "SQLSpecialColumnsW"),
            Statistics       = apiGetFunctionAddress(ODBC, "SQLStatisticsW"),
            Tables           = apiGetFunctionAddress(ODBC, "SQLTablesW"),
            Transact         = apiGetFunctionAddressOptional(ODBC, "SQLTransact"),
            DriverConnect    = apiGetFunctionAddress(ODBC, "SQLDriverConnectW"),
            BrowseConnect    = apiGetFunctionAddress(ODBC, "SQLBrowseConnectW"),
            BulkOperations   = apiGetFunctionAddress(ODBC, "SQLBulkOperations"),
            ColumnPrivileges = apiGetFunctionAddress(ODBC, "SQLColumnPrivilegesW"),
            DescribeParam    = apiGetFunctionAddress(ODBC, "SQLDescribeParam"),
            ExtendedFetch    = apiGetFunctionAddress(ODBC, "SQLExtendedFetch"),
            ForeignKeys      = apiGetFunctionAddress(ODBC, "SQLForeignKeysW"),
            MoreResults      = apiGetFunctionAddress(ODBC, "SQLMoreResults"),
            NativeSql        = apiGetFunctionAddress(ODBC, "SQLNativeSqlW"),
            NumParams        = apiGetFunctionAddress(ODBC, "SQLNumParams"),
            ParamOptions     = apiGetFunctionAddress(ODBC, "SQLParamOptions"),
            PrimaryKeys      = apiGetFunctionAddress(ODBC, "SQLPrimaryKeysW"),
            ProcedureColumns = apiGetFunctionAddress(ODBC, "SQLProcedureColumnsW"),
            Procedures       = apiGetFunctionAddress(ODBC, "SQLProceduresW"),
            SetPos           = apiGetFunctionAddress(ODBC, "SQLSetPos"),
            TablePrivileges  = apiGetFunctionAddress(ODBC, "SQLTablePrivilegesW"),
            Drivers          = apiGetFunctionAddressOptional(ODBC, "SQLDriversW"),
            BindParameter    = apiGetFunctionAddress(ODBC, "SQLBindParameter"),
            AllocHandleStd   = apiGetFunctionAddressOptional(ODBC, "SQLAllocHandleStd");

    }

    /** Returns the odbc {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return ODBC;
    }

    public static final short
        SQL_NULL_DATA    = -1,
        SQL_DATA_AT_EXEC = -2;

    public static final short
        SQL_INVALID_HANDLE       = -2,
        SQL_ERROR                = -1,
        SQL_SUCCESS              = 0,
        SQL_SUCCESS_WITH_INFO    = 1,
        SQL_STILL_EXECUTING      = 2,
        SQL_NEED_DATA            = 99,
        SQL_NO_DATA              = 100,
        SQL_NO_DATA_FOUND        = SQL_NO_DATA,
        SQL_PARAM_DATA_AVAILABLE = 101;

    public static final short SQL_NTS = -3;

    public static final int SQL_MAX_MESSAGE_LENGTH = 512;

    public static final short
        SQL_DATE_LEN      = 10,
        SQL_TIME_LEN      = 8,
        SQL_TIMESTAMP_LEN = 19;

    public static final short
        SQL_HANDLE_ENV  = 1,
        SQL_HANDLE_DBC  = 2,
        SQL_HANDLE_STMT = 3,
        SQL_HANDLE_DESC = 4,
        SQL_HANDLE_SENV = 5;

    public static final int
        SQL_ATTR_OUTPUT_NTS         = 10001,
        SQL_ATTR_ODBC_VERSION       = 200,
        SQL_ATTR_CONNECTION_POOLING = 201,
        SQL_ATTR_CP_MATCH           = 202;

    public static final int
        SQL_ATTR_AUTO_IPD                   = 10001,
        SQL_ATTR_METADATA_ID                = 10014,
        SQL_ATTR_ACCESS_MODE                = 101,
        SQL_ATTR_AUTOCOMMIT                 = 102,
        SQL_ATTR_CONNECTION_TIMEOUT         = 113,
        SQL_ATTR_CURRENT_CATALOG            = 109,
        SQL_ATTR_DISCONNECT_BEHAVIOR        = 114,
        SQL_ATTR_ENLIST_IN_DTC              = 1207,
        SQL_ATTR_ENLIST_IN_XA               = 1208,
        SQL_ATTR_LOGIN_TIMEOUT              = 103,
        SQL_ATTR_ODBC_CURSORS               = 110,
        SQL_ATTR_PACKET_SIZE                = 112,
        SQL_ATTR_QUIET_MODE                 = 111,
        SQL_ATTR_TRACE                      = 104,
        SQL_ATTR_TRACEFILE                  = 105,
        SQL_ATTR_TRANSLATE_LIB              = 106,
        SQL_ATTR_TRANSLATE_OPTION           = 107,
        SQL_ATTR_TXN_ISOLATION              = 108,
        SQL_ATTR_CONNECTION_DEAD            = 1209,
        SQL_ATTR_ANSI_APP                   = 115,
        SQL_ATTR_RESET_CONNECTION           = 116,
        SQL_ATTR_ASYNC_DBC_FUNCTIONS_ENABLE = 117,
        SQL_ATTR_ASYNC_DBC_EVENT            = 119;

    public static final int
        SQL_ATTR_APP_ROW_DESC          = 10010,
        SQL_ATTR_APP_PARAM_DESC        = 10011,
        SQL_ATTR_IMP_ROW_DESC          = 10012,
        SQL_ATTR_IMP_PARAM_DESC        = 10013,
        SQL_ATTR_CURSOR_SCROLLABLE     = -1,
        SQL_ATTR_CURSOR_SENSITIVITY    = -2,
        SQL_ATTR_ASYNC_ENABLE          = 4,
        SQL_ATTR_CONCURRENCY           = 7,
        SQL_ATTR_CURSOR_TYPE           = 6,
        SQL_ATTR_ENABLE_AUTO_IPD       = 15,
        SQL_ATTR_FETCH_BOOKMARK_PTR    = 16,
        SQL_ATTR_KEYSET_SIZE           = 8,
        SQL_ATTR_MAX_LENGTH            = 3,
        SQL_ATTR_MAX_ROWS              = 1,
        SQL_ATTR_NOSCAN                = 2,
        SQL_ATTR_PARAM_BIND_OFFSET_PTR = 17,
        SQL_ATTR_PARAM_BIND_TYPE       = 18,
        SQL_ATTR_PARAM_OPERATION_PTR   = 19,
        SQL_ATTR_PARAM_STATUS_PTR      = 20,
        SQL_ATTR_PARAMS_PROCESSED_PTR  = 21,
        SQL_ATTR_PARAMSET_SIZE         = 22,
        SQL_ATTR_QUERY_TIMEOUT         = 0,
        SQL_ATTR_RETRIEVE_DATA         = 11,
        SQL_ATTR_ROW_BIND_OFFSET_PTR   = 23,
        SQL_ATTR_ROW_BIND_TYPE         = 5,
        SQL_ATTR_ROW_NUMBER            = 14,
        SQL_ATTR_ROW_OPERATION_PTR     = 24,
        SQL_ATTR_ROW_STATUS_PTR        = 25,
        SQL_ATTR_ROWS_FETCHED_PTR      = 26,
        SQL_ATTR_ROW_ARRAY_SIZE        = 27,
        SQL_ATTR_SIMULATE_CURSOR       = 10,
        SQL_ATTR_USE_BOOKMARKS         = 12,
        SQL_ATTR_ASYNC_STMT_EVENT      = 29;

    public static final int
        SQL_NONSCROLLABLE = 0,
        SQL_SCROLLABLE    = 1;

    public static final short
        SQL_DESC_COUNT                  = 1001,
        SQL_DESC_TYPE                   = 1002,
        SQL_DESC_LENGTH                 = 1003,
        SQL_DESC_OCTET_LENGTH_PTR       = 1004,
        SQL_DESC_PRECISION              = 1005,
        SQL_DESC_SCALE                  = 1006,
        SQL_DESC_DATETIME_INTERVAL_CODE = 1007,
        SQL_DESC_NULLABLE               = 1008,
        SQL_DESC_INDICATOR_PTR          = 1009,
        SQL_DESC_DATA_PTR               = 1010,
        SQL_DESC_NAME                   = 1011,
        SQL_DESC_UNNAMED                = 1012,
        SQL_DESC_OCTET_LENGTH           = 1013,
        SQL_DESC_ALLOC_TYPE             = 1099;

    public static final short
        SQL_DIAG_RETURNCODE            = 1,
        SQL_DIAG_NUMBER                = 2,
        SQL_DIAG_ROW_COUNT             = 3,
        SQL_DIAG_SQLSTATE              = 4,
        SQL_DIAG_NATIVE                = 5,
        SQL_DIAG_MESSAGE_TEXT          = 6,
        SQL_DIAG_DYNAMIC_FUNCTION      = 7,
        SQL_DIAG_CLASS_ORIGIN          = 8,
        SQL_DIAG_SUBCLASS_ORIGIN       = 9,
        SQL_DIAG_CONNECTION_NAME       = 10,
        SQL_DIAG_SERVER_NAME           = 11,
        SQL_DIAG_DYNAMIC_FUNCTION_CODE = 12;

    public static final short
        SQL_DIAG_ALTER_DOMAIN          = 3,
        SQL_DIAG_ALTER_TABLE           = 4,
        SQL_DIAG_CALL                  = 7,
        SQL_DIAG_CREATE_ASSERTION      = 6,
        SQL_DIAG_CREATE_CHARACTER_SET  = 8,
        SQL_DIAG_CREATE_COLLATION      = 10,
        SQL_DIAG_CREATE_DOMAIN         = 23,
        SQL_DIAG_CREATE_INDEX          = -1,
        SQL_DIAG_CREATE_SCHEMA         = 64,
        SQL_DIAG_CREATE_TABLE          = 77,
        SQL_DIAG_CREATE_TRANSLATION    = 79,
        SQL_DIAG_CREATE_VIEW           = 84,
        SQL_DIAG_DELETE_WHERE          = 19,
        SQL_DIAG_DROP_ASSERTION        = 24,
        SQL_DIAG_DROP_CHARACTER_SET    = 25,
        SQL_DIAG_DROP_COLLATION        = 26,
        SQL_DIAG_DROP_DOMAIN           = 27,
        SQL_DIAG_DROP_INDEX            = -2,
        SQL_DIAG_DROP_SCHEMA           = 31,
        SQL_DIAG_DROP_TABLE            = 32,
        SQL_DIAG_DROP_TRANSLATION      = 33,
        SQL_DIAG_DROP_VIEW             = 36,
        SQL_DIAG_DYNAMIC_DELETE_CURSOR = 38,
        SQL_DIAG_DYNAMIC_UPDATE_CURSOR = 81,
        SQL_DIAG_GRANT                 = 48,
        SQL_DIAG_INSERT                = 50,
        SQL_DIAG_REVOKE                = 59,
        SQL_DIAG_SELECT_CURSOR         = 85,
        SQL_DIAG_UNKNOWN_STATEMENT     = 0,
        SQL_DIAG_UPDATE_WHERE          = 82;

    public static final short
        SQL_UNKNOWN_TYPE = 0,
        SQL_CHAR         = 1,
        SQL_NUMERIC      = 2,
        SQL_DECIMAL      = 3,
        SQL_INTEGER      = 4,
        SQL_SMALLINT     = 5,
        SQL_FLOAT        = 6,
        SQL_REAL         = 7,
        SQL_DOUBLE       = 8,
        SQL_DATETIME     = 9,
        SQL_VARCHAR      = 12;

    public static final short
        SQL_UNSPECIFIED = 0,
        SQL_INSENSITIVE = 1,
        SQL_SENSITIVE   = 2;

    public static final short
        SQL_TYPE_DATE      = 91,
        SQL_TYPE_TIME      = 92,
        SQL_TYPE_TIMESTAMP = 93;

    public static final short SQL_ALL_TYPES = 0;

    public static final short SQL_DEFAULT = 99;

    public static final short
        SQL_ARD_TYPE = -99,
        SQL_APD_TYPE = -100;

    public static final short
        SQL_CODE_DATE      = 1,
        SQL_CODE_TIME      = 2,
        SQL_CODE_TIMESTAMP = 3;

    public static final short
        SQL_FALSE = 0,
        SQL_TRUE  = 1;

    public static final short
        SQL_NO_NULLS = 0,
        SQL_NULLABLE = 1;

    public static final short SQL_NULLABLE_UNKNOWN = 2;

    public static final short
        SQL_PRED_NONE  = 0,
        SQL_PRED_CHAR  = 1,
        SQL_PRED_BASIC = 2;

    public static final short
        SQL_NAMED   = 0,
        SQL_UNNAMED = 1;

    public static final short
        SQL_DESC_ALLOC_AUTO = 1,
        SQL_DESC_ALLOC_USER = 2;

    public static final short
        SQL_CLOSE        = 0,
        SQL_DROP         = 1,
        SQL_UNBIND       = 2,
        SQL_RESET_PARAMS = 3;

    public static final short
        SQL_FETCH_NEXT  = 1,
        SQL_FETCH_FIRST = 2;

    public static final short
        SQL_FETCH_LAST     = 3,
        SQL_FETCH_PRIOR    = 4,
        SQL_FETCH_ABSOLUTE = 5,
        SQL_FETCH_RELATIVE = 6;

    public static final short
        SQL_COMMIT   = 0,
        SQL_ROLLBACK = 1;

    public static final long
        SQL_NULL_HENV   = 0x0L,
        SQL_NULL_HDBC   = 0x0L,
        SQL_NULL_HSTMT  = 0x0L,
        SQL_NULL_HDESC  = 0x0L,
        SQL_NULL_HANDLE = 0x0L;

    public static final short
        SQL_SCOPE_CURROW      = 0,
        SQL_SCOPE_TRANSACTION = 1,
        SQL_SCOPE_SESSION     = 2,
        SQL_PC_UNKNOWN        = 0,
        SQL_PC_NON_PSEUDO     = 1,
        SQL_PC_PSEUDO         = 2;

    public static final short SQL_ROW_IDENTIFIER = 1;

    public static final short
        SQL_INDEX_UNIQUE = 0,
        SQL_INDEX_ALL    = 1;

    public static final short
        SQL_INDEX_CLUSTERED = 1,
        SQL_INDEX_HASHED    = 2,
        SQL_INDEX_OTHER     = 3;

    public static final int
        SQL_API_SQLALLOCCONNECT     = 1,
        SQL_API_SQLALLOCENV         = 2,
        SQL_API_SQLALLOCHANDLE      = 1001,
        SQL_API_SQLALLOCSTMT        = 3,
        SQL_API_SQLBINDCOL          = 4,
        SQL_API_SQLBINDPARAM        = 1002,
        SQL_API_SQLCANCEL           = 5,
        SQL_API_SQLCLOSECURSOR      = 1003,
        SQL_API_SQLCOLATTRIBUTE     = 6,
        SQL_API_SQLCOLUMNS          = 40,
        SQL_API_SQLCONNECT          = 7,
        SQL_API_SQLCOPYDESC         = 1004,
        SQL_API_SQLDATASOURCES      = 57,
        SQL_API_SQLDESCRIBECOL      = 8,
        SQL_API_SQLDISCONNECT       = 9,
        SQL_API_SQLENDTRAN          = 1005,
        SQL_API_SQLERROR            = 10,
        SQL_API_SQLEXECDIRECT       = 11,
        SQL_API_SQLEXECUTE          = 12,
        SQL_API_SQLFETCH            = 13,
        SQL_API_SQLFETCHSCROLL      = 1021,
        SQL_API_SQLFREECONNECT      = 14,
        SQL_API_SQLFREEENV          = 15,
        SQL_API_SQLFREEHANDLE       = 1006,
        SQL_API_SQLFREESTMT         = 16,
        SQL_API_SQLGETCONNECTATTR   = 1007,
        SQL_API_SQLGETCONNECTOPTION = 42,
        SQL_API_SQLGETCURSORNAME    = 17,
        SQL_API_SQLGETDATA          = 43,
        SQL_API_SQLGETDESCFIELD     = 1008,
        SQL_API_SQLGETDESCREC       = 1009,
        SQL_API_SQLGETDIAGFIELD     = 1010,
        SQL_API_SQLGETDIAGREC       = 1011,
        SQL_API_SQLGETENVATTR       = 1012,
        SQL_API_SQLGETFUNCTIONS     = 44,
        SQL_API_SQLGETINFO          = 45,
        SQL_API_SQLGETSTMTATTR      = 1014,
        SQL_API_SQLGETSTMTOPTION    = 46,
        SQL_API_SQLGETTYPEINFO      = 47,
        SQL_API_SQLNUMRESULTCOLS    = 18,
        SQL_API_SQLPARAMDATA        = 48,
        SQL_API_SQLPREPARE          = 19,
        SQL_API_SQLPUTDATA          = 49,
        SQL_API_SQLROWCOUNT         = 20,
        SQL_API_SQLSETCONNECTATTR   = 1016,
        SQL_API_SQLSETCONNECTOPTION = 50,
        SQL_API_SQLSETCURSORNAME    = 21,
        SQL_API_SQLSETDESCFIELD     = 1017,
        SQL_API_SQLSETDESCREC       = 1018,
        SQL_API_SQLSETENVATTR       = 1019,
        SQL_API_SQLSETPARAM         = 22,
        SQL_API_SQLSETSTMTATTR      = 1020,
        SQL_API_SQLSETSTMTOPTION    = 51,
        SQL_API_SQLSPECIALCOLUMNS   = 52,
        SQL_API_SQLSTATISTICS       = 53,
        SQL_API_SQLTABLES           = 54,
        SQL_API_SQLTRANSACT         = 23,
        SQL_API_SQLCANCELHANDLE     = 1550,
        SQL_API_SQLCOMPLETEASYNC    = 1551,
        SQL_API_SQLALLOCHANDLESTD   = 73,
        SQL_API_SQLBULKOPERATIONS   = 24,
        SQL_API_SQLBINDPARAMETER    = 72,
        SQL_API_SQLBROWSECONNECT    = 55,
        SQL_API_SQLCOLATTRIBUTES    = 6,
        SQL_API_SQLCOLUMNPRIVILEGES = 56,
        SQL_API_SQLDESCRIBEPARAM    = 58,
        SQL_API_SQLDRIVERCONNECT    = 41,
        SQL_API_SQLDRIVERS          = 71,
        SQL_API_SQLEXTENDEDFETCH    = 59,
        SQL_API_SQLFOREIGNKEYS      = 60,
        SQL_API_SQLMORERESULTS      = 61,
        SQL_API_SQLNATIVESQL        = 62,
        SQL_API_SQLNUMPARAMS        = 63,
        SQL_API_SQLPARAMOPTIONS     = 64,
        SQL_API_SQLPRIMARYKEYS      = 65,
        SQL_API_SQLPROCEDURECOLUMNS = 66,
        SQL_API_SQLPROCEDURES       = 67,
        SQL_API_SQLSETPOS           = 68,
        SQL_API_SQLSETSCROLLOPTIONS = 69,
        SQL_API_SQLTABLEPRIVILEGES  = 70;

    public static final int
        SQL_API_ODBC3_ALL_FUNCTIONS      = 0x3E7,
        SQL_API_ODBC3_ALL_FUNCTIONS_SIZE = 250;

    public static final int
        SQL_MAX_DRIVER_CONNECTIONS        = 0,
        SQL_MAXIMUM_DRIVER_CONNECTIONS    = SQL_MAX_DRIVER_CONNECTIONS,
        SQL_MAX_CONCURRENT_ACTIVITIES     = 1,
        SQL_MAXIMUM_CONCURRENT_ACTIVITIES = SQL_MAX_CONCURRENT_ACTIVITIES,
        SQL_DATA_SOURCE_NAME              = 2,
        SQL_FETCH_DIRECTION               = 8,
        SQL_SERVER_NAME                   = 13,
        SQL_SEARCH_PATTERN_ESCAPE         = 14,
        SQL_DBMS_NAME                     = 17,
        SQL_DBMS_VER                      = 18,
        SQL_ACCESSIBLE_TABLES             = 19,
        SQL_ACCESSIBLE_PROCEDURES         = 20,
        SQL_CURSOR_COMMIT_BEHAVIOR        = 23,
        SQL_DATA_SOURCE_READ_ONLY         = 25,
        SQL_DEFAULT_TXN_ISOLATION         = 26,
        SQL_IDENTIFIER_CASE               = 28,
        SQL_IDENTIFIER_QUOTE_CHAR         = 29,
        SQL_MAX_COLUMN_NAME_LEN           = 30,
        SQL_MAXIMUM_COLUMN_NAME_LENGTH    = SQL_MAX_COLUMN_NAME_LEN,
        SQL_MAX_CURSOR_NAME_LEN           = 31,
        SQL_MAXIMUM_CURSOR_NAME_LENGTH    = SQL_MAX_CURSOR_NAME_LEN,
        SQL_MAX_SCHEMA_NAME_LEN           = 32,
        SQL_MAXIMUM_SCHEMA_NAME_LENGTH    = SQL_MAX_SCHEMA_NAME_LEN,
        SQL_MAX_CATALOG_NAME_LEN          = 34,
        SQL_MAXIMUM_CATALOG_NAME_LENGTH   = SQL_MAX_CATALOG_NAME_LEN,
        SQL_MAX_TABLE_NAME_LEN            = 35,
        SQL_SCROLL_CONCURRENCY            = 43,
        SQL_TXN_CAPABLE                   = 46,
        SQL_TRANSACTION_CAPABLE           = SQL_TXN_CAPABLE,
        SQL_USER_NAME                     = 47,
        SQL_TXN_ISOLATION_OPTION          = 72,
        SQL_TRANSACTION_ISOLATION_OPTION  = SQL_TXN_ISOLATION_OPTION,
        SQL_INTEGRITY                     = 73,
        SQL_GETDATA_EXTENSIONS            = 81,
        SQL_NULL_COLLATION                = 85,
        SQL_ALTER_TABLE                   = 86,
        SQL_ORDER_BY_COLUMNS_IN_SELECT    = 90,
        SQL_SPECIAL_CHARACTERS            = 94,
        SQL_MAX_COLUMNS_IN_GROUP_BY       = 97,
        SQL_MAXIMUM_COLUMNS_IN_GROUP_BY   = SQL_MAX_COLUMNS_IN_GROUP_BY,
        SQL_MAX_COLUMNS_IN_INDEX          = 98,
        SQL_MAXIMUM_COLUMNS_IN_INDEX      = SQL_MAX_COLUMNS_IN_INDEX,
        SQL_MAX_COLUMNS_IN_ORDER_BY       = 99,
        SQL_MAXIMUM_COLUMNS_IN_ORDER_BY   = SQL_MAX_COLUMNS_IN_ORDER_BY,
        SQL_MAX_COLUMNS_IN_SELECT         = 100,
        SQL_MAXIMUM_COLUMNS_IN_SELECT     = SQL_MAX_COLUMNS_IN_SELECT,
        SQL_MAX_COLUMNS_IN_TABLE          = 101,
        SQL_MAX_INDEX_SIZE                = 102,
        SQL_MAXIMUM_INDEX_SIZE            = SQL_MAX_INDEX_SIZE,
        SQL_MAX_ROW_SIZE                  = 104,
        SQL_MAXIMUM_ROW_SIZE              = SQL_MAX_ROW_SIZE,
        SQL_MAX_STATEMENT_LEN             = 105,
        SQL_MAXIMUM_STATEMENT_LENGTH      = SQL_MAX_STATEMENT_LEN,
        SQL_MAX_TABLES_IN_SELECT          = 106,
        SQL_MAXIMUM_TABLES_IN_SELECT      = SQL_MAX_TABLES_IN_SELECT,
        SQL_MAX_USER_NAME_LEN             = 107,
        SQL_MAXIMUM_USER_NAME_LENGTH      = SQL_MAX_USER_NAME_LEN,
        SQL_OJ_CAPABILITIES               = 115,
        SQL_OUTER_JOIN_CAPABILITIES       = SQL_OJ_CAPABILITIES,
        SQL_XOPEN_CLI_YEAR                = 10000,
        SQL_CURSOR_SENSITIVITY            = 10001,
        SQL_DESCRIBE_PARAMETER            = 10002,
        SQL_CATALOG_NAME                  = 10003,
        SQL_COLLATION_SEQ                 = 10004,
        SQL_MAX_IDENTIFIER_LEN            = 10005,
        SQL_MAXIMUM_IDENTIFIER_LENGTH     = SQL_MAX_IDENTIFIER_LEN;

    public static final int
        SQL_AT_ADD_COLUMN                     = 0x1,
        SQL_AT_DROP_COLUMN                    = 0x2,
        SQL_AT_ADD_CONSTRAINT                 = 0x8,
        SQL_AT_ADD_COLUMN_SINGLE              = 0x20,
        SQL_AT_ADD_COLUMN_DEFAULT             = 0x40,
        SQL_AT_ADD_COLUMN_COLLATION           = 0x80,
        SQL_AT_SET_COLUMN_DEFAULT             = 0x100,
        SQL_AT_DROP_COLUMN_DEFAULT            = 0x200,
        SQL_AT_DROP_COLUMN_CASCADE            = 0x400,
        SQL_AT_DROP_COLUMN_RESTRICT           = 0x800,
        SQL_AT_ADD_TABLE_CONSTRAINT           = 0x1000,
        SQL_AT_DROP_TABLE_CONSTRAINT_CASCADE  = 0x2000,
        SQL_AT_DROP_TABLE_CONSTRAINT_RESTRICT = 0x4000,
        SQL_AT_CONSTRAINT_NAME_DEFINITION     = 0x8000,
        SQL_AT_CONSTRAINT_INITIALLY_DEFERRED  = 0x10000,
        SQL_AT_CONSTRAINT_INITIALLY_IMMEDIATE = 0x20000,
        SQL_AT_CONSTRAINT_DEFERRABLE          = 0x40000,
        SQL_AT_CONSTRAINT_NON_DEFERRABLE      = 0x80000;

    public static final short
        SQL_CB_DELETE   = 0,
        SQL_CB_CLOSE    = 1,
        SQL_CB_PRESERVE = 2;

    public static final int
        SQL_FD_FETCH_NEXT     = 0x1,
        SQL_FD_FETCH_FIRST    = 0x2,
        SQL_FD_FETCH_LAST     = 0x4,
        SQL_FD_FETCH_PRIOR    = 0x8,
        SQL_FD_FETCH_ABSOLUTE = 0x10,
        SQL_FD_FETCH_RELATIVE = 0x20;

    public static final int
        SQL_GD_ANY_COLUMN = 0x1,
        SQL_GD_ANY_ORDER  = 0x2;

    public static final short
        SQL_IC_UPPER     = 1,
        SQL_IC_LOWER     = 2,
        SQL_IC_SENSITIVE = 3,
        SQL_IC_MIXED     = 4;

    public static final int
        SQL_OJ_LEFT               = 0x1,
        SQL_OJ_RIGHT              = 0x2,
        SQL_OJ_FULL               = 0x4,
        SQL_OJ_NESTED             = 0x8,
        SQL_OJ_NOT_ORDERED        = 0x10,
        SQL_OJ_INNER              = 0x20,
        SQL_OJ_ALL_COMPARISON_OPS = 0x40;

    public static final int
        SQL_SCCO_READ_ONLY  = 0x1,
        SQL_SCCO_LOCK       = 0x2,
        SQL_SCCO_OPT_ROWVER = 0x4,
        SQL_SCCO_OPT_VALUES = 0x8;

    public static final short
        SQL_TC_NONE       = 0,
        SQL_TC_DML        = 1,
        SQL_TC_ALL        = 2,
        SQL_TC_DDL_COMMIT = 3,
        SQL_TC_DDL_IGNORE = 4;

    public static final int
        SQL_TRANSACTION_READ_UNCOMMITTED = 0x1,
        SQL_TRANSACTION_READ_COMMITTED   = 0x2,
        SQL_TRANSACTION_REPEATABLE_READ  = 0x4,
        SQL_TRANSACTION_SERIALIZABLE     = 0x8;

    public static final short
        SQL_NC_HIGH = 0,
        SQL_NC_LOW  = 1;

    public static final short
        SQL_SPEC_MAJOR               = 3,
        SQL_SPEC_MINOR               = 80,
        SQL_SQLSTATE_SIZE            = 5,
        SQL_MAX_DSN_LENGTH           = 32,
        SQL_MAX_OPTION_STRING_LENGTH = 256;

    public static final short
        SQL_CP_OFF            = 0,
        SQL_CP_ONE_PER_DRIVER = 1,
        SQL_CP_ONE_PER_HENV   = 2,
        SQL_CP_DRIVER_AWARE   = 3,
        SQL_CP_DEFAULT        = SQL_CP_OFF;

    public static final short
        SQL_CP_STRICT_MATCH  = 0,
        SQL_CP_RELAXED_MATCH = 1,
        SQL_CP_MATCH_DEFAULT = SQL_CP_STRICT_MATCH;

    public static final short
        SQL_OV_ODBC2    = 2,
        SQL_OV_ODBC3    = 3,
        SQL_OV_ODBC3_80 = 380;

    public static final short
        SQL_MODE_READ_WRITE = 0,
        SQL_MODE_READ_ONLY  = 1,
        SQL_MODE_DEFAULT    = SQL_MODE_READ_WRITE;

    public static final short
        SQL_AUTOCOMMIT_OFF     = 0,
        SQL_AUTOCOMMIT_ON      = 1,
        SQL_AUTOCOMMIT_DEFAULT = SQL_AUTOCOMMIT_ON;

    public static final short SQL_LOGIN_TIMEOUT_DEFAULT = 15;

    public static final short
        SQL_OPT_TRACE_OFF     = 0,
        SQL_OPT_TRACE_ON      = 1,
        SQL_OPT_TRACE_DEFAULT = SQL_OPT_TRACE_OFF;

    public static final String SQL_OPT_TRACE_FILE_DEFAULT = "\\SQL.LOG";

    public static final long
        SQL_CUR_USE_IF_NEEDED = 0x0L,
        SQL_CUR_USE_ODBC      = 0x1L,
        SQL_CUR_USE_DRIVER    = 0x2L,
        SQL_CUR_DEFAULT       = SQL_CUR_USE_DRIVER;

    public static final short
        SQL_DB_RETURN_TO_POOL = 0,
        SQL_DB_DISCONNECT     = 1,
        SQL_DB_DEFAULT        = SQL_DB_RETURN_TO_POOL;

    public static final short SQL_DTC_DONE = 0;

    public static final short
        SQL_CD_TRUE  = 1,
        SQL_CD_FALSE = 0;

    public static final short
        SQL_AA_TRUE  = 1,
        SQL_AA_FALSE = 0;

    public static final short SQL_RESET_CONNECTION_YES = 1;

    public static final short
        SQL_ASYNC_DBC_ENABLE_ON      = 1,
        SQL_ASYNC_DBC_ENABLE_OFF     = 0,
        SQL_ASYNC_DBC_ENABLE_DEFAULT = SQL_ASYNC_DBC_ENABLE_OFF;

    public static final int
        SQL_IS_POINTER   = -4,
        SQL_IS_UINTEGER  = -5,
        SQL_IS_INTEGER   = -6,
        SQL_IS_USMALLINT = -7,
        SQL_IS_SMALLINT  = -7;

    public static final short
        SQL_PARAM_BIND_BY_COLUMN    = 0,
        SQL_PARAM_BIND_TYPE_DEFAULT = SQL_PARAM_BIND_BY_COLUMN;

    public static final short SQL_QUERY_TIMEOUT_DEFAULT = 0;

    public static final short SQL_MAX_ROWS_DEFAULT = 0;

    public static final short
        SQL_NOSCAN_OFF     = 0,
        SQL_NOSCAN_ON      = 1,
        SQL_NOSCAN_DEFAULT = SQL_NOSCAN_OFF;

    public static final short SQL_MAX_LENGTH_DEFAULT = 0;

    public static final short
        SQL_ASYNC_ENABLE_OFF     = 0,
        SQL_ASYNC_ENABLE_ON      = 1,
        SQL_ASYNC_ENABLE_DEFAULT = SQL_ASYNC_ENABLE_OFF;

    public static final short
        SQL_BIND_BY_COLUMN    = 0,
        SQL_BIND_TYPE_DEFAULT = SQL_BIND_BY_COLUMN;

    public static final short
        SQL_CONCUR_READ_ONLY = 1,
        SQL_CONCUR_LOCK      = 2,
        SQL_CONCUR_ROWVER    = 3,
        SQL_CONCUR_VALUES    = 4,
        SQL_CONCUR_DEFAULT   = SQL_CONCUR_READ_ONLY;

    public static final short
        SQL_CURSOR_FORWARD_ONLY  = 0,
        SQL_CURSOR_KEYSET_DRIVEN = 1,
        SQL_CURSOR_DYNAMIC       = 2,
        SQL_CURSOR_STATIC        = 3,
        SQL_CURSOR_TYPE_DEFAULT  = SQL_CURSOR_FORWARD_ONLY;

    public static final short SQL_KEYSET_SIZE_DEFAULT = 0;

    public static final short
        SQL_SC_NON_UNIQUE = 0,
        SQL_SC_TRY_UNIQUE = 1,
        SQL_SC_UNIQUE     = 2;

    public static final short
        SQL_RD_OFF     = 0,
        SQL_RD_ON      = 1,
        SQL_RD_DEFAULT = SQL_RD_ON;

    public static final short
        SQL_UB_OFF      = 0,
        SQL_UB_ON       = 1,
        SQL_UB_FIXED    = SQL_UB_ON,
        SQL_UB_VARIABLE = 2,
        SQL_UB_DEFAULT  = SQL_UB_OFF;

    public static final short
        SQL_COLUMN_COUNT          = 0,
        SQL_COLUMN_NAME           = 1,
        SQL_COLUMN_TYPE           = 2,
        SQL_COLUMN_LENGTH         = 3,
        SQL_COLUMN_PRECISION      = 4,
        SQL_COLUMN_SCALE          = 5,
        SQL_COLUMN_DISPLAY_SIZE   = 6,
        SQL_COLUMN_NULLABLE       = 7,
        SQL_COLUMN_UNSIGNED       = 8,
        SQL_COLUMN_MONEY          = 9,
        SQL_COLUMN_UPDATABLE      = 10,
        SQL_COLUMN_AUTO_INCREMENT = 11,
        SQL_COLUMN_CASE_SENSITIVE = 12,
        SQL_COLUMN_SEARCHABLE     = 13,
        SQL_COLUMN_TYPE_NAME      = 14,
        SQL_COLUMN_TABLE_NAME     = 15,
        SQL_COLUMN_OWNER_NAME     = 16,
        SQL_COLUMN_QUALIFIER_NAME = 17,
        SQL_COLUMN_LABEL          = 18,
        SQL_COLATT_OPT_MAX        = SQL_COLUMN_LABEL,
        SQL_COLATT_OPT_MIN        = SQL_COLUMN_COUNT;

    public static final short
        SQL_DESC_ARRAY_SIZE                  = 20,
        SQL_DESC_ARRAY_STATUS_PTR            = 21,
        SQL_DESC_AUTO_UNIQUE_VALUE           = SQL_COLUMN_AUTO_INCREMENT,
        SQL_DESC_BASE_COLUMN_NAME            = 22,
        SQL_DESC_BASE_TABLE_NAME             = 23,
        SQL_DESC_BIND_OFFSET_PTR             = 24,
        SQL_DESC_BIND_TYPE                   = 25,
        SQL_DESC_CASE_SENSITIVE              = SQL_COLUMN_CASE_SENSITIVE,
        SQL_DESC_CATALOG_NAME                = SQL_COLUMN_QUALIFIER_NAME,
        SQL_DESC_CONCISE_TYPE                = SQL_COLUMN_TYPE,
        SQL_DESC_DATETIME_INTERVAL_PRECISION = 26,
        SQL_DESC_DISPLAY_SIZE                = SQL_COLUMN_DISPLAY_SIZE,
        SQL_DESC_FIXED_PREC_SCALE            = SQL_COLUMN_MONEY,
        SQL_DESC_LABEL                       = SQL_COLUMN_LABEL,
        SQL_DESC_LITERAL_PREFIX              = 27,
        SQL_DESC_LITERAL_SUFFIX              = 28,
        SQL_DESC_LOCAL_TYPE_NAME             = 29,
        SQL_DESC_MAXIMUM_SCALE               = 30,
        SQL_DESC_MINIMUM_SCALE               = 31,
        SQL_DESC_NUM_PREC_RADIX              = 32,
        SQL_DESC_PARAMETER_TYPE              = 33,
        SQL_DESC_ROWS_PROCESSED_PTR          = 34,
        SQL_DESC_ROWVER                      = 35,
        SQL_DESC_SCHEMA_NAME                 = SQL_COLUMN_OWNER_NAME,
        SQL_DESC_SEARCHABLE                  = SQL_COLUMN_SEARCHABLE,
        SQL_DESC_TYPE_NAME                   = SQL_COLUMN_TYPE_NAME,
        SQL_DESC_TABLE_NAME                  = SQL_COLUMN_TABLE_NAME,
        SQL_DESC_UNSIGNED                    = SQL_COLUMN_UNSIGNED,
        SQL_DESC_UPDATABLE                   = SQL_COLUMN_UPDATABLE;

    public static final short
        SQL_DIAG_CURSOR_ROW_COUNT = -1249,
        SQL_DIAG_ROW_NUMBER       = -1248,
        SQL_DIAG_COLUMN_NUMBER    = -1247;

    public static final short
        SQL_DATE          = 9,
        SQL_INTERVAL      = 10,
        SQL_TIME          = 10,
        SQL_TIMESTAMP     = 11,
        SQL_LONGVARCHAR   = -1,
        SQL_BINARY        = -2,
        SQL_VARBINARY     = -3,
        SQL_LONGVARBINARY = -4,
        SQL_BIGINT        = -5,
        SQL_TINYINT       = -6,
        SQL_BIT           = -7,
        SQL_GUID          = -11;

    public static final short
        SQL_CODE_YEAR                 = 1,
        SQL_CODE_MONTH                = 2,
        SQL_CODE_DAY                  = 3,
        SQL_CODE_HOUR                 = 4,
        SQL_CODE_MINUTE               = 5,
        SQL_CODE_SECOND               = 6,
        SQL_CODE_YEAR_TO_MONTH        = 7,
        SQL_CODE_DAY_TO_HOUR          = 8,
        SQL_CODE_DAY_TO_MINUTE        = 9,
        SQL_CODE_DAY_TO_SECOND        = 10,
        SQL_CODE_HOUR_TO_MINUTE       = 11,
        SQL_CODE_HOUR_TO_SECOND       = 12,
        SQL_CODE_MINUTE_TO_SECOND     = 13,
        SQL_INTERVAL_YEAR             = 100 + SQL_CODE_YEAR,
        SQL_INTERVAL_MONTH            = 100 + SQL_CODE_MONTH,
        SQL_INTERVAL_DAY              = 100 + SQL_CODE_DAY,
        SQL_INTERVAL_HOUR             = 100 + SQL_CODE_HOUR,
        SQL_INTERVAL_MINUTE           = 100 + SQL_CODE_MINUTE,
        SQL_INTERVAL_SECOND           = 100 + SQL_CODE_SECOND,
        SQL_INTERVAL_YEAR_TO_MONTH    = 100 + SQL_CODE_YEAR_TO_MONTH,
        SQL_INTERVAL_DAY_TO_HOUR      = 100 + SQL_CODE_DAY_TO_HOUR,
        SQL_INTERVAL_DAY_TO_MINUTE    = 100 + SQL_CODE_DAY_TO_MINUTE,
        SQL_INTERVAL_DAY_TO_SECOND    = 100 + SQL_CODE_DAY_TO_SECOND,
        SQL_INTERVAL_HOUR_TO_MINUTE   = 100 + SQL_CODE_HOUR_TO_MINUTE,
        SQL_INTERVAL_HOUR_TO_SECOND   = 100 + SQL_CODE_HOUR_TO_SECOND,
        SQL_INTERVAL_MINUTE_TO_SECOND = 100 + SQL_CODE_MINUTE_TO_SECOND;

    public static final short
        SQL_WCHAR        = -8,
        SQL_WVARCHAR     = -9,
        SQL_WLONGVARCHAR = -10,
        SQL_C_WCHAR      = SQL_WCHAR;

    public static final short
        SQL_UNICODE             = SQL_WCHAR,
        SQL_UNICODE_VARCHAR     = SQL_WVARCHAR,
        SQL_UNICODE_LONGVARCHAR = SQL_WLONGVARCHAR,
        SQL_UNICODE_CHAR        = SQL_WCHAR;

    public static final short
        SQL_SIGNED_OFFSET   = -20,
        SQL_UNSIGNED_OFFSET = -22;

    public static final short
        SQL_C_CHAR                      = SQL_CHAR,
        SQL_C_LONG                      = SQL_INTEGER,
        SQL_C_SHORT                     = SQL_SMALLINT,
        SQL_C_FLOAT                     = SQL_REAL,
        SQL_C_DOUBLE                    = SQL_DOUBLE,
        SQL_C_NUMERIC                   = SQL_NUMERIC,
        SQL_C_DEFAULT                   = 99,
        SQL_C_DATE                      = SQL_DATE,
        SQL_C_TIME                      = SQL_TIME,
        SQL_C_TIMESTAMP                 = SQL_TIMESTAMP,
        SQL_C_TYPE_DATE                 = SQL_TYPE_DATE,
        SQL_C_TYPE_TIME                 = SQL_TYPE_TIME,
        SQL_C_TYPE_TIMESTAMP            = SQL_TYPE_TIMESTAMP,
        SQL_C_INTERVAL_YEAR             = SQL_INTERVAL_YEAR,
        SQL_C_INTERVAL_MONTH            = SQL_INTERVAL_MONTH,
        SQL_C_INTERVAL_DAY              = SQL_INTERVAL_DAY,
        SQL_C_INTERVAL_HOUR             = SQL_INTERVAL_HOUR,
        SQL_C_INTERVAL_MINUTE           = SQL_INTERVAL_MINUTE,
        SQL_C_INTERVAL_SECOND           = SQL_INTERVAL_SECOND,
        SQL_C_INTERVAL_YEAR_TO_MONTH    = SQL_INTERVAL_YEAR_TO_MONTH,
        SQL_C_INTERVAL_DAY_TO_HOUR      = SQL_INTERVAL_DAY_TO_HOUR,
        SQL_C_INTERVAL_DAY_TO_MINUTE    = SQL_INTERVAL_DAY_TO_MINUTE,
        SQL_C_INTERVAL_DAY_TO_SECOND    = SQL_INTERVAL_DAY_TO_SECOND,
        SQL_C_INTERVAL_HOUR_TO_MINUTE   = SQL_INTERVAL_HOUR_TO_MINUTE,
        SQL_C_INTERVAL_HOUR_TO_SECOND   = SQL_INTERVAL_HOUR_TO_SECOND,
        SQL_C_INTERVAL_MINUTE_TO_SECOND = SQL_INTERVAL_MINUTE_TO_SECOND,
        SQL_C_BINARY                    = SQL_BINARY,
        SQL_C_BIT                       = SQL_BIT,
        SQL_C_SBIGINT                   = SQL_BIGINT+SQL_SIGNED_OFFSET,
        SQL_C_UBIGINT                   = SQL_BIGINT+SQL_UNSIGNED_OFFSET,
        SQL_C_TINYINT                   = SQL_TINYINT,
        SQL_C_SLONG                     = SQL_C_LONG+SQL_SIGNED_OFFSET,
        SQL_C_SSHORT                    = SQL_C_SHORT+SQL_SIGNED_OFFSET,
        SQL_C_STINYINT                  = SQL_TINYINT+SQL_SIGNED_OFFSET,
        SQL_C_ULONG                     = SQL_C_LONG+SQL_UNSIGNED_OFFSET,
        SQL_C_USHORT                    = SQL_C_SHORT+SQL_UNSIGNED_OFFSET,
        SQL_C_UTINYINT                  = SQL_TINYINT+SQL_UNSIGNED_OFFSET,
        SQL_C_BOOKMARK                  = SQL_C_UBIGINT,
        SQL_C_GUID                      = SQL_GUID,
        SQL_C_VARBOOKMARK               = SQL_C_BINARY;

    public static final short SQL_TYPE_NULL = 0;

    public static final short SQL_DRIVER_C_TYPE_BASE = 0x4000;

    public static final short
        SQL_DRIVER_SQL_TYPE_BASE   = 0x4000,
        SQL_DRIVER_DESC_FIELD_BASE = 0x4000,
        SQL_DRIVER_DIAG_FIELD_BASE = 0x4000,
        SQL_DRIVER_INFO_TYPE_BASE  = 0x4000;

    public static final short
        SQL_NO_ROW_NUMBER         = -1,
        SQL_NO_COLUMN_NUMBER      = -1,
        SQL_ROW_NUMBER_UNKNOWN    = -2,
        SQL_COLUMN_NUMBER_UNKNOWN = -2;

    public static final short
        SQL_DEFAULT_PARAM           = -5,
        SQL_IGNORE                  = -6,
        SQL_COLUMN_IGNORE           = SQL_IGNORE,
        SQL_LEN_DATA_AT_EXEC_OFFSET = -100;

    public static final int SQL_LEN_BINARY_ATTR_OFFSET = -100;

    public static final short
        SQL_PARAM_TYPE_UNKNOWN        = 0,
        SQL_PARAM_INPUT               = 1,
        SQL_PARAM_INPUT_OUTPUT        = 2,
        SQL_RESULT_COL                = 3,
        SQL_PARAM_OUTPUT              = 4,
        SQL_RETURN_VALUE              = 5,
        SQL_PARAM_INPUT_OUTPUT_STREAM = 8,
        SQL_PARAM_OUTPUT_STREAM       = 16;

    public static final short
        SQL_PARAM_TYPE_DEFAULT = SQL_PARAM_INPUT_OUTPUT,
        SQL_SETPARAM_VALUE_MAX = -1;

    public static final short
        SQL_ATTR_READONLY          = 0,
        SQL_ATTR_WRITE             = 1,
        SQL_ATTR_READWRITE_UNKNOWN = 2;

    public static final short
        SQL_UNSEARCHABLE    = 0,
        SQL_LIKE_ONLY       = 1,
        SQL_ALL_EXCEPT_LIKE = 2,
        SQL_SEARCHABLE      = 3,
        SQL_PRED_SEARCHABLE = SQL_SEARCHABLE;

    public static final short
        SQL_COL_PRED_CHAR  = SQL_LIKE_ONLY,
        SQL_COL_PRED_BASIC = SQL_ALL_EXCEPT_LIKE;

    public static final short SQL_NO_TOTAL = -4;

    public static final short
        SQL_INFO_FIRST                      = 0,
        SQL_ACTIVE_CONNECTIONS              = 0,
        SQL_ACTIVE_STATEMENTS               = 1,
        SQL_DRIVER_HDBC                     = 3,
        SQL_DRIVER_HENV                     = 4,
        SQL_DRIVER_HSTMT                    = 5,
        SQL_DRIVER_NAME                     = 6,
        SQL_DRIVER_VER                      = 7,
        SQL_ODBC_API_CONFORMANCE            = 9,
        SQL_ODBC_VER                        = 10,
        SQL_ROW_UPDATES                     = 11,
        SQL_ODBC_SAG_CLI_CONFORMANCE        = 12,
        SQL_ODBC_SQL_CONFORMANCE            = 15,
        SQL_PROCEDURES                      = 21,
        SQL_CONCAT_NULL_BEHAVIOR            = 22,
        SQL_CURSOR_ROLLBACK_BEHAVIOR        = 24,
        SQL_EXPRESSIONS_IN_ORDERBY          = 27,
        SQL_MAX_OWNER_NAME_LEN              = 32,
        SQL_MAX_PROCEDURE_NAME_LEN          = 33,
        SQL_MAX_QUALIFIER_NAME_LEN          = 34,
        SQL_MULT_RESULT_SETS                = 36,
        SQL_MULTIPLE_ACTIVE_TXN             = 37,
        SQL_OUTER_JOINS                     = 38,
        SQL_OWNER_TERM                      = 39,
        SQL_PROCEDURE_TERM                  = 40,
        SQL_QUALIFIER_NAME_SEPARATOR        = 41,
        SQL_QUALIFIER_TERM                  = 42,
        SQL_SCROLL_OPTIONS                  = 44,
        SQL_TABLE_TERM                      = 45,
        SQL_CONVERT_FUNCTIONS               = 48,
        SQL_NUMERIC_FUNCTIONS               = 49,
        SQL_STRING_FUNCTIONS                = 50,
        SQL_SYSTEM_FUNCTIONS                = 51,
        SQL_TIMEDATE_FUNCTIONS              = 52,
        SQL_CONVERT_BIGINT                  = 53,
        SQL_CONVERT_BINARY                  = 54,
        SQL_CONVERT_BIT                     = 55,
        SQL_CONVERT_CHAR                    = 56,
        SQL_CONVERT_DATE                    = 57,
        SQL_CONVERT_DECIMAL                 = 58,
        SQL_CONVERT_DOUBLE                  = 59,
        SQL_CONVERT_FLOAT                   = 60,
        SQL_CONVERT_INTEGER                 = 61,
        SQL_CONVERT_LONGVARCHAR             = 62,
        SQL_CONVERT_NUMERIC                 = 63,
        SQL_CONVERT_REAL                    = 64,
        SQL_CONVERT_SMALLINT                = 65,
        SQL_CONVERT_TIME                    = 66,
        SQL_CONVERT_TIMESTAMP               = 67,
        SQL_CONVERT_TINYINT                 = 68,
        SQL_CONVERT_VARBINARY               = 69,
        SQL_CONVERT_VARCHAR                 = 70,
        SQL_CONVERT_LONGVARBINARY           = 71,
        SQL_ODBC_SQL_OPT_IEF                = 73,
        SQL_CORRELATION_NAME                = 74,
        SQL_NON_NULLABLE_COLUMNS            = 75,
        SQL_DRIVER_HLIB                     = 76,
        SQL_DRIVER_ODBC_VER                 = 77,
        SQL_LOCK_TYPES                      = 78,
        SQL_POS_OPERATIONS                  = 79,
        SQL_POSITIONED_STATEMENTS           = 80,
        SQL_BOOKMARK_PERSISTENCE            = 82,
        SQL_STATIC_SENSITIVITY              = 83,
        SQL_FILE_USAGE                      = 84,
        SQL_COLUMN_ALIAS                    = 87,
        SQL_GROUP_BY                        = 88,
        SQL_KEYWORDS                        = 89,
        SQL_OWNER_USAGE                     = 91,
        SQL_QUALIFIER_USAGE                 = 92,
        SQL_QUOTED_IDENTIFIER_CASE          = 93,
        SQL_SUBQUERIES                      = 95,
        SQL_UNION                           = 96,
        SQL_MAX_ROW_SIZE_INCLUDES_LONG      = 103,
        SQL_MAX_CHAR_LITERAL_LEN            = 108,
        SQL_TIMEDATE_ADD_INTERVALS          = 109,
        SQL_TIMEDATE_DIFF_INTERVALS         = 110,
        SQL_NEED_LONG_DATA_LEN              = 111,
        SQL_MAX_BINARY_LITERAL_LEN          = 112,
        SQL_LIKE_ESCAPE_CLAUSE              = 113,
        SQL_QUALIFIER_LOCATION              = 114,
        SQL_ACTIVE_ENVIRONMENTS             = 116,
        SQL_ALTER_DOMAIN                    = 117,
        SQL_SQL_CONFORMANCE                 = 118,
        SQL_DATETIME_LITERALS               = 119,
        SQL_ASYNC_MODE                      = 10021,
        SQL_BATCH_ROW_COUNT                 = 120,
        SQL_BATCH_SUPPORT                   = 121,
        SQL_CATALOG_LOCATION                = SQL_QUALIFIER_LOCATION,
        SQL_CATALOG_NAME_SEPARATOR          = SQL_QUALIFIER_NAME_SEPARATOR,
        SQL_CATALOG_TERM                    = SQL_QUALIFIER_TERM,
        SQL_CATALOG_USAGE                   = SQL_QUALIFIER_USAGE,
        SQL_CONVERT_WCHAR                   = 122,
        SQL_CONVERT_INTERVAL_DAY_TIME       = 123,
        SQL_CONVERT_INTERVAL_YEAR_MONTH     = 124,
        SQL_CONVERT_WLONGVARCHAR            = 125,
        SQL_CONVERT_WVARCHAR                = 126,
        SQL_CREATE_ASSERTION                = 127,
        SQL_CREATE_CHARACTER_SET            = 128,
        SQL_CREATE_COLLATION                = 129,
        SQL_CREATE_DOMAIN                   = 130,
        SQL_CREATE_SCHEMA                   = 131,
        SQL_CREATE_TABLE                    = 132,
        SQL_CREATE_TRANSLATION              = 133,
        SQL_CREATE_VIEW                     = 134,
        SQL_DRIVER_HDESC                    = 135,
        SQL_DROP_ASSERTION                  = 136,
        SQL_DROP_CHARACTER_SET              = 137,
        SQL_DROP_COLLATION                  = 138,
        SQL_DROP_DOMAIN                     = 139,
        SQL_DROP_SCHEMA                     = 140,
        SQL_DROP_TABLE                      = 141,
        SQL_DROP_TRANSLATION                = 142,
        SQL_DROP_VIEW                       = 143,
        SQL_DYNAMIC_CURSOR_ATTRIBUTES1      = 144,
        SQL_DYNAMIC_CURSOR_ATTRIBUTES2      = 145,
        SQL_FORWARD_ONLY_CURSOR_ATTRIBUTES1 = 146,
        SQL_FORWARD_ONLY_CURSOR_ATTRIBUTES2 = 147,
        SQL_INDEX_KEYWORDS                  = 148,
        SQL_INFO_SCHEMA_VIEWS               = 149,
        SQL_KEYSET_CURSOR_ATTRIBUTES1       = 150,
        SQL_KEYSET_CURSOR_ATTRIBUTES2       = 151,
        SQL_MAX_ASYNC_CONCURRENT_STATEMENTS = 10022,
        SQL_ODBC_INTERFACE_CONFORMANCE      = 152,
        SQL_PARAM_ARRAY_ROW_COUNTS          = 153,
        SQL_PARAM_ARRAY_SELECTS             = 154,
        SQL_SCHEMA_TERM                     = SQL_OWNER_TERM,
        SQL_SCHEMA_USAGE                    = SQL_OWNER_USAGE,
        SQL_SQL92_DATETIME_FUNCTIONS        = 155,
        SQL_SQL92_FOREIGN_KEY_DELETE_RULE   = 156,
        SQL_SQL92_FOREIGN_KEY_UPDATE_RULE   = 157,
        SQL_SQL92_GRANT                     = 158,
        SQL_SQL92_NUMERIC_VALUE_FUNCTIONS   = 159,
        SQL_SQL92_PREDICATES                = 160,
        SQL_SQL92_RELATIONAL_JOIN_OPERATORS = 161,
        SQL_SQL92_REVOKE                    = 162,
        SQL_SQL92_ROW_VALUE_CONSTRUCTOR     = 163,
        SQL_SQL92_STRING_FUNCTIONS          = 164,
        SQL_SQL92_VALUE_EXPRESSIONS         = 165,
        SQL_STANDARD_CLI_CONFORMANCE        = 166,
        SQL_STATIC_CURSOR_ATTRIBUTES1       = 167,
        SQL_STATIC_CURSOR_ATTRIBUTES2       = 168,
        SQL_AGGREGATE_FUNCTIONS             = 169,
        SQL_DDL_INDEX                       = 170,
        SQL_DM_VER                          = 171,
        SQL_INSERT_STATEMENT                = 172,
        SQL_CONVERT_GUID                    = 173,
        SQL_UNION_STATEMENT                 = SQL_UNION,
        SQL_ASYNC_DBC_FUNCTIONS             = 10023,
        SQL_DRIVER_AWARE_POOLING_SUPPORTED  = 10024,
        SQL_ASYNC_NOTIFICATION              = 10025;

    public static final int
        SQL_ASYNC_NOTIFICATION_NOT_CAPABLE = 0x0,
        SQL_ASYNC_NOTIFICATION_CAPABLE     = 0x1;

    public static final short SQL_DTC_TRANSITION_COST = 1750;

    public static final int
        SQL_CVT_CHAR                = 0x1,
        SQL_CVT_NUMERIC             = 0x2,
        SQL_CVT_DECIMAL             = 0x4,
        SQL_CVT_INTEGER             = 0x8,
        SQL_CVT_SMALLINT            = 0x10,
        SQL_CVT_FLOAT               = 0x20,
        SQL_CVT_REAL                = 0x40,
        SQL_CVT_DOUBLE              = 0x80,
        SQL_CVT_VARCHAR             = 0x100,
        SQL_CVT_LONGVARCHAR         = 0x200,
        SQL_CVT_BINARY              = 0x400,
        SQL_CVT_VARBINARY           = 0x800,
        SQL_CVT_BIT                 = 0x1000,
        SQL_CVT_TINYINT             = 0x2000,
        SQL_CVT_BIGINT              = 0x4000,
        SQL_CVT_DATE                = 0x8000,
        SQL_CVT_TIME                = 0x10000,
        SQL_CVT_TIMESTAMP           = 0x20000,
        SQL_CVT_LONGVARBINARY       = 0x40000,
        SQL_CVT_INTERVAL_YEAR_MONTH = 0x80000,
        SQL_CVT_INTERVAL_DAY_TIME   = 0x100000,
        SQL_CVT_WCHAR               = 0x200000,
        SQL_CVT_WLONGVARCHAR        = 0x400000,
        SQL_CVT_WVARCHAR            = 0x800000,
        SQL_CVT_GUID                = 0x1000000;

    public static final int
        SQL_FN_CVT_CONVERT = 0x1,
        SQL_FN_CVT_CAST    = 0x2;

    public static final int
        SQL_FN_STR_CONCAT           = 0x1,
        SQL_FN_STR_INSERT           = 0x2,
        SQL_FN_STR_LEFT             = 0x4,
        SQL_FN_STR_LTRIM            = 0x8,
        SQL_FN_STR_LENGTH           = 0x10,
        SQL_FN_STR_LOCATE           = 0x20,
        SQL_FN_STR_LCASE            = 0x40,
        SQL_FN_STR_REPEAT           = 0x80,
        SQL_FN_STR_REPLACE          = 0x100,
        SQL_FN_STR_RIGHT            = 0x200,
        SQL_FN_STR_RTRIM            = 0x400,
        SQL_FN_STR_SUBSTRING        = 0x800,
        SQL_FN_STR_UCASE            = 0x1000,
        SQL_FN_STR_ASCII            = 0x2000,
        SQL_FN_STR_CHAR             = 0x4000,
        SQL_FN_STR_DIFFERENCE       = 0x8000,
        SQL_FN_STR_LOCATE_2         = 0x10000,
        SQL_FN_STR_SOUNDEX          = 0x20000,
        SQL_FN_STR_SPACE            = 0x40000,
        SQL_FN_STR_BIT_LENGTH       = 0x80000,
        SQL_FN_STR_CHAR_LENGTH      = 0x100000,
        SQL_FN_STR_CHARACTER_LENGTH = 0x200000,
        SQL_FN_STR_OCTET_LENGTH     = 0x400000,
        SQL_FN_STR_POSITION         = 0x800000;

    public static final int
        SQL_SSF_CONVERT       = 0x1,
        SQL_SSF_LOWER         = 0x2,
        SQL_SSF_UPPER         = 0x4,
        SQL_SSF_SUBSTRING     = 0x8,
        SQL_SSF_TRANSLATE     = 0x10,
        SQL_SSF_TRIM_BOTH     = 0x20,
        SQL_SSF_TRIM_LEADING  = 0x40,
        SQL_SSF_TRIM_TRAILING = 0x80;

    public static final int
        SQL_FN_NUM_ABS      = 0x1,
        SQL_FN_NUM_ACOS     = 0x2,
        SQL_FN_NUM_ASIN     = 0x4,
        SQL_FN_NUM_ATAN     = 0x8,
        SQL_FN_NUM_ATAN2    = 0x10,
        SQL_FN_NUM_CEILING  = 0x20,
        SQL_FN_NUM_COS      = 0x40,
        SQL_FN_NUM_COT      = 0x80,
        SQL_FN_NUM_EXP      = 0x100,
        SQL_FN_NUM_FLOOR    = 0x200,
        SQL_FN_NUM_LOG      = 0x400,
        SQL_FN_NUM_MOD      = 0x800,
        SQL_FN_NUM_SIGN     = 0x1000,
        SQL_FN_NUM_SIN      = 0x2000,
        SQL_FN_NUM_SQRT     = 0x4000,
        SQL_FN_NUM_TAN      = 0x8000,
        SQL_FN_NUM_PI       = 0x10000,
        SQL_FN_NUM_RAND     = 0x20000,
        SQL_FN_NUM_DEGREES  = 0x40000,
        SQL_FN_NUM_LOG10    = 0x80000,
        SQL_FN_NUM_POWER    = 0x100000,
        SQL_FN_NUM_RADIANS  = 0x200000,
        SQL_FN_NUM_ROUND    = 0x400000,
        SQL_FN_NUM_TRUNCATE = 0x800000;

    public static final int
        SQL_SNVF_BIT_LENGTH       = 0x1,
        SQL_SNVF_CHAR_LENGTH      = 0x2,
        SQL_SNVF_CHARACTER_LENGTH = 0x4,
        SQL_SNVF_EXTRACT          = 0x8,
        SQL_SNVF_OCTET_LENGTH     = 0x10,
        SQL_SNVF_POSITION         = 0x20;

    public static final int
        SQL_FN_TD_NOW               = 0x1,
        SQL_FN_TD_CURDATE           = 0x2,
        SQL_FN_TD_DAYOFMONTH        = 0x4,
        SQL_FN_TD_DAYOFWEEK         = 0x8,
        SQL_FN_TD_DAYOFYEAR         = 0x10,
        SQL_FN_TD_MONTH             = 0x20,
        SQL_FN_TD_QUARTER           = 0x40,
        SQL_FN_TD_WEEK              = 0x80,
        SQL_FN_TD_YEAR              = 0x100,
        SQL_FN_TD_CURTIME           = 0x200,
        SQL_FN_TD_HOUR              = 0x400,
        SQL_FN_TD_MINUTE            = 0x800,
        SQL_FN_TD_SECOND            = 0x1000,
        SQL_FN_TD_TIMESTAMPADD      = 0x2000,
        SQL_FN_TD_TIMESTAMPDIFF     = 0x4000,
        SQL_FN_TD_DAYNAME           = 0x8000,
        SQL_FN_TD_MONTHNAME         = 0x10000,
        SQL_FN_TD_CURRENT_DATE      = 0x20000,
        SQL_FN_TD_CURRENT_TIME      = 0x40000,
        SQL_FN_TD_CURRENT_TIMESTAMP = 0x80000,
        SQL_FN_TD_EXTRACT           = 0x100000;

    public static final int
        SQL_SDF_CURRENT_DATE      = 0x1,
        SQL_SDF_CURRENT_TIME      = 0x2,
        SQL_SDF_CURRENT_TIMESTAMP = 0x4;

    public static final int
        SQL_FN_SYS_USERNAME = 0x1,
        SQL_FN_SYS_DBNAME   = 0x2,
        SQL_FN_SYS_IFNULL   = 0x4;

    public static final int
        SQL_FN_TSI_FRAC_SECOND = 0x1,
        SQL_FN_TSI_SECOND      = 0x2,
        SQL_FN_TSI_MINUTE      = 0x4,
        SQL_FN_TSI_HOUR        = 0x8,
        SQL_FN_TSI_DAY         = 0x10,
        SQL_FN_TSI_WEEK        = 0x20,
        SQL_FN_TSI_MONTH       = 0x40,
        SQL_FN_TSI_QUARTER     = 0x80,
        SQL_FN_TSI_YEAR        = 0x100;

    public static final int
        SQL_CA1_NEXT     = 0x1,
        SQL_CA1_ABSOLUTE = 0x2,
        SQL_CA1_RELATIVE = 0x4,
        SQL_CA1_BOOKMARK = 0x8;

    public static final int
        SQL_CA1_LOCK_NO_CHANGE = 0x40,
        SQL_CA1_LOCK_EXCLUSIVE = 0x80,
        SQL_CA1_LOCK_UNLOCK    = 0x100;

    public static final int
        SQL_CA1_POS_POSITION = 0x200,
        SQL_CA1_POS_UPDATE   = 0x400,
        SQL_CA1_POS_DELETE   = 0x800,
        SQL_CA1_POS_REFRESH  = 0x1000;

    public static final int
        SQL_CA1_POSITIONED_UPDATE = 0x2000,
        SQL_CA1_POSITIONED_DELETE = 0x4000,
        SQL_CA1_SELECT_FOR_UPDATE = 0x8000;

    public static final int
        SQL_CA1_BULK_ADD                = 0x10000,
        SQL_CA1_BULK_UPDATE_BY_BOOKMARK = 0x20000,
        SQL_CA1_BULK_DELETE_BY_BOOKMARK = 0x40000,
        SQL_CA1_BULK_FETCH_BY_BOOKMARK  = 0x80000;

    public static final int
        SQL_CA2_READ_ONLY_CONCURRENCY  = 0x1,
        SQL_CA2_LOCK_CONCURRENCY       = 0x2,
        SQL_CA2_OPT_ROWVER_CONCURRENCY = 0x4,
        SQL_CA2_OPT_VALUES_CONCURRENCY = 0x8;

    public static final int
        SQL_CA2_SENSITIVITY_ADDITIONS = 0x10,
        SQL_CA2_SENSITIVITY_DELETIONS = 0x20,
        SQL_CA2_SENSITIVITY_UPDATES   = 0x40;

    public static final int
        SQL_CA2_MAX_ROWS_SELECT      = 0x80,
        SQL_CA2_MAX_ROWS_INSERT      = 0x100,
        SQL_CA2_MAX_ROWS_DELETE      = 0x200,
        SQL_CA2_MAX_ROWS_UPDATE      = 0x400,
        SQL_CA2_MAX_ROWS_CATALOG     = 0x800,
        SQL_CA2_MAX_ROWS_AFFECTS_ALL = SQL_CA2_MAX_ROWS_SELECT | SQL_CA2_MAX_ROWS_INSERT | SQL_CA2_MAX_ROWS_DELETE | SQL_CA2_MAX_ROWS_UPDATE | SQL_CA2_MAX_ROWS_CATALOG;

    public static final int
        SQL_CA2_CRC_EXACT       = 0x1000,
        SQL_CA2_CRC_APPROXIMATE = 0x2000;

    public static final int
        SQL_CA2_SIMULATE_NON_UNIQUE = 0x4000,
        SQL_CA2_SIMULATE_TRY_UNIQUE = 0x8000,
        SQL_CA2_SIMULATE_UNIQUE     = 0x10000;

    public static final int
        SQL_OAC_NONE   = 0x0,
        SQL_OAC_LEVEL1 = 0x1,
        SQL_OAC_LEVEL2 = 0x2;

    public static final int
        SQL_OSCC_NOT_COMPLIANT = 0x0,
        SQL_OSCC_COMPLIANT     = 0x1;

    public static final int
        SQL_OSC_MINIMUM  = 0x0,
        SQL_OSC_CORE     = 0x1,
        SQL_OSC_EXTENDED = 0x2;

    public static final int
        SQL_CB_NULL     = 0x0,
        SQL_CB_NON_NULL = 0x1;

    public static final int
        SQL_SO_FORWARD_ONLY  = 0x1,
        SQL_SO_KEYSET_DRIVEN = 0x2,
        SQL_SO_DYNAMIC       = 0x4,
        SQL_SO_MIXED         = 0x8,
        SQL_SO_STATIC        = 0x10;

    public static final int SQL_FD_FETCH_BOOKMARK = 0x80;

    public static final int
        SQL_CN_NONE      = 0x0,
        SQL_CN_DIFFERENT = 0x1,
        SQL_CN_ANY       = 0x2;

    public static final int
        SQL_NNC_NULL     = 0x0,
        SQL_NNC_NON_NULL = 0x1;

    public static final int
        SQL_NC_START = 0x2,
        SQL_NC_END   = 0x4;

    public static final int
        SQL_FILE_NOT_SUPPORTED = 0x0,
        SQL_FILE_TABLE         = 0x1,
        SQL_FILE_QUALIFIER     = 0x2,
        SQL_FILE_CATALOG       = SQL_FILE_QUALIFIER;

    public static final int
        SQL_GD_BLOCK         = 0x4,
        SQL_GD_BOUND         = 0x8,
        SQL_GD_OUTPUT_PARAMS = 0x10;

    public static final int
        SQL_PS_POSITIONED_DELETE = 0x1,
        SQL_PS_POSITIONED_UPDATE = 0x2,
        SQL_PS_SELECT_FOR_UPDATE = 0x4;

    public static final int
        SQL_GB_NOT_SUPPORTED            = 0x0,
        SQL_GB_GROUP_BY_EQUALS_SELECT   = 0x1,
        SQL_GB_GROUP_BY_CONTAINS_SELECT = 0x2,
        SQL_GB_NO_RELATION              = 0x3,
        SQL_GB_COLLATE                  = 0x4;

    public static final int
        SQL_OU_DML_STATEMENTS       = 0x1,
        SQL_OU_PROCEDURE_INVOCATION = 0x2,
        SQL_OU_TABLE_DEFINITION     = 0x4,
        SQL_OU_INDEX_DEFINITION     = 0x8,
        SQL_OU_PRIVILEGE_DEFINITION = 0x10;

    public static final int
        SQL_SU_DML_STATEMENTS       = SQL_OU_DML_STATEMENTS,
        SQL_SU_PROCEDURE_INVOCATION = SQL_OU_PROCEDURE_INVOCATION,
        SQL_SU_TABLE_DEFINITION     = SQL_OU_TABLE_DEFINITION,
        SQL_SU_INDEX_DEFINITION     = SQL_OU_INDEX_DEFINITION,
        SQL_SU_PRIVILEGE_DEFINITION = SQL_OU_PRIVILEGE_DEFINITION;

    public static final int
        SQL_QU_DML_STATEMENTS       = 0x1,
        SQL_QU_PROCEDURE_INVOCATION = 0x2,
        SQL_QU_TABLE_DEFINITION     = 0x4,
        SQL_QU_INDEX_DEFINITION     = 0x8,
        SQL_QU_PRIVILEGE_DEFINITION = 0x10;

    public static final int
        SQL_CU_DML_STATEMENTS       = SQL_QU_DML_STATEMENTS,
        SQL_CU_PROCEDURE_INVOCATION = SQL_QU_PROCEDURE_INVOCATION,
        SQL_CU_TABLE_DEFINITION     = SQL_QU_TABLE_DEFINITION,
        SQL_CU_INDEX_DEFINITION     = SQL_QU_INDEX_DEFINITION,
        SQL_CU_PRIVILEGE_DEFINITION = SQL_QU_PRIVILEGE_DEFINITION;

    public static final int
        SQL_SQ_COMPARISON            = 0x1,
        SQL_SQ_EXISTS                = 0x2,
        SQL_SQ_IN                    = 0x4,
        SQL_SQ_QUANTIFIED            = 0x8,
        SQL_SQ_CORRELATED_SUBQUERIES = 0x10;

    public static final int
        SQL_U_UNION     = 0x1,
        SQL_U_UNION_ALL = 0x2;

    public static final int
        SQL_BP_CLOSE       = 0x1,
        SQL_BP_DELETE      = 0x2,
        SQL_BP_DROP        = 0x4,
        SQL_BP_TRANSACTION = 0x8,
        SQL_BP_UPDATE      = 0x10,
        SQL_BP_OTHER_HSTMT = 0x20,
        SQL_BP_SCROLL      = 0x40;

    public static final int
        SQL_SS_ADDITIONS = 0x1,
        SQL_SS_DELETIONS = 0x2,
        SQL_SS_UPDATES   = 0x4;

    public static final int
        SQL_CV_CREATE_VIEW  = 0x1,
        SQL_CV_CHECK_OPTION = 0x2,
        SQL_CV_CASCADED     = 0x4,
        SQL_CV_LOCAL        = 0x8;

    public static final int
        SQL_LCK_NO_CHANGE = 0x1,
        SQL_LCK_EXCLUSIVE = 0x2,
        SQL_LCK_UNLOCK    = 0x4;

    public static final int
        SQL_POS_POSITION = 0x1,
        SQL_POS_REFRESH  = 0x2,
        SQL_POS_UPDATE   = 0x4,
        SQL_POS_DELETE   = 0x8,
        SQL_POS_ADD      = 0x10;

    public static final int
        SQL_QL_START = 0x1,
        SQL_QL_END   = 0x2;

    public static final int
        SQL_AF_AVG      = 0x1,
        SQL_AF_COUNT    = 0x2,
        SQL_AF_MAX      = 0x4,
        SQL_AF_MIN      = 0x8,
        SQL_AF_SUM      = 0x10,
        SQL_AF_DISTINCT = 0x20,
        SQL_AF_ALL      = 0x40;

    public static final int
        SQL_SC_SQL92_ENTRY            = 0x1,
        SQL_SC_FIPS127_2_TRANSITIONAL = 0x2,
        SQL_SC_SQL92_INTERMEDIATE     = 0x4,
        SQL_SC_SQL92_FULL             = 0x8;

    public static final int
        SQL_DL_SQL92_DATE                      = 0x1,
        SQL_DL_SQL92_TIME                      = 0x2,
        SQL_DL_SQL92_TIMESTAMP                 = 0x4,
        SQL_DL_SQL92_INTERVAL_YEAR             = 0x8,
        SQL_DL_SQL92_INTERVAL_MONTH            = 0x10,
        SQL_DL_SQL92_INTERVAL_DAY              = 0x20,
        SQL_DL_SQL92_INTERVAL_HOUR             = 0x40,
        SQL_DL_SQL92_INTERVAL_MINUTE           = 0x80,
        SQL_DL_SQL92_INTERVAL_SECOND           = 0x100,
        SQL_DL_SQL92_INTERVAL_YEAR_TO_MONTH    = 0x200,
        SQL_DL_SQL92_INTERVAL_DAY_TO_HOUR      = 0x400,
        SQL_DL_SQL92_INTERVAL_DAY_TO_MINUTE    = 0x800,
        SQL_DL_SQL92_INTERVAL_DAY_TO_SECOND    = 0x1000,
        SQL_DL_SQL92_INTERVAL_HOUR_TO_MINUTE   = 0x2000,
        SQL_DL_SQL92_INTERVAL_HOUR_TO_SECOND   = 0x4000,
        SQL_DL_SQL92_INTERVAL_MINUTE_TO_SECOND = 0x8000;

    public static final int
        SQL_CL_START = SQL_QL_START,
        SQL_CL_END   = SQL_QL_END;

    public static final int
        SQL_BRC_PROCEDURES = 0x1,
        SQL_BRC_EXPLICIT   = 0x2,
        SQL_BRC_ROLLED_UP  = 0x4;

    public static final int
        SQL_BS_SELECT_EXPLICIT    = 0x1,
        SQL_BS_ROW_COUNT_EXPLICIT = 0x2,
        SQL_BS_SELECT_PROC        = 0x4,
        SQL_BS_ROW_COUNT_PROC     = 0x8;

    public static final short
        SQL_PARC_BATCH    = 1,
        SQL_PARC_NO_BATCH = 2;

    public static final short
        SQL_PAS_BATCH     = 1,
        SQL_PAS_NO_BATCH  = 2,
        SQL_PAS_NO_SELECT = 3;

    public static final int
        SQL_IK_NONE = 0x0,
        SQL_IK_ASC  = 0x1,
        SQL_IK_DESC = 0x2,
        SQL_IK_ALL  = SQL_IK_ASC | SQL_IK_DESC;

    public static final int
        SQL_ISV_ASSERTIONS              = 0x1,
        SQL_ISV_CHARACTER_SETS          = 0x2,
        SQL_ISV_CHECK_CONSTRAINTS       = 0x4,
        SQL_ISV_COLLATIONS              = 0x8,
        SQL_ISV_COLUMN_DOMAIN_USAGE     = 0x10,
        SQL_ISV_COLUMN_PRIVILEGES       = 0x20,
        SQL_ISV_COLUMNS                 = 0x40,
        SQL_ISV_CONSTRAINT_COLUMN_USAGE = 0x80,
        SQL_ISV_CONSTRAINT_TABLE_USAGE  = 0x100,
        SQL_ISV_DOMAIN_CONSTRAINTS      = 0x200,
        SQL_ISV_DOMAINS                 = 0x400,
        SQL_ISV_KEY_COLUMN_USAGE        = 0x800,
        SQL_ISV_REFERENTIAL_CONSTRAINTS = 0x1000,
        SQL_ISV_SCHEMATA                = 0x2000,
        SQL_ISV_SQL_LANGUAGES           = 0x4000,
        SQL_ISV_TABLE_CONSTRAINTS       = 0x8000,
        SQL_ISV_TABLE_PRIVILEGES        = 0x10000,
        SQL_ISV_TABLES                  = 0x20000,
        SQL_ISV_TRANSLATIONS            = 0x40000,
        SQL_ISV_USAGE_PRIVILEGES        = 0x80000,
        SQL_ISV_VIEW_COLUMN_USAGE       = 0x100000,
        SQL_ISV_VIEW_TABLE_USAGE        = 0x200000,
        SQL_ISV_VIEWS                   = 0x400000;

    public static final short
        SQL_AM_NONE       = 0,
        SQL_AM_CONNECTION = 1,
        SQL_AM_STATEMENT  = 2;

    public static final int
        SQL_AD_CONSTRAINT_NAME_DEFINITION         = 0x1,
        SQL_AD_ADD_DOMAIN_CONSTRAINT              = 0x2,
        SQL_AD_DROP_DOMAIN_CONSTRAINT             = 0x4,
        SQL_AD_ADD_DOMAIN_DEFAULT                 = 0x8,
        SQL_AD_DROP_DOMAIN_DEFAULT                = 0x10,
        SQL_AD_ADD_CONSTRAINT_INITIALLY_DEFERRED  = 0x20,
        SQL_AD_ADD_CONSTRAINT_INITIALLY_IMMEDIATE = 0x40,
        SQL_AD_ADD_CONSTRAINT_DEFERRABLE          = 0x80,
        SQL_AD_ADD_CONSTRAINT_NON_DEFERRABLE      = 0x100;

    public static final int
        SQL_CS_CREATE_SCHEMA         = 0x1,
        SQL_CS_AUTHORIZATION         = 0x2,
        SQL_CS_DEFAULT_CHARACTER_SET = 0x4;

    public static final int SQL_CTR_CREATE_TRANSLATION = 0x1;

    public static final int
        SQL_CA_CREATE_ASSERTION               = 0x1,
        SQL_CA_CONSTRAINT_INITIALLY_DEFERRED  = 0x10,
        SQL_CA_CONSTRAINT_INITIALLY_IMMEDIATE = 0x20,
        SQL_CA_CONSTRAINT_DEFERRABLE          = 0x40,
        SQL_CA_CONSTRAINT_NON_DEFERRABLE      = 0x80;

    public static final int
        SQL_CCS_CREATE_CHARACTER_SET = 0x1,
        SQL_CCS_COLLATE_CLAUSE       = 0x2,
        SQL_CCS_LIMITED_COLLATION    = 0x4;

    public static final int SQL_CCOL_CREATE_COLLATION = 0x1;

    public static final int
        SQL_CDO_CREATE_DOMAIN                  = 0x1,
        SQL_CDO_DEFAULT                        = 0x2,
        SQL_CDO_CONSTRAINT                     = 0x4,
        SQL_CDO_COLLATION                      = 0x8,
        SQL_CDO_CONSTRAINT_NAME_DEFINITION     = 0x10,
        SQL_CDO_CONSTRAINT_INITIALLY_DEFERRED  = 0x20,
        SQL_CDO_CONSTRAINT_INITIALLY_IMMEDIATE = 0x40,
        SQL_CDO_CONSTRAINT_DEFERRABLE          = 0x80,
        SQL_CDO_CONSTRAINT_NON_DEFERRABLE      = 0x100;

    public static final int
        SQL_CT_CREATE_TABLE                   = 0x1,
        SQL_CT_COMMIT_PRESERVE                = 0x2,
        SQL_CT_COMMIT_DELETE                  = 0x4,
        SQL_CT_GLOBAL_TEMPORARY               = 0x8,
        SQL_CT_LOCAL_TEMPORARY                = 0x10,
        SQL_CT_CONSTRAINT_INITIALLY_DEFERRED  = 0x20,
        SQL_CT_CONSTRAINT_INITIALLY_IMMEDIATE = 0x40,
        SQL_CT_CONSTRAINT_DEFERRABLE          = 0x80,
        SQL_CT_CONSTRAINT_NON_DEFERRABLE      = 0x100,
        SQL_CT_COLUMN_CONSTRAINT              = 0x200,
        SQL_CT_COLUMN_DEFAULT                 = 0x400,
        SQL_CT_COLUMN_COLLATION               = 0x800,
        SQL_CT_TABLE_CONSTRAINT               = 0x1000,
        SQL_CT_CONSTRAINT_NAME_DEFINITION     = 0x2000;

    public static final int
        SQL_DI_CREATE_INDEX = 0x1,
        SQL_DI_DROP_INDEX   = 0x2;

    public static final int SQL_DC_DROP_COLLATION = 0x1;

    public static final int
        SQL_DD_DROP_DOMAIN = 0x1,
        SQL_DD_RESTRICT    = 0x2,
        SQL_DD_CASCADE     = 0x4;

    public static final int
        SQL_DS_DROP_SCHEMA = 0x1,
        SQL_DS_RESTRICT    = 0x2,
        SQL_DS_CASCADE     = 0x4;

    public static final int SQL_DCS_DROP_CHARACTER_SET = 0x1;

    public static final int SQL_DA_DROP_ASSERTION = 0x1;

    public static final int
        SQL_DT_DROP_TABLE = 0x1,
        SQL_DT_RESTRICT   = 0x2,
        SQL_DT_CASCADE    = 0x4;

    public static final int SQL_DTR_DROP_TRANSLATION = 0x1;

    public static final int
        SQL_DV_DROP_VIEW = 0x1,
        SQL_DV_RESTRICT  = 0x2,
        SQL_DV_CASCADE   = 0x4;

    public static final int
        SQL_IS_INSERT_LITERALS = 0x1,
        SQL_IS_INSERT_SEARCHED = 0x2,
        SQL_IS_SELECT_INTO     = 0x4;

    public static final short
        SQL_OIC_CORE   = 1,
        SQL_OIC_LEVEL1 = 2,
        SQL_OIC_LEVEL2 = 3;

    public static final int
        SQL_SFKD_CASCADE     = 0x1,
        SQL_SFKD_NO_ACTION   = 0x2,
        SQL_SFKD_SET_DEFAULT = 0x4,
        SQL_SFKD_SET_NULL    = 0x8;

    public static final int
        SQL_SFKU_CASCADE     = 0x1,
        SQL_SFKU_NO_ACTION   = 0x2,
        SQL_SFKU_SET_DEFAULT = 0x4,
        SQL_SFKU_SET_NULL    = 0x8;

    public static final int
        SQL_SG_USAGE_ON_DOMAIN        = 0x1,
        SQL_SG_USAGE_ON_CHARACTER_SET = 0x2,
        SQL_SG_USAGE_ON_COLLATION     = 0x4,
        SQL_SG_USAGE_ON_TRANSLATION   = 0x8,
        SQL_SG_WITH_GRANT_OPTION      = 0x10,
        SQL_SG_DELETE_TABLE           = 0x20,
        SQL_SG_INSERT_TABLE           = 0x40,
        SQL_SG_INSERT_COLUMN          = 0x80,
        SQL_SG_REFERENCES_TABLE       = 0x100,
        SQL_SG_REFERENCES_COLUMN      = 0x200,
        SQL_SG_SELECT_TABLE           = 0x400,
        SQL_SG_UPDATE_TABLE           = 0x800,
        SQL_SG_UPDATE_COLUMN          = 0x1000;

    public static final int
        SQL_SP_EXISTS                = 0x1,
        SQL_SP_ISNOTNULL             = 0x2,
        SQL_SP_ISNULL                = 0x4,
        SQL_SP_MATCH_FULL            = 0x8,
        SQL_SP_MATCH_PARTIAL         = 0x10,
        SQL_SP_MATCH_UNIQUE_FULL     = 0x20,
        SQL_SP_MATCH_UNIQUE_PARTIAL  = 0x40,
        SQL_SP_OVERLAPS              = 0x80,
        SQL_SP_UNIQUE                = 0x100,
        SQL_SP_LIKE                  = 0x200,
        SQL_SP_IN                    = 0x400,
        SQL_SP_BETWEEN               = 0x800,
        SQL_SP_COMPARISON            = 0x1000,
        SQL_SP_QUANTIFIED_COMPARISON = 0x2000;

    public static final int
        SQL_SRJO_CORRESPONDING_CLAUSE = 0x1,
        SQL_SRJO_CROSS_JOIN           = 0x2,
        SQL_SRJO_EXCEPT_JOIN          = 0x4,
        SQL_SRJO_FULL_OUTER_JOIN      = 0x8,
        SQL_SRJO_INNER_JOIN           = 0x10,
        SQL_SRJO_INTERSECT_JOIN       = 0x20,
        SQL_SRJO_LEFT_OUTER_JOIN      = 0x40,
        SQL_SRJO_NATURAL_JOIN         = 0x80,
        SQL_SRJO_RIGHT_OUTER_JOIN     = 0x100,
        SQL_SRJO_UNION_JOIN           = 0x200;

    public static final int
        SQL_SR_USAGE_ON_DOMAIN        = 0x1,
        SQL_SR_USAGE_ON_CHARACTER_SET = 0x2,
        SQL_SR_USAGE_ON_COLLATION     = 0x4,
        SQL_SR_USAGE_ON_TRANSLATION   = 0x8,
        SQL_SR_GRANT_OPTION_FOR       = 0x10,
        SQL_SR_CASCADE                = 0x20,
        SQL_SR_RESTRICT               = 0x40,
        SQL_SR_DELETE_TABLE           = 0x80,
        SQL_SR_INSERT_TABLE           = 0x100,
        SQL_SR_INSERT_COLUMN          = 0x200,
        SQL_SR_REFERENCES_TABLE       = 0x400,
        SQL_SR_REFERENCES_COLUMN      = 0x800,
        SQL_SR_SELECT_TABLE           = 0x1000,
        SQL_SR_UPDATE_TABLE           = 0x2000,
        SQL_SR_UPDATE_COLUMN          = 0x4000;

    public static final int
        SQL_SRVC_VALUE_EXPRESSION = 0x1,
        SQL_SRVC_NULL             = 0x2,
        SQL_SRVC_DEFAULT          = 0x4,
        SQL_SRVC_ROW_SUBQUERY     = 0x8;

    public static final int
        SQL_SVE_CASE     = 0x1,
        SQL_SVE_CAST     = 0x2,
        SQL_SVE_COALESCE = 0x4,
        SQL_SVE_NULLIF   = 0x8;

    public static final int
        SQL_SCC_XOPEN_CLI_VERSION1 = 0x1,
        SQL_SCC_ISO92_CLI          = 0x2;

    public static final int
        SQL_US_UNION     = SQL_U_UNION,
        SQL_US_UNION_ALL = SQL_U_UNION_ALL;

    public static final int
        SQL_DRIVER_AWARE_POOLING_NOT_CAPABLE = 0x0,
        SQL_DRIVER_AWARE_POOLING_CAPABLE     = 0x1;

    public static final int
        SQL_DTC_ENLIST_EXPENSIVE   = 0x1,
        SQL_DTC_UNENLIST_EXPENSIVE = 0x2;

    public static final int
        SQL_ASYNC_DBC_NOT_CAPABLE = 0x0,
        SQL_ASYNC_DBC_CAPABLE     = 0x1;

    public static final short
        SQL_FETCH_FIRST_USER   = 31,
        SQL_FETCH_FIRST_SYSTEM = 32;

    public static final short SQL_ENTIRE_ROWSET = 0;

    public static final short
        SQL_BEST_ROWID = 1,
        SQL_ROWVER     = 2;

    public static final short SQL_PC_NOT_PSEUDO = 1;

    public static final short
        SQL_QUICK  = 0,
        SQL_ENSURE = 1;

    public static final short SQL_TABLE_STAT = 0;

    public static final String
        SQL_ALL_CATALOGS    = "%",
        SQL_ALL_SCHEMAS     = "%",
        SQL_ALL_TABLE_TYPES = "%";

    public static final short SQL_FETCH_BOOKMARK = 8;

    public static final short
        SQL_ROW_SUCCESS           = 0,
        SQL_ROW_DELETED           = 1,
        SQL_ROW_UPDATED           = 2,
        SQL_ROW_NOROW             = 3,
        SQL_ROW_ADDED             = 4,
        SQL_ROW_ERROR             = 5,
        SQL_ROW_SUCCESS_WITH_INFO = 6,
        SQL_ROW_PROCEED           = 0,
        SQL_ROW_IGNORE            = 1;

    public static final short
        SQL_PARAM_SUCCESS           = 0,
        SQL_PARAM_SUCCESS_WITH_INFO = 6,
        SQL_PARAM_ERROR             = 5,
        SQL_PARAM_UNUSED            = 7,
        SQL_PARAM_DIAG_UNAVAILABLE  = 1,
        SQL_PARAM_PROCEED           = 0,
        SQL_PARAM_IGNORE            = 1;

    public static final short
        SQL_CASCADE             = 0,
        SQL_RESTRICT            = 1,
        SQL_SET_NULL            = 2,
        SQL_NO_ACTION           = 3,
        SQL_SET_DEFAULT         = 4,
        SQL_INITIALLY_DEFERRED  = 5,
        SQL_INITIALLY_IMMEDIATE = 6,
        SQL_NOT_DEFERRABLE      = 7;

    public static final short
        SQL_PT_UNKNOWN   = 0,
        SQL_PT_PROCEDURE = 1,
        SQL_PT_FUNCTION  = 2;

    public static final short
        SQL_IS_YEAR             = 1,
        SQL_IS_MONTH            = 2,
        SQL_IS_DAY              = 3,
        SQL_IS_HOUR             = 4,
        SQL_IS_MINUTE           = 5,
        SQL_IS_SECOND           = 6,
        SQL_IS_YEAR_TO_MONTH    = 7,
        SQL_IS_DAY_TO_HOUR      = 8,
        SQL_IS_DAY_TO_MINUTE    = 9,
        SQL_IS_DAY_TO_SECOND    = 10,
        SQL_IS_HOUR_TO_MINUTE   = 11,
        SQL_IS_HOUR_TO_SECOND   = 12,
        SQL_IS_MINUTE_TO_SECOND = 13;

    public static final int SQL_MAX_NUMERIC_LEN = 16;

    public static final short
        SQL_DRIVER_NOPROMPT          = 0,
        SQL_DRIVER_COMPLETE          = 1,
        SQL_DRIVER_PROMPT            = 2,
        SQL_DRIVER_COMPLETE_REQUIRED = 3;

    public static final short
        SQL_POSITION = 0,
        SQL_REFRESH  = 1,
        SQL_UPDATE   = 2,
        SQL_DELETE   = 3;

    public static final short
        SQL_ADD                     = 4,
        SQL_SETPOS_MAX_OPTION_VALUE = SQL_ADD,
        SQL_UPDATE_BY_BOOKMARK      = 5,
        SQL_DELETE_BY_BOOKMARK      = 6,
        SQL_FETCH_BY_BOOKMARK       = 7;

    public static final short
        SQL_LOCK_NO_CHANGE        = 0,
        SQL_LOCK_EXCLUSIVE        = 1,
        SQL_LOCK_UNLOCK           = 2,
        SQL_SETPOS_MAX_LOCK_VALUE = SQL_LOCK_UNLOCK;

    protected SQL() {
        throw new UnsupportedOperationException();
    }

    // --- [ SQLAllocHandle ] ---

    /** {@code SQLRETURN SQLAllocHandle(SQLSMALLINT HandleType, SQLHANDLE InputHandle, SQLHANDLE * OutputHandle)} */
    public static short nSQLAllocHandle(short HandleType, long InputHandle, long OutputHandle) {
        long __functionAddress = Functions.AllocHandle;
        return callSPPS(HandleType, InputHandle, OutputHandle, __functionAddress);
    }

    /** {@code SQLRETURN SQLAllocHandle(SQLSMALLINT HandleType, SQLHANDLE InputHandle, SQLHANDLE * OutputHandle)} */
    @NativeType("SQLRETURN")
    public static short SQLAllocHandle(@NativeType("SQLSMALLINT") short HandleType, @NativeType("SQLHANDLE") long InputHandle, @NativeType("SQLHANDLE *") PointerBuffer OutputHandle) {
        if (CHECKS) {
            check(OutputHandle, 1);
        }
        return nSQLAllocHandle(HandleType, InputHandle, memAddress(OutputHandle));
    }

    // --- [ SQLConnect ] ---

    /** {@code SQLRETURN SQLConnect(SQLHDBC ConnectionHandle, SQLWCHAR * ServerName, SQLSMALLINT NameLength1, SQLWCHAR * UserName, SQLSMALLINT NameLength2, SQLWCHAR * Authentication, SQLSMALLINT NameLength3)} */
    public static short nSQLConnect(long ConnectionHandle, long ServerName, short NameLength1, long UserName, short NameLength2, long Authentication, short NameLength3) {
        long __functionAddress = Functions.Connect;
        if (CHECKS) {
            check(ConnectionHandle);
        }
        return callPPSPSPSS(ConnectionHandle, ServerName, NameLength1, UserName, NameLength2, Authentication, NameLength3, __functionAddress);
    }

    /** {@code SQLRETURN SQLConnect(SQLHDBC ConnectionHandle, SQLWCHAR * ServerName, SQLSMALLINT NameLength1, SQLWCHAR * UserName, SQLSMALLINT NameLength2, SQLWCHAR * Authentication, SQLSMALLINT NameLength3)} */
    @NativeType("SQLRETURN")
    public static short SQLConnect(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLWCHAR *") ByteBuffer ServerName, @NativeType("SQLWCHAR *") ByteBuffer UserName, @NativeType("SQLWCHAR *") ByteBuffer Authentication) {
        return nSQLConnect(ConnectionHandle, memAddress(ServerName), (short)(ServerName.remaining() >> 1), memAddress(UserName), (short)(UserName.remaining() >> 1), memAddress(Authentication), (short)(Authentication.remaining() >> 1));
    }

    /** {@code SQLRETURN SQLConnect(SQLHDBC ConnectionHandle, SQLWCHAR * ServerName, SQLSMALLINT NameLength1, SQLWCHAR * UserName, SQLSMALLINT NameLength2, SQLWCHAR * Authentication, SQLSMALLINT NameLength3)} */
    @NativeType("SQLRETURN")
    public static short SQLConnect(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLWCHAR *") CharSequence ServerName, @NativeType("SQLWCHAR *") CharSequence UserName, @NativeType("SQLWCHAR *") CharSequence Authentication) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int ServerNameEncodedLength = stack.nUTF16(ServerName, false);
            long ServerNameEncoded = stack.getPointerAddress();
            int UserNameEncodedLength = stack.nUTF16(UserName, false);
            long UserNameEncoded = stack.getPointerAddress();
            int AuthenticationEncodedLength = stack.nUTF16(Authentication, false);
            long AuthenticationEncoded = stack.getPointerAddress();
            return nSQLConnect(ConnectionHandle, ServerNameEncoded, (short)(ServerNameEncodedLength >> 1), UserNameEncoded, (short)(UserNameEncodedLength >> 1), AuthenticationEncoded, (short)(AuthenticationEncodedLength >> 1));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SQLDataSources ] ---

    /** {@code SQLRETURN SQLDataSources(SQLHENV EnvironmentHandle, SQLUSMALLINT Direction, SQLWCHAR * ServerName, SQLSMALLINT BufferLength1, SQLSMALLINT * NameLength1Ptr, SQLWCHAR * Description, SQLSMALLINT BufferLength2, SQLSMALLINT * NameLength2Ptr)} */
    public static short nSQLDataSources(long EnvironmentHandle, short Direction, long ServerName, short BufferLength1, long NameLength1Ptr, long Description, short BufferLength2, long NameLength2Ptr) {
        long __functionAddress = Functions.DataSources;
        if (CHECKS) {
            check(__functionAddress);
            check(EnvironmentHandle);
        }
        return callPCPSPPSPS(EnvironmentHandle, Direction, ServerName, BufferLength1, NameLength1Ptr, Description, BufferLength2, NameLength2Ptr, __functionAddress);
    }

    /** {@code SQLRETURN SQLDataSources(SQLHENV EnvironmentHandle, SQLUSMALLINT Direction, SQLWCHAR * ServerName, SQLSMALLINT BufferLength1, SQLSMALLINT * NameLength1Ptr, SQLWCHAR * Description, SQLSMALLINT BufferLength2, SQLSMALLINT * NameLength2Ptr)} */
    @NativeType("SQLRETURN")
    public static short SQLDataSources(@NativeType("SQLHENV") long EnvironmentHandle, @NativeType("SQLUSMALLINT") short Direction, @NativeType("SQLWCHAR *") @Nullable ByteBuffer ServerName, @NativeType("SQLSMALLINT *") ShortBuffer NameLength1Ptr, @NativeType("SQLWCHAR *") @Nullable ByteBuffer Description, @NativeType("SQLSMALLINT *") ShortBuffer NameLength2Ptr) {
        if (CHECKS) {
            check(NameLength1Ptr, 1);
            check(NameLength2Ptr, 1);
        }
        return nSQLDataSources(EnvironmentHandle, Direction, memAddressSafe(ServerName), (short)(remainingSafe(ServerName) >> 1), memAddress(NameLength1Ptr), memAddressSafe(Description), (short)(remainingSafe(Description) >> 1), memAddress(NameLength2Ptr));
    }

    // --- [ SQLGetInfo ] ---

    /** {@code SQLRETURN SQLGetInfo(SQLHDBC ConnectionHandle, SQLUSMALLINT InfoType, SQLPOINTER InfoValuePtr, SQLSMALLINT BufferLength, SQLSMALLINT * StringLengthPtr)} */
    public static short nSQLGetInfo(long ConnectionHandle, short InfoType, long InfoValuePtr, short BufferLength, long StringLengthPtr) {
        long __functionAddress = Functions.GetInfo;
        if (CHECKS) {
            check(ConnectionHandle);
        }
        return callPCPSPS(ConnectionHandle, InfoType, InfoValuePtr, BufferLength, StringLengthPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLGetInfo(SQLHDBC ConnectionHandle, SQLUSMALLINT InfoType, SQLPOINTER InfoValuePtr, SQLSMALLINT BufferLength, SQLSMALLINT * StringLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetInfo(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLUSMALLINT") short InfoType, @NativeType("SQLPOINTER") @Nullable ByteBuffer InfoValuePtr, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer StringLengthPtr) {
        if (CHECKS) {
            checkSafe(StringLengthPtr, 1);
        }
        return nSQLGetInfo(ConnectionHandle, InfoType, memAddressSafe(InfoValuePtr), (short)remainingSafe(InfoValuePtr), memAddressSafe(StringLengthPtr));
    }

    /** {@code SQLRETURN SQLGetInfo(SQLHDBC ConnectionHandle, SQLUSMALLINT InfoType, SQLPOINTER InfoValuePtr, SQLSMALLINT BufferLength, SQLSMALLINT * StringLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetInfo(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLUSMALLINT") short InfoType, @NativeType("SQLPOINTER") @Nullable ShortBuffer InfoValuePtr, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer StringLengthPtr) {
        if (CHECKS) {
            checkSafe(StringLengthPtr, 1);
        }
        return nSQLGetInfo(ConnectionHandle, InfoType, memAddressSafe(InfoValuePtr), (short)(remainingSafe(InfoValuePtr) << 1), memAddressSafe(StringLengthPtr));
    }

    /** {@code SQLRETURN SQLGetInfo(SQLHDBC ConnectionHandle, SQLUSMALLINT InfoType, SQLPOINTER InfoValuePtr, SQLSMALLINT BufferLength, SQLSMALLINT * StringLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetInfo(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLUSMALLINT") short InfoType, @NativeType("SQLPOINTER") @Nullable IntBuffer InfoValuePtr, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer StringLengthPtr) {
        if (CHECKS) {
            checkSafe(StringLengthPtr, 1);
        }
        return nSQLGetInfo(ConnectionHandle, InfoType, memAddressSafe(InfoValuePtr), (short)(remainingSafe(InfoValuePtr) << 2), memAddressSafe(StringLengthPtr));
    }

    /** {@code SQLRETURN SQLGetInfo(SQLHDBC ConnectionHandle, SQLUSMALLINT InfoType, SQLPOINTER InfoValuePtr, SQLSMALLINT BufferLength, SQLSMALLINT * StringLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetInfo(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLUSMALLINT") short InfoType, @NativeType("SQLPOINTER") @Nullable PointerBuffer InfoValuePtr, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer StringLengthPtr) {
        if (CHECKS) {
            checkSafe(StringLengthPtr, 1);
        }
        return nSQLGetInfo(ConnectionHandle, InfoType, memAddressSafe(InfoValuePtr), (short)(remainingSafe(InfoValuePtr) << POINTER_SHIFT), memAddressSafe(StringLengthPtr));
    }

    // --- [ SQLGetFunctions ] ---

    /** {@code SQLRETURN SQLGetFunctions(SQLHDBC ConnectionHandle, SQLUSMALLINT FunctionId, SQLUSMALLINT * SupportedPtr)} */
    public static short nSQLGetFunctions(long ConnectionHandle, short FunctionId, long SupportedPtr) {
        long __functionAddress = Functions.GetFunctions;
        if (CHECKS) {
            check(ConnectionHandle);
        }
        return callPCPS(ConnectionHandle, FunctionId, SupportedPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLGetFunctions(SQLHDBC ConnectionHandle, SQLUSMALLINT FunctionId, SQLUSMALLINT * SupportedPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetFunctions(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLUSMALLINT") short FunctionId, @NativeType("SQLUSMALLINT *") ShortBuffer SupportedPtr) {
        if (CHECKS) {
            check(SupportedPtr, 1);
        }
        return nSQLGetFunctions(ConnectionHandle, FunctionId, memAddress(SupportedPtr));
    }

    // --- [ SQLGetTypeInfo ] ---

    /** {@code SQLRETURN SQLGetTypeInfo(SQLHSTMT StatementHandle, SQLSMALLINT DataType)} */
    @NativeType("SQLRETURN")
    public static short SQLGetTypeInfo(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLSMALLINT") short DataType) {
        long __functionAddress = Functions.GetTypeInfo;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPSS(StatementHandle, DataType, __functionAddress);
    }

    // --- [ SQLSetConnectAttr ] ---

    /** {@code SQLRETURN SQLSetConnectAttr(SQLHDBC ConnectionHandle, SQLINTEGER Attribute, SQLPOINTER Value, SQLINTEGER StringLength)} */
    public static short nSQLSetConnectAttr(long ConnectionHandle, int Attribute, long Value, int StringLength) {
        long __functionAddress = Functions.SetConnectAttr;
        if (CHECKS) {
            check(ConnectionHandle);
        }
        return callPPS(ConnectionHandle, Attribute, Value, StringLength, __functionAddress);
    }

    /** {@code SQLRETURN SQLSetConnectAttr(SQLHDBC ConnectionHandle, SQLINTEGER Attribute, SQLPOINTER Value, SQLINTEGER StringLength)} */
    @NativeType("SQLRETURN")
    public static short SQLSetConnectAttr(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLINTEGER") int Attribute, @NativeType("SQLPOINTER") @Nullable ByteBuffer Value) {
        return nSQLSetConnectAttr(ConnectionHandle, Attribute, memAddressSafe(Value), remainingSafe(Value));
    }

    // --- [ SQLGetConnectAttr ] ---

    /** {@code SQLRETURN SQLGetConnectAttr(SQLHDBC ConnectionHandle, SQLINTEGER Attribute, SQLPOINTER ValuePtr, SQLINTEGER BufferLength, SQLINTEGER * StringLengthPtr)} */
    public static short nSQLGetConnectAttr(long ConnectionHandle, int Attribute, long ValuePtr, int BufferLength, long StringLengthPtr) {
        long __functionAddress = Functions.GetConnectAttr;
        if (CHECKS) {
            check(ConnectionHandle);
        }
        return callPPPS(ConnectionHandle, Attribute, ValuePtr, BufferLength, StringLengthPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLGetConnectAttr(SQLHDBC ConnectionHandle, SQLINTEGER Attribute, SQLPOINTER ValuePtr, SQLINTEGER BufferLength, SQLINTEGER * StringLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetConnectAttr(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLINTEGER") int Attribute, @NativeType("SQLPOINTER") @Nullable ByteBuffer ValuePtr, @NativeType("SQLINTEGER *") IntBuffer StringLengthPtr) {
        if (CHECKS) {
            check(StringLengthPtr, 1);
        }
        return nSQLGetConnectAttr(ConnectionHandle, Attribute, memAddressSafe(ValuePtr), remainingSafe(ValuePtr), memAddress(StringLengthPtr));
    }

    // --- [ SQLSetEnvAttr ] ---

    /** {@code SQLRETURN SQLSetEnvAttr(SQLHENV EnvironmentHandle, SQLINTEGER Attribute, SQLPOINTER Value, SQLINTEGER StringLength)} */
    public static short nSQLSetEnvAttr(long EnvironmentHandle, int Attribute, long Value, int StringLength) {
        long __functionAddress = Functions.SetEnvAttr;
        return callPPS(EnvironmentHandle, Attribute, Value, StringLength, __functionAddress);
    }

    /** {@code SQLRETURN SQLSetEnvAttr(SQLHENV EnvironmentHandle, SQLINTEGER Attribute, SQLPOINTER Value, SQLINTEGER StringLength)} */
    @NativeType("SQLRETURN")
    public static short SQLSetEnvAttr(@NativeType("SQLHENV") long EnvironmentHandle, @NativeType("SQLINTEGER") int Attribute, @NativeType("SQLPOINTER") @Nullable ByteBuffer Value) {
        return nSQLSetEnvAttr(EnvironmentHandle, Attribute, memAddressSafe(Value), remainingSafe(Value));
    }

    // --- [ SQLGetEnvAttr ] ---

    /** {@code SQLRETURN SQLGetEnvAttr(SQLHENV EnvironmentHandle, SQLINTEGER Attribute, SQLPOINTER ValuePtr, SQLINTEGER BufferLength, SQLINTEGER * StringLengthPtr)} */
    public static short nSQLGetEnvAttr(long EnvironmentHandle, int Attribute, long ValuePtr, int BufferLength, long StringLengthPtr) {
        long __functionAddress = Functions.GetEnvAttr;
        if (CHECKS) {
            check(EnvironmentHandle);
        }
        return callPPPS(EnvironmentHandle, Attribute, ValuePtr, BufferLength, StringLengthPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLGetEnvAttr(SQLHENV EnvironmentHandle, SQLINTEGER Attribute, SQLPOINTER ValuePtr, SQLINTEGER BufferLength, SQLINTEGER * StringLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetEnvAttr(@NativeType("SQLHENV") long EnvironmentHandle, @NativeType("SQLINTEGER") int Attribute, @NativeType("SQLPOINTER") @Nullable ByteBuffer ValuePtr, @NativeType("SQLINTEGER *") IntBuffer StringLengthPtr) {
        if (CHECKS) {
            check(StringLengthPtr, 1);
        }
        return nSQLGetEnvAttr(EnvironmentHandle, Attribute, memAddressSafe(ValuePtr), remainingSafe(ValuePtr), memAddress(StringLengthPtr));
    }

    // --- [ SQLSetStmtAttr ] ---

    /** {@code SQLRETURN SQLSetStmtAttr(SQLHSTMT StatementHandle, SQLINTEGER Attribute, SQLPOINTER Value, SQLINTEGER StringLength)} */
    public static short nSQLSetStmtAttr(long StatementHandle, int Attribute, long Value, int StringLength) {
        long __functionAddress = Functions.SetStmtAttr;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPS(StatementHandle, Attribute, Value, StringLength, __functionAddress);
    }

    /** {@code SQLRETURN SQLSetStmtAttr(SQLHSTMT StatementHandle, SQLINTEGER Attribute, SQLPOINTER Value, SQLINTEGER StringLength)} */
    @NativeType("SQLRETURN")
    public static short SQLSetStmtAttr(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLINTEGER") int Attribute, @NativeType("SQLPOINTER") @Nullable ByteBuffer Value) {
        return nSQLSetStmtAttr(StatementHandle, Attribute, memAddressSafe(Value), remainingSafe(Value));
    }

    // --- [ SQLGetStmtAttr ] ---

    /** {@code SQLRETURN SQLGetStmtAttr(SQLHSTMT StatementHandle, SQLINTEGER Attribute, SQLPOINTER ValuePtr, SQLINTEGER BufferLength, SQLINTEGER * StringLengthPtr)} */
    public static short nSQLGetStmtAttr(long StatementHandle, int Attribute, long ValuePtr, int BufferLength, long StringLengthPtr) {
        long __functionAddress = Functions.GetStmtAttr;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPPS(StatementHandle, Attribute, ValuePtr, BufferLength, StringLengthPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLGetStmtAttr(SQLHSTMT StatementHandle, SQLINTEGER Attribute, SQLPOINTER ValuePtr, SQLINTEGER BufferLength, SQLINTEGER * StringLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetStmtAttr(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLINTEGER") int Attribute, @NativeType("SQLPOINTER") @Nullable ByteBuffer ValuePtr, @NativeType("SQLINTEGER *") @Nullable IntBuffer StringLengthPtr) {
        if (CHECKS) {
            checkSafe(StringLengthPtr, 1);
        }
        return nSQLGetStmtAttr(StatementHandle, Attribute, memAddressSafe(ValuePtr), remainingSafe(ValuePtr), memAddressSafe(StringLengthPtr));
    }

    // --- [ SQLGetDescField ] ---

    /** {@code SQLRETURN SQLGetDescField(SQLHDESC DescriptorHandle, SQLSMALLINT RecNumber, SQLSMALLINT FieldIdentifier, SQLPOINTER ValuePtr, SQLINTEGER BufferLength, SQLINTEGER * StringLengthPtr)} */
    public static short nSQLGetDescField(long DescriptorHandle, short RecNumber, short FieldIdentifier, long ValuePtr, int BufferLength, long StringLengthPtr) {
        long __functionAddress = Functions.GetDescField;
        if (CHECKS) {
            check(DescriptorHandle);
        }
        return callPSSPPS(DescriptorHandle, RecNumber, FieldIdentifier, ValuePtr, BufferLength, StringLengthPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLGetDescField(SQLHDESC DescriptorHandle, SQLSMALLINT RecNumber, SQLSMALLINT FieldIdentifier, SQLPOINTER ValuePtr, SQLINTEGER BufferLength, SQLINTEGER * StringLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetDescField(@NativeType("SQLHDESC") long DescriptorHandle, @NativeType("SQLSMALLINT") short RecNumber, @NativeType("SQLSMALLINT") short FieldIdentifier, @NativeType("SQLPOINTER") @Nullable ByteBuffer ValuePtr, @NativeType("SQLINTEGER *") @Nullable IntBuffer StringLengthPtr) {
        if (CHECKS) {
            checkSafe(StringLengthPtr, 1);
        }
        return nSQLGetDescField(DescriptorHandle, RecNumber, FieldIdentifier, memAddressSafe(ValuePtr), remainingSafe(ValuePtr), memAddressSafe(StringLengthPtr));
    }

    // --- [ SQLGetDescRec ] ---

    /** {@code SQLRETURN SQLGetDescRec(SQLHDESC DescriptorHandle, SQLSMALLINT RecNumber, SQLWCHAR * Name, SQLSMALLINT BufferLength, SQLSMALLINT * StringLengthPtr, SQLSMALLINT * TypePtr, SQLSMALLINT * SubTypePtr, SQLLEN * LengthPtr, SQLSMALLINT * PrecisionPtr, SQLSMALLINT * ScalePtr, SQLSMALLINT * NullablePtr)} */
    public static short nSQLGetDescRec(long DescriptorHandle, short RecNumber, long Name, short BufferLength, long StringLengthPtr, long TypePtr, long SubTypePtr, long LengthPtr, long PrecisionPtr, long ScalePtr, long NullablePtr) {
        long __functionAddress = Functions.GetDescRec;
        if (CHECKS) {
            check(DescriptorHandle);
        }
        return callPSPSPPPPPPPS(DescriptorHandle, RecNumber, Name, BufferLength, StringLengthPtr, TypePtr, SubTypePtr, LengthPtr, PrecisionPtr, ScalePtr, NullablePtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLGetDescRec(SQLHDESC DescriptorHandle, SQLSMALLINT RecNumber, SQLWCHAR * Name, SQLSMALLINT BufferLength, SQLSMALLINT * StringLengthPtr, SQLSMALLINT * TypePtr, SQLSMALLINT * SubTypePtr, SQLLEN * LengthPtr, SQLSMALLINT * PrecisionPtr, SQLSMALLINT * ScalePtr, SQLSMALLINT * NullablePtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetDescRec(@NativeType("SQLHDESC") long DescriptorHandle, @NativeType("SQLSMALLINT") short RecNumber, @NativeType("SQLWCHAR *") @Nullable ByteBuffer Name, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer StringLengthPtr, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer TypePtr, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer SubTypePtr, @NativeType("SQLLEN *") @Nullable PointerBuffer LengthPtr, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer PrecisionPtr, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer ScalePtr, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer NullablePtr) {
        if (CHECKS) {
            checkSafe(StringLengthPtr, 1);
            checkSafe(TypePtr, 1);
            checkSafe(SubTypePtr, 1);
            checkSafe(LengthPtr, 1);
            checkSafe(PrecisionPtr, 1);
            checkSafe(ScalePtr, 1);
            checkSafe(NullablePtr, 1);
        }
        return nSQLGetDescRec(DescriptorHandle, RecNumber, memAddressSafe(Name), (short)(remainingSafe(Name) >> 1), memAddressSafe(StringLengthPtr), memAddressSafe(TypePtr), memAddressSafe(SubTypePtr), memAddressSafe(LengthPtr), memAddressSafe(PrecisionPtr), memAddressSafe(ScalePtr), memAddressSafe(NullablePtr));
    }

    // --- [ SQLSetDescField ] ---

    /** {@code SQLRETURN SQLSetDescField(SQLHDESC DescriptorHandle, SQLSMALLINT RecNumber, SQLSMALLINT FieldIdentifier, SQLPOINTER ValuePtr, SQLINTEGER BufferLength)} */
    public static short nSQLSetDescField(long DescriptorHandle, short RecNumber, short FieldIdentifier, long ValuePtr, int BufferLength) {
        long __functionAddress = Functions.SetDescField;
        if (CHECKS) {
            check(DescriptorHandle);
        }
        return callPSSPS(DescriptorHandle, RecNumber, FieldIdentifier, ValuePtr, BufferLength, __functionAddress);
    }

    /** {@code SQLRETURN SQLSetDescField(SQLHDESC DescriptorHandle, SQLSMALLINT RecNumber, SQLSMALLINT FieldIdentifier, SQLPOINTER ValuePtr, SQLINTEGER BufferLength)} */
    @NativeType("SQLRETURN")
    public static short SQLSetDescField(@NativeType("SQLHDESC") long DescriptorHandle, @NativeType("SQLSMALLINT") short RecNumber, @NativeType("SQLSMALLINT") short FieldIdentifier, @NativeType("SQLPOINTER") ByteBuffer ValuePtr) {
        return nSQLSetDescField(DescriptorHandle, RecNumber, FieldIdentifier, memAddress(ValuePtr), ValuePtr.remaining());
    }

    // --- [ SQLSetDescRec ] ---

    /** {@code SQLRETURN SQLSetDescRec(SQLHDESC DescriptorHandle, SQLSMALLINT RecNumber, SQLSMALLINT Type, SQLSMALLINT SubType, SQLLEN Length, SQLSMALLINT Precision, SQLSMALLINT Scale, SQLPOINTER DataPtr, SQLLEN * StringLengthPtr, SQLLEN * IndicatorPtr)} */
    public static short nSQLSetDescRec(long DescriptorHandle, short RecNumber, short Type, short SubType, long Length, short Precision, short Scale, long DataPtr, long StringLengthPtr, long IndicatorPtr) {
        long __functionAddress = Functions.SetDescRec;
        if (CHECKS) {
            check(DescriptorHandle);
        }
        return callPSSSPSSPPPS(DescriptorHandle, RecNumber, Type, SubType, Length, Precision, Scale, DataPtr, StringLengthPtr, IndicatorPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLSetDescRec(SQLHDESC DescriptorHandle, SQLSMALLINT RecNumber, SQLSMALLINT Type, SQLSMALLINT SubType, SQLLEN Length, SQLSMALLINT Precision, SQLSMALLINT Scale, SQLPOINTER DataPtr, SQLLEN * StringLengthPtr, SQLLEN * IndicatorPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLSetDescRec(@NativeType("SQLHDESC") long DescriptorHandle, @NativeType("SQLSMALLINT") short RecNumber, @NativeType("SQLSMALLINT") short Type, @NativeType("SQLSMALLINT") short SubType, @NativeType("SQLLEN") long Length, @NativeType("SQLSMALLINT") short Precision, @NativeType("SQLSMALLINT") short Scale, @NativeType("SQLPOINTER") @Nullable ByteBuffer DataPtr, @NativeType("SQLLEN *") @Nullable PointerBuffer StringLengthPtr, @NativeType("SQLLEN *") @Nullable PointerBuffer IndicatorPtr) {
        if (CHECKS) {
            checkSafe(DataPtr, 1);
            checkSafe(StringLengthPtr, 1);
            checkSafe(IndicatorPtr, 1);
        }
        return nSQLSetDescRec(DescriptorHandle, RecNumber, Type, SubType, Length, Precision, Scale, memAddressSafe(DataPtr), memAddressSafe(StringLengthPtr), memAddressSafe(IndicatorPtr));
    }

    // --- [ SQLCopyDesc ] ---

    /** {@code SQLRETURN SQLCopyDesc(SQLHDESC SourceDescHandle, SQLHDESC TargetDescHandle)} */
    @NativeType("SQLRETURN")
    public static short SQLCopyDesc(@NativeType("SQLHDESC") long SourceDescHandle, @NativeType("SQLHDESC") long TargetDescHandle) {
        long __functionAddress = Functions.CopyDesc;
        if (CHECKS) {
            check(SourceDescHandle);
            check(TargetDescHandle);
        }
        return callPPS(SourceDescHandle, TargetDescHandle, __functionAddress);
    }

    // --- [ SQLPrepare ] ---

    /** {@code SQLRETURN SQLPrepare(SQLHSTMT StatementHandle, SQLWCHAR * StatementText, SQLINTEGER TextLength)} */
    public static short nSQLPrepare(long StatementHandle, long StatementText, int TextLength) {
        long __functionAddress = Functions.Prepare;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPS(StatementHandle, StatementText, TextLength, __functionAddress);
    }

    /** {@code SQLRETURN SQLPrepare(SQLHSTMT StatementHandle, SQLWCHAR * StatementText, SQLINTEGER TextLength)} */
    @NativeType("SQLRETURN")
    public static short SQLPrepare(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLWCHAR *") ByteBuffer StatementText) {
        return nSQLPrepare(StatementHandle, memAddress(StatementText), StatementText.remaining() >> 1);
    }

    /** {@code SQLRETURN SQLPrepare(SQLHSTMT StatementHandle, SQLWCHAR * StatementText, SQLINTEGER TextLength)} */
    @NativeType("SQLRETURN")
    public static short SQLPrepare(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLWCHAR *") CharSequence StatementText) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int StatementTextEncodedLength = stack.nUTF16(StatementText, false);
            long StatementTextEncoded = stack.getPointerAddress();
            return nSQLPrepare(StatementHandle, StatementTextEncoded, StatementTextEncodedLength >> 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SQLGetCursorName ] ---

    /** {@code SQLRETURN SQLGetCursorName(SQLHSTMT StatementHandle, SQLWCHAR * CursorName, SQLSMALLINT BufferLength, SQLSMALLINT * NameLengthPtr)} */
    public static short nSQLGetCursorName(long StatementHandle, long CursorName, short BufferLength, long NameLengthPtr) {
        long __functionAddress = Functions.GetCursorName;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPSPS(StatementHandle, CursorName, BufferLength, NameLengthPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLGetCursorName(SQLHSTMT StatementHandle, SQLWCHAR * CursorName, SQLSMALLINT BufferLength, SQLSMALLINT * NameLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetCursorName(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLWCHAR *") @Nullable ByteBuffer CursorName, @NativeType("SQLSMALLINT *") ShortBuffer NameLengthPtr) {
        if (CHECKS) {
            check(NameLengthPtr, 1);
        }
        return nSQLGetCursorName(StatementHandle, memAddressSafe(CursorName), (short)(remainingSafe(CursorName) >> 1), memAddress(NameLengthPtr));
    }

    // --- [ SQLSetCursorName ] ---

    /** {@code SQLRETURN SQLSetCursorName(SQLHSTMT StatementHandle, SQLWCHAR * CursorName, SQLSMALLINT NameLength)} */
    public static short nSQLSetCursorName(long StatementHandle, long CursorName, short NameLength) {
        long __functionAddress = Functions.SetCursorName;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPSS(StatementHandle, CursorName, NameLength, __functionAddress);
    }

    /** {@code SQLRETURN SQLSetCursorName(SQLHSTMT StatementHandle, SQLWCHAR * CursorName, SQLSMALLINT NameLength)} */
    @NativeType("SQLRETURN")
    public static short SQLSetCursorName(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLWCHAR *") ByteBuffer CursorName) {
        return nSQLSetCursorName(StatementHandle, memAddress(CursorName), (short)(CursorName.remaining() >> 1));
    }

    // --- [ SQLExecute ] ---

    /** {@code SQLRETURN SQLExecute(SQLHSTMT StatementHandle)} */
    @NativeType("SQLRETURN")
    public static short SQLExecute(@NativeType("SQLHSTMT") long StatementHandle) {
        long __functionAddress = Functions.Execute;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPS(StatementHandle, __functionAddress);
    }

    // --- [ SQLExecDirect ] ---

    /** {@code SQLRETURN SQLExecDirect(SQLHSTMT StatementHandle, SQLWCHAR * StatementText, SQLINTEGER TextLength)} */
    public static short nSQLExecDirect(long StatementHandle, long StatementText, int TextLength) {
        long __functionAddress = Functions.ExecDirect;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPS(StatementHandle, StatementText, TextLength, __functionAddress);
    }

    /** {@code SQLRETURN SQLExecDirect(SQLHSTMT StatementHandle, SQLWCHAR * StatementText, SQLINTEGER TextLength)} */
    @NativeType("SQLRETURN")
    public static short SQLExecDirect(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLWCHAR *") ByteBuffer StatementText) {
        return nSQLExecDirect(StatementHandle, memAddress(StatementText), StatementText.remaining() >> 1);
    }

    /** {@code SQLRETURN SQLExecDirect(SQLHSTMT StatementHandle, SQLWCHAR * StatementText, SQLINTEGER TextLength)} */
    @NativeType("SQLRETURN")
    public static short SQLExecDirect(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLWCHAR *") CharSequence StatementText) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int StatementTextEncodedLength = stack.nUTF16(StatementText, false);
            long StatementTextEncoded = stack.getPointerAddress();
            return nSQLExecDirect(StatementHandle, StatementTextEncoded, StatementTextEncodedLength >> 1);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SQLParamData ] ---

    /** {@code SQLRETURN SQLParamData(SQLHSTMT StatementHandle, SQLPOINTER * ValuePtrPtr)} */
    public static short nSQLParamData(long StatementHandle, long ValuePtrPtr) {
        long __functionAddress = Functions.ParamData;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPS(StatementHandle, ValuePtrPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLParamData(SQLHSTMT StatementHandle, SQLPOINTER * ValuePtrPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLParamData(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLPOINTER *") PointerBuffer ValuePtrPtr) {
        if (CHECKS) {
            check(ValuePtrPtr, 1);
        }
        return nSQLParamData(StatementHandle, memAddress(ValuePtrPtr));
    }

    // --- [ SQLPutData ] ---

    /** {@code SQLRETURN SQLPutData(SQLHSTMT StatementHandle, SQLPOINTER DataPtr, SQLLEN StrLen_or_Ind)} */
    public static short nSQLPutData(long StatementHandle, long DataPtr, long StrLen_or_Ind) {
        long __functionAddress = Functions.PutData;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPPS(StatementHandle, DataPtr, StrLen_or_Ind, __functionAddress);
    }

    /** {@code SQLRETURN SQLPutData(SQLHSTMT StatementHandle, SQLPOINTER DataPtr, SQLLEN StrLen_or_Ind)} */
    @NativeType("SQLRETURN")
    public static short SQLPutData(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLPOINTER") ByteBuffer DataPtr) {
        return nSQLPutData(StatementHandle, memAddress(DataPtr), DataPtr.remaining());
    }

    // --- [ SQLRowCount ] ---

    /** {@code SQLRETURN SQLRowCount(SQLHSTMT StatementHandle, SQLLEN * RowCountPtr)} */
    public static short nSQLRowCount(long StatementHandle, long RowCountPtr) {
        long __functionAddress = Functions.RowCount;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPS(StatementHandle, RowCountPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLRowCount(SQLHSTMT StatementHandle, SQLLEN * RowCountPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLRowCount(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLLEN *") PointerBuffer RowCountPtr) {
        if (CHECKS) {
            check(RowCountPtr, 1);
        }
        return nSQLRowCount(StatementHandle, memAddress(RowCountPtr));
    }

    // --- [ SQLNumResultCols ] ---

    /** {@code SQLRETURN SQLNumResultCols(SQLHSTMT StatementHandle, SQLSMALLINT * ColumnCountPtr)} */
    public static short nSQLNumResultCols(long StatementHandle, long ColumnCountPtr) {
        long __functionAddress = Functions.NumResultCols;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPS(StatementHandle, ColumnCountPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLNumResultCols(SQLHSTMT StatementHandle, SQLSMALLINT * ColumnCountPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLNumResultCols(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLSMALLINT *") ShortBuffer ColumnCountPtr) {
        if (CHECKS) {
            check(ColumnCountPtr, 1);
        }
        return nSQLNumResultCols(StatementHandle, memAddress(ColumnCountPtr));
    }

    // --- [ SQLDescribeCol ] ---

    /** {@code SQLRETURN SQLDescribeCol(SQLHSTMT StatementHandle, SQLUSMALLINT ColumnNumber, SQLWCHAR * ColumnName, SQLSMALLINT BufferLength, SQLSMALLINT * NameLengthPtr, SQLSMALLINT * DataTypePtr, SQLULEN * ColumnSizePtr, SQLSMALLINT * DecimalDigitsPtr, SQLSMALLINT * NullablePtr)} */
    public static short nSQLDescribeCol(long StatementHandle, short ColumnNumber, long ColumnName, short BufferLength, long NameLengthPtr, long DataTypePtr, long ColumnSizePtr, long DecimalDigitsPtr, long NullablePtr) {
        long __functionAddress = Functions.DescribeCol;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPCPSPPPPPS(StatementHandle, ColumnNumber, ColumnName, BufferLength, NameLengthPtr, DataTypePtr, ColumnSizePtr, DecimalDigitsPtr, NullablePtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLDescribeCol(SQLHSTMT StatementHandle, SQLUSMALLINT ColumnNumber, SQLWCHAR * ColumnName, SQLSMALLINT BufferLength, SQLSMALLINT * NameLengthPtr, SQLSMALLINT * DataTypePtr, SQLULEN * ColumnSizePtr, SQLSMALLINT * DecimalDigitsPtr, SQLSMALLINT * NullablePtr)} */
    @NativeType("SQLRETURN")
    public static short SQLDescribeCol(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short ColumnNumber, @NativeType("SQLWCHAR *") @Nullable ByteBuffer ColumnName, @NativeType("SQLSMALLINT *") ShortBuffer NameLengthPtr, @NativeType("SQLSMALLINT *") ShortBuffer DataTypePtr, @NativeType("SQLULEN *") PointerBuffer ColumnSizePtr, @NativeType("SQLSMALLINT *") ShortBuffer DecimalDigitsPtr, @NativeType("SQLSMALLINT *") ShortBuffer NullablePtr) {
        if (CHECKS) {
            check(NameLengthPtr, 1);
            check(DataTypePtr, 1);
            check(ColumnSizePtr, 1);
            check(DecimalDigitsPtr, 1);
            check(NullablePtr, 1);
        }
        return nSQLDescribeCol(StatementHandle, ColumnNumber, memAddressSafe(ColumnName), (short)(remainingSafe(ColumnName) >> 1), memAddress(NameLengthPtr), memAddress(DataTypePtr), memAddress(ColumnSizePtr), memAddress(DecimalDigitsPtr), memAddress(NullablePtr));
    }

    // --- [ SQLColAttribute ] ---

    /** {@code SQLRETURN SQLColAttribute(SQLHSTMT StatementHandle, SQLUSMALLINT ColumnNumber, SQLUSMALLINT FieldIdentifier, SQLPOINTER CharacterAttributePtr, SQLSMALLINT BufferLength, SQLSMALLINT * StringLengthPtr, SQLLEN * NumericAttributePtr)} */
    public static short nSQLColAttribute(long StatementHandle, short ColumnNumber, short FieldIdentifier, long CharacterAttributePtr, short BufferLength, long StringLengthPtr, long NumericAttributePtr) {
        long __functionAddress = Functions.ColAttribute;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPCCPSPPS(StatementHandle, ColumnNumber, FieldIdentifier, CharacterAttributePtr, BufferLength, StringLengthPtr, NumericAttributePtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLColAttribute(SQLHSTMT StatementHandle, SQLUSMALLINT ColumnNumber, SQLUSMALLINT FieldIdentifier, SQLPOINTER CharacterAttributePtr, SQLSMALLINT BufferLength, SQLSMALLINT * StringLengthPtr, SQLLEN * NumericAttributePtr)} */
    @NativeType("SQLRETURN")
    public static short SQLColAttribute(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short ColumnNumber, @NativeType("SQLUSMALLINT") short FieldIdentifier, @NativeType("SQLPOINTER") @Nullable ByteBuffer CharacterAttributePtr, @NativeType("SQLSMALLINT *") ShortBuffer StringLengthPtr, @NativeType("SQLLEN *") PointerBuffer NumericAttributePtr) {
        if (CHECKS) {
            check(StringLengthPtr, 1);
            check(NumericAttributePtr, 1);
        }
        return nSQLColAttribute(StatementHandle, ColumnNumber, FieldIdentifier, memAddressSafe(CharacterAttributePtr), (short)remainingSafe(CharacterAttributePtr), memAddress(StringLengthPtr), memAddress(NumericAttributePtr));
    }

    // --- [ SQLBindCol ] ---

    /** {@code SQLRETURN SQLBindCol(SQLHSTMT StatementHandle, SQLUSMALLINT ColumnNumber, SQLSMALLINT TargetType, SQLPOINTER TargetValuePtr, SQLLEN BufferLength, SQLLEN * StrLen_or_Ind)} */
    public static short nSQLBindCol(long StatementHandle, short ColumnNumber, short TargetType, long TargetValuePtr, long BufferLength, long StrLen_or_Ind) {
        long __functionAddress = Functions.BindCol;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPCSPPPS(StatementHandle, ColumnNumber, TargetType, TargetValuePtr, BufferLength, StrLen_or_Ind, __functionAddress);
    }

    /** {@code SQLRETURN SQLBindCol(SQLHSTMT StatementHandle, SQLUSMALLINT ColumnNumber, SQLSMALLINT TargetType, SQLPOINTER TargetValuePtr, SQLLEN BufferLength, SQLLEN * StrLen_or_Ind)} */
    @NativeType("SQLRETURN")
    public static short SQLBindCol(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short ColumnNumber, @NativeType("SQLSMALLINT") short TargetType, @NativeType("SQLPOINTER") @Nullable ByteBuffer TargetValuePtr, @NativeType("SQLLEN *") @Nullable PointerBuffer StrLen_or_Ind) {
        if (CHECKS) {
            checkSafe(StrLen_or_Ind, 1);
        }
        return nSQLBindCol(StatementHandle, ColumnNumber, TargetType, memAddressSafe(TargetValuePtr), remainingSafe(TargetValuePtr), memAddressSafe(StrLen_or_Ind));
    }

    /** {@code SQLRETURN SQLBindCol(SQLHSTMT StatementHandle, SQLUSMALLINT ColumnNumber, SQLSMALLINT TargetType, SQLPOINTER TargetValuePtr, SQLLEN BufferLength, SQLLEN * StrLen_or_Ind)} */
    @NativeType("SQLRETURN")
    public static short SQLBindCol(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short ColumnNumber, @NativeType("SQLSMALLINT") short TargetType, @NativeType("SQLPOINTER") @Nullable ShortBuffer TargetValuePtr, @NativeType("SQLLEN *") @Nullable PointerBuffer StrLen_or_Ind) {
        if (CHECKS) {
            checkSafe(StrLen_or_Ind, 1);
        }
        return nSQLBindCol(StatementHandle, ColumnNumber, TargetType, memAddressSafe(TargetValuePtr), Integer.toUnsignedLong(remainingSafe(TargetValuePtr)) << 1, memAddressSafe(StrLen_or_Ind));
    }

    /** {@code SQLRETURN SQLBindCol(SQLHSTMT StatementHandle, SQLUSMALLINT ColumnNumber, SQLSMALLINT TargetType, SQLPOINTER TargetValuePtr, SQLLEN BufferLength, SQLLEN * StrLen_or_Ind)} */
    @NativeType("SQLRETURN")
    public static short SQLBindCol(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short ColumnNumber, @NativeType("SQLSMALLINT") short TargetType, @NativeType("SQLPOINTER") @Nullable IntBuffer TargetValuePtr, @NativeType("SQLLEN *") @Nullable PointerBuffer StrLen_or_Ind) {
        if (CHECKS) {
            checkSafe(StrLen_or_Ind, 1);
        }
        return nSQLBindCol(StatementHandle, ColumnNumber, TargetType, memAddressSafe(TargetValuePtr), Integer.toUnsignedLong(remainingSafe(TargetValuePtr)) << 2, memAddressSafe(StrLen_or_Ind));
    }

    /** {@code SQLRETURN SQLBindCol(SQLHSTMT StatementHandle, SQLUSMALLINT ColumnNumber, SQLSMALLINT TargetType, SQLPOINTER TargetValuePtr, SQLLEN BufferLength, SQLLEN * StrLen_or_Ind)} */
    @NativeType("SQLRETURN")
    public static short SQLBindCol(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short ColumnNumber, @NativeType("SQLSMALLINT") short TargetType, @NativeType("SQLPOINTER") @Nullable LongBuffer TargetValuePtr, @NativeType("SQLLEN *") @Nullable PointerBuffer StrLen_or_Ind) {
        if (CHECKS) {
            checkSafe(StrLen_or_Ind, 1);
        }
        return nSQLBindCol(StatementHandle, ColumnNumber, TargetType, memAddressSafe(TargetValuePtr), Integer.toUnsignedLong(remainingSafe(TargetValuePtr)) << 3, memAddressSafe(StrLen_or_Ind));
    }

    /** {@code SQLRETURN SQLBindCol(SQLHSTMT StatementHandle, SQLUSMALLINT ColumnNumber, SQLSMALLINT TargetType, SQLPOINTER TargetValuePtr, SQLLEN BufferLength, SQLLEN * StrLen_or_Ind)} */
    @NativeType("SQLRETURN")
    public static short SQLBindCol(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short ColumnNumber, @NativeType("SQLSMALLINT") short TargetType, @NativeType("SQLPOINTER") @Nullable FloatBuffer TargetValuePtr, @NativeType("SQLLEN *") @Nullable PointerBuffer StrLen_or_Ind) {
        if (CHECKS) {
            checkSafe(StrLen_or_Ind, 1);
        }
        return nSQLBindCol(StatementHandle, ColumnNumber, TargetType, memAddressSafe(TargetValuePtr), Integer.toUnsignedLong(remainingSafe(TargetValuePtr)) << 2, memAddressSafe(StrLen_or_Ind));
    }

    /** {@code SQLRETURN SQLBindCol(SQLHSTMT StatementHandle, SQLUSMALLINT ColumnNumber, SQLSMALLINT TargetType, SQLPOINTER TargetValuePtr, SQLLEN BufferLength, SQLLEN * StrLen_or_Ind)} */
    @NativeType("SQLRETURN")
    public static short SQLBindCol(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short ColumnNumber, @NativeType("SQLSMALLINT") short TargetType, @NativeType("SQLPOINTER") @Nullable DoubleBuffer TargetValuePtr, @NativeType("SQLLEN *") @Nullable PointerBuffer StrLen_or_Ind) {
        if (CHECKS) {
            checkSafe(StrLen_or_Ind, 1);
        }
        return nSQLBindCol(StatementHandle, ColumnNumber, TargetType, memAddressSafe(TargetValuePtr), Integer.toUnsignedLong(remainingSafe(TargetValuePtr)) << 3, memAddressSafe(StrLen_or_Ind));
    }

    // --- [ SQLFetch ] ---

    /** {@code SQLRETURN SQLFetch(SQLHSTMT StatementHandle)} */
    @NativeType("SQLRETURN")
    public static short SQLFetch(@NativeType("SQLHSTMT") long StatementHandle) {
        long __functionAddress = Functions.Fetch;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPS(StatementHandle, __functionAddress);
    }

    // --- [ SQLFetchScroll ] ---

    /** {@code SQLRETURN SQLFetchScroll(SQLHSTMT StatementHandle, SQLSMALLINT FetchOrientation, SQLLEN FetchOffset)} */
    @NativeType("SQLRETURN")
    public static short SQLFetchScroll(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLSMALLINT") short FetchOrientation, @NativeType("SQLLEN") long FetchOffset) {
        long __functionAddress = Functions.FetchScroll;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPSPS(StatementHandle, FetchOrientation, FetchOffset, __functionAddress);
    }

    // --- [ SQLGetData ] ---

    /** {@code SQLRETURN SQLGetData(SQLHSTMT StatementHandle, SQLUSMALLINT Col_or_Param_Num, SQLSMALLINT TargetType, SQLPOINTER TargetValuePtr, SQLLEN BufferLength, SQLLEN * StrLen_or_IndPtr)} */
    public static short nSQLGetData(long StatementHandle, short Col_or_Param_Num, short TargetType, long TargetValuePtr, long BufferLength, long StrLen_or_IndPtr) {
        long __functionAddress = Functions.GetData;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPCSPPPS(StatementHandle, Col_or_Param_Num, TargetType, TargetValuePtr, BufferLength, StrLen_or_IndPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLGetData(SQLHSTMT StatementHandle, SQLUSMALLINT Col_or_Param_Num, SQLSMALLINT TargetType, SQLPOINTER TargetValuePtr, SQLLEN BufferLength, SQLLEN * StrLen_or_IndPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetData(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short Col_or_Param_Num, @NativeType("SQLSMALLINT") short TargetType, @NativeType("SQLPOINTER") ByteBuffer TargetValuePtr, @NativeType("SQLLEN *") PointerBuffer StrLen_or_IndPtr) {
        if (CHECKS) {
            check(StrLen_or_IndPtr, 1);
        }
        return nSQLGetData(StatementHandle, Col_or_Param_Num, TargetType, memAddress(TargetValuePtr), TargetValuePtr.remaining(), memAddress(StrLen_or_IndPtr));
    }

    // --- [ SQLGetDiagField ] ---

    /** {@code SQLRETURN SQLGetDiagField(SQLSMALLINT HandleType, SQLHANDLE Handle, SQLSMALLINT RecNumber, SQLSMALLINT DiagIdentifier, SQLPOINTER DiagInfoPtr, SQLSMALLINT BufferLength, SQLSMALLINT * StringLengthPtr)} */
    public static short nSQLGetDiagField(short HandleType, long Handle, short RecNumber, short DiagIdentifier, long DiagInfoPtr, short BufferLength, long StringLengthPtr) {
        long __functionAddress = Functions.GetDiagField;
        if (CHECKS) {
            check(Handle);
        }
        return callSPSSPSPS(HandleType, Handle, RecNumber, DiagIdentifier, DiagInfoPtr, BufferLength, StringLengthPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLGetDiagField(SQLSMALLINT HandleType, SQLHANDLE Handle, SQLSMALLINT RecNumber, SQLSMALLINT DiagIdentifier, SQLPOINTER DiagInfoPtr, SQLSMALLINT BufferLength, SQLSMALLINT * StringLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetDiagField(@NativeType("SQLSMALLINT") short HandleType, @NativeType("SQLHANDLE") long Handle, @NativeType("SQLSMALLINT") short RecNumber, @NativeType("SQLSMALLINT") short DiagIdentifier, @NativeType("SQLPOINTER") @Nullable ByteBuffer DiagInfoPtr, @NativeType("SQLSMALLINT *") ShortBuffer StringLengthPtr) {
        if (CHECKS) {
            check(StringLengthPtr, 1);
        }
        return nSQLGetDiagField(HandleType, Handle, RecNumber, DiagIdentifier, memAddressSafe(DiagInfoPtr), (short)remainingSafe(DiagInfoPtr), memAddress(StringLengthPtr));
    }

    // --- [ SQLGetDiagRec ] ---

    /** {@code SQLRETURN SQLGetDiagRec(SQLSMALLINT HandleType, SQLHANDLE Handle, SQLSMALLINT RecNumber, SQLWCHAR * SQLState, SQLINTEGER * NativeErrorPtr, SQLWCHAR * MessageText, SQLSMALLINT BufferLength, SQLSMALLINT * TextLengthPtr)} */
    public static short nSQLGetDiagRec(short HandleType, long Handle, short RecNumber, long SQLState, long NativeErrorPtr, long MessageText, short BufferLength, long TextLengthPtr) {
        long __functionAddress = Functions.GetDiagRec;
        if (CHECKS) {
            check(Handle);
        }
        return callSPSPPPSPS(HandleType, Handle, RecNumber, SQLState, NativeErrorPtr, MessageText, BufferLength, TextLengthPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLGetDiagRec(SQLSMALLINT HandleType, SQLHANDLE Handle, SQLSMALLINT RecNumber, SQLWCHAR * SQLState, SQLINTEGER * NativeErrorPtr, SQLWCHAR * MessageText, SQLSMALLINT BufferLength, SQLSMALLINT * TextLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLGetDiagRec(@NativeType("SQLSMALLINT") short HandleType, @NativeType("SQLHANDLE") long Handle, @NativeType("SQLSMALLINT") short RecNumber, @NativeType("SQLWCHAR *") ByteBuffer SQLState, @NativeType("SQLINTEGER *") IntBuffer NativeErrorPtr, @NativeType("SQLWCHAR *") @Nullable ByteBuffer MessageText, @NativeType("SQLSMALLINT *") ShortBuffer TextLengthPtr) {
        if (CHECKS) {
            check(SQLState, 6);
            check(NativeErrorPtr, 1);
            check(TextLengthPtr, 1);
        }
        return nSQLGetDiagRec(HandleType, Handle, RecNumber, memAddress(SQLState), memAddress(NativeErrorPtr), memAddressSafe(MessageText), (short)(remainingSafe(MessageText) >> 1), memAddress(TextLengthPtr));
    }

    // --- [ SQLFreeStmt ] ---

    /** {@code SQLRETURN SQLFreeStmt(SQLHSTMT StatementHandle, SQLUSMALLINT Option)} */
    @NativeType("SQLRETURN")
    public static short SQLFreeStmt(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short Option) {
        long __functionAddress = Functions.FreeStmt;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPCS(StatementHandle, Option, __functionAddress);
    }

    // --- [ SQLCloseCursor ] ---

    /** {@code SQLRETURN SQLCloseCursor(SQLHSTMT StatementHandle)} */
    @NativeType("SQLRETURN")
    public static short SQLCloseCursor(@NativeType("SQLHSTMT") long StatementHandle) {
        long __functionAddress = Functions.CloseCursor;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPS(StatementHandle, __functionAddress);
    }

    // --- [ SQLCancel ] ---

    /** {@code SQLRETURN SQLCancel(SQLHSTMT StatementHandle)} */
    @NativeType("SQLRETURN")
    public static short SQLCancel(@NativeType("SQLHSTMT") long StatementHandle) {
        long __functionAddress = Functions.Cancel;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPS(StatementHandle, __functionAddress);
    }

    // --- [ SQLCancelHandle ] ---

    /** {@code SQLRETURN SQLCancelHandle(SQLSMALLINT HandleType, SQLHANDLE Handle)} */
    @NativeType("SQLRETURN")
    public static short SQLCancelHandle(@NativeType("SQLSMALLINT") short HandleType, @NativeType("SQLHANDLE") long Handle) {
        long __functionAddress = Functions.CancelHandle;
        if (CHECKS) {
            check(__functionAddress);
            check(Handle);
        }
        return callSPS(HandleType, Handle, __functionAddress);
    }

    // --- [ SQLEndTran ] ---

    /** {@code SQLRETURN SQLEndTran(SQLSMALLINT HandleType, SQLHANDLE Handle, SQLSMALLINT CompletionType)} */
    @NativeType("SQLRETURN")
    public static short SQLEndTran(@NativeType("SQLSMALLINT") short HandleType, @NativeType("SQLHANDLE") long Handle, @NativeType("SQLSMALLINT") short CompletionType) {
        long __functionAddress = Functions.EndTran;
        if (CHECKS) {
            check(Handle);
        }
        return callSPSS(HandleType, Handle, CompletionType, __functionAddress);
    }

    // --- [ SQLDisconnect ] ---

    /** {@code SQLRETURN SQLDisconnect(SQLHDBC ConnectionHandle)} */
    @NativeType("SQLRETURN")
    public static short SQLDisconnect(@NativeType("SQLHDBC") long ConnectionHandle) {
        long __functionAddress = Functions.Disconnect;
        if (CHECKS) {
            check(ConnectionHandle);
        }
        return callPS(ConnectionHandle, __functionAddress);
    }

    // --- [ SQLFreeHandle ] ---

    /** {@code SQLRETURN SQLFreeHandle(SQLSMALLINT HandleType, SQLHANDLE Handle)} */
    @NativeType("SQLRETURN")
    public static short SQLFreeHandle(@NativeType("SQLSMALLINT") short HandleType, @NativeType("SQLHANDLE") long Handle) {
        long __functionAddress = Functions.FreeHandle;
        if (CHECKS) {
            check(Handle);
        }
        return callSPS(HandleType, Handle, __functionAddress);
    }

    // --- [ SQLCompleteAsync ] ---

    /** {@code SQLRETURN SQLCompleteAsync(SQLSMALLINT HandleType, SQLHANDLE Handle, RETCODE * AsyncRetCodePtr)} */
    public static short nSQLCompleteAsync(short HandleType, long Handle, long AsyncRetCodePtr) {
        long __functionAddress = Functions.CompleteAsync;
        if (CHECKS) {
            check(__functionAddress);
            check(Handle);
        }
        return callSPPS(HandleType, Handle, AsyncRetCodePtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLCompleteAsync(SQLSMALLINT HandleType, SQLHANDLE Handle, RETCODE * AsyncRetCodePtr)} */
    @NativeType("SQLRETURN")
    public static short SQLCompleteAsync(@NativeType("SQLSMALLINT") short HandleType, @NativeType("SQLHANDLE") long Handle, @NativeType("RETCODE *") ShortBuffer AsyncRetCodePtr) {
        if (CHECKS) {
            check(AsyncRetCodePtr, 1);
        }
        return nSQLCompleteAsync(HandleType, Handle, memAddress(AsyncRetCodePtr));
    }

    // --- [ SQLColumns ] ---

    /** {@code SQLRETURN SQLColumns(SQLHSTMT StatementHandle, SQLWCHAR * CatalogName, SQLSMALLINT NameLength1, SQLWCHAR * SchemaName, SQLSMALLINT NameLength2, SQLWCHAR * TableName, SQLSMALLINT NameLength3, SQLWCHAR * ColumnName, SQLSMALLINT NameLength4)} */
    public static short nSQLColumns(long StatementHandle, long CatalogName, short NameLength1, long SchemaName, short NameLength2, long TableName, short NameLength3, long ColumnName, short NameLength4) {
        long __functionAddress = Functions.Columns;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPSPSPSPSS(StatementHandle, CatalogName, NameLength1, SchemaName, NameLength2, TableName, NameLength3, ColumnName, NameLength4, __functionAddress);
    }

    /** {@code SQLRETURN SQLColumns(SQLHSTMT StatementHandle, SQLWCHAR * CatalogName, SQLSMALLINT NameLength1, SQLWCHAR * SchemaName, SQLSMALLINT NameLength2, SQLWCHAR * TableName, SQLSMALLINT NameLength3, SQLWCHAR * ColumnName, SQLSMALLINT NameLength4)} */
    @NativeType("SQLRETURN")
    public static short SQLColumns(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLWCHAR *") @Nullable ByteBuffer CatalogName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer SchemaName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer TableName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer ColumnName) {
        return nSQLColumns(StatementHandle, memAddressSafe(CatalogName), (short)(remainingSafe(CatalogName) >> 1), memAddressSafe(SchemaName), (short)(remainingSafe(SchemaName) >> 1), memAddressSafe(TableName), (short)(remainingSafe(TableName) >> 1), memAddressSafe(ColumnName), (short)(remainingSafe(ColumnName) >> 1));
    }

    // --- [ SQLSpecialColumns ] ---

    /** {@code SQLRETURN SQLSpecialColumns(SQLHSTMT StatementHandle, SQLUSMALLINT IdentifierType, SQLWCHAR * CatalogName, SQLSMALLINT NameLength1, SQLWCHAR * SchemaName, SQLSMALLINT NameLength2, SQLWCHAR * TableName, SQLSMALLINT NameLength3, SQLUSMALLINT Scope, SQLUSMALLINT Nullable)} */
    public static short nSQLSpecialColumns(long StatementHandle, short IdentifierType, long CatalogName, short NameLength1, long SchemaName, short NameLength2, long TableName, short NameLength3, short Scope, short Nullable) {
        long __functionAddress = Functions.SpecialColumns;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPCPSPSPSCCS(StatementHandle, IdentifierType, CatalogName, NameLength1, SchemaName, NameLength2, TableName, NameLength3, Scope, Nullable, __functionAddress);
    }

    /** {@code SQLRETURN SQLSpecialColumns(SQLHSTMT StatementHandle, SQLUSMALLINT IdentifierType, SQLWCHAR * CatalogName, SQLSMALLINT NameLength1, SQLWCHAR * SchemaName, SQLSMALLINT NameLength2, SQLWCHAR * TableName, SQLSMALLINT NameLength3, SQLUSMALLINT Scope, SQLUSMALLINT Nullable)} */
    @NativeType("SQLRETURN")
    public static short SQLSpecialColumns(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short IdentifierType, @NativeType("SQLWCHAR *") @Nullable ByteBuffer CatalogName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer SchemaName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer TableName, @NativeType("SQLUSMALLINT") short Scope, @NativeType("SQLUSMALLINT") short Nullable) {
        return nSQLSpecialColumns(StatementHandle, IdentifierType, memAddressSafe(CatalogName), (short)(remainingSafe(CatalogName) >> 1), memAddressSafe(SchemaName), (short)(remainingSafe(SchemaName) >> 1), memAddressSafe(TableName), (short)(remainingSafe(TableName) >> 1), Scope, Nullable);
    }

    // --- [ SQLStatistics ] ---

    /** {@code SQLRETURN SQLStatistics(SQLHSTMT StatementHandle, SQLWCHAR * CatalogName, SQLSMALLINT NameLength1, SQLWCHAR * SchemaName, SQLSMALLINT NameLength2, SQLWCHAR * TableName, SQLSMALLINT NameLength3, SQLUSMALLINT Unique, SQLUSMALLINT Reserved)} */
    public static short nSQLStatistics(long StatementHandle, long CatalogName, short NameLength1, long SchemaName, short NameLength2, long TableName, short NameLength3, short Unique, short Reserved) {
        long __functionAddress = Functions.Statistics;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPSPSPSCCS(StatementHandle, CatalogName, NameLength1, SchemaName, NameLength2, TableName, NameLength3, Unique, Reserved, __functionAddress);
    }

    /** {@code SQLRETURN SQLStatistics(SQLHSTMT StatementHandle, SQLWCHAR * CatalogName, SQLSMALLINT NameLength1, SQLWCHAR * SchemaName, SQLSMALLINT NameLength2, SQLWCHAR * TableName, SQLSMALLINT NameLength3, SQLUSMALLINT Unique, SQLUSMALLINT Reserved)} */
    @NativeType("SQLRETURN")
    public static short SQLStatistics(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLWCHAR *") @Nullable ByteBuffer CatalogName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer SchemaName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer TableName, @NativeType("SQLUSMALLINT") short Unique, @NativeType("SQLUSMALLINT") short Reserved) {
        return nSQLStatistics(StatementHandle, memAddressSafe(CatalogName), (short)(remainingSafe(CatalogName) >> 1), memAddressSafe(SchemaName), (short)(remainingSafe(SchemaName) >> 1), memAddressSafe(TableName), (short)(remainingSafe(TableName) >> 1), Unique, Reserved);
    }

    // --- [ SQLTables ] ---

    /** {@code SQLRETURN SQLTables(SQLHSTMT StatementHandle, SQLWCHAR * CatalogName, SQLSMALLINT NameLength1, SQLWCHAR * SchemaName, SQLSMALLINT NameLength2, SQLWCHAR * TableName, SQLSMALLINT NameLength3, SQLWCHAR * TableType, SQLSMALLINT NameLength4)} */
    public static short nSQLTables(long StatementHandle, long CatalogName, short NameLength1, long SchemaName, short NameLength2, long TableName, short NameLength3, long TableType, short NameLength4) {
        long __functionAddress = Functions.Tables;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPSPSPSPSS(StatementHandle, CatalogName, NameLength1, SchemaName, NameLength2, TableName, NameLength3, TableType, NameLength4, __functionAddress);
    }

    /** {@code SQLRETURN SQLTables(SQLHSTMT StatementHandle, SQLWCHAR * CatalogName, SQLSMALLINT NameLength1, SQLWCHAR * SchemaName, SQLSMALLINT NameLength2, SQLWCHAR * TableName, SQLSMALLINT NameLength3, SQLWCHAR * TableType, SQLSMALLINT NameLength4)} */
    @NativeType("SQLRETURN")
    public static short SQLTables(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLWCHAR *") @Nullable ByteBuffer CatalogName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer SchemaName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer TableName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer TableType) {
        return nSQLTables(StatementHandle, memAddressSafe(CatalogName), (short)(remainingSafe(CatalogName) >> 1), memAddressSafe(SchemaName), (short)(remainingSafe(SchemaName) >> 1), memAddressSafe(TableName), (short)(remainingSafe(TableName) >> 1), memAddressSafe(TableType), (short)(remainingSafe(TableType) >> 1));
    }

    // --- [ SQLTransact ] ---

    /** {@code SQLRETURN SQLTransact(SQLHENV EnvironmentHandle, SQLHDBC ConnectionHandle, SQLUSMALLINT CompletionType)} */
    @NativeType("SQLRETURN")
    public static short SQLTransact(@NativeType("SQLHENV") long EnvironmentHandle, @NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLUSMALLINT") short CompletionType) {
        long __functionAddress = Functions.Transact;
        if (CHECKS) {
            check(__functionAddress);
            check(EnvironmentHandle);
            check(ConnectionHandle);
        }
        return callPPCS(EnvironmentHandle, ConnectionHandle, CompletionType, __functionAddress);
    }

    // --- [ SQLDriverConnect ] ---

    /** {@code SQLRETURN SQLDriverConnect(SQLHDBC ConnectionHandle, SQLHWND WindowHandle, SQLWCHAR * InConnectionString, SQLSMALLINT StringLength1, SQLWCHAR * OutConnectionString, SQLSMALLINT BufferLength, SQLSMALLINT * StringLength2Ptr, SQLUSMALLINT DriverCompletion)} */
    public static short nSQLDriverConnect(long ConnectionHandle, long WindowHandle, long InConnectionString, short StringLength1, long OutConnectionString, short BufferLength, long StringLength2Ptr, short DriverCompletion) {
        long __functionAddress = Functions.DriverConnect;
        if (CHECKS) {
            check(ConnectionHandle);
        }
        return callPPPSPSPCS(ConnectionHandle, WindowHandle, InConnectionString, StringLength1, OutConnectionString, BufferLength, StringLength2Ptr, DriverCompletion, __functionAddress);
    }

    /** {@code SQLRETURN SQLDriverConnect(SQLHDBC ConnectionHandle, SQLHWND WindowHandle, SQLWCHAR * InConnectionString, SQLSMALLINT StringLength1, SQLWCHAR * OutConnectionString, SQLSMALLINT BufferLength, SQLSMALLINT * StringLength2Ptr, SQLUSMALLINT DriverCompletion)} */
    @NativeType("SQLRETURN")
    public static short SQLDriverConnect(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLHWND") long WindowHandle, @NativeType("SQLWCHAR *") ByteBuffer InConnectionString, @NativeType("SQLWCHAR *") @Nullable ByteBuffer OutConnectionString, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer StringLength2Ptr, @NativeType("SQLUSMALLINT") short DriverCompletion) {
        if (CHECKS) {
            checkSafe(StringLength2Ptr, 1);
        }
        return nSQLDriverConnect(ConnectionHandle, WindowHandle, memAddress(InConnectionString), (short)(InConnectionString.remaining() >> 1), memAddressSafe(OutConnectionString), (short)(remainingSafe(OutConnectionString) >> 1), memAddressSafe(StringLength2Ptr), DriverCompletion);
    }

    /** {@code SQLRETURN SQLDriverConnect(SQLHDBC ConnectionHandle, SQLHWND WindowHandle, SQLWCHAR * InConnectionString, SQLSMALLINT StringLength1, SQLWCHAR * OutConnectionString, SQLSMALLINT BufferLength, SQLSMALLINT * StringLength2Ptr, SQLUSMALLINT DriverCompletion)} */
    @NativeType("SQLRETURN")
    public static short SQLDriverConnect(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLHWND") long WindowHandle, @NativeType("SQLWCHAR *") CharSequence InConnectionString, @NativeType("SQLWCHAR *") @Nullable ByteBuffer OutConnectionString, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer StringLength2Ptr, @NativeType("SQLUSMALLINT") short DriverCompletion) {
        if (CHECKS) {
            checkSafe(StringLength2Ptr, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int InConnectionStringEncodedLength = stack.nUTF16(InConnectionString, false);
            long InConnectionStringEncoded = stack.getPointerAddress();
            return nSQLDriverConnect(ConnectionHandle, WindowHandle, InConnectionStringEncoded, (short)(InConnectionStringEncodedLength >> 1), memAddressSafe(OutConnectionString), (short)(remainingSafe(OutConnectionString) >> 1), memAddressSafe(StringLength2Ptr), DriverCompletion);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SQLBrowseConnect ] ---

    /** {@code SQLRETURN SQLBrowseConnect(SQLHDBC ConnectionHandle, SQLWCHAR * InConnectionString, SQLSMALLINT StringLength1, SQLWCHAR * OutConnectionString, SQLSMALLINT BufferLength, SQLSMALLINT * StringLength2Ptr)} */
    public static short nSQLBrowseConnect(long ConnectionHandle, long InConnectionString, short StringLength1, long OutConnectionString, short BufferLength, long StringLength2Ptr) {
        long __functionAddress = Functions.BrowseConnect;
        if (CHECKS) {
            check(ConnectionHandle);
        }
        return callPPSPSPS(ConnectionHandle, InConnectionString, StringLength1, OutConnectionString, BufferLength, StringLength2Ptr, __functionAddress);
    }

    /** {@code SQLRETURN SQLBrowseConnect(SQLHDBC ConnectionHandle, SQLWCHAR * InConnectionString, SQLSMALLINT StringLength1, SQLWCHAR * OutConnectionString, SQLSMALLINT BufferLength, SQLSMALLINT * StringLength2Ptr)} */
    @NativeType("SQLRETURN")
    public static short SQLBrowseConnect(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLWCHAR *") ByteBuffer InConnectionString, @NativeType("SQLWCHAR *") @Nullable ByteBuffer OutConnectionString, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer StringLength2Ptr) {
        if (CHECKS) {
            checkSafe(StringLength2Ptr, 1);
        }
        return nSQLBrowseConnect(ConnectionHandle, memAddress(InConnectionString), (short)(InConnectionString.remaining() >> 1), memAddressSafe(OutConnectionString), (short)(remainingSafe(OutConnectionString) >> 1), memAddressSafe(StringLength2Ptr));
    }

    /** {@code SQLRETURN SQLBrowseConnect(SQLHDBC ConnectionHandle, SQLWCHAR * InConnectionString, SQLSMALLINT StringLength1, SQLWCHAR * OutConnectionString, SQLSMALLINT BufferLength, SQLSMALLINT * StringLength2Ptr)} */
    @NativeType("SQLRETURN")
    public static short SQLBrowseConnect(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLWCHAR *") CharSequence InConnectionString, @NativeType("SQLWCHAR *") @Nullable ByteBuffer OutConnectionString, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer StringLength2Ptr) {
        if (CHECKS) {
            checkSafe(StringLength2Ptr, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int InConnectionStringEncodedLength = stack.nUTF16(InConnectionString, false);
            long InConnectionStringEncoded = stack.getPointerAddress();
            return nSQLBrowseConnect(ConnectionHandle, InConnectionStringEncoded, (short)(InConnectionStringEncodedLength >> 1), memAddressSafe(OutConnectionString), (short)(remainingSafe(OutConnectionString) >> 1), memAddressSafe(StringLength2Ptr));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SQLBulkOperations ] ---

    /** {@code SQLRETURN SQLBulkOperations(SQLHSTMT StatementHandle, SQLUSMALLINT Operation)} */
    @NativeType("SQLRETURN")
    public static short SQLBulkOperations(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short Operation) {
        long __functionAddress = Functions.BulkOperations;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPCS(StatementHandle, Operation, __functionAddress);
    }

    // --- [ SQLColumnPrivileges ] ---

    /** {@code SQLRETURN SQLColumnPrivileges(SQLHSTMT hstmt, SQLWCHAR * szCatalogName, SQLSMALLINT cchCatalogName, SQLWCHAR * szSchemaName, SQLSMALLINT cchSchemaName, SQLWCHAR * szTableName, SQLSMALLINT cchTableName, SQLWCHAR * szColumnName, SQLSMALLINT cchColumnName)} */
    public static short nSQLColumnPrivileges(long hstmt, long szCatalogName, short cchCatalogName, long szSchemaName, short cchSchemaName, long szTableName, short cchTableName, long szColumnName, short cchColumnName) {
        long __functionAddress = Functions.ColumnPrivileges;
        if (CHECKS) {
            check(hstmt);
        }
        return callPPSPSPSPSS(hstmt, szCatalogName, cchCatalogName, szSchemaName, cchSchemaName, szTableName, cchTableName, szColumnName, cchColumnName, __functionAddress);
    }

    /** {@code SQLRETURN SQLColumnPrivileges(SQLHSTMT hstmt, SQLWCHAR * szCatalogName, SQLSMALLINT cchCatalogName, SQLWCHAR * szSchemaName, SQLSMALLINT cchSchemaName, SQLWCHAR * szTableName, SQLSMALLINT cchTableName, SQLWCHAR * szColumnName, SQLSMALLINT cchColumnName)} */
    @NativeType("SQLRETURN")
    public static short SQLColumnPrivileges(@NativeType("SQLHSTMT") long hstmt, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szCatalogName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szSchemaName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szTableName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szColumnName) {
        return nSQLColumnPrivileges(hstmt, memAddressSafe(szCatalogName), (short)(remainingSafe(szCatalogName) >> 1), memAddressSafe(szSchemaName), (short)(remainingSafe(szSchemaName) >> 1), memAddressSafe(szTableName), (short)(remainingSafe(szTableName) >> 1), memAddressSafe(szColumnName), (short)(remainingSafe(szColumnName) >> 1));
    }

    // --- [ SQLDescribeParam ] ---

    /** {@code SQLRETURN SQLDescribeParam(SQLHSTMT StatementHandle, SQLUSMALLINT ParameterNumber, SQLSMALLINT * DataTypePtr, SQLULEN * ParameterSizePtr, SQLSMALLINT * DecimalDigitsPtr, SQLSMALLINT * NullablePtr)} */
    public static short nSQLDescribeParam(long StatementHandle, short ParameterNumber, long DataTypePtr, long ParameterSizePtr, long DecimalDigitsPtr, long NullablePtr) {
        long __functionAddress = Functions.DescribeParam;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPCPPPPS(StatementHandle, ParameterNumber, DataTypePtr, ParameterSizePtr, DecimalDigitsPtr, NullablePtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLDescribeParam(SQLHSTMT StatementHandle, SQLUSMALLINT ParameterNumber, SQLSMALLINT * DataTypePtr, SQLULEN * ParameterSizePtr, SQLSMALLINT * DecimalDigitsPtr, SQLSMALLINT * NullablePtr)} */
    @NativeType("SQLRETURN")
    public static short SQLDescribeParam(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short ParameterNumber, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer DataTypePtr, @NativeType("SQLULEN *") @Nullable PointerBuffer ParameterSizePtr, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer DecimalDigitsPtr, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer NullablePtr) {
        if (CHECKS) {
            checkSafe(DataTypePtr, 1);
            checkSafe(ParameterSizePtr, 1);
            checkSafe(DecimalDigitsPtr, 1);
            checkSafe(NullablePtr, 1);
        }
        return nSQLDescribeParam(StatementHandle, ParameterNumber, memAddressSafe(DataTypePtr), memAddressSafe(ParameterSizePtr), memAddressSafe(DecimalDigitsPtr), memAddressSafe(NullablePtr));
    }

    // --- [ SQLExtendedFetch ] ---

    /** {@code SQLRETURN SQLExtendedFetch(SQLHSTMT hstmt, SQLUSMALLINT fFetchType, SQLLEN irow, SQLULEN * pcrow, SQLUSMALLINT * rgfRowStatus)} */
    public static short nSQLExtendedFetch(long hstmt, short fFetchType, long irow, long pcrow, long rgfRowStatus) {
        long __functionAddress = Functions.ExtendedFetch;
        if (CHECKS) {
            check(hstmt);
        }
        return callPCPPPS(hstmt, fFetchType, irow, pcrow, rgfRowStatus, __functionAddress);
    }

    /** {@code SQLRETURN SQLExtendedFetch(SQLHSTMT hstmt, SQLUSMALLINT fFetchType, SQLLEN irow, SQLULEN * pcrow, SQLUSMALLINT * rgfRowStatus)} */
    @NativeType("SQLRETURN")
    public static short SQLExtendedFetch(@NativeType("SQLHSTMT") long hstmt, @NativeType("SQLUSMALLINT") short fFetchType, @NativeType("SQLLEN") long irow, @NativeType("SQLULEN *") @Nullable PointerBuffer pcrow, @NativeType("SQLUSMALLINT *") @Nullable ShortBuffer rgfRowStatus) {
        if (CHECKS) {
            checkSafe(pcrow, 1);
            checkSafe(rgfRowStatus, 1);
        }
        return nSQLExtendedFetch(hstmt, fFetchType, irow, memAddressSafe(pcrow), memAddressSafe(rgfRowStatus));
    }

    // --- [ SQLForeignKeys ] ---

    /** {@code SQLRETURN SQLForeignKeys(SQLHSTMT hstmt, SQLWCHAR * szPkCatalogName, SQLSMALLINT cchPkCatalogName, SQLWCHAR * szPkSchemaName, SQLSMALLINT cchPkSchemaName, SQLWCHAR * szPkTableName, SQLSMALLINT cchPkTableName, SQLWCHAR * szFkCatalogName, SQLSMALLINT cchFkCatalogName, SQLWCHAR * szFkSchemaName, SQLSMALLINT cchFkSchemaName, SQLWCHAR * szFkTableName, SQLSMALLINT cchFkTableName)} */
    public static short nSQLForeignKeys(long hstmt, long szPkCatalogName, short cchPkCatalogName, long szPkSchemaName, short cchPkSchemaName, long szPkTableName, short cchPkTableName, long szFkCatalogName, short cchFkCatalogName, long szFkSchemaName, short cchFkSchemaName, long szFkTableName, short cchFkTableName) {
        long __functionAddress = Functions.ForeignKeys;
        if (CHECKS) {
            check(hstmt);
        }
        return callPPSPSPSPSPSPSS(hstmt, szPkCatalogName, cchPkCatalogName, szPkSchemaName, cchPkSchemaName, szPkTableName, cchPkTableName, szFkCatalogName, cchFkCatalogName, szFkSchemaName, cchFkSchemaName, szFkTableName, cchFkTableName, __functionAddress);
    }

    /** {@code SQLRETURN SQLForeignKeys(SQLHSTMT hstmt, SQLWCHAR * szPkCatalogName, SQLSMALLINT cchPkCatalogName, SQLWCHAR * szPkSchemaName, SQLSMALLINT cchPkSchemaName, SQLWCHAR * szPkTableName, SQLSMALLINT cchPkTableName, SQLWCHAR * szFkCatalogName, SQLSMALLINT cchFkCatalogName, SQLWCHAR * szFkSchemaName, SQLSMALLINT cchFkSchemaName, SQLWCHAR * szFkTableName, SQLSMALLINT cchFkTableName)} */
    @NativeType("SQLRETURN")
    public static short SQLForeignKeys(@NativeType("SQLHSTMT") long hstmt, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szPkCatalogName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szPkSchemaName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szPkTableName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szFkCatalogName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szFkSchemaName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szFkTableName) {
        return nSQLForeignKeys(hstmt, memAddressSafe(szPkCatalogName), (short)(remainingSafe(szPkCatalogName) >> 1), memAddressSafe(szPkSchemaName), (short)(remainingSafe(szPkSchemaName) >> 1), memAddressSafe(szPkTableName), (short)(remainingSafe(szPkTableName) >> 1), memAddressSafe(szFkCatalogName), (short)(remainingSafe(szFkCatalogName) >> 1), memAddressSafe(szFkSchemaName), (short)(remainingSafe(szFkSchemaName) >> 1), memAddressSafe(szFkTableName), (short)(remainingSafe(szFkTableName) >> 1));
    }

    // --- [ SQLMoreResults ] ---

    /** {@code SQLRETURN SQLMoreResults(SQLHSTMT StatementHandle)} */
    @NativeType("SQLRETURN")
    public static short SQLMoreResults(@NativeType("SQLHSTMT") long StatementHandle) {
        long __functionAddress = Functions.MoreResults;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPS(StatementHandle, __functionAddress);
    }

    // --- [ SQLNativeSql ] ---

    /** {@code SQLRETURN SQLNativeSql(SQLHDBC ConnectionHandle, SQLWCHAR * InStatementText, SQLINTEGER TextLength1, SQLWCHAR * OutStatementText, SQLINTEGER BufferLength, SQLINTEGER * TextLength2Ptr)} */
    public static short nSQLNativeSql(long ConnectionHandle, long InStatementText, int TextLength1, long OutStatementText, int BufferLength, long TextLength2Ptr) {
        long __functionAddress = Functions.NativeSql;
        if (CHECKS) {
            check(ConnectionHandle);
        }
        return callPPPPS(ConnectionHandle, InStatementText, TextLength1, OutStatementText, BufferLength, TextLength2Ptr, __functionAddress);
    }

    /** {@code SQLRETURN SQLNativeSql(SQLHDBC ConnectionHandle, SQLWCHAR * InStatementText, SQLINTEGER TextLength1, SQLWCHAR * OutStatementText, SQLINTEGER BufferLength, SQLINTEGER * TextLength2Ptr)} */
    @NativeType("SQLRETURN")
    public static short SQLNativeSql(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLWCHAR *") ByteBuffer InStatementText, @NativeType("SQLWCHAR *") @Nullable ByteBuffer OutStatementText, @NativeType("SQLINTEGER *") IntBuffer TextLength2Ptr) {
        if (CHECKS) {
            check(TextLength2Ptr, 1);
        }
        return nSQLNativeSql(ConnectionHandle, memAddress(InStatementText), InStatementText.remaining() >> 1, memAddressSafe(OutStatementText), remainingSafe(OutStatementText) >> 1, memAddress(TextLength2Ptr));
    }

    /** {@code SQLRETURN SQLNativeSql(SQLHDBC ConnectionHandle, SQLWCHAR * InStatementText, SQLINTEGER TextLength1, SQLWCHAR * OutStatementText, SQLINTEGER BufferLength, SQLINTEGER * TextLength2Ptr)} */
    @NativeType("SQLRETURN")
    public static short SQLNativeSql(@NativeType("SQLHDBC") long ConnectionHandle, @NativeType("SQLWCHAR *") CharSequence InStatementText, @NativeType("SQLWCHAR *") @Nullable ByteBuffer OutStatementText, @NativeType("SQLINTEGER *") IntBuffer TextLength2Ptr) {
        if (CHECKS) {
            check(TextLength2Ptr, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int InStatementTextEncodedLength = stack.nUTF16(InStatementText, false);
            long InStatementTextEncoded = stack.getPointerAddress();
            return nSQLNativeSql(ConnectionHandle, InStatementTextEncoded, InStatementTextEncodedLength >> 1, memAddressSafe(OutStatementText), remainingSafe(OutStatementText) >> 1, memAddress(TextLength2Ptr));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ SQLNumParams ] ---

    /** {@code SQLRETURN SQLNumParams(SQLHSTMT StatementHandle, SQLSMALLINT * ParameterCountPtr)} */
    public static short nSQLNumParams(long StatementHandle, long ParameterCountPtr) {
        long __functionAddress = Functions.NumParams;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPPS(StatementHandle, ParameterCountPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLNumParams(SQLHSTMT StatementHandle, SQLSMALLINT * ParameterCountPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLNumParams(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer ParameterCountPtr) {
        if (CHECKS) {
            checkSafe(ParameterCountPtr, 1);
        }
        return nSQLNumParams(StatementHandle, memAddressSafe(ParameterCountPtr));
    }

    // --- [ SQLParamOptions ] ---

    /** {@code SQLRETURN SQLParamOptions(SQLHSTMT hstmt, SQLULEN crow, SQLULEN * pirow)} */
    public static short nSQLParamOptions(long hstmt, long crow, long pirow) {
        long __functionAddress = Functions.ParamOptions;
        if (CHECKS) {
            check(hstmt);
        }
        return callPPPS(hstmt, crow, pirow, __functionAddress);
    }

    /** {@code SQLRETURN SQLParamOptions(SQLHSTMT hstmt, SQLULEN crow, SQLULEN * pirow)} */
    @NativeType("SQLRETURN")
    public static short SQLParamOptions(@NativeType("SQLHSTMT") long hstmt, @NativeType("SQLULEN") long crow, @NativeType("SQLULEN *") PointerBuffer pirow) {
        if (CHECKS) {
            check(pirow, 1);
        }
        return nSQLParamOptions(hstmt, crow, memAddress(pirow));
    }

    // --- [ SQLPrimaryKeys ] ---

    /** {@code SQLRETURN SQLPrimaryKeys(SQLHSTMT hstmt, SQLWCHAR * szCatalogName, SQLSMALLINT cchCatalogName, SQLWCHAR * szSchemaName, SQLSMALLINT cchSchemaName, SQLWCHAR * szTableName, SQLSMALLINT cchTableName)} */
    public static short nSQLPrimaryKeys(long hstmt, long szCatalogName, short cchCatalogName, long szSchemaName, short cchSchemaName, long szTableName, short cchTableName) {
        long __functionAddress = Functions.PrimaryKeys;
        if (CHECKS) {
            check(hstmt);
        }
        return callPPSPSPSS(hstmt, szCatalogName, cchCatalogName, szSchemaName, cchSchemaName, szTableName, cchTableName, __functionAddress);
    }

    /** {@code SQLRETURN SQLPrimaryKeys(SQLHSTMT hstmt, SQLWCHAR * szCatalogName, SQLSMALLINT cchCatalogName, SQLWCHAR * szSchemaName, SQLSMALLINT cchSchemaName, SQLWCHAR * szTableName, SQLSMALLINT cchTableName)} */
    @NativeType("SQLRETURN")
    public static short SQLPrimaryKeys(@NativeType("SQLHSTMT") long hstmt, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szCatalogName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szSchemaName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szTableName) {
        return nSQLPrimaryKeys(hstmt, memAddressSafe(szCatalogName), (short)(remainingSafe(szCatalogName) >> 1), memAddressSafe(szSchemaName), (short)(remainingSafe(szSchemaName) >> 1), memAddressSafe(szTableName), (short)(remainingSafe(szTableName) >> 1));
    }

    // --- [ SQLProcedureColumns ] ---

    /** {@code SQLRETURN SQLProcedureColumns(SQLHSTMT hstmt, SQLWCHAR * szCatalogName, SQLSMALLINT cchCatalogName, SQLWCHAR * szSchemaName, SQLSMALLINT cchSchemaName, SQLWCHAR * szProcName, SQLSMALLINT cchProcName, SQLWCHAR * szColumnName, SQLSMALLINT cchColumnName)} */
    public static short nSQLProcedureColumns(long hstmt, long szCatalogName, short cchCatalogName, long szSchemaName, short cchSchemaName, long szProcName, short cchProcName, long szColumnName, short cchColumnName) {
        long __functionAddress = Functions.ProcedureColumns;
        if (CHECKS) {
            check(hstmt);
        }
        return callPPSPSPSPSS(hstmt, szCatalogName, cchCatalogName, szSchemaName, cchSchemaName, szProcName, cchProcName, szColumnName, cchColumnName, __functionAddress);
    }

    /** {@code SQLRETURN SQLProcedureColumns(SQLHSTMT hstmt, SQLWCHAR * szCatalogName, SQLSMALLINT cchCatalogName, SQLWCHAR * szSchemaName, SQLSMALLINT cchSchemaName, SQLWCHAR * szProcName, SQLSMALLINT cchProcName, SQLWCHAR * szColumnName, SQLSMALLINT cchColumnName)} */
    @NativeType("SQLRETURN")
    public static short SQLProcedureColumns(@NativeType("SQLHSTMT") long hstmt, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szCatalogName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szSchemaName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szProcName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szColumnName) {
        return nSQLProcedureColumns(hstmt, memAddressSafe(szCatalogName), (short)(remainingSafe(szCatalogName) >> 1), memAddressSafe(szSchemaName), (short)(remainingSafe(szSchemaName) >> 1), memAddressSafe(szProcName), (short)(remainingSafe(szProcName) >> 1), memAddressSafe(szColumnName), (short)(remainingSafe(szColumnName) >> 1));
    }

    // --- [ SQLProcedures ] ---

    /** {@code SQLRETURN SQLProcedures(SQLHSTMT hstmt, SQLWCHAR * szCatalogName, SQLSMALLINT cchCatalogName, SQLWCHAR * szSchemaName, SQLSMALLINT cchSchemaName, SQLWCHAR * szProcName, SQLSMALLINT cchProcName)} */
    public static short nSQLProcedures(long hstmt, long szCatalogName, short cchCatalogName, long szSchemaName, short cchSchemaName, long szProcName, short cchProcName) {
        long __functionAddress = Functions.Procedures;
        if (CHECKS) {
            check(hstmt);
        }
        return callPPSPSPSS(hstmt, szCatalogName, cchCatalogName, szSchemaName, cchSchemaName, szProcName, cchProcName, __functionAddress);
    }

    /** {@code SQLRETURN SQLProcedures(SQLHSTMT hstmt, SQLWCHAR * szCatalogName, SQLSMALLINT cchCatalogName, SQLWCHAR * szSchemaName, SQLSMALLINT cchSchemaName, SQLWCHAR * szProcName, SQLSMALLINT cchProcName)} */
    @NativeType("SQLRETURN")
    public static short SQLProcedures(@NativeType("SQLHSTMT") long hstmt, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szCatalogName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szSchemaName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szProcName) {
        return nSQLProcedures(hstmt, memAddressSafe(szCatalogName), (short)(remainingSafe(szCatalogName) >> 1), memAddressSafe(szSchemaName), (short)(remainingSafe(szSchemaName) >> 1), memAddressSafe(szProcName), (short)(remainingSafe(szProcName) >> 1));
    }

    // --- [ SQLSetPos ] ---

    /** {@code SQLRETURN SQLSetPos(SQLHSTMT StatementHandle, SQLSETPOSIROW RowNumber, SQLUSMALLINT Operation, SQLUSMALLINT LockType)} */
    @NativeType("SQLRETURN")
    public static short SQLSetPos(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLSETPOSIROW") long RowNumber, @NativeType("SQLUSMALLINT") short Operation, @NativeType("SQLUSMALLINT") short LockType) {
        long __functionAddress = Functions.SetPos;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPJCCS(StatementHandle, RowNumber, Operation, LockType, __functionAddress);
    }

    // --- [ SQLTablePrivileges ] ---

    /** {@code SQLRETURN SQLTablePrivileges(SQLHSTMT hstmt, SQLWCHAR * szCatalogName, SQLSMALLINT cchCatalogName, SQLWCHAR * szSchemaName, SQLSMALLINT cchSchemaName, SQLWCHAR * szTableName, SQLSMALLINT cchTableName)} */
    public static short nSQLTablePrivileges(long hstmt, long szCatalogName, short cchCatalogName, long szSchemaName, short cchSchemaName, long szTableName, short cchTableName) {
        long __functionAddress = Functions.TablePrivileges;
        if (CHECKS) {
            check(hstmt);
        }
        return callPPSPSPSS(hstmt, szCatalogName, cchCatalogName, szSchemaName, cchSchemaName, szTableName, cchTableName, __functionAddress);
    }

    /** {@code SQLRETURN SQLTablePrivileges(SQLHSTMT hstmt, SQLWCHAR * szCatalogName, SQLSMALLINT cchCatalogName, SQLWCHAR * szSchemaName, SQLSMALLINT cchSchemaName, SQLWCHAR * szTableName, SQLSMALLINT cchTableName)} */
    @NativeType("SQLRETURN")
    public static short SQLTablePrivileges(@NativeType("SQLHSTMT") long hstmt, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szCatalogName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szSchemaName, @NativeType("SQLWCHAR *") @Nullable ByteBuffer szTableName) {
        return nSQLTablePrivileges(hstmt, memAddressSafe(szCatalogName), (short)(remainingSafe(szCatalogName) >> 1), memAddressSafe(szSchemaName), (short)(remainingSafe(szSchemaName) >> 1), memAddressSafe(szTableName), (short)(remainingSafe(szTableName) >> 1));
    }

    // --- [ SQLDrivers ] ---

    /** {@code SQLRETURN SQLDrivers(SQLHENV EnvironmentHandle, SQLUSMALLINT Direction, SQLWCHAR * DriverDescription, SQLSMALLINT BufferLength1, SQLSMALLINT * DescriptionLengthPtr, SQLWCHAR * DriverAttributes, SQLSMALLINT BufferLength2, SQLSMALLINT * AttributesLengthPtr)} */
    public static short nSQLDrivers(long EnvironmentHandle, short Direction, long DriverDescription, short BufferLength1, long DescriptionLengthPtr, long DriverAttributes, short BufferLength2, long AttributesLengthPtr) {
        long __functionAddress = Functions.Drivers;
        if (CHECKS) {
            check(__functionAddress);
            check(EnvironmentHandle);
        }
        return callPCPSPPSPS(EnvironmentHandle, Direction, DriverDescription, BufferLength1, DescriptionLengthPtr, DriverAttributes, BufferLength2, AttributesLengthPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLDrivers(SQLHENV EnvironmentHandle, SQLUSMALLINT Direction, SQLWCHAR * DriverDescription, SQLSMALLINT BufferLength1, SQLSMALLINT * DescriptionLengthPtr, SQLWCHAR * DriverAttributes, SQLSMALLINT BufferLength2, SQLSMALLINT * AttributesLengthPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLDrivers(@NativeType("SQLHENV") long EnvironmentHandle, @NativeType("SQLUSMALLINT") short Direction, @NativeType("SQLWCHAR *") @Nullable ByteBuffer DriverDescription, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer DescriptionLengthPtr, @NativeType("SQLWCHAR *") @Nullable ByteBuffer DriverAttributes, @NativeType("SQLSMALLINT *") @Nullable ShortBuffer AttributesLengthPtr) {
        if (CHECKS) {
            checkSafe(DescriptionLengthPtr, 1);
            checkSafe(AttributesLengthPtr, 1);
        }
        return nSQLDrivers(EnvironmentHandle, Direction, memAddressSafe(DriverDescription), (short)(remainingSafe(DriverDescription) >> 1), memAddressSafe(DescriptionLengthPtr), memAddressSafe(DriverAttributes), (short)(remainingSafe(DriverAttributes) >> 1), memAddressSafe(AttributesLengthPtr));
    }

    // --- [ SQLBindParameter ] ---

    /** {@code SQLRETURN SQLBindParameter(SQLHSTMT StatementHandle, SQLUSMALLINT ParameterNumber, SQLSMALLINT InputOutputType, SQLSMALLINT ValueType, SQLSMALLINT ParameterType, SQLULEN ColumnSize, SQLSMALLINT DecimalDigits, SQLPOINTER ParameterValuePtr, SQLLEN BufferLength, SQLLEN * StrLen_or_IndPtr)} */
    public static short nSQLBindParameter(long StatementHandle, short ParameterNumber, short InputOutputType, short ValueType, short ParameterType, long ColumnSize, short DecimalDigits, long ParameterValuePtr, long BufferLength, long StrLen_or_IndPtr) {
        long __functionAddress = Functions.BindParameter;
        if (CHECKS) {
            check(StatementHandle);
        }
        return callPCSSSPSPPPS(StatementHandle, ParameterNumber, InputOutputType, ValueType, ParameterType, ColumnSize, DecimalDigits, ParameterValuePtr, BufferLength, StrLen_or_IndPtr, __functionAddress);
    }

    /** {@code SQLRETURN SQLBindParameter(SQLHSTMT StatementHandle, SQLUSMALLINT ParameterNumber, SQLSMALLINT InputOutputType, SQLSMALLINT ValueType, SQLSMALLINT ParameterType, SQLULEN ColumnSize, SQLSMALLINT DecimalDigits, SQLPOINTER ParameterValuePtr, SQLLEN BufferLength, SQLLEN * StrLen_or_IndPtr)} */
    @NativeType("SQLRETURN")
    public static short SQLBindParameter(@NativeType("SQLHSTMT") long StatementHandle, @NativeType("SQLUSMALLINT") short ParameterNumber, @NativeType("SQLSMALLINT") short InputOutputType, @NativeType("SQLSMALLINT") short ValueType, @NativeType("SQLSMALLINT") short ParameterType, @NativeType("SQLULEN") long ColumnSize, @NativeType("SQLSMALLINT") short DecimalDigits, @NativeType("SQLPOINTER") @Nullable ByteBuffer ParameterValuePtr, @NativeType("SQLLEN *") @Nullable PointerBuffer StrLen_or_IndPtr) {
        if (CHECKS) {
            checkSafe(StrLen_or_IndPtr, 1);
        }
        return nSQLBindParameter(StatementHandle, ParameterNumber, InputOutputType, ValueType, ParameterType, ColumnSize, DecimalDigits, memAddressSafe(ParameterValuePtr), remainingSafe(ParameterValuePtr), memAddressSafe(StrLen_or_IndPtr));
    }

    // --- [ SQLAllocHandleStd ] ---

    /** {@code SQLRETURN SQLAllocHandleStd(SQLSMALLINT fHandleType, SQLHANDLE hInput, SQLHANDLE * phOutput)} */
    public static short nSQLAllocHandleStd(short fHandleType, long hInput, long phOutput) {
        long __functionAddress = Functions.AllocHandleStd;
        if (CHECKS) {
            check(__functionAddress);
            check(hInput);
        }
        return callSPPS(fHandleType, hInput, phOutput, __functionAddress);
    }

    /** {@code SQLRETURN SQLAllocHandleStd(SQLSMALLINT fHandleType, SQLHANDLE hInput, SQLHANDLE * phOutput)} */
    @NativeType("SQLRETURN")
    public static short SQLAllocHandleStd(@NativeType("SQLSMALLINT") short fHandleType, @NativeType("SQLHANDLE") long hInput, @NativeType("SQLHANDLE *") PointerBuffer phOutput) {
        if (CHECKS) {
            check(phOutput, 1);
        }
        return nSQLAllocHandleStd(fHandleType, hInput, memAddress(phOutput));
    }

}