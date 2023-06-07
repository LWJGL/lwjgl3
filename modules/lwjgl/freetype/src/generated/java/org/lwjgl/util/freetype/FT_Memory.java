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
 * A structure used to describe a given memory manager to FreeType~2.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_MemoryRec_ {
 *     void * user;
 *     {@link FT_Alloc_FuncI FT_Alloc_Func} alloc;
 *     {@link FT_Free_FuncI FT_Free_Func} free;
 *     {@link FT_Realloc_FuncI FT_Realloc_Func} realloc;
 * }</code></pre>
 */
@NativeType("struct FT_MemoryRec_")
public class FT_Memory extends Struct<FT_Memory> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USER,
        ALLOC,
        FREE,
        REALLOC;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USER = layout.offsetof(0);
        ALLOC = layout.offsetof(1);
        FREE = layout.offsetof(2);
        REALLOC = layout.offsetof(3);
    }

    protected FT_Memory(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Memory create(long address, @Nullable ByteBuffer container) {
        return new FT_Memory(address, container);
    }

    /**
     * Creates a {@code FT_Memory} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Memory(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code user} field. */
    @NativeType("void *")
    public long user() { return nuser(address()); }
    /** @return the value of the {@code alloc} field. */
    @Nullable
    public FT_Alloc_Func alloc() { return nalloc(address()); }
    /** @return the value of the {@code free} field. */
    @Nullable
    public FT_Free_Func free$() { return nfree$(address()); }
    /** @return the value of the {@code realloc} field. */
    @Nullable
    public FT_Realloc_Func realloc() { return nrealloc(address()); }

    /** Sets the specified value to the {@code user} field. */
    public FT_Memory user(@NativeType("void *") long value) { nuser(address(), value); return this; }
    /** Sets the specified value to the {@code alloc} field. */
    public FT_Memory alloc(@Nullable @NativeType("FT_Alloc_Func") FT_Alloc_FuncI value) { nalloc(address(), value); return this; }
    /** Sets the specified value to the {@code free} field. */
    public FT_Memory free$(@Nullable @NativeType("FT_Free_Func") FT_Free_FuncI value) { nfree$(address(), value); return this; }
    /** Sets the specified value to the {@code realloc} field. */
    public FT_Memory realloc(@Nullable @NativeType("FT_Realloc_Func") FT_Realloc_FuncI value) { nrealloc(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Memory set(
        long user,
        FT_Alloc_FuncI alloc,
        FT_Free_FuncI free$,
        FT_Realloc_FuncI realloc
    ) {
        user(user);
        alloc(alloc);
        free$(free$);
        realloc(realloc);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Memory set(FT_Memory src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Memory} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Memory malloc() {
        return new FT_Memory(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Memory} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Memory calloc() {
        return new FT_Memory(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Memory} instance allocated with {@link BufferUtils}. */
    public static FT_Memory create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Memory(memAddress(container), container);
    }

    /** Returns a new {@code FT_Memory} instance for the specified memory address. */
    public static FT_Memory create(long address) {
        return new FT_Memory(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Memory createSafe(long address) {
        return address == NULL ? null : new FT_Memory(address, null);
    }

    /**
     * Returns a new {@link FT_Memory.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Memory.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Memory.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Memory.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Memory.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Memory.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Memory.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Memory.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Memory.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Memory} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Memory malloc(MemoryStack stack) {
        return new FT_Memory(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Memory} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Memory calloc(MemoryStack stack) {
        return new FT_Memory(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Memory.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Memory.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Memory.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Memory.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #user}. */
    public static long nuser(long struct) { return memGetAddress(struct + FT_Memory.USER); }
    /** Unsafe version of {@link #alloc}. */
    @Nullable public static FT_Alloc_Func nalloc(long struct) { return FT_Alloc_Func.createSafe(memGetAddress(struct + FT_Memory.ALLOC)); }
    /** Unsafe version of {@link #free$}. */
    @Nullable public static FT_Free_Func nfree$(long struct) { return FT_Free_Func.createSafe(memGetAddress(struct + FT_Memory.FREE)); }
    /** Unsafe version of {@link #realloc}. */
    @Nullable public static FT_Realloc_Func nrealloc(long struct) { return FT_Realloc_Func.createSafe(memGetAddress(struct + FT_Memory.REALLOC)); }

    /** Unsafe version of {@link #user(long) user}. */
    public static void nuser(long struct, long value) { memPutAddress(struct + FT_Memory.USER, value); }
    /** Unsafe version of {@link #alloc(FT_Alloc_FuncI) alloc}. */
    public static void nalloc(long struct, @Nullable FT_Alloc_FuncI value) { memPutAddress(struct + FT_Memory.ALLOC, memAddressSafe(value)); }
    /** Unsafe version of {@link #free$(FT_Free_FuncI) free$}. */
    public static void nfree$(long struct, @Nullable FT_Free_FuncI value) { memPutAddress(struct + FT_Memory.FREE, memAddressSafe(value)); }
    /** Unsafe version of {@link #realloc(FT_Realloc_FuncI) realloc}. */
    public static void nrealloc(long struct, @Nullable FT_Realloc_FuncI value) { memPutAddress(struct + FT_Memory.REALLOC, memAddressSafe(value)); }

    // -----------------------------------

    /** An array of {@link FT_Memory} structs. */
    public static class Buffer extends StructBuffer<FT_Memory, Buffer> implements NativeResource {

        private static final FT_Memory ELEMENT_FACTORY = FT_Memory.create(-1L);

        /**
         * Creates a new {@code FT_Memory.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Memory#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Memory getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code user} field. */
        @NativeType("void *")
        public long user() { return FT_Memory.nuser(address()); }
        /** @return the value of the {@code alloc} field. */
        @Nullable
        public FT_Alloc_Func alloc() { return FT_Memory.nalloc(address()); }
        /** @return the value of the {@code free} field. */
        @Nullable
        public FT_Free_Func free$() { return FT_Memory.nfree$(address()); }
        /** @return the value of the {@code realloc} field. */
        @Nullable
        public FT_Realloc_Func realloc() { return FT_Memory.nrealloc(address()); }

        /** Sets the specified value to the {@code user} field. */
        public FT_Memory.Buffer user(@NativeType("void *") long value) { FT_Memory.nuser(address(), value); return this; }
        /** Sets the specified value to the {@code alloc} field. */
        public FT_Memory.Buffer alloc(@Nullable @NativeType("FT_Alloc_Func") FT_Alloc_FuncI value) { FT_Memory.nalloc(address(), value); return this; }
        /** Sets the specified value to the {@code free} field. */
        public FT_Memory.Buffer free$(@Nullable @NativeType("FT_Free_Func") FT_Free_FuncI value) { FT_Memory.nfree$(address(), value); return this; }
        /** Sets the specified value to the {@code realloc} field. */
        public FT_Memory.Buffer realloc(@Nullable @NativeType("FT_Realloc_Func") FT_Realloc_FuncI value) { FT_Memory.nrealloc(address(), value); return this; }

    }

}