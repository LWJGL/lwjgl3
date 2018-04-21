/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Eye.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code rotation} &ndash; eye rotation represented as quaternion</li>
 * <li>{@code translation} &ndash; eye translation</li>
 * <li>{@code fov} &ndash; field of view (up, down, left, right)</li>
 * <li>{@code viewOffset} &ndash; eye view matrix translation adjustment</li>
 * <li>{@code projection} &ndash; eye projection matrix</li>
 * <li>{@code pixelsPerTanAngle} &ndash; number of pixels that fit in tan(angle) = 1.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct bgfx_hmd_eye_t {
 *     float rotation[4];
 *     float translation[3];
 *     float fov[4];
 *     float viewOffset[3];
 *     float projection[16];
 *     float pixelsPerTanAngle[2];
 * }</pre></code>
 */
@NativeType("struct bgfx_hmd_eye_t")
public class BGFXHmdEye extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ROTATION,
        TRANSLATION,
        FOV,
        VIEWOFFSET,
        PROJECTION,
        PIXELSPERTANANGLE;

    static {
        Layout layout = __struct(
            __array(4, 4),
            __array(4, 3),
            __array(4, 4),
            __array(4, 3),
            __array(4, 16),
            __array(4, 2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ROTATION = layout.offsetof(0);
        TRANSLATION = layout.offsetof(1);
        FOV = layout.offsetof(2);
        VIEWOFFSET = layout.offsetof(3);
        PROJECTION = layout.offsetof(4);
        PIXELSPERTANANGLE = layout.offsetof(5);
    }

    BGFXHmdEye(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link BGFXHmdEye} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXHmdEye(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FloatBuffer} view of the {@code rotation} field. */
    @NativeType("float[4]")
    public FloatBuffer rotation() { return nrotation(address()); }
    /** Returns the value at the specified index of the {@code rotation} field. */
    public float rotation(int index) { return nrotation(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code translation} field. */
    @NativeType("float[3]")
    public FloatBuffer translation() { return ntranslation(address()); }
    /** Returns the value at the specified index of the {@code translation} field. */
    public float translation(int index) { return ntranslation(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code fov} field. */
    @NativeType("float[4]")
    public FloatBuffer fov() { return nfov(address()); }
    /** Returns the value at the specified index of the {@code fov} field. */
    public float fov(int index) { return nfov(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code viewOffset} field. */
    @NativeType("float[3]")
    public FloatBuffer viewOffset() { return nviewOffset(address()); }
    /** Returns the value at the specified index of the {@code viewOffset} field. */
    public float viewOffset(int index) { return nviewOffset(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code projection} field. */
    @NativeType("float[16]")
    public FloatBuffer projection() { return nprojection(address()); }
    /** Returns the value at the specified index of the {@code projection} field. */
    public float projection(int index) { return nprojection(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code pixelsPerTanAngle} field. */
    @NativeType("float[2]")
    public FloatBuffer pixelsPerTanAngle() { return npixelsPerTanAngle(address()); }
    /** Returns the value at the specified index of the {@code pixelsPerTanAngle} field. */
    public float pixelsPerTanAngle(int index) { return npixelsPerTanAngle(address(), index); }

    // -----------------------------------

    /** Returns a new {@link BGFXHmdEye} instance for the specified memory address. */
    public static BGFXHmdEye create(long address) {
        return new BGFXHmdEye(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXHmdEye createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link BGFXHmdEye.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXHmdEye.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXHmdEye.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #rotation}. */
    public static FloatBuffer nrotation(long struct) { return memFloatBuffer(struct + BGFXHmdEye.ROTATION, 4); }
    /** Unsafe version of {@link #rotation(int) rotation}. */
    public static float nrotation(long struct, int index) {
        return memGetFloat(struct + BGFXHmdEye.ROTATION + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #translation}. */
    public static FloatBuffer ntranslation(long struct) { return memFloatBuffer(struct + BGFXHmdEye.TRANSLATION, 3); }
    /** Unsafe version of {@link #translation(int) translation}. */
    public static float ntranslation(long struct, int index) {
        return memGetFloat(struct + BGFXHmdEye.TRANSLATION + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #fov}. */
    public static FloatBuffer nfov(long struct) { return memFloatBuffer(struct + BGFXHmdEye.FOV, 4); }
    /** Unsafe version of {@link #fov(int) fov}. */
    public static float nfov(long struct, int index) {
        return memGetFloat(struct + BGFXHmdEye.FOV + check(index, 4) * 4);
    }
    /** Unsafe version of {@link #viewOffset}. */
    public static FloatBuffer nviewOffset(long struct) { return memFloatBuffer(struct + BGFXHmdEye.VIEWOFFSET, 3); }
    /** Unsafe version of {@link #viewOffset(int) viewOffset}. */
    public static float nviewOffset(long struct, int index) {
        return memGetFloat(struct + BGFXHmdEye.VIEWOFFSET + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #projection}. */
    public static FloatBuffer nprojection(long struct) { return memFloatBuffer(struct + BGFXHmdEye.PROJECTION, 16); }
    /** Unsafe version of {@link #projection(int) projection}. */
    public static float nprojection(long struct, int index) {
        return memGetFloat(struct + BGFXHmdEye.PROJECTION + check(index, 16) * 4);
    }
    /** Unsafe version of {@link #pixelsPerTanAngle}. */
    public static FloatBuffer npixelsPerTanAngle(long struct) { return memFloatBuffer(struct + BGFXHmdEye.PIXELSPERTANANGLE, 2); }
    /** Unsafe version of {@link #pixelsPerTanAngle(int) pixelsPerTanAngle}. */
    public static float npixelsPerTanAngle(long struct, int index) {
        return memGetFloat(struct + BGFXHmdEye.PIXELSPERTANANGLE + check(index, 2) * 4);
    }

    // -----------------------------------

    /** An array of {@link BGFXHmdEye} structs. */
    public static class Buffer extends StructBuffer<BGFXHmdEye, Buffer> {

        /**
         * Creates a new {@link BGFXHmdEye.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXHmdEye#SIZEOF}, and its mark will be undefined.
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
        protected BGFXHmdEye newInstance(long address) {
            return new BGFXHmdEye(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link FloatBuffer} view of the {@code rotation} field. */
        @NativeType("float[4]")
        public FloatBuffer rotation() { return BGFXHmdEye.nrotation(address()); }
        /** Returns the value at the specified index of the {@code rotation} field. */
        public float rotation(int index) { return BGFXHmdEye.nrotation(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code translation} field. */
        @NativeType("float[3]")
        public FloatBuffer translation() { return BGFXHmdEye.ntranslation(address()); }
        /** Returns the value at the specified index of the {@code translation} field. */
        public float translation(int index) { return BGFXHmdEye.ntranslation(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code fov} field. */
        @NativeType("float[4]")
        public FloatBuffer fov() { return BGFXHmdEye.nfov(address()); }
        /** Returns the value at the specified index of the {@code fov} field. */
        public float fov(int index) { return BGFXHmdEye.nfov(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code viewOffset} field. */
        @NativeType("float[3]")
        public FloatBuffer viewOffset() { return BGFXHmdEye.nviewOffset(address()); }
        /** Returns the value at the specified index of the {@code viewOffset} field. */
        public float viewOffset(int index) { return BGFXHmdEye.nviewOffset(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code projection} field. */
        @NativeType("float[16]")
        public FloatBuffer projection() { return BGFXHmdEye.nprojection(address()); }
        /** Returns the value at the specified index of the {@code projection} field. */
        public float projection(int index) { return BGFXHmdEye.nprojection(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code pixelsPerTanAngle} field. */
        @NativeType("float[2]")
        public FloatBuffer pixelsPerTanAngle() { return BGFXHmdEye.npixelsPerTanAngle(address()); }
        /** Returns the value at the specified index of the {@code pixelsPerTanAngle} field. */
        public float pixelsPerTanAngle(int index) { return BGFXHmdEye.npixelsPerTanAngle(address(), index); }

    }

}