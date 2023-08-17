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
 * System Properties of the Plane Detection extension.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link EXTPlaneDetection XR_EXT_plane_detection} extension <b>must</b> be enabled prior to using {@link XrSystemPlaneDetectionPropertiesEXT}</li>
 * <li>{@code type} <b>must</b> be {@link EXTPlaneDetection#XR_TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrSystemProperties}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrSystemPlaneDetectionPropertiesEXT {
 *     XrStructureType {@link #type};
 *     void * {@link #next};
 *     XrPlaneDetectionCapabilityFlagsEXT {@link #supportedFeatures};
 * }</code></pre>
 */
public class XrSystemPlaneDetectionPropertiesEXT extends Struct<XrSystemPlaneDetectionPropertiesEXT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        SUPPORTEDFEATURES;

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
        SUPPORTEDFEATURES = layout.offsetof(2);
    }

    protected XrSystemPlaneDetectionPropertiesEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSystemPlaneDetectionPropertiesEXT create(long address, @Nullable ByteBuffer container) {
        return new XrSystemPlaneDetectionPropertiesEXT(address, container);
    }

    /**
     * Creates a {@code XrSystemPlaneDetectionPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSystemPlaneDetectionPropertiesEXT(ByteBuffer container) {
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
    /** a bitfield, with bit masks defined in {@code XrPlaneDetectionCapabilityFlagBitsEXT}. */
    @NativeType("XrPlaneDetectionCapabilityFlagsEXT")
    public long supportedFeatures() { return nsupportedFeatures(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrSystemPlaneDetectionPropertiesEXT type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link EXTPlaneDetection#XR_TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT} value to the {@link #type} field. */
    public XrSystemPlaneDetectionPropertiesEXT type$Default() { return type(EXTPlaneDetection.XR_TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT); }
    /** Sets the specified value to the {@link #next} field. */
    public XrSystemPlaneDetectionPropertiesEXT next(@NativeType("void *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSystemPlaneDetectionPropertiesEXT set(
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
    public XrSystemPlaneDetectionPropertiesEXT set(XrSystemPlaneDetectionPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSystemPlaneDetectionPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSystemPlaneDetectionPropertiesEXT malloc() {
        return new XrSystemPlaneDetectionPropertiesEXT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPlaneDetectionPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSystemPlaneDetectionPropertiesEXT calloc() {
        return new XrSystemPlaneDetectionPropertiesEXT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSystemPlaneDetectionPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static XrSystemPlaneDetectionPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSystemPlaneDetectionPropertiesEXT(memAddress(container), container);
    }

    /** Returns a new {@code XrSystemPlaneDetectionPropertiesEXT} instance for the specified memory address. */
    public static XrSystemPlaneDetectionPropertiesEXT create(long address) {
        return new XrSystemPlaneDetectionPropertiesEXT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemPlaneDetectionPropertiesEXT createSafe(long address) {
        return address == NULL ? null : new XrSystemPlaneDetectionPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link XrSystemPlaneDetectionPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPlaneDetectionPropertiesEXT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSystemPlaneDetectionPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPlaneDetectionPropertiesEXT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPlaneDetectionPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSystemPlaneDetectionPropertiesEXT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSystemPlaneDetectionPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSystemPlaneDetectionPropertiesEXT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrSystemPlaneDetectionPropertiesEXT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSystemPlaneDetectionPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPlaneDetectionPropertiesEXT malloc(MemoryStack stack) {
        return new XrSystemPlaneDetectionPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSystemPlaneDetectionPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSystemPlaneDetectionPropertiesEXT calloc(MemoryStack stack) {
        return new XrSystemPlaneDetectionPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSystemPlaneDetectionPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPlaneDetectionPropertiesEXT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSystemPlaneDetectionPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSystemPlaneDetectionPropertiesEXT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrSystemPlaneDetectionPropertiesEXT.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSystemPlaneDetectionPropertiesEXT.NEXT); }
    /** Unsafe version of {@link #supportedFeatures}. */
    public static long nsupportedFeatures(long struct) { return UNSAFE.getLong(null, struct + XrSystemPlaneDetectionPropertiesEXT.SUPPORTEDFEATURES); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrSystemPlaneDetectionPropertiesEXT.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSystemPlaneDetectionPropertiesEXT.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrSystemPlaneDetectionPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<XrSystemPlaneDetectionPropertiesEXT, Buffer> implements NativeResource {

        private static final XrSystemPlaneDetectionPropertiesEXT ELEMENT_FACTORY = XrSystemPlaneDetectionPropertiesEXT.create(-1L);

        /**
         * Creates a new {@code XrSystemPlaneDetectionPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSystemPlaneDetectionPropertiesEXT#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSystemPlaneDetectionPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrSystemPlaneDetectionPropertiesEXT#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSystemPlaneDetectionPropertiesEXT.ntype(address()); }
        /** @return the value of the {@link XrSystemPlaneDetectionPropertiesEXT#next} field. */
        @NativeType("void *")
        public long next() { return XrSystemPlaneDetectionPropertiesEXT.nnext(address()); }
        /** @return the value of the {@link XrSystemPlaneDetectionPropertiesEXT#supportedFeatures} field. */
        @NativeType("XrPlaneDetectionCapabilityFlagsEXT")
        public long supportedFeatures() { return XrSystemPlaneDetectionPropertiesEXT.nsupportedFeatures(address()); }

        /** Sets the specified value to the {@link XrSystemPlaneDetectionPropertiesEXT#type} field. */
        public XrSystemPlaneDetectionPropertiesEXT.Buffer type(@NativeType("XrStructureType") int value) { XrSystemPlaneDetectionPropertiesEXT.ntype(address(), value); return this; }
        /** Sets the {@link EXTPlaneDetection#XR_TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT} value to the {@link XrSystemPlaneDetectionPropertiesEXT#type} field. */
        public XrSystemPlaneDetectionPropertiesEXT.Buffer type$Default() { return type(EXTPlaneDetection.XR_TYPE_SYSTEM_PLANE_DETECTION_PROPERTIES_EXT); }
        /** Sets the specified value to the {@link XrSystemPlaneDetectionPropertiesEXT#next} field. */
        public XrSystemPlaneDetectionPropertiesEXT.Buffer next(@NativeType("void *") long value) { XrSystemPlaneDetectionPropertiesEXT.nnext(address(), value); return this; }

    }

}