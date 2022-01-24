/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.par;

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
 * struct par_octasphere_config {
 *     float corner_radius;
 *     float width;
 *     float height;
 *     float depth;
 *     int num_subdivisions;
 *     par_octasphere_uv_mode uv_mode;
 *     par_octasphere_normals_mode normals_mode;
 * }</code></pre>
 */
@NativeType("struct par_octasphere_config")
public class ParOctasphereConfig extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CORNER_RADIUS,
        WIDTH,
        HEIGHT,
        DEPTH,
        NUM_SUBDIVISIONS,
        UV_MODE,
        NORMALS_MODE;

    static {
        Layout layout = __struct(
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

        CORNER_RADIUS = layout.offsetof(0);
        WIDTH = layout.offsetof(1);
        HEIGHT = layout.offsetof(2);
        DEPTH = layout.offsetof(3);
        NUM_SUBDIVISIONS = layout.offsetof(4);
        UV_MODE = layout.offsetof(5);
        NORMALS_MODE = layout.offsetof(6);
    }

    /**
     * Creates a {@code ParOctasphereConfig} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public ParOctasphereConfig(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code corner_radius} field. */
    public float corner_radius() { return ncorner_radius(address()); }
    /** @return the value of the {@code width} field. */
    public float width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public float height() { return nheight(address()); }
    /** @return the value of the {@code depth} field. */
    public float depth() { return ndepth(address()); }
    /** @return the value of the {@code num_subdivisions} field. */
    public int num_subdivisions() { return nnum_subdivisions(address()); }
    /** @return the value of the {@code uv_mode} field. */
    @NativeType("par_octasphere_uv_mode")
    public int uv_mode() { return nuv_mode(address()); }
    /** @return the value of the {@code normals_mode} field. */
    @NativeType("par_octasphere_normals_mode")
    public int normals_mode() { return nnormals_mode(address()); }

    /** Sets the specified value to the {@code corner_radius} field. */
    public ParOctasphereConfig corner_radius(float value) { ncorner_radius(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public ParOctasphereConfig width(float value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public ParOctasphereConfig height(float value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@code depth} field. */
    public ParOctasphereConfig depth(float value) { ndepth(address(), value); return this; }
    /** Sets the specified value to the {@code num_subdivisions} field. */
    public ParOctasphereConfig num_subdivisions(int value) { nnum_subdivisions(address(), value); return this; }
    /** Sets the specified value to the {@code uv_mode} field. */
    public ParOctasphereConfig uv_mode(@NativeType("par_octasphere_uv_mode") int value) { nuv_mode(address(), value); return this; }
    /** Sets the specified value to the {@code normals_mode} field. */
    public ParOctasphereConfig normals_mode(@NativeType("par_octasphere_normals_mode") int value) { nnormals_mode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public ParOctasphereConfig set(
        float corner_radius,
        float width,
        float height,
        float depth,
        int num_subdivisions,
        int uv_mode,
        int normals_mode
    ) {
        corner_radius(corner_radius);
        width(width);
        height(height);
        depth(depth);
        num_subdivisions(num_subdivisions);
        uv_mode(uv_mode);
        normals_mode(normals_mode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public ParOctasphereConfig set(ParOctasphereConfig src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code ParOctasphereConfig} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static ParOctasphereConfig malloc() {
        return wrap(ParOctasphereConfig.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code ParOctasphereConfig} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static ParOctasphereConfig calloc() {
        return wrap(ParOctasphereConfig.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code ParOctasphereConfig} instance allocated with {@link BufferUtils}. */
    public static ParOctasphereConfig create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(ParOctasphereConfig.class, memAddress(container), container);
    }

    /** Returns a new {@code ParOctasphereConfig} instance for the specified memory address. */
    public static ParOctasphereConfig create(long address) {
        return wrap(ParOctasphereConfig.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParOctasphereConfig createSafe(long address) {
        return address == NULL ? null : wrap(ParOctasphereConfig.class, address);
    }

    /**
     * Returns a new {@link ParOctasphereConfig.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ParOctasphereConfig.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link ParOctasphereConfig.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static ParOctasphereConfig.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ParOctasphereConfig.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static ParOctasphereConfig.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link ParOctasphereConfig.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static ParOctasphereConfig.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static ParOctasphereConfig.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code ParOctasphereConfig} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static ParOctasphereConfig malloc(MemoryStack stack) {
        return wrap(ParOctasphereConfig.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code ParOctasphereConfig} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static ParOctasphereConfig calloc(MemoryStack stack) {
        return wrap(ParOctasphereConfig.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link ParOctasphereConfig.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ParOctasphereConfig.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link ParOctasphereConfig.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static ParOctasphereConfig.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #corner_radius}. */
    public static float ncorner_radius(long struct) { return UNSAFE.getFloat(null, struct + ParOctasphereConfig.CORNER_RADIUS); }
    /** Unsafe version of {@link #width}. */
    public static float nwidth(long struct) { return UNSAFE.getFloat(null, struct + ParOctasphereConfig.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return UNSAFE.getFloat(null, struct + ParOctasphereConfig.HEIGHT); }
    /** Unsafe version of {@link #depth}. */
    public static float ndepth(long struct) { return UNSAFE.getFloat(null, struct + ParOctasphereConfig.DEPTH); }
    /** Unsafe version of {@link #num_subdivisions}. */
    public static int nnum_subdivisions(long struct) { return UNSAFE.getInt(null, struct + ParOctasphereConfig.NUM_SUBDIVISIONS); }
    /** Unsafe version of {@link #uv_mode}. */
    public static int nuv_mode(long struct) { return UNSAFE.getInt(null, struct + ParOctasphereConfig.UV_MODE); }
    /** Unsafe version of {@link #normals_mode}. */
    public static int nnormals_mode(long struct) { return UNSAFE.getInt(null, struct + ParOctasphereConfig.NORMALS_MODE); }

    /** Unsafe version of {@link #corner_radius(float) corner_radius}. */
    public static void ncorner_radius(long struct, float value) { UNSAFE.putFloat(null, struct + ParOctasphereConfig.CORNER_RADIUS, value); }
    /** Unsafe version of {@link #width(float) width}. */
    public static void nwidth(long struct, float value) { UNSAFE.putFloat(null, struct + ParOctasphereConfig.WIDTH, value); }
    /** Unsafe version of {@link #height(float) height}. */
    public static void nheight(long struct, float value) { UNSAFE.putFloat(null, struct + ParOctasphereConfig.HEIGHT, value); }
    /** Unsafe version of {@link #depth(float) depth}. */
    public static void ndepth(long struct, float value) { UNSAFE.putFloat(null, struct + ParOctasphereConfig.DEPTH, value); }
    /** Unsafe version of {@link #num_subdivisions(int) num_subdivisions}. */
    public static void nnum_subdivisions(long struct, int value) { UNSAFE.putInt(null, struct + ParOctasphereConfig.NUM_SUBDIVISIONS, value); }
    /** Unsafe version of {@link #uv_mode(int) uv_mode}. */
    public static void nuv_mode(long struct, int value) { UNSAFE.putInt(null, struct + ParOctasphereConfig.UV_MODE, value); }
    /** Unsafe version of {@link #normals_mode(int) normals_mode}. */
    public static void nnormals_mode(long struct, int value) { UNSAFE.putInt(null, struct + ParOctasphereConfig.NORMALS_MODE, value); }

    // -----------------------------------

    /** An array of {@link ParOctasphereConfig} structs. */
    public static class Buffer extends StructBuffer<ParOctasphereConfig, Buffer> implements NativeResource {

        private static final ParOctasphereConfig ELEMENT_FACTORY = ParOctasphereConfig.create(-1L);

        /**
         * Creates a new {@code ParOctasphereConfig.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link ParOctasphereConfig#SIZEOF}, and its mark will be undefined.
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
        protected ParOctasphereConfig getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code corner_radius} field. */
        public float corner_radius() { return ParOctasphereConfig.ncorner_radius(address()); }
        /** @return the value of the {@code width} field. */
        public float width() { return ParOctasphereConfig.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public float height() { return ParOctasphereConfig.nheight(address()); }
        /** @return the value of the {@code depth} field. */
        public float depth() { return ParOctasphereConfig.ndepth(address()); }
        /** @return the value of the {@code num_subdivisions} field. */
        public int num_subdivisions() { return ParOctasphereConfig.nnum_subdivisions(address()); }
        /** @return the value of the {@code uv_mode} field. */
        @NativeType("par_octasphere_uv_mode")
        public int uv_mode() { return ParOctasphereConfig.nuv_mode(address()); }
        /** @return the value of the {@code normals_mode} field. */
        @NativeType("par_octasphere_normals_mode")
        public int normals_mode() { return ParOctasphereConfig.nnormals_mode(address()); }

        /** Sets the specified value to the {@code corner_radius} field. */
        public ParOctasphereConfig.Buffer corner_radius(float value) { ParOctasphereConfig.ncorner_radius(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public ParOctasphereConfig.Buffer width(float value) { ParOctasphereConfig.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public ParOctasphereConfig.Buffer height(float value) { ParOctasphereConfig.nheight(address(), value); return this; }
        /** Sets the specified value to the {@code depth} field. */
        public ParOctasphereConfig.Buffer depth(float value) { ParOctasphereConfig.ndepth(address(), value); return this; }
        /** Sets the specified value to the {@code num_subdivisions} field. */
        public ParOctasphereConfig.Buffer num_subdivisions(int value) { ParOctasphereConfig.nnum_subdivisions(address(), value); return this; }
        /** Sets the specified value to the {@code uv_mode} field. */
        public ParOctasphereConfig.Buffer uv_mode(@NativeType("par_octasphere_uv_mode") int value) { ParOctasphereConfig.nuv_mode(address(), value); return this; }
        /** Sets the specified value to the {@code normals_mode} field. */
        public ParOctasphereConfig.Buffer normals_mode(@NativeType("par_octasphere_normals_mode") int value) { ParOctasphereConfig.nnormals_mode(address(), value); return this; }

    }

}