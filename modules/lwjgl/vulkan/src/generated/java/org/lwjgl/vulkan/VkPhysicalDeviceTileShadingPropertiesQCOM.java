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
 * struct VkPhysicalDeviceTileShadingPropertiesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t maxApronSize;
 *     VkBool32 preferNonCoherent;
 *     {@link VkExtent2D VkExtent2D} tileGranularity;
 *     {@link VkExtent2D VkExtent2D} maxTileShadingRate;
 * }}</pre>
 */
public class VkPhysicalDeviceTileShadingPropertiesQCOM extends Struct<VkPhysicalDeviceTileShadingPropertiesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        MAXAPRONSIZE,
        PREFERNONCOHERENT,
        TILEGRANULARITY,
        MAXTILESHADINGRATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXAPRONSIZE = layout.offsetof(2);
        PREFERNONCOHERENT = layout.offsetof(3);
        TILEGRANULARITY = layout.offsetof(4);
        MAXTILESHADINGRATE = layout.offsetof(5);
    }

    protected VkPhysicalDeviceTileShadingPropertiesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceTileShadingPropertiesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceTileShadingPropertiesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceTileShadingPropertiesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code maxApronSize} field. */
    @NativeType("uint32_t")
    public int maxApronSize() { return nmaxApronSize(address()); }
    /** @return the value of the {@code preferNonCoherent} field. */
    @NativeType("VkBool32")
    public boolean preferNonCoherent() { return npreferNonCoherent(address()) != 0; }
    /** @return a {@link VkExtent2D} view of the {@code tileGranularity} field. */
    public VkExtent2D tileGranularity() { return ntileGranularity(address()); }
    /** @return a {@link VkExtent2D} view of the {@code maxTileShadingRate} field. */
    public VkExtent2D maxTileShadingRate() { return nmaxTileShadingRate(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceTileShadingPropertiesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMTileShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceTileShadingPropertiesQCOM sType$Default() { return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceTileShadingPropertiesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceTileShadingPropertiesQCOM set(
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
    public VkPhysicalDeviceTileShadingPropertiesQCOM set(VkPhysicalDeviceTileShadingPropertiesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceTileShadingPropertiesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM malloc() {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTileShadingPropertiesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM calloc() {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceTileShadingPropertiesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceTileShadingPropertiesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM create(long address) {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceTileShadingPropertiesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceTileShadingPropertiesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTileShadingPropertiesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceTileShadingPropertiesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileShadingPropertiesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingPropertiesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceTileShadingPropertiesQCOM.PNEXT); }
    /** Unsafe version of {@link #maxApronSize}. */
    public static int nmaxApronSize(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingPropertiesQCOM.MAXAPRONSIZE); }
    /** Unsafe version of {@link #preferNonCoherent}. */
    public static int npreferNonCoherent(long struct) { return memGetInt(struct + VkPhysicalDeviceTileShadingPropertiesQCOM.PREFERNONCOHERENT); }
    /** Unsafe version of {@link #tileGranularity}. */
    public static VkExtent2D ntileGranularity(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceTileShadingPropertiesQCOM.TILEGRANULARITY); }
    /** Unsafe version of {@link #maxTileShadingRate}. */
    public static VkExtent2D nmaxTileShadingRate(long struct) { return VkExtent2D.create(struct + VkPhysicalDeviceTileShadingPropertiesQCOM.MAXTILESHADINGRATE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceTileShadingPropertiesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceTileShadingPropertiesQCOM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceTileShadingPropertiesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTileShadingPropertiesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceTileShadingPropertiesQCOM ELEMENT_FACTORY = VkPhysicalDeviceTileShadingPropertiesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceTileShadingPropertiesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceTileShadingPropertiesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceTileShadingPropertiesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceTileShadingPropertiesQCOM.npNext(address()); }
        /** @return the value of the {@code maxApronSize} field. */
        @NativeType("uint32_t")
        public int maxApronSize() { return VkPhysicalDeviceTileShadingPropertiesQCOM.nmaxApronSize(address()); }
        /** @return the value of the {@code preferNonCoherent} field. */
        @NativeType("VkBool32")
        public boolean preferNonCoherent() { return VkPhysicalDeviceTileShadingPropertiesQCOM.npreferNonCoherent(address()) != 0; }
        /** @return a {@link VkExtent2D} view of the {@code tileGranularity} field. */
        public VkExtent2D tileGranularity() { return VkPhysicalDeviceTileShadingPropertiesQCOM.ntileGranularity(address()); }
        /** @return a {@link VkExtent2D} view of the {@code maxTileShadingRate} field. */
        public VkExtent2D maxTileShadingRate() { return VkPhysicalDeviceTileShadingPropertiesQCOM.nmaxTileShadingRate(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceTileShadingPropertiesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMTileShading#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer sType$Default() { return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_PROPERTIES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceTileShadingPropertiesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceTileShadingPropertiesQCOM.npNext(address(), value); return this; }

    }

}