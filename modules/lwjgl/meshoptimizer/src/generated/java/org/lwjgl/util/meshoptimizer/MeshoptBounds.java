/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.meshoptimizer;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct meshopt_Bounds {
 *     float {@link #center}[3];
 *     float radius;
 *     float {@link #cone_apex}[3];
 *     float cone_axis[3];
 *     float {@link #cone_cutoff};
 *     char {@link #cone_axis_s8}[3];
 *     char cone_cutoff_s8;
 * }</code></pre>
 */
@NativeType("struct meshopt_Bounds")
public class MeshoptBounds extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CENTER,
        RADIUS,
        CONE_APEX,
        CONE_AXIS,
        CONE_CUTOFF,
        CONE_AXIS_S8,
        CONE_CUTOFF_S8;

    static {
        Layout layout = __struct(
            __array(4, 3),
            __member(4),
            __array(4, 3),
            __array(4, 3),
            __member(4),
            __array(1, 3),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CENTER = layout.offsetof(0);
        RADIUS = layout.offsetof(1);
        CONE_APEX = layout.offsetof(2);
        CONE_AXIS = layout.offsetof(3);
        CONE_CUTOFF = layout.offsetof(4);
        CONE_AXIS_S8 = layout.offsetof(5);
        CONE_CUTOFF_S8 = layout.offsetof(6);
    }

    /**
     * Creates a {@code MeshoptBounds} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public MeshoptBounds(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** bounding sphere, useful for frustum and occlusion culling */
    @NativeType("float[3]")
    public FloatBuffer center() { return ncenter(address()); }
    /** bounding sphere, useful for frustum and occlusion culling */
    public float center(int index) { return ncenter(address(), index); }
    /** @return the value of the {@code radius} field. */
    public float radius() { return nradius(address()); }
    /** normal cone, useful for backface culling */
    @NativeType("float[3]")
    public FloatBuffer cone_apex() { return ncone_apex(address()); }
    /** normal cone, useful for backface culling */
    public float cone_apex(int index) { return ncone_apex(address(), index); }
    /** @return a {@link FloatBuffer} view of the {@code cone_axis} field. */
    @NativeType("float[3]")
    public FloatBuffer cone_axis() { return ncone_axis(address()); }
    /** @return the value at the specified index of the {@code cone_axis} field. */
    public float cone_axis(int index) { return ncone_axis(address(), index); }
    /** {@code cos(angle/2)} */
    public float cone_cutoff() { return ncone_cutoff(address()); }
    /** normal cone axis and cutoff, stored in 8-bit {@code SNORM} format; decode using {@code x/127.0} */
    @NativeType("char[3]")
    public ByteBuffer cone_axis_s8() { return ncone_axis_s8(address()); }
    /** normal cone axis and cutoff, stored in 8-bit {@code SNORM} format; decode using {@code x/127.0} */
    @NativeType("char")
    public byte cone_axis_s8(int index) { return ncone_axis_s8(address(), index); }
    /** @return the value of the {@code cone_cutoff_s8} field. */
    @NativeType("char")
    public byte cone_cutoff_s8() { return ncone_cutoff_s8(address()); }

    // -----------------------------------

    /** Returns a new {@code MeshoptBounds} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static MeshoptBounds malloc() {
        return wrap(MeshoptBounds.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code MeshoptBounds} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static MeshoptBounds calloc() {
        return wrap(MeshoptBounds.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code MeshoptBounds} instance allocated with {@link BufferUtils}. */
    public static MeshoptBounds create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(MeshoptBounds.class, memAddress(container), container);
    }

    /** Returns a new {@code MeshoptBounds} instance for the specified memory address. */
    public static MeshoptBounds create(long address) {
        return wrap(MeshoptBounds.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeshoptBounds createSafe(long address) {
        return address == NULL ? null : wrap(MeshoptBounds.class, address);
    }

    /**
     * Returns a new {@link MeshoptBounds.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptBounds.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link MeshoptBounds.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptBounds.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptBounds.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static MeshoptBounds.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link MeshoptBounds.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static MeshoptBounds.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static MeshoptBounds.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code MeshoptBounds} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptBounds malloc(MemoryStack stack) {
        return wrap(MeshoptBounds.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code MeshoptBounds} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static MeshoptBounds calloc(MemoryStack stack) {
        return wrap(MeshoptBounds.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link MeshoptBounds.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptBounds.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link MeshoptBounds.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static MeshoptBounds.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #center}. */
    public static FloatBuffer ncenter(long struct) { return memFloatBuffer(struct + MeshoptBounds.CENTER, 3); }
    /** Unsafe version of {@link #center(int) center}. */
    public static float ncenter(long struct, int index) {
        return UNSAFE.getFloat(null, struct + MeshoptBounds.CENTER + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return UNSAFE.getFloat(null, struct + MeshoptBounds.RADIUS); }
    /** Unsafe version of {@link #cone_apex}. */
    public static FloatBuffer ncone_apex(long struct) { return memFloatBuffer(struct + MeshoptBounds.CONE_APEX, 3); }
    /** Unsafe version of {@link #cone_apex(int) cone_apex}. */
    public static float ncone_apex(long struct, int index) {
        return UNSAFE.getFloat(null, struct + MeshoptBounds.CONE_APEX + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #cone_axis}. */
    public static FloatBuffer ncone_axis(long struct) { return memFloatBuffer(struct + MeshoptBounds.CONE_AXIS, 3); }
    /** Unsafe version of {@link #cone_axis(int) cone_axis}. */
    public static float ncone_axis(long struct, int index) {
        return UNSAFE.getFloat(null, struct + MeshoptBounds.CONE_AXIS + check(index, 3) * 4);
    }
    /** Unsafe version of {@link #cone_cutoff}. */
    public static float ncone_cutoff(long struct) { return UNSAFE.getFloat(null, struct + MeshoptBounds.CONE_CUTOFF); }
    /** Unsafe version of {@link #cone_axis_s8}. */
    public static ByteBuffer ncone_axis_s8(long struct) { return memByteBuffer(struct + MeshoptBounds.CONE_AXIS_S8, 3); }
    /** Unsafe version of {@link #cone_axis_s8(int) cone_axis_s8}. */
    public static byte ncone_axis_s8(long struct, int index) {
        return UNSAFE.getByte(null, struct + MeshoptBounds.CONE_AXIS_S8 + check(index, 3) * 1);
    }
    /** Unsafe version of {@link #cone_cutoff_s8}. */
    public static byte ncone_cutoff_s8(long struct) { return UNSAFE.getByte(null, struct + MeshoptBounds.CONE_CUTOFF_S8); }

    // -----------------------------------

    /** An array of {@link MeshoptBounds} structs. */
    public static class Buffer extends StructBuffer<MeshoptBounds, Buffer> implements NativeResource {

        private static final MeshoptBounds ELEMENT_FACTORY = MeshoptBounds.create(-1L);

        /**
         * Creates a new {@code MeshoptBounds.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link MeshoptBounds#SIZEOF}, and its mark will be undefined.
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
        protected MeshoptBounds getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link FloatBuffer} view of the {@link MeshoptBounds#center} field. */
        @NativeType("float[3]")
        public FloatBuffer center() { return MeshoptBounds.ncenter(address()); }
        /** @return the value at the specified index of the {@link MeshoptBounds#center} field. */
        public float center(int index) { return MeshoptBounds.ncenter(address(), index); }
        /** @return the value of the {@code radius} field. */
        public float radius() { return MeshoptBounds.nradius(address()); }
        /** @return a {@link FloatBuffer} view of the {@link MeshoptBounds#cone_apex} field. */
        @NativeType("float[3]")
        public FloatBuffer cone_apex() { return MeshoptBounds.ncone_apex(address()); }
        /** @return the value at the specified index of the {@link MeshoptBounds#cone_apex} field. */
        public float cone_apex(int index) { return MeshoptBounds.ncone_apex(address(), index); }
        /** @return a {@link FloatBuffer} view of the {@code cone_axis} field. */
        @NativeType("float[3]")
        public FloatBuffer cone_axis() { return MeshoptBounds.ncone_axis(address()); }
        /** @return the value at the specified index of the {@code cone_axis} field. */
        public float cone_axis(int index) { return MeshoptBounds.ncone_axis(address(), index); }
        /** @return the value of the {@link MeshoptBounds#cone_cutoff} field. */
        public float cone_cutoff() { return MeshoptBounds.ncone_cutoff(address()); }
        /** @return a {@link ByteBuffer} view of the {@link MeshoptBounds#cone_axis_s8} field. */
        @NativeType("char[3]")
        public ByteBuffer cone_axis_s8() { return MeshoptBounds.ncone_axis_s8(address()); }
        /** @return the value at the specified index of the {@link MeshoptBounds#cone_axis_s8} field. */
        @NativeType("char")
        public byte cone_axis_s8(int index) { return MeshoptBounds.ncone_axis_s8(address(), index); }
        /** @return the value of the {@code cone_cutoff_s8} field. */
        @NativeType("char")
        public byte cone_cutoff_s8() { return MeshoptBounds.ncone_cutoff_s8(address()); }

    }

}