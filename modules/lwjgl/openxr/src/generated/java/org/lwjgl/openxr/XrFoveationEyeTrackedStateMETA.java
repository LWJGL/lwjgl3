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

import static org.lwjgl.openxr.METAFoveationEyeTracked.*;

/**
 * Foveation data returned from the runtime.
 * 
 * <h5>Description</h5>
 * 
 * <p>{@link XrFoveationEyeTrackedStateMETA} <b>must</b> be provided when calling {@link METAFoveationEyeTracked#xrGetFoveationEyeTrackedStateMETA GetFoveationEyeTrackedStateMETA}. The runtime <b>must</b> interpret {@link XrFoveationEyeTrackedStateMETA} without any additional structs in its {@code next} chain in order to query eye tracked foveation state, e.g. the center of the foveal region.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link METAFoveationEyeTracked XR_META_foveation_eye_tracked} extension <b>must</b> be enabled prior to using {@link XrFoveationEyeTrackedStateMETA}</li>
 * <li>{@code type} <b>must</b> be {@link METAFoveationEyeTracked#XR_TYPE_FOVEATION_EYE_TRACKED_STATE_META TYPE_FOVEATION_EYE_TRACKED_STATE_META}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrVector2f}, {@link METAFoveationEyeTracked#xrGetFoveationEyeTrackedStateMETA GetFoveationEyeTrackedStateMETA}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFoveationEyeTrackedStateMETA {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     {@link XrVector2f XrVector2f} {@link #foveationCenter}[XR_FOVEATION_CENTER_SIZE_META];
 *     XrFoveationEyeTrackedStateFlagsMETA {@link #flags};
 * }</code></pre>
 */
