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
 * Information to create a facial tracker handle.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrFacialTrackerCreateInfoHTC} structure describes the information to create an {@code XrFacialTrackerHTC} handle.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCFacialTracking XR_HTC_facial_tracking} extension <b>must</b> be enabled prior to using {@link XrFacialTrackerCreateInfoHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCFacialTracking#XR_TYPE_FACIAL_TRACKER_CREATE_INFO_HTC TYPE_FACIAL_TRACKER_CREATE_INFO_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code facialTrackingType} <b>must</b> be a valid {@code XrFacialTrackingTypeHTC} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link HTCFacialTracking#xrCreateFacialTrackerHTC CreateFacialTrackerHTC}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFacialTrackerCreateInfoHTC {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrFacialTrackingTypeHTC {@link #facialTrackingType};
 * }</code></pre>
 */
public class XrFacialTrackerCreateInfoHTC extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FACIALTRACKINGTYPE;

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
        FACIALTRACKINGTYPE = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrFacialTrackerCreateInfoHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFacialTrackerCreateInfoHTC(ByteBuffer container) {
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
    /** an {@code XrFacialTrackingTypeHTC} which describes which type of facial tracking should be used for this handle. */
    @NativeType("XrFacialTrackingTypeHTC")
    public int facialTrackingType() { return nfacialTrackingType(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFacialTrackerCreateInfoHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCFacialTracking#XR_TYPE_FACIAL_TRACKER_CREATE_INFO_HTC TYPE_FACIAL_TRACKER_CREATE_INFO_HTC} value to the {@link #type} field. */
    public XrFacialTrackerCreateInfoHTC type$Default() { return type(HTCFacialTracking.XR_TYPE_FACIAL_TRACKER_CREATE_INFO_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFacialTrackerCreateInfoHTC next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #facialTrackingType} field. */
    public XrFacialTrackerCreateInfoHTC facialTrackingType(@NativeType("XrFacialTrackingTypeHTC") int value) { nfacialTrackingType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFacialTrackerCreateInfoHTC set(
        int type,
        long next,
        int facialTrackingType
    ) {
        type(type);
        next(next);
        facialTrackingType(facialTrackingType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrFacialTrackerCreateInfoHTC set(XrFacialTrackerCreateInfoHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFacialTrackerCreateInfoHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFacialTrackerCreateInfoHTC malloc() {
        return wrap(XrFacialTrackerCreateInfoHTC.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrFacialTrackerCreateInfoHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFacialTrackerCreateInfoHTC calloc() {
        return wrap(XrFacialTrackerCreateInfoHTC.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrFacialTrackerCreateInfoHTC} instance allocated with {@link BufferUtils}. */
    public static XrFacialTrackerCreateInfoHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrFacialTrackerCreateInfoHTC.class, memAddress(container), container);
    }

    /** Returns a new {@code XrFacialTrackerCreateInfoHTC} instance for the specified memory address. */
    public static XrFacialTrackerCreateInfoHTC create(long address) {
        return wrap(XrFacialTrackerCreateInfoHTC.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFacialTrackerCreateInfoHTC createSafe(long address) {
        return address == NULL ? null : wrap(XrFacialTrackerCreateInfoHTC.class, address);
    }

    /**
     * Returns a new {@link XrFacialTrackerCreateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialTrackerCreateInfoHTC.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFacialTrackerCreateInfoHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialTrackerCreateInfoHTC.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialTrackerCreateInfoHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFacialTrackerCreateInfoHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrFacialTrackerCreateInfoHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFacialTrackerCreateInfoHTC.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFacialTrackerCreateInfoHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrFacialTrackerCreateInfoHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialTrackerCreateInfoHTC malloc(MemoryStack stack) {
        return wrap(XrFacialTrackerCreateInfoHTC.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrFacialTrackerCreateInfoHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFacialTrackerCreateInfoHTC calloc(MemoryStack stack) {
        return wrap(XrFacialTrackerCreateInfoHTC.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrFacialTrackerCreateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialTrackerCreateInfoHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFacialTrackerCreateInfoHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFacialTrackerCreateInfoHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFacialTrackerCreateInfoHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFacialTrackerCreateInfoHTC.NEXT); }
    /** Unsafe version of {@link #facialTrackingType}. */
    public static int nfacialTrackingType(long struct) { return UNSAFE.getInt(null, struct + XrFacialTrackerCreateInfoHTC.FACIALTRACKINGTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFacialTrackerCreateInfoHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFacialTrackerCreateInfoHTC.NEXT, value); }
    /** Unsafe version of {@link #facialTrackingType(int) facialTrackingType}. */
    public static void nfacialTrackingType(long struct, int value) { UNSAFE.putInt(null, struct + XrFacialTrackerCreateInfoHTC.FACIALTRACKINGTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrFacialTrackerCreateInfoHTC} structs. */
    public static class Buffer extends StructBuffer<XrFacialTrackerCreateInfoHTC, Buffer> implements NativeResource {

        private static final XrFacialTrackerCreateInfoHTC ELEMENT_FACTORY = XrFacialTrackerCreateInfoHTC.create(-1L);

        /**
         * Creates a new {@code XrFacialTrackerCreateInfoHTC.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFacialTrackerCreateInfoHTC#SIZEOF}, and its mark will be undefined.
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
        protected XrFacialTrackerCreateInfoHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFacialTrackerCreateInfoHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFacialTrackerCreateInfoHTC.ntype(address()); }
        /** @return the value of the {@link XrFacialTrackerCreateInfoHTC#next} field. */
        @NativeType("void const *")
        public long next() { return XrFacialTrackerCreateInfoHTC.nnext(address()); }
        /** @return the value of the {@link XrFacialTrackerCreateInfoHTC#facialTrackingType} field. */
        @NativeType("XrFacialTrackingTypeHTC")
        public int facialTrackingType() { return XrFacialTrackerCreateInfoHTC.nfacialTrackingType(address()); }

        /** Sets the specified value to the {@link XrFacialTrackerCreateInfoHTC#type} field. */
        public XrFacialTrackerCreateInfoHTC.Buffer type(@NativeType("XrStructureType") int value) { XrFacialTrackerCreateInfoHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCFacialTracking#XR_TYPE_FACIAL_TRACKER_CREATE_INFO_HTC TYPE_FACIAL_TRACKER_CREATE_INFO_HTC} value to the {@link XrFacialTrackerCreateInfoHTC#type} field. */
        public XrFacialTrackerCreateInfoHTC.Buffer type$Default() { return type(HTCFacialTracking.XR_TYPE_FACIAL_TRACKER_CREATE_INFO_HTC); }
        /** Sets the specified value to the {@link XrFacialTrackerCreateInfoHTC#next} field. */
        public XrFacialTrackerCreateInfoHTC.Buffer next(@NativeType("void const *") long value) { XrFacialTrackerCreateInfoHTC.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrFacialTrackerCreateInfoHTC#facialTrackingType} field. */
        public XrFacialTrackerCreateInfoHTC.Buffer facialTrackingType(@NativeType("XrFacialTrackingTypeHTC") int value) { XrFacialTrackerCreateInfoHTC.nfacialTrackingType(address(), value); return this; }

    }

}