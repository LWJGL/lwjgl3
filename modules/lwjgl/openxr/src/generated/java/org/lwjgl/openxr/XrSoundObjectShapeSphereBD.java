/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSoundObjectShapeSphereBD {
 *     XrStructureType type;
 *     void const * next;
 *     float radius;
 * }}</pre>
 */
public class XrSoundObjectShapeSphereBD extends Struct<XrSoundObjectShapeSphereBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        RADIUS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        RADIUS = layout.offsetof(2);
    }

    protected XrSoundObjectShapeSphereBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSoundObjectShapeSphereBD create(long address, @Nullable ByteBuffer container) {
        return new XrSoundObjectShapeSphereBD(address, container);
    }

    /**
     * Creates a {@code XrSoundObjectShapeSphereBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSoundObjectShapeSphereBD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code radius} field. */
    public float radius() { return nradius(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSoundObjectShapeSphereBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBJECT_SHAPE_SPHERE_BD TYPE_SOUND_OBJECT_SHAPE_SPHERE_BD} value to the {@code type} field. */
    public XrSoundObjectShapeSphereBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBJECT_SHAPE_SPHERE_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSoundObjectShapeSphereBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code radius} field. */
    public XrSoundObjectShapeSphereBD radius(float value) { nradius(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSoundObjectShapeSphereBD set(
        int type,
        long next,
        float radius
    ) {
        type(type);
        next(next);
        radius(radius);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSoundObjectShapeSphereBD set(XrSoundObjectShapeSphereBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSoundObjectShapeSphereBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSoundObjectShapeSphereBD malloc() {
        return new XrSoundObjectShapeSphereBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObjectShapeSphereBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSoundObjectShapeSphereBD calloc() {
        return new XrSoundObjectShapeSphereBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObjectShapeSphereBD} instance allocated with {@link BufferUtils}. */
    public static XrSoundObjectShapeSphereBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSoundObjectShapeSphereBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSoundObjectShapeSphereBD} instance for the specified memory address. */
    public static XrSoundObjectShapeSphereBD create(long address) {
        return new XrSoundObjectShapeSphereBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSoundObjectShapeSphereBD createSafe(long address) {
        return address == NULL ? null : new XrSoundObjectShapeSphereBD(address, null);
    }

    /**
     * Returns a new {@link XrSoundObjectShapeSphereBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectShapeSphereBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectShapeSphereBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectShapeSphereBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectShapeSphereBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectShapeSphereBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSoundObjectShapeSphereBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectShapeSphereBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSoundObjectShapeSphereBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSoundObjectShapeSphereBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObjectShapeSphereBD malloc(MemoryStack stack) {
        return new XrSoundObjectShapeSphereBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSoundObjectShapeSphereBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObjectShapeSphereBD calloc(MemoryStack stack) {
        return new XrSoundObjectShapeSphereBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSoundObjectShapeSphereBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectShapeSphereBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectShapeSphereBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectShapeSphereBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSoundObjectShapeSphereBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSoundObjectShapeSphereBD.NEXT); }
    /** Unsafe version of {@link #radius}. */
    public static float nradius(long struct) { return memGetFloat(struct + XrSoundObjectShapeSphereBD.RADIUS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSoundObjectShapeSphereBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSoundObjectShapeSphereBD.NEXT, value); }
    /** Unsafe version of {@link #radius(float) radius}. */
    public static void nradius(long struct, float value) { memPutFloat(struct + XrSoundObjectShapeSphereBD.RADIUS, value); }

    // -----------------------------------

    /** An array of {@link XrSoundObjectShapeSphereBD} structs. */
    public static class Buffer extends StructBuffer<XrSoundObjectShapeSphereBD, Buffer> implements NativeResource {

        private static final XrSoundObjectShapeSphereBD ELEMENT_FACTORY = XrSoundObjectShapeSphereBD.create(-1L);

        /**
         * Creates a new {@code XrSoundObjectShapeSphereBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSoundObjectShapeSphereBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSoundObjectShapeSphereBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSoundObjectShapeSphereBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSoundObjectShapeSphereBD.nnext(address()); }
        /** @return the value of the {@code radius} field. */
        public float radius() { return XrSoundObjectShapeSphereBD.nradius(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSoundObjectShapeSphereBD.Buffer type(@NativeType("XrStructureType") int value) { XrSoundObjectShapeSphereBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBJECT_SHAPE_SPHERE_BD TYPE_SOUND_OBJECT_SHAPE_SPHERE_BD} value to the {@code type} field. */
        public XrSoundObjectShapeSphereBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBJECT_SHAPE_SPHERE_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSoundObjectShapeSphereBD.Buffer next(@NativeType("void const *") long value) { XrSoundObjectShapeSphereBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code radius} field. */
        public XrSoundObjectShapeSphereBD.Buffer radius(float value) { XrSoundObjectShapeSphereBD.nradius(address(), value); return this; }

    }

}