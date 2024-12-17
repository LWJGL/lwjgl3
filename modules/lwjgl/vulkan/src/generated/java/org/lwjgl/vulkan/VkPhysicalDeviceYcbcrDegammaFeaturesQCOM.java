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
 * struct VkPhysicalDeviceYcbcrDegammaFeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 ycbcrDegamma;
 * }}</pre>
 */
public class VkPhysicalDeviceYcbcrDegammaFeaturesQCOM extends Struct<VkPhysicalDeviceYcbcrDegammaFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        YCBCRDEGAMMA;

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
        YCBCRDEGAMMA = layout.offsetof(2);
    }

    protected VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceYcbcrDegammaFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code ycbcrDegamma} field. */
    @NativeType("VkBool32")
    public boolean ycbcrDegamma() { return nycbcrDegamma(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMYcbcrDegamma#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM sType$Default() { return sType(QCOMYcbcrDegamma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcrDegamma} field. */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM ycbcrDegamma(@NativeType("VkBool32") boolean value) { nycbcrDegamma(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM set(
        int sType,
        long pNext,
        boolean ycbcrDegamma
    ) {
        sType(sType);
        pNext(pNext);
        ycbcrDegamma(ycbcrDegamma);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM set(VkPhysicalDeviceYcbcrDegammaFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM malloc() {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM calloc() {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceYcbcrDegammaFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #ycbcrDegamma}. */
    public static int nycbcrDegamma(long struct) { return memGetInt(struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.YCBCRDEGAMMA); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #ycbcrDegamma(boolean) ycbcrDegamma}. */
    public static void nycbcrDegamma(long struct, int value) { memPutInt(struct + VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.YCBCRDEGAMMA, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceYcbcrDegammaFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceYcbcrDegammaFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceYcbcrDegammaFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceYcbcrDegammaFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@code ycbcrDegamma} field. */
        @NativeType("VkBool32")
        public boolean ycbcrDegamma() { return VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nycbcrDegamma(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMYcbcrDegamma#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer sType$Default() { return sType(QCOMYcbcrDegamma.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcrDegamma} field. */
        public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.Buffer ycbcrDegamma(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.nycbcrDegamma(address(), value ? 1 : 0); return this; }

    }

}