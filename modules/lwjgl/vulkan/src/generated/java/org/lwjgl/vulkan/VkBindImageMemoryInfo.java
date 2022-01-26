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
 * Structure specifying how to bind an image to memory.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code image} <b>must</b> not already be backed by a memory object</li>
 * <li>{@code image} <b>must</b> not have been created with any sparse memory binding flags</li>
 * <li>{@code memoryOffset} <b>must</b> be less than the size of {@code memory}</li>
 * <li>If {@code image} requires a dedicated allocation (as reported by {@link VK11#vkGetImageMemoryRequirements2 GetImageMemoryRequirements2} in {@link VkMemoryDedicatedRequirements}{@code ::requiresDedicatedAllocation} for {@code image}), {@code memory} <b>must</b> have been created with {@link VkMemoryDedicatedAllocateInfo}{@code ::image} equal to {@code image}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-dedicatedAllocationImageAliasing">dedicated allocation image aliasing</a> feature is not enabled, and the {@link VkMemoryAllocateInfo} provided when {@code memory} was allocated included a {@link VkMemoryDedicatedAllocateInfo} structure in its {@code pNext} chain, and {@link VkMemoryDedicatedAllocateInfo}{@code ::image} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then {@code image} <b>must</b> equal {@link VkMemoryDedicatedAllocateInfo}{@code ::image} and {@code memoryOffset} <b>must</b> be zero</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-dedicatedAllocationImageAliasing">dedicated allocation image aliasing</a> feature is enabled, and the {@link VkMemoryAllocateInfo} provided when {@code memory} was allocated included a {@link VkMemoryDedicatedAllocateInfo} structure in its {@code pNext} chain, and {@link VkMemoryDedicatedAllocateInfo}{@code ::image} was not {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, then {@code memoryOffset} <b>must</b> be zero, and {@code image} <b>must</b> be either equal to {@link VkMemoryDedicatedAllocateInfo}{@code ::image} or an image that was created using the same parameters in {@link VkImageCreateInfo}, with the exception that {@code extent} and {@code arrayLayers} <b>may</b> differ subject to the following restrictions: every dimension in the {@code extent} parameter of the image being bound <b>must</b> be equal to or smaller than the original image for which the allocation was created; and the {@code arrayLayers} parameter of the image being bound <b>must</b> be equal to or smaller than the original image for which the allocation was created</li>
 * <li>If image was created with the {@link VK11#VK_IMAGE_CREATE_PROTECTED_BIT IMAGE_CREATE_PROTECTED_BIT} bit set, the image <b>must</b> be bound to a memory object allocated with a memory type that reports {@link VK11#VK_MEMORY_PROPERTY_PROTECTED_BIT MEMORY_PROPERTY_PROTECTED_BIT}</li>
 * <li>If image was created with the {@link VK11#VK_IMAGE_CREATE_PROTECTED_BIT IMAGE_CREATE_PROTECTED_BIT} bit not set, the image <b>must</b> not be bound to a memory object created with a memory type that reports {@link VK11#VK_MEMORY_PROPERTY_PROTECTED_BIT MEMORY_PROPERTY_PROTECTED_BIT}</li>
 * <li>If {@code image} was created with {@link VkDedicatedAllocationImageCreateInfoNV}{@code ::dedicatedAllocation} equal to {@link VK10#VK_TRUE TRUE}, {@code memory} <b>must</b> have been created with {@link VkDedicatedAllocationMemoryAllocateInfoNV}{@code ::image} equal to an image handle created with identical creation parameters to {@code image} and {@code memoryOffset} <b>must</b> be zero</li>
 * <li>If the value of {@link VkExportMemoryAllocateInfo}{@code ::handleTypes} used to allocate {@code memory} is not 0, it <b>must</b> include at least one of the handles set in {@link VkExternalMemoryImageCreateInfo}{@code ::handleTypes} when {@code image} was created</li>
 * <li>If {@code memory} was created by a memory import operation, the external handle type of the imported memory <b>must</b> also have been set in {@link VkExternalMemoryImageCreateInfo}{@code ::handleTypes} when {@code image} was created</li>
 * <li>If the {@code pNext} chain does not include a {@link VkBindImagePlaneMemoryInfo} structure, {@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the {@link VkMemoryRequirements} structure returned from a call to {@link VK11#vkGetImageMemoryRequirements2 GetImageMemoryRequirements2} with {@code image}</li>
 * <li>If the {@code pNext} chain does not include a {@link VkBindImagePlaneMemoryInfo} structure, {@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the {@link VkMemoryRequirements} structure returned from a call to {@link VK11#vkGetImageMemoryRequirements2 GetImageMemoryRequirements2} with {@code image}</li>
 * <li>If the {@code pNext} chain does not include a {@link VkBindImagePlaneMemoryInfo} structure, the difference of the size of {@code memory} and {@code memoryOffset} <b>must</b> be greater than or equal to the {@code size} member of the {@link VkMemoryRequirements} structure returned from a call to {@link VK11#vkGetImageMemoryRequirements2 GetImageMemoryRequirements2} with the same {@code image}</li>
 * <li>If the {@code pNext} chain includes a {@link VkBindImagePlaneMemoryInfo} structure, {@code image} <b>must</b> have been created with the {@link VK11#VK_IMAGE_CREATE_DISJOINT_BIT IMAGE_CREATE_DISJOINT_BIT} bit set</li>
 * <li>If the {@code pNext} chain includes a {@link VkBindImagePlaneMemoryInfo} structure, {@code memory} <b>must</b> have been allocated using one of the memory types allowed in the {@code memoryTypeBits} member of the {@link VkMemoryRequirements} structure returned from a call to {@link VK11#vkGetImageMemoryRequirements2 GetImageMemoryRequirements2} with {@code image} and where {@link VkBindImagePlaneMemoryInfo}{@code ::planeAspect} corresponds to the {@link VkImagePlaneMemoryRequirementsInfo}{@code ::planeAspect} in the {@link VkImageMemoryRequirementsInfo2} structure’s {@code pNext} chain</li>
 * <li>If the {@code pNext} chain includes a {@link VkBindImagePlaneMemoryInfo} structure, {@code memoryOffset} <b>must</b> be an integer multiple of the {@code alignment} member of the {@link VkMemoryRequirements} structure returned from a call to {@link VK11#vkGetImageMemoryRequirements2 GetImageMemoryRequirements2} with {@code image} and where {@link VkBindImagePlaneMemoryInfo}{@code ::planeAspect} corresponds to the {@link VkImagePlaneMemoryRequirementsInfo}{@code ::planeAspect} in the {@link VkImageMemoryRequirementsInfo2} structure’s {@code pNext} chain</li>
 * <li>If the {@code pNext} chain includes a {@link VkBindImagePlaneMemoryInfo} structure, the difference of the size of {@code memory} and {@code memoryOffset} <b>must</b> be greater than or equal to the {@code size} member of the {@link VkMemoryRequirements} structure returned from a call to {@link VK11#vkGetImageMemoryRequirements2 GetImageMemoryRequirements2} with the same {@code image} and where {@link VkBindImagePlaneMemoryInfo}{@code ::planeAspect} corresponds to the {@link VkImagePlaneMemoryRequirementsInfo}{@code ::planeAspect} in the {@link VkImageMemoryRequirementsInfo2} structure’s {@code pNext} chain</li>
 * <li>If the {@code pNext} chain includes a {@link VkBindImageMemoryDeviceGroupInfo} structure, all instances of {@code memory} specified by {@link VkBindImageMemoryDeviceGroupInfo}{@code ::pDeviceIndices} <b>must</b> have been allocated</li>
 * <li>If the {@code pNext} chain includes a {@link VkBindImageMemoryDeviceGroupInfo} structure, and {@link VkBindImageMemoryDeviceGroupInfo}{@code ::splitInstanceBindRegionCount} is not zero, then {@code image} <b>must</b> have been created with the {@link VK11#VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT} bit set</li>
 * <li>If the {@code pNext} chain includes a {@link VkBindImageMemoryDeviceGroupInfo} structure, all elements of {@link VkBindImageMemoryDeviceGroupInfo}{@code ::pSplitInstanceBindRegions} <b>must</b> be valid rectangles contained within the dimensions of {@code image}</li>
 * <li>If the {@code pNext} chain includes a {@link VkBindImageMemoryDeviceGroupInfo} structure, the union of the areas of all elements of {@link VkBindImageMemoryDeviceGroupInfo}{@code ::pSplitInstanceBindRegions} that correspond to the same instance of {@code image} <b>must</b> cover the entire image</li>
 * <li>If {@code image} was created with a valid swapchain handle in {@link VkImageSwapchainCreateInfoKHR}{@code ::swapchain}, then the {@code pNext} chain <b>must</b> include a {@link VkBindImageMemorySwapchainInfoKHR} structure containing the same swapchain handle</li>
 * <li>If the {@code pNext} chain includes a {@link VkBindImageMemorySwapchainInfoKHR} structure, {@code memory} <b>must</b> be {@link VK10#VK_NULL_HANDLE NULL_HANDLE}</li>
 * <li>If the {@code pNext} chain does not include a {@link VkBindImageMemorySwapchainInfoKHR} structure, {@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkBindImageMemoryDeviceGroupInfo}, {@link VkBindImageMemorySwapchainInfoKHR}, or {@link VkBindImagePlaneMemoryInfo}</li>
 * <li>The {@code sType} value of each struct in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>Both of {@code image}, and {@code memory} that are valid handles of non-ignored parameters <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK11#vkBindImageMemory2 BindImageMemory2}, {@link KHRBindMemory2#vkBindImageMemory2KHR BindImageMemory2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBindImageMemoryInfo {
 *     VkStructureType {@link #sType};
 *     void const * {@link #pNext};
 *     VkImage {@link #image};
 *     VkDeviceMemory {@link #memory};
 *     VkDeviceSize {@link #memoryOffset};
 * }</code></pre>
 */
public class VkBindImageMemoryInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        IMAGE,
        MEMORY,
        MEMORYOFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        IMAGE = layout.offsetof(2);
        MEMORY = layout.offsetof(3);
        MEMORYOFFSET = layout.offsetof(4);
    }

    /**
     * Creates a {@code VkBindImageMemoryInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBindImageMemoryInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** the image to be attached to memory. */
    @NativeType("VkImage")
    public long image() { return nimage(address()); }
    /** a {@code VkDeviceMemory} object describing the device memory to attach. */
    @NativeType("VkDeviceMemory")
    public long memory() { return nmemory(address()); }
    /** the start offset of the region of {@code memory} which is to be bound to the image. The number of bytes returned in the {@link VkMemoryRequirements}{@code ::size} member in {@code memory}, starting from {@code memoryOffset} bytes, will be bound to the specified image. */
    @NativeType("VkDeviceSize")
    public long memoryOffset() { return nmemoryOffset(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkBindImageMemoryInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO} value to the {@link #sType} field. */
    public VkBindImageMemoryInfo sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkBindImageMemoryInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkBindImageMemoryDeviceGroupInfo} value to the {@code pNext} chain. */
    public VkBindImageMemoryInfo pNext(VkBindImageMemoryDeviceGroupInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkBindImageMemoryDeviceGroupInfoKHR} value to the {@code pNext} chain. */
    public VkBindImageMemoryInfo pNext(VkBindImageMemoryDeviceGroupInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkBindImageMemorySwapchainInfoKHR} value to the {@code pNext} chain. */
    public VkBindImageMemoryInfo pNext(VkBindImageMemorySwapchainInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkBindImagePlaneMemoryInfo} value to the {@code pNext} chain. */
    public VkBindImageMemoryInfo pNext(VkBindImagePlaneMemoryInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Prepends the specified {@link VkBindImagePlaneMemoryInfoKHR} value to the {@code pNext} chain. */
    public VkBindImageMemoryInfo pNext(VkBindImagePlaneMemoryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
    /** Sets the specified value to the {@link #image} field. */
    public VkBindImageMemoryInfo image(@NativeType("VkImage") long value) { nimage(address(), value); return this; }
    /** Sets the specified value to the {@link #memory} field. */
    public VkBindImageMemoryInfo memory(@NativeType("VkDeviceMemory") long value) { nmemory(address(), value); return this; }
    /** Sets the specified value to the {@link #memoryOffset} field. */
    public VkBindImageMemoryInfo memoryOffset(@NativeType("VkDeviceSize") long value) { nmemoryOffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBindImageMemoryInfo set(
        int sType,
        long pNext,
        long image,
        long memory,
        long memoryOffset
    ) {
        sType(sType);
        pNext(pNext);
        image(image);
        memory(memory);
        memoryOffset(memoryOffset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBindImageMemoryInfo set(VkBindImageMemoryInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkBindImageMemoryInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryInfo malloc() {
        return wrap(VkBindImageMemoryInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkBindImageMemoryInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBindImageMemoryInfo calloc() {
        return wrap(VkBindImageMemoryInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkBindImageMemoryInfo} instance allocated with {@link BufferUtils}. */
    public static VkBindImageMemoryInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkBindImageMemoryInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code VkBindImageMemoryInfo} instance for the specified memory address. */
    public static VkBindImageMemoryInfo create(long address) {
        return wrap(VkBindImageMemoryInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryInfo createSafe(long address) {
        return address == NULL ? null : wrap(VkBindImageMemoryInfo.class, address);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkBindImageMemoryInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBindImageMemoryInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfo mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfo callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfo mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfo callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfo.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfo.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfo.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkBindImageMemoryInfo.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkBindImageMemoryInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryInfo malloc(MemoryStack stack) {
        return wrap(VkBindImageMemoryInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkBindImageMemoryInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBindImageMemoryInfo calloc(MemoryStack stack) {
        return wrap(VkBindImageMemoryInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBindImageMemoryInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBindImageMemoryInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkBindImageMemoryInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBindImageMemoryInfo.PNEXT); }
    /** Unsafe version of {@link #image}. */
    public static long nimage(long struct) { return UNSAFE.getLong(null, struct + VkBindImageMemoryInfo.IMAGE); }
    /** Unsafe version of {@link #memory}. */
    public static long nmemory(long struct) { return UNSAFE.getLong(null, struct + VkBindImageMemoryInfo.MEMORY); }
    /** Unsafe version of {@link #memoryOffset}. */
    public static long nmemoryOffset(long struct) { return UNSAFE.getLong(null, struct + VkBindImageMemoryInfo.MEMORYOFFSET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkBindImageMemoryInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBindImageMemoryInfo.PNEXT, value); }
    /** Unsafe version of {@link #image(long) image}. */
    public static void nimage(long struct, long value) { UNSAFE.putLong(null, struct + VkBindImageMemoryInfo.IMAGE, value); }
    /** Unsafe version of {@link #memory(long) memory}. */
    public static void nmemory(long struct, long value) { UNSAFE.putLong(null, struct + VkBindImageMemoryInfo.MEMORY, value); }
    /** Unsafe version of {@link #memoryOffset(long) memoryOffset}. */
    public static void nmemoryOffset(long struct, long value) { UNSAFE.putLong(null, struct + VkBindImageMemoryInfo.MEMORYOFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkBindImageMemoryInfo} structs. */
    public static class Buffer extends StructBuffer<VkBindImageMemoryInfo, Buffer> implements NativeResource {

        private static final VkBindImageMemoryInfo ELEMENT_FACTORY = VkBindImageMemoryInfo.create(-1L);

        /**
         * Creates a new {@code VkBindImageMemoryInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBindImageMemoryInfo#SIZEOF}, and its mark will be undefined.
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
        protected VkBindImageMemoryInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkBindImageMemoryInfo#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBindImageMemoryInfo.nsType(address()); }
        /** @return the value of the {@link VkBindImageMemoryInfo#pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBindImageMemoryInfo.npNext(address()); }
        /** @return the value of the {@link VkBindImageMemoryInfo#image} field. */
        @NativeType("VkImage")
        public long image() { return VkBindImageMemoryInfo.nimage(address()); }
        /** @return the value of the {@link VkBindImageMemoryInfo#memory} field. */
        @NativeType("VkDeviceMemory")
        public long memory() { return VkBindImageMemoryInfo.nmemory(address()); }
        /** @return the value of the {@link VkBindImageMemoryInfo#memoryOffset} field. */
        @NativeType("VkDeviceSize")
        public long memoryOffset() { return VkBindImageMemoryInfo.nmemoryOffset(address()); }

        /** Sets the specified value to the {@link VkBindImageMemoryInfo#sType} field. */
        public VkBindImageMemoryInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBindImageMemoryInfo.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO} value to the {@link VkBindImageMemoryInfo#sType} field. */
        public VkBindImageMemoryInfo.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO); }
        /** Sets the specified value to the {@link VkBindImageMemoryInfo#pNext} field. */
        public VkBindImageMemoryInfo.Buffer pNext(@NativeType("void const *") long value) { VkBindImageMemoryInfo.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkBindImageMemoryDeviceGroupInfo} value to the {@code pNext} chain. */
        public VkBindImageMemoryInfo.Buffer pNext(VkBindImageMemoryDeviceGroupInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkBindImageMemoryDeviceGroupInfoKHR} value to the {@code pNext} chain. */
        public VkBindImageMemoryInfo.Buffer pNext(VkBindImageMemoryDeviceGroupInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkBindImageMemorySwapchainInfoKHR} value to the {@code pNext} chain. */
        public VkBindImageMemoryInfo.Buffer pNext(VkBindImageMemorySwapchainInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkBindImagePlaneMemoryInfo} value to the {@code pNext} chain. */
        public VkBindImageMemoryInfo.Buffer pNext(VkBindImagePlaneMemoryInfo value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Prepends the specified {@link VkBindImagePlaneMemoryInfoKHR} value to the {@code pNext} chain. */
        public VkBindImageMemoryInfo.Buffer pNext(VkBindImagePlaneMemoryInfoKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }
        /** Sets the specified value to the {@link VkBindImageMemoryInfo#image} field. */
        public VkBindImageMemoryInfo.Buffer image(@NativeType("VkImage") long value) { VkBindImageMemoryInfo.nimage(address(), value); return this; }
        /** Sets the specified value to the {@link VkBindImageMemoryInfo#memory} field. */
        public VkBindImageMemoryInfo.Buffer memory(@NativeType("VkDeviceMemory") long value) { VkBindImageMemoryInfo.nmemory(address(), value); return this; }
        /** Sets the specified value to the {@link VkBindImageMemoryInfo#memoryOffset} field. */
        public VkBindImageMemoryInfo.Buffer memoryOffset(@NativeType("VkDeviceSize") long value) { VkBindImageMemoryInfo.nmemoryOffset(address(), value); return this; }

    }

}