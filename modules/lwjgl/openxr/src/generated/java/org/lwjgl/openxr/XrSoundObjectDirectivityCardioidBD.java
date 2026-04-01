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
 * struct XrSoundObjectDirectivityCardioidBD {
 *     XrStructureType type;
 *     void const * next;
 *     float alpha;
 *     float order;
 * }}</pre>
 */
public class XrSoundObjectDirectivityCardioidBD extends Struct<XrSoundObjectDirectivityCardioidBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ALPHA,
        ORDER;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ALPHA = layout.offsetof(2);
        ORDER = layout.offsetof(3);
    }

    protected XrSoundObjectDirectivityCardioidBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSoundObjectDirectivityCardioidBD create(long address, @Nullable ByteBuffer container) {
        return new XrSoundObjectDirectivityCardioidBD(address, container);
    }

    /**
     * Creates a {@code XrSoundObjectDirectivityCardioidBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSoundObjectDirectivityCardioidBD(ByteBuffer container) {
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
    /** @return the value of the {@code alpha} field. */
    public float alpha() { return nalpha(address()); }
    /** @return the value of the {@code order} field. */
    public float order() { return norder(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSoundObjectDirectivityCardioidBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBJECT_DIRECTIVITY_CARDIOID_BD TYPE_SOUND_OBJECT_DIRECTIVITY_CARDIOID_BD} value to the {@code type} field. */
    public XrSoundObjectDirectivityCardioidBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBJECT_DIRECTIVITY_CARDIOID_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSoundObjectDirectivityCardioidBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code alpha} field. */
    public XrSoundObjectDirectivityCardioidBD alpha(float value) { nalpha(address(), value); return this; }
    /** Sets the specified value to the {@code order} field. */
    public XrSoundObjectDirectivityCardioidBD order(float value) { norder(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSoundObjectDirectivityCardioidBD set(
        int type,
        long next,
        float alpha,
        float order
    ) {
        type(type);
        next(next);
        alpha(alpha);
        order(order);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSoundObjectDirectivityCardioidBD set(XrSoundObjectDirectivityCardioidBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSoundObjectDirectivityCardioidBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSoundObjectDirectivityCardioidBD malloc() {
        return new XrSoundObjectDirectivityCardioidBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObjectDirectivityCardioidBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSoundObjectDirectivityCardioidBD calloc() {
        return new XrSoundObjectDirectivityCardioidBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObjectDirectivityCardioidBD} instance allocated with {@link BufferUtils}. */
    public static XrSoundObjectDirectivityCardioidBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSoundObjectDirectivityCardioidBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSoundObjectDirectivityCardioidBD} instance for the specified memory address. */
    public static XrSoundObjectDirectivityCardioidBD create(long address) {
        return new XrSoundObjectDirectivityCardioidBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSoundObjectDirectivityCardioidBD createSafe(long address) {
        return address == NULL ? null : new XrSoundObjectDirectivityCardioidBD(address, null);
    }

    /**
     * Returns a new {@link XrSoundObjectDirectivityCardioidBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDirectivityCardioidBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectDirectivityCardioidBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDirectivityCardioidBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectDirectivityCardioidBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDirectivityCardioidBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSoundObjectDirectivityCardioidBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDirectivityCardioidBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSoundObjectDirectivityCardioidBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSoundObjectDirectivityCardioidBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObjectDirectivityCardioidBD malloc(MemoryStack stack) {
        return new XrSoundObjectDirectivityCardioidBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSoundObjectDirectivityCardioidBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObjectDirectivityCardioidBD calloc(MemoryStack stack) {
        return new XrSoundObjectDirectivityCardioidBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSoundObjectDirectivityCardioidBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDirectivityCardioidBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectDirectivityCardioidBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDirectivityCardioidBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSoundObjectDirectivityCardioidBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSoundObjectDirectivityCardioidBD.NEXT); }
    /** Unsafe version of {@link #alpha}. */
    public static float nalpha(long struct) { return memGetFloat(struct + XrSoundObjectDirectivityCardioidBD.ALPHA); }
    /** Unsafe version of {@link #order}. */
    public static float norder(long struct) { return memGetFloat(struct + XrSoundObjectDirectivityCardioidBD.ORDER); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSoundObjectDirectivityCardioidBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSoundObjectDirectivityCardioidBD.NEXT, value); }
    /** Unsafe version of {@link #alpha(float) alpha}. */
    public static void nalpha(long struct, float value) { memPutFloat(struct + XrSoundObjectDirectivityCardioidBD.ALPHA, value); }
    /** Unsafe version of {@link #order(float) order}. */
    public static void norder(long struct, float value) { memPutFloat(struct + XrSoundObjectDirectivityCardioidBD.ORDER, value); }

    // -----------------------------------

    /** An array of {@link XrSoundObjectDirectivityCardioidBD} structs. */
    public static class Buffer extends StructBuffer<XrSoundObjectDirectivityCardioidBD, Buffer> implements NativeResource {

        private static final XrSoundObjectDirectivityCardioidBD ELEMENT_FACTORY = XrSoundObjectDirectivityCardioidBD.create(-1L);

        /**
         * Creates a new {@code XrSoundObjectDirectivityCardioidBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSoundObjectDirectivityCardioidBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSoundObjectDirectivityCardioidBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSoundObjectDirectivityCardioidBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSoundObjectDirectivityCardioidBD.nnext(address()); }
        /** @return the value of the {@code alpha} field. */
        public float alpha() { return XrSoundObjectDirectivityCardioidBD.nalpha(address()); }
        /** @return the value of the {@code order} field. */
        public float order() { return XrSoundObjectDirectivityCardioidBD.norder(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSoundObjectDirectivityCardioidBD.Buffer type(@NativeType("XrStructureType") int value) { XrSoundObjectDirectivityCardioidBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBJECT_DIRECTIVITY_CARDIOID_BD TYPE_SOUND_OBJECT_DIRECTIVITY_CARDIOID_BD} value to the {@code type} field. */
        public XrSoundObjectDirectivityCardioidBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBJECT_DIRECTIVITY_CARDIOID_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSoundObjectDirectivityCardioidBD.Buffer next(@NativeType("void const *") long value) { XrSoundObjectDirectivityCardioidBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code alpha} field. */
        public XrSoundObjectDirectivityCardioidBD.Buffer alpha(float value) { XrSoundObjectDirectivityCardioidBD.nalpha(address(), value); return this; }
        /** Sets the specified value to the {@code order} field. */
        public XrSoundObjectDirectivityCardioidBD.Buffer order(float value) { XrSoundObjectDirectivityCardioidBD.norder(address(), value); return this; }

    }

}