/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.macosx;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to libc, the Standard C Library. */
public class LibC {

    /** Contains the function pointers loaded from {@code LibSystem.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            getpid = apiGetFunctionAddress(LibSystem.getLibrary(), "getpid");

    }

    protected LibC() {
        throw new UnsupportedOperationException();
    }

    // --- [ getpid ] ---

    /** Returns the process ID of the calling process. */
    @NativeType("pid_t")
    public static long getpid() {
        long __functionAddress = Functions.getpid;
        return invokeP(__functionAddress);
    }

}