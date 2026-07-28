/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openal;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ALBUFFERCALLBACKTYPESOFT} */
public abstract class SOFTCallbackBufferType extends Callback implements SOFTCallbackBufferTypeI {

    /**
     * Creates a {@code SOFTCallbackBufferType} instance from the specified function pointer.
     *
     * @return the new {@code SOFTCallbackBufferType}
     */
    public static SOFTCallbackBufferType create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable SOFTCallbackBufferType createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code SOFTCallbackBufferType} instance that delegates to the specified {@code SOFTCallbackBufferTypeI} instance. */
    public static SOFTCallbackBufferType create(SOFTCallbackBufferTypeI instance) { return create(instance, instance.address()); }

    private static SOFTCallbackBufferType create(SOFTCallbackBufferTypeI instance, long functionPointer) {
        return instance instanceof SOFTCallbackBufferType
            ? (SOFTCallbackBufferType)instance
            : new SOFTCallbackBufferType(functionPointer) {
                @Override public int invoke(long userptr, long sampledata, int numbytes) {
                    return instance.invoke(userptr, sampledata, numbytes);
                }
            };
    }

    protected SOFTCallbackBufferType() {
        super(DESCRIPTOR);
    }

    SOFTCallbackBufferType(long functionPointer) {
        super(functionPointer);
    }

}