/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke PFN_vkInternalAllocationNotification} */
public abstract class VkInternalAllocationNotification extends Callback implements VkInternalAllocationNotificationI {

    /**
     * Creates a {@code VkInternalAllocationNotification} instance from the specified function pointer.
     *
     * @return the new {@code VkInternalAllocationNotification}
     */
    public static VkInternalAllocationNotification create(long functionPointer) {
        VkInternalAllocationNotificationI instance = Callback.get(functionPointer);
        return instance instanceof VkInternalAllocationNotification
            ? (VkInternalAllocationNotification)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable VkInternalAllocationNotification createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkInternalAllocationNotification} instance that delegates to the specified {@code VkInternalAllocationNotificationI} instance. */
    public static VkInternalAllocationNotification create(VkInternalAllocationNotificationI instance) {
        return instance instanceof VkInternalAllocationNotification
            ? (VkInternalAllocationNotification)instance
            : new Container(instance.address(), instance);
    }

    protected VkInternalAllocationNotification() {
        super(CIF);
    }

    VkInternalAllocationNotification(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VkInternalAllocationNotification {

        private final VkInternalAllocationNotificationI delegate;

        Container(long functionPointer, VkInternalAllocationNotificationI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long pUserData, long size, int allocationType, int allocationScope) {
            delegate.invoke(pUserData, size, allocationType, allocationScope);
        }

    }

}