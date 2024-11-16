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
 * Container for value and types of parameters that can be queried.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPerformanceValueDataINTEL}, {@link INTELPerformanceQuery#vkGetPerformanceParameterINTEL GetPerformanceParameterINTEL}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkPerformanceValueINTEL {
 *     VkPerformanceValueTypeINTEL {@link #type};
 *     {@link VkPerformanceValueDataINTEL VkPerformanceValueDataINTEL} {@link #data};
 * }</code></pre>
 */
public class VkPerformanceValueINTEL extends Struct<VkPerformanceValueINTEL> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        DATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(VkPerformanceValueDataINTEL.SIZEOF, VkPerformanceValueDataINTEL.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        DATA = layout.offsetof(1);
    }

    protected VkPerformanceValueINTEL(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPerformanceValueINTEL create(long address, @Nullable ByteBuffer container) {
        return new VkPerformanceValueINTEL(address, container);
    }

    /**
     * Creates a {@code VkPerformanceValueINTEL} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPerformanceValueINTEL(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** a {@code VkPerformanceValueTypeINTEL} value specifying the type of the returned data. */
    @NativeType("VkPerformanceValueTypeINTEL")
    public int type() { return ntype(address()); }
    /** a {@link VkPerformanceValueDataINTEL} union specifying the value of the returned data. */
    public VkPerformanceValueDataINTEL data() { return ndata(address()); }

    // -----------------------------------

    /** Returns a new {@code VkPerformanceValueINTEL} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPerformanceValueINTEL malloc() {
        return new VkPerformanceValueINTEL(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPerformanceValueINTEL} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPerformanceValueINTEL calloc() {
        return new VkPerformanceValueINTEL(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPerformanceValueINTEL} instance allocated with {@link BufferUtils}. */
    public static VkPerformanceValueINTEL create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPerformanceValueINTEL(memAddress(container), container);
    }

    /** Returns a new {@code VkPerformanceValueINTEL} instance for the specified memory address. */
    public static VkPerformanceValueINTEL create(long address) {
        return new VkPerformanceValueINTEL(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPerformanceValueINTEL createSafe(long address) {
        return address == NULL ? null : new VkPerformanceValueINTEL(address, null);
    }

    /**
     * Returns a new {@link VkPerformanceValueINTEL.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceValueINTEL.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceValueINTEL.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPerformanceValueINTEL.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPerformanceValueINTEL.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static VkPerformanceValueINTEL.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code VkPerformanceValueINTEL} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceValueINTEL malloc(MemoryStack stack) {
        return new VkPerformanceValueINTEL(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPerformanceValueINTEL} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPerformanceValueINTEL calloc(MemoryStack stack) {
        return new VkPerformanceValueINTEL(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPerformanceValueINTEL.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPerformanceValueINTEL.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPerformanceValueINTEL.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + VkPerformanceValueINTEL.TYPE); }
    /** Unsafe version of {@link #data}. */
    public static VkPerformanceValueDataINTEL ndata(long struct) { return VkPerformanceValueDataINTEL.create(struct + VkPerformanceValueINTEL.DATA); }

    // -----------------------------------

    /** An array of {@link VkPerformanceValueINTEL} structs. */
    public static class Buffer extends StructBuffer<VkPerformanceValueINTEL, Buffer> implements NativeResource {

        private static final VkPerformanceValueINTEL ELEMENT_FACTORY = VkPerformanceValueINTEL.create(-1L);

        /**
         * Creates a new {@code VkPerformanceValueINTEL.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPerformanceValueINTEL#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPerformanceValueINTEL getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VkPerformanceValueINTEL#type} field. */
        @NativeType("VkPerformanceValueTypeINTEL")
        public int type() { return VkPerformanceValueINTEL.ntype(address()); }
        /** @return a {@link VkPerformanceValueDataINTEL} view of the {@link VkPerformanceValueINTEL#data} field. */
        public VkPerformanceValueDataINTEL data() { return VkPerformanceValueINTEL.ndata(address()); }

    }

}