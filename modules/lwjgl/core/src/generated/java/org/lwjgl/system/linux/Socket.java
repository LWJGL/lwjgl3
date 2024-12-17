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
import static org.lwjgl.system.MemoryUtil.*;

public class Socket {

    static { Library.initialize(); }

    public static final int
        SHUT_RD   = 0,
        SHUT_WR   = 1,
        SHUT_RDWR = 2;

    protected Socket() {
        throw new UnsupportedOperationException();
    }

    // --- [ socket ] ---

    /** {@code int socket(int __domain, int __type, int __protocol)} */
    public static native int nsocket(long _errno, int __domain, int __type, int __protocol);

    /** {@code int socket(int __domain, int __type, int __protocol)} */
    public static int socket(@NativeType("int *") @Nullable IntBuffer _errno, int __domain, int __type, int __protocol) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nsocket(memAddressSafe(_errno), __domain, __type, __protocol);
    }

}