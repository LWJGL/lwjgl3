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
 * Structure describing subgroup support for an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceSubgroupProperties} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2}, it is filled with the implementation-dependent limits.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code subgroupSize} &ndash; the number of invocations in each subgroup. This will match any <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#interfaces-builtin-variables-sgs">{@code SubgroupSize}</a> decorated variable used in any shader module created on this device. {@code subgroupSize} is at least 1 if any of the physical device&#8217;s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}.</li>
 * <li>{@code supportedStages} &ndash; a bitfield of {@code VkShaderStageFlagBits} describing the shader stages that subgroup operations are supported in. {@code supportedStages} will have the {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT} bit set if any of the physical device&#8217;s queues support {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}.</li>
 * <li>{@code supportedOperations} &ndash; a bitmask of {@code VkSubgroupFeatureFlagBits} specifying the sets of subgroup operations supported on this device. {@code supportedOperations} will have the {@link VK11#VK_SUBGROUP_FEATURE_BASIC_BIT SUBGROUP_FEATURE_BASIC_BIT} bit set if any of the physical device&#8217;s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}.</li>
 * <li>{@code quadOperationsInAllStages} &ndash; a boolean that specifies whether <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-subgroup-quad">quad subgroup operations</a> are available in all stages, or are restricted to fragment and compute stages.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSubgroupProperties {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t subgroupSize;
 *     VkShaderStageFlags supportedStages;
 *     VkSubgroupFeatureFlags supportedOperations;
 *     VkBool32 quadOperationsInAllStages;
 * }</code></pre>
 */
public class VkPhysicalDeviceSubgroupProperties extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBGROUPSIZE,
        SUPPORTEDSTAGES,
        SUPPORTEDOPERATIONS,
        QUADOPERATIONSINALLSTAGES;

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
        SUBGROUPSIZE = layout.offsetof(2);
        SUPPORTEDSTAGES = layout.offsetof(3);
        SUPPORTEDOPERATIONS = layout.offsetof(4);
        QUADOPERATIONSINALLSTAGES = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPhysicalDeviceSubgroupProperties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceSubgroupProperties(ByteBuffer container) {
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
    /** Returns the value of the {@code subgroupSize} field. */
    @NativeType("uint32_t")
    public int subgroupSize() { return nsubgroupSize(address()); }
    /** Returns the value of the {@code supportedStages} field. */
    @NativeType("VkShaderStageFlags")
    public int supportedStages() { return nsupportedStages(address()); }
    /** Returns the value of the {@code supportedOperations} field. */
    @NativeType("VkSubgroupFeatureFlags")
    public int supportedOperations() { return nsupportedOperations(address()); }
    /** Returns the value of the {@code quadOperationsInAllStages} field. */
    @NativeType("VkBool32")
    public boolean quadOperationsInAllStages() { return nquadOperationsInAllStages(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceSubgroupProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceSubgroupProperties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceSubgroupProperties set(
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
    public VkPhysicalDeviceSubgroupProperties set(VkPhysicalDeviceSubgroupProperties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubgroupProperties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupProperties malloc() {
        return wrap(VkPhysicalDeviceSubgroupProperties.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupProperties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceSubgroupProperties calloc() {
        return wrap(VkPhysicalDeviceSubgroupProperties.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupProperties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceSubgroupProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceSubgroupProperties.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupProperties} instance for the specified memory address. */
    public static VkPhysicalDeviceSubgroupProperties create(long address) {
        return wrap(VkPhysicalDeviceSubgroupProperties.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubgroupProperties createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceSubgroupProperties.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupProperties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupProperties.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupProperties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupProperties.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupProperties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupProperties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceSubgroupProperties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupProperties.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceSubgroupProperties.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceSubgroupProperties} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceSubgroupProperties mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VkPhysicalDeviceSubgroupProperties} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceSubgroupProperties callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupProperties mallocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupProperties callocStack(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupProperties.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupProperties.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupProperties.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupProperties.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupProperties.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupProperties.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupProperties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceSubgroupProperties.PNEXT); }
    /** Unsafe version of {@link #subgroupSize}. */
    public static int nsubgroupSize(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupProperties.SUBGROUPSIZE); }
    /** Unsafe version of {@link #supportedStages}. */
    public static int nsupportedStages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupProperties.SUPPORTEDSTAGES); }
    /** Unsafe version of {@link #supportedOperations}. */
    public static int nsupportedOperations(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupProperties.SUPPORTEDOPERATIONS); }
    /** Unsafe version of {@link #quadOperationsInAllStages}. */
    public static int nquadOperationsInAllStages(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceSubgroupProperties.QUADOPERATIONSINALLSTAGES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceSubgroupProperties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceSubgroupProperties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceSubgroupProperties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSubgroupProperties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceSubgroupProperties ELEMENT_FACTORY = VkPhysicalDeviceSubgroupProperties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceSubgroupProperties.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceSubgroupProperties#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceSubgroupProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSubgroupProperties.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSubgroupProperties.npNext(address()); }
        /** Returns the value of the {@code subgroupSize} field. */
        @NativeType("uint32_t")
        public int subgroupSize() { return VkPhysicalDeviceSubgroupProperties.nsubgroupSize(address()); }
        /** Returns the value of the {@code supportedStages} field. */
        @NativeType("VkShaderStageFlags")
        public int supportedStages() { return VkPhysicalDeviceSubgroupProperties.nsupportedStages(address()); }
        /** Returns the value of the {@code supportedOperations} field. */
        @NativeType("VkSubgroupFeatureFlags")
        public int supportedOperations() { return VkPhysicalDeviceSubgroupProperties.nsupportedOperations(address()); }
        /** Returns the value of the {@code quadOperationsInAllStages} field. */
        @NativeType("VkBool32")
        public boolean quadOperationsInAllStages() { return VkPhysicalDeviceSubgroupProperties.nquadOperationsInAllStages(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceSubgroupProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubgroupProperties.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceSubgroupProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubgroupProperties.npNext(address(), value); return this; }

    }

}