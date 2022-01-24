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
 * System property for marker tracking.
 * 
 * <h5>Description</h5>
 * 
 * <p>An application <b>may</b> inspect whether the system is capable of marker tracking by chaining an {@link XrSystemMarkerTrackingPropertiesVARJO} structure to the {@link XrSystemProperties} structure when calling {@link XR10#xrGetSystemProperties GetSystemProperties}.</p>
 * 
 * <p>The runtime <b>should</b> return {@link XR10#XR_TRUE TRUE} for {@code supportsMarkerTracking} when marker tracking is available in the system, otherwise {@link XR10#XR_FALSE FALSE}. Marker tracking calls <b>must</b> return {@link XR10#XR_ERROR_FEATURE_UNSUPPORTED ERROR_FEATURE_UNSUPPORTED} if marker tracking is not available in the system.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link VARJOMarkerTracking XR_VARJO_marker_tracking} extension <b>must</b> be enabled prior to using {@link XrSystemMarkerTrackingPropertiesVARJO}</li>
 * <li>{@code type} <b>must</b> be {@link VARJOMarkerTracking#XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSystemProperties}, {@link XR10#xrGetSystemProperties GetSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemMarkerTrackingPropertiesVARJO {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrBool32 {@link #supportsMarkerTracking};
 * }</code></pre>
 */
public class XrSystemMarkerTrackingPropertiesVARJO extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTSMARKERTRACKING;

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
        SUPPORTSMARKERTRACKING = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrSystemMarkerTrackingPropertiesVARJO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemMarkerTrackingPropertiesVARJO(ByteBuffer container) {
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
    /** an {@code XrBool32}, indicating if current system is capable of performing marker tracking. */
    @NativeType("XrBool32")
    public boolean supportsMarkerTracking() { return nsupportsMarkerTracking(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemMarkerTrackingPropertiesVARJO type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link VARJOMarkerTracking#XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO} value to the {@link #type} field. */
    public XrSystemMarkerTrackingPropertiesVARJO type$Default() { return type(VARJOMarkerTracking.XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemMarkerTrackingPropertiesVARJO next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #supportsMarkerTracking} field. */
    public XrSystemMarkerTrackingPropertiesVARJO supportsMarkerTracking(@NativeType("XrBool32") boolean value) { nsupportsMarkerTracking(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemMarkerTrackingPropertiesVARJO set(
        int type,
        long next,
        boolean supportsMarkerTracking
    ) {
        type(type);
        next(next);
        supportsMarkerTracking(supportsMarkerTracking);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSystemMarkerTrackingPropertiesVARJO set(XrSystemMarkerTrackingPropertiesVARJO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemMarkerTrackingPropertiesVARJO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemMarkerTrackingPropertiesVARJO malloc() {
        return wrap(XrSystemMarkerTrackingPropertiesVARJO.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrSystemMarkerTrackingPropertiesVARJO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemMarkerTrackingPropertiesVARJO calloc() {
        return wrap(XrSystemMarkerTrackingPropertiesVARJO.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrSystemMarkerTrackingPropertiesVARJO} instance allocated with {@link BufferUtils}. */
    public static XrSystemMarkerTrackingPropertiesVARJO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrSystemMarkerTrackingPropertiesVARJO.class, memAddress(container), container);
    }

    /** Returns a new {@code XrSystemMarkerTrackingPropertiesVARJO} instance for the specified memory address. */
    public static XrSystemMarkerTrackingPropertiesVARJO create(long address) {
        return wrap(XrSystemMarkerTrackingPropertiesVARJO.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemMarkerTrackingPropertiesVARJO createSafe(long address) {
        return address == NULL ? null : wrap(XrSystemMarkerTrackingPropertiesVARJO.class, address);
    }

    /**
     * Returns a new {@link XrSystemMarkerTrackingPropertiesVARJO.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesVARJO.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemMarkerTrackingPropertiesVARJO.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesVARJO.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemMarkerTrackingPropertiesVARJO.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesVARJO.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrSystemMarkerTrackingPropertiesVARJO.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesVARJO.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemMarkerTrackingPropertiesVARJO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /**
     * Returns a new {@code XrSystemMarkerTrackingPropertiesVARJO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemMarkerTrackingPropertiesVARJO malloc(MemoryStack stack) {
        return wrap(XrSystemMarkerTrackingPropertiesVARJO.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrSystemMarkerTrackingPropertiesVARJO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemMarkerTrackingPropertiesVARJO calloc(MemoryStack stack) {
        return wrap(XrSystemMarkerTrackingPropertiesVARJO.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrSystemMarkerTrackingPropertiesVARJO.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesVARJO.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemMarkerTrackingPropertiesVARJO.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemMarkerTrackingPropertiesVARJO.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemMarkerTrackingPropertiesVARJO.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemMarkerTrackingPropertiesVARJO.NEXT); }
    /** Unsafe version of {@link #supportsMarkerTracking}. */
    public static int nsupportsMarkerTracking(long struct) { return UNSAFE.getInt(null, struct + XrSystemMarkerTrackingPropertiesVARJO.SUPPORTSMARKERTRACKING); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemMarkerTrackingPropertiesVARJO.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemMarkerTrackingPropertiesVARJO.NEXT, value); }
    /** Unsafe version of {@link #supportsMarkerTracking(boolean) supportsMarkerTracking}. */
    public static void nsupportsMarkerTracking(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemMarkerTrackingPropertiesVARJO.SUPPORTSMARKERTRACKING, value); }

    // -----------------------------------

    /** An array of {@link XrSystemMarkerTrackingPropertiesVARJO} structs. */
    public static class Buffer extends StructBuffer<XrSystemMarkerTrackingPropertiesVARJO, Buffer> implements NativeResource {

        private static final XrSystemMarkerTrackingPropertiesVARJO ELEMENT_FACTORY = XrSystemMarkerTrackingPropertiesVARJO.create(-1L);

        /**
         * Creates a new {@code XrSystemMarkerTrackingPropertiesVARJO.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemMarkerTrackingPropertiesVARJO#SIZEOF}, and its mark will be undefined.
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
        protected XrSystemMarkerTrackingPropertiesVARJO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemMarkerTrackingPropertiesVARJO#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemMarkerTrackingPropertiesVARJO.ntype(address()); }
        /** @return the value of the {@link XrSystemMarkerTrackingPropertiesVARJO#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemMarkerTrackingPropertiesVARJO.nnext(address()); }
        /** @return the value of the {@link XrSystemMarkerTrackingPropertiesVARJO#supportsMarkerTracking} field. */
        @NativeType("XrBool32")
        public boolean supportsMarkerTracking() { return XrSystemMarkerTrackingPropertiesVARJO.nsupportsMarkerTracking(address()) != 0; }

        /** Sets the specified value to the {@link XrSystemMarkerTrackingPropertiesVARJO#type} field. */
        public XrSystemMarkerTrackingPropertiesVARJO.Buffer type(@NativeType("XrStructureType") int value) { XrSystemMarkerTrackingPropertiesVARJO.ntype(address(), value); return this; }
        /** Sets the {@link VARJOMarkerTracking#XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO} value to the {@link XrSystemMarkerTrackingPropertiesVARJO#type} field. */
        public XrSystemMarkerTrackingPropertiesVARJO.Buffer type$Default() { return type(VARJOMarkerTracking.XR_TYPE_SYSTEM_MARKER_TRACKING_PROPERTIES_VARJO); }
        /** Sets the specified value to the {@link XrSystemMarkerTrackingPropertiesVARJO#next} field. */
        public XrSystemMarkerTrackingPropertiesVARJO.Buffer next(@NativeType("void *") long value) { XrSystemMarkerTrackingPropertiesVARJO.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrSystemMarkerTrackingPropertiesVARJO#supportsMarkerTracking} field. */
        public XrSystemMarkerTrackingPropertiesVARJO.Buffer supportsMarkerTracking(@NativeType("XrBool32") boolean value) { XrSystemMarkerTrackingPropertiesVARJO.nsupportsMarkerTracking(address(), value ? 1 : 0); return this; }

    }

}