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
 * struct VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 cooperativeMatrixDecodeVector;
 * }}</pre>
 */
public class VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV extends Struct<VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COOPERATIVEMATRIXDECODEVECTOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEMATRIXDECODEVECTOR = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code cooperativeMatrixDecodeVector} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixDecodeVector() { return ncooperativeMatrixDecodeVector(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCooperativeMatrixDecodeVector#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_DECODE_VECTOR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_DECODE_VECTOR_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV sType$Default() { return sType(NVCooperativeMatrixDecodeVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_DECODE_VECTOR_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixDecodeVector} field. */
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV cooperativeMatrixDecodeVector(@NativeType("VkBool32") boolean value) { ncooperativeMatrixDecodeVector(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV set(
        int sType,
        long pNext,
        boolean cooperativeMatrixDecodeVector
    ) {
        sType(sType);
        pNext(pNext);
        cooperativeMatrixDecodeVector(cooperativeMatrixDecodeVector);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV set(VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV malloc() {
        return new VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV calloc() {
        return new VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV create(long address) {
        return new VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #cooperativeMatrixDecodeVector}. */
    public static int ncooperativeMatrixDecodeVector(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.COOPERATIVEMATRIXDECODEVECTOR); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #cooperativeMatrixDecodeVector(boolean) cooperativeMatrixDecodeVector}. */
    public static void ncooperativeMatrixDecodeVector(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.COOPERATIVEMATRIXDECODEVECTOR, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.npNext(address()); }
        /** @return the value of the {@code cooperativeMatrixDecodeVector} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixDecodeVector() { return VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.ncooperativeMatrixDecodeVector(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCooperativeMatrixDecodeVector#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_DECODE_VECTOR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_DECODE_VECTOR_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer sType$Default() { return sType(NVCooperativeMatrixDecodeVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_DECODE_VECTOR_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixDecodeVector} field. */
        public VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.Buffer cooperativeMatrixDecodeVector(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrixDecodeVectorFeaturesNV.ncooperativeMatrixDecodeVector(address(), value ? 1 : 0); return this; }

    }

}