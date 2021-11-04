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
 * Transient index buffer.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_transient_index_buffer_t {
 *     uint8_t * {@link #data};
 *     uint32_t {@link #size};
 *     uint32_t {@link #startIndex};
 *     bgfx_index_buffer_handle_t {@link #handle};
 *     bool {@link #isIndex16};
 * }</code></pre>
 */
@NativeType("struct bgfx_transient_index_buffer_t")
public class BGFXTransientIndexBuffer extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DATA,
        SIZE,
        STARTINDEX,
        HANDLE,
        ISINDEX16;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(2),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DATA = layout.offsetof(0);
        SIZE = layout.offsetof(1);
        STARTINDEX = layout.offsetof(2);
        HANDLE = layout.offsetof(3);
        ISINDEX16 = layout.offsetof(4);
    }

    /**
     * Creates a {@code BGFXTransientIndexBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXTransientIndexBuffer(ByteBuffer container) {
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
    /** first index */
    @NativeType("uint32_t")
    public int startIndex() { return nstartIndex(address()); }
    /** index buffer handle */
    @NativeType("bgfx_index_buffer_handle_t")
    public short handle() { return nhandle(address()); }
    /** index buffer format is 16-bits if true, otherwise it is 32-bit */
    @NativeType("bool")
    public boolean isIndex16() { return nisIndex16(address()); }

    /** Sets the address of the specified {@link ByteBuffer} to the {@link #data} field. */
    public BGFXTransientIndexBuffer data(@NativeType("uint8_t *") ByteBuffer value) { ndata(address(), value); return this; }
    /** Sets the specified value to the {@link #startIndex} field. */
    public BGFXTransientIndexBuffer startIndex(@NativeType("uint32_t") int value) { nstartIndex(address(), value); return this; }
    /** Sets the specified value to the {@link #handle} field. */
    public BGFXTransientIndexBuffer handle(@NativeType("bgfx_index_buffer_handle_t") short value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@link #isIndex16} field. */
    public BGFXTransientIndexBuffer isIndex16(@NativeType("bool") boolean value) { nisIndex16(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXTransientIndexBuffer set(
        ByteBuffer data,
        int startIndex,
        short handle,
        boolean isIndex16
    ) {
        data(data);
        startIndex(startIndex);
        handle(handle);
        isIndex16(isIndex16);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXTransientIndexBuffer set(BGFXTransientIndexBuffer src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXTransientIndexBuffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXTransientIndexBuffer malloc() {
        return wrap(BGFXTransientIndexBuffer.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXTransientIndexBuffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXTransientIndexBuffer calloc() {
        return wrap(BGFXTransientIndexBuffer.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXTransientIndexBuffer} instance allocated with {@link BufferUtils}. */
    public static BGFXTransientIndexBuffer create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXTransientIndexBuffer.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXTransientIndexBuffer} instance for the specified memory address. */
    public static BGFXTransientIndexBuffer create(long address) {
        return wrap(BGFXTransientIndexBuffer.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXTransientIndexBuffer createSafe(long address) {
        return address == NULL ? null : wrap(BGFXTransientIndexBuffer.class, address);
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BGFXTransientIndexBuffer.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXTransientIndexBuffer.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransientIndexBuffer mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransientIndexBuffer callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransientIndexBuffer mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXTransientIndexBuffer callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransientIndexBuffer.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransientIndexBuffer.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransientIndexBuffer.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXTransientIndexBuffer.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code BGFXTransientIndexBuffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTransientIndexBuffer malloc(MemoryStack stack) {
        return wrap(BGFXTransientIndexBuffer.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXTransientIndexBuffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXTransientIndexBuffer calloc(MemoryStack stack) {
        return wrap(BGFXTransientIndexBuffer.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXTransientIndexBuffer.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXTransientIndexBuffer.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #data() data}. */
    public static ByteBuffer ndata(long struct) { return memByteBuffer(memGetAddress(struct + BGFXTransientIndexBuffer.DATA), nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return UNSAFE.getInt(null, struct + BGFXTransientIndexBuffer.SIZE); }
    /** Unsafe version of {@link #startIndex}. */
    public static int nstartIndex(long struct) { return UNSAFE.getInt(null, struct + BGFXTransientIndexBuffer.STARTINDEX); }
    /** Unsafe version of {@link #handle}. */
    public static short nhandle(long struct) { return UNSAFE.getShort(null, struct + BGFXTransientIndexBuffer.HANDLE); }
    /** Unsafe version of {@link #isIndex16}. */
    public static boolean nisIndex16(long struct) { return UNSAFE.getByte(null, struct + BGFXTransientIndexBuffer.ISINDEX16) != 0; }

    /** Unsafe version of {@link #data(ByteBuffer) data}. */
    public static void ndata(long struct, ByteBuffer value) { memPutAddress(struct + BGFXTransientIndexBuffer.DATA, memAddress(value)); nsize(struct, value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, int value) { UNSAFE.putInt(null, struct + BGFXTransientIndexBuffer.SIZE, value); }
    /** Unsafe version of {@link #startIndex(int) startIndex}. */
    public static void nstartIndex(long struct, int value) { UNSAFE.putInt(null, struct + BGFXTransientIndexBuffer.STARTINDEX, value); }
    /** Unsafe version of {@link #handle(short) handle}. */
    public static void nhandle(long struct, short value) { UNSAFE.putShort(null, struct + BGFXTransientIndexBuffer.HANDLE, value); }
    /** Unsafe version of {@link #isIndex16(boolean) isIndex16}. */
    public static void nisIndex16(long struct, boolean value) { UNSAFE.putByte(null, struct + BGFXTransientIndexBuffer.ISINDEX16, value ? (byte)1 : (byte)0); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + BGFXTransientIndexBuffer.DATA));
    }

    // -----------------------------------

    /** An array of {@link BGFXTransientIndexBuffer} structs. */
    public static class Buffer extends StructBuffer<BGFXTransientIndexBuffer, Buffer> implements NativeResource {

        private static final BGFXTransientIndexBuffer ELEMENT_FACTORY = BGFXTransientIndexBuffer.create(-1L);

        /**
         * Creates a new {@code BGFXTransientIndexBuffer.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXTransientIndexBuffer#SIZEOF}, and its mark will be undefined.
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
        protected BGFXTransientIndexBuffer getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link ByteBuffer} view of the data pointed to by the {@link BGFXTransientIndexBuffer#data} field. */
        @NativeType("uint8_t *")
        public ByteBuffer data() { return BGFXTransientIndexBuffer.ndata(address()); }
        /** @return the value of the {@link BGFXTransientIndexBuffer#size} field. */
        @NativeType("uint32_t")
        public int size() { return BGFXTransientIndexBuffer.nsize(address()); }
        /** @return the value of the {@link BGFXTransientIndexBuffer#startIndex} field. */
        @NativeType("uint32_t")
        public int startIndex() { return BGFXTransientIndexBuffer.nstartIndex(address()); }
        /** @return the value of the {@link BGFXTransientIndexBuffer#handle} field. */
        @NativeType("bgfx_index_buffer_handle_t")
        public short handle() { return BGFXTransientIndexBuffer.nhandle(address()); }
        /** @return the value of the {@link BGFXTransientIndexBuffer#isIndex16} field. */
        @NativeType("bool")
        public boolean isIndex16() { return BGFXTransientIndexBuffer.nisIndex16(address()); }

        /** Sets the address of the specified {@link ByteBuffer} to the {@link BGFXTransientIndexBuffer#data} field. */
        public BGFXTransientIndexBuffer.Buffer data(@NativeType("uint8_t *") ByteBuffer value) { BGFXTransientIndexBuffer.ndata(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXTransientIndexBuffer#startIndex} field. */
        public BGFXTransientIndexBuffer.Buffer startIndex(@NativeType("uint32_t") int value) { BGFXTransientIndexBuffer.nstartIndex(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXTransientIndexBuffer#handle} field. */
        public BGFXTransientIndexBuffer.Buffer handle(@NativeType("bgfx_index_buffer_handle_t") short value) { BGFXTransientIndexBuffer.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXTransientIndexBuffer#isIndex16} field. */
        public BGFXTransientIndexBuffer.Buffer isIndex16(@NativeType("bool") boolean value) { BGFXTransientIndexBuffer.nisIndex16(address(), value); return this; }

    }

}