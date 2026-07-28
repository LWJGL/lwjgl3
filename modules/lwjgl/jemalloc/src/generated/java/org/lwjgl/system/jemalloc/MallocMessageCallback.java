/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class MallocMessageCallback extends Callback implements MallocMessageCallbackI {

    /**
     * Creates a {@code MallocMessageCallback} instance from the specified function pointer.
     *
     * @return the new {@code MallocMessageCallback}
     */
    public static MallocMessageCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable MallocMessageCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code MallocMessageCallback} instance that delegates to the specified {@code MallocMessageCallbackI} instance. */
    public static MallocMessageCallback create(MallocMessageCallbackI instance) { return create(instance, instance.address()); }

    private static MallocMessageCallback create(MallocMessageCallbackI instance, long functionPointer) {
        return instance instanceof MallocMessageCallback
            ? (MallocMessageCallback)instance
            : new MallocMessageCallback(functionPointer) {
                @Override public void invoke(long cbopaque, long s) {
                    instance.invoke(cbopaque, s);
                }
            };
    }

    protected MallocMessageCallback() {
        super(DESCRIPTOR);
    }

    MallocMessageCallback(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link MallocMessageCallback} arguments to a String.
     *
     * <p>This method may only be used inside a MallocMessageCallback invocation.</p>
     *
     * @param s the MallocMessageCallback {@code s} argument
     *
     * @return the message as a String
     */
    public static String getMessage(long s) {
        return memASCII(s);
    }

}