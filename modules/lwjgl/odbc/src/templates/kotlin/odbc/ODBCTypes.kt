/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package odbc

import org.lwjgl.generator.*
import core.windows.*

val ODBC_BINDING = simpleBinding(Module.ODBC, libraryExpression = "Configuration.ODBC_LIBRARY_NAME, \"odbc32\", \"odbc\"")

val SQLCHAR = typedef(unsigned_char, "SQLCHAR")
val SQLSCHAR = IntegerType("SQLSCHAR", PrimitiveMapping.BYTE, unsigned = true)
val SQLWCHAR = typedef(unsigned_short, "SQLWCHAR")

val SQLTCHAR = typedef(SQLWCHAR, "SQLTCHAR")

val SQLCHARASCII = CharType("SQLCHAR", CharMapping.ASCII)
val SQLCHARUTF16 = CharType("SQLWCHAR", CharMapping.UTF16)

val SQLSMALLINT = typedef(short, "SQLSMALLINT")
val SQLUSMALLINT = typedef(unsigned_short, "SQLUSMALLINT")

val SQLINTEGER = typedef(int32_t, "SQLINTEGER")
val SQLUINTEGER = typedef(uint32_t, "SQLUINTEGER")

val SQLRETURN = typedef(SQLSMALLINT, "SQLRETURN")

val SQLPOINTER = typedef(PrimitiveType("void", PrimitiveMapping.BYTE).p, "SQLPOINTER")

val SQLLEN = IntegerType("SQLLEN", PrimitiveMapping.POINTER)
val SQLULEN = IntegerType("SQLULEN", PrimitiveMapping.POINTER, unsigned = true)

val SQLSETPOSIROW = IntegerType("SQLSETPOSIROW", PrimitiveMapping.LONG, unsigned = true)

val SQLHANDLE = "SQLHANDLE".handle

val SQLHENV = typedef(SQLHANDLE, "SQLHENV")
val SQLHDBC = typedef(SQLHANDLE, "SQLHDBC")
val SQLHSTMT = typedef(SQLHANDLE, "SQLHSTMT")
val SQLHDESC = typedef(SQLHANDLE, "SQLHDESC")
val SQLHWND = typedef(HWND, "SQLHWND")

val RETCODE = IntegerType("RETCODE", PrimitiveMapping.SHORT)

// sqltypes.h structs

val SQL_DATE_STRUCT = struct(Module.ODBC, "SQL_DATE_STRUCT") {
    SQLSMALLINT("year", "")
    SQLUSMALLINT("month", "")
    SQLUSMALLINT("day", "")
}

val SQL_TIME_STRUCT = struct(Module.ODBC, "SQL_TIME_STRUCT") {
    SQLUSMALLINT("hour", "")
    SQLUSMALLINT("minute", "")
    SQLUSMALLINT("second", "")
}

val SQL_TIMESTAMP_STRUCT = struct(Module.ODBC, "SQL_TIMESTAMP_STRUCT") {
    SQLSMALLINT("year", "")
    SQLUSMALLINT("month", "")
    SQLUSMALLINT("day", "")
    SQLUSMALLINT("hour", "")
    SQLUSMALLINT("minute", "")
    SQLUSMALLINT("second", "")
    SQLUINTEGER("fraction", "")
}

val SQL_YEAR_MONTH_STRUCT = struct(Module.ODBC, "SQL_YEAR_MONTH_STRUCT") {
    SQLUINTEGER("year", "")
    SQLUINTEGER("month", "")
}

val SQL_DAY_SECOND_STRUCT = struct(Module.ODBC, "SQL_DAY_SECOND_STRUCT") {
    SQLUINTEGER("day", "")
    SQLUINTEGER("hour", "")
    SQLUINTEGER("minute", "")
    SQLUINTEGER("second", "")
    SQLUINTEGER("fraction", "")
}

