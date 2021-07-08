/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.odbc;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <a target="_blank" href="https://docs.microsoft.com/en-us/sql/relational-databases/native-client/sql-server-native-client-programming">SQL Server Native Client</a>.
 * 
 * <p>Microsoft SQL Server Native Client is a single native dynamic link library (DLL) that contains the ODBC driver and OLE DB provider, which together
 * support applications using native-code APIs (ODBC, OLE DB and ADO) to access Microsoft SQL Server. SQL Server Native Client is a component of SQL
 * Server. It is also available for download from the Feature Pack for Microsoft SQL Server 2005 and Microsoft SQL Server 2008 Feature Pack. In SQL Server
 * Native Client, everything (APIs, TDS routines, and netlibs) is packaged into a single DLL.</p>
 */
public final class SQLNCLI {

    /** Max SQL Server identifier length. */
    public static final short SQL_MAX_SQLSERVERNAME = 128;

    /** Connection attributes. */
    public static final short
        SQL_COPT_SS_BASE                             = 1200,
        SQL_COPT_SS_REMOTE_PWD                       = SQL_COPT_SS_BASE+1,
        SQL_COPT_SS_USE_PROC_FOR_PREP                = SQL_COPT_SS_BASE+2,
        SQL_COPT_SS_INTEGRATED_SECURITY              = SQL_COPT_SS_BASE+3,
        SQL_COPT_SS_PRESERVE_CURSORS                 = SQL_COPT_SS_BASE+4,
        SQL_COPT_SS_USER_DATA                        = SQL_COPT_SS_BASE+5,
        SQL_COPT_SS_ENLIST_IN_DTC                    = SQL.SQL_ATTR_ENLIST_IN_DTC,
        SQL_COPT_SS_ENLIST_IN_XA                     = SQL.SQL_ATTR_ENLIST_IN_XA,
        SQL_COPT_SS_FALLBACK_CONNECT                 = SQL_COPT_SS_BASE+10,
        SQL_COPT_SS_PERF_DATA                        = SQL_COPT_SS_BASE+11,
        SQL_COPT_SS_PERF_DATA_LOG                    = SQL_COPT_SS_BASE+12,
        SQL_COPT_SS_PERF_QUERY_INTERVAL              = SQL_COPT_SS_BASE+13,
        SQL_COPT_SS_PERF_QUERY_LOG                   = SQL_COPT_SS_BASE+14,
        SQL_COPT_SS_PERF_QUERY                       = SQL_COPT_SS_BASE+15,
        SQL_COPT_SS_PERF_DATA_LOG_NOW                = SQL_COPT_SS_BASE+16,
        SQL_COPT_SS_QUOTED_IDENT                     = SQL_COPT_SS_BASE+17,
        SQL_COPT_SS_ANSI_NPW                         = SQL_COPT_SS_BASE+18,
        SQL_COPT_SS_BCP                              = SQL_COPT_SS_BASE+19,
        SQL_COPT_SS_TRANSLATE                        = SQL_COPT_SS_BASE+20,
        SQL_COPT_SS_ATTACHDBFILENAME                 = SQL_COPT_SS_BASE+21,
        SQL_COPT_SS_CONCAT_NULL                      = SQL_COPT_SS_BASE+22,
        SQL_COPT_SS_ENCRYPT                          = SQL_COPT_SS_BASE+23,
        SQL_COPT_SS_MARS_ENABLED                     = SQL_COPT_SS_BASE+24,
        SQL_COPT_SS_FAILOVER_PARTNER                 = SQL_COPT_SS_BASE+25,
        SQL_COPT_SS_OLDPWD                           = SQL_COPT_SS_BASE+26,
        SQL_COPT_SS_TXN_ISOLATION                    = SQL_COPT_SS_BASE+27,
        SQL_COPT_SS_TRUST_SERVER_CERTIFICATE         = SQL_COPT_SS_BASE+28,
        SQL_COPT_SS_SERVER_SPN                       = SQL_COPT_SS_BASE+29,
        SQL_COPT_SS_FAILOVER_PARTNER_SPN             = SQL_COPT_SS_BASE+30,
        SQL_COPT_SS_INTEGRATED_AUTHENTICATION_METHOD = SQL_COPT_SS_BASE+31,
        SQL_COPT_SS_MUTUALLY_AUTHENTICATED           = SQL_COPT_SS_BASE+32,
        SQL_COPT_SS_CLIENT_CONNECTION_ID             = SQL_COPT_SS_BASE+33,
        SQL_COPT_SS_MAX_USED                         = SQL_COPT_SS_CLIENT_CONNECTION_ID,
        SQL_COPT_SS_BASE_EX                          = 1240,
        SQL_COPT_SS_BROWSE_CONNECT                   = SQL_COPT_SS_BASE_EX+1,
        SQL_COPT_SS_BROWSE_SERVER                    = SQL_COPT_SS_BASE_EX+2,
        SQL_COPT_SS_WARN_ON_CP_ERROR                 = SQL_COPT_SS_BASE_EX+3,
        SQL_COPT_SS_CONNECTION_DEAD                  = SQL_COPT_SS_BASE_EX+4,
        SQL_COPT_SS_BROWSE_CACHE_DATA                = SQL_COPT_SS_BASE_EX+5,
        SQL_COPT_SS_RESET_CONNECTION                 = SQL_COPT_SS_BASE_EX+6,
        SQL_COPT_SS_APPLICATION_INTENT               = SQL_COPT_SS_BASE_EX+7,
        SQL_COPT_SS_MULTISUBNET_FAILOVER             = SQL_COPT_SS_BASE_EX+8,
        SQL_COPT_SS_EX_MAX_USED                      = SQL_COPT_SS_MULTISUBNET_FAILOVER;

