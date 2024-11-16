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
 * Structure specifying input streams for generated command tokens.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The {@code buffer}’s usage flag <b>must</b> have the {@link VK10#VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT BUFFER_USAGE_INDIRECT_BUFFER_BIT} bit set</li>
 * <li>The {@code offset} <b>must</b> be aligned to {@link VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV}{@code ::minIndirectCommandsBufferOffsetAlignment}</li>
 * <li>If {@code buffer} is non-sparse then it <b>must</b> be bound completely and contiguously to a single {@code VkDeviceMemory} object</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkGeneratedCommandsInfoNV}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkIndirectCommandsStreamNV {
 *     VkBuffer {@link #buffer};
 *     VkDeviceSize {@link #offset};
 * }</code></pre>
 */
public class VkIndirectCommandsStreamNV extends Struct<VkIndirectCommandsStreamNV> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BUFFER,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BUFFER = layout.offsetof(0);
        OFFSET = layout.offsetof(1);
    }

    protected VkIndirectCommandsStreamNV(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkIndirectCommandsStreamNV create(long address, @Nullable ByteBuffer container) {
        return new VkIndirectCommandsStreamNV(address, container);
    }

    /**
     * Creates a {@code VkIndirectCommandsStreamNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkIndirectCommandsStreamNV(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** specifies the {@code VkBuffer} storing the functional arguments for each sequence. These arguments <b>can</b> be written by the device. */
    @NativeType("VkBuffer")
    public long buffer() { return nbuffer(address()); }
    /** specified an offset into {@code buffer} where the arguments start. */
    @NativeType("VkDeviceSize")
    public long offset() { return noffset(address()); }

    /** Sets the specified value to the {@link #buffer} field. */
    public VkIndirectCommandsStreamNV buffer(@NativeType("VkBuffer") long value) { nbuffer(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public VkIndirectCommandsStreamNV offset(@NativeType("VkDeviceSize") long value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkIndirectCommandsStreamNV set(
        long buffer,
        long offset
    ) {
        buffer(buffer);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkIndirectCommandsStreamNV set(VkIndirectCommandsStreamNV src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkIndirectCommandsStreamNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsStreamNV malloc() {
        return new VkIndirectCommandsStreamNV(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsStreamNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkIndirectCommandsStreamNV calloc() {
        return new VkIndirectCommandsStreamNV(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkIndirectCommandsStreamNV} instance allocated with {@link BufferUtils}. */
    public static VkIndirectCommandsStreamNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkIndirectCommandsStreamNV(memAddress(container), container);
    }

    /** Returns a new {@code VkIndirectCommandsStreamNV} instance for the specified memory address. */
    public static VkIndirectCommandsStreamNV create(long address) {
        return new VkIndirectCommandsStreamNV(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkIndirectCommandsStreamNV createSafe(long address) {
        return address == NULL ? null : new VkIndirectCommandsStreamNV(address, null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsStreamNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsStreamNV.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsStreamNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsStreamNV.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsStreamNV.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsStreamNV.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkIndirectCommandsStreamNV.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsStreamNV.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkIndirectCommandsStreamNV.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkIndirectCommandsStreamNV} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsStreamNV malloc(MemoryStack stack) {
        return new VkIndirectCommandsStreamNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkIndirectCommandsStreamNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkIndirectCommandsStreamNV calloc(MemoryStack stack) {
        return new VkIndirectCommandsStreamNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkIndirectCommandsStreamNV.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsStreamNV.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkIndirectCommandsStreamNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkIndirectCommandsStreamNV.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #buffer}. */
    public static long nbuffer(long struct) { return memGetLong(struct + VkIndirectCommandsStreamNV.BUFFER); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetLong(struct + VkIndirectCommandsStreamNV.OFFSET); }

    /** Unsafe version of {@link #buffer(long) buffer}. */
    public static void nbuffer(long struct, long value) { memPutLong(struct + VkIndirectCommandsStreamNV.BUFFER, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutLong(struct + VkIndirectCommandsStreamNV.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link VkIndirectCommandsStreamNV} structs. */
    public static class Buffer extends StructBuffer<VkIndirectCommandsStreamNV, Buffer> implements NativeResource {

        private static final VkIndirectCommandsStreamNV ELEMENT_FACTORY = VkIndirectCommandsStreamNV.create(-1L);

        /**
         * Creates a new {@code VkIndirectCommandsStreamNV.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkIndirectCommandsStreamNV#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkIndirectCommandsStreamNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkIndirectCommandsStreamNV#buffer} field. */
        @NativeType("VkBuffer")
        public long buffer() { return VkIndirectCommandsStreamNV.nbuffer(address()); }
        /** @return the value of the {@link VkIndirectCommandsStreamNV#offset} field. */
        @NativeType("VkDeviceSize")
        public long offset() { return VkIndirectCommandsStreamNV.noffset(address()); }

        /** Sets the specified value to the {@link VkIndirectCommandsStreamNV#buffer} field. */
        public VkIndirectCommandsStreamNV.Buffer buffer(@NativeType("VkBuffer") long value) { VkIndirectCommandsStreamNV.nbuffer(address(), value); return this; }
        /** Sets the specified value to the {@link VkIndirectCommandsStreamNV#offset} field. */
        public VkIndirectCommandsStreamNV.Buffer offset(@NativeType("VkDeviceSize") long value) { VkIndirectCommandsStreamNV.noffset(address(), value); return this; }

    }

}