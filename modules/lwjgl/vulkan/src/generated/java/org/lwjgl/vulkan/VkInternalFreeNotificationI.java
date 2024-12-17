/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke PFN_vkInternalFreeNotification} */
@FunctionalInterface
@NativeType("PFN_vkInternalFreeNotification")
public interface VkInternalFreeNotificationI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE))
        );
    }

    /** {@code void (* PFN_vkInternalFreeNotification) (void * pUserData, size_t size, VkInternalAllocationType allocationType, VkSystemAllocationScope allocationScope)} */
    void invoke(@NativeType("void *") long pUserData, @NativeType("size_t") long size, @NativeType("VkInternalAllocationType") int allocationType, @NativeType("VkSystemAllocationScope") int allocationScope);

}