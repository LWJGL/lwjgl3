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
 * Information to create a plane detection handle.
 * 
 * <h5>Description</h5>
 * 
 * <p>The {@link XrPlaneDetectorCreateInfoEXT} structure describes the information to create an {@code XrPlaneDetectorEXT} handle.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using {@link XrPlaneDetectorCreateInfoEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_CREATE_INFO_EXT TYPE_PLANE_DETECTOR_CREATE_INFO_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrPlaneDetectorFlagBitsEXT} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link EXTPlaneDetection#xrCreatePlaneDetectorEXT CreatePlaneDetectorEXT}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrPlaneDetectorCreateInfoEXT {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrPlaneDetectorFlagsEXT {@link #flags};
 * }</code></pre>
 */
public class XrPlaneDetectorCreateInfoEXT extends Struct<XrPlaneDetectorCreateInfoEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FLAGS;

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
        FLAGS = layout.offsetof(2);
    }

    protected XrPlaneDetectorCreateInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrPlaneDetectorCreateInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new XrPlaneDetectorCreateInfoEXT(address, container);
    }

    /**
     * Creates a {@code XrPlaneDetectorCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrPlaneDetectorCreateInfoEXT(ByteBuffer container) {
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
    /** <b>must</b> be a valid combination of {@code XrPlaneDetectorFlagsEXT} flags or zero. */
    @NativeType("XrPlaneDetectorFlagsEXT")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrPlaneDetectorCreateInfoEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_CREATE_INFO_EXT TYPE_PLANE_DETECTOR_CREATE_INFO_EXT} value to the {@link #type} field. */
    public XrPlaneDetectorCreateInfoEXT type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_CREATE_INFO_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrPlaneDetectorCreateInfoEXT next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public XrPlaneDetectorCreateInfoEXT flags(@NativeType("XrPlaneDetectorFlagsEXT") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrPlaneDetectorCreateInfoEXT set(
        int type,
        long next,
        long flags
    ) {
        type(type);
        next(next);
        flags(flags);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrPlaneDetectorCreateInfoEXT set(XrPlaneDetectorCreateInfoEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrPlaneDetectorCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorCreateInfoEXT malloc() {
        return new XrPlaneDetectorCreateInfoEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrPlaneDetectorCreateInfoEXT calloc() {
        return new XrPlaneDetectorCreateInfoEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrPlaneDetectorCreateInfoEXT} instance allocated with {@link BufferUtils}. */
    public static XrPlaneDetectorCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrPlaneDetectorCreateInfoEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrPlaneDetectorCreateInfoEXT} instance for the specified memory address. */
    public static XrPlaneDetectorCreateInfoEXT create(long address) {
        return new XrPlaneDetectorCreateInfoEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPlaneDetectorCreateInfoEXT createSafe(long address) {
        return address == NULL ? null : new XrPlaneDetectorCreateInfoEXT(address, null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorCreateInfoEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorCreateInfoEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorCreateInfoEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrPlaneDetectorCreateInfoEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorCreateInfoEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrPlaneDetectorCreateInfoEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrPlaneDetectorCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorCreateInfoEXT malloc(MemoryStack stack) {
        return new XrPlaneDetectorCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrPlaneDetectorCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrPlaneDetectorCreateInfoEXT calloc(MemoryStack stack) {
        return new XrPlaneDetectorCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrPlaneDetectorCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorCreateInfoEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrPlaneDetectorCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrPlaneDetectorCreateInfoEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrPlaneDetectorCreateInfoEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrPlaneDetectorCreateInfoEXT.NEXT); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrPlaneDetectorCreateInfoEXT.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrPlaneDetectorCreateInfoEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrPlaneDetectorCreateInfoEXT.NEXT, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { UNSAFE.putLong(null, struct + XrPlaneDetectorCreateInfoEXT.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrPlaneDetectorCreateInfoEXT} structs. */
    public static class Buffer extends StructBuffer<XrPlaneDetectorCreateInfoEXT, Buffer> implements NativeResource {

        private static final XrPlaneDetectorCreateInfoEXT ELEMENT_FACTORY = XrPlaneDetectorCreateInfoEXT.create(-1L);

        /**
         * Creates a new {@code XrPlaneDetectorCreateInfoEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrPlaneDetectorCreateInfoEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrPlaneDetectorCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrPlaneDetectorCreateInfoEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrPlaneDetectorCreateInfoEXT.ntype(address()); }
        /** @return the value of the {@link XrPlaneDetectorCreateInfoEXT#next} field. */
        @NativeType("void const *")
        public long next() { return XrPlaneDetectorCreateInfoEXT.nnext(address()); }
        /** @return the value of the {@link XrPlaneDetectorCreateInfoEXT#flags} field. */
        @NativeType("XrPlaneDetectorFlagsEXT")
        public long flags() { return XrPlaneDetectorCreateInfoEXT.nflags(address()); }

        /** Sets the specified value to the {@link XrPlaneDetectorCreateInfoEXT#type} field. */
        public XrPlaneDetectorCreateInfoEXT.Buffer type(@NativeType("XrStructureType") int value) { XrPlaneDetectorCreateInfoEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTPlaneDetection#XR_TYPE_PLANE_DETECTOR_CREATE_INFO_EXT TYPE_PLANE_DETECTOR_CREATE_INFO_EXT} value to the {@link XrPlaneDetectorCreateInfoEXT#type} field. */
        public XrPlaneDetectorCreateInfoEXT.Buffer type$Default() { return type(EXTPlaneDetection.XR_TYPE_PLANE_DETECTOR_CREATE_INFO_EXT); }
        /** Sets the specified value to the {@link XrPlaneDetectorCreateInfoEXT#next} field. */
        public XrPlaneDetectorCreateInfoEXT.Buffer next(@NativeType("void const *") long value) { XrPlaneDetectorCreateInfoEXT.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrPlaneDetectorCreateInfoEXT#flags} field. */
        public XrPlaneDetectorCreateInfoEXT.Buffer flags(@NativeType("XrPlaneDetectorFlagsEXT") long value) { XrPlaneDetectorCreateInfoEXT.nflags(address(), value); return this; }

    }

}