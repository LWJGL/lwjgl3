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
 * Application-defined memory allocation function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The type of {@code pfnAllocation} is:</p>
 * 
 * <pre><code>
 * typedef void* (VKAPI_PTR *PFN_vkAllocationFunction)(
 *     void*                                       pUserData,
 *     size_t                                      size,
 *     size_t                                      alignment,
 *     VkSystemAllocationScope                     allocationScope);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code pfnAllocation} is unable to allocate the requested memory, it <b>must</b> return {@code NULL}. If the allocation was successful, it <b>must</b> return a valid pointer to memory allocation containing at least {@code size} bytes, and with the pointer value being a multiple of {@code alignment}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Correct Vulkan operation <b>cannot</b> be assumed if the application does not follow these rules.</p>
 * 
 * <p>For example, {@code pfnAllocation} (or {@code pfnReallocation}) could cause termination of running Vulkan instance(s) on a failed allocation for debugging purposes, either directly or indirectly. In these circumstances, it <b>cannot</b> be assumed that any part of any affected {@code VkInstance} objects are going to operate correctly (even {@link VK10#vkDestroyInstance DestroyInstance}), and the application <b>must</b> ensure it cleans up properly via other means (e.g. process termination).</p>
 * </div>
 * 
 * <p>If {@code pfnAllocation} returns {@code NULL}, and if the implementation is unable to continue correct processing of the current command without the requested allocation, it <b>must</b> treat this as a runtime error, and generate {@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY} at the appropriate time for the command in which the condition was detected, as described in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#fundamentals-errorcodes">Return Codes</a>.</p>
 * 
 * <p>If the implementation is able to continue correct processing of the current command without the requested allocation, then it <b>may</b> do so, and <b>must</b> not generate {@link VK10#VK_ERROR_OUT_OF_HOST_MEMORY ERROR_OUT_OF_HOST_MEMORY} as a result of this failed allocation.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAllocationCallbacks}</p>
 */
@FunctionalInterface
@NativeType("PFN_vkAllocationFunction")
public interface VkAllocationFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * Application-defined memory allocation function.
     *
     * @param pUserData       the value specified for {@link VkAllocationCallbacks}{@code ::pUserData} in the allocator specified by the application.
     * @param size            the size in bytes of the requested allocation.
     * @param alignment       the requested alignment of the allocation in bytes and <b>must</b> be a power of two.
     * @param allocationScope a {@code VkSystemAllocationScope} value specifying the allocation scope of the lifetime of the allocation, as described <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#memory-host-allocation-scope">here</a>.
     */
    @NativeType("void *") long invoke(@NativeType("void *") long pUserData, @NativeType("size_t") long size, @NativeType("size_t") long alignment, @NativeType("VkSystemAllocationScope") int allocationScope);

}