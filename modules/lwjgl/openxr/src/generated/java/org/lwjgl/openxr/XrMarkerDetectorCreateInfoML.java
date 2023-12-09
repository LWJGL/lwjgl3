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
 * Information to create a marker detection handle.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLMarkerUnderstanding XR_ML_marker_understanding} extension <b>must</b> be enabled prior to using {@link XrMarkerDetectorCreateInfoML}</li>
 * <li>{@code type} <b>must</b> be {@link MLMarkerUnderstanding#XR_TYPE_MARKER_DETECTOR_CREATE_INFO_ML TYPE_MARKER_DETECTOR_CREATE_INFO_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a>. See also: {@link XrMarkerDetectorAprilTagInfoML}, {@link XrMarkerDetectorArucoInfoML}, {@link XrMarkerDetectorCustomProfileInfoML}, {@link XrMarkerDetectorSizeInfoML}</li>
 * <li>{@code profile} <b>must</b> be a valid {@code XrMarkerDetectorProfileML} value</li>
 * <li>{@code markerType} <b>must</b> be a valid {@code XrMarkerTypeML} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MLMarkerUnderstanding#xrCreateMarkerDetectorML CreateMarkerDetectorML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrMarkerDetectorCreateInfoML {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrMarkerDetectorProfileML {@link #profile};
 *     XrMarkerTypeML {@link #markerType};
 * }</code></pre>
 */
public class XrMarkerDetectorCreateInfoML extends Struct<XrMarkerDetectorCreateInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        PROFILE,
        MARKERTYPE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        PROFILE = layout.offsetof(2);
        MARKERTYPE = layout.offsetof(3);
    }

    protected XrMarkerDetectorCreateInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrMarkerDetectorCreateInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrMarkerDetectorCreateInfoML(address, container);
    }

    /**
     * Creates a {@code XrMarkerDetectorCreateInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrMarkerDetectorCreateInfoML(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the marker tracker profile to be used. */
    @NativeType("XrMarkerDetectorProfileML")
    public int profile() { return nprofile(address()); }
    /** the detector type that this tracker enables. */
    @NativeType("XrMarkerTypeML")
    public int markerType() { return nmarkerType(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrMarkerDetectorCreateInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_DETECTOR_CREATE_INFO_ML TYPE_MARKER_DETECTOR_CREATE_INFO_ML} value to the {@link #type} field. */
    public XrMarkerDetectorCreateInfoML type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_DETECTOR_CREATE_INFO_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrMarkerDetectorCreateInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrMarkerDetectorAprilTagInfoML} value to the {@code next} chain. */
    public XrMarkerDetectorCreateInfoML next(XrMarkerDetectorAprilTagInfoML value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrMarkerDetectorArucoInfoML} value to the {@code next} chain. */
    public XrMarkerDetectorCreateInfoML next(XrMarkerDetectorArucoInfoML value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrMarkerDetectorCustomProfileInfoML} value to the {@code next} chain. */
    public XrMarkerDetectorCreateInfoML next(XrMarkerDetectorCustomProfileInfoML value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrMarkerDetectorSizeInfoML} value to the {@code next} chain. */
    public XrMarkerDetectorCreateInfoML next(XrMarkerDetectorSizeInfoML value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@link #profile} field. */
    public XrMarkerDetectorCreateInfoML profile(@NativeType("XrMarkerDetectorProfileML") int value) { nprofile(address(), value); return this; }
    /** Sets the specified value to the {@link #markerType} field. */
    public XrMarkerDetectorCreateInfoML markerType(@NativeType("XrMarkerTypeML") int value) { nmarkerType(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrMarkerDetectorCreateInfoML set(
        int type,
        long next,
        int profile,
        int markerType
    ) {
        type(type);
        next(next);
        profile(profile);
        markerType(markerType);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrMarkerDetectorCreateInfoML set(XrMarkerDetectorCreateInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrMarkerDetectorCreateInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrMarkerDetectorCreateInfoML malloc() {
        return new XrMarkerDetectorCreateInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerDetectorCreateInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrMarkerDetectorCreateInfoML calloc() {
        return new XrMarkerDetectorCreateInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrMarkerDetectorCreateInfoML} instance allocated with {@link BufferUtils}. */
    public static XrMarkerDetectorCreateInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrMarkerDetectorCreateInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrMarkerDetectorCreateInfoML} instance for the specified memory address. */
    public static XrMarkerDetectorCreateInfoML create(long address) {
        return new XrMarkerDetectorCreateInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrMarkerDetectorCreateInfoML createSafe(long address) {
        return address == NULL ? null : new XrMarkerDetectorCreateInfoML(address, null);
    }

    /**
     * Returns a new {@link XrMarkerDetectorCreateInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCreateInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorCreateInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCreateInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorCreateInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCreateInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrMarkerDetectorCreateInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCreateInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrMarkerDetectorCreateInfoML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrMarkerDetectorCreateInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerDetectorCreateInfoML malloc(MemoryStack stack) {
        return new XrMarkerDetectorCreateInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrMarkerDetectorCreateInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerDetectorCreateInfoML calloc(MemoryStack stack) {
        return new XrMarkerDetectorCreateInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrMarkerDetectorCreateInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCreateInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrMarkerDetectorCreateInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrMarkerDetectorCreateInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrMarkerDetectorCreateInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrMarkerDetectorCreateInfoML.NEXT); }
    /** Unsafe version of {@link #profile}. */
    public static int nprofile(long struct) { return UNSAFE.getInt(null, struct + XrMarkerDetectorCreateInfoML.PROFILE); }
    /** Unsafe version of {@link #markerType}. */
    public static int nmarkerType(long struct) { return UNSAFE.getInt(null, struct + XrMarkerDetectorCreateInfoML.MARKERTYPE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrMarkerDetectorCreateInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrMarkerDetectorCreateInfoML.NEXT, value); }
    /** Unsafe version of {@link #profile(int) profile}. */
    public static void nprofile(long struct, int value) { UNSAFE.putInt(null, struct + XrMarkerDetectorCreateInfoML.PROFILE, value); }
    /** Unsafe version of {@link #markerType(int) markerType}. */
    public static void nmarkerType(long struct, int value) { UNSAFE.putInt(null, struct + XrMarkerDetectorCreateInfoML.MARKERTYPE, value); }

    // -----------------------------------

    /** An array of {@link XrMarkerDetectorCreateInfoML} structs. */
    public static class Buffer extends StructBuffer<XrMarkerDetectorCreateInfoML, Buffer> implements NativeResource {

        private static final XrMarkerDetectorCreateInfoML ELEMENT_FACTORY = XrMarkerDetectorCreateInfoML.create(-1L);

        /**
         * Creates a new {@code XrMarkerDetectorCreateInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrMarkerDetectorCreateInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrMarkerDetectorCreateInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrMarkerDetectorCreateInfoML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrMarkerDetectorCreateInfoML.ntype(address()); }
        /** @return the value of the {@link XrMarkerDetectorCreateInfoML#next} field. */
        @NativeType("void const *")
        public long next() { return XrMarkerDetectorCreateInfoML.nnext(address()); }
        /** @return the value of the {@link XrMarkerDetectorCreateInfoML#profile} field. */
        @NativeType("XrMarkerDetectorProfileML")
        public int profile() { return XrMarkerDetectorCreateInfoML.nprofile(address()); }
        /** @return the value of the {@link XrMarkerDetectorCreateInfoML#markerType} field. */
        @NativeType("XrMarkerTypeML")
        public int markerType() { return XrMarkerDetectorCreateInfoML.nmarkerType(address()); }

        /** Sets the specified value to the {@link XrMarkerDetectorCreateInfoML#type} field. */
        public XrMarkerDetectorCreateInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrMarkerDetectorCreateInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLMarkerUnderstanding#XR_TYPE_MARKER_DETECTOR_CREATE_INFO_ML TYPE_MARKER_DETECTOR_CREATE_INFO_ML} value to the {@link XrMarkerDetectorCreateInfoML#type} field. */
        public XrMarkerDetectorCreateInfoML.Buffer type$Default() { return type(MLMarkerUnderstanding.XR_TYPE_MARKER_DETECTOR_CREATE_INFO_ML); }
        /** Sets the specified value to the {@link XrMarkerDetectorCreateInfoML#next} field. */
        public XrMarkerDetectorCreateInfoML.Buffer next(@NativeType("void const *") long value) { XrMarkerDetectorCreateInfoML.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrMarkerDetectorAprilTagInfoML} value to the {@code next} chain. */
        public XrMarkerDetectorCreateInfoML.Buffer next(XrMarkerDetectorAprilTagInfoML value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrMarkerDetectorArucoInfoML} value to the {@code next} chain. */
        public XrMarkerDetectorCreateInfoML.Buffer next(XrMarkerDetectorArucoInfoML value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrMarkerDetectorCustomProfileInfoML} value to the {@code next} chain. */
        public XrMarkerDetectorCreateInfoML.Buffer next(XrMarkerDetectorCustomProfileInfoML value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrMarkerDetectorSizeInfoML} value to the {@code next} chain. */
        public XrMarkerDetectorCreateInfoML.Buffer next(XrMarkerDetectorSizeInfoML value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@link XrMarkerDetectorCreateInfoML#profile} field. */
        public XrMarkerDetectorCreateInfoML.Buffer profile(@NativeType("XrMarkerDetectorProfileML") int value) { XrMarkerDetectorCreateInfoML.nprofile(address(), value); return this; }
        /** Sets the specified value to the {@link XrMarkerDetectorCreateInfoML#markerType} field. */
        public XrMarkerDetectorCreateInfoML.Buffer markerType(@NativeType("XrMarkerTypeML") int value) { XrMarkerDetectorCreateInfoML.nmarkerType(address(), value); return this; }

    }

}