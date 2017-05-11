/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system;

import java.nio.*;

import static org.lwjgl.system.MemoryStack.*;

/** A platform/device/context specific provider of native function addresses. */
public interface FunctionProviderLocal extends FunctionProvider {

    /** {@link CharSequence} version of {@link #getFunctionAddress(long, ByteBuffer)}. */
    default long getFunctionAddress(long handle, CharSequence functionName) {
        try (MemoryStack stack = stackPush()) {
            return getFunctionAddress(handle, stack.ASCII(functionName));
        }
    }

    /**
     * Returns the function address of the specified function for the specified {@code handle}. If the function is not supported, returns 0L.
     *
     * @param handle       the handle to a platform/device/context
     * @param functionName the encoded name of the function to query
     *
     * @return the function address or 0L if the function is not supported
     */
    long getFunctionAddress(long handle, ByteBuffer functionName);

}