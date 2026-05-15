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
    public static PFNKTXITERCB create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable PFNKTXITERCB createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code PFNKTXITERCB} instance that delegates to the specified {@code PFNKTXITERCBI} instance. */
    public static PFNKTXITERCB create(PFNKTXITERCBI instance) { return create(instance, instance.address()); }

    private static PFNKTXITERCB create(PFNKTXITERCBI instance, long functionPointer) {
        return instance instanceof PFNKTXITERCB
            ? (PFNKTXITERCB)instance
            : new PFNKTXITERCB(functionPointer) {
                @Override public int invoke(int miplevel, int face, int width, int height, int depth, long faceLodSize, long pixels, long userdata) {
                    return instance.invoke(miplevel, face, width, height, depth, faceLodSize, pixels, userdata);
                }
            };
    }

    protected PFNKTXITERCB() {
        super(DESCRIPTOR);
    }

    PFNKTXITERCB(long functionPointer) {
        super(functionPointer);
    }

}