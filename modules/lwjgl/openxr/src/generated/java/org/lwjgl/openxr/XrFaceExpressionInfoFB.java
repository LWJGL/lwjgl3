/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Describes the information to obtain facial expression.
 * 
 * <h5>Description</h5>
 * 
 * <p>Callers <b>should</b> request a time equal to the predicted display time for the rendered frame. The system will employ appropriate modeling to provide expressions for this time.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBFaceTracking XR_FB_face_tracking} extension <b>must</b> be enabled prior to using {@link XrFaceExpressionInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBFaceTracking#XR_TYPE_FACE_EXPRESSION_INFO_FB TYPE_FACE_EXPRESSION_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBFaceTracking#xrGetFaceExpressionWeightsFB GetFaceExpressionWeightsFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFaceExpressionInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrFaceExpressionInfoFB extends Struct<XrFaceExpressionInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        TIME = layout.offsetof(2);
    }

    protected XrFaceExpressionInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFaceExpressionInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrFaceExpressionInfoFB(address, container);
    }

    /**
     * Creates a {@code XrFaceExpressionInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFaceExpressionInfoFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** an {@code XrTime} at which the facial expression weights are requested. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFaceExpressionInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBFaceTracking#XR_TYPE_FACE_EXPRESSION_INFO_FB TYPE_FACE_EXPRESSION_INFO_FB} value to the {@link #type} field. */
    public XrFaceExpressionInfoFB type$Default() { return type(FBFaceTracking.XR_TYPE_FACE_EXPRESSION_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFaceExpressionInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrFaceExpressionInfoFB time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFaceExpressionInfoFB set(
        int type,
        long next,
        long time
    ) {
        type(type);
        next(next);
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
    public XrFaceExpressionInfoFB set(XrFaceExpressionInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFaceExpressionInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFaceExpressionInfoFB malloc() {
        return new XrFaceExpressionInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFaceExpressionInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFaceExpressionInfoFB calloc() {
        return new XrFaceExpressionInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFaceExpressionInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrFaceExpressionInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFaceExpressionInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrFaceExpressionInfoFB} instance for the specified memory address. */
    public static XrFaceExpressionInfoFB create(long address) {
        return new XrFaceExpressionInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFaceExpressionInfoFB createSafe(long address) {
        return address == NULL ? null : new XrFaceExpressionInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrFaceExpressionInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFaceExpressionInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFaceExpressionInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFaceExpressionInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceExpressionInfoFB malloc(MemoryStack stack) {
        return new XrFaceExpressionInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFaceExpressionInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFaceExpressionInfoFB calloc(MemoryStack stack) {
        return new XrFaceExpressionInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFaceExpressionInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFaceExpressionInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFaceExpressionInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFaceExpressionInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFaceExpressionInfoFB.NEXT); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrFaceExpressionInfoFB.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFaceExpressionInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFaceExpressionInfoFB.NEXT, value); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrFaceExpressionInfoFB.TIME, value); }

    // -----------------------------------

    /** An array of {@link XrFaceExpressionInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrFaceExpressionInfoFB, Buffer> implements NativeResource {

        private static final XrFaceExpressionInfoFB ELEMENT_FACTORY = XrFaceExpressionInfoFB.create(-1L);

        /**
         * Creates a new {@code XrFaceExpressionInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFaceExpressionInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFaceExpressionInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFaceExpressionInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFaceExpressionInfoFB.ntype(address()); }
        /** @return the value of the {@link XrFaceExpressionInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrFaceExpressionInfoFB.nnext(address()); }
        /** @return the value of the {@link XrFaceExpressionInfoFB#time} field. */
        @NativeType("XrTime")
        public long time() { return XrFaceExpressionInfoFB.ntime(address()); }

        /** Sets the specified value to the {@link XrFaceExpressionInfoFB#type} field. */
        public XrFaceExpressionInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrFaceExpressionInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBFaceTracking#XR_TYPE_FACE_EXPRESSION_INFO_FB TYPE_FACE_EXPRESSION_INFO_FB} value to the {@link XrFaceExpressionInfoFB#type} field. */
        public XrFaceExpressionInfoFB.Buffer type$Default() { return type(FBFaceTracking.XR_TYPE_FACE_EXPRESSION_INFO_FB); }
        /** Sets the specified value to the {@link XrFaceExpressionInfoFB#next} field. */
        public XrFaceExpressionInfoFB.Buffer next(@NativeType("void const *") long value) { XrFaceExpressionInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrFaceExpressionInfoFB#time} field. */
        public XrFaceExpressionInfoFB.Buffer time(@NativeType("XrTime") long value) { XrFaceExpressionInfoFB.ntime(address(), value); return this; }

    }

}