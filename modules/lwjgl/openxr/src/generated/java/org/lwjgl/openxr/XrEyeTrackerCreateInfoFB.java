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
 * Information to create an eye gaze handle.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrEyeTrackerCreateInfoFB} structure describes the information to create an {@code XrEyeTrackerFB} handle.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link FBEyeTrackingSocial XR_FB_eye_tracking_social} extension <b>must</b> be enabled prior to using {@link XrEyeTrackerCreateInfoFB}</li>
 * <li>{@code type} <b>must</b> be {@link FBEyeTrackingSocial#XR_TYPE_EYE_TRACKER_CREATE_INFO_FB TYPE_EYE_TRACKER_CREATE_INFO_FB}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link FBEyeTrackingSocial#xrCreateEyeTrackerFB CreateEyeTrackerFB}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEyeTrackerCreateInfoFB {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 * }</code></pre>
 */
public class XrEyeTrackerCreateInfoFB extends Struct<XrEyeTrackerCreateInfoFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    protected XrEyeTrackerCreateInfoFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEyeTrackerCreateInfoFB create(long address, @Nullable ByteBuffer container) {
        return new XrEyeTrackerCreateInfoFB(address, container);
    }

    /**
     * Creates a {@code XrEyeTrackerCreateInfoFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEyeTrackerCreateInfoFB(ByteBuffer container) {
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

    /** Sets the specified value to the {@link #type} field. */
    public XrEyeTrackerCreateInfoFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBEyeTrackingSocial#XR_TYPE_EYE_TRACKER_CREATE_INFO_FB TYPE_EYE_TRACKER_CREATE_INFO_FB} value to the {@link #type} field. */
    public XrEyeTrackerCreateInfoFB type$Default() { return type(FBEyeTrackingSocial.XR_TYPE_EYE_TRACKER_CREATE_INFO_FB); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEyeTrackerCreateInfoFB next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEyeTrackerCreateInfoFB set(
        int type,
        long next
    ) {
        type(type);
        next(next);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEyeTrackerCreateInfoFB set(XrEyeTrackerCreateInfoFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEyeTrackerCreateInfoFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEyeTrackerCreateInfoFB malloc() {
        return new XrEyeTrackerCreateInfoFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEyeTrackerCreateInfoFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEyeTrackerCreateInfoFB calloc() {
        return new XrEyeTrackerCreateInfoFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEyeTrackerCreateInfoFB} instance allocated with {@link BufferUtils}. */
    public static XrEyeTrackerCreateInfoFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEyeTrackerCreateInfoFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEyeTrackerCreateInfoFB} instance for the specified memory address. */
    public static XrEyeTrackerCreateInfoFB create(long address) {
        return new XrEyeTrackerCreateInfoFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEyeTrackerCreateInfoFB createSafe(long address) {
        return address == NULL ? null : new XrEyeTrackerCreateInfoFB(address, null);
    }

    /**
     * Returns a new {@link XrEyeTrackerCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeTrackerCreateInfoFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEyeTrackerCreateInfoFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeTrackerCreateInfoFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeTrackerCreateInfoFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeTrackerCreateInfoFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEyeTrackerCreateInfoFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEyeTrackerCreateInfoFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEyeTrackerCreateInfoFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEyeTrackerCreateInfoFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeTrackerCreateInfoFB malloc(MemoryStack stack) {
        return new XrEyeTrackerCreateInfoFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEyeTrackerCreateInfoFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeTrackerCreateInfoFB calloc(MemoryStack stack) {
        return new XrEyeTrackerCreateInfoFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEyeTrackerCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeTrackerCreateInfoFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeTrackerCreateInfoFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeTrackerCreateInfoFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEyeTrackerCreateInfoFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEyeTrackerCreateInfoFB.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEyeTrackerCreateInfoFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEyeTrackerCreateInfoFB.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEyeTrackerCreateInfoFB} structs. */
    public static class Buffer extends StructBuffer<XrEyeTrackerCreateInfoFB, Buffer> implements NativeResource {

        private static final XrEyeTrackerCreateInfoFB ELEMENT_FACTORY = XrEyeTrackerCreateInfoFB.create(-1L);

        /**
         * Creates a new {@code XrEyeTrackerCreateInfoFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEyeTrackerCreateInfoFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEyeTrackerCreateInfoFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEyeTrackerCreateInfoFB#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEyeTrackerCreateInfoFB.ntype(address()); }
        /** @return the value of the {@link XrEyeTrackerCreateInfoFB#next} field. */
        @NativeType("void const *")
        public long next() { return XrEyeTrackerCreateInfoFB.nnext(address()); }

        /** Sets the specified value to the {@link XrEyeTrackerCreateInfoFB#type} field. */
        public XrEyeTrackerCreateInfoFB.Buffer type(@NativeType("XrStructureType") int value) { XrEyeTrackerCreateInfoFB.ntype(address(), value); return this; }
        /** Sets the {@link FBEyeTrackingSocial#XR_TYPE_EYE_TRACKER_CREATE_INFO_FB TYPE_EYE_TRACKER_CREATE_INFO_FB} value to the {@link XrEyeTrackerCreateInfoFB#type} field. */
        public XrEyeTrackerCreateInfoFB.Buffer type$Default() { return type(FBEyeTrackingSocial.XR_TYPE_EYE_TRACKER_CREATE_INFO_FB); }
        /** Sets the specified value to the {@link XrEyeTrackerCreateInfoFB#next} field. */
        public XrEyeTrackerCreateInfoFB.Buffer next(@NativeType("void const *") long value) { XrEyeTrackerCreateInfoFB.nnext(address(), value); return this; }

    }

}