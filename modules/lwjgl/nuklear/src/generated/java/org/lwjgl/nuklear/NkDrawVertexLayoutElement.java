/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

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
 * struct nk_draw_vertex_layout_element {
 *     enum nk_draw_vertex_layout_attribute {@link #attribute};
 *     enum nk_draw_vertex_layout_format {@link #format};
 *     nk_size {@link #offset};
 * }</code></pre>
 */
@NativeType("struct nk_draw_vertex_layout_element")
public class NkDrawVertexLayoutElement extends Struct implements NativeResource {

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

    /** the vertex attribute. One of:<br><table><tr><td>{@link Nuklear#NK_VERTEX_POSITION VERTEX_POSITION}</td><td>{@link Nuklear#NK_VERTEX_COLOR VERTEX_COLOR}</td><td>{@link Nuklear#NK_VERTEX_TEXCOORD VERTEX_TEXCOORD}</td><td>{@link Nuklear#NK_VERTEX_ATTRIBUTE_COUNT VERTEX_ATTRIBUTE_COUNT}</td></tr></table> */
    @NativeType("enum nk_draw_vertex_layout_attribute")
    public int attribute() { return nattribute(address()); }
    /** the vertex attribute format. One of:<br><table><tr><td>{@link Nuklear#NK_FORMAT_SCHAR FORMAT_SCHAR}</td><td>{@link Nuklear#NK_FORMAT_SSHORT FORMAT_SSHORT}</td><td>{@link Nuklear#NK_FORMAT_SINT FORMAT_SINT}</td><td>{@link Nuklear#NK_FORMAT_UCHAR FORMAT_UCHAR}</td><td>{@link Nuklear#NK_FORMAT_USHORT FORMAT_USHORT}</td></tr><tr><td>{@link Nuklear#NK_FORMAT_UINT FORMAT_UINT}</td><td>{@link Nuklear#NK_FORMAT_FLOAT FORMAT_FLOAT}</td><td>{@link Nuklear#NK_FORMAT_DOUBLE FORMAT_DOUBLE}</td><td>{@link Nuklear#NK_FORMAT_R8G8B8 FORMAT_R8G8B8}</td><td>{@link Nuklear#NK_FORMAT_R16G15B16 FORMAT_R16G15B16}</td></tr><tr><td>{@link Nuklear#NK_FORMAT_R32G32B32 FORMAT_R32G32B32}</td><td>{@link Nuklear#NK_FORMAT_R8G8B8A8 FORMAT_R8G8B8A8}</td><td>{@link Nuklear#NK_FORMAT_B8G8R8A8 FORMAT_B8G8R8A8}</td><td>{@link Nuklear#NK_FORMAT_R16G15B16A16 FORMAT_R16G15B16A16}</td><td>{@link Nuklear#NK_FORMAT_R32G32B32A32 FORMAT_R32G32B32A32}</td></tr><tr><td>{@link Nuklear#NK_FORMAT_R32G32B32A32_FLOAT FORMAT_R32G32B32A32_FLOAT}</td><td>{@link Nuklear#NK_FORMAT_R32G32B32A32_DOUBLE FORMAT_R32G32B32A32_DOUBLE}</td><td>{@link Nuklear#NK_FORMAT_RGB32 FORMAT_RGB32}</td><td>{@link Nuklear#NK_FORMAT_RGBA32 FORMAT_RGBA32}</td></tr></table> */
    @NativeType("enum nk_draw_vertex_layout_format")
    public int format() { return nformat(address()); }
    /** the vertex attribute offset */
    @NativeType("nk_size")
    public long offset() { return noffset(address()); }

    /** Sets the specified value to the {@link #attribute} field. */
    public NkDrawVertexLayoutElement attribute(@NativeType("enum nk_draw_vertex_layout_attribute") int value) { nattribute(address(), value); return this; }
    /** Sets the specified value to the {@link #format} field. */
    public NkDrawVertexLayoutElement format(@NativeType("enum nk_draw_vertex_layout_format") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
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
        return wrap(NkDrawVertexLayoutElement.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkDrawVertexLayoutElement} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkDrawVertexLayoutElement calloc() {
        return wrap(NkDrawVertexLayoutElement.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkDrawVertexLayoutElement} instance allocated with {@link BufferUtils}. */
    public static NkDrawVertexLayoutElement create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkDrawVertexLayoutElement.class, memAddress(container), container);
    }

    /** Returns a new {@code NkDrawVertexLayoutElement} instance for the specified memory address. */
    public static NkDrawVertexLayoutElement create(long address) {
        return wrap(NkDrawVertexLayoutElement.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkDrawVertexLayoutElement createSafe(long address) {
        return address == NULL ? null : wrap(NkDrawVertexLayoutElement.class, address);
    }

    /**
     * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkDrawVertexLayoutElement.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkDrawVertexLayoutElement.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
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
        return wrap(NkDrawVertexLayoutElement.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkDrawVertexLayoutElement} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkDrawVertexLayoutElement calloc(MemoryStack stack) {
        return wrap(NkDrawVertexLayoutElement.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkDrawVertexLayoutElement.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkDrawVertexLayoutElement.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #attribute}. */
    public static int nattribute(long struct) { return UNSAFE.getInt(null, struct + NkDrawVertexLayoutElement.ATTRIBUTE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + NkDrawVertexLayoutElement.FORMAT); }
    /** Unsafe version of {@link #offset}. */
    public static long noffset(long struct) { return memGetAddress(struct + NkDrawVertexLayoutElement.OFFSET); }

    /** Unsafe version of {@link #attribute(int) attribute}. */
    public static void nattribute(long struct, int value) { UNSAFE.putInt(null, struct + NkDrawVertexLayoutElement.ATTRIBUTE, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + NkDrawVertexLayoutElement.FORMAT, value); }
    /** Unsafe version of {@link #offset(long) offset}. */
    public static void noffset(long struct, long value) { memPutAddress(struct + NkDrawVertexLayoutElement.OFFSET, value); }

    // -----------------------------------

    /** An array of {@link NkDrawVertexLayoutElement} structs. */
    public static class Buffer extends StructBuffer<NkDrawVertexLayoutElement, Buffer> implements NativeResource {

        private static final NkDrawVertexLayoutElement ELEMENT_FACTORY = NkDrawVertexLayoutElement.create(-1L);

        /**
         * Creates a new {@code NkDrawVertexLayoutElement.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkDrawVertexLayoutElement#SIZEOF}, and its mark will be undefined.
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
        protected NkDrawVertexLayoutElement getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link NkDrawVertexLayoutElement#attribute} field. */
        @NativeType("enum nk_draw_vertex_layout_attribute")
        public int attribute() { return NkDrawVertexLayoutElement.nattribute(address()); }
        /** @return the value of the {@link NkDrawVertexLayoutElement#format} field. */
        @NativeType("enum nk_draw_vertex_layout_format")
        public int format() { return NkDrawVertexLayoutElement.nformat(address()); }
        /** @return the value of the {@link NkDrawVertexLayoutElement#offset} field. */
        @NativeType("nk_size")
        public long offset() { return NkDrawVertexLayoutElement.noffset(address()); }

        /** Sets the specified value to the {@link NkDrawVertexLayoutElement#attribute} field. */
        public NkDrawVertexLayoutElement.Buffer attribute(@NativeType("enum nk_draw_vertex_layout_attribute") int value) { NkDrawVertexLayoutElement.nattribute(address(), value); return this; }
        /** Sets the specified value to the {@link NkDrawVertexLayoutElement#format} field. */
        public NkDrawVertexLayoutElement.Buffer format(@NativeType("enum nk_draw_vertex_layout_format") int value) { NkDrawVertexLayoutElement.nformat(address(), value); return this; }
        /** Sets the specified value to the {@link NkDrawVertexLayoutElement#offset} field. */
        public NkDrawVertexLayoutElement.Buffer offset(@NativeType("nk_size") long value) { NkDrawVertexLayoutElement.noffset(address(), value); return this; }

    }

}