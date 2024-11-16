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

/**
 * Describes the information to get eye gaze.
 * 
 * <h5>Description</h5>
 * 
 * <p>The application <b>should</b> request a time equal to the predicted display time for the rendered frame. The system will employ appropriate modeling to provide eye gaze at this time.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to using {@link XrEyeGazesInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBEyeTrackingSocial#XR_TYPE_EYE_GAZES_INFO_FB TYPE_EYE_GAZES_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBEyeTrackingSocial#xrGetEyeGazesFB GetEyeGazesFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEyeGazesInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #baseSpace};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrEyeGazesInfoFB extends Struct<XrEyeGazesInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        BASESPACE,
        TIME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        BASESPACE = layout.offsetof(2);
        TIME = layout.offsetof(3);
    }

    protected XrEyeGazesInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEyeGazesInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrEyeGazesInfoFB(address, container);
    }

    /**
     * Creates a {@code XrEyeGazesInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEyeGazesInfoFB(ByteBuffer container) {
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
    /** an {@code XrSpace} within which the returned eye poses will be represented. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** an {@code XrTime} at which the eye gaze information is requested. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEyeGazesInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBEyeTrackingSocial#XR_TYPE_EYE_GAZES_INFO_FB TYPE_EYE_GAZES_INFO_FB} value to the {@link #type} field. */
    public XrEyeGazesInfoFB type$Default() { return type(FBEyeTrackingSocial.XR_TYPE_EYE_GAZES_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEyeGazesInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #baseSpace} field. */
    public XrEyeGazesInfoFB baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrEyeGazesInfoFB time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEyeGazesInfoFB set(
        int type,
        long next,
        XrSpace baseSpace,
        long time
    ) {
        type(type);
        next(next);
        baseSpace(baseSpace);
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
    public XrEyeGazesInfoFB set(XrEyeGazesInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEyeGazesInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEyeGazesInfoFB malloc() {
        return new XrEyeGazesInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEyeGazesInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEyeGazesInfoFB calloc() {
        return new XrEyeGazesInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEyeGazesInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrEyeGazesInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEyeGazesInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEyeGazesInfoFB} instance for the specified memory address. */
    public static XrEyeGazesInfoFB create(long address) {
        return new XrEyeGazesInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEyeGazesInfoFB createSafe(long address) {
        return address == NULL ? null : new XrEyeGazesInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrEyeGazesInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazesInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazesInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEyeGazesInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEyeGazesInfoFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEyeGazesInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeGazesInfoFB malloc(MemoryStack stack) {
        return new XrEyeGazesInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEyeGazesInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeGazesInfoFB calloc(MemoryStack stack) {
        return new XrEyeGazesInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEyeGazesInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazesInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeGazesInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEyeGazesInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEyeGazesInfoFB.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrEyeGazesInfoFB.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrEyeGazesInfoFB.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEyeGazesInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEyeGazesInfoFB.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrEyeGazesInfoFB.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { memPutLong(struct + XrEyeGazesInfoFB.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrEyeGazesInfoFB.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrEyeGazesInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrEyeGazesInfoFB, Buffer> implements NativeResource {

        private static final XrEyeGazesInfoFB ELEMENT_FACTORY = XrEyeGazesInfoFB.create(-1L);

        /**
         * Creates a new {@code XrEyeGazesInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEyeGazesInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEyeGazesInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEyeGazesInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEyeGazesInfoFB.ntype(address()); }
        /** @return the value of the {@link XrEyeGazesInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrEyeGazesInfoFB.nnext(address()); }
        /** @return the value of the {@link XrEyeGazesInfoFB#baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrEyeGazesInfoFB.nbaseSpace(address()); }
        /** @return the value of the {@link XrEyeGazesInfoFB#time} field. */
        @NativeType("XrTime")
        public long time() { return XrEyeGazesInfoFB.ntime(address()); }

        /** Sets the specified value to the {@link XrEyeGazesInfoFB#type} field. */
        public XrEyeGazesInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrEyeGazesInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBEyeTrackingSocial#XR_TYPE_EYE_GAZES_INFO_FB TYPE_EYE_GAZES_INFO_FB} value to the {@link XrEyeGazesInfoFB#type} field. */
        public XrEyeGazesInfoFB.Buffer type$Default() { return type(FBEyeTrackingSocial.XR_TYPE_EYE_GAZES_INFO_FB); }
        /** Sets the specified value to the {@link XrEyeGazesInfoFB#next} field. */
        public XrEyeGazesInfoFB.Buffer next(@NativeType("void const *") long value) { XrEyeGazesInfoFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEyeGazesInfoFB#baseSpace} field. */
        public XrEyeGazesInfoFB.Buffer baseSpace(XrSpace value) { XrEyeGazesInfoFB.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@link XrEyeGazesInfoFB#time} field. */
        public XrEyeGazesInfoFB.Buffer time(@NativeType("XrTime") long value) { XrEyeGazesInfoFB.ntime(address(), value); return this; }

    }

}