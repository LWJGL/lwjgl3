/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure containing callback function pointers for memory allocation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pfnAllocation} <b>must</b> be a valid pointer to a valid user-defined {@link VkAllocationFunction}</li>
 * <li>{@code pfnReallocation} <b>must</b> be a valid pointer to a valid user-defined {@link VkReallocationFunction}</li>
 * <li>{@code pfnFree} <b>must</b> be a valid pointer to a valid user-defined {@link VkFreeFunction}</li>
 * <li>If either of {@code pfnInternalAllocation} or {@code pfnInternalFree} is not {@code NULL}, both <b>must</b> be valid callbacks</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAllocationFunction}, {@link VkFreeFunction}, {@link VkInternalAllocationNotification}, {@link VkInternalFreeNotification}, {@link VkReallocationFunction}, {@link VK10#vkAllocateMemory AllocateMemory}, {@link KHRAccelerationStructure#vkCreateAccelerationStructureKHR CreateAccelerationStructureKHR}, {@link NVRayTracing#vkCreateAccelerationStructureNV CreateAccelerationStructureNV}, {@link VK10#vkCreateBuffer CreateBuffer}, {@link VK10#vkCreateBufferView CreateBufferView}, {@link VK10#vkCreateCommandPool CreateCommandPool}, {@link VK10#vkCreateComputePipelines CreateComputePipelines}, {@link NVXBinaryImport#vkCreateCuFunctionNVX CreateCuFunctionNVX}, {@link NVXBinaryImport#vkCreateCuModuleNVX CreateCuModuleNVX}, {@link EXTDebugReport#vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT}, {@link EXTDebugUtils#vkCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT}, {@link KHRDeferredHostOperations#vkCreateDeferredOperationKHR CreateDeferredOperationKHR}, {@link VK10#vkCreateDescriptorPool CreateDescriptorPool}, {@link VK10#vkCreateDescriptorSetLayout CreateDescriptorSetLayout}, {@link VK11#vkCreateDescriptorUpdateTemplate CreateDescriptorUpdateTemplate}, {@link KHRDescriptorUpdateTemplate#vkCreateDescriptorUpdateTemplateKHR CreateDescriptorUpdateTemplateKHR}, {@link VK10#vkCreateDevice CreateDevice}, {@link KHRDisplay#vkCreateDisplayModeKHR CreateDisplayModeKHR}, {@link KHRDisplay#vkCreateDisplayPlaneSurfaceKHR CreateDisplayPlaneSurfaceKHR}, {@link VK10#vkCreateEvent CreateEvent}, {@link VK10#vkCreateFence CreateFence}, {@link VK10#vkCreateFramebuffer CreateFramebuffer}, {@link VK10#vkCreateGraphicsPipelines CreateGraphicsPipelines}, {@link EXTHeadlessSurface#vkCreateHeadlessSurfaceEXT CreateHeadlessSurfaceEXT}, {@link VK10#vkCreateImage CreateImage}, {@link VK10#vkCreateImageView CreateImageView}, {@link NVDeviceGeneratedCommands#vkCreateIndirectCommandsLayoutNV CreateIndirectCommandsLayoutNV}, {@link VK10#vkCreateInstance CreateInstance}, {@link MVKMacosSurface#vkCreateMacOSSurfaceMVK CreateMacOSSurfaceMVK}, {@link EXTMetalSurface#vkCreateMetalSurfaceEXT CreateMetalSurfaceEXT}, {@link VK10#vkCreatePipelineCache CreatePipelineCache}, {@link VK10#vkCreatePipelineLayout CreatePipelineLayout}, {@link VK13#vkCreatePrivateDataSlot CreatePrivateDataSlot}, {@link EXTPrivateData#vkCreatePrivateDataSlotEXT CreatePrivateDataSlotEXT}, {@link VK10#vkCreateQueryPool CreateQueryPool}, {@link KHRRayTracingPipeline#vkCreateRayTracingPipelinesKHR CreateRayTracingPipelinesKHR}, {@link NVRayTracing#vkCreateRayTracingPipelinesNV CreateRayTracingPipelinesNV}, {@link VK10#vkCreateRenderPass CreateRenderPass}, {@link VK12#vkCreateRenderPass2 CreateRenderPass2}, {@link KHRCreateRenderpass2#vkCreateRenderPass2KHR CreateRenderPass2KHR}, {@link VK10#vkCreateSampler CreateSampler}, {@link VK11#vkCreateSamplerYcbcrConversion CreateSamplerYcbcrConversion}, {@link KHRSamplerYcbcrConversion#vkCreateSamplerYcbcrConversionKHR CreateSamplerYcbcrConversionKHR}, {@link VK10#vkCreateSemaphore CreateSemaphore}, {@link VK10#vkCreateShaderModule CreateShaderModule}, {@link KHRDisplaySwapchain#vkCreateSharedSwapchainsKHR CreateSharedSwapchainsKHR}, {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}, {@link EXTValidationCache#vkCreateValidationCacheEXT CreateValidationCacheEXT}, {@link KHRVideoQueue#vkCreateVideoSessionKHR CreateVideoSessionKHR}, {@link KHRVideoQueue#vkCreateVideoSessionParametersKHR CreateVideoSessionParametersKHR}, {@link KHRWaylandSurface#vkCreateWaylandSurfaceKHR CreateWaylandSurfaceKHR}, {@link KHRWin32Surface#vkCreateWin32SurfaceKHR CreateWin32SurfaceKHR}, {@link KHRXlibSurface#vkCreateXlibSurfaceKHR CreateXlibSurfaceKHR}, {@link KHRAccelerationStructure#vkDestroyAccelerationStructureKHR DestroyAccelerationStructureKHR}, {@link NVRayTracing#vkDestroyAccelerationStructureNV DestroyAccelerationStructureNV}, {@link VK10#vkDestroyBuffer DestroyBuffer}, {@link VK10#vkDestroyBufferView DestroyBufferView}, {@link VK10#vkDestroyCommandPool DestroyCommandPool}, {@link NVXBinaryImport#vkDestroyCuFunctionNVX DestroyCuFunctionNVX}, {@link NVXBinaryImport#vkDestroyCuModuleNVX DestroyCuModuleNVX}, {@link EXTDebugReport#vkDestroyDebugReportCallbackEXT DestroyDebugReportCallbackEXT}, {@link EXTDebugUtils#vkDestroyDebugUtilsMessengerEXT DestroyDebugUtilsMessengerEXT}, {@link KHRDeferredHostOperations#vkDestroyDeferredOperationKHR DestroyDeferredOperationKHR}, {@link VK10#vkDestroyDescriptorPool DestroyDescriptorPool}, {@link VK10#vkDestroyDescriptorSetLayout DestroyDescriptorSetLayout}, {@link VK11#vkDestroyDescriptorUpdateTemplate DestroyDescriptorUpdateTemplate}, {@link KHRDescriptorUpdateTemplate#vkDestroyDescriptorUpdateTemplateKHR DestroyDescriptorUpdateTemplateKHR}, {@link VK10#vkDestroyDevice DestroyDevice}, {@link VK10#vkDestroyEvent DestroyEvent}, {@link VK10#vkDestroyFence DestroyFence}, {@link VK10#vkDestroyFramebuffer DestroyFramebuffer}, {@link VK10#vkDestroyImage DestroyImage}, {@link VK10#vkDestroyImageView DestroyImageView}, {@link NVDeviceGeneratedCommands#vkDestroyIndirectCommandsLayoutNV DestroyIndirectCommandsLayoutNV}, {@link VK10#vkDestroyInstance DestroyInstance}, {@link VK10#vkDestroyPipeline DestroyPipeline}, {@link VK10#vkDestroyPipelineCache DestroyPipelineCache}, {@link VK10#vkDestroyPipelineLayout DestroyPipelineLayout}, {@link VK13#vkDestroyPrivateDataSlot DestroyPrivateDataSlot}, {@link EXTPrivateData#vkDestroyPrivateDataSlotEXT DestroyPrivateDataSlotEXT}, {@link VK10#vkDestroyQueryPool DestroyQueryPool}, {@link VK10#vkDestroyRenderPass DestroyRenderPass}, {@link VK10#vkDestroySampler DestroySampler}, {@link VK11#vkDestroySamplerYcbcrConversion DestroySamplerYcbcrConversion}, {@link KHRSamplerYcbcrConversion#vkDestroySamplerYcbcrConversionKHR DestroySamplerYcbcrConversionKHR}, {@link VK10#vkDestroySemaphore DestroySemaphore}, {@link VK10#vkDestroyShaderModule DestroyShaderModule}, {@link KHRSurface#vkDestroySurfaceKHR DestroySurfaceKHR}, {@link KHRSwapchain#vkDestroySwapchainKHR DestroySwapchainKHR}, {@link EXTValidationCache#vkDestroyValidationCacheEXT DestroyValidationCacheEXT}, {@link KHRVideoQueue#vkDestroyVideoSessionKHR DestroyVideoSessionKHR}, {@link KHRVideoQueue#vkDestroyVideoSessionParametersKHR DestroyVideoSessionParametersKHR}, {@link VK10#vkFreeMemory FreeMemory}, {@link EXTDisplayControl#vkRegisterDeviceEventEXT RegisterDeviceEventEXT}, {@link EXTDisplayControl#vkRegisterDisplayEventEXT RegisterDisplayEventEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkAllocationCallbacks {
 *     void * {@link #pUserData};
 *     {@link VkAllocationFunctionI PFN_vkAllocationFunction} {@link #pfnAllocation};
 *     {@link VkReallocationFunctionI PFN_vkReallocationFunction} {@link #pfnReallocation};
 *     {@link VkFreeFunctionI PFN_vkFreeFunction} {@link #pfnFree};
 *     {@link VkInternalAllocationNotificationI PFN_vkInternalAllocationNotification} {@link #pfnInternalAllocation};
 *     {@link VkInternalFreeNotificationI PFN_vkInternalFreeNotification} {@link #pfnInternalFree};
 * }</code></pre>
 */
public class VkAllocationCallbacks extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PUSERDATA,
        PFNALLOCATION,
        PFNREALLOCATION,
        PFNFREE,
        PFNINTERNALALLOCATION,
        PFNINTERNALFREE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PUSERDATA = layout.offsetof(0);
        PFNALLOCATION = layout.offsetof(1);
        PFNREALLOCATION = layout.offsetof(2);
        PFNFREE = layout.offsetof(3);
        PFNINTERNALALLOCATION = layout.offsetof(4);
        PFNINTERNALFREE = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkAllocationCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAllocationCallbacks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a value to be interpreted by the implementation of the callbacks. When any of the callbacks in {@link VkAllocationCallbacks} are called, the Vulkan implementation will pass this value as the first parameter to the callback. This value <b>can</b> vary each time an allocator is passed into a command, even when the same object takes an allocator in multiple commands. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }
    /** a {@link VkAllocationFunction} pointer to an application-defined memory allocation function. */
    @Nullable
    @NativeType("PFN_vkAllocationFunction")
    public VkAllocationFunction pfnAllocation() { return npfnAllocation(address()); }
    /** a {@link VkReallocationFunction} pointer to an application-defined memory reallocation function. */
    @Nullable
    @NativeType("PFN_vkReallocationFunction")
    public VkReallocationFunction pfnReallocation() { return npfnReallocation(address()); }
    /** a {@link VkFreeFunction} pointer to an application-defined memory free function. */
    @Nullable
    @NativeType("PFN_vkFreeFunction")
    public VkFreeFunction pfnFree() { return npfnFree(address()); }
    /** a {@link VkInternalAllocationNotification} pointer to an application-defined function that is called by the implementation when the implementation makes internal allocations. */
    @Nullable
    @NativeType("PFN_vkInternalAllocationNotification")
    public VkInternalAllocationNotification pfnInternalAllocation() { return npfnInternalAllocation(address()); }
    /** a {@link VkInternalFreeNotification} pointer to an application-defined function that is called by the implementation when the implementation frees internal allocations. */
    @Nullable
    @NativeType("PFN_vkInternalFreeNotification")
    public VkInternalFreeNotification pfnInternalFree() { return npfnInternalFree(address()); }

    /** Sets the specified value to the {@link #pUserData} field. */
    public VkAllocationCallbacks pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }
    /** Sets the specified value to the {@link #pfnAllocation} field. */
    public VkAllocationCallbacks pfnAllocation(@Nullable @NativeType("PFN_vkAllocationFunction") VkAllocationFunctionI value) { npfnAllocation(address(), value); return this; }
    /** Sets the specified value to the {@link #pfnReallocation} field. */
    public VkAllocationCallbacks pfnReallocation(@Nullable @NativeType("PFN_vkReallocationFunction") VkReallocationFunctionI value) { npfnReallocation(address(), value); return this; }
    /** Sets the specified value to the {@link #pfnFree} field. */
    public VkAllocationCallbacks pfnFree(@Nullable @NativeType("PFN_vkFreeFunction") VkFreeFunctionI value) { npfnFree(address(), value); return this; }
    /** Sets the specified value to the {@link #pfnInternalAllocation} field. */
    public VkAllocationCallbacks pfnInternalAllocation(@Nullable @NativeType("PFN_vkInternalAllocationNotification") VkInternalAllocationNotificationI value) { npfnInternalAllocation(address(), value); return this; }
    /** Sets the specified value to the {@link #pfnInternalFree} field. */
    public VkAllocationCallbacks pfnInternalFree(@Nullable @NativeType("PFN_vkInternalFreeNotification") VkInternalFreeNotificationI value) { npfnInternalFree(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAllocationCallbacks set(
        long pUserData,
        VkAllocationFunctionI pfnAllocation,
        VkReallocationFunctionI pfnReallocation,
        VkFreeFunctionI pfnFree,
        VkInternalAllocationNotificationI pfnInternalAllocation,
        VkInternalFreeNotificationI pfnInternalFree
    ) {
        pUserData(pUserData);
        pfnAllocation(pfnAllocation);
        pfnReallocation(pfnReallocation);
        pfnFree(pfnFree);
        pfnInternalAllocation(pfnInternalAllocation);
        pfnInternalFree(pfnInternalFree);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAllocationCallbacks set(VkAllocationCallbacks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkAllocationCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAllocationCallbacks malloc() {
        return wrap(VkAllocationCallbacks.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkAllocationCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAllocationCallbacks calloc() {
        return wrap(VkAllocationCallbacks.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkAllocationCallbacks} instance allocated with {@link BufferUtils}. */
    public static VkAllocationCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkAllocationCallbacks.class, memAddress(container), container);
    }

    /** Returns a new {@code VkAllocationCallbacks} instance for the specified memory address. */
    public static VkAllocationCallbacks create(long address) {
        return wrap(VkAllocationCallbacks.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAllocationCallbacks createSafe(long address) {
        return address == NULL ? null : wrap(VkAllocationCallbacks.class, address);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkAllocationCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAllocationCallbacks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkAllocationCallbacks.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkAllocationCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAllocationCallbacks malloc(MemoryStack stack) {
        return wrap(VkAllocationCallbacks.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkAllocationCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAllocationCallbacks calloc(MemoryStack stack) {
        return wrap(VkAllocationCallbacks.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PUSERDATA); }
    /** Unsafe version of {@link #pfnAllocation}. */
    @Nullable public static VkAllocationFunction npfnAllocation(long struct) { return VkAllocationFunction.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNALLOCATION)); }
    /** Unsafe version of {@link #pfnReallocation}. */
    @Nullable public static VkReallocationFunction npfnReallocation(long struct) { return VkReallocationFunction.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNREALLOCATION)); }
    /** Unsafe version of {@link #pfnFree}. */
    @Nullable public static VkFreeFunction npfnFree(long struct) { return VkFreeFunction.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNFREE)); }
    /** Unsafe version of {@link #pfnInternalAllocation}. */
    @Nullable public static VkInternalAllocationNotification npfnInternalAllocation(long struct) { return VkInternalAllocationNotification.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNINTERNALALLOCATION)); }
    /** Unsafe version of {@link #pfnInternalFree}. */
    @Nullable public static VkInternalFreeNotification npfnInternalFree(long struct) { return VkInternalFreeNotification.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNINTERNALFREE)); }

    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PUSERDATA, value); }
    /** Unsafe version of {@link #pfnAllocation(VkAllocationFunctionI) pfnAllocation}. */
    public static void npfnAllocation(long struct, @Nullable VkAllocationFunctionI value) { memPutAddress(struct + VkAllocationCallbacks.PFNALLOCATION, memAddressSafe(value)); }
    /** Unsafe version of {@link #pfnReallocation(VkReallocationFunctionI) pfnReallocation}. */
    public static void npfnReallocation(long struct, @Nullable VkReallocationFunctionI value) { memPutAddress(struct + VkAllocationCallbacks.PFNREALLOCATION, memAddressSafe(value)); }
    /** Unsafe version of {@link #pfnFree(VkFreeFunctionI) pfnFree}. */
    public static void npfnFree(long struct, @Nullable VkFreeFunctionI value) { memPutAddress(struct + VkAllocationCallbacks.PFNFREE, memAddressSafe(value)); }
    /** Unsafe version of {@link #pfnInternalAllocation(VkInternalAllocationNotificationI) pfnInternalAllocation}. */
    public static void npfnInternalAllocation(long struct, @Nullable VkInternalAllocationNotificationI value) { memPutAddress(struct + VkAllocationCallbacks.PFNINTERNALALLOCATION, memAddressSafe(value)); }
    /** Unsafe version of {@link #pfnInternalFree(VkInternalFreeNotificationI) pfnInternalFree}. */
    public static void npfnInternalFree(long struct, @Nullable VkInternalFreeNotificationI value) { memPutAddress(struct + VkAllocationCallbacks.PFNINTERNALFREE, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link VkAllocationCallbacks} structs. */
    public static class Buffer extends StructBuffer<VkAllocationCallbacks, Buffer> implements NativeResource {

        private static final VkAllocationCallbacks ELEMENT_FACTORY = VkAllocationCallbacks.create(-1L);

        /**
         * Creates a new {@code VkAllocationCallbacks.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAllocationCallbacks#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected VkAllocationCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkAllocationCallbacks#pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VkAllocationCallbacks.npUserData(address()); }
        /** @return the value of the {@link VkAllocationCallbacks#pfnAllocation} field. */
        @Nullable
        @NativeType("PFN_vkAllocationFunction")
        public VkAllocationFunction pfnAllocation() { return VkAllocationCallbacks.npfnAllocation(address()); }
        /** @return the value of the {@link VkAllocationCallbacks#pfnReallocation} field. */
        @Nullable
        @NativeType("PFN_vkReallocationFunction")
        public VkReallocationFunction pfnReallocation() { return VkAllocationCallbacks.npfnReallocation(address()); }
        /** @return the value of the {@link VkAllocationCallbacks#pfnFree} field. */
        @Nullable
        @NativeType("PFN_vkFreeFunction")
        public VkFreeFunction pfnFree() { return VkAllocationCallbacks.npfnFree(address()); }
        /** @return the value of the {@link VkAllocationCallbacks#pfnInternalAllocation} field. */
        @Nullable
        @NativeType("PFN_vkInternalAllocationNotification")
        public VkInternalAllocationNotification pfnInternalAllocation() { return VkAllocationCallbacks.npfnInternalAllocation(address()); }
        /** @return the value of the {@link VkAllocationCallbacks#pfnInternalFree} field. */
        @Nullable
        @NativeType("PFN_vkInternalFreeNotification")
        public VkInternalFreeNotification pfnInternalFree() { return VkAllocationCallbacks.npfnInternalFree(address()); }

        /** Sets the specified value to the {@link VkAllocationCallbacks#pUserData} field. */
        public VkAllocationCallbacks.Buffer pUserData(@NativeType("void *") long value) { VkAllocationCallbacks.npUserData(address(), value); return this; }
        /** Sets the specified value to the {@link VkAllocationCallbacks#pfnAllocation} field. */
        public VkAllocationCallbacks.Buffer pfnAllocation(@Nullable @NativeType("PFN_vkAllocationFunction") VkAllocationFunctionI value) { VkAllocationCallbacks.npfnAllocation(address(), value); return this; }
        /** Sets the specified value to the {@link VkAllocationCallbacks#pfnReallocation} field. */
        public VkAllocationCallbacks.Buffer pfnReallocation(@Nullable @NativeType("PFN_vkReallocationFunction") VkReallocationFunctionI value) { VkAllocationCallbacks.npfnReallocation(address(), value); return this; }
        /** Sets the specified value to the {@link VkAllocationCallbacks#pfnFree} field. */
        public VkAllocationCallbacks.Buffer pfnFree(@Nullable @NativeType("PFN_vkFreeFunction") VkFreeFunctionI value) { VkAllocationCallbacks.npfnFree(address(), value); return this; }
        /** Sets the specified value to the {@link VkAllocationCallbacks#pfnInternalAllocation} field. */
        public VkAllocationCallbacks.Buffer pfnInternalAllocation(@Nullable @NativeType("PFN_vkInternalAllocationNotification") VkInternalAllocationNotificationI value) { VkAllocationCallbacks.npfnInternalAllocation(address(), value); return this; }
        /** Sets the specified value to the {@link VkAllocationCallbacks#pfnInternalFree} field. */
        public VkAllocationCallbacks.Buffer pfnInternalFree(@Nullable @NativeType("PFN_vkInternalFreeNotification") VkInternalFreeNotificationI value) { VkAllocationCallbacks.npfnInternalFree(address(), value); return this; }

    }

}