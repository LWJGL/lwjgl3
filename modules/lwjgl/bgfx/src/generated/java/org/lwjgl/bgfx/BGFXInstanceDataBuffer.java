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
 * Instance data buffer info.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_instance_data_buffer_t {
 *     uint8_t * {@link #data};
 *     uint32_t {@link #size};
 *     uint32_t {@link #offset};
 *     uint32_t {@link #num};
 *     uint16_t {@link #stride};
 *     bgfx_vertex_buffer_handle_t {@link #handle};
 * }</code></pre>
 */
@NativeType("struct bgfx_instance_data_buffer_t")
public class BGFXInstanceDataBuffer extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA,
        SIZE,
        OFFSET,
        NUM,
        STRIDE,
        HANDLE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        OFFSET = layout.offsetof(2);
        NUM = layout.offsetof(3);
        STRIDE = layout.offsetof(4);
        HANDLE = layout.offsetof(5);
    }

    /**
     * Creates a {@code BGFXInstanceDataBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXInstanceDataBuffer(ByteBuffer container) {
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
    /** offset in vertex buffer */
    @NativeType("uint32_t")
    public int offset() { return noffset(address()); }
    /** number of instances */
    @NativeType("uint32_t")
    public int num() { return nnum(address()); }
    /** vertex stride */
    @NativeType("uint16_t")
    public short stride() { return nstride(address()); }
    /** vertex buffer object handle */
    @NativeType("bgfx_vertex_buffer_handle_t")
    public short handle() { return nhandle(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@link #data} field. */
    public BGFXInstanceDataBuffer data(@NativeType("uint8_t *") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@link #offset} field. */
    public BGFXInstanceDataBuffer offset(@NativeType("uint32_t") int value) { noffset(address(), value); return this; }
    /** Sets the specified value to the {@link #num} field. */
    public BGFXInstanceDataBuffer num(@NativeType("uint32_t") int value) { nnum(address(), value); return this; }
    /** Sets the specified value to the {@link #stride} field. */
    public BGFXInstanceDataBuffer stride(@NativeType("uint16_t") short value) { nstride(address(), value); return this; }
    /** Sets the specified value to the {@link #handle} field. */
    public BGFXInstanceDataBuffer handle(@NativeType("bgfx_vertex_buffer_handle_t") short value) { nhandle(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXInstanceDataBuffer set(
        ByteBuffer data,
        int offset,
        int num,
        short stride,
        short handle
    ) {
        data(data);
        offset(offset);
        num(num);
        stride(stride);
        handle(handle);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXInstanceDataBuffer set(BGFXInstanceDataBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXInstanceDataBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXInstanceDataBuffer malloc() {
        return wrap(BGFXInstanceDataBuffer.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXInstanceDataBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXInstanceDataBuffer calloc() {
        return wrap(BGFXInstanceDataBuffer.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXInstanceDataBuffer} instance allocated with {@link BufferUtils}. */
    public static BGFXInstanceDataBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXInstanceDataBuffer.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXInstanceDataBuffer} instance for the specified memory address. */
    public static BGFXInstanceDataBuffer create(long address) {
        return wrap(BGFXInstanceDataBuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXInstanceDataBuffer createSafe(long address) {
        return address == NULL ? null : wrap(BGFXInstanceDataBuffer.class, address);
    }

    /**
     * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXInstanceDataBuffer.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXInstanceDataBuffer.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXInstanceDataBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BGFXInstanceDataBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXInstanceDataBuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXInstanceDataBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXInstanceDataBuffer mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXInstanceDataBuffer callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXInstanceDataBuffer mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXInstanceDataBuffer callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXInstanceDataBuffer.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXInstanceDataBuffer.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXInstanceDataBuffer.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXInstanceDataBuffer.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code BGFXInstanceDataBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXInstanceDataBuffer malloc(MemoryStack stack) {
        return wrap(BGFXInstanceDataBuffer.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXInstanceDataBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXInstanceDataBuffer calloc(MemoryStack stack) {
        return wrap(BGFXInstanceDataBuffer.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXInstanceDataBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXInstanceDataBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXInstanceDataBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + BGFXInstanceDataBuffer.DATA), nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + BGFXInstanceDataBuffer.SIZE); }
    /** Unsafe version of {@link #offset}. */
    public static int noffset(long struct) { return UNSAFE.getInt(null, struct + BGFXInstanceDataBuffer.OFFSET); }
    /** Unsafe version of {@link #num}. */
    public static int nnum(long struct) { return UNSAFE.getInt(null, struct + BGFXInstanceDataBuffer.NUM); }
    /** Unsafe version of {@link #stride}. */
    public static short nstride(long struct) { return UNSAFE.getShort(null, struct + BGFXInstanceDataBuffer.STRIDE); }
    /** Unsafe version of {@link #handle}. */
    public static short nhandle(long struct) { return UNSAFE.getShort(null, struct + BGFXInstanceDataBuffer.HANDLE); }

    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + BGFXInstanceDataBuffer.DATA, memAddress(value)); nsize(struct, value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + BGFXInstanceDataBuffer.SIZE, value); }
    /** Unsafe version of {@link #offset(int) offset}. */
    public static void noffset(long struct, int value) { UNSAFE.putInt(null, struct + BGFXInstanceDataBuffer.OFFSET, value); }
    /** Unsafe version of {@link #num(int) num}. */
    public static void nnum(long struct, int value) { UNSAFE.putInt(null, struct + BGFXInstanceDataBuffer.NUM, value); }
    /** Unsafe version of {@link #stride(short) stride}. */
    public static void nstride(long struct, short value) { UNSAFE.putShort(null, struct + BGFXInstanceDataBuffer.STRIDE, value); }
    /** Unsafe version of {@link #handle(short) handle}. */
    public static void nhandle(long struct, short value) { UNSAFE.putShort(null, struct + BGFXInstanceDataBuffer.HANDLE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + BGFXInstanceDataBuffer.DATA));
    }

    // -----------------------------------

    /** An array of {@link BGFXInstanceDataBuffer} structs. */
    public static class Buffer extends StructBuffer<BGFXInstanceDataBuffer, Buffer> implements NativeResource {

        private static final BGFXInstanceDataBuffer ELEMENT_FACTORY = BGFXInstanceDataBuffer.create(-1L);

        /**
         * Creates a new {@code BGFXInstanceDataBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXInstanceDataBuffer#SIZEOF}, and its mark will be undefined.
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
        protected BGFXInstanceDataBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link BGFXInstanceDataBuffer#data} field. */
        @NativeType("uint8_t *")
        public ByteBuffer data() { return BGFXInstanceDataBuffer.ndata(address()); }
        /** @return the value of the {@link BGFXInstanceDataBuffer#size} field. */
        @NativeType("uint32_t")
        public int size() { return BGFXInstanceDataBuffer.nsize(address()); }
        /** @return the value of the {@link BGFXInstanceDataBuffer#offset} field. */
        @NativeType("uint32_t")
        public int offset() { return BGFXInstanceDataBuffer.noffset(address()); }
        /** @return the value of the {@link BGFXInstanceDataBuffer#num} field. */
        @NativeType("uint32_t")
        public int num() { return BGFXInstanceDataBuffer.nnum(address()); }
        /** @return the value of the {@link BGFXInstanceDataBuffer#stride} field. */
        @NativeType("uint16_t")
        public short stride() { return BGFXInstanceDataBuffer.nstride(address()); }
        /** @return the value of the {@link BGFXInstanceDataBuffer#handle} field. */
        @NativeType("bgfx_vertex_buffer_handle_t")
        public short handle() { return BGFXInstanceDataBuffer.nhandle(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@link BGFXInstanceDataBuffer#data} field. */
        public BGFXInstanceDataBuffer.Buffer data(@NativeType("uint8_t *") ByteBuffer value) { BGFXInstanceDataBuffer.ndata(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXInstanceDataBuffer#offset} field. */
        public BGFXInstanceDataBuffer.Buffer offset(@NativeType("uint32_t") int value) { BGFXInstanceDataBuffer.noffset(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXInstanceDataBuffer#num} field. */
        public BGFXInstanceDataBuffer.Buffer num(@NativeType("uint32_t") int value) { BGFXInstanceDataBuffer.nnum(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXInstanceDataBuffer#stride} field. */
        public BGFXInstanceDataBuffer.Buffer stride(@NativeType("uint16_t") short value) { BGFXInstanceDataBuffer.nstride(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXInstanceDataBuffer#handle} field. */
        public BGFXInstanceDataBuffer.Buffer handle(@NativeType("bgfx_vertex_buffer_handle_t") short value) { BGFXInstanceDataBuffer.nhandle(address(), value); return this; }

    }

}