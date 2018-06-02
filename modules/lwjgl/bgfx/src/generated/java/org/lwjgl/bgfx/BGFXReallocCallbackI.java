/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Allocates memory.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     bgfx_allocator_interface_t *_this,
 *     void *_ptr,
 *     size_t _size,
 *     size_t _align,
 *     char *_file,
 *     uint32_t _line
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void * (*) (bgfx_allocator_interface_t *, void *, size_t, size_t, char *, uint32_t)")
public interface BGFXReallocCallbackI extends CallbackI.P {

    String SIGNATURE = "(pppppi)p";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default long callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    /**
     * Will be called when an allocation is requested.
     *
     * @param _this  the allocator interface
     * @param _ptr   the previously allocated memory or {@code NULL}
     * @param _size  the number of bytes to allocate
     * @param _align the allocation alignment, in bytes
     * @param _file  file path where allocation was generated
     * @param _line  line where allocation was generated
     */
    @NativeType("void *") long invoke(@NativeType("bgfx_allocator_interface_t *") long _this, @NativeType("void *") long _ptr, @NativeType("size_t") long _size, @NativeType("size_t") long _align, @NativeType("char *") long _file, @NativeType("uint32_t") int _line);

}