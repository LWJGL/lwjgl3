/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.lmdb;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.lmdb.*;

import java.io.*;
import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.lmdb.LMDB.*;
import static org.testng.Assert.*;

/** LMDB sample demonstrating zero-copy string persistence. */
public final class LMDBDemo {

    private LMDBDemo() {
    }

    private static void E(int rc) {
        if (rc != MDB_SUCCESS) {
            throw new IllegalStateException(mdb_strerror(rc));
        }
    }

    public static void main(String[] args) {
        // Database dictory
        File dir = new File("lmdb");
        dir.mkdir();
        dir.deleteOnExit();
        new File(dir, "data.mdb").deleteOnExit();
        new File(dir, "lock.mdb").deleteOnExit();

        long env;
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);
            E(mdb_env_create(pp));
            env = pp.get(0);
        }

        try {
            // Open environment
            E(mdb_env_open(env, dir.getPath(), 0, 0664));

            // Open database
            int dbi = openDatabase(env);

            // Put a value
            put(env, dbi, 1, "LWJGL");
            assertEquals(get(env, dbi, 1), "LWJGL");

            // Put a value, zero copy encoding
            putZeroCopy(env, dbi, 2, "LMDB");
            assertEquals(get(env, dbi, 2), "LMDB");
        } finally {
            // Close environment
            mdb_env_close(env);
        }
    }

    private interface Transaction<T> {
        T exec(MemoryStack stack, long txn);
    }

    private static <T> T transaction(long env, Transaction<T> transaction) {
        long txn = NULL;
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);

            E(mdb_txn_begin(env, NULL, 0, pp));
            txn = pp.get(0);

            return transaction.exec(stack, txn);
        } finally {
            if (txn != NULL) {
                E(mdb_txn_commit(txn));
            }
        }
    }

    private static int openDatabase(long env) {
        return transaction(env, (stack, txn) -> {
            IntBuffer ip = stack.mallocInt(1);

            E(mdb_dbi_open(txn, (CharSequence)null, MDB_INTEGERKEY, ip));
            return ip.get(0);
        });
    }

    private static void put(long env, int dbi, int key, String value) {
        transaction(env, (stack, txn) -> {
            MDBVal kv = MDBVal.callocStack(stack)
                .mv_data(stack.malloc(4).putInt(0, key));

            // value is encoded to the MDBVal struct
            MDBVal dv = MDBVal.callocStack(stack)
                .mv_data(stack.UTF8(value, false));

            // the encoded text is copied to the database
            E(mdb_put(txn, dbi, kv, dv, 0));

            return null;
        });
    }

    private static void putZeroCopy(long env, int dbi, int key, String value) {
        transaction(env, (stack, txn) -> {
            MDBVal kv = MDBVal.callocStack(stack)
                .mv_data(stack.malloc(4).putInt(0, key));

            // request enough bytes for the UTF8 encoded value
            MDBVal dv = MDBVal.callocStack(stack)
                .mv_size(memLengthUTF8(value, false));

            // no copy, LMDB updates dv.mv_data with a pointer to the database
            E(mdb_put(txn, dbi, kv, dv, MDB_RESERVE));
            // value is encoded directly to the memory-mapped file
            memUTF8(value, false, dv.mv_data());

            return null;
        });
    }

    private static String get(long env, int dbi, int key) {
        return transaction(env, (stack, txn) -> {
            MDBVal kv = MDBVal.callocStack(stack)
                .mv_data(stack.malloc(4).putInt(0, key));

            MDBVal dv = MDBVal.callocStack(stack);

            E(mdb_get(txn, dbi, kv, dv));
            return memUTF8(dv.mv_data());
        });
    }

}