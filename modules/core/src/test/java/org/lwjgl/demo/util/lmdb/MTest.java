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
import java.util.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.lmdb.LMDB.*;

/** LWJGL port of <a href="https://github.com/LMDB/lmdb/blob/mdb.master/libraries/liblmdb/mtest.c">mtest.c</a>. */
public final class MTest {

    private MTest() {
    }

    private static void E(int rc) {
        CHECK(rc, rc == MDB_SUCCESS, null);
    }

    private static boolean RES(int err, int rc) {
        if (rc == err) {
            return true;
        }

        CHECK(rc, rc == 0, null);
        return false;
    }

    private static void CHECK(int rc, boolean test, String msg) {
        if (test) {
            return;
        }

        throw new IllegalStateException(
            msg != null
                ? String.format("%s: %s", msg, mdb_strerror(rc))
                : mdb_strerror(rc)
        );
    }

    private static void print_p(MDBVal key, MDBVal data) {
        System.out.printf(
            "key: %X %s, data: %X %s\n",
            memGetAddress(key.address() + MDBVal.MV_DATA), memASCII(key.mv_data()),
            memGetAddress(data.address() + MDBVal.MV_DATA), memASCII(data.mv_data())
        );
    }

    private static void print(MDBVal key, MDBVal data) {
        System.out.printf(
            "key: %s, data: %s\n",
            memASCII(key.mv_data()),
            memASCII(data.mv_data())
        );
    }

