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
 * struct CUlaunchMemSyncDomainMap {
 *     unsigned char default_;
 *     unsigned char remote;
 * }</code></pre>
 */
public class CUlaunchMemSyncDomainMap extends Struct<CUlaunchMemSyncDomainMap> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DEFAULT_,
        REMOTE;

    static {
        Layout layout = __struct(
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DEFAULT_ = layout.offsetof(0);
        REMOTE = layout.offsetof(1);
    }

    protected CUlaunchMemSyncDomainMap(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected CUlaunchMemSyncDomainMap create(long address, @Nullable ByteBuffer container) {
        return new CUlaunchMemSyncDomainMap(address, container);
    }

    /**
     * Creates a {@code CUlaunchMemSyncDomainMap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public CUlaunchMemSyncDomainMap(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code default_} field. */
    @NativeType("unsigned char")
    public byte default_() { return ndefault_(address()); }
    /** @return the value of the {@code remote} field. */
    @NativeType("unsigned char")
    public byte remote() { return nremote(address()); }

    /** Sets the specified value to the {@code default_} field. */
    public CUlaunchMemSyncDomainMap default_(@NativeType("unsigned char") byte value) { ndefault_(address(), value); return this; }
    /** Sets the specified value to the {@code remote} field. */
    public CUlaunchMemSyncDomainMap remote(@NativeType("unsigned char") byte value) { nremote(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public CUlaunchMemSyncDomainMap set(
        byte default_,
        byte remote
    ) {
        default_(default_);
        remote(remote);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public CUlaunchMemSyncDomainMap set(CUlaunchMemSyncDomainMap src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code CUlaunchMemSyncDomainMap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static CUlaunchMemSyncDomainMap malloc() {
        return new CUlaunchMemSyncDomainMap(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code CUlaunchMemSyncDomainMap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static CUlaunchMemSyncDomainMap calloc() {
        return new CUlaunchMemSyncDomainMap(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code CUlaunchMemSyncDomainMap} instance allocated with {@link BufferUtils}. */
    public static CUlaunchMemSyncDomainMap create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new CUlaunchMemSyncDomainMap(memAddress(container), container);
    }

    /** Returns a new {@code CUlaunchMemSyncDomainMap} instance for the specified memory address. */
    public static CUlaunchMemSyncDomainMap create(long address) {
        return new CUlaunchMemSyncDomainMap(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUlaunchMemSyncDomainMap createSafe(long address) {
        return address == NULL ? null : new CUlaunchMemSyncDomainMap(address, null);
    }

    /**
     * Returns a new {@link CUlaunchMemSyncDomainMap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchMemSyncDomainMap.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link CUlaunchMemSyncDomainMap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchMemSyncDomainMap.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUlaunchMemSyncDomainMap.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static CUlaunchMemSyncDomainMap.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link CUlaunchMemSyncDomainMap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static CUlaunchMemSyncDomainMap.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static CUlaunchMemSyncDomainMap.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code CUlaunchMemSyncDomainMap} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static CUlaunchMemSyncDomainMap malloc(MemoryStack stack) {
        return new CUlaunchMemSyncDomainMap(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code CUlaunchMemSyncDomainMap} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static CUlaunchMemSyncDomainMap calloc(MemoryStack stack) {
        return new CUlaunchMemSyncDomainMap(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link CUlaunchMemSyncDomainMap.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUlaunchMemSyncDomainMap.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link CUlaunchMemSyncDomainMap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static CUlaunchMemSyncDomainMap.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #default_}. */
    public static byte ndefault_(long struct) { return UNSAFE.getByte(null, struct + CUlaunchMemSyncDomainMap.DEFAULT_); }
    /** Unsafe version of {@link #remote}. */
    public static byte nremote(long struct) { return UNSAFE.getByte(null, struct + CUlaunchMemSyncDomainMap.REMOTE); }

    /** Unsafe version of {@link #default_(byte) default_}. */
    public static void ndefault_(long struct, byte value) { UNSAFE.putByte(null, struct + CUlaunchMemSyncDomainMap.DEFAULT_, value); }
    /** Unsafe version of {@link #remote(byte) remote}. */
    public static void nremote(long struct, byte value) { UNSAFE.putByte(null, struct + CUlaunchMemSyncDomainMap.REMOTE, value); }

    // -----------------------------------

    /** An array of {@link CUlaunchMemSyncDomainMap} structs. */
    public static class Buffer extends StructBuffer<CUlaunchMemSyncDomainMap, Buffer> implements NativeResource {

        private static final CUlaunchMemSyncDomainMap ELEMENT_FACTORY = CUlaunchMemSyncDomainMap.create(-1L);

        /**
         * Creates a new {@code CUlaunchMemSyncDomainMap.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link CUlaunchMemSyncDomainMap#SIZEOF}, and its mark will be undefined.</p>
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
        protected CUlaunchMemSyncDomainMap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code default_} field. */
        @NativeType("unsigned char")
        public byte default_() { return CUlaunchMemSyncDomainMap.ndefault_(address()); }
        /** @return the value of the {@code remote} field. */
        @NativeType("unsigned char")
        public byte remote() { return CUlaunchMemSyncDomainMap.nremote(address()); }

        /** Sets the specified value to the {@code default_} field. */
        public CUlaunchMemSyncDomainMap.Buffer default_(@NativeType("unsigned char") byte value) { CUlaunchMemSyncDomainMap.ndefault_(address(), value); return this; }
        /** Sets the specified value to the {@code remote} field. */
        public CUlaunchMemSyncDomainMap.Buffer remote(@NativeType("unsigned char") byte value) { CUlaunchMemSyncDomainMap.nremote(address(), value); return this; }

    }

}