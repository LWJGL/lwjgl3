/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be used with the {@link STBImageWrite} {@code write_type_to_func} functions.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *context,
 *     void *data,
 *     int size
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("stbi_write_func *")
public interface STBIWriteCallbackI extends CallbackI.V {

    String SIGNATURE = "(ppi)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    /**
     * The {@code stbi_write_func} callback.
     *
     * @param context the context passed to the write function
     * @param data    the data to write
     * @param size    the number of bytes in {@code data}
     */
    void invoke(@NativeType("void *") long context, @NativeType("void *") long data, int size);

}