/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Type of callback function invoked by the debug utils.
 * 
 * <h5>C Specification</h5>
 * 
 * <pre><code>
 * typedef XrBool32 (XRAPI_PTR *PFN_xrDebugUtilsMessengerCallbackEXT)(
 *             XrDebugUtilsMessageSeverityFlagsEXT              messageSeverity,
 *             XrDebugUtilsMessageTypeFlagsEXT                  messageTypes,
 *             const XrDebugUtilsMessengerCallbackDataEXT*      callbackData,
 *             void*                                            userData);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>The callback <b>must</b> not call {@link EXTDebugUtils#xrDestroyDebugUtilsMessengerEXT DestroyDebugUtilsMessengerEXT}.</p>
 * 
 * <p>The callback returns an {@code XrBool32} that indicates to the calling layer the application’s desire to abort the call. A value of {@link XR10#XR_TRUE TRUE} indicates that the application wants to abort this call. If the application returns {@link XR10#XR_FALSE FALSE}, the function <b>must</b> not be aborted. Applications <b>should</b> always return {@link XR10#XR_FALSE FALSE} so that they see the same behavior with and without validation layers enabled.</p>
 * 
 * <p>If the application returns {@link XR10#XR_TRUE TRUE} from its callback and the OpenXR call being aborted returns an {@code XrResult}, the layer will return {@link XR10#XR_ERROR_VALIDATION_FAILURE ERROR_VALIDATION_FAILURE}.</p>
 * 
 * <p>The object pointed to by {@code callbackData} (and any pointers in it recursively) <b>must</b> be valid during the lifetime of the triggered callback. It <b>may</b> become invalid afterwards.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrDebugUtilsMessengerCreateInfoEXT}, {@link EXTDebugUtils#xrCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT}</p>
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * XrBool32 (*{@link #invoke}) (
 *     XrDebugUtilsMessageSeverityFlagsEXT messageSeverity,
 *     XrDebugUtilsMessageTypeFlagsEXT messageTypes,
 *     XrDebugUtilsMessengerCallbackDataEXT const *callbackData,
 *     void *userData
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("PFN_xrDebugUtilsMessengerCallbackEXT")
public interface XrDebugUtilsMessengerCallbackEXTI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_uint32,
        ffi_type_uint64, ffi_type_uint64, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

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

    /**
     * Type of callback function invoked by the debug utils.
     *
     * @param messageSeverity indicates the single bit value of {@code XrDebugUtilsMessageSeverityFlagsEXT} that triggered this callback.
     * @param messageTypes    indicates the {@code XrDebugUtilsMessageTypeFlagsEXT} specifying which types of event triggered this callback.
     * @param callbackData    contains all the callback related data in the {@link XrDebugUtilsMessengerCallbackDataEXT} structure.
     * @param userData        the user data provided when the {@code XrDebugUtilsMessengerEXT} was created.
     */
    @NativeType("XrBool32") int invoke(@NativeType("XrDebugUtilsMessageSeverityFlagsEXT") long messageSeverity, @NativeType("XrDebugUtilsMessageTypeFlagsEXT") long messageTypes, @NativeType("XrDebugUtilsMessengerCallbackDataEXT const *") long callbackData, @NativeType("void *") long userData);

}