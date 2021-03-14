/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package odbc.templates

import org.lwjgl.generator.*
import odbc.*

val sqlncli = "SQLNCLI".nativeClass(Module.ODBC, prefix = "SQL", prefixMethod = "SQL") {
    javaImport("static org.lwjgl.system.MemoryUtil.*")

    documentation =
        """
        Native bindings to the ${url(
            "https://docs.microsoft.com/en-us/sql/relational-databases/native-client/sql-server-native-client-programming",
            "SQL Server Native Client"
        )}.

        Microsoft SQL Server Native Client is a single native dynamic link library (DLL) that contains the ODBC driver and OLE DB provider, which together
        support applications using native-code APIs (ODBC, OLE DB and ADO) to access Microsoft SQL Server. SQL Server Native Client is a component of SQL
        Server. It is also available for download from the Feature Pack for Microsoft SQL Server 2005 and Microsoft SQL Server 2008 Feature Pack. In SQL Server
        Native Client, everything (APIs, TDS routines, and netlibs) is packaged into a single DLL.
        """

    ShortConstant(
        "Max SQL Server identifier length.",

        "MAX_SQLSERVERNAME".."128"
    )

    ShortConstant(
        "Connection attributes.",

        "COPT_SS_BASE".."1200",
        "COPT_SS_REMOTE_PWD".."SQL_COPT_SS_BASE+1",
        "COPT_SS_USE_PROC_FOR_PREP".."SQL_COPT_SS_BASE+2",
        "COPT_SS_INTEGRATED_SECURITY".."SQL_COPT_SS_BASE+3",
        "COPT_SS_PRESERVE_CURSORS".."SQL_COPT_SS_BASE+4",
        "COPT_SS_USER_DATA".."SQL_COPT_SS_BASE+5",
        "COPT_SS_ENLIST_IN_DTC".."SQL.SQL_ATTR_ENLIST_IN_DTC",
        "COPT_SS_ENLIST_IN_XA".."SQL.SQL_ATTR_ENLIST_IN_XA",
        "COPT_SS_FALLBACK_CONNECT".."SQL_COPT_SS_BASE+10",
        "COPT_SS_PERF_DATA".."SQL_COPT_SS_BASE+11",
        "COPT_SS_PERF_DATA_LOG".."SQL_COPT_SS_BASE+12",
        "COPT_SS_PERF_QUERY_INTERVAL".."SQL_COPT_SS_BASE+13",
        "COPT_SS_PERF_QUERY_LOG".."SQL_COPT_SS_BASE+14",
        "COPT_SS_PERF_QUERY".."SQL_COPT_SS_BASE+15",
        "COPT_SS_PERF_DATA_LOG_NOW".."SQL_COPT_SS_BASE+16",
        "COPT_SS_QUOTED_IDENT".."SQL_COPT_SS_BASE+17",
        "COPT_SS_ANSI_NPW".."SQL_COPT_SS_BASE+18",
        "COPT_SS_BCP".."SQL_COPT_SS_BASE+19",
        "COPT_SS_TRANSLATE".."SQL_COPT_SS_BASE+20",
        "COPT_SS_ATTACHDBFILENAME".."SQL_COPT_SS_BASE+21",
        "COPT_SS_CONCAT_NULL".."SQL_COPT_SS_BASE+22",
        "COPT_SS_ENCRYPT".."SQL_COPT_SS_BASE+23",
        "COPT_SS_MARS_ENABLED".."SQL_COPT_SS_BASE+24",
        "COPT_SS_FAILOVER_PARTNER".."SQL_COPT_SS_BASE+25",
        "COPT_SS_OLDPWD".."SQL_COPT_SS_BASE+26",
        "COPT_SS_TXN_ISOLATION".."SQL_COPT_SS_BASE+27",
        "COPT_SS_TRUST_SERVER_CERTIFICATE".."SQL_COPT_SS_BASE+28",
        "COPT_SS_SERVER_SPN".."SQL_COPT_SS_BASE+29",
        "COPT_SS_FAILOVER_PARTNER_SPN".."SQL_COPT_SS_BASE+30",
        "COPT_SS_INTEGRATED_AUTHENTICATION_METHOD".."SQL_COPT_SS_BASE+31",
        "COPT_SS_MUTUALLY_AUTHENTICATED".."SQL_COPT_SS_BASE+32",
        "COPT_SS_CLIENT_CONNECTION_ID".."SQL_COPT_SS_BASE+33",
        "COPT_SS_MAX_USED".."SQL_COPT_SS_CLIENT_CONNECTION_ID",

        "COPT_SS_BASE_EX".."1240",
        "COPT_SS_BROWSE_CONNECT".."SQL_COPT_SS_BASE_EX+1",
        "COPT_SS_BROWSE_SERVER".."SQL_COPT_SS_BASE_EX+2",
        "COPT_SS_WARN_ON_CP_ERROR".."SQL_COPT_SS_BASE_EX+3",
        "COPT_SS_CONNECTION_DEAD".."SQL_COPT_SS_BASE_EX+4",
        "COPT_SS_BROWSE_CACHE_DATA".."SQL_COPT_SS_BASE_EX+5",
        "COPT_SS_RESET_CONNECTION".."SQL_COPT_SS_BASE_EX+6",
        "COPT_SS_APPLICATION_INTENT".."SQL_COPT_SS_BASE_EX+7",
        "COPT_SS_MULTISUBNET_FAILOVER".."SQL_COPT_SS_BASE_EX+8",
        "COPT_SS_EX_MAX_USED".."SQL_COPT_SS_MULTISUBNET_FAILOVER"
    )

    ShortConstant(
        "Statement attributes.",

        "SOPT_SS_BASE".."1225",
        "SOPT_SS_TEXTPTR_LOGGING".."SQL_SOPT_SS_BASE+0",
        "SOPT_SS_CURRENT_COMMAND".."SQL_SOPT_SS_BASE+1",
        "SOPT_SS_HIDDEN_COLUMNS".."SQL_SOPT_SS_BASE+2",
        "SOPT_SS_NOBROWSETABLE".."SQL_SOPT_SS_BASE+3",
        "SOPT_SS_REGIONALIZE".."SQL_SOPT_SS_BASE+4",
        "SOPT_SS_CURSOR_OPTIONS".."SQL_SOPT_SS_BASE+5",
        "SOPT_SS_NOCOUNT_STATUS".."SQL_SOPT_SS_BASE+6",
        "SOPT_SS_DEFER_PREPARE".."SQL_SOPT_SS_BASE+7",
        "SOPT_SS_QUERYNOTIFICATION_TIMEOUT".."SQL_SOPT_SS_BASE+8",
        "SOPT_SS_QUERYNOTIFICATION_MSGTEXT".."SQL_SOPT_SS_BASE+9",
        "SOPT_SS_QUERYNOTIFICATION_OPTIONS".."SQL_SOPT_SS_BASE+10",
        "SOPT_SS_PARAM_FOCUS".."SQL_SOPT_SS_BASE+11",
        "SOPT_SS_NAME_SCOPE".."SQL_SOPT_SS_BASE+12",
        "SOPT_SS_MAX_USED".."SQL_SOPT_SS_NAME_SCOPE"
    )

    ShortConstant(
        "#ColAttribute() &amp; #SetDescField()/#GetDescField() driver specific defines.",

        "CA_SS_BASE".."1200",
        "CA_SS_COLUMN_SSTYPE".."SQL_CA_SS_BASE+0",
        "CA_SS_COLUMN_UTYPE".."SQL_CA_SS_BASE+1",
        "CA_SS_NUM_ORDERS".."SQL_CA_SS_BASE+2",
        "CA_SS_COLUMN_ORDER".."SQL_CA_SS_BASE+3",
        "CA_SS_COLUMN_VARYLEN".."SQL_CA_SS_BASE+4",
        "CA_SS_NUM_COMPUTES".."SQL_CA_SS_BASE+5",
        "CA_SS_COMPUTE_ID".."SQL_CA_SS_BASE+6",
        "CA_SS_COMPUTE_BYLIST".."SQL_CA_SS_BASE+7",
        "CA_SS_COLUMN_ID".."SQL_CA_SS_BASE+8",
        "CA_SS_COLUMN_OP".."SQL_CA_SS_BASE+9",
        "CA_SS_COLUMN_SIZE".."SQL_CA_SS_BASE+10",
        "CA_SS_COLUMN_HIDDEN".."SQL_CA_SS_BASE+11",
        "CA_SS_COLUMN_KEY".."SQL_CA_SS_BASE+12",
        "CA_SS_COLUMN_COLLATION".."SQL_CA_SS_BASE+14",
        "CA_SS_VARIANT_TYPE".."SQL_CA_SS_BASE+15",
        "CA_SS_VARIANT_SQL_TYPE".."SQL_CA_SS_BASE+16",
        "CA_SS_VARIANT_SERVER_TYPE".."SQL_CA_SS_BASE+17",
        "CA_SS_UDT_CATALOG_NAME".."SQL_CA_SS_BASE+18",
        "CA_SS_UDT_SCHEMA_NAME".."SQL_CA_SS_BASE+19",
        "CA_SS_UDT_TYPE_NAME".."SQL_CA_SS_BASE+20",
        "CA_SS_UDT_ASSEMBLY_TYPE_NAME".."SQL_CA_SS_BASE+21",
        "CA_SS_XML_SCHEMACOLLECTION_CATALOG_NAME".."SQL_CA_SS_BASE+22",
        "CA_SS_XML_SCHEMACOLLECTION_SCHEMA_NAME".."SQL_CA_SS_BASE+23",
        "CA_SS_XML_SCHEMACOLLECTION_NAME".."SQL_CA_SS_BASE+24",
        "CA_SS_CATALOG_NAME".."SQL_CA_SS_BASE+25",
        "CA_SS_SCHEMA_NAME".."SQL_CA_SS_BASE+26",
        "CA_SS_TYPE_NAME".."SQL_CA_SS_BASE+27",
        "CA_SS_COLUMN_COMPUTED".."SQL_CA_SS_BASE+29",
        "CA_SS_COLUMN_IN_UNIQUE_KEY".."SQL_CA_SS_BASE+30",
        "CA_SS_COLUMN_SORT_ORDER".."SQL_CA_SS_BASE+31",
        "CA_SS_COLUMN_SORT_ORDINAL".."SQL_CA_SS_BASE+32",
        "CA_SS_COLUMN_HAS_DEFAULT_VALUE".."SQL_CA_SS_BASE+33",
        "CA_SS_IS_COLUMN_SET".."SQL_CA_SS_BASE+34",
        "CA_SS_SERVER_TYPE".."SQL_CA_SS_BASE+35",
        "CA_SS_MAX_USED".."SQL_CA_SS_BASE+36"
    )

    ShortConstant(
        "Defines returned by #ATTR_CURSOR_TYPE.",

        "CURSOR_FAST_FORWARD_ONLY".."8"
    )

    ShortConstant(
        "Defines for use with #COPT_SS_USE_PROC_FOR_PREP.",

        "UP_OFF".."0",
        "UP_ON".."1",
        "UP_ON_DROP".."2",
        "UP_DEFAULT".."SQL_UP_ON"
    )

    ShortConstant(
        "Defines for use with #COPT_SS_INTEGRATED_SECURITY - Pre-Connect Option only.",

        "IS_OFF".."0",
        "IS_ON".."1",
        "IS_DEFAULT".."SQL_IS_OFF"
    )

    ShortConstant(
        "Defines for use with #COPT_SS_PRESERVE_CURSORS.",

        "PC_OFF".."0",
        "PC_ON".."1",
        "PC_DEFAULT".."SQL_PC_OFF"
    )

    LongConstant(
        "Defines for use with #COPT_SS_USER_DATA.",

        "UD_NOTSET".."NULL"
    )

    ShortConstant(
        "Defines for use with #COPT_SS_TRANSLATE.",

        "XL_OFF".."0",
        "XL_ON".."1",
        "XL_DEFAULT".."SQL_XL_ON"
    )

    ShortConstant(
        "Defines for use with #COPT_SS_FALLBACK_CONNECT - Pre-Connect Option only.",

        "FB_OFF".."0",
        "FB_ON".."1",
        "FB_DEFAULT".."SQL_FB_OFF"
    )

    ShortConstant(
        "Defines for use with #COPT_SS_BCP - Pre-Connect Option only.",

        "BCP_OFF".."0",
        "BCP_ON".."1",
        "BCP_DEFAULT".."SQL_BCP_OFF"
    )

    ShortConstant(
        "Defines for use with #COPT_SS_QUOTED_IDENT.",

        "QI_OFF".."0",
        "QI_ON".."1",
        "QI_DEFAULT".."SQL_QI_ON"
    )

    ShortConstant(
        "Defines for use with #COPT_SS_ANSI_NPW - Pre-Connect Option only.",

        "AD_OFF".."0",
        "AD_ON".."1",
        "AD_DEFAULT".."SQL_AD_ON"
    )

    ShortConstant(
        "Defines for use with #COPT_SS_CONCAT_NULL - Pre-Connect Option only.",

        "CN_OFF".."0",
        "CN_ON".."1",
        "CN_DEFAULT".."SQL_CN_ON"
    )

    ShortConstant(
        "Defines for use with #SOPT_SS_TEXTPTR_LOGGING.",

        "TL_OFF".."0",
        "TL_ON".."1",
        "TL_DEFAULT".."SQL_TL_ON"
    )

    ShortConstant(
        "Defines for use with #SOPT_SS_HIDDEN_COLUMNS.",

        "HC_OFF".."0",
        "HC_ON".."1",
        "HC_DEFAULT".."SQL_HC_OFF"
    )

    ShortConstant(
        "Defines for use with #SOPT_SS_NOBROWSETABLE.",

        "NB_OFF".."0",
        "NB_ON".."1",
        "NB_DEFAULT".."SQL_NB_OFF"
    )

    ShortConstant(
        "Defines for use with #SOPT_SS_REGIONALIZE.",

        "RE_OFF".."0",
        "RE_ON".."1",
        "RE_DEFAULT".."SQL_RE_OFF"
    )

    ShortConstant(
        "Defines for use with #SOPT_SS_CURSOR_OPTIONS.",

        "CO_OFF".."0",
        "CO_FFO".."1",
        "CO_AF".."2",
        "CO_FFO_AF".."SQL_CO_FFO|SQL_CO_AF",
        "CO_FIREHOSE_AF".."4",
        "CO_DEFAULT".."SQL_CO_OFF"
    )

    ShortConstant(
        "#SOPT_SS_NOCOUNT_STATUS.",

        "NC_OFF".."0",
        "NC_ON".."1"
    )

    ShortConstant(
        "#SOPT_SS_DEFER_PREPARE.",

        "DP_OFF".."0",
        "DP_ON".."1"
    )

    ShortConstant(
        "#SOPT_SS_NAME_SCOPE.",

        "SS_NAME_SCOPE_TABLE".."0",
        "SS_NAME_SCOPE_TABLE_TYPE".."1",
        "SS_NAME_SCOPE_EXTENDED".."2",
        "SS_NAME_SCOPE_SPARSE_COLUMN_SET".."3",
        "SS_NAME_SCOPE_DEFAULT".."SQL_SS_NAME_SCOPE_TABLE"
    )

    ShortConstant(
        "#COPT_SS_ENCRYPT.",

        "EN_OFF".."0",
        "EN_ON".."1"
    )

    ShortConstant(
        "#COPT_SS_TRUST_SERVER_CERTIFICATE.",

        "TRUST_SERVER_CERTIFICATE_NO".."0",
        "TRUST_SERVER_CERTIFICATE_YES".."1"
    )

    ShortConstant(
        "#COPT_SS_BROWSE_CONNECT.",

        "MORE_INFO_NO".."0",
        "MORE_INFO_YES".."1"
    )

    ShortConstant(
        "#COPT_SS_BROWSE_CACHE_DATA.",

        "CACHE_DATA_NO".."0",
        "CACHE_DATA_YES".."1"
    )

    ShortConstant(
        "#COPT_SS_RESET_CONNECTION.",

        "RESET_YES".."1"
    )

    ShortConstant(
        "#COPT_SS_WARN_ON_CP_ERROR.",

        "WARN_NO".."0",
        "WARN_YES".."1"
    )

    ShortConstant(
        "#COPT_SS_MARS_ENABLED.",

        "MARS_ENABLED_NO".."0",
        "MARS_ENABLED_YES".."1"
    )

    IntConstant(
        "#TXN_ISOLATION_OPTION bitmasks.",

        "TXN_SS_SNAPSHOT"..0x00000020
    )

    ShortConstant(
        "The following are defines for #CA_SS_COLUMN_SORT_ORDER.",

        "SS_ORDER_UNSPECIFIED".."0",
        "SS_DESCENDING_ORDER".."1",
        "SS_ASCENDING_ORDER".."2",
        "SS_ORDER_DEFAULT".."SQL_SS_ORDER_UNSPECIFIED"
    )

    ShortConstant(
        "Driver specific SQL data type defines.",

        "SS_VARIANT".."-150",
        "SS_UDT".."-151",
        "SS_XML".."-152",
        "SS_TABLE".."-153",
        "SS_TIME2".."-154",
        "SS_TIMESTAMPOFFSET".."-155"
    )

    ShortConstant(
        "Local types to be used with #CA_SS_SERVER_TYPE.",

        "SS_TYPE_DEFAULT".."0",
        "SS_TYPE_SMALLDATETIME".."1",
        "SS_TYPE_DATETIME".."2"
    )

    ShortConstant(
        "Extended C Types range 4000 and above.",

        "C_TYPES_EXTENDED"..0x04000.s,
        "C_SS_TIME2".."SQL_C_TYPES_EXTENDED+0",
        "C_SS_TIMESTAMPOFFSET".."SQL_C_TYPES_EXTENDED+1"
    )

    ShortConstant(
        "New types for SQL 6.0 and later servers.",

        "SQLTEXT"..0x23.s,
        "SQLVARBINARY"..0x25.s,
        "SQLINTN"..0x26.s,
        "SQLVARCHAR"..0x27.s,
        "SQLBINARY"..0x2d.s,
        "SQLIMAGE"..0x22.s,
        "SQLCHARACTER"..0x2f.s,
        "SQLINT1"..0x30.s,
        "SQLBIT"..0x32.s,
        "SQLINT2"..0x34.s,
        "SQLINT4"..0x38.s,
        "SQLMONEY"..0x3c.s,
        "SQLDATETIME"..0x3d.s,
        "SQLFLT8"..0x3e.s,
        "SQLFLTN"..0x6d.s,
        "SQLMONEYN"..0x6e.s,
        "SQLDATETIMN"..0x6f.s,
        "SQLFLT4"..0x3b.s,
        "SQLMONEY4"..0x7a.s,
        "SQLDATETIM4"..0x3a.s,
        "SQLDECIMAL"..0x6a.s,
        "SQLNUMERIC"..0x6c.s,
        "SQLUNIQUEID"..0x24.s,
        "SQLBIGCHAR"..0xaf.s,
        "SQLBIGVARCHAR"..0xa7.s,
        "SQLBIGBINARY"..0xad.s,
        "SQLBIGVARBINARY"..0xa5.s,
        "SQLBITN"..0x68.s,
        "SQLNCHAR"..0xef.s,
        "SQLNVARCHAR"..0xe7.s,
        "SQLNTEXT"..0x63.s,
        "SQLINT8"..0x7f.s,
        "SQLVARIANT"..0x62.s,
        "SQLUDT"..0xf0.s,
        "SQLXML"..0xf1.s,
        "SQLTABLE"..0xf3.s,
        "SQLDATEN"..0x28.s,
        "SQLTIMEN"..0x29.s,
        "SQLDATETIME2N"..0x2a.s,
        "SQLDATETIMEOFFSETN"..0x2b.s,
        "SQLDECIMALN"..0x6a.s,
        "SQLNUMERICN"..0x6c.s
    ).noPrefix()

    ShortConstant(
        "#SS_LENGTH_UNLIMITED is used to describe the max length of VARCHAR(max), VARBINARY(max), NVARCHAR(max), and XML columns.",

        "SS_LENGTH_UNLIMITED".."0"
    )

    ShortConstant(
        "User Data Type definitions. Returned by #ColAttribute()/#CA_SS_COLUMN_UTYPE.",

        "SQLudtBINARY".."3",
        "SQLudtBIT".."16",
        "SQLudtBITN".."0",
        "SQLudtCHAR".."1",
        "SQLudtDATETIM4".."22",
        "SQLudtDATETIME".."12",
        "SQLudtDATETIMN".."15",
        "SQLudtDECML".."24",
        "SQLudtDECMLN".."26",
        "SQLudtFLT4".."23",
        "SQLudtFLT8".."8",
        "SQLudtFLTN".."14",
        "SQLudtIMAGE".."20",
        "SQLudtINT1".."5",
        "SQLudtINT2".."6",
        "SQLudtINT4".."7",
        "SQLudtINTN".."13",
        "SQLudtMONEY".."11",
        "SQLudtMONEY4".."21",
        "SQLudtMONEYN".."17",
        "SQLudtNUM".."10",
        "SQLudtNUMN".."25",
        "SQLudtSYSNAME".."18",
        "SQLudtTEXT".."19",
        "SQLudtTIMESTAMP".."80",
        "SQLudtUNIQUEIDENTIFIER".."0",
        "SQLudtVARBINARY".."4",
        "SQLudtVARCHAR".."2",
        "MIN_USER_DATATYPE".."256"
    ).noPrefix()

    IntConstant(
        "Aggregate operator types. Returned by #ColAttribute()/#CA_SS_COLUMN_OP.",

        "SQLAOPSTDEV"..0x30,
        "SQLAOPSTDEVP"..0x31,
        "SQLAOPVAR"..0x32,
        "SQLAOPVARP"..0x33,
        "SQLAOPCNT"..0x4b,
        "SQLAOPSUM"..0x4d,
        "SQLAOPAVG"..0x4f,
        "SQLAOPMIN"..0x51,
        "SQLAOPMAX"..0x52,
        "SQLAOPANY"..0x53,
        "SQLAOPNOOP"..0x56
    ).noPrefix()

    ShortConstant(
        "#GetInfo() driver specific define.",

        "INFO_SS_FIRST".."1199",
        "INFO_SS_NETLIB_NAMEW".."SQL_INFO_SS_FIRST+0",
        "INFO_SS_NETLIB_NAMEA".."SQL_INFO_SS_FIRST+1",
        "INFO_SS_MAX_USED".."SQL_INFO_SS_NETLIB_NAMEA",
        "INFO_SS_NETLIB_NAME".."SQL_INFO_SS_NETLIB_NAMEW"
    )

    ShortConstant(
        "#GetDiagField() driver specific defines.",

        "DIAG_SS_BASE".."-1150",
        "DIAG_SS_MSGSTATE".."SQL_DIAG_SS_BASE",
        "DIAG_SS_SEVERITY".."SQL_DIAG_SS_BASE-1",
        "DIAG_SS_SRVNAME".."SQL_DIAG_SS_BASE-2",
        "DIAG_SS_PROCNAME".."SQL_DIAG_SS_BASE-3",
        "DIAG_SS_LINE".."SQL_DIAG_SS_BASE-4"
    )

    ShortConstant(
        "#GetDiagField()/#DIAG_DYNAMIC_FUNCTION_CODE driver specific defines.",

        "DIAG_DFC_SS_BASE".."-200",
        "DIAG_DFC_SS_ALTER_DATABASE".."SQL_DIAG_DFC_SS_BASE-0",
        "DIAG_DFC_SS_CHECKPOINT".."SQL_DIAG_DFC_SS_BASE-1",
        "DIAG_DFC_SS_CONDITION".."SQL_DIAG_DFC_SS_BASE-2",
        "DIAG_DFC_SS_CREATE_DATABASE".."SQL_DIAG_DFC_SS_BASE-3",
        "DIAG_DFC_SS_CREATE_DEFAULT".."SQL_DIAG_DFC_SS_BASE-4",
        "DIAG_DFC_SS_CREATE_PROCEDURE".."SQL_DIAG_DFC_SS_BASE-5",
        "DIAG_DFC_SS_CREATE_RULE".."SQL_DIAG_DFC_SS_BASE-6",
        "DIAG_DFC_SS_CREATE_TRIGGER".."SQL_DIAG_DFC_SS_BASE-7",
        "DIAG_DFC_SS_CURSOR_DECLARE".."SQL_DIAG_DFC_SS_BASE-8",
        "DIAG_DFC_SS_CURSOR_OPEN".."SQL_DIAG_DFC_SS_BASE-9",
        "DIAG_DFC_SS_CURSOR_FETCH".."SQL_DIAG_DFC_SS_BASE-10",
        "DIAG_DFC_SS_CURSOR_CLOSE".."SQL_DIAG_DFC_SS_BASE-11",
        "DIAG_DFC_SS_DEALLOCATE_CURSOR".."SQL_DIAG_DFC_SS_BASE-12",
        "DIAG_DFC_SS_DBCC".."SQL_DIAG_DFC_SS_BASE-13",
        "DIAG_DFC_SS_DISK".."SQL_DIAG_DFC_SS_BASE-14",
        "DIAG_DFC_SS_DROP_DATABASE".."SQL_DIAG_DFC_SS_BASE-15",
        "DIAG_DFC_SS_DROP_DEFAULT".."SQL_DIAG_DFC_SS_BASE-16",
        "DIAG_DFC_SS_DROP_PROCEDURE".."SQL_DIAG_DFC_SS_BASE-17",
        "DIAG_DFC_SS_DROP_RULE".."SQL_DIAG_DFC_SS_BASE-18",
        "DIAG_DFC_SS_DROP_TRIGGER".."SQL_DIAG_DFC_SS_BASE-19",
        "DIAG_DFC_SS_DUMP_DATABASE".."SQL_DIAG_DFC_SS_BASE-20",
        "DIAG_DFC_SS_BACKUP_DATABASE".."SQL_DIAG_DFC_SS_BASE-20",
        "DIAG_DFC_SS_DUMP_TABLE".."SQL_DIAG_DFC_SS_BASE-21",
        "DIAG_DFC_SS_DUMP_TRANSACTION".."SQL_DIAG_DFC_SS_BASE-22",
        "DIAG_DFC_SS_BACKUP_TRANSACTION".."SQL_DIAG_DFC_SS_BASE-22",
        "DIAG_DFC_SS_GOTO".."SQL_DIAG_DFC_SS_BASE-23",
        "DIAG_DFC_SS_INSERT_BULK".."SQL_DIAG_DFC_SS_BASE-24",
        "DIAG_DFC_SS_KILL".."SQL_DIAG_DFC_SS_BASE-25",
        "DIAG_DFC_SS_LOAD_DATABASE".."SQL_DIAG_DFC_SS_BASE-26",
        "DIAG_DFC_SS_RESTORE_DATABASE".."SQL_DIAG_DFC_SS_BASE-26",
        "DIAG_DFC_SS_LOAD_HEADERONLY".."SQL_DIAG_DFC_SS_BASE-27",
        "DIAG_DFC_SS_RESTORE_HEADERONLY".."SQL_DIAG_DFC_SS_BASE-27",
        "DIAG_DFC_SS_LOAD_TABLE".."SQL_DIAG_DFC_SS_BASE-28",
        "DIAG_DFC_SS_LOAD_TRANSACTION".."SQL_DIAG_DFC_SS_BASE-29",
        "DIAG_DFC_SS_RESTORE_TRANSACTION".."SQL_DIAG_DFC_SS_BASE-29",
        "DIAG_DFC_SS_PRINT".."SQL_DIAG_DFC_SS_BASE-30",
        "DIAG_DFC_SS_RAISERROR".."SQL_DIAG_DFC_SS_BASE-31",
        "DIAG_DFC_SS_READTEXT".."SQL_DIAG_DFC_SS_BASE-32",
        "DIAG_DFC_SS_RECONFIGURE".."SQL_DIAG_DFC_SS_BASE-33",
        "DIAG_DFC_SS_RETURN".."SQL_DIAG_DFC_SS_BASE-34",
        "DIAG_DFC_SS_SELECT_INTO".."SQL_DIAG_DFC_SS_BASE-35",
        "DIAG_DFC_SS_SET".."SQL_DIAG_DFC_SS_BASE-36",
        "DIAG_DFC_SS_SET_IDENTITY_INSERT".."SQL_DIAG_DFC_SS_BASE-37",
        "DIAG_DFC_SS_SET_ROW_COUNT".."SQL_DIAG_DFC_SS_BASE-38",
        "DIAG_DFC_SS_SET_STATISTICS".."SQL_DIAG_DFC_SS_BASE-39",
        "DIAG_DFC_SS_SET_TEXTSIZE".."SQL_DIAG_DFC_SS_BASE-40",
        "DIAG_DFC_SS_SETUSER".."SQL_DIAG_DFC_SS_BASE-41",
        "DIAG_DFC_SS_SHUTDOWN".."SQL_DIAG_DFC_SS_BASE-42",
        "DIAG_DFC_SS_TRANS_BEGIN".."SQL_DIAG_DFC_SS_BASE-43",
        "DIAG_DFC_SS_TRANS_COMMIT".."SQL_DIAG_DFC_SS_BASE-44",
        "DIAG_DFC_SS_TRANS_PREPARE".."SQL_DIAG_DFC_SS_BASE-45",
        "DIAG_DFC_SS_TRANS_ROLLBACK".."SQL_DIAG_DFC_SS_BASE-46",
        "DIAG_DFC_SS_TRANS_SAVE".."SQL_DIAG_DFC_SS_BASE-47",
        "DIAG_DFC_SS_TRUNCATE_TABLE".."SQL_DIAG_DFC_SS_BASE-48",
        "DIAG_DFC_SS_UPDATE_STATISTICS".."SQL_DIAG_DFC_SS_BASE-49",
        "DIAG_DFC_SS_UPDATETEXT".."SQL_DIAG_DFC_SS_BASE-50",
        "DIAG_DFC_SS_USE".."SQL_DIAG_DFC_SS_BASE-51",
        "DIAG_DFC_SS_WAITFOR".."SQL_DIAG_DFC_SS_BASE-52",
        "DIAG_DFC_SS_WRITETEXT".."SQL_DIAG_DFC_SS_BASE-53",
        "DIAG_DFC_SS_DENY".."SQL_DIAG_DFC_SS_BASE-54",
        "DIAG_DFC_SS_SET_XCTLVL".."SQL_DIAG_DFC_SS_BASE-55",
        "DIAG_DFC_SS_MERGE".."SQL_DIAG_DFC_SS_BASE-56"
    )

    ShortConstant(
        "Severity codes for #DIAG_SS_SEVERITY.",

        "EX_ANY".."0",
        "EX_INFO".."10",
        "EX_MAXISEVERITY".."EX_INFO",
        "EX_MISSING".."11",
        "EX_TYPE".."12",
        "EX_DEADLOCK".."13",
        "EX_PERMIT".."14",
        "EX_SYNTAX".."15",
        "EX_USER".."16",
        "EX_RESOURCE".."17",
        "EX_INTOK".."18",
        "MAXUSEVERITY".."EX_INTOK",
        "EX_LIMIT".."19",
        "EX_CMDFATAL".."20",
        "MINFATALERR".."EX_CMDFATAL",
        "EX_DBFATAL".."21",
        "EX_TABCORRUPT".."22",
        "EX_DBCORRUPT".."23",
        "EX_HARDWARE".."24",
        "EX_CONTROL".."25"
    ).noPrefix()

    ShortConstant(
        "Options for #COPT_SS_PERF_DATA and #COPT_SS_PERF_QUERY.",

        "PERF_START".."1",
        "PERF_STOP".."2"
    )

    StringConstant(
        "Defines for #COPT_SS_PERF_DATA_LOG.",

        "SS_DL_DEFAULT".."STATS.LOG"
    )

    StringConstant(
        "Defines for #COPT_SS_PERF_QUERY_LOG.",

        "SS_QL_DEFAULT".."QUERY.LOG"
    )

    ShortConstant(
        "Defines for #COPT_SS_PERF_QUERY_INTERVAL.",

        "SS_QI_DEFAULT".."30000"
    )

    // BCP

    ShortConstant(
        "BCP Return codes.",

        "SUCCEED".."1",
        "FAIL".."0",
        "SUCCEED_ABORT".."2",
        "SUCCEED_ASYNC".."3"
    )

    ShortConstant(
        "BCP Transfer directions.",

        "DB_IN".."1",
        "DB_OUT".."2"
    )

    ShortConstant(
        "bcp_control option.",

        "BCPMAXERRS".."1",
        "BCPFIRST".."2",
        "BCPLAST".."3",
        "BCPBATCH".."4",
        "BCPKEEPNULLS".."5",
        "BCPABORT".."6",
        "BCPODBC".."7",
        "BCPKEEPIDENTITY".."8",
        "BCPHINTSA".."10",
        "BCPHINTSW".."11",
        "BCPFILECP".."12",
        "BCPUNICODEFILE".."13",
        "BCPTEXTFILE".."14",
        "BCPFILEFMT".."15",
        "BCPFMTXML".."16",
        "BCPFIRSTEX".."17",
        "BCPLASTEX".."18",
        "BCPROWCOUNT".."19",
        "BCPDELAYREADFMT".."20"
    )

    ShortConstant(
        "BCPFILECP values.",

        "BCPFILECP_ACP".."0",
        "BCPFILECP_OEMCP".."1",
        "BCPFILECP_RAW".."-1"
    )

    ShortConstant(
        "bcp_collen definition.",

        "VARLEN_DATA".."-10"
    )

    IntConstant(
        "BCP column format properties.",

        "BCP_FMT_TYPE"..0x01,
        "BCP_FMT_INDICATOR_LEN"..0x02,
        "BCP_FMT_DATA_LEN"..0x03,
        "BCP_FMT_TERMINATOR"..0x04,
        "BCP_FMT_SERVER_COL"..0x05,
        "BCP_FMT_COLLATION"..0x06,
        "BCP_FMT_COLLATION_ID"..0x07
    )

    IntConstant(
        "bcp_setbulkmode properties.",

        "BCP_OUT_CHARACTER_MODE"..0x01,
        "BCP_OUT_WIDE_CHARACTER_MODE"..0x02,
        "BCP_OUT_NATIVE_TEXT_MODE"..0x03,
        "BCP_OUT_NATIVE_MODE"..0x04
    )

    // TODO: bcp functions

    /*DBINT(
        "bcp_batch",
        "Commits all rows previously bulk copied from program variables and sent to SQL Server by ##bcp_sendrow().",

        HDBC("hdbc", "the bulk copy-enabled ODBC connection handle"),

        returnDoc = "the number of rows saved after the last call to bcp_batch, or -1 in case of error"
    )*/

    IntConstant(
        "The following facilitates opening a handle to a SQL filestream.",

        "FILESTREAM_READ".."0",
        "FILESTREAM_WRITE".."1",
        "FILESTREAM_READWRITE".."2",
        "FILESTREAM_OPEN_FLAG_ASYNC"..0x00000001,
        "FILESTREAM_OPEN_FLAG_NO_BUFFERING"..0x00000002,
        "FILESTREAM_OPEN_FLAG_NO_WRITE_THROUGH"..0x00000004,
        "FILESTREAM_OPEN_FLAG_SEQUENTIAL_SCAN"..0x00000008,
        "FILESTREAM_OPEN_FLAG_RANDOM_ACCESS"..0x00000010
    )

    // TODO: OpenSqlFilestream

}