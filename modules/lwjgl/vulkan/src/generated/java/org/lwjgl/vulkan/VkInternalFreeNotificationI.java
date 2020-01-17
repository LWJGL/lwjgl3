/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

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
@FunctionalInterface
@NativeType("PFN_vkInternalFreeNotification")
public interface VkInternalFreeNotificationI extends CallbackI.V {

    String SIGNATURE = Callback.__stdcall("(ppii)v");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgInt(args)
        );
    }

    /**
     * Application-defined memory free notification function.
     *
     * @param pUserData       the value specified for {@link VkAllocationCallbacks}{@code ::pUserData} in the allocator specified by the application.
     * @param size            the requested size of an allocation.
     * @param allocationType  a {@code VkInternalAllocationType} value specifying the requested type of an allocation.
     * @param allocationScope a {@code VkSystemAllocationScope} value specifying the allocation scope of the lifetime of the allocation, as described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#memory-host-allocation-scope">here</a>.
     */
    void invoke(@NativeType("void *") long pUserData, @NativeType("size_t") long size, @NativeType("VkInternalAllocationType") int allocationType, @NativeType("VkSystemAllocationScope") int allocationScope);

}