    /** Statement attributes. */
    public static final short
        SQL_SOPT_SS_BASE                      = 1225,
        SQL_SOPT_SS_TEXTPTR_LOGGING           = SQL_SOPT_SS_BASE+0,
        SQL_SOPT_SS_CURRENT_COMMAND           = SQL_SOPT_SS_BASE+1,
        SQL_SOPT_SS_HIDDEN_COLUMNS            = SQL_SOPT_SS_BASE+2,
        SQL_SOPT_SS_NOBROWSETABLE             = SQL_SOPT_SS_BASE+3,
        SQL_SOPT_SS_REGIONALIZE               = SQL_SOPT_SS_BASE+4,
        SQL_SOPT_SS_CURSOR_OPTIONS            = SQL_SOPT_SS_BASE+5,
        SQL_SOPT_SS_NOCOUNT_STATUS            = SQL_SOPT_SS_BASE+6,
        SQL_SOPT_SS_DEFER_PREPARE             = SQL_SOPT_SS_BASE+7,
        SQL_SOPT_SS_QUERYNOTIFICATION_TIMEOUT = SQL_SOPT_SS_BASE+8,
        SQL_SOPT_SS_QUERYNOTIFICATION_MSGTEXT = SQL_SOPT_SS_BASE+9,
        SQL_SOPT_SS_QUERYNOTIFICATION_OPTIONS = SQL_SOPT_SS_BASE+10,
        SQL_SOPT_SS_PARAM_FOCUS               = SQL_SOPT_SS_BASE+11,
        SQL_SOPT_SS_NAME_SCOPE                = SQL_SOPT_SS_BASE+12,
        SQL_SOPT_SS_MAX_USED                  = SQL_SOPT_SS_NAME_SCOPE;

    /** {@link SQL#SQLColAttribute ColAttribute} &amp; {@link SQL#SQLSetDescField SetDescField}/{@link SQL#SQLGetDescField GetDescField} driver specific defines. */
    public static final short
        SQL_CA_SS_BASE                              = 1200,
        SQL_CA_SS_COLUMN_SSTYPE                     = SQL_CA_SS_BASE+0,
        SQL_CA_SS_COLUMN_UTYPE                      = SQL_CA_SS_BASE+1,
        SQL_CA_SS_NUM_ORDERS                        = SQL_CA_SS_BASE+2,
        SQL_CA_SS_COLUMN_ORDER                      = SQL_CA_SS_BASE+3,
        SQL_CA_SS_COLUMN_VARYLEN                    = SQL_CA_SS_BASE+4,
        SQL_CA_SS_NUM_COMPUTES                      = SQL_CA_SS_BASE+5,
        SQL_CA_SS_COMPUTE_ID                        = SQL_CA_SS_BASE+6,
        SQL_CA_SS_COMPUTE_BYLIST                    = SQL_CA_SS_BASE+7,
        SQL_CA_SS_COLUMN_ID                         = SQL_CA_SS_BASE+8,
        SQL_CA_SS_COLUMN_OP                         = SQL_CA_SS_BASE+9,
        SQL_CA_SS_COLUMN_SIZE                       = SQL_CA_SS_BASE+10,
        SQL_CA_SS_COLUMN_HIDDEN                     = SQL_CA_SS_BASE+11,
        SQL_CA_SS_COLUMN_KEY                        = SQL_CA_SS_BASE+12,
        SQL_CA_SS_COLUMN_COLLATION                  = SQL_CA_SS_BASE+14,
        SQL_CA_SS_VARIANT_TYPE                      = SQL_CA_SS_BASE+15,
        SQL_CA_SS_VARIANT_SQL_TYPE                  = SQL_CA_SS_BASE+16,
        SQL_CA_SS_VARIANT_SERVER_TYPE               = SQL_CA_SS_BASE+17,
        SQL_CA_SS_UDT_CATALOG_NAME                  = SQL_CA_SS_BASE+18,
        SQL_CA_SS_UDT_SCHEMA_NAME                   = SQL_CA_SS_BASE+19,
        SQL_CA_SS_UDT_TYPE_NAME                     = SQL_CA_SS_BASE+20,
        SQL_CA_SS_UDT_ASSEMBLY_TYPE_NAME            = SQL_CA_SS_BASE+21,
        SQL_CA_SS_XML_SCHEMACOLLECTION_CATALOG_NAME = SQL_CA_SS_BASE+22,
        SQL_CA_SS_XML_SCHEMACOLLECTION_SCHEMA_NAME  = SQL_CA_SS_BASE+23,
        SQL_CA_SS_XML_SCHEMACOLLECTION_NAME         = SQL_CA_SS_BASE+24,
        SQL_CA_SS_CATALOG_NAME                      = SQL_CA_SS_BASE+25,
        SQL_CA_SS_SCHEMA_NAME                       = SQL_CA_SS_BASE+26,
        SQL_CA_SS_TYPE_NAME                         = SQL_CA_SS_BASE+27,
        SQL_CA_SS_COLUMN_COMPUTED                   = SQL_CA_SS_BASE+29,
        SQL_CA_SS_COLUMN_IN_UNIQUE_KEY              = SQL_CA_SS_BASE+30,
        SQL_CA_SS_COLUMN_SORT_ORDER                 = SQL_CA_SS_BASE+31,
        SQL_CA_SS_COLUMN_SORT_ORDINAL               = SQL_CA_SS_BASE+32,
        SQL_CA_SS_COLUMN_HAS_DEFAULT_VALUE          = SQL_CA_SS_BASE+33,
        SQL_CA_SS_IS_COLUMN_SET                     = SQL_CA_SS_BASE+34,
        SQL_CA_SS_SERVER_TYPE                       = SQL_CA_SS_BASE+35,
        SQL_CA_SS_MAX_USED                          = SQL_CA_SS_BASE+36;

