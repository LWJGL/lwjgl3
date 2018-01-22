/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.lmdb;

import org.lwjgl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.lmdb.LMDB.*;

/** Utility class for LMDB demos. */
final class LMDBUtil {

    private LMDBUtil() {
    }

    static File createDatabaseDirectory(String directory) {
        File dir = new File(directory);

        dir.mkdir();
        dir.deleteOnExit();

        new File(dir, "data.mdb").deleteOnExit();
        new File(dir, "lock.mdb").deleteOnExit();

        return dir;
    }

    static void deleteDatabaseDirectory(String directory) {
        File dir = new File(directory);

        new File(dir, "data.mdb").delete();
        new File(dir, "lock.mdb").delete();

        dir.delete();
    }

    static void E(int rc) {
        if (rc != MDB_SUCCESS) {
            throw new IllegalStateException(mdb_strerror(rc));
        }
    }

    @FunctionalInterface
    interface Transaction<T> {
        T exec(MemoryStack stack, long txn);
    }

    static <T> T transaction(long env, Transaction<T> transaction) {
        T ret;

        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);

            E(mdb_txn_begin(env, NULL, 0, pp));
            long txn = pp.get(0);

            int err;
            try {
                ret = transaction.exec(stack, txn);
                err = mdb_txn_commit(txn);
            } catch (Throwable t) {
                mdb_txn_abort(txn);
                throw t;
            }
            E(err);
        }

        return ret;
    }

    static int openDatabase(long env) {
        return transaction(env, (stack, txn) -> {
            IntBuffer ip = stack.mallocInt(1);

            E(mdb_dbi_open(txn, (CharSequence)null, MDB_INTEGERKEY, ip));
            return ip.get(0);
        });
    }

}
