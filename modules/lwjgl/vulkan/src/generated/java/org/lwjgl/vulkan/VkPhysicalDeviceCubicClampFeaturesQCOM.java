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
 * struct VkPhysicalDeviceCubicClampFeaturesQCOM {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 cubicRangeClamp;
 * }}</pre>
 */
public class VkPhysicalDeviceCubicClampFeaturesQCOM extends Struct<VkPhysicalDeviceCubicClampFeaturesQCOM> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        CUBICRANGECLAMP;

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
        CUBICRANGECLAMP = layout.offsetof(2);
    }

    protected VkPhysicalDeviceCubicClampFeaturesQCOM(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceCubicClampFeaturesQCOM create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceCubicClampFeaturesQCOM(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceCubicClampFeaturesQCOM} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceCubicClampFeaturesQCOM(ByteBuffer container) {
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
    /** @return the value of the {@code cubicRangeClamp} field. */
    @NativeType("VkBool32")
    public boolean cubicRangeClamp() { return ncubicRangeClamp(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceCubicClampFeaturesQCOM sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link QCOMFilterCubicClamp#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM} value to the {@code sType} field. */
    public VkPhysicalDeviceCubicClampFeaturesQCOM sType$Default() { return sType(QCOMFilterCubicClamp.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceCubicClampFeaturesQCOM pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code cubicRangeClamp} field. */
    public VkPhysicalDeviceCubicClampFeaturesQCOM cubicRangeClamp(@NativeType("VkBool32") boolean value) { ncubicRangeClamp(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceCubicClampFeaturesQCOM set(
        int sType,
        long pNext,
        boolean cubicRangeClamp
    ) {
        sType(sType);
        pNext(pNext);
        cubicRangeClamp(cubicRangeClamp);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceCubicClampFeaturesQCOM set(VkPhysicalDeviceCubicClampFeaturesQCOM src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceCubicClampFeaturesQCOM} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM malloc() {
        return new VkPhysicalDeviceCubicClampFeaturesQCOM(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCubicClampFeaturesQCOM} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM calloc() {
        return new VkPhysicalDeviceCubicClampFeaturesQCOM(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceCubicClampFeaturesQCOM} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceCubicClampFeaturesQCOM(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceCubicClampFeaturesQCOM} instance for the specified memory address. */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceCubicClampFeaturesQCOM(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceCubicClampFeaturesQCOM createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceCubicClampFeaturesQCOM(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCubicClampFeaturesQCOM} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceCubicClampFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceCubicClampFeaturesQCOM} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceCubicClampFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceCubicClampFeaturesQCOM.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceCubicClampFeaturesQCOM.PNEXT); }
    /** Unsafe version of {@link #cubicRangeClamp}. */
    public static int ncubicRangeClamp(long struct) { return memGetInt(struct + VkPhysicalDeviceCubicClampFeaturesQCOM.CUBICRANGECLAMP); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCubicClampFeaturesQCOM.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceCubicClampFeaturesQCOM.PNEXT, value); }
    /** Unsafe version of {@link #cubicRangeClamp(boolean) cubicRangeClamp}. */
    public static void ncubicRangeClamp(long struct, int value) { memPutInt(struct + VkPhysicalDeviceCubicClampFeaturesQCOM.CUBICRANGECLAMP, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceCubicClampFeaturesQCOM} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceCubicClampFeaturesQCOM, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceCubicClampFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceCubicClampFeaturesQCOM.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceCubicClampFeaturesQCOM#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceCubicClampFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceCubicClampFeaturesQCOM.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceCubicClampFeaturesQCOM.npNext(address()); }
        /** @return the value of the {@code cubicRangeClamp} field. */
        @NativeType("VkBool32")
        public boolean cubicRangeClamp() { return VkPhysicalDeviceCubicClampFeaturesQCOM.ncubicRangeClamp(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceCubicClampFeaturesQCOM.nsType(address(), value); return this; }
        /** Sets the {@link QCOMFilterCubicClamp#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM} value to the {@code sType} field. */
        public VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer sType$Default() { return sType(QCOMFilterCubicClamp.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceCubicClampFeaturesQCOM.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code cubicRangeClamp} field. */
        public VkPhysicalDeviceCubicClampFeaturesQCOM.Buffer cubicRangeClamp(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceCubicClampFeaturesQCOM.ncubicRangeClamp(address(), value ? 1 : 0); return this; }

    }

}