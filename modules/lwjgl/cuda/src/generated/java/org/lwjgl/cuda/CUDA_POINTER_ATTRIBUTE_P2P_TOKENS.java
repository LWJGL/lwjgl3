/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUDA_POINTER_ATTRIBUTE_P2P_TOKENS {
 *     unsigned long long p2pToken;
 *     unsigned int vaSpaceToken;
 * }</code></pre>
 */
public class CUDA_POINTER_ATTRIBUTE_P2P_TOKENS extends Struct<CUDA_POINTER_ATTRIBUTE_P2P_TOKENS> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        P2PTOKEN,
        VASPACETOKEN;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        P2PTOKEN = layout.offsetof(0);
        VASPACETOKEN = layout.offsetof(1);
    }

    protected CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUDA_POINTER_ATTRIBUTE_P2P_TOKENS create(long address, @Nullable ByteBuffer container) {
        return new CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(address, container);
    }

    /**
     * Creates a {@code CUDA_POINTER_ATTRIBUTE_P2P_TOKENS} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code p2pToken} field. */
    @NativeType("unsigned long long")
    public long p2pToken() { return np2pToken(address()); }
    /** @return the value of the {@code vaSpaceToken} field. */
    @NativeType("unsigned int")
    public int vaSpaceToken() { return nvaSpaceToken(address()); }

    /** Sets the specified value to the {@code p2pToken} field. */
    public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS p2pToken(@NativeType("unsigned long long") long value) { np2pToken(address(), value); return this; }
    /** Sets the specified value to the {@code vaSpaceToken} field. */
    public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS vaSpaceToken(@NativeType("unsigned int") int value) { nvaSpaceToken(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS set(
        long p2pToken,
        int vaSpaceToken
    ) {
        p2pToken(p2pToken);
        vaSpaceToken(vaSpaceToken);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS set(CUDA_POINTER_ATTRIBUTE_P2P_TOKENS src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUDA_POINTER_ATTRIBUTE_P2P_TOKENS} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS malloc() {
        return new CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUDA_POINTER_ATTRIBUTE_P2P_TOKENS} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS calloc() {
        return new CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUDA_POINTER_ATTRIBUTE_P2P_TOKENS} instance allocated with {@link BufferUtils}. */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(memAddress(container), container);
    }

    /** Returns a new {@code CUDA_POINTER_ATTRIBUTE_P2P_TOKENS} instance for the specified memory address. */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS create(long address) {
        return new CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable CUDA_POINTER_ATTRIBUTE_P2P_TOKENS createSafe(long address) {
        return address == NULL ? null : new CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(address, null);
    }

    /**
     * Returns a new {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUDA_POINTER_ATTRIBUTE_P2P_TOKENS} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS malloc(MemoryStack stack) {
        return new CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUDA_POINTER_ATTRIBUTE_P2P_TOKENS} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS calloc(MemoryStack stack) {
        return new CUDA_POINTER_ATTRIBUTE_P2P_TOKENS(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #p2pToken}. */
    public static long np2pToken(long struct) { return memGetLong(struct + CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.P2PTOKEN); }
    /** Unsafe version of {@link #vaSpaceToken}. */
    public static int nvaSpaceToken(long struct) { return memGetInt(struct + CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.VASPACETOKEN); }

    /** Unsafe version of {@link #p2pToken(long) p2pToken}. */
    public static void np2pToken(long struct, long value) { memPutLong(struct + CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.P2PTOKEN, value); }
    /** Unsafe version of {@link #vaSpaceToken(int) vaSpaceToken}. */
    public static void nvaSpaceToken(long struct, int value) { memPutInt(struct + CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.VASPACETOKEN, value); }

    // -----------------------------------

    /** An array of {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS} structs. */
    public static class Buffer extends StructBuffer<CUDA_POINTER_ATTRIBUTE_P2P_TOKENS, Buffer> implements NativeResource {

        private static final CUDA_POINTER_ATTRIBUTE_P2P_TOKENS ELEMENT_FACTORY = CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.create(-1L);

        /**
         * Creates a new {@code CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUDA_POINTER_ATTRIBUTE_P2P_TOKENS#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUDA_POINTER_ATTRIBUTE_P2P_TOKENS getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code p2pToken} field. */
        @NativeType("unsigned long long")
        public long p2pToken() { return CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.np2pToken(address()); }
        /** @return the value of the {@code vaSpaceToken} field. */
        @NativeType("unsigned int")
        public int vaSpaceToken() { return CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.nvaSpaceToken(address()); }

        /** Sets the specified value to the {@code p2pToken} field. */
        public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer p2pToken(@NativeType("unsigned long long") long value) { CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.np2pToken(address(), value); return this; }
        /** Sets the specified value to the {@code vaSpaceToken} field. */
        public CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.Buffer vaSpaceToken(@NativeType("unsigned int") int value) { CUDA_POINTER_ATTRIBUTE_P2P_TOKENS.nvaSpaceToken(address(), value); return this; }

    }

}