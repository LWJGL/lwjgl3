/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

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
 * struct IntersectionMaskRectangle_t {
 *     float m_flTopLeftX;
 *     float m_flTopLeftY;
 *     float m_flWidth;
 *     float m_flHeight;
 * }</code></pre>
 */
@NativeType("struct IntersectionMaskRectangle_t")
public class IntersectionMaskRectangle extends Struct<IntersectionMaskRectangle> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_FLTOPLEFTX,
        M_FLTOPLEFTY,
        M_FLWIDTH,
        M_FLHEIGHT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_FLTOPLEFTX = layout.offsetof(0);
        M_FLTOPLEFTY = layout.offsetof(1);
        M_FLWIDTH = layout.offsetof(2);
        M_FLHEIGHT = layout.offsetof(3);
    }

    protected IntersectionMaskRectangle(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected IntersectionMaskRectangle create(long address, @Nullable ByteBuffer container) {
        return new IntersectionMaskRectangle(address, container);
    }

    /**
     * Creates a {@code IntersectionMaskRectangle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IntersectionMaskRectangle(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code m_flTopLeftX} field. */
    public float m_flTopLeftX() { return nm_flTopLeftX(address()); }
    /** @return the value of the {@code m_flTopLeftY} field. */
    public float m_flTopLeftY() { return nm_flTopLeftY(address()); }
    /** @return the value of the {@code m_flWidth} field. */
    public float m_flWidth() { return nm_flWidth(address()); }
    /** @return the value of the {@code m_flHeight} field. */
    public float m_flHeight() { return nm_flHeight(address()); }

    /** Sets the specified value to the {@code m_flTopLeftX} field. */
    public IntersectionMaskRectangle m_flTopLeftX(float value) { nm_flTopLeftX(address(), value); return this; }
    /** Sets the specified value to the {@code m_flTopLeftY} field. */
    public IntersectionMaskRectangle m_flTopLeftY(float value) { nm_flTopLeftY(address(), value); return this; }
    /** Sets the specified value to the {@code m_flWidth} field. */
    public IntersectionMaskRectangle m_flWidth(float value) { nm_flWidth(address(), value); return this; }
    /** Sets the specified value to the {@code m_flHeight} field. */
    public IntersectionMaskRectangle m_flHeight(float value) { nm_flHeight(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IntersectionMaskRectangle set(
        float m_flTopLeftX,
        float m_flTopLeftY,
        float m_flWidth,
        float m_flHeight
    ) {
        m_flTopLeftX(m_flTopLeftX);
        m_flTopLeftY(m_flTopLeftY);
        m_flWidth(m_flWidth);
        m_flHeight(m_flHeight);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IntersectionMaskRectangle set(IntersectionMaskRectangle src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IntersectionMaskRectangle} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IntersectionMaskRectangle malloc() {
        return new IntersectionMaskRectangle(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code IntersectionMaskRectangle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IntersectionMaskRectangle calloc() {
        return new IntersectionMaskRectangle(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code IntersectionMaskRectangle} instance allocated with {@link BufferUtils}. */
    public static IntersectionMaskRectangle create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IntersectionMaskRectangle(memAddress(container), container);
    }

    /** Returns a new {@code IntersectionMaskRectangle} instance for the specified memory address. */
    public static IntersectionMaskRectangle create(long address) {
        return new IntersectionMaskRectangle(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable IntersectionMaskRectangle createSafe(long address) {
        return address == NULL ? null : new IntersectionMaskRectangle(address, null);
    }

    /**
     * Returns a new {@link IntersectionMaskRectangle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskRectangle.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IntersectionMaskRectangle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskRectangle.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IntersectionMaskRectangle.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskRectangle.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link IntersectionMaskRectangle.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskRectangle.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static IntersectionMaskRectangle.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskRectangle mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskRectangle callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskRectangle mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskRectangle callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskRectangle.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskRectangle.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskRectangle.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskRectangle.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code IntersectionMaskRectangle} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IntersectionMaskRectangle malloc(MemoryStack stack) {
        return new IntersectionMaskRectangle(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code IntersectionMaskRectangle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IntersectionMaskRectangle calloc(MemoryStack stack) {
        return new IntersectionMaskRectangle(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link IntersectionMaskRectangle.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskRectangle.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IntersectionMaskRectangle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskRectangle.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_flTopLeftX}. */
    public static float nm_flTopLeftX(long struct) { return memGetFloat(struct + IntersectionMaskRectangle.M_FLTOPLEFTX); }
    /** Unsafe version of {@link #m_flTopLeftY}. */
    public static float nm_flTopLeftY(long struct) { return memGetFloat(struct + IntersectionMaskRectangle.M_FLTOPLEFTY); }
    /** Unsafe version of {@link #m_flWidth}. */
    public static float nm_flWidth(long struct) { return memGetFloat(struct + IntersectionMaskRectangle.M_FLWIDTH); }
    /** Unsafe version of {@link #m_flHeight}. */
    public static float nm_flHeight(long struct) { return memGetFloat(struct + IntersectionMaskRectangle.M_FLHEIGHT); }

    /** Unsafe version of {@link #m_flTopLeftX(float) m_flTopLeftX}. */
    public static void nm_flTopLeftX(long struct, float value) { memPutFloat(struct + IntersectionMaskRectangle.M_FLTOPLEFTX, value); }
    /** Unsafe version of {@link #m_flTopLeftY(float) m_flTopLeftY}. */
    public static void nm_flTopLeftY(long struct, float value) { memPutFloat(struct + IntersectionMaskRectangle.M_FLTOPLEFTY, value); }
    /** Unsafe version of {@link #m_flWidth(float) m_flWidth}. */
    public static void nm_flWidth(long struct, float value) { memPutFloat(struct + IntersectionMaskRectangle.M_FLWIDTH, value); }
    /** Unsafe version of {@link #m_flHeight(float) m_flHeight}. */
    public static void nm_flHeight(long struct, float value) { memPutFloat(struct + IntersectionMaskRectangle.M_FLHEIGHT, value); }

    // -----------------------------------

    /** An array of {@link IntersectionMaskRectangle} structs. */
    public static class Buffer extends StructBuffer<IntersectionMaskRectangle, Buffer> implements NativeResource {

        private static final IntersectionMaskRectangle ELEMENT_FACTORY = IntersectionMaskRectangle.create(-1L);

        /**
         * Creates a new {@code IntersectionMaskRectangle.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IntersectionMaskRectangle#SIZEOF}, and its mark will be undefined.</p>
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
        protected IntersectionMaskRectangle getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code m_flTopLeftX} field. */
        public float m_flTopLeftX() { return IntersectionMaskRectangle.nm_flTopLeftX(address()); }
        /** @return the value of the {@code m_flTopLeftY} field. */
        public float m_flTopLeftY() { return IntersectionMaskRectangle.nm_flTopLeftY(address()); }
        /** @return the value of the {@code m_flWidth} field. */
        public float m_flWidth() { return IntersectionMaskRectangle.nm_flWidth(address()); }
        /** @return the value of the {@code m_flHeight} field. */
        public float m_flHeight() { return IntersectionMaskRectangle.nm_flHeight(address()); }

        /** Sets the specified value to the {@code m_flTopLeftX} field. */
        public IntersectionMaskRectangle.Buffer m_flTopLeftX(float value) { IntersectionMaskRectangle.nm_flTopLeftX(address(), value); return this; }
        /** Sets the specified value to the {@code m_flTopLeftY} field. */
        public IntersectionMaskRectangle.Buffer m_flTopLeftY(float value) { IntersectionMaskRectangle.nm_flTopLeftY(address(), value); return this; }
        /** Sets the specified value to the {@code m_flWidth} field. */
        public IntersectionMaskRectangle.Buffer m_flWidth(float value) { IntersectionMaskRectangle.nm_flWidth(address(), value); return this; }
        /** Sets the specified value to the {@code m_flHeight} field. */
        public IntersectionMaskRectangle.Buffer m_flHeight(float value) { IntersectionMaskRectangle.nm_flHeight(address(), value); return this; }

    }

}