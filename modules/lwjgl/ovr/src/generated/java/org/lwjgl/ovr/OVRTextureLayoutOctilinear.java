/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Multiresolution descriptor for Octilinear.
 * 
 * <p>Usage of this layer must be successfully enabled via {@link OVR#ovr_EnableExtension EnableExtension} before it can be used.</p>
 * 
 * <p>Size of W quadrants:</p>
 * 
 * <pre><code>
 * SizeLeft + SizeRight &lt;= Viewport.Size.w
 * SizeUp   + sizeDown  &lt;= Viewport.Size.h
 * 
 * Clip space (0,0) is located at Viewport.Pos + (SizeLeft,SizeUp) where
 * Viewport is given in the layer description.
 * 
 * Viewport Top left
 * +-----------------------------------------------------+
 * |                        ^                       |    |
 * |                        |                       |    |
 * |           0          SizeUp         1          |    |
 * |                        |                       |&lt;--Portion of viewport
 * |                        |                       |   determined by sizes
 * |                        |                       |    |
 * |&lt;--------SizeLeft-------+-------SizeRight------&gt;|    |
 * |                        |                       |    |
 * |                        |                       |    |
 * |           2         SizeDown        3          |    |
 * |                        |                       |    |
 * |                        |                       |    |
 * |                        v                       |    |
 * +------------------------------------------------+    |
 * |                                                     |
 * +-----------------------------------------------------+
 *                                                       Viewport bottom right
 * 
 * For example, when rendering quadrant 0 its scissor rectangle will be
 * 
 *  Top    = 0
 *  Left   = 0
 *  Right  = SizeLeft
 *  Bottom = SizeUp
 * 
 * and the scissor rectangle for quadrant 1 will be:
 * 
 *  Top    = 0
 *  Left   = SizeLeft
 *  Right  = SizeLeft + SizeRight
 *  Bottom = SizeUp</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code WarpLeft} &ndash; left W warping</li>
 * <li>{@code WarpRight} &ndash; right W warping</li>
 * <li>{@code WarpUp} &ndash; up W warping</li>
 * <li>{@code WarpDown} &ndash; down W warping</li>
 * <li>{@code SizeLeft} &ndash; left W quadrant size</li>
 * <li>{@code SizeRight} &ndash; right W quadrant size</li>
 * <li>{@code SizeUp} &ndash; up W quadrant size</li>
 * <li>{@code SizeDown} &ndash; down W quadrant size</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct ovrTextureLayoutOctilinear {
 *     float WarpLeft;
 *     float WarpRight;
 *     float WarpUp;
 *     float WarpDown;
 *     float SizeLeft;
 *     float SizeRight;
 *     float SizeUp;
 *     float SizeDown;
 * }</code></pre>
 */
