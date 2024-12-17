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
 * struct VkDrawIndirectCountIndirectCommandEXT {
 *     VkDeviceAddress bufferAddress;
 *     uint32_t stride;
 *     uint32_t commandCount;
 * }}</pre>
 */
public class VkDrawIndirectCountIndirectCommandEXT extends Struct<VkDrawIndirectCountIndirectCommandEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFERADDRESS,
        STRIDE,
        COMMANDCOUNT;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFERADDRESS = layout.offsetof(0);
        STRIDE = layout.offsetof(1);
        COMMANDCOUNT = layout.offsetof(2);
    }

    protected VkDrawIndirectCountIndirectCommandEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDrawIndirectCountIndirectCommandEXT create(long address, @Nullable ByteBuffer container) {
        return new VkDrawIndirectCountIndirectCommandEXT(address, container);
    }

    /**
     * Creates a {@code VkDrawIndirectCountIndirectCommandEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDrawIndirectCountIndirectCommandEXT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code bufferAddress} field. */
    @NativeType("VkDeviceAddress")
    public long bufferAddress() { return nbufferAddress(address()); }
    /** @return the value of the {@code stride} field. */
    @NativeType("uint32_t")
    public int stride() { return nstride(address()); }
    /** @return the value of the {@code commandCount} field. */
    @NativeType("uint32_t")
    public int commandCount() { return ncommandCount(address()); }

    /** Sets the specified value to the {@code bufferAddress} field. */
    public VkDrawIndirectCountIndirectCommandEXT bufferAddress(@NativeType("VkDeviceAddress") long value) { nbufferAddress(address(), value); return this; }
    /** Sets the specified value to the {@code stride} field. */
    public VkDrawIndirectCountIndirectCommandEXT stride(@NativeType("uint32_t") int value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@code commandCount} field. */
    public VkDrawIndirectCountIndirectCommandEXT commandCount(@NativeType("uint32_t") int value) { ncommandCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDrawIndirectCountIndirectCommandEXT set(
        long bufferAddress,
        int stride,
        int commandCount
    ) {
        bufferAddress(bufferAddress);
        stride(stride);
        commandCount(commandCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDrawIndirectCountIndirectCommandEXT set(VkDrawIndirectCountIndirectCommandEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDrawIndirectCountIndirectCommandEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDrawIndirectCountIndirectCommandEXT malloc() {
        return new VkDrawIndirectCountIndirectCommandEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDrawIndirectCountIndirectCommandEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDrawIndirectCountIndirectCommandEXT calloc() {
        return new VkDrawIndirectCountIndirectCommandEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDrawIndirectCountIndirectCommandEXT} instance allocated with {@link BufferUtils}. */
    public static VkDrawIndirectCountIndirectCommandEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDrawIndirectCountIndirectCommandEXT(memAddress(container), container);
    }

    /** Returns a new {@code VkDrawIndirectCountIndirectCommandEXT} instance for the specified memory address. */
    public static VkDrawIndirectCountIndirectCommandEXT create(long address) {
        return new VkDrawIndirectCountIndirectCommandEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkDrawIndirectCountIndirectCommandEXT createSafe(long address) {
        return address == NULL ? null : new VkDrawIndirectCountIndirectCommandEXT(address, null);
    }

    /**
     * Returns a new {@link VkDrawIndirectCountIndirectCommandEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCountIndirectCommandEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCountIndirectCommandEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCountIndirectCommandEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCountIndirectCommandEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCountIndirectCommandEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDrawIndirectCountIndirectCommandEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCountIndirectCommandEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkDrawIndirectCountIndirectCommandEXT.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDrawIndirectCountIndirectCommandEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndirectCountIndirectCommandEXT malloc(MemoryStack stack) {
        return new VkDrawIndirectCountIndirectCommandEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDrawIndirectCountIndirectCommandEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDrawIndirectCountIndirectCommandEXT calloc(MemoryStack stack) {
        return new VkDrawIndirectCountIndirectCommandEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDrawIndirectCountIndirectCommandEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCountIndirectCommandEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDrawIndirectCountIndirectCommandEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDrawIndirectCountIndirectCommandEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #bufferAddress}. */
    public static long nbufferAddress(long struct) { return memGetLong(struct + VkDrawIndirectCountIndirectCommandEXT.BUFFERADDRESS); }
    /** Unsafe version of {@link #stride}. */
    public static int nstride(long struct) { return memGetInt(struct + VkDrawIndirectCountIndirectCommandEXT.STRIDE); }
    /** Unsafe version of {@link #commandCount}. */
    public static int ncommandCount(long struct) { return memGetInt(struct + VkDrawIndirectCountIndirectCommandEXT.COMMANDCOUNT); }

    /** Unsafe version of {@link #bufferAddress(long) bufferAddress}. */
    public static void nbufferAddress(long struct, long value) { memPutLong(struct + VkDrawIndirectCountIndirectCommandEXT.BUFFERADDRESS, value); }
    /** Unsafe version of {@link #stride(int) stride}. */
    public static void nstride(long struct, int value) { memPutInt(struct + VkDrawIndirectCountIndirectCommandEXT.STRIDE, value); }
    /** Unsafe version of {@link #commandCount(int) commandCount}. */
    public static void ncommandCount(long struct, int value) { memPutInt(struct + VkDrawIndirectCountIndirectCommandEXT.COMMANDCOUNT, value); }

    // -----------------------------------

    /** An array of {@link VkDrawIndirectCountIndirectCommandEXT} structs. */
    public static class Buffer extends StructBuffer<VkDrawIndirectCountIndirectCommandEXT, Buffer> implements NativeResource {

        private static final VkDrawIndirectCountIndirectCommandEXT ELEMENT_FACTORY = VkDrawIndirectCountIndirectCommandEXT.create(-1L);

        /**
         * Creates a new {@code VkDrawIndirectCountIndirectCommandEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDrawIndirectCountIndirectCommandEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDrawIndirectCountIndirectCommandEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code bufferAddress} field. */
        @NativeType("VkDeviceAddress")
        public long bufferAddress() { return VkDrawIndirectCountIndirectCommandEXT.nbufferAddress(address()); }
        /** @return the value of the {@code stride} field. */
        @NativeType("uint32_t")
        public int stride() { return VkDrawIndirectCountIndirectCommandEXT.nstride(address()); }
        /** @return the value of the {@code commandCount} field. */
        @NativeType("uint32_t")
        public int commandCount() { return VkDrawIndirectCountIndirectCommandEXT.ncommandCount(address()); }

        /** Sets the specified value to the {@code bufferAddress} field. */
        public VkDrawIndirectCountIndirectCommandEXT.Buffer bufferAddress(@NativeType("VkDeviceAddress") long value) { VkDrawIndirectCountIndirectCommandEXT.nbufferAddress(address(), value); return this; }
        /** Sets the specified value to the {@code stride} field. */
        public VkDrawIndirectCountIndirectCommandEXT.Buffer stride(@NativeType("uint32_t") int value) { VkDrawIndirectCountIndirectCommandEXT.nstride(address(), value); return this; }
        /** Sets the specified value to the {@code commandCount} field. */
        public VkDrawIndirectCountIndirectCommandEXT.Buffer commandCount(@NativeType("uint32_t") int value) { VkDrawIndirectCountIndirectCommandEXT.ncommandCount(address(), value); return this; }

    }

}