/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.msdfgen;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class MSDFGenFTLoadCallback extends Callback implements MSDFGenFTLoadCallbackI {

    /**
     * Creates a {@code MSDFGenFTLoadCallback} instance from the specified function pointer.
     *
     * @return the new {@code MSDFGenFTLoadCallback}
     */
    public static MSDFGenFTLoadCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable MSDFGenFTLoadCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code MSDFGenFTLoadCallback} instance that delegates to the specified {@code MSDFGenFTLoadCallbackI} instance. */
    public static MSDFGenFTLoadCallback create(MSDFGenFTLoadCallbackI instance) { return create(instance, instance.address()); }

    private static MSDFGenFTLoadCallback create(MSDFGenFTLoadCallbackI instance, long functionPointer) {
        return instance instanceof MSDFGenFTLoadCallback
            ? (MSDFGenFTLoadCallback)instance
            : new MSDFGenFTLoadCallback(functionPointer) {
                @Override public long invoke(long name) {
                    return instance.invoke(name);
                }
            };
    }

    protected MSDFGenFTLoadCallback() {
        super(DESCRIPTOR);
    }

    MSDFGenFTLoadCallback(long functionPointer) {
        super(functionPointer);
    }

}