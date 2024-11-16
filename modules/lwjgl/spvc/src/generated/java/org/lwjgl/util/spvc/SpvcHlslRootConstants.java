/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spvc;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Specifying a root constant (d3d12) or push constant range (vulkan).
 * 
 * <p>{@code start} and {@code end} denotes the range of the root constant in bytes. Both values need to be multiple of 4.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct spvc_hlsl_root_constants {
 *     unsigned int start;
 *     unsigned int end;
 *     unsigned int binding;
 *     unsigned int space;
 * }</code></pre>
 */
@NativeType("struct spvc_hlsl_root_constants")
public class SpvcHlslRootConstants extends Struct<SpvcHlslRootConstants> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        START,
        END,
        BINDING,
        SPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        START = layout.offsetof(0);
        END = layout.offsetof(1);
        BINDING = layout.offsetof(2);
        SPACE = layout.offsetof(3);
    }

    protected SpvcHlslRootConstants(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpvcHlslRootConstants create(long address, @Nullable ByteBuffer container) {
        return new SpvcHlslRootConstants(address, container);
    }

    /**
     * Creates a {@code SpvcHlslRootConstants} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcHlslRootConstants(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code start} field. */
    @NativeType("unsigned int")
    public int start() { return nstart(address()); }
    /** @return the value of the {@code end} field. */
    @NativeType("unsigned int")
    public int end() { return nend(address()); }
    /** @return the value of the {@code binding} field. */
    @NativeType("unsigned int")
    public int binding() { return nbinding(address()); }
    /** @return the value of the {@code space} field. */
    @NativeType("unsigned int")
    public int space() { return nspace(address()); }

    /** Sets the specified value to the {@code start} field. */
    public SpvcHlslRootConstants start(@NativeType("unsigned int") int value) { nstart(address(), value); return this; }
    /** Sets the specified value to the {@code end} field. */
    public SpvcHlslRootConstants end(@NativeType("unsigned int") int value) { nend(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public SpvcHlslRootConstants binding(@NativeType("unsigned int") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code space} field. */
    public SpvcHlslRootConstants space(@NativeType("unsigned int") int value) { nspace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcHlslRootConstants set(
        int start,
        int end,
        int binding,
        int space
    ) {
        start(start);
        end(end);
        binding(binding);
        space(space);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcHlslRootConstants set(SpvcHlslRootConstants src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcHlslRootConstants} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcHlslRootConstants malloc() {
        return new SpvcHlslRootConstants(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpvcHlslRootConstants} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcHlslRootConstants calloc() {
        return new SpvcHlslRootConstants(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpvcHlslRootConstants} instance allocated with {@link BufferUtils}. */
    public static SpvcHlslRootConstants create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcHlslRootConstants(memAddress(container), container);
    }

    /** Returns a new {@code SpvcHlslRootConstants} instance for the specified memory address. */
    public static SpvcHlslRootConstants create(long address) {
        return new SpvcHlslRootConstants(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpvcHlslRootConstants createSafe(long address) {
        return address == NULL ? null : new SpvcHlslRootConstants(address, null);
    }

    /**
     * Returns a new {@link SpvcHlslRootConstants.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHlslRootConstants.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcHlslRootConstants.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHlslRootConstants.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcHlslRootConstants.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcHlslRootConstants.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpvcHlslRootConstants.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcHlslRootConstants.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpvcHlslRootConstants.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpvcHlslRootConstants} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcHlslRootConstants malloc(MemoryStack stack) {
        return new SpvcHlslRootConstants(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpvcHlslRootConstants} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcHlslRootConstants calloc(MemoryStack stack) {
        return new SpvcHlslRootConstants(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpvcHlslRootConstants.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcHlslRootConstants.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcHlslRootConstants.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcHlslRootConstants.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #start}. */
    public static int nstart(long struct) { return memGetInt(struct + SpvcHlslRootConstants.START); }
    /** Unsafe version of {@link #end}. */
    public static int nend(long struct) { return memGetInt(struct + SpvcHlslRootConstants.END); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return memGetInt(struct + SpvcHlslRootConstants.BINDING); }
    /** Unsafe version of {@link #space}. */
    public static int nspace(long struct) { return memGetInt(struct + SpvcHlslRootConstants.SPACE); }

    /** Unsafe version of {@link #start(int) start}. */
    public static void nstart(long struct, int value) { memPutInt(struct + SpvcHlslRootConstants.START, value); }
    /** Unsafe version of {@link #end(int) end}. */
    public static void nend(long struct, int value) { memPutInt(struct + SpvcHlslRootConstants.END, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { memPutInt(struct + SpvcHlslRootConstants.BINDING, value); }
    /** Unsafe version of {@link #space(int) space}. */
    public static void nspace(long struct, int value) { memPutInt(struct + SpvcHlslRootConstants.SPACE, value); }

    // -----------------------------------

    /** An array of {@link SpvcHlslRootConstants} structs. */
    public static class Buffer extends StructBuffer<SpvcHlslRootConstants, Buffer> implements NativeResource {

        private static final SpvcHlslRootConstants ELEMENT_FACTORY = SpvcHlslRootConstants.create(-1L);

        /**
         * Creates a new {@code SpvcHlslRootConstants.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcHlslRootConstants#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpvcHlslRootConstants getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code start} field. */
        @NativeType("unsigned int")
        public int start() { return SpvcHlslRootConstants.nstart(address()); }
        /** @return the value of the {@code end} field. */
        @NativeType("unsigned int")
        public int end() { return SpvcHlslRootConstants.nend(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("unsigned int")
        public int binding() { return SpvcHlslRootConstants.nbinding(address()); }
        /** @return the value of the {@code space} field. */
        @NativeType("unsigned int")
        public int space() { return SpvcHlslRootConstants.nspace(address()); }

        /** Sets the specified value to the {@code start} field. */
        public SpvcHlslRootConstants.Buffer start(@NativeType("unsigned int") int value) { SpvcHlslRootConstants.nstart(address(), value); return this; }
        /** Sets the specified value to the {@code end} field. */
        public SpvcHlslRootConstants.Buffer end(@NativeType("unsigned int") int value) { SpvcHlslRootConstants.nend(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public SpvcHlslRootConstants.Buffer binding(@NativeType("unsigned int") int value) { SpvcHlslRootConstants.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code space} field. */
        public SpvcHlslRootConstants.Buffer space(@NativeType("unsigned int") int value) { SpvcHlslRootConstants.nspace(address(), value); return this; }

    }

}