/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to &lt;sys/stat.h&gt;. */
public class Stat {

    static { Library.initialize(); }

    protected Stat() {
        throw new UnsupportedOperationException();
    }

    // --- [ stat ] ---

    /** Unsafe version of: {@link #stat} */
    public static native int nstat(long _errno, long __file, long __buf);

    /** @param _errno optionally returns the {@code errno} value after this function is called */
    public static int stat(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("char const *") ByteBuffer __file, @NativeType("struct stat *") long __buf) {
        if (CHECKS) {
            checkSafe(_errno, 1);
            checkNT1(__file);
            check(__buf);
        }
        return nstat(memAddressSafe(_errno), memAddress(__file), __buf);
    }

    /** @param _errno optionally returns the {@code errno} value after this function is called */
    public static int stat(@NativeType("int *") @Nullable IntBuffer _errno, @NativeType("char const *") CharSequence __file, @NativeType("struct stat *") long __buf) {
        if (CHECKS) {
            checkSafe(_errno, 1);
            check(__buf);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(__file, true);
            long __fileEncoded = stack.getPointerAddress();
            return nstat(memAddressSafe(_errno), __fileEncoded, __buf);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ fstat ] ---

    /** Unsafe version of: {@link #fstat} */
    public static native int nfstat(long _errno, int __fd, long __buf);

    /** @param _errno optionally returns the {@code errno} value after this function is called */
    public static int fstat(@NativeType("int *") @Nullable IntBuffer _errno, int __fd, @NativeType("struct stat *") long __buf) {
        if (CHECKS) {
            checkSafe(_errno, 1);
            check(__buf);
        }
        return nfstat(memAddressSafe(_errno), __fd, __buf);
    }

}