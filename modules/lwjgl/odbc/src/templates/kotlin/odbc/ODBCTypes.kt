/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package odbc

import org.lwjgl.generator.*
import core.windows.*

val ODBC_BINDING = simpleBinding(Module.ODBC, libraryExpression = "Configuration.ODBC_LIBRARY_NAME, \"odbc32\", \"odbc\"")
val ODBC_BINDING_DELEGATE = ODBC_BINDING.delegate("SQL.getLibrary()")

fun config() {
    packageInfo(
        Module.ODBC,
        """
        Contains bindings to ${url("https://docs.microsoft.com/en-us/sql/odbc/microsoft-open-database-connectivity-odbc", "ODBC")}.

        The Microsoft Open Database Connectivity (ODBC) interface is a C programming language interface that makes it possible for applications to access data
        from a variety of database management systems (DBMSs). ODBC is a low-level, high-performance interface that is designed specifically for relational
        data stores.

        The ODBC interface allows maximum interoperability — an application can access data in diverse DBMSs through a single interface. Moreover, that
        application will be independent of any DBMS from which it accesses data. Users of the application can add software components called drivers, which
        interface between an application and a specific DBMS.
        """
    )
}

val SQLCHAR = typedef(unsigned_char, "SQLCHAR")
val SQLSCHAR = IntegerType("SQLSCHAR", PrimitiveMapping.BYTE, unsigned = true)
val SQLWCHAR = typedef(unsigned_short, "SQLWCHAR")

val SQLTCHAR = typedef(SQLWCHAR, "SQLTCHAR")

val SQLCHARASCII = CharType("SQLCHAR", CharMapping.ASCII)
val SQLCHARUTF16 = CharType("SQLWCHAR", CharMapping.UTF16)

val SQLSMALLINT = typedef(short, "SQLSMALLINT")
val SQLUSMALLINT = typedef(unsigned_short, "SQLUSMALLINT")

val long = IntegerType("long", PrimitiveMapping.INT)
val unsigned_long = IntegerType("unsigned long", PrimitiveMapping.INT, unsigned = true)

val SQLINTEGER = typedef(long, "SQLINTEGER")
val SQLUINTEGER = typedef(unsigned_long, "SQLUINTEGER")

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
    SQLSMALLINT.member("year", "")
    SQLUSMALLINT.member("month", "")
    SQLUSMALLINT.member("day", "")
}

val SQL_TIME_STRUCT = struct(Module.ODBC, "SQL_TIME_STRUCT") {
    SQLUSMALLINT.member("hour", "")
    SQLUSMALLINT.member("minute", "")
    SQLUSMALLINT.member("second", "")
}

val SQL_TIMESTAMP_STRUCT = struct(Module.ODBC, "SQL_TIMESTAMP_STRUCT") {
    SQLSMALLINT.member("year", "")
    SQLUSMALLINT.member("month", "")
    SQLUSMALLINT.member("day", "")
    SQLUSMALLINT.member("hour", "")
    SQLUSMALLINT.member("minute", "")
    SQLUSMALLINT.member("second", "")
    SQLUINTEGER.member("fraction", "")
}

val SQL_YEAR_MONTH_STRUCT = struct(Module.ODBC, "SQL_YEAR_MONTH_STRUCT") {
    SQLUINTEGER.member("year", "")
    SQLUINTEGER.member("month", "")
}

val SQL_DAY_SECOND_STRUCT = struct(Module.ODBC, "SQL_DAY_SECOND_STRUCT") {
    SQLUINTEGER.member("day", "")
    SQLUINTEGER.member("hour", "")
    SQLUINTEGER.member("minute", "")
    SQLUINTEGER.member("second", "")
    SQLUINTEGER.member("fraction", "")
}

