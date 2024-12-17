/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFN_vkDebugReportCallbackEXT} */
public abstract class VkDebugReportCallbackEXT extends Callback implements VkDebugReportCallbackEXTI {

    /**
     * Creates a {@code VkDebugReportCallbackEXT} instance from the specified function pointer.
     *
     * @return the new {@code VkDebugReportCallbackEXT}
     */
    public static VkDebugReportCallbackEXT create(long functionPointer) {
        VkDebugReportCallbackEXTI instance = Callback.get(functionPointer);
        return instance instanceof VkDebugReportCallbackEXT
            ? (VkDebugReportCallbackEXT)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VkDebugReportCallbackEXT createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkDebugReportCallbackEXT} instance that delegates to the specified {@code VkDebugReportCallbackEXTI} instance. */
    public static VkDebugReportCallbackEXT create(VkDebugReportCallbackEXTI instance) {
        return instance instanceof VkDebugReportCallbackEXT
            ? (VkDebugReportCallbackEXT)instance
            : new Container(instance.address(), instance);
    }

    protected VkDebugReportCallbackEXT() {
        super(CIF);
    }

    VkDebugReportCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

    /**
     * Converts the specified {@link VkDebugReportCallbackEXT} argument to a String.
     *
     * <p>This method may only be used inside a {@code VkDebugReportCallbackEXT} invocation.</p>
     *
     * @param string the argument to decode
     *
     * @return the message as a String
     */
    public static String getString(long string) {
        return memUTF8(string);
    }

    private static final class Container extends VkDebugReportCallbackEXT {

        private final VkDebugReportCallbackEXTI delegate;

        Container(long functionPointer, VkDebugReportCallbackEXTI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData) {
            return delegate.invoke(flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, pUserData);
        }

    }

}