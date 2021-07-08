/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Contains bindings to <a target="_blank" href="https://symas.com/lmdb/">LMDB</a>, the Symas Lightning Memory-Mapped Database.
 * 
 * <h3>Getting Started</h3>
 * 
 * <p>LMDB is compact, fast, powerful, and robust and implements a simplified variant of the BerkeleyDB (BDB) API.</p>
 * 
 * <p>Everything starts with an environment, created by {@link #mdb_env_create env_create}. Once created, this environment must also be opened with {@link #mdb_env_open env_open}. {@link #mdb_env_open env_open} gets
 * passed a name which is interpreted as a directory path. Note that this directory must exist already, it is not created for you. Within that directory,
 * a lock file and a storage file will be generated. If you don't want to use a directory, you can pass the {@link #MDB_NOSUBDIR NOSUBDIR} option, in which case the path you
 * provided is used directly as the data file, and another file with a "-lock" suffix added will be used for the lock file.</p>
 * 
 * <p>Once the environment is open, a transaction can be created within it using {@link #mdb_txn_begin txn_begin}. Transactions may be read-write or read-only, and read-write
 * transactions may be nested. A transaction must only be used by one thread at a time. Transactions are always required, even for read-only access. The
 * transaction provides a consistent view of the data.</p>
 * 
 * <p>Once a transaction has been created, a database can be opened within it using {@link #mdb_dbi_open dbi_open}. If only one database will ever be used in the environment, a
 * {@code NULL} can be passed as the database name. For named databases, the {@link #MDB_CREATE CREATE} flag must be used to create the database if it doesn't already exist. Also,
 * {@link #mdb_env_set_maxdbs env_set_maxdbs} must be called after {@link #mdb_env_create env_create} and before {@link #mdb_env_open env_open} to set the maximum number of named databases you want to support.</p>
 * 
 * <p>Note: a single transaction can open multiple databases. Generally databases should only be opened once, by the first transaction in the process. After
 * the first transaction completes, the database handles can freely be used by all subsequent transactions.</p>
 * 
 * <p>Within a transaction, {@link #mdb_get get} and {@link #mdb_put put} can store single key/value pairs if that is all you need to do (but see {@code Cursors} below if you want to do
 * more).</p>
 * 
 * <p>A key/value pair is expressed as two {@link MDBVal} structures. This struct has two fields, {@code mv_size} and {@code mv_data}. The data is a {@code void}
 * pointer to an array of {@code mv_size} bytes.</p>
 * 
 * <p>Because LMDB is very efficient (and usually zero-copy), the data returned in an {@link MDBVal} structure may be memory-mapped straight from disk. In other
 * words <b>look but do not touch</b> (or {@code free()} for that matter). Once a transaction is closed, the values can no longer be used, so make a copy
 * if you need to keep them after that.</p>
 * 
 * <h3>Cursors</h3>
 * 
 * <p>To do more powerful things, we must use a cursor.</p>
 * 
 * <p>Within the transaction, a cursor can be created with {@link #mdb_cursor_open cursor_open}. With this cursor we can store/retrieve/delete (multiple) values using
 * {@link #mdb_cursor_get cursor_get}, {@link #mdb_cursor_put cursor_put}, and {@link #mdb_cursor_del cursor_del}.</p>
 * 
 * <p>{@link #mdb_cursor_get cursor_get} positions itself depending on the cursor operation requested, and for some operations, on the supplied key. For example, to list all
 * key/value pairs in a database, use operation {@link #MDB_FIRST FIRST} for the first call to {@link #mdb_cursor_get cursor_get}, and {@link #MDB_NEXT NEXT} on subsequent calls, until the end is hit.</p>
 * 
 * <p>To retrieve all keys starting from a specified key value, use {@link #MDB_SET SET}.</p>
 * 
 * <p>When using {@link #mdb_cursor_put cursor_put}, either the function will position the cursor for you based on the {@code key}, or you can use operation {@link #MDB_CURRENT CURRENT} to use the
 * current position of the cursor. Note that {@code key} must then match the current position's key.</p>
 * 
 * <h4>Summarizing the Opening</h4>
 * 
 * <p>So we have a cursor in a transaction which opened a database in an environment which is opened from a filesystem after it was separately created.</p>
 * 
 * <p>Or, we create an environment, open it from a filesystem, create a transaction within it, open a database within that transaction, and create a cursor
 * within all of the above.</p>
 * 
 * <h3>Threads and Processes</h3>
 * 
 * <p>LMDB uses POSIX locks on files, and these locks have issues if one process opens a file multiple times. Because of this, do not {@link #mdb_env_open env_open} a file
 * multiple times from a single process. Instead, share the LMDB environment that has opened the file across all threads. Otherwise, if a single process
 * opens the same environment multiple times, closing it once will remove all the locks held on it, and the other instances will be vulnerable to
 * corruption from other processes.</p>
 * 
 * <p>Also note that a transaction is tied to one thread by default using Thread Local Storage. If you want to pass read-only transactions across threads,
 * you can use the {@link #MDB_NOTLS NOTLS} option on the environment.</p>
 * 
 * <h3>Transactions, Rollbacks, etc.</h3>
 * 
 * <p>To actually get anything done, a transaction must be committed using {@link #mdb_txn_commit txn_commit}. Alternatively, all of a transaction's operations can be discarded
 * using {@link #mdb_txn_abort txn_abort}. In a read-only transaction, any cursors will <b>not</b> automatically be freed. In a read-write transaction, all cursors will be
 * freed and must not be used again.</p>
 * 
 * <p>For read-only transactions, obviously there is nothing to commit to storage. The transaction still must eventually be aborted to close any database
 * handle(s) opened in it, or committed to keep the database handles around for reuse in new transactions.</p>
 * 
 * <p>In addition, as long as a transaction is open, a consistent view of the database is kept alive, which requires storage. A read-only transaction that no
 * longer requires this consistent view should be terminated (committed or aborted) when the view is no longer needed (but see below for an optimization).</p>
 * 
 * <p>There can be multiple simultaneously active read-only transactions but only one that can write. Once a single read-write transaction is opened, all
 * further attempts to begin one will block until the first one is committed or aborted. This has no effect on read-only transactions, however, and they
 * may continue to be opened at any time.</p>
 * 
 * <h3>Duplicate Keys</h3>
 * 
 * <p>{@link #mdb_get get} and {@link #mdb_put put} respectively have no and only some support for multiple key/value pairs with identical keys. If there are multiple values for a key,
 * {@link #mdb_get get} will only return the first value.</p>
 * 
 * <p>When multiple values for one key are required, pass the {@link #MDB_DUPSORT DUPSORT} flag to {@link #mdb_dbi_open dbi_open}. In an {@link #MDB_DUPSORT DUPSORT} database, by default {@link #mdb_put put} will not replace the
 * value for a key if the key existed already. Instead it will add the new value to the key. In addition, {@link #mdb_del del} will pay attention to the value field
 * too, allowing for specific values of a key to be deleted.</p>
 * 
 * <p>Finally, additional cursor operations become available for traversing through and retrieving duplicate values.</p>
 * 
 * <h3>Some Optimization</h3>
 * 
 * <p>If you frequently begin and abort read-only transactions, as an optimization, it is possible to only reset and renew a transaction.</p>
 * 
 * <p>{@link #mdb_txn_reset txn_reset} releases any old copies of data kept around for a read-only transaction. To reuse this reset transaction, call {@link #mdb_txn_renew txn_renew} on it. Any
 * cursors in this transaction must also be renewed using {@link #mdb_cursor_renew cursor_renew}.</p>
 * 
 * <p>Note that {@link #mdb_txn_reset txn_reset} is similar to {@link #mdb_txn_abort txn_abort} and will close any databases you opened within the transaction.</p>
 * 
 * <p>To permanently free a transaction, reset or not, use {@link #mdb_txn_abort txn_abort}.</p>
 * 
 * <h3>Cleaning Up</h3>
 * 
 * <p>For read-only transactions, any cursors created within it must be closed using {@link #mdb_cursor_close cursor_close}.</p>
 * 
 * <p>It is very rarely necessary to close a database handle, and in general they should just be left open.</p>
 */
public class LMDB {

    static { LibLMDB.initialize(); }

    /**
     * Environment flags.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MDB_FIXEDMAP FIXEDMAP} - mmap at a fixed address (experimental).</li>
     * <li>{@link #MDB_NOSUBDIR NOSUBDIR} - No environment directory.</li>
     * <li>{@link #MDB_NOSYNC NOSYNC} - Don't fsync after commit.</li>
     * <li>{@link #MDB_RDONLY RDONLY} - Read only.</li>
     * <li>{@link #MDB_NOMETASYNC NOMETASYNC} - Don't fsync metapage after commit.</li>
     * <li>{@link #MDB_WRITEMAP WRITEMAP} - Use writable mmap.</li>
     * <li>{@link #MDB_MAPASYNC MAPASYNC} - Use asynchronous msync when {@link #MDB_WRITEMAP WRITEMAP} is used.</li>
     * <li>{@link #MDB_NOTLS NOTLS} - Tie reader locktable slots to {@code MDB_txn} objects instead of to threads.</li>
     * <li>{@link #MDB_NOLOCK NOLOCK} - Don't do any locking, caller must manage their own locks.</li>
     * <li>{@link #MDB_NORDAHEAD NORDAHEAD} - Don't do readahead (no effect on Windows).</li>
     * <li>{@link #MDB_NOMEMINIT NOMEMINIT} - Don't initialize malloc'd memory before writing to datafile.</li>
     * </ul>
     */
    public static final int
        MDB_FIXEDMAP   = 0x1,
        MDB_NOSUBDIR   = 0x4000,
        MDB_NOSYNC     = 0x10000,
        MDB_RDONLY     = 0x20000,
        MDB_NOMETASYNC = 0x40000,
        MDB_WRITEMAP   = 0x80000,
        MDB_MAPASYNC   = 0x100000,
        MDB_NOTLS      = 0x200000,
        MDB_NOLOCK     = 0x400000,
        MDB_NORDAHEAD  = 0x800000,
        MDB_NOMEMINIT  = 0x1000000;

    /**
     * Database flags.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MDB_REVERSEKEY REVERSEKEY} - Use reverse string keys.</li>
     * <li>{@link #MDB_DUPSORT DUPSORT} - Use sorted duplicates.</li>
     * <li>{@link #MDB_INTEGERKEY INTEGERKEY} - Numeric keys in native byte order: either {@code unsigned int} or {@code size_t}. The keys must all be of the same size.</li>
     * <li>{@link #MDB_DUPFIXED DUPFIXED} - With {@link #MDB_DUPSORT DUPSORT}, sorted dup items have fixed size.</li>
     * <li>{@link #MDB_INTEGERDUP INTEGERDUP} - With {@link #MDB_DUPSORT DUPSORT}, dups are {@link #MDB_INTEGERKEY INTEGERKEY} -style integers.</li>
     * <li>{@link #MDB_REVERSEDUP REVERSEDUP} - With {@link #MDB_DUPSORT DUPSORT}, use reverse string dups.</li>
     * <li>{@link #MDB_CREATE CREATE} - Create DB if not already existing.</li>
     * </ul>
     */
    public static final int
        MDB_REVERSEKEY = 0x2,
        MDB_DUPSORT    = 0x4,
        MDB_INTEGERKEY = 0x8,
        MDB_DUPFIXED   = 0x10,
        MDB_INTEGERDUP = 0x20,
        MDB_REVERSEDUP = 0x40,
        MDB_CREATE     = 0x40000;

    /**
     * Write flags.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MDB_NOOVERWRITE NOOVERWRITE} - Don't write if the key already exists.</li>
     * <li>{@link #MDB_NODUPDATA NODUPDATA} - Remove all duplicate data items.</li>
     * <li>{@link #MDB_CURRENT CURRENT} - Overwrite the current key/data pair.</li>
     * <li>{@link #MDB_RESERVE RESERVE} - Just reserve space for data, don't copy it. Return a pointer to the reserved space.</li>
     * <li>{@link #MDB_APPEND APPEND} - Data is being appended, don't split full pages.</li>
     * <li>{@link #MDB_APPENDDUP APPENDDUP} - Duplicate data is being appended, don't split full pages.</li>
     * <li>{@link #MDB_MULTIPLE MULTIPLE} - Store multiple data items in one call. Only for {@link #MDB_DUPFIXED DUPFIXED}.</li>
     * </ul>
     */
    public static final int
        MDB_NOOVERWRITE = 0x10,
        MDB_NODUPDATA   = 0x20,
        MDB_CURRENT     = 0x40,
        MDB_RESERVE     = 0x10000,
        MDB_APPEND      = 0x20000,
        MDB_APPENDDUP   = 0x40000,
        MDB_MULTIPLE    = 0x80000;

    /**
     * Copy flags.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MDB_CP_COMPACT CP_COMPACT} - Omit free space from copy, and renumber all pages sequentially.</li>
     * </ul>
     */
    public static final int MDB_CP_COMPACT = 0x1;

    /**
     * MDB_cursor_op
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MDB_FIRST FIRST} - Position at first key/data item.</li>
     * <li>{@link #MDB_FIRST_DUP FIRST_DUP} - Position at first data item of current key. Only for {@link #MDB_DUPSORT DUPSORT}.</li>
     * <li>{@link #MDB_GET_BOTH GET_BOTH} - Position at key/data pair. Only for {@link #MDB_DUPSORT DUPSORT}.</li>
     * <li>{@link #MDB_GET_BOTH_RANGE GET_BOTH_RANGE} - position at key, nearest data. Only for {@link #MDB_DUPSORT DUPSORT}.</li>
     * <li>{@link #MDB_GET_CURRENT GET_CURRENT} - Return key/data at current cursor position.</li>
     * <li>{@link #MDB_GET_MULTIPLE GET_MULTIPLE} - Return up to a page of duplicate data items from current cursor position. Move cursor to prepare for {@link #MDB_NEXT_MULTIPLE NEXT_MULTIPLE}. Only for {@link #MDB_DUPFIXED DUPFIXED}.</li>
     * <li>{@link #MDB_LAST LAST} - Position at last key/data item.</li>
     * <li>{@link #MDB_LAST_DUP LAST_DUP} - Position at last data item of current key. Only for {@link #MDB_DUPSORT DUPSORT}.</li>
     * <li>{@link #MDB_NEXT NEXT} - Position at next data item.</li>
     * <li>{@link #MDB_NEXT_DUP NEXT_DUP} - Position at next data item of current key. Only for {@link #MDB_DUPSORT DUPSORT}.</li>
     * <li>{@link #MDB_NEXT_MULTIPLE NEXT_MULTIPLE} - Return up to a page of duplicate data items from next cursor position. Move cursor to prepare for {@link #MDB_NEXT_MULTIPLE NEXT_MULTIPLE}. Only for {@link #MDB_DUPFIXED DUPFIXED}.</li>
     * <li>{@link #MDB_NEXT_NODUP NEXT_NODUP} - Position at first data item of next key.</li>
     * <li>{@link #MDB_PREV PREV} - Position at previous data item.</li>
     * <li>{@link #MDB_PREV_DUP PREV_DUP} - Position at previous data item of current key. Only for {@link #MDB_DUPSORT DUPSORT}.</li>
     * <li>{@link #MDB_PREV_NODUP PREV_NODUP} - Position at last data item of previous key.</li>
     * <li>{@link #MDB_SET SET} - Position at specified key.</li>
     * <li>{@link #MDB_SET_KEY SET_KEY} - Position at specified key, return key + data.</li>
     * <li>{@link #MDB_SET_RANGE SET_RANGE} - Position at first key greater than or equal to specified key.</li>
     * <li>{@link #MDB_PREV_MULTIPLE PREV_MULTIPLE} - Position at previous page and return up to a page of duplicate data items. Only for {@link #MDB_DUPFIXED DUPFIXED}.</li>
     * </ul>
     */
    public static final int
        MDB_FIRST          = 0,
        MDB_FIRST_DUP      = 1,
        MDB_GET_BOTH       = 2,
        MDB_GET_BOTH_RANGE = 3,
        MDB_GET_CURRENT    = 4,
        MDB_GET_MULTIPLE   = 5,
        MDB_LAST           = 6,
        MDB_LAST_DUP       = 7,
        MDB_NEXT           = 8,
        MDB_NEXT_DUP       = 9,
        MDB_NEXT_MULTIPLE  = 10,
        MDB_NEXT_NODUP     = 11,
        MDB_PREV           = 12,
        MDB_PREV_DUP       = 13,
        MDB_PREV_NODUP     = 14,
        MDB_SET            = 15,
        MDB_SET_KEY        = 16,
        MDB_SET_RANGE      = 17,
        MDB_PREV_MULTIPLE  = 18;

    /**
     * Return codes.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #MDB_SUCCESS SUCCESS} - Successful result.</li>
     * <li>{@link #MDB_KEYEXIST KEYEXIST} - Key/data pair already exists.</li>
     * <li>{@link #MDB_NOTFOUND NOTFOUND} - Key/data pair not found (EOF).</li>
     * <li>{@link #MDB_PAGE_NOTFOUND PAGE_NOTFOUND} - Requested page not found - this usually indicates corruption.</li>
     * <li>{@link #MDB_CORRUPTED CORRUPTED} - Located page was wrong type.</li>
     * <li>{@link #MDB_PANIC PANIC} - Update of meta page failed or environment had fatal error.</li>
     * <li>{@link #MDB_VERSION_MISMATCH VERSION_MISMATCH} - Environment version mismatch.</li>
     * <li>{@link #MDB_INVALID INVALID} - File is not a valid LMDB file.</li>
     * <li>{@link #MDB_MAP_FULL MAP_FULL} - Environment mapsize reached.</li>
     * <li>{@link #MDB_DBS_FULL DBS_FULL} - Environment maxdbs reached.</li>
     * <li>{@link #MDB_READERS_FULL READERS_FULL} - Environment maxreaders reached.</li>
     * <li>{@link #MDB_TLS_FULL TLS_FULL} - Too many TLS keys in use - Windows only.</li>
     * <li>{@link #MDB_TXN_FULL TXN_FULL} - Txn has too many dirty pages.</li>
     * <li>{@link #MDB_CURSOR_FULL CURSOR_FULL} - Cursor stack too deep - internal error.</li>
     * <li>{@link #MDB_PAGE_FULL PAGE_FULL} - Page has not enough space - internal error.</li>
     * <li>{@link #MDB_MAP_RESIZED MAP_RESIZED} - Database contents grew beyond environment mapsize.</li>
     * <li>{@link #MDB_INCOMPATIBLE INCOMPATIBLE} - 
     * The operation expects an {@link #MDB_DUPSORT DUPSORT} / {@link #MDB_DUPFIXED DUPFIXED} database. Opening a named DB when the unnamed DB has {@link #MDB_DUPSORT DUPSORT} / {@link #MDB_INTEGERKEY INTEGERKEY}. Accessing a data record as a
     * database, or vice versa. The database was dropped and recreated with different flags.
     * </li>
     * <li>{@link #MDB_BAD_RSLOT BAD_RSLOT} - Invalid reuse of reader locktable slot.</li>
     * <li>{@link #MDB_BAD_TXN BAD_TXN} - Transaction must abort, has a child, or is invalid.</li>
     * <li>{@link #MDB_BAD_VALSIZE BAD_VALSIZE} - Unsupported size of key/DB name/data, or wrong {@link #MDB_DUPFIXED DUPFIXED} size.</li>
     * <li>{@link #MDB_BAD_DBI BAD_DBI} - The specified DBI was changed unexpectedly.</li>
     * <li>{@link #MDB_LAST_ERRCODE LAST_ERRCODE} - The last defined error code.</li>
     * </ul>
     */
    public static final int
        MDB_SUCCESS          = 0,
        MDB_KEYEXIST         = -30799,
        MDB_NOTFOUND         = -30798,
        MDB_PAGE_NOTFOUND    = -30797,
        MDB_CORRUPTED        = -30796,
        MDB_PANIC            = -30795,
        MDB_VERSION_MISMATCH = -30794,
        MDB_INVALID          = -30793,
        MDB_MAP_FULL         = -30792,
        MDB_DBS_FULL         = -30791,
        MDB_READERS_FULL     = -30790,
        MDB_TLS_FULL         = -30789,
        MDB_TXN_FULL         = -30788,
        MDB_CURSOR_FULL      = -30787,
        MDB_PAGE_FULL        = -30786,
        MDB_MAP_RESIZED      = -30785,
        MDB_INCOMPATIBLE     = -30784,
        MDB_BAD_RSLOT        = -30783,
        MDB_BAD_TXN          = -30782,
        MDB_BAD_VALSIZE      = -30781,
        MDB_BAD_DBI          = -30780,
        MDB_LAST_ERRCODE     = MDB_BAD_DBI;

    protected LMDB() {
        throw new UnsupportedOperationException();
    }

    // --- [ mdb_version ] ---

    /** Unsafe version of: {@link #mdb_version version} */
    public static native long nmdb_version(long major, long minor, long patch);

    /**
     * Returns the LMDB library version information.
     *
     * @param major if non-{@code NULL}, the library major version number is copied here
     * @param minor if non-{@code NULL}, the library minor version number is copied here
     * @param patch if non-{@code NULL}, the library patch version number is copied here
     *
     * @return the library version as a string
     */
    @Nullable
    @NativeType("char *")
    public static String mdb_version(@Nullable @NativeType("int *") IntBuffer major, @Nullable @NativeType("int *") IntBuffer minor, @Nullable @NativeType("int *") IntBuffer patch) {
        if (CHECKS) {
            checkSafe(major, 1);
            checkSafe(minor, 1);
            checkSafe(patch, 1);
        }
        long __result = nmdb_version(memAddressSafe(major), memAddressSafe(minor), memAddressSafe(patch));
        return memASCIISafe(__result);
    }

    // --- [ mdb_strerror ] ---

    /** Unsafe version of: {@link #mdb_strerror strerror} */
    public static native long nmdb_strerror(int err);

    /**
     * Returns a string describing a given error code.
     * 
     * <p>This function is a superset of the ANSI C X3.159-1989 (ANSI C) strerror(3) function. If the error code is greater than or equal to 0, then the string
     * returned by the system function strerror(3) is returned. If the error code is less than 0, an error string corresponding to the LMDB library error is
     * returned.</p>
     *
     * @param err the error code
     *
     * @return the description of the error
     */
    @NativeType("char *")
    public static String mdb_strerror(int err) {
        long __result = nmdb_strerror(err);
        return memASCII(__result);
    }

    // --- [ mdb_env_create ] ---

    /** Unsafe version of: {@link #mdb_env_create env_create} */
    public static native int nmdb_env_create(long env);

    /**
     * Creates an LMDB environment handle.
     * 
     * <p>This function allocates memory for a {@code MDB_env} structure. To release the allocated memory and discard the handle, call {@link #mdb_env_close env_close}. Before the
     * handle may be used, it must be opened using {@link #mdb_env_open env_open}. Various other options may also need to be set before opening the handle, e.g.
     * {@link #mdb_env_set_mapsize env_set_mapsize}, {@link #mdb_env_set_maxreaders env_set_maxreaders}, {@link #mdb_env_set_maxdbs env_set_maxdbs}, depending on usage requirements.</p>
     *
     * @param env the address where the new handle will be stored
     *
     * @return a non-zero error value on failure and 0 on success
     */
    public static int mdb_env_create(@NativeType("MDB_env **") PointerBuffer env) {
        if (CHECKS) {
            check(env, 1);
        }
        return nmdb_env_create(memAddress(env));
    }

    // --- [ mdb_env_open ] ---

    /** Unsafe version of: {@link #mdb_env_open env_open} */
    public static native int nmdb_env_open(long env, long path, int flags, int mode);

    /**
     * Opens an environment handle.
     * 
     * <p>If this function fails, {@link #mdb_env_close env_close} must be called to discard the {@code MDB_env} handle.</p>
     *
     * @param env   an environment handle returned by {@link #mdb_env_create env_create}
     * @param path  the directory in which the database files reside. This directory must already exist and be writable.
     * @param flags Special options for this environment. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here. Flags
     *              set by {@link #mdb_env_set_flags env_set_flags} are also used.
     *              
     *              <ul>
     *              <li>{@link #MDB_FIXEDMAP FIXEDMAP}
     *              
     *              <p>Use a fixed address for the mmap region. This flag must be specified when creating the environment, and is stored persistently in the
     *              environment. If successful, the memory map will always reside at the same virtual address and pointers used to reference data items in the
     *              database will be constant across multiple invocations. This option may not always work, depending on how the operating system has allocated
     *              memory to shared libraries and other uses.</p>
     *              
     *              <p>The feature is highly experimental.</p></li>
     *              <li>{@link #MDB_NOSUBDIR NOSUBDIR}
     *              
     *              <p>By default, LMDB creates its environment in a directory whose pathname is given in {@code path}, and creates its data and lock files under that
     *              directory. With this option, {@code path} is used as-is for the database main data file. The database lock file is the {@code path}    with
     *              "-lock" appended.</p></li>
     *              <li>{@link #MDB_RDONLY RDONLY}
     *              
     *              <p>Open the environment in read-only mode. No write operations will be allowed. LMDB will still modify the lock file - except on read-only
     *              filesystems, where LMDB does not use locks.</p></li>
     *              <li>{@link #MDB_WRITEMAP WRITEMAP}
     *              
     *              <p>Use a writeable memory map unless {@link #MDB_RDONLY RDONLY} is set. This uses fewer mallocs but loses protection from application bugs like wild pointer writes
     *              and other bad updates into the database. This may be slightly faster for DBs that fit entirely in RAM, but is slower for DBs larger than RAM.</p>
     *              
     *              <p>Incompatible with nested transactions.</p>
     *              
     *              <p>Do not mix processes with and without {@link #MDB_WRITEMAP WRITEMAP} on the same environment. This can defeat durability ({@link #mdb_env_sync env_sync} etc).</p></li>
     *              <li>{@link #MDB_NOMETASYNC NOMETASYNC}
     *              
     *              <p>Flush system buffers to disk only once per transaction, omit the metadata flush. Defer that until the system flushes files to disk, or next
     *              non-{@link #MDB_RDONLY RDONLY} commit or {@link #mdb_env_sync env_sync}. This optimization maintains database integrity, but a system crash may undo the last committed transaction.
     *              I.e. it preserves the ACI (atomicity, consistency, isolation) but not D (durability) database property.</p>
     *              
     *              <p>This flag may be changed at any time using {@link #mdb_env_set_flags env_set_flags}.</p></li>
     *              <li>{@link #MDB_NOSYNC NOSYNC}
     *              
     *              <p>Don't flush system buffers to disk when committing a transaction. This optimization means a system crash can corrupt the database or lose the
     *              last transactions if buffers are not yet flushed to disk. The risk is governed by how often the system flushes dirty buffers to disk and how
     *              often {@link #mdb_env_sync env_sync} is called. However, if the filesystem preserves write order and the {@link #MDB_WRITEMAP WRITEMAP} flag is not used, transactions exhibit ACI
     *              (atomicity, consistency, isolation) properties and only lose D (durability). I.e. database integrity is maintained, but a system crash may undo
     *              the final transactions. Note that ({@link #MDB_NOSYNC NOSYNC} | {@link #MDB_WRITEMAP WRITEMAP}) leaves the system with no hint for when to write transactions to disk, unless
     *              {@link #mdb_env_sync env_sync} is called. ({@link #MDB_MAPASYNC MAPASYNC} | {@link #MDB_WRITEMAP WRITEMAP}) may be preferable.</p>
     *              
     *              <p>This flag may be changed at any time using {@link #mdb_env_set_flags env_set_flags}.</p></li>
     *              <li>{@link #MDB_MAPASYNC MAPASYNC}
     *              
     *              <p>When using {@link #MDB_WRITEMAP WRITEMAP}, use asynchronous flushes to disk. As with {@link #MDB_NOSYNC NOSYNC}, a system crash can then corrupt the database or lose the last
     *              transactions. Calling {@link #mdb_env_sync env_sync} ensures on-disk database integrity until next commit.</p>
     *              
     *              <p>This flag may be changed at any time using {@link #mdb_env_set_flags env_set_flags}.</p></li>
     *              <li>{@link #MDB_NOTLS NOTLS}
     *              
     *              <p>Don't use Thread-Local Storage. Tie reader locktable slots to {@code MDB_txn} objects instead of to threads. I.e. {@link #mdb_txn_reset txn_reset} keeps the slot
     *              reseved for the {@code MDB_txn} object. A thread may use parallel read-only transactions. A read-only transaction may span threads if the user
     *              synchronizes its use. Applications that multiplex many user threads over individual OS threads need this option. Such an application must also
     *              serialize the write transactions in an OS thread, since LMDB's write locking is unaware of the user threads.</p></li>
     *              <li>{@link #MDB_NOLOCK NOLOCK}
     *              
     *              <p>Don't do any locking. If concurrent access is anticipated, the caller must manage all concurrency itself. For proper operation the caller must
     *              enforce single-writer semantics, and must ensure that no readers are using old transactions while a writer is active. The simplest approach is
     *              to use an exclusive lock so that no readers may be active at all when a writer begins.</p></li>
     *              <li>{@link #MDB_NORDAHEAD NORDAHEAD}
     *              
     *              <p>Turn off readahead. Most operating systems perform readahead on read requests by default. This option turns it off if the OS supports it.
     *              Turning it off may help random read performance when the DB is larger than RAM and system RAM is full.</p>
     *              
     *              <p>The option is not implemented on Windows.</p></li>
     *              <li>{@link #MDB_NOMEMINIT NOMEMINIT}
     *              
     *              <p>Don't initialize malloc'd memory before writing to unused spaces in the data file. By default, memory for pages written to the data file is
     *              obtained using malloc. While these pages may be reused in subsequent transactions, freshly malloc'd pages will be initialized to zeroes before
     *              use. This avoids persisting leftover data from other code (that used the heap and subsequently freed the memory) into the data file. Note that
     *              many other system libraries may allocate and free memory from the heap for arbitrary uses. E.g., stdio may use the heap for file I/O buffers.
     *              This initialization step has a modest performance cost so some applications may want to disable it using this flag. This option can be a
     *              problem for applications which handle sensitive data like passwords, and it makes memory checkers like Valgrind noisy. This flag is not needed
     *              with {@link #MDB_WRITEMAP WRITEMAP}, which writes directly to the mmap instead of using malloc for pages. The initialization is also skipped if {@link #MDB_RESERVE RESERVE} is used;
     *              the caller is expected to overwrite all of the memory that was reserved in that case.</p>
     *              
     *              <p>This flag may be changed at any time using {@link #mdb_env_set_flags env_set_flags}.</p></li>
     *              </ul>
     * @param mode  The UNIX permissions to set on created files and semaphores.
     *              
     *              <p>This parameter is ignored on Windows.</p>
     *
     * @return a non-zero error value on failure and 0 on success. Some possible errors are:
     *         
     *         <ul>
     *         <li>{@link #MDB_VERSION_MISMATCH VERSION_MISMATCH} - the version of the LMDB library doesn't match the version that created the database environment.</li>
     *         <li>{@link #MDB_INVALID INVALID} - the environment file headers are corrupted.</li>
     *         <li>{@code ENOENT} - the directory specified by the path parameter doesn't exist.</li>
     *         <li>{@code EACCES} - the user didn't have permission to access the environment files.</li>
     *         <li>{@code EAGAIN} - the environment was locked by another process.</li>
     *         </ul>
     */
    public static int mdb_env_open(@NativeType("MDB_env *") long env, @NativeType("char const *") ByteBuffer path, @NativeType("unsigned int") int flags, @NativeType("mdb_mode_t") int mode) {
        if (CHECKS) {
            check(env);
            checkNT1(path);
        }
        return nmdb_env_open(env, memAddress(path), flags, mode);
    }

    /**
     * Opens an environment handle.
     * 
     * <p>If this function fails, {@link #mdb_env_close env_close} must be called to discard the {@code MDB_env} handle.</p>
     *
     * @param env   an environment handle returned by {@link #mdb_env_create env_create}
     * @param path  the directory in which the database files reside. This directory must already exist and be writable.
     * @param flags Special options for this environment. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here. Flags
     *              set by {@link #mdb_env_set_flags env_set_flags} are also used.
     *              
     *              <ul>
     *              <li>{@link #MDB_FIXEDMAP FIXEDMAP}
     *              
     *              <p>Use a fixed address for the mmap region. This flag must be specified when creating the environment, and is stored persistently in the
     *              environment. If successful, the memory map will always reside at the same virtual address and pointers used to reference data items in the
     *              database will be constant across multiple invocations. This option may not always work, depending on how the operating system has allocated
     *              memory to shared libraries and other uses.</p>
     *              
     *              <p>The feature is highly experimental.</p></li>
     *              <li>{@link #MDB_NOSUBDIR NOSUBDIR}
     *              
     *              <p>By default, LMDB creates its environment in a directory whose pathname is given in {@code path}, and creates its data and lock files under that
     *              directory. With this option, {@code path} is used as-is for the database main data file. The database lock file is the {@code path}    with
     *              "-lock" appended.</p></li>
     *              <li>{@link #MDB_RDONLY RDONLY}
     *              
     *              <p>Open the environment in read-only mode. No write operations will be allowed. LMDB will still modify the lock file - except on read-only
     *              filesystems, where LMDB does not use locks.</p></li>
     *              <li>{@link #MDB_WRITEMAP WRITEMAP}
     *              
     *              <p>Use a writeable memory map unless {@link #MDB_RDONLY RDONLY} is set. This uses fewer mallocs but loses protection from application bugs like wild pointer writes
     *              and other bad updates into the database. This may be slightly faster for DBs that fit entirely in RAM, but is slower for DBs larger than RAM.</p>
     *              
     *              <p>Incompatible with nested transactions.</p>
     *              
     *              <p>Do not mix processes with and without {@link #MDB_WRITEMAP WRITEMAP} on the same environment. This can defeat durability ({@link #mdb_env_sync env_sync} etc).</p></li>
     *              <li>{@link #MDB_NOMETASYNC NOMETASYNC}
     *              
     *              <p>Flush system buffers to disk only once per transaction, omit the metadata flush. Defer that until the system flushes files to disk, or next
     *              non-{@link #MDB_RDONLY RDONLY} commit or {@link #mdb_env_sync env_sync}. This optimization maintains database integrity, but a system crash may undo the last committed transaction.
     *              I.e. it preserves the ACI (atomicity, consistency, isolation) but not D (durability) database property.</p>
     *              
     *              <p>This flag may be changed at any time using {@link #mdb_env_set_flags env_set_flags}.</p></li>
     *              <li>{@link #MDB_NOSYNC NOSYNC}
     *              
     *              <p>Don't flush system buffers to disk when committing a transaction. This optimization means a system crash can corrupt the database or lose the
     *              last transactions if buffers are not yet flushed to disk. The risk is governed by how often the system flushes dirty buffers to disk and how
     *              often {@link #mdb_env_sync env_sync} is called. However, if the filesystem preserves write order and the {@link #MDB_WRITEMAP WRITEMAP} flag is not used, transactions exhibit ACI
     *              (atomicity, consistency, isolation) properties and only lose D (durability). I.e. database integrity is maintained, but a system crash may undo
     *              the final transactions. Note that ({@link #MDB_NOSYNC NOSYNC} | {@link #MDB_WRITEMAP WRITEMAP}) leaves the system with no hint for when to write transactions to disk, unless
     *              {@link #mdb_env_sync env_sync} is called. ({@link #MDB_MAPASYNC MAPASYNC} | {@link #MDB_WRITEMAP WRITEMAP}) may be preferable.</p>
     *              
     *              <p>This flag may be changed at any time using {@link #mdb_env_set_flags env_set_flags}.</p></li>
     *              <li>{@link #MDB_MAPASYNC MAPASYNC}
     *              
     *              <p>When using {@link #MDB_WRITEMAP WRITEMAP}, use asynchronous flushes to disk. As with {@link #MDB_NOSYNC NOSYNC}, a system crash can then corrupt the database or lose the last
     *              transactions. Calling {@link #mdb_env_sync env_sync} ensures on-disk database integrity until next commit.</p>
     *              
     *              <p>This flag may be changed at any time using {@link #mdb_env_set_flags env_set_flags}.</p></li>
     *              <li>{@link #MDB_NOTLS NOTLS}
     *              
     *              <p>Don't use Thread-Local Storage. Tie reader locktable slots to {@code MDB_txn} objects instead of to threads. I.e. {@link #mdb_txn_reset txn_reset} keeps the slot
     *              reseved for the {@code MDB_txn} object. A thread may use parallel read-only transactions. A read-only transaction may span threads if the user
     *              synchronizes its use. Applications that multiplex many user threads over individual OS threads need this option. Such an application must also
     *              serialize the write transactions in an OS thread, since LMDB's write locking is unaware of the user threads.</p></li>
     *              <li>{@link #MDB_NOLOCK NOLOCK}
     *              
     *              <p>Don't do any locking. If concurrent access is anticipated, the caller must manage all concurrency itself. For proper operation the caller must
     *              enforce single-writer semantics, and must ensure that no readers are using old transactions while a writer is active. The simplest approach is
     *              to use an exclusive lock so that no readers may be active at all when a writer begins.</p></li>
     *              <li>{@link #MDB_NORDAHEAD NORDAHEAD}
     *              
     *              <p>Turn off readahead. Most operating systems perform readahead on read requests by default. This option turns it off if the OS supports it.
     *              Turning it off may help random read performance when the DB is larger than RAM and system RAM is full.</p>
     *              
     *              <p>The option is not implemented on Windows.</p></li>
     *              <li>{@link #MDB_NOMEMINIT NOMEMINIT}
     *              
     *              <p>Don't initialize malloc'd memory before writing to unused spaces in the data file. By default, memory for pages written to the data file is
     *              obtained using malloc. While these pages may be reused in subsequent transactions, freshly malloc'd pages will be initialized to zeroes before
     *              use. This avoids persisting leftover data from other code (that used the heap and subsequently freed the memory) into the data file. Note that
     *              many other system libraries may allocate and free memory from the heap for arbitrary uses. E.g., stdio may use the heap for file I/O buffers.
     *              This initialization step has a modest performance cost so some applications may want to disable it using this flag. This option can be a
     *              problem for applications which handle sensitive data like passwords, and it makes memory checkers like Valgrind noisy. This flag is not needed
     *              with {@link #MDB_WRITEMAP WRITEMAP}, which writes directly to the mmap instead of using malloc for pages. The initialization is also skipped if {@link #MDB_RESERVE RESERVE} is used;
     *              the caller is expected to overwrite all of the memory that was reserved in that case.</p>
     *              
     *              <p>This flag may be changed at any time using {@link #mdb_env_set_flags env_set_flags}.</p></li>
     *              </ul>
     * @param mode  The UNIX permissions to set on created files and semaphores.
     *              
     *              <p>This parameter is ignored on Windows.</p>
     *
     * @return a non-zero error value on failure and 0 on success. Some possible errors are:
     *         
     *         <ul>
     *         <li>{@link #MDB_VERSION_MISMATCH VERSION_MISMATCH} - the version of the LMDB library doesn't match the version that created the database environment.</li>
     *         <li>{@link #MDB_INVALID INVALID} - the environment file headers are corrupted.</li>
     *         <li>{@code ENOENT} - the directory specified by the path parameter doesn't exist.</li>
     *         <li>{@code EACCES} - the user didn't have permission to access the environment files.</li>
     *         <li>{@code EAGAIN} - the environment was locked by another process.</li>
     *         </ul>
     */
    public static int mdb_env_open(@NativeType("MDB_env *") long env, @NativeType("char const *") CharSequence path, @NativeType("unsigned int") int flags, @NativeType("mdb_mode_t") int mode) {
        if (CHECKS) {
            check(env);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nmdb_env_open(env, pathEncoded, flags, mode);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ mdb_env_copy ] ---

    /** Unsafe version of: {@link #mdb_env_copy env_copy} */
    public static native int nmdb_env_copy(long env, long path);

    /**
     * Copies an LMDB environment to the specified path.
     * 
     * <p>This function may be used to make a backup of an existing environment. No lockfile is created, since it gets recreated at need.</p>
     * 
     * <p>This call can trigger significant file size growth if run in parallel with write transactions, because it employs a read-only transaction.</p>
     *
     * @param env  an environment handle returned by {@link #mdb_env_create env_create}. It must have already been opened successfully.
     * @param path the directory in which the copy will reside. This directory must already exist and be writable but must otherwise be empty.
     *
     * @return a non-zero error value on failure and 0 on success
     */
    public static int mdb_env_copy(@NativeType("MDB_env *") long env, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            check(env);
            checkNT1(path);
        }
        return nmdb_env_copy(env, memAddress(path));
    }

    /**
     * Copies an LMDB environment to the specified path.
     * 
     * <p>This function may be used to make a backup of an existing environment. No lockfile is created, since it gets recreated at need.</p>
     * 
     * <p>This call can trigger significant file size growth if run in parallel with write transactions, because it employs a read-only transaction.</p>
     *
     * @param env  an environment handle returned by {@link #mdb_env_create env_create}. It must have already been opened successfully.
     * @param path the directory in which the copy will reside. This directory must already exist and be writable but must otherwise be empty.
     *
     * @return a non-zero error value on failure and 0 on success
     */
    public static int mdb_env_copy(@NativeType("MDB_env *") long env, @NativeType("char const *") CharSequence path) {
        if (CHECKS) {
            check(env);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nmdb_env_copy(env, pathEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ mdb_env_copy2 ] ---

    /** Unsafe version of: {@link #mdb_env_copy2 env_copy2} */
    public static native int nmdb_env_copy2(long env, long path, int flags);

    /**
     * Copies an LMDB environment to the specified path, with options.
     * 
     * <p>This function may be used to make a backup of an existing environment. No lockfile is created, since it gets recreated at need.</p>
     * 
     * <p>This call can trigger significant file size growth if run in parallel with write transactions, because it employs a read-only transaction.</p>
     *
     * @param env   an environment handle returned by {@link #mdb_env_create env_create}. It must have already been opened successfully.
     * @param path  the directory in which the copy will reside. This directory must already exist and be writable but must otherwise be empty.
     * @param flags special options for this operation. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here.
     *              
     *              <ul>
     *              <li>{@link #MDB_CP_COMPACT CP_COMPACT} - Perform compaction while copying: omit free pages and sequentially renumber all pages in output. This option consumes more CPU
     *              and runs more slowly than the default.</li>
     *              </ul>
     */
    public static int mdb_env_copy2(@NativeType("MDB_env *") long env, @NativeType("char const *") ByteBuffer path, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(env);
            checkNT1(path);
        }
        return nmdb_env_copy2(env, memAddress(path), flags);
    }

    /**
     * Copies an LMDB environment to the specified path, with options.
     * 
     * <p>This function may be used to make a backup of an existing environment. No lockfile is created, since it gets recreated at need.</p>
     * 
     * <p>This call can trigger significant file size growth if run in parallel with write transactions, because it employs a read-only transaction.</p>
     *
     * @param env   an environment handle returned by {@link #mdb_env_create env_create}. It must have already been opened successfully.
     * @param path  the directory in which the copy will reside. This directory must already exist and be writable but must otherwise be empty.
     * @param flags special options for this operation. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here.
     *              
     *              <ul>
     *              <li>{@link #MDB_CP_COMPACT CP_COMPACT} - Perform compaction while copying: omit free pages and sequentially renumber all pages in output. This option consumes more CPU
     *              and runs more slowly than the default.</li>
     *              </ul>
     */
    public static int mdb_env_copy2(@NativeType("MDB_env *") long env, @NativeType("char const *") CharSequence path, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(env);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nmdb_env_copy2(env, pathEncoded, flags);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ mdb_env_stat ] ---

    /** Unsafe version of: {@link #mdb_env_stat env_stat} */
    public static native int nmdb_env_stat(long env, long stat);

    /**
     * Returns statistics about the LMDB environment.
     *
     * @param env  an environment handle returned by {@link #mdb_env_create env_create}
     * @param stat the address of an {@link MDBStat} structure where the statistics will be copied
     *
     * @return a non-zero error value on failure and 0 on success
     */
    public static int mdb_env_stat(@NativeType("MDB_env *") long env, @NativeType("MDB_stat *") MDBStat stat) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_stat(env, stat.address());
    }

    // --- [ mdb_env_info ] ---

    /** Unsafe version of: {@link #mdb_env_info env_info} */
    public static native int nmdb_env_info(long env, long stat);

    /**
     * Returns information about the LMDB environment.
     *
     * @param env  an environment handle returned by {@link #mdb_env_create env_create}
     * @param stat the address of an {@link MDBEnvInfo} structure where the information will be copied
     *
     * @return a non-zero error value on failure and 0 on success
     */
    public static int mdb_env_info(@NativeType("MDB_env *") long env, @NativeType("MDB_envinfo *") MDBEnvInfo stat) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_info(env, stat.address());
    }

    // --- [ mdb_env_sync ] ---

    /** Unsafe version of: {@link #mdb_env_sync env_sync} */
    public static native int nmdb_env_sync(long env, int force);

    /**
     * Flushes the data buffers to disk.
     * 
     * <p>Data is always written to disk when {@link #mdb_txn_commit txn_commit} is called, but the operating system may keep it buffered. LMDB always flushes the OS buffers upon
     * commit as well, unless the environment was opened with {@link #MDB_NOSYNC NOSYNC} or in part {@link #MDB_NOMETASYNC NOMETASYNC}. This call is not valid if the environment was opened with
     * {@link #MDB_RDONLY RDONLY}.</p>
     *
     * @param env   an environment handle returned by {@link #mdb_env_create env_create}
     * @param force if non-zero, force a synchronous flush. Otherwise if the environment has the {@link #MDB_NOSYNC NOSYNC} flag set the flushes will be omitted, and with {@link #MDB_MAPASYNC MAPASYNC} they
     *              will be asynchronous.
     *
     * @return a non-zero error value on failure and 0 on success. Some possible errors are:
     *         
     *         <ul>
     *         <li>{@code EACCES} - the environment is read-only.</li>
     *         <li>{@code EINVAL} - an invalid parameter was specified.</li>
     *         <li>{@code EIO} - an error occurred during synchronization.</li>
     *         </ul>
     */
    public static int mdb_env_sync(@NativeType("MDB_env *") long env, @NativeType("int") boolean force) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_sync(env, force ? 1 : 0);
    }

    // --- [ mdb_env_close ] ---

    /** Unsafe version of: {@link #mdb_env_close env_close} */
    public static native void nmdb_env_close(long env);

    /**
     * Closes the environment and releases the memory map.
     * 
     * <p>Only a single thread may call this function. All transactions, databases, and cursors must already be closed before calling this function. Attempts to
     * use any such handles after calling this function will cause a SIGSEGV. The environment handle will be freed and must not be used again after this call.</p>
     *
     * @param env an environment handle returned by {@link #mdb_env_create env_create}
     */
    public static void mdb_env_close(@NativeType("MDB_env *") long env) {
        if (CHECKS) {
            check(env);
        }
        nmdb_env_close(env);
    }

    // --- [ mdb_env_set_flags ] ---

    /** Unsafe version of: {@link #mdb_env_set_flags env_set_flags} */
    public static native int nmdb_env_set_flags(long env, int flags, int onoff);

    /**
     * Sets environment flags.
     * 
     * <p>This may be used to set some flags in addition to those from {@link #mdb_env_open env_open}, or to unset these flags. If several threads change the flags at the same
     * time, the result is undefined.</p>
     *
     * @param env   an environment handle returned by {@link #mdb_env_create env_create}
     * @param flags the flags to change, bitwise OR'ed together
     * @param onoff a non-zero value sets the flags, zero clears them.
     *
     * @return a non-zero error value on failure and 0 on success. Some possible errors are:
     *         
     *         <ul>
     *         <li>{@code EINVAL} - an invalid parameter was specified.</li>
     *         </ul>
     */
    public static int mdb_env_set_flags(@NativeType("MDB_env *") long env, @NativeType("unsigned int") int flags, @NativeType("int") boolean onoff) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_set_flags(env, flags, onoff ? 1 : 0);
    }

    // --- [ mdb_env_get_flags ] ---

    /** Unsafe version of: {@link #mdb_env_get_flags env_get_flags} */
    public static native int nmdb_env_get_flags(long env, long flags);

    /**
     * Gets environment flags.
     *
     * @param env   an environment handle returned by {@link #mdb_env_create env_create}
     * @param flags the address of an integer to store the flags
     *
     * @return a non-zero error value on failure and 0 on success
     */
    public static int mdb_env_get_flags(@NativeType("MDB_env *") long env, @NativeType("unsigned int *") IntBuffer flags) {
        if (CHECKS) {
            check(env);
            check(flags, 1);
        }
        return nmdb_env_get_flags(env, memAddress(flags));
    }

    // --- [ mdb_env_get_path ] ---

    /** Unsafe version of: {@link #mdb_env_get_path env_get_path} */
    public static native int nmdb_env_get_path(long env, long path);

    /**
     * Returns the path that was used in {@link #mdb_env_open env_open}.
     *
     * @param env  an environment handle returned by {@link #mdb_env_create env_create}
     * @param path address of a string pointer to contain the path. This is the actual string in the environment, not a copy. It should not be altered in any way.
     *
     * @return a non-zero error value on failure and 0 on success
     */
    public static int mdb_env_get_path(@NativeType("MDB_env *") long env, @NativeType("char const **") PointerBuffer path) {
        if (CHECKS) {
            check(env);
            check(path, 1);
        }
        return nmdb_env_get_path(env, memAddress(path));
    }

    // --- [ mdb_env_set_mapsize ] ---

    /** Unsafe version of: {@link #mdb_env_set_mapsize env_set_mapsize} */
    public static native int nmdb_env_set_mapsize(long env, long size);

    /**
     * Sets the size of the memory map to use for this environment.
     * 
     * <p>The size should be a multiple of the OS page size. The default is 10485760 bytes. The size of the memory map is also the maximum size of the database.
     * The value should be chosen as large as possible, to accommodate future growth of the database.</p>
     * 
     * <p>This function should be called after {@link #mdb_env_create env_create} and before {@link #mdb_env_open env_open}. It may be called at later times if no transactions are active in this
     * process. Note that the library does not check for this condition, the caller must ensure it explicitly.</p>
     * 
     * <p>The new size takes effect immediately for the current process but will not be persisted to any others until a write transaction has been committed by
     * the current process. Also, only mapsize increases are persisted into the environment.</p>
     * 
     * <p>If the mapsize is increased by another process, and data has grown beyond the range of the current mapsize, {@link #mdb_txn_begin txn_begin} will return {@link #MDB_MAP_RESIZED MAP_RESIZED}. This
     * function may be called with a size of zero to adopt the new size.</p>
     * 
     * <p>Any attempt to set a size smaller than the space already consumed by the environment will be silently changed to the current size of the used space.</p>
     *
     * @param env  an environment handle returned by {@link #mdb_env_create env_create}
     * @param size the size in bytes
     *
     * @return a non-zero error value on failure and 0 on success. Some possible errors are:
     *         
     *         <ul>
     *         <li>{@code EINVAL} - an invalid parameter was specified, or the environment has an active write transaction.</li>
     *         </ul>
     */
    public static int mdb_env_set_mapsize(@NativeType("MDB_env *") long env, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_set_mapsize(env, size);
    }

    // --- [ mdb_env_set_maxreaders ] ---

    /** Unsafe version of: {@link #mdb_env_set_maxreaders env_set_maxreaders} */
    public static native int nmdb_env_set_maxreaders(long env, int readers);

    /**
     * Sets the maximum number of threads/reader slots for the environment.
     * 
     * <p>This defines the number of slots in the lock table that is used to track readers in the environment. The default is 126.</p>
     * 
     * <p>Starting a read-only transaction normally ties a lock table slot to the current thread until the environment closes or the thread exits. If {@link #MDB_NOTLS NOTLS} is
     * in use, {@link #mdb_txn_begin txn_begin} instead ties the slot to the {@code MDB_txn} object until it or the {@code MDB_env} object is destroyed.</p>
     * 
     * <p>This function may only be called after {@link #mdb_env_create env_create} and before {@link #mdb_env_open env_open}.</p>
     *
     * @param env     an environment handle returned by {@link #mdb_env_create env_create}
     * @param readers the maximum number of reader lock table slots
     *
     * @return a non-zero error value on failure and 0 on success. Some possible errors are:
     *         
     *         <ul>
     *         <li>{@code EINVAL} - an invalid parameter was specified, or the environment is already open.</li>
     *         </ul>
     */
    public static int mdb_env_set_maxreaders(@NativeType("MDB_env *") long env, @NativeType("unsigned int") int readers) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_set_maxreaders(env, readers);
    }

    // --- [ mdb_env_get_maxreaders ] ---

    /** Unsafe version of: {@link #mdb_env_get_maxreaders env_get_maxreaders} */
    public static native int nmdb_env_get_maxreaders(long env, long readers);

    /**
     * Gets the maximum number of threads/reader slots for the environment.
     *
     * @param env     an environment handle returned by {@link #mdb_env_create env_create}
     * @param readers address of an integer to store the number of readers
     *
     * @return a non-zero error value on failure and 0 on success
     */
    public static int mdb_env_get_maxreaders(@NativeType("MDB_env *") long env, @NativeType("unsigned int *") IntBuffer readers) {
        if (CHECKS) {
            check(env);
            check(readers, 1);
        }
        return nmdb_env_get_maxreaders(env, memAddress(readers));
    }

    // --- [ mdb_env_set_maxdbs ] ---

    /** Unsafe version of: {@link #mdb_env_set_maxdbs env_set_maxdbs} */
    public static native int nmdb_env_set_maxdbs(long env, int dbs);

    /**
     * Sets the maximum number of named databases for the environment.
     * 
     * <p>This function is only needed if multiple databases will be used in the environment. Simpler applications that use the environment as a single unnamed
     * database can ignore this option.</p>
     * 
     * <p>This function may only be called after {@link #mdb_env_create env_create} and before {@link #mdb_env_open env_open}.</p>
     * 
     * <p>Currently a moderate number of slots are cheap but a huge number gets expensive: 7-120 words per transaction, and every {@link #mdb_dbi_open dbi_open} does a linear
     * search of the opened slots.</p>
     *
     * @param env an environment handle returned by {@link #mdb_env_create env_create}
     * @param dbs the maximum number of databases
     *
     * @return a non-zero error value on failure and 0 on success. Some possible errors are:
     *         
     *         <ul>
     *         <li>{@code EINVAL} - an invalid parameter was specified, or the environment is already open.</li>
     *         </ul>
     */
    public static int mdb_env_set_maxdbs(@NativeType("MDB_env *") long env, @NativeType("MDB_dbi") int dbs) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_set_maxdbs(env, dbs);
    }

    // --- [ mdb_env_get_maxkeysize ] ---

    /** Unsafe version of: {@link #mdb_env_get_maxkeysize env_get_maxkeysize} */
    public static native int nmdb_env_get_maxkeysize(long env);

    /**
     * Gets the maximum size of keys and {@link #MDB_DUPSORT DUPSORT} data we can write.
     * 
     * <p>Depends on the compile-time constant {@code MAXKEYSIZE}. Default 511.</p>
     *
     * @param env an environment handle returned by {@link #mdb_env_create env_create}
     */
    public static int mdb_env_get_maxkeysize(@NativeType("MDB_env *") long env) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_get_maxkeysize(env);
    }

    // --- [ mdb_env_set_userctx ] ---

    /** Unsafe version of: {@link #mdb_env_set_userctx env_set_userctx} */
    public static native int nmdb_env_set_userctx(long env, long ctx);

    /**
     * Set application information associated with the {@code MDB_env}.
     *
     * @param env an environment handle returned by {@link #mdb_env_create env_create}
     * @param ctx an arbitrary pointer for whatever the application needs
     */
    public static int mdb_env_set_userctx(@NativeType("MDB_env *") long env, @NativeType("void *") long ctx) {
        if (CHECKS) {
            check(env);
            check(ctx);
        }
        return nmdb_env_set_userctx(env, ctx);
    }

    // --- [ mdb_env_get_userctx ] ---

    /** Unsafe version of: {@link #mdb_env_get_userctx env_get_userctx} */
    public static native long nmdb_env_get_userctx(long env);

    /**
     * Gets the application information associated with the {@code MDB_env}.
     *
     * @param env an environment handle returned by {@link #mdb_env_create env_create}
     */
    @NativeType("void *")
    public static long mdb_env_get_userctx(@NativeType("MDB_env *") long env) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_get_userctx(env);
    }

    // --- [ mdb_txn_begin ] ---

    /** Unsafe version of: {@link #mdb_txn_begin txn_begin} */
    public static native int nmdb_txn_begin(long env, long parent, int flags, long txn);

    /**
     * Creates a transaction for use with the environment.
     * 
     * <p>The transaction handle may be discarded using {@link #mdb_txn_abort txn_abort} or {@link #mdb_txn_commit txn_commit}.</p>
     * 
     * <p>A transaction and its cursors must only be used by a single thread, and a thread may only have a single transaction at a time. If {@link #MDB_NOTLS NOTLS} is in use,
     * this does not apply to read-only transactions.</p>
     * 
     * <p>Cursors may not span transactions.</p>
     *
     * @param env    an environment handle returned by {@link #mdb_env_create env_create}
     * @param parent if this parameter is non-{@code NULL}, the new transaction will be a nested transaction, with the transaction indicated by {@code parent} as its parent.
     *               Transactions may be nested to any level. A parent transaction and its cursors may not issue any other operations than {@link #mdb_txn_commit txn_commit} and
     *               {@link #mdb_txn_abort txn_abort} while it has active child transactions.
     * @param flags  special options for this transaction. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here.
     *               
     *               <ul>
     *               <li>{@link #MDB_RDONLY RDONLY} - This transaction will not perform any write operations.</li>
     *               </ul>
     * @param txn    address where the new {@code MDB_txn} handle will be stored
     *
     * @return a non-zero error value on failure and 0 on success. Some possible errors are:
     *         
     *         <ul>
     *         <li>{@link #MDB_PANIC PANIC} - a fatal error occurred earlier and the environment must be shut down.</li>
     *         <li>{@link #MDB_MAP_RESIZED MAP_RESIZED} - another process wrote data beyond this {@code MDB_env}'s mapsize and this environment's map must be resized as well. See
     *         {@link #mdb_env_set_mapsize env_set_mapsize}.</li>
     *         <li>{@link #MDB_READERS_FULL READERS_FULL} - a read-only transaction was requested and the reader lock table is full. See {@link #mdb_env_set_maxreaders env_set_maxreaders}.</li>
     *         <li>{@code ENOMEM} - out of memory.</li>
     *         </ul>
     */
    public static int mdb_txn_begin(@NativeType("MDB_env *") long env, @NativeType("MDB_txn *") long parent, @NativeType("unsigned int") int flags, @NativeType("MDB_txn **") PointerBuffer txn) {
        if (CHECKS) {
            check(env);
            check(txn, 1);
        }
        return nmdb_txn_begin(env, parent, flags, memAddress(txn));
    }

    // --- [ mdb_txn_env ] ---

    /** Unsafe version of: {@link #mdb_txn_env txn_env} */
    public static native long nmdb_txn_env(long txn);

    /**
     * Returns the transaction's {@code MDB_env}.
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     */
    @NativeType("MDB_env *")
    public static long mdb_txn_env(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_txn_env(txn);
    }

    // --- [ mdb_txn_id ] ---

    /** Unsafe version of: {@link #mdb_txn_id txn_id} */
    public static native long nmdb_txn_id(long txn);

    /**
     * Returns the transaction's ID.
     * 
     * <p>This returns the identifier associated with this transaction. For a read-only transaction, this corresponds to the snapshot being read; concurrent
     * readers will frequently have the same transaction ID.</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     *
     * @return a transaction ID, valid if input is an active transaction
     */
    @NativeType("size_t")
    public static long mdb_txn_id(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_txn_id(txn);
    }

    // --- [ mdb_txn_commit ] ---

    /** Unsafe version of: {@link #mdb_txn_commit txn_commit} */
    public static native int nmdb_txn_commit(long txn);

    /**
     * Commits all the operations of a transaction into the database.
     * 
     * <p>The transaction handle is freed. It and its cursors must not be used again after this call, except with {@link #mdb_cursor_renew cursor_renew}.</p>
     * 
     * <p>Earlier documentation incorrectly said all cursors would be freed. Only write-transactions free cursors.</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     *
     * @return a non-zero error value on failure and 0 on success. Some possible errors are:
     *         
     *         <ul>
     *         <li>{@code EINVAL} - an invalid parameter was specified.</li>
     *         <li>{@code ENOSPC} - no more disk space.</li>
     *         <li>{@code EIO} - a low-level I/O error occurred while writing.</li>
     *         <li>{@code ENOMEM} - out of memory.</li>
     *         </ul>
     */
    public static int mdb_txn_commit(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_txn_commit(txn);
    }

    // --- [ mdb_txn_abort ] ---

    /** Unsafe version of: {@link #mdb_txn_abort txn_abort} */
    public static native void nmdb_txn_abort(long txn);

    /**
     * Abandons all the operations of the transaction instead of saving them.
     * 
     * <p>The transaction handle is freed. It and its cursors must not be used again after this call, except with {@link #mdb_cursor_renew cursor_renew}.</p>
     * 
     * <p>Earlier documentation incorrectly said all cursors would be freed. Only write-transactions free cursors.
     * "</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     */
    public static void mdb_txn_abort(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        nmdb_txn_abort(txn);
    }

    // --- [ mdb_txn_reset ] ---

    /** Unsafe version of: {@link #mdb_txn_reset txn_reset} */
    public static native void nmdb_txn_reset(long txn);

    /**
     * Resets a read-only transaction.
     * 
     * <p>Aborts the transaction like {@link #mdb_txn_abort txn_abort}, but keeps the transaction handle. {@link #mdb_txn_renew txn_renew} may reuse the handle. This saves allocation overhead if the
     * process will start a new read-only transaction soon, and also locking overhead if {@link #MDB_NOTLS NOTLS} is in use. The reader table lock is released, but the table
     * slot stays tied to its thread or {@code MDB_txn}. Use {@link #mdb_txn_abort txn_abort} to discard a reset handle, and to free its lock table slot if {@link #MDB_NOTLS NOTLS} is in use.</p>
     * 
     * <p>Cursors opened within the transaction must not be used again after this call, except with {@link #mdb_cursor_renew cursor_renew}.</p>
     * 
     * <p>Reader locks generally don't interfere with writers, but they keep old versions of database pages allocated. Thus they prevent the old pages from being
     * reused when writers commit new data, and so under heavy load the database size may grow much more rapidly than otherwise.</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     */
    public static void mdb_txn_reset(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        nmdb_txn_reset(txn);
    }

    // --- [ mdb_txn_renew ] ---

    /** Unsafe version of: {@link #mdb_txn_renew txn_renew} */
    public static native int nmdb_txn_renew(long txn);

    /**
     * Renews a read-only transaction.
     * 
     * <p>This acquires a new reader lock for a transaction handle that had been released by {@link #mdb_txn_reset txn_reset}. It must be called before a reset transaction may be
     * used again.</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     */
    public static int mdb_txn_renew(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_txn_renew(txn);
    }

    // --- [ mdb_dbi_open ] ---

    /** Unsafe version of: {@link #mdb_dbi_open dbi_open} */
    public static native int nmdb_dbi_open(long txn, long name, int flags, long dbi);

    /**
     * Opens a database in the environment.
     * 
     * <p>A database handle denotes the name and parameters of a database, independently of whether such a database exists. The database handle may be discarded
     * by calling {@link #mdb_dbi_close dbi_close}. The old database handle is returned if the database was already open. The handle may only be closed once.</p>
     * 
     * <p>The database handle will be private to the current transaction until the transaction is successfully committed. If the transaction is aborted the
     * handle will be closed automatically. After a successful commit the handle will reside in the shared environment, and may be used by other transactions.</p>
     * 
     * <p>This function must not be called from multiple concurrent transactions in the same process. A transaction that uses this function must finish (either
     * commit or abort) before any other transaction in the process may use this function.</p>
     * 
     * <p>To use named databases (with {@code name} != {@code NULL}), {@link #mdb_env_set_maxdbs env_set_maxdbs} must be called before opening the environment. Database names are keys in the
     * unnamed database, and may be read but not written.</p>
     *
     * @param txn   a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param name  the name of the database to open. If only a single database is needed in the environment, this value may be {@code NULL}.
     * @param flags special options for this database. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here.
     *              
     *              <ul>
     *              <li>{@link #MDB_REVERSEKEY REVERSEKEY}
     *              
     *              <p>Keys are strings to be compared in reverse order, from the end of the strings to the beginning. By default, Keys are treated as strings and
     *              compared from beginning to end.</p></li>
     *              <li>{@link #MDB_DUPSORT DUPSORT}
     *              
     *              <p>Duplicate keys may be used in the database. (Or, from another perspective, keys may have multiple data items, stored in sorted order.) By
     *              default keys must be unique and may have only a single data item.</p></li>
     *              <li>{@link #MDB_INTEGERKEY INTEGERKEY}
     *              
     *              <p>Keys are binary integers in native byte order, either {@code unsigned int} or {@code size_t}, and will be sorted as such. The keys must all be
     *              of the same size.</p></li>
     *              <li>{@link #MDB_DUPFIXED DUPFIXED}
     *              
     *              <p>This flag may only be used in combination with {@link #MDB_DUPSORT DUPSORT}. This option tells the library that the data items for this database are all the same
     *              size, which allows further optimizations in storage and retrieval. When all data items are the same size, the {@link #MDB_GET_MULTIPLE GET_MULTIPLE}, {@link #MDB_NEXT_MULTIPLE NEXT_MULTIPLE} and
     *              {@link #MDB_PREV_MULTIPLE PREV_MULTIPLE} cursor operations may be used to retrieve multiple items at once.</p></li>
     *              <li>{@link #MDB_INTEGERDUP INTEGERDUP}
     *              
     *              <p>This option specifies that duplicate data items are binary integers, similar to {@link #MDB_INTEGERKEY INTEGERKEY} keys.</p></li>
     *              <li>{@link #MDB_REVERSEDUP REVERSEDUP}
     *              
     *              <p>This option specifies that duplicate data items should be compared as strings in reverse order.</p></li>
     *              <li>{@link #MDB_CREATE CREATE}
     *              
     *              <p>Create the named database if it doesn't exist. This option is not allowed in a read-only transaction or a read-only environment.</p></li>
     *              </ul>
     * @param dbi   address where the new {@code MDB_dbi} handle will be stored
     *
     * @return a non-zero error value on failure and 0 on success. Some possible errors are:
     *         
     *         <ul>
     *         <li>{@link #MDB_NOTFOUND NOTFOUND} - the specified database doesn't exist in the environment and {@link #MDB_CREATE CREATE} was not specified.</li>
     *         <li>{@link #MDB_DBS_FULL DBS_FULL} - too many databases have been opened. See {@link #mdb_env_set_maxdbs env_set_maxdbs}.</li>
     *         </ul>
     */
    public static int mdb_dbi_open(@NativeType("MDB_txn *") long txn, @Nullable @NativeType("char const *") ByteBuffer name, @NativeType("unsigned int") int flags, @NativeType("MDB_dbi *") IntBuffer dbi) {
        if (CHECKS) {
            check(txn);
            checkNT1Safe(name);
            check(dbi, 1);
        }
        return nmdb_dbi_open(txn, memAddressSafe(name), flags, memAddress(dbi));
    }

    /**
     * Opens a database in the environment.
     * 
     * <p>A database handle denotes the name and parameters of a database, independently of whether such a database exists. The database handle may be discarded
     * by calling {@link #mdb_dbi_close dbi_close}. The old database handle is returned if the database was already open. The handle may only be closed once.</p>
     * 
     * <p>The database handle will be private to the current transaction until the transaction is successfully committed. If the transaction is aborted the
     * handle will be closed automatically. After a successful commit the handle will reside in the shared environment, and may be used by other transactions.</p>
     * 
     * <p>This function must not be called from multiple concurrent transactions in the same process. A transaction that uses this function must finish (either
     * commit or abort) before any other transaction in the process may use this function.</p>
     * 
     * <p>To use named databases (with {@code name} != {@code NULL}), {@link #mdb_env_set_maxdbs env_set_maxdbs} must be called before opening the environment. Database names are keys in the
     * unnamed database, and may be read but not written.</p>
     *
     * @param txn   a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param name  the name of the database to open. If only a single database is needed in the environment, this value may be {@code NULL}.
     * @param flags special options for this database. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here.
     *              
     *              <ul>
     *              <li>{@link #MDB_REVERSEKEY REVERSEKEY}
     *              
     *              <p>Keys are strings to be compared in reverse order, from the end of the strings to the beginning. By default, Keys are treated as strings and
     *              compared from beginning to end.</p></li>
     *              <li>{@link #MDB_DUPSORT DUPSORT}
     *              
     *              <p>Duplicate keys may be used in the database. (Or, from another perspective, keys may have multiple data items, stored in sorted order.) By
     *              default keys must be unique and may have only a single data item.</p></li>
     *              <li>{@link #MDB_INTEGERKEY INTEGERKEY}
     *              
     *              <p>Keys are binary integers in native byte order, either {@code unsigned int} or {@code size_t}, and will be sorted as such. The keys must all be
     *              of the same size.</p></li>
     *              <li>{@link #MDB_DUPFIXED DUPFIXED}
     *              
     *              <p>This flag may only be used in combination with {@link #MDB_DUPSORT DUPSORT}. This option tells the library that the data items for this database are all the same
     *              size, which allows further optimizations in storage and retrieval. When all data items are the same size, the {@link #MDB_GET_MULTIPLE GET_MULTIPLE}, {@link #MDB_NEXT_MULTIPLE NEXT_MULTIPLE} and
     *              {@link #MDB_PREV_MULTIPLE PREV_MULTIPLE} cursor operations may be used to retrieve multiple items at once.</p></li>
     *              <li>{@link #MDB_INTEGERDUP INTEGERDUP}
     *              
     *              <p>This option specifies that duplicate data items are binary integers, similar to {@link #MDB_INTEGERKEY INTEGERKEY} keys.</p></li>
     *              <li>{@link #MDB_REVERSEDUP REVERSEDUP}
     *              
     *              <p>This option specifies that duplicate data items should be compared as strings in reverse order.</p></li>
     *              <li>{@link #MDB_CREATE CREATE}
     *              
     *              <p>Create the named database if it doesn't exist. This option is not allowed in a read-only transaction or a read-only environment.</p></li>
     *              </ul>
     * @param dbi   address where the new {@code MDB_dbi} handle will be stored
     *
     * @return a non-zero error value on failure and 0 on success. Some possible errors are:
     *         
     *         <ul>
     *         <li>{@link #MDB_NOTFOUND NOTFOUND} - the specified database doesn't exist in the environment and {@link #MDB_CREATE CREATE} was not specified.</li>
     *         <li>{@link #MDB_DBS_FULL DBS_FULL} - too many databases have been opened. See {@link #mdb_env_set_maxdbs env_set_maxdbs}.</li>
     *         </ul>
     */
    public static int mdb_dbi_open(@NativeType("MDB_txn *") long txn, @Nullable @NativeType("char const *") CharSequence name, @NativeType("unsigned int") int flags, @NativeType("MDB_dbi *") IntBuffer dbi) {
        if (CHECKS) {
            check(txn);
            check(dbi, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nmdb_dbi_open(txn, nameEncoded, flags, memAddress(dbi));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ mdb_stat ] ---

    /** Unsafe version of: {@link #mdb_stat stat} */
    public static native int nmdb_stat(long txn, int dbi, long stat);

    /**
     * Retrieves statistics for a database.
     *
     * @param txn  a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi  a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param stat the address of an {@link MDBStat} structure where the statistics will be copied
     */
    public static int mdb_stat(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_stat *") MDBStat stat) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_stat(txn, dbi, stat.address());
    }

    // --- [ mdb_dbi_flags ] ---

    /** Unsafe version of: {@link #mdb_dbi_flags dbi_flags} */
    public static native int nmdb_dbi_flags(long txn, int dbi, long flags);

    /**
     * Retrieve the DB flags for a database handle.
     *
     * @param txn   a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi   a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param flags address where the flags will be returned
     */
    public static int mdb_dbi_flags(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("unsigned int *") IntBuffer flags) {
        if (CHECKS) {
            check(txn);
            check(flags, 1);
        }
        return nmdb_dbi_flags(txn, dbi, memAddress(flags));
    }

    // --- [ mdb_dbi_close ] ---

    /** Unsafe version of: {@link #mdb_dbi_close dbi_close} */
    public static native void nmdb_dbi_close(long env, int dbi);

    /**
     * Closes a database handle. Normally unnecessary. Use with care:
     * 
     * <p>This call is not mutex protected. Handles should only be closed by a single thread, and only if no other threads are going to reference the database
     * handle or one of its cursors any further. Do not close a handle if an existing transaction has modified its database. Doing so can cause misbehavior
     * from database corruption to errors like {@link #MDB_BAD_VALSIZE BAD_VALSIZE} (since the DB name is gone).</p>
     * 
     * <p>Closing a database handle is not necessary, but lets {@link #mdb_dbi_open dbi_open} reuse the handle value. Usually it's better to set a bigger {@link #mdb_env_set_maxdbs env_set_maxdbs}, unless
     * that value would be large.</p>
     *
     * @param env an environment handle returned by {@link #mdb_env_create env_create}
     * @param dbi a database handle returned by {@link #mdb_dbi_open dbi_open}
     */
    public static void mdb_dbi_close(@NativeType("MDB_env *") long env, @NativeType("MDB_dbi") int dbi) {
        if (CHECKS) {
            check(env);
        }
        nmdb_dbi_close(env, dbi);
    }

    // --- [ mdb_drop ] ---

    /** Unsafe version of: {@link #mdb_drop drop} */
    public static native int nmdb_drop(long txn, int dbi, int del);

    /**
     * Empties or deletes+closes a database.
     * 
     * <p>See {@link #mdb_dbi_close dbi_close} for restrictions about closing the DB handle.</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param del 0 to empty the DB, 1 to delete it from the environment and close the DB handle
     */
    public static int mdb_drop(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("int") boolean del) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_drop(txn, dbi, del ? 1 : 0);
    }

    // --- [ mdb_set_compare ] ---

    /** Unsafe version of: {@link #mdb_set_compare set_compare} */
    public static native int nmdb_set_compare(long txn, int dbi, long cmp);

    /**
     * Sets a custom key comparison function for a database.
     * 
     * <p>The comparison function is called whenever it is necessary to compare a key specified by the application with a key currently stored in the database.
     * If no comparison function is specified, and no special key flags were specified with {@link #mdb_dbi_open dbi_open}, the keys are compared lexically, with shorter keys
     * collating before longer keys.</p>
     * 
     * <p>This function must be called before any data access functions are used, otherwise data corruption may occur. The same comparison function must be used
     * by every program accessing the database, every time the database is used.</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param cmp an {@link MDBCmpFunc} function
     */
    public static int mdb_set_compare(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_cmp_func *") MDBCmpFuncI cmp) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_set_compare(txn, dbi, cmp.address());
    }

    // --- [ mdb_set_dupsort ] ---

    /** Unsafe version of: {@link #mdb_set_dupsort set_dupsort} */
    public static native int nmdb_set_dupsort(long txn, int dbi, long cmp);

    /**
     * Sets a custom data comparison function for a {@link #MDB_DUPSORT DUPSORT} database.
     * 
     * <p>This comparison function is called whenever it is necessary to compare a data item specified by the application with a data item currently stored in
     * the database.</p>
     * 
     * <p>This function only takes effect if the database was opened with the {@link #MDB_DUPSORT DUPSORT} flag.</p>
     * 
     * <p>If no comparison function is specified, and no special key flags were specified with {@link #mdb_dbi_open dbi_open}, the data items are compared lexically, with shorter
     * items collating before longer items.</p>
     * 
     * <p>This function must be called before any data access functions are used, otherwise data corruption may occur. The same comparison function must be used
     * by every program accessing the database, every time the database is used.</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param cmp an {@link MDBCmpFunc} function
     */
    public static int mdb_set_dupsort(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_cmp_func *") MDBCmpFuncI cmp) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_set_dupsort(txn, dbi, cmp.address());
    }

    // --- [ mdb_set_relfunc ] ---

    /** Unsafe version of: {@link #mdb_set_relfunc set_relfunc} */
    public static native int nmdb_set_relfunc(long txn, int dbi, long rel);

    /**
     * Sets a relocation function for a {@link #MDB_FIXEDMAP FIXEDMAP} database.
     * 
     * <p>The relocation function is called whenever it is necessary to move the data of an item to a different position in the database (e.g. through tree
     * balancing operations, shifts as a result of adds or deletes, etc.). It is intended to allow address/position-dependent data items to be stored in a
     * database in an environment opened with the {@link #MDB_FIXEDMAP FIXEDMAP} option.</p>
     * 
     * <p>Currently the relocation feature is unimplemented and setting this function has no effect.</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param rel an {@link MDBRelFunc} function
     */
    public static int mdb_set_relfunc(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_rel_func *") MDBRelFuncI rel) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_set_relfunc(txn, dbi, rel.address());
    }

    // --- [ mdb_set_relctx ] ---

    /** Unsafe version of: {@link #mdb_set_relctx set_relctx} */
    public static native int nmdb_set_relctx(long txn, int dbi, long ctx);

    /**
     * Sets a context pointer for a {@link #MDB_FIXEDMAP FIXEDMAP} database's relocation function.
     * 
     * <p>See {@link #mdb_set_relfunc set_relfunc} and {@link MDBRelFunc} for more details.</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param ctx an arbitrary pointer for whatever the application needs. It will be passed to the callback function set by {@link MDBRelFunc} as its {@code relctx}
     *            parameter whenever the callback is invoked.
     */
    public static int mdb_set_relctx(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("void *") long ctx) {
        if (CHECKS) {
            check(txn);
            check(ctx);
        }
        return nmdb_set_relctx(txn, dbi, ctx);
    }

    // --- [ mdb_get ] ---

    /** Unsafe version of: {@link #mdb_get get} */
    public static native int nmdb_get(long txn, int dbi, long key, long data);

    /**
     * Gets items from a database.
     * 
     * <p>This function retrieves key/data pairs from the database. The address and length of the data associated with the specified {@code key} are returned in
     * the structure to which {@code data} refers.</p>
     * 
     * <p>If the database supports duplicate keys ({@link #MDB_DUPSORT DUPSORT}) then the first data item for the key will be returned. Retrieval of other items requires the use of
     * {@link #mdb_cursor_get cursor_get}.</p>
     * 
     * <p>The memory pointed to by the returned values is owned by the database. The caller need not dispose of the memory, and may not modify it in any way. For
     * values returned in a read-only transaction any modification attempts will cause a SIGSEGV.</p>
     * 
     * <p>Values returned from the database are valid only until a subsequent update operation, or the end of the transaction.</p>
     *
     * @param txn  a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi  a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param key  the key to search for in the database
     * @param data the data corresponding to the key
     */
    public static int mdb_get(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_val *") MDBVal key, @NativeType("MDB_val *") MDBVal data) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_get(txn, dbi, key.address(), data.address());
    }

    // --- [ mdb_put ] ---

    /** Unsafe version of: {@link #mdb_put put} */
    public static native int nmdb_put(long txn, int dbi, long key, long data, int flags);

    /**
     * Stores items into a database.
     * 
     * <p>This function stores key/data pairs in the database. The default behavior is to enter the new key/data pair, replacing any previously existing key if
     * duplicates are disallowed, or adding a duplicate data item if duplicates are allowed ({@link #MDB_DUPSORT DUPSORT}).</p>
     *
     * @param txn   a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi   a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param key   the key to store in the database
     * @param data  the data to store
     * @param flags special options for this operation. This parameter must be set to 0 or by bitwise OR'ing together one or more of the values described here.
     *              
     *              <ul>
     *              <li>{@link #MDB_NODUPDATA NODUPDATA} - enter the new key/data pair only if it does not already appear in the database. This flag may only be specified if the database
     *              was opened with {@link #MDB_DUPSORT DUPSORT}. The function will return {@link #MDB_KEYEXIST KEYEXIST} if the key/data pair already appears in the database.</li>
     *              <li>{@link #MDB_NOOVERWRITE NOOVERWRITE} - enter the new key/data pair only if the key does not already appear in the database. The function will return {@link #MDB_KEYEXIST KEYEXIST} if the
     *              key already appears in the database, even if the database supports duplicates ({@link #MDB_DUPSORT DUPSORT}). The {@code data} parameter will be set to point to
     *              the existing item.</li>
     *              <li>{@link #MDB_RESERVE RESERVE} - reserve space for data of the given size, but don't copy the given data. Instead, return a pointer to the reserved space, which the
     *              caller can fill in later - before the next update operation or the transaction ends. This saves an extra memcpy if the data is being generated
     *              later.
     *              
     *              <p>LMDB does nothing else with this memory, the caller is expected to modify all of the space requested. This flag must not be specified if the
     *              database was opened with {@link #MDB_DUPSORT DUPSORT}.</p></li>
     *              <li>{@link #MDB_APPEND APPEND} - append the given key/data pair to the end of the database. This option allows fast bulk loading when keys are already known to be in
     *              the correct order. Loading unsorted keys with this flag will cause a {@link #MDB_KEYEXIST KEYEXIST} error.</li>
     *              <li>{@link #MDB_APPENDDUP APPENDDUP} - as above, but for sorted dup data.</li>
     *              </ul>
     */
    public static int mdb_put(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_val *") MDBVal key, @NativeType("MDB_val *") MDBVal data, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_put(txn, dbi, key.address(), data.address(), flags);
    }

    // --- [ mdb_del ] ---

    /** Unsafe version of: {@link #mdb_del del} */
    public static native int nmdb_del(long txn, int dbi, long key, long data);

    /**
     * Deletes items from a database.
     * 
     * <p>This function removes key/data pairs from the database. If the database does not support sorted duplicate data items ({@link #MDB_DUPSORT DUPSORT}) the data parameter is
     * ignored.</p>
     * 
     * <p>If the database supports sorted duplicates and the data parameter is {@code NULL}, all of the duplicate data items for the key will be deleted. Otherwise, if
     * the data parameter is non-{@code NULL} only the matching data item will be deleted.</p>
     * 
     * <p>This function will return {@link #MDB_NOTFOUND NOTFOUND} if the specified key/data pair is not in the database.</p>
     *
     * @param txn  a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi  a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param key  the key to delete from the database
     * @param data the data to delete
     */
    public static int mdb_del(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_val *") MDBVal key, @Nullable @NativeType("MDB_val *") MDBVal data) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_del(txn, dbi, key.address(), memAddressSafe(data));
    }

    // --- [ mdb_cursor_open ] ---

    /** Unsafe version of: {@link #mdb_cursor_open cursor_open} */
    public static native int nmdb_cursor_open(long txn, int dbi, long cursor);

    /**
     * Creates a cursor handle.
     * 
     * <p>A cursor is associated with a specific transaction and database. A cursor cannot be used when its database handle is closed. Nor when its transaction
     * has ended, except with {@link #mdb_cursor_renew cursor_renew}.</p>
     * 
     * <p>It can be discarded with {@link #mdb_cursor_close cursor_close}.</p>
     * 
     * <p>A cursor in a write-transaction can be closed before its transaction ends, and will otherwise be closed when its transaction ends.</p>
     * 
     * <p>A cursor in a read-only transaction must be closed explicitly, before or after its transaction ends. It can be reused with {@link #mdb_cursor_renew cursor_renew} before
     * finally closing it.</p>
     * 
     * <p>Earlier documentation said that cursors in every transaction were closed when the transaction committed or aborted.</p>
     *
     * @param txn    a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi    a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param cursor address where the new {@code MDB_cursor} handle will be stored
     */
    public static int mdb_cursor_open(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_cursor **") PointerBuffer cursor) {
        if (CHECKS) {
            check(txn);
            check(cursor, 1);
        }
        return nmdb_cursor_open(txn, dbi, memAddress(cursor));
    }

    // --- [ mdb_cursor_close ] ---

    /** Unsafe version of: {@link #mdb_cursor_close cursor_close} */
    public static native void nmdb_cursor_close(long cursor);

    /**
     * Closes a cursor handle.
     * 
     * <p>The cursor handle will be freed and must not be used again after this call. Its transaction must still be live if it is a write-transaction.</p>
     *
     * @param cursor a cursor handle returned by {@link #mdb_cursor_open cursor_open}
     */
    public static void mdb_cursor_close(@NativeType("MDB_cursor *") long cursor) {
        if (CHECKS) {
            check(cursor);
        }
        nmdb_cursor_close(cursor);
    }

    // --- [ mdb_cursor_renew ] ---

    /** Unsafe version of: {@link #mdb_cursor_renew cursor_renew} */
    public static native int nmdb_cursor_renew(long txn, long cursor);

    /**
     * Renews a cursor handle.
     * 
     * <p>A cursor is associated with a specific transaction and database. Cursors that are only used in read-only transactions may be re-used, to avoid
     * unnecessary malloc/free overhead. The cursor may be associated with a new read-only transaction, and referencing the same database handle as it was
     * created with. This may be done whether the previous transaction is live or dead.</p>
     *
     * @param txn    a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param cursor a cursor handle returned by {@link #mdb_cursor_open cursor_open}
     */
    public static int mdb_cursor_renew(@NativeType("MDB_txn *") long txn, @NativeType("MDB_cursor *") long cursor) {
        if (CHECKS) {
            check(txn);
            check(cursor);
        }
        return nmdb_cursor_renew(txn, cursor);
    }

    // --- [ mdb_cursor_txn ] ---

    /** Unsafe version of: {@link #mdb_cursor_txn cursor_txn} */
    public static native long nmdb_cursor_txn(long cursor);

    /**
     * Returns the cursor's transaction handle.
     *
     * @param cursor a cursor handle returned by {@link #mdb_cursor_open cursor_open}
     */
    @NativeType("MDB_txn *")
    public static long mdb_cursor_txn(@NativeType("MDB_cursor *") long cursor) {
        if (CHECKS) {
            check(cursor);
        }
        return nmdb_cursor_txn(cursor);
    }

    // --- [ mdb_cursor_dbi ] ---

    /** Unsafe version of: {@link #mdb_cursor_dbi cursor_dbi} */
    public static native int nmdb_cursor_dbi(long cursor);

    /**
     * Return the cursor's database handle.
     *
     * @param cursor a cursor handle returned by {@link #mdb_cursor_open cursor_open}
     */
    @NativeType("MDB_dbi")
    public static int mdb_cursor_dbi(@NativeType("MDB_cursor *") long cursor) {
        if (CHECKS) {
            check(cursor);
        }
        return nmdb_cursor_dbi(cursor);
    }

    // --- [ mdb_cursor_get ] ---

    /** Unsafe version of: {@link #mdb_cursor_get cursor_get} */
    public static native int nmdb_cursor_get(long cursor, long key, long data, int op);

    /**
     * Retrieves by cursor.
     * 
     * <p>This function retrieves key/data pairs from the database. The address and length of the key are returned in the object to which {@code key} refers
     * (except for the case of the {@link #MDB_SET SET} option, in which the {@code key} object is unchanged), and the address and length of the data are returned in the
     * object to which {@code data} refers.</p>
     * 
     * <p>See {@link #mdb_get get} for restrictions on using the output values.</p>
     *
     * @param cursor a cursor handle returned by {@link #mdb_cursor_open cursor_open}
     * @param key    the key for a retrieved item
     * @param data   the data of a retrieved item
     * @param op     a cursor operation {@code MDB_cursor_op}. One of:<br><table><tr><td>{@link #MDB_FIRST FIRST}</td><td>{@link #MDB_FIRST_DUP FIRST_DUP}</td><td>{@link #MDB_GET_BOTH GET_BOTH}</td><td>{@link #MDB_GET_BOTH_RANGE GET_BOTH_RANGE}</td><td>{@link #MDB_GET_CURRENT GET_CURRENT}</td><td>{@link #MDB_GET_MULTIPLE GET_MULTIPLE}</td><td>{@link #MDB_LAST LAST}</td><td>{@link #MDB_LAST_DUP LAST_DUP}</td><td>{@link #MDB_NEXT NEXT}</td><td>{@link #MDB_NEXT_DUP NEXT_DUP}</td></tr><tr><td>{@link #MDB_NEXT_MULTIPLE NEXT_MULTIPLE}</td><td>{@link #MDB_NEXT_NODUP NEXT_NODUP}</td><td>{@link #MDB_PREV PREV}</td><td>{@link #MDB_PREV_DUP PREV_DUP}</td><td>{@link #MDB_PREV_NODUP PREV_NODUP}</td><td>{@link #MDB_SET SET}</td><td>{@link #MDB_SET_KEY SET_KEY}</td><td>{@link #MDB_SET_RANGE SET_RANGE}</td><td>{@link #MDB_PREV_MULTIPLE PREV_MULTIPLE}</td></tr></table>
     */
    public static int mdb_cursor_get(@NativeType("MDB_cursor *") long cursor, @NativeType("MDB_val *") MDBVal key, @NativeType("MDB_val *") MDBVal data, @NativeType("MDB_cursor_op") int op) {
        if (CHECKS) {
            check(cursor);
        }
        return nmdb_cursor_get(cursor, key.address(), data.address(), op);
    }

    // --- [ mdb_cursor_put ] ---

    /** Unsafe version of: {@link #mdb_cursor_put cursor_put} */
    public static native int nmdb_cursor_put(long cursor, long key, long data, int flags);

    /**
     * Stores by cursor.
     * 
     * <p>This function stores key/data pairs into the database. The cursor is positioned at the new item, or on failure usually near it.</p>
     * 
     * <p>Earlier documentation incorrectly said errors would leave the state of the cursor unchanged.</p>
     *
     * @param cursor a cursor handle returned by {@link #mdb_cursor_open cursor_open}
     * @param key    the key operated on
     * @param data   the data operated on
     * @param flags  options for this operation. This parameter must be set to 0 or one of the values described here.
     *               
     *               <ul>
     *               <li>{@link #MDB_CURRENT CURRENT} - replace the item at the current cursor position. The {@code key} parameter must still be provided, and must match it. If using
     *               sorted duplicates ({@link #MDB_DUPSORT DUPSORT}) the data item must still sort into the same place. This is intended to be used when the new data is the same size
     *               as the old. Otherwise it will simply perform a delete of the old record followed by an insert.</li>
     *               <li>{@link #MDB_NODUPDATA NODUPDATA} - enter the new key/data pair only if it does not already appear in the database. This flag may only be specified if the database
     *               was opened with {@link #MDB_DUPSORT DUPSORT}. The function will return {@link #MDB_KEYEXIST KEYEXIST} if the key/data pair already appears in the database.</li>
     *               <li>{@link #MDB_NOOVERWRITE NOOVERWRITE} - enter the new key/data pair only if the key does not already appear in the database. The function will return {@link #MDB_KEYEXIST KEYEXIST} if
     *               the key already appears in the database, even if the database supports duplicates ({@link #MDB_DUPSORT DUPSORT}).</li>
     *               <li>{@link #MDB_RESERVE RESERVE} - reserve space for data of the given size, but don't copy the given data. Instead, return a pointer to the reserved space, which
     *               the caller can fill in later - before the next update operation or the transaction ends. This saves an extra memcpy if the data is being
     *               generated later. This flag must not be specified if the database was opened with {@link #MDB_DUPSORT DUPSORT}.</li>
     *               <li>{@link #MDB_APPEND APPEND} - append the given key/data pair to the end of the database. No key comparisons are performed. This option allows fast bulk loading
     *               when keys are already known to be in the correct order. Loading unsorted keys with this flag will cause a {@link #MDB_KEYEXIST KEYEXIST} error.</li>
     *               <li>{@link #MDB_APPENDDUP APPENDDUP} - as above, but for sorted dup data.</li>
     *               <li>{@link #MDB_MULTIPLE MULTIPLE} - store multiple contiguous data elements in a single request. This flag may only be specified if the database was opened with
     *               {@link #MDB_DUPFIXED DUPFIXED}. The {@code data} argument must be an array of two {@link MDBVal}. The {@code mv_size} of the first {@code MDBVal} must be the size of a
     *               single data element. The {@code mv_data} of the first {@code MDBVal} must point to the beginning of the array of contiguous data elements. The
     *               {@code mv_size} of the second {@code MDBVal} must be the count of the number of data elements to store. On return this field will be set to the
     *               count of the number of elements actually written. The {@code mv_data} of the second {@code MDBVal} is unused.</li>
     *               </ul>
     */
    public static int mdb_cursor_put(@NativeType("MDB_cursor *") long cursor, @NativeType("MDB_val *") MDBVal key, @NativeType("MDB_val *") MDBVal data, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(cursor);
        }
        return nmdb_cursor_put(cursor, key.address(), data.address(), flags);
    }

    // --- [ mdb_cursor_del ] ---

    /** Unsafe version of: {@link #mdb_cursor_del cursor_del} */
    public static native int nmdb_cursor_del(long cursor, int flags);

    /**
     * Deletes current key/data pair.
     * 
     * <p>This function deletes the key/data pair to which the cursor refers.</p>
     * 
     * <p>This does not invalidate the cursor, so operations such as {@link #MDB_NEXT NEXT} can still be used on it. Both {@link #MDB_NEXT NEXT} and {@link #MDB_GET_CURRENT GET_CURRENT} will return the same record after
     * this operation.</p>
     *
     * @param cursor a cursor handle returned by {@link #mdb_cursor_open cursor_open}
     * @param flags  options for this operation. This parameter must be set to 0 or one of the values described here.
     *               
     *               <ul>
     *               <li>{@link #MDB_NODUPDATA NODUPDATA} - delete all of the data items for the current key. This flag may only be specified if the database was opened with {@link #MDB_DUPSORT DUPSORT}.</li>
     *               </ul>
     */
    public static int mdb_cursor_del(@NativeType("MDB_cursor *") long cursor, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(cursor);
        }
        return nmdb_cursor_del(cursor, flags);
    }

    // --- [ mdb_cursor_count ] ---

    /** Unsafe version of: {@link #mdb_cursor_count cursor_count} */
    public static native int nmdb_cursor_count(long cursor, long countp);

    /**
     * Returns count of duplicates for current key.
     * 
     * <p>This call is only valid on databases that support sorted duplicate data items {@link #MDB_DUPSORT DUPSORT}.</p>
     *
     * @param cursor a cursor handle returned by {@link #mdb_cursor_open cursor_open}
     * @param countp address where the count will be stored
     */
    public static int mdb_cursor_count(@NativeType("MDB_cursor *") long cursor, @NativeType("size_t *") PointerBuffer countp) {
        if (CHECKS) {
            check(cursor);
            check(countp, 1);
        }
        return nmdb_cursor_count(cursor, memAddress(countp));
    }

    // --- [ mdb_cmp ] ---

    /** Unsafe version of: {@link #mdb_cmp cmp} */
    public static native int nmdb_cmp(long txn, int dbi, long a, long b);

    /**
     * Compares two data items according to a particular database.
     * 
     * <p>This returns a comparison as if the two data items were keys in the specified database.</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param a   the first item to compare
     * @param b   the second item to compare
     *
     * @return &lt; 0 if a &lt; b, 0 if a == b, &gt; 0 if a &gt; b
     */
    public static int mdb_cmp(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_val const *") MDBVal a, @NativeType("MDB_val const *") MDBVal b) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_cmp(txn, dbi, a.address(), b.address());
    }

    // --- [ mdb_dcmp ] ---

    /** Unsafe version of: {@link #mdb_dcmp dcmp} */
    public static native int nmdb_dcmp(long txn, int dbi, long a, long b);

    /**
     * Compares two data items according to a particular database.
     * 
     * <p>This returns a comparison as if the two items were data items of the specified database. The database must have the {@link #MDB_DUPSORT DUPSORT} flag.</p>
     *
     * @param txn a transaction handle returned by {@link #mdb_txn_begin txn_begin}.
     * @param dbi a database handle returned by {@link #mdb_dbi_open dbi_open}
     * @param a   the first item to compare
     * @param b   the second item to compare
     *
     * @return &lt; 0 if a &lt; b, 0 if a == b, &gt; 0 if a &gt; b
     */
    public static int mdb_dcmp(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_val const *") MDBVal a, @NativeType("MDB_val const *") MDBVal b) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_dcmp(txn, dbi, a.address(), b.address());
    }

    // --- [ mdb_reader_list ] ---

    /** Unsafe version of: {@link #mdb_reader_list reader_list} */
    public static native int nmdb_reader_list(long env, long func, long ctx);

    /**
     * Dumps the entries in the reader lock table.
     *
     * @param env  an environment handle returned by {@link #mdb_env_create env_create}
     * @param func an {@link MDBMsgFunc} function
     * @param ctx  anything the message function needs
     */
    public static int mdb_reader_list(@NativeType("MDB_env *") long env, @NativeType("MDB_msg_func *") MDBMsgFuncI func, @NativeType("void *") long ctx) {
        if (CHECKS) {
            check(env);
            check(ctx);
        }
        return nmdb_reader_list(env, func.address(), ctx);
    }

    // --- [ mdb_reader_check ] ---

    /** Unsafe version of: {@link #mdb_reader_check reader_check} */
    public static native int nmdb_reader_check(long env, long dead);

    /**
     * Checks for stale entries in the reader lock table.
     *
     * @param env  an environment handle returned by {@link #mdb_env_create env_create}
     * @param dead number of stale slots that were cleared
     */
    public static int mdb_reader_check(@NativeType("MDB_env *") long env, @NativeType("int *") IntBuffer dead) {
        if (CHECKS) {
            check(env);
            check(dead, 1);
        }
        return nmdb_reader_check(env, memAddress(dead));
    }

    /** Array version of: {@link #nmdb_version} */
    public static native long nmdb_version(int[] major, int[] minor, int[] patch);

    /** Array version of: {@link #mdb_version version} */
    @Nullable
    @NativeType("char *")
    public static String mdb_version(@Nullable @NativeType("int *") int[] major, @Nullable @NativeType("int *") int[] minor, @Nullable @NativeType("int *") int[] patch) {
        if (CHECKS) {
            checkSafe(major, 1);
            checkSafe(minor, 1);
            checkSafe(patch, 1);
        }
        long __result = nmdb_version(major, minor, patch);
        return memASCIISafe(__result);
    }

    /** Array version of: {@link #nmdb_env_get_flags} */
    public static native int nmdb_env_get_flags(long env, int[] flags);

    /** Array version of: {@link #mdb_env_get_flags env_get_flags} */
    public static int mdb_env_get_flags(@NativeType("MDB_env *") long env, @NativeType("unsigned int *") int[] flags) {
        if (CHECKS) {
            check(env);
            check(flags, 1);
        }
        return nmdb_env_get_flags(env, flags);
    }

    /** Array version of: {@link #nmdb_env_get_maxreaders} */
    public static native int nmdb_env_get_maxreaders(long env, int[] readers);

    /** Array version of: {@link #mdb_env_get_maxreaders env_get_maxreaders} */
    public static int mdb_env_get_maxreaders(@NativeType("MDB_env *") long env, @NativeType("unsigned int *") int[] readers) {
        if (CHECKS) {
            check(env);
            check(readers, 1);
        }
        return nmdb_env_get_maxreaders(env, readers);
    }

    /** Array version of: {@link #nmdb_dbi_open} */
    public static native int nmdb_dbi_open(long txn, long name, int flags, int[] dbi);

    /** Array version of: {@link #mdb_dbi_open dbi_open} */
    public static int mdb_dbi_open(@NativeType("MDB_txn *") long txn, @Nullable @NativeType("char const *") ByteBuffer name, @NativeType("unsigned int") int flags, @NativeType("MDB_dbi *") int[] dbi) {
        if (CHECKS) {
            check(txn);
            checkNT1Safe(name);
            check(dbi, 1);
        }
        return nmdb_dbi_open(txn, memAddressSafe(name), flags, dbi);
    }

    /** Array version of: {@link #mdb_dbi_open dbi_open} */
    public static int mdb_dbi_open(@NativeType("MDB_txn *") long txn, @Nullable @NativeType("char const *") CharSequence name, @NativeType("unsigned int") int flags, @NativeType("MDB_dbi *") int[] dbi) {
        if (CHECKS) {
            check(txn);
            check(dbi, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(name, true);
            long nameEncoded = name == null ? NULL : stack.getPointerAddress();
            return nmdb_dbi_open(txn, nameEncoded, flags, dbi);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nmdb_dbi_flags} */
    public static native int nmdb_dbi_flags(long txn, int dbi, int[] flags);

    /** Array version of: {@link #mdb_dbi_flags dbi_flags} */
    public static int mdb_dbi_flags(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("unsigned int *") int[] flags) {
        if (CHECKS) {
            check(txn);
            check(flags, 1);
        }
        return nmdb_dbi_flags(txn, dbi, flags);
    }

    /** Array version of: {@link #nmdb_reader_check} */
    public static native int nmdb_reader_check(long env, int[] dead);

    /** Array version of: {@link #mdb_reader_check reader_check} */
    public static int mdb_reader_check(@NativeType("MDB_env *") long env, @NativeType("int *") int[] dead) {
        if (CHECKS) {
            check(env);
            check(dead, 1);
        }
        return nmdb_reader_check(env, dead);
    }

}