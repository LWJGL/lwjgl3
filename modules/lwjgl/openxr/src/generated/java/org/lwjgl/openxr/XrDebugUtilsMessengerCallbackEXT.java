/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

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
public abstract class XrDebugUtilsMessengerCallbackEXT extends Callback implements XrDebugUtilsMessengerCallbackEXTI {

    /**
     * Creates a {@code XrDebugUtilsMessengerCallbackEXT} instance from the specified function pointer.
     *
     * @return the new {@code XrDebugUtilsMessengerCallbackEXT}
     */
    public static XrDebugUtilsMessengerCallbackEXT create(long functionPointer) {
        XrDebugUtilsMessengerCallbackEXTI instance = Callback.get(functionPointer);
        return instance instanceof XrDebugUtilsMessengerCallbackEXT
            ? (XrDebugUtilsMessengerCallbackEXT)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static XrDebugUtilsMessengerCallbackEXT createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code XrDebugUtilsMessengerCallbackEXT} instance that delegates to the specified {@code XrDebugUtilsMessengerCallbackEXTI} instance. */
    public static XrDebugUtilsMessengerCallbackEXT create(XrDebugUtilsMessengerCallbackEXTI instance) {
        return instance instanceof XrDebugUtilsMessengerCallbackEXT
            ? (XrDebugUtilsMessengerCallbackEXT)instance
            : new Container(instance.address(), instance);
    }

    protected XrDebugUtilsMessengerCallbackEXT() {
        super(CIF);
    }

    XrDebugUtilsMessengerCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends XrDebugUtilsMessengerCallbackEXT {

        private final XrDebugUtilsMessengerCallbackEXTI delegate;

        Container(long functionPointer, XrDebugUtilsMessengerCallbackEXTI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long messageSeverity, long messageTypes, long callbackData, long userData) {
            return delegate.invoke(messageSeverity, messageTypes, callbackData, userData);
        }

    }

}