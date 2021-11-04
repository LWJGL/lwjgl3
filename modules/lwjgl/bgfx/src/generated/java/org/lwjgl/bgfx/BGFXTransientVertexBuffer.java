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

/**
 * Transient vertex buffer.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_transient_vertex_buffer_t {
 *     uint8_t * {@link #data};
 *     uint32_t {@link #size};
 *     uint32_t {@link #startVertex};
 *     uint16_t {@link #stride};
 *     bgfx_vertex_buffer_handle_t {@link #handle};
 *     bgfx_vertex_layout_handle_t {@link #layoutHandle};
 * }</code></pre>
 */
@NativeType("struct bgfx_transient_vertex_buffer_t")
public class BGFXTransientVertexBuffer extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA,
        SIZE,
        STARTVERTEX,
        STRIDE,
        HANDLE,
        LAYOUTHANDLE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        STARTVERTEX = layout.offsetof(2);
        STRIDE = layout.offsetof(3);
        HANDLE = layout.offsetof(4);
        LAYOUTHANDLE = layout.offsetof(5);
    }

    /**
     * Creates a {@code BGFXTransientVertexBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXTransientVertexBuffer(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** pointer to data */
    @NativeType("uint8_t *")
    public ByteBuffer data() { return ndata(address()); }
    /** data size */
    @NativeType("uint32_t")
    public int size() { return nsize(address()); }
    /** first vertex */
    @NativeType("uint32_t")
    public int startVertex() { return nstartVertex(address()); }
    /** vertex stride */
    @NativeType("uint16_t")
    public short stride() { return nstride(address()); }
    /** vertex buffer handle */
    @NativeType("bgfx_vertex_buffer_handle_t")
    public short handle() { return nhandle(address()); }
    /** vertex layout handle */
    @NativeType("bgfx_vertex_layout_handle_t")
    public short layoutHandle() { return nlayoutHandle(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@link #data} field. */
    public BGFXTransientVertexBuffer data(@NativeType("uint8_t *") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@link #startVertex} field. */
    public BGFXTransientVertexBuffer startVertex(@NativeType("uint32_t") int value) { nstartVertex(address(), value); return this; }
    /** Sets the specified value to the {@link #stride} field. */
    public BGFXTransientVertexBuffer stride(@NativeType("uint16_t") short value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@link #handle} field. */
    public BGFXTransientVertexBuffer handle(@NativeType("bgfx_vertex_buffer_handle_t") short value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@link #layoutHandle} field. */
    public BGFXTransientVertexBuffer layoutHandle(@NativeType("bgfx_vertex_layout_handle_t") short value) { nlayoutHandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXTransientVertexBuffer set(
        ByteBuffer data,
        int startVertex,
        short stride,
        short handle,
        short layoutHandle
    ) {
        data(data);
        startVertex(startVertex);
        stride(stride);
        handle(handle);
        layoutHandle(layoutHandle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXTransientVertexBuffer set(BGFXTransientVertexBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXTransientVertexBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXTransientVertexBuffer malloc() {
        return wrap(BGFXTransientVertexBuffer.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXTransientVertexBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXTransientVertexBuffer calloc() {
        return wrap(BGFXTransientVertexBuffer.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXTransientVertexBuffer} instance allocated with {@link BufferUtils}. */
    public static BGFXTransientVertexBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXTransientVertexBuffer.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXTransientVertexBuffer} instance for the specified memory address. */
    public static BGFXTransientVertexBuffer create(long address) {
        return wrap(BGFXTransientVertexBuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXTransientVertexBuffer createSafe(long address) {
        return address == NULL ? null : wrap(BGFXTransientVertexBuffer.class, address);
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransientVertexBuffer.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransientVertexBuffer.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransientVertexBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BGFXTransientVertexBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXTransientVertexBuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXTransientVertexBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransientVertexBuffer mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransientVertexBuffer callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransientVertexBuffer mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransientVertexBuffer callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransientVertexBuffer.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransientVertexBuffer.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransientVertexBuffer.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransientVertexBuffer.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code BGFXTransientVertexBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTransientVertexBuffer malloc(MemoryStack stack) {
        return wrap(BGFXTransientVertexBuffer.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXTransientVertexBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTransientVertexBuffer calloc(MemoryStack stack) {
        return wrap(BGFXTransientVertexBuffer.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXTransientVertexBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientVertexBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXTransientVertexBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + BGFXTransientVertexBuffer.DATA), nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + BGFXTransientVertexBuffer.SIZE); }
    /** Unsafe version of {@link #startVertex}. */
    public static int nstartVertex(long struct) { return UNSAFE.getInt(null, struct + BGFXTransientVertexBuffer.STARTVERTEX); }
    /** Unsafe version of {@link #stride}. */
    public static short nstride(long struct) { return UNSAFE.getShort(null, struct + BGFXTransientVertexBuffer.STRIDE); }
    /** Unsafe version of {@link #handle}. */
    public static short nhandle(long struct) { return UNSAFE.getShort(null, struct + BGFXTransientVertexBuffer.HANDLE); }
    /** Unsafe version of {@link #layoutHandle}. */
    public static short nlayoutHandle(long struct) { return UNSAFE.getShort(null, struct + BGFXTransientVertexBuffer.LAYOUTHANDLE); }

    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + BGFXTransientVertexBuffer.DATA, memAddress(value)); nsize(struct, value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + BGFXTransientVertexBuffer.SIZE, value); }
    /** Unsafe version of {@link #startVertex(int) startVertex}. */
    public static void nstartVertex(long struct, int value) { UNSAFE.putInt(null, struct + BGFXTransientVertexBuffer.STARTVERTEX, value); }
    /** Unsafe version of {@link #stride(short) stride}. */
    public static void nstride(long struct, short value) { UNSAFE.putShort(null, struct + BGFXTransientVertexBuffer.STRIDE, value); }
    /** Unsafe version of {@link #handle(short) handle}. */
    public static void nhandle(long struct, short value) { UNSAFE.putShort(null, struct + BGFXTransientVertexBuffer.HANDLE, value); }
    /** Unsafe version of {@link #layoutHandle(short) layoutHandle}. */
    public static void nlayoutHandle(long struct, short value) { UNSAFE.putShort(null, struct + BGFXTransientVertexBuffer.LAYOUTHANDLE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + BGFXTransientVertexBuffer.DATA));
    }

    // -----------------------------------

    /** An array of {@link BGFXTransientVertexBuffer} structs. */
    public static class Buffer extends StructBuffer<BGFXTransientVertexBuffer, Buffer> implements NativeResource {

        private static final BGFXTransientVertexBuffer ELEMENT_FACTORY = BGFXTransientVertexBuffer.create(-1L);

        /**
         * Creates a new {@code BGFXTransientVertexBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXTransientVertexBuffer#SIZEOF}, and its mark will be undefined.
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
        protected BGFXTransientVertexBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link BGFXTransientVertexBuffer#data} field. */
        @NativeType("uint8_t *")
        public ByteBuffer data() { return BGFXTransientVertexBuffer.ndata(address()); }
        /** @return the value of the {@link BGFXTransientVertexBuffer#size} field. */
        @NativeType("uint32_t")
        public int size() { return BGFXTransientVertexBuffer.nsize(address()); }
        /** @return the value of the {@link BGFXTransientVertexBuffer#startVertex} field. */
        @NativeType("uint32_t")
        public int startVertex() { return BGFXTransientVertexBuffer.nstartVertex(address()); }
        /** @return the value of the {@link BGFXTransientVertexBuffer#stride} field. */
        @NativeType("uint16_t")
        public short stride() { return BGFXTransientVertexBuffer.nstride(address()); }
        /** @return the value of the {@link BGFXTransientVertexBuffer#handle} field. */
        @NativeType("bgfx_vertex_buffer_handle_t")
        public short handle() { return BGFXTransientVertexBuffer.nhandle(address()); }
        /** @return the value of the {@link BGFXTransientVertexBuffer#layoutHandle} field. */
        @NativeType("bgfx_vertex_layout_handle_t")
        public short layoutHandle() { return BGFXTransientVertexBuffer.nlayoutHandle(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@link BGFXTransientVertexBuffer#data} field. */
        public BGFXTransientVertexBuffer.Buffer data(@NativeType("uint8_t *") ByteBuffer value) { BGFXTransientVertexBuffer.ndata(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXTransientVertexBuffer#startVertex} field. */
        public BGFXTransientVertexBuffer.Buffer startVertex(@NativeType("uint32_t") int value) { BGFXTransientVertexBuffer.nstartVertex(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXTransientVertexBuffer#stride} field. */
        public BGFXTransientVertexBuffer.Buffer stride(@NativeType("uint16_t") short value) { BGFXTransientVertexBuffer.nstride(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXTransientVertexBuffer#handle} field. */
        public BGFXTransientVertexBuffer.Buffer handle(@NativeType("bgfx_vertex_buffer_handle_t") short value) { BGFXTransientVertexBuffer.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXTransientVertexBuffer#layoutHandle} field. */
        public BGFXTransientVertexBuffer.Buffer layoutHandle(@NativeType("bgfx_vertex_layout_handle_t") short value) { BGFXTransientVertexBuffer.nlayoutHandle(address(), value); return this; }

    }

}