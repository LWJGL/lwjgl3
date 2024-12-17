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
 * struct VkPhysicalDeviceCooperativeMatrixFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 cooperativeMatrix;
 *     VkBool32 cooperativeMatrixRobustBufferAccess;
 * }}</pre>
 */
public class VkPhysicalDeviceCooperativeMatrixFeaturesKHR extends Struct<VkPhysicalDeviceCooperativeMatrixFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COOPERATIVEMATRIX,
        COOPERATIVEMATRIXROBUSTBUFFERACCESS;

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
        COOPERATIVEMATRIX = layout.offsetof(2);
        COOPERATIVEMATRIXROBUSTBUFFERACCESS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceCooperativeMatrixFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCooperativeMatrixFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeMatrixFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code cooperativeMatrix} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrix() { return ncooperativeMatrix(address()) != 0; }
    /** @return the value of the {@code cooperativeMatrixRobustBufferAccess} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixRobustBufferAccess() { return ncooperativeMatrixRobustBufferAccess(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRCooperativeMatrix#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR sType$Default() { return sType(KHRCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code cooperativeMatrix} field. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR cooperativeMatrix(@NativeType("VkBool32") boolean value) { ncooperativeMatrix(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixRobustBufferAccess} field. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR cooperativeMatrixRobustBufferAccess(@NativeType("VkBool32") boolean value) { ncooperativeMatrixRobustBufferAccess(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR set(
        int sType,
        long pNext,
        boolean cooperativeMatrix,
        boolean cooperativeMatrixRobustBufferAccess
    ) {
        sType(sType);
        pNext(pNext);
        cooperativeMatrix(cooperativeMatrix);
        cooperativeMatrixRobustBufferAccess(cooperativeMatrixRobustBufferAccess);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCooperativeMatrixFeaturesKHR set(VkPhysicalDeviceCooperativeMatrixFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR malloc() {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR calloc() {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR create(long address) {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCooperativeMatrixFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeMatrixFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #cooperativeMatrix}. */
    public static int ncooperativeMatrix(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixFeaturesKHR.COOPERATIVEMATRIX); }
    /** Unsafe version of {@link #cooperativeMatrixRobustBufferAccess}. */
    public static int ncooperativeMatrixRobustBufferAccess(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixFeaturesKHR.COOPERATIVEMATRIXROBUSTBUFFERACCESS); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeMatrixFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #cooperativeMatrix(boolean) cooperativeMatrix}. */
    public static void ncooperativeMatrix(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixFeaturesKHR.COOPERATIVEMATRIX, value); }
    /** Unsafe version of {@link #cooperativeMatrixRobustBufferAccess(boolean) cooperativeMatrixRobustBufferAccess}. */
    public static void ncooperativeMatrixRobustBufferAccess(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixFeaturesKHR.COOPERATIVEMATRIXROBUSTBUFFERACCESS, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrixFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCooperativeMatrixFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrixFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeMatrixFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCooperativeMatrixFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code cooperativeMatrix} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrix() { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.ncooperativeMatrix(address()) != 0; }
        /** @return the value of the {@code cooperativeMatrixRobustBufferAccess} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixRobustBufferAccess() { return VkPhysicalDeviceCooperativeMatrixFeaturesKHR.ncooperativeMatrixRobustBufferAccess(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRCooperativeMatrix#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer sType$Default() { return sType(KHRCooperativeMatrix.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code cooperativeMatrix} field. */
        public VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer cooperativeMatrix(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.ncooperativeMatrix(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixRobustBufferAccess} field. */
        public VkPhysicalDeviceCooperativeMatrixFeaturesKHR.Buffer cooperativeMatrixRobustBufferAccess(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrixFeaturesKHR.ncooperativeMatrixRobustBufferAccess(address(), value ? 1 : 0); return this; }

    }

}