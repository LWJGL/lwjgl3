/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Represents an opaque set of settings to be used during importing.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiPropertyStore {
 *     char sentinel;
 * }</code></pre>
 */
@NativeType("struct aiPropertyStore")
public class AIPropertyStore extends Struct<AIPropertyStore> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SENTINEL;

    static {
        Layout layout = __struct(
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SENTINEL = layout.offsetof(0);
    }

    protected AIPropertyStore(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AIPropertyStore create(long address, @Nullable ByteBuffer container) {
        return new AIPropertyStore(address, container);
    }

    /**
     * Creates a {@code AIPropertyStore} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AIPropertyStore(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sentinel} field. */
    @NativeType("char")
    public byte sentinel() { return nsentinel(address()); }

    /** Sets the specified value to the {@code sentinel} field. */
    public AIPropertyStore sentinel(@NativeType("char") byte value) { nsentinel(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AIPropertyStore set(AIPropertyStore src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AIPropertyStore} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AIPropertyStore malloc() {
        return new AIPropertyStore(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AIPropertyStore} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AIPropertyStore calloc() {
        return new AIPropertyStore(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AIPropertyStore} instance allocated with {@link BufferUtils}. */
    public static AIPropertyStore create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AIPropertyStore(memAddress(container), container);
    }

    /** Returns a new {@code AIPropertyStore} instance for the specified memory address. */
    public static AIPropertyStore create(long address) {
        return new AIPropertyStore(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIPropertyStore createSafe(long address) {
        return address == NULL ? null : new AIPropertyStore(address, null);
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIPropertyStore.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AIPropertyStore.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AIPropertyStore.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AIPropertyStore.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AIPropertyStore.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static AIPropertyStore.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIPropertyStore mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIPropertyStore callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AIPropertyStore mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AIPropertyStore callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIPropertyStore.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIPropertyStore.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AIPropertyStore.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AIPropertyStore.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AIPropertyStore} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AIPropertyStore malloc(MemoryStack stack) {
        return new AIPropertyStore(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AIPropertyStore} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AIPropertyStore calloc(MemoryStack stack) {
        return new AIPropertyStore(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIPropertyStore.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AIPropertyStore.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AIPropertyStore.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sentinel}. */
    public static byte nsentinel(long struct) { return UNSAFE.getByte(null, struct + AIPropertyStore.SENTINEL); }

    /** Unsafe version of {@link #sentinel(byte) sentinel}. */
    public static void nsentinel(long struct, byte value) { UNSAFE.putByte(null, struct + AIPropertyStore.SENTINEL, value); }

    // -----------------------------------

    /** An array of {@link AIPropertyStore} structs. */
    public static class Buffer extends StructBuffer<AIPropertyStore, Buffer> implements NativeResource {

        private static final AIPropertyStore ELEMENT_FACTORY = AIPropertyStore.create(-1L);

        /**
         * Creates a new {@code AIPropertyStore.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AIPropertyStore#SIZEOF}, and its mark will be undefined.</p>
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
        protected AIPropertyStore getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sentinel} field. */
        @NativeType("char")
        public byte sentinel() { return AIPropertyStore.nsentinel(address()); }

        /** Sets the specified value to the {@code sentinel} field. */
        public AIPropertyStore.Buffer sentinel(@NativeType("char") byte value) { AIPropertyStore.nsentinel(address(), value); return this; }

    }

}