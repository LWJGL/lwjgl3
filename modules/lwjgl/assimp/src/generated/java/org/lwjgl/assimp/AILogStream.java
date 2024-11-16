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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Represents a log stream. A log stream receives all log messages and streams them somewhere
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct aiLogStream {
 *     {@link AILogStreamCallbackI aiLogStreamCallback} {@link #callback};
 *     char * {@link #user};
 * }</code></pre>
 */
@NativeType("struct aiLogStream")
public class AILogStream extends Struct<AILogStream> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CALLBACK,
        USER;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CALLBACK = layout.offsetof(0);
        USER = layout.offsetof(1);
    }

    protected AILogStream(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected AILogStream create(long address, @Nullable ByteBuffer container) {
        return new AILogStream(address, container);
    }

    /**
     * Creates a {@code AILogStream} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public AILogStream(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** callback to be called */
    @NativeType("aiLogStreamCallback")
    public AILogStreamCallback callback() { return ncallback(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return user data to be passed to the callback
     */
    @NativeType("char *")
    public @Nullable ByteBuffer user(int capacity) { return nuser(address(), capacity); }

    /** Sets the specified value to the {@link #callback} field. */
    public AILogStream callback(@NativeType("aiLogStreamCallback") AILogStreamCallbackI value) { ncallback(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@link #user} field. */
    public AILogStream user(@Nullable @NativeType("char *") ByteBuffer value) { nuser(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public AILogStream set(
        AILogStreamCallbackI callback,
        @Nullable ByteBuffer user
    ) {
        callback(callback);
        user(user);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public AILogStream set(AILogStream src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code AILogStream} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static AILogStream malloc() {
        return new AILogStream(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code AILogStream} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static AILogStream calloc() {
        return new AILogStream(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code AILogStream} instance allocated with {@link BufferUtils}. */
    public static AILogStream create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new AILogStream(memAddress(container), container);
    }

    /** Returns a new {@code AILogStream} instance for the specified memory address. */
    public static AILogStream create(long address) {
        return new AILogStream(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable AILogStream createSafe(long address) {
        return address == NULL ? null : new AILogStream(address, null);
    }

    /**
     * Returns a new {@link AILogStream.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AILogStream.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link AILogStream.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static AILogStream.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AILogStream.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static AILogStream.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link AILogStream.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static AILogStream.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static AILogStream.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AILogStream mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AILogStream callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static AILogStream mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static AILogStream callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AILogStream.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AILogStream.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static AILogStream.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static AILogStream.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code AILogStream} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static AILogStream malloc(MemoryStack stack) {
        return new AILogStream(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code AILogStream} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static AILogStream calloc(MemoryStack stack) {
        return new AILogStream(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link AILogStream.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AILogStream.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link AILogStream.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static AILogStream.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #callback}. */
    public static AILogStreamCallback ncallback(long struct) { return AILogStreamCallback.create(memGetAddress(struct + AILogStream.CALLBACK)); }
    /** Unsafe version of {@link #user(int) user}. */
    public static @Nullable ByteBuffer nuser(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + AILogStream.USER), capacity); }

    /** Unsafe version of {@link #callback(AILogStreamCallbackI) callback}. */
    public static void ncallback(long struct, AILogStreamCallbackI value) { memPutAddress(struct + AILogStream.CALLBACK, value.address()); }
    /** Unsafe version of {@link #user(ByteBuffer) user}. */
    public static void nuser(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + AILogStream.USER, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + AILogStream.CALLBACK));
    }

    // -----------------------------------

    /** An array of {@link AILogStream} structs. */
    public static class Buffer extends StructBuffer<AILogStream, Buffer> implements NativeResource {

        private static final AILogStream ELEMENT_FACTORY = AILogStream.create(-1L);

        /**
         * Creates a new {@code AILogStream.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link AILogStream#SIZEOF}, and its mark will be undefined.</p>
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
        protected AILogStream getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link AILogStream#callback} field. */
        @NativeType("aiLogStreamCallback")
        public AILogStreamCallback callback() { return AILogStream.ncallback(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link AILogStream#user} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("char *")
        public @Nullable ByteBuffer user(int capacity) { return AILogStream.nuser(address(), capacity); }

        /** Sets the specified value to the {@link AILogStream#callback} field. */
        public AILogStream.Buffer callback(@NativeType("aiLogStreamCallback") AILogStreamCallbackI value) { AILogStream.ncallback(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@link AILogStream#user} field. */
        public AILogStream.Buffer user(@Nullable @NativeType("char *") ByteBuffer value) { AILogStream.nuser(address(), value); return this; }

    }

}