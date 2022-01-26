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
 * <p>If the {@link VkPhysicalDeviceSubgroupProperties} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <p>If {@code supportedOperations} includes <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-subgroup-quad">{@link VK11#VK_SUBGROUP_FEATURE_QUAD_BIT SUBGROUP_FEATURE_QUAD_BIT}</a>, or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#features-shaderSubgroupUniformControlFlow">{@code shaderSubgroupUniformControlFlow}</a> is enabled, {@code subgroupSize} <b>must</b> be greater than or equal to 4.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceSubgroupProperties {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     uint32_t {@link #subgroupSize};
 *     VkShaderStageFlags {@link #supportedStages};
 *     VkSubgroupFeatureFlags {@link #supportedOperations};
 *     VkBool32 {@link #quadOperationsInAllStages};
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

    /** the type of this structure. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** {@code NULL} or a pointer to a structure extending this structure. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** the default number of invocations in each subgroup. {@code subgroupSize} is at least 1 if any of the physical device’s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. {@code subgroupSize} is a power-of-two. */
    @NativeType("uint32_t")
    public int subgroupSize() { return nsubgroupSize(address()); }
    /** a bitfield of {@code VkShaderStageFlagBits} describing the shader stages that <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-group-operations">group operations</a> with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-scope-subgroup">subgroup scope</a> are supported in. {@code supportedStages} will have the {@link VK10#VK_SHADER_STAGE_COMPUTE_BIT SHADER_STAGE_COMPUTE_BIT} bit set if any of the physical device’s queues support {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. */
    @NativeType("VkShaderStageFlags")
    public int supportedStages() { return nsupportedStages(address()); }
    /** a bitmask of {@code VkSubgroupFeatureFlagBits} specifying the sets of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-group-operations">group operations</a> with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-scope-subgroup">subgroup scope</a> supported on this device. {@code supportedOperations} will have the {@link VK11#VK_SUBGROUP_FEATURE_BASIC_BIT SUBGROUP_FEATURE_BASIC_BIT} bit set if any of the physical device’s queues support {@link VK10#VK_QUEUE_GRAPHICS_BIT QUEUE_GRAPHICS_BIT} or {@link VK10#VK_QUEUE_COMPUTE_BIT QUEUE_COMPUTE_BIT}. */
    @NativeType("VkSubgroupFeatureFlags")
    public int supportedOperations() { return nsupportedOperations(address()); }
    /** a boolean specifying whether <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/vkspec.html#shaders-quad-operations">quad group operations</a> are available in all stages, or are restricted to fragment and compute stages. */
    @NativeType("VkBool32")
    public boolean quadOperationsInAllStages() { return nquadOperationsInAllStages(address()) != 0; }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceSubgroupProperties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES} value to the {@link #sType} field. */
    public VkPhysicalDeviceSubgroupProperties sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES); }
    /** Sets the specified value to the {@link #pNext} field. */
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

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupProperties mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupProperties callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupProperties mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupProperties callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupProperties.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupProperties.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupProperties.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPhysicalDeviceSubgroupProperties.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupProperties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupProperties malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupProperties.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceSubgroupProperties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceSubgroupProperties calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceSubgroupProperties.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupProperties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupProperties.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceSubgroupProperties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceSubgroupProperties.Buffer calloc(int capacity, MemoryStack stack) {
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

        /** @return the value of the {@link VkPhysicalDeviceSubgroupProperties#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceSubgroupProperties.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupProperties#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceSubgroupProperties.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupProperties#subgroupSize} field. */
        @NativeType("uint32_t")
        public int subgroupSize() { return VkPhysicalDeviceSubgroupProperties.nsubgroupSize(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupProperties#supportedStages} field. */
        @NativeType("VkShaderStageFlags")
        public int supportedStages() { return VkPhysicalDeviceSubgroupProperties.nsupportedStages(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupProperties#supportedOperations} field. */
        @NativeType("VkSubgroupFeatureFlags")
        public int supportedOperations() { return VkPhysicalDeviceSubgroupProperties.nsupportedOperations(address()); }
        /** @return the value of the {@link VkPhysicalDeviceSubgroupProperties#quadOperationsInAllStages} field. */
        @NativeType("VkBool32")
        public boolean quadOperationsInAllStages() { return VkPhysicalDeviceSubgroupProperties.nquadOperationsInAllStages(address()) != 0; }

        /** Sets the specified value to the {@link VkPhysicalDeviceSubgroupProperties#sType} field. */
        public VkPhysicalDeviceSubgroupProperties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceSubgroupProperties.nsType(address(), value); return this; }
        /** Sets the {@link VK11#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES} value to the {@link VkPhysicalDeviceSubgroupProperties#sType} field. */
        public VkPhysicalDeviceSubgroupProperties.Buffer sType$Default() { return sType(VK11.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES); }
        /** Sets the specified value to the {@link VkPhysicalDeviceSubgroupProperties#pNext} field. */
        public VkPhysicalDeviceSubgroupProperties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceSubgroupProperties.npNext(address(), value); return this; }

    }

}