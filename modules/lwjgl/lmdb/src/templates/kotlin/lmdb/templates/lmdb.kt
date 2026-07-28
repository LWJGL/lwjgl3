/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lmdb.templates

import org.lwjgl.generator.*
import lmdb.*

val lmdb = "LMDB".nativeClass(Module.LMDB, prefix = "MDB", prefixMethod = "mdb_") {
    nativeDirective(
        """DISABLE_WARNINGS()
#ifdef LWJGL_x86
    #define MDB_VL32 1
#endif
#define MDB_DEVEL 2
#include "lmdb.h"
ENABLE_WARNINGS()""")

    IntConstant(
        "VERSION_MAJOR".."0",
        "VERSION_MINOR".."9",
        "VERSION_PATCH".."35"
    )

    IntConstant("VERSION_FULL".."(MDB_VERSION_MAJOR << 24) | (MDB_VERSION_MINOR << 16) | MDB_VERSION_PATCH")

    StringConstant("VERSION_DATE".."Jan 27, 2026")
    StringConstant(
        "VERSION_STRING".expr("String.format(\"LMDB %d.%d.%d: (%s)\", MDB_VERSION_MAJOR, MDB_VERSION_MINOR, MDB_VERSION_PATCH, MDB_VERSION_DATE)")
    )

    EnumConstant(
        "FIXEDMAP".enum(0x01),
        "NOSUBDIR".enum(0x4000),
        "NOSYNC".enum(0x10000),
        "RDONLY".enum(0x20000),
        "NOMETASYNC".enum(0x40000),
        "WRITEMAP".enum(0x80000),
        "MAPASYNC".enum(0x100000),
        "NOTLS".enum(0x200000),
        "NOLOCK".enum(0x400000),
        "NORDAHEAD".enum(0x800000),
        "NOMEMINIT".enum(0x1000000)
    )

    EnumConstant(
        "REVERSEKEY".enum(0x02),
        "DUPSORT".enum(0x04),
        "INTEGERKEY".enum(0x08),
        "DUPFIXED".enum(0x10),
        "INTEGERDUP".enum(0x20),
        "REVERSEDUP".enum(0x40),
        "CREATE".enum(0x40000)
    )

    EnumConstant(
        "NOOVERWRITE".enum(0x10),
        "NODUPDATA".enum(0x20),
        "CURRENT".enum(0x40),
        "RESERVE".enum(0x10000),
        "APPEND".enum(0x20000),
        "APPENDDUP".enum(0x40000),
        "MULTIPLE".enum(0x80000)
    )

    EnumConstant(
        "CP_COMPACT".enum(0x01)
    )

    EnumConstant(
        "FIRST".enum,
        "FIRST_DUP".enum,
        "GET_BOTH".enum,
        "GET_BOTH_RANGE".enum,
        "GET_CURRENT".enum,
        "GET_MULTIPLE".enum,
        "LAST".enum,
        "LAST_DUP".enum,
        "NEXT".enum,
        "NEXT_DUP".enum,
        "NEXT_MULTIPLE".enum,
        "NEXT_NODUP".enum,
        "PREV".enum,
        "PREV_DUP".enum,
        "PREV_NODUP".enum,
        "SET".enum,
        "SET_KEY".enum,
        "SET_RANGE".enum,
        "PREV_MULTIPLE".enum
    )

    EnumConstant(
        "SUCCESS".enum("0"),
        "KEYEXIST".enum("-30799"),
        "NOTFOUND".enum("-30798"),
        "PAGE_NOTFOUND".enum("-30797"),
        "CORRUPTED".enum("-30796"),
        "PANIC".enum("-30795"),
        "VERSION_MISMATCH".enum("-30794"),
        "INVALID".enum("-30793"),
        "MAP_FULL".enum("-30792"),
        "DBS_FULL".enum("-30791"),
        "READERS_FULL".enum("-30790"),
        "TLS_FULL".enum("-30789"),
        "TXN_FULL".enum("-30788"),
        "CURSOR_FULL".enum("-30787"),
        "PAGE_FULL".enum("-30786"),
        "MAP_RESIZED".enum("-30785"),
        "INCOMPATIBLE".enum("-30784"),
        "BAD_RSLOT".enum("-30783"),
        "BAD_TXN".enum("-30782"),
        "BAD_VALSIZE".enum("-30781"),
        "BAD_DBI".enum("-30780"),
        "LAST_ERRCODE".enum("MDB_BAD_DBI")
    )

    charASCII.p(
        "version",

        Check(1)..nullable..int.p("major"),
        Check(1)..nullable..int.p("minor"),
        Check(1)..nullable..int.p("patch")
    )

    Nonnull..charASCII.p(
        "strerror",

        int("err")
    )

    int(
        "env_create",
        
        Check(1)..MDB_env.p.p("env")
    )

    val env_open = int(
        "env_open",

        MDB_env.p("env"),
        charUTF8.const.p("path"),
        unsigned_int("flags"),
        mdb_mode_t("mode")
    )

    int(
        "env_copy",

        MDB_env.p("env"),
        charUTF8.const.p("path")
    )

    /*int(
        "env_copyfd",
        "",

        MDB_env_p("env"),
        mdb_filehandle_t("fd")
    )*/

    int(
        "env_copy2",

        MDB_env.p("env"),
        charUTF8.const.p("path"),
        unsigned_int("flags")
    )

    /*int(
        "env_copyfd2",
        "",

        MDB_env_p("env"),
        mdb_filehandle_t("fd"),
        unsigned_int("flags")
    )*/

    int(
        "env_stat",

        env_open["env"],
        MDB_stat.p("stat")
    )

    int(
        "env_info",

        env_open["env"],
        MDB_envinfo.p("stat")
    )

    int(
        "env_sync",

        env_open["env"],
        intb("force")
    )

    void(
        "env_close",

        env_open["env"]
    )

    int(
        "env_set_flags",

        env_open["env"],
        unsigned_int("flags"),
        intb("onoff")
    )

    int(
        "env_get_flags",

        env_open["env"],
        Check(1)..unsigned_int.p("flags")
    )

    int(
        "env_get_path",

        env_open["env"],
        Check(1)..charUTF8.const.p.p("path")
    )

    /*int(
        "env_get_fd",
        "",

        MDB_env_p("env"),
        mdb_filehandle_t_p("fd")
    )*/

    int(
        "env_set_mapsize",

        env_open["env"],
        size_t("size")
    )

    int(
        "env_set_maxreaders",

        env_open["env"],
        unsigned_int("readers")
    )

    int(
        "env_get_maxreaders",

        env_open["env"],
        Check(1)..unsigned_int.p("readers")
    )

    int(
        "env_set_maxdbs",

        env_open["env"],
        MDB_dbi("dbs")
    )

    int(
        "env_get_maxkeysize",

        env_open["env"]
    )

    int(
        "env_set_userctx",

        env_open["env"],
        opaque_p("ctx")
    )

    opaque_p(
        "env_get_userctx",

        env_open["env"]
    )

    /*int(
        "env_set_assert",
        "",

        MDB_env_p("env"),
        MDB_assert_func_p("func")
    )*/

    int(
        "txn_begin",

        env_open["env"],
        nullable..MDB_txn.p("parent"),
        unsigned_int("flags"),
        Check(1)..MDB_txn.p.p("txn")
    )

    val txn_env = MDB_env.p(
        "txn_env",

        MDB_txn.p("txn")
    )

    size_t(
        "txn_id",

        txn_env["txn"]
    )

    int(
        "txn_commit",

        txn_env["txn"]
    )

    void(
        "txn_abort",

        txn_env["txn"]
    )

    void(
        "txn_reset",

        txn_env["txn"]
    )

    int(
        "txn_renew",

        txn_env["txn"]
    )

    int(
        "dbi_open",

        txn_env["txn"],
        nullable..charUTF8.const.p("name"),
        unsigned_int("flags"),
        Check(1)..MDB_dbi.p("dbi")
    )

    val stat = int(
        "stat",

        txn_env["txn"],
        MDB_dbi("dbi"),
        MDB_stat.p("stat")
    )

    int(
        "dbi_flags",

        txn_env["txn"],
        stat["dbi"],
        Check(1)..unsigned_int.p("flags")
    )

    void(
        "dbi_close",

        env_open["env"],
        stat["dbi"]
    )

    int(
        "drop",

        txn_env["txn"],
        stat["dbi"],
        intb("del")
    )

    int(
        "set_compare",

        txn_env["txn"],
        stat["dbi"],
        MDB_cmp_func("cmp")
    )

    int(
        "set_dupsort",

        txn_env["txn"],
        stat["dbi"],
        MDB_cmp_func("cmp")
    )

    int(
        "set_relfunc",

        txn_env["txn"],
        stat["dbi"],
        MDB_rel_func("rel")
    )

    int(
        "set_relctx",

        txn_env["txn"],
        stat["dbi"],
        opaque_p("ctx")
    )

    int(
        "get",

        txn_env["txn"],
        stat["dbi"],
        MDB_val.p("key"),
        MDB_val.p("data")
    )

    int(
        "put",

        txn_env["txn"],
        stat["dbi"],
        MDB_val.p("key"),
        MDB_val.p("data"),
        unsigned_int("flags")
    )

    int(
        "del",

        txn_env["txn"],
        stat["dbi"],
        MDB_val.p("key"),
        nullable..MDB_val.p("data")
    )

    int(
        "cursor_open",

        txn_env["txn"],
        stat["dbi"],
        Check(1)..MDB_cursor.p.p("cursor")
    )

    val cursor_close = void(
        "cursor_close",

        MDB_cursor.p("cursor")
    )

    int(
        "cursor_renew",

        txn_env["txn"],
        cursor_close["cursor"]
    )

    MDB_txn.p(
        "cursor_txn",

        cursor_close["cursor"]
    )

    MDB_dbi(
        "cursor_dbi",

        cursor_close["cursor"]
    )

    int(
        "cursor_get",

        cursor_close["cursor"],
        MDB_val.p("key"),
        MDB_val.p("data"),
        MDB_cursor_op("op")
    )

    int(
        "cursor_put",

        cursor_close["cursor"],
        MDB_val.p("key"),
        MDB_val.p("data"),
        unsigned_int("flags")
    )

    int(
        "cursor_del",

        cursor_close["cursor"],
        unsigned_int("flags")
    )

    int(
        "cursor_count",

        cursor_close["cursor"],
        Check(1)..size_t.p("countp")
    )

    int(
        "cmp",

        txn_env["txn"],
        stat["dbi"],
        MDB_val.const.p("a"),
        MDB_val.const.p("b")
    )

    int(
        "dcmp",

        txn_env["txn"],
        stat["dbi"],
        MDB_val.const.p("a"),
        MDB_val.const.p("b")
    )

    int(
        "reader_list",

        env_open["env"],
        MDB_msg_func("func"),
        opaque_p("ctx")
    )

    int(
        "reader_check",

        env_open["env"],
        Check(1)..int.p("dead")
    )
}