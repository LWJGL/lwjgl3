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
 * Defines the project used in an overlay that is using {@link VROverlay#VROverlay_SetOverlayTransformProjection SetOverlayTransformProjection}.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VROverlayProjection_t {
 *     float {@link #fLeft};
 *     float {@link #fRight};
 *     float {@link #fTop};
 *     float {@link #fBottom};
 * }</code></pre>
 */
@NativeType("struct VROverlayProjection_t")
public class VROverlayProjection extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLEFT,
        FRIGHT,
        FTOP,
        FBOTTOM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLEFT = layout.offsetof(0);
        FRIGHT = layout.offsetof(1);
        FTOP = layout.offsetof(2);
        FBOTTOM = layout.offsetof(3);
    }

    /**
     * Creates a {@code VROverlayProjection} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VROverlayProjection(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** tangent of the left side of the frustum */
    public float fLeft() { return nfLeft(address()); }
    /** tangent of the right side of the frustum */
    public float fRight() { return nfRight(address()); }
    /** tangent of the top side of the frustum */
    public float fTop() { return nfTop(address()); }
    /** tangent of the bottom side of the frustum */
    public float fBottom() { return nfBottom(address()); }

    /** Sets the specified value to the {@link #fLeft} field. */
    public VROverlayProjection fLeft(float value) { nfLeft(address(), value); return this; }
    /** Sets the specified value to the {@link #fRight} field. */
    public VROverlayProjection fRight(float value) { nfRight(address(), value); return this; }
    /** Sets the specified value to the {@link #fTop} field. */
    public VROverlayProjection fTop(float value) { nfTop(address(), value); return this; }
    /** Sets the specified value to the {@link #fBottom} field. */
    public VROverlayProjection fBottom(float value) { nfBottom(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VROverlayProjection set(
        float fLeft,
        float fRight,
        float fTop,
        float fBottom
    ) {
        fLeft(fLeft);
        fRight(fRight);
        fTop(fTop);
        fBottom(fBottom);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VROverlayProjection set(VROverlayProjection src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VROverlayProjection} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VROverlayProjection malloc() {
        return wrap(VROverlayProjection.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VROverlayProjection} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VROverlayProjection calloc() {
        return wrap(VROverlayProjection.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VROverlayProjection} instance allocated with {@link BufferUtils}. */
    public static VROverlayProjection create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VROverlayProjection.class, memAddress(container), container);
    }

    /** Returns a new {@code VROverlayProjection} instance for the specified memory address. */
    public static VROverlayProjection create(long address) {
        return wrap(VROverlayProjection.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayProjection createSafe(long address) {
        return address == NULL ? null : wrap(VROverlayProjection.class, address);
    }

    /**
     * Returns a new {@link VROverlayProjection.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayProjection.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VROverlayProjection.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayProjection.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayProjection.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayProjection.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VROverlayProjection.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VROverlayProjection.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayProjection.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code VROverlayProjection} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayProjection malloc(MemoryStack stack) {
        return wrap(VROverlayProjection.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VROverlayProjection} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayProjection calloc(MemoryStack stack) {
        return wrap(VROverlayProjection.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VROverlayProjection.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayProjection.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayProjection.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayProjection.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #fLeft}. */
    public static float nfLeft(long struct) { return UNSAFE.getFloat(null, struct + VROverlayProjection.FLEFT); }
    /** Unsafe version of {@link #fRight}. */
    public static float nfRight(long struct) { return UNSAFE.getFloat(null, struct + VROverlayProjection.FRIGHT); }
    /** Unsafe version of {@link #fTop}. */
    public static float nfTop(long struct) { return UNSAFE.getFloat(null, struct + VROverlayProjection.FTOP); }
    /** Unsafe version of {@link #fBottom}. */
    public static float nfBottom(long struct) { return UNSAFE.getFloat(null, struct + VROverlayProjection.FBOTTOM); }

    /** Unsafe version of {@link #fLeft(float) fLeft}. */
    public static void nfLeft(long struct, float value) { UNSAFE.putFloat(null, struct + VROverlayProjection.FLEFT, value); }
    /** Unsafe version of {@link #fRight(float) fRight}. */
    public static void nfRight(long struct, float value) { UNSAFE.putFloat(null, struct + VROverlayProjection.FRIGHT, value); }
    /** Unsafe version of {@link #fTop(float) fTop}. */
    public static void nfTop(long struct, float value) { UNSAFE.putFloat(null, struct + VROverlayProjection.FTOP, value); }
    /** Unsafe version of {@link #fBottom(float) fBottom}. */
    public static void nfBottom(long struct, float value) { UNSAFE.putFloat(null, struct + VROverlayProjection.FBOTTOM, value); }

    // -----------------------------------

    /** An array of {@link VROverlayProjection} structs. */
    public static class Buffer extends StructBuffer<VROverlayProjection, Buffer> implements NativeResource {

        private static final VROverlayProjection ELEMENT_FACTORY = VROverlayProjection.create(-1L);

        /**
         * Creates a new {@code VROverlayProjection.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VROverlayProjection#SIZEOF}, and its mark will be undefined.
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
        protected VROverlayProjection getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link VROverlayProjection#fLeft} field. */
        public float fLeft() { return VROverlayProjection.nfLeft(address()); }
        /** @return the value of the {@link VROverlayProjection#fRight} field. */
        public float fRight() { return VROverlayProjection.nfRight(address()); }
        /** @return the value of the {@link VROverlayProjection#fTop} field. */
        public float fTop() { return VROverlayProjection.nfTop(address()); }
        /** @return the value of the {@link VROverlayProjection#fBottom} field. */
        public float fBottom() { return VROverlayProjection.nfBottom(address()); }

        /** Sets the specified value to the {@link VROverlayProjection#fLeft} field. */
        public VROverlayProjection.Buffer fLeft(float value) { VROverlayProjection.nfLeft(address(), value); return this; }
        /** Sets the specified value to the {@link VROverlayProjection#fRight} field. */
        public VROverlayProjection.Buffer fRight(float value) { VROverlayProjection.nfRight(address(), value); return this; }
        /** Sets the specified value to the {@link VROverlayProjection#fTop} field. */
        public VROverlayProjection.Buffer fTop(float value) { VROverlayProjection.nfTop(address(), value); return this; }
        /** Sets the specified value to the {@link VROverlayProjection#fBottom} field. */
        public VROverlayProjection.Buffer fBottom(float value) { VROverlayProjection.nfBottom(address(), value); return this; }

    }

}