    public static void main(String[] args) {
        File dir = new File("testdb");
        dir.mkdir();
        dir.deleteOnExit();
        new File(dir, "data.mdb").deleteOnExit();
        new File(dir, "lock.mdb").deleteOnExit();

        MDBVal
            key = MDBVal.calloc(),
            data = MDBVal.calloc();

        MDBStat mst = MDBStat.calloc();

        ByteBuffer sval = memCalloc(32);

        Random rand = new Random();

        int count = (rand.nextInt(Integer.MAX_VALUE) % 12) + 64;

        IntBuffer values = memAllocInt(count);

        for (int i = 0; i < count; i++) {
            values.put(i, rand.nextInt(Integer.MAX_VALUE) % 1024);
        }

        PointerBuffer pp = memAllocPointer(1);

        E(mdb_env_create(pp));
        long env = pp.get(0);
        E(mdb_env_set_maxreaders(env, 1));
        E(mdb_env_set_mapsize(env, 10485760));
        E(mdb_env_open(env, dir.getPath(), MDB_FIXEDMAP /*|MDB_NOSYNC*/, 0664));

        E(mdb_txn_begin(env, NULL, 0, pp));
        long txn = pp.get(0);
        int  dbi;
        try (MemoryStack stack = stackPush()) {
            IntBuffer ip = stack.mallocInt(1);

            E(mdb_dbi_open(txn, (CharSequence)null, 0, ip));
            dbi = ip.get(0);
        }

        sval.limit(4);
        key.mv_data(sval);
        sval.clear();

        System.out.printf("Adding %d values\n", count);
        int j = 0;
        for (int i = 0; i < count; i++) {
            String s = String.format("%03x %d foo bar", values.get(i), values.get(i));
            memASCII(s, false, sval);
            /* Set <data> in each iteration, since MDB_NOOVERWRITE may modify it */
            sval.limit(s.length());
            data.mv_data(sval);
            sval.clear();
            if (RES(MDB_KEYEXIST, mdb_put(txn, dbi, key, data, MDB_NOOVERWRITE))) {
                j++;
            }
        }
        if (j != 0) {
            System.out.printf("%d duplicates skipped\n", j);
        }
        E(mdb_txn_commit(txn));
        E(mdb_env_stat(env, mst));

        E(mdb_txn_begin(env, NULL, MDB_RDONLY, pp));
        txn = pp.get(0);
        E(mdb_cursor_open(txn, dbi, pp));
        long cursor = pp.get(0);
        int  rc;
        while ((rc = mdb_cursor_get(cursor, key, data, MDB_NEXT)) == 0) {
            print_p(key, data);
        }
        CHECK(rc, rc == MDB_NOTFOUND, "mdb_cursor_get");
        mdb_cursor_close(cursor);
        mdb_txn_abort(txn);

        j = 0;
        for (int i = count - 1; i > -1; i -= (rand.nextInt(Integer.MAX_VALUE) % 5)) {
            j++;
            E(mdb_txn_begin(env, NULL, 0, pp));
            txn = pp.get(0);
            memASCII(String.format("%03x ", values.get(i)), false, sval);
            if (RES(MDB_NOTFOUND, mdb_del(txn, dbi, key, null))) {
                j--;
                mdb_txn_abort(txn);
            } else {
                E(mdb_txn_commit(txn));
            }
        }
        memFree(values);
        System.out.printf("Deleted %d values\n", j);

        E(mdb_env_stat(env, mst));
        E(mdb_txn_begin(env, NULL, MDB_RDONLY, pp));
        txn = pp.get(0);
        E(mdb_cursor_open(txn, dbi, pp));
        cursor = pp.get(0);
        System.out.printf("Cursor next\n");
        while ((rc = mdb_cursor_get(cursor, key, data, MDB_NEXT)) == 0) {
            print(key, data);
        }
        CHECK(rc, rc == MDB_NOTFOUND, "mdb_cursor_get");
        System.out.printf("Cursor last\n");
        E(mdb_cursor_get(cursor, key, data, MDB_LAST));
        print(key, data);
        System.out.printf("Cursor prev\n");
        while ((rc = mdb_cursor_get(cursor, key, data, MDB_PREV)) == 0) {
            print(key, data);
        }
        CHECK(rc, rc == MDB_NOTFOUND, "mdb_cursor_get");
        System.out.printf("Cursor last/prev\n");
        E(mdb_cursor_get(cursor, key, data, MDB_LAST));
        print(key, data);
        E(mdb_cursor_get(cursor, key, data, MDB_PREV));
        print(key, data);

        mdb_cursor_close(cursor);
        mdb_txn_abort(txn);

        System.out.printf("Deleting with cursor\n");
        E(mdb_txn_begin(env, NULL, 0, pp));
        txn = pp.get(0);
        E(mdb_cursor_open(txn, dbi, pp));
        long cur2 = pp.get(0);
        for (int i = 0; i < 50; i++) {
            if (RES(MDB_NOTFOUND, mdb_cursor_get(cur2, key, data, MDB_NEXT))) {
                break;
            }
            print_p(key, data);
            E(mdb_del(txn, dbi, key, null));
        }

        System.out.printf("Restarting cursor in txn\n");
        for (int op = MDB_FIRST, i = 0; i <= 32; op = MDB_NEXT, i++) {
            if (RES(MDB_NOTFOUND, mdb_cursor_get(cur2, key, data, op))) {
                break;
            }
            print_p(key, data);
        }
        mdb_cursor_close(cur2);
        E(mdb_txn_commit(txn));

        System.out.printf("Restarting cursor outside txn\n");
        E(mdb_txn_begin(env, NULL, 0, pp));
        txn = pp.get(0);
        E(mdb_cursor_open(txn, dbi, pp));
        cursor = pp.get(0);
        for (int op = MDB_FIRST, i = 0; i <= 32; op = MDB_NEXT, i++) {
            if (RES(MDB_NOTFOUND, mdb_cursor_get(cursor, key, data, op))) {
                break;
            }
            print_p(key, data);
        }
        mdb_cursor_close(cursor);
        mdb_txn_abort(txn);

        mdb_dbi_close(env, dbi);
        mdb_env_close(env);

        memFree(pp);

        memFree(sval);

        mst.free();
        data.free();
        key.free();
    }

}