val SQLINTERVAL = typedef(int, "SQLINTERVAL")
val SQL_INTERVAL_STRUCT = struct(Module.ODBC, "SQL_INTERVAL_STRUCT") {
    SQLINTERVAL.member("interval_type", "")
    SQLSMALLINT.member("interval_sign", "")
    struct("intval", "") {
        SQL_YEAR_MONTH_STRUCT.member("year_month", "")
        SQL_DAY_SECOND_STRUCT.member("day_second", "")
    }
}

val SQL_NUMERIC_STRUCT = struct(Module.ODBC, "SQL_NUMERIC_STRUCT") {
    SQLCHAR.member("precision", "")
    SQLSCHAR.member("scale", "")
    SQLCHAR.member("sign", "")
    SQLCHAR.array("val", "", size = 16 /*SQL_MAX_NUMERIC_LEN*/)
}

// sqlncli.h structs

val DBMONEY = struct(Module.ODBC, "DBMONEY") {
    LONG.member("mnyhigh", "")
    ULONG.member("mnylow", "")
}

val DBDATETIME = struct(Module.ODBC, "DBDATETIME") {
    LONG.member("dtdays", "")
    ULONG.member("dttime", "")
}

val DBDATETIM4 = struct(Module.ODBC, "DBDATETIM4") {
    USHORT.member("numdays", "")
    USHORT.member("nummins", "")
}

val SQL_SS_TIME2_STRUCT = struct(Module.ODBC, "SQL_SS_TIME2_STRUCT") {
    SQLUSMALLINT.member("hour", "")
    SQLUSMALLINT.member("minute", "")
    SQLUSMALLINT.member("second", "")
    SQLUINTEGER.member("fraction", "")
}

val SQL_SS_TIMESTAMPOFFSET_STRUCT = struct(Module.ODBC, "SQL_SS_TIMESTAMPOFFSET_STRUCT") {
    SQLSMALLINT.member("year", "")
    SQLUSMALLINT.member("month", "")
    SQLUSMALLINT.member("day", "")
    SQLUSMALLINT.member("hour", "")
    SQLUSMALLINT.member("minute", "")
    SQLUSMALLINT.member("second", "")
    SQLUINTEGER.member("fraction", "")
    SQLSMALLINT.member("timezone_hour", "")
    SQLSMALLINT.member("timezone_minute", "")
}

val SQLPERF = struct(Module.ODBC, "SQLPERF") {
    // Application Profile Statistics
    DWORD.member("TimerResolution", "")
    DWORD.member("SQLidu", "")
    DWORD.member("SQLiduRows", "")
    DWORD.member("SQLSelects", "")
    DWORD.member("SQLSelectRows", "")
    DWORD.member("Transactions", "")
    DWORD.member("SQLPrepares", "")
    DWORD.member("ExecDirects", "")
    DWORD.member("SQLExecutes", "")
    DWORD.member("CursorOpens", "")
    DWORD.member("CursorSize", "")
    DWORD.member("CursorUsed", "")
    LDOUBLE.member("PercentCursorUsed", "")
    LDOUBLE.member("AvgFetchTime", "")
    LDOUBLE.member("AvgCursorSize", "")
    LDOUBLE.member("AvgCursorUsed", "")
    DWORD.member("SQLFetchTime", "")
    DWORD.member("SQLFetchCount", "")
    DWORD.member("CurrentStmtCount", "")
    DWORD.member("MaxOpenStmt", "")
    DWORD.member("SumOpenStmt", "")
    // Connection Statistics
    DWORD.member("CurrentConnectionCount", "")
    DWORD.member("MaxConnectionsOpened", "")
    DWORD.member("SumConnectionsOpened", "")
    DWORD.member("SumConnectiontime", "")
    LDOUBLE.member("AvgTimeOpened", "")
    // Network Statistics
    DWORD.member("ServerRndTrips", "")
    DWORD.member("BuffersSent", "")
    DWORD.member("BuffersRec", "")
    DWORD.member("BytesSent", "")
    DWORD.member("BytesRec", "")
    // Time Statistics
    DWORD.member("msExecutionTime", "")
    DWORD.member("msNetWorkServerTime", "")
}