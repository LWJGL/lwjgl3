/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lz4;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code stableDst} &ndash; pledges that last 64KB decompressed data will remain available unmodified. This optimization skips storage operations in tmp buffers.</li>
 * <li>{@code reserved[3]} &ndash; must be set to zero for forward compatibility</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LZ4F_decompressOptions_t {
 *     unsigned stableDst;
 *     unsigned reserved[3];
 * }</code></pre>
 */
@NativeType("struct LZ4F_decompressOptions_t")
public class LZ4FDecompressOptions extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STABLEDST,
        RESERVED;

    static {
        Layout layout = __struct(
            __member(4),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STABLEDST = layout.offsetof(0);
        RESERVED = layout.offsetof(1);
    }

    /**
     * Creates a {@code LZ4FDecompressOptions} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public LZ4FDecompressOptions(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code stableDst} field. */
    @NativeType("unsigned")
    public int stableDst() { return nstableDst(address()); }
    /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
    @NativeType("unsigned[3]")
    public IntBuffer reserved() { return nreserved(address()); }
    /** Returns the value at the specified index of the {@code reserved} field. */
    @NativeType("unsigned")
    public int reserved(int index) { return nreserved(address(), index); }

    /** Sets the specified value to the {@code stableDst} field. */
    public LZ4FDecompressOptions stableDst(@NativeType("unsigned") int value) { nstableDst(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
    public LZ4FDecompressOptions reserved(@NativeType("unsigned[3]") IntBuffer value) { nreserved(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code reserved} field. */
    public LZ4FDecompressOptions reserved(int index, @NativeType("unsigned") int value) { nreserved(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public LZ4FDecompressOptions set(
        int stableDst,
        IntBuffer reserved
    ) {
        stableDst(stableDst);
        reserved(reserved);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public LZ4FDecompressOptions set(LZ4FDecompressOptions src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code LZ4FDecompressOptions} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static LZ4FDecompressOptions malloc() {
        return wrap(LZ4FDecompressOptions.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code LZ4FDecompressOptions} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LZ4FDecompressOptions calloc() {
        return wrap(LZ4FDecompressOptions.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code LZ4FDecompressOptions} instance allocated with {@link BufferUtils}. */
    public static LZ4FDecompressOptions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(LZ4FDecompressOptions.class, memAddress(container), container);
    }

    /** Returns a new {@code LZ4FDecompressOptions} instance for the specified memory address. */
    public static LZ4FDecompressOptions create(long address) {
        return wrap(LZ4FDecompressOptions.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4FDecompressOptions createSafe(long address) {
        return address == NULL ? null : wrap(LZ4FDecompressOptions.class, address);
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link LZ4FDecompressOptions.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4FDecompressOptions.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code LZ4FDecompressOptions} instance allocated on the thread-local {@link MemoryStack}. */
    public static LZ4FDecompressOptions mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code LZ4FDecompressOptions} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static LZ4FDecompressOptions callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code LZ4FDecompressOptions} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FDecompressOptions mallocStack(MemoryStack stack) {
        return wrap(LZ4FDecompressOptions.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code LZ4FDecompressOptions} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FDecompressOptions callocStack(MemoryStack stack) {
        return wrap(LZ4FDecompressOptions.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #stableDst}. */
    public static int nstableDst(long struct) { return UNSAFE.getInt(null, struct + LZ4FDecompressOptions.STABLEDST); }
    /** Unsafe version of {@link #reserved}. */
    public static IntBuffer nreserved(long struct) { return memIntBuffer(struct + LZ4FDecompressOptions.RESERVED, 3); }
    /** Unsafe version of {@link #reserved(int) reserved}. */
    public static int nreserved(long struct, int index) {
        return UNSAFE.getInt(null, struct + LZ4FDecompressOptions.RESERVED + check(index, 3) * 4);
    }

    /** Unsafe version of {@link #stableDst(int) stableDst}. */
    public static void nstableDst(long struct, int value) { UNSAFE.putInt(null, struct + LZ4FDecompressOptions.STABLEDST, value); }
    /** Unsafe version of {@link #reserved(IntBuffer) reserved}. */
    public static void nreserved(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + LZ4FDecompressOptions.RESERVED, value.remaining() * 4);
    }
    /** Unsafe version of {@link #reserved(int, int) reserved}. */
    public static void nreserved(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + LZ4FDecompressOptions.RESERVED + check(index, 3) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link LZ4FDecompressOptions} structs. */
    public static class Buffer extends StructBuffer<LZ4FDecompressOptions, Buffer> implements NativeResource {

        private static final LZ4FDecompressOptions ELEMENT_FACTORY = LZ4FDecompressOptions.create(-1L);

        /**
         * Creates a new {@code LZ4FDecompressOptions.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4FDecompressOptions#SIZEOF}, and its mark will be undefined.
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
        protected LZ4FDecompressOptions getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code stableDst} field. */
        @NativeType("unsigned")
        public int stableDst() { return LZ4FDecompressOptions.nstableDst(address()); }
        /** Returns a {@link IntBuffer} view of the {@code reserved} field. */
        @NativeType("unsigned[3]")
        public IntBuffer reserved() { return LZ4FDecompressOptions.nreserved(address()); }
        /** Returns the value at the specified index of the {@code reserved} field. */
        @NativeType("unsigned")
        public int reserved(int index) { return LZ4FDecompressOptions.nreserved(address(), index); }

        /** Sets the specified value to the {@code stableDst} field. */
        public LZ4FDecompressOptions.Buffer stableDst(@NativeType("unsigned") int value) { LZ4FDecompressOptions.nstableDst(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code reserved} field. */
        public LZ4FDecompressOptions.Buffer reserved(@NativeType("unsigned[3]") IntBuffer value) { LZ4FDecompressOptions.nreserved(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code reserved} field. */
        public LZ4FDecompressOptions.Buffer reserved(int index, @NativeType("unsigned") int value) { LZ4FDecompressOptions.nreserved(address(), index, value); return this; }

    }

}