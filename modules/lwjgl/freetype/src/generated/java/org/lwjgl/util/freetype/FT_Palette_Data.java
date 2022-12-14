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
 * This structure holds the data of the {@code CPAL} table.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_Palette_Data {
 *     FT_UShort num_palettes;
 *     FT_UShort const * palette_name_ids;
 *     FT_UShort const * palette_flags;
 *     FT_UShort num_palette_entries;
 *     FT_UShort const * palette_entry_name_ids;
 * }</code></pre>
 */
public class FT_Palette_Data extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NUM_PALETTES,
        PALETTE_NAME_IDS,
        PALETTE_FLAGS,
        NUM_PALETTE_ENTRIES,
        PALETTE_ENTRY_NAME_IDS;

    static {
        Layout layout = __struct(
            __member(2),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(2),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NUM_PALETTES = layout.offsetof(0);
        PALETTE_NAME_IDS = layout.offsetof(1);
        PALETTE_FLAGS = layout.offsetof(2);
        NUM_PALETTE_ENTRIES = layout.offsetof(3);
        PALETTE_ENTRY_NAME_IDS = layout.offsetof(4);
    }

    /**
     * Creates a {@code FT_Palette_Data} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Palette_Data(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code num_palettes} field. */
    @NativeType("FT_UShort")
    public short num_palettes() { return nnum_palettes(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code palette_name_ids} field. */
    @Nullable
    @NativeType("FT_UShort const *")
    public ShortBuffer palette_name_ids() { return npalette_name_ids(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code palette_flags} field. */
    @Nullable
    @NativeType("FT_UShort const *")
    public ShortBuffer palette_flags() { return npalette_flags(address()); }
    /** @return the value of the {@code num_palette_entries} field. */
    @NativeType("FT_UShort")
    public short num_palette_entries() { return nnum_palette_entries(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code palette_entry_name_ids} field. */
    @Nullable
    @NativeType("FT_UShort const *")
    public ShortBuffer palette_entry_name_ids() { return npalette_entry_name_ids(address()); }

    // -----------------------------------

    /** Returns a new {@code FT_Palette_Data} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Palette_Data malloc() {
        return wrap(FT_Palette_Data.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code FT_Palette_Data} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Palette_Data calloc() {
        return wrap(FT_Palette_Data.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code FT_Palette_Data} instance allocated with {@link BufferUtils}. */
    public static FT_Palette_Data create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(FT_Palette_Data.class, memAddress(container), container);
    }

    /** Returns a new {@code FT_Palette_Data} instance for the specified memory address. */
    public static FT_Palette_Data create(long address) {
        return wrap(FT_Palette_Data.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Palette_Data createSafe(long address) {
        return address == NULL ? null : wrap(FT_Palette_Data.class, address);
    }

    /**
     * Returns a new {@link FT_Palette_Data.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Palette_Data.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Palette_Data.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Palette_Data.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Palette_Data.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Palette_Data.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link FT_Palette_Data.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Palette_Data.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Palette_Data.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code FT_Palette_Data} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Palette_Data malloc(MemoryStack stack) {
        return wrap(FT_Palette_Data.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code FT_Palette_Data} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Palette_Data calloc(MemoryStack stack) {
        return wrap(FT_Palette_Data.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link FT_Palette_Data.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Palette_Data.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Palette_Data.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Palette_Data.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #num_palettes}. */
    public static short nnum_palettes(long struct) { return UNSAFE.getShort(null, struct + FT_Palette_Data.NUM_PALETTES); }
    /** Unsafe version of {@link #palette_name_ids() palette_name_ids}. */
    @Nullable public static ShortBuffer npalette_name_ids(long struct) { return memShortBufferSafe(memGetAddress(struct + FT_Palette_Data.PALETTE_NAME_IDS), Short.toUnsignedInt(nnum_palettes(struct))); }
    /** Unsafe version of {@link #palette_flags() palette_flags}. */
    @Nullable public static ShortBuffer npalette_flags(long struct) { return memShortBufferSafe(memGetAddress(struct + FT_Palette_Data.PALETTE_FLAGS), Short.toUnsignedInt(nnum_palettes(struct))); }
    /** Unsafe version of {@link #num_palette_entries}. */
    public static short nnum_palette_entries(long struct) { return UNSAFE.getShort(null, struct + FT_Palette_Data.NUM_PALETTE_ENTRIES); }
    /** Unsafe version of {@link #palette_entry_name_ids() palette_entry_name_ids}. */
    @Nullable public static ShortBuffer npalette_entry_name_ids(long struct) { return memShortBufferSafe(memGetAddress(struct + FT_Palette_Data.PALETTE_ENTRY_NAME_IDS), Short.toUnsignedInt(nnum_palette_entries(struct))); }

    // -----------------------------------

    /** An array of {@link FT_Palette_Data} structs. */
    public static class Buffer extends StructBuffer<FT_Palette_Data, Buffer> implements NativeResource {

        private static final FT_Palette_Data ELEMENT_FACTORY = FT_Palette_Data.create(-1L);

        /**
         * Creates a new {@code FT_Palette_Data.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Palette_Data#SIZEOF}, and its mark will be undefined.
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
        protected FT_Palette_Data getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code num_palettes} field. */
        @NativeType("FT_UShort")
        public short num_palettes() { return FT_Palette_Data.nnum_palettes(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code palette_name_ids} field. */
        @Nullable
        @NativeType("FT_UShort const *")
        public ShortBuffer palette_name_ids() { return FT_Palette_Data.npalette_name_ids(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code palette_flags} field. */
        @Nullable
        @NativeType("FT_UShort const *")
        public ShortBuffer palette_flags() { return FT_Palette_Data.npalette_flags(address()); }
        /** @return the value of the {@code num_palette_entries} field. */
        @NativeType("FT_UShort")
        public short num_palette_entries() { return FT_Palette_Data.nnum_palette_entries(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code palette_entry_name_ids} field. */
        @Nullable
        @NativeType("FT_UShort const *")
        public ShortBuffer palette_entry_name_ids() { return FT_Palette_Data.npalette_entry_name_ids(address()); }

    }

}