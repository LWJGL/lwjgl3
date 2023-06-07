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
 * Per frame configuration parameters.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLFrameEndInfo XR_ML_frame_end_info} extension <b>must</b> be enabled prior to using {@link XrFrameEndInfoML}</li>
 * <li>{@code type} <b>must</b> be {@link MLFrameEndInfo#XR_TYPE_FRAME_END_INFO_ML TYPE_FRAME_END_INFO_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * <li>{@code flags} <b>must</b> be 0 or a valid combination of {@code XrFrameEndInfoFlagBitsML} values</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrFrameEndInfoML {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     float {@link #focusDistance};
 *     XrFrameEndInfoFlagsML {@link #flags};
 * }</code></pre>
 */
public class XrFrameEndInfoML extends Struct<XrFrameEndInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        FOCUSDISTANCE,
        FLAGS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        FOCUSDISTANCE = layout.offsetof(2);
        FLAGS = layout.offsetof(3);
    }

    protected XrFrameEndInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrFrameEndInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrFrameEndInfoML(address, container);
    }

    /**
     * Creates a {@code XrFrameEndInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrFrameEndInfoML(ByteBuffer container) {
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
    /** the distance, in meters, to defined focus point for the client content. The focus distance is interpreted as the positive distance to the client-determined object of interest (relative to the forward vector of the Lightwear). */
    public float focusDistance() { return nfocusDistance(address()); }
    /** a bitmask of {@code XrFrameEndInfoFlagsML} */
    @NativeType("XrFrameEndInfoFlagsML")
    public long flags() { return nflags(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrFrameEndInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLFrameEndInfo#XR_TYPE_FRAME_END_INFO_ML TYPE_FRAME_END_INFO_ML} value to the {@link #type} field. */
    public XrFrameEndInfoML type$Default() { return type(MLFrameEndInfo.XR_TYPE_FRAME_END_INFO_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrFrameEndInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #focusDistance} field. */
    public XrFrameEndInfoML focusDistance(float value) { nfocusDistance(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public XrFrameEndInfoML flags(@NativeType("XrFrameEndInfoFlagsML") long value) { nflags(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrFrameEndInfoML set(
        int type,
        long next,
        float focusDistance,
        long flags
    ) {
        type(type);
        next(next);
        focusDistance(focusDistance);
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
    public XrFrameEndInfoML set(XrFrameEndInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrFrameEndInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrFrameEndInfoML malloc() {
        return new XrFrameEndInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrFrameEndInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrFrameEndInfoML calloc() {
        return new XrFrameEndInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrFrameEndInfoML} instance allocated with {@link BufferUtils}. */
    public static XrFrameEndInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrFrameEndInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrFrameEndInfoML} instance for the specified memory address. */
    public static XrFrameEndInfoML create(long address) {
        return new XrFrameEndInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFrameEndInfoML createSafe(long address) {
        return address == NULL ? null : new XrFrameEndInfoML(address, null);
    }

    /**
     * Returns a new {@link XrFrameEndInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrFrameEndInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameEndInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrFrameEndInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrFrameEndInfoML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrFrameEndInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameEndInfoML malloc(MemoryStack stack) {
        return new XrFrameEndInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrFrameEndInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrFrameEndInfoML calloc(MemoryStack stack) {
        return new XrFrameEndInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrFrameEndInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrFrameEndInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrFrameEndInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrFrameEndInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrFrameEndInfoML.NEXT); }
    /** Unsafe version of {@link #focusDistance}. */
    public static float nfocusDistance(long struct) { return UNSAFE.getFloat(null, struct + XrFrameEndInfoML.FOCUSDISTANCE); }
    /** Unsafe version of {@link #flags}. */
    public static long nflags(long struct) { return UNSAFE.getLong(null, struct + XrFrameEndInfoML.FLAGS); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrFrameEndInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrFrameEndInfoML.NEXT, value); }
    /** Unsafe version of {@link #focusDistance(float) focusDistance}. */
    public static void nfocusDistance(long struct, float value) { UNSAFE.putFloat(null, struct + XrFrameEndInfoML.FOCUSDISTANCE, value); }
    /** Unsafe version of {@link #flags(long) flags}. */
    public static void nflags(long struct, long value) { UNSAFE.putLong(null, struct + XrFrameEndInfoML.FLAGS, value); }

    // -----------------------------------

    /** An array of {@link XrFrameEndInfoML} structs. */
    public static class Buffer extends StructBuffer<XrFrameEndInfoML, Buffer> implements NativeResource {

        private static final XrFrameEndInfoML ELEMENT_FACTORY = XrFrameEndInfoML.create(-1L);

        /**
         * Creates a new {@code XrFrameEndInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrFrameEndInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrFrameEndInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrFrameEndInfoML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrFrameEndInfoML.ntype(address()); }
        /** @return the value of the {@link XrFrameEndInfoML#next} field. */
        @NativeType("void const *")
        public long next() { return XrFrameEndInfoML.nnext(address()); }
        /** @return the value of the {@link XrFrameEndInfoML#focusDistance} field. */
        public float focusDistance() { return XrFrameEndInfoML.nfocusDistance(address()); }
        /** @return the value of the {@link XrFrameEndInfoML#flags} field. */
        @NativeType("XrFrameEndInfoFlagsML")
        public long flags() { return XrFrameEndInfoML.nflags(address()); }

        /** Sets the specified value to the {@link XrFrameEndInfoML#type} field. */
        public XrFrameEndInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrFrameEndInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLFrameEndInfo#XR_TYPE_FRAME_END_INFO_ML TYPE_FRAME_END_INFO_ML} value to the {@link XrFrameEndInfoML#type} field. */
        public XrFrameEndInfoML.Buffer type$Default() { return type(MLFrameEndInfo.XR_TYPE_FRAME_END_INFO_ML); }
        /** Sets the specified value to the {@link XrFrameEndInfoML#next} field. */
        public XrFrameEndInfoML.Buffer next(@NativeType("void const *") long value) { XrFrameEndInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrFrameEndInfoML#focusDistance} field. */
        public XrFrameEndInfoML.Buffer focusDistance(float value) { XrFrameEndInfoML.nfocusDistance(address(), value); return this; }
        /** Sets the specified value to the {@link XrFrameEndInfoML#flags} field. */
        public XrFrameEndInfoML.Buffer flags(@NativeType("XrFrameEndInfoFlagsML") long value) { XrFrameEndInfoML.nflags(address(), value); return this; }

    }

}