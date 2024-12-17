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
 * struct VkPhysicalDeviceCooperativeMatrix2PropertiesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t cooperativeMatrixWorkgroupScopeMaxWorkgroupSize;
 *     uint32_t cooperativeMatrixFlexibleDimensionsMaxDimension;
 *     uint32_t cooperativeMatrixWorkgroupScopeReservedSharedMemory;
 * }}</pre>
 */
public class VkPhysicalDeviceCooperativeMatrix2PropertiesNV extends Struct<VkPhysicalDeviceCooperativeMatrix2PropertiesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COOPERATIVEMATRIXWORKGROUPSCOPEMAXWORKGROUPSIZE,
        COOPERATIVEMATRIXFLEXIBLEDIMENSIONSMAXDIMENSION,
        COOPERATIVEMATRIXWORKGROUPSCOPERESERVEDSHAREDMEMORY;

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
        COOPERATIVEMATRIXWORKGROUPSCOPEMAXWORKGROUPSIZE = layout.offsetof(2);
        COOPERATIVEMATRIXFLEXIBLEDIMENSIONSMAXDIMENSION = layout.offsetof(3);
        COOPERATIVEMATRIXWORKGROUPSCOPERESERVEDSHAREDMEMORY = layout.offsetof(4);
    }

    protected VkPhysicalDeviceCooperativeMatrix2PropertiesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCooperativeMatrix2PropertiesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeMatrix2PropertiesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV(ByteBuffer container) {
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
    /** @return the value of the {@code cooperativeMatrixWorkgroupScopeMaxWorkgroupSize} field. */
    @NativeType("uint32_t")
    public int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize() { return ncooperativeMatrixWorkgroupScopeMaxWorkgroupSize(address()); }
    /** @return the value of the {@code cooperativeMatrixFlexibleDimensionsMaxDimension} field. */
    @NativeType("uint32_t")
    public int cooperativeMatrixFlexibleDimensionsMaxDimension() { return ncooperativeMatrixFlexibleDimensionsMaxDimension(address()); }
    /** @return the value of the {@code cooperativeMatrixWorkgroupScopeReservedSharedMemory} field. */
    @NativeType("uint32_t")
    public int cooperativeMatrixWorkgroupScopeReservedSharedMemory() { return ncooperativeMatrixWorkgroupScopeReservedSharedMemory(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCooperativeMatrix2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV sType$Default() { return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV set(
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
    public VkPhysicalDeviceCooperativeMatrix2PropertiesNV set(VkPhysicalDeviceCooperativeMatrix2PropertiesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrix2PropertiesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV malloc() {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrix2PropertiesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV calloc() {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrix2PropertiesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrix2PropertiesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV create(long address) {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCooperativeMatrix2PropertiesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrix2PropertiesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrix2PropertiesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrix2PropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2PropertiesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeMatrix2PropertiesNV.PNEXT); }
    /** Unsafe version of {@link #cooperativeMatrixWorkgroupScopeMaxWorkgroupSize}. */
    public static int ncooperativeMatrixWorkgroupScopeMaxWorkgroupSize(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2PropertiesNV.COOPERATIVEMATRIXWORKGROUPSCOPEMAXWORKGROUPSIZE); }
    /** Unsafe version of {@link #cooperativeMatrixFlexibleDimensionsMaxDimension}. */
    public static int ncooperativeMatrixFlexibleDimensionsMaxDimension(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2PropertiesNV.COOPERATIVEMATRIXFLEXIBLEDIMENSIONSMAXDIMENSION); }
    /** Unsafe version of {@link #cooperativeMatrixWorkgroupScopeReservedSharedMemory}. */
    public static int ncooperativeMatrixWorkgroupScopeReservedSharedMemory(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrix2PropertiesNV.COOPERATIVEMATRIXWORKGROUPSCOPERESERVEDSHAREDMEMORY); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrix2PropertiesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeMatrix2PropertiesNV.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeMatrix2PropertiesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrix2PropertiesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCooperativeMatrix2PropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrix2PropertiesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeMatrix2PropertiesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCooperativeMatrix2PropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.npNext(address()); }
        /** @return the value of the {@code cooperativeMatrixWorkgroupScopeMaxWorkgroupSize} field. */
        @NativeType("uint32_t")
        public int cooperativeMatrixWorkgroupScopeMaxWorkgroupSize() { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.ncooperativeMatrixWorkgroupScopeMaxWorkgroupSize(address()); }
        /** @return the value of the {@code cooperativeMatrixFlexibleDimensionsMaxDimension} field. */
        @NativeType("uint32_t")
        public int cooperativeMatrixFlexibleDimensionsMaxDimension() { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.ncooperativeMatrixFlexibleDimensionsMaxDimension(address()); }
        /** @return the value of the {@code cooperativeMatrixWorkgroupScopeReservedSharedMemory} field. */
        @NativeType("uint32_t")
        public int cooperativeMatrixWorkgroupScopeReservedSharedMemory() { return VkPhysicalDeviceCooperativeMatrix2PropertiesNV.ncooperativeMatrixWorkgroupScopeReservedSharedMemory(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCooperativeMatrix2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer sType$Default() { return sType(NVCooperativeMatrix2.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_2_PROPERTIES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCooperativeMatrix2PropertiesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCooperativeMatrix2PropertiesNV.npNext(address(), value); return this; }

    }

}