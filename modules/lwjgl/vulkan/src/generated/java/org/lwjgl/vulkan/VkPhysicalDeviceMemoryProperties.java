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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.vulkan.VK10.*;

/**
 * Structure specifying physical device memory properties.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link VkPhysicalDeviceMemoryProperties} structure describes a number of <em>memory heaps</em> as well as a number of <em>memory types</em> that <b>can</b> be used to access memory allocated in those heaps. Each heap describes a memory resource of a particular size, and each memory type describes a set of memory properties (e.g. host cached vs uncached) that <b>can</b> be used with a given memory heap. Allocations using a particular memory type will consume resources from the heap indicated by that memory type's heap index. More than one memory type <b>may</b> share each heap, and the heaps and memory types provide a mechanism to advertise an accurate size of the physical memory resources while allowing the memory to be used with a variety of different properties.</p>
 * 
 * <p>The number of memory heaps is given by {@code memoryHeapCount} and is less than or equal to {@link VK10#VK_MAX_MEMORY_HEAPS MAX_MEMORY_HEAPS}. Each heap is described by an element of the {@code memoryHeaps} array as a {@link VkMemoryHeap} structure. The number of memory types available across all memory heaps is given by {@code memoryTypeCount} and is less than or equal to {@link VK10#VK_MAX_MEMORY_TYPES MAX_MEMORY_TYPES}. Each memory type is described by an element of the {@code memoryTypes} array as a {@link VkMemoryType} structure.</p>
 * 
 * <p>At least one heap <b>must</b> include {@link VK10#VK_MEMORY_HEAP_DEVICE_LOCAL_BIT MEMORY_HEAP_DEVICE_LOCAL_BIT} in {@link VkMemoryHeap}{@code ::flags}. If there are multiple heaps that all have similar performance characteristics, they <b>may</b> all include {@link VK10#VK_MEMORY_HEAP_DEVICE_LOCAL_BIT MEMORY_HEAP_DEVICE_LOCAL_BIT}. In a unified memory architecture (UMA) system there is often only a single memory heap which is considered to be equally "{@code local}" to the host and to the device, and such an implementation <b>must</b> advertise the heap as device-local.</p>
 * 
 * <p>Each memory type returned by {@link VK10#vkGetPhysicalDeviceMemoryProperties GetPhysicalDeviceMemoryProperties} <b>must</b> have its {@code propertyFlags} set to one of the following values:</p>
 * 
 * <ul>
 * <li>0</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_CACHED_BIT MEMORY_PROPERTY_HOST_CACHED_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_CACHED_BIT MEMORY_PROPERTY_HOST_CACHED_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_CACHED_BIT MEMORY_PROPERTY_HOST_CACHED_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_CACHED_BIT MEMORY_PROPERTY_HOST_CACHED_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}</li>
 * <li>{@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} | {@link VK10#VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT}</li>
 * <li>{@link VK11#VK_MEMORY_PROPERTY_PROTECTED_BIT MEMORY_PROPERTY_PROTECTED_BIT}</li>
 * <li>{@link VK11#VK_MEMORY_PROPERTY_PROTECTED_BIT MEMORY_PROPERTY_PROTECTED_BIT} | {@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT}</li>
 * </ul>
 * 
 * <p>There <b>must</b> be at least one memory type with both the {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} and {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT} bits set in its {@code propertyFlags}. There <b>must</b> be at least one memory type with the {@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} bit set in its {@code propertyFlags}.</p>
 * 
 * <p>For each pair of elements <b>X</b> and <b>Y</b> returned in {@code memoryTypes}, <b>X</b> <b>must</b> be placed at a lower index position than <b>Y</b> if:</p>
 * 
 * <ul>
 * <li>either the set of bit flags returned in the {@code propertyFlags} member of <b>X</b> is a strict subset of the set of bit flags returned in the {@code propertyFlags} member of <b>Y</b>.</li>
 * <li>or the {@code propertyFlags} members of <b>X</b> and <b>Y</b> are equal, and <b>X</b> belongs to a memory heap with greater performance (as determined in an implementation-specific manner).</li>
 * </ul>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>There is no ordering requirement between <b>X</b> and <b>Y</b> elements for the case their {@code propertyFlags} members are not in a subset relation. That potentially allows more than one possible way to order the same set of memory types. Notice that the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/html/vkspec.html#memory-device-bitmask-list">list of all allowed memory property flag combinations</a> is written in a valid order. But if instead {@link VK10#VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT MEMORY_PROPERTY_DEVICE_LOCAL_BIT} was before {@link VK10#VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT MEMORY_PROPERTY_HOST_VISIBLE_BIT} | {@link VK10#VK_MEMORY_PROPERTY_HOST_COHERENT_BIT MEMORY_PROPERTY_HOST_COHERENT_BIT}, the list would still be in a valid order.</p>
 * </div>
 * 
 * <p>This ordering requirement enables applications to use a simple search loop to select the desired memory type along the lines of:</p>
 * 
 * <pre><code>
 * // Find a memory in `memoryTypeBitsRequirement` that includes all of `requiredProperties`
 * int32_t findProperties(const VkPhysicalDeviceMemoryProperties* pMemoryProperties,
 *                        uint32_t memoryTypeBitsRequirement,
 *                        VkMemoryPropertyFlags requiredProperties) {
 *     const uint32_t memoryCount = pMemoryProperties-&gt;memoryTypeCount;
 *     for (uint32_t memoryIndex = 0; memoryIndex &lt; memoryCount; ++memoryIndex) {
 *         const uint32_t memoryTypeBits = (1 &lt;&lt; memoryIndex);
 *         const bool isRequiredMemoryType = memoryTypeBitsRequirement &amp; memoryTypeBits;
 * 
 *         const VkMemoryPropertyFlags properties =
 *             pMemoryProperties-&gt;memoryTypes[memoryIndex].propertyFlags;
 *         const bool hasRequiredProperties =
 *             (properties &amp; requiredProperties) == requiredProperties;
 * 
 *         if (isRequiredMemoryType &amp;&amp; hasRequiredProperties)
 *             return static_cast&lt;int32_t&gt;(memoryIndex);
 *     }
 * 
 *     // failed to find memory type
 *     return -1;
 * }
 * 
 * // Try to find an optimal memory type, or if it does not exist try fallback memory type
 * // `device` is the VkDevice
 * // `image` is the VkImage that requires memory to be bound
 * // `memoryProperties` properties as returned by vkGetPhysicalDeviceMemoryProperties
 * // `requiredProperties` are the property flags that must be present
 * // `optimalProperties` are the property flags that are preferred by the application
 * VkMemoryRequirements memoryRequirements;
 * vkGetImageMemoryRequirements(device, image, &amp;memoryRequirements);
 * int32_t memoryType =
 *     findProperties(&amp;memoryProperties, memoryRequirements.memoryTypeBits, optimalProperties);
 * if (memoryType == -1) // not found; try fallback properties
 *     memoryType =
 *         findProperties(&amp;memoryProperties, memoryRequirements.memoryTypeBits, requiredProperties);</code></pre>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkMemoryHeap}, {@link VkMemoryType}, {@link VkPhysicalDeviceMemoryProperties2}, {@link VK10#vkGetPhysicalDeviceMemoryProperties GetPhysicalDeviceMemoryProperties}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code memoryTypeCount} &ndash; the number of valid elements in the {@code memoryTypes} array.</li>
 * <li>{@code memoryTypes[VK_MAX_MEMORY_TYPES]} &ndash; an array of {@link VkMemoryType} structures describing the <em>memory types</em> that <b>can</b> be used to access memory allocated from the heaps specified by {@code memoryHeaps}.</li>
 * <li>{@code memoryHeapCount} &ndash; the number of valid elements in the {@code memoryHeaps} array.</li>
 * <li>{@code memoryHeaps[VK_MAX_MEMORY_HEAPS]} &ndash; an array of {@link VkMemoryHeap} structures describing the <em>memory heaps</em> from which memory <b>can</b> be allocated.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceMemoryProperties {
 *     uint32_t memoryTypeCount;
 *     {@link VkMemoryType VkMemoryType} memoryTypes[VK_MAX_MEMORY_TYPES];
 *     uint32_t memoryHeapCount;
 *     {@link VkMemoryHeap VkMemoryHeap} memoryHeaps[VK_MAX_MEMORY_HEAPS];
 * }</code></pre>
 */
public class VkPhysicalDeviceMemoryProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MEMORYTYPECOUNT,
        MEMORYTYPES,
        MEMORYHEAPCOUNT,
        MEMORYHEAPS;

    static {
        Layout layout = __struct(
            __member(4),
            __array(VkMemoryType.SIZEOF, VkMemoryType.ALIGNOF, VK_MAX_MEMORY_TYPES),
            __member(4),
            __array(VkMemoryHeap.SIZEOF, VkMemoryHeap.ALIGNOF, VK_MAX_MEMORY_HEAPS)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MEMORYTYPECOUNT = layout.offsetof(0);
        MEMORYTYPES = layout.offsetof(1);
        MEMORYHEAPCOUNT = layout.offsetof(2);
        MEMORYHEAPS = layout.offsetof(3);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMemoryProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMemoryProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code memoryTypeCount} field. */
    @NativeType("uint32_t")
    public int memoryTypeCount() { return nmemoryTypeCount(address()); }
    /** Returns a {@link VkMemoryType}.Buffer view of the {@code memoryTypes} field. */
    @NativeType("VkMemoryType[VK_MAX_MEMORY_TYPES]")
    public VkMemoryType.Buffer memoryTypes() { return nmemoryTypes(address()); }
    /** Returns a {@link VkMemoryType} view of the struct at the specified index of the {@code memoryTypes} field. */
    public VkMemoryType memoryTypes(int index) { return nmemoryTypes(address(), index); }
    /** Returns the value of the {@code memoryHeapCount} field. */
    @NativeType("uint32_t")
    public int memoryHeapCount() { return nmemoryHeapCount(address()); }
    /** Returns a {@link VkMemoryHeap}.Buffer view of the {@code memoryHeaps} field. */
    @NativeType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]")
    public VkMemoryHeap.Buffer memoryHeaps() { return nmemoryHeaps(address()); }
    /** Returns a {@link VkMemoryHeap} view of the struct at the specified index of the {@code memoryHeaps} field. */
    public VkMemoryHeap memoryHeaps(int index) { return nmemoryHeaps(address(), index); }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryProperties malloc() {
        return wrap(VkPhysicalDeviceMemoryProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMemoryProperties calloc() {
        return wrap(VkPhysicalDeviceMemoryProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMemoryProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceMemoryProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceMemoryProperties create(long address) {
        return wrap(VkPhysicalDeviceMemoryProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMemoryProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceMemoryProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceMemoryProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceMemoryProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceMemoryProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceMemoryProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryProperties mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMemoryProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMemoryProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMemoryProperties callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceMemoryProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMemoryProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMemoryProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #memoryTypeCount}. */
    public static int nmemoryTypeCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMemoryProperties.MEMORYTYPECOUNT); }
    /** Unsafe version of {@link #memoryTypes}. */
    public static VkMemoryType.Buffer nmemoryTypes(long struct) { return VkMemoryType.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYTYPES, nmemoryTypeCount(struct)); }
    /** Unsafe version of {@link #memoryTypes(int) memoryTypes}. */
    public static VkMemoryType nmemoryTypes(long struct, int index) {
        return VkMemoryType.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYTYPES + check(index, nmemoryTypeCount(struct)) * VkMemoryType.SIZEOF);
    }
    /** Unsafe version of {@link #memoryHeapCount}. */
    public static int nmemoryHeapCount(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPCOUNT); }
    /** Unsafe version of {@link #memoryHeaps}. */
    public static VkMemoryHeap.Buffer nmemoryHeaps(long struct) { return VkMemoryHeap.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPS, nmemoryHeapCount(struct)); }
    /** Unsafe version of {@link #memoryHeaps(int) memoryHeaps}. */
    public static VkMemoryHeap nmemoryHeaps(long struct, int index) {
        return VkMemoryHeap.create(struct + VkPhysicalDeviceMemoryProperties.MEMORYHEAPS + check(index, nmemoryHeapCount(struct)) * VkMemoryHeap.SIZEOF);
    }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMemoryProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMemoryProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMemoryProperties ELEMENT_FACTORY = VkPhysicalDeviceMemoryProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMemoryProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMemoryProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceMemoryProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code memoryTypeCount} field. */
        @NativeType("uint32_t")
        public int memoryTypeCount() { return VkPhysicalDeviceMemoryProperties.nmemoryTypeCount(address()); }
        /** Returns a {@link VkMemoryType}.Buffer view of the {@code memoryTypes} field. */
        @NativeType("VkMemoryType[VK_MAX_MEMORY_TYPES]")
        public VkMemoryType.Buffer memoryTypes() { return VkPhysicalDeviceMemoryProperties.nmemoryTypes(address()); }
        /** Returns a {@link VkMemoryType} view of the struct at the specified index of the {@code memoryTypes} field. */
        public VkMemoryType memoryTypes(int index) { return VkPhysicalDeviceMemoryProperties.nmemoryTypes(address(), index); }
        /** Returns the value of the {@code memoryHeapCount} field. */
        @NativeType("uint32_t")
        public int memoryHeapCount() { return VkPhysicalDeviceMemoryProperties.nmemoryHeapCount(address()); }
        /** Returns a {@link VkMemoryHeap}.Buffer view of the {@code memoryHeaps} field. */
        @NativeType("VkMemoryHeap[VK_MAX_MEMORY_HEAPS]")
        public VkMemoryHeap.Buffer memoryHeaps() { return VkPhysicalDeviceMemoryProperties.nmemoryHeaps(address()); }
        /** Returns a {@link VkMemoryHeap} view of the struct at the specified index of the {@code memoryHeaps} field. */
        public VkMemoryHeap memoryHeaps(int index) { return VkPhysicalDeviceMemoryProperties.nmemoryHeaps(address(), index); }

    }

}