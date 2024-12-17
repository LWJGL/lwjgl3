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
 * struct VkPhysicalDeviceHostQueryResetFeatures {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 hostQueryReset;
 * }}</pre>
 */
public class VkPhysicalDeviceHostQueryResetFeatures extends Struct<VkPhysicalDeviceHostQueryResetFeatures> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        HOSTQUERYRESET;

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
        HOSTQUERYRESET = layout.offsetof(2);
    }

    protected VkPhysicalDeviceHostQueryResetFeatures(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceHostQueryResetFeatures create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceHostQueryResetFeatures(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceHostQueryResetFeatures} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceHostQueryResetFeatures(ByteBuffer container) {
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
    /** @return the value of the {@code hostQueryReset} field. */
    @NativeType("VkBool32")
    public boolean hostQueryReset() { return nhostQueryReset(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceHostQueryResetFeatures sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceHostQueryResetFeatures sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceHostQueryResetFeatures pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code hostQueryReset} field. */
    public VkPhysicalDeviceHostQueryResetFeatures hostQueryReset(@NativeType("VkBool32") boolean value) { nhostQueryReset(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceHostQueryResetFeatures set(
        int sType,
        long pNext,
        boolean hostQueryReset
    ) {
        sType(sType);
        pNext(pNext);
        hostQueryReset(hostQueryReset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceHostQueryResetFeatures set(VkPhysicalDeviceHostQueryResetFeatures src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostQueryResetFeatures malloc() {
        return new VkPhysicalDeviceHostQueryResetFeatures(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceHostQueryResetFeatures calloc() {
        return new VkPhysicalDeviceHostQueryResetFeatures(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceHostQueryResetFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceHostQueryResetFeatures(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance for the specified memory address. */
    public static VkPhysicalDeviceHostQueryResetFeatures create(long address) {
        return new VkPhysicalDeviceHostQueryResetFeatures(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceHostQueryResetFeatures createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceHostQueryResetFeatures(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceHostQueryResetFeatures.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostQueryResetFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostQueryResetFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceHostQueryResetFeatures} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceHostQueryResetFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceHostQueryResetFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceHostQueryResetFeatures.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceHostQueryResetFeatures.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceHostQueryResetFeatures.PNEXT); }
    /** Unsafe version of {@link #hostQueryReset}. */
    public static int nhostQueryReset(long struct) { return memGetInt(struct + VkPhysicalDeviceHostQueryResetFeatures.HOSTQUERYRESET); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceHostQueryResetFeatures.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceHostQueryResetFeatures.PNEXT, value); }
    /** Unsafe version of {@link #hostQueryReset(boolean) hostQueryReset}. */
    public static void nhostQueryReset(long struct, int value) { memPutInt(struct + VkPhysicalDeviceHostQueryResetFeatures.HOSTQUERYRESET, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceHostQueryResetFeatures} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceHostQueryResetFeatures, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceHostQueryResetFeatures ELEMENT_FACTORY = VkPhysicalDeviceHostQueryResetFeatures.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceHostQueryResetFeatures.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceHostQueryResetFeatures#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceHostQueryResetFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceHostQueryResetFeatures.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceHostQueryResetFeatures.npNext(address()); }
        /** @return the value of the {@code hostQueryReset} field. */
        @NativeType("VkBool32")
        public boolean hostQueryReset() { return VkPhysicalDeviceHostQueryResetFeatures.nhostQueryReset(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceHostQueryResetFeatures.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceHostQueryResetFeatures.nsType(address(), value); return this; }
        /** Sets the {@link VK12#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceHostQueryResetFeatures.Buffer sType$Default() { return sType(VK12.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_QUERY_RESET_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceHostQueryResetFeatures.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceHostQueryResetFeatures.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code hostQueryReset} field. */
        public VkPhysicalDeviceHostQueryResetFeatures.Buffer hostQueryReset(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceHostQueryResetFeatures.nhostQueryReset(address(), value ? 1 : 0); return this; }

    }

}