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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A structure to indicate how to open a new font file or stream. A pointer to such a structure can be used as a parameter for the functions
 * {@link FreeType#FT_Open_Face Open_Face} and {@link FreeType#FT_Attach_Stream Attach_Stream}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Open_Args {
 *     FT_UInt flags;
 *     FT_Byte const * memory_base;
 *     FT_Long memory_size;
 *     FT_String * pathname;
 *     {@link FT_Stream FT_Stream} stream;
 *     FT_Module driver;
 *     FT_Int num_params;
 *     {@link FT_Parameter FT_Parameter} * params;
 * }</code></pre>
 */
public class FT_Open_Args extends Struct<FT_Open_Args> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        MEMORY_BASE,
        MEMORY_SIZE,
        PATHNAME,
        STREAM,
        DRIVER,
        NUM_PARAMS,
        PARAMS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        MEMORY_BASE = layout.offsetof(1);
        MEMORY_SIZE = layout.offsetof(2);
        PATHNAME = layout.offsetof(3);
        STREAM = layout.offsetof(4);
        DRIVER = layout.offsetof(5);
        NUM_PARAMS = layout.offsetof(6);
        PARAMS = layout.offsetof(7);
    }

    protected FT_Open_Args(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Open_Args create(long address, @Nullable ByteBuffer container) {
        return new FT_Open_Args(address, container);
    }

    /**
     * Creates a {@code FT_Open_Args} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Open_Args(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("FT_UInt")
    public int flags() { return nflags(address()); }
    /** @return a {@link ByteBuffer} view of the data pointed to by the {@code memory_base} field. */
    @Nullable
    @NativeType("FT_Byte const *")
    public ByteBuffer memory_base() { return nmemory_base(address()); }
    /** @return the value of the {@code memory_size} field. */
    @NativeType("FT_Long")
    public long memory_size() { return nmemory_size(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pathname} field. */
    @Nullable
    @NativeType("FT_String *")
    public ByteBuffer pathname() { return npathname(address()); }
    /** @return the null-terminated string pointed to by the {@code pathname} field. */
    @Nullable
    @NativeType("FT_String *")
    public String pathnameString() { return npathnameString(address()); }
    /** @return a {@link FT_Stream} view of the struct pointed to by the {@code stream} field. */
    @Nullable
    public FT_Stream stream$() { return nstream$(address()); }
    /** @return the value of the {@code driver} field. */
    @NativeType("FT_Module")
    public long driver() { return ndriver(address()); }
    /** @return the value of the {@code num_params} field. */
    @NativeType("FT_Int")
    public int num_params() { return nnum_params(address()); }
    /** @return a {@link FT_Parameter.Buffer} view of the struct array pointed to by the {@code params} field. */
    @Nullable
    @NativeType("FT_Parameter *")
    public FT_Parameter.Buffer params() { return nparams(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public FT_Open_Args flags(@NativeType("FT_UInt") int value) { nflags(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code memory_base} field. */
    public FT_Open_Args memory_base(@Nullable @NativeType("FT_Byte const *") ByteBuffer value) { nmemory_base(address(), value); return this; }
    /** Sets the specified value to the {@code memory_size} field. */
    public FT_Open_Args memory_size(@NativeType("FT_Long") long value) { nmemory_size(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code pathname} field. */
    public FT_Open_Args pathname(@Nullable @NativeType("FT_String *") ByteBuffer value) { npathname(address(), value); return this; }
    /** Sets the address of the specified {@link FT_Stream} to the {@code stream} field. */
    public FT_Open_Args stream$(@Nullable FT_Stream value) { nstream$(address(), value); return this; }
    /** Sets the specified value to the {@code driver} field. */
    public FT_Open_Args driver(@NativeType("FT_Module") long value) { ndriver(address(), value); return this; }
    /** Sets the specified value to the {@code num_params} field. */
    public FT_Open_Args num_params(@NativeType("FT_Int") int value) { nnum_params(address(), value); return this; }
    /** Sets the address of the specified {@link FT_Parameter.Buffer} to the {@code params} field. */
    public FT_Open_Args params(@Nullable @NativeType("FT_Parameter *") FT_Parameter.Buffer value) { nparams(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Open_Args set(
        int flags,
        @Nullable ByteBuffer memory_base,
        long memory_size,
        @Nullable ByteBuffer pathname,
        @Nullable FT_Stream stream$,
        long driver,
        int num_params,
        @Nullable FT_Parameter.Buffer params
    ) {
        flags(flags);
        memory_base(memory_base);
        memory_size(memory_size);
        pathname(pathname);
        stream$(stream$);
        driver(driver);
        num_params(num_params);
        params(params);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Open_Args set(FT_Open_Args src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Open_Args} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Open_Args malloc() {
        return new FT_Open_Args(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Open_Args} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Open_Args calloc() {
        return new FT_Open_Args(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Open_Args} instance allocated with {@link BufferUtils}. */
    public static FT_Open_Args create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Open_Args(memAddress(container), container);
    }

    /** Returns a new {@code FT_Open_Args} instance for the specified memory address. */
    public static FT_Open_Args create(long address) {
        return new FT_Open_Args(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Open_Args createSafe(long address) {
        return address == NULL ? null : new FT_Open_Args(address, null);
    }

    /**
     * Returns a new {@link FT_Open_Args.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Open_Args.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Open_Args.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Open_Args.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Open_Args.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Open_Args.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Open_Args.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Open_Args.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Open_Args.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Open_Args} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Open_Args malloc(MemoryStack stack) {
        return new FT_Open_Args(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Open_Args} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Open_Args calloc(MemoryStack stack) {
        return new FT_Open_Args(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Open_Args.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Open_Args.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Open_Args.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Open_Args.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + FT_Open_Args.FLAGS); }
    /** Unsafe version of {@link #memory_base() memory_base}. */
    @Nullable public static ByteBuffer nmemory_base(long struct) { return memByteBufferSafe(memGetAddress(struct + FT_Open_Args.MEMORY_BASE), (int)nmemory_size(struct)); }
    /** Unsafe version of {@link #memory_size}. */
    public static long nmemory_size(long struct) { return memGetCLong(struct + FT_Open_Args.MEMORY_SIZE); }
    /** Unsafe version of {@link #pathname}. */
    @Nullable public static ByteBuffer npathname(long struct) { return memByteBufferNT1Safe(memGetAddress(struct + FT_Open_Args.PATHNAME)); }
    /** Unsafe version of {@link #pathnameString}. */
    @Nullable public static String npathnameString(long struct) { return memUTF8Safe(memGetAddress(struct + FT_Open_Args.PATHNAME)); }
    /** Unsafe version of {@link #stream$}. */
    @Nullable public static FT_Stream nstream$(long struct) { return FT_Stream.createSafe(memGetAddress(struct + FT_Open_Args.STREAM)); }
    /** Unsafe version of {@link #driver}. */
    public static long ndriver(long struct) { return memGetAddress(struct + FT_Open_Args.DRIVER); }
    /** Unsafe version of {@link #num_params}. */
    public static int nnum_params(long struct) { return UNSAFE.getInt(null, struct + FT_Open_Args.NUM_PARAMS); }
    /** Unsafe version of {@link #params}. */
    @Nullable public static FT_Parameter.Buffer nparams(long struct) { return FT_Parameter.createSafe(memGetAddress(struct + FT_Open_Args.PARAMS), nnum_params(struct)); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + FT_Open_Args.FLAGS, value); }
    /** Unsafe version of {@link #memory_base(ByteBuffer) memory_base}. */
    public static void nmemory_base(long struct, @Nullable ByteBuffer value) { memPutAddress(struct + FT_Open_Args.MEMORY_BASE, memAddressSafe(value)); nmemory_size(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code memory_size} field of the specified {@code struct}. */
    public static void nmemory_size(long struct, long value) { memPutCLong(struct + FT_Open_Args.MEMORY_SIZE, value); }
    /** Unsafe version of {@link #pathname(ByteBuffer) pathname}. */
    public static void npathname(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + FT_Open_Args.PATHNAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #stream$(FT_Stream) stream$}. */
    public static void nstream$(long struct, @Nullable FT_Stream value) { memPutAddress(struct + FT_Open_Args.STREAM, memAddressSafe(value)); }
    /** Unsafe version of {@link #driver(long) driver}. */
    public static void ndriver(long struct, long value) { memPutAddress(struct + FT_Open_Args.DRIVER, value); }
    /** Sets the specified value to the {@code num_params} field of the specified {@code struct}. */
    public static void nnum_params(long struct, int value) { UNSAFE.putInt(null, struct + FT_Open_Args.NUM_PARAMS, value); }
    /** Unsafe version of {@link #params(FT_Parameter.Buffer) params}. */
    public static void nparams(long struct, @Nullable FT_Parameter.Buffer value) { memPutAddress(struct + FT_Open_Args.PARAMS, memAddressSafe(value)); nnum_params(struct, value == null ? 0 : value.remaining()); }

    // -----------------------------------

    /** An array of {@link FT_Open_Args} structs. */
    public static class Buffer extends StructBuffer<FT_Open_Args, Buffer> implements NativeResource {

        private static final FT_Open_Args ELEMENT_FACTORY = FT_Open_Args.create(-1L);

        /**
         * Creates a new {@code FT_Open_Args.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Open_Args#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Open_Args getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("FT_UInt")
        public int flags() { return FT_Open_Args.nflags(address()); }
        /** @return a {@link ByteBuffer} view of the data pointed to by the {@code memory_base} field. */
        @Nullable
        @NativeType("FT_Byte const *")
        public ByteBuffer memory_base() { return FT_Open_Args.nmemory_base(address()); }
        /** @return the value of the {@code memory_size} field. */
        @NativeType("FT_Long")
        public long memory_size() { return FT_Open_Args.nmemory_size(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code pathname} field. */
        @Nullable
        @NativeType("FT_String *")
        public ByteBuffer pathname() { return FT_Open_Args.npathname(address()); }
        /** @return the null-terminated string pointed to by the {@code pathname} field. */
        @Nullable
        @NativeType("FT_String *")
        public String pathnameString() { return FT_Open_Args.npathnameString(address()); }
        /** @return a {@link FT_Stream} view of the struct pointed to by the {@code stream} field. */
        @Nullable
        public FT_Stream stream$() { return FT_Open_Args.nstream$(address()); }
        /** @return the value of the {@code driver} field. */
        @NativeType("FT_Module")
        public long driver() { return FT_Open_Args.ndriver(address()); }
        /** @return the value of the {@code num_params} field. */
        @NativeType("FT_Int")
        public int num_params() { return FT_Open_Args.nnum_params(address()); }
        /** @return a {@link FT_Parameter.Buffer} view of the struct array pointed to by the {@code params} field. */
        @Nullable
        @NativeType("FT_Parameter *")
        public FT_Parameter.Buffer params() { return FT_Open_Args.nparams(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public FT_Open_Args.Buffer flags(@NativeType("FT_UInt") int value) { FT_Open_Args.nflags(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code memory_base} field. */
        public FT_Open_Args.Buffer memory_base(@Nullable @NativeType("FT_Byte const *") ByteBuffer value) { FT_Open_Args.nmemory_base(address(), value); return this; }
        /** Sets the specified value to the {@code memory_size} field. */
        public FT_Open_Args.Buffer memory_size(@NativeType("FT_Long") long value) { FT_Open_Args.nmemory_size(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code pathname} field. */
        public FT_Open_Args.Buffer pathname(@Nullable @NativeType("FT_String *") ByteBuffer value) { FT_Open_Args.npathname(address(), value); return this; }
        /** Sets the address of the specified {@link FT_Stream} to the {@code stream} field. */
        public FT_Open_Args.Buffer stream$(@Nullable FT_Stream value) { FT_Open_Args.nstream$(address(), value); return this; }
        /** Sets the specified value to the {@code driver} field. */
        public FT_Open_Args.Buffer driver(@NativeType("FT_Module") long value) { FT_Open_Args.ndriver(address(), value); return this; }
        /** Sets the specified value to the {@code num_params} field. */
        public FT_Open_Args.Buffer num_params(@NativeType("FT_Int") int value) { FT_Open_Args.nnum_params(address(), value); return this; }
        /** Sets the address of the specified {@link FT_Parameter.Buffer} to the {@code params} field. */
        public FT_Open_Args.Buffer params(@Nullable @NativeType("FT_Parameter *") FT_Parameter.Buffer value) { FT_Open_Args.nparams(address(), value); return this; }

    }

}