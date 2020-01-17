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
 * Structure describing the control subgroup size properties of an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTSubgroupSizeControl#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code minSubgroupSize} &ndash; the minimum subgroup size supported by this device. {@code minSubgroupSize} is at least one if any of the physical device&#8217;s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. {@code minSubgroupSize} is a power-of-two. {@code minSubgroupSize} is less than or equal to {@code maxSubgroupSize}. {@code minSubgroupSize} is less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-subgroup-size">subgroupSize</a>.</li>
 * <li>{@code maxSubgroupSize} &ndash; the maximum subgroup size supported by this device. {@code maxSubgroupSize} is at least one if any of the physical device&#8217;s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. {@code maxSubgroupSize} is a power-of-two. {@code maxSubgroupSize} is greater than or equal to {@code minSubgroupSize}. {@code maxSubgroupSize} is greater than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#limits-subgroup-size">subgroupSize</a>.</li>
 * <li>{@code maxComputeWorkgroupSubgroups} &ndash; the maximum number of subgroups supported by the implementation within a workgroup.</li>
 * <li>{@code requiredSubgroupSizeStages} &ndash; a bitfield of what shader stages support having a required subgroup size specified.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSubgroupSizeControlPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t minSubgroupSize;
 *     uint32_t maxSubgroupSize;
 *     uint32_t maxComputeWorkgroupSubgroups;
 *     VkShaderStageFlags requiredSubgroupSizeStages;
 * }</code></pre>
 */
public class VkPhysicalDeviceSubgroupSizeControlPropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MINSUBGROUPSIZE,
        MAXSUBGROUPSIZE,
        MAXCOMPUTEWORKGROUPSUBGROUPS,
        REQUIREDSUBGROUPSIZESTAGES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MINSUBGROUPSIZE = layout.offsetof(2);
        MAXSUBGROUPSIZE = layout.offsetof(3);
        MAXCOMPUTEWORKGROUPSUBGROUPS = layout.offsetof(4);
        REQUIREDSUBGROUPSIZESTAGES = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSubgroupSizeControlPropertiesEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code minSubgroupSize} field. */
    @NativeType("uint32_t")
    public int minSubgroupSize() { return nminSubgroupSize(address()); }
    /** Returns the value of the {@code maxSubgroupSize} field. */
    @NativeType("uint32_t")
    public int maxSubgroupSize() { return nmaxSubgroupSize(address()); }
    /** Returns the value of the {@code maxComputeWorkgroupSubgroups} field. */
    @NativeType("uint32_t")
    public int maxComputeWorkgroupSubgroups() { return nmaxComputeWorkgroupSubgroups(address()); }
    /** Returns the value of the {@code requiredSubgroupSizeStages} field. */
    @NativeType("VkShaderStageFlags")
    public int requiredSubgroupSizeStages() { return nrequiredSubgroupSizeStages(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSubgroupSizeControlPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSubgroupSizeControlPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSubgroupSizeControlPropertiesEXT set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceSubgroupSizeControlPropertiesEXT set(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #minSubgroupSize}. */
    public static int nminSubgroupSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.MINSUBGROUPSIZE); }
    /** Unsafe version of {@link #maxSubgroupSize}. */
    public static int nmaxSubgroupSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.MAXSUBGROUPSIZE); }
    /** Unsafe version of {@link #maxComputeWorkgroupSubgroups}. */
    public static int nmaxComputeWorkgroupSubgroups(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.MAXCOMPUTEWORKGROUPSUBGROUPS); }
    /** Unsafe version of {@link #requiredSubgroupSizeStages}. */
    public static int nrequiredSubgroupSizeStages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.REQUIREDSUBGROUPSIZESTAGES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubgroupSizeControlPropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSubgroupSizeControlPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSubgroupSizeControlPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSubgroupSizeControlPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.npNext(address()); }
        /** Returns the value of the {@code minSubgroupSize} field. */
        @NativeType("uint32_t")
        public int minSubgroupSize() { return VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.nminSubgroupSize(address()); }
        /** Returns the value of the {@code maxSubgroupSize} field. */
        @NativeType("uint32_t")
        public int maxSubgroupSize() { return VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.nmaxSubgroupSize(address()); }
        /** Returns the value of the {@code maxComputeWorkgroupSubgroups} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkgroupSubgroups() { return VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.nmaxComputeWorkgroupSubgroups(address()); }
        /** Returns the value of the {@code requiredSubgroupSizeStages} field. */
        @NativeType("VkShaderStageFlags")
        public int requiredSubgroupSizeStages() { return VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.nrequiredSubgroupSizeStages(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubgroupSizeControlPropertiesEXT.npNext(address(), value); return this; }

    }

}