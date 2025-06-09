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
 * struct VkTensorFormatPropertiesARM {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkFormatFeatureFlags2 optimalTilingTensorFeatures;
 *     VkFormatFeatureFlags2 linearTilingTensorFeatures;
 * }}</pre>
 */
public class VkTensorFormatPropertiesARM extends Struct<VkTensorFormatPropertiesARM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        OPTIMALTILINGTENSORFEATURES,
        LINEARTILINGTENSORFEATURES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OPTIMALTILINGTENSORFEATURES = layout.offsetof(2);
        LINEARTILINGTENSORFEATURES = layout.offsetof(3);
    }

    protected VkTensorFormatPropertiesARM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkTensorFormatPropertiesARM create(long address, @Nullable ByteBuffer container) {
        return new VkTensorFormatPropertiesARM(address, container);
    }

    /**
     * Creates a {@code VkTensorFormatPropertiesARM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkTensorFormatPropertiesARM(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code optimalTilingTensorFeatures} field. */
    @NativeType("VkFormatFeatureFlags2")
    public long optimalTilingTensorFeatures() { return noptimalTilingTensorFeatures(address()); }
    /** @return the value of the {@code linearTilingTensorFeatures} field. */
    @NativeType("VkFormatFeatureFlags2")
    public long linearTilingTensorFeatures() { return nlinearTilingTensorFeatures(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkTensorFormatPropertiesARM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM} value to the {@code sType} field. */
    public VkTensorFormatPropertiesARM sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkTensorFormatPropertiesARM pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkTensorFormatPropertiesARM set(
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
    public VkTensorFormatPropertiesARM set(VkTensorFormatPropertiesARM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkTensorFormatPropertiesARM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkTensorFormatPropertiesARM malloc() {
        return new VkTensorFormatPropertiesARM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkTensorFormatPropertiesARM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkTensorFormatPropertiesARM calloc() {
        return new VkTensorFormatPropertiesARM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkTensorFormatPropertiesARM} instance allocated with {@link BufferUtils}. */
    public static VkTensorFormatPropertiesARM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTensorFormatPropertiesARM(memAddress(container), container);
    }

    /** Returns a new {@code VkTensorFormatPropertiesARM} instance for the specified memory address. */
    public static VkTensorFormatPropertiesARM create(long address) {
        return new VkTensorFormatPropertiesARM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkTensorFormatPropertiesARM createSafe(long address) {
        return address == NULL ? null : new VkTensorFormatPropertiesARM(address, null);
    }

    /**
     * Returns a new {@link VkTensorFormatPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorFormatPropertiesARM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkTensorFormatPropertiesARM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorFormatPropertiesARM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorFormatPropertiesARM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkTensorFormatPropertiesARM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkTensorFormatPropertiesARM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkTensorFormatPropertiesARM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkTensorFormatPropertiesARM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkTensorFormatPropertiesARM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorFormatPropertiesARM malloc(MemoryStack stack) {
        return new VkTensorFormatPropertiesARM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkTensorFormatPropertiesARM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkTensorFormatPropertiesARM calloc(MemoryStack stack) {
        return new VkTensorFormatPropertiesARM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkTensorFormatPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorFormatPropertiesARM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkTensorFormatPropertiesARM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkTensorFormatPropertiesARM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkTensorFormatPropertiesARM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkTensorFormatPropertiesARM.PNEXT); }
    /** Unsafe version of {@link #optimalTilingTensorFeatures}. */
    public static long noptimalTilingTensorFeatures(long struct) { return memGetLong(struct + VkTensorFormatPropertiesARM.OPTIMALTILINGTENSORFEATURES); }
    /** Unsafe version of {@link #linearTilingTensorFeatures}. */
    public static long nlinearTilingTensorFeatures(long struct) { return memGetLong(struct + VkTensorFormatPropertiesARM.LINEARTILINGTENSORFEATURES); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkTensorFormatPropertiesARM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkTensorFormatPropertiesARM.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkTensorFormatPropertiesARM} structs. */
    public static class Buffer extends StructBuffer<VkTensorFormatPropertiesARM, Buffer> implements NativeResource {

        private static final VkTensorFormatPropertiesARM ELEMENT_FACTORY = VkTensorFormatPropertiesARM.create(-1L);

        /**
         * Creates a new {@code VkTensorFormatPropertiesARM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkTensorFormatPropertiesARM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkTensorFormatPropertiesARM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkTensorFormatPropertiesARM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkTensorFormatPropertiesARM.npNext(address()); }
        /** @return the value of the {@code optimalTilingTensorFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long optimalTilingTensorFeatures() { return VkTensorFormatPropertiesARM.noptimalTilingTensorFeatures(address()); }
        /** @return the value of the {@code linearTilingTensorFeatures} field. */
        @NativeType("VkFormatFeatureFlags2")
        public long linearTilingTensorFeatures() { return VkTensorFormatPropertiesARM.nlinearTilingTensorFeatures(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkTensorFormatPropertiesARM.Buffer sType(@NativeType("VkStructureType") int value) { VkTensorFormatPropertiesARM.nsType(address(), value); return this; }
        /** Sets the {@link ARMTensors#VK_STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM} value to the {@code sType} field. */
        public VkTensorFormatPropertiesARM.Buffer sType$Default() { return sType(ARMTensors.VK_STRUCTURE_TYPE_TENSOR_FORMAT_PROPERTIES_ARM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkTensorFormatPropertiesARM.Buffer pNext(@NativeType("void const *") long value) { VkTensorFormatPropertiesARM.npNext(address(), value); return this; }

    }

}