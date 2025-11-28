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

/** Callback function: {@link #invoke PFN_vkFreeFunction} */
@FunctionalInterface
@NativeType("PFN_vkFreeFunction")
public interface VkFreeFunctionI extends CallbackI {

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

    /** {@code void (* PFN_vkFreeFunction) (void * pUserData, void * pMemory)} */
    void invoke(@NativeType("void *") long pUserData, @NativeType("void *") long pMemory);

}