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
 * struct VkDecompressMemoryRegionEXT {
 *     VkDeviceAddress srcAddress;
 *     VkDeviceAddress dstAddress;
 *     VkDeviceSize compressedSize;
 *     VkDeviceSize decompressedSize;
 * }}</pre>
 */
public class VkDecompressMemoryRegionEXT extends Struct<VkDecompressMemoryRegionEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SRCADDRESS,
        DSTADDRESS,
        COMPRESSEDSIZE,
        DECOMPRESSEDSIZE;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SRCADDRESS = layout.offsetof(0);
        DSTADDRESS = layout.offsetof(1);
        COMPRESSEDSIZE = layout.offsetof(2);
        DECOMPRESSEDSIZE = layout.offsetof(3);
    }

    protected VkDecompressMemoryRegionEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDecompressMemoryRegionEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDecompressMemoryRegionEXT(address, container);
    }

    /**
     * Creates a {@code VkDecompressMemoryRegionEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDecompressMemoryRegionEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code srcAddress} field. */
    @NativeType("VkDeviceAddress")
    public long srcAddress() { return nsrcAddress(address()); }
    /** @return the value of the {@code dstAddress} field. */
    @NativeType("VkDeviceAddress")
    public long dstAddress() { return ndstAddress(address()); }
    /** @return the value of the {@code compressedSize} field. */
    @NativeType("VkDeviceSize")
    public long compressedSize() { return ncompressedSize(address()); }
    /** @return the value of the {@code decompressedSize} field. */
    @NativeType("VkDeviceSize")
    public long decompressedSize() { return ndecompressedSize(address()); }

    /** Sets the specified value to the {@code srcAddress} field. */
    public VkDecompressMemoryRegionEXT srcAddress(@NativeType("VkDeviceAddress") long value) { nsrcAddress(address(), value); return this; }
    /** Sets the specified value to the {@code dstAddress} field. */
    public VkDecompressMemoryRegionEXT dstAddress(@NativeType("VkDeviceAddress") long value) { ndstAddress(address(), value); return this; }
    /** Sets the specified value to the {@code compressedSize} field. */
    public VkDecompressMemoryRegionEXT compressedSize(@NativeType("VkDeviceSize") long value) { ncompressedSize(address(), value); return this; }
    /** Sets the specified value to the {@code decompressedSize} field. */
    public VkDecompressMemoryRegionEXT decompressedSize(@NativeType("VkDeviceSize") long value) { ndecompressedSize(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDecompressMemoryRegionEXT set(
        long srcAddress,
        long dstAddress,
        long compressedSize,
        long decompressedSize
    ) {
        srcAddress(srcAddress);
        dstAddress(dstAddress);
        compressedSize(compressedSize);
        decompressedSize(decompressedSize);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDecompressMemoryRegionEXT set(VkDecompressMemoryRegionEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDecompressMemoryRegionEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDecompressMemoryRegionEXT malloc() {
        return new VkDecompressMemoryRegionEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDecompressMemoryRegionEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDecompressMemoryRegionEXT calloc() {
        return new VkDecompressMemoryRegionEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDecompressMemoryRegionEXT} instance allocated with {@link BufferUtils}. */
    public static VkDecompressMemoryRegionEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDecompressMemoryRegionEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDecompressMemoryRegionEXT} instance for the specified memory address. */
    public static VkDecompressMemoryRegionEXT create(long address) {
        return new VkDecompressMemoryRegionEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDecompressMemoryRegionEXT createSafe(long address) {
        return address == NULL ? null : new VkDecompressMemoryRegionEXT(address, null);
    }

    /**
     * Returns a new {@link VkDecompressMemoryRegionEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDecompressMemoryRegionEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDecompressMemoryRegionEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDecompressMemoryRegionEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDecompressMemoryRegionEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDecompressMemoryRegionEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDecompressMemoryRegionEXT malloc(MemoryStack stack) {
        return new VkDecompressMemoryRegionEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDecompressMemoryRegionEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDecompressMemoryRegionEXT calloc(MemoryStack stack) {
        return new VkDecompressMemoryRegionEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDecompressMemoryRegionEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDecompressMemoryRegionEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDecompressMemoryRegionEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #srcAddress}. */
    public static long nsrcAddress(long struct) { return memGetLong(struct + VkDecompressMemoryRegionEXT.SRCADDRESS); }
    /** Unsafe version of {@link #dstAddress}. */
    public static long ndstAddress(long struct) { return memGetLong(struct + VkDecompressMemoryRegionEXT.DSTADDRESS); }
    /** Unsafe version of {@link #compressedSize}. */
    public static long ncompressedSize(long struct) { return memGetLong(struct + VkDecompressMemoryRegionEXT.COMPRESSEDSIZE); }
    /** Unsafe version of {@link #decompressedSize}. */
    public static long ndecompressedSize(long struct) { return memGetLong(struct + VkDecompressMemoryRegionEXT.DECOMPRESSEDSIZE); }

    /** Unsafe version of {@link #srcAddress(long) srcAddress}. */
    public static void nsrcAddress(long struct, long value) { memPutLong(struct + VkDecompressMemoryRegionEXT.SRCADDRESS, value); }
    /** Unsafe version of {@link #dstAddress(long) dstAddress}. */
    public static void ndstAddress(long struct, long value) { memPutLong(struct + VkDecompressMemoryRegionEXT.DSTADDRESS, value); }
    /** Unsafe version of {@link #compressedSize(long) compressedSize}. */
    public static void ncompressedSize(long struct, long value) { memPutLong(struct + VkDecompressMemoryRegionEXT.COMPRESSEDSIZE, value); }
    /** Unsafe version of {@link #decompressedSize(long) decompressedSize}. */
    public static void ndecompressedSize(long struct, long value) { memPutLong(struct + VkDecompressMemoryRegionEXT.DECOMPRESSEDSIZE, value); }

    // -----------------------------------

    /** An array of {@link VkDecompressMemoryRegionEXT} structs. */
    public static class Buffer extends StructBuffer<VkDecompressMemoryRegionEXT, Buffer> implements NativeResource {

        private static final VkDecompressMemoryRegionEXT ELEMENT_FACTORY = VkDecompressMemoryRegionEXT.create(-1L);

        /**
         * Creates a new {@code VkDecompressMemoryRegionEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDecompressMemoryRegionEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDecompressMemoryRegionEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code srcAddress} field. */
        @NativeType("VkDeviceAddress")
        public long srcAddress() { return VkDecompressMemoryRegionEXT.nsrcAddress(address()); }
        /** @return the value of the {@code dstAddress} field. */
        @NativeType("VkDeviceAddress")
        public long dstAddress() { return VkDecompressMemoryRegionEXT.ndstAddress(address()); }
        /** @return the value of the {@code compressedSize} field. */
        @NativeType("VkDeviceSize")
        public long compressedSize() { return VkDecompressMemoryRegionEXT.ncompressedSize(address()); }
        /** @return the value of the {@code decompressedSize} field. */
        @NativeType("VkDeviceSize")
        public long decompressedSize() { return VkDecompressMemoryRegionEXT.ndecompressedSize(address()); }

        /** Sets the specified value to the {@code srcAddress} field. */
        public VkDecompressMemoryRegionEXT.Buffer srcAddress(@NativeType("VkDeviceAddress") long value) { VkDecompressMemoryRegionEXT.nsrcAddress(address(), value); return this; }
        /** Sets the specified value to the {@code dstAddress} field. */
        public VkDecompressMemoryRegionEXT.Buffer dstAddress(@NativeType("VkDeviceAddress") long value) { VkDecompressMemoryRegionEXT.ndstAddress(address(), value); return this; }
        /** Sets the specified value to the {@code compressedSize} field. */
        public VkDecompressMemoryRegionEXT.Buffer compressedSize(@NativeType("VkDeviceSize") long value) { VkDecompressMemoryRegionEXT.ncompressedSize(address(), value); return this; }
        /** Sets the specified value to the {@code decompressedSize} field. */
        public VkDecompressMemoryRegionEXT.Buffer decompressedSize(@NativeType("VkDeviceSize") long value) { VkDecompressMemoryRegionEXT.ndecompressedSize(address(), value); return this; }

    }

}