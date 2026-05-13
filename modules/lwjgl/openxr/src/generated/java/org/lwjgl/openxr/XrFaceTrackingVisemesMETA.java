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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.openxr.METAFaceTrackingVisemes.*;

/**
 * <pre>{@code
 * struct XrFaceTrackingVisemesMETA {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 isValid;
 *     float visemes[XR_FACE_TRACKING_VISEME_COUNT_META];
 * }}</pre>
 */
public class XrFaceTrackingVisemesMETA extends Struct<XrFaceTrackingVisemesMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ISVALID,
        VISEMES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __array(4, XR_FACE_TRACKING_VISEME_COUNT_META)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ISVALID = layout.offsetof(2);
        VISEMES = layout.offsetof(3);
    }

    protected XrFaceTrackingVisemesMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFaceTrackingVisemesMETA create(long address, @Nullable ByteBuffer container) {
        return new XrFaceTrackingVisemesMETA(address, container);
    }

    /**
     * Creates a {@code XrFaceTrackingVisemesMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFaceTrackingVisemesMETA(ByteBuffer container) {
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
    /** @return the value of the {@code isValid} field. */
    @NativeType("XrBool32")
    public boolean isValid() { return nisValid(address()) != 0; }
    /** @return a {@link FloatBuffer} view of the {@code visemes} field. */
    @NativeType("float[XR_FACE_TRACKING_VISEME_COUNT_META]")
    public FloatBuffer visemes() { return nvisemes(address()); }
    /** @return the value at the specified index of the {@code visemes} field. */
    public float visemes(int index) { return nvisemes(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public XrFaceTrackingVisemesMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAFaceTrackingVisemes#XR_TYPE_FACE_TRACKING_VISEMES_META TYPE_FACE_TRACKING_VISEMES_META} value to the {@code type} field. */
    public XrFaceTrackingVisemesMETA type$Default() { return type(METAFaceTrackingVisemes.XR_TYPE_FACE_TRACKING_VISEMES_META); }
    /** Sets the specified value to the {@code next} field. */
    public XrFaceTrackingVisemesMETA next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code isValid} field. */
    public XrFaceTrackingVisemesMETA isValid(@NativeType("XrBool32") boolean value) { nisValid(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link FloatBuffer} to the {@code visemes} field. */
    public XrFaceTrackingVisemesMETA visemes(@NativeType("float[XR_FACE_TRACKING_VISEME_COUNT_META]") FloatBuffer value) { nvisemes(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code visemes} field. */
    public XrFaceTrackingVisemesMETA visemes(int index, float value) { nvisemes(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFaceTrackingVisemesMETA set(
        int type,
        long next,
        boolean isValid,
        FloatBuffer visemes
    ) {
        type(type);
        next(next);
        isValid(isValid);
        visemes(visemes);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFaceTrackingVisemesMETA set(XrFaceTrackingVisemesMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFaceTrackingVisemesMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFaceTrackingVisemesMETA malloc() {
        return new XrFaceTrackingVisemesMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFaceTrackingVisemesMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFaceTrackingVisemesMETA calloc() {
        return new XrFaceTrackingVisemesMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFaceTrackingVisemesMETA} instance allocated with {@link BufferUtils}. */
    public static XrFaceTrackingVisemesMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFaceTrackingVisemesMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrFaceTrackingVisemesMETA} instance for the specified memory address. */
    public static XrFaceTrackingVisemesMETA create(long address) {
        return new XrFaceTrackingVisemesMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFaceTrackingVisemesMETA createSafe(long address) {
        return address == NULL ? null : new XrFaceTrackingVisemesMETA(address, null);
    }

    /**
     * Returns a new {@link XrFaceTrackingVisemesMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackingVisemesMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackingVisemesMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackingVisemesMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackingVisemesMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackingVisemesMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFaceTrackingVisemesMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackingVisemesMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFaceTrackingVisemesMETA.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFaceTrackingVisemesMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceTrackingVisemesMETA malloc(MemoryStack stack) {
        return new XrFaceTrackingVisemesMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFaceTrackingVisemesMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceTrackingVisemesMETA calloc(MemoryStack stack) {
        return new XrFaceTrackingVisemesMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFaceTrackingVisemesMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackingVisemesMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceTrackingVisemesMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceTrackingVisemesMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFaceTrackingVisemesMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFaceTrackingVisemesMETA.NEXT); }
    /** Unsafe version of {@link #isValid}. */
    public static int nisValid(long struct) { return memGetInt(struct + XrFaceTrackingVisemesMETA.ISVALID); }
    /** Unsafe version of {@link #visemes}. */
    public static FloatBuffer nvisemes(long struct) { return memFloatBuffer(struct + XrFaceTrackingVisemesMETA.VISEMES, XR_FACE_TRACKING_VISEME_COUNT_META); }
    /** Unsafe version of {@link #visemes(int) visemes}. */
    public static float nvisemes(long struct, int index) {
        return memGetFloat(struct + XrFaceTrackingVisemesMETA.VISEMES + check(index, XR_FACE_TRACKING_VISEME_COUNT_META) * 4);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFaceTrackingVisemesMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFaceTrackingVisemesMETA.NEXT, value); }
    /** Unsafe version of {@link #isValid(boolean) isValid}. */
    public static void nisValid(long struct, int value) { memPutInt(struct + XrFaceTrackingVisemesMETA.ISVALID, value); }
    /** Unsafe version of {@link #visemes(FloatBuffer) visemes}. */
    public static void nvisemes(long struct, FloatBuffer value) {
        if (CHECKS) { checkGT(value, XR_FACE_TRACKING_VISEME_COUNT_META); }
        memCopy(memAddress(value), struct + XrFaceTrackingVisemesMETA.VISEMES, value.remaining() * 4);
    }
    /** Unsafe version of {@link #visemes(int, float) visemes}. */
    public static void nvisemes(long struct, int index, float value) {
        memPutFloat(struct + XrFaceTrackingVisemesMETA.VISEMES + check(index, XR_FACE_TRACKING_VISEME_COUNT_META) * 4, value);
    }

    // -----------------------------------

    /** An array of {@link XrFaceTrackingVisemesMETA} structs. */
    public static class Buffer extends StructBuffer<XrFaceTrackingVisemesMETA, Buffer> implements NativeResource {

        private static final XrFaceTrackingVisemesMETA ELEMENT_FACTORY = XrFaceTrackingVisemesMETA.create(-1L);

        /**
         * Creates a new {@code XrFaceTrackingVisemesMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFaceTrackingVisemesMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFaceTrackingVisemesMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFaceTrackingVisemesMETA.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrFaceTrackingVisemesMETA.nnext(address()); }
        /** @return the value of the {@code isValid} field. */
        @NativeType("XrBool32")
        public boolean isValid() { return XrFaceTrackingVisemesMETA.nisValid(address()) != 0; }
        /** @return a {@link FloatBuffer} view of the {@code visemes} field. */
        @NativeType("float[XR_FACE_TRACKING_VISEME_COUNT_META]")
        public FloatBuffer visemes() { return XrFaceTrackingVisemesMETA.nvisemes(address()); }
        /** @return the value at the specified index of the {@code visemes} field. */
        public float visemes(int index) { return XrFaceTrackingVisemesMETA.nvisemes(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public XrFaceTrackingVisemesMETA.Buffer type(@NativeType("XrStructureType") int value) { XrFaceTrackingVisemesMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAFaceTrackingVisemes#XR_TYPE_FACE_TRACKING_VISEMES_META TYPE_FACE_TRACKING_VISEMES_META} value to the {@code type} field. */
        public XrFaceTrackingVisemesMETA.Buffer type$Default() { return type(METAFaceTrackingVisemes.XR_TYPE_FACE_TRACKING_VISEMES_META); }
        /** Sets the specified value to the {@code next} field. */
        public XrFaceTrackingVisemesMETA.Buffer next(@NativeType("void const *") long value) { XrFaceTrackingVisemesMETA.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code isValid} field. */
        public XrFaceTrackingVisemesMETA.Buffer isValid(@NativeType("XrBool32") boolean value) { XrFaceTrackingVisemesMETA.nisValid(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link FloatBuffer} to the {@code visemes} field. */
        public XrFaceTrackingVisemesMETA.Buffer visemes(@NativeType("float[XR_FACE_TRACKING_VISEME_COUNT_META]") FloatBuffer value) { XrFaceTrackingVisemesMETA.nvisemes(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code visemes} field. */
        public XrFaceTrackingVisemesMETA.Buffer visemes(int index, float value) { XrFaceTrackingVisemesMETA.nvisemes(address(), index, value); return this; }

    }

}