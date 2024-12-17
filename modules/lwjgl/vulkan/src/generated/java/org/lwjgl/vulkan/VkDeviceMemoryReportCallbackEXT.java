/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFN_vkDeviceMemoryReportCallbackEXT} */
public abstract class VkDeviceMemoryReportCallbackEXT extends Callback implements VkDeviceMemoryReportCallbackEXTI {

    /**
     * Creates a {@code VkDeviceMemoryReportCallbackEXT} instance from the specified function pointer.
     *
     * @return the new {@code VkDeviceMemoryReportCallbackEXT}
     */
    public static VkDeviceMemoryReportCallbackEXT create(long functionPointer) {
        VkDeviceMemoryReportCallbackEXTI instance = Callback.get(functionPointer);
        return instance instanceof VkDeviceMemoryReportCallbackEXT
            ? (VkDeviceMemoryReportCallbackEXT)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VkDeviceMemoryReportCallbackEXT createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkDeviceMemoryReportCallbackEXT} instance that delegates to the specified {@code VkDeviceMemoryReportCallbackEXTI} instance. */
    public static VkDeviceMemoryReportCallbackEXT create(VkDeviceMemoryReportCallbackEXTI instance) {
        return instance instanceof VkDeviceMemoryReportCallbackEXT
            ? (VkDeviceMemoryReportCallbackEXT)instance
            : new Container(instance.address(), instance);
    }

    protected VkDeviceMemoryReportCallbackEXT() {
        super(CIF);
    }

    VkDeviceMemoryReportCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VkDeviceMemoryReportCallbackEXT {

        private final VkDeviceMemoryReportCallbackEXTI delegate;

        Container(long functionPointer, VkDeviceMemoryReportCallbackEXTI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long pCallbackData, long pUserData) {
            delegate.invoke(pCallbackData, pUserData);
        }

    }

}