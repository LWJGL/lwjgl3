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
public abstract class VkAllocationFunction extends Callback implements VkAllocationFunctionI {

    /**
     * Creates a {@code VkAllocationFunction} instance from the specified function pointer.
     *
     * @return the new {@code VkAllocationFunction}
     */
    public static VkAllocationFunction create(long functionPointer) {
        VkAllocationFunctionI instance = Callback.get(functionPointer);
        return instance instanceof VkAllocationFunction
            ? (VkAllocationFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static VkAllocationFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkAllocationFunction} instance that delegates to the specified {@code VkAllocationFunctionI} instance. */
    public static VkAllocationFunction create(VkAllocationFunctionI instance) {
        return instance instanceof VkAllocationFunction
            ? (VkAllocationFunction)instance
            : new Container(instance.address(), instance);
    }

    protected VkAllocationFunction() {
        super(CIF);
    }

    VkAllocationFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VkAllocationFunction {

        private final VkAllocationFunctionI delegate;

        Container(long functionPointer, VkAllocationFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long pUserData, long size, long alignment, int allocationScope) {
            return delegate.invoke(pUserData, size, alignment, allocationScope);
        }

    }

}