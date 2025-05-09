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
 * struct VkImageViewAddressPropertiesNVX {
 *     VkStructureType sType;
 *     void * pNext;
 *     VkDeviceAddress deviceAddress;
 *     VkDeviceSize size;
 * }}</pre>
 */
public class VkImageViewAddressPropertiesNVX extends Struct<VkImageViewAddressPropertiesNVX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        DEVICEADDRESS,
        SIZE;

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
        DEVICEADDRESS = layout.offsetof(2);
        SIZE = layout.offsetof(3);
    }

    protected VkImageViewAddressPropertiesNVX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageViewAddressPropertiesNVX create(long address, @Nullable ByteBuffer container) {
        return new VkImageViewAddressPropertiesNVX(address, container);
    }

    /**
     * Creates a {@code VkImageViewAddressPropertiesNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageViewAddressPropertiesNVX(ByteBuffer container) {
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
    /** @return the value of the {@code deviceAddress} field. */
    @NativeType("VkDeviceAddress")
    public long deviceAddress() { return ndeviceAddress(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageViewAddressPropertiesNVX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link NVXImageViewHandle#VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX} value to the {@code sType} field. */
    public VkImageViewAddressPropertiesNVX sType$Default() { return sType(NVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageViewAddressPropertiesNVX pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageViewAddressPropertiesNVX set(
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
    public VkImageViewAddressPropertiesNVX set(VkImageViewAddressPropertiesNVX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageViewAddressPropertiesNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageViewAddressPropertiesNVX malloc() {
        return new VkImageViewAddressPropertiesNVX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewAddressPropertiesNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageViewAddressPropertiesNVX calloc() {
        return new VkImageViewAddressPropertiesNVX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageViewAddressPropertiesNVX} instance allocated with {@link BufferUtils}. */
    public static VkImageViewAddressPropertiesNVX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageViewAddressPropertiesNVX(memAddress(container), container);
    }

    /** Returns a new {@code VkImageViewAddressPropertiesNVX} instance for the specified memory address. */
    public static VkImageViewAddressPropertiesNVX create(long address) {
        return new VkImageViewAddressPropertiesNVX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageViewAddressPropertiesNVX createSafe(long address) {
        return address == NULL ? null : new VkImageViewAddressPropertiesNVX(address, null);
    }

    /**
     * Returns a new {@link VkImageViewAddressPropertiesNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewAddressPropertiesNVX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageViewAddressPropertiesNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewAddressPropertiesNVX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewAddressPropertiesNVX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageViewAddressPropertiesNVX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageViewAddressPropertiesNVX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageViewAddressPropertiesNVX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageViewAddressPropertiesNVX.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageViewAddressPropertiesNVX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewAddressPropertiesNVX malloc(MemoryStack stack) {
        return new VkImageViewAddressPropertiesNVX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageViewAddressPropertiesNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageViewAddressPropertiesNVX calloc(MemoryStack stack) {
        return new VkImageViewAddressPropertiesNVX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageViewAddressPropertiesNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewAddressPropertiesNVX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageViewAddressPropertiesNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageViewAddressPropertiesNVX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageViewAddressPropertiesNVX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageViewAddressPropertiesNVX.PNEXT); }
    /** Unsafe version of {@link #deviceAddress}. */
    public static long ndeviceAddress(long struct) { return memGetLong(struct + VkImageViewAddressPropertiesNVX.DEVICEADDRESS); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkImageViewAddressPropertiesNVX.SIZE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageViewAddressPropertiesNVX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageViewAddressPropertiesNVX.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkImageViewAddressPropertiesNVX} structs. */
    public static class Buffer extends StructBuffer<VkImageViewAddressPropertiesNVX, Buffer> implements NativeResource {

        private static final VkImageViewAddressPropertiesNVX ELEMENT_FACTORY = VkImageViewAddressPropertiesNVX.create(-1L);

        /**
         * Creates a new {@code VkImageViewAddressPropertiesNVX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageViewAddressPropertiesNVX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageViewAddressPropertiesNVX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageViewAddressPropertiesNVX.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkImageViewAddressPropertiesNVX.npNext(address()); }
        /** @return the value of the {@code deviceAddress} field. */
        @NativeType("VkDeviceAddress")
        public long deviceAddress() { return VkImageViewAddressPropertiesNVX.ndeviceAddress(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkImageViewAddressPropertiesNVX.nsize(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageViewAddressPropertiesNVX.Buffer sType(@NativeType("VkStructureType") int value) { VkImageViewAddressPropertiesNVX.nsType(address(), value); return this; }
        /** Sets the {@link NVXImageViewHandle#VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX} value to the {@code sType} field. */
        public VkImageViewAddressPropertiesNVX.Buffer sType$Default() { return sType(NVXImageViewHandle.VK_STRUCTURE_TYPE_IMAGE_VIEW_ADDRESS_PROPERTIES_NVX); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageViewAddressPropertiesNVX.Buffer pNext(@NativeType("void *") long value) { VkImageViewAddressPropertiesNVX.npNext(address(), value); return this; }

    }

}