/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.bgfx.BGFX.BGFX_ATTRIB_COUNT;

/**
 * Vertex layout.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_vertex_layout_t {
 *     uint32_t hash;
 *     uint16_t {@link #stride};
 *     uint16_t {@link #offset}[BGFX_ATTRIB_COUNT];
 *     uint16_t attributes[BGFX_ATTRIB_COUNT];
 * }</code></pre>
 */
@NativeType("struct bgfx_vertex_layout_t")
public class BGFXVertexLayout extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HASH,
        STRIDE,
        OFFSET,
        ATTRIBUTES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __array(2, BGFX_ATTRIB_COUNT),
            __array(2, BGFX_ATTRIB_COUNT)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HASH = layout.offsetof(0);
        STRIDE = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
        ATTRIBUTES = layout.offsetof(3);
    }

    /**
     * Creates a {@code BGFXVertexLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXVertexLayout(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code hash} field. */
    @NativeType("uint32_t")
    public int hash() { return nhash(address()); }
    /** vertex stride */
    @NativeType("uint16_t")
    public short stride() { return nstride(address()); }
    /** relative attribute offset from the vertex */
    @NativeType("uint16_t[BGFX_ATTRIB_COUNT]")
    public ShortBuffer offset() { return noffset(address()); }
    /** relative attribute offset from the vertex */
    @NativeType("uint16_t")
    public short offset(int index) { return noffset(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code attributes} field. */
    @NativeType("uint16_t[BGFX_ATTRIB_COUNT]")
    public ShortBuffer attributes() { return nattributes(address()); }
    /** @return the value at the specified index of the {@code attributes} field. */
    @NativeType("uint16_t")
    public short attributes(int index) { return nattributes(address(), index); }

    /** Sets the specified value to the {@code hash} field. */
    public BGFXVertexLayout hash(@NativeType("uint32_t") int value) { nhash(address(), value); return this; }
    /** Sets the specified value to the {@link #stride} field. */
    public BGFXVertexLayout stride(@NativeType("uint16_t") short value) { nstride(address(), value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@link #offset} field. */
    public BGFXVertexLayout offset(@NativeType("uint16_t[BGFX_ATTRIB_COUNT]") ShortBuffer value) { noffset(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@link #offset} field. */
    public BGFXVertexLayout offset(int index, @NativeType("uint16_t") short value) { noffset(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code attributes} field. */
    public BGFXVertexLayout attributes(@NativeType("uint16_t[BGFX_ATTRIB_COUNT]") ShortBuffer value) { nattributes(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code attributes} field. */
    public BGFXVertexLayout attributes(int index, @NativeType("uint16_t") short value) { nattributes(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXVertexLayout set(
        int hash,
        short stride,
        ShortBuffer offset,
        ShortBuffer attributes
    ) {
        hash(hash);
        stride(stride);
        offset(offset);
        attributes(attributes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXVertexLayout set(BGFXVertexLayout src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXVertexLayout} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXVertexLayout malloc() {
        return wrap(BGFXVertexLayout.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXVertexLayout} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXVertexLayout calloc() {
        return wrap(BGFXVertexLayout.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXVertexLayout} instance allocated with {@link BufferUtils}. */
    public static BGFXVertexLayout create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXVertexLayout.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXVertexLayout} instance for the specified memory address. */
    public static BGFXVertexLayout create(long address) {
        return wrap(BGFXVertexLayout.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXVertexLayout createSafe(long address) {
        return address == NULL ? null : wrap(BGFXVertexLayout.class, address);
    }

    /**
     * Returns a new {@link BGFXVertexLayout.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVertexLayout.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXVertexLayout.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVertexLayout.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXVertexLayout.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXVertexLayout.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BGFXVertexLayout.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXVertexLayout.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXVertexLayout.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXVertexLayout mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXVertexLayout callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXVertexLayout mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXVertexLayout callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXVertexLayout.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXVertexLayout.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXVertexLayout.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXVertexLayout.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code BGFXVertexLayout} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXVertexLayout malloc(MemoryStack stack) {
        return wrap(BGFXVertexLayout.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXVertexLayout} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXVertexLayout calloc(MemoryStack stack) {
        return wrap(BGFXVertexLayout.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXVertexLayout.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXVertexLayout.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXVertexLayout.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXVertexLayout.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #hash}. */
    public static int nhash(long struct) { return UNSAFE.getInt(null, struct + BGFXVertexLayout.HASH); }
    /** Unsafe version of {@link #stride}. */
    public static short nstride(long struct) { return UNSAFE.getShort(null, struct + BGFXVertexLayout.STRIDE); }
    /** Unsafe version of {@link #offset}. */
    public static ShortBuffer noffset(long struct) { return memShortBuffer(struct + BGFXVertexLayout.OFFSET, BGFX_ATTRIB_COUNT); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static short noffset(long struct, int index) {
        return UNSAFE.getShort(null, struct + BGFXVertexLayout.OFFSET + check(index, BGFX_ATTRIB_COUNT) * 2);
    }
    /** Unsafe version of {@link #attributes}. */
    public static ShortBuffer nattributes(long struct) { return memShortBuffer(struct + BGFXVertexLayout.ATTRIBUTES, BGFX_ATTRIB_COUNT); }
    /** Unsafe version of {@link #attributes(int) attributes}. */
    public static short nattributes(long struct, int index) {
        return UNSAFE.getShort(null, struct + BGFXVertexLayout.ATTRIBUTES + check(index, BGFX_ATTRIB_COUNT) * 2);
    }

    /** Unsafe version of {@link #hash(int) hash}. */
    public static void nhash(long struct, int value) { UNSAFE.putInt(null, struct + BGFXVertexLayout.HASH, value); }
    /** Unsafe version of {@link #stride(short) stride}. */
    public static void nstride(long struct, short value) { UNSAFE.putShort(null, struct + BGFXVertexLayout.STRIDE, value); }
    /** Unsafe version of {@link #offset(ShortBuffer) offset}. */
    public static void noffset(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, BGFX_ATTRIB_COUNT); }
        memCopy(memAddress(value), struct + BGFXVertexLayout.OFFSET, value.remaining() * 2);
    }
    /** Unsafe version of {@link #offset(int, short) offset}. */
    public static void noffset(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + BGFXVertexLayout.OFFSET + check(index, BGFX_ATTRIB_COUNT) * 2, value);
    }
    /** Unsafe version of {@link #attributes(ShortBuffer) attributes}. */
    public static void nattributes(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, BGFX_ATTRIB_COUNT); }
        memCopy(memAddress(value), struct + BGFXVertexLayout.ATTRIBUTES, value.remaining() * 2);
    }
    /** Unsafe version of {@link #attributes(int, short) attributes}. */
    public static void nattributes(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + BGFXVertexLayout.ATTRIBUTES + check(index, BGFX_ATTRIB_COUNT) * 2, value);
    }

    // -----------------------------------

    /** An array of {@link BGFXVertexLayout} structs. */
    public static class Buffer extends StructBuffer<BGFXVertexLayout, Buffer> implements NativeResource {

        private static final BGFXVertexLayout ELEMENT_FACTORY = BGFXVertexLayout.create(-1L);

        /**
         * Creates a new {@code BGFXVertexLayout.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXVertexLayout#SIZEOF}, and its mark will be undefined.
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
        protected BGFXVertexLayout getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code hash} field. */
        @NativeType("uint32_t")
        public int hash() { return BGFXVertexLayout.nhash(address()); }
        /** @return the value of the {@link BGFXVertexLayout#stride} field. */
        @NativeType("uint16_t")
        public short stride() { return BGFXVertexLayout.nstride(address()); }
        /** @return a {@link ShortBuffer} view of the {@link BGFXVertexLayout#offset} field. */
        @NativeType("uint16_t[BGFX_ATTRIB_COUNT]")
        public ShortBuffer offset() { return BGFXVertexLayout.noffset(address()); }
        /** @return the value at the specified index of the {@link BGFXVertexLayout#offset} field. */
        @NativeType("uint16_t")
        public short offset(int index) { return BGFXVertexLayout.noffset(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code attributes} field. */
        @NativeType("uint16_t[BGFX_ATTRIB_COUNT]")
        public ShortBuffer attributes() { return BGFXVertexLayout.nattributes(address()); }
        /** @return the value at the specified index of the {@code attributes} field. */
        @NativeType("uint16_t")
        public short attributes(int index) { return BGFXVertexLayout.nattributes(address(), index); }

        /** Sets the specified value to the {@code hash} field. */
        public BGFXVertexLayout.Buffer hash(@NativeType("uint32_t") int value) { BGFXVertexLayout.nhash(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXVertexLayout#stride} field. */
        public BGFXVertexLayout.Buffer stride(@NativeType("uint16_t") short value) { BGFXVertexLayout.nstride(address(), value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@link BGFXVertexLayout#offset} field. */
        public BGFXVertexLayout.Buffer offset(@NativeType("uint16_t[BGFX_ATTRIB_COUNT]") ShortBuffer value) { BGFXVertexLayout.noffset(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@link BGFXVertexLayout#offset} field. */
        public BGFXVertexLayout.Buffer offset(int index, @NativeType("uint16_t") short value) { BGFXVertexLayout.noffset(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code attributes} field. */
        public BGFXVertexLayout.Buffer attributes(@NativeType("uint16_t[BGFX_ATTRIB_COUNT]") ShortBuffer value) { BGFXVertexLayout.nattributes(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code attributes} field. */
        public BGFXVertexLayout.Buffer attributes(int index, @NativeType("uint16_t") short value) { BGFXVertexLayout.nattributes(address(), index, value); return this; }

    }

}