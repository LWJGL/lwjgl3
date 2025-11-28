/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke PFN_xrDebugUtilsMessengerCallbackEXT} */
@FunctionalInterface
@NativeType("PFN_xrDebugUtilsMessengerCallbackEXT")
public interface XrDebugUtilsMessengerCallbackEXTI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            apiStdcall(),
            ffi_type_uint32,
            ffi_type_uint64, ffi_type_uint64, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetLong(memGetAddress(args)),
            memGetLong(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** {@code XrBool32 (* PFN_xrDebugUtilsMessengerCallbackEXT) (XrDebugUtilsMessageSeverityFlagsEXT messageSeverity, XrDebugUtilsMessageTypeFlagsEXT messageTypes, XrDebugUtilsMessengerCallbackDataEXT const * callbackData, void * userData)} */
    @NativeType("XrBool32") int invoke(@NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long messageSeverity, @NativeType("XrDebugUtilsMessageTypeFlagsEXT") long messageTypes, @NativeType("XrDebugUtilsMessengerCallbackDataEXT const *") long callbackData, @NativeType("void *") long userData);

}