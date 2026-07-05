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
 * struct VkTensorExplicitTilingFormatPropertiesARM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkFormatFeatureFlags2 brick16TilingTensorFeatures;
 *     VkFormatFeatureFlags2 brick8TilingTensorFeatures;
 *     VkFormatFeatureFlags2 brick4TilingTensorFeatures;
 *     VkFormatFeatureFlags2 blockUTilingTensorFeatures;
 *     VkFormatFeatureFlags2 blockU64kTilingTensorFeatures;
 * }}</pre>
 */
public class VkTensorExplicitTilingFormatPropertiesARM extends Struct<VkTensorExplicitTilingFormatPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        BRICK16TILINGTENSORFEATURES,
        BRICK8TILINGTENSORFEATURES,
        BRICK4TILINGTENSORFEATURES,
        BLOCKUTILINGTENSORFEATURES,
        BLOCKU64KTILINGTENSORFEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        BRICK16TILINGTENSORFEATURES = layout.offsetof(2);
        BRICK8TILINGTENSORFEATURES = layout.offsetof(3);
        BRICK4TILINGTENSORFEATURES = layout.offsetof(4);
        BLOCKUTILINGTENSORFEATURES = layout.offsetof(5);
        BLOCKU64KTILINGTENSORFEATURES = layout.offsetof(6);
    }

    protected VkTensorExplicitTilingFormatPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTensorExplicitTilingFormatPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkTensorExplicitTilingFormatPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkTensorExplicitTilingFormatPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTensorExplicitTilingFormatPropertiesARM(ByteBuffer container) {
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
    /** @return the value of the {@code brick16TilingTensorFeatures} field. */
    @NativeType("VkFormatFeatureFlags2")
    public long brick16TilingTensorFeatures() { return nbrick16TilingTensorFeatures(address()); }
    /** @return the value of the {@code brick8TilingTensorFeatures} field. */
    @NativeType("VkFormatFeatureFlags2")
    public long brick8TilingTensorFeatures() { return nbrick8TilingTensorFeatures(address()); }
    /** @return the value of the {@code brick4TilingTensorFeatures} field. */
    @NativeType("VkFormatFeatureFlags2")
    public long brick4TilingTensorFeatures() { return nbrick4TilingTensorFeatures(address()); }
    /** @return the value of the {@code blockUTilingTensorFeatures} field. */
    @NativeType("VkFormatFeatureFlags2")
    public long blockUTilingTensorFeatures() { return nblockUTilingTensorFeatures(address()); }
    /** @return the value of the {@code blockU64kTilingTensorFeatures} field. */
    @NativeType("VkFormatFeatureFlags2")
    public long blockU64kTilingTensorFeatures() { return nblockU64kTilingTensorFeatures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTensorExplicitTilingFormatPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensorControls#VK_STRUCTURE_TYPE_TENSOR_EXPLICIT_TILING_FORMAT_PROPERTIES_ARM STRUCTURE_TYPE_TENSOR_EXPLICIT_TILING_FORMAT_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkTensorExplicitTilingFormatPropertiesARM sType$Default() { return sType(ARMTensorControls.VK_STRUCTURE_TYPE_TENSOR_EXPLICIT_TILING_FORMAT_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTensorExplicitTilingFormatPropertiesARM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTensorExplicitTilingFormatPropertiesARM set(
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
    public VkTensorExplicitTilingFormatPropertiesARM set(VkTensorExplicitTilingFormatPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTensorExplicitTilingFormatPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTensorExplicitTilingFormatPropertiesARM malloc() {
        return new VkTensorExplicitTilingFormatPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTensorExplicitTilingFormatPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTensorExplicitTilingFormatPropertiesARM calloc() {
        return new VkTensorExplicitTilingFormatPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTensorExplicitTilingFormatPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkTensorExplicitTilingFormatPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorExplicitTilingFormatPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkTensorExplicitTilingFormatPropertiesARM} instance for the specified memory address. */
    public static VkTensorExplicitTilingFormatPropertiesARM create(long address) {
        return new VkTensorExplicitTilingFormatPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTensorExplicitTilingFormatPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkTensorExplicitTilingFormatPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkTensorExplicitTilingFormatPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorExplicitTilingFormatPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTensorExplicitTilingFormatPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorExplicitTilingFormatPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorExplicitTilingFormatPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorExplicitTilingFormatPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTensorExplicitTilingFormatPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTensorExplicitTilingFormatPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTensorExplicitTilingFormatPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTensorExplicitTilingFormatPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorExplicitTilingFormatPropertiesARM malloc(MemoryStack stack) {
        return new VkTensorExplicitTilingFormatPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTensorExplicitTilingFormatPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorExplicitTilingFormatPropertiesARM calloc(MemoryStack stack) {
        return new VkTensorExplicitTilingFormatPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTensorExplicitTilingFormatPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorExplicitTilingFormatPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorExplicitTilingFormatPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorExplicitTilingFormatPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTensorExplicitTilingFormatPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTensorExplicitTilingFormatPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #brick16TilingTensorFeatures}. */
    public static long nbrick16TilingTensorFeatures(long struct) { return memGetLong(struct + VkTensorExplicitTilingFormatPropertiesARM.BRICK16TILINGTENSORFEATURES); }
    /** Unsafe version of {@link #brick8TilingTensorFeatures}. */
    public static long nbrick8TilingTensorFeatures(long struct) { return memGetLong(struct + VkTensorExplicitTilingFormatPropertiesARM.BRICK8TILINGTENSORFEATURES); }
    /** Unsafe version of {@link #brick4TilingTensorFeatures}. */
    public static long nbrick4TilingTensorFeatures(long struct) { return memGetLong(struct + VkTensorExplicitTilingFormatPropertiesARM.BRICK4TILINGTENSORFEATURES); }
    /** Unsafe version of {@link #blockUTilingTensorFeatures}. */
    public static long nblockUTilingTensorFeatures(long struct) { return memGetLong(struct + VkTensorExplicitTilingFormatPropertiesARM.BLOCKUTILINGTENSORFEATURES); }
    /** Unsafe version of {@link #blockU64kTilingTensorFeatures}. */
    public static long nblockU64kTilingTensorFeatures(long struct) { return memGetLong(struct + VkTensorExplicitTilingFormatPropertiesARM.BLOCKU64KTILINGTENSORFEATURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTensorExplicitTilingFormatPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTensorExplicitTilingFormatPropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkTensorExplicitTilingFormatPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkTensorExplicitTilingFormatPropertiesARM, Buffer> implements NativeResource {

        private static final VkTensorExplicitTilingFormatPropertiesARM ELEMENT_FACTORY = VkTensorExplicitTilingFormatPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkTensorExplicitTilingFormatPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTensorExplicitTilingFormatPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTensorExplicitTilingFormatPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTensorExplicitTilingFormatPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkTensorExplicitTilingFormatPropertiesARM.npNext(address()); }
        /** @return the value of the {@code brick16TilingTensorFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long brick16TilingTensorFeatures() { return VkTensorExplicitTilingFormatPropertiesARM.nbrick16TilingTensorFeatures(address()); }
        /** @return the value of the {@code brick8TilingTensorFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long brick8TilingTensorFeatures() { return VkTensorExplicitTilingFormatPropertiesARM.nbrick8TilingTensorFeatures(address()); }
        /** @return the value of the {@code brick4TilingTensorFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long brick4TilingTensorFeatures() { return VkTensorExplicitTilingFormatPropertiesARM.nbrick4TilingTensorFeatures(address()); }
        /** @return the value of the {@code blockUTilingTensorFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long blockUTilingTensorFeatures() { return VkTensorExplicitTilingFormatPropertiesARM.nblockUTilingTensorFeatures(address()); }
        /** @return the value of the {@code blockU64kTilingTensorFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long blockU64kTilingTensorFeatures() { return VkTensorExplicitTilingFormatPropertiesARM.nblockU64kTilingTensorFeatures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTensorExplicitTilingFormatPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkTensorExplicitTilingFormatPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensorControls#VK_STRUCTURE_TYPE_TENSOR_EXPLICIT_TILING_FORMAT_PROPERTIES_ARM STRUCTURE_TYPE_TENSOR_EXPLICIT_TILING_FORMAT_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkTensorExplicitTilingFormatPropertiesARM.Buffer sType$Default() { return sType(ARMTensorControls.VK_STRUCTURE_TYPE_TENSOR_EXPLICIT_TILING_FORMAT_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTensorExplicitTilingFormatPropertiesARM.Buffer pNext(@NativeType("void *") long value) { VkTensorExplicitTilingFormatPropertiesARM.npNext(address(), value); return this; }

    }

}