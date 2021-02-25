/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Application-defined memory free notification function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The type of {@code pfnInternalFree} is:</p>
 * 
 * <pre><code>
 * typedef void (VKAPI_PTR *PFN_vkInternalFreeNotification)(
 *     void*                                       pUserData,
 *     size_t                                      size,
 *     VkInternalAllocationType                    allocationType,
 *     VkSystemAllocationScope                     allocationScope);</code></pre>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAllocationCallbacks}</p>
 */
public abstract class VkInternalFreeNotification extends Callback implements VkInternalFreeNotificationI {

    /**
     * Creates a {@code VkInternalFreeNotification} instance from the specified function pointer.
     *
     * @return the new {@code VkInternalFreeNotification}
     */
    public static VkInternalFreeNotification create(long functionPointer) {
        VkInternalFreeNotificationI instance = Callback.get(functionPointer);
        return instance instanceof VkInternalFreeNotification
            ? (VkInternalFreeNotification)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static VkInternalFreeNotification createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkInternalFreeNotification} instance that delegates to the specified {@code VkInternalFreeNotificationI} instance. */
    public static VkInternalFreeNotification create(VkInternalFreeNotificationI instance) {
        return instance instanceof VkInternalFreeNotification
            ? (VkInternalFreeNotification)instance
            : new Container(instance.address(), instance);
    }

    protected VkInternalFreeNotification() {
        super(CIF);
    }

    VkInternalFreeNotification(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VkInternalFreeNotification {

        private final VkInternalFreeNotificationI delegate;

        Container(long functionPointer, VkInternalFreeNotificationI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long pUserData, long size, int allocationType, int allocationScope) {
            delegate.invoke(pUserData, size, allocationType, allocationScope);
        }

    }

}