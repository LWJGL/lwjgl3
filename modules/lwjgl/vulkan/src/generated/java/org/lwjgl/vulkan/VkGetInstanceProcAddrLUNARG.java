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
public abstract class VkGetInstanceProcAddrLUNARG extends Callback implements VkGetInstanceProcAddrLUNARGI {

    /**
     * Creates a {@code VkGetInstanceProcAddrLUNARG} instance from the specified function pointer.
     *
     * @return the new {@code VkGetInstanceProcAddrLUNARG}
     */
    public static VkGetInstanceProcAddrLUNARG create(long functionPointer) {
        VkGetInstanceProcAddrLUNARGI instance = Callback.get(functionPointer);
        return instance instanceof VkGetInstanceProcAddrLUNARG
            ? (VkGetInstanceProcAddrLUNARG)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static VkGetInstanceProcAddrLUNARG createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code VkGetInstanceProcAddrLUNARG} instance that delegates to the specified {@code VkGetInstanceProcAddrLUNARGI} instance. */
    public static VkGetInstanceProcAddrLUNARG create(VkGetInstanceProcAddrLUNARGI instance) {
        return instance instanceof VkGetInstanceProcAddrLUNARG
            ? (VkGetInstanceProcAddrLUNARG)instance
            : new Container(instance.address(), instance);
    }

    protected VkGetInstanceProcAddrLUNARG() {
        super(CIF);
    }

    VkGetInstanceProcAddrLUNARG(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends VkGetInstanceProcAddrLUNARG {

        private final VkGetInstanceProcAddrLUNARGI delegate;

        Container(long functionPointer, VkGetInstanceProcAddrLUNARGI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long instance, long pName) {
            return delegate.invoke(instance, pName);
        }

    }

}