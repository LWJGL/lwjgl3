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
 * struct VkPhysicalDeviceDepthClampZeroOneFeaturesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 depthClampZeroOne;
 * }}</pre>
 */
public class VkPhysicalDeviceDepthClampZeroOneFeaturesKHR extends Struct<VkPhysicalDeviceDepthClampZeroOneFeaturesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEPTHCLAMPZEROONE;

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
        DEPTHCLAMPZEROONE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceDepthClampZeroOneFeaturesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(ByteBuffer container) {
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
    /** @return the value of the {@code depthClampZeroOne} field. */
    @NativeType("VkBool32")
    public boolean depthClampZeroOne() { return ndepthClampZeroOne(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRDepthClampZeroOne#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR sType$Default() { return sType(KHRDepthClampZeroOne.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code depthClampZeroOne} field. */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR depthClampZeroOne(@NativeType("VkBool32") boolean value) { ndepthClampZeroOne(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR set(
        int sType,
        long pNext,
        boolean depthClampZeroOne
    ) {
        sType(sType);
        pNext(pNext);
        depthClampZeroOne(depthClampZeroOne);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR set(VkPhysicalDeviceDepthClampZeroOneFeaturesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR malloc() {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR calloc() {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR create(long address) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceDepthClampZeroOneFeaturesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthClampZeroOneFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.PNEXT); }
    /** Unsafe version of {@link #depthClampZeroOne}. */
    public static int ndepthClampZeroOne(long struct) { return memGetInt(struct + VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.DEPTHCLAMPZEROONE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.PNEXT, value); }
    /** Unsafe version of {@link #depthClampZeroOne(boolean) depthClampZeroOne}. */
    public static void ndepthClampZeroOne(long struct, int value) { memPutInt(struct + VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.DEPTHCLAMPZEROONE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDepthClampZeroOneFeaturesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceDepthClampZeroOneFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceDepthClampZeroOneFeaturesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceDepthClampZeroOneFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.npNext(address()); }
        /** @return the value of the {@code depthClampZeroOne} field. */
        @NativeType("VkBool32")
        public boolean depthClampZeroOne() { return VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.ndepthClampZeroOne(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRDepthClampZeroOne#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer sType$Default() { return sType(KHRDepthClampZeroOne.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLAMP_ZERO_ONE_FEATURES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code depthClampZeroOne} field. */
        public VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.Buffer depthClampZeroOne(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceDepthClampZeroOneFeaturesKHR.ndepthClampZeroOne(address(), value ? 1 : 0); return this; }

    }

}