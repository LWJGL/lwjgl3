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
 * struct VkPhysicalDeviceIndexTypeUint8Features {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkBool32 indexTypeUint8;
 * }}</pre>
 */
public class VkPhysicalDeviceIndexTypeUint8Features extends Struct<VkPhysicalDeviceIndexTypeUint8Features> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        INDEXTYPEUINT8;

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
        INDEXTYPEUINT8 = layout.offsetof(2);
    }

    protected VkPhysicalDeviceIndexTypeUint8Features(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceIndexTypeUint8Features create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceIndexTypeUint8Features(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceIndexTypeUint8Features} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceIndexTypeUint8Features(ByteBuffer container) {
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
    /** @return the value of the {@code indexTypeUint8} field. */
    @NativeType("VkBool32")
    public boolean indexTypeUint8() { return nindexTypeUint8(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceIndexTypeUint8Features sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES} value to the {@code sType} field. */
    public VkPhysicalDeviceIndexTypeUint8Features sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceIndexTypeUint8Features pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code indexTypeUint8} field. */
    public VkPhysicalDeviceIndexTypeUint8Features indexTypeUint8(@NativeType("VkBool32") boolean value) { nindexTypeUint8(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceIndexTypeUint8Features set(
        int sType,
        long pNext,
        boolean indexTypeUint8
    ) {
        sType(sType);
        pNext(pNext);
        indexTypeUint8(indexTypeUint8);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceIndexTypeUint8Features set(VkPhysicalDeviceIndexTypeUint8Features src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8Features} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceIndexTypeUint8Features malloc() {
        return new VkPhysicalDeviceIndexTypeUint8Features(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8Features} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceIndexTypeUint8Features calloc() {
        return new VkPhysicalDeviceIndexTypeUint8Features(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8Features} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceIndexTypeUint8Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceIndexTypeUint8Features(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceIndexTypeUint8Features} instance for the specified memory address. */
    public static VkPhysicalDeviceIndexTypeUint8Features create(long address) {
        return new VkPhysicalDeviceIndexTypeUint8Features(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceIndexTypeUint8Features createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceIndexTypeUint8Features(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8Features.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8Features.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8Features.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8Features.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8Features.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8Features.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceIndexTypeUint8Features.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8Features.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceIndexTypeUint8Features.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceIndexTypeUint8Features} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceIndexTypeUint8Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceIndexTypeUint8Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceIndexTypeUint8Features} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceIndexTypeUint8Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceIndexTypeUint8Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8Features.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8Features.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceIndexTypeUint8Features.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceIndexTypeUint8Features.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceIndexTypeUint8Features.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceIndexTypeUint8Features.PNEXT); }
    /** Unsafe version of {@link #indexTypeUint8}. */
    public static int nindexTypeUint8(long struct) { return memGetInt(struct + VkPhysicalDeviceIndexTypeUint8Features.INDEXTYPEUINT8); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceIndexTypeUint8Features.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceIndexTypeUint8Features.PNEXT, value); }
    /** Unsafe version of {@link #indexTypeUint8(boolean) indexTypeUint8}. */
    public static void nindexTypeUint8(long struct, int value) { memPutInt(struct + VkPhysicalDeviceIndexTypeUint8Features.INDEXTYPEUINT8, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceIndexTypeUint8Features} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceIndexTypeUint8Features, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceIndexTypeUint8Features ELEMENT_FACTORY = VkPhysicalDeviceIndexTypeUint8Features.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceIndexTypeUint8Features.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceIndexTypeUint8Features#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceIndexTypeUint8Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceIndexTypeUint8Features.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceIndexTypeUint8Features.npNext(address()); }
        /** @return the value of the {@code indexTypeUint8} field. */
        @NativeType("VkBool32")
        public boolean indexTypeUint8() { return VkPhysicalDeviceIndexTypeUint8Features.nindexTypeUint8(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceIndexTypeUint8Features.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceIndexTypeUint8Features.nsType(address(), value); return this; }
        /** Sets the {@link VK14#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES} value to the {@code sType} field. */
        public VkPhysicalDeviceIndexTypeUint8Features.Buffer sType$Default() { return sType(VK14.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INDEX_TYPE_UINT8_FEATURES); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceIndexTypeUint8Features.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceIndexTypeUint8Features.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code indexTypeUint8} field. */
        public VkPhysicalDeviceIndexTypeUint8Features.Buffer indexTypeUint8(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceIndexTypeUint8Features.nindexTypeUint8(address(), value ? 1 : 0); return this; }

    }

}