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
 * struct meow_source_blocks {
 *     meow_u64 TotalLengthInBytes;
 *     meow_u64 BlockCount;
 *     meow_u64 MacroblockCount;
 *     meow_u8 * Source;
 *     meow_u8 * OverhangStart;
 *     int Overhang;
 * }</code></pre>
 */
@NativeType("struct meow_source_blocks")
public class MeowSourceBlocks extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TOTALLENGTHINBYTES,
        BLOCKCOUNT,
        MACROBLOCKCOUNT,
        SOURCE,
        OVERHANGSTART,
        OVERHANG;

    static {
        Layout layout = __struct(
            __member(8),
            __member(8),
            __member(8),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TOTALLENGTHINBYTES = layout.offsetof(0);
        BLOCKCOUNT = layout.offsetof(1);
        MACROBLOCKCOUNT = layout.offsetof(2);
        SOURCE = layout.offsetof(3);
        OVERHANGSTART = layout.offsetof(4);
        OVERHANG = layout.offsetof(5);
    }

    /**
     * Creates a {@link MeowSourceBlocks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeowSourceBlocks(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code TotalLengthInBytes} field. */
    @NativeType("meow_u64")
    public long TotalLengthInBytes() { return nTotalLengthInBytes(address()); }
    /** Returns the value of the {@code BlockCount} field. */
    @NativeType("meow_u64")
    public long BlockCount() { return nBlockCount(address()); }
    /** Returns the value of the {@code MacroblockCount} field. */
    @NativeType("meow_u64")
    public long MacroblockCount() { return nMacroblockCount(address()); }
    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code Source} field. */
    @NativeType("meow_u8 *")
    public ByteBuffer Source() { return nSource(address()); }
    /** Returns the value of the {@code OverhangStart} field. */
    @NativeType("meow_u8 *")
    public long OverhangStart() { return nOverhangStart(address()); }
    /** Returns the value of the {@code Overhang} field. */
    public int Overhang() { return nOverhang(address()); }

    // -----------------------------------

    /** Returns a new {@link MeowSourceBlocks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeowSourceBlocks malloc() {
        return wrap(MeowSourceBlocks.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link MeowSourceBlocks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeowSourceBlocks calloc() {
        return wrap(MeowSourceBlocks.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link MeowSourceBlocks} instance allocated with {@link BufferUtils}. */
    public static MeowSourceBlocks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(MeowSourceBlocks.class, memAddress(container), container);
    }

    /** Returns a new {@link MeowSourceBlocks} instance for the specified memory address. */
    public static MeowSourceBlocks create(long address) {
        return wrap(MeowSourceBlocks.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeowSourceBlocks createSafe(long address) {
        return address == NULL ? null : wrap(MeowSourceBlocks.class, address);
    }

    /**
     * Returns a new {@link MeowSourceBlocks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeowSourceBlocks.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeowSourceBlocks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeowSourceBlocks.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeowSourceBlocks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeowSourceBlocks.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link MeowSourceBlocks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeowSourceBlocks.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeowSourceBlocks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link MeowSourceBlocks} instance allocated on the thread-local {@link MemoryStack}. */
    public static MeowSourceBlocks mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link MeowSourceBlocks} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static MeowSourceBlocks callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link MeowSourceBlocks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeowSourceBlocks mallocStack(MemoryStack stack) {
        return wrap(MeowSourceBlocks.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link MeowSourceBlocks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeowSourceBlocks callocStack(MemoryStack stack) {
        return wrap(MeowSourceBlocks.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link MeowSourceBlocks.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static MeowSourceBlocks.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link MeowSourceBlocks.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static MeowSourceBlocks.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link MeowSourceBlocks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeowSourceBlocks.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeowSourceBlocks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeowSourceBlocks.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #TotalLengthInBytes}. */
    public static long nTotalLengthInBytes(long struct) { return UNSAFE.getLong(null, struct + MeowSourceBlocks.TOTALLENGTHINBYTES); }
    /** Unsafe version of {@link #BlockCount}. */
    public static long nBlockCount(long struct) { return UNSAFE.getLong(null, struct + MeowSourceBlocks.BLOCKCOUNT); }
    /** Unsafe version of {@link #MacroblockCount}. */
    public static long nMacroblockCount(long struct) { return UNSAFE.getLong(null, struct + MeowSourceBlocks.MACROBLOCKCOUNT); }
    /** Unsafe version of {@link #Source() Source}. */
    public static ByteBuffer nSource(long struct) { return memByteBuffer(memGetAddress(struct + MeowSourceBlocks.SOURCE), (int)nTotalLengthInBytes(struct)); }
    /** Unsafe version of {@link #OverhangStart}. */
    public static long nOverhangStart(long struct) { return memGetAddress(struct + MeowSourceBlocks.OVERHANGSTART); }
    /** Unsafe version of {@link #Overhang}. */
    public static int nOverhang(long struct) { return UNSAFE.getInt(null, struct + MeowSourceBlocks.OVERHANG); }

    // -----------------------------------

    /** An array of {@link MeowSourceBlocks} structs. */
    public static class Buffer extends StructBuffer<MeowSourceBlocks, Buffer> implements NativeResource {

        private static final MeowSourceBlocks ELEMENT_FACTORY = MeowSourceBlocks.create(-1L);

        /**
         * Creates a new {@link MeowSourceBlocks.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeowSourceBlocks#SIZEOF}, and its mark will be undefined.
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
        protected MeowSourceBlocks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code TotalLengthInBytes} field. */
        @NativeType("meow_u64")
        public long TotalLengthInBytes() { return MeowSourceBlocks.nTotalLengthInBytes(address()); }
        /** Returns the value of the {@code BlockCount} field. */
        @NativeType("meow_u64")
        public long BlockCount() { return MeowSourceBlocks.nBlockCount(address()); }
        /** Returns the value of the {@code MacroblockCount} field. */
        @NativeType("meow_u64")
        public long MacroblockCount() { return MeowSourceBlocks.nMacroblockCount(address()); }
        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code Source} field. */
        @NativeType("meow_u8 *")
        public ByteBuffer Source() { return MeowSourceBlocks.nSource(address()); }
        /** Returns the value of the {@code OverhangStart} field. */
        @NativeType("meow_u8 *")
        public long OverhangStart() { return MeowSourceBlocks.nOverhangStart(address()); }
        /** Returns the value of the {@code Overhang} field. */
        public int Overhang() { return MeowSourceBlocks.nOverhang(address()); }

    }

}