/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.zstd;

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
 * struct ZSTD_Sequence {
 *     unsigned int {@link #offset};
 *     unsigned int {@link #litLength};
 *     unsigned int {@link #matchLength};
 *     unsigned int {@link #rep};
 * }</code></pre>
 */
@NativeType("struct ZSTD_Sequence")
public class ZSTDSequence extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OFFSET,
        LITLENGTH,
        MATCHLENGTH,
        REP;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OFFSET = layout.offsetof(0);
        LITLENGTH = layout.offsetof(1);
        MATCHLENGTH = layout.offsetof(2);
        REP = layout.offsetof(3);
    }

    /**
     * Creates a {@code ZSTDSequence} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ZSTDSequence(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * the offset of the match. (NOT the same as the offset code)
     * 
     * <p>If {@code offset == 0} and {@code matchLength == 0}, this sequence represents the last literals in the block of {@code litLength} size.</p>
     */
    @NativeType("unsigned int")
    public int offset() { return noffset(address()); }
    /** literal length of the sequence */
    @NativeType("unsigned int")
    public int litLength() { return nlitLength(address()); }
    /**
     * match length of the sequence.
     * 
     * <p>Note: Users of this API may provide a sequence with {@code matchLength == litLength == offset == 0}. In this case, we will treat the sequence as a
     * marker for a block boundary.</p>
     */
    @NativeType("unsigned int")
    public int matchLength() { return nmatchLength(address()); }
    /**
     * Represents which repeat offset is represented by the field {@code offset}. Ranges from {@code [0, 3]}.
     * 
     * <p>Repeat offsets are essentially previous offsets from previous sequences sorted in recency order. For more detail, see
     * {@code doc/zstd_compression_format.md}.</p>
     * 
     * <pre><code>
     * If rep == 0, then offset does not contain a repeat offset.
     * If rep &gt; 0:
     *     If litLength != 0:
     *         rep == 1 --&gt; offset == repeat_offset_1
     *         rep == 2 --&gt; offset == repeat_offset_2
     *         rep == 3 --&gt; offset == repeat_offset_3
     *     If litLength == 0:
     *         rep == 1 --&gt; offset == repeat_offset_2
     *         rep == 2 --&gt; offset == repeat_offset_3
     *         rep == 3 --&gt; offset == repeat_offset_1 - 1</code></pre>
     * 
     * <p>Note: This field is optional. {@link ZstdX#ZSTD_generateSequences generateSequences} will calculate the value of {@code rep}, but repeat offsets do not necessarily need to be calculated
     * from an external sequence provider's perspective. For example, {@link ZstdX#ZSTD_compressSequences compressSequences} does not use this {@code rep} field at all (as of now).</p>
     */
    @NativeType("unsigned int")
    public int rep() { return nrep(address()); }

    // -----------------------------------

    /** Returns a new {@code ZSTDSequence} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ZSTDSequence malloc() {
        return wrap(ZSTDSequence.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ZSTDSequence} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ZSTDSequence calloc() {
        return wrap(ZSTDSequence.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ZSTDSequence} instance allocated with {@link BufferUtils}. */
    public static ZSTDSequence create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ZSTDSequence.class, memAddress(container), container);
    }

    /** Returns a new {@code ZSTDSequence} instance for the specified memory address. */
    public static ZSTDSequence create(long address) {
        return wrap(ZSTDSequence.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDSequence createSafe(long address) {
        return address == NULL ? null : wrap(ZSTDSequence.class, address);
    }

    /**
     * Returns a new {@link ZSTDSequence.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDSequence.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ZSTDSequence.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDSequence.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDSequence.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ZSTDSequence.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ZSTDSequence.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ZSTDSequence.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ZSTDSequence.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ZSTDSequence} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDSequence malloc(MemoryStack stack) {
        return wrap(ZSTDSequence.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ZSTDSequence} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ZSTDSequence calloc(MemoryStack stack) {
        return wrap(ZSTDSequence.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ZSTDSequence.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDSequence.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ZSTDSequence.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ZSTDSequence.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return UNSAFE.getInt(null, struct + ZSTDSequence.OFFSET); }
    /** Unsafe version of {@link #litLength}. */
    public static int nlitLength(long struct) { return UNSAFE.getInt(null, struct + ZSTDSequence.LITLENGTH); }
    /** Unsafe version of {@link #matchLength}. */
    public static int nmatchLength(long struct) { return UNSAFE.getInt(null, struct + ZSTDSequence.MATCHLENGTH); }
    /** Unsafe version of {@link #rep}. */
    public static int nrep(long struct) { return UNSAFE.getInt(null, struct + ZSTDSequence.REP); }

    // -----------------------------------

    /** An array of {@link ZSTDSequence} structs. */
    public static class Buffer extends StructBuffer<ZSTDSequence, Buffer> implements NativeResource {

        private static final ZSTDSequence ELEMENT_FACTORY = ZSTDSequence.create(-1L);

        /**
         * Creates a new {@code ZSTDSequence.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ZSTDSequence#SIZEOF}, and its mark will be undefined.
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
        protected ZSTDSequence getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link ZSTDSequence#offset} field. */
        @NativeType("unsigned int")
        public int offset() { return ZSTDSequence.noffset(address()); }
        /** @return the value of the {@link ZSTDSequence#litLength} field. */
        @NativeType("unsigned int")
        public int litLength() { return ZSTDSequence.nlitLength(address()); }
        /** @return the value of the {@link ZSTDSequence#matchLength} field. */
        @NativeType("unsigned int")
        public int matchLength() { return ZSTDSequence.nmatchLength(address()); }
        /** @return the value of the {@link ZSTDSequence#rep} field. */
        @NativeType("unsigned int")
        public int rep() { return ZSTDSequence.nrep(address()); }

    }

}