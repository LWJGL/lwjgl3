/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_cursor {
 *     {@link NkImage struct nk_image} img;
 *     {@link NkVec2 struct nk_vec2} size;
 *     {@link NkVec2 struct nk_vec2} offset;
 * }</code></pre>
 */
@NativeType("struct nk_cursor")
public class NkCursor extends Struct<NkCursor> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        IMG,
        SIZE,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(NkImage.SIZEOF, NkImage.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        IMG = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
    }

    protected NkCursor(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkCursor create(long address, @Nullable ByteBuffer container) {
        return new NkCursor(address, container);
    }

    /**
     * Creates a {@code NkCursor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkCursor(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return a {@link NkImage} view of the {@code img} field. */
    @NativeType("struct nk_image")
    public NkImage img() { return nimg(address()); }
    /** @return a {@link NkVec2} view of the {@code size} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 size() { return nsize(address()); }
    /** @return a {@link NkVec2} view of the {@code offset} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 offset() { return noffset(address()); }

    /** Copies the specified {@link NkImage} to the {@code img} field. */
    public NkCursor img(@NativeType("struct nk_image") NkImage value) { nimg(address(), value); return this; }
    /** Passes the {@code img} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkCursor img(java.util.function.Consumer<NkImage> consumer) { consumer.accept(img()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code size} field. */
    public NkCursor size(@NativeType("struct nk_vec2") NkVec2 value) { nsize(address(), value); return this; }
    /** Passes the {@code size} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkCursor size(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(size()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code offset} field. */
    public NkCursor offset(@NativeType("struct nk_vec2") NkVec2 value) { noffset(address(), value); return this; }
    /** Passes the {@code offset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkCursor offset(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(offset()); return this; }

    /** Initializes this struct with the specified values. */
    public NkCursor set(
        NkImage img,
        NkVec2 size,
        NkVec2 offset
    ) {
        img(img);
        size(size);
        offset(offset);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkCursor set(NkCursor src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkCursor} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkCursor malloc() {
        return new NkCursor(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkCursor} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkCursor calloc() {
        return new NkCursor(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkCursor} instance allocated with {@link BufferUtils}. */
    public static NkCursor create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkCursor(memAddress(container), container);
    }

    /** Returns a new {@code NkCursor} instance for the specified memory address. */
    public static NkCursor create(long address) {
        return new NkCursor(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkCursor createSafe(long address) {
        return address == NULL ? null : new NkCursor(address, null);
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkCursor.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkCursor.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkCursor mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkCursor callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkCursor mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkCursor callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkCursor.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkCursor.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkCursor.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkCursor.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkCursor} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkCursor malloc(MemoryStack stack) {
        return new NkCursor(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkCursor} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkCursor calloc(MemoryStack stack) {
        return new NkCursor(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkCursor.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkCursor.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #img}. */
    public static NkImage nimg(long struct) { return NkImage.create(struct + NkCursor.IMG); }
    /** Unsafe version of {@link #size}. */
    public static NkVec2 nsize(long struct) { return NkVec2.create(struct + NkCursor.SIZE); }
    /** Unsafe version of {@link #offset}. */
    public static NkVec2 noffset(long struct) { return NkVec2.create(struct + NkCursor.OFFSET); }

    /** Unsafe version of {@link #img(NkImage) img}. */
    public static void nimg(long struct, NkImage value) { memCopy(value.address(), struct + NkCursor.IMG, NkImage.SIZEOF); }
    /** Unsafe version of {@link #size(NkVec2) size}. */
    public static void nsize(long struct, NkVec2 value) { memCopy(value.address(), struct + NkCursor.SIZE, NkVec2.SIZEOF); }
    /** Unsafe version of {@link #offset(NkVec2) offset}. */
    public static void noffset(long struct, NkVec2 value) { memCopy(value.address(), struct + NkCursor.OFFSET, NkVec2.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkCursor} structs. */
    public static class Buffer extends StructBuffer<NkCursor, Buffer> implements NativeResource {

        private static final NkCursor ELEMENT_FACTORY = NkCursor.create(-1L);

        /**
         * Creates a new {@code NkCursor.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkCursor#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected NkCursor getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkImage} view of the {@code img} field. */
        @NativeType("struct nk_image")
        public NkImage img() { return NkCursor.nimg(address()); }
        /** @return a {@link NkVec2} view of the {@code size} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 size() { return NkCursor.nsize(address()); }
        /** @return a {@link NkVec2} view of the {@code offset} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 offset() { return NkCursor.noffset(address()); }

        /** Copies the specified {@link NkImage} to the {@code img} field. */
        public NkCursor.Buffer img(@NativeType("struct nk_image") NkImage value) { NkCursor.nimg(address(), value); return this; }
        /** Passes the {@code img} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkCursor.Buffer img(java.util.function.Consumer<NkImage> consumer) { consumer.accept(img()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code size} field. */
        public NkCursor.Buffer size(@NativeType("struct nk_vec2") NkVec2 value) { NkCursor.nsize(address(), value); return this; }
        /** Passes the {@code size} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkCursor.Buffer size(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(size()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code offset} field. */
        public NkCursor.Buffer offset(@NativeType("struct nk_vec2") NkVec2 value) { NkCursor.noffset(address(), value); return this; }
        /** Passes the {@code offset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkCursor.Buffer offset(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(offset()); return this; }

    }

}