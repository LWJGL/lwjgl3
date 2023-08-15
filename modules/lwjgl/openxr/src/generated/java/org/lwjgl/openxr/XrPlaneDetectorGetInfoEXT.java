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

/**
 * Contains the plane retrieval information.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using {@link XrPlaneDetectorGetInfoEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_GET_INFO_EXT TYPE_PLANE_DETECTOR_GET_INFO_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code baseSpace} <b>must</b> be a valid {@code XrSpace} handle</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTPlaneDetection#xrGetPlaneDetectionsEXT GetPlaneDetectionsEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPlaneDetectorGetInfoEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrSpace {@link #baseSpace};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrPlaneDetectorGetInfoEXT extends Struct<XrPlaneDetectorGetInfoEXT> implements NativeResource {

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

    protected XrPlaneDetectorGetInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPlaneDetectorGetInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrPlaneDetectorGetInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrPlaneDetectorGetInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPlaneDetectorGetInfoEXT(ByteBuffer container) {
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
    /** the plane pose will be relative to this {@code XrSpace} at {@code time}. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** the {@code XrTime} at which to evaluate the coordinates relative to the {@code baseSpace}. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrPlaneDetectorGetInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_GET_INFO_EXT TYPE_PLANE_DETECTOR_GET_INFO_EXT} value to the {@link #type} field. */
    public XrPlaneDetectorGetInfoEXT type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_GET_INFO_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPlaneDetectorGetInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #baseSpace} field. */
    public XrPlaneDetectorGetInfoEXT baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@link #time} field. */
    public XrPlaneDetectorGetInfoEXT time(@NativeType("XrTime") long value) { ntime(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPlaneDetectorGetInfoEXT set(
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
    public XrPlaneDetectorGetInfoEXT set(XrPlaneDetectorGetInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPlaneDetectorGetInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorGetInfoEXT malloc() {
        return new XrPlaneDetectorGetInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorGetInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorGetInfoEXT calloc() {
        return new XrPlaneDetectorGetInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorGetInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrPlaneDetectorGetInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPlaneDetectorGetInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrPlaneDetectorGetInfoEXT} instance for the specified memory address. */
    public static XrPlaneDetectorGetInfoEXT create(long address) {
        return new XrPlaneDetectorGetInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPlaneDetectorGetInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrPlaneDetectorGetInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorGetInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorGetInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorGetInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorGetInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorGetInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPlaneDetectorGetInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorGetInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPlaneDetectorGetInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPlaneDetectorGetInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorGetInfoEXT malloc(MemoryStack stack) {
        return new XrPlaneDetectorGetInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPlaneDetectorGetInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorGetInfoEXT calloc(MemoryStack stack) {
        return new XrPlaneDetectorGetInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorGetInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorGetInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorGetInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPlaneDetectorGetInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPlaneDetectorGetInfoEXT.NEXT); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrPlaneDetectorGetInfoEXT.BASESPACE); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return UNSAFE.getLong(null, struct + XrPlaneDetectorGetInfoEXT.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPlaneDetectorGetInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPlaneDetectorGetInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrPlaneDetectorGetInfoEXT.BASESPACE, value.address()); }
    /** Unsafe version of {@link #time(long) time}. */
    public static void ntime(long struct, long value) { UNSAFE.putLong(null, struct + XrPlaneDetectorGetInfoEXT.TIME, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrPlaneDetectorGetInfoEXT.BASESPACE));
    }

    // -----------------------------------

    /** An array of {@link XrPlaneDetectorGetInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrPlaneDetectorGetInfoEXT, Buffer> implements NativeResource {

        private static final XrPlaneDetectorGetInfoEXT ELEMENT_FACTORY = XrPlaneDetectorGetInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrPlaneDetectorGetInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPlaneDetectorGetInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPlaneDetectorGetInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPlaneDetectorGetInfoEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPlaneDetectorGetInfoEXT.ntype(address()); }
        /** @return the value of the {@link XrPlaneDetectorGetInfoEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrPlaneDetectorGetInfoEXT.nnext(address()); }
        /** @return the value of the {@link XrPlaneDetectorGetInfoEXT#baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrPlaneDetectorGetInfoEXT.nbaseSpace(address()); }
        /** @return the value of the {@link XrPlaneDetectorGetInfoEXT#time} field. */
        @NativeType("XrTime")
        public long time() { return XrPlaneDetectorGetInfoEXT.ntime(address()); }

        /** Sets the specified value to the {@link XrPlaneDetectorGetInfoEXT#type} field. */
        public XrPlaneDetectorGetInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrPlaneDetectorGetInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_GET_INFO_EXT TYPE_PLANE_DETECTOR_GET_INFO_EXT} value to the {@link XrPlaneDetectorGetInfoEXT#type} field. */
        public XrPlaneDetectorGetInfoEXT.Buffer type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_GET_INFO_EXT); }
        /** Sets the specified value to the {@link XrPlaneDetectorGetInfoEXT#next} field. */
        public XrPlaneDetectorGetInfoEXT.Buffer next(@NativeType("void const *") long value) { XrPlaneDetectorGetInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorGetInfoEXT#baseSpace} field. */
        public XrPlaneDetectorGetInfoEXT.Buffer baseSpace(XrSpace value) { XrPlaneDetectorGetInfoEXT.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorGetInfoEXT#time} field. */
        public XrPlaneDetectorGetInfoEXT.Buffer time(@NativeType("XrTime") long value) { XrPlaneDetectorGetInfoEXT.ntime(address(), value); return this; }

    }

}