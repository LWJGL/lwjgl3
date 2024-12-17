/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceFragmentDensityMap2PropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 subsampledLoads;
 *     VkBool32 subsampledCoarseReconstructionEarlyAccess;
 *     uint32_t maxSubsampledArrayLayers;
 *     uint32_t maxDescriptorSetSubsampledSamplers;
 * }}</pre>
 */
public class VkPhysicalDeviceFragmentDensityMap2PropertiesEXT extends Struct<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT> implements NativeResource {

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

    protected VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceFragmentDensityMap2PropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(address, container);
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

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code subsampledLoads} field. */
    @NativeType("VkBool32")
    public boolean subsampledLoads() { return nsubsampledLoads(address()) != 0; }
    /** @return the value of the {@code subsampledCoarseReconstructionEarlyAccess} field. */
    @NativeType("VkBool32")
    public boolean subsampledCoarseReconstructionEarlyAccess() { return nsubsampledCoarseReconstructionEarlyAccess(address()) != 0; }
    /** @return the value of the {@code maxSubsampledArrayLayers} field. */
    @NativeType("uint32_t")
    public int maxSubsampledArrayLayers() { return nmaxSubsampledArrayLayers(address()); }
    /** @return the value of the {@code maxDescriptorSetSubsampledSamplers} field. */
    @NativeType("uint32_t")
    public int maxDescriptorSetSubsampledSamplers() { return nmaxDescriptorSetSubsampledSamplers(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link EXTFragmentDensityMap2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT} value to the {@code sType} field. */
    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT sType$Default() { return sType(EXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT); }
    /** Sets the specified value to the {@code pNext} field. */
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
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT calloc() {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance for the specified memory address. */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT create(long address) {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceFragmentDensityMap2PropertiesEXT createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #subsampledLoads}. */
    public static int nsubsampledLoads(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.SUBSAMPLEDLOADS); }
    /** Unsafe version of {@link #subsampledCoarseReconstructionEarlyAccess}. */
    public static int nsubsampledCoarseReconstructionEarlyAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.SUBSAMPLEDCOARSERECONSTRUCTIONEARLYACCESS); }
    /** Unsafe version of {@link #maxSubsampledArrayLayers}. */
    public static int nmaxSubsampledArrayLayers(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.MAXSUBSAMPLEDARRAYLAYERS); }
    /** Unsafe version of {@link #maxDescriptorSetSubsampledSamplers}. */
    public static int nmaxDescriptorSetSubsampledSamplers(long struct) { return memGetInt(struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.MAXDESCRIPTORSETSUBSAMPLEDSAMPLERS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceFragmentDensityMap2PropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceFragmentDensityMap2PropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected VkPhysicalDeviceFragmentDensityMap2PropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.npNext(address()); }
        /** @return the value of the {@code subsampledLoads} field. */
        @NativeType("VkBool32")
        public boolean subsampledLoads() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsubsampledLoads(address()) != 0; }
        /** @return the value of the {@code subsampledCoarseReconstructionEarlyAccess} field. */
        @NativeType("VkBool32")
        public boolean subsampledCoarseReconstructionEarlyAccess() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsubsampledCoarseReconstructionEarlyAccess(address()) != 0; }
        /** @return the value of the {@code maxSubsampledArrayLayers} field. */
        @NativeType("uint32_t")
        public int maxSubsampledArrayLayers() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nmaxSubsampledArrayLayers(address()); }
        /** @return the value of the {@code maxDescriptorSetSubsampledSamplers} field. */
        @NativeType("uint32_t")
        public int maxDescriptorSetSubsampledSamplers() { return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nmaxDescriptorSetSubsampledSamplers(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.nsType(address(), value); return this; }
        /** Sets the {@link EXTFragmentDensityMap2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT} value to the {@code sType} field. */
        public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer sType$Default() { return sType(EXTFragmentDensityMap2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.npNext(address(), value); return this; }

    }

}