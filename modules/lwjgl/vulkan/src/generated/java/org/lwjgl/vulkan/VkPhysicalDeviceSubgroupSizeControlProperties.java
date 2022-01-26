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
 * <p>If the {@link VkPhysicalDeviceSubgroupSizeControlProperties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>If {@link VkPhysicalDeviceSubgroupProperties}{@code ::supportedOperations} includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-subgroup-quad">{@link VK11#VK_SUBGROUP_FEATURE_QUAD_BIT SUBGROUP_FEATURE_QUAD_BIT}</a>, {@code minSubgroupSize} <b>must</b> be greater than or equal to 4.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSubgroupSizeControlProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #minSubgroupSize};
 *     uint32_t {@link #maxSubgroupSize};
 *     uint32_t {@link #maxComputeWorkgroupSubgroups};
 *     VkShaderStageFlags {@link #requiredSubgroupSizeStages};
 * }</code></pre>
 */
public class VkPhysicalDeviceSubgroupSizeControlProperties extends Struct implements NativeResource {

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
     * Creates a {@code VkPhysicalDeviceSubgroupSizeControlProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSubgroupSizeControlProperties(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the minimum subgroup size supported by this device. {@code minSubgroupSize} is at least one if any of the physical device’s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. {@code minSubgroupSize} is a power-of-two. {@code minSubgroupSize} is less than or equal to {@code maxSubgroupSize}. {@code minSubgroupSize} is less than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-subgroup-size">subgroupSize</a>. */
    @NativeType("uint32_t")
    public int minSubgroupSize() { return nminSubgroupSize(address()); }
    /** the maximum subgroup size supported by this device. {@code maxSubgroupSize} is at least one if any of the physical device’s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. {@code maxSubgroupSize} is a power-of-two. {@code maxSubgroupSize} is greater than or equal to {@code minSubgroupSize}. {@code maxSubgroupSize} is greater than or equal to <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#limits-subgroup-size">subgroupSize</a>. */
    @NativeType("uint32_t")
    public int maxSubgroupSize() { return nmaxSubgroupSize(address()); }
    /** the maximum number of subgroups supported by the implementation within a workgroup. */
    @NativeType("uint32_t")
    public int maxComputeWorkgroupSubgroups() { return nmaxComputeWorkgroupSubgroups(address()); }
    /** a bitfield of what shader stages support having a required subgroup size specified. */
    @NativeType("VkShaderStageFlags")
    public int requiredSubgroupSizeStages() { return nrequiredSubgroupSizeStages(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceSubgroupSizeControlProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceSubgroupSizeControlProperties sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceSubgroupSizeControlProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSubgroupSizeControlProperties set(
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
    public VkPhysicalDeviceSubgroupSizeControlProperties set(VkPhysicalDeviceSubgroupSizeControlProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlProperties malloc() {
        return wrap(VkPhysicalDeviceSubgroupSizeControlProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupSizeControlProperties calloc() {
        return wrap(VkPhysicalDeviceSubgroupSizeControlProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSubgroupSizeControlProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSubgroupSizeControlProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupSizeControlProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceSubgroupSizeControlProperties create(long address) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubgroupSizeControlProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSubgroupSizeControlProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSubgroupSizeControlProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubgroupSizeControlProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlProperties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupSizeControlProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupSizeControlProperties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupSizeControlProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupSizeControlProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupSizeControlProperties.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSubgroupSizeControlProperties.PNEXT); }
    /** Unsafe version of {@link #minSubgroupSize}. */
    public static int nminSubgroupSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlProperties.MINSUBGROUPSIZE); }
    /** Unsafe version of {@link #maxSubgroupSize}. */
    public static int nmaxSubgroupSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlProperties.MAXSUBGROUPSIZE); }
    /** Unsafe version of {@link #maxComputeWorkgroupSubgroups}. */
    public static int nmaxComputeWorkgroupSubgroups(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlProperties.MAXCOMPUTEWORKGROUPSUBGROUPS); }
    /** Unsafe version of {@link #requiredSubgroupSizeStages}. */
    public static int nrequiredSubgroupSizeStages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupSizeControlProperties.REQUIREDSUBGROUPSIZESTAGES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubgroupSizeControlProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSubgroupSizeControlProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSubgroupSizeControlProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubgroupSizeControlProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSubgroupSizeControlProperties ELEMENT_FACTORY = VkPhysicalDeviceSubgroupSizeControlProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSubgroupSizeControlProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSubgroupSizeControlProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSubgroupSizeControlProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceSubgroupSizeControlProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSubgroupSizeControlProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupSizeControlProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSubgroupSizeControlProperties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupSizeControlProperties#minSubgroupSize} field. */
        @NativeType("uint32_t")
        public int minSubgroupSize() { return VkPhysicalDeviceSubgroupSizeControlProperties.nminSubgroupSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupSizeControlProperties#maxSubgroupSize} field. */
        @NativeType("uint32_t")
        public int maxSubgroupSize() { return VkPhysicalDeviceSubgroupSizeControlProperties.nmaxSubgroupSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupSizeControlProperties#maxComputeWorkgroupSubgroups} field. */
        @NativeType("uint32_t")
        public int maxComputeWorkgroupSubgroups() { return VkPhysicalDeviceSubgroupSizeControlProperties.nmaxComputeWorkgroupSubgroups(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupSizeControlProperties#requiredSubgroupSizeStages} field. */
        @NativeType("VkShaderStageFlags")
        public int requiredSubgroupSizeStages() { return VkPhysicalDeviceSubgroupSizeControlProperties.nrequiredSubgroupSizeStages(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceSubgroupSizeControlProperties#sType} field. */
        public VkPhysicalDeviceSubgroupSizeControlProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubgroupSizeControlProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES} value to the {@link VkPhysicalDeviceSubgroupSizeControlProperties#sType} field. */
        public VkPhysicalDeviceSubgroupSizeControlProperties.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceSubgroupSizeControlProperties#pNext} field. */
        public VkPhysicalDeviceSubgroupSizeControlProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubgroupSizeControlProperties.npNext(address(), value); return this; }

    }

}