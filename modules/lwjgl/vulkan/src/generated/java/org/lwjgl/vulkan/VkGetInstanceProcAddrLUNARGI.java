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
 * Type definition for vkGetInstanceProcAddr.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The type of {@link VkGetInstanceProcAddrLUNARG} is:</p>
 * 
 * <pre><code>
 * typedef PFN_vkVoidFunction (VKAPI_PTR *PFN_vkGetInstanceProcAddrLUNARG)(
 *     VkInstance instance, const char* pName);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>This type is compatible with the type of a pointer to the {@link VK10#vkGetInstanceProcAddr GetInstanceProcAddr} command, but is used only to specify device driver addresses in {@link VkDirectDriverLoadingInfoLUNARG}{@code ::pfnGetInstanceProcAddr}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>This type exists only because of limitations in the XML schema and processing scripts, and its name may change in the future. Ideally we would use the {@code PFN_vkGetInstanceProcAddr} type generated in the {@code vulkan_core.h} header.</p>
 * </div>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDirectDriverLoadingInfoLUNARG}</p>
 */
@FunctionalInterface
@NativeType("PFN_vkGetInstanceProcAddrLUNARG")
public interface VkGetInstanceProcAddrLUNARGI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * Type definition for vkGetInstanceProcAddr.
     *
     * @param instance a {@code VkInstance} handle.
     * @param pName    the name of a Vulkan command.
     */
    @NativeType("PFN_vkVoidFunction") long invoke(@NativeType("VkInstance") long instance, @NativeType("char const *") long pName);

}