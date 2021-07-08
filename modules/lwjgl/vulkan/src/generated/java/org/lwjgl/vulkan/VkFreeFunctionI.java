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
@FunctionalInterface
@NativeType("PFN_vkFreeFunction")
public interface VkFreeFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
    }

    /**
     * Application-defined memory free function.
     *
     * @param pUserData the value specified for {@link VkAllocationCallbacks}{@code ::pUserData} in the allocator specified by the application.
     * @param pMemory   the allocation to be freed.
     */
    void invoke(@NativeType("void *") long pUserData, @NativeType("void *") long pMemory);

}