    /** Defines returned by {@link SQL#SQL_ATTR_CURSOR_TYPE ATTR_CURSOR_TYPE}. */
    public static final short SQL_CURSOR_FAST_FORWARD_ONLY = 8;

    /** Defines for use with {@link #SQL_COPT_SS_USE_PROC_FOR_PREP COPT_SS_USE_PROC_FOR_PREP}. */
    public static final short
        SQL_UP_OFF     = 0,
        SQL_UP_ON      = 1,
        SQL_UP_ON_DROP = 2,
        SQL_UP_DEFAULT = SQL_UP_ON;

    /** Defines for use with {@link #SQL_COPT_SS_INTEGRATED_SECURITY COPT_SS_INTEGRATED_SECURITY} - Pre-Connect Option only. */
    public static final short
        SQL_IS_OFF     = 0,
        SQL_IS_ON      = 1,
        SQL_IS_DEFAULT = SQL_IS_OFF;

    /** Defines for use with {@link #SQL_COPT_SS_PRESERVE_CURSORS COPT_SS_PRESERVE_CURSORS}. */
    public static final short
        SQL_PC_OFF     = 0,
        SQL_PC_ON      = 1,
        SQL_PC_DEFAULT = SQL_PC_OFF;

    /** Defines for use with {@link #SQL_COPT_SS_USER_DATA COPT_SS_USER_DATA}. */
    public static final long SQL_UD_NOTSET = NULL;

    /** Defines for use with {@link #SQL_COPT_SS_TRANSLATE COPT_SS_TRANSLATE}. */
    public static final short
        SQL_XL_OFF     = 0,
        SQL_XL_ON      = 1,
        SQL_XL_DEFAULT = SQL_XL_ON;

    /** Defines for use with {@link #SQL_COPT_SS_FALLBACK_CONNECT COPT_SS_FALLBACK_CONNECT} - Pre-Connect Option only. */
    public static final short
        SQL_FB_OFF     = 0,
        SQL_FB_ON      = 1,
        SQL_FB_DEFAULT = SQL_FB_OFF;

    /** Defines for use with {@link #SQL_COPT_SS_BCP COPT_SS_BCP} - Pre-Connect Option only. */
    public static final short
        SQL_BCP_OFF     = 0,
        SQL_BCP_ON      = 1,
        SQL_BCP_DEFAULT = SQL_BCP_OFF;

    /** Defines for use with {@link #SQL_COPT_SS_QUOTED_IDENT COPT_SS_QUOTED_IDENT}. */
    public static final short
        SQL_QI_OFF     = 0,
        SQL_QI_ON      = 1,
        SQL_QI_DEFAULT = SQL_QI_ON;

    /** Defines for use with {@link #SQL_COPT_SS_ANSI_NPW COPT_SS_ANSI_NPW} - Pre-Connect Option only. */
    public static final short
        SQL_AD_OFF     = 0,
        SQL_AD_ON      = 1,
        SQL_AD_DEFAULT = SQL_AD_ON;

    /** Defines for use with {@link #SQL_COPT_SS_CONCAT_NULL COPT_SS_CONCAT_NULL} - Pre-Connect Option only. */
    public static final short
        SQL_CN_OFF     = 0,
        SQL_CN_ON      = 1,
        SQL_CN_DEFAULT = SQL_CN_ON;

    /** Defines for use with {@link #SQL_SOPT_SS_TEXTPTR_LOGGING SOPT_SS_TEXTPTR_LOGGING}. */
    public static final short
        SQL_TL_OFF     = 0,
        SQL_TL_ON      = 1,
        SQL_TL_DEFAULT = SQL_TL_ON;

