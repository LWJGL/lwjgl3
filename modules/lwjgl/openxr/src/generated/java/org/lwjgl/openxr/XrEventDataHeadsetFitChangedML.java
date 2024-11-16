/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Event containing the latest headset fit state.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLUserCalibration XR_ML_user_calibration} extension <b>must</b> be enabled prior to using {@link XrEventDataHeadsetFitChangedML}</li>
 * <li>{@code type} <b>must</b> be {@link MLUserCalibration#XR_TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a href="https://registry.khronos.org/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link MLUserCalibration#xrEnableUserCalibrationEventsML EnableUserCalibrationEventsML}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataHeadsetFitChangedML {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrHeadsetFitStatusML {@link #status};
 *     XrTime {@link #time};
 * }</code></pre>
 */
public class XrEventDataHeadsetFitChangedML extends Struct<XrEventDataHeadsetFitChangedML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        STATUS,
        TIME;

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
        STATUS = layout.offsetof(2);
        TIME = layout.offsetof(3);
    }

    protected XrEventDataHeadsetFitChangedML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEventDataHeadsetFitChangedML create(long address, @Nullable ByteBuffer container) {
        return new XrEventDataHeadsetFitChangedML(address, container);
    }

    /**
     * Creates a {@code XrEventDataHeadsetFitChangedML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataHeadsetFitChangedML(ByteBuffer container) {
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
    /** the {@code XrHeadsetFitStatusML} headset fit status. */
    @NativeType("XrHeadsetFitStatusML")
    public int status() { return nstatus(address()); }
    /** the {@code XrTime} at which the {@code status} was captured. */
    @NativeType("XrTime")
    public long time() { return ntime(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataHeadsetFitChangedML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLUserCalibration#XR_TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML} value to the {@link #type} field. */
    public XrEventDataHeadsetFitChangedML type$Default() { return type(MLUserCalibration.XR_TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataHeadsetFitChangedML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataHeadsetFitChangedML set(
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
    public XrEventDataHeadsetFitChangedML set(XrEventDataHeadsetFitChangedML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataHeadsetFitChangedML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataHeadsetFitChangedML malloc() {
        return new XrEventDataHeadsetFitChangedML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataHeadsetFitChangedML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataHeadsetFitChangedML calloc() {
        return new XrEventDataHeadsetFitChangedML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEventDataHeadsetFitChangedML} instance allocated with {@link BufferUtils}. */
    public static XrEventDataHeadsetFitChangedML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEventDataHeadsetFitChangedML(memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataHeadsetFitChangedML} instance for the specified memory address. */
    public static XrEventDataHeadsetFitChangedML create(long address) {
        return new XrEventDataHeadsetFitChangedML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEventDataHeadsetFitChangedML createSafe(long address) {
        return address == NULL ? null : new XrEventDataHeadsetFitChangedML(address, null);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataHeadsetFitChangedML}. */
    public static XrEventDataHeadsetFitChangedML create(XrEventDataBaseHeader value) {
        return new XrEventDataHeadsetFitChangedML(value.address(), __getContainer(value));
    }

    /**
     * Returns a new {@link XrEventDataHeadsetFitChangedML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataHeadsetFitChangedML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataHeadsetFitChangedML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataHeadsetFitChangedML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataHeadsetFitChangedML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataHeadsetFitChangedML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEventDataHeadsetFitChangedML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataHeadsetFitChangedML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEventDataHeadsetFitChangedML.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataHeadsetFitChangedML.Buffer}. */
    public static XrEventDataHeadsetFitChangedML.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return new XrEventDataHeadsetFitChangedML.Buffer(value.address(), __getContainer(value), -1, 0, value.remaining(), value.remaining());
    }

    /**
     * Returns a new {@code XrEventDataHeadsetFitChangedML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataHeadsetFitChangedML malloc(MemoryStack stack) {
        return new XrEventDataHeadsetFitChangedML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEventDataHeadsetFitChangedML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataHeadsetFitChangedML calloc(MemoryStack stack) {
        return new XrEventDataHeadsetFitChangedML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEventDataHeadsetFitChangedML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataHeadsetFitChangedML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataHeadsetFitChangedML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataHeadsetFitChangedML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrEventDataHeadsetFitChangedML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataHeadsetFitChangedML.NEXT); }
    /** Unsafe version of {@link #status}. */
    public static int nstatus(long struct) { return memGetInt(struct + XrEventDataHeadsetFitChangedML.STATUS); }
    /** Unsafe version of {@link #time}. */
    public static long ntime(long struct) { return memGetLong(struct + XrEventDataHeadsetFitChangedML.TIME); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrEventDataHeadsetFitChangedML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataHeadsetFitChangedML.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataHeadsetFitChangedML} structs. */
    public static class Buffer extends StructBuffer<XrEventDataHeadsetFitChangedML, Buffer> implements NativeResource {

        private static final XrEventDataHeadsetFitChangedML ELEMENT_FACTORY = XrEventDataHeadsetFitChangedML.create(-1L);

        /**
         * Creates a new {@code XrEventDataHeadsetFitChangedML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataHeadsetFitChangedML#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrEventDataHeadsetFitChangedML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataHeadsetFitChangedML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataHeadsetFitChangedML.ntype(address()); }
        /** @return the value of the {@link XrEventDataHeadsetFitChangedML#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataHeadsetFitChangedML.nnext(address()); }
        /** @return the value of the {@link XrEventDataHeadsetFitChangedML#status} field. */
        @NativeType("XrHeadsetFitStatusML")
        public int status() { return XrEventDataHeadsetFitChangedML.nstatus(address()); }
        /** @return the value of the {@link XrEventDataHeadsetFitChangedML#time} field. */
        @NativeType("XrTime")
        public long time() { return XrEventDataHeadsetFitChangedML.ntime(address()); }

        /** Sets the specified value to the {@link XrEventDataHeadsetFitChangedML#type} field. */
        public XrEventDataHeadsetFitChangedML.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataHeadsetFitChangedML.ntype(address(), value); return this; }
        /** Sets the {@link MLUserCalibration#XR_TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML} value to the {@link XrEventDataHeadsetFitChangedML#type} field. */
        public XrEventDataHeadsetFitChangedML.Buffer type$Default() { return type(MLUserCalibration.XR_TYPE_EVENT_DATA_HEADSET_FIT_CHANGED_ML); }
        /** Sets the specified value to the {@link XrEventDataHeadsetFitChangedML#next} field. */
        public XrEventDataHeadsetFitChangedML.Buffer next(@NativeType("void const *") long value) { XrEventDataHeadsetFitChangedML.nnext(address(), value); return this; }

    }

}