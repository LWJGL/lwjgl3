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
    public static VkDeviceMemoryReportCallbackEXT create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VkDeviceMemoryReportCallbackEXT createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code VkDeviceMemoryReportCallbackEXT} instance that delegates to the specified {@code VkDeviceMemoryReportCallbackEXTI} instance. */
    public static VkDeviceMemoryReportCallbackEXT create(VkDeviceMemoryReportCallbackEXTI instance) { return create(instance, instance.address()); }

    private static VkDeviceMemoryReportCallbackEXT create(VkDeviceMemoryReportCallbackEXTI instance, long functionPointer) {
        return instance instanceof VkDeviceMemoryReportCallbackEXT
            ? (VkDeviceMemoryReportCallbackEXT)instance
            : new VkDeviceMemoryReportCallbackEXT(functionPointer) {
                @Override public void invoke(long pCallbackData, long pUserData) {
                    instance.invoke(pCallbackData, pUserData);
                }
            };
    }

    protected VkDeviceMemoryReportCallbackEXT() {
        super(DESCRIPTOR);
    }

    VkDeviceMemoryReportCallbackEXT(long functionPointer) {
        super(functionPointer);
    }

}