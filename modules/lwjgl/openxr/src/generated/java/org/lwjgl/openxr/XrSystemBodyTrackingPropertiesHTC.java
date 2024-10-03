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
 * System property for body tracking.
 * 
 * <h5>Description</h5>
 * 
 * <p>An application <b>can</b> inspect whether the system is capable of body tracking by extending the {@link XrSystemProperties} with {@link XrSystemBodyTrackingPropertiesHTC} structure when calling {@link XR10#xrGetSystemProperties GetSystemProperties}.</p>
 * 
 * <p>If a runtime returns {@link XR10#XR_FALSE FALSE} for {@code supportsBodyTracking}, the runtime <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} from {@link HTCBodyTracking#xrCreateBodyTrackerHTC CreateBodyTrackerHTC}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link HTCBodyTracking XR_HTC_body_tracking} extension <b>must</b> be enabled prior to using {@link XrSystemBodyTrackingPropertiesHTC}</li>
 * <li>{@code type} <b>must</b> be {@link HTCBodyTracking#XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSystemProperties}, {@link XR10#xrGetSystemProperties GetSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemBodyTrackingPropertiesHTC {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsBodyTracking};
 * }</code></pre>
 */
public class XrSystemBodyTrackingPropertiesHTC extends Struct<XrSystemBodyTrackingPropertiesHTC> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSBODYTRACKING;

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
        SUPPORTSBODYTRACKING = layout.offsetof(2);
    }

    protected XrSystemBodyTrackingPropertiesHTC(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemBodyTrackingPropertiesHTC create(long address, @Nullable ByteBuffer container) {
        return new XrSystemBodyTrackingPropertiesHTC(address, container);
    }

    /**
     * Creates a {@code XrSystemBodyTrackingPropertiesHTC} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemBodyTrackingPropertiesHTC(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** indicates if the current system is capable of track individual body joints. */
    @NativeType("XrBool32")
    public boolean supportsBodyTracking() { return nsupportsBodyTracking(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemBodyTrackingPropertiesHTC type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link HTCBodyTracking#XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC} value to the {@link #type} field. */
    public XrSystemBodyTrackingPropertiesHTC type$Default() { return type(HTCBodyTracking.XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemBodyTrackingPropertiesHTC next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemBodyTrackingPropertiesHTC set(
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
    public XrSystemBodyTrackingPropertiesHTC set(XrSystemBodyTrackingPropertiesHTC src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemBodyTrackingPropertiesHTC} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemBodyTrackingPropertiesHTC malloc() {
        return new XrSystemBodyTrackingPropertiesHTC(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemBodyTrackingPropertiesHTC} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemBodyTrackingPropertiesHTC calloc() {
        return new XrSystemBodyTrackingPropertiesHTC(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemBodyTrackingPropertiesHTC} instance allocated with {@link BufferUtils}. */
    public static XrSystemBodyTrackingPropertiesHTC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemBodyTrackingPropertiesHTC(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemBodyTrackingPropertiesHTC} instance for the specified memory address. */
    public static XrSystemBodyTrackingPropertiesHTC create(long address) {
        return new XrSystemBodyTrackingPropertiesHTC(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemBodyTrackingPropertiesHTC createSafe(long address) {
        return address == NULL ? null : new XrSystemBodyTrackingPropertiesHTC(address, null);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesHTC.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesHTC.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesHTC.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesHTC.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesHTC.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesHTC.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemBodyTrackingPropertiesHTC.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesHTC.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemBodyTrackingPropertiesHTC.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemBodyTrackingPropertiesHTC} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemBodyTrackingPropertiesHTC malloc(MemoryStack stack) {
        return new XrSystemBodyTrackingPropertiesHTC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemBodyTrackingPropertiesHTC} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemBodyTrackingPropertiesHTC calloc(MemoryStack stack) {
        return new XrSystemBodyTrackingPropertiesHTC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesHTC.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesHTC.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemBodyTrackingPropertiesHTC.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemBodyTrackingPropertiesHTC.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemBodyTrackingPropertiesHTC.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemBodyTrackingPropertiesHTC.NEXT); }
    /** Unsafe version of {@link #supportsBodyTracking}. */
    public static int nsupportsBodyTracking(long struct) { return UNSAFE.getInt(null, struct + XrSystemBodyTrackingPropertiesHTC.SUPPORTSBODYTRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemBodyTrackingPropertiesHTC.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemBodyTrackingPropertiesHTC.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemBodyTrackingPropertiesHTC} structs. */
    public static class Buffer extends StructBuffer<XrSystemBodyTrackingPropertiesHTC, Buffer> implements NativeResource {

        private static final XrSystemBodyTrackingPropertiesHTC ELEMENT_FACTORY = XrSystemBodyTrackingPropertiesHTC.create(-1L);

        /**
         * Creates a new {@code XrSystemBodyTrackingPropertiesHTC.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemBodyTrackingPropertiesHTC#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemBodyTrackingPropertiesHTC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemBodyTrackingPropertiesHTC#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemBodyTrackingPropertiesHTC.ntype(address()); }
        /** @return the value of the {@link XrSystemBodyTrackingPropertiesHTC#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemBodyTrackingPropertiesHTC.nnext(address()); }
        /** @return the value of the {@link XrSystemBodyTrackingPropertiesHTC#supportsBodyTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsBodyTracking() { return XrSystemBodyTrackingPropertiesHTC.nsupportsBodyTracking(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemBodyTrackingPropertiesHTC#type} field. */
        public XrSystemBodyTrackingPropertiesHTC.Buffer type(@NativeType("XrStructureType") int value) { XrSystemBodyTrackingPropertiesHTC.ntype(address(), value); return this; }
        /** Sets the {@link HTCBodyTracking#XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC} value to the {@link XrSystemBodyTrackingPropertiesHTC#type} field. */
        public XrSystemBodyTrackingPropertiesHTC.Buffer type$Default() { return type(HTCBodyTracking.XR_TYPE_SYSTEM_BODY_TRACKING_PROPERTIES_HTC); }
        /** Sets the specified value to the {@link XrSystemBodyTrackingPropertiesHTC#next} field. */
        public XrSystemBodyTrackingPropertiesHTC.Buffer next(@NativeType("void *") long value) { XrSystemBodyTrackingPropertiesHTC.nnext(address(), value); return this; }

    }

}