    /** Defines for use with {@link #SQL_SOPT_SS_HIDDEN_COLUMNS SOPT_SS_HIDDEN_COLUMNS}. */
    public static final short
        SQL_HC_OFF     = 0,
        SQL_HC_ON      = 1,
        SQL_HC_DEFAULT = SQL_HC_OFF;

    /** Defines for use with {@link #SQL_SOPT_SS_NOBROWSETABLE SOPT_SS_NOBROWSETABLE}. */
    public static final short
        SQL_NB_OFF     = 0,
        SQL_NB_ON      = 1,
        SQL_NB_DEFAULT = SQL_NB_OFF;

    /** Defines for use with {@link #SQL_SOPT_SS_REGIONALIZE SOPT_SS_REGIONALIZE}. */
    public static final short
        SQL_RE_OFF     = 0,
        SQL_RE_ON      = 1,
        SQL_RE_DEFAULT = SQL_RE_OFF;

    /** Defines for use with {@link #SQL_SOPT_SS_CURSOR_OPTIONS SOPT_SS_CURSOR_OPTIONS}. */
    public static final short
        SQL_CO_OFF         = 0,
        SQL_CO_FFO         = 1,
        SQL_CO_AF          = 2,
        SQL_CO_FFO_AF      = SQL_CO_FFO|SQL_CO_AF,
        SQL_CO_FIREHOSE_AF = 4,
        SQL_CO_DEFAULT     = SQL_CO_OFF;

    /** {@link #SQL_SOPT_SS_NOCOUNT_STATUS SOPT_SS_NOCOUNT_STATUS}. */
    public static final short
        SQL_NC_OFF = 0,
        SQL_NC_ON  = 1;

    /** {@link #SQL_SOPT_SS_DEFER_PREPARE SOPT_SS_DEFER_PREPARE}. */
    public static final short
        SQL_DP_OFF = 0,
        SQL_DP_ON  = 1;

    /** {@link #SQL_SOPT_SS_NAME_SCOPE SOPT_SS_NAME_SCOPE}. */
    public static final short
        SQL_SS_NAME_SCOPE_TABLE             = 0,
        SQL_SS_NAME_SCOPE_TABLE_TYPE        = 1,
        SQL_SS_NAME_SCOPE_EXTENDED          = 2,
        SQL_SS_NAME_SCOPE_SPARSE_COLUMN_SET = 3,
        SQL_SS_NAME_SCOPE_DEFAULT           = SQL_SS_NAME_SCOPE_TABLE;

    /** {@link #SQL_COPT_SS_ENCRYPT COPT_SS_ENCRYPT}. */
    public static final short
        SQL_EN_OFF = 0,
        SQL_EN_ON  = 1;

    /** {@link #SQL_COPT_SS_TRUST_SERVER_CERTIFICATE COPT_SS_TRUST_SERVER_CERTIFICATE}. */
    public static final short
        SQL_TRUST_SERVER_CERTIFICATE_NO  = 0,
        SQL_TRUST_SERVER_CERTIFICATE_YES = 1;

    /** {@link #SQL_COPT_SS_BROWSE_CONNECT COPT_SS_BROWSE_CONNECT}. */
    public static final short
        SQL_MORE_INFO_NO  = 0,
        SQL_MORE_INFO_YES = 1;

    /** {@link #SQL_COPT_SS_BROWSE_CACHE_DATA COPT_SS_BROWSE_CACHE_DATA}. */
    public static final short
        SQL_CACHE_DATA_NO  = 0,
        SQL_CACHE_DATA_YES = 1;

    /** {@link #SQL_COPT_SS_RESET_CONNECTION COPT_SS_RESET_CONNECTION}. */
    public static final short SQL_RESET_YES = 1;

    /** {@link #SQL_COPT_SS_WARN_ON_CP_ERROR COPT_SS_WARN_ON_CP_ERROR}. */
    public static final short
        SQL_WARN_NO  = 0,
        SQL_WARN_YES = 1;

    /** {@link #SQL_COPT_SS_MARS_ENABLED COPT_SS_MARS_ENABLED}. */
    public static final short
        SQL_MARS_ENABLED_NO  = 0,
        SQL_MARS_ENABLED_YES = 1;

    /** {@link SQL#SQL_TXN_ISOLATION_OPTION TXN_ISOLATION_OPTION} bitmasks. */
    public static final int SQL_TXN_SS_SNAPSHOT = 0x20;

    /** The following are defines for {@link #SQL_CA_SS_COLUMN_SORT_ORDER CA_SS_COLUMN_SORT_ORDER}. */
    public static final short
        SQL_SS_ORDER_UNSPECIFIED = 0,
        SQL_SS_DESCENDING_ORDER  = 1,
        SQL_SS_ASCENDING_ORDER   = 2,
        SQL_SS_ORDER_DEFAULT     = SQL_SS_ORDER_UNSPECIFIED;

