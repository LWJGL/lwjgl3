/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.freetype;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A structure used to describe an input stream.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_StreamRec {
 *     unsigned char * base;
 *     unsigned long size;
 *     unsigned long pos;
 *     {@link FT_StreamDesc FT_StreamDesc} descriptor;
 *     {@link FT_StreamDesc FT_StreamDesc} pathname;
 *     {@link FT_Stream_IoFuncI FT_Stream_IoFunc} read;
 *     {@link FT_Stream_CloseFuncI FT_Stream_CloseFunc} close;
 *     FT_Memory memory;
 *     unsigned char * cursor;
 *     unsigned char * limit;
 * }</code></pre>
 */
@NativeType("struct FT_StreamRec")
public class FT_Stream extends Struct<FT_Stream> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BASE,
        SIZE,
        POS,
        DESCRIPTOR,
        PATHNAME,
        READ,
        CLOSE,
        MEMORY,
        CURSOR,
        LIMIT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(FT_StreamDesc.SIZEOF, FT_StreamDesc.ALIGNOF),
            __member(FT_StreamDesc.SIZEOF, FT_StreamDesc.ALIGNOF),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BASE = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        POS = layout.offsetof(2);
        DESCRIPTOR = layout.offsetof(3);
        PATHNAME = layout.offsetof(4);
        READ = layout.offsetof(5);
        CLOSE = layout.offsetof(6);
        MEMORY = layout.offsetof(7);
        CURSOR = layout.offsetof(8);
        LIMIT = layout.offsetof(9);
    }

    protected FT_Stream(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Stream create(long address, @Nullable ByteBuffer container) {
        return new FT_Stream(address, container);
    }

    /**
     * Creates a {@code FT_Stream} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Stream(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code base} field. */
    @Nullable
    @NativeType("unsigned char *")
    public ByteBuffer base() { return nbase(address()); }
    /** @return the value of the {@code size} field. */
    @NativeType("unsigned long")
    public long size() { return nsize(address()); }
    /** @return the value of the {@code pos} field. */
    @NativeType("unsigned long")
    public long pos() { return npos(address()); }
    /** @return a {@link FT_StreamDesc} view of the {@code descriptor} field. */
    public FT_StreamDesc descriptor() { return ndescriptor(address()); }
    /** @return a {@link FT_StreamDesc} view of the {@code pathname} field. */
    public FT_StreamDesc pathname() { return npathname(address()); }
    /** @return the value of the {@code read} field. */
    @Nullable
    public FT_Stream_IoFunc read() { return nread(address()); }
    /** @return the value of the {@code close} field. */
    @Nullable
    public FT_Stream_CloseFunc close$() { return nclose$(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@code base} field. */
    public FT_Stream base(@Nullable @NativeType("unsigned char *") ByteBuffer value) { nbase(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public FT_Stream size(@NativeType("unsigned long") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code pos} field. */
    public FT_Stream pos(@NativeType("unsigned long") long value) { npos(address(), value); return this; }
    /** Copies the specified {@link FT_StreamDesc} to the {@code descriptor} field. */
    public FT_Stream descriptor(FT_StreamDesc value) { ndescriptor(address(), value); return this; }
    /** Passes the {@code descriptor} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FT_Stream descriptor(java.util.function.Consumer<FT_StreamDesc> consumer) { consumer.accept(descriptor()); return this; }
    /** Copies the specified {@link FT_StreamDesc} to the {@code pathname} field. */
    public FT_Stream pathname(FT_StreamDesc value) { npathname(address(), value); return this; }
    /** Passes the {@code pathname} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FT_Stream pathname(java.util.function.Consumer<FT_StreamDesc> consumer) { consumer.accept(pathname()); return this; }
    /** Sets the specified value to the {@code read} field. */
    public FT_Stream read(@Nullable @NativeType("FT_Stream_IoFunc") FT_Stream_IoFuncI value) { nread(address(), value); return this; }
    /** Sets the specified value to the {@code close} field. */
    public FT_Stream close$(@Nullable @NativeType("FT_Stream_CloseFunc") FT_Stream_CloseFuncI value) { nclose$(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Stream set(
        @Nullable ByteBuffer base,
        long size,
        long pos,
        FT_StreamDesc descriptor,
        FT_StreamDesc pathname,
        @Nullable FT_Stream_IoFuncI read,
        @Nullable FT_Stream_CloseFuncI close$
    ) {
        base(base);
        size(size);
        pos(pos);
        descriptor(descriptor);
        pathname(pathname);
        read(read);
        close$(close$);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Stream set(FT_Stream src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Stream} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Stream malloc() {
        return new FT_Stream(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Stream} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Stream calloc() {
        return new FT_Stream(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Stream} instance allocated with {@link BufferUtils}. */
    public static FT_Stream create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Stream(memAddress(container), container);
    }

    /** Returns a new {@code FT_Stream} instance for the specified memory address. */
    public static FT_Stream create(long address) {
        return new FT_Stream(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Stream createSafe(long address) {
        return address == NULL ? null : new FT_Stream(address, null);
    }

    /**
     * Returns a new {@link FT_Stream.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Stream.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Stream.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Stream.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Stream.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Stream.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Stream.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Stream.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Stream.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Stream} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Stream malloc(MemoryStack stack) {
        return new FT_Stream(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Stream} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Stream calloc(MemoryStack stack) {
        return new FT_Stream(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Stream.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Stream.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Stream.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Stream.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #base() base}. */
    @Nullable public static ByteBuffer nbase(long struct) { return memByteBufferSafe(memGetAddress(struct + FT_Stream.BASE), (int)nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetCLong(struct + FT_Stream.SIZE); }
    /** Unsafe version of {@link #pos}. */
    public static long npos(long struct) { return memGetCLong(struct + FT_Stream.POS); }
    /** Unsafe version of {@link #descriptor}. */
    public static FT_StreamDesc ndescriptor(long struct) { return FT_StreamDesc.create(struct + FT_Stream.DESCRIPTOR); }
    /** Unsafe version of {@link #pathname}. */
    public static FT_StreamDesc npathname(long struct) { return FT_StreamDesc.create(struct + FT_Stream.PATHNAME); }
    /** Unsafe version of {@link #read}. */
    @Nullable public static FT_Stream_IoFunc nread(long struct) { return FT_Stream_IoFunc.createSafe(memGetAddress(struct + FT_Stream.READ)); }
    /** Unsafe version of {@link #close$}. */
    @Nullable public static FT_Stream_CloseFunc nclose$(long struct) { return FT_Stream_CloseFunc.createSafe(memGetAddress(struct + FT_Stream.CLOSE)); }
    @Nullable public static FT_Memory nmemory(long struct) { return FT_Memory.createSafe(memGetAddress(struct + FT_Stream.MEMORY)); }
    @Nullable public static ByteBuffer ncursor(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + FT_Stream.CURSOR), capacity); }
    @Nullable public static ByteBuffer nlimit$(long struct, int capacity) { return memByteBufferSafe(memGetAddress(struct + FT_Stream.LIMIT), capacity); }

    /** Unsafe version of {@link #base(ByteBuffer) base}. */
    public static void nbase(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + FT_Stream.BASE, memAddressSafe(value)); nsize(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, long value) { memPutCLong(struct + FT_Stream.SIZE, value); }
    /** Unsafe version of {@link #pos(long) pos}. */
    public static void npos(long struct, long value) { memPutCLong(struct + FT_Stream.POS, value); }
    /** Unsafe version of {@link #descriptor(FT_StreamDesc) descriptor}. */
    public static void ndescriptor(long struct, FT_StreamDesc value) { memCopy(value.address(), struct + FT_Stream.DESCRIPTOR, FT_StreamDesc.SIZEOF); }
    /** Unsafe version of {@link #pathname(FT_StreamDesc) pathname}. */
    public static void npathname(long struct, FT_StreamDesc value) { memCopy(value.address(), struct + FT_Stream.PATHNAME, FT_StreamDesc.SIZEOF); }
    /** Unsafe version of {@link #read(FT_Stream_IoFuncI) read}. */
    public static void nread(long struct, @Nullable FT_Stream_IoFuncI value) { memPutAddress(struct + FT_Stream.READ, memAddressSafe(value)); }
    /** Unsafe version of {@link #close$(FT_Stream_CloseFuncI) close$}. */
    public static void nclose$(long struct, @Nullable FT_Stream_CloseFuncI value) { memPutAddress(struct + FT_Stream.CLOSE, memAddressSafe(value)); }
    public static void nmemory(long struct, @Nullable FT_Memory value) { memPutAddress(struct + FT_Stream.MEMORY, memAddressSafe(value)); }
    public static void ncursor(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + FT_Stream.CURSOR, memAddressSafe(value)); }
    public static void nlimit$(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + FT_Stream.LIMIT, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link FT_Stream} structs. */
    public static class Buffer extends StructBuffer<FT_Stream, Buffer> implements NativeResource {

        private static final FT_Stream ELEMENT_FACTORY = FT_Stream.create(-1L);

        /**
         * Creates a new {@code FT_Stream.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Stream#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Stream getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code base} field. */
        @Nullable
        @NativeType("unsigned char *")
        public ByteBuffer base() { return FT_Stream.nbase(address()); }
        /** @return the value of the {@code size} field. */
        @NativeType("unsigned long")
        public long size() { return FT_Stream.nsize(address()); }
        /** @return the value of the {@code pos} field. */
        @NativeType("unsigned long")
        public long pos() { return FT_Stream.npos(address()); }
        /** @return a {@link FT_StreamDesc} view of the {@code descriptor} field. */
        public FT_StreamDesc descriptor() { return FT_Stream.ndescriptor(address()); }
        /** @return a {@link FT_StreamDesc} view of the {@code pathname} field. */
        public FT_StreamDesc pathname() { return FT_Stream.npathname(address()); }
        /** @return the value of the {@code read} field. */
        @Nullable
        public FT_Stream_IoFunc read() { return FT_Stream.nread(address()); }
        /** @return the value of the {@code close} field. */
        @Nullable
        public FT_Stream_CloseFunc close$() { return FT_Stream.nclose$(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@code base} field. */
        public FT_Stream.Buffer base(@Nullable @NativeType("unsigned char *") ByteBuffer value) { FT_Stream.nbase(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public FT_Stream.Buffer size(@NativeType("unsigned long") long value) { FT_Stream.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code pos} field. */
        public FT_Stream.Buffer pos(@NativeType("unsigned long") long value) { FT_Stream.npos(address(), value); return this; }
        /** Copies the specified {@link FT_StreamDesc} to the {@code descriptor} field. */
        public FT_Stream.Buffer descriptor(FT_StreamDesc value) { FT_Stream.ndescriptor(address(), value); return this; }
        /** Passes the {@code descriptor} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FT_Stream.Buffer descriptor(java.util.function.Consumer<FT_StreamDesc> consumer) { consumer.accept(descriptor()); return this; }
        /** Copies the specified {@link FT_StreamDesc} to the {@code pathname} field. */
        public FT_Stream.Buffer pathname(FT_StreamDesc value) { FT_Stream.npathname(address(), value); return this; }
        /** Passes the {@code pathname} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FT_Stream.Buffer pathname(java.util.function.Consumer<FT_StreamDesc> consumer) { consumer.accept(pathname()); return this; }
        /** Sets the specified value to the {@code read} field. */
        public FT_Stream.Buffer read(@Nullable @NativeType("FT_Stream_IoFunc") FT_Stream_IoFuncI value) { FT_Stream.nread(address(), value); return this; }
        /** Sets the specified value to the {@code close} field. */
        public FT_Stream.Buffer close$(@Nullable @NativeType("FT_Stream_CloseFunc") FT_Stream_CloseFuncI value) { FT_Stream.nclose$(address(), value); return this; }

    }

}