@NativeType("struct ovrTextureLayoutOctilinear")
public class OVRTextureLayoutOctilinear extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        WARPLEFT,
        WARPRIGHT,
        WARPUP,
        WARPDOWN,
        SIZELEFT,
        SIZERIGHT,
        SIZEUP,
        SIZEDOWN;

    static {
        Layout layout = __struct(
            DEFAULT_PACK_ALIGNMENT, POINTER_SIZE,
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        WARPLEFT = layout.offsetof(0);
        WARPRIGHT = layout.offsetof(1);
        WARPUP = layout.offsetof(2);
        WARPDOWN = layout.offsetof(3);
        SIZELEFT = layout.offsetof(4);
        SIZERIGHT = layout.offsetof(5);
        SIZEUP = layout.offsetof(6);
        SIZEDOWN = layout.offsetof(7);
    }

    /**
     * Creates a {@code OVRTextureLayoutOctilinear} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRTextureLayoutOctilinear(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code WarpLeft} field. */
    public float WarpLeft() { return nWarpLeft(address()); }
    /** Returns the value of the {@code WarpRight} field. */
    public float WarpRight() { return nWarpRight(address()); }
    /** Returns the value of the {@code WarpUp} field. */
    public float WarpUp() { return nWarpUp(address()); }
    /** Returns the value of the {@code WarpDown} field. */
    public float WarpDown() { return nWarpDown(address()); }
    /** Returns the value of the {@code SizeLeft} field. */
    public float SizeLeft() { return nSizeLeft(address()); }
    /** Returns the value of the {@code SizeRight} field. */
    public float SizeRight() { return nSizeRight(address()); }
    /** Returns the value of the {@code SizeUp} field. */
    public float SizeUp() { return nSizeUp(address()); }
    /** Returns the value of the {@code SizeDown} field. */
    public float SizeDown() { return nSizeDown(address()); }

    /** Sets the specified value to the {@code WarpLeft} field. */
    public OVRTextureLayoutOctilinear WarpLeft(float value) { nWarpLeft(address(), value); return this; }
    /** Sets the specified value to the {@code WarpRight} field. */
    public OVRTextureLayoutOctilinear WarpRight(float value) { nWarpRight(address(), value); return this; }
    /** Sets the specified value to the {@code WarpUp} field. */
    public OVRTextureLayoutOctilinear WarpUp(float value) { nWarpUp(address(), value); return this; }
    /** Sets the specified value to the {@code WarpDown} field. */
    public OVRTextureLayoutOctilinear WarpDown(float value) { nWarpDown(address(), value); return this; }
    /** Sets the specified value to the {@code SizeLeft} field. */
    public OVRTextureLayoutOctilinear SizeLeft(float value) { nSizeLeft(address(), value); return this; }
    /** Sets the specified value to the {@code SizeRight} field. */
    public OVRTextureLayoutOctilinear SizeRight(float value) { nSizeRight(address(), value); return this; }
    /** Sets the specified value to the {@code SizeUp} field. */
    public OVRTextureLayoutOctilinear SizeUp(float value) { nSizeUp(address(), value); return this; }
    /** Sets the specified value to the {@code SizeDown} field. */
    public OVRTextureLayoutOctilinear SizeDown(float value) { nSizeDown(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public OVRTextureLayoutOctilinear set(
        float WarpLeft,
        float WarpRight,
        float WarpUp,
        float WarpDown,
        float SizeLeft,
        float SizeRight,
        float SizeUp,
        float SizeDown
    ) {
        WarpLeft(WarpLeft);
        WarpRight(WarpRight);
        WarpUp(WarpUp);
        WarpDown(WarpDown);
        SizeLeft(SizeLeft);
        SizeRight(SizeRight);
        SizeUp(SizeUp);
        SizeDown(SizeDown);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public OVRTextureLayoutOctilinear set(OVRTextureLayoutOctilinear src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code OVRTextureLayoutOctilinear} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRTextureLayoutOctilinear malloc() {
        return wrap(OVRTextureLayoutOctilinear.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code OVRTextureLayoutOctilinear} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRTextureLayoutOctilinear calloc() {
        return wrap(OVRTextureLayoutOctilinear.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code OVRTextureLayoutOctilinear} instance allocated with {@link BufferUtils}. */
    public static OVRTextureLayoutOctilinear create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(OVRTextureLayoutOctilinear.class, memAddress(container), container);
    }

    /** Returns a new {@code OVRTextureLayoutOctilinear} instance for the specified memory address. */
    public static OVRTextureLayoutOctilinear create(long address) {
        return wrap(OVRTextureLayoutOctilinear.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTextureLayoutOctilinear createSafe(long address) {
        return address == NULL ? null : wrap(OVRTextureLayoutOctilinear.class, address);
    }

    /**
     * Returns a new {@link OVRTextureLayoutOctilinear.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutOctilinear.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link OVRTextureLayoutOctilinear.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutOctilinear.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTextureLayoutOctilinear.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutOctilinear.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link OVRTextureLayoutOctilinear.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutOctilinear.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTextureLayoutOctilinear.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code OVRTextureLayoutOctilinear} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRTextureLayoutOctilinear mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code OVRTextureLayoutOctilinear} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRTextureLayoutOctilinear callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code OVRTextureLayoutOctilinear} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTextureLayoutOctilinear mallocStack(MemoryStack stack) {
        return wrap(OVRTextureLayoutOctilinear.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code OVRTextureLayoutOctilinear} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTextureLayoutOctilinear callocStack(MemoryStack stack) {
        return wrap(OVRTextureLayoutOctilinear.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRTextureLayoutOctilinear.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutOctilinear.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRTextureLayoutOctilinear.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutOctilinear.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRTextureLayoutOctilinear.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutOctilinear.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTextureLayoutOctilinear.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTextureLayoutOctilinear.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #WarpLeft}. */
    public static float nWarpLeft(long struct) { return UNSAFE.getFloat(null, struct + OVRTextureLayoutOctilinear.WARPLEFT); }
    /** Unsafe version of {@link #WarpRight}. */
    public static float nWarpRight(long struct) { return UNSAFE.getFloat(null, struct + OVRTextureLayoutOctilinear.WARPRIGHT); }
    /** Unsafe version of {@link #WarpUp}. */
    public static float nWarpUp(long struct) { return UNSAFE.getFloat(null, struct + OVRTextureLayoutOctilinear.WARPUP); }
    /** Unsafe version of {@link #WarpDown}. */
    public static float nWarpDown(long struct) { return UNSAFE.getFloat(null, struct + OVRTextureLayoutOctilinear.WARPDOWN); }
    /** Unsafe version of {@link #SizeLeft}. */
    public static float nSizeLeft(long struct) { return UNSAFE.getFloat(null, struct + OVRTextureLayoutOctilinear.SIZELEFT); }
    /** Unsafe version of {@link #SizeRight}. */
    public static float nSizeRight(long struct) { return UNSAFE.getFloat(null, struct + OVRTextureLayoutOctilinear.SIZERIGHT); }
    /** Unsafe version of {@link #SizeUp}. */
    public static float nSizeUp(long struct) { return UNSAFE.getFloat(null, struct + OVRTextureLayoutOctilinear.SIZEUP); }
    /** Unsafe version of {@link #SizeDown}. */
    public static float nSizeDown(long struct) { return UNSAFE.getFloat(null, struct + OVRTextureLayoutOctilinear.SIZEDOWN); }

    /** Unsafe version of {@link #WarpLeft(float) WarpLeft}. */
    public static void nWarpLeft(long struct, float value) { UNSAFE.putFloat(null, struct + OVRTextureLayoutOctilinear.WARPLEFT, value); }
    /** Unsafe version of {@link #WarpRight(float) WarpRight}. */
    public static void nWarpRight(long struct, float value) { UNSAFE.putFloat(null, struct + OVRTextureLayoutOctilinear.WARPRIGHT, value); }
    /** Unsafe version of {@link #WarpUp(float) WarpUp}. */
    public static void nWarpUp(long struct, float value) { UNSAFE.putFloat(null, struct + OVRTextureLayoutOctilinear.WARPUP, value); }
    /** Unsafe version of {@link #WarpDown(float) WarpDown}. */
    public static void nWarpDown(long struct, float value) { UNSAFE.putFloat(null, struct + OVRTextureLayoutOctilinear.WARPDOWN, value); }
    /** Unsafe version of {@link #SizeLeft(float) SizeLeft}. */
    public static void nSizeLeft(long struct, float value) { UNSAFE.putFloat(null, struct + OVRTextureLayoutOctilinear.SIZELEFT, value); }
    /** Unsafe version of {@link #SizeRight(float) SizeRight}. */
    public static void nSizeRight(long struct, float value) { UNSAFE.putFloat(null, struct + OVRTextureLayoutOctilinear.SIZERIGHT, value); }
    /** Unsafe version of {@link #SizeUp(float) SizeUp}. */
    public static void nSizeUp(long struct, float value) { UNSAFE.putFloat(null, struct + OVRTextureLayoutOctilinear.SIZEUP, value); }
    /** Unsafe version of {@link #SizeDown(float) SizeDown}. */
    public static void nSizeDown(long struct, float value) { UNSAFE.putFloat(null, struct + OVRTextureLayoutOctilinear.SIZEDOWN, value); }

    // -----------------------------------

    /** An array of {@link OVRTextureLayoutOctilinear} structs. */
    public static class Buffer extends StructBuffer<OVRTextureLayoutOctilinear, Buffer> implements NativeResource {

        private static final OVRTextureLayoutOctilinear ELEMENT_FACTORY = OVRTextureLayoutOctilinear.create(-1L);

        /**
         * Creates a new {@code OVRTextureLayoutOctilinear.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRTextureLayoutOctilinear#SIZEOF}, and its mark will be undefined.
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
        protected OVRTextureLayoutOctilinear getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code WarpLeft} field. */
        public float WarpLeft() { return OVRTextureLayoutOctilinear.nWarpLeft(address()); }
        /** Returns the value of the {@code WarpRight} field. */
        public float WarpRight() { return OVRTextureLayoutOctilinear.nWarpRight(address()); }
        /** Returns the value of the {@code WarpUp} field. */
        public float WarpUp() { return OVRTextureLayoutOctilinear.nWarpUp(address()); }
        /** Returns the value of the {@code WarpDown} field. */
        public float WarpDown() { return OVRTextureLayoutOctilinear.nWarpDown(address()); }
        /** Returns the value of the {@code SizeLeft} field. */
        public float SizeLeft() { return OVRTextureLayoutOctilinear.nSizeLeft(address()); }
        /** Returns the value of the {@code SizeRight} field. */
        public float SizeRight() { return OVRTextureLayoutOctilinear.nSizeRight(address()); }
        /** Returns the value of the {@code SizeUp} field. */
        public float SizeUp() { return OVRTextureLayoutOctilinear.nSizeUp(address()); }
        /** Returns the value of the {@code SizeDown} field. */
        public float SizeDown() { return OVRTextureLayoutOctilinear.nSizeDown(address()); }

        /** Sets the specified value to the {@code WarpLeft} field. */
        public OVRTextureLayoutOctilinear.Buffer WarpLeft(float value) { OVRTextureLayoutOctilinear.nWarpLeft(address(), value); return this; }
        /** Sets the specified value to the {@code WarpRight} field. */
        public OVRTextureLayoutOctilinear.Buffer WarpRight(float value) { OVRTextureLayoutOctilinear.nWarpRight(address(), value); return this; }
        /** Sets the specified value to the {@code WarpUp} field. */
        public OVRTextureLayoutOctilinear.Buffer WarpUp(float value) { OVRTextureLayoutOctilinear.nWarpUp(address(), value); return this; }
        /** Sets the specified value to the {@code WarpDown} field. */
        public OVRTextureLayoutOctilinear.Buffer WarpDown(float value) { OVRTextureLayoutOctilinear.nWarpDown(address(), value); return this; }
        /** Sets the specified value to the {@code SizeLeft} field. */
        public OVRTextureLayoutOctilinear.Buffer SizeLeft(float value) { OVRTextureLayoutOctilinear.nSizeLeft(address(), value); return this; }
        /** Sets the specified value to the {@code SizeRight} field. */
        public OVRTextureLayoutOctilinear.Buffer SizeRight(float value) { OVRTextureLayoutOctilinear.nSizeRight(address(), value); return this; }
        /** Sets the specified value to the {@code SizeUp} field. */
        public OVRTextureLayoutOctilinear.Buffer SizeUp(float value) { OVRTextureLayoutOctilinear.nSizeUp(address(), value); return this; }
        /** Sets the specified value to the {@code SizeDown} field. */
        public OVRTextureLayoutOctilinear.Buffer SizeDown(float value) { OVRTextureLayoutOctilinear.nSizeDown(address(), value); return this; }

    }

}