    /** Driver specific SQL data type defines. */
    public static final short
        SQL_SS_VARIANT         = -150,
        SQL_SS_UDT             = -151,
        SQL_SS_XML             = -152,
        SQL_SS_TABLE           = -153,
        SQL_SS_TIME2           = -154,
        SQL_SS_TIMESTAMPOFFSET = -155;

    /** Local types to be used with {@link #SQL_CA_SS_SERVER_TYPE CA_SS_SERVER_TYPE}. */
    public static final short
        SQL_SS_TYPE_DEFAULT       = 0,
        SQL_SS_TYPE_SMALLDATETIME = 1,
        SQL_SS_TYPE_DATETIME      = 2;

    /** Extended C Types range 4000 and above. */
    public static final short
        SQL_C_TYPES_EXTENDED     = 0x4000,
        SQL_C_SS_TIME2           = SQL_C_TYPES_EXTENDED+0,
        SQL_C_SS_TIMESTAMPOFFSET = SQL_C_TYPES_EXTENDED+1;

    /** New types for SQL 6.0 and later servers. */
    public static final short
        SQLTEXT            = 0x23,
        SQLVARBINARY       = 0x25,
        SQLINTN            = 0x26,
        SQLVARCHAR         = 0x27,
        SQLBINARY          = 0x2D,
        SQLIMAGE           = 0x22,
        SQLCHARACTER       = 0x2F,
        SQLINT1            = 0x30,
        SQLBIT             = 0x32,
        SQLINT2            = 0x34,
        SQLINT4            = 0x38,
        SQLMONEY           = 0x3C,
        SQLDATETIME        = 0x3D,
        SQLFLT8            = 0x3E,
        SQLFLTN            = 0x6D,
        SQLMONEYN          = 0x6E,
        SQLDATETIMN        = 0x6F,
        SQLFLT4            = 0x3B,
        SQLMONEY4          = 0x7A,
        SQLDATETIM4        = 0x3A,
        SQLDECIMAL         = 0x6A,
        SQLNUMERIC         = 0x6C,
        SQLUNIQUEID        = 0x24,
        SQLBIGCHAR         = 0xAF,
        SQLBIGVARCHAR      = 0xA7,
        SQLBIGBINARY       = 0xAD,
        SQLBIGVARBINARY    = 0xA5,
        SQLBITN            = 0x68,
        SQLNCHAR           = 0xEF,
        SQLNVARCHAR        = 0xE7,
        SQLNTEXT           = 0x63,
        SQLINT8            = 0x7F,
        SQLVARIANT         = 0x62,
        SQLUDT             = 0xF0,
        SQLXML             = 0xF1,
        SQLTABLE           = 0xF3,
        SQLDATEN           = 0x28,
        SQLTIMEN           = 0x29,
        SQLDATETIME2N      = 0x2A,
        SQLDATETIMEOFFSETN = 0x2B,
        SQLDECIMALN        = 0x6A,
        SQLNUMERICN        = 0x6C;

    /** {@link #SQL_SS_LENGTH_UNLIMITED SS_LENGTH_UNLIMITED} is used to describe the max length of VARCHAR(max), VARBINARY(max), NVARCHAR(max), and XML columns. */
    public static final short SQL_SS_LENGTH_UNLIMITED = 0;

    /** User Data Type definitions. Returned by {@link SQL#SQLColAttribute ColAttribute}/{@link #SQL_CA_SS_COLUMN_UTYPE CA_SS_COLUMN_UTYPE}. */
    public static final short
        SQLudtBINARY           = 3,
        SQLudtBIT              = 16,
        SQLudtBITN             = 0,
        SQLudtCHAR             = 1,
        SQLudtDATETIM4         = 22,
        SQLudtDATETIME         = 12,
        SQLudtDATETIMN         = 15,
        SQLudtDECML            = 24,
        SQLudtDECMLN           = 26,
        SQLudtFLT4             = 23,
        SQLudtFLT8             = 8,
        SQLudtFLTN             = 14,
        SQLudtIMAGE            = 20,
        SQLudtINT1             = 5,
        SQLudtINT2             = 6,
        SQLudtINT4             = 7,
        SQLudtINTN             = 13,
        SQLudtMONEY            = 11,
        SQLudtMONEY4           = 21,
        SQLudtMONEYN           = 17,
        SQLudtNUM              = 10,
        SQLudtNUMN             = 25,
        SQLudtSYSNAME          = 18,
        SQLudtTEXT             = 19,
        SQLudtTIMESTAMP        = 80,
        SQLudtUNIQUEIDENTIFIER = 0,
        SQLudtVARBINARY        = 4,
        SQLudtVARCHAR          = 2,
        MIN_USER_DATATYPE      = 256;

    /** Aggregate operator types. Returned by {@link SQL#SQLColAttribute ColAttribute}/{@link #SQL_CA_SS_COLUMN_OP CA_SS_COLUMN_OP}. */
    public static final int
        SQLAOPSTDEV  = 0x30,
        SQLAOPSTDEVP = 0x31,
        SQLAOPVAR    = 0x32,
        SQLAOPVARP   = 0x33,
        SQLAOPCNT    = 0x4B,
        SQLAOPSUM    = 0x4D,
        SQLAOPAVG    = 0x4F,
        SQLAOPMIN    = 0x51,
        SQLAOPMAX    = 0x52,
        SQLAOPANY    = 0x53,
        SQLAOPNOOP   = 0x56;

