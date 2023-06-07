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
 * FreeType root size class structure. A size object models a face object at a given size.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct FT_SizeRec {
 *     {@link FT_Face FT_Face} {@link #face};
 *     {@link FT_Generic FT_Generic} {@link #generic};
 *     {@link FT_Size_Metrics FT_Size_Metrics} {@link #metrics};
 *     {@link FT_Size_Internal FT_Size_Internal} * internal;
 * }</code></pre>
 */
@NativeType("struct FT_SizeRec")
public class FT_Size extends Struct<FT_Size> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FACE,
        GENERIC,
        METRICS,
        INTERNAL;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(FT_Generic.SIZEOF, FT_Generic.ALIGNOF),
            __member(FT_Size_Metrics.SIZEOF, FT_Size_Metrics.ALIGNOF),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FACE = layout.offsetof(0);
        GENERIC = layout.offsetof(1);
        METRICS = layout.offsetof(2);
        INTERNAL = layout.offsetof(3);
    }

    protected FT_Size(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FT_Size create(long address, @Nullable ByteBuffer container) {
        return new FT_Size(address, container);
    }

    /**
     * Creates a {@code FT_Size} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FT_Size(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** parent face object */
    public FT_Face face() { return nface(address()); }
    /** generic pointer for client uses */
    public FT_Generic generic() { return ngeneric(address()); }
    /** size metrics */
    public FT_Size_Metrics metrics() { return nmetrics(address()); }

    /** Sets the address of the specified {@link FT_Face} to the {@link #face} field. */
    public FT_Size face(FT_Face value) { nface(address(), value); return this; }
    /** Copies the specified {@link FT_Generic} to the {@link #generic} field. */
    public FT_Size generic(FT_Generic value) { ngeneric(address(), value); return this; }
    /** Passes the {@link #generic} field to the specified {@link java.util.function.Consumer Consumer}. */
    public FT_Size generic(java.util.function.Consumer<FT_Generic> consumer) { consumer.accept(generic()); return this; }
    /** Copies the specified {@link FT_Size_Metrics} to the {@link #metrics} field. */
    public FT_Size metrics(FT_Size_Metrics value) { nmetrics(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FT_Size set(
        FT_Face face,
        FT_Generic generic,
        FT_Size_Metrics metrics
    ) {
        face(face);
        generic(generic);
        metrics(metrics);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FT_Size set(FT_Size src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FT_Size} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FT_Size malloc() {
        return new FT_Size(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FT_Size} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FT_Size calloc() {
        return new FT_Size(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FT_Size} instance allocated with {@link BufferUtils}. */
    public static FT_Size create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FT_Size(memAddress(container), container);
    }

    /** Returns a new {@code FT_Size} instance for the specified memory address. */
    public static FT_Size create(long address) {
        return new FT_Size(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Size createSafe(long address) {
        return address == NULL ? null : new FT_Size(address, null);
    }

    /**
     * Returns a new {@link FT_Size.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Size.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FT_Size.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Size.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Size.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FT_Size.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FT_Size.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FT_Size.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FT_Size.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FT_Size} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Size malloc(MemoryStack stack) {
        return new FT_Size(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FT_Size} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FT_Size calloc(MemoryStack stack) {
        return new FT_Size(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FT_Size.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Size.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FT_Size.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FT_Size.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #face}. */
    public static FT_Face nface(long struct) { return FT_Face.create(memGetAddress(struct + FT_Size.FACE)); }
    /** Unsafe version of {@link #generic}. */
    public static FT_Generic ngeneric(long struct) { return FT_Generic.create(struct + FT_Size.GENERIC); }
    /** Unsafe version of {@link #metrics}. */
    public static FT_Size_Metrics nmetrics(long struct) { return FT_Size_Metrics.create(struct + FT_Size.METRICS); }
    public static FT_Size_Internal ninternal(long struct) { return FT_Size_Internal.create(memGetAddress(struct + FT_Size.INTERNAL)); }

    /** Unsafe version of {@link #face(FT_Face) face}. */
    public static void nface(long struct, FT_Face value) { memPutAddress(struct + FT_Size.FACE, value.address()); }
    /** Unsafe version of {@link #generic(FT_Generic) generic}. */
    public static void ngeneric(long struct, FT_Generic value) { memCopy(value.address(), struct + FT_Size.GENERIC, FT_Generic.SIZEOF); }
    /** Unsafe version of {@link #metrics(FT_Size_Metrics) metrics}. */
    public static void nmetrics(long struct, FT_Size_Metrics value) { memCopy(value.address(), struct + FT_Size.METRICS, FT_Size_Metrics.SIZEOF); }
    public static void ninternal(long struct, FT_Size_Internal value) { memPutAddress(struct + FT_Size.INTERNAL, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + FT_Size.FACE));
        FT_Generic.validate(struct + FT_Size.GENERIC);
    }

    // -----------------------------------

    /** An array of {@link FT_Size} structs. */
    public static class Buffer extends StructBuffer<FT_Size, Buffer> implements NativeResource {

        private static final FT_Size ELEMENT_FACTORY = FT_Size.create(-1L);

        /**
         * Creates a new {@code FT_Size.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FT_Size#SIZEOF}, and its mark will be undefined.</p>
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
        protected FT_Size getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FT_Face} view of the struct pointed to by the {@link FT_Size#face} field. */
        public FT_Face face() { return FT_Size.nface(address()); }
        /** @return a {@link FT_Generic} view of the {@link FT_Size#generic} field. */
        public FT_Generic generic() { return FT_Size.ngeneric(address()); }
        /** @return a {@link FT_Size_Metrics} view of the {@link FT_Size#metrics} field. */
        public FT_Size_Metrics metrics() { return FT_Size.nmetrics(address()); }

        /** Sets the address of the specified {@link FT_Face} to the {@link FT_Size#face} field. */
        public FT_Size.Buffer face(FT_Face value) { FT_Size.nface(address(), value); return this; }
        /** Copies the specified {@link FT_Generic} to the {@link FT_Size#generic} field. */
        public FT_Size.Buffer generic(FT_Generic value) { FT_Size.ngeneric(address(), value); return this; }
        /** Passes the {@link FT_Size#generic} field to the specified {@link java.util.function.Consumer Consumer}. */
        public FT_Size.Buffer generic(java.util.function.Consumer<FT_Generic> consumer) { consumer.accept(generic()); return this; }
        /** Copies the specified {@link FT_Size_Metrics} to the {@link FT_Size#metrics} field. */
        public FT_Size.Buffer metrics(FT_Size_Metrics value) { FT_Size.nmetrics(address(), value); return this; }

    }

}