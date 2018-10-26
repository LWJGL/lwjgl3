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
 * struct meow_macroblock {
 *     meow_u8 * Source;
 *     int BlockCount;
 * }</code></pre>
 */
@NativeType("struct meow_macroblock")
public class MeowMacroblock extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SOURCE,
        BLOCKCOUNT;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SOURCE = layout.offsetof(0);
        BLOCKCOUNT = layout.offsetof(1);
    }

    /**
     * Creates a {@link MeowMacroblock} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeowMacroblock(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code Source} field. */
    @NativeType("meow_u8 *")
    public long Source() { return nSource(address()); }
    /** Returns the value of the {@code BlockCount} field. */
    public int BlockCount() { return nBlockCount(address()); }

    // -----------------------------------

    /** Returns a new {@link MeowMacroblock} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeowMacroblock malloc() {
        return wrap(MeowMacroblock.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link MeowMacroblock} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeowMacroblock calloc() {
        return wrap(MeowMacroblock.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link MeowMacroblock} instance allocated with {@link BufferUtils}. */
    public static MeowMacroblock create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(MeowMacroblock.class, memAddress(container), container);
    }

    /** Returns a new {@link MeowMacroblock} instance for the specified memory address. */
    public static MeowMacroblock create(long address) {
        return wrap(MeowMacroblock.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeowMacroblock createSafe(long address) {
        return address == NULL ? null : wrap(MeowMacroblock.class, address);
    }

    /**
     * Returns a new {@link MeowMacroblock.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeowMacroblock.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeowMacroblock.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeowMacroblock.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeowMacroblock.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeowMacroblock.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link MeowMacroblock.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeowMacroblock.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeowMacroblock.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link MeowMacroblock} instance allocated on the thread-local {@link MemoryStack}. */
    public static MeowMacroblock mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link MeowMacroblock} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static MeowMacroblock callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link MeowMacroblock} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeowMacroblock mallocStack(MemoryStack stack) {
        return wrap(MeowMacroblock.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link MeowMacroblock} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeowMacroblock callocStack(MemoryStack stack) {
        return wrap(MeowMacroblock.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link MeowMacroblock.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static MeowMacroblock.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link MeowMacroblock.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static MeowMacroblock.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link MeowMacroblock.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeowMacroblock.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeowMacroblock.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeowMacroblock.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #Source}. */
    public static long nSource(long struct) { return memGetAddress(struct + MeowMacroblock.SOURCE); }
    /** Unsafe version of {@link #BlockCount}. */
    public static int nBlockCount(long struct) { return UNSAFE.getInt(null, struct + MeowMacroblock.BLOCKCOUNT); }

    // -----------------------------------

    /** An array of {@link MeowMacroblock} structs. */
    public static class Buffer extends StructBuffer<MeowMacroblock, Buffer> implements NativeResource {

        private static final MeowMacroblock ELEMENT_FACTORY = MeowMacroblock.create(-1L);

        /**
         * Creates a new {@link MeowMacroblock.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeowMacroblock#SIZEOF}, and its mark will be undefined.
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
        protected MeowMacroblock getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code Source} field. */
        @NativeType("meow_u8 *")
        public long Source() { return MeowMacroblock.nSource(address()); }
        /** Returns the value of the {@code BlockCount} field. */
        public int BlockCount() { return MeowMacroblock.nBlockCount(address()); }

    }

}