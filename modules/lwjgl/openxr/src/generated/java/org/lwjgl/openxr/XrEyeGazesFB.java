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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.openxr.FBEyeTrackingSocial.*;

/**
 * Returns the eye gaze directions.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to using {@link XrEyeGazesFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBEyeTrackingSocial#XR_TYPE_EYE_GAZES_FB TYPE_EYE_GAZES_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>Any given element of {@code gaze} <b>must</b> be a valid {@link XrEyeGazeFB} structure</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrEyeGazeFB}, {@link FBEyeTrackingSocial#xrGetEyeGazesFB GetEyeGazesFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEyeGazesFB {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     {@link XrEyeGazeFB XrEyeGazeFB} {@link #gaze}[XR_EYE_POSITION_COUNT_FB];
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrEyeGazesFB extends Struct<XrEyeGazesFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        GAZE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(XrEyeGazeFB.SIZEOF, XrEyeGazeFB.ALIGNOF, XR_EYE_POSITION_COUNT_FB),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        GAZE = layout.offsetof(2);
        TIME = layout.offsetof(3);
    }

    protected XrEyeGazesFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEyeGazesFB create(long address, @Nullable ByteBuffer container) {
        return new XrEyeGazesFB(address, container);
    }

    /**
     * Creates a {@code XrEyeGazesFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEyeGazesFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR or this extension. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** an array of {@link XrEyeGazeFB} receiving the returned eye gaze directions. */
    @NativeType("XrEyeGazeFB[XR_EYE_POSITION_COUNT_FB]")
    public XrEyeGazeFB.Buffer gaze() { return ngaze(address()); }
    /** an array of {@link XrEyeGazeFB} receiving the returned eye gaze directions. */
    public XrEyeGazeFB gaze(int index) { return ngaze(address(), index); }
    /** an {@code XrTime} time at which the returned eye gaze is tracked or extrapolated to. Equals the time for which the eye gaze was requested if the interpolation at the time was successful. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEyeGazesFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBEyeTrackingSocial#XR_TYPE_EYE_GAZES_FB TYPE_EYE_GAZES_FB} value to the {@link #type} field. */
    public XrEyeGazesFB type$Default() { return type(FBEyeTrackingSocial.XR_TYPE_EYE_GAZES_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEyeGazesFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Copies the specified {@link XrEyeGazeFB.Buffer} to the {@link #gaze} field. */
    public XrEyeGazesFB gaze(@NativeType("XrEyeGazeFB[XR_EYE_POSITION_COUNT_FB]") XrEyeGazeFB.Buffer value) { ngaze(address(), value); return this; }
    /** Copies the specified {@link XrEyeGazeFB} at the specified index of the {@link #gaze} field. */
    public XrEyeGazesFB gaze(int index, XrEyeGazeFB value) { ngaze(address(), index, value); return this; }
    /** Passes the {@link #gaze} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEyeGazesFB gaze(java.util.function.Consumer<XrEyeGazeFB.Buffer> consumer) { consumer.accept(gaze()); return this; }
    /** Passes the element at {@code index} of the {@link #gaze} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEyeGazesFB gaze(int index, java.util.function.Consumer<XrEyeGazeFB> consumer) { consumer.accept(gaze(index)); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrEyeGazesFB time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEyeGazesFB set(
        int type,
        long next,
        XrEyeGazeFB.Buffer gaze,
        long time
    ) {
        type(type);
        next(next);
        gaze(gaze);
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
    public XrEyeGazesFB set(XrEyeGazesFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEyeGazesFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEyeGazesFB malloc() {
        return new XrEyeGazesFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEyeGazesFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEyeGazesFB calloc() {
        return new XrEyeGazesFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEyeGazesFB} instance allocated with {@link BufferUtils}. */
    public static XrEyeGazesFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEyeGazesFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEyeGazesFB} instance for the specified memory address. */
    public static XrEyeGazesFB create(long address) {
        return new XrEyeGazesFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEyeGazesFB createSafe(long address) {
        return address == NULL ? null : new XrEyeGazesFB(address, null);
    }

    /**
     * Returns a new {@link XrEyeGazesFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazesFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazesFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEyeGazesFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEyeGazesFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEyeGazesFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeGazesFB malloc(MemoryStack stack) {
        return new XrEyeGazesFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEyeGazesFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeGazesFB calloc(MemoryStack stack) {
        return new XrEyeGazesFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEyeGazesFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazesFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEyeGazesFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEyeGazesFB.NEXT); }
    /** Unsafe version of {@link #gaze}. */
    public static XrEyeGazeFB.Buffer ngaze(long struct) { return XrEyeGazeFB.create(struct + XrEyeGazesFB.GAZE, XR_EYE_POSITION_COUNT_FB); }
    /** Unsafe version of {@link #gaze(int) gaze}. */
    public static XrEyeGazeFB ngaze(long struct, int index) {
        return XrEyeGazeFB.create(struct + XrEyeGazesFB.GAZE + check(index, XR_EYE_POSITION_COUNT_FB) * XrEyeGazeFB.SIZEOF);
    }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrEyeGazesFB.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEyeGazesFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEyeGazesFB.NEXT, value); }
    /** Unsafe version of {@link #gaze(XrEyeGazeFB.Buffer) gaze}. */
    public static void ngaze(long struct, XrEyeGazeFB.Buffer value) {
        if (CHECKS) { checkGT(value, XR_EYE_POSITION_COUNT_FB); }
        memCopy(value.address(), struct + XrEyeGazesFB.GAZE, value.remaining() * XrEyeGazeFB.SIZEOF);
    }
    /** Unsafe version of {@link #gaze(int, XrEyeGazeFB) gaze}. */
    public static void ngaze(long struct, int index, XrEyeGazeFB value) {
        memCopy(value.address(), struct + XrEyeGazesFB.GAZE + check(index, XR_EYE_POSITION_COUNT_FB) * XrEyeGazeFB.SIZEOF, XrEyeGazeFB.SIZEOF);
    }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrEyeGazesFB.TIME, value); }

    // -----------------------------------

    /** An array of {@link XrEyeGazesFB} structs. */
    public static class Buffer extends StructBuffer<XrEyeGazesFB, Buffer> implements NativeResource {

        private static final XrEyeGazesFB ELEMENT_FACTORY = XrEyeGazesFB.create(-1L);

        /**
         * Creates a new {@code XrEyeGazesFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEyeGazesFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEyeGazesFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEyeGazesFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEyeGazesFB.ntype(address()); }
        /** @return the value of the {@link XrEyeGazesFB#next} field. */
        @NativeType("void *")
        public long next() { return XrEyeGazesFB.nnext(address()); }
        /** @return a {@link XrEyeGazeFB}.Buffer view of the {@link XrEyeGazesFB#gaze} field. */
        @NativeType("XrEyeGazeFB[XR_EYE_POSITION_COUNT_FB]")
        public XrEyeGazeFB.Buffer gaze() { return XrEyeGazesFB.ngaze(address()); }
        /** @return a {@link XrEyeGazeFB} view of the struct at the specified index of the {@link XrEyeGazesFB#gaze} field. */
        public XrEyeGazeFB gaze(int index) { return XrEyeGazesFB.ngaze(address(), index); }
        /** @return the value of the {@link XrEyeGazesFB#time} field. */
        @NativeType("XrTime")
        public long time() { return XrEyeGazesFB.ntime(address()); }

        /** Sets the specified value to the {@link XrEyeGazesFB#type} field. */
        public XrEyeGazesFB.Buffer type(@NativeType("XrStructureType") int value) { XrEyeGazesFB.ntype(address(), value); return this; }
        /** Sets the {@link FBEyeTrackingSocial#XR_TYPE_EYE_GAZES_FB TYPE_EYE_GAZES_FB} value to the {@link XrEyeGazesFB#type} field. */
        public XrEyeGazesFB.Buffer type$Default() { return type(FBEyeTrackingSocial.XR_TYPE_EYE_GAZES_FB); }
        /** Sets the specified value to the {@link XrEyeGazesFB#next} field. */
        public XrEyeGazesFB.Buffer next(@NativeType("void *") long value) { XrEyeGazesFB.nnext(address(), value); return this; }
        /** Copies the specified {@link XrEyeGazeFB.Buffer} to the {@link XrEyeGazesFB#gaze} field. */
        public XrEyeGazesFB.Buffer gaze(@NativeType("XrEyeGazeFB[XR_EYE_POSITION_COUNT_FB]") XrEyeGazeFB.Buffer value) { XrEyeGazesFB.ngaze(address(), value); return this; }
        /** Copies the specified {@link XrEyeGazeFB} at the specified index of the {@link XrEyeGazesFB#gaze} field. */
        public XrEyeGazesFB.Buffer gaze(int index, XrEyeGazeFB value) { XrEyeGazesFB.ngaze(address(), index, value); return this; }
        /** Passes the {@link XrEyeGazesFB#gaze} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEyeGazesFB.Buffer gaze(java.util.function.Consumer<XrEyeGazeFB.Buffer> consumer) { consumer.accept(gaze()); return this; }
        /** Passes the element at {@code index} of the {@link XrEyeGazesFB#gaze} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEyeGazesFB.Buffer gaze(int index, java.util.function.Consumer<XrEyeGazeFB> consumer) { consumer.accept(gaze(index)); return this; }
        /** Sets the specified value to the {@link XrEyeGazesFB#time} field. */
        public XrEyeGazesFB.Buffer time(@NativeType("XrTime") long value) { XrEyeGazesFB.ntime(address(), value); return this; }

    }

}