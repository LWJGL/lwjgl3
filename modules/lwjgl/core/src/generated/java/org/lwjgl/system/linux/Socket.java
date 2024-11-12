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

/** Native bindings to &lt;sys/socket.h&gt;. */
public class Socket {

    static { Library.initialize(); }

    /**
     * The following constants should be used for the second parameter of {@code shutdown}.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #SHUT_RD SHUT_RD} - No more receptions.</li>
     * <li>{@link #SHUT_WR SHUT_WR} - No more transmissions.</li>
     * <li>{@link #SHUT_RDWR SHUT_RDWR} - No more receptions or transmissions.</li>
     * </ul>
     */
    public static final int
        SHUT_RD   = 0,
        SHUT_WR   = 1,
        SHUT_RDWR = 2;

    protected Socket() {
        throw new UnsupportedOperationException();
    }

    // --- [ socket ] ---

    /** Unsafe version of: {@link #socket} */
    public static native int nsocket(long _errno, int __domain, int __type, int __protocol);

    /**
     * Create a new socket of type {@code __type} in domain {@code __domain}, using protocol {@code __protocol}.
     * 
     * <p>If {@code __protocol} is zero, one is chosen automatically.</p>
     *
     * @param _errno optionally returns the {@code errno} value after this function is called
     *
     * @return a file descriptor for the new socket, or -1 for errors
     */
    public static int socket(@NativeType("int *") @Nullable IntBuffer _errno, int __domain, int __type, int __protocol) {
        if (CHECKS) {
            checkSafe(_errno, 1);
        }
        return nsocket(memAddressSafe(_errno), __domain, __type, __protocol);
    }

}