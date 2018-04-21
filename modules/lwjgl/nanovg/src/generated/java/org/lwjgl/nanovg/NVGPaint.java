/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A NanoVG paint.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code xform} &ndash; the transformation matrix</li>
 * <li>{@code extent} &ndash; the extent</li>
 * <li>{@code radius} &ndash; the radius</li>
 * <li>{@code feather} &ndash; the feather amount</li>
 * <li>{@code innerColor} &ndash; the inner color</li>
 * <li>{@code outerColor} &ndash; the outer color</li>
 * <li>{@code image} &ndash; the image handle</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct NVGpaint {
 *     float xform[6];
 *     float extent[2];
 *     float radius;
 *     float feather;
 *     {@link NVGColor NVGcolor} innerColor;
 *     {@link NVGColor NVGcolor} outerColor;
 *     int image;
 * }</pre></code>
 */
@NativeType("struct NVGpaint")
public class NVGPaint extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        XFORM,
        EXTENT,
        RADIUS,
        FEATHER,
        INNERCOLOR,
        OUTERCOLOR,
        IMAGE;

    static {
        Layout layout = __struct(
            __array(4, 6),
            __array(4, 2),
            __member(4),
            __member(4),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(NVGColor.SIZEOF, NVGColor.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        XFORM = layout.offsetof(0);
        EXTENT = layout.offsetof(1);
        RADIUS = layout.offsetof(2);
        FEATHER = layout.offsetof(3);
        INNERCOLOR = layout.offsetof(4);
        OUTERCOLOR = layout.offsetof(5);
        IMAGE = layout.offsetof(6);
    }

    NVGPaint(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link NVGPaint} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NVGPaint(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link FloatBuffer} view of the {@code xform} field. */
    @NativeType("float[6]")
    public FloatBuffer xform() { return nxform(address()); }
    /** Returns the value at the specified index of the {@code xform} field. */
    public float xform(int index) { return nxform(address(), index); }
    /** Returns a {@link FloatBuffer} view of the {@code extent} field. */
    @NativeType("float[2]")
    public FloatBuffer extent() { return nextent(address()); }
    /** Returns the value at the specified index of the {@code extent} field. */
    public float extent(int index) { return nextent(address(), index); }
    /** Returns the value of the {@code radius} field. */
    public float radius() { return nradius(address()); }
    /** Returns the value of the {@code feather} field. */
    public float feather() { return nfeather(address()); }
    /** Returns a {@link NVGColor} view of the {@code innerColor} field. */
    @NativeType("NVGcolor")
    public NVGColor innerColor() { return ninnerColor(address()); }
    /** Returns a {@link NVGColor} view of the {@code outerColor} field. */
    @NativeType("NVGcolor")
    public NVGColor outerColor() { return nouterColor(address()); }
    /** Returns the value of the {@code image} field. */
    public int image() { return nimage(address()); }

    /** Copies the specified {@link FloatBuffer} to the {@code xform} field. */
    public NVGPaint xform(@NativeType("float[6]") FloatBuffer value) { nxform(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code xform} field. */
    public NVGPaint xform(int index, float value) { nxform(address(), index, value); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code extent} field. */
    public NVGPaint extent(@NativeType("float[2]") FloatBuffer value) { nextent(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code extent} field. */
    public NVGPaint extent(int index, float value) { nextent(address(), index, value); return this; }
    /** Sets the specified value to the {@code radius} field. */
    public NVGPaint radius(float value) { nradius(address(), value); return this; }
    /** Sets the specified value to the {@code feather} field. */
    public NVGPaint feather(float value) { nfeather(address(), value); return this; }
    /** Copies the specified {@link NVGColor} to the {@code innerColor} field. */
    public NVGPaint innerColor(@NativeType("NVGcolor") NVGColor value) { ninnerColor(address(), value); return this; }
    /** Copies the specified {@link NVGColor} to the {@code outerColor} field. */
    public NVGPaint outerColor(@NativeType("NVGcolor") NVGColor value) { nouterColor(address(), value); return this; }
    /** Sets the specified value to the {@code image} field. */
    public NVGPaint image(int value) { nimage(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public NVGPaint set(
        FloatBuffer xform,
        FloatBuffer extent,
        float radius,
        float feather,
        NVGColor innerColor,
        NVGColor outerColor,
        int image
    ) {
        xform(xform);
        extent(extent);
        radius(radius);
        feather(feather);
        innerColor(innerColor);
        outerColor(outerColor);
        image(image);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NVGPaint set(NVGPaint src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link NVGPaint} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NVGPaint malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link NVGPaint} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NVGPaint calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link NVGPaint} instance allocated with {@link BufferUtils}. */
    public static NVGPaint create() {
        return new NVGPaint(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link NVGPaint} instance for the specified memory address. */
    public static NVGPaint create(long address) {
        return new NVGPaint(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NVGPaint createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link NVGPaint.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NVGPaint.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NVGPaint.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NVGPaint.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NVGPaint.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NVGPaint.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link NVGPaint.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NVGPaint.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NVGPaint.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link NVGPaint} instance allocated on the thread-local {@link MemoryStack}. */
    public static NVGPaint mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link NVGPaint} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NVGPaint callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link NVGPaint} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NVGPaint mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link NVGPaint} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NVGPaint callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NVGPaint.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NVGPaint.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NVGPaint.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NVGPaint.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NVGPaint.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NVGPaint.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NVGPaint.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NVGPaint.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #xform}. */
    public static FloatBuffer nxform(long struct) { return memFloatBuffer(struct + NVGPaint.XFORM, 6); }
    /** Unsafe version of {@link #xform(int) xform}. */
    public static float nxform(long struct, int index) {
        return memGetFloat(struct + NVGPaint.XFORM + check(index, 6) * 4);
    }
    /** Unsafe version of {@link #extent}. */
    public static FloatBuffer nextent(long struct) { return memFloatBuffer(struct + NVGPaint.EXTENT, 2); }
    /** Unsafe version of {@link #extent(int) extent}. */
    public static float nextent(long struct, int index) {
        return memGetFloat(struct + NVGPaint.EXTENT + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return memGetFloat(struct + NVGPaint.RADIUS); }
    /** Unsafe version of {@link #feather}. */
    public static float nfeather(long struct) { return memGetFloat(struct + NVGPaint.FEATHER); }
    /** Unsafe version of {@link #innerColor}. */
    public static NVGColor ninnerColor(long struct) { return NVGColor.create(struct + NVGPaint.INNERCOLOR); }
    /** Unsafe version of {@link #outerColor}. */
    public static NVGColor nouterColor(long struct) { return NVGColor.create(struct + NVGPaint.OUTERCOLOR); }
    /** Unsafe version of {@link #image}. */
    public static int nimage(long struct) { return memGetInt(struct + NVGPaint.IMAGE); }

    /** Unsafe version of {@link #xform(FloatBuffer) xform}. */
    public static void nxform(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 6); }
        memCopy(memAddress(value), struct + NVGPaint.XFORM, value.remaining() * 4);
    }
    /** Unsafe version of {@link #xform(int, float) xform}. */
    public static void nxform(long struct, int index, float value) {
        memPutFloat(struct + NVGPaint.XFORM + check(index, 6) * 4, value);
    }
    /** Unsafe version of {@link #extent(FloatBuffer) extent}. */
    public static void nextent(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, 2); }
        memCopy(memAddress(value), struct + NVGPaint.EXTENT, value.remaining() * 4);
    }
    /** Unsafe version of {@link #extent(int, float) extent}. */
    public static void nextent(long struct, int index, float value) {
        memPutFloat(struct + NVGPaint.EXTENT + check(index, 2) * 4, value);
    }
    /** Unsafe version of {@link #radius(float) radius}. */
    public static void nradius(long struct, float value) { memPutFloat(struct + NVGPaint.RADIUS, value); }
    /** Unsafe version of {@link #feather(float) feather}. */
    public static void nfeather(long struct, float value) { memPutFloat(struct + NVGPaint.FEATHER, value); }
    /** Unsafe version of {@link #innerColor(NVGColor) innerColor}. */
    public static void ninnerColor(long struct, NVGColor value) { memCopy(value.address(), struct + NVGPaint.INNERCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #outerColor(NVGColor) outerColor}. */
    public static void nouterColor(long struct, NVGColor value) { memCopy(value.address(), struct + NVGPaint.OUTERCOLOR, NVGColor.SIZEOF); }
    /** Unsafe version of {@link #image(int) image}. */
    public static void nimage(long struct, int value) { memPutInt(struct + NVGPaint.IMAGE, value); }

    // -----------------------------------

    /** An array of {@link NVGPaint} structs. */
    public static class Buffer extends StructBuffer<NVGPaint, Buffer> implements NativeResource {

        /**
         * Creates a new {@link NVGPaint.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NVGPaint#SIZEOF}, and its mark will be undefined.
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
        protected NVGPaint newInstance(long address) {
            return new NVGPaint(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link FloatBuffer} view of the {@code xform} field. */
        @NativeType("float[6]")
        public FloatBuffer xform() { return NVGPaint.nxform(address()); }
        /** Returns the value at the specified index of the {@code xform} field. */
        public float xform(int index) { return NVGPaint.nxform(address(), index); }
        /** Returns a {@link FloatBuffer} view of the {@code extent} field. */
        @NativeType("float[2]")
        public FloatBuffer extent() { return NVGPaint.nextent(address()); }
        /** Returns the value at the specified index of the {@code extent} field. */
        public float extent(int index) { return NVGPaint.nextent(address(), index); }
        /** Returns the value of the {@code radius} field. */
        public float radius() { return NVGPaint.nradius(address()); }
        /** Returns the value of the {@code feather} field. */
        public float feather() { return NVGPaint.nfeather(address()); }
        /** Returns a {@link NVGColor} view of the {@code innerColor} field. */
        @NativeType("NVGcolor")
        public NVGColor innerColor() { return NVGPaint.ninnerColor(address()); }
        /** Returns a {@link NVGColor} view of the {@code outerColor} field. */
        @NativeType("NVGcolor")
        public NVGColor outerColor() { return NVGPaint.nouterColor(address()); }
        /** Returns the value of the {@code image} field. */
        public int image() { return NVGPaint.nimage(address()); }

        /** Copies the specified {@link FloatBuffer} to the {@code xform} field. */
        public NVGPaint.Buffer xform(@NativeType("float[6]") FloatBuffer value) { NVGPaint.nxform(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code xform} field. */
        public NVGPaint.Buffer xform(int index, float value) { NVGPaint.nxform(address(), index, value); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code extent} field. */
        public NVGPaint.Buffer extent(@NativeType("float[2]") FloatBuffer value) { NVGPaint.nextent(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code extent} field. */
        public NVGPaint.Buffer extent(int index, float value) { NVGPaint.nextent(address(), index, value); return this; }
        /** Sets the specified value to the {@code radius} field. */
        public NVGPaint.Buffer radius(float value) { NVGPaint.nradius(address(), value); return this; }
        /** Sets the specified value to the {@code feather} field. */
        public NVGPaint.Buffer feather(float value) { NVGPaint.nfeather(address(), value); return this; }
        /** Copies the specified {@link NVGColor} to the {@code innerColor} field. */
        public NVGPaint.Buffer innerColor(@NativeType("NVGcolor") NVGColor value) { NVGPaint.ninnerColor(address(), value); return this; }
        /** Copies the specified {@link NVGColor} to the {@code outerColor} field. */
        public NVGPaint.Buffer outerColor(@NativeType("NVGcolor") NVGColor value) { NVGPaint.nouterColor(address(), value); return this; }
        /** Sets the specified value to the {@code image} field. */
        public NVGPaint.Buffer image(int value) { NVGPaint.nimage(address(), value); return this; }

    }

}