public class XrFoveationEyeTrackedStateMETA extends Struct<XrFoveationEyeTrackedStateMETA> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FOVEATIONCENTER,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __array(XrVector2f.SIZEOF, XrVector2f.ALIGNOF, XR_FOVEATION_CENTER_SIZE_META),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FOVEATIONCENTER = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected XrFoveationEyeTrackedStateMETA(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFoveationEyeTrackedStateMETA create(long address, @Nullable ByteBuffer container) {
        return new XrFoveationEyeTrackedStateMETA(address, container);
    }

    /**
     * Creates a {@code XrFoveationEyeTrackedStateMETA} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFoveationEyeTrackedStateMETA(ByteBuffer container) {
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
    /** the center of the foveal region defined in NDC space in the range of -1 to 1 for both eyes. */
    @NativeType("XrVector2f[XR_FOVEATION_CENTER_SIZE_META]")
    public XrVector2f.Buffer foveationCenter() { return nfoveationCenter(address()); }
    /** the center of the foveal region defined in NDC space in the range of -1 to 1 for both eyes. */
    public XrVector2f foveationCenter(int index) { return nfoveationCenter(address(), index); }
    /** a bitmask of {@code XrFoveationEyeTrackedStateFlagBitsMETA} which indicates various characteristics for current foveation state. */
    @NativeType("XrFoveationEyeTrackedStateFlagsMETA")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFoveationEyeTrackedStateMETA type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link METAFoveationEyeTracked#XR_TYPE_FOVEATION_EYE_TRACKED_STATE_META TYPE_FOVEATION_EYE_TRACKED_STATE_META} value to the {@link #type} field. */
    public XrFoveationEyeTrackedStateMETA type$Default() { return type(METAFoveationEyeTracked.XR_TYPE_FOVEATION_EYE_TRACKED_STATE_META); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFoveationEyeTrackedStateMETA next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFoveationEyeTrackedStateMETA set(
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
    public XrFoveationEyeTrackedStateMETA set(XrFoveationEyeTrackedStateMETA src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFoveationEyeTrackedStateMETA} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFoveationEyeTrackedStateMETA malloc() {
        return new XrFoveationEyeTrackedStateMETA(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationEyeTrackedStateMETA} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFoveationEyeTrackedStateMETA calloc() {
        return new XrFoveationEyeTrackedStateMETA(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFoveationEyeTrackedStateMETA} instance allocated with {@link BufferUtils}. */
    public static XrFoveationEyeTrackedStateMETA create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFoveationEyeTrackedStateMETA(memAddress(container), container);
    }

    /** Returns a new {@code XrFoveationEyeTrackedStateMETA} instance for the specified memory address. */
    public static XrFoveationEyeTrackedStateMETA create(long address) {
        return new XrFoveationEyeTrackedStateMETA(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationEyeTrackedStateMETA createSafe(long address) {
        return address == NULL ? null : new XrFoveationEyeTrackedStateMETA(address, null);
    }

    /**
     * Returns a new {@link XrFoveationEyeTrackedStateMETA.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedStateMETA.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFoveationEyeTrackedStateMETA.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedStateMETA.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationEyeTrackedStateMETA.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedStateMETA.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFoveationEyeTrackedStateMETA.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedStateMETA.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFoveationEyeTrackedStateMETA.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFoveationEyeTrackedStateMETA} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationEyeTrackedStateMETA malloc(MemoryStack stack) {
        return new XrFoveationEyeTrackedStateMETA(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFoveationEyeTrackedStateMETA} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFoveationEyeTrackedStateMETA calloc(MemoryStack stack) {
        return new XrFoveationEyeTrackedStateMETA(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFoveationEyeTrackedStateMETA.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedStateMETA.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFoveationEyeTrackedStateMETA.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFoveationEyeTrackedStateMETA.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFoveationEyeTrackedStateMETA.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFoveationEyeTrackedStateMETA.NEXT); }
    /** Unsafe version of {@link #foveationCenter}. */
    public static XrVector2f.Buffer nfoveationCenter(long struct) { return XrVector2f.create(struct + XrFoveationEyeTrackedStateMETA.FOVEATIONCENTER, XR_FOVEATION_CENTER_SIZE_META); }
    /** Unsafe version of {@link #foveationCenter(int) foveationCenter}. */
    public static XrVector2f nfoveationCenter(long struct, int index) {
        return XrVector2f.create(struct + XrFoveationEyeTrackedStateMETA.FOVEATIONCENTER + check(index, XR_FOVEATION_CENTER_SIZE_META) * XrVector2f.SIZEOF);
    }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrFoveationEyeTrackedStateMETA.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFoveationEyeTrackedStateMETA.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFoveationEyeTrackedStateMETA.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrFoveationEyeTrackedStateMETA} structs. */
    public static class Buffer extends StructBuffer<XrFoveationEyeTrackedStateMETA, Buffer> implements NativeResource {

        private static final XrFoveationEyeTrackedStateMETA ELEMENT_FACTORY = XrFoveationEyeTrackedStateMETA.create(-1L);

        /**
         * Creates a new {@code XrFoveationEyeTrackedStateMETA.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFoveationEyeTrackedStateMETA#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFoveationEyeTrackedStateMETA getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFoveationEyeTrackedStateMETA#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFoveationEyeTrackedStateMETA.ntype(address()); }
        /** @return the value of the {@link XrFoveationEyeTrackedStateMETA#next} field. */
        @NativeType("void *")
        public long next() { return XrFoveationEyeTrackedStateMETA.nnext(address()); }
        /** @return a {@link XrVector2f}.Buffer view of the {@link XrFoveationEyeTrackedStateMETA#foveationCenter} field. */
        @NativeType("XrVector2f[XR_FOVEATION_CENTER_SIZE_META]")
        public XrVector2f.Buffer foveationCenter() { return XrFoveationEyeTrackedStateMETA.nfoveationCenter(address()); }
        /** @return a {@link XrVector2f} view of the struct at the specified index of the {@link XrFoveationEyeTrackedStateMETA#foveationCenter} field. */
        public XrVector2f foveationCenter(int index) { return XrFoveationEyeTrackedStateMETA.nfoveationCenter(address(), index); }
        /** @return the value of the {@link XrFoveationEyeTrackedStateMETA#flags} field. */
        @NativeType("XrFoveationEyeTrackedStateFlagsMETA")
        public long flags() { return XrFoveationEyeTrackedStateMETA.nflags(address()); }

        /** Sets the specified value to the {@link XrFoveationEyeTrackedStateMETA#type} field. */
        public XrFoveationEyeTrackedStateMETA.Buffer type(@NativeType("XrStructureType") int value) { XrFoveationEyeTrackedStateMETA.ntype(address(), value); return this; }
        /** Sets the {@link METAFoveationEyeTracked#XR_TYPE_FOVEATION_EYE_TRACKED_STATE_META TYPE_FOVEATION_EYE_TRACKED_STATE_META} value to the {@link XrFoveationEyeTrackedStateMETA#type} field. */
        public XrFoveationEyeTrackedStateMETA.Buffer type$Default() { return type(METAFoveationEyeTracked.XR_TYPE_FOVEATION_EYE_TRACKED_STATE_META); }
        /** Sets the specified value to the {@link XrFoveationEyeTrackedStateMETA#next} field. */
        public XrFoveationEyeTrackedStateMETA.Buffer next(@NativeType("void *") long value) { XrFoveationEyeTrackedStateMETA.nnext(address(), value); return this; }

    }

}