/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

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
 * struct IntersectionMaskCircle_t {
 *     float m_flCenterX;
 *     float m_flCenterY;
 *     float m_flRadius;
 * }</code></pre>
 */
@NativeType("struct IntersectionMaskCircle_t")
public class IntersectionMaskCircle extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_FLCENTERX,
        M_FLCENTERY,
        M_FLRADIUS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_FLCENTERX = layout.offsetof(0);
        M_FLCENTERY = layout.offsetof(1);
        M_FLRADIUS = layout.offsetof(2);
    }

    /**
     * Creates a {@code IntersectionMaskCircle} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public IntersectionMaskCircle(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code m_flCenterX} field. */
    public float m_flCenterX() { return nm_flCenterX(address()); }
    /** @return the value of the {@code m_flCenterY} field. */
    public float m_flCenterY() { return nm_flCenterY(address()); }
    /** @return the value of the {@code m_flRadius} field. */
    public float m_flRadius() { return nm_flRadius(address()); }

    /** Sets the specified value to the {@code m_flCenterX} field. */
    public IntersectionMaskCircle m_flCenterX(float value) { nm_flCenterX(address(), value); return this; }
    /** Sets the specified value to the {@code m_flCenterY} field. */
    public IntersectionMaskCircle m_flCenterY(float value) { nm_flCenterY(address(), value); return this; }
    /** Sets the specified value to the {@code m_flRadius} field. */
    public IntersectionMaskCircle m_flRadius(float value) { nm_flRadius(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public IntersectionMaskCircle set(
        float m_flCenterX,
        float m_flCenterY,
        float m_flRadius
    ) {
        m_flCenterX(m_flCenterX);
        m_flCenterY(m_flCenterY);
        m_flRadius(m_flRadius);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public IntersectionMaskCircle set(IntersectionMaskCircle src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code IntersectionMaskCircle} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static IntersectionMaskCircle malloc() {
        return wrap(IntersectionMaskCircle.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code IntersectionMaskCircle} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static IntersectionMaskCircle calloc() {
        return wrap(IntersectionMaskCircle.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code IntersectionMaskCircle} instance allocated with {@link BufferUtils}. */
    public static IntersectionMaskCircle create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(IntersectionMaskCircle.class, memAddress(container), container);
    }

    /** Returns a new {@code IntersectionMaskCircle} instance for the specified memory address. */
    public static IntersectionMaskCircle create(long address) {
        return wrap(IntersectionMaskCircle.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IntersectionMaskCircle createSafe(long address) {
        return address == NULL ? null : wrap(IntersectionMaskCircle.class, address);
    }

    /**
     * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskCircle.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskCircle.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskCircle.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link IntersectionMaskCircle.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskCircle.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static IntersectionMaskCircle.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskCircle mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskCircle callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskCircle mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskCircle callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskCircle.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskCircle.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskCircle.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static IntersectionMaskCircle.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code IntersectionMaskCircle} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static IntersectionMaskCircle malloc(MemoryStack stack) {
        return wrap(IntersectionMaskCircle.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code IntersectionMaskCircle} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static IntersectionMaskCircle calloc(MemoryStack stack) {
        return wrap(IntersectionMaskCircle.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskCircle.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link IntersectionMaskCircle.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static IntersectionMaskCircle.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_flCenterX}. */
    public static float nm_flCenterX(long struct) { return UNSAFE.getFloat(null, struct + IntersectionMaskCircle.M_FLCENTERX); }
    /** Unsafe version of {@link #m_flCenterY}. */
    public static float nm_flCenterY(long struct) { return UNSAFE.getFloat(null, struct + IntersectionMaskCircle.M_FLCENTERY); }
    /** Unsafe version of {@link #m_flRadius}. */
    public static float nm_flRadius(long struct) { return UNSAFE.getFloat(null, struct + IntersectionMaskCircle.M_FLRADIUS); }

    /** Unsafe version of {@link #m_flCenterX(float) m_flCenterX}. */
    public static void nm_flCenterX(long struct, float value) { UNSAFE.putFloat(null, struct + IntersectionMaskCircle.M_FLCENTERX, value); }
    /** Unsafe version of {@link #m_flCenterY(float) m_flCenterY}. */
    public static void nm_flCenterY(long struct, float value) { UNSAFE.putFloat(null, struct + IntersectionMaskCircle.M_FLCENTERY, value); }
    /** Unsafe version of {@link #m_flRadius(float) m_flRadius}. */
    public static void nm_flRadius(long struct, float value) { UNSAFE.putFloat(null, struct + IntersectionMaskCircle.M_FLRADIUS, value); }

    // -----------------------------------

    /** An array of {@link IntersectionMaskCircle} structs. */
    public static class Buffer extends StructBuffer<IntersectionMaskCircle, Buffer> implements NativeResource {

        private static final IntersectionMaskCircle ELEMENT_FACTORY = IntersectionMaskCircle.create(-1L);

        /**
         * Creates a new {@code IntersectionMaskCircle.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link IntersectionMaskCircle#SIZEOF}, and its mark will be undefined.
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
        protected IntersectionMaskCircle getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code m_flCenterX} field. */
        public float m_flCenterX() { return IntersectionMaskCircle.nm_flCenterX(address()); }
        /** @return the value of the {@code m_flCenterY} field. */
        public float m_flCenterY() { return IntersectionMaskCircle.nm_flCenterY(address()); }
        /** @return the value of the {@code m_flRadius} field. */
        public float m_flRadius() { return IntersectionMaskCircle.nm_flRadius(address()); }

        /** Sets the specified value to the {@code m_flCenterX} field. */
        public IntersectionMaskCircle.Buffer m_flCenterX(float value) { IntersectionMaskCircle.nm_flCenterX(address(), value); return this; }
        /** Sets the specified value to the {@code m_flCenterY} field. */
        public IntersectionMaskCircle.Buffer m_flCenterY(float value) { IntersectionMaskCircle.nm_flCenterY(address(), value); return this; }
        /** Sets the specified value to the {@code m_flRadius} field. */
        public IntersectionMaskCircle.Buffer m_flRadius(float value) { IntersectionMaskCircle.nm_flRadius(address(), value); return this; }

    }

}