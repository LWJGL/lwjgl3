/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.lmdb;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.lmdb.*;

import java.io.*;
import java.util.*;

import static org.lwjgl.demo.util.lmdb.LMDBUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.lmdb.LMDB.*;

/** LMDB sample demonstrating zero-copy string persistence. */
public final class LMDBDemo {

    private LMDBDemo() {
    }

    public static void main(String[] args) {
        File dir = createDatabaseDirectory("lmdb");

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
            if (!"LWJGL".equals(get(env, dbi, 1))) {
                throw new IllegalStateException();
            }

            // Put a value, zero copy encoding
            putZeroCopy(env, dbi, 2, "LMDB");
            if (!"LMDB".equals(get(env, dbi, 2))) {
                throw new IllegalStateException();
            }
        } finally {
            // Close environment
            mdb_env_close(env);
        }
    }

    private static void put(long env, int dbi, int key, String value) {
        transaction(env, (stack, txn) -> {
            MDBVal kv = MDBVal.calloc(stack)
                .mv_data(stack.malloc(4).putInt(0, key));

            // value is encoded to the MDBVal struct
            MDBVal dv = MDBVal.calloc(stack)
                .mv_data(stack.UTF8(value, false));

            // the encoded text is copied to the database
            E(mdb_put(txn, dbi, kv, dv, 0));

            return null;
        });
    }

    private static void putZeroCopy(long env, int dbi, int key, String value) {
        transaction(env, (stack, txn) -> {
            MDBVal kv = MDBVal.calloc(stack)
                .mv_data(stack.malloc(4).putInt(0, key));

            // request enough bytes for the UTF8 encoded value
            MDBVal dv = MDBVal.calloc(stack)
                .mv_size(memLengthUTF8(value, false));

            // no copy, LMDB updates dv.mv_data with a pointer to the database
            E(mdb_put(txn, dbi, kv, dv, MDB_RESERVE));
            // value is encoded directly to the memory-mapped file
            memUTF8(value, false, Objects.requireNonNull(dv.mv_data()));

            return null;
        });
    }

    private static String get(long env, int dbi, int key) {
        return transaction(env, (stack, txn) -> {
            MDBVal kv = MDBVal.calloc(stack)
                .mv_data(stack.malloc(4).putInt(0, key));

            MDBVal dv = MDBVal.calloc(stack);

            E(mdb_get(txn, dbi, kv, dv));
            return memUTF8(Objects.requireNonNull(dv.mv_data()));
        });
    }

}