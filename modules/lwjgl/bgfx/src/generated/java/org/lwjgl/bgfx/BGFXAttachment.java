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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Frame buffer texture attachment info.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code handle} &ndash; texture handle</li>
 * <li>{@code mip} &ndash; mip level</li>
 * <li>{@code layer} &ndash; cubemap side or depth layer/slice</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_attachment_t {
 *     bgfx_texture_handle_t handle;
 *     uint16_t mip;
 *     uint16_t layer;
 * }</pre></code>
 */
@NativeType("struct bgfx_attachment_t")
public class BGFXAttachment extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        MIP,
        LAYER;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        MIP = layout.offsetof(1);
        LAYER = layout.offsetof(2);
    }

    BGFXAttachment(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXAttachment} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXAttachment(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code handle} field. */
    @NativeType("bgfx_texture_handle_t")
    public short handle() { return nhandle(address()); }
    /** Returns the value of the {@code mip} field. */
    @NativeType("uint16_t")
    public short mip() { return nmip(address()); }
    /** Returns the value of the {@code layer} field. */
    @NativeType("uint16_t")
    public short layer() { return nlayer(address()); }

    /** Sets the specified value to the {@code handle} field. */
    public BGFXAttachment handle(@NativeType("bgfx_texture_handle_t") short value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@code mip} field. */
    public BGFXAttachment mip(@NativeType("uint16_t") short value) { nmip(address(), value); return this; }
    /** Sets the specified value to the {@code layer} field. */
    public BGFXAttachment layer(@NativeType("uint16_t") short value) { nlayer(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXAttachment set(
        short handle,
        short mip,
        short layer
    ) {
        handle(handle);
        mip(mip);
        layer(layer);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXAttachment set(BGFXAttachment src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link BGFXAttachment} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXAttachment malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link BGFXAttachment} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXAttachment calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link BGFXAttachment} instance allocated with {@link BufferUtils}. */
    public static BGFXAttachment create() {
        return new BGFXAttachment(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link BGFXAttachment} instance for the specified memory address. */
    public static BGFXAttachment create(long address) {
        return new BGFXAttachment(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXAttachment createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link BGFXAttachment.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXAttachment.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link BGFXAttachment} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXAttachment mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link BGFXAttachment} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXAttachment callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link BGFXAttachment} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAttachment mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXAttachment} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAttachment callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static short nhandle(long struct) { return memGetShort(struct + BGFXAttachment.HANDLE); }
    /** Unsafe version of {@link #mip}. */
    public static short nmip(long struct) { return memGetShort(struct + BGFXAttachment.MIP); }
    /** Unsafe version of {@link #layer}. */
    public static short nlayer(long struct) { return memGetShort(struct + BGFXAttachment.LAYER); }

    /** Unsafe version of {@link #handle(short) handle}. */
    public static void nhandle(long struct, short value) { memPutShort(struct + BGFXAttachment.HANDLE, value); }
    /** Unsafe version of {@link #mip(short) mip}. */
    public static void nmip(long struct, short value) { memPutShort(struct + BGFXAttachment.MIP, value); }
    /** Unsafe version of {@link #layer(short) layer}. */
    public static void nlayer(long struct, short value) { memPutShort(struct + BGFXAttachment.LAYER, value); }

    // -----------------------------------

    /** An array of {@link BGFXAttachment} structs. */
    public static class Buffer extends StructBuffer<BGFXAttachment, Buffer> implements NativeResource {

        /**
         * Creates a new {@link BGFXAttachment.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXAttachment#SIZEOF}, and its mark will be undefined.
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
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected BGFXAttachment newInstance(long address) {
            return new BGFXAttachment(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code handle} field. */
        @NativeType("bgfx_texture_handle_t")
        public short handle() { return BGFXAttachment.nhandle(address()); }
        /** Returns the value of the {@code mip} field. */
        @NativeType("uint16_t")
        public short mip() { return BGFXAttachment.nmip(address()); }
        /** Returns the value of the {@code layer} field. */
        @NativeType("uint16_t")
        public short layer() { return BGFXAttachment.nlayer(address()); }

        /** Sets the specified value to the {@code handle} field. */
        public BGFXAttachment.Buffer handle(@NativeType("bgfx_texture_handle_t") short value) { BGFXAttachment.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@code mip} field. */
        public BGFXAttachment.Buffer mip(@NativeType("uint16_t") short value) { BGFXAttachment.nmip(address(), value); return this; }
        /** Sets the specified value to the {@code layer} field. */
        public BGFXAttachment.Buffer layer(@NativeType("uint16_t") short value) { BGFXAttachment.nlayer(address(), value); return this; }

    }

}