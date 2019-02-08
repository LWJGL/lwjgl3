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

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1version__JJJ(jlong majorAddress, jlong minorAddress, jlong patchAddress) {
    int *major = (int *)(intptr_t)majorAddress;
    int *minor = (int *)(intptr_t)minorAddress;
    int *patch = (int *)(intptr_t)patchAddress;
    return (jlong)(intptr_t)mdb_version(major, minor, patch);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1version__JJJ(JNIEnv *__env, jclass clazz, jlong majorAddress, jlong minorAddress, jlong patchAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1version__JJJ(majorAddress, minorAddress, patchAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1strerror(jint err) {
    return (jlong)(intptr_t)mdb_strerror(err);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1strerror(JNIEnv *__env, jclass clazz, jint err) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1strerror(err);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1create(jlong envAddress) {
    MDB_env **env = (MDB_env **)(intptr_t)envAddress;
    return (jint)mdb_env_create(env);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1create(JNIEnv *__env, jclass clazz, jlong envAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1create(envAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1open(jlong envAddress, jlong pathAddress, jint flags, jint mode) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    char const *path = (char const *)(intptr_t)pathAddress;
    return (jint)mdb_env_open(env, path, (unsigned int)flags, (mdb_mode_t)mode);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1open(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress, jint flags, jint mode) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1open(envAddress, pathAddress, flags, mode);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1copy(jlong envAddress, jlong pathAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    char const *path = (char const *)(intptr_t)pathAddress;
    return (jint)mdb_env_copy(env, path);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1copy(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1copy(envAddress, pathAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1copy2(jlong envAddress, jlong pathAddress, jint flags) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    char const *path = (char const *)(intptr_t)pathAddress;
    return (jint)mdb_env_copy2(env, path, (unsigned int)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1copy2(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1copy2(envAddress, pathAddress, flags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1stat(jlong envAddress, jlong statAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    MDB_stat *stat = (MDB_stat *)(intptr_t)statAddress;
    return (jint)mdb_env_stat(env, stat);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1stat(JNIEnv *__env, jclass clazz, jlong envAddress, jlong statAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1stat(envAddress, statAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1info(jlong envAddress, jlong statAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    MDB_envinfo *stat = (MDB_envinfo *)(intptr_t)statAddress;
    return (jint)mdb_env_info(env, stat);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1info(JNIEnv *__env, jclass clazz, jlong envAddress, jlong statAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1info(envAddress, statAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1sync(jlong envAddress, jint force) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    return (jint)mdb_env_sync(env, force);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1sync(JNIEnv *__env, jclass clazz, jlong envAddress, jint force) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1sync(envAddress, force);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1close(jlong envAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    mdb_env_close(env);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1close(JNIEnv *__env, jclass clazz, jlong envAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1close(envAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1flags(jlong envAddress, jint flags, jint onoff) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    return (jint)mdb_env_set_flags(env, (unsigned int)flags, onoff);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1flags(JNIEnv *__env, jclass clazz, jlong envAddress, jint flags, jint onoff) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1flags(envAddress, flags, onoff);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__JJ(jlong envAddress, jlong flagsAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    unsigned int *flags = (unsigned int *)(intptr_t)flagsAddress;
    return (jint)mdb_env_get_flags(env, flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__JJ(JNIEnv *__env, jclass clazz, jlong envAddress, jlong flagsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__JJ(envAddress, flagsAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1path(jlong envAddress, jlong pathAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    char const **path = (char const **)(intptr_t)pathAddress;
    return (jint)mdb_env_get_path(env, path);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1path(JNIEnv *__env, jclass clazz, jlong envAddress, jlong pathAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1path(envAddress, pathAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1mapsize(jlong envAddress, jlong size) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    return (jint)mdb_env_set_mapsize(env, (mdb_size_t)size);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1mapsize(JNIEnv *__env, jclass clazz, jlong envAddress, jlong size) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1mapsize(envAddress, size);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1maxreaders(jlong envAddress, jint readers) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    return (jint)mdb_env_set_maxreaders(env, (unsigned int)readers);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1maxreaders(JNIEnv *__env, jclass clazz, jlong envAddress, jint readers) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1maxreaders(envAddress, readers);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__JJ(jlong envAddress, jlong readersAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    unsigned int *readers = (unsigned int *)(intptr_t)readersAddress;
    return (jint)mdb_env_get_maxreaders(env, readers);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__JJ(JNIEnv *__env, jclass clazz, jlong envAddress, jlong readersAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__JJ(envAddress, readersAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1maxdbs(jlong envAddress, jint dbs) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    return (jint)mdb_env_set_maxdbs(env, (MDB_dbi)dbs);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1maxdbs(JNIEnv *__env, jclass clazz, jlong envAddress, jint dbs) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1maxdbs(envAddress, dbs);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxkeysize(jlong envAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    return (jint)mdb_env_get_maxkeysize(env);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxkeysize(JNIEnv *__env, jclass clazz, jlong envAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxkeysize(envAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1userctx(jlong envAddress, jlong ctxAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    void *ctx = (void *)(intptr_t)ctxAddress;
    return (jint)mdb_env_set_userctx(env, ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1userctx(JNIEnv *__env, jclass clazz, jlong envAddress, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1set_1userctx(envAddress, ctxAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1userctx(jlong envAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    return (jlong)(intptr_t)mdb_env_get_userctx(env);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1userctx(JNIEnv *__env, jclass clazz, jlong envAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1userctx(envAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1begin(jlong envAddress, jlong parentAddress, jint flags, jlong txnAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    MDB_txn *parent = (MDB_txn *)(intptr_t)parentAddress;
    MDB_txn **txn = (MDB_txn **)(intptr_t)txnAddress;
    return (jint)mdb_txn_begin(env, parent, (unsigned int)flags, txn);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1begin(JNIEnv *__env, jclass clazz, jlong envAddress, jlong parentAddress, jint flags, jlong txnAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1begin(envAddress, parentAddress, flags, txnAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1env(jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    return (jlong)(intptr_t)mdb_txn_env(txn);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1env(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1env(txnAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1id(jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    return (jlong)mdb_txn_id(txn);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1id(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1id(txnAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1commit(jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    return (jint)mdb_txn_commit(txn);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1commit(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1commit(txnAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1abort(jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    mdb_txn_abort(txn);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1abort(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1abort(txnAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1reset(jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    mdb_txn_reset(txn);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1reset(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1reset(txnAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1renew(jlong txnAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    return (jint)mdb_txn_renew(txn);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1renew(JNIEnv *__env, jclass clazz, jlong txnAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1txn_1renew(txnAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJIJ(jlong txnAddress, jlong nameAddress, jint flags, jlong dbiAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    char const *name = (char const *)(intptr_t)nameAddress;
    MDB_dbi *dbi = (MDB_dbi *)(intptr_t)dbiAddress;
    return (jint)mdb_dbi_open(txn, name, (unsigned int)flags, dbi);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJIJ(JNIEnv *__env, jclass clazz, jlong txnAddress, jlong nameAddress, jint flags, jlong dbiAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJIJ(txnAddress, nameAddress, flags, dbiAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1stat(jlong txnAddress, jint dbi, jlong statAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    MDB_stat *stat = (MDB_stat *)(intptr_t)statAddress;
    return (jint)mdb_stat(txn, (MDB_dbi)dbi, stat);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1stat(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong statAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1stat(txnAddress, dbi, statAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JIJ(jlong txnAddress, jint dbi, jlong flagsAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    unsigned int *flags = (unsigned int *)(intptr_t)flagsAddress;
    return (jint)mdb_dbi_flags(txn, (MDB_dbi)dbi, flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JIJ(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong flagsAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JIJ(txnAddress, dbi, flagsAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1close(jlong envAddress, jint dbi) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    mdb_dbi_close(env, (MDB_dbi)dbi);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1close(JNIEnv *__env, jclass clazz, jlong envAddress, jint dbi) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1close(envAddress, dbi);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1drop(jlong txnAddress, jint dbi, jint del) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    return (jint)mdb_drop(txn, (MDB_dbi)dbi, del);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1drop(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jint del) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1drop(txnAddress, dbi, del);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1compare(jlong txnAddress, jint dbi, jlong cmpAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    MDB_cmp_func *cmp = (MDB_cmp_func *)(intptr_t)cmpAddress;
    return (jint)mdb_set_compare(txn, (MDB_dbi)dbi, cmp);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1compare(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong cmpAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1compare(txnAddress, dbi, cmpAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1dupsort(jlong txnAddress, jint dbi, jlong cmpAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    MDB_cmp_func *cmp = (MDB_cmp_func *)(intptr_t)cmpAddress;
    return (jint)mdb_set_dupsort(txn, (MDB_dbi)dbi, cmp);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1dupsort(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong cmpAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1dupsort(txnAddress, dbi, cmpAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1relfunc(jlong txnAddress, jint dbi, jlong relAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    MDB_rel_func *rel = (MDB_rel_func *)(intptr_t)relAddress;
    return (jint)mdb_set_relfunc(txn, (MDB_dbi)dbi, rel);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1relfunc(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong relAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1relfunc(txnAddress, dbi, relAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1relctx(jlong txnAddress, jint dbi, jlong ctxAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    void *ctx = (void *)(intptr_t)ctxAddress;
    return (jint)mdb_set_relctx(txn, (MDB_dbi)dbi, ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1relctx(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1set_1relctx(txnAddress, dbi, ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1get(jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    MDB_val *key = (MDB_val *)(intptr_t)keyAddress;
    MDB_val *data = (MDB_val *)(intptr_t)dataAddress;
    return (jint)mdb_get(txn, (MDB_dbi)dbi, key, data);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1get(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1get(txnAddress, dbi, keyAddress, dataAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1put(jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress, jint flags) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    MDB_val *key = (MDB_val *)(intptr_t)keyAddress;
    MDB_val *data = (MDB_val *)(intptr_t)dataAddress;
    return (jint)mdb_put(txn, (MDB_dbi)dbi, key, data, (unsigned int)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1put(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1put(txnAddress, dbi, keyAddress, dataAddress, flags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1del(jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    MDB_val *key = (MDB_val *)(intptr_t)keyAddress;
    MDB_val *data = (MDB_val *)(intptr_t)dataAddress;
    return (jint)mdb_del(txn, (MDB_dbi)dbi, key, data);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1del(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong keyAddress, jlong dataAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1del(txnAddress, dbi, keyAddress, dataAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1open(jlong txnAddress, jint dbi, jlong cursorAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    MDB_cursor **cursor = (MDB_cursor **)(intptr_t)cursorAddress;
    return (jint)mdb_cursor_open(txn, (MDB_dbi)dbi, cursor);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1open(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong cursorAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1open(txnAddress, dbi, cursorAddress);
}

JNIEXPORT void JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1close(jlong cursorAddress) {
    MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
    mdb_cursor_close(cursor);
}
JNIEXPORT void JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1close(JNIEnv *__env, jclass clazz, jlong cursorAddress) {
    UNUSED_PARAMS(__env, clazz)
    JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1close(cursorAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1renew(jlong txnAddress, jlong cursorAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
    return (jint)mdb_cursor_renew(txn, cursor);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1renew(JNIEnv *__env, jclass clazz, jlong txnAddress, jlong cursorAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1renew(txnAddress, cursorAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1txn(jlong cursorAddress) {
    MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
    return (jlong)(intptr_t)mdb_cursor_txn(cursor);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1txn(JNIEnv *__env, jclass clazz, jlong cursorAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1txn(cursorAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1dbi(jlong cursorAddress) {
    MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
    return (jint)mdb_cursor_dbi(cursor);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1dbi(JNIEnv *__env, jclass clazz, jlong cursorAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1dbi(cursorAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1get(jlong cursorAddress, jlong keyAddress, jlong dataAddress, jint op) {
    MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
    MDB_val *key = (MDB_val *)(intptr_t)keyAddress;
    MDB_val *data = (MDB_val *)(intptr_t)dataAddress;
    return (jint)mdb_cursor_get(cursor, key, data, (MDB_cursor_op)op);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1get(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong keyAddress, jlong dataAddress, jint op) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1get(cursorAddress, keyAddress, dataAddress, op);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1put(jlong cursorAddress, jlong keyAddress, jlong dataAddress, jint flags) {
    MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
    MDB_val *key = (MDB_val *)(intptr_t)keyAddress;
    MDB_val *data = (MDB_val *)(intptr_t)dataAddress;
    return (jint)mdb_cursor_put(cursor, key, data, (unsigned int)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1put(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong keyAddress, jlong dataAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1put(cursorAddress, keyAddress, dataAddress, flags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1del(jlong cursorAddress, jint flags) {
    MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
    return (jint)mdb_cursor_del(cursor, (unsigned int)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1del(JNIEnv *__env, jclass clazz, jlong cursorAddress, jint flags) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1del(cursorAddress, flags);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1count(jlong cursorAddress, jlong countpAddress) {
    MDB_cursor *cursor = (MDB_cursor *)(intptr_t)cursorAddress;
    mdb_size_t *countp = (mdb_size_t *)(intptr_t)countpAddress;
    return (jint)mdb_cursor_count(cursor, countp);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1count(JNIEnv *__env, jclass clazz, jlong cursorAddress, jlong countpAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cursor_1count(cursorAddress, countpAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cmp(jlong txnAddress, jint dbi, jlong aAddress, jlong bAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    MDB_val const *a = (MDB_val const *)(intptr_t)aAddress;
    MDB_val const *b = (MDB_val const *)(intptr_t)bAddress;
    return (jint)mdb_cmp(txn, (MDB_dbi)dbi, a, b);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1cmp(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong aAddress, jlong bAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1cmp(txnAddress, dbi, aAddress, bAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dcmp(jlong txnAddress, jint dbi, jlong aAddress, jlong bAddress) {
    MDB_txn *txn = (MDB_txn *)(intptr_t)txnAddress;
    MDB_val const *a = (MDB_val const *)(intptr_t)aAddress;
    MDB_val const *b = (MDB_val const *)(intptr_t)bAddress;
    return (jint)mdb_dcmp(txn, (MDB_dbi)dbi, a, b);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dcmp(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jlong aAddress, jlong bAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dcmp(txnAddress, dbi, aAddress, bAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1list(jlong envAddress, jlong funcAddress, jlong ctxAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    MDB_msg_func *func = (MDB_msg_func *)(intptr_t)funcAddress;
    void *ctx = (void *)(intptr_t)ctxAddress;
    return (jint)mdb_reader_list(env, func, ctx);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1list(JNIEnv *__env, jclass clazz, jlong envAddress, jlong funcAddress, jlong ctxAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1list(envAddress, funcAddress, ctxAddress);
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__JJ(jlong envAddress, jlong deadAddress) {
    MDB_env *env = (MDB_env *)(intptr_t)envAddress;
    int *dead = (int *)(intptr_t)deadAddress;
    return (jint)mdb_reader_check(env, dead);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__JJ(JNIEnv *__env, jclass clazz, jlong envAddress, jlong deadAddress) {
    UNUSED_PARAMS(__env, clazz)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__JJ(envAddress, deadAddress);
}

JNIEXPORT jlong JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1version___3I_3I_3I(jint major__length, jint* major, jint minor__length, jint* minor, jint patch__length, jint* patch) {
    UNUSED_PARAM(major__length)
    UNUSED_PARAM(minor__length)
    UNUSED_PARAM(patch__length)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1version__JJJ((intptr_t)major, (intptr_t)minor, (intptr_t)patch);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1version___3I_3I_3I(JNIEnv *__env, jclass clazz, jintArray majorAddress, jintArray minorAddress, jintArray patchAddress) {
    jlong __result;
    jint *major = majorAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, majorAddress, 0);
    jint *minor = minorAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, minorAddress, 0);
    jint *patch = patchAddress == NULL ? NULL : (*__env)->GetPrimitiveArrayCritical(__env, patchAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1version__JJJ((intptr_t)major, (intptr_t)minor, (intptr_t)patch);
    if (patch != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, patchAddress, patch, 0); }
    if (minor != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, minorAddress, minor, 0); }
    if (major != NULL) { (*__env)->ReleasePrimitiveArrayCritical(__env, majorAddress, major, 0); }
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__J_3I(jlong envAddress, jint flags__length, jint* flags) {
    UNUSED_PARAM(flags__length)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__JJ(envAddress, (intptr_t)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__J_3I(JNIEnv *__env, jclass clazz, jlong envAddress, jintArray flagsAddress) {
    jint __result;
    jint *flags = (*__env)->GetPrimitiveArrayCritical(__env, flagsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1flags__JJ(envAddress, (intptr_t)flags);
    (*__env)->ReleasePrimitiveArrayCritical(__env, flagsAddress, flags, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__J_3I(jlong envAddress, jint readers__length, jint* readers) {
    UNUSED_PARAM(readers__length)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__JJ(envAddress, (intptr_t)readers);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__J_3I(JNIEnv *__env, jclass clazz, jlong envAddress, jintArray readersAddress) {
    jint __result;
    jint *readers = (*__env)->GetPrimitiveArrayCritical(__env, readersAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1env_1get_1maxreaders__JJ(envAddress, (intptr_t)readers);
    (*__env)->ReleasePrimitiveArrayCritical(__env, readersAddress, readers, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJI_3I(jlong txnAddress, jlong nameAddress, jint flags, jint dbi__length, jint* dbi) {
    UNUSED_PARAM(dbi__length)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJIJ(txnAddress, nameAddress, flags, (intptr_t)dbi);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJI_3I(JNIEnv *__env, jclass clazz, jlong txnAddress, jlong nameAddress, jint flags, jintArray dbiAddress) {
    jint __result;
    jint *dbi = (*__env)->GetPrimitiveArrayCritical(__env, dbiAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1open__JJIJ(txnAddress, nameAddress, flags, (intptr_t)dbi);
    (*__env)->ReleasePrimitiveArrayCritical(__env, dbiAddress, dbi, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JI_3I(jlong txnAddress, jint dbi, jint flags__length, jint* flags) {
    UNUSED_PARAM(flags__length)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JIJ(txnAddress, dbi, (intptr_t)flags);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JI_3I(JNIEnv *__env, jclass clazz, jlong txnAddress, jint dbi, jintArray flagsAddress) {
    jint __result;
    jint *flags = (*__env)->GetPrimitiveArrayCritical(__env, flagsAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1dbi_1flags__JIJ(txnAddress, dbi, (intptr_t)flags);
    (*__env)->ReleasePrimitiveArrayCritical(__env, flagsAddress, flags, 0);
    return __result;
}

JNIEXPORT jint JNICALL JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__J_3I(jlong envAddress, jint dead__length, jint* dead) {
    UNUSED_PARAM(dead__length)
    return JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__JJ(envAddress, (intptr_t)dead);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__J_3I(JNIEnv *__env, jclass clazz, jlong envAddress, jintArray deadAddress) {
    jint __result;
    jint *dead = (*__env)->GetPrimitiveArrayCritical(__env, deadAddress, 0);
    UNUSED_PARAMS(__env, clazz)
    __result = JavaCritical_org_lwjgl_util_lmdb_LMDB_nmdb_1reader_1check__JJ(envAddress, (intptr_t)dead);
    (*__env)->ReleasePrimitiveArrayCritical(__env, deadAddress, dead, 0);
    return __result;
}

EXTERN_C_EXIT
