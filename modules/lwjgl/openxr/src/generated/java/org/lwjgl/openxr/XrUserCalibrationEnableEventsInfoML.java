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
 * Information to enable headset fit events.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>The {@link MLUserCalibration XR_ML_user_calibration} extension <b>must</b> be enabled prior to using {@link XrUserCalibrationEnableEventsInfoML}</li>
 * <li>{@code type} <b>must</b> be {@link MLUserCalibration#XR_TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML}</li>
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
 * struct XrUserCalibrationEnableEventsInfoML {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     XrBool32 {@link #enabled};
 * }</code></pre>
 */
public class XrUserCalibrationEnableEventsInfoML extends Struct<XrUserCalibrationEnableEventsInfoML> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENABLED;

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
        ENABLED = layout.offsetof(2);
    }

    protected XrUserCalibrationEnableEventsInfoML(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrUserCalibrationEnableEventsInfoML create(long address, @Nullable ByteBuffer container) {
        return new XrUserCalibrationEnableEventsInfoML(address, container);
    }

    /**
     * Creates a {@code XrUserCalibrationEnableEventsInfoML} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrUserCalibrationEnableEventsInfoML(ByteBuffer container) {
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
    /** the flag to enable/disable user calibration events. */
    @NativeType("XrBool32")
    public boolean enabled() { return nenabled(address()) != 0; }

    /** Sets the specified value to the {@link #type} field. */
    public XrUserCalibrationEnableEventsInfoML type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link MLUserCalibration#XR_TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML} value to the {@link #type} field. */
    public XrUserCalibrationEnableEventsInfoML type$Default() { return type(MLUserCalibration.XR_TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML); }
    /** Sets the specified value to the {@link #next} field. */
    public XrUserCalibrationEnableEventsInfoML next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #enabled} field. */
    public XrUserCalibrationEnableEventsInfoML enabled(@NativeType("XrBool32") boolean value) { nenabled(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public XrUserCalibrationEnableEventsInfoML set(
        int type,
        long next,
        boolean enabled
    ) {
        type(type);
        next(next);
        enabled(enabled);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrUserCalibrationEnableEventsInfoML set(XrUserCalibrationEnableEventsInfoML src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrUserCalibrationEnableEventsInfoML} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrUserCalibrationEnableEventsInfoML malloc() {
        return new XrUserCalibrationEnableEventsInfoML(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrUserCalibrationEnableEventsInfoML} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrUserCalibrationEnableEventsInfoML calloc() {
        return new XrUserCalibrationEnableEventsInfoML(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrUserCalibrationEnableEventsInfoML} instance allocated with {@link BufferUtils}. */
    public static XrUserCalibrationEnableEventsInfoML create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrUserCalibrationEnableEventsInfoML(memAddress(container), container);
    }

    /** Returns a new {@code XrUserCalibrationEnableEventsInfoML} instance for the specified memory address. */
    public static XrUserCalibrationEnableEventsInfoML create(long address) {
        return new XrUserCalibrationEnableEventsInfoML(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrUserCalibrationEnableEventsInfoML createSafe(long address) {
        return address == NULL ? null : new XrUserCalibrationEnableEventsInfoML(address, null);
    }

    /**
     * Returns a new {@link XrUserCalibrationEnableEventsInfoML.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUserCalibrationEnableEventsInfoML.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrUserCalibrationEnableEventsInfoML.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrUserCalibrationEnableEventsInfoML.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUserCalibrationEnableEventsInfoML.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrUserCalibrationEnableEventsInfoML.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrUserCalibrationEnableEventsInfoML.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrUserCalibrationEnableEventsInfoML.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrUserCalibrationEnableEventsInfoML.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrUserCalibrationEnableEventsInfoML} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUserCalibrationEnableEventsInfoML malloc(MemoryStack stack) {
        return new XrUserCalibrationEnableEventsInfoML(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrUserCalibrationEnableEventsInfoML} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrUserCalibrationEnableEventsInfoML calloc(MemoryStack stack) {
        return new XrUserCalibrationEnableEventsInfoML(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrUserCalibrationEnableEventsInfoML.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUserCalibrationEnableEventsInfoML.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrUserCalibrationEnableEventsInfoML.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrUserCalibrationEnableEventsInfoML.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrUserCalibrationEnableEventsInfoML.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrUserCalibrationEnableEventsInfoML.NEXT); }
    /** Unsafe version of {@link #enabled}. */
    public static int nenabled(long struct) { return UNSAFE.getInt(null, struct + XrUserCalibrationEnableEventsInfoML.ENABLED); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrUserCalibrationEnableEventsInfoML.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrUserCalibrationEnableEventsInfoML.NEXT, value); }
    /** Unsafe version of {@link #enabled(boolean) enabled}. */
    public static void nenabled(long struct, int value) { UNSAFE.putInt(null, struct + XrUserCalibrationEnableEventsInfoML.ENABLED, value); }

    // -----------------------------------

    /** An array of {@link XrUserCalibrationEnableEventsInfoML} structs. */
    public static class Buffer extends StructBuffer<XrUserCalibrationEnableEventsInfoML, Buffer> implements NativeResource {

        private static final XrUserCalibrationEnableEventsInfoML ELEMENT_FACTORY = XrUserCalibrationEnableEventsInfoML.create(-1L);

        /**
         * Creates a new {@code XrUserCalibrationEnableEventsInfoML.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrUserCalibrationEnableEventsInfoML#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrUserCalibrationEnableEventsInfoML getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrUserCalibrationEnableEventsInfoML#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrUserCalibrationEnableEventsInfoML.ntype(address()); }
        /** @return the value of the {@link XrUserCalibrationEnableEventsInfoML#next} field. */
        @NativeType("void const *")
        public long next() { return XrUserCalibrationEnableEventsInfoML.nnext(address()); }
        /** @return the value of the {@link XrUserCalibrationEnableEventsInfoML#enabled} field. */
        @NativeType("XrBool32")
        public boolean enabled() { return XrUserCalibrationEnableEventsInfoML.nenabled(address()) != 0; }

        /** Sets the specified value to the {@link XrUserCalibrationEnableEventsInfoML#type} field. */
        public XrUserCalibrationEnableEventsInfoML.Buffer type(@NativeType("XrStructureType") int value) { XrUserCalibrationEnableEventsInfoML.ntype(address(), value); return this; }
        /** Sets the {@link MLUserCalibration#XR_TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML} value to the {@link XrUserCalibrationEnableEventsInfoML#type} field. */
        public XrUserCalibrationEnableEventsInfoML.Buffer type$Default() { return type(MLUserCalibration.XR_TYPE_USER_CALIBRATION_ENABLE_EVENTS_INFO_ML); }
        /** Sets the specified value to the {@link XrUserCalibrationEnableEventsInfoML#next} field. */
        public XrUserCalibrationEnableEventsInfoML.Buffer next(@NativeType("void const *") long value) { XrUserCalibrationEnableEventsInfoML.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrUserCalibrationEnableEventsInfoML#enabled} field. */
        public XrUserCalibrationEnableEventsInfoML.Buffer enabled(@NativeType("XrBool32") boolean value) { XrUserCalibrationEnableEventsInfoML.nenabled(address(), value ? 1 : 0); return this; }

    }

}