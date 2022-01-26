/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Application-defined memory allocation notification function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The type of {@code pfnInternalAllocation} is:</p>
 * 
 * <pre><code>
 * typedef void (VKAPI_PTR *PFN_vkInternalAllocationNotification)(
 *     void*                                       pUserData,
 *     size_t                                      size,
 *     VkInternalAllocationType                    allocationType,
 *     VkSystemAllocationScope                     allocationScope);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>This is a purely informational callback.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAllocationCallbacks}</p>
 */
@FunctionalInterface
@NativeType("PFN_vkInternalAllocationNotification")
public interface VkInternalAllocationNotificationI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE))
        );
    }

    /**
     * Application-defined memory allocation notification function.
     *
     * @param pUserData       the value specified for {@link VkAllocationCallbacks}{@code ::pUserData} in the allocator specified by the application.
     * @param size            the requested size of an allocation.
     * @param allocationType  a {@code VkInternalAllocationType} value specifying the requested type of an allocation.
     * @param allocationScope a {@code VkSystemAllocationScope} value specifying the allocation scope of the lifetime of the allocation, as described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-host-allocation-scope">here</a>.
     */
    void invoke(@NativeType("void *") long pUserData, @NativeType("size_t") long size, @NativeType("VkInternalAllocationType") int allocationType, @NativeType("VkSystemAllocationScope") int allocationScope);

}