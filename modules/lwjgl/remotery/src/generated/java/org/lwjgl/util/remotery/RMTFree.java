/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke rmtFreePtr} */
public abstract class RMTFree extends Callback implements RMTFreeI {

    /**
     * Creates a {@code RMTFree} instance from the specified function pointer.
     *
     * @return the new {@code RMTFree}
     */
    public static RMTFree create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RMTFree createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code RMTFree} instance that delegates to the specified {@code RMTFreeI} instance. */
    public static RMTFree create(RMTFreeI instance) { return create(instance, instance.address()); }

    private static RMTFree create(RMTFreeI instance, long functionPointer) {
        return instance instanceof RMTFree
            ? (RMTFree)instance
            : new RMTFree(functionPointer) {
                @Override public void invoke(long mm_context, long ptr) {
                    instance.invoke(mm_context, ptr);
                }
            };
    }

    protected RMTFree() {
        super(DESCRIPTOR);
    }

    RMTFree(long functionPointer) {
        super(functionPointer);
    }

}