/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"
DISABLE_WARNINGS()
#ifdef LWJGL_x86
    #define MDB_VL32 1
#endif
#define MDB_DEVEL 2
#include "lmdb.h"
ENABLE_WARNINGS()

EXTERN_C_ENTER

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1version__JJJ(JNIEnv *__env, jclass clazz, jlong majorAddress, jlong minorAddress, jlong patchAddress) {
    int *major = (int *)(uintptr_t)majorAddress;
    int *minor = (int *)(uintptr_t)minorAddress;
    int *patch = (int *)(uintptr_t)patchAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)mdb_version(major, minor, patch);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1strerror(JNIEnv *__env, jclass clazz, jint err) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)mdb_strerror(err);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1create(JNIEnv *__env, jclass clazz, jlong envAddress) {
    MDB_env **env = (MDB_env **)(uintptr_t)envAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_create(env);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1open(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress, jint flags, jint mode) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_open(env, path, (unsigned int)flags, (mdb_mode_t)mode);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1copy(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_copy(env, path);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1copy2(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress, jint flags) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    char const *path = (char const *)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_copy2(env, path, (unsigned int)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1stat(JNIEnv *__env, jclass clazz, jlong envAddress, jlong statAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    MDB_stat *stat = (MDB_stat *)(uintptr_t)statAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_stat(env, stat);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1info(JNIEnv *__env, jclass clazz, jlong envAddress, jlong statAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    MDB_envinfo *stat = (MDB_envinfo *)(uintptr_t)statAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_info(env, stat);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1sync(JNIEnv *__env, jclass clazz, jlong envAddress, jint force) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_sync(env, force);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1close(JNIEnv *__env, jclass clazz, jlong envAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    UNUSED_PARAMS(__env, clazz)
    mdb_env_close(env);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1flags(JNIEnv *__env, jclass clazz, jlong envAddress, jint flags, jint onoff) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_set_flags(env, (unsigned int)flags, onoff);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__JJ(JNIEnv *__env, jclass clazz, jlong envAddress, jlong flagsAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    unsigned int *flags = (unsigned int *)(uintptr_t)flagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_get_flags(env, flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1path(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    char const **path = (char const **)(uintptr_t)pathAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_get_path(env, path);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1mapsize(JNIEnv *__env, jclass clazz, jlong envAddress, jlong size) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_set_mapsize(env, (size_t)size);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1maxreaders(JNIEnv *__env, jclass clazz, jlong envAddress, jint readers) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_set_maxreaders(env, (unsigned int)readers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__JJ(JNIEnv *__env, jclass clazz, jlong envAddress, jlong readersAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    unsigned int *readers = (unsigned int *)(uintptr_t)readersAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_get_maxreaders(env, readers);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1maxdbs(JNIEnv *__env, jclass clazz, jlong envAddress, jint dbs) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_set_maxdbs(env, (MDB_dbi)dbs);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxkeysize(JNIEnv *__env, jclass clazz, jlong envAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_get_maxkeysize(env);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1userctx(JNIEnv *__env, jclass clazz, jlong envAddress, jlong ctxAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    void *ctx = (void *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_env_set_userctx(env, ctx);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1userctx(JNIEnv *__env, jclass clazz, jlong envAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)mdb_env_get_userctx(env);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1begin(JNIEnv *__env, jclass clazz, jlong envAddress, jlong parentAddress, jint flags, jlong txnAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    MDB_txn *parent = (MDB_txn *)(uintptr_t)parentAddress;
    MDB_txn **txn = (MDB_txn **)(uintptr_t)txnAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_txn_begin(env, parent, (unsigned int)flags, txn);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1env(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)mdb_txn_env(txn);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1id(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)mdb_txn_id(txn);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1commit(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_txn_commit(txn);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1abort(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    UNUSED_PARAMS(__env, clazz)
    mdb_txn_abort(txn);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1reset(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    UNUSED_PARAMS(__env, clazz)
    mdb_txn_reset(txn);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1renew(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_txn_renew(txn);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJIJ(JNIEnv *__env, jclass clazz, jlong txnAddress, jlong nameAddress, jint flags, jlong dbiAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    MDB_dbi *dbi = (MDB_dbi *)(uintptr_t)dbiAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_dbi_open(txn, name, (unsigned int)flags, dbi);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1stat(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong statAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    MDB_stat *stat = (MDB_stat *)(uintptr_t)statAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_stat(txn, (MDB_dbi)dbi, stat);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JIJ(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong flagsAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    unsigned int *flags = (unsigned int *)(uintptr_t)flagsAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_dbi_flags(txn, (MDB_dbi)dbi, flags);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1close(JNIEnv *__env, jclass clazz, jlong envAddress, jint dbi) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    UNUSED_PARAMS(__env, clazz)
    mdb_dbi_close(env, (MDB_dbi)dbi);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1drop(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jint del) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_drop(txn, (MDB_dbi)dbi, del);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1compare(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong cmpAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    MDB_cmp_func *cmp = (MDB_cmp_func *)(uintptr_t)cmpAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_set_compare(txn, (MDB_dbi)dbi, cmp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1dupsort(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong cmpAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    MDB_cmp_func *cmp = (MDB_cmp_func *)(uintptr_t)cmpAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_set_dupsort(txn, (MDB_dbi)dbi, cmp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1relfunc(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong relAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    MDB_rel_func *rel = (MDB_rel_func *)(uintptr_t)relAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_set_relfunc(txn, (MDB_dbi)dbi, rel);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1relctx(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong ctxAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    void *ctx = (void *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_set_relctx(txn, (MDB_dbi)dbi, ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1get(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    MDB_val *key = (MDB_val *)(uintptr_t)keyAddress;
    MDB_val *data = (MDB_val *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_get(txn, (MDB_dbi)dbi, key, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1put(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress, jint flags) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    MDB_val *key = (MDB_val *)(uintptr_t)keyAddress;
    MDB_val *data = (MDB_val *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_put(txn, (MDB_dbi)dbi, key, data, (unsigned int)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1del(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    MDB_val *key = (MDB_val *)(uintptr_t)keyAddress;
    MDB_val *data = (MDB_val *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_del(txn, (MDB_dbi)dbi, key, data);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1open(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong cursorAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    MDB_cursor **cursor = (MDB_cursor **)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_cursor_open(txn, (MDB_dbi)dbi, cursor);
}

JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1close(JNIEnv *__env, jclass clazz, jlong cursorAddress) {
    MDB_cursor *cursor = (MDB_cursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    mdb_cursor_close(cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1renew(JNIEnv *__env, jclass clazz, jlong txnAddress, jlong cursorAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    MDB_cursor *cursor = (MDB_cursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_cursor_renew(txn, cursor);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1txn(JNIEnv *__env, jclass clazz, jlong cursorAddress) {
    MDB_cursor *cursor = (MDB_cursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jlong)(uintptr_t)mdb_cursor_txn(cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1dbi(JNIEnv *__env, jclass clazz, jlong cursorAddress) {
    MDB_cursor *cursor = (MDB_cursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_cursor_dbi(cursor);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1get(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong keyAddress, jlong dataAddress, jint op) {
    MDB_cursor *cursor = (MDB_cursor *)(uintptr_t)cursorAddress;
    MDB_val *key = (MDB_val *)(uintptr_t)keyAddress;
    MDB_val *data = (MDB_val *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_cursor_get(cursor, key, data, (MDB_cursor_op)op);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1put(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong keyAddress, jlong dataAddress, jint flags) {
    MDB_cursor *cursor = (MDB_cursor *)(uintptr_t)cursorAddress;
    MDB_val *key = (MDB_val *)(uintptr_t)keyAddress;
    MDB_val *data = (MDB_val *)(uintptr_t)dataAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_cursor_put(cursor, key, data, (unsigned int)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1del(JNIEnv *__env, jclass clazz, jlong cursorAddress, jint flags) {
    MDB_cursor *cursor = (MDB_cursor *)(uintptr_t)cursorAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_cursor_del(cursor, (unsigned int)flags);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1count(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong countpAddress) {
    MDB_cursor *cursor = (MDB_cursor *)(uintptr_t)cursorAddress;
    size_t *countp = (size_t *)(uintptr_t)countpAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_cursor_count(cursor, countp);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cmp(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong aAddress, jlong bAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    MDB_val const *a = (MDB_val const *)(uintptr_t)aAddress;
    MDB_val const *b = (MDB_val const *)(uintptr_t)bAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_cmp(txn, (MDB_dbi)dbi, a, b);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dcmp(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong aAddress, jlong bAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    MDB_val const *a = (MDB_val const *)(uintptr_t)aAddress;
    MDB_val const *b = (MDB_val const *)(uintptr_t)bAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_dcmp(txn, (MDB_dbi)dbi, a, b);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1list(JNIEnv *__env, jclass clazz, jlong envAddress, jlong funcAddress, jlong ctxAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    MDB_msg_func *func = (MDB_msg_func *)(uintptr_t)funcAddress;
    void *ctx = (void *)(uintptr_t)ctxAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_reader_list(env, func, ctx);
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__JJ(JNIEnv *__env, jclass clazz, jlong envAddress, jlong deadAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    int *dead = (int *)(uintptr_t)deadAddress;
    UNUSED_PARAMS(__env, clazz)
    return (jint)mdb_reader_check(env, dead);
}

JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1version___3I_3I_3I(JNIEnv *__env, jclass clazz, jintArray majorAddress, jintArray minorAddress, jintArray patchAddress) {
    jlong __result;
    jint *major = majorAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, majorAddress, NULL);
    jint *minor = minorAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, minorAddress, NULL);
    jint *patch = patchAddress == NULL ? NULL : (*__env)->GetIntArrayElements(__env, patchAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jlong)(uintptr_t)mdb_version((int *)major, (int *)minor, (int *)patch);
    if (patch != NULL) { (*__env)->ReleaseIntArrayElements(__env, patchAddress, patch, 0); }
    if (minor != NULL) { (*__env)->ReleaseIntArrayElements(__env, minorAddress, minor, 0); }
    if (major != NULL) { (*__env)->ReleaseIntArrayElements(__env, majorAddress, major, 0); }
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__J_3I(JNIEnv *__env, jclass clazz, jlong envAddress, jintArray flagsAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    jint __result;
    jint *flags = (*__env)->GetIntArrayElements(__env, flagsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)mdb_env_get_flags(env, (unsigned int *)flags);
    (*__env)->ReleaseIntArrayElements(__env, flagsAddress, flags, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__J_3I(JNIEnv *__env, jclass clazz, jlong envAddress, jintArray readersAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    jint __result;
    jint *readers = (*__env)->GetIntArrayElements(__env, readersAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)mdb_env_get_maxreaders(env, (unsigned int *)readers);
    (*__env)->ReleaseIntArrayElements(__env, readersAddress, readers, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJI_3I(JNIEnv *__env, jclass clazz, jlong txnAddress, jlong nameAddress, jint flags, jintArray dbiAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    char const *name = (char const *)(uintptr_t)nameAddress;
    jint __result;
    jint *dbi = (*__env)->GetIntArrayElements(__env, dbiAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)mdb_dbi_open(txn, name, (unsigned int)flags, (MDB_dbi *)dbi);
    (*__env)->ReleaseIntArrayElements(__env, dbiAddress, dbi, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JI_3I(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jintArray flagsAddress) {
    MDB_txn *txn = (MDB_txn *)(uintptr_t)txnAddress;
    jint __result;
    jint *flags = (*__env)->GetIntArrayElements(__env, flagsAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)mdb_dbi_flags(txn, (MDB_dbi)dbi, (unsigned int *)flags);
    (*__env)->ReleaseIntArrayElements(__env, flagsAddress, flags, 0);
    return __result;
}

JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__J_3I(JNIEnv *__env, jclass clazz, jlong envAddress, jintArray deadAddress) {
    MDB_env *env = (MDB_env *)(uintptr_t)envAddress;
    jint __result;
    jint *dead = (*__env)->GetIntArrayElements(__env, deadAddress, NULL);
    UNUSED_PARAMS(__env, clazz)
    __result = (jint)mdb_reader_check(env, (int *)dead);
    (*__env)->ReleaseIntArrayElements(__env, deadAddress, dead, 0);
    return __result;
}

EXTERN_C_EXIT
