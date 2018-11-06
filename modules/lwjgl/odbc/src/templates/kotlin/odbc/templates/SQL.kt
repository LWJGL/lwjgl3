/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package odbc.templates

import org.lwjgl.generator.*
import odbc.*

val sql = "SQL".nativeClass(Module.ODBC, prefix = "SQL", prefixMethod = "SQL", binding = ODBC_BINDING) {
    documentation =
        """
        Native bindings to ${url("https://docs.microsoft.com/en-us/sql/odbc/microsoft-open-database-connectivity-odbc", "ODBC")}.

        The Microsoft Open Database Connectivity (ODBC) interface is a C programming language interface that makes it possible for applications to access data
        from a variety of database management systems (DBMSs). ODBC is a low-level, high-performance interface that is designed specifically for relational
        data stores.

        The ODBC interface allows maximum interoperability — an application can access data in diverse DBMSs through a single interface. Moreover, that
        application will be independent of any DBMS from which it accesses data. Users of the application can add software components called drivers, which
        interface between an application and a specific DBMS.
        """

    ShortConstant(
        "Special length/indicator values.",

        "NULL_DATA".."-1",
        "DATA_AT_EXEC".."-2"
    )

    ShortConstant(
        "Return values from functions.",

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
        "Flag for null-terminated string.",

        "NTS".."-3"
    )

    IntConstant(
        "Maximum message length.",

        "MAX_MESSAGE_LENGTH".."512"
    )

    ShortConstant(
        "Date/time length constants.",

        "DATE_LEN".."10",
        "TIME_LEN".."8",
        "TIMESTAMP_LEN".."19"
    )

    val HandleTypes = ShortConstant(
        "Handle type identifiers.",

        "HANDLE_ENV".."1",
        "HANDLE_DBC".."2",
        "HANDLE_STMT".."3",
        "HANDLE_DESC".."4",
        "HANDLE_SENV".."5"
    ).javaDocLinks

    val EnvironmentAttributes = IntConstant(
        "Environment attributes.",

        "ATTR_OUTPUT_NTS".."10001",
        "ATTR_ODBC_VERSION".."200",
        "ATTR_CONNECTION_POOLING".."201",
        "ATTR_CP_MATCH".."202"
    ).javaDocLinks

    val ConnectionAttributes = IntConstant(
        "Connection attributes.",

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
    ).javaDocLinks

    val StatementAttributes = IntConstant(
        "Statement attributes.",

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
    ).javaDocLinks

    IntConstant(
        "#ATTR_CURSOR_SCROLLABLE values.",

        "NONSCROLLABLE".."0",
        "SCROLLABLE".."1"
    )

    ShortConstant(
        "Identifiers of fields in the SQL descriptor.",

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

    val DiagnosticsFields = ShortConstant(
        "Identifiers of fields in the diagnostics area.",

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
    ).javaDocLinks

    ShortConstant(
        "Dynamic function codes.",

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
        "SQL data type codes.",

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
        "Statement attribute values for cursor sensitivity.",

        "UNSPECIFIED".."0",
        "INSENSITIVE".."1",
        "SENSITIVE".."2"
    )

    ShortConstant(
        "One-parameter shortcuts for date/time data types.",

        "TYPE_DATE".."91",
        "TYPE_TIME".."92",
        "TYPE_TIMESTAMP".."93"
    )

    ShortConstant(
        "GetTypeInfo() request for all data types.",

        "ALL_TYPES".."0"
    )

    ShortConstant(
        "Default conversion code for #BindCol(), #BindParameter() and #GetData().",

        "DEFAULT".."99"
    )

    ShortConstant(
        "SQLSQLLEN #GetData() code indicating that the application row descriptor specifies the data type.",

        "ARD_TYPE".."-99",
        "APD_TYPE".."-100"
    )

    ShortConstant(
        "SQL date/time type subcodes.",

        "CODE_DATE".."1",
        "CODE_TIME".."2",
        "CODE_TIMESTAMP".."3"
    )

    ShortConstant(
        "CLI option values.",

        "FALSE".."0",
        "TRUE".."1"
    )

    ShortConstant(
        "Values of #DESC_NULLABLE field in descriptor.",

        "NO_NULLS".."0",
        "NULLABLE".."1"
    )

    ShortConstant(
        "Value returned by #GetTypeInfo() to denote that it is not known whether or not a data type supports null values.",

        "NULLABLE_UNKNOWN".."2"
    )

    ShortConstant(
        "Values returned by #GetTypeInfo() to show WHERE clause supported.",

        "PRED_NONE".."0",
        "PRED_CHAR".."1",
        "PRED_BASIC".."2"
    )

    ShortConstant(
        "Values of #DESC_UNNAMED field in descriptor.",

        "NAMED".."0",
        "UNNAMED".."1"
    )

    ShortConstant(
        "Values of #DESC_ALLOC_TYPE field in descriptor.",

        "DESC_ALLOC_AUTO".."1",
        "DESC_ALLOC_USER".."2"
    )

    val FreeStmtOptions = ShortConstant(
        "#FreeStmt() options.",

        "CLOSE".."0",
        "DROP".."1",
        "UNBIND".."2",
        "RESET_PARAMS".."3"
    ).javaDocLinks

    val FetchOrientations = ShortConstant(
        "Codes used for {@code FetchOrientation} in #FetchScroll(), and in #DataSources().",

        "FETCH_NEXT".."1",
        "FETCH_FIRST".."2"
    ).javaDocLinks

    val FetchOrientationsScroll = ShortConstant(
        "Other codes used for {@code FetchOrientation} in #FetchScroll().",

        "FETCH_LAST".."3",
        "FETCH_PRIOR".."4",
        "FETCH_ABSOLUTE".."5",
        "FETCH_RELATIVE".."6"
    ).javaDocLinks

    val EndTranOptions = ShortConstant(
        "#EndTran() options.",

        "COMMIT".."0",
        "ROLLBACK".."1"
    ).javaDocLinks

    LongConstant(
        "Null handles return by #AllocHandle().",

        "NULL_HENV"..0L,
        "NULL_HDBC"..0L,
        "NULL_HSTMT"..0L,
        "NULL_HDESC"..0L,
        "NULL_HANDLE"..0L
    )

    ShortConstant(
        "Values that may appear in the result set of #SpecialColumns().",

        "SCOPE_CURROW".."0",
        "SCOPE_TRANSACTION".."1",
        "SCOPE_SESSION".."2",
        "PC_UNKNOWN".."0",
        "PC_NON_PSEUDO".."1",
        "PC_PSEUDO".."2"
    )

    ShortConstant(
        "Reserved value for the {@code IdentifierType} argument of #SpecialColumns().",

        "ROW_IDENTIFIER".."1"
    )

    ShortConstant(
        "Reserved values for UNIQUE argument of #Statistics().",

        "INDEX_UNIQUE".."0",
        "INDEX_ALL".."1"
    )

    ShortConstant(
        "Values that may appear in the result set of #Statistics().",

        "INDEX_CLUSTERED".."1",
        "INDEX_HASHED".."2",
        "INDEX_OTHER".."3"
    )

    val FunctionIDs = IntConstant(
        "#GetFunctions() values to identify ODBC APIs.",

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
    ).javaDocLinks

    IntConstant(
        """
        This returns a bitmap, which allows us to handle the higher-valued function numbers. Use SQL_FUNC_EXISTS(bitmap,function_number) to determine if the
        function exists.
        """,

        "API_ODBC3_ALL_FUNCTIONS".. 999,
        "API_ODBC3_ALL_FUNCTIONS_SIZE".."250"
    )

    // TODO: implement (sqlext.h:744)
    /*int(
        "_FUNC_EXISTS",
        "",
    )*/

    val InfoTypes = IntConstant(
        "Information requested by #GetInfo():",

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
    ).javaDocLinks

    IntConstant(
        "#ALTER_TABLE bitmasks.",

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
        "#CURSOR_COMMIT_BEHAVIOR values.",

        "CB_DELETE".."0",
        "CB_CLOSE".."1",
        "CB_PRESERVE".."2"
    )

    IntConstant(
        "#FETCH_DIRECTION bitmasks.",

        "FD_FETCH_NEXT"..0x00000001,
        "FD_FETCH_FIRST"..0x00000002,
        "FD_FETCH_LAST"..0x00000004,
        "FD_FETCH_PRIOR"..0x00000008,
        "FD_FETCH_ABSOLUTE"..0x00000010,
        "FD_FETCH_RELATIVE"..0x00000020
    )

    IntConstant(
        "#GETDATA_EXTENSIONS bitmasks.",

        "GD_ANY_COLUMN"..0x00000001,
        "GD_ANY_ORDER"..0x00000002
    )

    ShortConstant(
        "#IDENTIFIER_CASE values.",

        "IC_UPPER".."1",
        "IC_LOWER".."2",
        "IC_SENSITIVE".."3",
        "IC_MIXED".."4"
    )

    IntConstant(
        "#OJ_CAPABILITIES bitmasks.",

        "OJ_LEFT"..0x00000001,
        "OJ_RIGHT"..0x00000002,
        "OJ_FULL"..0x00000004,
        "OJ_NESTED"..0x00000008,
        "OJ_NOT_ORDERED"..0x00000010,
        "OJ_INNER"..0x00000020,
        "OJ_ALL_COMPARISON_OPS"..0x00000040
    )

    IntConstant(
        "#SCROLL_CONCURRENCY bitmasks.",

        "SCCO_READ_ONLY"..0x00000001,
        "SCCO_LOCK"..0x00000002,
        "SCCO_OPT_ROWVER"..0x00000004,
        "SCCO_OPT_VALUES"..0x00000008
    )

    ShortConstant(
        "#TXN_CAPABLE values.",

        "TC_NONE".."0",
        "TC_DML".."1",
        "TC_ALL".."2",
        "TC_DDL_COMMIT".."3",
        "TC_DDL_IGNORE".."4"
    )

    IntConstant(
        "#TXN_ISOLATION_OPTION bitmasks.",

        "TRANSACTION_READ_UNCOMMITTED"..0x00000001,
        "TRANSACTION_READ_COMMITTED"..0x00000002,
        "TRANSACTION_REPEATABLE_READ"..0x00000004,
        "TRANSACTION_SERIALIZABLE"..0x00000008
    )

    ShortConstant(
        "#NULL_COLLATION values.",

        "NC_HIGH".."0",
        "NC_LOW".."1"
    )

    // ---
    // sqlext.h
    // ---

    ShortConstant(
        "Generally useful constants.",

        "SPEC_MAJOR".."3",
        "SPEC_MINOR".."80",
        "SQLSTATE_SIZE".."5",
        "MAX_DSN_LENGTH".."32",
        "MAX_OPTION_STRING_LENGTH".."256"
    )

    ShortConstant(
        "Values for #ATTR_CONNECTION_POOLING.",

        "CP_OFF".."0",
        "CP_ONE_PER_DRIVER".."1",
        "CP_ONE_PER_HENV".."2",
        "CP_DRIVER_AWARE".."3",
        "CP_DEFAULT".."SQL_CP_OFF"
    )

    ShortConstant(
        "Values for #ATTR_CP_MATCH.",

        "CP_STRICT_MATCH".."0",
        "CP_RELAXED_MATCH".."1",
        "CP_MATCH_DEFAULT".."SQL_CP_STRICT_MATCH"
    )

    ShortConstant(
        "Values for #ATTR_ODBC_VERSION.",

        "OV_ODBC2".."2",
        "OV_ODBC3".."3",
        "OV_ODBC3_80".."380"
    )

    ShortConstant(
        "#ATTR_ACCESS_MODE options",

        "MODE_READ_WRITE".."0",
        "MODE_READ_ONLY".."1",
        "MODE_DEFAULT".."SQL_MODE_READ_WRITE"
    )

    ShortConstant(
        "#ATTR_AUTOCOMMIT options",

        "AUTOCOMMIT_OFF".."0",
        "AUTOCOMMIT_ON".."1",
        "AUTOCOMMIT_DEFAULT".."SQL_AUTOCOMMIT_ON"
    )

    ShortConstant(
        "#ATTR_LOGIN_TIMEOUT options",

        "LOGIN_TIMEOUT_DEFAULT".."15"
    )

    ShortConstant(
        "#ATTR_TRACE options",

        "OPT_TRACE_OFF".."0",
        "OPT_TRACE_ON".."1",
        "OPT_TRACE_DEFAULT".."SQL_OPT_TRACE_OFF"
    )

    StringConstant(
        "#ATTR_TRACE options",

        "OPT_TRACE_FILE_DEFAULT".."""\\SQL.LOG"""
    )

    LongConstant(
        "#ATTR_ODBC_CURSORS options",

        "CUR_USE_IF_NEEDED"..0L,
        "CUR_USE_ODBC"..1L,
        "CUR_USE_DRIVER"..2L,
        "CUR_DEFAULT".."SQL_CUR_USE_DRIVER"
    )

    ShortConstant(
        "Values for #ATTR_DISCONNECT_BEHAVIOR,",

        "DB_RETURN_TO_POOL".."0",
        "DB_DISCONNECT".."1",
        "DB_DEFAULT".."SQL_DB_RETURN_TO_POOL"
    )

    ShortConstant(
        "Values for #ATTR_ENLIST_IN_DTC.",

        "DTC_DONE".."0"
    )

    ShortConstant(
        "Values for #ATTR_CONNECTION_DEAD.",

        "CD_TRUE".."1",
        "CD_FALSE".."0"
    )

    ShortConstant(
        "Values for #ATTR_ANSI_APP.",

        "AA_TRUE".."1",
        "AA_FALSE".."0"
    )

    ShortConstant(
        "Values for #ATTR_RESET_CONNECTION.",

        "RESET_CONNECTION_YES".."1"
    )

    ShortConstant(
        "Values for #ATTR_ASYNC_DBC_FUNCTIONS_ENABLE.",

        "ASYNC_DBC_ENABLE_ON".."1",
        "ASYNC_DBC_ENABLE_OFF".."0",
        "ASYNC_DBC_ENABLE_DEFAULT".."SQL_ASYNC_DBC_ENABLE_OFF"
    )

    IntConstant(
        "Attribute types.",

        "IS_POINTER".."-4",
        "IS_UINTEGER".."-5",
        "IS_INTEGER".."-6",
        "IS_USMALLINT".."-7",
        "IS_SMALLINT".."-7"
    )

    ShortConstant(
        "The value of #ATTR_PARAM_BIND_TYPE.",

        "PARAM_BIND_BY_COLUMN".."0",
        "PARAM_BIND_TYPE_DEFAULT".."SQL_PARAM_BIND_BY_COLUMN"
    )

    ShortConstant(
        "#ATTR_QUERY_TIMEOUT options.",

        "QUERY_TIMEOUT_DEFAULT".."0"
    )

    ShortConstant(
        "#ATTR_MAX_ROWS options.",

        "MAX_ROWS_DEFAULT".."0"
    )

    ShortConstant(
        "#ATTR_NOSCAN options.",

        "NOSCAN_OFF".."0",
        "NOSCAN_ON".."1",
        "NOSCAN_DEFAULT".."SQL_NOSCAN_OFF"
    )

    ShortConstant(
        "#ATTR_MAX_LENGTH options.",

        "MAX_LENGTH_DEFAULT".."0"
    )

    ShortConstant(
        "#ATTR_ASYNC_ENABLE options.",

        "ASYNC_ENABLE_OFF".."0",
        "ASYNC_ENABLE_ON".."1",
        "ASYNC_ENABLE_DEFAULT".."SQL_ASYNC_ENABLE_OFF"
    )

    ShortConstant(
        "#ATTR_PARAM_BIND_TYPE options.",

        "BIND_BY_COLUMN".."0",
        "BIND_TYPE_DEFAULT".."SQL_BIND_BY_COLUMN"
    )

    ShortConstant(
        "#ATTR_CONCURRENCY options.",

        "CONCUR_READ_ONLY".."1",
        "CONCUR_LOCK".."2",
        "CONCUR_ROWVER".."3",
        "CONCUR_VALUES".."4",
        "CONCUR_DEFAULT".."SQL_CONCUR_READ_ONLY"
    )

    ShortConstant(
        "#ATTR_CURSOR_TYPE options.",

        "CURSOR_FORWARD_ONLY".."0",
        "CURSOR_KEYSET_DRIVEN".."1",
        "CURSOR_DYNAMIC".."2",
        "CURSOR_STATIC".."3",
        "CURSOR_TYPE_DEFAULT".."SQL_CURSOR_FORWARD_ONLY"
    )

    /*ShortConstant(
        "#ROWSET_SIZE options.",

        "ROWSET_SIZE_DEFAULT".."1"
    )*/

    ShortConstant(
        "#ATTR_KEYSET_SIZE options.",

        "KEYSET_SIZE_DEFAULT".."0"
    )

    ShortConstant(
        "#ATTR_SIMULATE_CURSOR options.",

        "SC_NON_UNIQUE".."0",
        "SC_TRY_UNIQUE".."1",
        "SC_UNIQUE".."2"
    )

    ShortConstant(
        "#ATTR_RETRIEVE_DATA options.",

        "RD_OFF".."0",
        "RD_ON".."1",
        "RD_DEFAULT".."SQL_RD_ON"
    )

    ShortConstant(
        "#ATTR_USE_BOOKMARKS options.",

        "UB_OFF".."0",
        "UB_ON".."1",
        "UB_FIXED".."SQL_UB_ON",
        "UB_VARIABLE".."2",
        "UB_DEFAULT".."SQL_UB_OFF"
    )

    ShortConstant(
        "#ColAttribute() defines.",

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
        "Extended descriptor field.",

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
        "Defines for diagnostics fields.",

        "DIAG_CURSOR_ROW_COUNT".."-1249",
        "DIAG_ROW_NUMBER".."-1248",
        "DIAG_COLUMN_NUMBER".."-1247"
    )

    ShortConstant(
        "SQL extended datatypes.",

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
        "Interval code.",

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
        "WCHAR definitions.",

        "WCHAR".."-8",
        "WVARCHAR".."-9",
        "WLONGVARCHAR".."-10",
        "C_WCHAR".."SQL_WCHAR"
    )

    ShortConstant(
        "UNICODE definitions.",

        "UNICODE".."SQL_WCHAR",
        "UNICODE_VARCHAR".."SQL_WVARCHAR",
        "UNICODE_LONGVARCHAR".."SQL_WLONGVARCHAR",
        "UNICODE_CHAR".."SQL_WCHAR"
    )

    ShortConstant(
        "Sign offsets.",

        "SIGNED_OFFSET".."-20",
        "UNSIGNED_OFFSET".."-22"
    )

    ShortConstant(
        "C datatype to SQL datatype mapping.",

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
        "NULL type.",

        "TYPE_NULL".."0"
    )

    ShortConstant(
        """
        Base value of driver-specific C-Type (max is 0x7fff) define driver-specific C-Type, named as SQL_DRIVER_C_TYPE_BASE, SQL_DRIVER_C_TYPE_BASE+1,
        SQL_DRIVER_C_TYPE_BASE+2, etc.
        """,

        "DRIVER_C_TYPE_BASE"..0x4000.s
    )

    ShortConstant(
        """
        Base value of driver-specific fields/attributes (max are 0x7fff [16-bit] or 0x00007fff [32-bit]) define driver-specific SQL-Type, named as
        SQL_DRIVER_SQL_TYPE_BASE, SQL_DRIVER_SQL_TYPE_BASE+1, SQL_DRIVER_SQL_TYPE_BASE+2, etc..
        """,

        "DRIVER_SQL_TYPE_BASE"..0x4000.s,
        "DRIVER_DESC_FIELD_BASE"..0x4000.s,
        "DRIVER_DIAG_FIELD_BASE"..0x4000.s,
        "DRIVER_INFO_TYPE_BASE"..0x4000.s
    )

    ShortConstant(
        "Define for #DIAG_ROW_NUMBER and #DIAG_COLUMN_NUMBER.",

        "NO_ROW_NUMBER".."-1",
        "NO_COLUMN_NUMBER".."-1",
        "ROW_NUMBER_UNKNOWN".."-2",
        "COLUMN_NUMBER_UNKNOWN".."-2"
    )

    ShortConstant(
        "#BindParameter() extensions.",

        "DEFAULT_PARAM".."-5",
        "IGNORE".."-6",
        "COLUMN_IGNORE".."SQL_IGNORE",
        "LEN_DATA_AT_EXEC_OFFSET".."-100"
    )

    IntConstant(
        "Binary length for driver specific attributes.",

        "LEN_BINARY_ATTR_OFFSET".."-100"
    )

    ShortConstant(
        "Defines for #BindParameter() and #ProcedureColumns() (returned in the result set).",

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
        "Defines used by Driver Manager when mapping {@code SetParam} to #BindParameter().",

        "PARAM_TYPE_DEFAULT".."SQL_PARAM_INPUT_OUTPUT",
        "SETPARAM_VALUE_MAX".."-1"
    )

    ShortConstant(
        "#ColAttribute() subdefines for #COLUMN_UPDATABLE.",

        "ATTR_READONLY".."0",
        "ATTR_WRITE".."1",
        "ATTR_READWRITE_UNKNOWN".."2"
    )

    ShortConstant(
        "#ColAttribute() subdefines for #COLUMN_SEARCHABLE. These are also used by #GetInfo().",

        "UNSEARCHABLE".."0",
        "LIKE_ONLY".."1",
        "ALL_EXCEPT_LIKE".."2",
        "SEARCHABLE".."3",
        "PRED_SEARCHABLE".."SQL_SEARCHABLE"
    )

    ShortConstant(
        "New defines for SEARCHABLE column in #GetTypeInfo().",

        "COL_PRED_CHAR".."SQL_LIKE_ONLY",
        "COL_PRED_BASIC".."SQL_ALL_EXCEPT_LIKE"
    )

    ShortConstant(
        "Special return values for #GetData().",

        "NO_TOTAL".."-4"
    )

    val InfoTypesExtended = ShortConstant(
        "Info types for #GetInfo().",

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
    ).javaDocLinks

    IntConstant(
        "Possible values for #ASYNC_NOTIFICATION.",

        "ASYNC_NOTIFICATION_NOT_CAPABLE"..0x00000000,
        "ASYNC_NOTIFICATION_CAPABLE"..0x00000001
    )

    ShortConstant(
        "..",

        "DTC_TRANSITION_COST".."1750"
    )

    IntConstant(
        "SQL_CONVERT_ return value bitmasks.",

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
        "#CONVERT_FUNCTIONS functions.",

        "FN_CVT_CONVERT"..0x00000001,
        "FN_CVT_CAST"..0x00000002
    )

    IntConstant(
        "#STRING_FUNCTIONS functions.",

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
        "#SQL92_STRING_FUNCTIONS.",

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
        "#NUMERIC_FUNCTIONS functions.",

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
        "#SQL92_NUMERIC_VALUE_FUNCTIONS.",

        "SNVF_BIT_LENGTH"..0x00000001,
        "SNVF_CHAR_LENGTH"..0x00000002,
        "SNVF_CHARACTER_LENGTH"..0x00000004,
        "SNVF_EXTRACT"..0x00000008,
        "SNVF_OCTET_LENGTH"..0x00000010,
        "SNVF_POSITION"..0x00000020
    )

    IntConstant(
        "#TIMEDATE_FUNCTIONS functions.",

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
        "#SQL92_DATETIME_FUNCTIONS.",

        "SDF_CURRENT_DATE"..0x00000001,
        "SDF_CURRENT_TIME"..0x00000002,
        "SDF_CURRENT_TIMESTAMP"..0x00000004
    )

    IntConstant(
        "#SYSTEM_FUNCTIONS functions.",

        "FN_SYS_USERNAME"..0x00000001,
        "FN_SYS_DBNAME"..0x00000002,
        "FN_SYS_IFNULL"..0x00000004
    )

    IntConstant(
        "#TIMEDATE_ADD_INTERVALS and #TIMEDATE_DIFF_INTERVALS functions.",

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
        "Supported #FetchScroll() FetchOrientation's.",

        "CA1_NEXT"..0x00000001,
        "CA1_ABSOLUTE"..0x00000002,
        "CA1_RELATIVE"..0x00000004,
        "CA1_BOOKMARK"..0x00000008
    )

    IntConstant(
        "Supported #SetPos() LockType's.",

        "CA1_LOCK_NO_CHANGE"..0x00000040,
        "CA1_LOCK_EXCLUSIVE"..0x00000080,
        "CA1_LOCK_UNLOCK"..0x00000100
    )

    IntConstant(
        "Supported #SetPos() Operations.",

        "CA1_POS_POSITION"..0x00000200,
        "CA1_POS_UPDATE"..0x00000400,
        "CA1_POS_DELETE"..0x00000800,
        "CA1_POS_REFRESH"..0x00001000
    )

    IntConstant(
        "Positioned updates and deletes.",

        "CA1_POSITIONED_UPDATE"..0x00002000,
        "CA1_POSITIONED_DELETE"..0x00004000,
        "CA1_SELECT_FOR_UPDATE"..0x00008000
    )

    IntConstant(
        "Supported #BulkOperations() operations.",

        "CA1_BULK_ADD"..0x00010000,
        "CA1_BULK_UPDATE_BY_BOOKMARK"..0x00020000,
        "CA1_BULK_DELETE_BY_BOOKMARK"..0x00040000,
        "CA1_BULK_FETCH_BY_BOOKMARK"..0x00080000
    )

    IntConstant(
        "Supported values for #SCROLL_CONCURRENCY.",

        "CA2_READ_ONLY_CONCURRENCY"..0x00000001,
        "CA2_LOCK_CONCURRENCY"..0x00000002,
        "CA2_OPT_ROWVER_CONCURRENCY"..0x00000004,
        "CA2_OPT_VALUES_CONCURRENCY"..0x00000008
    )

    IntConstant(
        "Sensitivity of the cursor to its own inserts, deletes, and updates.",

        "CA2_SENSITIVITY_ADDITIONS"..0x00000010,
        "CA2_SENSITIVITY_DELETIONS"..0x00000020,
        "CA2_SENSITIVITY_UPDATES"..0x00000040
    )

    IntConstant(
        "Semantics of #ATTR_MAX_ROWS.",

        "CA2_MAX_ROWS_SELECT"..0x00000080,
        "CA2_MAX_ROWS_INSERT"..0x00000100,
        "CA2_MAX_ROWS_DELETE"..0x00000200,
        "CA2_MAX_ROWS_UPDATE"..0x00000400,
        "CA2_MAX_ROWS_CATALOG"..0x00000800,
        "CA2_MAX_ROWS_AFFECTS_ALL".."SQL_CA2_MAX_ROWS_SELECT | SQL_CA2_MAX_ROWS_INSERT | SQL_CA2_MAX_ROWS_DELETE | SQL_CA2_MAX_ROWS_UPDATE | SQL_CA2_MAX_ROWS_CATALOG"
    )

    IntConstant(
        "Semantics of #DIAG_CURSOR_ROW_COUNT.",

        "CA2_CRC_EXACT"..0x00001000,
        "CA2_CRC_APPROXIMATE"..0x00002000
    )

    IntConstant(
        "The kinds of positioned statements that can be simulated.",

        "CA2_SIMULATE_NON_UNIQUE"..0x00004000,
        "CA2_SIMULATE_TRY_UNIQUE"..0x00008000,
        "CA2_SIMULATE_UNIQUE"..0x00010000
    )

    IntConstant(
        "#ODBC_API_CONFORMANCE values.",

        "OAC_NONE"..0x0000,
        "OAC_LEVEL1"..0x0001,
        "OAC_LEVEL2"..0x0002
    )

    IntConstant(
        "#ODBC_SAG_CLI_CONFORMANCE values.",

        "OSCC_NOT_COMPLIANT"..0x0000,
        "OSCC_COMPLIANT"..0x0001
    )

    IntConstant(
        "#ODBC_SQL_CONFORMANCE values.",

        "OSC_MINIMUM"..0x0000,
        "OSC_CORE"..0x0001,
        "OSC_EXTENDED"..0x0002
    )

    IntConstant(
        "#CONCAT_NULL_BEHAVIOR values.",

        "CB_NULL"..0x0000,
        "CB_NON_NULL"..0x0001
    )

    IntConstant(
        "#SCROLL_OPTIONS masks.",

        "SO_FORWARD_ONLY"..0x00000001,
        "SO_KEYSET_DRIVEN"..0x00000002,
        "SO_DYNAMIC"..0x00000004,
        "SO_MIXED"..0x00000008,
        "SO_STATIC"..0x00000010
    )

    IntConstant(
        "#FETCH_DIRECTION masks.",

        "FD_FETCH_BOOKMARK"..0x00000080
    )

    IntConstant(
        "#CORRELATION_NAME values.",

        "CN_NONE"..0x0000,
        "CN_DIFFERENT"..0x0001,
        "CN_ANY"..0x0002
    )

    IntConstant(
        "#NON_NULLABLE_COLUMNS values.",

        "NNC_NULL"..0x0000,
        "NNC_NON_NULL"..0x0001
    )

    IntConstant(
        "#NULL_COLLATION values.",

        "NC_START"..0x0002,
        "NC_END"..0x0004
    )

    IntConstant(
        "#FILE_USAGE values.",

        "FILE_NOT_SUPPORTED"..0x0000,
        "FILE_TABLE"..0x0001,
        "FILE_QUALIFIER"..0x0002,
        "FILE_CATALOG".."SQL_FILE_QUALIFIER"
    )

    IntConstant(
        "#GETDATA_EXTENSIONS values.",

        "GD_BLOCK"..0x00000004,
        "GD_BOUND"..0x00000008,
        "GD_OUTPUT_PARAMS"..0x00000010
    )

    IntConstant(
        "#POSITIONED_STATEMENTS masks.",

        "PS_POSITIONED_DELETE"..0x00000001,
        "PS_POSITIONED_UPDATE"..0x00000002,
        "PS_SELECT_FOR_UPDATE"..0x00000004
    )

    IntConstant(
        "#GROUP_BY values.",

        "GB_NOT_SUPPORTED"..0x0000,
        "GB_GROUP_BY_EQUALS_SELECT"..0x0001,
        "GB_GROUP_BY_CONTAINS_SELECT"..0x0002,
        "GB_NO_RELATION"..0x0003,
        "GB_COLLATE"..0x0004
    )

    IntConstant(
        "#OWNER_USAGE masks.",

        "OU_DML_STATEMENTS"..0x00000001,
        "OU_PROCEDURE_INVOCATION"..0x00000002,
        "OU_TABLE_DEFINITION"..0x00000004,
        "OU_INDEX_DEFINITION"..0x00000008,
        "OU_PRIVILEGE_DEFINITION"..0x00000010
    )

    IntConstant(
        "#SCHEMA_USAGE masks.",

        "SU_DML_STATEMENTS".."SQL_OU_DML_STATEMENTS",
        "SU_PROCEDURE_INVOCATION".."SQL_OU_PROCEDURE_INVOCATION",
        "SU_TABLE_DEFINITION".."SQL_OU_TABLE_DEFINITION",
        "SU_INDEX_DEFINITION".."SQL_OU_INDEX_DEFINITION",
        "SU_PRIVILEGE_DEFINITION".."SQL_OU_PRIVILEGE_DEFINITION"
    )

    IntConstant(
        "#QUALIFIER_USAGE masks.",

        "QU_DML_STATEMENTS"..0x00000001,
        "QU_PROCEDURE_INVOCATION"..0x00000002,
        "QU_TABLE_DEFINITION"..0x00000004,
        "QU_INDEX_DEFINITION"..0x00000008,
        "QU_PRIVILEGE_DEFINITION"..0x00000010
    )

    IntConstant(
        "#CATALOG_USAGE masks.",

        "CU_DML_STATEMENTS".."SQL_QU_DML_STATEMENTS",
        "CU_PROCEDURE_INVOCATION".."SQL_QU_PROCEDURE_INVOCATION",
        "CU_TABLE_DEFINITION".."SQL_QU_TABLE_DEFINITION",
        "CU_INDEX_DEFINITION".."SQL_QU_INDEX_DEFINITION",
        "CU_PRIVILEGE_DEFINITION".."SQL_QU_PRIVILEGE_DEFINITION"
    )

    IntConstant(
        "#SUBQUERIES masks.",

        "SQ_COMPARISON"..0x00000001,
        "SQ_EXISTS"..0x00000002,
        "SQ_IN"..0x00000004,
        "SQ_QUANTIFIED"..0x00000008,
        "SQ_CORRELATED_SUBQUERIES"..0x00000010
    )

    IntConstant(
        "#UNION masks.",

        "U_UNION"..0x00000001,
        "U_UNION_ALL"..0x00000002
    )

    IntConstant(
        "#BOOKMARK_PERSISTENCE values.",

        "BP_CLOSE"..0x00000001,
        "BP_DELETE"..0x00000002,
        "BP_DROP"..0x00000004,
        "BP_TRANSACTION"..0x00000008,
        "BP_UPDATE"..0x00000010,
        "BP_OTHER_HSTMT"..0x00000020,
        "BP_SCROLL"..0x00000040
    )

    IntConstant(
        "#STATIC_SENSITIVITY values.",

        "SS_ADDITIONS"..0x00000001,
        "SS_DELETIONS"..0x00000002,
        "SS_UPDATES"..0x00000004
    )

    IntConstant(
        "{@code VIEW} values.",

        "CV_CREATE_VIEW"..0x00000001,
        "CV_CHECK_OPTION"..0x00000002,
        "CV_CASCADED"..0x00000004,
        "CV_LOCAL"..0x00000008
    )

    IntConstant(
        "#LOCK_TYPES masks.",

        "LCK_NO_CHANGE"..0x00000001,
        "LCK_EXCLUSIVE"..0x00000002,
        "LCK_UNLOCK"..0x00000004
    )

    IntConstant(
        "#POS_OPERATIONS masks.",

        "POS_POSITION"..0x00000001,
        "POS_REFRESH"..0x00000002,
        "POS_UPDATE"..0x00000004,
        "POS_DELETE"..0x00000008,
        "POS_ADD"..0x00000010
    )

    IntConstant(
        "#QUALIFIER_LOCATION values.",

        "QL_START"..0x0001,
        "QL_END"..0x0002
    )

    IntConstant(
        "#AGGREGATE_FUNCTIONS bitmasks.",

        "AF_AVG"..0x00000001,
        "AF_COUNT"..0x00000002,
        "AF_MAX"..0x00000004,
        "AF_MIN"..0x00000008,
        "AF_SUM"..0x00000010,
        "AF_DISTINCT"..0x00000020,
        "AF_ALL"..0x00000040
    )

    IntConstant(
        "#SQL_CONFORMANCE bit masks.",

        "SC_SQL92_ENTRY"..0x00000001,
        "SC_FIPS127_2_TRANSITIONAL"..0x00000002,
        "SC_SQL92_INTERMEDIATE"..0x00000004,
        "SC_SQL92_FULL"..0x00000008
    )

    IntConstant(
        "#DATETIME_LITERALS masks.",

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
        "#CATALOG_LOCATION values.",

        "CL_START".."SQL_QL_START",
        "CL_END".."SQL_QL_END"
    )

    IntConstant(
        "Values for #BATCH_ROW_COUNT.",

        "BRC_PROCEDURES"..0x0000001,
        "BRC_EXPLICIT"..0x0000002,
        "BRC_ROLLED_UP"..0x0000004
    )

    IntConstant(
        "Bitmasks for #BATCH_SUPPORT.",

        "BS_SELECT_EXPLICIT"..0x00000001,
        "BS_ROW_COUNT_EXPLICIT"..0x00000002,
        "BS_SELECT_PROC"..0x00000004,
        "BS_ROW_COUNT_PROC"..0x00000008
    )

    ShortConstant(
        "Values for #PARAM_ARRAY_ROW_COUNTS getinfo.",

        "PARC_BATCH".."1",
        "PARC_NO_BATCH".."2"
    )

    ShortConstant(
        "Values for #PARAM_ARRAY_SELECTS.",

        "PAS_BATCH".."1",
        "PAS_NO_BATCH".."2",
        "PAS_NO_SELECT".."3"
    )

    IntConstant(
        "Bitmasks for #INDEX_KEYWORDS.",

        "IK_NONE"..0x00000000,
        "IK_ASC"..0x00000001,
        "IK_DESC"..0x00000002,
        "IK_ALL".."SQL_IK_ASC | SQL_IK_DESC"
    )

    IntConstant(
        "Bitmasks for #INFO_SCHEMA_VIEWS.",

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
        "Bitmasks for #ASYNC_MODE.",

        "AM_NONE".."0",
        "AM_CONNECTION".."1",
        "AM_STATEMENT".."2"
    )

    IntConstant(
        "Bitmasks for #ALTER_DOMAIN.",

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
        "#CREATE_SCHEMA bitmasks.",

        "CS_CREATE_SCHEMA"..0x00000001,
        "CS_AUTHORIZATION"..0x00000002,
        "CS_DEFAULT_CHARACTER_SET"..0x00000004
    )

    IntConstant(
        "#CREATE_TRANSLATION bitmasks.",

        "CTR_CREATE_TRANSLATION"..0x00000001
    )

    IntConstant(
        "#CREATE_ASSERTION bitmasks.",

        "CA_CREATE_ASSERTION"..0x00000001,
        "CA_CONSTRAINT_INITIALLY_DEFERRED"..0x00000010,
        "CA_CONSTRAINT_INITIALLY_IMMEDIATE"..0x00000020,
        "CA_CONSTRAINT_DEFERRABLE"..0x00000040,
        "CA_CONSTRAINT_NON_DEFERRABLE"..0x00000080
    )

    IntConstant(
        "#CREATE_CHARACTER_SET bitmasks.",

        "CCS_CREATE_CHARACTER_SET"..0x00000001,
        "CCS_COLLATE_CLAUSE"..0x00000002,
        "CCS_LIMITED_COLLATION"..0x00000004
    )

    IntConstant(
        "#CREATE_COLLATION bitmasks.",

        "CCOL_CREATE_COLLATION"..0x00000001
    )

    IntConstant(
        "#CREATE_DOMAIN bitmasks.",

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
        "#CREATE_TABLE bitmasks.",

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
        "#DDL_INDEX bitmasks.",

        "DI_CREATE_INDEX"..0x00000001,
        "DI_DROP_INDEX"..0x00000002
    )

    IntConstant(
        "#DROP_COLLATION bitmasks.",

        "DC_DROP_COLLATION"..0x00000001
    )

    IntConstant(
        "#DROP_DOMAIN bitmasks.",

        "DD_DROP_DOMAIN"..0x00000001,
        "DD_RESTRICT"..0x00000002,
        "DD_CASCADE"..0x00000004
    )

    IntConstant(
        "#DROP_SCHEMA bitmasks.",

        "DS_DROP_SCHEMA"..0x00000001,
        "DS_RESTRICT"..0x00000002,
        "DS_CASCADE"..0x00000004
    )

    IntConstant(
        "#DROP_CHARACTER_SET bitmasks.",

        "DCS_DROP_CHARACTER_SET"..0x00000001
    )

    IntConstant(
        "#DROP_ASSERTION bitmasks.",

        "DA_DROP_ASSERTION"..0x00000001
    )

    IntConstant(
        "#DROP_TABLE bitmasks.",

        "DT_DROP_TABLE"..0x00000001,
        "DT_RESTRICT"..0x00000002,
        "DT_CASCADE"..0x00000004
    )

    IntConstant(
        "#DROP_TRANSLATION bitmasks.",

        "DTR_DROP_TRANSLATION"..0x00000001
    )

    IntConstant(
        "#DROP_VIEW bitmasks.",

        "DV_DROP_VIEW"..0x00000001,
        "DV_RESTRICT"..0x00000002,
        "DV_CASCADE"..0x00000004
    )

    IntConstant(
        "#INSERT_STATEMENT bitmasks.",

        "IS_INSERT_LITERALS"..0x00000001,
        "IS_INSERT_SEARCHED"..0x00000002,
        "IS_SELECT_INTO"..0x00000004
    )

    ShortConstant(
        "#ODBC_INTERFACE_CONFORMANCE values.",

        "OIC_CORE".."1",
        "OIC_LEVEL1".."2",
        "OIC_LEVEL2".."3"
    )

    IntConstant(
        "#SQL92_FOREIGN_KEY_DELETE_RULE bitmasks.",

        "SFKD_CASCADE"..0x00000001,
        "SFKD_NO_ACTION"..0x00000002,
        "SFKD_SET_DEFAULT"..0x00000004,
        "SFKD_SET_NULL"..0x00000008
    )

    IntConstant(
        "#SQL92_FOREIGN_KEY_UPDATE_RULE bitmasks.",

        "SFKU_CASCADE"..0x00000001,
        "SFKU_NO_ACTION"..0x00000002,
        "SFKU_SET_DEFAULT"..0x00000004,
        "SFKU_SET_NULL"..0x00000008
    )

    IntConstant(
        "#SQL92_GRANT bitmasks.",

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
        "#SQL92_PREDICATES bitmasks.",

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
        "#SQL92_RELATIONAL_JOIN_OPERATORS bitmasks.",

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
        "#SQL92_REVOKE bitmasks.",

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
        "#SQL92_ROW_VALUE_CONSTRUCTOR bitmasks.",

        "SRVC_VALUE_EXPRESSION"..0x00000001,
        "SRVC_NULL"..0x00000002,
        "SRVC_DEFAULT"..0x00000004,
        "SRVC_ROW_SUBQUERY"..0x00000008
    )

    IntConstant(
        "#SQL92_VALUE_EXPRESSIONS bitmasks.",

        "SVE_CASE"..0x00000001,
        "SVE_CAST"..0x00000002,
        "SVE_COALESCE"..0x00000004,
        "SVE_NULLIF"..0x00000008
    )

    IntConstant(
        "#STANDARD_CLI_CONFORMANCE bitmasks.",

        "SCC_XOPEN_CLI_VERSION1"..0x00000001,
        "SCC_ISO92_CLI"..0x00000002
    )

    IntConstant(
        "#UNION_STATEMENT bitmasks.",

        "US_UNION".."SQL_U_UNION",
        "US_UNION_ALL".."SQL_U_UNION_ALL"
    )

    IntConstant(
        "Values for #DRIVER_AWARE_POOLING_SUPPORTED.",

        "DRIVER_AWARE_POOLING_NOT_CAPABLE"..0x00000000,
        "DRIVER_AWARE_POOLING_CAPABLE"..0x00000001
    )

    IntConstant(
        "#DTC_TRANSITION_COST bitmasks.",

        "DTC_ENLIST_EXPENSIVE"..0x00000001,
        "DTC_UNENLIST_EXPENSIVE"..0x00000002
    )

    IntConstant(
        "Possible values for #ASYNC_DBC_FUNCTIONS.",

        "ASYNC_DBC_NOT_CAPABLE"..0x00000000,
        "ASYNC_DBC_CAPABLE"..0x00000001
    )

    ShortConstant(
        "Additional #DataSources() fetch directions.",

        "FETCH_FIRST_USER".."31",
        "FETCH_FIRST_SYSTEM".."32"
    )

    ShortConstant(
        "Defines for #SetPos().",

        "ENTIRE_ROWSET".."0"
    )

    ShortConstant(
        "Column types and scopes in #SpecialColumns().",

        "BEST_ROWID".."1",
        "ROWVER".."2"
    )

    ShortConstant(
        "Defines for #SpecialColumns() (returned in the result set).",

        "PC_NOT_PSEUDO".."1"
    )

    ShortConstant(
        "Defines for #Statistics().",

        "QUICK".."0",
        "ENSURE".."1"
    )

    ShortConstant(
        "Defines for #Statistics() (returned in the result set).",

        "TABLE_STAT".."0"
    )

    StringConstant(
        "Defines for #Tables().",

        "ALL_CATALOGS".."%",
        "ALL_SCHEMAS".."%",
        "ALL_TABLE_TYPES".."%"
    )

    ShortConstant(
        "#ExtendedFetch() {@code fFetchType} values.",

        "FETCH_BOOKMARK".."8"
    )

    ShortConstant(
        "#ExtendedFetch() {@code rgfRowStatus} element values.",

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
        "Value for #DESC_ARRAY_STATUS_PTR.",

        "PARAM_SUCCESS".."0",
        "PARAM_SUCCESS_WITH_INFO".."6",
        "PARAM_ERROR".."5",
        "PARAM_UNUSED".."7",
        "PARAM_DIAG_UNAVAILABLE".."1",
        "PARAM_PROCEED".."0",
        "PARAM_IGNORE".."1"
    )

    ShortConstant(
        "Defines for #ForeignKeys() (UPDATE_RULE and DELETE_RULE).",

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
        "Defines for #Procedures() (returned in the result set).",

        "PT_UNKNOWN".."0",
        "PT_PROCEDURE".."1",
        "PT_FUNCTION".."2"
    )

    // ---
    // sqltypes.h
    // ---

    ShortConstant(
        "SQLINTERVAL enumerations for DATETIME_INTERVAL_SUBCODE values for interval data types.",

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
        "Internal representation of numeric data type.",

        "MAX_NUMERIC_LEN".."16"
    )

    // ---
    // Connecting to a data source
    // ---

    SQLRETURN(
        "AllocHandle",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlallochandle-function">MSDN Reference</a>

        Allocates an environment, connection, statement, or descriptor handle.
        """,

        SQLSMALLINT("HandleType", "the type of handle to be allocated", HandleTypes),
        nullable..SQLHANDLE(
            "InputHandle",
            """
            the input handle in whose context the new handle is to be allocated. If {@code HandleType} is #HANDLE_ENV, this is #NULL_HANDLE. If
            {@code HandleType} is #HANDLE_DBC, this must be an environment handle, and if it is #HANDLE_STMT or #HANDLE_DESC, it must be a connection handle.
            """
        ),
        Check(1)..SQLHANDLE.p("OutputHandle", "pointer to a buffer in which to return the handle to the newly allocated data structure"),

        returnDoc =
        """
        #SUCCESS, #SUCCESS_WITH_INFO, #INVALID_HANDLE, or #ERROR.

        When allocating a handle other than an environment handle, if SQLAllocHandle returns #ERROR, it sets {@code OutputHandle} to #NULL_HDBC, #NULL_HSTMT,
        or #NULL_HDESC, depending on the value of {@code HandleType}, unless the output argument is a null pointer. The application can then obtain additional
        information from the diagnostic data structure associated with the handle in the {@code InputHandle} argument.
        """
    )

    NativeName("SQLConnectW")..SQLRETURN(
        "Connect",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlconnect-function">MSDN Reference</a>

        Establishes connections to a driver and a data source. The connection handle references storage of all information about the connection to the data
        source, including status, transaction state, and error information.
        """,

        SQLHDBC("ConnectionHandle", "the connection handle"),
        Input..SQLCHARUTF16.p(
            "ServerName",
            "the data source name. The data might be located on the same computer as the program, or on another computer somewhere on a network"
        ),
        AutoSize("ServerName")..SQLSMALLINT("NameLength1", "the length of {@code *ServerName} in characters"),
        Input..SQLCHARUTF16.p("UserName", "the user identifier"),
        AutoSize("UserName")..SQLSMALLINT("NameLength2", "the length of {@code *UserName} in characters"),
        Input..SQLCHARUTF16.p("Authentication", "the authentication string (typically the password)"),
        AutoSize("Authentication")..SQLSMALLINT("NameLength3", "the length of {@code *Authentication} in characters"),

        returnDoc = "#SUCCESS, #SUCCESS_WITH_INFO, #ERROR, #INVALID_HANDLE, or #STILL_EXECUTING"
    )

    // ---
    // Obtaining information about a driver and data source
    // ---

    IgnoreMissing..NativeName("SQLDataSourcesW")..SQLRETURN(
        "DataSources",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqldatasources-function">MSDN Reference</a>

        Returns information about a data source. This function is implemented only by the Driver Manager.
        """,

        SQLHENV("EnvironmentHandle", "the environment handle"),
        SQLUSMALLINT(
            "Direction",
            """
            determines which data source the Driver Manager returns information about. Can be:

            #FETCH_NEXT (to fetch the next data source name in the list), #FETCH_FIRST (to fetch from the beginning of the list), #FETCH_FIRST_USER (to fetch
            the first user DSN), or #FETCH_FIRST_SYSTEM (to fetch the first system DSN).

            When {@code Direction} is set to #FETCH_FIRST, subsequent calls to SQLDataSources with {@code Direction} set to #FETCH_NEXT return both user and system
            DSNs. When {@code Direction} is set to #FETCH_FIRST_USER, all subsequent calls to SQLDataSources with {@code Direction} set to #FETCH_NEXT return
            only user DSNs. When {@code Direction} is set to #FETCH_FIRST_SYSTEM, all subsequent calls to SQLDataSources with {@code Direction} set to
            #FETCH_NEXT return only system DSNs.
            """
        ),
        nullable..SQLCHARUTF16.p(
            "ServerName",
            """
            pointer to a buffer in which to return the data source name

            If {@code ServerName} is #NULL, {@code NameLength1Ptr} will still return the total number of characters (excluding the null-termination character
            for character data) available to return in the buffer pointed to by {@code ServerName}.
            """
        ),
        AutoSize("ServerName")..SQLSMALLINT(
            "BufferLength1",
            "length of the {@code *ServerName} buffer, in characters; this does not need to be longer than #MAX_DSN_LENGTH plus the null-termination character."
        ),
        Check(1)..SQLSMALLINT.p(
            "NameLength1Ptr",
            """
            pointer to a buffer in which to return the total number of characters (excluding the null-termination character) available to return in
            {@code *ServerName}. If the number of characters available to return is greater than or equal to {@code BufferLength1}, the data source name in
            {@code *ServerName} is truncated to {@code BufferLength1} minus the length of a null-termination character.
            """
        ),
        nullable..SQLCHARUTF16.p(
            "Description",
            """
            pointer to a buffer in which to return the description of the driver associated with the data source. For example, dBASE or SQL Server.

            If {@code Description} is #NULL, {@code NameLength2Ptr} will still return the total number of characters (excluding the null-termination character
            for character data) available to return in the buffer pointed to by {@code Description}.
            """
        ),
        AutoSize("Description")..SQLSMALLINT("BufferLength2", "length in characters of the {@code *Description} buffer."),
        Check(1)..SQLSMALLINT.p(
            "NameLength2Ptr",
            """
            pointer to a buffer in which to return the total number of characters (excluding the null-termination character) available to return in
            {@code *Description}. If the number of characters available to return is greater than or equal to {@code BufferLength2}, the driver description in
            {@code *Description} is truncated to {@code BufferLength2} minus the length of a null-termination character.
            """
        ),

        returnDoc = "#SUCCESS, #SUCCESS_WITH_INFO, #NO_DATA, #ERROR, or #INVALID_HANDLE"
    )

    NativeName("SQLGetInfoW")..SQLRETURN(
        "GetInfo",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgetinfo-function">MSDN Reference</a>

        Returns general information about the driver and data source associated with a connection.
        """,

        SQLHDBC("ConnectionHandle", "the connection handle"),
        SQLUSMALLINT("InfoType", "type of information", "$InfoTypes $InfoTypesExtended"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_POINTER
        )..nullable..SQLPOINTER("InfoValuePtr", ""),
        AutoSize("InfoValuePtr")..SQLSMALLINT("BufferLength", ""),
        Check(1)..nullable..SQLSMALLINT.p("StringLengthPtr", "")
    )

    SQLRETURN(
        "GetFunctions",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgetfunctions-function">MSDN Reference</a>

        Returns information about whether a driver supports a specific ODBC function. This function is implemented in the Driver Manager; it can also be
        implemented in drivers. If a driver implements SQLGetFunctions, the Driver Manager calls the function in the driver. Otherwise, it executes the
        function itself.
        """,

        SQLHDBC("ConnectionHandle", "the connection handle"),
        SQLUSMALLINT("FunctionId", "identifies the ODBC function of interest", "$FunctionIDs #API_ODBC3_ALL_FUNCTIONS"),
        Check(1)..SQLUSMALLINT.p("SupportedPtr", "")
    )

    NativeName("SQLGetTypeInfoW")..SQLRETURN(
        "GetTypeInfo",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgettypeinfo-function">MSDN Reference</a>

        Returns information about data types supported by the data source. The driver returns the information in the form of an SQL result set. The data types
        are intended for use in Data Definition Language (DDL) statements.
        """,

        SQLHSTMT("StatementHandle", "the statement handle for the result set"),
        SQLSMALLINT(
            "DataType",
            """
            the SQL data type. This must be one of the values in the SQL Data Types section of Appendix D: Data Types, or a driver-specific SQL data type.
            #ALL_TYPES specifies that information about all data types should be returned.
            """
        )
    )

    // ---
    // Setting and retrieving driver attributes
    // ---

    NativeName("SQLSetConnectAttrW")..SQLRETURN(
        "SetConnectAttr",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlsetconnectattr-function">MSDN Reference</a>

        Sets attributes that govern aspects of connections.
        """,

        SQLHDBC("ConnectionHandle", "the connection handle"),
        SQLINTEGER("Attribute", "the attribute to set", ConnectionAttributes),
        nullable..SQLPOINTER(
            "Value",
            """
            pointer to the value to be associated with {@code Attribute}. Depending on the value of {@code Attribute}, {@code Value} will be an unsigned
            integer value or will point to a null-terminated character string. Note that the integral type of the {@code Attribute} argument may not be fixed
            length.
            """
        ),
        AutoSize("Value")..SQLINTEGER(
            "StringLength",
            """
             if {@code Attribute} is an ODBC-defined attribute and {@code Value} points to a character string or a binary buffer, this argument should be the
             length of {@code *ValuePtr}. For character string data, this argument should contain the number of bytes in the string.

            If {@code Attribute} is an ODBC-defined attribute and {@code Value} is an integer, {@code StringLength} is ignored.

            If {@code Attribute} is a driver-defined attribute, the application indicates the nature of the attribute to the Driver Manager by setting the
            {@code StringLength} argument. {@code StringLength} can have the following values:
            ${ul(
                "If {@code Value} is a pointer to a character string, then {@code StringLength} is the length of the string or #NTS.",
                """
                If {@code Value} is a pointer to a binary buffer, then the application places the result of the {@code SQL_LEN_BINARY_ATTR(length)} macro in
                {@code StringLength}. This places a negative value in {@code StringLength}.
                """,
                """
                If {@code Value} is a pointer to a value other than a character string or a binary string, then {@code StringLength} should have the value
                #IS_POINTER.
                """,
                "If {@code ValuePtr} contains a fixed-length value, then {@code StringLength} is either #IS_INTEGER or #IS_UINTEGER, as appropriate."
            )}
            """
        ),

        returnDoc = "#SUCCESS, #SUCCESS_WITH_INFO, #ERROR, #INVALID_HANDLE, or #STILL_EXECUTING"
    )

    NativeName("SQLGetConnectAttrW")..SQLRETURN(
        "GetConnectAttr",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgetconnectattr-function">MSDN Reference</a>

        Returns the current setting of a connection attribute.
        """,

        SQLHDBC("ConnectionHandle", "the connection handle"),
        SQLINTEGER("Attribute", "attribute to retrieve", ConnectionAttributes),
        nullable..SQLPOINTER("ValuePtr", ""),
        AutoSize("ValuePtr")..SQLINTEGER("BufferLength", ""),
        Check(1)..SQLINTEGER.p("StringLengthPtr", "")
    )

    SQLRETURN(
        "SetEnvAttr",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlsetenvattr-function">MSDN Reference</a>

        Sets attributes that govern aspects of environments.
        """,

        nullable..SQLHENV("EnvironmentHandle", "the environment handle"),
        SQLINTEGER("Attribute", "the attribute to set", EnvironmentAttributes),
        nullable..SQLPOINTER(
            "Value",
            """
            pointer to the value to be associated with {@code Attribute}. Depending on the value of {@code Attribute}, {@code Value} will be a 32-bit integer
            value or point to a null-terminated character string.
            """
        ),
        AutoSize("Value")..SQLINTEGER(
            "StringLength",
            """
            if {@code Value} points to a character string or a binary buffer, this argument should be the length of {@code *Value}. For character string data,
            this argument should contain the number of bytes in the string.
            """
        ),

        returnDoc = "#SUCCESS, #SUCCESS_WITH_INFO, #ERROR, or #INVALID_HANDLE"
    )

    SQLRETURN(
        "GetEnvAttr",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgetenvattr-function">MSDN Reference</a>

        Returns the current setting of a connection attribute.
        """,

        SQLHENV("EnvironmentHandle", ""),
        SQLINTEGER("Attribute", "", EnvironmentAttributes),
        nullable..SQLPOINTER("ValuePtr", ""),
        AutoSize("ValuePtr")..SQLINTEGER("BufferLength", ""),
        Check(1)..SQLINTEGER.p("StringLengthPtr", "")
    )

    NativeName("SQLSetStmtAttrW")..SQLRETURN(
        "SetStmtAttr",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlsetstmtattr-function">MSDN Reference</a>

        Sets attributes related to a statement.
        """,

        SQLHSTMT("StatementHandle", "the statement handle"),
        SQLINTEGER("Attribute", "the attribute to set", StatementAttributes),
        nullable..SQLPOINTER("Value", ""),
        AutoSize("Value")..SQLINTEGER("StringLength", "")
    )

    NativeName("SQLGetStmtAttrW")..SQLRETURN(
        "GetStmtAttr",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgetstmtattr-function">MSDN Reference</a>

        Returns the current setting of a statement attribute.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLINTEGER("Attribute", "", StatementAttributes),
        nullable..SQLPOINTER("ValuePtr", ""),
        AutoSize("ValuePtr")..SQLINTEGER("BufferLength", ""),
        Check(1)..nullable..SQLINTEGER.p("StringLengthPtr", "")
    )

    // ---
    // Setting and retrieving descriptor fields
    // ---

    NativeName("SQLGetDescFieldW")..SQLRETURN(
        "GetDescField",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgetdescfield-function">MSDN Reference</a>

        Returns the current setting or value of a single field of a descriptor record.
        """,

        SQLHDESC("DescriptorHandle", ""),
        SQLSMALLINT("RecNumber", ""),
        SQLSMALLINT("FieldIdentifier", ""),
        nullable..SQLPOINTER("ValuePtr", ""),
        AutoSize("ValuePtr")..SQLINTEGER("BufferLength", ""),
        nullable..Check(1)..SQLINTEGER.p("StringLengthPtr", "")
    )

    NativeName("SQLGetDescRecW")..SQLRETURN(
        "GetDescRec",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgetdescrec-function">MSDN Reference</a>

        Returns the current settings or values of multiple fields of a descriptor record. The fields returned describe the name, data type, and storage of
        column or parameter data.
        """,

        SQLHDESC("DescriptorHandle", ""),
        SQLSMALLINT("RecNumber", ""),
        nullable..SQLCHARUTF16.p("Name", ""),
        AutoSize("Name")..SQLSMALLINT("BufferLength", ""),
        Check(1)..nullable..SQLSMALLINT.p("StringLengthPtr", ""),
        Check(1)..nullable..SQLSMALLINT.p("TypePtr", ""),
        Check(1)..nullable..SQLSMALLINT.p("SubTypePtr", ""),
        Check(1)..nullable..SQLLEN.p("LengthPtr", ""),
        Check(1)..nullable..SQLSMALLINT.p("PrecisionPtr", ""),
        Check(1)..nullable..SQLSMALLINT.p("ScalePtr", ""),
        Check(1)..nullable..SQLSMALLINT.p("NullablePtr", "")
    )

    NativeName("SQLSetDescFieldW")..SQLRETURN(
        "SetDescField",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlsetdescfield-function">MSDN Reference</a>

        Sets the value of a single field of a descriptor record.
        """,

        SQLHDESC("DescriptorHandle", ""),
        SQLSMALLINT("RecNumber", ""),
        SQLSMALLINT("FieldIdentifier", ""),
        SQLPOINTER("ValuePtr", ""),
        AutoSize("ValuePtr")..SQLINTEGER("BufferLength", "")
    )

    SQLRETURN(
        "SetDescRec",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlsetdescrec-function">MSDN Reference</a>

        Sets multiple descriptor fields that affect the data type and buffer bound to a column or parameter data.
        """,

        SQLHDESC("DescriptorHandle", ""),
        SQLSMALLINT("RecNumber", ""),
        SQLSMALLINT("Type", ""),
        SQLSMALLINT("SubType", ""),
        SQLLEN("Length", ""),
        SQLSMALLINT("Precision", ""),
        SQLSMALLINT("Scale", ""),
        Check(1)..nullable..SQLPOINTER("DataPtr", ""),
        Check(1)..nullable..SQLLEN.p("StringLengthPtr", ""),
        Check(1)..nullable..SQLLEN.p("IndicatorPtr", "")
    )

    SQLRETURN(
        "CopyDesc",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlcopydesc-function">MSDN Reference</a>

        Copies descriptor information from one descriptor handle to another.
        """,

        SQLHDESC("SourceDescHandle", ""),
        SQLHDESC("TargetDescHandle", "")
    )

    // ---
    // Preparing SQL requests
    // ---

    NativeName("SQLPrepareW")..SQLRETURN(
        "Prepare",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlprepare-function">MSDN Reference</a>

        Prepares an SQL string for execution.
        """,

        SQLHSTMT("StatementHandle", ""),
        Input..SQLCHARUTF16.p("StatementText", ""),
        AutoSize("StatementText")..SQLINTEGER("TextLength", "")
    )

    NativeName("SQLGetCursorNameW")..SQLRETURN(
        "GetCursorName",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgetcursorname-function">MSDN Reference</a>

        Returns the cursor name associated with a specified statement.
        """,

        SQLHSTMT("StatementHandle", ""),
        nullable..SQLCHARUTF16.p("CursorName", ""),
        AutoSize("CursorName")..SQLSMALLINT("BufferLength", ""),
        Check(1)..SQLSMALLINT.p("NameLengthPtr", "")
    )

    NativeName("SQLSetCursorNameW")..SQLRETURN(
        "SetCursorName",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlsetcursorname-function">MSDN Reference</a>

        Associates a cursor name with an active statement. If an application does not call SQLSetCursorName, the driver generates cursor names as needed for
        SQL statement processing.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLCHARUTF16.p("CursorName", ""),
        AutoSize("CursorName")..SQLSMALLINT("NameLength", "")
    )

    // ---
    // Submitting requests
    // ---

    SQLRETURN(
        "Execute",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlexecute-function">MSDN Reference</a>

        Executes a prepared statement, using the current values of the parameter marker variables if any parameter markers exist in the statement.
        """,

        SQLHSTMT("StatementHandle", "statement handle")
    )

    NativeName("SQLExecDirectW")..SQLRETURN(
        "ExecDirect",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlexecdirect-function">MSDN Reference</a>

        Executes a preparable statement, using the current values of the parameter marker variables if any parameters exist in the statement. SQLExecDirect is
        the fastest way to submit an SQL statement for one-time execution.
        """,

        SQLHSTMT("StatementHandle", "statement handle"),
        Input..SQLCHARUTF16.p("StatementText", "SQL statement to be executed"),
        AutoSize("StatementText")..SQLINTEGER("TextLength", "length of {@code StatementText} in characters")
    )

    SQLRETURN(
        "ParamData",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlparamdata-function">MSDN Reference</a>

        SQLParamData is used together with #PutData() to supply parameter data at statement execution time, and with #GetData() to retrieve streamed output
        parameter data.
        """,

        SQLHSTMT("StatementHandle", ""),
        Check(1)..SQLPOINTER.p("ValuePtrPtr", "")
    )

    SQLRETURN(
        "PutData",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlputdata-function">MSDN Reference</a>

        Allows an application to send data for a parameter or column to the driver at statement execution time. This function can be used to send character or
        binary data values in parts to a column with a character, binary, or data source–specific data type (for example, parameters of the #LONGVARBINARY or
        #LONGVARCHAR types). SQLPutData supports binding to a Unicode C data type, even if the underlying driver does not support Unicode data.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLPOINTER("DataPtr", ""),
        AutoSize("DataPtr")..SQLLEN("StrLen_or_Ind", "")
    )

    // ---
    // Retrieving results and information about results
    // ---

    SQLRETURN(
        "RowCount",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlrowcount-function">MSDN Reference</a>

        Returns the number of rows affected by an UPDATE, INSERT, or DELETE statement; an #ADD, #UPDATE_BY_BOOKMARK, or #DELETE_BY_BOOKMARK operation in
        #BulkOperations(); or an #UPDATE or #DELETE operation in #SetPos().
        """,

        SQLHSTMT("StatementHandle", ""),
        Check(1)..SQLLEN.p("RowCountPtr", "")
    )

    SQLRETURN(
        "NumResultCols",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlnumresultcols-function">MSDN Reference</a>

        Returns the number of columns in a result set.
        """,

        SQLHSTMT("StatementHandle", ""),
        Check(1)..SQLSMALLINT.p("ColumnCountPtr", "")
    )

    NativeName("SQLDescribeColW")..SQLRETURN(
        "DescribeCol",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqldescribecol-function">MSDN Reference</a>

        Returns the result descriptor — column name,type, column size, decimal digits, and nullability — for one column in the result set. This information
        also is available in the fields of the IRD.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLUSMALLINT("ColumnNumber", ""),
        nullable..SQLCHARUTF16.p("ColumnName", ""),
        AutoSize("ColumnName")..SQLSMALLINT("BufferLength", ""),
        Check(1)..SQLSMALLINT.p("NameLengthPtr", ""),
        Check(1)..SQLSMALLINT.p("DataTypePtr", ""),
        Check(1)..SQLULEN.p("ColumnSizePtr", ""),
        Check(1)..SQLSMALLINT.p("DecimalDigitsPtr", ""),
        Check(1)..SQLSMALLINT.p("NullablePtr", "")
    )

    NativeName("SQLColAttributeW")..SQLRETURN(
        "ColAttribute",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlcolattribute-function">MSDN Reference</a>

        Returns descriptor information for a column in a result set. Descriptor information is returned as a character string, a descriptor-dependent value, or
        an integer value.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLUSMALLINT("ColumnNumber", ""),
        SQLUSMALLINT("FieldIdentifier", ""),
        nullable..SQLPOINTER("CharacterAttributePtr", ""),
        AutoSize("CharacterAttributePtr")..SQLSMALLINT("BufferLength", ""),
        Check(1)..SQLSMALLINT.p("StringLengthPtr", ""),
        Check(1)..SQLLEN.p("NumericAttributePtr", "")
    )

    SQLRETURN(
        "BindCol",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlbindcol-function">MSDN Reference</a>

        Binds application data buffers to columns in the result set.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLUSMALLINT("ColumnNumber", ""),
        SQLSMALLINT("TargetType", ""),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..nullable..SQLPOINTER("TargetValuePtr", ""),
        AutoSize("TargetValuePtr")..SQLLEN("BufferLength", ""),
        Check(1)..nullable..SQLLEN.p("StrLen_or_Ind", "")
    )

    SQLRETURN(
        "Fetch",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlfetch-function">MSDN Reference</a>

        Fetches the next rowset of data from the result set and returns data for all bound columns.
        """,

        SQLHSTMT("StatementHandle", "")
    )

    SQLRETURN(
        "FetchScroll",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlfetchscroll-function">MSDN Reference</a>

        Fetches the specified rowset of data from the result set and returns data for all bound columns. Rowsets can be specified at an absolute or relative
        position or by bookmark.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLSMALLINT("FetchOrientation", "", "$FetchOrientations $FetchOrientationsScroll"),
        SQLLEN("FetchOffset", "")
    )

    SQLRETURN(
        "GetData",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgetdata-function">MSDN Reference</a>

        Retrieves data for a single column in the result set or for a single parameter after #ParamData() returns #PARAM_DATA_AVAILABLE. It can be called
        multiple times to retrieve variable-length data in parts.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLUSMALLINT("Col_or_Param_Num", ""),
        SQLSMALLINT("TargetType", ""),
        SQLPOINTER("TargetValuePtr", ""),
        AutoSize("TargetValuePtr")..SQLLEN("BufferLength", ""),
        Check(1)..SQLLEN.p("StrLen_or_IndPtr", "")
    )

    NativeName("SQLGetDiagFieldW")..SQLRETURN(
        "GetDiagField",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgetdiagfield-function">MSDN Reference</a>

        Returns the current value of a field of a record of the diagnostic data structure (associated with a specified handle) that contains error, warning,
        and status information.
        """,

        SQLSMALLINT(
            "HandleType",
            "a handle type identifier that describes the type of handle for which diagnostics are required",
            HandleTypes
        ),
        SQLHANDLE(
            "Handle",
            """
            a handle for the diagnostic data structure, of the type indicated by {@code HandleType}. If {@code HandleType} is #HANDLE_ENV, {@code Handle} can
            be either a shared or an unshared environment handle.
            """
        ),
        SQLSMALLINT(
            "RecNumber",
            """
            indicates the status record from which the application seeks information. Status records are numbered from 1. If the {@code DiagIdentifier}
            argument indicates any field of the diagnostics header, {@code RecNumber} is ignored. If not, it should be more than 0.
            """
        ),
        SQLSMALLINT("DiagIdentifier", "indicates the field of the diagnostic whose value is to be returned", DiagnosticsFields),
        nullable..SQLPOINTER(
            "DiagInfoPtr",
            """
            pointer to a buffer in which to return the diagnostic information. The data type depends on the value of {@code DiagIdentifier}. If
            {@code DiagInfoPtr} is an integer type, applications should use a buffer of {@code SQLULEN} and initialize the value to 0 before calling this
            function, as some drivers may only write the lower 32-bit or 16-bit of a buffer and leave the higher-order bit unchanged.

            If {@code DiagInfoPtr} is #NULL, {@code StringLengthPtr} will still return the total number of bytes (excluding the null-termination character for
            character data) available to return in the buffer pointed to by {@code DiagInfoPtr}.
            """
        ),
        AutoSize("DiagInfoPtr")..SQLSMALLINT(
            "BufferLength",
            """
            If {@code DiagIdentifier} is an ODBC-defined diagnostic and {@code DiagInfoPtr} points to a character string or a binary buffer, this argument
            should be the length of {@code *DiagInfoPtr}. If {@code DiagIdentifier} is an ODBC-defined field and {@code *DiagInfoPtr} is an integer,
            {@code BufferLength} is ignored. If the value in {@code *DiagInfoPtr} is a Unicode string (when calling {@code SQLGetDiagFieldW}), the
            {@code BufferLength} argument must be an even number.

            If {@code DiagIdentifier} is a driver-defined field, the application indicates the nature of the field to the Driver Manager by setting the
            {@code BufferLength} argument. {@code BufferLength} can have the following values:
            ${ul(
                "If  is a pointer to a character string, {@code BufferLength} is the length of the string or #NTS.",
                """
                If {@code DiagInfoPtr} is a pointer to a binary buffer, the application places the result of the {@code SQL_LEN_BINARY_ATTR(length)} macro in
                {@code BufferLength}. This places a negative value in {@code BufferLength}.
                """,
                """
                If {@code DiagInfoPtr} is a pointer to a value other than a character string or binary string, {@code BufferLength} should have the value
                #IS_POINTER.
                """,
                """
                If {@code *DiagInfoPtr} contains a fixed-length data type, {@code BufferLength} is #IS_INTEGER, #IS_UINTEGER, #IS_SMALLINT, or #IS_USMALLINT,
                as appropriate.
                """
            )}
            """
        ),
        Check(1)..SQLSMALLINT.p(
            "StringLengthPtr",
            """
            Pointer to a buffer in which to return the total number of bytes (excluding the number of bytes required for the null-termination character)
            available to return in {@code *DiagInfoPtr}, for character data. If the number of bytes available to return is greater than or equal to
            {@code BufferLength}, the text in {@code *DiagInfoPtr} is truncated to {@code BufferLength} minus the length of a null-termination character.
            """
        )
    )

    NativeName("SQLGetDiagRecW")..SQLRETURN(
        "GetDiagRec",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlgetdiagrec-function">MSDN Reference</a>

        Returns the current values of multiple fields of a diagnostic record that contains error, warning, and status information. Unlike #GetDiagField(),
        which returns one diagnostic field per call, SQLGetDiagRec returns several commonly used fields of a diagnostic record, including the SQLSTATE, the
        native error code, and the diagnostic message text.
        """,

        SQLSMALLINT("HandleType", ""),
        SQLHANDLE("Handle", ""),
        SQLSMALLINT("RecNumber", ""),
        Check(6)..SQLCHARUTF16.p("SQLState", ""),
        Check(1)..SQLINTEGER.p("NativeErrorPtr", ""),
        nullable..SQLCHARUTF16.p("MessageText", ""),
        AutoSize("MessageText")..SQLSMALLINT("BufferLength", ""),
        Check(1)..SQLSMALLINT.p("TextLengthPtr", "")
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
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlfreestmt-function">MSDN Reference</a>

        Stops processing associated with a specific statement, closes any open cursors associated with the statement, discards pending results, or, optionally,
        frees all resources associated with the statement handle.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLUSMALLINT("Option", "", FreeStmtOptions)
    )

    SQLRETURN(
        "CloseCursor",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlclosecursor-function">MSDN Reference</a>

        Closes a cursor that has been opened on a statement and discards pending results.
        """,

        SQLHSTMT("StatementHandle", "")
    )

    SQLRETURN(
        "Cancel",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlcancel-function">MSDN Reference</a>

        Cancels the processing on a statement.

        To cancel processing on a connection or statement, use #CancelHandle() function.
        """,

        SQLHSTMT("StatementHandle", "")
    )

    IgnoreMissing..SQLRETURN(
        "CancelHandle",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlcancelhandle-function">MSDN Reference</a>

        Cancels the processing on a connection or statement. The Driver Manager maps a call to SQLCancelHandle to a call to #Cancel() when {@code HandleType}
        is #HANDLE_STMT.
        """,

        SQLSMALLINT("HandleType", "", "#HANDLE_DBC #HANDLE_STMT"),
        SQLHANDLE("Handle", ""),

        since = "ODBC 3.8"
    )

    SQLRETURN(
        "EndTran",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlendtran-function">MSDN Reference</a>

        Requests a commit or rollback operation for all active operations on all statements associated with a connection. SQLEndTran can also request that a
        commit or rollback operation be performed for all connections associated with an environment.
        """,

        SQLSMALLINT("HandleType", "", "#HANDLE_ENV #HANDLE_DBC"),
        SQLHANDLE("Handle", ""),
        SQLSMALLINT("CompletionType", "", EndTranOptions)
    )

    // ---
    // Terminating a connection
    // ---

    SQLRETURN(
        "Disconnect",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqldisconnect-function">MSDN Reference</a>

        Closes the connection associated with a specific connection handle.
        """,

        SQLHDBC("ConnectionHandle", "the connection handle")
    )

    SQLRETURN(
        "FreeHandle",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlfreehandle-function">MSDN Reference</a>

        Frees resources associated with a specific environment, connection, statement, or descriptor handle.
        """,

        SQLSMALLINT("HandleType", "", HandleTypes),
        SQLHANDLE("Handle", "")
    )

    IgnoreMissing..SQLRETURN(
        "CompleteAsync",
        """
        SQLCompleteAsync can be used to determine when an asynchronous function is complete using either notification- or polling-based processing. For more
        information about asynchronous operations, see ${url(
            "https://docs.microsoft.com/en-us/sql/odbc/reference/develop-app/asynchronous-execution",
            "Asynchronous Execution"
        )}.

        SQLCompleteAsync is only implemented in the ODBC Driver Manager.

        In notification based asynchronous processing mode, SQLCompleteAsync must be called after the Driver Manager raises the event object used for
        notification. SQLCompleteAsync completes the asynchronous processing and the asynchronous function will generate a return code.

        In polling based asynchronous processing mode, SQLCompleteAsync is an alternative to calling the original asynchronous function, without needing to
        specify the arguments in the original asynchronous function call. SQLCompleteAsync can be used regardless whether the ODBC Cursor Library is enabled.
        """,

        SQLSMALLINT("HandleType", "the type of the handle on which to complete asynchronous processing", "#HANDLE_DBC #HANDLE_STMT"),
        SQLHANDLE(
            "Handle",
            """
            the handle on which to complete asynchronous processing. If {@code Handle} is not a valid handle of the type specified by {@code HandleType},
            SQLCompleteAsync returns #INVALID_HANDLE.
            """
        ),
        Check(1)..RETCODE.p(
            "AsyncRetCodePtr",
            """
            pointer to a buffer that will contain the return code of the asynchronous API. If {@code AsyncRetCodePtr} is #NULL, SQLCompleteAsync returns
            #ERROR.
            """
        ),

        since = "ODBC 3.8"
    )

    NativeName("SQLColumnsW")..SQLRETURN(
        "Columns",
        "",

        SQLHSTMT("StatementHandle", ""),
        nullable..SQLCHARUTF16.p("CatalogName", ""),
        AutoSize("CatalogName")..SQLSMALLINT("NameLength1", ""),
        nullable..SQLCHARUTF16.p("SchemaName", ""),
        AutoSize("SchemaName")..SQLSMALLINT("NameLength2", ""),
        nullable..SQLCHARUTF16.p("TableName", ""),
        AutoSize("TableName")..SQLSMALLINT("NameLength3", ""),
        nullable..SQLCHARUTF16.p("ColumnName", ""),
        AutoSize("ColumnName")..SQLSMALLINT("NameLength4", "")
    )

    NativeName("SQLSpecialColumnsW")..SQLRETURN(
        "SpecialColumns",
        "",

        SQLHSTMT("StatementHandle", ""),
        SQLUSMALLINT("IdentifierType", ""),
        nullable..SQLCHARUTF16.p("CatalogName", ""),
        AutoSize("CatalogName")..SQLSMALLINT("NameLength1", ""),
        nullable..SQLCHARUTF16.p("SchemaName", ""),
        AutoSize("SchemaName")..SQLSMALLINT("NameLength2", ""),
        nullable..SQLCHARUTF16.p("TableName", ""),
        AutoSize("TableName")..SQLSMALLINT("NameLength3", ""),
        SQLUSMALLINT("Scope", ""),
        SQLUSMALLINT("Nullable", "")
    )

    NativeName("SQLStatisticsW")..SQLRETURN(
        "Statistics",
        "",

        SQLHSTMT("StatementHandle", ""),
        nullable..SQLCHARUTF16.p("CatalogName", ""),
        AutoSize("CatalogName")..SQLSMALLINT("NameLength1", ""),
        nullable..SQLCHARUTF16.p("SchemaName", ""),
        AutoSize("SchemaName")..SQLSMALLINT("NameLength2", ""),
        nullable..SQLCHARUTF16.p("TableName", ""),
        AutoSize("TableName")..SQLSMALLINT("NameLength3", ""),
        SQLUSMALLINT("Unique", ""),
        SQLUSMALLINT("Reserved", "")
    )

    NativeName("SQLTablesW")..SQLRETURN(
        "Tables",
        "",

        SQLHSTMT("StatementHandle", ""),
        nullable..SQLCHARUTF16.p("CatalogName", ""),
        AutoSize("CatalogName")..SQLSMALLINT("NameLength1", ""),
        nullable..SQLCHARUTF16.p("SchemaName", ""),
        AutoSize("SchemaName")..SQLSMALLINT("NameLength2", ""),
        nullable..SQLCHARUTF16.p("TableName", ""),
        AutoSize("TableName")..SQLSMALLINT("NameLength3", ""),
        nullable..SQLCHARUTF16.p("TableType", ""),
        AutoSize("TableType")..SQLSMALLINT("NameLength4", "")
    )

    IgnoreMissing..SQLRETURN(
        "Transact",
        "",

        SQLHENV("EnvironmentHandle", ""),
        SQLHDBC("ConnectionHandle", "the connection handle"),
        SQLUSMALLINT("CompletionType", "")
    )

    // -------------------------------------------------------
    //               Microsoft SQL Extensions
    // -------------------------------------------------------

    val DriverConnectOptions = ShortConstant(
        "Options for #DriverConnect().",

        "DRIVER_NOPROMPT".."0",
        "DRIVER_COMPLETE".."1",
        "DRIVER_PROMPT".."2",
        "DRIVER_COMPLETE_REQUIRED".."3"
    ).javaDocLinks

    val SetPosOperations = ShortConstant(
        "Operations in #SetPos().",

        "POSITION".."0",
        "REFRESH".."1",
        "UPDATE".."2",
        "DELETE".."3"
    ).javaDocLinks

    val BulkOperations = ShortConstant(
        "Operations in #BulkOperations().",

        "ADD".."4",
        "SETPOS_MAX_OPTION_VALUE".."SQL_ADD",
        "UPDATE_BY_BOOKMARK".."5",
        "DELETE_BY_BOOKMARK".."6",
        "FETCH_BY_BOOKMARK".."7"
    ).javaDocLinks

    val SetPosLockOptions = ShortConstant(
        "Lock options in #SetPos().",

        "LOCK_NO_CHANGE".."0",
        "LOCK_EXCLUSIVE".."1",
        "LOCK_UNLOCK".."2",
        "SETPOS_MAX_LOCK_VALUE".."SQL_LOCK_UNLOCK"
    ).javaDocLinks

    // TODO: SQLSetPos macros (sqlext.h:1745)

    NativeName("SQLDriverConnectW")..SQLRETURN(
        "DriverConnect",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqldriverconnect-function">MSDN Reference</a>

        SQLDriverConnect is an alternative to #Connect(). It supports data sources that require more connection information than the three arguments in
        SQLConnect, dialog boxes to prompt the user for all connection information, and data sources that are not defined in the system information.

        SQLDriverConnect provides the following connection attributes:
        ${ul(
            """
            Establish a connection using a connection string that contains the data source name, one or more user IDs, one or more passwords, and other
            information required by the data source.
            """,
            """
            Establish a connection using a partial connection string or no additional information; in this case, the Driver Manager and the driver can each
            prompt the user for connection information.
            """,
            """
            Establish a connection to a data source that is not defined in the system information. If the application supplies a partial connection string, the
            driver can prompt the user for connection information.
            """,
            "Establish a connection to a data source using a connection string constructed from the information in a .dsn file."
        )}
        After a connection is established, SQLDriverConnect returns the completed connection string. The application can use this string for subsequent
        connection requests.
        """,

        SQLHDBC("ConnectionHandle", "the connection handle"),
        nullable..SQLHWND(
            "WindowHandle",
            """
            the window handle. The application can pass the handle of the parent window, if applicable, or a null pointer if either the window handle is not
            applicable or SQLDriverConnect will not present any dialog boxes.
            """
        ),
        Input..SQLCHARUTF16.p("InConnectionString", "a full connection string, a partial connection string, or an empty string."),
        AutoSize("InConnectionString")..SQLSMALLINT("StringLength1", "the length of {@code *InConnectionString}, in characters"),
        nullable..SQLCHARUTF16.p(
            "OutConnectionString",
            """
            pointer to a buffer for the completed connection string. Upon successful connection to the target data source, this buffer contains the completed
            connection string. Applications should allocate at least 1,024 characters for this buffer. If {@code OutConnectionString} is #NULL,
            {@code StringLength2Ptr} will still return the total number of characters (excluding the null-termination character for character data) available
            to return in the buffer pointed to by {@code OutConnectionString}.
            """
        ),
        AutoSize("OutConnectionString")..SQLSMALLINT("BufferLength", "length of the {@code *OutConnectionString} buffer, in characters."),
        Check(1)..nullable..SQLSMALLINT.p(
            "StringLength2Ptr",
            """
            pointer to a buffer in which to return the total number of characters (excluding the null-termination character) available to return in
            {@code *OutConnectionString}. If the number of characters available to return is greater than or equal to {@code BufferLength}, the completed
            connection string in {@code *OutConnectionString} is truncated to {@code BufferLength} minus the length of a null-termination character.
            """
        ),
        SQLUSMALLINT(
            "DriverCompletion",
            "a flag that indicates whether the Driver Manager or driver must prompt for more connection information",
            DriverConnectOptions
        ),

        returnDoc = "#SUCCESS, #SUCCESS_WITH_INFO, #NO_DATA, #ERROR, #INVALID_HANDLE, or #STILL_EXECUTING"
    )

    NativeName("SQLBrowseConnectW")..SQLRETURN(
        "BrowseConnect",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlbrowseconnect-function">MSDN Reference</a>

        Supports an iterative method of discovering and enumerating the attributes and attribute values required to connect to a data source. Each call to
        SQLBrowseConnect returns successive levels of attributes and attribute values. When all levels have been enumerated, a connection to the data source is
        completed and a complete connection string is returned by SQLBrowseConnect. A return code of #SUCCESS or #SUCCESS_WITH_INFO indicates that all
        connection information has been specified and the application is now connected to the data source.
        """,

        SQLHDBC("ConnectionHandle", "the connection handle"),
        Input..SQLCHARUTF16.p("InConnectionString", "browse request connection string"),
        AutoSize("InConnectionString")..SQLSMALLINT("StringLength1", "the length of {@code *InConnectionString}, in characters"),
        nullable..SQLCHARUTF16.p(
            "OutConnectionString",
            """
            pointer to a character buffer in which to return the browse result connection string. If {@code OutConnectionString} is #NULL,
            {@code StringLength2Ptr} will still return the total number of characters (excluding the null-termination character for character data) available
            to return in the buffer pointed to by {@code OutConnectionString}.
            """
        ),
        AutoSize("OutConnectionString")..SQLSMALLINT("BufferLength", "length of the {@code *OutConnectionString} buffer, in characters."),
        Check(1)..nullable..SQLSMALLINT.p(
            "StringLength2Ptr",
            """
            pointer to a buffer in which to return the total number of characters (excluding the null-termination character) available to return in
            {@code *OutConnectionString}. If the number of characters available to return is greater than or equal to {@code BufferLength}, the completed
            connection string in {@code *OutConnectionString} is truncated to {@code BufferLength} minus the length of a null-termination character.
            """
        ),

        returnDoc = "#SUCCESS, #SUCCESS_WITH_INFO, #NEED_DATA, #ERROR, #INVALID_HANDLE, or #STILL_EXECUTING"
    )

    SQLRETURN(
        "BulkOperations",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlbulkoperations-function">MSDN Reference</a>

        Performs bulk insertions and bulk bookmark operations, including update, delete, and fetch by bookmark.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLUSMALLINT("Operation", "", BulkOperations)
    )

    NativeName("SQLColumnPrivilegesW")..SQLRETURN(
        "ColumnPrivileges",
        "",

        SQLHSTMT("hstmt", ""),
        nullable..SQLCHARUTF16.p("szCatalogName", ""),
        AutoSize("szCatalogName")..SQLSMALLINT("cchCatalogName", ""),
        nullable..SQLCHARUTF16.p("szSchemaName", ""),
        AutoSize("szSchemaName")..SQLSMALLINT("cchSchemaName", ""),
        nullable..SQLCHARUTF16.p("szTableName", ""),
        AutoSize("szTableName")..SQLSMALLINT("cchTableName", ""),
        nullable..SQLCHARUTF16.p("szColumnName", ""),
        AutoSize("szColumnName")..SQLSMALLINT("cchColumnName", "")
    )

    SQLRETURN(
        "DescribeParam",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqldescribeparam-function">MSDN Reference</a>

        Returns the description of a parameter marker associated with a prepared SQL statement. This information is also available in the fields of the IPD.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLUSMALLINT("ParameterNumber", ""),
        Check(1)..nullable..SQLSMALLINT.p("DataTypePtr", ""),
        Check(1)..nullable..SQLULEN.p("ParameterSizePtr", ""),
        Check(1)..nullable..SQLSMALLINT.p("DecimalDigitsPtr", ""),
        Check(1)..nullable..SQLSMALLINT.p("NullablePtr", "")
    )

    SQLRETURN(
        "ExtendedFetch",
        "",

        SQLHSTMT("hstmt", ""),
        SQLUSMALLINT("fFetchType", ""),
        SQLLEN("irow", ""),
        Check(1)..nullable..SQLULEN.p("pcrow", ""),
        Check(1)..nullable..SQLUSMALLINT.p("rgfRowStatus", "")
    )

    NativeName("SQLForeignKeysW")..SQLRETURN(
        "ForeignKeys",
        "",

        SQLHSTMT("hstmt", ""),
        nullable..SQLCHARUTF16.p("szPkCatalogName", ""),
        AutoSize("szPkCatalogName")..SQLSMALLINT("cchPkCatalogName", ""),
        nullable..SQLCHARUTF16.p("szPkSchemaName", ""),
        AutoSize("szPkSchemaName")..SQLSMALLINT("cchPkSchemaName", ""),
        nullable..SQLCHARUTF16.p("szPkTableName", ""),
        AutoSize("szPkTableName")..SQLSMALLINT("cchPkTableName", ""),
        nullable..SQLCHARUTF16.p("szFkCatalogName", ""),
        AutoSize("szFkCatalogName")..SQLSMALLINT("cchFkCatalogName", ""),
        nullable..SQLCHARUTF16.p("szFkSchemaName", ""),
        AutoSize("szFkSchemaName")..SQLSMALLINT("cchFkSchemaName", ""),
        nullable..SQLCHARUTF16.p("szFkTableName", ""),
        AutoSize("szFkTableName")..SQLSMALLINT("cchFkTableName", "")
    )

    SQLRETURN(
        "MoreResults",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlmoreresults-function">MSDN Reference</a>

        Determines whether more results are available on a statement containing SELECT, UPDATE, INSERT, or DELETE statements and, if so, initializes processing
        for those results.
        """,

        SQLHSTMT("StatementHandle", "")
    )

    NativeName("SQLNativeSqlW")..SQLRETURN(
        "NativeSql",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlnativesql-function">MSDN Reference</a>

        Returns the SQL string as modified by the driver. SQLNativeSql does not execute the SQL statement.
        """,

        SQLHDBC("ConnectionHandle", "the connection handle"),
        Input..SQLCHARUTF16.p("InStatementText", ""),
        AutoSize("InStatementText")..SQLINTEGER("TextLength1", ""),
        nullable..SQLCHARUTF16.p("OutStatementText", ""),
        AutoSize("OutStatementText")..SQLINTEGER("BufferLength", ""),
        Check(1)..SQLINTEGER.p("TextLength2Ptr", "")
    )

    SQLRETURN(
        "NumParams",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlnumparams-function">MSDN Reference</a>

        Returns the number of parameters in an SQL statement.
        """,

        SQLHSTMT("StatementHandle", ""),
        Check(1)..nullable..SQLSMALLINT.p("ParameterCountPtr", "")
    )

    SQLRETURN(
        "ParamOptions",
        "",

        SQLHSTMT("hstmt", ""),
        SQLULEN("crow", ""),
        Check(1)..SQLULEN.p("pirow", "")
    )

    NativeName("SQLPrimaryKeysW")..SQLRETURN(
        "PrimaryKeys",
        "",

        SQLHSTMT("hstmt", ""),
        nullable..SQLCHARUTF16.p("szCatalogName", ""),
        AutoSize("szCatalogName")..SQLSMALLINT("cchCatalogName", ""),
        nullable..SQLCHARUTF16.p("szSchemaName", ""),
        AutoSize("szSchemaName")..SQLSMALLINT("cchSchemaName", ""),
        nullable..SQLCHARUTF16.p("szTableName", ""),
        AutoSize("szTableName")..SQLSMALLINT("cchTableName", "")
    )

    NativeName("SQLProcedureColumnsW")..SQLRETURN(
        "ProcedureColumns",
        "",

        SQLHSTMT("hstmt", ""),
        nullable..SQLCHARUTF16.p("szCatalogName", ""),
        AutoSize("szCatalogName")..SQLSMALLINT("cchCatalogName", ""),
        nullable..SQLCHARUTF16.p("szSchemaName", ""),
        AutoSize("szSchemaName")..SQLSMALLINT("cchSchemaName", ""),
        nullable..SQLCHARUTF16.p("szProcName", ""),
        AutoSize("szProcName")..SQLSMALLINT("cchProcName", ""),
        nullable..SQLCHARUTF16.p("szColumnName", ""),
        AutoSize("szColumnName")..SQLSMALLINT("cchColumnName", "")
    )

    NativeName("SQLProceduresW")..SQLRETURN(
        "Procedures",
        "",

        SQLHSTMT("hstmt", ""),
        nullable..SQLCHARUTF16.p("szCatalogName", ""),
        AutoSize("szCatalogName")..SQLSMALLINT("cchCatalogName", ""),
        nullable..SQLCHARUTF16.p("szSchemaName", ""),
        AutoSize("szSchemaName")..SQLSMALLINT("cchSchemaName", ""),
        nullable..SQLCHARUTF16.p("szProcName", ""),
        AutoSize("szProcName")..SQLSMALLINT("cchProcName", "")
    )

    SQLRETURN(
        "SetPos",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlsetpos-function">MSDN Reference</a>

        Sets the cursor position in a rowset and allows an application to refresh data in the rowset or to update or delete data in the result set.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLSETPOSIROW("RowNumber", ""),
        SQLUSMALLINT("Operation", "", SetPosOperations),
        SQLUSMALLINT("LockType", "", SetPosLockOptions)
    )

    NativeName("SQLTablePrivilegesW")..SQLRETURN(
        "TablePrivileges",
        "",

        SQLHSTMT("hstmt", ""),
        nullable..SQLCHARUTF16.p("szCatalogName", ""),
        AutoSize("szCatalogName")..SQLSMALLINT("cchCatalogName", ""),
        nullable..SQLCHARUTF16.p("szSchemaName", ""),
        AutoSize("szSchemaName")..SQLSMALLINT("cchSchemaName", ""),
        nullable..SQLCHARUTF16.p("szTableName", ""),
        AutoSize("szTableName")..SQLSMALLINT("cchTableName", "")
    )

    IgnoreMissing..NativeName("SQLDriversW")..SQLRETURN(
        "Drivers",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqldrivers-function">MSDN Reference</a>

        Lists driver descriptions and driver attribute keywords. This function is implemented only by the Driver Manager.""",

        SQLHENV("EnvironmentHandle", ""),
        SQLUSMALLINT("Direction", ""),
        nullable..SQLCHARUTF16.p("DriverDescription", ""),
        AutoSize("DriverDescription")..SQLSMALLINT("BufferLength1", ""),
        Check(1)..nullable..SQLSMALLINT.p("DescriptionLengthPtr", ""),
        nullable..SQLCHARUTF16.p("DriverAttributes", ""),
        AutoSize("DriverAttributes")..SQLSMALLINT("BufferLength2", ""),
        Check(1)..nullable..SQLSMALLINT.p("AttributesLengthPtr", "")
    )

    SQLRETURN(
        "BindParameter",
        """
        <a href="https://docs.microsoft.com/en-us/sql/odbc/reference/syntax/sqlbindparameter-function">MSDN Reference</a>

        Binds a buffer to a parameter marker in an SQL statement. SQLBindParameter supports binding to a Unicode C data type, even if the underlying driver
        does not support Unicode data.
        """,

        SQLHSTMT("StatementHandle", ""),
        SQLUSMALLINT("ParameterNumber", ""),
        SQLSMALLINT("InputOutputType", ""),
        SQLSMALLINT("ValueType", ""),
        SQLSMALLINT("ParameterType", ""),
        SQLULEN("ColumnSize", ""),
        SQLSMALLINT("DecimalDigits", ""),
        nullable..SQLPOINTER("ParameterValuePtr", ""),
        AutoSize("ParameterValuePtr")..SQLLEN("BufferLength", ""),
        Check(1)..nullable..SQLLEN.p("StrLen_or_IndPtr", "")
    )

    IgnoreMissing..SQLRETURN(
        "AllocHandleStd",
        "",

        SQLSMALLINT("fHandleType", ""),
        SQLHANDLE("hInput", ""),
        Check(1)..SQLHANDLE.p("phOutput", "")
    )

    /*RETCODE(
        "TraceOpenLogFile",
        "",

        LPWSTR("szFileName", ""),
        LPWSTR("lpwszOutputMsg", ""),
        DWORD("cbOutputMsg", "")
    )

    RETCODE(
        "TraceCloseLogFile",
        ""
    )

    DWORD(
        "TraceVersion",
        ""
    )

    BOOL(
        "ODBCSetTryWaitValue",
        "",

        DWORD("dwValue", "")
    )

    DWORD(
        "ODBCGetTryWaitValue",
        ""
    )

    VOID(
        "FireVSDebugEvent",
        "",

        PODBC_VS_ARGS("args", "")
    )*/
}