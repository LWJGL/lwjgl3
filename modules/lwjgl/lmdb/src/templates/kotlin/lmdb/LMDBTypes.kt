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
    documentation =
        """
        Generic structure used for passing keys and data in and out of the database.

        Values returned from the database are valid only until a subsequent update operation, or the end of the transaction. Do not modify or free them, they
        commonly point into the database itself.

        Key sizes must be between 1 and #env_get_maxkeysize() inclusive. The same applies to data sizes in databases with the #DUPSORT flag.
        Other data items can in theory be from 0 to {@code 0xffffffff} bytes long.
        """

    AutoSize("mv_data", optional = true)..size_t("mv_size", "Size of the data item.")
    nullable..void.p("mv_data", "Address of the data item.")
}

val MDB_cursor = "MDB_cursor".opaque

val MDB_cursor_op = "MDB_cursor_op".enumType

val MDB_stat = struct(Module.LMDB, "MDBStat", nativeName = "MDB_stat", mutable = false) {
    documentation = "Statistics for a database in the environment."

    unsigned_int("ms_psize", "Size of a database page. This is currently the same for all databases.")
    unsigned_int("ms_depth", "Depth (height) of the B-tree.")
    size_t("ms_branch_pages", "Number of internal (non-leaf) pages.")
    size_t("ms_leaf_pages", "Number of leaf pages.")
    size_t("ms_overflow_pages", "Number of overflow pages.")
    size_t("ms_entries", "Number of data items.")
}

val MDB_envinfo = struct(Module.LMDB, "MDBEnvInfo", nativeName = "MDB_envinfo", mutable = false) {
    documentation = "Information about the environment."

    opaque_p("me_mapaddr", "Address of map, if fixed.")
    size_t("me_mapsize", "Size of the data memory map.")
    size_t("me_last_pgno", "ID of the last used page.")
    size_t("me_last_txnid", "ID of the last committed transaction.")
    unsigned_int("me_maxreaders", "Max reader slots in the environment.")
    unsigned_int("me_numreaders", "Max reader slots used in the environment.")
}

val MDB_cmp_func = Module.LMDB.callback {
    int(
        "MDBCmpFunc",
        "A callback function used to compare two keys in a database.",

        MDB_val.const.p("a", "the first item to compare"),
        MDB_val.const.p("b", "the second item to compare"),

        nativeType = "MDB_cmp_func *",
        returnDoc = "&lt; 0 if a &lt; b, 0 if a == b, &gt; 0 if a &gt; b"
    )
}
val MDB_rel_func = Module.LMDB.callback {
    void(
        "MDBRelFunc",
        "A callback function used to relocate a position-dependent data item in a fixed-address database.",

        MDB_val.p("item", "the item that is to be relocated"),
        opaque_p("oldptr", "the previous address"),
        opaque_p("newptr", "the new address to relocate to"),
        opaque_p("relctx", "an application-provided context, set by #set_relctx()"),

        nativeType = "MDB_rel_func *"
    ) {
        documentation =
            """
            A callback function used to relocate a position-dependent data item in a fixed-address database.

            The {@code newptr} gives the item's desired address in the memory map, and {@code oldptr} gives its previous address. The item's actual data resides at
            the address in {@code item}. This callback is expected to walk through the fields of the record in {@code item} and modify any values based at the
            {@code oldptr} address to be relative to the {@code newptr} address.
            """
    }
}

val MDB_msg_func = Module.LMDB.callback {
    int(
        "MDBMsgFunc",
        "A callback function used to print a message from the library.",

        charASCII.const.p("msg", "the string to be printed"),
        opaque_p("ctx", "an arbitrary context pointer for the callback"),

        nativeType = "MDB_msg_func *",
        returnDoc = "&lt; 0 on failure, &ge; 0 on success"
    ) {
        documentation = "A callback function used to print a message from the library."
    }
}