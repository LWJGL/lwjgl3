/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package odbc.templates

import org.lwjgl.generator.*
import odbc.*

val sql = "SQL".nativeClass(Module.ODBC, prefix = "SQL", prefixMethod = "SQL", binding = ODBC_BINDING) {
    ShortConstant(
        "NULL_DATA".."-1",
        "DATA_AT_EXEC".."-2"
    )

    ShortConstant(
        "INVALID_HANDLE".."-2",
        "ERROR".."-1",
        "SUCCESS".."0",
        "SUCCESS_WITH_INFO".."1",
        "STILL_EXECUTING".."2",
        "NEED_DATA".."99",
        "NO_DATA".."100",
        "NO_DATA_FOUND".."SQL_NO_DATA",
        "PARAM_DATA_AVAILABLE".."101"
    )

    ShortConstant(
        "NTS".."-3"
    )

    IntConstant(
        "MAX_MESSAGE_LENGTH".."512"
    )

    ShortConstant(
        "DATE_LEN".."10",
        "TIME_LEN".."8",
        "TIMESTAMP_LEN".."19"
    )

    ShortConstant(
        "HANDLE_ENV".."1",
        "HANDLE_DBC".."2",
        "HANDLE_STMT".."3",
        "HANDLE_DESC".."4",
        "HANDLE_SENV".."5"
    )

    IntConstant(
        "ATTR_OUTPUT_NTS".."10001",
        "ATTR_ODBC_VERSION".."200",
        "ATTR_CONNECTION_POOLING".."201",
        "ATTR_CP_MATCH".."202"
    )

    IntConstant(
        "ATTR_AUTO_IPD".."10001",
        "ATTR_METADATA_ID".."10014",

        "ATTR_ACCESS_MODE".."101",
        "ATTR_AUTOCOMMIT".."102",
        "ATTR_CONNECTION_TIMEOUT".."113",
        "ATTR_CURRENT_CATALOG".."109",
        "ATTR_DISCONNECT_BEHAVIOR".."114",
        "ATTR_ENLIST_IN_DTC".."1207",
        "ATTR_ENLIST_IN_XA".."1208",
        "ATTR_LOGIN_TIMEOUT".."103",
        "ATTR_ODBC_CURSORS".."110",
        "ATTR_PACKET_SIZE".."112",
        "ATTR_QUIET_MODE".."111",
        "ATTR_TRACE".."104",
        "ATTR_TRACEFILE".."105",
        "ATTR_TRANSLATE_LIB".."106",
        "ATTR_TRANSLATE_OPTION".."107",
        "ATTR_TXN_ISOLATION".."108",
        "ATTR_CONNECTION_DEAD".."1209",
        "ATTR_ANSI_APP".."115",
        "ATTR_RESET_CONNECTION".."116",
        "ATTR_ASYNC_DBC_FUNCTIONS_ENABLE".."117",
        "ATTR_ASYNC_DBC_EVENT".."119"
    )

    IntConstant(
        "ATTR_APP_ROW_DESC".."10010",
        "ATTR_APP_PARAM_DESC".."10011",
        "ATTR_IMP_ROW_DESC".."10012",
        "ATTR_IMP_PARAM_DESC".."10013",
        "ATTR_CURSOR_SCROLLABLE".."-1",
        "ATTR_CURSOR_SENSITIVITY".."-2",

        "ATTR_ASYNC_ENABLE".."4",
        "ATTR_CONCURRENCY".."7",
        "ATTR_CURSOR_TYPE".."6",
        "ATTR_ENABLE_AUTO_IPD".."15",
        "ATTR_FETCH_BOOKMARK_PTR".."16",
        "ATTR_KEYSET_SIZE".."8",
        "ATTR_MAX_LENGTH".."3",
        "ATTR_MAX_ROWS".."1",
        "ATTR_NOSCAN".."2",
        "ATTR_PARAM_BIND_OFFSET_PTR".."17",
        "ATTR_PARAM_BIND_TYPE".."18",
        "ATTR_PARAM_OPERATION_PTR".."19",
        "ATTR_PARAM_STATUS_PTR".."20",
        "ATTR_PARAMS_PROCESSED_PTR".."21",
        "ATTR_PARAMSET_SIZE".."22",
        "ATTR_QUERY_TIMEOUT".."0",
        "ATTR_RETRIEVE_DATA".."11",
        "ATTR_ROW_BIND_OFFSET_PTR".."23",
        "ATTR_ROW_BIND_TYPE".."5",
        "ATTR_ROW_NUMBER".."14",
        "ATTR_ROW_OPERATION_PTR".."24",
        "ATTR_ROW_STATUS_PTR".."25",
        "ATTR_ROWS_FETCHED_PTR".."26",
        "ATTR_ROW_ARRAY_SIZE".."27",
        "ATTR_SIMULATE_CURSOR".."10",
        "ATTR_USE_BOOKMARKS".."12",
        "ATTR_ASYNC_STMT_EVENT".."29"
    )

    IntConstant(
        "NONSCROLLABLE".."0",
        "SCROLLABLE".."1"
    )

    ShortConstant(
        "DESC_COUNT".."1001",
        "DESC_TYPE".."1002",
        "DESC_LENGTH".."1003",
        "DESC_OCTET_LENGTH_PTR".."1004",
        "DESC_PRECISION".."1005",
        "DESC_SCALE".."1006",
        "DESC_DATETIME_INTERVAL_CODE".."1007",
        "DESC_NULLABLE".."1008",
        "DESC_INDICATOR_PTR".."1009",
        "DESC_DATA_PTR".."1010",
        "DESC_NAME".."1011",
        "DESC_UNNAMED".."1012",
        "DESC_OCTET_LENGTH".."1013",
        "DESC_ALLOC_TYPE".."1099"
    )

    ShortConstant(
        "DIAG_RETURNCODE".."1",
        "DIAG_NUMBER".."2",
        "DIAG_ROW_COUNT".."3",
        "DIAG_SQLSTATE".."4",
        "DIAG_NATIVE".."5",
        "DIAG_MESSAGE_TEXT".."6",
        "DIAG_DYNAMIC_FUNCTION".."7",
        "DIAG_CLASS_ORIGIN".."8",
        "DIAG_SUBCLASS_ORIGIN".."9",
        "DIAG_CONNECTION_NAME".."10",
        "DIAG_SERVER_NAME".."11",
        "DIAG_DYNAMIC_FUNCTION_CODE".."12"
    )

    ShortConstant(
        "DIAG_ALTER_DOMAIN".."3",
        "DIAG_ALTER_TABLE".."4",
        "DIAG_CALL".."7",
        "DIAG_CREATE_ASSERTION".."6",
        "DIAG_CREATE_CHARACTER_SET".."8",
        "DIAG_CREATE_COLLATION".."10",
        "DIAG_CREATE_DOMAIN".."23",
        "DIAG_CREATE_INDEX".."-1",
        "DIAG_CREATE_SCHEMA".."64",
        "DIAG_CREATE_TABLE".."77",
        "DIAG_CREATE_TRANSLATION".."79",
        "DIAG_CREATE_VIEW".."84",
        "DIAG_DELETE_WHERE".."19",
        "DIAG_DROP_ASSERTION".."24",
        "DIAG_DROP_CHARACTER_SET".."25",
        "DIAG_DROP_COLLATION".."26",
        "DIAG_DROP_DOMAIN".."27",
        "DIAG_DROP_INDEX".."-2",
        "DIAG_DROP_SCHEMA".."31",
        "DIAG_DROP_TABLE".."32",
        "DIAG_DROP_TRANSLATION".."33",
        "DIAG_DROP_VIEW".."36",
        "DIAG_DYNAMIC_DELETE_CURSOR".."38",
        "DIAG_DYNAMIC_UPDATE_CURSOR".."81",
        "DIAG_GRANT".."48",
        "DIAG_INSERT".."50",
        "DIAG_REVOKE".."59",
        "DIAG_SELECT_CURSOR".."85",
        "DIAG_UNKNOWN_STATEMENT".."0",
        "DIAG_UPDATE_WHERE".."82"
    )

    ShortConstant(
        "UNKNOWN_TYPE".."0",
        "CHAR".."1",
        "NUMERIC".."2",
        "DECIMAL".."3",
        "INTEGER".."4",
        "SMALLINT".."5",
        "FLOAT".."6",
        "REAL".."7",
        "DOUBLE".."8",
        "DATETIME".."9",
        "VARCHAR".."12"
    )

    ShortConstant(
        "UNSPECIFIED".."0",
        "INSENSITIVE".."1",
        "SENSITIVE".."2"
    )

    ShortConstant(
        "TYPE_DATE".."91",
        "TYPE_TIME".."92",
        "TYPE_TIMESTAMP".."93"
    )

    ShortConstant(
        "ALL_TYPES".."0"
    )

    ShortConstant(
        "DEFAULT".."99"
    )

    ShortConstant(
        "ARD_TYPE".."-99",
        "APD_TYPE".."-100"
    )

    ShortConstant(
        "CODE_DATE".."1",
        "CODE_TIME".."2",
        "CODE_TIMESTAMP".."3"
    )

    ShortConstant(
        "FALSE".."0",
        "TRUE".."1"
    )

    ShortConstant(
        "NO_NULLS".."0",
        "NULLABLE".."1"
    )

    ShortConstant(
        "NULLABLE_UNKNOWN".."2"
    )

    ShortConstant(
        "PRED_NONE".."0",
        "PRED_CHAR".."1",
        "PRED_BASIC".."2"
    )

    ShortConstant(
        "NAMED".."0",
        "UNNAMED".."1"
    )

    ShortConstant(
        "DESC_ALLOC_AUTO".."1",
        "DESC_ALLOC_USER".."2"
    )

    ShortConstant(
        "CLOSE".."0",
        "DROP".."1",
        "UNBIND".."2",
        "RESET_PARAMS".."3"
    )

    ShortConstant(
        "FETCH_NEXT".."1",
        "FETCH_FIRST".."2"
    )

    ShortConstant(
        "FETCH_LAST".."3",
        "FETCH_PRIOR".."4",
        "FETCH_ABSOLUTE".."5",
        "FETCH_RELATIVE".."6"
    )

    ShortConstant(
        "COMMIT".."0",
        "ROLLBACK".."1"
    )

    LongConstant(
        "NULL_HENV"..0L,
        "NULL_HDBC"..0L,
        "NULL_HSTMT"..0L,
        "NULL_HDESC"..0L,
        "NULL_HANDLE"..0L
    )

    ShortConstant(
        "SCOPE_CURROW".."0",
        "SCOPE_TRANSACTION".."1",
        "SCOPE_SESSION".."2",
        "PC_UNKNOWN".."0",
        "PC_NON_PSEUDO".."1",
        "PC_PSEUDO".."2"
    )

    ShortConstant(
        "ROW_IDENTIFIER".."1"
    )

    ShortConstant(
        "INDEX_UNIQUE".."0",
        "INDEX_ALL".."1"
    )

    ShortConstant(
        "INDEX_CLUSTERED".."1",
        "INDEX_HASHED".."2",
        "INDEX_OTHER".."3"
    )

    IntConstant(
        "API_SQLALLOCCONNECT".."1",
        "API_SQLALLOCENV".."2",
        "API_SQLALLOCHANDLE".."1001",
        "API_SQLALLOCSTMT".."3",
        "API_SQLBINDCOL".."4",
        "API_SQLBINDPARAM".."1002",
        "API_SQLCANCEL".."5",
        "API_SQLCLOSECURSOR".."1003",
        "API_SQLCOLATTRIBUTE".."6",
        "API_SQLCOLUMNS".."40",
        "API_SQLCONNECT".."7",
        "API_SQLCOPYDESC".."1004",
        "API_SQLDATASOURCES".."57",
        "API_SQLDESCRIBECOL".."8",
        "API_SQLDISCONNECT".."9",
        "API_SQLENDTRAN".."1005",
        "API_SQLERROR".."10",
        "API_SQLEXECDIRECT".."11",
        "API_SQLEXECUTE".."12",
        "API_SQLFETCH".."13",
        "API_SQLFETCHSCROLL".."1021",
        "API_SQLFREECONNECT".."14",
        "API_SQLFREEENV".."15",
        "API_SQLFREEHANDLE".."1006",
        "API_SQLFREESTMT".."16",
        "API_SQLGETCONNECTATTR".."1007",
        "API_SQLGETCONNECTOPTION".."42",
        "API_SQLGETCURSORNAME".."17",
        "API_SQLGETDATA".."43",
        "API_SQLGETDESCFIELD".."1008",
        "API_SQLGETDESCREC".."1009",
        "API_SQLGETDIAGFIELD".."1010",
        "API_SQLGETDIAGREC".."1011",
        "API_SQLGETENVATTR".."1012",
        "API_SQLGETFUNCTIONS".."44",
        "API_SQLGETINFO".."45",
        "API_SQLGETSTMTATTR".."1014",
        "API_SQLGETSTMTOPTION".."46",
        "API_SQLGETTYPEINFO".."47",
        "API_SQLNUMRESULTCOLS".."18",
        "API_SQLPARAMDATA".."48",
        "API_SQLPREPARE".."19",
        "API_SQLPUTDATA".."49",
        "API_SQLROWCOUNT".."20",
        "API_SQLSETCONNECTATTR".."1016",
        "API_SQLSETCONNECTOPTION".."50",
        "API_SQLSETCURSORNAME".."21",
        "API_SQLSETDESCFIELD".."1017",
        "API_SQLSETDESCREC".."1018",
        "API_SQLSETENVATTR".."1019",
        "API_SQLSETPARAM".."22",
        "API_SQLSETSTMTATTR".."1020",
        "API_SQLSETSTMTOPTION".."51",
        "API_SQLSPECIALCOLUMNS".."52",
        "API_SQLSTATISTICS".."53",
        "API_SQLTABLES".."54",
        "API_SQLTRANSACT".."23",
        "API_SQLCANCELHANDLE".."1550",
        "API_SQLCOMPLETEASYNC".."1551",


        "API_SQLALLOCHANDLESTD".."73",
        "API_SQLBULKOPERATIONS".."24",
        "API_SQLBINDPARAMETER".."72",
        "API_SQLBROWSECONNECT".."55",
        "API_SQLCOLATTRIBUTES".."6",
        "API_SQLCOLUMNPRIVILEGES".."56",
        "API_SQLDESCRIBEPARAM".."58",
        "API_SQLDRIVERCONNECT".."41",
        "API_SQLDRIVERS".."71",
        "API_SQLEXTENDEDFETCH".."59",
        "API_SQLFOREIGNKEYS".."60",
        "API_SQLMORERESULTS".."61",
        "API_SQLNATIVESQL".."62",
        "API_SQLNUMPARAMS".."63",
        "API_SQLPARAMOPTIONS".."64",
        "API_SQLPRIMARYKEYS".."65",
        "API_SQLPROCEDURECOLUMNS".."66",
        "API_SQLPROCEDURES".."67",
        "API_SQLSETPOS".."68",
        "API_SQLSETSCROLLOPTIONS".."69",
        "API_SQLTABLEPRIVILEGES".."70"
    )

    IntConstant(
        "API_ODBC3_ALL_FUNCTIONS".. 999,
        "API_ODBC3_ALL_FUNCTIONS_SIZE".."250"
    )

    // TODO: implement (sqlext.h:744)
    /*int(
        "_FUNC_EXISTS",
    )*/

    IntConstant(
        "MAX_DRIVER_CONNECTIONS".."0",
        "MAXIMUM_DRIVER_CONNECTIONS".."SQL_MAX_DRIVER_CONNECTIONS",
        "MAX_CONCURRENT_ACTIVITIES".."1",
        "MAXIMUM_CONCURRENT_ACTIVITIES".."SQL_MAX_CONCURRENT_ACTIVITIES",
        "DATA_SOURCE_NAME".."2",
        "FETCH_DIRECTION".."8",
        "SERVER_NAME".."13",
        "SEARCH_PATTERN_ESCAPE".."14",
        "DBMS_NAME".."17",
        "DBMS_VER".."18",
        "ACCESSIBLE_TABLES".."19",
        "ACCESSIBLE_PROCEDURES".."20",
        "CURSOR_COMMIT_BEHAVIOR".."23",
        "DATA_SOURCE_READ_ONLY".."25",
        "DEFAULT_TXN_ISOLATION".."26",
        "IDENTIFIER_CASE".."28",
        "IDENTIFIER_QUOTE_CHAR".."29",
        "MAX_COLUMN_NAME_LEN".."30",
        "MAXIMUM_COLUMN_NAME_LENGTH".."SQL_MAX_COLUMN_NAME_LEN",
        "MAX_CURSOR_NAME_LEN".."31",
        "MAXIMUM_CURSOR_NAME_LENGTH".."SQL_MAX_CURSOR_NAME_LEN",
        "MAX_SCHEMA_NAME_LEN".."32",
        "MAXIMUM_SCHEMA_NAME_LENGTH".."SQL_MAX_SCHEMA_NAME_LEN",
        "MAX_CATALOG_NAME_LEN".."34",
        "MAXIMUM_CATALOG_NAME_LENGTH".."SQL_MAX_CATALOG_NAME_LEN",
        "MAX_TABLE_NAME_LEN".."35",
        "SCROLL_CONCURRENCY".."43",
        "TXN_CAPABLE".."46",
        "TRANSACTION_CAPABLE".."SQL_TXN_CAPABLE",
        "USER_NAME".."47",
        "TXN_ISOLATION_OPTION".."72",
        "TRANSACTION_ISOLATION_OPTION".."SQL_TXN_ISOLATION_OPTION",
        "INTEGRITY".."73",
        "GETDATA_EXTENSIONS".."81",
        "NULL_COLLATION".."85",
        "ALTER_TABLE".."86",
        "ORDER_BY_COLUMNS_IN_SELECT".."90",
        "SPECIAL_CHARACTERS".."94",
        "MAX_COLUMNS_IN_GROUP_BY".."97",
        "MAXIMUM_COLUMNS_IN_GROUP_BY".."SQL_MAX_COLUMNS_IN_GROUP_BY",
        "MAX_COLUMNS_IN_INDEX".."98",
        "MAXIMUM_COLUMNS_IN_INDEX".."SQL_MAX_COLUMNS_IN_INDEX",
        "MAX_COLUMNS_IN_ORDER_BY".."99",
        "MAXIMUM_COLUMNS_IN_ORDER_BY".."SQL_MAX_COLUMNS_IN_ORDER_BY",
        "MAX_COLUMNS_IN_SELECT".."100",
        "MAXIMUM_COLUMNS_IN_SELECT".."SQL_MAX_COLUMNS_IN_SELECT",
        "MAX_COLUMNS_IN_TABLE".."101",
        "MAX_INDEX_SIZE".."102",
        "MAXIMUM_INDEX_SIZE".."SQL_MAX_INDEX_SIZE",
        "MAX_ROW_SIZE".."104",
        "MAXIMUM_ROW_SIZE".."SQL_MAX_ROW_SIZE",
        "MAX_STATEMENT_LEN".."105",
        "MAXIMUM_STATEMENT_LENGTH".."SQL_MAX_STATEMENT_LEN",
        "MAX_TABLES_IN_SELECT".."106",
        "MAXIMUM_TABLES_IN_SELECT".."SQL_MAX_TABLES_IN_SELECT",
        "MAX_USER_NAME_LEN".."107",
        "MAXIMUM_USER_NAME_LENGTH".."SQL_MAX_USER_NAME_LEN",
        "OJ_CAPABILITIES".."115",
        "OUTER_JOIN_CAPABILITIES".."SQL_OJ_CAPABILITIES",
        "XOPEN_CLI_YEAR".."10000",
        "CURSOR_SENSITIVITY".."10001",
        "DESCRIBE_PARAMETER".."10002",
        "CATALOG_NAME".."10003",
        "COLLATION_SEQ".."10004",
        "MAX_IDENTIFIER_LEN".."10005",
        "MAXIMUM_IDENTIFIER_LENGTH".."SQL_MAX_IDENTIFIER_LEN"
    )

    IntConstant(
        "AT_ADD_COLUMN"..0x00000001,
        "AT_DROP_COLUMN"..0x00000002,
        "AT_ADD_CONSTRAINT"..0x00000008,

        "AT_ADD_COLUMN_SINGLE"..0x00000020,
        "AT_ADD_COLUMN_DEFAULT"..0x00000040,
        "AT_ADD_COLUMN_COLLATION"..0x00000080,
        "AT_SET_COLUMN_DEFAULT"..0x00000100,
        "AT_DROP_COLUMN_DEFAULT"..0x00000200,
        "AT_DROP_COLUMN_CASCADE"..0x00000400,
        "AT_DROP_COLUMN_RESTRICT"..0x00000800,
        "AT_ADD_TABLE_CONSTRAINT"..0x00001000,
        "AT_DROP_TABLE_CONSTRAINT_CASCADE"..0x00002000,
        "AT_DROP_TABLE_CONSTRAINT_RESTRICT"..0x00004000,
        "AT_CONSTRAINT_NAME_DEFINITION"..0x00008000,
        "AT_CONSTRAINT_INITIALLY_DEFERRED"..0x00010000,
        "AT_CONSTRAINT_INITIALLY_IMMEDIATE"..0x00020000,
        "AT_CONSTRAINT_DEFERRABLE"..0x00040000,
        "AT_CONSTRAINT_NON_DEFERRABLE"..0x00080000
    )

    ShortConstant(
        "CB_DELETE".."0",
        "CB_CLOSE".."1",
        "CB_PRESERVE".."2"
    )

    IntConstant(
        "FD_FETCH_NEXT"..0x00000001,
        "FD_FETCH_FIRST"..0x00000002,
        "FD_FETCH_LAST"..0x00000004,
        "FD_FETCH_PRIOR"..0x00000008,
        "FD_FETCH_ABSOLUTE"..0x00000010,
        "FD_FETCH_RELATIVE"..0x00000020
    )

    IntConstant(
        "GD_ANY_COLUMN"..0x00000001,
        "GD_ANY_ORDER"..0x00000002
    )

    ShortConstant(
        "IC_UPPER".."1",
        "IC_LOWER".."2",
        "IC_SENSITIVE".."3",
        "IC_MIXED".."4"
    )

    IntConstant(
        "OJ_LEFT"..0x00000001,
        "OJ_RIGHT"..0x00000002,
        "OJ_FULL"..0x00000004,
        "OJ_NESTED"..0x00000008,
        "OJ_NOT_ORDERED"..0x00000010,
        "OJ_INNER"..0x00000020,
        "OJ_ALL_COMPARISON_OPS"..0x00000040
    )

    IntConstant(
        "SCCO_READ_ONLY"..0x00000001,
        "SCCO_LOCK"..0x00000002,
        "SCCO_OPT_ROWVER"..0x00000004,
        "SCCO_OPT_VALUES"..0x00000008
    )

    ShortConstant(
        "TC_NONE".."0",
        "TC_DML".."1",
        "TC_ALL".."2",
        "TC_DDL_COMMIT".."3",
        "TC_DDL_IGNORE".."4"
    )

    IntConstant(
        "TRANSACTION_READ_UNCOMMITTED"..0x00000001,
        "TRANSACTION_READ_COMMITTED"..0x00000002,
        "TRANSACTION_REPEATABLE_READ"..0x00000004,
        "TRANSACTION_SERIALIZABLE"..0x00000008
    )

    ShortConstant(
        "NC_HIGH".."0",
        "NC_LOW".."1"
    )

    // ---
    // sqlext.h
    // ---

    ShortConstant(
        "SPEC_MAJOR".."3",
        "SPEC_MINOR".."80",
        "SQLSTATE_SIZE".."5",
        "MAX_DSN_LENGTH".."32",
        "MAX_OPTION_STRING_LENGTH".."256"
    )

    ShortConstant(
        "CP_OFF".."0",
        "CP_ONE_PER_DRIVER".."1",
        "CP_ONE_PER_HENV".."2",
        "CP_DRIVER_AWARE".."3",
        "CP_DEFAULT".."SQL_CP_OFF"
    )

    ShortConstant(
        "CP_STRICT_MATCH".."0",
        "CP_RELAXED_MATCH".."1",
        "CP_MATCH_DEFAULT".."SQL_CP_STRICT_MATCH"
    )

    ShortConstant(
        "OV_ODBC2".."2",
        "OV_ODBC3".."3",
        "OV_ODBC3_80".."380"
    )

    ShortConstant(
        "MODE_READ_WRITE".."0",
        "MODE_READ_ONLY".."1",
        "MODE_DEFAULT".."SQL_MODE_READ_WRITE"
    )

    ShortConstant(
        "AUTOCOMMIT_OFF".."0",
        "AUTOCOMMIT_ON".."1",
        "AUTOCOMMIT_DEFAULT".."SQL_AUTOCOMMIT_ON"
    )

    ShortConstant(
        "LOGIN_TIMEOUT_DEFAULT".."15"
    )

    ShortConstant(
        "OPT_TRACE_OFF".."0",
        "OPT_TRACE_ON".."1",
        "OPT_TRACE_DEFAULT".."SQL_OPT_TRACE_OFF"
    )

    StringConstant(
        "OPT_TRACE_FILE_DEFAULT".."""\\SQL.LOG"""
    )

    LongConstant(
        "CUR_USE_IF_NEEDED"..0L,
        "CUR_USE_ODBC"..1L,
        "CUR_USE_DRIVER"..2L,
        "CUR_DEFAULT".."SQL_CUR_USE_DRIVER"
    )

    ShortConstant(
        "DB_RETURN_TO_POOL".."0",
        "DB_DISCONNECT".."1",
        "DB_DEFAULT".."SQL_DB_RETURN_TO_POOL"
    )

    ShortConstant(
        "DTC_DONE".."0"
    )

    ShortConstant(
        "CD_TRUE".."1",
        "CD_FALSE".."0"
    )

    ShortConstant(
        "AA_TRUE".."1",
        "AA_FALSE".."0"
    )

    ShortConstant(
        "RESET_CONNECTION_YES".."1"
    )

    ShortConstant(
        "ASYNC_DBC_ENABLE_ON".."1",
        "ASYNC_DBC_ENABLE_OFF".."0",
        "ASYNC_DBC_ENABLE_DEFAULT".."SQL_ASYNC_DBC_ENABLE_OFF"
    )

    IntConstant(
        "IS_POINTER".."-4",
        "IS_UINTEGER".."-5",
        "IS_INTEGER".."-6",
        "IS_USMALLINT".."-7",
        "IS_SMALLINT".."-7"
    )

    ShortConstant(
        "PARAM_BIND_BY_COLUMN".."0",
        "PARAM_BIND_TYPE_DEFAULT".."SQL_PARAM_BIND_BY_COLUMN"
    )

    ShortConstant(
        "QUERY_TIMEOUT_DEFAULT".."0"
    )

    ShortConstant(
        "MAX_ROWS_DEFAULT".."0"
    )

    ShortConstant(
        "NOSCAN_OFF".."0",
        "NOSCAN_ON".."1",
        "NOSCAN_DEFAULT".."SQL_NOSCAN_OFF"
    )

    ShortConstant(
        "MAX_LENGTH_DEFAULT".."0"
    )

    ShortConstant(
        "ASYNC_ENABLE_OFF".."0",
        "ASYNC_ENABLE_ON".."1",
        "ASYNC_ENABLE_DEFAULT".."SQL_ASYNC_ENABLE_OFF"
    )

    ShortConstant(
        "BIND_BY_COLUMN".."0",
        "BIND_TYPE_DEFAULT".."SQL_BIND_BY_COLUMN"
    )

    ShortConstant(
        "CONCUR_READ_ONLY".."1",
        "CONCUR_LOCK".."2",
        "CONCUR_ROWVER".."3",
        "CONCUR_VALUES".."4",
        "CONCUR_DEFAULT".."SQL_CONCUR_READ_ONLY"
    )

    ShortConstant(
        "CURSOR_FORWARD_ONLY".."0",
        "CURSOR_KEYSET_DRIVEN".."1",
        "CURSOR_DYNAMIC".."2",
        "CURSOR_STATIC".."3",
        "CURSOR_TYPE_DEFAULT".."SQL_CURSOR_FORWARD_ONLY"
    )

    /*ShortConstant(
        "ROWSET_SIZE_DEFAULT".."1"
    )*/

    ShortConstant(
        "KEYSET_SIZE_DEFAULT".."0"
    )

    ShortConstant(
        "SC_NON_UNIQUE".."0",
        "SC_TRY_UNIQUE".."1",
        "SC_UNIQUE".."2"
    )

    ShortConstant(
        "RD_OFF".."0",
        "RD_ON".."1",
        "RD_DEFAULT".."SQL_RD_ON"
    )

    ShortConstant(
        "UB_OFF".."0",
        "UB_ON".."1",
        "UB_FIXED".."SQL_UB_ON",
        "UB_VARIABLE".."2",
        "UB_DEFAULT".."SQL_UB_OFF"
    )

    ShortConstant(
        "COLUMN_COUNT".."0",
        "COLUMN_NAME".."1",
        "COLUMN_TYPE".."2",
        "COLUMN_LENGTH".."3",
        "COLUMN_PRECISION".."4",
        "COLUMN_SCALE".."5",
        "COLUMN_DISPLAY_SIZE".."6",
        "COLUMN_NULLABLE".."7",
        "COLUMN_UNSIGNED".."8",
        "COLUMN_MONEY".."9",
        "COLUMN_UPDATABLE".."10",
        "COLUMN_AUTO_INCREMENT".."11",
        "COLUMN_CASE_SENSITIVE".."12",
        "COLUMN_SEARCHABLE".."13",
        "COLUMN_TYPE_NAME".."14",
        "COLUMN_TABLE_NAME".."15",
        "COLUMN_OWNER_NAME".."16",
        "COLUMN_QUALIFIER_NAME".."17",
        "COLUMN_LABEL".."18",
        "COLATT_OPT_MAX".."SQL_COLUMN_LABEL",
        "COLATT_OPT_MIN".."SQL_COLUMN_COUNT"
    )

    ShortConstant(
        "DESC_ARRAY_SIZE".."20",
        "DESC_ARRAY_STATUS_PTR".."21",
        "DESC_AUTO_UNIQUE_VALUE".."SQL_COLUMN_AUTO_INCREMENT",
        "DESC_BASE_COLUMN_NAME".."22",
        "DESC_BASE_TABLE_NAME".."23",
        "DESC_BIND_OFFSET_PTR".."24",
        "DESC_BIND_TYPE".."25",
        "DESC_CASE_SENSITIVE".."SQL_COLUMN_CASE_SENSITIVE",
        "DESC_CATALOG_NAME".."SQL_COLUMN_QUALIFIER_NAME",
        "DESC_CONCISE_TYPE".."SQL_COLUMN_TYPE",
        "DESC_DATETIME_INTERVAL_PRECISION".."26",
        "DESC_DISPLAY_SIZE".."SQL_COLUMN_DISPLAY_SIZE",
        "DESC_FIXED_PREC_SCALE".."SQL_COLUMN_MONEY",
        "DESC_LABEL".."SQL_COLUMN_LABEL",
        "DESC_LITERAL_PREFIX".."27",
        "DESC_LITERAL_SUFFIX".."28",
        "DESC_LOCAL_TYPE_NAME".."29",
        "DESC_MAXIMUM_SCALE".."30",
        "DESC_MINIMUM_SCALE".."31",
        "DESC_NUM_PREC_RADIX".."32",
        "DESC_PARAMETER_TYPE".."33",
        "DESC_ROWS_PROCESSED_PTR".."34",
        "DESC_ROWVER".."35",
        "DESC_SCHEMA_NAME".."SQL_COLUMN_OWNER_NAME",
        "DESC_SEARCHABLE".."SQL_COLUMN_SEARCHABLE",
        "DESC_TYPE_NAME".."SQL_COLUMN_TYPE_NAME",
        "DESC_TABLE_NAME".."SQL_COLUMN_TABLE_NAME",
        "DESC_UNSIGNED".."SQL_COLUMN_UNSIGNED",
        "DESC_UPDATABLE".."SQL_COLUMN_UPDATABLE"
    )

    ShortConstant(
        "DIAG_CURSOR_ROW_COUNT".."-1249",
        "DIAG_ROW_NUMBER".."-1248",
        "DIAG_COLUMN_NUMBER".."-1247"
    )

    ShortConstant(
        "DATE".."9",
        "INTERVAL".."10",
        "TIME".."10",
        "TIMESTAMP".."11",
        "LONGVARCHAR".."-1",
        "BINARY".."-2",
        "VARBINARY".."-3",
        "LONGVARBINARY".."-4",
        "BIGINT".."-5",
        "TINYINT".."-6",
        "BIT".."-7",
        "GUID".."-11"
    )

    ShortConstant(
        "CODE_YEAR".."1",
        "CODE_MONTH".."2",
        "CODE_DAY".."3",
        "CODE_HOUR".."4",
        "CODE_MINUTE".."5",
        "CODE_SECOND".."6",
        "CODE_YEAR_TO_MONTH".."7",
        "CODE_DAY_TO_HOUR".."8",
        "CODE_DAY_TO_MINUTE".."9",
        "CODE_DAY_TO_SECOND".."10",
        "CODE_HOUR_TO_MINUTE".."11",
        "CODE_HOUR_TO_SECOND".."12",
        "CODE_MINUTE_TO_SECOND".."13",
        "INTERVAL_YEAR".."100 + SQL_CODE_YEAR",
        "INTERVAL_MONTH".."100 + SQL_CODE_MONTH",
        "INTERVAL_DAY".."100 + SQL_CODE_DAY",
        "INTERVAL_HOUR".."100 + SQL_CODE_HOUR",
        "INTERVAL_MINUTE".."100 + SQL_CODE_MINUTE",
        "INTERVAL_SECOND".."100 + SQL_CODE_SECOND",
        "INTERVAL_YEAR_TO_MONTH".."100 + SQL_CODE_YEAR_TO_MONTH",
        "INTERVAL_DAY_TO_HOUR".."100 + SQL_CODE_DAY_TO_HOUR",
        "INTERVAL_DAY_TO_MINUTE".."100 + SQL_CODE_DAY_TO_MINUTE",
        "INTERVAL_DAY_TO_SECOND".."100 + SQL_CODE_DAY_TO_SECOND",
        "INTERVAL_HOUR_TO_MINUTE".."100 + SQL_CODE_HOUR_TO_MINUTE",
        "INTERVAL_HOUR_TO_SECOND".."100 + SQL_CODE_HOUR_TO_SECOND",
        "INTERVAL_MINUTE_TO_SECOND".."100 + SQL_CODE_MINUTE_TO_SECOND"
    )

    ShortConstant(
        "WCHAR".."-8",
        "WVARCHAR".."-9",
        "WLONGVARCHAR".."-10",
        "C_WCHAR".."SQL_WCHAR"
    )

    ShortConstant(
        "UNICODE".."SQL_WCHAR",
        "UNICODE_VARCHAR".."SQL_WVARCHAR",
        "UNICODE_LONGVARCHAR".."SQL_WLONGVARCHAR",
        "UNICODE_CHAR".."SQL_WCHAR"
    )

    ShortConstant(
        "SIGNED_OFFSET".."-20",
        "UNSIGNED_OFFSET".."-22"
    )

    ShortConstant(
        "C_CHAR".."SQL_CHAR",
        "C_LONG".."SQL_INTEGER",
        "C_SHORT".."SQL_SMALLINT",
        "C_FLOAT".."SQL_REAL",
        "C_DOUBLE".."SQL_DOUBLE",
        "C_NUMERIC".."SQL_NUMERIC",
        "C_DEFAULT".."99",
        "C_DATE".."SQL_DATE",
        "C_TIME".."SQL_TIME",
        "C_TIMESTAMP".."SQL_TIMESTAMP",
        "C_TYPE_DATE".."SQL_TYPE_DATE",
        "C_TYPE_TIME".."SQL_TYPE_TIME",
        "C_TYPE_TIMESTAMP".."SQL_TYPE_TIMESTAMP",
        "C_INTERVAL_YEAR".."SQL_INTERVAL_YEAR",
        "C_INTERVAL_MONTH".."SQL_INTERVAL_MONTH",
        "C_INTERVAL_DAY".."SQL_INTERVAL_DAY",
        "C_INTERVAL_HOUR".."SQL_INTERVAL_HOUR",
        "C_INTERVAL_MINUTE".."SQL_INTERVAL_MINUTE",
        "C_INTERVAL_SECOND".."SQL_INTERVAL_SECOND",
        "C_INTERVAL_YEAR_TO_MONTH".."SQL_INTERVAL_YEAR_TO_MONTH",
        "C_INTERVAL_DAY_TO_HOUR".."SQL_INTERVAL_DAY_TO_HOUR",
        "C_INTERVAL_DAY_TO_MINUTE".."SQL_INTERVAL_DAY_TO_MINUTE",
        "C_INTERVAL_DAY_TO_SECOND".."SQL_INTERVAL_DAY_TO_SECOND",
        "C_INTERVAL_HOUR_TO_MINUTE".."SQL_INTERVAL_HOUR_TO_MINUTE",
        "C_INTERVAL_HOUR_TO_SECOND".."SQL_INTERVAL_HOUR_TO_SECOND",
        "C_INTERVAL_MINUTE_TO_SECOND".."SQL_INTERVAL_MINUTE_TO_SECOND",
        "C_BINARY".."SQL_BINARY",
        "C_BIT".."SQL_BIT",
        "C_SBIGINT".."SQL_BIGINT+SQL_SIGNED_OFFSET",
        "C_UBIGINT".."SQL_BIGINT+SQL_UNSIGNED_OFFSET",
        "C_TINYINT".."SQL_TINYINT",
        "C_SLONG".."SQL_C_LONG+SQL_SIGNED_OFFSET",
        "C_SSHORT".."SQL_C_SHORT+SQL_SIGNED_OFFSET",
        "C_STINYINT".."SQL_TINYINT+SQL_SIGNED_OFFSET",
        "C_ULONG".."SQL_C_LONG+SQL_UNSIGNED_OFFSET",
        "C_USHORT".."SQL_C_SHORT+SQL_UNSIGNED_OFFSET",
        "C_UTINYINT".."SQL_TINYINT+SQL_UNSIGNED_OFFSET",
        "C_BOOKMARK".."SQL_C_UBIGINT",
        "C_GUID".."SQL_GUID",
        "C_VARBOOKMARK".."SQL_C_BINARY"
    )

    ShortConstant(
        "TYPE_NULL".."0"
    )

    ShortConstant(
        "DRIVER_C_TYPE_BASE"..0x4000.s
    )

    ShortConstant(
        "DRIVER_SQL_TYPE_BASE"..0x4000.s,
        "DRIVER_DESC_FIELD_BASE"..0x4000.s,
        "DRIVER_DIAG_FIELD_BASE"..0x4000.s,
        "DRIVER_INFO_TYPE_BASE"..0x4000.s
    )

    ShortConstant(
        "NO_ROW_NUMBER".."-1",
        "NO_COLUMN_NUMBER".."-1",
        "ROW_NUMBER_UNKNOWN".."-2",
        "COLUMN_NUMBER_UNKNOWN".."-2"
    )

    ShortConstant(
        "DEFAULT_PARAM".."-5",
        "IGNORE".."-6",
        "COLUMN_IGNORE".."SQL_IGNORE",
        "LEN_DATA_AT_EXEC_OFFSET".."-100"
    )

    IntConstant(
        "LEN_BINARY_ATTR_OFFSET".."-100"
    )

    ShortConstant(
        "PARAM_TYPE_UNKNOWN".."0",
        "PARAM_INPUT".."1",
        "PARAM_INPUT_OUTPUT".."2",
        "RESULT_COL".."3",
        "PARAM_OUTPUT".."4",
        "RETURN_VALUE".."5",
        "PARAM_INPUT_OUTPUT_STREAM".."8",
        "PARAM_OUTPUT_STREAM".."16"
    )

    ShortConstant(
        "PARAM_TYPE_DEFAULT".."SQL_PARAM_INPUT_OUTPUT",
        "SETPARAM_VALUE_MAX".."-1"
    )

    ShortConstant(
        "ATTR_READONLY".."0",
        "ATTR_WRITE".."1",
        "ATTR_READWRITE_UNKNOWN".."2"
    )

    ShortConstant(
        "UNSEARCHABLE".."0",
        "LIKE_ONLY".."1",
        "ALL_EXCEPT_LIKE".."2",
        "SEARCHABLE".."3",
        "PRED_SEARCHABLE".."SQL_SEARCHABLE"
    )

    ShortConstant(
        "COL_PRED_CHAR".."SQL_LIKE_ONLY",
        "COL_PRED_BASIC".."SQL_ALL_EXCEPT_LIKE"
    )

    ShortConstant(
        "NO_TOTAL".."-4"
    )

    ShortConstant(
        "INFO_FIRST".."0",
        "ACTIVE_CONNECTIONS".."0",
        "ACTIVE_STATEMENTS".."1",
        "DRIVER_HDBC".."3",
        "DRIVER_HENV".."4",
        "DRIVER_HSTMT".."5",
        "DRIVER_NAME".."6",
        "DRIVER_VER".."7",
        "ODBC_API_CONFORMANCE".."9",
        "ODBC_VER".."10",
        "ROW_UPDATES".."11",
        "ODBC_SAG_CLI_CONFORMANCE".."12",
        "ODBC_SQL_CONFORMANCE".."15",
        "PROCEDURES".."21",
        "CONCAT_NULL_BEHAVIOR".."22",
        "CURSOR_ROLLBACK_BEHAVIOR".."24",
        "EXPRESSIONS_IN_ORDERBY".."27",
        "MAX_OWNER_NAME_LEN".."32",
        "MAX_PROCEDURE_NAME_LEN".."33",
        "MAX_QUALIFIER_NAME_LEN".."34",
        "MULT_RESULT_SETS".."36",
        "MULTIPLE_ACTIVE_TXN".."37",
        "OUTER_JOINS".."38",
        "OWNER_TERM".."39",
        "PROCEDURE_TERM".."40",
        "QUALIFIER_NAME_SEPARATOR".."41",
        "QUALIFIER_TERM".."42",
        "SCROLL_OPTIONS".."44",
        "TABLE_TERM".."45",
        "CONVERT_FUNCTIONS".."48",
        "NUMERIC_FUNCTIONS".."49",
        "STRING_FUNCTIONS".."50",
        "SYSTEM_FUNCTIONS".."51",
        "TIMEDATE_FUNCTIONS".."52",
        "CONVERT_BIGINT".."53",
        "CONVERT_BINARY".."54",
        "CONVERT_BIT".."55",
        "CONVERT_CHAR".."56",
        "CONVERT_DATE".."57",
        "CONVERT_DECIMAL".."58",
        "CONVERT_DOUBLE".."59",
        "CONVERT_FLOAT".."60",
        "CONVERT_INTEGER".."61",
        "CONVERT_LONGVARCHAR".."62",
        "CONVERT_NUMERIC".."63",
        "CONVERT_REAL".."64",
        "CONVERT_SMALLINT".."65",
        "CONVERT_TIME".."66",
        "CONVERT_TIMESTAMP".."67",
        "CONVERT_TINYINT".."68",
        "CONVERT_VARBINARY".."69",
        "CONVERT_VARCHAR".."70",
        "CONVERT_LONGVARBINARY".."71",
        "ODBC_SQL_OPT_IEF".."73",
        "CORRELATION_NAME".."74",
        "NON_NULLABLE_COLUMNS".."75",
        "DRIVER_HLIB".."76",
        "DRIVER_ODBC_VER".."77",
        "LOCK_TYPES".."78",
        "POS_OPERATIONS".."79",
        "POSITIONED_STATEMENTS".."80",
        "BOOKMARK_PERSISTENCE".."82",
        "STATIC_SENSITIVITY".."83",
        "FILE_USAGE".."84",
        "COLUMN_ALIAS".."87",
        "GROUP_BY".."88",
        "KEYWORDS".."89",
        "OWNER_USAGE".."91",
        "QUALIFIER_USAGE".."92",
        "QUOTED_IDENTIFIER_CASE".."93",
        "SUBQUERIES".."95",
        "UNION".."96",
        "MAX_ROW_SIZE_INCLUDES_LONG".."103",
        "MAX_CHAR_LITERAL_LEN".."108",
        "TIMEDATE_ADD_INTERVALS".."109",
        "TIMEDATE_DIFF_INTERVALS".."110",
        "NEED_LONG_DATA_LEN".."111",
        "MAX_BINARY_LITERAL_LEN".."112",
        "LIKE_ESCAPE_CLAUSE".."113",
        "QUALIFIER_LOCATION".."114",
        "ACTIVE_ENVIRONMENTS".."116",
        "ALTER_DOMAIN".."117",
        "SQL_CONFORMANCE".."118",
        "DATETIME_LITERALS".."119",
        "ASYNC_MODE".."10021",
        "BATCH_ROW_COUNT".."120",
        "BATCH_SUPPORT".."121",
        "CATALOG_LOCATION".."SQL_QUALIFIER_LOCATION",
        "CATALOG_NAME_SEPARATOR".."SQL_QUALIFIER_NAME_SEPARATOR",
        "CATALOG_TERM".."SQL_QUALIFIER_TERM",
        "CATALOG_USAGE".."SQL_QUALIFIER_USAGE",
        "CONVERT_WCHAR".."122",
        "CONVERT_INTERVAL_DAY_TIME".."123",
        "CONVERT_INTERVAL_YEAR_MONTH".."124",
        "CONVERT_WLONGVARCHAR".."125",
        "CONVERT_WVARCHAR".."126",
        "CREATE_ASSERTION".."127",
        "CREATE_CHARACTER_SET".."128",
        "CREATE_COLLATION".."129",
        "CREATE_DOMAIN".."130",
        "CREATE_SCHEMA".."131",
        "CREATE_TABLE".."132",
        "CREATE_TRANSLATION".."133",
        "CREATE_VIEW".."134",
        "DRIVER_HDESC".."135",
        "DROP_ASSERTION".."136",
        "DROP_CHARACTER_SET".."137",
        "DROP_COLLATION".."138",
        "DROP_DOMAIN".."139",
        "DROP_SCHEMA".."140",
        "DROP_TABLE".."141",
        "DROP_TRANSLATION".."142",
        "DROP_VIEW".."143",
        "DYNAMIC_CURSOR_ATTRIBUTES1".."144",
        "DYNAMIC_CURSOR_ATTRIBUTES2".."145",
        "FORWARD_ONLY_CURSOR_ATTRIBUTES1".."146",
        "FORWARD_ONLY_CURSOR_ATTRIBUTES2".."147",
        "INDEX_KEYWORDS".."148",
        "INFO_SCHEMA_VIEWS".."149",
        "KEYSET_CURSOR_ATTRIBUTES1".."150",
        "KEYSET_CURSOR_ATTRIBUTES2".."151",
        "MAX_ASYNC_CONCURRENT_STATEMENTS".."10022",
        "ODBC_INTERFACE_CONFORMANCE".."152",
        "PARAM_ARRAY_ROW_COUNTS".."153",
        "PARAM_ARRAY_SELECTS".."154",
        "SCHEMA_TERM".."SQL_OWNER_TERM",
        "SCHEMA_USAGE".."SQL_OWNER_USAGE",
        "SQL92_DATETIME_FUNCTIONS".."155",
        "SQL92_FOREIGN_KEY_DELETE_RULE".."156",
        "SQL92_FOREIGN_KEY_UPDATE_RULE".."157",
        "SQL92_GRANT".."158",
        "SQL92_NUMERIC_VALUE_FUNCTIONS".."159",
        "SQL92_PREDICATES".."160",
        "SQL92_RELATIONAL_JOIN_OPERATORS".."161",
        "SQL92_REVOKE".."162",
        "SQL92_ROW_VALUE_CONSTRUCTOR".."163",
        "SQL92_STRING_FUNCTIONS".."164",
        "SQL92_VALUE_EXPRESSIONS".."165",
        "STANDARD_CLI_CONFORMANCE".."166",
        "STATIC_CURSOR_ATTRIBUTES1".."167",
        "STATIC_CURSOR_ATTRIBUTES2".."168",
        "AGGREGATE_FUNCTIONS".."169",
        "DDL_INDEX".."170",
        "DM_VER".."171",
        "INSERT_STATEMENT".."172",
        "CONVERT_GUID".."173",
        "UNION_STATEMENT".."SQL_UNION",

        "ASYNC_DBC_FUNCTIONS".."10023",
        "DRIVER_AWARE_POOLING_SUPPORTED".."10024",
        "ASYNC_NOTIFICATION".."10025"
    )

    IntConstant(
        "ASYNC_NOTIFICATION_NOT_CAPABLE"..0x00000000,
        "ASYNC_NOTIFICATION_CAPABLE"..0x00000001
    )

    ShortConstant(
        "DTC_TRANSITION_COST".."1750"
    )

    IntConstant(
        "CVT_CHAR"..0x00000001,
        "CVT_NUMERIC"..0x00000002,
        "CVT_DECIMAL"..0x00000004,
        "CVT_INTEGER"..0x00000008,
        "CVT_SMALLINT"..0x00000010,
        "CVT_FLOAT"..0x00000020,
        "CVT_REAL"..0x00000040,
        "CVT_DOUBLE"..0x00000080,
        "CVT_VARCHAR"..0x00000100,
        "CVT_LONGVARCHAR"..0x00000200,
        "CVT_BINARY"..0x00000400,
        "CVT_VARBINARY"..0x00000800,
        "CVT_BIT"..0x00001000,
        "CVT_TINYINT"..0x00002000,
        "CVT_BIGINT"..0x00004000,
        "CVT_DATE"..0x00008000,
        "CVT_TIME"..0x00010000,
        "CVT_TIMESTAMP"..0x00020000,
        "CVT_LONGVARBINARY"..0x00040000,
        "CVT_INTERVAL_YEAR_MONTH"..0x00080000,
        "CVT_INTERVAL_DAY_TIME"..0x00100000,
        "CVT_WCHAR"..0x00200000,
        "CVT_WLONGVARCHAR"..0x00400000,
        "CVT_WVARCHAR"..0x00800000,
        "CVT_GUID"..0x01000000
    )

    IntConstant(
        "FN_CVT_CONVERT"..0x00000001,
        "FN_CVT_CAST"..0x00000002
    )

    IntConstant(
        "FN_STR_CONCAT"..0x00000001,
        "FN_STR_INSERT"..0x00000002,
        "FN_STR_LEFT"..0x00000004,
        "FN_STR_LTRIM"..0x00000008,
        "FN_STR_LENGTH"..0x00000010,
        "FN_STR_LOCATE"..0x00000020,
        "FN_STR_LCASE"..0x00000040,
        "FN_STR_REPEAT"..0x00000080,
        "FN_STR_REPLACE"..0x00000100,
        "FN_STR_RIGHT"..0x00000200,
        "FN_STR_RTRIM"..0x00000400,
        "FN_STR_SUBSTRING"..0x00000800,
        "FN_STR_UCASE"..0x00001000,
        "FN_STR_ASCII"..0x00002000,
        "FN_STR_CHAR"..0x00004000,
        "FN_STR_DIFFERENCE"..0x00008000,
        "FN_STR_LOCATE_2"..0x00010000,
        "FN_STR_SOUNDEX"..0x00020000,
        "FN_STR_SPACE"..0x00040000,
        "FN_STR_BIT_LENGTH"..0x00080000,
        "FN_STR_CHAR_LENGTH"..0x00100000,
        "FN_STR_CHARACTER_LENGTH"..0x00200000,
        "FN_STR_OCTET_LENGTH"..0x00400000,
        "FN_STR_POSITION"..0x00800000
    )

    IntConstant(
        "SSF_CONVERT"..0x00000001,
        "SSF_LOWER"..0x00000002,
        "SSF_UPPER"..0x00000004,
        "SSF_SUBSTRING"..0x00000008,
        "SSF_TRANSLATE"..0x00000010,
        "SSF_TRIM_BOTH"..0x00000020,
        "SSF_TRIM_LEADING"..0x00000040,
        "SSF_TRIM_TRAILING"..0x00000080
    )

    IntConstant(
        "FN_NUM_ABS"..0x00000001,
        "FN_NUM_ACOS"..0x00000002,
        "FN_NUM_ASIN"..0x00000004,
        "FN_NUM_ATAN"..0x00000008,
        "FN_NUM_ATAN2"..0x00000010,
        "FN_NUM_CEILING"..0x00000020,
        "FN_NUM_COS"..0x00000040,
        "FN_NUM_COT"..0x00000080,
        "FN_NUM_EXP"..0x00000100,
        "FN_NUM_FLOOR"..0x00000200,
        "FN_NUM_LOG"..0x00000400,
        "FN_NUM_MOD"..0x00000800,
        "FN_NUM_SIGN"..0x00001000,
        "FN_NUM_SIN"..0x00002000,
        "FN_NUM_SQRT"..0x00004000,
        "FN_NUM_TAN"..0x00008000,
        "FN_NUM_PI"..0x00010000,
        "FN_NUM_RAND"..0x00020000,
        "FN_NUM_DEGREES"..0x00040000,
        "FN_NUM_LOG10"..0x00080000,
        "FN_NUM_POWER"..0x00100000,
        "FN_NUM_RADIANS"..0x00200000,
        "FN_NUM_ROUND"..0x00400000,
        "FN_NUM_TRUNCATE"..0x00800000
    )

    IntConstant(
        "SNVF_BIT_LENGTH"..0x00000001,
        "SNVF_CHAR_LENGTH"..0x00000002,
        "SNVF_CHARACTER_LENGTH"..0x00000004,
        "SNVF_EXTRACT"..0x00000008,
        "SNVF_OCTET_LENGTH"..0x00000010,
        "SNVF_POSITION"..0x00000020
    )

    IntConstant(
        "FN_TD_NOW"..0x00000001,
        "FN_TD_CURDATE"..0x00000002,
        "FN_TD_DAYOFMONTH"..0x00000004,
        "FN_TD_DAYOFWEEK"..0x00000008,
        "FN_TD_DAYOFYEAR"..0x00000010,
        "FN_TD_MONTH"..0x00000020,
        "FN_TD_QUARTER"..0x00000040,
        "FN_TD_WEEK"..0x00000080,
        "FN_TD_YEAR"..0x00000100,
        "FN_TD_CURTIME"..0x00000200,
        "FN_TD_HOUR"..0x00000400,
        "FN_TD_MINUTE"..0x00000800,
        "FN_TD_SECOND"..0x00001000,
        "FN_TD_TIMESTAMPADD"..0x00002000,
        "FN_TD_TIMESTAMPDIFF"..0x00004000,
        "FN_TD_DAYNAME"..0x00008000,
        "FN_TD_MONTHNAME"..0x00010000,
        "FN_TD_CURRENT_DATE"..0x00020000,
        "FN_TD_CURRENT_TIME"..0x00040000,
        "FN_TD_CURRENT_TIMESTAMP"..0x00080000,
        "FN_TD_EXTRACT"..0x00100000
    )

    IntConstant(
        "SDF_CURRENT_DATE"..0x00000001,
        "SDF_CURRENT_TIME"..0x00000002,
        "SDF_CURRENT_TIMESTAMP"..0x00000004
    )

    IntConstant(
        "FN_SYS_USERNAME"..0x00000001,
        "FN_SYS_DBNAME"..0x00000002,
        "FN_SYS_IFNULL"..0x00000004
    )

    IntConstant(
        "FN_TSI_FRAC_SECOND"..0x00000001,
        "FN_TSI_SECOND"..0x00000002,
        "FN_TSI_MINUTE"..0x00000004,
        "FN_TSI_HOUR"..0x00000008,
        "FN_TSI_DAY"..0x00000010,
        "FN_TSI_WEEK"..0x00000020,
        "FN_TSI_MONTH"..0x00000040,
        "FN_TSI_QUARTER"..0x00000080,
        "FN_TSI_YEAR"..0x00000100
    )

    IntConstant(
        "CA1_NEXT"..0x00000001,
        "CA1_ABSOLUTE"..0x00000002,
        "CA1_RELATIVE"..0x00000004,
        "CA1_BOOKMARK"..0x00000008
    )

    IntConstant(
        "CA1_LOCK_NO_CHANGE"..0x00000040,
        "CA1_LOCK_EXCLUSIVE"..0x00000080,
        "CA1_LOCK_UNLOCK"..0x00000100
    )

    IntConstant(
        "CA1_POS_POSITION"..0x00000200,
        "CA1_POS_UPDATE"..0x00000400,
        "CA1_POS_DELETE"..0x00000800,
        "CA1_POS_REFRESH"..0x00001000
    )

    IntConstant(
        "CA1_POSITIONED_UPDATE"..0x00002000,
        "CA1_POSITIONED_DELETE"..0x00004000,
        "CA1_SELECT_FOR_UPDATE"..0x00008000
    )

    IntConstant(
        "CA1_BULK_ADD"..0x00010000,
        "CA1_BULK_UPDATE_BY_BOOKMARK"..0x00020000,
        "CA1_BULK_DELETE_BY_BOOKMARK"..0x00040000,
        "CA1_BULK_FETCH_BY_BOOKMARK"..0x00080000
    )

    IntConstant(
        "CA2_READ_ONLY_CONCURRENCY"..0x00000001,
        "CA2_LOCK_CONCURRENCY"..0x00000002,
        "CA2_OPT_ROWVER_CONCURRENCY"..0x00000004,
        "CA2_OPT_VALUES_CONCURRENCY"..0x00000008
    )

    IntConstant(
        "CA2_SENSITIVITY_ADDITIONS"..0x00000010,
        "CA2_SENSITIVITY_DELETIONS"..0x00000020,
        "CA2_SENSITIVITY_UPDATES"..0x00000040
    )

    IntConstant(
        "CA2_MAX_ROWS_SELECT"..0x00000080,
        "CA2_MAX_ROWS_INSERT"..0x00000100,
        "CA2_MAX_ROWS_DELETE"..0x00000200,
        "CA2_MAX_ROWS_UPDATE"..0x00000400,
        "CA2_MAX_ROWS_CATALOG"..0x00000800,
        "CA2_MAX_ROWS_AFFECTS_ALL".."SQL_CA2_MAX_ROWS_SELECT | SQL_CA2_MAX_ROWS_INSERT | SQL_CA2_MAX_ROWS_DELETE | SQL_CA2_MAX_ROWS_UPDATE | SQL_CA2_MAX_ROWS_CATALOG"
    )

    IntConstant(
        "CA2_CRC_EXACT"..0x00001000,
        "CA2_CRC_APPROXIMATE"..0x00002000
    )

    IntConstant(
        "CA2_SIMULATE_NON_UNIQUE"..0x00004000,
        "CA2_SIMULATE_TRY_UNIQUE"..0x00008000,
        "CA2_SIMULATE_UNIQUE"..0x00010000
    )

    IntConstant(
        "OAC_NONE"..0x0000,
        "OAC_LEVEL1"..0x0001,
        "OAC_LEVEL2"..0x0002
    )

    IntConstant(
        "OSCC_NOT_COMPLIANT"..0x0000,
        "OSCC_COMPLIANT"..0x0001
    )

    IntConstant(
        "OSC_MINIMUM"..0x0000,
        "OSC_CORE"..0x0001,
        "OSC_EXTENDED"..0x0002
    )

    IntConstant(
        "CB_NULL"..0x0000,
        "CB_NON_NULL"..0x0001
    )

    IntConstant(
        "SO_FORWARD_ONLY"..0x00000001,
        "SO_KEYSET_DRIVEN"..0x00000002,
        "SO_DYNAMIC"..0x00000004,
        "SO_MIXED"..0x00000008,
        "SO_STATIC"..0x00000010
    )

    IntConstant(
        "FD_FETCH_BOOKMARK"..0x00000080
    )

    IntConstant(
        "CN_NONE"..0x0000,
        "CN_DIFFERENT"..0x0001,
        "CN_ANY"..0x0002
    )

    IntConstant(
        "NNC_NULL"..0x0000,
        "NNC_NON_NULL"..0x0001
    )

    IntConstant(
        "NC_START"..0x0002,
        "NC_END"..0x0004
    )

    IntConstant(
        "FILE_NOT_SUPPORTED"..0x0000,
        "FILE_TABLE"..0x0001,
        "FILE_QUALIFIER"..0x0002,
        "FILE_CATALOG".."SQL_FILE_QUALIFIER"
    )

    IntConstant(
        "GD_BLOCK"..0x00000004,
        "GD_BOUND"..0x00000008,
        "GD_OUTPUT_PARAMS"..0x00000010
    )

    IntConstant(
        "PS_POSITIONED_DELETE"..0x00000001,
        "PS_POSITIONED_UPDATE"..0x00000002,
        "PS_SELECT_FOR_UPDATE"..0x00000004
    )

    IntConstant(
        "GB_NOT_SUPPORTED"..0x0000,
        "GB_GROUP_BY_EQUALS_SELECT"..0x0001,
        "GB_GROUP_BY_CONTAINS_SELECT"..0x0002,
        "GB_NO_RELATION"..0x0003,
        "GB_COLLATE"..0x0004
    )

    IntConstant(
        "OU_DML_STATEMENTS"..0x00000001,
        "OU_PROCEDURE_INVOCATION"..0x00000002,
        "OU_TABLE_DEFINITION"..0x00000004,
        "OU_INDEX_DEFINITION"..0x00000008,
        "OU_PRIVILEGE_DEFINITION"..0x00000010
    )

    IntConstant(
        "SU_DML_STATEMENTS".."SQL_OU_DML_STATEMENTS",
        "SU_PROCEDURE_INVOCATION".."SQL_OU_PROCEDURE_INVOCATION",
        "SU_TABLE_DEFINITION".."SQL_OU_TABLE_DEFINITION",
        "SU_INDEX_DEFINITION".."SQL_OU_INDEX_DEFINITION",
        "SU_PRIVILEGE_DEFINITION".."SQL_OU_PRIVILEGE_DEFINITION"
    )

    IntConstant(
        "QU_DML_STATEMENTS"..0x00000001,
        "QU_PROCEDURE_INVOCATION"..0x00000002,
        "QU_TABLE_DEFINITION"..0x00000004,
        "QU_INDEX_DEFINITION"..0x00000008,
        "QU_PRIVILEGE_DEFINITION"..0x00000010
    )

    IntConstant(
        "CU_DML_STATEMENTS".."SQL_QU_DML_STATEMENTS",
        "CU_PROCEDURE_INVOCATION".."SQL_QU_PROCEDURE_INVOCATION",
        "CU_TABLE_DEFINITION".."SQL_QU_TABLE_DEFINITION",
        "CU_INDEX_DEFINITION".."SQL_QU_INDEX_DEFINITION",
        "CU_PRIVILEGE_DEFINITION".."SQL_QU_PRIVILEGE_DEFINITION"
    )

    IntConstant(
        "SQ_COMPARISON"..0x00000001,
        "SQ_EXISTS"..0x00000002,
        "SQ_IN"..0x00000004,
        "SQ_QUANTIFIED"..0x00000008,
        "SQ_CORRELATED_SUBQUERIES"..0x00000010
    )

    IntConstant(
        "U_UNION"..0x00000001,
        "U_UNION_ALL"..0x00000002
    )

    IntConstant(
        "BP_CLOSE"..0x00000001,
        "BP_DELETE"..0x00000002,
        "BP_DROP"..0x00000004,
        "BP_TRANSACTION"..0x00000008,
        "BP_UPDATE"..0x00000010,
        "BP_OTHER_HSTMT"..0x00000020,
        "BP_SCROLL"..0x00000040
    )

    IntConstant(
        "SS_ADDITIONS"..0x00000001,
        "SS_DELETIONS"..0x00000002,
        "SS_UPDATES"..0x00000004
    )

    IntConstant(
        "CV_CREATE_VIEW"..0x00000001,
        "CV_CHECK_OPTION"..0x00000002,
        "CV_CASCADED"..0x00000004,
        "CV_LOCAL"..0x00000008
    )

    IntConstant(
        "LCK_NO_CHANGE"..0x00000001,
        "LCK_EXCLUSIVE"..0x00000002,
        "LCK_UNLOCK"..0x00000004
    )

    IntConstant(
        "POS_POSITION"..0x00000001,
        "POS_REFRESH"..0x00000002,
        "POS_UPDATE"..0x00000004,
        "POS_DELETE"..0x00000008,
        "POS_ADD"..0x00000010
    )

    IntConstant(
        "QL_START"..0x0001,
        "QL_END"..0x0002
    )

    IntConstant(
        "AF_AVG"..0x00000001,
        "AF_COUNT"..0x00000002,
        "AF_MAX"..0x00000004,
        "AF_MIN"..0x00000008,
        "AF_SUM"..0x00000010,
        "AF_DISTINCT"..0x00000020,
        "AF_ALL"..0x00000040
    )

    IntConstant(
        "SC_SQL92_ENTRY"..0x00000001,
        "SC_FIPS127_2_TRANSITIONAL"..0x00000002,
        "SC_SQL92_INTERMEDIATE"..0x00000004,
        "SC_SQL92_FULL"..0x00000008
    )

    IntConstant(
        "DL_SQL92_DATE"..0x00000001,
        "DL_SQL92_TIME"..0x00000002,
        "DL_SQL92_TIMESTAMP"..0x00000004,
        "DL_SQL92_INTERVAL_YEAR"..0x00000008,
        "DL_SQL92_INTERVAL_MONTH"..0x00000010,
        "DL_SQL92_INTERVAL_DAY"..0x00000020,
        "DL_SQL92_INTERVAL_HOUR"..0x00000040,
        "DL_SQL92_INTERVAL_MINUTE"..0x00000080,
        "DL_SQL92_INTERVAL_SECOND"..0x00000100,
        "DL_SQL92_INTERVAL_YEAR_TO_MONTH"..0x00000200,
        "DL_SQL92_INTERVAL_DAY_TO_HOUR"..0x00000400,
        "DL_SQL92_INTERVAL_DAY_TO_MINUTE"..0x00000800,
        "DL_SQL92_INTERVAL_DAY_TO_SECOND"..0x00001000,
        "DL_SQL92_INTERVAL_HOUR_TO_MINUTE"..0x00002000,
        "DL_SQL92_INTERVAL_HOUR_TO_SECOND"..0x00004000,
        "DL_SQL92_INTERVAL_MINUTE_TO_SECOND"..0x00008000
    )

    IntConstant(
        "CL_START".."SQL_QL_START",
        "CL_END".."SQL_QL_END"
    )

    IntConstant(
        "BRC_PROCEDURES"..0x0000001,
        "BRC_EXPLICIT"..0x0000002,
        "BRC_ROLLED_UP"..0x0000004
    )

    IntConstant(
        "BS_SELECT_EXPLICIT"..0x00000001,
        "BS_ROW_COUNT_EXPLICIT"..0x00000002,
        "BS_SELECT_PROC"..0x00000004,
        "BS_ROW_COUNT_PROC"..0x00000008
    )

    ShortConstant(
        "PARC_BATCH".."1",
        "PARC_NO_BATCH".."2"
    )

    ShortConstant(
        "PAS_BATCH".."1",
        "PAS_NO_BATCH".."2",
        "PAS_NO_SELECT".."3"
    )

    IntConstant(
        "IK_NONE"..0x00000000,
        "IK_ASC"..0x00000001,
        "IK_DESC"..0x00000002,
        "IK_ALL".."SQL_IK_ASC | SQL_IK_DESC"
    )

    IntConstant(
        "ISV_ASSERTIONS"..0x00000001,
        "ISV_CHARACTER_SETS"..0x00000002,
        "ISV_CHECK_CONSTRAINTS"..0x00000004,
        "ISV_COLLATIONS"..0x00000008,
        "ISV_COLUMN_DOMAIN_USAGE"..0x00000010,
        "ISV_COLUMN_PRIVILEGES"..0x00000020,
        "ISV_COLUMNS"..0x00000040,
        "ISV_CONSTRAINT_COLUMN_USAGE"..0x00000080,
        "ISV_CONSTRAINT_TABLE_USAGE"..0x00000100,
        "ISV_DOMAIN_CONSTRAINTS"..0x00000200,
        "ISV_DOMAINS"..0x00000400,
        "ISV_KEY_COLUMN_USAGE"..0x00000800,
        "ISV_REFERENTIAL_CONSTRAINTS"..0x00001000,
        "ISV_SCHEMATA"..0x00002000,
        "ISV_SQL_LANGUAGES"..0x00004000,
        "ISV_TABLE_CONSTRAINTS"..0x00008000,
        "ISV_TABLE_PRIVILEGES"..0x00010000,
        "ISV_TABLES"..0x00020000,
        "ISV_TRANSLATIONS"..0x00040000,
        "ISV_USAGE_PRIVILEGES"..0x00080000,
        "ISV_VIEW_COLUMN_USAGE"..0x00100000,
        "ISV_VIEW_TABLE_USAGE"..0x00200000,
        "ISV_VIEWS"..0x00400000
    )

    ShortConstant(
        "AM_NONE".."0",
        "AM_CONNECTION".."1",
        "AM_STATEMENT".."2"
    )

    IntConstant(
        "AD_CONSTRAINT_NAME_DEFINITION"..0x00000001,
        "AD_ADD_DOMAIN_CONSTRAINT"..0x00000002,
        "AD_DROP_DOMAIN_CONSTRAINT"..0x00000004,
        "AD_ADD_DOMAIN_DEFAULT"..0x00000008,
        "AD_DROP_DOMAIN_DEFAULT"..0x00000010,
        "AD_ADD_CONSTRAINT_INITIALLY_DEFERRED"..0x00000020,
        "AD_ADD_CONSTRAINT_INITIALLY_IMMEDIATE"..0x00000040,
        "AD_ADD_CONSTRAINT_DEFERRABLE"..0x00000080,
        "AD_ADD_CONSTRAINT_NON_DEFERRABLE"..0x00000100
    )

    IntConstant(
        "CS_CREATE_SCHEMA"..0x00000001,
        "CS_AUTHORIZATION"..0x00000002,
        "CS_DEFAULT_CHARACTER_SET"..0x00000004
    )

    IntConstant(
        "CTR_CREATE_TRANSLATION"..0x00000001
    )

    IntConstant(
        "CA_CREATE_ASSERTION"..0x00000001,
        "CA_CONSTRAINT_INITIALLY_DEFERRED"..0x00000010,
        "CA_CONSTRAINT_INITIALLY_IMMEDIATE"..0x00000020,
        "CA_CONSTRAINT_DEFERRABLE"..0x00000040,
        "CA_CONSTRAINT_NON_DEFERRABLE"..0x00000080
    )

    IntConstant(
        "CCS_CREATE_CHARACTER_SET"..0x00000001,
        "CCS_COLLATE_CLAUSE"..0x00000002,
        "CCS_LIMITED_COLLATION"..0x00000004
    )

    IntConstant(
        "CCOL_CREATE_COLLATION"..0x00000001
    )

    IntConstant(
        "CDO_CREATE_DOMAIN"..0x00000001,
        "CDO_DEFAULT"..0x00000002,
        "CDO_CONSTRAINT"..0x00000004,
        "CDO_COLLATION"..0x00000008,
        "CDO_CONSTRAINT_NAME_DEFINITION"..0x00000010,
        "CDO_CONSTRAINT_INITIALLY_DEFERRED"..0x00000020,
        "CDO_CONSTRAINT_INITIALLY_IMMEDIATE"..0x00000040,
        "CDO_CONSTRAINT_DEFERRABLE"..0x00000080,
        "CDO_CONSTRAINT_NON_DEFERRABLE"..0x00000100
    )

    IntConstant(
        "CT_CREATE_TABLE"..0x00000001,
        "CT_COMMIT_PRESERVE"..0x00000002,
        "CT_COMMIT_DELETE"..0x00000004,
        "CT_GLOBAL_TEMPORARY"..0x00000008,
        "CT_LOCAL_TEMPORARY"..0x00000010,
        "CT_CONSTRAINT_INITIALLY_DEFERRED"..0x00000020,
        "CT_CONSTRAINT_INITIALLY_IMMEDIATE"..0x00000040,
        "CT_CONSTRAINT_DEFERRABLE"..0x00000080,
        "CT_CONSTRAINT_NON_DEFERRABLE"..0x00000100,
        "CT_COLUMN_CONSTRAINT"..0x00000200,
        "CT_COLUMN_DEFAULT"..0x00000400,
        "CT_COLUMN_COLLATION"..0x00000800,
        "CT_TABLE_CONSTRAINT"..0x00001000,
        "CT_CONSTRAINT_NAME_DEFINITION"..0x00002000
    )

    IntConstant(
        "DI_CREATE_INDEX"..0x00000001,
        "DI_DROP_INDEX"..0x00000002
    )

    IntConstant(
        "DC_DROP_COLLATION"..0x00000001
    )

    IntConstant(
        "DD_DROP_DOMAIN"..0x00000001,
        "DD_RESTRICT"..0x00000002,
        "DD_CASCADE"..0x00000004
    )

    IntConstant(
        "DS_DROP_SCHEMA"..0x00000001,
        "DS_RESTRICT"..0x00000002,
        "DS_CASCADE"..0x00000004
    )

    IntConstant(
        "DCS_DROP_CHARACTER_SET"..0x00000001
    )

    IntConstant(
        "DA_DROP_ASSERTION"..0x00000001
    )

    IntConstant(
        "DT_DROP_TABLE"..0x00000001,
        "DT_RESTRICT"..0x00000002,
        "DT_CASCADE"..0x00000004
    )

    IntConstant(
        "DTR_DROP_TRANSLATION"..0x00000001
    )

    IntConstant(
        "DV_DROP_VIEW"..0x00000001,
        "DV_RESTRICT"..0x00000002,
        "DV_CASCADE"..0x00000004
    )

    IntConstant(
        "IS_INSERT_LITERALS"..0x00000001,
        "IS_INSERT_SEARCHED"..0x00000002,
        "IS_SELECT_INTO"..0x00000004
    )

    ShortConstant(
        "OIC_CORE".."1",
        "OIC_LEVEL1".."2",
        "OIC_LEVEL2".."3"
    )

    IntConstant(
        "SFKD_CASCADE"..0x00000001,
        "SFKD_NO_ACTION"..0x00000002,
        "SFKD_SET_DEFAULT"..0x00000004,
        "SFKD_SET_NULL"..0x00000008
    )

    IntConstant(
        "SFKU_CASCADE"..0x00000001,
        "SFKU_NO_ACTION"..0x00000002,
        "SFKU_SET_DEFAULT"..0x00000004,
        "SFKU_SET_NULL"..0x00000008
    )

    IntConstant(
        "SG_USAGE_ON_DOMAIN"..0x00000001,
        "SG_USAGE_ON_CHARACTER_SET"..0x00000002,
        "SG_USAGE_ON_COLLATION"..0x00000004,
        "SG_USAGE_ON_TRANSLATION"..0x00000008,
        "SG_WITH_GRANT_OPTION"..0x00000010,
        "SG_DELETE_TABLE"..0x00000020,
        "SG_INSERT_TABLE"..0x00000040,
        "SG_INSERT_COLUMN"..0x00000080,
        "SG_REFERENCES_TABLE"..0x00000100,
        "SG_REFERENCES_COLUMN"..0x00000200,
        "SG_SELECT_TABLE"..0x00000400,
        "SG_UPDATE_TABLE"..0x00000800,
        "SG_UPDATE_COLUMN"..0x00001000
    )

    IntConstant(
        "SP_EXISTS"..0x00000001,
        "SP_ISNOTNULL"..0x00000002,
        "SP_ISNULL"..0x00000004,
        "SP_MATCH_FULL"..0x00000008,
        "SP_MATCH_PARTIAL"..0x00000010,
        "SP_MATCH_UNIQUE_FULL"..0x00000020,
        "SP_MATCH_UNIQUE_PARTIAL"..0x00000040,
        "SP_OVERLAPS"..0x00000080,
        "SP_UNIQUE"..0x00000100,
        "SP_LIKE"..0x00000200,
        "SP_IN"..0x00000400,
        "SP_BETWEEN"..0x00000800,
        "SP_COMPARISON"..0x00001000,
        "SP_QUANTIFIED_COMPARISON"..0x00002000
    )

    IntConstant(
        "SRJO_CORRESPONDING_CLAUSE"..0x00000001,
        "SRJO_CROSS_JOIN"..0x00000002,
        "SRJO_EXCEPT_JOIN"..0x00000004,
        "SRJO_FULL_OUTER_JOIN"..0x00000008,
        "SRJO_INNER_JOIN"..0x00000010,
        "SRJO_INTERSECT_JOIN"..0x00000020,
        "SRJO_LEFT_OUTER_JOIN"..0x00000040,
        "SRJO_NATURAL_JOIN"..0x00000080,
        "SRJO_RIGHT_OUTER_JOIN"..0x00000100,
        "SRJO_UNION_JOIN"..0x00000200
    )

    IntConstant(
        "SR_USAGE_ON_DOMAIN"..0x00000001,
        "SR_USAGE_ON_CHARACTER_SET"..0x00000002,
        "SR_USAGE_ON_COLLATION"..0x00000004,
        "SR_USAGE_ON_TRANSLATION"..0x00000008,
        "SR_GRANT_OPTION_FOR"..0x00000010,
        "SR_CASCADE"..0x00000020,
        "SR_RESTRICT"..0x00000040,
        "SR_DELETE_TABLE"..0x00000080,
        "SR_INSERT_TABLE"..0x00000100,
        "SR_INSERT_COLUMN"..0x00000200,
        "SR_REFERENCES_TABLE"..0x00000400,
        "SR_REFERENCES_COLUMN"..0x00000800,
        "SR_SELECT_TABLE"..0x00001000,
        "SR_UPDATE_TABLE"..0x00002000,
        "SR_UPDATE_COLUMN"..0x00004000
    )

    IntConstant(
        "SRVC_VALUE_EXPRESSION"..0x00000001,
        "SRVC_NULL"..0x00000002,
        "SRVC_DEFAULT"..0x00000004,
        "SRVC_ROW_SUBQUERY"..0x00000008
    )

    IntConstant(
        "SVE_CASE"..0x00000001,
        "SVE_CAST"..0x00000002,
        "SVE_COALESCE"..0x00000004,
        "SVE_NULLIF"..0x00000008
    )

    IntConstant(
        "SCC_XOPEN_CLI_VERSION1"..0x00000001,
        "SCC_ISO92_CLI"..0x00000002
    )

    IntConstant(
        "US_UNION".."SQL_U_UNION",
        "US_UNION_ALL".."SQL_U_UNION_ALL"
    )

    IntConstant(
        "DRIVER_AWARE_POOLING_NOT_CAPABLE"..0x00000000,
        "DRIVER_AWARE_POOLING_CAPABLE"..0x00000001
    )

    IntConstant(
        "DTC_ENLIST_EXPENSIVE"..0x00000001,
        "DTC_UNENLIST_EXPENSIVE"..0x00000002
    )

    IntConstant(
        "ASYNC_DBC_NOT_CAPABLE"..0x00000000,
        "ASYNC_DBC_CAPABLE"..0x00000001
    )

    ShortConstant(
        "FETCH_FIRST_USER".."31",
        "FETCH_FIRST_SYSTEM".."32"
    )

    ShortConstant(
        "ENTIRE_ROWSET".."0"
    )

    ShortConstant(
        "BEST_ROWID".."1",
        "ROWVER".."2"
    )

    ShortConstant(
        "PC_NOT_PSEUDO".."1"
    )

    ShortConstant(
        "QUICK".."0",
        "ENSURE".."1"
    )

    ShortConstant(
        "TABLE_STAT".."0"
    )

    StringConstant(
        "ALL_CATALOGS".."%",
        "ALL_SCHEMAS".."%",
        "ALL_TABLE_TYPES".."%"
    )

    ShortConstant(
        "FETCH_BOOKMARK".."8"
    )

    ShortConstant(
        "ROW_SUCCESS".."0",
        "ROW_DELETED".."1",
        "ROW_UPDATED".."2",
        "ROW_NOROW".."3",
        "ROW_ADDED".."4",
        "ROW_ERROR".."5",
        "ROW_SUCCESS_WITH_INFO".."6",
        "ROW_PROCEED".."0",
        "ROW_IGNORE".."1"
    )

    ShortConstant(
        "PARAM_SUCCESS".."0",
        "PARAM_SUCCESS_WITH_INFO".."6",
        "PARAM_ERROR".."5",
        "PARAM_UNUSED".."7",
        "PARAM_DIAG_UNAVAILABLE".."1",
        "PARAM_PROCEED".."0",
        "PARAM_IGNORE".."1"
    )

    ShortConstant(
        "CASCADE".."0",
        "RESTRICT".."1",
        "SET_NULL".."2",
        "NO_ACTION".."3",
        "SET_DEFAULT".."4",
        "INITIALLY_DEFERRED".."5",
        "INITIALLY_IMMEDIATE".."6",
        "NOT_DEFERRABLE".."7"
    )

    ShortConstant(
        "PT_UNKNOWN".."0",
        "PT_PROCEDURE".."1",
        "PT_FUNCTION".."2"
    )

    // ---
    // sqltypes.h
    // ---

    ShortConstant(
        "IS_YEAR".."1",
        "IS_MONTH".."2",
        "IS_DAY".."3",
        "IS_HOUR".."4",
        "IS_MINUTE".."5",
        "IS_SECOND".."6",
        "IS_YEAR_TO_MONTH".."7",
        "IS_DAY_TO_HOUR".."8",
        "IS_DAY_TO_MINUTE".."9",
        "IS_DAY_TO_SECOND".."10",
        "IS_HOUR_TO_MINUTE".."11",
        "IS_HOUR_TO_SECOND".."12",
        "IS_MINUTE_TO_SECOND".."13"
    )

    IntConstant(
        "MAX_NUMERIC_LEN".."16"
    )

    // ---
    // Connecting to a data source
    // ---

    SQLRETURN(
        "AllocHandle",

        SQLSMALLINT("HandleType"),
        nullable..SQLHANDLE("InputHandle"),
        Check(1)..SQLHANDLE.p("OutputHandle")
    )

    NativeName("SQLConnectW")..SQLRETURN(
        "Connect",

        SQLHDBC("ConnectionHandle"),
        Input..SQLCHARUTF16.p("ServerName"),
        AutoSize("ServerName")..SQLSMALLINT("NameLength1"),
        Input..SQLCHARUTF16.p("UserName"),
        AutoSize("UserName")..SQLSMALLINT("NameLength2"),
        Input..SQLCHARUTF16.p("Authentication"),
        AutoSize("Authentication")..SQLSMALLINT("NameLength3")
    )

    // ---
    // Obtaining information about a driver and data source
    // ---

    IgnoreMissing..NativeName("SQLDataSourcesW")..SQLRETURN(
        "DataSources",

        SQLHENV("EnvironmentHandle"),
        SQLUSMALLINT("Direction"),
        nullable..SQLCHARUTF16.p("ServerName"),
        AutoSize("ServerName")..SQLSMALLINT("BufferLength1"),
        Check(1)..SQLSMALLINT.p("NameLength1Ptr"),
        nullable..SQLCHARUTF16.p("Description"),
        AutoSize("Description")..SQLSMALLINT("BufferLength2"),
        Check(1)..SQLSMALLINT.p("NameLength2Ptr")
    )

    NativeName("SQLGetInfoW")..SQLRETURN(
        "GetInfo",

        SQLHDBC("ConnectionHandle"),
        SQLUSMALLINT("InfoType"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_POINTER
        )..nullable..SQLPOINTER("InfoValuePtr"),
        AutoSize("InfoValuePtr")..SQLSMALLINT("BufferLength"),
        Check(1)..nullable..SQLSMALLINT.p("StringLengthPtr")
    )

    SQLRETURN(
        "GetFunctions",

        SQLHDBC("ConnectionHandle"),
        SQLUSMALLINT("FunctionId"),
        Check(1)..SQLUSMALLINT.p("SupportedPtr")
    )

    NativeName("SQLGetTypeInfoW")..SQLRETURN(
        "GetTypeInfo",

        SQLHSTMT("StatementHandle"),
        SQLSMALLINT("DataType")
    )

    // ---
    // Setting and retrieving driver attributes
    // ---

    NativeName("SQLSetConnectAttrW")..SQLRETURN(
        "SetConnectAttr",

        SQLHDBC("ConnectionHandle"),
        SQLINTEGER("Attribute"),
        nullable..SQLPOINTER("Value"),
        AutoSize("Value")..SQLINTEGER("StringLength")
    )

    NativeName("SQLGetConnectAttrW")..SQLRETURN(
        "GetConnectAttr",

        SQLHDBC("ConnectionHandle"),
        SQLINTEGER("Attribute"),
        nullable..SQLPOINTER("ValuePtr"),
        AutoSize("ValuePtr")..SQLINTEGER("BufferLength"),
        Check(1)..SQLINTEGER.p("StringLengthPtr")
    )

    SQLRETURN(
        "SetEnvAttr",

        nullable..SQLHENV("EnvironmentHandle"),
        SQLINTEGER("Attribute"),
        nullable..SQLPOINTER("Value"),
        AutoSize("Value")..SQLINTEGER("StringLength")
    )

    SQLRETURN(
        "GetEnvAttr",

        SQLHENV("EnvironmentHandle"),
        SQLINTEGER("Attribute"),
        nullable..SQLPOINTER("ValuePtr"),
        AutoSize("ValuePtr")..SQLINTEGER("BufferLength"),
        Check(1)..SQLINTEGER.p("StringLengthPtr")
    )

    NativeName("SQLSetStmtAttrW")..SQLRETURN(
        "SetStmtAttr",

        SQLHSTMT("StatementHandle"),
        SQLINTEGER("Attribute"),
        nullable..SQLPOINTER("Value"),
        AutoSize("Value")..SQLINTEGER("StringLength")
    )

    NativeName("SQLGetStmtAttrW")..SQLRETURN(
        "GetStmtAttr",

        SQLHSTMT("StatementHandle"),
        SQLINTEGER("Attribute"),
        nullable..SQLPOINTER("ValuePtr"),
        AutoSize("ValuePtr")..SQLINTEGER("BufferLength"),
        Check(1)..nullable..SQLINTEGER.p("StringLengthPtr")
    )

    // ---
    // Setting and retrieving descriptor fields
    // ---

    NativeName("SQLGetDescFieldW")..SQLRETURN(
        "GetDescField",

        SQLHDESC("DescriptorHandle"),
        SQLSMALLINT("RecNumber"),
        SQLSMALLINT("FieldIdentifier"),
        nullable..SQLPOINTER("ValuePtr"),
        AutoSize("ValuePtr")..SQLINTEGER("BufferLength"),
        nullable..Check(1)..SQLINTEGER.p("StringLengthPtr")
    )

    NativeName("SQLGetDescRecW")..SQLRETURN(
        "GetDescRec",

        SQLHDESC("DescriptorHandle"),
        SQLSMALLINT("RecNumber"),
        nullable..SQLCHARUTF16.p("Name"),
        AutoSize("Name")..SQLSMALLINT("BufferLength"),
        Check(1)..nullable..SQLSMALLINT.p("StringLengthPtr"),
        Check(1)..nullable..SQLSMALLINT.p("TypePtr"),
        Check(1)..nullable..SQLSMALLINT.p("SubTypePtr"),
        Check(1)..nullable..SQLLEN.p("LengthPtr"),
        Check(1)..nullable..SQLSMALLINT.p("PrecisionPtr"),
        Check(1)..nullable..SQLSMALLINT.p("ScalePtr"),
        Check(1)..nullable..SQLSMALLINT.p("NullablePtr")
    )

    NativeName("SQLSetDescFieldW")..SQLRETURN(
        "SetDescField",

        SQLHDESC("DescriptorHandle"),
        SQLSMALLINT("RecNumber"),
        SQLSMALLINT("FieldIdentifier"),
        SQLPOINTER("ValuePtr"),
        AutoSize("ValuePtr")..SQLINTEGER("BufferLength")
    )

    SQLRETURN(
        "SetDescRec",

        SQLHDESC("DescriptorHandle"),
        SQLSMALLINT("RecNumber"),
        SQLSMALLINT("Type"),
        SQLSMALLINT("SubType"),
        SQLLEN("Length"),
        SQLSMALLINT("Precision"),
        SQLSMALLINT("Scale"),
        Check(1)..nullable..SQLPOINTER("DataPtr"),
        Check(1)..nullable..SQLLEN.p("StringLengthPtr"),
        Check(1)..nullable..SQLLEN.p("IndicatorPtr")
    )

    SQLRETURN(
        "CopyDesc",

        SQLHDESC("SourceDescHandle"),
        SQLHDESC("TargetDescHandle")
    )

    // ---
    // Preparing SQL requests
    // ---

    NativeName("SQLPrepareW")..SQLRETURN(
        "Prepare",

        SQLHSTMT("StatementHandle"),
        Input..SQLCHARUTF16.p("StatementText"),
        AutoSize("StatementText")..SQLINTEGER("TextLength")
    )

    NativeName("SQLGetCursorNameW")..SQLRETURN(
        "GetCursorName",

        SQLHSTMT("StatementHandle"),
        nullable..SQLCHARUTF16.p("CursorName"),
        AutoSize("CursorName")..SQLSMALLINT("BufferLength"),
        Check(1)..SQLSMALLINT.p("NameLengthPtr")
    )

    NativeName("SQLSetCursorNameW")..SQLRETURN(
        "SetCursorName",

        SQLHSTMT("StatementHandle"),
        SQLCHARUTF16.p("CursorName"),
        AutoSize("CursorName")..SQLSMALLINT("NameLength")
    )

    // ---
    // Submitting requests
    // ---

    SQLRETURN(
        "Execute",

        SQLHSTMT("StatementHandle")
    )

    NativeName("SQLExecDirectW")..SQLRETURN(
        "ExecDirect",

        SQLHSTMT("StatementHandle"),
        Input..SQLCHARUTF16.p("StatementText"),
        AutoSize("StatementText")..SQLINTEGER("TextLength")
    )

    SQLRETURN(
        "ParamData",

        SQLHSTMT("StatementHandle"),
        Check(1)..SQLPOINTER.p("ValuePtrPtr")
    )

    SQLRETURN(
        "PutData",

        SQLHSTMT("StatementHandle"),
        SQLPOINTER("DataPtr"),
        AutoSize("DataPtr")..SQLLEN("StrLen_or_Ind")
    )

    // ---
    // Retrieving results and information about results
    // ---

    SQLRETURN(
        "RowCount",

        SQLHSTMT("StatementHandle"),
        Check(1)..SQLLEN.p("RowCountPtr")
    )

    SQLRETURN(
        "NumResultCols",

        SQLHSTMT("StatementHandle"),
        Check(1)..SQLSMALLINT.p("ColumnCountPtr")
    )

    NativeName("SQLDescribeColW")..SQLRETURN(
        "DescribeCol",

        SQLHSTMT("StatementHandle"),
        SQLUSMALLINT("ColumnNumber"),
        nullable..SQLCHARUTF16.p("ColumnName"),
        AutoSize("ColumnName")..SQLSMALLINT("BufferLength"),
        Check(1)..SQLSMALLINT.p("NameLengthPtr"),
        Check(1)..SQLSMALLINT.p("DataTypePtr"),
        Check(1)..SQLULEN.p("ColumnSizePtr"),
        Check(1)..SQLSMALLINT.p("DecimalDigitsPtr"),
        Check(1)..SQLSMALLINT.p("NullablePtr")
    )

    NativeName("SQLColAttributeW")..SQLRETURN(
        "ColAttribute",

        SQLHSTMT("StatementHandle"),
        SQLUSMALLINT("ColumnNumber"),
        SQLUSMALLINT("FieldIdentifier"),
        nullable..SQLPOINTER("CharacterAttributePtr"),
        AutoSize("CharacterAttributePtr")..SQLSMALLINT("BufferLength"),
        Check(1)..SQLSMALLINT.p("StringLengthPtr"),
        Check(1)..SQLLEN.p("NumericAttributePtr")
    )

    SQLRETURN(
        "BindCol",

        SQLHSTMT("StatementHandle"),
        SQLUSMALLINT("ColumnNumber"),
        SQLSMALLINT("TargetType"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..nullable..SQLPOINTER("TargetValuePtr"),
        AutoSize("TargetValuePtr")..SQLLEN("BufferLength"),
        Check(1)..nullable..SQLLEN.p("StrLen_or_Ind")
    )

    SQLRETURN(
        "Fetch",

        SQLHSTMT("StatementHandle")
    )

    SQLRETURN(
        "FetchScroll",

        SQLHSTMT("StatementHandle"),
        SQLSMALLINT("FetchOrientation"),
        SQLLEN("FetchOffset")
    )

    SQLRETURN(
        "GetData",

        SQLHSTMT("StatementHandle"),
        SQLUSMALLINT("Col_or_Param_Num"),
        SQLSMALLINT("TargetType"),
        SQLPOINTER("TargetValuePtr"),
        AutoSize("TargetValuePtr")..SQLLEN("BufferLength"),
        Check(1)..SQLLEN.p("StrLen_or_IndPtr")
    )

    NativeName("SQLGetDiagFieldW")..SQLRETURN(
        "GetDiagField",

        SQLSMALLINT("HandleType"),
        SQLHANDLE("Handle"),
        SQLSMALLINT("RecNumber"),
        SQLSMALLINT("DiagIdentifier"),
        nullable..SQLPOINTER("DiagInfoPtr"),
        AutoSize("DiagInfoPtr")..SQLSMALLINT("BufferLength"),
        Check(1)..SQLSMALLINT.p("StringLengthPtr")
    )

    NativeName("SQLGetDiagRecW")..SQLRETURN(
        "GetDiagRec",

        SQLSMALLINT("HandleType"),
        SQLHANDLE("Handle"),
        SQLSMALLINT("RecNumber"),
        Check(6)..SQLCHARUTF16.p("SQLState"),
        Check(1)..SQLINTEGER.p("NativeErrorPtr"),
        nullable..SQLCHARUTF16.p("MessageText"),
        AutoSize("MessageText")..SQLSMALLINT("BufferLength"),
        Check(1)..SQLSMALLINT.p("TextLengthPtr")
    )

    // ---
    // Obtaining information about the data source's system tables (catalog functions)
    // ---

    // TODO: implement (https://msdn.microsoft.com/en-us/library/ms712628(v=vs.85).aspx)

    // ---
    // Terminating a statement
    // ---

    SQLRETURN(
        "FreeStmt",

        SQLHSTMT("StatementHandle"),
        SQLUSMALLINT("Option")
    )

    SQLRETURN(
        "CloseCursor",

        SQLHSTMT("StatementHandle")
    )

    SQLRETURN(
        "Cancel",

        SQLHSTMT("StatementHandle")
    )

    IgnoreMissing..SQLRETURN(
        "CancelHandle",

        SQLSMALLINT("HandleType"),
        SQLHANDLE("Handle")
    )

    SQLRETURN(
        "EndTran",

        SQLSMALLINT("HandleType"),
        SQLHANDLE("Handle"),
        SQLSMALLINT("CompletionType")
    )

    // ---
    // Terminating a connection
    // ---

    SQLRETURN(
        "Disconnect",

        SQLHDBC("ConnectionHandle")
    )

    SQLRETURN(
        "FreeHandle",

        SQLSMALLINT("HandleType"),
        SQLHANDLE("Handle")
    )

    IgnoreMissing..SQLRETURN(
        "CompleteAsync",

        SQLSMALLINT("HandleType"),
        SQLHANDLE("Handle"),
        Check(1)..RETCODE.p("AsyncRetCodePtr")
    )

    NativeName("SQLColumnsW")..SQLRETURN(
        "Columns",

        SQLHSTMT("StatementHandle"),
        nullable..SQLCHARUTF16.p("CatalogName"),
        AutoSize("CatalogName")..SQLSMALLINT("NameLength1"),
        nullable..SQLCHARUTF16.p("SchemaName"),
        AutoSize("SchemaName")..SQLSMALLINT("NameLength2"),
        nullable..SQLCHARUTF16.p("TableName"),
        AutoSize("TableName")..SQLSMALLINT("NameLength3"),
        nullable..SQLCHARUTF16.p("ColumnName"),
        AutoSize("ColumnName")..SQLSMALLINT("NameLength4")
    )

    NativeName("SQLSpecialColumnsW")..SQLRETURN(
        "SpecialColumns",

        SQLHSTMT("StatementHandle"),
        SQLUSMALLINT("IdentifierType"),
        nullable..SQLCHARUTF16.p("CatalogName"),
        AutoSize("CatalogName")..SQLSMALLINT("NameLength1"),
        nullable..SQLCHARUTF16.p("SchemaName"),
        AutoSize("SchemaName")..SQLSMALLINT("NameLength2"),
        nullable..SQLCHARUTF16.p("TableName"),
        AutoSize("TableName")..SQLSMALLINT("NameLength3"),
        SQLUSMALLINT("Scope"),
        SQLUSMALLINT("Nullable")
    )

    NativeName("SQLStatisticsW")..SQLRETURN(
        "Statistics",

        SQLHSTMT("StatementHandle"),
        nullable..SQLCHARUTF16.p("CatalogName"),
        AutoSize("CatalogName")..SQLSMALLINT("NameLength1"),
        nullable..SQLCHARUTF16.p("SchemaName"),
        AutoSize("SchemaName")..SQLSMALLINT("NameLength2"),
        nullable..SQLCHARUTF16.p("TableName"),
        AutoSize("TableName")..SQLSMALLINT("NameLength3"),
        SQLUSMALLINT("Unique"),
        SQLUSMALLINT("Reserved")
    )

    NativeName("SQLTablesW")..SQLRETURN(
        "Tables",

        SQLHSTMT("StatementHandle"),
        nullable..SQLCHARUTF16.p("CatalogName"),
        AutoSize("CatalogName")..SQLSMALLINT("NameLength1"),
        nullable..SQLCHARUTF16.p("SchemaName"),
        AutoSize("SchemaName")..SQLSMALLINT("NameLength2"),
        nullable..SQLCHARUTF16.p("TableName"),
        AutoSize("TableName")..SQLSMALLINT("NameLength3"),
        nullable..SQLCHARUTF16.p("TableType"),
        AutoSize("TableType")..SQLSMALLINT("NameLength4")
    )

    IgnoreMissing..SQLRETURN(
        "Transact",

        SQLHENV("EnvironmentHandle"),
        SQLHDBC("ConnectionHandle"),
        SQLUSMALLINT("CompletionType")
    )

    // -------------------------------------------------------
    //               Microsoft SQL Extensions
    // -------------------------------------------------------

    ShortConstant(
        "DRIVER_NOPROMPT".."0",
        "DRIVER_COMPLETE".."1",
        "DRIVER_PROMPT".."2",
        "DRIVER_COMPLETE_REQUIRED".."3"
    )

    ShortConstant(
        "POSITION".."0",
        "REFRESH".."1",
        "UPDATE".."2",
        "DELETE".."3"
    )

    ShortConstant(
        "ADD".."4",
        "SETPOS_MAX_OPTION_VALUE".."SQL_ADD",
        "UPDATE_BY_BOOKMARK".."5",
        "DELETE_BY_BOOKMARK".."6",
        "FETCH_BY_BOOKMARK".."7"
    )

    ShortConstant(
        "LOCK_NO_CHANGE".."0",
        "LOCK_EXCLUSIVE".."1",
        "LOCK_UNLOCK".."2",
        "SETPOS_MAX_LOCK_VALUE".."SQL_LOCK_UNLOCK"
    )

    // TODO: SQLSetPos macros (sqlext.h:1745)

    NativeName("SQLDriverConnectW")..SQLRETURN(
        "DriverConnect",

        SQLHDBC("ConnectionHandle"),
        nullable..SQLHWND("WindowHandle"),
        Input..SQLCHARUTF16.p("InConnectionString"),
        AutoSize("InConnectionString")..SQLSMALLINT("StringLength1"),
        nullable..SQLCHARUTF16.p("OutConnectionString"),
        AutoSize("OutConnectionString")..SQLSMALLINT("BufferLength"),
        Check(1)..nullable..SQLSMALLINT.p("StringLength2Ptr"),
        SQLUSMALLINT("DriverCompletion")
    )

    NativeName("SQLBrowseConnectW")..SQLRETURN(
        "BrowseConnect",

        SQLHDBC("ConnectionHandle"),
        Input..SQLCHARUTF16.p("InConnectionString"),
        AutoSize("InConnectionString")..SQLSMALLINT("StringLength1"),
        nullable..SQLCHARUTF16.p("OutConnectionString"),
        AutoSize("OutConnectionString")..SQLSMALLINT("BufferLength"),
        Check(1)..nullable..SQLSMALLINT.p("StringLength2Ptr")
    )

    SQLRETURN(
        "BulkOperations",

        SQLHSTMT("StatementHandle"),
        SQLUSMALLINT("Operation")
    )

    NativeName("SQLColumnPrivilegesW")..SQLRETURN(
        "ColumnPrivileges",

        SQLHSTMT("hstmt"),
        nullable..SQLCHARUTF16.p("szCatalogName"),
        AutoSize("szCatalogName")..SQLSMALLINT("cchCatalogName"),
        nullable..SQLCHARUTF16.p("szSchemaName"),
        AutoSize("szSchemaName")..SQLSMALLINT("cchSchemaName"),
        nullable..SQLCHARUTF16.p("szTableName"),
        AutoSize("szTableName")..SQLSMALLINT("cchTableName"),
        nullable..SQLCHARUTF16.p("szColumnName"),
        AutoSize("szColumnName")..SQLSMALLINT("cchColumnName")
    )

    SQLRETURN(
        "DescribeParam",

        SQLHSTMT("StatementHandle"),
        SQLUSMALLINT("ParameterNumber"),
        Check(1)..nullable..SQLSMALLINT.p("DataTypePtr"),
        Check(1)..nullable..SQLULEN.p("ParameterSizePtr"),
        Check(1)..nullable..SQLSMALLINT.p("DecimalDigitsPtr"),
        Check(1)..nullable..SQLSMALLINT.p("NullablePtr")
    )

    SQLRETURN(
        "ExtendedFetch",

        SQLHSTMT("hstmt"),
        SQLUSMALLINT("fFetchType"),
        SQLLEN("irow"),
        Check(1)..nullable..SQLULEN.p("pcrow"),
        Check(1)..nullable..SQLUSMALLINT.p("rgfRowStatus")
    )

    NativeName("SQLForeignKeysW")..SQLRETURN(
        "ForeignKeys",

        SQLHSTMT("hstmt"),
        nullable..SQLCHARUTF16.p("szPkCatalogName"),
        AutoSize("szPkCatalogName")..SQLSMALLINT("cchPkCatalogName"),
        nullable..SQLCHARUTF16.p("szPkSchemaName"),
        AutoSize("szPkSchemaName")..SQLSMALLINT("cchPkSchemaName"),
        nullable..SQLCHARUTF16.p("szPkTableName"),
        AutoSize("szPkTableName")..SQLSMALLINT("cchPkTableName"),
        nullable..SQLCHARUTF16.p("szFkCatalogName"),
        AutoSize("szFkCatalogName")..SQLSMALLINT("cchFkCatalogName"),
        nullable..SQLCHARUTF16.p("szFkSchemaName"),
        AutoSize("szFkSchemaName")..SQLSMALLINT("cchFkSchemaName"),
        nullable..SQLCHARUTF16.p("szFkTableName"),
        AutoSize("szFkTableName")..SQLSMALLINT("cchFkTableName")
    )

    SQLRETURN(
        "MoreResults",

        SQLHSTMT("StatementHandle")
    )

    NativeName("SQLNativeSqlW")..SQLRETURN(
        "NativeSql",

        SQLHDBC("ConnectionHandle"),
        Input..SQLCHARUTF16.p("InStatementText"),
        AutoSize("InStatementText")..SQLINTEGER("TextLength1"),
        nullable..SQLCHARUTF16.p("OutStatementText"),
        AutoSize("OutStatementText")..SQLINTEGER("BufferLength"),
        Check(1)..SQLINTEGER.p("TextLength2Ptr")
    )

    SQLRETURN(
        "NumParams",

        SQLHSTMT("StatementHandle"),
        Check(1)..nullable..SQLSMALLINT.p("ParameterCountPtr")
    )

    SQLRETURN(
        "ParamOptions",

        SQLHSTMT("hstmt"),
        SQLULEN("crow"),
        Check(1)..SQLULEN.p("pirow")
    )

    NativeName("SQLPrimaryKeysW")..SQLRETURN(
        "PrimaryKeys",

        SQLHSTMT("hstmt"),
        nullable..SQLCHARUTF16.p("szCatalogName"),
        AutoSize("szCatalogName")..SQLSMALLINT("cchCatalogName"),
        nullable..SQLCHARUTF16.p("szSchemaName"),
        AutoSize("szSchemaName")..SQLSMALLINT("cchSchemaName"),
        nullable..SQLCHARUTF16.p("szTableName"),
        AutoSize("szTableName")..SQLSMALLINT("cchTableName")
    )

    NativeName("SQLProcedureColumnsW")..SQLRETURN(
        "ProcedureColumns",

        SQLHSTMT("hstmt"),
        nullable..SQLCHARUTF16.p("szCatalogName"),
        AutoSize("szCatalogName")..SQLSMALLINT("cchCatalogName"),
        nullable..SQLCHARUTF16.p("szSchemaName"),
        AutoSize("szSchemaName")..SQLSMALLINT("cchSchemaName"),
        nullable..SQLCHARUTF16.p("szProcName"),
        AutoSize("szProcName")..SQLSMALLINT("cchProcName"),
        nullable..SQLCHARUTF16.p("szColumnName"),
        AutoSize("szColumnName")..SQLSMALLINT("cchColumnName")
    )

    NativeName("SQLProceduresW")..SQLRETURN(
        "Procedures",

        SQLHSTMT("hstmt"),
        nullable..SQLCHARUTF16.p("szCatalogName"),
        AutoSize("szCatalogName")..SQLSMALLINT("cchCatalogName"),
        nullable..SQLCHARUTF16.p("szSchemaName"),
        AutoSize("szSchemaName")..SQLSMALLINT("cchSchemaName"),
        nullable..SQLCHARUTF16.p("szProcName"),
        AutoSize("szProcName")..SQLSMALLINT("cchProcName")
    )

    SQLRETURN(
        "SetPos",

        SQLHSTMT("StatementHandle"),
        SQLSETPOSIROW("RowNumber"),
        SQLUSMALLINT("Operation"),
        SQLUSMALLINT("LockType")
    )

    NativeName("SQLTablePrivilegesW")..SQLRETURN(
        "TablePrivileges",

        SQLHSTMT("hstmt"),
        nullable..SQLCHARUTF16.p("szCatalogName"),
        AutoSize("szCatalogName")..SQLSMALLINT("cchCatalogName"),
        nullable..SQLCHARUTF16.p("szSchemaName"),
        AutoSize("szSchemaName")..SQLSMALLINT("cchSchemaName"),
        nullable..SQLCHARUTF16.p("szTableName"),
        AutoSize("szTableName")..SQLSMALLINT("cchTableName")
    )

    IgnoreMissing..NativeName("SQLDriversW")..SQLRETURN(
        "Drivers",

        SQLHENV("EnvironmentHandle"),
        SQLUSMALLINT("Direction"),
        nullable..SQLCHARUTF16.p("DriverDescription"),
        AutoSize("DriverDescription")..SQLSMALLINT("BufferLength1"),
        Check(1)..nullable..SQLSMALLINT.p("DescriptionLengthPtr"),
        nullable..SQLCHARUTF16.p("DriverAttributes"),
        AutoSize("DriverAttributes")..SQLSMALLINT("BufferLength2"),
        Check(1)..nullable..SQLSMALLINT.p("AttributesLengthPtr")
    )

    SQLRETURN(
        "BindParameter",

        SQLHSTMT("StatementHandle"),
        SQLUSMALLINT("ParameterNumber"),
        SQLSMALLINT("InputOutputType"),
        SQLSMALLINT("ValueType"),
        SQLSMALLINT("ParameterType"),
        SQLULEN("ColumnSize"),
        SQLSMALLINT("DecimalDigits"),
        nullable..SQLPOINTER("ParameterValuePtr"),
        AutoSize("ParameterValuePtr")..SQLLEN("BufferLength"),
        Check(1)..nullable..SQLLEN.p("StrLen_or_IndPtr")
    )

    IgnoreMissing..SQLRETURN(
        "AllocHandleStd",

        SQLSMALLINT("fHandleType"),
        SQLHANDLE("hInput"),
        Check(1)..SQLHANDLE.p("phOutput")
    )

    /*RETCODE(
        "TraceOpenLogFile",

        LPWSTR("szFileName"),
        LPWSTR("lpwszOutputMsg"),
        DWORD("cbOutputMsg")
    )

    RETCODE("TraceCloseLogFile")

    DWORD("TraceVersion")

    BOOL(
        "ODBCSetTryWaitValue",

        DWORD("dwValue")
    )

    DWORD("ODBCGetTryWaitValue")

    VOID(
        "FireVSDebugEvent",

        PODBC_VS_ARGS("args")
    )*/
}