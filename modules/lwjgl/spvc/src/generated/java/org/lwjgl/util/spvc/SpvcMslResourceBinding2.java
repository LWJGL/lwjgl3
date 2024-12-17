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
 * <pre>{@code
 * struct spvc_msl_resource_binding_2 {
 *     SpvExecutionModel stage;
 *     unsigned int desc_set;
 *     unsigned int binding;
 *     unsigned int count;
 *     unsigned int msl_buffer;
 *     unsigned int msl_texture;
 *     unsigned int msl_sampler;
 * }}</pre>
 */
@NativeType("struct spvc_msl_resource_binding_2")
public class SpvcMslResourceBinding2 extends Struct<SpvcMslResourceBinding2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STAGE,
        DESC_SET,
        BINDING,
        COUNT,
        MSL_BUFFER,
        MSL_TEXTURE,
        MSL_SAMPLER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STAGE = layout.offsetof(0);
        DESC_SET = layout.offsetof(1);
        BINDING = layout.offsetof(2);
        COUNT = layout.offsetof(3);
        MSL_BUFFER = layout.offsetof(4);
        MSL_TEXTURE = layout.offsetof(5);
        MSL_SAMPLER = layout.offsetof(6);
    }

    protected SpvcMslResourceBinding2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SpvcMslResourceBinding2 create(long address, @Nullable ByteBuffer container) {
        return new SpvcMslResourceBinding2(address, container);
    }

    /**
     * Creates a {@code SpvcMslResourceBinding2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SpvcMslResourceBinding2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code stage} field. */
    @NativeType("SpvExecutionModel")
    public int stage() { return nstage(address()); }
    /** @return the value of the {@code desc_set} field. */
    @NativeType("unsigned int")
    public int desc_set() { return ndesc_set(address()); }
    /** @return the value of the {@code binding} field. */
    @NativeType("unsigned int")
    public int binding() { return nbinding(address()); }
    /** @return the value of the {@code count} field. */
    @NativeType("unsigned int")
    public int count() { return ncount(address()); }
    /** @return the value of the {@code msl_buffer} field. */
    @NativeType("unsigned int")
    public int msl_buffer() { return nmsl_buffer(address()); }
    /** @return the value of the {@code msl_texture} field. */
    @NativeType("unsigned int")
    public int msl_texture() { return nmsl_texture(address()); }
    /** @return the value of the {@code msl_sampler} field. */
    @NativeType("unsigned int")
    public int msl_sampler() { return nmsl_sampler(address()); }

    /** Sets the specified value to the {@code stage} field. */
    public SpvcMslResourceBinding2 stage(@NativeType("SpvExecutionModel") int value) { nstage(address(), value); return this; }
    /** Sets the specified value to the {@code desc_set} field. */
    public SpvcMslResourceBinding2 desc_set(@NativeType("unsigned int") int value) { ndesc_set(address(), value); return this; }
    /** Sets the specified value to the {@code binding} field. */
    public SpvcMslResourceBinding2 binding(@NativeType("unsigned int") int value) { nbinding(address(), value); return this; }
    /** Sets the specified value to the {@code count} field. */
    public SpvcMslResourceBinding2 count(@NativeType("unsigned int") int value) { ncount(address(), value); return this; }
    /** Sets the specified value to the {@code msl_buffer} field. */
    public SpvcMslResourceBinding2 msl_buffer(@NativeType("unsigned int") int value) { nmsl_buffer(address(), value); return this; }
    /** Sets the specified value to the {@code msl_texture} field. */
    public SpvcMslResourceBinding2 msl_texture(@NativeType("unsigned int") int value) { nmsl_texture(address(), value); return this; }
    /** Sets the specified value to the {@code msl_sampler} field. */
    public SpvcMslResourceBinding2 msl_sampler(@NativeType("unsigned int") int value) { nmsl_sampler(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SpvcMslResourceBinding2 set(
        int stage,
        int desc_set,
        int binding,
        int count,
        int msl_buffer,
        int msl_texture,
        int msl_sampler
    ) {
        stage(stage);
        desc_set(desc_set);
        binding(binding);
        count(count);
        msl_buffer(msl_buffer);
        msl_texture(msl_texture);
        msl_sampler(msl_sampler);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SpvcMslResourceBinding2 set(SpvcMslResourceBinding2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SpvcMslResourceBinding2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SpvcMslResourceBinding2 malloc() {
        return new SpvcMslResourceBinding2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SpvcMslResourceBinding2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SpvcMslResourceBinding2 calloc() {
        return new SpvcMslResourceBinding2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SpvcMslResourceBinding2} instance allocated with {@link BufferUtils}. */
    public static SpvcMslResourceBinding2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcMslResourceBinding2(memAddress(container), container);
    }

    /** Returns a new {@code SpvcMslResourceBinding2} instance for the specified memory address. */
    public static SpvcMslResourceBinding2 create(long address) {
        return new SpvcMslResourceBinding2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SpvcMslResourceBinding2 createSafe(long address) {
        return address == NULL ? null : new SpvcMslResourceBinding2(address, null);
    }

    /**
     * Returns a new {@link SpvcMslResourceBinding2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SpvcMslResourceBinding2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslResourceBinding2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SpvcMslResourceBinding2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SpvcMslResourceBinding2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SpvcMslResourceBinding2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslResourceBinding2 malloc(MemoryStack stack) {
        return new SpvcMslResourceBinding2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SpvcMslResourceBinding2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SpvcMslResourceBinding2 calloc(MemoryStack stack) {
        return new SpvcMslResourceBinding2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SpvcMslResourceBinding2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SpvcMslResourceBinding2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SpvcMslResourceBinding2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #stage}. */
    public static int nstage(long struct) { return memGetInt(struct + SpvcMslResourceBinding2.STAGE); }
    /** Unsafe version of {@link #desc_set}. */
    public static int ndesc_set(long struct) { return memGetInt(struct + SpvcMslResourceBinding2.DESC_SET); }
    /** Unsafe version of {@link #binding}. */
    public static int nbinding(long struct) { return memGetInt(struct + SpvcMslResourceBinding2.BINDING); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return memGetInt(struct + SpvcMslResourceBinding2.COUNT); }
    /** Unsafe version of {@link #msl_buffer}. */
    public static int nmsl_buffer(long struct) { return memGetInt(struct + SpvcMslResourceBinding2.MSL_BUFFER); }
    /** Unsafe version of {@link #msl_texture}. */
    public static int nmsl_texture(long struct) { return memGetInt(struct + SpvcMslResourceBinding2.MSL_TEXTURE); }
    /** Unsafe version of {@link #msl_sampler}. */
    public static int nmsl_sampler(long struct) { return memGetInt(struct + SpvcMslResourceBinding2.MSL_SAMPLER); }

    /** Unsafe version of {@link #stage(int) stage}. */
    public static void nstage(long struct, int value) { memPutInt(struct + SpvcMslResourceBinding2.STAGE, value); }
    /** Unsafe version of {@link #desc_set(int) desc_set}. */
    public static void ndesc_set(long struct, int value) { memPutInt(struct + SpvcMslResourceBinding2.DESC_SET, value); }
    /** Unsafe version of {@link #binding(int) binding}. */
    public static void nbinding(long struct, int value) { memPutInt(struct + SpvcMslResourceBinding2.BINDING, value); }
    /** Unsafe version of {@link #count(int) count}. */
    public static void ncount(long struct, int value) { memPutInt(struct + SpvcMslResourceBinding2.COUNT, value); }
    /** Unsafe version of {@link #msl_buffer(int) msl_buffer}. */
    public static void nmsl_buffer(long struct, int value) { memPutInt(struct + SpvcMslResourceBinding2.MSL_BUFFER, value); }
    /** Unsafe version of {@link #msl_texture(int) msl_texture}. */
    public static void nmsl_texture(long struct, int value) { memPutInt(struct + SpvcMslResourceBinding2.MSL_TEXTURE, value); }
    /** Unsafe version of {@link #msl_sampler(int) msl_sampler}. */
    public static void nmsl_sampler(long struct, int value) { memPutInt(struct + SpvcMslResourceBinding2.MSL_SAMPLER, value); }

    // -----------------------------------

    /** An array of {@link SpvcMslResourceBinding2} structs. */
    public static class Buffer extends StructBuffer<SpvcMslResourceBinding2, Buffer> implements NativeResource {

        private static final SpvcMslResourceBinding2 ELEMENT_FACTORY = SpvcMslResourceBinding2.create(-1L);

        /**
         * Creates a new {@code SpvcMslResourceBinding2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SpvcMslResourceBinding2#SIZEOF}, and its mark will be undefined.</p>
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
        protected SpvcMslResourceBinding2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code stage} field. */
        @NativeType("SpvExecutionModel")
        public int stage() { return SpvcMslResourceBinding2.nstage(address()); }
        /** @return the value of the {@code desc_set} field. */
        @NativeType("unsigned int")
        public int desc_set() { return SpvcMslResourceBinding2.ndesc_set(address()); }
        /** @return the value of the {@code binding} field. */
        @NativeType("unsigned int")
        public int binding() { return SpvcMslResourceBinding2.nbinding(address()); }
        /** @return the value of the {@code count} field. */
        @NativeType("unsigned int")
        public int count() { return SpvcMslResourceBinding2.ncount(address()); }
        /** @return the value of the {@code msl_buffer} field. */
        @NativeType("unsigned int")
        public int msl_buffer() { return SpvcMslResourceBinding2.nmsl_buffer(address()); }
        /** @return the value of the {@code msl_texture} field. */
        @NativeType("unsigned int")
        public int msl_texture() { return SpvcMslResourceBinding2.nmsl_texture(address()); }
        /** @return the value of the {@code msl_sampler} field. */
        @NativeType("unsigned int")
        public int msl_sampler() { return SpvcMslResourceBinding2.nmsl_sampler(address()); }

        /** Sets the specified value to the {@code stage} field. */
        public SpvcMslResourceBinding2.Buffer stage(@NativeType("SpvExecutionModel") int value) { SpvcMslResourceBinding2.nstage(address(), value); return this; }
        /** Sets the specified value to the {@code desc_set} field. */
        public SpvcMslResourceBinding2.Buffer desc_set(@NativeType("unsigned int") int value) { SpvcMslResourceBinding2.ndesc_set(address(), value); return this; }
        /** Sets the specified value to the {@code binding} field. */
        public SpvcMslResourceBinding2.Buffer binding(@NativeType("unsigned int") int value) { SpvcMslResourceBinding2.nbinding(address(), value); return this; }
        /** Sets the specified value to the {@code count} field. */
        public SpvcMslResourceBinding2.Buffer count(@NativeType("unsigned int") int value) { SpvcMslResourceBinding2.ncount(address(), value); return this; }
        /** Sets the specified value to the {@code msl_buffer} field. */
        public SpvcMslResourceBinding2.Buffer msl_buffer(@NativeType("unsigned int") int value) { SpvcMslResourceBinding2.nmsl_buffer(address(), value); return this; }
        /** Sets the specified value to the {@code msl_texture} field. */
        public SpvcMslResourceBinding2.Buffer msl_texture(@NativeType("unsigned int") int value) { SpvcMslResourceBinding2.nmsl_texture(address(), value); return this; }
        /** Sets the specified value to the {@code msl_sampler} field. */
        public SpvcMslResourceBinding2.Buffer msl_sampler(@NativeType("unsigned int") int value) { SpvcMslResourceBinding2.nmsl_sampler(address(), value); return this; }

    }

}