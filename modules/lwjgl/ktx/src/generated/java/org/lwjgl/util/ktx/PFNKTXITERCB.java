/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFNKTXITERCB} */
public abstract class PFNKTXITERCB extends Callback implements PFNKTXITERCBI {

    /**
     * Creates a {@code PFNKTXITERCB} instance from the specified function pointer.
     *
     * @return the new {@code PFNKTXITERCB}
     */
    public static PFNKTXITERCB create(long functionPointer) {
        PFNKTXITERCBI instance = Callback.get(functionPointer);
        return instance instanceof PFNKTXITERCB
            ? (PFNKTXITERCB)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable PFNKTXITERCB createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code PFNKTXITERCB} instance that delegates to the specified {@code PFNKTXITERCBI} instance. */
    public static PFNKTXITERCB create(PFNKTXITERCBI instance) {
        return instance instanceof PFNKTXITERCB
            ? (PFNKTXITERCB)instance
            : new Container(instance.address(), instance);
    }

    protected PFNKTXITERCB() {
        super(CIF);
    }

    PFNKTXITERCB(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends PFNKTXITERCB {

        private final PFNKTXITERCBI delegate;

        Container(long functionPointer, PFNKTXITERCBI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int miplevel, int face, int width, int height, int depth, long faceLodSize, long pixels, long userdata) {
            return delegate.invoke(miplevel, face, width, height, depth, faceLodSize, pixels, userdata);
        }

    }

}