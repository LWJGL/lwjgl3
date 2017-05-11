/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.lmdb

import org.lwjgl.generator.*

val LMDB_PACKAGE = "org.lwjgl.util.lmdb"

fun config() {
    packageInfo(
        LMDB_PACKAGE,
        """
        Bindings to ${url("http://symas.com/mdb/", "LMDB")}, the Symas Lightning Memory-Mapped Database.

        LMDB is a Btree-based database management library modeled loosely on the BerkeleyDB API, but much simplified. The entire database is exposed in a
        memory map, and all data fetches return data directly from the mapped memory, so no malloc's or memcpy's occur during data fetches. As such, the
        library is extremely simple because it requires no page caching layer of its own, and it is extremely high performance and memory-efficient. It is also
        fully transactional with full ACID semantics, and when the memory map is read-only, the database integrity cannot be corrupted by stray pointer writes
        from application code.

        The library is fully thread-aware and supports concurrent read/write access from multiple processes and threads. Data pages use a copy-on-write
        strategy so no active data pages are ever overwritten, which also provides resistance to corruption and eliminates the need of any special recovery
        procedures after a system crash. Writes are fully serialized; only one write transaction may be active at a time, which guarantees that writers can
        never deadlock. The database structure is multi-versioned so readers run with no locks; writers cannot block readers, and readers don't block writers.

        Unlike other well-known database mechanisms which use either write-ahead transaction logs or append-only data writes, LMDB requires no maintenance
        during operation. Both write-ahead loggers and append-only databases require periodic checkpointing and/or compaction of their log or database files
        otherwise they grow without bound. LMDB tracks free pages within the database and re-uses them for new write operations, so the database size does not
        grow without bound in normal use.

        The memory map can be used as a read-only or read-write map. It is read-only by default as this provides total immunity to corruption. Using read-write
        mode offers much higher write performance, but adds the possibility for stray application writes thru pointers to silently corrupt the database. Of
        course if your application code is known to be bug-free (...) then this is not an issue.

        <h3>Restrictions/caveats (in addition to those listed for some functions)</h3>
        ${ul(
            """
            Only the database owner should normally use the database on BSD systems or when otherwise configured with {@code MDB_USE_POSIX_SEM}. Multiple users
            can cause startup to fail later, as noted above.
            """,
            """
            There is normally no pure read-only mode, since readers need write access to locks and lock file. Exceptions: On read-only filesystems or with the
            #NOLOCK flag described under #env_open().
            """,
            """
            An LMDB configuration will often reserve considerable unused memory address space and maybe file size for future growth. This does not use actual
            memory or disk space, but users may need to understand the difference so they won't be scared off.
            """,
            """
            By default, in versions before 0.9.10, unused portions of the data file might receive garbage data from memory freed by other code. (This does not
            happen when using the #WRITEMAP flag.) As of 0.9.10 the default behavior is to initialize such memory before writing to the data file. Since there
            may be a slight performance cost due to this initialization, applications may disable it using the #NOMEMINIT flag. Applications handling sensitive
            data which must not be written should not use this flag. This flag is irrelevant when using #WRITEMAP.
            """,
            """
            A thread can only use one transaction at a time, plus any child transactions. Each transaction belongs to one thread. The #NOTLS flag changes this
            for read-only transactions.
            """,
            "Use an {@code MDB_env*} in the process which opened it, without {@code fork()}ing.",
            """
            Do not have open an LMDB database twice in the same process at the same time. Not even from a plain {@code open()} call - {@code close()}ing it
            breaks {@code flock()} advisory locking.
            """,
            """
            Avoid long-lived transactions. Read transactions prevent reuse of pages freed by newer write transactions, thus the database can grow quickly.
            Write transactions prevent other write transactions, since writes are serialized.
            """,
            """
            Avoid suspending a process with active transactions. These would then be "long-lived" as above. Also read transactions suspended when writers
            commit could sometimes see wrong data.
            """
        )}

        ...when several processes can use a database concurrently:
        ${ul(
            """
            Avoid aborting a process with an active transaction. The transaction becomes "long-lived" as above until a check for stale readers is performed or
            the lockfile is reset, since the process may not remove it from the lockfile.

            This does not apply to write transactions if the system clears stale writers, see above.
            """,
            "If you do that anyway, do a periodic check for stale readers. Or close the environment once in a while, so the lockfile can get reset.",
            """
            Do not use LMDB databases on remote filesystems, even between processes on the same host. This breaks {@code flock()} on some OSes, possibly memory
            map sync, and certainly sync between programs on different hosts.
            """,
            "Opening a database can fail if another process is opening or closing it at exactly the same time."
        )}

        <h3>Reader Lock Table</h3>

        Readers don't acquire any locks for their data access. Instead, they simply record their transaction ID in the reader table. The reader mutex is needed
        just to find an empty slot in the reader table. The slot's address is saved in thread-specific data so that subsequent read transactions started by the
        same thread need no further locking to proceed.

        If #NOTLS is set, the slot address is not saved in thread-specific data.

        No reader table is used if the database is on a read-only filesystem, or if #NOLOCK is set.

        Since the database uses multi-version concurrency control, readers don't actually need any locking. This table is used to keep track of which readers
        are using data from which old transactions, so that we'll know when a particular old transaction is no longer in use. Old transactions that have
        discarded any data pages can then have those pages reclaimed for use by a later write transaction.

        The lock table is constructed such that reader slots are aligned with the processor's cache line size. Any slot is only ever used by one thread. This
        alignment guarantees that there will be no contention or cache thrashing as threads update their own slot info, and also eliminates any need for
        locking when accessing a slot.

        A writer thread will scan every slot in the table to determine the oldest outstanding reader transaction. Any freed pages older than this will be
        reclaimed by the writer. The writer doesn't use any locks when scanning this table. This means that there's no guarantee that the writer will see the
        most up-to-date reader info, but that's not required for correct operation - all we need is to know the upper bound on the oldest reader, we don't care
        at all about the newest reader. So the only consequence of reading stale information here is that old pages might hang around a while longer before
        being reclaimed. That's actually good anyway, because the longer we delay reclaiming old pages, the more likely it is that a string of contiguous pages
        can be found after coalescing old pages from many old transactions together.
        """
    )
}

val MDB_env_p = "MDB_env".p
val MDB_env_pp = MDB_env_p.p

val mdb_mode_t = typedef(int, "mdb_mode_t") // TODO: mode_t on Linux
val mdb_filehandle_t = typedef(opaque_p, "mdb_filehandle_t") // TODO: int on Linux
//val mdb_filehandle_t_p = mdb_filehandle_t.p

val mdb_size_t = typedef(size_t, "mdb_size_t")
val mdb_size_t_p = mdb_size_t.p

val MDB_dbi = typedef(unsigned_int, "MDB_dbi")
val MDB_dbi_p = MDB_dbi.p

val MDB_txn_p = "MDB_txn".p
val MDB_txn_pp = MDB_txn_p.p

val MDB_val_p = struct(LMDB_PACKAGE, "MDBVal", nativeName = "MDB_val") {
    documentation =
        """
        Generic structure used for passing keys and data in and out of the database.

        Values returned from the database are valid only until a subsequent update operation, or the end of the transaction. Do not modify or free them, they
        commonly point into the database itself.

        Key sizes must be between 1 and #env_get_maxkeysize() inclusive. The same applies to data sizes in databases with the #DUPSORT flag.
        Other data items can in theory be from 0 to {@code 0xffffffff} bytes long.
        """

    AutoSize("mv_data", optional = true)..size_t.member("mv_size", "Size of the data item.")
    nullable..void_p.member("mv_data", "Address of the data item.")
}.p

val MDB_cursor_p = "MDB_cursor".p
val MDB_cursor_pp = MDB_cursor_p.p

val MDB_cursor_op = "MDB_cursor_op".enumType

val MDB_stat_p = struct(LMDB_PACKAGE, "MDBStat", nativeName = "MDB_stat", mutable = false) {
    documentation = "Statistics for a database in the environment."

    unsigned_int.member("ms_psize", "Size of a database page. This is currently the same for all databases.")
    unsigned_int.member("ms_depth", "Depth (height) of the B-tree.")
    mdb_size_t.member("ms_branch_pages", "Number of internal (non-leaf) pages.")
    mdb_size_t.member("ms_leaf_pages", "Number of leaf pages.")
    mdb_size_t.member("ms_overflow_pages", "Number of overflow pages.")
    mdb_size_t.member("ms_entries", "Number of data items.")
}.p

val MDB_envinfo_p = struct(LMDB_PACKAGE, "MDBEnvInfo", nativeName = "MDB_envinfo", mutable = false) {
    documentation = "Information about the environment."

    opaque_p.member("me_mapaddr", "Address of map, if fixed.")
    mdb_size_t.member("me_mapsize", "Size of the data memory map.")
    mdb_size_t.member("me_last_pgno", "ID of the last used page.")
    mdb_size_t.member("me_last_txnid", "ID of the last committed transaction.")
    unsigned_int.member("me_maxreaders", "Max reader slots in the environment.")
    unsigned_int.member("me_numreaders", "Max reader slots used in the environment.")
}.p

val MDB_cmp_func = "MDB_cmp_func *".callback(
    LMDB_PACKAGE, int, "MDBCmpFunc",
    "A callback function used to compare two keys in a database.",

    const..MDB_val_p.IN("a", "the first item to compare"),
    const..MDB_val_p.IN("b", "the second item to compare"),

    returnDoc = "&lt; 0 if a &lt; b, 0 if a == b, &gt; 0 if a &gt; b"
)

val MDB_rel_func = "MDB_rel_func *".callback(
    LMDB_PACKAGE, void, "MDBRelFunc",
    "A callback function used to relocate a position-dependent data item in a fixed-address database.",

    MDB_val_p.IN("item", "the item that is to be relocated"),
    opaque_p.IN("oldptr", "the previous address"),
    opaque_p.IN("newptr", "the new address to relocate to"),
    opaque_p.IN("relctx", "an application-provided context, set by #set_relctx()")
) {
    documentation =
        """
        A callback function used to relocate a position-dependent data item in a fixed-address database.

        The {@code newptr} gives the item's desired address in the memory map, and {@code oldptr} gives its previous address. The item's actual data resides at
        the address in {@code item}. This callback is expected to walk through the fields of the record in {@code item} and modify any values based at the
        {@code oldptr} address to be relative to the {@code newptr} address.
        """
}

val MDB_msg_func = "MDB_msg_func *".callback(
    LMDB_PACKAGE, int, "MDBMsgFunc",
    "A callback function used to print a message from the library.",

    const..charASCII_p.IN("msg", "the string to be printed"),
    opaque_p.IN("ctx", "an arbitrary context pointer for the callback"),
    returnDoc = "&lt; 0 on failure, &ge; 0 on success"
) {
    documentation = "A callback function used to print a message from the library."
}