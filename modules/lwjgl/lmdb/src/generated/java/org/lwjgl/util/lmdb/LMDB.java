/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class LMDB {

    static { LibLMDB.initialize(); }

    public static final int
        MDB_VERSION_MAJOR = 0,
        MDB_VERSION_MINOR = 9,
        MDB_VERSION_PATCH = 35;

    public static final int MDB_VERSION_FULL = (MDB_VERSION_MAJOR << 24) | (MDB_VERSION_MINOR << 16) | MDB_VERSION_PATCH;

    public static final String MDB_VERSION_DATE = "Jan 27, 2026";

    public static final String MDB_VERSION_STRING = String.format("LMDB %d.%d.%d: (%s)", MDB_VERSION_MAJOR, MDB_VERSION_MINOR, MDB_VERSION_PATCH, MDB_VERSION_DATE);

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

    public static final int
        MDB_REVERSEKEY = 0x2,
        MDB_DUPSORT    = 0x4,
        MDB_INTEGERKEY = 0x8,
        MDB_DUPFIXED   = 0x10,
        MDB_INTEGERDUP = 0x20,
        MDB_REVERSEDUP = 0x40,
        MDB_CREATE     = 0x40000;

    public static final int
        MDB_NOOVERWRITE = 0x10,
        MDB_NODUPDATA   = 0x20,
        MDB_CURRENT     = 0x40,
        MDB_RESERVE     = 0x10000,
        MDB_APPEND      = 0x20000,
        MDB_APPENDDUP   = 0x40000,
        MDB_MULTIPLE    = 0x80000;

    public static final int MDB_CP_COMPACT = 0x1;

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

    /** {@code char * mdb_version(int * major, int * minor, int * patch)} */
    public static native long nmdb_version(long major, long minor, long patch);

    /** {@code char * mdb_version(int * major, int * minor, int * patch)} */
    @NativeType("char *")
    public static @Nullable String mdb_version(@NativeType("int *") @Nullable IntBuffer major, @NativeType("int *") @Nullable IntBuffer minor, @NativeType("int *") @Nullable IntBuffer patch) {
        if (CHECKS) {
            checkSafe(major, 1);
            checkSafe(minor, 1);
            checkSafe(patch, 1);
        }
        long __result = nmdb_version(memAddressSafe(major), memAddressSafe(minor), memAddressSafe(patch));
        return memASCIISafe(__result);
    }

    // --- [ mdb_strerror ] ---

    /** {@code char * mdb_strerror(int err)} */
    public static native long nmdb_strerror(int err);

    /** {@code char * mdb_strerror(int err)} */
    @NativeType("char *")
    public static String mdb_strerror(int err) {
        long __result = nmdb_strerror(err);
        return memASCII(__result);
    }

    // --- [ mdb_env_create ] ---

    /** {@code int mdb_env_create(MDB_env ** env)} */
    public static native int nmdb_env_create(long env);

    /** {@code int mdb_env_create(MDB_env ** env)} */
    public static int mdb_env_create(@NativeType("MDB_env **") PointerBuffer env) {
        if (CHECKS) {
            check(env, 1);
        }
        return nmdb_env_create(memAddress(env));
    }

    // --- [ mdb_env_open ] ---

    /** {@code int mdb_env_open(MDB_env * env, char const * path, unsigned int flags, mdb_mode_t mode)} */
    public static native int nmdb_env_open(long env, long path, int flags, int mode);

    /** {@code int mdb_env_open(MDB_env * env, char const * path, unsigned int flags, mdb_mode_t mode)} */
    public static int mdb_env_open(@NativeType("MDB_env *") long env, @NativeType("char const *") ByteBuffer path, @NativeType("unsigned int") int flags, @NativeType("mdb_mode_t") int mode) {
        if (CHECKS) {
            check(env);
            checkNT1(path);
        }
        return nmdb_env_open(env, memAddress(path), flags, mode);
    }

    /** {@code int mdb_env_open(MDB_env * env, char const * path, unsigned int flags, mdb_mode_t mode)} */
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

    /** {@code int mdb_env_copy(MDB_env * env, char const * path)} */
    public static native int nmdb_env_copy(long env, long path);

    /** {@code int mdb_env_copy(MDB_env * env, char const * path)} */
    public static int mdb_env_copy(@NativeType("MDB_env *") long env, @NativeType("char const *") ByteBuffer path) {
        if (CHECKS) {
            check(env);
            checkNT1(path);
        }
        return nmdb_env_copy(env, memAddress(path));
    }

    /** {@code int mdb_env_copy(MDB_env * env, char const * path)} */
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

    /** {@code int mdb_env_copy2(MDB_env * env, char const * path, unsigned int flags)} */
    public static native int nmdb_env_copy2(long env, long path, int flags);

    /** {@code int mdb_env_copy2(MDB_env * env, char const * path, unsigned int flags)} */
    public static int mdb_env_copy2(@NativeType("MDB_env *") long env, @NativeType("char const *") ByteBuffer path, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(env);
            checkNT1(path);
        }
        return nmdb_env_copy2(env, memAddress(path), flags);
    }

    /** {@code int mdb_env_copy2(MDB_env * env, char const * path, unsigned int flags)} */
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

    /** {@code int mdb_env_stat(MDB_env * env, MDB_stat * stat)} */
    public static native int nmdb_env_stat(long env, long stat);

    /** {@code int mdb_env_stat(MDB_env * env, MDB_stat * stat)} */
    public static int mdb_env_stat(@NativeType("MDB_env *") long env, @NativeType("MDB_stat *") MDBStat stat) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_stat(env, stat.address());
    }

    // --- [ mdb_env_info ] ---

    /** {@code int mdb_env_info(MDB_env * env, MDB_envinfo * stat)} */
    public static native int nmdb_env_info(long env, long stat);

    /** {@code int mdb_env_info(MDB_env * env, MDB_envinfo * stat)} */
    public static int mdb_env_info(@NativeType("MDB_env *") long env, @NativeType("MDB_envinfo *") MDBEnvInfo stat) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_info(env, stat.address());
    }

    // --- [ mdb_env_sync ] ---

    /** {@code int mdb_env_sync(MDB_env * env, int force)} */
    public static native int nmdb_env_sync(long env, int force);

    /** {@code int mdb_env_sync(MDB_env * env, int force)} */
    public static int mdb_env_sync(@NativeType("MDB_env *") long env, @NativeType("int") boolean force) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_sync(env, force ? 1 : 0);
    }

    // --- [ mdb_env_close ] ---

    /** {@code void mdb_env_close(MDB_env * env)} */
    public static native void nmdb_env_close(long env);

    /** {@code void mdb_env_close(MDB_env * env)} */
    public static void mdb_env_close(@NativeType("MDB_env *") long env) {
        if (CHECKS) {
            check(env);
        }
        nmdb_env_close(env);
    }

    // --- [ mdb_env_set_flags ] ---

    /** {@code int mdb_env_set_flags(MDB_env * env, unsigned int flags, int onoff)} */
    public static native int nmdb_env_set_flags(long env, int flags, int onoff);

    /** {@code int mdb_env_set_flags(MDB_env * env, unsigned int flags, int onoff)} */
    public static int mdb_env_set_flags(@NativeType("MDB_env *") long env, @NativeType("unsigned int") int flags, @NativeType("int") boolean onoff) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_set_flags(env, flags, onoff ? 1 : 0);
    }

    // --- [ mdb_env_get_flags ] ---

    /** {@code int mdb_env_get_flags(MDB_env * env, unsigned int * flags)} */
    public static native int nmdb_env_get_flags(long env, long flags);

    /** {@code int mdb_env_get_flags(MDB_env * env, unsigned int * flags)} */
    public static int mdb_env_get_flags(@NativeType("MDB_env *") long env, @NativeType("unsigned int *") IntBuffer flags) {
        if (CHECKS) {
            check(env);
            check(flags, 1);
        }
        return nmdb_env_get_flags(env, memAddress(flags));
    }

    // --- [ mdb_env_get_path ] ---

    /** {@code int mdb_env_get_path(MDB_env * env, char const ** path)} */
    public static native int nmdb_env_get_path(long env, long path);

    /** {@code int mdb_env_get_path(MDB_env * env, char const ** path)} */
    public static int mdb_env_get_path(@NativeType("MDB_env *") long env, @NativeType("char const **") PointerBuffer path) {
        if (CHECKS) {
            check(env);
            check(path, 1);
        }
        return nmdb_env_get_path(env, memAddress(path));
    }

    // --- [ mdb_env_set_mapsize ] ---

    /** {@code int mdb_env_set_mapsize(MDB_env * env, size_t size)} */
    public static native int nmdb_env_set_mapsize(long env, long size);

    /** {@code int mdb_env_set_mapsize(MDB_env * env, size_t size)} */
    public static int mdb_env_set_mapsize(@NativeType("MDB_env *") long env, @NativeType("size_t") long size) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_set_mapsize(env, size);
    }

    // --- [ mdb_env_set_maxreaders ] ---

    /** {@code int mdb_env_set_maxreaders(MDB_env * env, unsigned int readers)} */
    public static native int nmdb_env_set_maxreaders(long env, int readers);

    /** {@code int mdb_env_set_maxreaders(MDB_env * env, unsigned int readers)} */
    public static int mdb_env_set_maxreaders(@NativeType("MDB_env *") long env, @NativeType("unsigned int") int readers) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_set_maxreaders(env, readers);
    }

    // --- [ mdb_env_get_maxreaders ] ---

    /** {@code int mdb_env_get_maxreaders(MDB_env * env, unsigned int * readers)} */
    public static native int nmdb_env_get_maxreaders(long env, long readers);

    /** {@code int mdb_env_get_maxreaders(MDB_env * env, unsigned int * readers)} */
    public static int mdb_env_get_maxreaders(@NativeType("MDB_env *") long env, @NativeType("unsigned int *") IntBuffer readers) {
        if (CHECKS) {
            check(env);
            check(readers, 1);
        }
        return nmdb_env_get_maxreaders(env, memAddress(readers));
    }

    // --- [ mdb_env_set_maxdbs ] ---

    /** {@code int mdb_env_set_maxdbs(MDB_env * env, MDB_dbi dbs)} */
    public static native int nmdb_env_set_maxdbs(long env, int dbs);

    /** {@code int mdb_env_set_maxdbs(MDB_env * env, MDB_dbi dbs)} */
    public static int mdb_env_set_maxdbs(@NativeType("MDB_env *") long env, @NativeType("MDB_dbi") int dbs) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_set_maxdbs(env, dbs);
    }

    // --- [ mdb_env_get_maxkeysize ] ---

    /** {@code int mdb_env_get_maxkeysize(MDB_env * env)} */
    public static native int nmdb_env_get_maxkeysize(long env);

    /** {@code int mdb_env_get_maxkeysize(MDB_env * env)} */
    public static int mdb_env_get_maxkeysize(@NativeType("MDB_env *") long env) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_get_maxkeysize(env);
    }

    // --- [ mdb_env_set_userctx ] ---

    /** {@code int mdb_env_set_userctx(MDB_env * env, void * ctx)} */
    public static native int nmdb_env_set_userctx(long env, long ctx);

    /** {@code int mdb_env_set_userctx(MDB_env * env, void * ctx)} */
    public static int mdb_env_set_userctx(@NativeType("MDB_env *") long env, @NativeType("void *") long ctx) {
        if (CHECKS) {
            check(env);
            check(ctx);
        }
        return nmdb_env_set_userctx(env, ctx);
    }

    // --- [ mdb_env_get_userctx ] ---

    /** {@code void * mdb_env_get_userctx(MDB_env * env)} */
    public static native long nmdb_env_get_userctx(long env);

    /** {@code void * mdb_env_get_userctx(MDB_env * env)} */
    @NativeType("void *")
    public static long mdb_env_get_userctx(@NativeType("MDB_env *") long env) {
        if (CHECKS) {
            check(env);
        }
        return nmdb_env_get_userctx(env);
    }

    // --- [ mdb_txn_begin ] ---

    /** {@code int mdb_txn_begin(MDB_env * env, MDB_txn * parent, unsigned int flags, MDB_txn ** txn)} */
    public static native int nmdb_txn_begin(long env, long parent, int flags, long txn);

    /** {@code int mdb_txn_begin(MDB_env * env, MDB_txn * parent, unsigned int flags, MDB_txn ** txn)} */
    public static int mdb_txn_begin(@NativeType("MDB_env *") long env, @NativeType("MDB_txn *") long parent, @NativeType("unsigned int") int flags, @NativeType("MDB_txn **") PointerBuffer txn) {
        if (CHECKS) {
            check(env);
            check(txn, 1);
        }
        return nmdb_txn_begin(env, parent, flags, memAddress(txn));
    }

    // --- [ mdb_txn_env ] ---

    /** {@code MDB_env * mdb_txn_env(MDB_txn * txn)} */
    public static native long nmdb_txn_env(long txn);

    /** {@code MDB_env * mdb_txn_env(MDB_txn * txn)} */
    @NativeType("MDB_env *")
    public static long mdb_txn_env(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_txn_env(txn);
    }

    // --- [ mdb_txn_id ] ---

    /** {@code size_t mdb_txn_id(MDB_txn * txn)} */
    public static native long nmdb_txn_id(long txn);

    /** {@code size_t mdb_txn_id(MDB_txn * txn)} */
    @NativeType("size_t")
    public static long mdb_txn_id(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_txn_id(txn);
    }

    // --- [ mdb_txn_commit ] ---

    /** {@code int mdb_txn_commit(MDB_txn * txn)} */
    public static native int nmdb_txn_commit(long txn);

    /** {@code int mdb_txn_commit(MDB_txn * txn)} */
    public static int mdb_txn_commit(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_txn_commit(txn);
    }

    // --- [ mdb_txn_abort ] ---

    /** {@code void mdb_txn_abort(MDB_txn * txn)} */
    public static native void nmdb_txn_abort(long txn);

    /** {@code void mdb_txn_abort(MDB_txn * txn)} */
    public static void mdb_txn_abort(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        nmdb_txn_abort(txn);
    }

    // --- [ mdb_txn_reset ] ---

    /** {@code void mdb_txn_reset(MDB_txn * txn)} */
    public static native void nmdb_txn_reset(long txn);

    /** {@code void mdb_txn_reset(MDB_txn * txn)} */
    public static void mdb_txn_reset(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        nmdb_txn_reset(txn);
    }

    // --- [ mdb_txn_renew ] ---

    /** {@code int mdb_txn_renew(MDB_txn * txn)} */
    public static native int nmdb_txn_renew(long txn);

    /** {@code int mdb_txn_renew(MDB_txn * txn)} */
    public static int mdb_txn_renew(@NativeType("MDB_txn *") long txn) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_txn_renew(txn);
    }

    // --- [ mdb_dbi_open ] ---

    /** {@code int mdb_dbi_open(MDB_txn * txn, char const * name, unsigned int flags, MDB_dbi * dbi)} */
    public static native int nmdb_dbi_open(long txn, long name, int flags, long dbi);

    /** {@code int mdb_dbi_open(MDB_txn * txn, char const * name, unsigned int flags, MDB_dbi * dbi)} */
    public static int mdb_dbi_open(@NativeType("MDB_txn *") long txn, @NativeType("char const *") @Nullable ByteBuffer name, @NativeType("unsigned int") int flags, @NativeType("MDB_dbi *") IntBuffer dbi) {
        if (CHECKS) {
            check(txn);
            checkNT1Safe(name);
            check(dbi, 1);
        }
        return nmdb_dbi_open(txn, memAddressSafe(name), flags, memAddress(dbi));
    }

    /** {@code int mdb_dbi_open(MDB_txn * txn, char const * name, unsigned int flags, MDB_dbi * dbi)} */
    public static int mdb_dbi_open(@NativeType("MDB_txn *") long txn, @NativeType("char const *") @Nullable CharSequence name, @NativeType("unsigned int") int flags, @NativeType("MDB_dbi *") IntBuffer dbi) {
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

    /** {@code int mdb_stat(MDB_txn * txn, MDB_dbi dbi, MDB_stat * stat)} */
    public static native int nmdb_stat(long txn, int dbi, long stat);

    /** {@code int mdb_stat(MDB_txn * txn, MDB_dbi dbi, MDB_stat * stat)} */
    public static int mdb_stat(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_stat *") MDBStat stat) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_stat(txn, dbi, stat.address());
    }

    // --- [ mdb_dbi_flags ] ---

    /** {@code int mdb_dbi_flags(MDB_txn * txn, MDB_dbi dbi, unsigned int * flags)} */
    public static native int nmdb_dbi_flags(long txn, int dbi, long flags);

    /** {@code int mdb_dbi_flags(MDB_txn * txn, MDB_dbi dbi, unsigned int * flags)} */
    public static int mdb_dbi_flags(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("unsigned int *") IntBuffer flags) {
        if (CHECKS) {
            check(txn);
            check(flags, 1);
        }
        return nmdb_dbi_flags(txn, dbi, memAddress(flags));
    }

    // --- [ mdb_dbi_close ] ---

    /** {@code void mdb_dbi_close(MDB_env * env, MDB_dbi dbi)} */
    public static native void nmdb_dbi_close(long env, int dbi);

    /** {@code void mdb_dbi_close(MDB_env * env, MDB_dbi dbi)} */
    public static void mdb_dbi_close(@NativeType("MDB_env *") long env, @NativeType("MDB_dbi") int dbi) {
        if (CHECKS) {
            check(env);
        }
        nmdb_dbi_close(env, dbi);
    }

    // --- [ mdb_drop ] ---

    /** {@code int mdb_drop(MDB_txn * txn, MDB_dbi dbi, int del)} */
    public static native int nmdb_drop(long txn, int dbi, int del);

    /** {@code int mdb_drop(MDB_txn * txn, MDB_dbi dbi, int del)} */
    public static int mdb_drop(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("int") boolean del) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_drop(txn, dbi, del ? 1 : 0);
    }

    // --- [ mdb_set_compare ] ---

    /** {@code int mdb_set_compare(MDB_txn * txn, MDB_dbi dbi, MDB_cmp_func * cmp)} */
    public static native int nmdb_set_compare(long txn, int dbi, long cmp);

    /** {@code int mdb_set_compare(MDB_txn * txn, MDB_dbi dbi, MDB_cmp_func * cmp)} */
    public static int mdb_set_compare(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_cmp_func *") MDBCmpFuncI cmp) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_set_compare(txn, dbi, cmp.address());
    }

    // --- [ mdb_set_dupsort ] ---

    /** {@code int mdb_set_dupsort(MDB_txn * txn, MDB_dbi dbi, MDB_cmp_func * cmp)} */
    public static native int nmdb_set_dupsort(long txn, int dbi, long cmp);

    /** {@code int mdb_set_dupsort(MDB_txn * txn, MDB_dbi dbi, MDB_cmp_func * cmp)} */
    public static int mdb_set_dupsort(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_cmp_func *") MDBCmpFuncI cmp) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_set_dupsort(txn, dbi, cmp.address());
    }

    // --- [ mdb_set_relfunc ] ---

    /** {@code int mdb_set_relfunc(MDB_txn * txn, MDB_dbi dbi, MDB_rel_func * rel)} */
    public static native int nmdb_set_relfunc(long txn, int dbi, long rel);

    /** {@code int mdb_set_relfunc(MDB_txn * txn, MDB_dbi dbi, MDB_rel_func * rel)} */
    public static int mdb_set_relfunc(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_rel_func *") MDBRelFuncI rel) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_set_relfunc(txn, dbi, rel.address());
    }

    // --- [ mdb_set_relctx ] ---

    /** {@code int mdb_set_relctx(MDB_txn * txn, MDB_dbi dbi, void * ctx)} */
    public static native int nmdb_set_relctx(long txn, int dbi, long ctx);

    /** {@code int mdb_set_relctx(MDB_txn * txn, MDB_dbi dbi, void * ctx)} */
    public static int mdb_set_relctx(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("void *") long ctx) {
        if (CHECKS) {
            check(txn);
            check(ctx);
        }
        return nmdb_set_relctx(txn, dbi, ctx);
    }

    // --- [ mdb_get ] ---

    /** {@code int mdb_get(MDB_txn * txn, MDB_dbi dbi, MDB_val * key, MDB_val * data)} */
    public static native int nmdb_get(long txn, int dbi, long key, long data);

    /** {@code int mdb_get(MDB_txn * txn, MDB_dbi dbi, MDB_val * key, MDB_val * data)} */
    public static int mdb_get(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_val *") MDBVal key, @NativeType("MDB_val *") MDBVal data) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_get(txn, dbi, key.address(), data.address());
    }

    // --- [ mdb_put ] ---

    /** {@code int mdb_put(MDB_txn * txn, MDB_dbi dbi, MDB_val * key, MDB_val * data, unsigned int flags)} */
    public static native int nmdb_put(long txn, int dbi, long key, long data, int flags);

    /** {@code int mdb_put(MDB_txn * txn, MDB_dbi dbi, MDB_val * key, MDB_val * data, unsigned int flags)} */
    public static int mdb_put(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_val *") MDBVal key, @NativeType("MDB_val *") MDBVal data, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_put(txn, dbi, key.address(), data.address(), flags);
    }

    // --- [ mdb_del ] ---

    /** {@code int mdb_del(MDB_txn * txn, MDB_dbi dbi, MDB_val * key, MDB_val * data)} */
    public static native int nmdb_del(long txn, int dbi, long key, long data);

    /** {@code int mdb_del(MDB_txn * txn, MDB_dbi dbi, MDB_val * key, MDB_val * data)} */
    public static int mdb_del(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_val *") MDBVal key, @NativeType("MDB_val *") @Nullable MDBVal data) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_del(txn, dbi, key.address(), memAddressSafe(data));
    }

    // --- [ mdb_cursor_open ] ---

    /** {@code int mdb_cursor_open(MDB_txn * txn, MDB_dbi dbi, MDB_cursor ** cursor)} */
    public static native int nmdb_cursor_open(long txn, int dbi, long cursor);

    /** {@code int mdb_cursor_open(MDB_txn * txn, MDB_dbi dbi, MDB_cursor ** cursor)} */
    public static int mdb_cursor_open(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_cursor **") PointerBuffer cursor) {
        if (CHECKS) {
            check(txn);
            check(cursor, 1);
        }
        return nmdb_cursor_open(txn, dbi, memAddress(cursor));
    }

    // --- [ mdb_cursor_close ] ---

    /** {@code void mdb_cursor_close(MDB_cursor * cursor)} */
    public static native void nmdb_cursor_close(long cursor);

    /** {@code void mdb_cursor_close(MDB_cursor * cursor)} */
    public static void mdb_cursor_close(@NativeType("MDB_cursor *") long cursor) {
        if (CHECKS) {
            check(cursor);
        }
        nmdb_cursor_close(cursor);
    }

    // --- [ mdb_cursor_renew ] ---

    /** {@code int mdb_cursor_renew(MDB_txn * txn, MDB_cursor * cursor)} */
    public static native int nmdb_cursor_renew(long txn, long cursor);

    /** {@code int mdb_cursor_renew(MDB_txn * txn, MDB_cursor * cursor)} */
    public static int mdb_cursor_renew(@NativeType("MDB_txn *") long txn, @NativeType("MDB_cursor *") long cursor) {
        if (CHECKS) {
            check(txn);
            check(cursor);
        }
        return nmdb_cursor_renew(txn, cursor);
    }

    // --- [ mdb_cursor_txn ] ---

    /** {@code MDB_txn * mdb_cursor_txn(MDB_cursor * cursor)} */
    public static native long nmdb_cursor_txn(long cursor);

    /** {@code MDB_txn * mdb_cursor_txn(MDB_cursor * cursor)} */
    @NativeType("MDB_txn *")
    public static long mdb_cursor_txn(@NativeType("MDB_cursor *") long cursor) {
        if (CHECKS) {
            check(cursor);
        }
        return nmdb_cursor_txn(cursor);
    }

    // --- [ mdb_cursor_dbi ] ---

    /** {@code MDB_dbi mdb_cursor_dbi(MDB_cursor * cursor)} */
    public static native int nmdb_cursor_dbi(long cursor);

    /** {@code MDB_dbi mdb_cursor_dbi(MDB_cursor * cursor)} */
    @NativeType("MDB_dbi")
    public static int mdb_cursor_dbi(@NativeType("MDB_cursor *") long cursor) {
        if (CHECKS) {
            check(cursor);
        }
        return nmdb_cursor_dbi(cursor);
    }

    // --- [ mdb_cursor_get ] ---

    /** {@code int mdb_cursor_get(MDB_cursor * cursor, MDB_val * key, MDB_val * data, MDB_cursor_op op)} */
    public static native int nmdb_cursor_get(long cursor, long key, long data, int op);

    /** {@code int mdb_cursor_get(MDB_cursor * cursor, MDB_val * key, MDB_val * data, MDB_cursor_op op)} */
    public static int mdb_cursor_get(@NativeType("MDB_cursor *") long cursor, @NativeType("MDB_val *") MDBVal key, @NativeType("MDB_val *") MDBVal data, @NativeType("MDB_cursor_op") int op) {
        if (CHECKS) {
            check(cursor);
        }
        return nmdb_cursor_get(cursor, key.address(), data.address(), op);
    }

    // --- [ mdb_cursor_put ] ---

    /** {@code int mdb_cursor_put(MDB_cursor * cursor, MDB_val * key, MDB_val * data, unsigned int flags)} */
    public static native int nmdb_cursor_put(long cursor, long key, long data, int flags);

    /** {@code int mdb_cursor_put(MDB_cursor * cursor, MDB_val * key, MDB_val * data, unsigned int flags)} */
    public static int mdb_cursor_put(@NativeType("MDB_cursor *") long cursor, @NativeType("MDB_val *") MDBVal key, @NativeType("MDB_val *") MDBVal data, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(cursor);
        }
        return nmdb_cursor_put(cursor, key.address(), data.address(), flags);
    }

    // --- [ mdb_cursor_del ] ---

    /** {@code int mdb_cursor_del(MDB_cursor * cursor, unsigned int flags)} */
    public static native int nmdb_cursor_del(long cursor, int flags);

    /** {@code int mdb_cursor_del(MDB_cursor * cursor, unsigned int flags)} */
    public static int mdb_cursor_del(@NativeType("MDB_cursor *") long cursor, @NativeType("unsigned int") int flags) {
        if (CHECKS) {
            check(cursor);
        }
        return nmdb_cursor_del(cursor, flags);
    }

    // --- [ mdb_cursor_count ] ---

    /** {@code int mdb_cursor_count(MDB_cursor * cursor, size_t * countp)} */
    public static native int nmdb_cursor_count(long cursor, long countp);

    /** {@code int mdb_cursor_count(MDB_cursor * cursor, size_t * countp)} */
    public static int mdb_cursor_count(@NativeType("MDB_cursor *") long cursor, @NativeType("size_t *") PointerBuffer countp) {
        if (CHECKS) {
            check(cursor);
            check(countp, 1);
        }
        return nmdb_cursor_count(cursor, memAddress(countp));
    }

    // --- [ mdb_cmp ] ---

    /** {@code int mdb_cmp(MDB_txn * txn, MDB_dbi dbi, MDB_val const * a, MDB_val const * b)} */
    public static native int nmdb_cmp(long txn, int dbi, long a, long b);

    /** {@code int mdb_cmp(MDB_txn * txn, MDB_dbi dbi, MDB_val const * a, MDB_val const * b)} */
    public static int mdb_cmp(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_val const *") MDBVal a, @NativeType("MDB_val const *") MDBVal b) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_cmp(txn, dbi, a.address(), b.address());
    }

    // --- [ mdb_dcmp ] ---

    /** {@code int mdb_dcmp(MDB_txn * txn, MDB_dbi dbi, MDB_val const * a, MDB_val const * b)} */
    public static native int nmdb_dcmp(long txn, int dbi, long a, long b);

    /** {@code int mdb_dcmp(MDB_txn * txn, MDB_dbi dbi, MDB_val const * a, MDB_val const * b)} */
    public static int mdb_dcmp(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("MDB_val const *") MDBVal a, @NativeType("MDB_val const *") MDBVal b) {
        if (CHECKS) {
            check(txn);
        }
        return nmdb_dcmp(txn, dbi, a.address(), b.address());
    }

    // --- [ mdb_reader_list ] ---

    /** {@code int mdb_reader_list(MDB_env * env, MDB_msg_func * func, void * ctx)} */
    public static native int nmdb_reader_list(long env, long func, long ctx);

    /** {@code int mdb_reader_list(MDB_env * env, MDB_msg_func * func, void * ctx)} */
    public static int mdb_reader_list(@NativeType("MDB_env *") long env, @NativeType("MDB_msg_func *") MDBMsgFuncI func, @NativeType("void *") long ctx) {
        if (CHECKS) {
            check(env);
            check(ctx);
        }
        return nmdb_reader_list(env, func.address(), ctx);
    }

    // --- [ mdb_reader_check ] ---

    /** {@code int mdb_reader_check(MDB_env * env, int * dead)} */
    public static native int nmdb_reader_check(long env, long dead);

    /** {@code int mdb_reader_check(MDB_env * env, int * dead)} */
    public static int mdb_reader_check(@NativeType("MDB_env *") long env, @NativeType("int *") IntBuffer dead) {
        if (CHECKS) {
            check(env);
            check(dead, 1);
        }
        return nmdb_reader_check(env, memAddress(dead));
    }

    /** {@code char * mdb_version(int * major, int * minor, int * patch)} */
    public static native long nmdb_version(int[] major, int[] minor, int[] patch);

    /** {@code char * mdb_version(int * major, int * minor, int * patch)} */
    @NativeType("char *")
    public static @Nullable String mdb_version(@NativeType("int *") int @Nullable [] major, @NativeType("int *") int @Nullable [] minor, @NativeType("int *") int @Nullable [] patch) {
        if (CHECKS) {
            checkSafe(major, 1);
            checkSafe(minor, 1);
            checkSafe(patch, 1);
        }
        long __result = nmdb_version(major, minor, patch);
        return memASCIISafe(__result);
    }

    /** {@code int mdb_env_get_flags(MDB_env * env, unsigned int * flags)} */
    public static native int nmdb_env_get_flags(long env, int[] flags);

    /** {@code int mdb_env_get_flags(MDB_env * env, unsigned int * flags)} */
    public static int mdb_env_get_flags(@NativeType("MDB_env *") long env, @NativeType("unsigned int *") int[] flags) {
        if (CHECKS) {
            check(env);
            check(flags, 1);
        }
        return nmdb_env_get_flags(env, flags);
    }

    /** {@code int mdb_env_get_maxreaders(MDB_env * env, unsigned int * readers)} */
    public static native int nmdb_env_get_maxreaders(long env, int[] readers);

    /** {@code int mdb_env_get_maxreaders(MDB_env * env, unsigned int * readers)} */
    public static int mdb_env_get_maxreaders(@NativeType("MDB_env *") long env, @NativeType("unsigned int *") int[] readers) {
        if (CHECKS) {
            check(env);
            check(readers, 1);
        }
        return nmdb_env_get_maxreaders(env, readers);
    }

    /** {@code int mdb_dbi_open(MDB_txn * txn, char const * name, unsigned int flags, MDB_dbi * dbi)} */
    public static native int nmdb_dbi_open(long txn, long name, int flags, int[] dbi);

    /** {@code int mdb_dbi_open(MDB_txn * txn, char const * name, unsigned int flags, MDB_dbi * dbi)} */
    public static int mdb_dbi_open(@NativeType("MDB_txn *") long txn, @NativeType("char const *") @Nullable ByteBuffer name, @NativeType("unsigned int") int flags, @NativeType("MDB_dbi *") int[] dbi) {
        if (CHECKS) {
            check(txn);
            checkNT1Safe(name);
            check(dbi, 1);
        }
        return nmdb_dbi_open(txn, memAddressSafe(name), flags, dbi);
    }

    /** {@code int mdb_dbi_open(MDB_txn * txn, char const * name, unsigned int flags, MDB_dbi * dbi)} */
    public static int mdb_dbi_open(@NativeType("MDB_txn *") long txn, @NativeType("char const *") @Nullable CharSequence name, @NativeType("unsigned int") int flags, @NativeType("MDB_dbi *") int[] dbi) {
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

    /** {@code int mdb_dbi_flags(MDB_txn * txn, MDB_dbi dbi, unsigned int * flags)} */
    public static native int nmdb_dbi_flags(long txn, int dbi, int[] flags);

    /** {@code int mdb_dbi_flags(MDB_txn * txn, MDB_dbi dbi, unsigned int * flags)} */
    public static int mdb_dbi_flags(@NativeType("MDB_txn *") long txn, @NativeType("MDB_dbi") int dbi, @NativeType("unsigned int *") int[] flags) {
        if (CHECKS) {
            check(txn);
            check(flags, 1);
        }
        return nmdb_dbi_flags(txn, dbi, flags);
    }

    /** {@code int mdb_reader_check(MDB_env * env, int * dead)} */
    public static native int nmdb_reader_check(long env, int[] dead);

    /** {@code int mdb_reader_check(MDB_env * env, int * dead)} */
    public static int mdb_reader_check(@NativeType("MDB_env *") long env, @NativeType("int *") int[] dead) {
        if (CHECKS) {
            check(env);
            check(dead, 1);
        }
        return nmdb_reader_check(env, dead);
    }

}