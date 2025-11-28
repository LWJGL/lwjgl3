/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("void * (*) (VkImage, uint64_t)")
public interface ktxVulkanTexture_subAllocatorBindImageFuncPtrI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            apiStdcall(),
            ffi_type_pointer,
            ffi_type_uint64, ffi_type_uint64
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetLong(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code void * (*) (VkImage image, uint64_t allocId)} */
    @NativeType("void *") long invoke(@NativeType("VkImage") long image, @NativeType("uint64_t") long allocId);

}