    /** {@link SQL#SQLGetInfo GetInfo} driver specific define. */
    public static final short
        SQL_INFO_SS_FIRST        = 1199,
        SQL_INFO_SS_NETLIB_NAMEW = SQL_INFO_SS_FIRST+0,
        SQL_INFO_SS_NETLIB_NAMEA = SQL_INFO_SS_FIRST+1,
        SQL_INFO_SS_MAX_USED     = SQL_INFO_SS_NETLIB_NAMEA,
        SQL_INFO_SS_NETLIB_NAME  = SQL_INFO_SS_NETLIB_NAMEW;

    /** {@link SQL#SQLGetDiagField GetDiagField} driver specific defines. */
    public static final short
        SQL_DIAG_SS_BASE     = -1150,
        SQL_DIAG_SS_MSGSTATE = SQL_DIAG_SS_BASE,
        SQL_DIAG_SS_SEVERITY = SQL_DIAG_SS_BASE-1,
        SQL_DIAG_SS_SRVNAME  = SQL_DIAG_SS_BASE-2,
        SQL_DIAG_SS_PROCNAME = SQL_DIAG_SS_BASE-3,
        SQL_DIAG_SS_LINE     = SQL_DIAG_SS_BASE-4;

    /** {@link SQL#SQLGetDiagField GetDiagField}/{@link SQL#SQL_DIAG_DYNAMIC_FUNCTION_CODE DIAG_DYNAMIC_FUNCTION_CODE} driver specific defines. */
    public static final short
        SQL_DIAG_DFC_SS_BASE                = -200,
        SQL_DIAG_DFC_SS_ALTER_DATABASE      = SQL_DIAG_DFC_SS_BASE-0,
        SQL_DIAG_DFC_SS_CHECKPOINT          = SQL_DIAG_DFC_SS_BASE-1,
        SQL_DIAG_DFC_SS_CONDITION           = SQL_DIAG_DFC_SS_BASE-2,
        SQL_DIAG_DFC_SS_CREATE_DATABASE     = SQL_DIAG_DFC_SS_BASE-3,
        SQL_DIAG_DFC_SS_CREATE_DEFAULT      = SQL_DIAG_DFC_SS_BASE-4,
        SQL_DIAG_DFC_SS_CREATE_PROCEDURE    = SQL_DIAG_DFC_SS_BASE-5,
        SQL_DIAG_DFC_SS_CREATE_RULE         = SQL_DIAG_DFC_SS_BASE-6,
        SQL_DIAG_DFC_SS_CREATE_TRIGGER      = SQL_DIAG_DFC_SS_BASE-7,
        SQL_DIAG_DFC_SS_CURSOR_DECLARE      = SQL_DIAG_DFC_SS_BASE-8,
        SQL_DIAG_DFC_SS_CURSOR_OPEN         = SQL_DIAG_DFC_SS_BASE-9,
        SQL_DIAG_DFC_SS_CURSOR_FETCH        = SQL_DIAG_DFC_SS_BASE-10,
        SQL_DIAG_DFC_SS_CURSOR_CLOSE        = SQL_DIAG_DFC_SS_BASE-11,
        SQL_DIAG_DFC_SS_DEALLOCATE_CURSOR   = SQL_DIAG_DFC_SS_BASE-12,
        SQL_DIAG_DFC_SS_DBCC                = SQL_DIAG_DFC_SS_BASE-13,
        SQL_DIAG_DFC_SS_DISK                = SQL_DIAG_DFC_SS_BASE-14,
        SQL_DIAG_DFC_SS_DROP_DATABASE       = SQL_DIAG_DFC_SS_BASE-15,
        SQL_DIAG_DFC_SS_DROP_DEFAULT        = SQL_DIAG_DFC_SS_BASE-16,
        SQL_DIAG_DFC_SS_DROP_PROCEDURE      = SQL_DIAG_DFC_SS_BASE-17,
        SQL_DIAG_DFC_SS_DROP_RULE           = SQL_DIAG_DFC_SS_BASE-18,
        SQL_DIAG_DFC_SS_DROP_TRIGGER        = SQL_DIAG_DFC_SS_BASE-19,
        SQL_DIAG_DFC_SS_DUMP_DATABASE       = SQL_DIAG_DFC_SS_BASE-20,
        SQL_DIAG_DFC_SS_BACKUP_DATABASE     = SQL_DIAG_DFC_SS_BASE-20,
        SQL_DIAG_DFC_SS_DUMP_TABLE          = SQL_DIAG_DFC_SS_BASE-21,
        SQL_DIAG_DFC_SS_DUMP_TRANSACTION    = SQL_DIAG_DFC_SS_BASE-22,
        SQL_DIAG_DFC_SS_BACKUP_TRANSACTION  = SQL_DIAG_DFC_SS_BASE-22,
        SQL_DIAG_DFC_SS_GOTO                = SQL_DIAG_DFC_SS_BASE-23,
        SQL_DIAG_DFC_SS_INSERT_BULK         = SQL_DIAG_DFC_SS_BASE-24,
        SQL_DIAG_DFC_SS_KILL                = SQL_DIAG_DFC_SS_BASE-25,
        SQL_DIAG_DFC_SS_LOAD_DATABASE       = SQL_DIAG_DFC_SS_BASE-26,
        SQL_DIAG_DFC_SS_RESTORE_DATABASE    = SQL_DIAG_DFC_SS_BASE-26,
        SQL_DIAG_DFC_SS_LOAD_HEADERONLY     = SQL_DIAG_DFC_SS_BASE-27,
        SQL_DIAG_DFC_SS_RESTORE_HEADERONLY  = SQL_DIAG_DFC_SS_BASE-27,
        SQL_DIAG_DFC_SS_LOAD_TABLE          = SQL_DIAG_DFC_SS_BASE-28,
        SQL_DIAG_DFC_SS_LOAD_TRANSACTION    = SQL_DIAG_DFC_SS_BASE-29,
        SQL_DIAG_DFC_SS_RESTORE_TRANSACTION = SQL_DIAG_DFC_SS_BASE-29,
        SQL_DIAG_DFC_SS_PRINT               = SQL_DIAG_DFC_SS_BASE-30,
        SQL_DIAG_DFC_SS_RAISERROR           = SQL_DIAG_DFC_SS_BASE-31,
        SQL_DIAG_DFC_SS_READTEXT            = SQL_DIAG_DFC_SS_BASE-32,
        SQL_DIAG_DFC_SS_RECONFIGURE         = SQL_DIAG_DFC_SS_BASE-33,
        SQL_DIAG_DFC_SS_RETURN              = SQL_DIAG_DFC_SS_BASE-34,
        SQL_DIAG_DFC_SS_SELECT_INTO         = SQL_DIAG_DFC_SS_BASE-35,
        SQL_DIAG_DFC_SS_SET                 = SQL_DIAG_DFC_SS_BASE-36,
        SQL_DIAG_DFC_SS_SET_IDENTITY_INSERT = SQL_DIAG_DFC_SS_BASE-37,
        SQL_DIAG_DFC_SS_SET_ROW_COUNT       = SQL_DIAG_DFC_SS_BASE-38,
        SQL_DIAG_DFC_SS_SET_STATISTICS      = SQL_DIAG_DFC_SS_BASE-39,
        SQL_DIAG_DFC_SS_SET_TEXTSIZE        = SQL_DIAG_DFC_SS_BASE-40,
        SQL_DIAG_DFC_SS_SETUSER             = SQL_DIAG_DFC_SS_BASE-41,
        SQL_DIAG_DFC_SS_SHUTDOWN            = SQL_DIAG_DFC_SS_BASE-42,
        SQL_DIAG_DFC_SS_TRANS_BEGIN         = SQL_DIAG_DFC_SS_BASE-43,
        SQL_DIAG_DFC_SS_TRANS_COMMIT        = SQL_DIAG_DFC_SS_BASE-44,
        SQL_DIAG_DFC_SS_TRANS_PREPARE       = SQL_DIAG_DFC_SS_BASE-45,
        SQL_DIAG_DFC_SS_TRANS_ROLLBACK      = SQL_DIAG_DFC_SS_BASE-46,
        SQL_DIAG_DFC_SS_TRANS_SAVE          = SQL_DIAG_DFC_SS_BASE-47,
        SQL_DIAG_DFC_SS_TRUNCATE_TABLE      = SQL_DIAG_DFC_SS_BASE-48,
        SQL_DIAG_DFC_SS_UPDATE_STATISTICS   = SQL_DIAG_DFC_SS_BASE-49,
        SQL_DIAG_DFC_SS_UPDATETEXT          = SQL_DIAG_DFC_SS_BASE-50,
        SQL_DIAG_DFC_SS_USE                 = SQL_DIAG_DFC_SS_BASE-51,
        SQL_DIAG_DFC_SS_WAITFOR             = SQL_DIAG_DFC_SS_BASE-52,
        SQL_DIAG_DFC_SS_WRITETEXT           = SQL_DIAG_DFC_SS_BASE-53,
        SQL_DIAG_DFC_SS_DENY                = SQL_DIAG_DFC_SS_BASE-54,
        SQL_DIAG_DFC_SS_SET_XCTLVL          = SQL_DIAG_DFC_SS_BASE-55,
        SQL_DIAG_DFC_SS_MERGE               = SQL_DIAG_DFC_SS_BASE-56;

