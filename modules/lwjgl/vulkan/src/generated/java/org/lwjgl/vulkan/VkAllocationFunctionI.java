/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke PFN_vkAllocationFunction} */
@FunctionalInterface
@NativeType("PFN_vkAllocationFunction")
public interface VkAllocationFunctionI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            apiStdcall(),
            ffi_type_pointer,
            ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint32
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code void * (* PFN_vkAllocationFunction) (void * pUserData, size_t size, size_t alignment, VkSystemAllocationScope allocationScope)} */
    @NativeType("void *") long invoke(@NativeType("void *") long pUserData, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("VkSystemAllocationScope") int allocationScope);

}