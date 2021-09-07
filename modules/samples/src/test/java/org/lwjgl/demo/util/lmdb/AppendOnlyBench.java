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

import static org.lwjgl.demo.util.lmdb.LMDBUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.util.lmdb.LMDB.*;

/**
 * Benchmarks inserting 1m sequential int:int pairs.
 *
 * <p>The database files are deleted between benchmark iterations. This is meant to
 * test the custom patch for incremental growth (ITS#8324) on Windows. It is roughly
 * 25x faster on Windows 10, Ryzen 1800X, Samsung 960 EVO.</p>
 */
public final class AppendOnlyBench {

    private static final int BENCH_ITERS = 16;
    private static final int BENCH_PAIRS = 1_000_000;

    static {
        // This is necessary because of the horrible mdb_strerror implementation on Windows.
        // This loop is very likely to JIT compile the method, making the stack size required
        // to call it small enough for the mdb_strerror hack to work.
        for (int i = 0; i < 10000; i++) {
            mdb_strerror(0);
        }

        for (int i = 0; i < 10000; i++) {
            System.nanoTime();
        }
    }

    private AppendOnlyBench() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < BENCH_ITERS; i++) {
            bench0C();
        }
    }

    private static void bench() {
        File dir = createDatabaseDirectory("lmdb");

        long env;
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);
            E(mdb_env_create(pp));
            env = pp.get(0);
        }

        try {
            // Open environment
            E(mdb_env_open(env, dir.getPath(), MDB_NOSYNC | MDB_WRITEMAP, 0664));

            mdb_env_set_mapsize(env, 64 * 1024 * 1024);

            // Open database
            int dbi = openDatabase(env);

            long t = System.nanoTime();
            transaction(env, (stack, txn) -> {
                MDBVal     kv = MDBVal.calloc(stack);
                ByteBuffer kd = stack.malloc(4);
                kv.mv_data(kd);

                MDBVal     dv = MDBVal.calloc(stack);
                ByteBuffer dd = stack.malloc(4);
                dv.mv_data(dd);

                PointerBuffer pp = stack.mallocPointer(1);
                E(mdb_cursor_open(txn, dbi, pp));
                long cursor = pp.get(0);
                try {
                    for (int i = 0; i < BENCH_PAIRS; i++) {
                        kd.putInt(0, i);
                        dd.putInt(0, i);

                        E(mdb_cursor_put(cursor, kv, dv, 0));
                    }
                } finally {
                    E(mdb_cursor_del(cursor, 0));
                }

                return null;
            });
            t = System.nanoTime() - t;
            System.out.println((t / BENCH_PAIRS) + "ns");

            mdb_dbi_close(env, dbi);
        } finally {
            mdb_env_close(env);
            deleteDatabaseDirectory("lmdb");
        }
    }

    private static void bench0C() {
        File dir = createDatabaseDirectory("lmdb");

        long env;
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.mallocPointer(1);
            E(mdb_env_create(pp));
            env = pp.get(0);
        }

        try {
            // Open environment
            E(mdb_env_open(env, dir.getPath(), MDB_NOSYNC | MDB_WRITEMAP, 0664));

            mdb_env_set_mapsize(env, 64 * 1024 * 1024);

            // Open database
            int dbi = openDatabase(env);

            long t = System.nanoTime();
            transaction(env, (stack, txn) -> {
                MDBVal     kv = MDBVal.calloc(stack);
                ByteBuffer kd = stack.malloc(4);
                kv.mv_data(kd);

                MDBVal dv = MDBVal.calloc(stack);
                dv.mv_size(4);

                PointerBuffer pp = stack.mallocPointer(1);
                E(mdb_cursor_open(txn, dbi, pp));
                long cursor = pp.get(0);
                try {
                    for (int i = 0; i < BENCH_PAIRS; i++) {
                        kd.putInt(0, i);

                        E(mdb_cursor_put(cursor, kv, dv, MDB_RESERVE));
                        //noinspection ConstantConditions
                        dv.mv_data().putInt(0, i);
                    }
                } finally {
                    E(mdb_cursor_del(cursor, 0));
                }

                return null;
            });
            t = System.nanoTime() - t;
            System.out.println((t / BENCH_PAIRS) + "ns");

            mdb_dbi_close(env, dbi);
        } finally {
            mdb_env_close(env);
            deleteDatabaseDirectory("lmdb");
        }
    }

}