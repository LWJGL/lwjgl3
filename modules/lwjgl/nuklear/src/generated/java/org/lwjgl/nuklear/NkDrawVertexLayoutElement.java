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
 * <pre>{@code
 * struct nk_draw_vertex_layout_element {
 *     enum nk_draw_vertex_layout_attribute attribute;
 *     enum nk_draw_vertex_layout_format format;
 *     nk_size offset;
 * }}</pre>
 */
@NativeType("struct nk_draw_vertex_layout_element")
public class NkDrawVertexLayoutElement extends Struct<NkDrawVertexLayoutElement> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ATTRIBUTE,
        FORMAT,
        OFFSET;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ATTRIBUTE = layout.offsetof(0);
        FORMAT = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
    }

    protected NkDrawVertexLayoutElement(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkDrawVertexLayoutElement create(long address, @Nullable ByteBuffer container) {
        return new NkDrawVertexLayoutElement(address, container);
    }

    /**
     * Creates a {@code NkDrawVertexLayoutElement} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkDrawVertexLayoutElement(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code attribute} field. */
    @NativeType("enum nk_draw_vertex_layout_attribute")
    public int attribute() { return nattribute(address()); }
    /** @return the value of the {@code format} field. */
    @NativeType("enum nk_draw_vertex_layout_format")
    public int format() { return nformat(address()); }
    /** @return the value of the {@code offset} field. */
    @NativeType("nk_size")
    public long offset() { return noffset(address()); }

    /** Sets the specified value to the {@code attribute} field. */
    public NkDrawVertexLayoutElement attribute(@NativeType("enum nk_draw_vertex_layout_attribute") int value) { nattribute(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public NkDrawVertexLayoutElement format(@NativeType("enum nk_draw_vertex_layout_format") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code offset} field. */
    public NkDrawVertexLayoutElement offset(@NativeType("nk_size") long value) { noffset(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NkDrawVertexLayoutElement set(
        int attribute,
        int format,
        long offset
    ) {
        attribute(attribute);
        format(format);
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
    public NkDrawVertexLayoutElement set(NkDrawVertexLayoutElement src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkDrawVertexLayoutElement} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkDrawVertexLayoutElement malloc() {
        return new NkDrawVertexLayoutElement(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkDrawVertexLayoutElement} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkDrawVertexLayoutElement calloc() {
        return new NkDrawVertexLayoutElement(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkDrawVertexLayoutElement} instance allocated with {@link BufferUtils}. */
    public static NkDrawVertexLayoutElement create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkDrawVertexLayoutElement(memAddress(container), container);
    }

    /** Returns a new {@code NkDrawVertexLayoutElement} instance for the specified memory address. */
    public static NkDrawVertexLayoutElement create(long address) {
        return new NkDrawVertexLayoutElement(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkDrawVertexLayoutElement createSafe(long address) {
        return address == NULL ? null : new NkDrawVertexLayoutElement(address, null);
    }

    /**
     * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkDrawVertexLayoutElement.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkDrawVertexLayoutElement.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkDrawVertexLayoutElement mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkDrawVertexLayoutElement callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkDrawVertexLayoutElement mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkDrawVertexLayoutElement callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkDrawVertexLayoutElement.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkDrawVertexLayoutElement.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkDrawVertexLayoutElement.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkDrawVertexLayoutElement.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkDrawVertexLayoutElement} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkDrawVertexLayoutElement malloc(MemoryStack stack) {
        return new NkDrawVertexLayoutElement(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkDrawVertexLayoutElement} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkDrawVertexLayoutElement calloc(MemoryStack stack) {
        return new NkDrawVertexLayoutElement(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #attribute}. */
    public static int nattribute(long struct) { return memGetInt(struct + NkDrawVertexLayoutElement.ATTRIBUTE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + NkDrawVertexLayoutElement.FORMAT); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetAddress(struct + NkDrawVertexLayoutElement.OFFSET); }

    /** Unsafe version of {@link #attribute(int) attribute}. */
    public static void nattribute(long struct, int value) { memPutInt(struct + NkDrawVertexLayoutElement.ATTRIBUTE, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + NkDrawVertexLayoutElement.FORMAT, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutAddress(struct + NkDrawVertexLayoutElement.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link NkDrawVertexLayoutElement} structs. */
    public static class Buffer extends StructBuffer<NkDrawVertexLayoutElement, Buffer> implements NativeResource {

        private static final NkDrawVertexLayoutElement ELEMENT_FACTORY = NkDrawVertexLayoutElement.create(-1L);

        /**
         * Creates a new {@code NkDrawVertexLayoutElement.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkDrawVertexLayoutElement#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkDrawVertexLayoutElement getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code attribute} field. */
        @NativeType("enum nk_draw_vertex_layout_attribute")
        public int attribute() { return NkDrawVertexLayoutElement.nattribute(address()); }
        /** @return the value of the {@code format} field. */
        @NativeType("enum nk_draw_vertex_layout_format")
        public int format() { return NkDrawVertexLayoutElement.nformat(address()); }
        /** @return the value of the {@code offset} field. */
        @NativeType("nk_size")
        public long offset() { return NkDrawVertexLayoutElement.noffset(address()); }

        /** Sets the specified value to the {@code attribute} field. */
        public NkDrawVertexLayoutElement.Buffer attribute(@NativeType("enum nk_draw_vertex_layout_attribute") int value) { NkDrawVertexLayoutElement.nattribute(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public NkDrawVertexLayoutElement.Buffer format(@NativeType("enum nk_draw_vertex_layout_format") int value) { NkDrawVertexLayoutElement.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code offset} field. */
        public NkDrawVertexLayoutElement.Buffer offset(@NativeType("nk_size") long value) { NkDrawVertexLayoutElement.noffset(address(), value); return this; }

    }

}