    /** Severity codes for {@link #SQL_DIAG_SS_SEVERITY DIAG_SS_SEVERITY}. */
    public static final short
        EX_ANY          = 0,
        EX_INFO         = 10,
        EX_MAXISEVERITY = EX_INFO,
        EX_MISSING      = 11,
        EX_TYPE         = 12,
        EX_DEADLOCK     = 13,
        EX_PERMIT       = 14,
        EX_SYNTAX       = 15,
        EX_USER         = 16,
        EX_RESOURCE     = 17,
        EX_INTOK        = 18,
        MAXUSEVERITY    = EX_INTOK,
        EX_LIMIT        = 19,
        EX_CMDFATAL     = 20,
        MINFATALERR     = EX_CMDFATAL,
        EX_DBFATAL      = 21,
        EX_TABCORRUPT   = 22,
        EX_DBCORRUPT    = 23,
        EX_HARDWARE     = 24,
        EX_CONTROL      = 25;

    /** Options for {@link #SQL_COPT_SS_PERF_DATA COPT_SS_PERF_DATA} and {@link #SQL_COPT_SS_PERF_QUERY COPT_SS_PERF_QUERY}. */
    public static final short
        SQL_PERF_START = 1,
        SQL_PERF_STOP  = 2;

    /** Defines for {@link #SQL_COPT_SS_PERF_DATA_LOG COPT_SS_PERF_DATA_LOG}. */
    public static final String SQL_SS_DL_DEFAULT = "STATS.LOG";

