/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying node parameters for execution graph dispatch.
 * 
 * <h5>Description</h5>
 * 
 * <p>Whether {@code payloads} is consumed as a device or host pointer is defined by the command this structure is used in.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code payloadCount} <b>must</b> be no greater than <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/html/vkspec.html#limits-maxExecutionGraphShaderPayloadCount">{@code maxExecutionGraphShaderPayloadCount}</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDeviceOrHostAddressConstAMDX}, {@link VkDispatchGraphCountInfoAMDX}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkDispatchGraphInfoAMDX {
 *     uint32_t {@link #nodeIndex};
 *     uint32_t {@link #payloadCount};
 *     {@link VkDeviceOrHostAddressConstAMDX VkDeviceOrHostAddressConstAMDX} {@link #payloads};
 *     uint64_t {@link #payloadStride};
 * }</code></pre>
 */
public class VkDispatchGraphInfoAMDX extends Struct<VkDispatchGraphInfoAMDX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NODEINDEX,
        PAYLOADCOUNT,
        PAYLOADS,
        PAYLOADSTRIDE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(VkDeviceOrHostAddressConstAMDX.SIZEOF, VkDeviceOrHostAddressConstAMDX.ALIGNOF),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NODEINDEX = layout.offsetof(0);
        PAYLOADCOUNT = layout.offsetof(1);
        PAYLOADS = layout.offsetof(2);
        PAYLOADSTRIDE = layout.offsetof(3);
    }

    protected VkDispatchGraphInfoAMDX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkDispatchGraphInfoAMDX create(long address, @Nullable ByteBuffer container) {
        return new VkDispatchGraphInfoAMDX(address, container);
    }

    /**
     * Creates a {@code VkDispatchGraphInfoAMDX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkDispatchGraphInfoAMDX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the index of a node in an execution graph to be dispatched. */
    @NativeType("uint32_t")
    public int nodeIndex() { return nnodeIndex(address()); }
    /** the number of payloads to dispatch for the specified node. */
    @NativeType("uint32_t")
    public int payloadCount() { return npayloadCount(address()); }
    /** a device or host address pointer to a flat array of payloads with size equal to the product of {@code payloadCount} and {@code payloadStride} */
    public VkDeviceOrHostAddressConstAMDX payloads() { return npayloads(address()); }
    /** the byte stride between successive payloads in {@code payloads} */
    @NativeType("uint64_t")
    public long payloadStride() { return npayloadStride(address()); }

    /** Sets the specified value to the {@link #nodeIndex} field. */
    public VkDispatchGraphInfoAMDX nodeIndex(@NativeType("uint32_t") int value) { nnodeIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #payloadCount} field. */
    public VkDispatchGraphInfoAMDX payloadCount(@NativeType("uint32_t") int value) { npayloadCount(address(), value); return this; }
    /** Copies the specified {@link VkDeviceOrHostAddressConstAMDX} to the {@link #payloads} field. */
    public VkDispatchGraphInfoAMDX payloads(VkDeviceOrHostAddressConstAMDX value) { npayloads(address(), value); return this; }
    /** Passes the {@link #payloads} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkDispatchGraphInfoAMDX payloads(java.util.function.Consumer<VkDeviceOrHostAddressConstAMDX> consumer) { consumer.accept(payloads()); return this; }
    /** Sets the specified value to the {@link #payloadStride} field. */
    public VkDispatchGraphInfoAMDX payloadStride(@NativeType("uint64_t") long value) { npayloadStride(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkDispatchGraphInfoAMDX set(
        int nodeIndex,
        int payloadCount,
        VkDeviceOrHostAddressConstAMDX payloads,
        long payloadStride
    ) {
        nodeIndex(nodeIndex);
        payloadCount(payloadCount);
        payloads(payloads);
        payloadStride(payloadStride);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkDispatchGraphInfoAMDX set(VkDispatchGraphInfoAMDX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkDispatchGraphInfoAMDX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkDispatchGraphInfoAMDX malloc() {
        return new VkDispatchGraphInfoAMDX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkDispatchGraphInfoAMDX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkDispatchGraphInfoAMDX calloc() {
        return new VkDispatchGraphInfoAMDX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkDispatchGraphInfoAMDX} instance allocated with {@link BufferUtils}. */
    public static VkDispatchGraphInfoAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDispatchGraphInfoAMDX(memAddress(container), container);
    }

    /** Returns a new {@code VkDispatchGraphInfoAMDX} instance for the specified memory address. */
    public static VkDispatchGraphInfoAMDX create(long address) {
        return new VkDispatchGraphInfoAMDX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDispatchGraphInfoAMDX createSafe(long address) {
        return address == NULL ? null : new VkDispatchGraphInfoAMDX(address, null);
    }

    /**
     * Returns a new {@link VkDispatchGraphInfoAMDX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphInfoAMDX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkDispatchGraphInfoAMDX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphInfoAMDX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDispatchGraphInfoAMDX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphInfoAMDX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkDispatchGraphInfoAMDX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphInfoAMDX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkDispatchGraphInfoAMDX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkDispatchGraphInfoAMDX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDispatchGraphInfoAMDX malloc(MemoryStack stack) {
        return new VkDispatchGraphInfoAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkDispatchGraphInfoAMDX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkDispatchGraphInfoAMDX calloc(MemoryStack stack) {
        return new VkDispatchGraphInfoAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkDispatchGraphInfoAMDX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphInfoAMDX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkDispatchGraphInfoAMDX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkDispatchGraphInfoAMDX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #nodeIndex}. */
    public static int nnodeIndex(long struct) { return UNSAFE.getInt(null, struct + VkDispatchGraphInfoAMDX.NODEINDEX); }
    /** Unsafe version of {@link #payloadCount}. */
    public static int npayloadCount(long struct) { return UNSAFE.getInt(null, struct + VkDispatchGraphInfoAMDX.PAYLOADCOUNT); }
    /** Unsafe version of {@link #payloads}. */
    public static VkDeviceOrHostAddressConstAMDX npayloads(long struct) { return VkDeviceOrHostAddressConstAMDX.create(struct + VkDispatchGraphInfoAMDX.PAYLOADS); }
    /** Unsafe version of {@link #payloadStride}. */
    public static long npayloadStride(long struct) { return UNSAFE.getLong(null, struct + VkDispatchGraphInfoAMDX.PAYLOADSTRIDE); }

    /** Unsafe version of {@link #nodeIndex(int) nodeIndex}. */
    public static void nnodeIndex(long struct, int value) { UNSAFE.putInt(null, struct + VkDispatchGraphInfoAMDX.NODEINDEX, value); }
    /** Unsafe version of {@link #payloadCount(int) payloadCount}. */
    public static void npayloadCount(long struct, int value) { UNSAFE.putInt(null, struct + VkDispatchGraphInfoAMDX.PAYLOADCOUNT, value); }
    /** Unsafe version of {@link #payloads(VkDeviceOrHostAddressConstAMDX) payloads}. */
    public static void npayloads(long struct, VkDeviceOrHostAddressConstAMDX value) { memCopy(value.address(), struct + VkDispatchGraphInfoAMDX.PAYLOADS, VkDeviceOrHostAddressConstAMDX.SIZEOF); }
    /** Unsafe version of {@link #payloadStride(long) payloadStride}. */
    public static void npayloadStride(long struct, long value) { UNSAFE.putLong(null, struct + VkDispatchGraphInfoAMDX.PAYLOADSTRIDE, value); }

    // -----------------------------------

    /** An array of {@link VkDispatchGraphInfoAMDX} structs. */
    public static class Buffer extends StructBuffer<VkDispatchGraphInfoAMDX, Buffer> implements NativeResource {

        private static final VkDispatchGraphInfoAMDX ELEMENT_FACTORY = VkDispatchGraphInfoAMDX.create(-1L);

        /**
         * Creates a new {@code VkDispatchGraphInfoAMDX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkDispatchGraphInfoAMDX#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkDispatchGraphInfoAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkDispatchGraphInfoAMDX#nodeIndex} field. */
        @NativeType("uint32_t")
        public int nodeIndex() { return VkDispatchGraphInfoAMDX.nnodeIndex(address()); }
        /** @return the value of the {@link VkDispatchGraphInfoAMDX#payloadCount} field. */
        @NativeType("uint32_t")
        public int payloadCount() { return VkDispatchGraphInfoAMDX.npayloadCount(address()); }
        /** @return a {@link VkDeviceOrHostAddressConstAMDX} view of the {@link VkDispatchGraphInfoAMDX#payloads} field. */
        public VkDeviceOrHostAddressConstAMDX payloads() { return VkDispatchGraphInfoAMDX.npayloads(address()); }
        /** @return the value of the {@link VkDispatchGraphInfoAMDX#payloadStride} field. */
        @NativeType("uint64_t")
        public long payloadStride() { return VkDispatchGraphInfoAMDX.npayloadStride(address()); }

        /** Sets the specified value to the {@link VkDispatchGraphInfoAMDX#nodeIndex} field. */
        public VkDispatchGraphInfoAMDX.Buffer nodeIndex(@NativeType("uint32_t") int value) { VkDispatchGraphInfoAMDX.nnodeIndex(address(), value); return this; }
        /** Sets the specified value to the {@link VkDispatchGraphInfoAMDX#payloadCount} field. */
        public VkDispatchGraphInfoAMDX.Buffer payloadCount(@NativeType("uint32_t") int value) { VkDispatchGraphInfoAMDX.npayloadCount(address(), value); return this; }
        /** Copies the specified {@link VkDeviceOrHostAddressConstAMDX} to the {@link VkDispatchGraphInfoAMDX#payloads} field. */
        public VkDispatchGraphInfoAMDX.Buffer payloads(VkDeviceOrHostAddressConstAMDX value) { VkDispatchGraphInfoAMDX.npayloads(address(), value); return this; }
        /** Passes the {@link VkDispatchGraphInfoAMDX#payloads} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkDispatchGraphInfoAMDX.Buffer payloads(java.util.function.Consumer<VkDeviceOrHostAddressConstAMDX> consumer) { consumer.accept(payloads()); return this; }
        /** Sets the specified value to the {@link VkDispatchGraphInfoAMDX#payloadStride} field. */
        public VkDispatchGraphInfoAMDX.Buffer payloadStride(@NativeType("uint64_t") long value) { VkDispatchGraphInfoAMDX.npayloadStride(address(), value); return this; }

    }

}