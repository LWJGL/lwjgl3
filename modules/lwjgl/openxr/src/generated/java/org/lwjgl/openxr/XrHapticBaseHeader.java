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
 * Base header for haptic feedback.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_HAPTIC_VIBRATION TYPE_HAPTIC_VIBRATION}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrHapticVibration}, {@link XrInteractionProfileAnalogThresholdVALVE}, {@link XR10#xrApplyHapticFeedback ApplyHapticFeedback}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHapticBaseHeader {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 * }</code></pre>
 */
public class XrHapticBaseHeader extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
    }

    /**
     * Creates a {@code XrHapticBaseHeader} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHapticBaseHeader(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. This base structure itself has no associated {@code XrStructureType} value. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrHapticBaseHeader type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #next} field. */
    public XrHapticBaseHeader next(@NativeType("void const *") long value) { nnext(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHapticBaseHeader set(
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
    public XrHapticBaseHeader set(XrHapticBaseHeader src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHapticBaseHeader} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHapticBaseHeader malloc() {
        return wrap(XrHapticBaseHeader.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHapticBaseHeader} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHapticBaseHeader calloc() {
        return wrap(XrHapticBaseHeader.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHapticBaseHeader} instance allocated with {@link BufferUtils}. */
    public static XrHapticBaseHeader create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHapticBaseHeader.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHapticBaseHeader} instance for the specified memory address. */
    public static XrHapticBaseHeader create(long address) {
        return wrap(XrHapticBaseHeader.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHapticBaseHeader createSafe(long address) {
        return address == NULL ? null : wrap(XrHapticBaseHeader.class, address);
    }

    /** Upcasts the specified {@code XrHapticVibration} instance to {@code XrHapticBaseHeader}. */
    public static XrHapticBaseHeader create(XrHapticVibration value) {
        return wrap(XrHapticBaseHeader.class, value);
    }

    /**
     * Returns a new {@link XrHapticBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticBaseHeader.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrHapticBaseHeader.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticBaseHeader.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticBaseHeader.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrHapticBaseHeader.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrHapticBaseHeader.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrHapticBaseHeader.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHapticBaseHeader.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Upcasts the specified {@code XrHapticVibration.Buffer} instance to {@code XrHapticBaseHeader.Buffer}. */
    public static XrHapticBaseHeader.Buffer create(XrHapticVibration.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrHapticBaseHeader} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticBaseHeader malloc(MemoryStack stack) {
        return wrap(XrHapticBaseHeader.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHapticBaseHeader} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHapticBaseHeader calloc(MemoryStack stack) {
        return wrap(XrHapticBaseHeader.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrHapticBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticBaseHeader.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrHapticBaseHeader.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrHapticBaseHeader.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHapticBaseHeader.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHapticBaseHeader.NEXT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHapticBaseHeader.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHapticBaseHeader.NEXT, value); }

    // -----------------------------------

    /** An array of {@link XrHapticBaseHeader} structs. */
    public static class Buffer extends StructBuffer<XrHapticBaseHeader, Buffer> implements NativeResource {

        private static final XrHapticBaseHeader ELEMENT_FACTORY = XrHapticBaseHeader.create(-1L);

        /**
         * Creates a new {@code XrHapticBaseHeader.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHapticBaseHeader#SIZEOF}, and its mark will be undefined.
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
        protected XrHapticBaseHeader getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrHapticBaseHeader#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHapticBaseHeader.ntype(address()); }
        /** @return the value of the {@link XrHapticBaseHeader#next} field. */
        @NativeType("void const *")
        public long next() { return XrHapticBaseHeader.nnext(address()); }

        /** Sets the specified value to the {@link XrHapticBaseHeader#type} field. */
        public XrHapticBaseHeader.Buffer type(@NativeType("XrStructureType") int value) { XrHapticBaseHeader.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XrHapticBaseHeader#next} field. */
        public XrHapticBaseHeader.Buffer next(@NativeType("void const *") long value) { XrHapticBaseHeader.nnext(address(), value); return this; }

    }

}