    /** Defines for {@link #SQL_COPT_SS_PERF_QUERY_LOG COPT_SS_PERF_QUERY_LOG}. */
    public static final String SQL_SS_QL_DEFAULT = "QUERY.LOG";

    /** Defines for {@link #SQL_COPT_SS_PERF_QUERY_INTERVAL COPT_SS_PERF_QUERY_INTERVAL}. */
    public static final short SQL_SS_QI_DEFAULT = 30000;

    /** BCP Return codes. */
    public static final short
        SQL_SUCCEED       = 1,
        SQL_FAIL          = 0,
        SQL_SUCCEED_ABORT = 2,
        SQL_SUCCEED_ASYNC = 3;

    /** BCP Transfer directions. */
    public static final short
        SQL_DB_IN  = 1,
        SQL_DB_OUT = 2;

    /** bcp_control option. */
    public static final short
        SQL_BCPMAXERRS      = 1,
        SQL_BCPFIRST        = 2,
        SQL_BCPLAST         = 3,
        SQL_BCPBATCH        = 4,
        SQL_BCPKEEPNULLS    = 5,
        SQL_BCPABORT        = 6,
        SQL_BCPODBC         = 7,
        SQL_BCPKEEPIDENTITY = 8,
        SQL_BCPHINTSA       = 10,
        SQL_BCPHINTSW       = 11,
        SQL_BCPFILECP       = 12,
        SQL_BCPUNICODEFILE  = 13,
        SQL_BCPTEXTFILE     = 14,
        SQL_BCPFILEFMT      = 15,
        SQL_BCPFMTXML       = 16,
        SQL_BCPFIRSTEX      = 17,
        SQL_BCPLASTEX       = 18,
        SQL_BCPROWCOUNT     = 19,
        SQL_BCPDELAYREADFMT = 20;

    /** BCPFILECP values. */
    public static final short
        SQL_BCPFILECP_ACP   = 0,
        SQL_BCPFILECP_OEMCP = 1,
        SQL_BCPFILECP_RAW   = -1;

    /** bcp_collen definition. */
    public static final short SQL_VARLEN_DATA = -10;

    /** BCP column format properties. */
    public static final int
        SQL_BCP_FMT_TYPE          = 0x1,
        SQL_BCP_FMT_INDICATOR_LEN = 0x2,
        SQL_BCP_FMT_DATA_LEN      = 0x3,
        SQL_BCP_FMT_TERMINATOR    = 0x4,
        SQL_BCP_FMT_SERVER_COL    = 0x5,
        SQL_BCP_FMT_COLLATION     = 0x6,
        SQL_BCP_FMT_COLLATION_ID  = 0x7;

    /** bcp_setbulkmode properties. */
    public static final int
        SQL_BCP_OUT_CHARACTER_MODE      = 0x1,
        SQL_BCP_OUT_WIDE_CHARACTER_MODE = 0x2,
        SQL_BCP_OUT_NATIVE_TEXT_MODE    = 0x3,
        SQL_BCP_OUT_NATIVE_MODE         = 0x4;

    /** The following facilitates opening a handle to a SQL filestream. */
    public static final int
        SQL_FILESTREAM_READ                       = 0,
        SQL_FILESTREAM_WRITE                      = 1,
        SQL_FILESTREAM_READWRITE                  = 2,
        SQL_FILESTREAM_OPEN_FLAG_ASYNC            = 0x1,
        SQL_FILESTREAM_OPEN_FLAG_NO_BUFFERING     = 0x2,
        SQL_FILESTREAM_OPEN_FLAG_NO_WRITE_THROUGH = 0x4,
        SQL_FILESTREAM_OPEN_FLAG_SEQUENTIAL_SCAN  = 0x8,
        SQL_FILESTREAM_OPEN_FLAG_RANDOM_ACCESS    = 0x10;

    private SQLNCLI() {}

}