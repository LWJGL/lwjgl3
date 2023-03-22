/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct CUgraphExecUpdateResultInfo {
 *     CUgraphExecUpdateResult result;
 *     CUgraphNode errorNode;
 *     CUgraphNode errorFromNode;
 * }</code></pre>
 */
public class CUgraphExecUpdateResultInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESULT,
        ERRORNODE,
        ERRORFROMNODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESULT = layout.offsetof(0);
        ERRORNODE = layout.offsetof(1);
        ERRORFROMNODE = layout.offsetof(2);
    }

    /**
     * Creates a {@code CUgraphExecUpdateResultInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUgraphExecUpdateResultInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code result} field. */
    @NativeType("CUgraphExecUpdateResult")
    public int result() { return nresult(address()); }
    /** @return the value of the {@code errorNode} field. */
    @NativeType("CUgraphNode")
    public long errorNode() { return nerrorNode(address()); }
    /** @return the value of the {@code errorFromNode} field. */
    @NativeType("CUgraphNode")
    public long errorFromNode() { return nerrorFromNode(address()); }

    // -----------------------------------

    /** Returns a new {@code CUgraphExecUpdateResultInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUgraphExecUpdateResultInfo malloc() {
        return wrap(CUgraphExecUpdateResultInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code CUgraphExecUpdateResultInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUgraphExecUpdateResultInfo calloc() {
        return wrap(CUgraphExecUpdateResultInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code CUgraphExecUpdateResultInfo} instance allocated with {@link BufferUtils}. */
    public static CUgraphExecUpdateResultInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(CUgraphExecUpdateResultInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code CUgraphExecUpdateResultInfo} instance for the specified memory address. */
    public static CUgraphExecUpdateResultInfo create(long address) {
        return wrap(CUgraphExecUpdateResultInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUgraphExecUpdateResultInfo createSafe(long address) {
        return address == NULL ? null : wrap(CUgraphExecUpdateResultInfo.class, address);
    }

    /**
     * Returns a new {@link CUgraphExecUpdateResultInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUgraphExecUpdateResultInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUgraphExecUpdateResultInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUgraphExecUpdateResultInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUgraphExecUpdateResultInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUgraphExecUpdateResultInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link CUgraphExecUpdateResultInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUgraphExecUpdateResultInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUgraphExecUpdateResultInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code CUgraphExecUpdateResultInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUgraphExecUpdateResultInfo malloc(MemoryStack stack) {
        return wrap(CUgraphExecUpdateResultInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code CUgraphExecUpdateResultInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUgraphExecUpdateResultInfo calloc(MemoryStack stack) {
        return wrap(CUgraphExecUpdateResultInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link CUgraphExecUpdateResultInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUgraphExecUpdateResultInfo.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUgraphExecUpdateResultInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUgraphExecUpdateResultInfo.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #result}. */
    public static int nresult(long struct) { return UNSAFE.getInt(null, struct + CUgraphExecUpdateResultInfo.RESULT); }
    /** Unsafe version of {@link #errorNode}. */
    public static long nerrorNode(long struct) { return memGetAddress(struct + CUgraphExecUpdateResultInfo.ERRORNODE); }
    /** Unsafe version of {@link #errorFromNode}. */
    public static long nerrorFromNode(long struct) { return memGetAddress(struct + CUgraphExecUpdateResultInfo.ERRORFROMNODE); }

    // -----------------------------------

    /** An array of {@link CUgraphExecUpdateResultInfo} structs. */
    public static class Buffer extends StructBuffer<CUgraphExecUpdateResultInfo, Buffer> implements NativeResource {

        private static final CUgraphExecUpdateResultInfo ELEMENT_FACTORY = CUgraphExecUpdateResultInfo.create(-1L);

        /**
         * Creates a new {@code CUgraphExecUpdateResultInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUgraphExecUpdateResultInfo#SIZEOF}, and its mark will be undefined.
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
        protected CUgraphExecUpdateResultInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code result} field. */
        @NativeType("CUgraphExecUpdateResult")
        public int result() { return CUgraphExecUpdateResultInfo.nresult(address()); }
        /** @return the value of the {@code errorNode} field. */
        @NativeType("CUgraphNode")
        public long errorNode() { return CUgraphExecUpdateResultInfo.nerrorNode(address()); }
        /** @return the value of the {@code errorFromNode} field. */
        @NativeType("CUgraphNode")
        public long errorFromNode() { return CUgraphExecUpdateResultInfo.nerrorFromNode(address()); }

    }

}