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
 * struct VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 cooperativeMatrixConversion;
 * }}</pre>
 */
public class VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM extends Struct<VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        COOPERATIVEMATRIXCONVERSION;

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
        COOPERATIVEMATRIXCONVERSION = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code cooperativeMatrixConversion} field. */
    @NativeType("VkBool32")
    public boolean cooperativeMatrixConversion() { return ncooperativeMatrixConversion(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMCooperativeMatrixConversion#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_CONVERSION_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_CONVERSION_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM sType$Default() { return sType(QCOMCooperativeMatrixConversion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_CONVERSION_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code cooperativeMatrixConversion} field. */
    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM cooperativeMatrixConversion(@NativeType("VkBool32") boolean value) { ncooperativeMatrixConversion(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM set(
        int sType,
        long pNext,
        boolean cooperativeMatrixConversion
    ) {
        sType(sType);
        pNext(pNext);
        cooperativeMatrixConversion(cooperativeMatrixConversion);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM set(VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM malloc() {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM calloc() {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #cooperativeMatrixConversion}. */
    public static int ncooperativeMatrixConversion(long struct) { return memGetInt(struct + VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.COOPERATIVEMATRIXCONVERSION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #cooperativeMatrixConversion(boolean) cooperativeMatrixConversion}. */
    public static void ncooperativeMatrixConversion(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.COOPERATIVEMATRIXCONVERSION, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@code cooperativeMatrixConversion} field. */
        @NativeType("VkBool32")
        public boolean cooperativeMatrixConversion() { return VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.ncooperativeMatrixConversion(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMCooperativeMatrixConversion#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_CONVERSION_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_CONVERSION_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer sType$Default() { return sType(QCOMCooperativeMatrixConversion.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_CONVERSION_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code cooperativeMatrixConversion} field. */
        public VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.Buffer cooperativeMatrixConversion(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCooperativeMatrixConversionFeaturesQCOM.ncooperativeMatrixConversion(address(), value ? 1 : 0); return this; }

    }

}