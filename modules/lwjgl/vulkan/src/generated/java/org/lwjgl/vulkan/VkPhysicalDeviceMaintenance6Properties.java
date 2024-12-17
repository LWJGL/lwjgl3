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
 * struct VkPhysicalDeviceMaintenance6Properties {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 blockTexelViewCompatibleMultipleLayers;
 *     uint32_t maxCombinedImageSamplerDescriptorCount;
 *     VkBool32 fragmentShadingRateClampCombinerInputs;
 * }}</pre>
 */
public class VkPhysicalDeviceMaintenance6Properties extends Struct<VkPhysicalDeviceMaintenance6Properties> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS,
        MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT,
        FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS = layout.offsetof(2);
        MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT = layout.offsetof(3);
        FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceMaintenance6Properties(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceMaintenance6Properties create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceMaintenance6Properties(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceMaintenance6Properties} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceMaintenance6Properties(ByteBuffer container) {
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
    /** @return the value of the {@code blockTexelViewCompatibleMultipleLayers} field. */
    @NativeType("VkBool32")
    public boolean blockTexelViewCompatibleMultipleLayers() { return nblockTexelViewCompatibleMultipleLayers(address()) != 0; }
    /** @return the value of the {@code maxCombinedImageSamplerDescriptorCount} field. */
    @NativeType("uint32_t")
    public int maxCombinedImageSamplerDescriptorCount() { return nmaxCombinedImageSamplerDescriptorCount(address()); }
    /** @return the value of the {@code fragmentShadingRateClampCombinerInputs} field. */
    @NativeType("VkBool32")
    public boolean fragmentShadingRateClampCombinerInputs() { return nfragmentShadingRateClampCombinerInputs(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance6Properties sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES} value to the {@code sType} field. */
    public VkPhysicalDeviceMaintenance6Properties sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceMaintenance6Properties pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceMaintenance6Properties set(
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
    public VkPhysicalDeviceMaintenance6Properties set(VkPhysicalDeviceMaintenance6Properties src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceMaintenance6Properties} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance6Properties malloc() {
        return new VkPhysicalDeviceMaintenance6Properties(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance6Properties} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceMaintenance6Properties calloc() {
        return new VkPhysicalDeviceMaintenance6Properties(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance6Properties} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceMaintenance6Properties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMaintenance6Properties(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceMaintenance6Properties} instance for the specified memory address. */
    public static VkPhysicalDeviceMaintenance6Properties create(long address) {
        return new VkPhysicalDeviceMaintenance6Properties(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceMaintenance6Properties createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceMaintenance6Properties(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6Properties.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6Properties.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6Properties.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6Properties.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6Properties.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6Properties.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceMaintenance6Properties.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6Properties.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceMaintenance6Properties.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance6Properties} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance6Properties malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance6Properties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceMaintenance6Properties} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceMaintenance6Properties calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMaintenance6Properties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6Properties.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6Properties.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceMaintenance6Properties.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceMaintenance6Properties.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance6Properties.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceMaintenance6Properties.PNEXT); }
    /** Unsafe version of {@link #blockTexelViewCompatibleMultipleLayers}. */
    public static int nblockTexelViewCompatibleMultipleLayers(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance6Properties.BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS); }
    /** Unsafe version of {@link #maxCombinedImageSamplerDescriptorCount}. */
    public static int nmaxCombinedImageSamplerDescriptorCount(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance6Properties.MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT); }
    /** Unsafe version of {@link #fragmentShadingRateClampCombinerInputs}. */
    public static int nfragmentShadingRateClampCombinerInputs(long struct) { return memGetInt(struct + VkPhysicalDeviceMaintenance6Properties.FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceMaintenance6Properties.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceMaintenance6Properties.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceMaintenance6Properties} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMaintenance6Properties, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceMaintenance6Properties ELEMENT_FACTORY = VkPhysicalDeviceMaintenance6Properties.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceMaintenance6Properties.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceMaintenance6Properties#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceMaintenance6Properties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceMaintenance6Properties.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceMaintenance6Properties.npNext(address()); }
        /** @return the value of the {@code blockTexelViewCompatibleMultipleLayers} field. */
        @NativeType("VkBool32")
        public boolean blockTexelViewCompatibleMultipleLayers() { return VkPhysicalDeviceMaintenance6Properties.nblockTexelViewCompatibleMultipleLayers(address()) != 0; }
        /** @return the value of the {@code maxCombinedImageSamplerDescriptorCount} field. */
        @NativeType("uint32_t")
        public int maxCombinedImageSamplerDescriptorCount() { return VkPhysicalDeviceMaintenance6Properties.nmaxCombinedImageSamplerDescriptorCount(address()); }
        /** @return the value of the {@code fragmentShadingRateClampCombinerInputs} field. */
        @NativeType("VkBool32")
        public boolean fragmentShadingRateClampCombinerInputs() { return VkPhysicalDeviceMaintenance6Properties.nfragmentShadingRateClampCombinerInputs(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance6Properties.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceMaintenance6Properties.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES} value to the {@code sType} field. */
        public VkPhysicalDeviceMaintenance6Properties.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_6_PROPERTIES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceMaintenance6Properties.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceMaintenance6Properties.npNext(address(), value); return this; }

    }

}