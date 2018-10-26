/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meow;

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
 * struct meow_macroblock_result {
 *     {@link MeowU128 meow_u128} S0;
 *     {@link MeowU128 meow_u128} S1;
 *     {@link MeowU128 meow_u128} S2;
 *     {@link MeowU128 meow_u128} S3;
 *     {@link MeowU128 meow_u128} S4;
 *     {@link MeowU128 meow_u128} S5;
 *     {@link MeowU128 meow_u128} S6;
 *     {@link MeowU128 meow_u128} S7;
 *     {@link MeowU128 meow_u128} S8;
 *     {@link MeowU128 meow_u128} S9;
 *     {@link MeowU128 meow_u128} SA;
 *     {@link MeowU128 meow_u128} SB;
 *     {@link MeowU128 meow_u128} SC;
 *     {@link MeowU128 meow_u128} SD;
 *     {@link MeowU128 meow_u128} SE;
 *     {@link MeowU128 meow_u128} SF;
 * }</code></pre>
 */
@NativeType("struct meow_macroblock_result")
public class MeowMacroblockResult extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        S0,
        S1,
        S2,
        S3,
        S4,
        S5,
        S6,
        S7,
        S8,
        S9,
        SA,
        SB,
        SC,
        SD,
        SE,
        SF;

    static {
        Layout layout = __struct(
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true),
            __member(MeowU128.SIZEOF, MeowU128.ALIGNOF, true)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        S0 = layout.offsetof(0);
        S1 = layout.offsetof(1);
        S2 = layout.offsetof(2);
        S3 = layout.offsetof(3);
        S4 = layout.offsetof(4);
        S5 = layout.offsetof(5);
        S6 = layout.offsetof(6);
        S7 = layout.offsetof(7);
        S8 = layout.offsetof(8);
        S9 = layout.offsetof(9);
        SA = layout.offsetof(10);
        SB = layout.offsetof(11);
        SC = layout.offsetof(12);
        SD = layout.offsetof(13);
        SE = layout.offsetof(14);
        SF = layout.offsetof(15);
    }

    /**
     * Creates a {@link MeowMacroblockResult} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeowMacroblockResult(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    // -----------------------------------

    /** Returns a new {@link MeowMacroblockResult} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeowMacroblockResult malloc() {
        return wrap(MeowMacroblockResult.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link MeowMacroblockResult} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeowMacroblockResult calloc() {
        return wrap(MeowMacroblockResult.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link MeowMacroblockResult} instance allocated with {@link BufferUtils}. */
    public static MeowMacroblockResult create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(MeowMacroblockResult.class, memAddress(container), container);
    }

    /** Returns a new {@link MeowMacroblockResult} instance for the specified memory address. */
    public static MeowMacroblockResult create(long address) {
        return wrap(MeowMacroblockResult.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeowMacroblockResult createSafe(long address) {
        return address == NULL ? null : wrap(MeowMacroblockResult.class, address);
    }

    /**
     * Returns a new {@link MeowMacroblockResult.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeowMacroblockResult.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeowMacroblockResult.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeowMacroblockResult.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeowMacroblockResult.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeowMacroblockResult.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link MeowMacroblockResult.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeowMacroblockResult.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeowMacroblockResult.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link MeowMacroblockResult} instance allocated on the thread-local {@link MemoryStack}. */
    public static MeowMacroblockResult mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link MeowMacroblockResult} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static MeowMacroblockResult callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link MeowMacroblockResult} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeowMacroblockResult mallocStack(MemoryStack stack) {
        return wrap(MeowMacroblockResult.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link MeowMacroblockResult} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeowMacroblockResult callocStack(MemoryStack stack) {
        return wrap(MeowMacroblockResult.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link MeowMacroblockResult.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static MeowMacroblockResult.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link MeowMacroblockResult.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static MeowMacroblockResult.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link MeowMacroblockResult.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeowMacroblockResult.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeowMacroblockResult.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeowMacroblockResult.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    public static MeowU128 nS0(long struct) { return MeowU128.create(struct + MeowMacroblockResult.S0); }
    public static MeowU128 nS1(long struct) { return MeowU128.create(struct + MeowMacroblockResult.S1); }
    public static MeowU128 nS2(long struct) { return MeowU128.create(struct + MeowMacroblockResult.S2); }
    public static MeowU128 nS3(long struct) { return MeowU128.create(struct + MeowMacroblockResult.S3); }
    public static MeowU128 nS4(long struct) { return MeowU128.create(struct + MeowMacroblockResult.S4); }
    public static MeowU128 nS5(long struct) { return MeowU128.create(struct + MeowMacroblockResult.S5); }
    public static MeowU128 nS6(long struct) { return MeowU128.create(struct + MeowMacroblockResult.S6); }
    public static MeowU128 nS7(long struct) { return MeowU128.create(struct + MeowMacroblockResult.S7); }
    public static MeowU128 nS8(long struct) { return MeowU128.create(struct + MeowMacroblockResult.S8); }
    public static MeowU128 nS9(long struct) { return MeowU128.create(struct + MeowMacroblockResult.S9); }
    public static MeowU128 nSA(long struct) { return MeowU128.create(struct + MeowMacroblockResult.SA); }
    public static MeowU128 nSB(long struct) { return MeowU128.create(struct + MeowMacroblockResult.SB); }
    public static MeowU128 nSC(long struct) { return MeowU128.create(struct + MeowMacroblockResult.SC); }
    public static MeowU128 nSD(long struct) { return MeowU128.create(struct + MeowMacroblockResult.SD); }
    public static MeowU128 nSE(long struct) { return MeowU128.create(struct + MeowMacroblockResult.SE); }
    public static MeowU128 nSF(long struct) { return MeowU128.create(struct + MeowMacroblockResult.SF); }

    // -----------------------------------

    /** An array of {@link MeowMacroblockResult} structs. */
    public static class Buffer extends StructBuffer<MeowMacroblockResult, Buffer> implements NativeResource {

        private static final MeowMacroblockResult ELEMENT_FACTORY = MeowMacroblockResult.create(-1L);

        /**
         * Creates a new {@link MeowMacroblockResult.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeowMacroblockResult#SIZEOF}, and its mark will be undefined.
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
        protected MeowMacroblockResult getElementFactory() {
            return ELEMENT_FACTORY;
        }

    }

}