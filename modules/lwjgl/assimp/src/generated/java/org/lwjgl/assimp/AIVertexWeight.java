/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A single influence of a bone on a vertex.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiVertexWeight {
 *     unsigned int {@link #mVertexId};
 *     float {@link #mWeight};
 * }</code></pre>
 */
@NativeType("struct aiVertexWeight")
public class AIVertexWeight extends Struct<AIVertexWeight> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MVERTEXID,
        MWEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MVERTEXID = layout.offsetof(0);
        MWEIGHT = layout.offsetof(1);
    }

    protected AIVertexWeight(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIVertexWeight create(long address, @Nullable ByteBuffer container) {
        return new AIVertexWeight(address, container);
    }

    /**
     * Creates a {@code AIVertexWeight} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIVertexWeight(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Index of the vertex which is influenced by the bone. */
    @NativeType("unsigned int")
    public int mVertexId() { return nmVertexId(address()); }
    /** The strength of the influence in the range (0...1). The influence from all bones at one vertex amounts to 1. */
    public float mWeight() { return nmWeight(address()); }

    /** Sets the specified value to the {@link #mVertexId} field. */
    public AIVertexWeight mVertexId(@NativeType("unsigned int") int value) { nmVertexId(address(), value); return this; }
    /** Sets the specified value to the {@link #mWeight} field. */
    public AIVertexWeight mWeight(float value) { nmWeight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AIVertexWeight set(
        int mVertexId,
        float mWeight
    ) {
        mVertexId(mVertexId);
        mWeight(mWeight);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIVertexWeight set(AIVertexWeight src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIVertexWeight} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIVertexWeight malloc() {
        return new AIVertexWeight(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AIVertexWeight} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIVertexWeight calloc() {
        return new AIVertexWeight(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AIVertexWeight} instance allocated with {@link BufferUtils}. */
    public static AIVertexWeight create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AIVertexWeight(memAddress(container), container);
    }

    /** Returns a new {@code AIVertexWeight} instance for the specified memory address. */
    public static AIVertexWeight create(long address) {
        return new AIVertexWeight(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AIVertexWeight createSafe(long address) {
        return address == NULL ? null : new AIVertexWeight(address, null);
    }

    /**
     * Returns a new {@link AIVertexWeight.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIVertexWeight.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIVertexWeight.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIVertexWeight.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIVertexWeight.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIVertexWeight.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AIVertexWeight.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIVertexWeight.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AIVertexWeight.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIVertexWeight mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIVertexWeight callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIVertexWeight mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIVertexWeight callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIVertexWeight.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIVertexWeight.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIVertexWeight.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIVertexWeight.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIVertexWeight} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIVertexWeight malloc(MemoryStack stack) {
        return new AIVertexWeight(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AIVertexWeight} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIVertexWeight calloc(MemoryStack stack) {
        return new AIVertexWeight(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AIVertexWeight.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIVertexWeight.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIVertexWeight.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIVertexWeight.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mVertexId}. */
    public static int nmVertexId(long struct) { return memGetInt(struct + AIVertexWeight.MVERTEXID); }
    /** Unsafe version of {@link #mWeight}. */
    public static float nmWeight(long struct) { return memGetFloat(struct + AIVertexWeight.MWEIGHT); }

    /** Unsafe version of {@link #mVertexId(int) mVertexId}. */
    public static void nmVertexId(long struct, int value) { memPutInt(struct + AIVertexWeight.MVERTEXID, value); }
    /** Unsafe version of {@link #mWeight(float) mWeight}. */
    public static void nmWeight(long struct, float value) { memPutFloat(struct + AIVertexWeight.MWEIGHT, value); }

    // -----------------------------------

    /** An array of {@link AIVertexWeight} structs. */
    public static class Buffer extends StructBuffer<AIVertexWeight, Buffer> implements NativeResource {

        private static final AIVertexWeight ELEMENT_FACTORY = AIVertexWeight.create(-1L);

        /**
         * Creates a new {@code AIVertexWeight.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIVertexWeight#SIZEOF}, and its mark will be undefined.</p>
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
        protected AIVertexWeight getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AIVertexWeight#mVertexId} field. */
        @NativeType("unsigned int")
        public int mVertexId() { return AIVertexWeight.nmVertexId(address()); }
        /** @return the value of the {@link AIVertexWeight#mWeight} field. */
        public float mWeight() { return AIVertexWeight.nmWeight(address()); }

        /** Sets the specified value to the {@link AIVertexWeight#mVertexId} field. */
        public AIVertexWeight.Buffer mVertexId(@NativeType("unsigned int") int value) { AIVertexWeight.nmVertexId(address(), value); return this; }
        /** Sets the specified value to the {@link AIVertexWeight#mWeight} field. */
        public AIVertexWeight.Buffer mWeight(float value) { AIVertexWeight.nmWeight(address(), value); return this; }

    }

}