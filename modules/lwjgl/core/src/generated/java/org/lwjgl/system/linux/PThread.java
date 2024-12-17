/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.lwjgl.system.*;

public class PThread {

    static { Library.initialize(); }

    protected PThread() {
        throw new UnsupportedOperationException();
    }

    // --- [ pthread_self ] ---

    /** {@code pthread_t pthread_self(void)} */
    @NativeType("pthread_t")
    public static native long pthread_self();

}