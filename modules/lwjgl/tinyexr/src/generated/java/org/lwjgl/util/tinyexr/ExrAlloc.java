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
public abstract class ExrAlloc extends Callback implements ExrAllocI {

    /**
     * Creates a {@code ExrAlloc} instance from the specified function pointer.
     *
     * @return the new {@code ExrAlloc}
     */
    public static ExrAlloc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExrAlloc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExrAlloc} instance that delegates to the specified {@code ExrAllocI} instance. */
    public static ExrAlloc create(ExrAllocI instance) { return create(instance, instance.address()); }

    private static ExrAlloc create(ExrAllocI instance, long functionPointer) {
        return instance instanceof ExrAlloc
            ? (ExrAlloc)instance
            : new ExrAlloc(functionPointer) {
                @Override public long invoke(long userdata, long size, long alignment) {
                    return instance.invoke(userdata, size, alignment);
                }
            };
    }

    protected ExrAlloc() {
        super(DESCRIPTOR);
    }

    ExrAlloc(long functionPointer) {
        super(functionPointer);
    }

}