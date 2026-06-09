/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class ExrFree extends Callback implements ExrFreeI {

    /**
     * Creates a {@code ExrFree} instance from the specified function pointer.
     *
     * @return the new {@code ExrFree}
     */
    public static ExrFree create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExrFree createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExrFree} instance that delegates to the specified {@code ExrFreeI} instance. */
    public static ExrFree create(ExrFreeI instance) { return create(instance, instance.address()); }

    private static ExrFree create(ExrFreeI instance, long functionPointer) {
        return instance instanceof ExrFree
            ? (ExrFree)instance
            : new ExrFree(functionPointer) {
                @Override public void invoke(long userdata, long ptr, long size) {
                    instance.invoke(userdata, ptr, size);
                }
            };
    }

    protected ExrFree() {
        super(DESCRIPTOR);
    }

    ExrFree(long functionPointer) {
        super(functionPointer);
    }

}