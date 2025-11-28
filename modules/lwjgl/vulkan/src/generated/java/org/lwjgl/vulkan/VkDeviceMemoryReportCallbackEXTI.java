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

/** Callback function: {@link #invoke PFN_vkDeviceMemoryReportCallbackEXT} */
@FunctionalInterface
@NativeType("PFN_vkDeviceMemoryReportCallbackEXT")
public interface VkDeviceMemoryReportCallbackEXTI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            apiStdcall(),
            ffi_type_void,
            ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
    }

    /** {@code void (* PFN_vkDeviceMemoryReportCallbackEXT) (VkDeviceMemoryReportCallbackDataEXT const * pCallbackData, void * pUserData)} */
    void invoke(@NativeType("VkDeviceMemoryReportCallbackDataEXT const *") long pCallbackData, @NativeType("void *") long pUserData);

}