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
 * Structure describing additional fragment density map properties that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <p>If the {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} structure is included in the {@code pNext} chain of the {@link VkPhysicalDeviceProperties2} structure passed to {@link VK11#vkGetPhysicalDeviceProperties2 GetPhysicalDeviceProperties2}, it is filled in with each corresponding implementation-dependent property.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTFragmentDensityMap2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPhysicalDeviceFragmentDensityMap2PropertiesEXT {
 *     VkStructureType {@link #sType};
 *     void * {@link #pNext};
 *     VkBool32 {@link #subsampledLoads};
 *     VkBool32 {@link #subsampledCoarseReconstructionEarlyAccess};
 *     uint32_t {@link #maxSubsampledArrayLayers};
 *     uint32_t {@link #maxDescriptorSetSubsampledSamplers};
 * }</code></pre>
 */
public class VkPhysicalDeviceFragmentDensityMap2PropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBSAMPLEDLOADS,
        SUBSAMPLEDCOARSERECONSTRUCTIONEARLYACCESS,
        MAXSUBSAMPLEDARRAYLAYERS,
        MAXDESCRIPTORSETSUBSAMPLEDSAMPLERS;

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
        SUBSAMPLEDLOADS = layout.offsetof(2);
        SUBSAMPLEDCOARSERECONSTRUCTIONEARLYACCESS = layout.offsetof(3);
        MAXSUBSAMPLEDARRAYLAYERS = layout.offsetof(4);
        MAXDESCRIPTORSETSUBSAMPLEDSAMPLERS = layout.offsetof(5);
    }

    /**
     * Creates a {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(ByteBuffer container) {
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
    /** specifies if performing image data read with load operations on subsampled attachments will be resampled to the fragment density of the render pass */
    @NativeType("VkBool32")
    public boolean subsampledLoads() { return nsubsampledLoads(address()) != 0; }
    /** specifies if performing image data read with samplers created with {@code flags} containing {@link EXTFragmentDensityMap#VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT} in fragment shader will trigger additional reads during {@link VK10#VK_PIPELINE_STAGE_VERTEX_SHADER_BIT PIPELINE_STAGE_VERTEX_SHADER_BIT} */
    @NativeType("VkBool32")
    public boolean subsampledCoarseReconstructionEarlyAccess() { return nsubsampledCoarseReconstructionEarlyAccess(address()) != 0; }
    /** the maximum number of {@code VkImageView} array layers for usages supporting subsampled samplers */
    @NativeType("uint32_t")
    public int maxSubsampledArrayLayers() { return nmaxSubsampledArrayLayers(address()); }
    /** the maximum number of subsampled samplers that <b>can</b> be included in a {@code VkPipelineLayout} */
    @NativeType("uint32_t")
    public int maxDescriptorSetSubsampledSamplers() { return nmaxDescriptorSetSubsampledSamplers(address()); }

    /** Sets the specified value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFragmentDensityMap2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT} value to the {@link #sType} field. */
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sType$Default() { return sType(EXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #pNext} field. */
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT set(
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
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT set(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT malloc() {
        return wrap(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT calloc() {
        return wrap(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.class, memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT create(long address) {
        return wrap(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT createSafe(long address) {
        return address == NULL ? null : wrap(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.class, address);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT malloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT calloc(MemoryStack stack) {
        return wrap(VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #subsampledLoads}. */
    public static int nsubsampledLoads(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.SUBSAMPLEDLOADS); }
    /** Unsafe version of {@link #subsampledCoarseReconstructionEarlyAccess}. */
    public static int nsubsampledCoarseReconstructionEarlyAccess(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.SUBSAMPLEDCOARSERECONSTRUCTIONEARLYACCESS); }
    /** Unsafe version of {@link #maxSubsampledArrayLayers}. */
    public static int nmaxSubsampledArrayLayers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.MAXSUBSAMPLEDARRAYLAYERS); }
    /** Unsafe version of {@link #maxDescriptorSetSubsampledSamplers}. */
    public static int nmaxDescriptorSetSubsampledSamplers(long struct) { return UNSAFE.getInt(null, struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.MAXDESCRIPTORSETSUBSAMPLEDSAMPLERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { UNSAFE.putInt(null, struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentDensityMap2PropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceFragmentDensityMap2PropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT#sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsType(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT#pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.npNext(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT#subsampledLoads} field. */
        @NativeType("VkBool32")
        public boolean subsampledLoads() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsubsampledLoads(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT#subsampledCoarseReconstructionEarlyAccess} field. */
        @NativeType("VkBool32")
        public boolean subsampledCoarseReconstructionEarlyAccess() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsubsampledCoarseReconstructionEarlyAccess(address()) != 0; }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT#maxSubsampledArrayLayers} field. */
        @NativeType("uint32_t")
        public int maxSubsampledArrayLayers() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nmaxSubsampledArrayLayers(address()); }
        /** @return the value of the {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT#maxDescriptorSetSubsampledSamplers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetSubsampledSamplers() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nmaxDescriptorSetSubsampledSamplers(address()); }

        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT#sType} field. */
        public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFragmentDensityMap2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT} value to the {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT#sType} field. */
        public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer sType$Default() { return sType(EXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT#pNext} field. */
        public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.npNext(address(), value); return this; }

    }

}