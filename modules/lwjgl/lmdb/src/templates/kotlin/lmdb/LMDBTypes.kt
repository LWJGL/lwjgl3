/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package lmdb

import org.lwjgl.generator.*

val MDB_env = "MDB_env".opaque

val mdb_mode_t = typedef(int, "mdb_mode_t") // TODO: mode_t on Linux
val mdb_filehandle_t = typedef(opaque_p, "mdb_filehandle_t") // TODO: int on Linux

val MDB_dbi = typedef(unsigned_int, "MDB_dbi")

val MDB_txn = "MDB_txn".opaque

val MDB_val = struct(Module.LMDB, "MDBVal", nativeName = "MDB_val") {
    AutoSize("mv_data", optional = true)..size_t("mv_size")
    nullable..void.p("mv_data")
}

val MDB_cursor = "MDB_cursor".opaque

val MDB_cursor_op = "MDB_cursor_op".enumType

val MDB_stat = struct(Module.LMDB, "MDBStat", nativeName = "MDB_stat", mutable = false) {
    unsigned_int("ms_psize")
    unsigned_int("ms_depth")
    size_t("ms_branch_pages")
    size_t("ms_leaf_pages")
    size_t("ms_overflow_pages")
    size_t("ms_entries")
}

val MDB_envinfo = struct(Module.LMDB, "MDBEnvInfo", nativeName = "MDB_envinfo", mutable = false) {
    opaque_p("me_mapaddr")
    size_t("me_mapsize")
    size_t("me_last_pgno")
    size_t("me_last_txnid")
    unsigned_int("me_maxreaders")
    unsigned_int("me_numreaders")
}

val MDB_cmp_func = Module.LMDB.callback {
    int(
        "MDBCmpFunc",

        MDB_val.const.p("a"),
        MDB_val.const.p("b"),

        nativeType = "MDB_cmp_func *"
    )
}
val MDB_rel_func = Module.LMDB.callback {
    void(
        "MDBRelFunc",

        MDB_val.p("item"),
        opaque_p("oldptr"),
        opaque_p("newptr"),
        opaque_p("relctx"),

        nativeType = "MDB_rel_func *"
    ) {
    }
}

val MDB_msg_func = Module.LMDB.callback {
    int(
        "MDBMsgFunc",

        charASCII.const.p("msg"),
        opaque_p("ctx"),

        nativeType = "MDB_msg_func *"
    ) {
    }
}