val SQLINTERVAL = typedef(int, "SQLINTERVAL")
val SQL_INTERVAL_STRUCT = struct(Module.ODBC, "SQL_INTERVAL_STRUCT") {
    SQLINTERVAL("interval_type", "")
    SQLSMALLINT("interval_sign", "")
    struct {
        SQL_YEAR_MONTH_STRUCT("year_month", "")
        SQL_DAY_SECOND_STRUCT("day_second", "")
    }("intval", "")
}

val SQL_NUMERIC_STRUCT = struct(Module.ODBC, "SQL_NUMERIC_STRUCT") {
    javaImport("static org.lwjgl.odbc.SQL.*")

    SQLCHAR("precision", "")
    SQLSCHAR("scale", "")
    SQLCHAR("sign", "")
    SQLCHAR("val", "")["SQL_MAX_NUMERIC_LEN"]
}

// sqlncli.h structs

val DBMONEY = struct(Module.ODBC, "DBMONEY") {
    LONG("mnyhigh", "")
    ULONG("mnylow", "")
}

val DBDATETIME = struct(Module.ODBC, "DBDATETIME") {
    LONG("dtdays", "")
    ULONG("dttime", "")
}

val DBDATETIM4 = struct(Module.ODBC, "DBDATETIM4") {
    USHORT("numdays", "")
    USHORT("nummins", "")
}

val SQL_SS_TIME2_STRUCT = struct(Module.ODBC, "SQL_SS_TIME2_STRUCT") {
    SQLUSMALLINT("hour", "")
    SQLUSMALLINT("minute", "")
    SQLUSMALLINT("second", "")
    SQLUINTEGER("fraction", "")
}

val SQL_SS_TIMESTAMPOFFSET_STRUCT = struct(Module.ODBC, "SQL_SS_TIMESTAMPOFFSET_STRUCT") {
    SQLSMALLINT("year", "")
    SQLUSMALLINT("month", "")
    SQLUSMALLINT("day", "")
    SQLUSMALLINT("hour", "")
    SQLUSMALLINT("minute", "")
    SQLUSMALLINT("second", "")
    SQLUINTEGER("fraction", "")
    SQLSMALLINT("timezone_hour", "")
    SQLSMALLINT("timezone_minute", "")
}

val SQLPERF = struct(Module.ODBC, "SQLPERF") {
    // Application Profile Statistics
    DWORD("TimerResolution", "")
    DWORD("SQLidu", "")
    DWORD("SQLiduRows", "")
    DWORD("SQLSelects", "")
    DWORD("SQLSelectRows", "")
    DWORD("Transactions", "")
    DWORD("SQLPrepares", "")
    DWORD("ExecDirects", "")
    DWORD("SQLExecutes", "")
    DWORD("CursorOpens", "")
    DWORD("CursorSize", "")
    DWORD("CursorUsed", "")
    LDOUBLE("PercentCursorUsed", "")
    LDOUBLE("AvgFetchTime", "")
    LDOUBLE("AvgCursorSize", "")
    LDOUBLE("AvgCursorUsed", "")
    DWORD("SQLFetchTime", "")
    DWORD("SQLFetchCount", "")
    DWORD("CurrentStmtCount", "")
    DWORD("MaxOpenStmt", "")
    DWORD("SumOpenStmt", "")
    // Connection Statistics
    DWORD("CurrentConnectionCount", "")
    DWORD("MaxConnectionsOpened", "")
    DWORD("SumConnectionsOpened", "")
    DWORD("SumConnectiontime", "")
    LDOUBLE("AvgTimeOpened", "")
    // Network Statistics
    DWORD("ServerRndTrips", "")
    DWORD("BuffersSent", "")
    DWORD("BuffersRec", "")
    DWORD("BytesSent", "")
    DWORD("BytesRec", "")
    // Time Statistics
    DWORD("msExecutionTime", "")
    DWORD("msNetWorkServerTime", "")
}