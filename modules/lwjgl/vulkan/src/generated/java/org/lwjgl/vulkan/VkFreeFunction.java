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
 * Application-defined memory free function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The type of {@code pfnFree} is:</p>
 * 
 * <pre><code>
 * typedef void (VKAPI_PTR *PFN_vkFreeFunction)(
 *     void*                                       pUserData,
 *     void*                                       pMemory);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>{@code pMemory} <b>may</b> be {@code NULL}, which the callback <b>must</b> handle safely. If {@code pMemory} is non-{@code NULL}, it <b>must</b> be a pointer previously allocated by {@code pfnAllocation} or {@code pfnReallocation}. The application <b>should</b> free this memory.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAllocationCallbacks}</p>
 */
public abstract class VkFreeFunction extends Callback implements VkFreeFunctionI {

    /**
     * Creates a {@code VkFreeFunction} instance from the specified function pointer.
     *
     * @return the new {@code VkFreeFunction}
     */
    public static VkFreeFunction create(long functionPointer) {
        VkFreeFunctionI instance = Callback.get(functionPointer);
        return instance instanceof VkFreeFunction
            ? (VkFreeFunction)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static VkFreeFunction createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkFreeFunction} instance that delegates to the specified {@code VkFreeFunctionI} instance. */
    public static VkFreeFunction create(VkFreeFunctionI instance) {
        return instance instanceof VkFreeFunction
            ? (VkFreeFunction)instance
            : new Container(instance.address(), instance);
    }

    protected VkFreeFunction() {
        super(CIF);
    }

    VkFreeFunction(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VkFreeFunction {

        private final VkFreeFunctionI delegate;

        Container(long functionPointer, VkFreeFunctionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long pUserData, long pMemory) {
            delegate.invoke(pUserData, pMemory);
        }

    }

}