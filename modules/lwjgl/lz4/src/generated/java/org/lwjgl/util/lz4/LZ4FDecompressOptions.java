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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct LZ4F_decompressOptions_t {
 *     unsigned {@link #stableDst};
 *     unsigned {@link #skipChecksums};
 *     unsigned {@link #reserved1};
 *     unsigned {@link #reserved0};
 * }</code></pre>
 */
@NativeType("struct LZ4F_decompressOptions_t")
public class LZ4FDecompressOptions extends Struct<LZ4FDecompressOptions> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STABLEDST,
        SKIPCHECKSUMS,
        RESERVED1,
        RESERVED0;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STABLEDST = layout.offsetof(0);
        SKIPCHECKSUMS = layout.offsetof(1);
        RESERVED1 = layout.offsetof(2);
        RESERVED0 = layout.offsetof(3);
    }

    protected LZ4FDecompressOptions(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected LZ4FDecompressOptions create(long address, @Nullable ByteBuffer container) {
        return new LZ4FDecompressOptions(address, container);
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

    /**
     * pledges that last 64KB decompressed data will remain available unmodified between invocations.
     * 
     * <p>This optimization skips storage operations in tmp buffers.</p>
     */
    @NativeType("unsigned")
    public int stableDst() { return nstableDst(address()); }
    /**
     * disable checksum calculation and verification, even when one is present in frame, to save CPU time.
     * 
     * <p>Setting this option to 1 once disables all checksums for the rest of the frame.</p>
     */
    @NativeType("unsigned")
    public int skipChecksums() { return nskipChecksums(address()); }
    /** must be set to zero for forward compatibility */
    @NativeType("unsigned")
    public int reserved1() { return nreserved1(address()); }
    /** idem */
    @NativeType("unsigned")
    public int reserved0() { return nreserved0(address()); }

    /** Sets the specified value to the {@link #stableDst} field. */
    public LZ4FDecompressOptions stableDst(@NativeType("unsigned") int value) { nstableDst(address(), value); return this; }
    /** Sets the specified value to the {@link #skipChecksums} field. */
    public LZ4FDecompressOptions skipChecksums(@NativeType("unsigned") int value) { nskipChecksums(address(), value); return this; }
    /** Sets the specified value to the {@link #reserved1} field. */
    public LZ4FDecompressOptions reserved1(@NativeType("unsigned") int value) { nreserved1(address(), value); return this; }
    /** Sets the specified value to the {@link #reserved0} field. */
    public LZ4FDecompressOptions reserved0(@NativeType("unsigned") int value) { nreserved0(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public LZ4FDecompressOptions set(
        int stableDst,
        int skipChecksums,
        int reserved1,
        int reserved0
    ) {
        stableDst(stableDst);
        skipChecksums(skipChecksums);
        reserved1(reserved1);
        reserved0(reserved0);

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
        return new LZ4FDecompressOptions(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code LZ4FDecompressOptions} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static LZ4FDecompressOptions calloc() {
        return new LZ4FDecompressOptions(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code LZ4FDecompressOptions} instance allocated with {@link BufferUtils}. */
    public static LZ4FDecompressOptions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new LZ4FDecompressOptions(memAddress(container), container);
    }

    /** Returns a new {@code LZ4FDecompressOptions} instance for the specified memory address. */
    public static LZ4FDecompressOptions create(long address) {
        return new LZ4FDecompressOptions(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4FDecompressOptions createSafe(long address) {
        return address == NULL ? null : new LZ4FDecompressOptions(address, null);
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link LZ4FDecompressOptions.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static LZ4FDecompressOptions.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FDecompressOptions mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FDecompressOptions callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FDecompressOptions mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static LZ4FDecompressOptions callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FDecompressOptions.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FDecompressOptions.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FDecompressOptions.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static LZ4FDecompressOptions.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code LZ4FDecompressOptions} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FDecompressOptions malloc(MemoryStack stack) {
        return new LZ4FDecompressOptions(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code LZ4FDecompressOptions} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static LZ4FDecompressOptions calloc(MemoryStack stack) {
        return new LZ4FDecompressOptions(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link LZ4FDecompressOptions.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static LZ4FDecompressOptions.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #stableDst}. */
    public static int nstableDst(long struct) { return UNSAFE.getInt(null, struct + LZ4FDecompressOptions.STABLEDST); }
    /** Unsafe version of {@link #skipChecksums}. */
    public static int nskipChecksums(long struct) { return UNSAFE.getInt(null, struct + LZ4FDecompressOptions.SKIPCHECKSUMS); }
    /** Unsafe version of {@link #reserved1}. */
    public static int nreserved1(long struct) { return UNSAFE.getInt(null, struct + LZ4FDecompressOptions.RESERVED1); }
    /** Unsafe version of {@link #reserved0}. */
    public static int nreserved0(long struct) { return UNSAFE.getInt(null, struct + LZ4FDecompressOptions.RESERVED0); }

    /** Unsafe version of {@link #stableDst(int) stableDst}. */
    public static void nstableDst(long struct, int value) { UNSAFE.putInt(null, struct + LZ4FDecompressOptions.STABLEDST, value); }
    /** Unsafe version of {@link #skipChecksums(int) skipChecksums}. */
    public static void nskipChecksums(long struct, int value) { UNSAFE.putInt(null, struct + LZ4FDecompressOptions.SKIPCHECKSUMS, value); }
    /** Unsafe version of {@link #reserved1(int) reserved1}. */
    public static void nreserved1(long struct, int value) { UNSAFE.putInt(null, struct + LZ4FDecompressOptions.RESERVED1, value); }
    /** Unsafe version of {@link #reserved0(int) reserved0}. */
    public static void nreserved0(long struct, int value) { UNSAFE.putInt(null, struct + LZ4FDecompressOptions.RESERVED0, value); }

    // -----------------------------------

    /** An array of {@link LZ4FDecompressOptions} structs. */
    public static class Buffer extends StructBuffer<LZ4FDecompressOptions, Buffer> implements NativeResource {

        private static final LZ4FDecompressOptions ELEMENT_FACTORY = LZ4FDecompressOptions.create(-1L);

        /**
         * Creates a new {@code LZ4FDecompressOptions.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link LZ4FDecompressOptions#SIZEOF}, and its mark will be undefined.</p>
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

        /** @return the value of the {@link LZ4FDecompressOptions#stableDst} field. */
        @NativeType("unsigned")
        public int stableDst() { return LZ4FDecompressOptions.nstableDst(address()); }
        /** @return the value of the {@link LZ4FDecompressOptions#skipChecksums} field. */
        @NativeType("unsigned")
        public int skipChecksums() { return LZ4FDecompressOptions.nskipChecksums(address()); }
        /** @return the value of the {@link LZ4FDecompressOptions#reserved1} field. */
        @NativeType("unsigned")
        public int reserved1() { return LZ4FDecompressOptions.nreserved1(address()); }
        /** @return the value of the {@link LZ4FDecompressOptions#reserved0} field. */
        @NativeType("unsigned")
        public int reserved0() { return LZ4FDecompressOptions.nreserved0(address()); }

        /** Sets the specified value to the {@link LZ4FDecompressOptions#stableDst} field. */
        public LZ4FDecompressOptions.Buffer stableDst(@NativeType("unsigned") int value) { LZ4FDecompressOptions.nstableDst(address(), value); return this; }
        /** Sets the specified value to the {@link LZ4FDecompressOptions#skipChecksums} field. */
        public LZ4FDecompressOptions.Buffer skipChecksums(@NativeType("unsigned") int value) { LZ4FDecompressOptions.nskipChecksums(address(), value); return this; }
        /** Sets the specified value to the {@link LZ4FDecompressOptions#reserved1} field. */
        public LZ4FDecompressOptions.Buffer reserved1(@NativeType("unsigned") int value) { LZ4FDecompressOptions.nreserved1(address(), value); return this; }
        /** Sets the specified value to the {@link LZ4FDecompressOptions#reserved0} field. */
        public LZ4FDecompressOptions.Buffer reserved0(@NativeType("unsigned") int value) { LZ4FDecompressOptions.nreserved0(address(), value); return this; }

    }

}