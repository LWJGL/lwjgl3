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
 * struct VkPhysicalDeviceCooperativeVectorFeaturesNV {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 cooperativeVector;
 *     VkBool32 cooperativeVectorTraining;
 * }}</pre>
 */
public class VkPhysicalDeviceCooperativeVectorFeaturesNV extends Struct<VkPhysicalDeviceCooperativeVectorFeaturesNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COOPERATIVEVECTOR,
        COOPERATIVEVECTORTRAINING;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COOPERATIVEVECTOR = layout.offsetof(2);
        COOPERATIVEVECTORTRAINING = layout.offsetof(3);
    }

    protected VkPhysicalDeviceCooperativeVectorFeaturesNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCooperativeVectorFeaturesNV create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeVectorFeaturesNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeVectorFeaturesNV(ByteBuffer container) {
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
    /** @return the value of the {@code cooperativeVector} field. */
    @NativeType("VkBool32")
    public boolean cooperativeVector() { return ncooperativeVector(address()) != 0; }
    /** @return the value of the {@code cooperativeVectorTraining} field. */
    @NativeType("VkBool32")
    public boolean cooperativeVectorTraining() { return ncooperativeVectorTraining(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeVectorFeaturesNV sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVCooperativeVector#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV} value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeVectorFeaturesNV sType$Default() { return sType(NVCooperativeVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCooperativeVectorFeaturesNV pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code cooperativeVector} field. */
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVector(@NativeType("VkBool32") boolean value) { ncooperativeVector(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeVectorTraining} field. */
    public VkPhysicalDeviceCooperativeVectorFeaturesNV cooperativeVectorTraining(@NativeType("VkBool32") boolean value) { ncooperativeVectorTraining(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeVectorFeaturesNV set(
        int sType,
        long pNext,
        boolean cooperativeVector,
        boolean cooperativeVectorTraining
    ) {
        sType(sType);
        pNext(pNext);
        cooperativeVector(cooperativeVector);
        cooperativeVectorTraining(cooperativeVectorTraining);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCooperativeVectorFeaturesNV set(VkPhysicalDeviceCooperativeVectorFeaturesNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeVectorFeaturesNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV malloc() {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeVectorFeaturesNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV calloc() {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeVectorFeaturesNV} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeVectorFeaturesNV} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV create(long address) {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCooperativeVectorFeaturesNV createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCooperativeVectorFeaturesNV(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeVectorFeaturesNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeVectorFeaturesNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeVectorFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeVectorFeaturesNV.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeVectorFeaturesNV.PNEXT); }
    /** Unsafe version of {@link #cooperativeVector}. */
    public static int ncooperativeVector(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeVectorFeaturesNV.COOPERATIVEVECTOR); }
    /** Unsafe version of {@link #cooperativeVectorTraining}. */
    public static int ncooperativeVectorTraining(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeVectorFeaturesNV.COOPERATIVEVECTORTRAINING); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeVectorFeaturesNV.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeVectorFeaturesNV.PNEXT, value); }
    /** Unsafe version of {@link #cooperativeVector(boolean) cooperativeVector}. */
    public static void ncooperativeVector(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeVectorFeaturesNV.COOPERATIVEVECTOR, value); }
    /** Unsafe version of {@link #cooperativeVectorTraining(boolean) cooperativeVectorTraining}. */
    public static void ncooperativeVectorTraining(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeVectorFeaturesNV.COOPERATIVEVECTORTRAINING, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeVectorFeaturesNV} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeVectorFeaturesNV, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCooperativeVectorFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceCooperativeVectorFeaturesNV.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeVectorFeaturesNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCooperativeVectorFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeVectorFeaturesNV.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCooperativeVectorFeaturesNV.npNext(address()); }
        /** @return the value of the {@code cooperativeVector} field. */
        @NativeType("VkBool32")
        public boolean cooperativeVector() { return VkPhysicalDeviceCooperativeVectorFeaturesNV.ncooperativeVector(address()) != 0; }
        /** @return the value of the {@code cooperativeVectorTraining} field. */
        @NativeType("VkBool32")
        public boolean cooperativeVectorTraining() { return VkPhysicalDeviceCooperativeVectorFeaturesNV.ncooperativeVectorTraining(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeVectorFeaturesNV.nsType(address(), value); return this; }
        /** Sets the {@link NVCooperativeVector#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV} value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer sType$Default() { return sType(NVCooperativeVector.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_VECTOR_FEATURES_NV); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCooperativeVectorFeaturesNV.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code cooperativeVector} field. */
        public VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer cooperativeVector(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeVectorFeaturesNV.ncooperativeVector(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeVectorTraining} field. */
        public VkPhysicalDeviceCooperativeVectorFeaturesNV.Buffer cooperativeVectorTraining(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeVectorFeaturesNV.ncooperativeVectorTraining(address(), value ? 1 : 0); return this; }

    }

}