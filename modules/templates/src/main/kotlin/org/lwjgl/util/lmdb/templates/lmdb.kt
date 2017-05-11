/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.util.lmdb.templates

import org.lwjgl.generator.*
import org.lwjgl.util.lmdb.*

val lmdb = "LMDB".nativeClass(LMDB_PACKAGE, prefix = "MDB", prefixMethod = "mdb_", library = "lwjgl_lmdb") {
    nativeDirective(
        """#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4710 4711))
#endif""", beforeIncludes = true)

    nativeDirective(
        """DISABLE_WARNINGS()
#ifdef LWJGL_WINDOWS
    __pragma(warning(disable : 4172 4701 4706))
#endif
#define MDB_DEVEL 2
#include "lmdb.h"
ENABLE_WARNINGS()""")

    documentation =
        """
        Contains bindings to ${url("http://symas.com/mdb/", "LMDB")}, the Symas Lightning Memory-Mapped Database.

        <h3>Getting Started</h3>

        LMDB is compact, fast, powerful, and robust and implements a simplified variant of the BerkeleyDB (BDB) API.

        Everything starts with an environment, created by #env_create(). Once created, this environment must also be opened with #env_open(). #env_open() gets
        passed a name which is interpreted as a directory path. Note that this directory must exist already, it is not created for you. Within that directory,
        a lock file and a storage file will be generated. If you don't want to use a directory, you can pass the #NOSUBDIR option, in which case the path you
        provided is used directly as the data file, and another file with a "-lock" suffix added will be used for the lock file.

        Once the environment is open, a transaction can be created within it using #txn_begin(). Transactions may be read-write or read-only, and read-write
        transactions may be nested. A transaction must only be used by one thread at a time. Transactions are always required, even for read-only access. The
        transaction provides a consistent view of the data.

        Once a transaction has been created, a database can be opened within it using #dbi_open(). If only one database will ever be used in the environment, a
        #NULL can be passed as the database name. For named databases, the #CREATE flag must be used to create the database if it doesn't already exist. Also,
        #env_set_maxdbs() must be called after #env_create() and before #env_open() to set the maximum number of named databases you want to support.

        Note: a single transaction can open multiple databases. Generally databases should only be opened once, by the first transaction in the process. After
        the first transaction completes, the database handles can freely be used by all subsequent transactions.

        Within a transaction, #get() and #put() can store single key/value pairs if that is all you need to do (but see {@code Cursors} below if you want to do
        more).

        A key/value pair is expressed as two ##MDBVal structures. This struct has two fields, {@code mv_size} and {@code mv_data}. The data is a {@code void}
        pointer to an array of {@code mv_size} bytes.

        Because LMDB is very efficient (and usually zero-copy), the data returned in an ##MDBVal structure may be memory-mapped straight from disk. In other
        words <b>look but do not touch</b> (or {@code free()} for that matter). Once a transaction is closed, the values can no longer be used, so make a copy
        if you need to keep them after that.

        <h3>Cursors</h3>

        To do more powerful things, we must use a cursor.

        Within the transaction, a cursor can be created with #cursor_open(). With this cursor we can store/retrieve/delete (multiple) values using
        #cursor_get(), #cursor_put(), and #cursor_del().

        #cursor_get() positions itself depending on the cursor operation requested, and for some operations, on the supplied key. For example, to list all
        key/value pairs in a database, use operation #FIRST for the first call to #cursor_get(), and #NEXT on subsequent calls, until the end is hit.

        To retrieve all keys starting from a specified key value, use #SET.

        When using #cursor_put(), either the function will position the cursor for you based on the {@code key}, or you can use operation #CURRENT to use the
        current position of the cursor. Note that {@code key} must then match the current position's key.

        <h4>Summarizing the Opening</h4>

        So we have a cursor in a transaction which opened a database in an environment which is opened from a filesystem after it was separately created.

        Or, we create an environment, open it from a filesystem, create a transaction within it, open a database within that transaction, and create a cursor
        within all of the above.

        <h3>Threads and Processes</h3>

        LMDB uses POSIX locks on files, and these locks have issues if one process opens a file multiple times. Because of this, do not #env_open() a file
        multiple times from a single process. Instead, share the LMDB environment that has opened the file across all threads. Otherwise, if a single process
        opens the same environment multiple times, closing it once will remove all the locks held on it, and the other instances will be vulnerable to
        corruption from other processes.

        Also note that a transaction is tied to one thread by default using Thread Local Storage. If you want to pass read-only transactions across threads,
        you can use the #NOTLS option on the environment.

        <h3><Transactions, Rollbacks, etc.</h3>

        To actually get anything done, a transaction must be committed using #txn_commit(). Alternatively, all of a transaction's operations can be discarded
        using #txn_abort(). In a read-only transaction, any cursors will <b>not</b> automatically be freed. In a read-write transaction, all cursors will be
        freed and must not be used again.

        For read-only transactions, obviously there is nothing to commit to storage. The transaction still must eventually be aborted to close any database
        handle(s) opened in it, or committed to keep the database handles around for reuse in new transactions.

        In addition, as long as a transaction is open, a consistent view of the database is kept alive, which requires storage. A read-only transaction that no
        longer requires this consistent view should be terminated (committed or aborted) when the view is no longer needed (but see below for an optimization).

        There can be multiple simultaneously active read-only transactions but only one that can write. Once a single read-write transaction is opened, all
        further attempts to begin one will block until the first one is committed or aborted. This has no effect on read-only transactions, however, and they
        may continue to be opened at any time.

        <h3>Duplicate Keys</h3>

        #get() and #put() respectively have no and only some support for multiple key/value pairs with identical keys. If there are multiple values for a key,
        #get() will only return the first value.

        When multiple values for one key are required, pass the #DUPSORT flag to #dbi_open(). In an #DUPSORT database, by default #put() will not replace the
        value for a key if the key existed already. Instead it will add the new value to the key. In addition, #del() will pay attention to the value field
        too, allowing for specific values of a key to be deleted.

        Finally, additional cursor operations become available for traversing through and retrieving duplicate values.

        <h3>Some Optimization</h3>

        If you frequently begin and abort read-only transactions, as an optimization, it is possible to only reset and renew a transaction.

        #txn_reset() releases any old copies of data kept around for a read-only transaction. To reuse this reset transaction, call #txn_renew() on it. Any
        cursors in this transaction must also be renewed using #cursor_renew().

        Note that #txn_reset() is similar to #txn_abort() and will close any databases you opened within the transaction.

        To permanently free a transaction, reset or not, use #txn_abort().

        <h3>Cleaning Up</h3>

        For read-only transactions, any cursors created within it must be closed using #cursor_close().

        It is very rarely necessary to close a database handle, and in general they should just be left open.
        """

    IntConstant(
        "mmap at a fixed address (experimental).",

        "FIXEDMAP"..0x01
    )

    IntConstant(
        "No environment directory.",

        "NOSUBDIR"..0x4000
    )

    IntConstant(
        "Don't fsync after commit.",

        "NOSYNC"..0x10000
    )

    IntConstant(
        "Read only.",

        "RDONLY"..0x20000
    )

    IntConstant(
        "Don't fsync metapage after commit.",

        "NOMETASYNC"..0x40000
    )

    IntConstant(
        "Use writable mmap.",

        "WRITEMAP"..0x80000
    )

    IntConstant(
        "Use asynchronous msync when #WRITEMAP is used.",

        "MAPASYNC"..0x100000
    )

    IntConstant(
        "Tie reader locktable slots to {@code MDB_txn} objects instead of to threads.",

        "NOTLS"..0x200000
    )

    IntConstant(
        "Don't do any locking, caller must manage their own locks.",

        "NOLOCK"..0x400000
    )

    IntConstant(
        "Don't do readahead (no effect on Windows).",

        "NORDAHEAD"..0x800000
    )

    IntConstant(
        "Don't initialize malloc'd memory before writing to datafile.",

        "NOMEMINIT"..0x1000000
    )

    IntConstant(
        "Use reverse string keys.",

        "REVERSEKEY"..0x02
    )

    IntConstant(
        "Use sorted duplicates.",

        "DUPSORT"..0x04
    )

    IntConstant(
        "Numeric keys in native byte order: either {@code unsigned int} or {@code size_t}. The keys must all be of the same size.",

        "INTEGERKEY"..0x08
    )

    IntConstant(
        "With #DUPSORT, sorted dup items have fixed size.",

        "DUPFIXED"..0x10
    )

    IntConstant(
        "With #DUPSORT, dups are #INTEGERKEY -style integers.",

        "INTEGERDUP"..0x20
    )

    IntConstant(
        "With #DUPSORT, use reverse string dups.",

        "REVERSEDUP"..0x40
    )

    IntConstant(
        "Create DB if not already existing.",

        "CREATE"..0x40000
    )

    IntConstant(
        "Don't write if the key already exists.",

        "NOOVERWRITE"..0x10
    )

    IntConstant(
        "Remove all duplicate data items.",

        "NODUPDATA"..0x20
    )

    IntConstant(
        "Overwrite the current key/data pair.",

        "CURRENT"..0x40
    )

    IntConstant(
        "Just reserve space for data, don't copy it. Return a pointer to the reserved space.",

        "RESERVE"..0x10000
    )

    IntConstant(
        "Data is being appended, don't split full pages.",

        "APPEND"..0x20000
    )

    IntConstant(
        "Duplicate data is being appended, don't split full pages.",

        "APPENDDUP"..0x40000
    )

    IntConstant(
        "Store multiple data items in one call. Only for #DUPFIXED.",

        "MULTIPLE"..0x80000
    )

    IntConstant(
        "Omit free space from copy, and renumber all pages sequentially.",

        "CP_COMPACT"..0x01
    )

    EnumConstant(
        "MDB_cursor_op",

        "FIRST".enum("Position at first key/data item."),
        "FIRST_DUP".enum("Position at first data item of current key. Only for #DUPSORT."),
        "GET_BOTH".enum("Position at key/data pair. Only for #DUPSORT."),
        "GET_BOTH_RANGE".enum("position at key, nearest data. Only for #DUPSORT."),
        "GET_CURRENT".enum("Return key/data at current cursor position."),
        "GET_MULTIPLE".enum("Return key and up to a page of duplicate data items from current cursor position. Move cursor to prepare for #NEXT_MULTIPLE. Only for #DUPFIXED."),
        "LAST".enum("Position at last key/data item."),
        "LAST_DUP".enum("Position at last data item of current key. Only for #DUPSORT."),
        "NEXT".enum("Position at next data item."),
        "NEXT_DUP".enum("Position at next data item of current key. Only for #DUPSORT."),
        "NEXT_MULTIPLE".enum(
            "Return key and up to a page of duplicate data items from next cursor position. Move cursor to prepare for #NEXT_MULTIPLE. Only for #DUPFIXED."
        ),
        "NEXT_NODUP".enum("Position at first data item of next key."),
        "PREV".enum("Position at previous data item."),
        "PREV_DUP".enum("Position at previous data item of current key. Only for #DUPSORT."),
        "PREV_NODUP".enum("Position at last data item of previous key."),
        "SET".enum("Position at specified key."),
        "SET_KEY".enum("Position at specified key, return key + data."),
        "SET_RANGE".enum("Position at first key greater than or equal to specified key."),
        "PREV_MULTIPLE".enum("Position at previous page and return key and up to a page of duplicate data items. Only for #DUPFIXED.")
    )

    IntConstant(
        "Successful result.",

        "SUCCESS".."0"
    )

    IntConstant(
        "Key/data pair already exists.",

        "KEYEXIST".."-30799"
    )

    IntConstant(
        "Key/data pair not found (EOF).",

        "NOTFOUND".."-30798"
    )

    IntConstant(
        "Requested page not found - this usually indicates corruption.",

        "PAGE_NOTFOUND".."-30797"
    )

    IntConstant(
        "Located page was wrong type.",

        "CORRUPTED".."-30796"
    )

    IntConstant(
        "Update of meta page failed or environment had fatal error.",

        "PANIC".."-30795"
    )

    IntConstant(
        "Environment version mismatch.",

        "VERSION_MISMATCH".."-30794"
    )

    IntConstant(
        "File is not a valid LMDB file.",

        "INVALID".."-30793"
    )

    IntConstant(
        "Environment mapsize reached.",

        "MAP_FULL".."-30792"
    )

    IntConstant(
        "Environment maxdbs reached.",

        "DBS_FULL".."-30791"
    )

    IntConstant(
        "Environment maxreaders reached.",

        "READERS_FULL".."-30790"
    )

    IntConstant(
        "Too many TLS keys in use - Windows only.",

        "TLS_FULL".."-30789"
    )

    IntConstant(
        "Txn has too many dirty pages.",

        "TXN_FULL".."-30788"
    )

    IntConstant(
        "Cursor stack too deep - internal error.",

        "CURSOR_FULL".."-30787"
    )

    IntConstant(
        "Page has not enough space - internal error.",

        "PAGE_FULL".."-30786"
    )

    IntConstant(
        "Database contents grew beyond environment mapsize.",

        "MAP_RESIZED".."-30785"
    )

    IntConstant(
        """
        The operation expects an #DUPSORT / #DUPFIXED database. Opening a named DB when the unnamed DB has #DUPSORT / #INTEGERKEY. Accessing a data record as a
        database, or vice versa. The database was dropped and recreated with different flags.
        """,

        "INCOMPATIBLE".."-30784"
    )

    IntConstant(
        "Invalid reuse of reader locktable slot.",

        "BAD_RSLOT".."-30783"
    )

    IntConstant(
        "Transaction must abort, has a child, or is invalid.",

        "BAD_TXN".."-30782"
    )

    IntConstant(
        "Unsupported size of key/DB name/data, or wrong #DUPFIXED size.",

        "BAD_VALSIZE".."-30781"
    )

    IntConstant(
        "The specified DBI was changed unexpectedly.",

        "BAD_DBI".."-30780"
    )

    IntConstant(
        "Unexpected problem - txn should abort.",

        "PROBLEM".."-30779"
    )

    IntConstant(
        "The last defined error code.",

        "LAST_ERRCODE".."MDB_PROBLEM"
    )

    charASCII_p(
        "version",
        "Returns the LMDB library version information.",

        Check(1)..nullable..int_p.OUT("major", "if non-#NULL, the library major version number is copied here"),
        Check(1)..nullable..int_p.OUT("minor", "if non-#NULL, the library minor version number is copied here"),
        Check(1)..nullable..int_p.OUT("patch", "if non-#NULL, the library patch version number is copied here"),

        returnDoc = "the library version as a string"
    )

    charASCII_p(
        "strerror",
        """
        Returns a string describing a given error code.

        This function is a superset of the ANSI C X3.159-1989 (ANSI C) strerror(3) function. If the error code is greater than or equal to 0, then the string
        returned by the system function strerror(3) is returned. If the error code is less than 0, an error string corresponding to the LMDB library error is
        returned.
        """,

        int.IN("err", "the error code"),

        returnDoc = "the description of the error"
    )

    int(
        "env_create",
        """
        Creates an LMDB environment handle.

        This function allocates memory for a {@code MDB_env} structure. To release the allocated memory and discard the handle, call #env_close(). Before the
        handle may be used, it must be opened using #env_open(). Various other options may also need to be set before opening the handle, e.g.
        #env_set_mapsize(), #env_set_maxreaders(), #env_set_maxdbs(), depending on usage requirements.
        """,

        Check(1)..MDB_env_pp.OUT("env", "the address where the new handle will be stored"),

        returnDoc = "a non-zero error value on failure and 0 on success"
    )

    val env_open = int(
        "env_open",
        """
        Opens an environment handle.

        If this function fails, #env_close() must be called to discard the {@code MDB_env} handle.
        """,

        MDB_env_p.IN("env", "an environment handle returned by #env_create()"),
        const..charUTF8_p.IN("path", "the directory in which the database files reside. This directory must already exist and be writable."),
        unsigned_int.IN(
            "flags",
            """
            Special options for this environment. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here. Flags
            set by #env_set_flags() are also used.
            ${ul(
                """#FIXEDMAP

                Use a fixed address for the mmap region. This flag must be specified when creating the environment, and is stored persistently in the
                environment. If successful, the memory map will always reside at the same virtual address and pointers used to reference data items in the
                database will be constant across multiple invocations. This option may not always work, depending on how the operating system has allocated
                memory to shared libraries and other uses.

                 The feature is highly experimental.
                 """,
                """#NOSUBDIR

                By default, LMDB creates its environment in a directory whose pathname is given in {@code path}, and creates its data and lock files under that
                directory. With this option, {@code path} is used as-is for the database main data file. The database lock file is the {@code path}    with
                "-lock" appended.
                 """,
                """#RDONLY

                Open the environment in read-only mode. No write operations will be allowed. LMDB will still modify the lock file - except on read-only
                filesystems, where LMDB does not use locks.
                 """,
                """#WRITEMAP

                Use a writeable memory map unless #RDONLY is set. This uses fewer mallocs but loses protection from application bugs like wild pointer writes
                and other bad updates into the database. This may be slightly faster for DBs that fit entirely in RAM, but is slower for DBs larger than RAM.

                Incompatible with nested transactions.

                Do not mix processes with and without #WRITEMAP on the same environment. This can defeat durability (#env_sync() etc).
                 """,
                """#NOMETASYNC

                Flush system buffers to disk only once per transaction, omit the metadata flush. Defer that until the system flushes files to disk, or next
                non-#RDONLY commit or #env_sync(). This optimization maintains database integrity, but a system crash may undo the last committed transaction.
                I.e. it preserves the ACI (atomicity, consistency, isolation) but not D (durability) database property.

                This flag may be changed at any time using #env_set_flags().
                 """,
                """#NOSYNC

                Don't flush system buffers to disk when committing a transaction. This optimization means a system crash can corrupt the database or lose the
                last transactions if buffers are not yet flushed to disk. The risk is governed by how often the system flushes dirty buffers to disk and how
                often #env_sync() is called. However, if the filesystem preserves write order and the #WRITEMAP flag is not used, transactions exhibit ACI
                (atomicity, consistency, isolation) properties and only lose D (durability). I.e. database integrity is maintained, but a system crash may undo
                the final transactions. Note that (#NOSYNC | #WRITEMAP) leaves the system with no hint for when to write transactions to disk, unless
                #env_sync() is called. (#MAPASYNC | #WRITEMAP) may be preferable.

                 This flag may be changed at any time using #env_set_flags().
                 """,
                """#MAPASYNC

                When using #WRITEMAP, use asynchronous flushes to disk. As with #NOSYNC, a system crash can then corrupt the database or lose the last
                transactions. Calling #env_sync() ensures on-disk database integrity until next commit.

                This flag may be changed at any time using #env_set_flags().
                 """,
                """#NOTLS

                Don't use Thread-Local Storage. Tie reader locktable slots to {@code MDB_txn} objects instead of to threads. I.e. #txn_reset() keeps the slot
                reseved for the {@code MDB_txn} object. A thread may use parallel read-only transactions. A read-only transaction may span threads if the user
                synchronizes its use. Applications that multiplex many user threads over individual OS threads need this option. Such an application must also
                serialize the write transactions in an OS thread, since LMDB's write locking is unaware of the user threads.
                 """,
                """#NOLOCK

                Don't do any locking. If concurrent access is anticipated, the caller must manage all concurrency itself. For proper operation the caller must
                enforce single-writer semantics, and must ensure that no readers are using old transactions while a writer is active. The simplest approach is
                to use an exclusive lock so that no readers may be active at all when a writer begins.
                """,
                """#NORDAHEAD
                Turn off readahead. Most operating systems perform readahead on read requests by default. This option turns it off if the OS supports it.
                Turning it off may help random read performance when the DB is larger than RAM and system RAM is full.

                The option is not implemented on Windows.
                 """,
                """#NOMEMINIT
                Don't initialize malloc'd memory before writing to unused spaces in the data file. By default, memory for pages written to the data file is
                obtained using malloc. While these pages may be reused in subsequent transactions, freshly malloc'd pages will be initialized to zeroes before
                use. This avoids persisting leftover data from other code (that used the heap and subsequently freed the memory) into the data file. Note that
                many other system libraries may allocate and free memory from the heap for arbitrary uses. E.g., stdio may use the heap for file I/O buffers.
                This initialization step has a modest performance cost so some applications may want to disable it using this flag. This option can be a
                problem for applications which handle sensitive data like passwords, and it makes memory checkers like Valgrind noisy. This flag is not needed
                with #WRITEMAP, which writes directly to the mmap instead of using malloc for pages. The initialization is also skipped if #RESERVE is used;
                the caller is expected to overwrite all of the memory that was reserved in that case.

                This flag may be changed at any time using #env_set_flags().
                """
            )}
            """
        ),
        mdb_mode_t.IN(
            "mode",
            """
            The UNIX permissions to set on created files and semaphores.

            This parameter is ignored on Windows.
            """
        ),

        returnDoc =
        """
        a non-zero error value on failure and 0 on success. Some possible errors are:
        ${ul(
            "#VERSION_MISMATCH - the version of the LMDB library doesn't match the version that created the database environment.",
            "#INVALID - the environment file headers are corrupted.",
            "{@code ENOENT} - the directory specified by the path parameter doesn't exist.",
            "{@code EACCES} - the user didn't have permission to access the environment files.",
            "{@code EAGAIN} - the environment was locked by another process."
        )}
        """
    )

    int(
        "env_copy",
        """
        Copies an LMDB environment to the specified path.

        This function may be used to make a backup of an existing environment. No lockfile is created, since it gets recreated at need.

        This call can trigger significant file size growth if run in parallel with write transactions, because it employs a read-only transaction.
        """,

        MDB_env_p.IN("env", "an environment handle returned by #env_create(). It must have already been opened successfully."),
        const..charUTF8_p.IN(
            "path",
            "the directory in which the copy will reside. This directory must already exist and be writable but must otherwise be empty."
        ),

        returnDoc = "a non-zero error value on failure and 0 on success"
    )

    /*int(
        "env_copyfd",
        "",

        MDB_env_p.IN("env", ""),
        mdb_filehandle_t.IN("fd", "")
    )*/

    int(
        "env_copy2",
        """
        Copies an LMDB environment to the specified path, with options.

        This function may be used to make a backup of an existing environment. No lockfile is created, since it gets recreated at need.

        This call can trigger significant file size growth if run in parallel with write transactions, because it employs a read-only transaction.
        """,

        MDB_env_p.IN("env", "an environment handle returned by #env_create(). It must have already been opened successfully."),
        const..charUTF8_p.IN(
            "path",
            "the directory in which the copy will reside. This directory must already exist and be writable but must otherwise be empty."
        ),
        unsigned_int.IN(
            "flags",
            """
            special options for this operation. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here.
            ${ul(
                """
                #CP_COMPACT - Perform compaction while copying: omit free pages and sequentially renumber all pages in output. This option consumes more CPU
                and runs more slowly than the default.
                """
            )}
            """
        )
    )

    /*int(
        "env_copyfd2",
        "",

        MDB_env_p.IN("env", ""),
        mdb_filehandle_t.IN("fd", ""),
        unsigned_int.IN("flags", "")
    )*/

    int(
        "env_stat",
        "Returns statistics about the LMDB environment.",

        env_open["env"],
        MDB_stat_p.OUT("stat", "the address of an ##MDBStat structure where the statistics will be copied"),

        returnDoc = "a non-zero error value on failure and 0 on success"
    )

    int(
        "env_info",
        "Returns information about the LMDB environment.",

        env_open["env"],
        MDB_envinfo_p.OUT("stat", "the address of an ##MDBEnvInfo structure where the information will be copied"),

        returnDoc = "a non-zero error value on failure and 0 on success"
    )

    int(
        "env_sync",
        """
        Flushes the data buffers to disk.

        Data is always written to disk when #txn_commit() is called, but the operating system may keep it buffered. LMDB always flushes the OS buffers upon
        commit as well, unless the environment was opened with #NOSYNC or in part #NOMETASYNC. This call is not valid if the environment was opened with
        #RDONLY.
        """,

        env_open["env"],
        intb.IN(
            "force",
            """
            if non-zero, force a synchronous flush. Otherwise if the environment has the #NOSYNC flag set the flushes will be omitted, and with #MAPASYNC they
            will be asynchronous.
            """
        ),

        returnDoc =
        """
        a non-zero error value on failure and 0 on success. Some possible errors are:
        ${ul(
            "{@code EACCES} - the environment is read-only.",
            "{@code EINVAL} - an invalid parameter was specified.",
            "{@code EIO} - an error occurred during synchronization."
        )}
        """
    )

    void(
        "env_close",
        """
        Closes the environment and releases the memory map.

        Only a single thread may call this function. All transactions, databases, and cursors must already be closed before calling this function. Attempts to
        use any such handles after calling this function will cause a SIGSEGV. The environment handle will be freed and must not be used again after this call.
        """,

        env_open["env"]
    )

    int(
        "env_set_flags",
        """
        Sets environment flags.

        This may be used to set some flags in addition to those from #env_open(), or to unset these flags. If several threads change the flags at the same
        time, the result is undefined.
        """,

        env_open["env"],
        unsigned_int.IN("flags", "the flags to change, bitwise OR'ed together"),
        intb.IN("onoff", "a non-zero value sets the flags, zero clears them."),

        returnDoc =
        """
        a non-zero error value on failure and 0 on success. Some possible errors are:
        ${ul(
            "{@code EINVAL} - an invalid parameter was specified."
        )}
        """
    )

    int(
        "env_get_flags",
        "Gets environment flags.",

        env_open["env"],
        Check(1)..unsigned_int_p.OUT("flags", "the address of an integer to store the flags"),

        returnDoc = "a non-zero error value on failure and 0 on success"
    )

    int(
        "env_get_path",
        "Returns the path that was used in #env_open().",

        env_open["env"],
        Check(1)..CharType("const char", CharMapping.UTF8).p.p.OUT(
            "path",
            "address of a string pointer to contain the path. This is the actual string in the environment, not a copy. It should not be altered in any way."
        ),

        returnDoc = "a non-zero error value on failure and 0 on success"
    )

    /*int(
        "env_get_fd",
        "",

        MDB_env_p.IN("env", ""),
        mdb_filehandle_t_p.OUT("fd", "")
    )*/

    int(
        "env_set_mapsize",
        """
        Sets the size of the memory map to use for this environment.

        The size should be a multiple of the OS page size. The default is 10485760 bytes. The size of the memory map is also the maximum size of the database.
        The value should be chosen as large as possible, to accommodate future growth of the database.

        This function should be called after #env_create() and before #env_open(). It may be called at later times if no transactions are active in this
        process. Note that the library does not check for this condition, the caller must ensure it explicitly.

        The new size takes effect immediately for the current process but will not be persisted to any others until a write transaction has been committed by
        the current process. Also, only mapsize increases are persisted into the environment.

        If the mapsize is increased by another process, and data has grown beyond the range of the current mapsize, #txn_begin() will return #MAP_RESIZED. This
        function may be called with a size of zero to adopt the new size.

        Any attempt to set a size smaller than the space already consumed by the environment will be silently changed to the current size of the used space.
        """,

        env_open["env"],
        mdb_size_t.IN("size", "the size in bytes"),

        returnDoc =
        """
        a non-zero error value on failure and 0 on success. Some possible errors are:
        ${ul(
            "{@code EINVAL} - an invalid parameter was specified, or the environment has an active write transaction."
        )}
        """
    )

    int(
        "env_set_maxreaders",
        """
        Sets the maximum number of threads/reader slots for the environment.

        This defines the number of slots in the lock table that is used to track readers in the environment. The default is 126.

        Starting a read-only transaction normally ties a lock table slot to the current thread until the environment closes or the thread exits. If #NOTLS is
        in use, #txn_begin() instead ties the slot to the {@code MDB_txn} object until it or the {@code MDB_env} object is destroyed.

        This function may only be called after #env_create() and before #env_open().
        """,

        env_open["env"],
        unsigned_int.IN("readers", "the maximum number of reader lock table slots"),

        returnDoc =
        """
        a non-zero error value on failure and 0 on success. Some possible errors are:
        ${ul(
            "{@code EINVAL} - an invalid parameter was specified, or the environment is already open."
        )}
        """
    )

    int(
        "env_get_maxreaders",
        "Gets the maximum number of threads/reader slots for the environment.",

        env_open["env"],
        Check(1)..unsigned_int_p.OUT("readers", "address of an integer to store the number of readers"),

        returnDoc = "a non-zero error value on failure and 0 on success"
    )

    int(
        "env_set_maxdbs",
        """
        Sets the maximum number of named databases for the environment.

        This function is only needed if multiple databases will be used in the environment. Simpler applications that use the environment as a single unnamed
        database can ignore this option.

        This function may only be called after #env_create() and before #env_open().

        Currently a moderate number of slots are cheap but a huge number gets expensive: 7-120 words per transaction, and every #dbi_open() does a linear
        search of the opened slots.
        """,

        env_open["env"],
        MDB_dbi.IN("dbs", "the maximum number of databases"),

        returnDoc =
        """
        a non-zero error value on failure and 0 on success. Some possible errors are:
        ${ul(
            "{@code EINVAL} - an invalid parameter was specified, or the environment is already open."
        )}
        """
    )

    int(
        "env_get_maxkeysize",
        """
        Gets the maximum size of keys and #DUPSORT data we can write.

        Depends on the compile-time constant {@code MAXKEYSIZE}. Default 511.
        """,

        env_open["env"]
    )

    int(
        "env_set_userctx",
        "Set application information associated with the {@code MDB_env}.",

        env_open["env"],
        opaque_p.IN("ctx", "an arbitrary pointer for whatever the application needs")
    )

    opaque_p(
        "env_get_userctx",
        "Gets the application information associated with the {@code MDB_env}.",

        env_open["env"]
    )

    /*int(
        "env_set_assert",
        "",

        MDB_env_p.IN("env", ""),
        MDB_assert_func_p.OUT("func", "")
    )*/

    int(
        "txn_begin",
        """
        Creates a transaction for use with the environment.

        The transaction handle may be discarded using #txn_abort() or #txn_commit().

        A transaction and its cursors must only be used by a single thread, and a thread may only have a single transaction at a time. If #NOTLS is in use,
        this does not apply to read-only transactions.

        Cursors may not span transactions.
        """,

        env_open["env"],
        nullable..MDB_txn_p.IN(
            "parent",
            """
            if this parameter is non-#NULL, the new transaction will be a nested transaction, with the transaction indicated by {@code parent} as its parent.
            Transactions may be nested to any level. A parent transaction and its cursors may not issue any other operations than #txn_commit() and
            #txn_abort() while it has active child transactions.
            """
        ),
        unsigned_int.IN(
            "flags",
            """
            special options for this transaction. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here.
            ${ul(
                "#RDONLY - This transaction will not perform any write operations.",
                "#NOSYNC - Don't flush system buffers to disk when committing this transaction.",
                "#NOMETASYNC - Flush system buffers but omit metadata flush when committing this transaction."
            )}
            """
        ),
        Check(1)..MDB_txn_pp.OUT("txn", "address where the new {@code MDB_txn} handle will be stored"),

        returnDoc =
        """
        a non-zero error value on failure and 0 on success. Some possible errors are:
        ${ul(
            "#PANIC - a fatal error occurred earlier and the environment must be shut down.",
            """
            #MAP_RESIZED - another process wrote data beyond this {@code MDB_env}'s mapsize and this environment's map must be resized as well. See
            #env_set_mapsize().
            """,
            "#READERS_FULL - a read-only transaction was requested and the reader lock table is full. See #env_set_maxreaders().",
            "{@code ENOMEM} - out of memory."
        )}
        """
    )

    val txn_env = MDB_env_p(
        "txn_env",
        "Returns the transaction's {@code MDB_env}.",

        MDB_txn_p.IN("txn", "a transaction handle returned by #txn_begin().")
    )

    mdb_size_t(
        "txn_id",
        """
        Returns the transaction's ID.

        This returns the identifier associated with this transaction. For a read-only transaction, this corresponds to the snapshot being read; concurrent
        readers will frequently have the same transaction ID.
        """,

        txn_env["txn"],

        returnDoc = "a transaction ID, valid if input is an active transaction"
    )

    int(
        "txn_commit",
        """
        Commits all the operations of a transaction into the database.

        The transaction handle is freed. It and its cursors must not be used again after this call, except with #cursor_renew().

        Earlier documentation incorrectly said all cursors would be freed. Only write-transactions free cursors.
        """,

        txn_env["txn"],

        returnDoc =
        """
        a non-zero error value on failure and 0 on success. Some possible errors are:
        ${ul(
            "{@code EINVAL} - an invalid parameter was specified.",
            "{@code ENOSPC} - no more disk space.",
            "{@code EIO} - a low-level I/O error occurred while writing.",
            "{@code ENOMEM} - out of memory."
        )}
        """
    )

    void(
        "txn_abort",
        """
        Abandons all the operations of the transaction instead of saving them.

        The transaction handle is freed. It and its cursors must not be used again after this call, except with #cursor_renew().

        Earlier documentation incorrectly said all cursors would be freed. Only write-transactions free cursors.
        """",

        txn_env["txn"]
    )

    void(
        "txn_reset",
        """
        Resets a read-only transaction.

        Aborts the transaction like #txn_abort(), but keeps the transaction handle. #txn_renew() may reuse the handle. This saves allocation overhead if the
        process will start a new read-only transaction soon, and also locking overhead if #NOTLS is in use. The reader table lock is released, but the table
        slot stays tied to its thread or {@code MDB_txn}. Use #txn_abort() to discard a reset handle, and to free its lock table slot if #NOTLS is in use.

        Cursors opened within the transaction must not be used again after this call, except with #cursor_renew().

        Reader locks generally don't interfere with writers, but they keep old versions of database pages allocated. Thus they prevent the old pages from being
        reused when writers commit new data, and so under heavy load the database size may grow much more rapidly than otherwise.
        """,

        txn_env["txn"]
    )

    int(
        "txn_renew",
        """
        Renews a read-only transaction.

        This acquires a new reader lock for a transaction handle that had been released by #txn_reset(). It must be called before a reset transaction may be
        used again.
        """,

        txn_env["txn"]
    )

    int(
        "dbi_open",
        """
        Opens a database in the environment.

        A database handle denotes the name and parameters of a database, independently of whether such a database exists. The database handle may be discarded
        by calling #dbi_close(). The old database handle is returned if the database was already open. The handle may only be closed once.

        The database handle will be private to the current transaction until the transaction is successfully committed. If the transaction is aborted the
        handle will be closed automatically. After a successful commit the handle will reside in the shared environment, and may be used by other transactions.

        This function must not be called from multiple concurrent transactions in the same process. A transaction that uses this function must finish (either
        commit or abort) before any other transaction in the process may use this function.

        To use named databases (with {@code name} != #NULL), #env_set_maxdbs() must be called before opening the environment. Database names are keys in the
        unnamed database, and may be read but not written.
        """,

        txn_env["txn"],
        nullable..const..charUTF8_p.IN(
            "name",
            "the name of the database to open. If only a single database is needed in the environment, this value may be #NULL."
        ),
        unsigned_int.IN(
            "flags",
            """
            special options for this database. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here.
            ${ul(
                """#REVERSEKEY

                Keys are strings to be compared in reverse order, from the end of the strings to the beginning. By default, Keys are treated as strings and
                compared from beginning to end.
                """,
                """#DUPSORT

                Duplicate keys may be used in the database. (Or, from another perspective, keys may have multiple data items, stored in sorted order.) By
                default keys must be unique and may have only a single data item.
                """,
                """#INTEGERKEY

                Keys are binary integers in native byte order, either {@code unsigned int} or {@code mdb_size_t}, and will be sorted as such. The keys must all be
                of the same size.
                """,
                """#DUPFIXED

                This flag may only be used in combination with #DUPSORT. This option tells the library that the data items for this database are all the same
                size, which allows further optimizations in storage and retrieval. When all data items are the same size, the #GET_MULTIPLE, #NEXT_MULTIPLE and
                #PREV_MULTIPLE cursor operations may be used to retrieve multiple items at once.
                """,
                """#INTEGERDUP

                This option specifies that duplicate data items are binary integers, similar to #INTEGERKEY keys.
                """,
                """#REVERSEDUP

                This option specifies that duplicate data items should be compared as strings in reverse order.
                """,
                """#CREATE

                Create the named database if it doesn't exist. This option is not allowed in a read-only transaction or a read-only environment.
                """
            )}
            """
        ),
        Check(1)..MDB_dbi_p.OUT("dbi", "address where the new {@code MDB_dbi} handle will be stored"),

        returnDoc =
        """
        a non-zero error value on failure and 0 on success. Some possible errors are:
        ${ul(
            "#NOTFOUND - the specified database doesn't exist in the environment and #CREATE was not specified.",
            "#DBS_FULL - too many databases have been opened. See #env_set_maxdbs()."
        )}
        """
    )

    val stat = int(
        "stat",
        "Retrieves statistics for a database.",

        txn_env["txn"],
        MDB_dbi.IN("dbi", "a database handle returned by #dbi_open()"),
        MDB_stat_p.OUT("stat", "the address of an ##MDBStat structure where the statistics will be copied")
    )

    int(
        "dbi_flags",
        "Retrieve the DB flags for a database handle.",

        txn_env["txn"],
        stat["dbi"],
        Check(1)..unsigned_int_p.OUT("flags", "address where the flags will be returned")
    )

    void(
        "dbi_close",
        """
        Closes a database handle. Normally unnecessary. Use with care:

        This call is not mutex protected. Handles should only be closed by a single thread, and only if no other threads are going to reference the database
        handle or one of its cursors any further. Do not close a handle if an existing transaction has modified its database. Doing so can cause misbehavior
        from database corruption to errors like #BAD_VALSIZE (since the DB name is gone).

        Closing a database handle is not necessary, but lets #dbi_open() reuse the handle value. Usually it's better to set a bigger #env_set_maxdbs(), unless
        that value would be large.
        """,

        env_open["env"],
        stat["dbi"]
    )

    int(
        "drop",
        """
        Empties or deletes+closes a database.

        See #dbi_close() for restrictions about closing the DB handle.
        """,

        txn_env["txn"],
        stat["dbi"],
        intb.IN("del", "0 to empty the DB, 1 to delete it from the environment and close the DB handle")
    )

    int(
        "set_compare",
        """
        Sets a custom key comparison function for a database.

        The comparison function is called whenever it is necessary to compare a key specified by the application with a key currently stored in the database.
        If no comparison function is specified, and no special key flags were specified with #dbi_open(), the keys are compared lexically, with shorter keys
        collating before longer keys.

        This function must be called before any data access functions are used, otherwise data corruption may occur. The same comparison function must be used
        by every program accessing the database, every time the database is used.
        """,

        txn_env["txn"],
        stat["dbi"],
        MDB_cmp_func.IN("cmp", "an ##MDBCmpFunc function")
    )

    int(
        "set_dupsort",
        """
        Sets a custom data comparison function for a #DUPSORT database.

        This comparison function is called whenever it is necessary to compare a data item specified by the application with a data item currently stored in
        the database.

        This function only takes effect if the database was opened with the #DUPSORT flag.

        If no comparison function is specified, and no special key flags were specified with #dbi_open(), the data items are compared lexically, with shorter
        items collating before longer items.

        This function must be called before any data access functions are used, otherwise data corruption may occur. The same comparison function must be used
        by every program accessing the database, every time the database is used.
        """,

        txn_env["txn"],
        stat["dbi"],
        MDB_cmp_func.IN("cmp", "an ##MDBCmpFunc function")
    )

    int(
        "set_relfunc",
        """
        Sets a relocation function for a #FIXEDMAP database.

        The relocation function is called whenever it is necessary to move the data of an item to a different position in the database (e.g. through tree
        balancing operations, shifts as a result of adds or deletes, etc.). It is intended to allow address/position-dependent data items to be stored in a
        database in an environment opened with the #FIXEDMAP option.

        Currently the relocation feature is unimplemented and setting this function has no effect.
        """,

        txn_env["txn"],
        stat["dbi"],
        MDB_rel_func.IN("rel", "an ##MDBRelFunc function")
    )

    int(
        "set_relctx",
        """
        Sets a context pointer for a #FIXEDMAP database's relocation function.

        See #set_relfunc() and ##MDBRelFunc for more details.
        """,

        txn_env["txn"],
        stat["dbi"],
        opaque_p.IN(
            "ctx",
            """
            an arbitrary pointer for whatever the application needs. It will be passed to the callback function set by ##MDBRelFunc as its {@code relctx}
            parameter whenever the callback is invoked.
            """
        )
    )

    int(
        "get",
        """
        Gets items from a database.

        This function retrieves key/data pairs from the database. The address and length of the data associated with the specified {@code key} are returned in
        the structure to which {@code data} refers.

        If the database supports duplicate keys (#DUPSORT) then the first data item for the key will be returned. Retrieval of other items requires the use of
        #cursor_get().

        The memory pointed to by the returned values is owned by the database. The caller need not dispose of the memory, and may not modify it in any way. For
        values returned in a read-only transaction any modification attempts will cause a SIGSEGV.

        Values returned from the database are valid only until a subsequent update operation, or the end of the transaction.
        """,

        txn_env["txn"],
        stat["dbi"],
        MDB_val_p.IN("key", "the key to search for in the database"),
        MDB_val_p.OUT("data", "the data corresponding to the key")
    )

    int(
        "put",
        """
        Stores items into a database.

        This function stores key/data pairs in the database. The default behavior is to enter the new key/data pair, replacing any previously existing key if
        duplicates are disallowed, or adding a duplicate data item if duplicates are allowed (#DUPSORT).
        """,

        txn_env["txn"],
        stat["dbi"],
        MDB_val_p.IN("key", "the key to store in the database"),
        MDB_val_p.IN("data", "the data to store"),
        unsigned_int.IN(
            "flags",
            """
            special options for this operation. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here.
            ${ul(
                """
                #NODUPDATA - enter the new key/data pair only if it does not already appear in the database. This flag may only be specified if the database
                was opened with #DUPSORT. The function will return #KEYEXIST if the key/data pair already appears in the database.
                """,
                """
                #NOOVERWRITE - enter the new key/data pair only if the key does not already appear in the database. The function will return #KEYEXIST if the
                key already appears in the database, even if the database supports duplicates (#DUPSORT). The {@code data} parameter will be set to point to
                the existing item.
                """,
                """
                #RESERVE - reserve space for data of the given size, but don't copy the given data. Instead, return a pointer to the reserved space, which the
                caller can fill in later - before the next update operation or the transaction ends. This saves an extra memcpy if the data is being generated
                later.

                LMDB does nothing else with this memory, the caller is expected to modify all of the space requested. This flag must not be specified if the
                database was opened with #DUPSORT.
                """,
                """
                #APPEND - append the given key/data pair to the end of the database. This option allows fast bulk loading when keys are already known to be in
                the correct order. Loading unsorted keys with this flag will cause a #KEYEXIST error.
                """,
                "#APPENDDUP - as above, but for sorted dup data."
            )}
            """
        )
    )

    int(
        "del",
        """
        Deletes items from a database.

        This function removes key/data pairs from the database. If the database does not support sorted duplicate data items (#DUPSORT) the data parameter is
        ignored.

        If the database supports sorted duplicates and the data parameter is #NULL, all of the duplicate data items for the key will be deleted. Otherwise, if
        the data parameter is non-#NULL only the matching data item will be deleted.

        This function will return #NOTFOUND if the specified key/data pair is not in the database.
        """,

        txn_env["txn"],
        stat["dbi"],
        MDB_val_p.IN("key", "the key to delete from the database"),
        nullable..MDB_val_p.IN("data", "the data to delete")
    )

    int(
        "cursor_open",
        """
        Creates a cursor handle.

        A cursor is associated with a specific transaction and database. A cursor cannot be used when its database handle is closed. Nor when its transaction
        has ended, except with #cursor_renew().

        It can be discarded with #cursor_close().

        A cursor in a write-transaction can be closed before its transaction ends, and will otherwise be closed when its transaction ends.

        A cursor in a read-only transaction must be closed explicitly, before or after its transaction ends. It can be reused with #cursor_renew() before
        finally closing it.

        Earlier documentation said that cursors in every transaction were closed when the transaction committed or aborted.
        """,

        txn_env["txn"],
        stat["dbi"],
        Check(1)..MDB_cursor_pp.OUT("cursor", "address where the new {@code MDB_cursor} handle will be stored")
    )

    val cursor_close = void(
        "cursor_close",
        """
        Closes a cursor handle.

        The cursor handle will be freed and must not be used again after this call. Its transaction must still be live if it is a write-transaction.
        """,

        MDB_cursor_p.IN("cursor", "a cursor handle returned by #cursor_open()")
    )

    int(
        "cursor_renew",
        """
        Renews a cursor handle.

        A cursor is associated with a specific transaction and database. Cursors that are only used in read-only transactions may be re-used, to avoid
        unnecessary malloc/free overhead. The cursor may be associated with a new read-only transaction, and referencing the same database handle as it was
        created with. This may be done whether the previous transaction is live or dead.
        """,

        txn_env["txn"],
        cursor_close["cursor"]
    )

    MDB_txn_p(
        "cursor_txn",
        "Returns the cursor's transaction handle.",

        cursor_close["cursor"]
    )

    MDB_dbi(
        "cursor_dbi",
        "Return the cursor's database handle.",

        cursor_close["cursor"]
    )

    int(
        "cursor_get",
        """
        Retrieves by cursor.

        This function retrieves key/data pairs from the database. The address and length of the key are returned in the object to which {@code key} refers
        (except for the case of the #SET option, in which the {@code key} object is unchanged), and the address and length of the data are returned in the
        object to which {@code data} refers.

        See #get() for restrictions on using the output values.
        """,

        cursor_close["cursor"],
        MDB_val_p.IN("key", "the key for a retrieved item"),
        MDB_val_p.OUT("data", "the data of a retrieved item"),
        MDB_cursor_op.IN("op", "a cursor operation {@code MDB_cursor_op}")
    )

    int(
        "cursor_put",
        """
        Stores by cursor.

        This function stores key/data pairs into the database. The cursor is positioned at the new item, or on failure usually near it.

        Earlier documentation incorrectly said errors would leave the state of the cursor unchanged.
        """,

        cursor_close["cursor"],
        MDB_val_p.IN("key", "the key operated on"),
        MDB_val_p.IN("data", "the data operated on"),
        unsigned_int.IN(
            "flags",
            """
            options for this operation. This parameter must be set to 0 or one of the values described here.
            ${ul(
                """
                #CURRENT - replace the item at the current cursor position. The {@code key} parameter must still be provided, and must match it. If using
                sorted duplicates (#DUPSORT) the data item must still sort into the same place. This is intended to be used when the new data is the same size
                as the old. Otherwise it will simply perform a delete of the old record followed by an insert.
                 """,
                """
                #NODUPDATA - enter the new key/data pair only if it does not already appear in the database. This flag may only be specified if the database
                was opened with #DUPSORT. The function will return #KEYEXIST if the key/data pair already appears in the database.
                 """,
                """
                #NOOVERWRITE - enter the new key/data pair only if the key does not already appear in the database. The function will return #KEYEXIST if
                the key already appears in the database, even if the database supports duplicates (#DUPSORT).
                 """,
                """
                #RESERVE - reserve space for data of the given size, but don't copy the given data. Instead, return a pointer to the reserved space, which
                the caller can fill in later - before the next update operation or the transaction ends. This saves an extra memcpy if the data is being
                generated later. This flag must not be specified if the database was opened with #DUPSORT.
                 """,
                """
                #APPEND - append the given key/data pair to the end of the database. No key comparisons are performed. This option allows fast bulk loading
                when keys are already known to be in the correct order. Loading unsorted keys with this flag will cause a #KEYEXIST error.
                 """,
                "#APPENDDUP - as above, but for sorted dup data.",
                """
                #MULTIPLE - store multiple contiguous data elements in a single request. This flag may only be specified if the database was opened with
                #DUPFIXED. The {@code data} argument must be an array of two ##MDBVal. The {@code mv_size} of the first {@code MDBVal} must be the size of a
                single data element. The {@code mv_data} of the first {@code MDBVal} must point to the beginning of the array of contiguous data elements. The
                {@code mv_size} of the second {@code MDBVal} must be the count of the number of data elements to store. On return this field will be set to the
                count of the number of elements actually written. The {@code mv_data} of the second {@code MDBVal} is unused.
                """
            )}
            """
        )
    )

    int(
        "cursor_del",
        """
        Deletes current key/data pair.

        This function deletes the key/data pair to which the cursor refers.
        """,

        cursor_close["cursor"],
        unsigned_int.IN(
            "flags",
            """
            options for this operation. This parameter must be set to 0 or one of the values described here.
            ${ul(
                "#NODUPDATA - delete all of the data items for the current key. This flag may only be specified if the database was opened with #DUPSORT."
            )}
            """
        )
    )

    int(
        "cursor_count",
        """
        Returns count of duplicates for current key.

        This call is only valid on databases that support sorted duplicate data items #DUPSORT.
        """,

        cursor_close["cursor"],
        Check(1)..mdb_size_t_p.OUT("countp", "address where the count will be stored")
    )

    int(
        "cmp",
        """
        Compares two data items according to a particular database.

        This returns a comparison as if the two data items were keys in the specified database.
        """,

        txn_env["txn"],
        stat["dbi"],
        const..MDB_val_p.IN("a", "the first item to compare"),
        const..MDB_val_p.IN("b", "the second item to compare"),

        returnDoc = "&lt; 0 if a &lt; b, 0 if a == b, &gt; 0 if a &gt; b"
    )

    int(
        "dcmp",
        """
        Compares two data items according to a particular database.

        This returns a comparison as if the two items were data items of the specified database. The database must have the #DUPSORT flag.
        """,

        txn_env["txn"],
        stat["dbi"],
        const..MDB_val_p.IN("a", "the first item to compare"),
        const..MDB_val_p.IN("b", "the second item to compare"),

        returnDoc = "&lt; 0 if a &lt; b, 0 if a == b, &gt; 0 if a &gt; b"
    )

    int(
        "reader_list",
        "Dumps the entries in the reader lock table.",

        env_open["env"],
        MDB_msg_func.IN("func", "an ##MDBMsgFunc function"),
        opaque_p.IN("ctx", "anything the message function needs")
    )

    int(
        "reader_check",
        "Checks for stale entries in the reader lock table.",

        env_open["env"],
        Check(1)..int_p.OUT("dead", "number of stale slots that were cleared")
    )
}