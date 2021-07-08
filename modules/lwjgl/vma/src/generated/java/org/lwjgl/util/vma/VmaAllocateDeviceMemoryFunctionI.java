/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.vma;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be set to the {@link VmaDeviceMemoryCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     VmaAllocator allocator,
 *     uint32_t memoryType,
 *     VkDeviceMemory memory,
 *     VkDeviceSize size,
 *     void *pUserData
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("PFN_vmaAllocateDeviceMemoryFunction")
public interface VmaAllocateDeviceMemoryFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_uint32, ffi_type_uint64, ffi_type_uint64, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetLong(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetLong(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
    }

    /** Called after successful {@code vkAllocateMemory}. */
    void invoke(@NativeType("VmaAllocator") long allocator, @NativeType("uint32_t") int memoryType, @NativeType("VkDeviceMemory") long memory, @NativeType("VkDeviceSize") long size, @NativeType("void *") long pUserData);

}