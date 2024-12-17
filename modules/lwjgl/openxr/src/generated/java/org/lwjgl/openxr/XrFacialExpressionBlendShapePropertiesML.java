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
 * struct XrFacialExpressionBlendShapePropertiesML {
 *     XrStructureType type;
 *     void * next;
 *     XrFacialBlendShapeML requestedFacialBlendShape;
 *     float weight;
 *     XrFacialExpressionBlendShapePropertiesFlagsML flags;
 *     XrTime time;
 * }}</pre>
 */
public class XrFacialExpressionBlendShapePropertiesML extends Struct<XrFacialExpressionBlendShapePropertiesML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        REQUESTEDFACIALBLENDSHAPE,
        WEIGHT,
        FLAGS,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(8),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        REQUESTEDFACIALBLENDSHAPE = layout.offsetof(2);
        WEIGHT = layout.offsetof(3);
        FLAGS = layout.offsetof(4);
        TIME = layout.offsetof(5);
    }

    protected XrFacialExpressionBlendShapePropertiesML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFacialExpressionBlendShapePropertiesML create(long address, @Nullable ByteBuffer container) {
        return new XrFacialExpressionBlendShapePropertiesML(address, container);
    }

    /**
     * Creates a {@code XrFacialExpressionBlendShapePropertiesML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFacialExpressionBlendShapePropertiesML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code requestedFacialBlendShape} field. */
    @NativeType("XrFacialBlendShapeML")
    public int requestedFacialBlendShape() { return nrequestedFacialBlendShape(address()); }
    /** @return the value of the {@code weight} field. */
    public float weight() { return nweight(address()); }
    /** @return the value of the {@code flags} field. */
    @NativeType("XrFacialExpressionBlendShapePropertiesFlagsML")
    public long flags() { return nflags(address()); }
    /** @return the value of the {@code time} field. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrFacialExpressionBlendShapePropertiesML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLFacialExpression#XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML} value to the {@code type} field. */
    public XrFacialExpressionBlendShapePropertiesML type$Default() { return type(MLFacialExpression.XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML); }
    /** Sets the specified value to the {@code next} field. */
    public XrFacialExpressionBlendShapePropertiesML next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code requestedFacialBlendShape} field. */
    public XrFacialExpressionBlendShapePropertiesML requestedFacialBlendShape(@NativeType("XrFacialBlendShapeML") int value) { nrequestedFacialBlendShape(address(), value); return this; }
    /** Sets the specified value to the {@code weight} field. */
    public XrFacialExpressionBlendShapePropertiesML weight(float value) { nweight(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public XrFacialExpressionBlendShapePropertiesML flags(@NativeType("XrFacialExpressionBlendShapePropertiesFlagsML") long value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code time} field. */
    public XrFacialExpressionBlendShapePropertiesML time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFacialExpressionBlendShapePropertiesML set(
        int type,
        long next,
        int requestedFacialBlendShape,
        float weight,
        long flags,
        long time
    ) {
        type(type);
        next(next);
        requestedFacialBlendShape(requestedFacialBlendShape);
        weight(weight);
        flags(flags);
        time(time);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFacialExpressionBlendShapePropertiesML set(XrFacialExpressionBlendShapePropertiesML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFacialExpressionBlendShapePropertiesML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFacialExpressionBlendShapePropertiesML malloc() {
        return new XrFacialExpressionBlendShapePropertiesML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFacialExpressionBlendShapePropertiesML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFacialExpressionBlendShapePropertiesML calloc() {
        return new XrFacialExpressionBlendShapePropertiesML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFacialExpressionBlendShapePropertiesML} instance allocated with {@link BufferUtils}. */
    public static XrFacialExpressionBlendShapePropertiesML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFacialExpressionBlendShapePropertiesML(memAddress(container), container);
    }

    /** Returns a new {@code XrFacialExpressionBlendShapePropertiesML} instance for the specified memory address. */
    public static XrFacialExpressionBlendShapePropertiesML create(long address) {
        return new XrFacialExpressionBlendShapePropertiesML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrFacialExpressionBlendShapePropertiesML createSafe(long address) {
        return address == NULL ? null : new XrFacialExpressionBlendShapePropertiesML(address, null);
    }

    /**
     * Returns a new {@link XrFacialExpressionBlendShapePropertiesML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapePropertiesML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionBlendShapePropertiesML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapePropertiesML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionBlendShapePropertiesML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapePropertiesML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFacialExpressionBlendShapePropertiesML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapePropertiesML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrFacialExpressionBlendShapePropertiesML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFacialExpressionBlendShapePropertiesML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialExpressionBlendShapePropertiesML malloc(MemoryStack stack) {
        return new XrFacialExpressionBlendShapePropertiesML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFacialExpressionBlendShapePropertiesML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialExpressionBlendShapePropertiesML calloc(MemoryStack stack) {
        return new XrFacialExpressionBlendShapePropertiesML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFacialExpressionBlendShapePropertiesML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapePropertiesML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialExpressionBlendShapePropertiesML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialExpressionBlendShapePropertiesML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrFacialExpressionBlendShapePropertiesML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFacialExpressionBlendShapePropertiesML.NEXT); }
    /** Unsafe version of {@link #requestedFacialBlendShape}. */
    public static int nrequestedFacialBlendShape(long struct) { return memGetInt(struct + XrFacialExpressionBlendShapePropertiesML.REQUESTEDFACIALBLENDSHAPE); }
    /** Unsafe version of {@link #weight}. */
    public static float nweight(long struct) { return memGetFloat(struct + XrFacialExpressionBlendShapePropertiesML.WEIGHT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return memGetLong(struct + XrFacialExpressionBlendShapePropertiesML.FLAGS); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrFacialExpressionBlendShapePropertiesML.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrFacialExpressionBlendShapePropertiesML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFacialExpressionBlendShapePropertiesML.NEXT, value); }
    /** Unsafe version of {@link #requestedFacialBlendShape(int) requestedFacialBlendShape}. */
    public static void nrequestedFacialBlendShape(long struct, int value) { memPutInt(struct + XrFacialExpressionBlendShapePropertiesML.REQUESTEDFACIALBLENDSHAPE, value); }
    /** Unsafe version of {@link #weight(float) weight}. */
    public static void nweight(long struct, float value) { memPutFloat(struct + XrFacialExpressionBlendShapePropertiesML.WEIGHT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { memPutLong(struct + XrFacialExpressionBlendShapePropertiesML.FLAGS, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrFacialExpressionBlendShapePropertiesML.TIME, value); }

    // -----------------------------------

    /** An array of {@link XrFacialExpressionBlendShapePropertiesML} structs. */
    public static class Buffer extends StructBuffer<XrFacialExpressionBlendShapePropertiesML, Buffer> implements NativeResource {

        private static final XrFacialExpressionBlendShapePropertiesML ELEMENT_FACTORY = XrFacialExpressionBlendShapePropertiesML.create(-1L);

        /**
         * Creates a new {@code XrFacialExpressionBlendShapePropertiesML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFacialExpressionBlendShapePropertiesML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFacialExpressionBlendShapePropertiesML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFacialExpressionBlendShapePropertiesML.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrFacialExpressionBlendShapePropertiesML.nnext(address()); }
        /** @return the value of the {@code requestedFacialBlendShape} field. */
        @NativeType("XrFacialBlendShapeML")
        public int requestedFacialBlendShape() { return XrFacialExpressionBlendShapePropertiesML.nrequestedFacialBlendShape(address()); }
        /** @return the value of the {@code weight} field. */
        public float weight() { return XrFacialExpressionBlendShapePropertiesML.nweight(address()); }
        /** @return the value of the {@code flags} field. */
        @NativeType("XrFacialExpressionBlendShapePropertiesFlagsML")
        public long flags() { return XrFacialExpressionBlendShapePropertiesML.nflags(address()); }
        /** @return the value of the {@code time} field. */
        @NativeType("XrTime")
        public long time() { return XrFacialExpressionBlendShapePropertiesML.ntime(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrFacialExpressionBlendShapePropertiesML.Buffer type(@NativeType("XrStructureType") int value) { XrFacialExpressionBlendShapePropertiesML.ntype(address(), value); return this; }
        /** Sets the {@link MLFacialExpression#XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML} value to the {@code type} field. */
        public XrFacialExpressionBlendShapePropertiesML.Buffer type$Default() { return type(MLFacialExpression.XR_TYPE_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_ML); }
        /** Sets the specified value to the {@code next} field. */
        public XrFacialExpressionBlendShapePropertiesML.Buffer next(@NativeType("void *") long value) { XrFacialExpressionBlendShapePropertiesML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code requestedFacialBlendShape} field. */
        public XrFacialExpressionBlendShapePropertiesML.Buffer requestedFacialBlendShape(@NativeType("XrFacialBlendShapeML") int value) { XrFacialExpressionBlendShapePropertiesML.nrequestedFacialBlendShape(address(), value); return this; }
        /** Sets the specified value to the {@code weight} field. */
        public XrFacialExpressionBlendShapePropertiesML.Buffer weight(float value) { XrFacialExpressionBlendShapePropertiesML.nweight(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public XrFacialExpressionBlendShapePropertiesML.Buffer flags(@NativeType("XrFacialExpressionBlendShapePropertiesFlagsML") long value) { XrFacialExpressionBlendShapePropertiesML.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code time} field. */
        public XrFacialExpressionBlendShapePropertiesML.Buffer time(@NativeType("XrTime") long value) { XrFacialExpressionBlendShapePropertiesML.ntime(address(), value); return this; }

    }

}