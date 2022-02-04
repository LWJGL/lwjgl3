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
 * Event indicating events were lost.
 * 
 * <h5>Description</h5>
 * 
 * <p>Receiving the {@link XrEventDataEventsLost} event structure indicates that the event queue overflowed and some events were removed at the position within the queue at which this event was found.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be {@link XR10#XR_TYPE_EVENT_DATA_EVENTS_LOST TYPE_EVENT_DATA_EVENTS_LOST}</li>
 * <li>{@code next} <b>must</b> be {@code NULL} or a valid pointer to the <a target="_blank" href="https://www.khronos.org/registry/OpenXR/specs/1.0/html/xrspec.html#valid-usage-for-structure-pointer-chains">next structure in a structure chain</a></li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link XrEventDataBaseHeader}, {@link XR10#xrPollEvent PollEvent}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrEventDataEventsLost {
 *     XrStructureType {@link #type};
 *     void const * {@link #next};
 *     uint32_t {@link #lostEventCount};
 * }</code></pre>
 */
public class XrEventDataEventsLost extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        LOSTEVENTCOUNT;

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
        LOSTEVENTCOUNT = layout.offsetof(2);
    }

    /**
     * Creates a {@code XrEventDataEventsLost} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEventDataEventsLost(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the {@code XrStructureType} of this structure. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** {@code NULL} or a pointer to the next structure in a structure chain. No such structures are defined in core OpenXR. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** the number of events which have overflowed since the last call to {@link XR10#xrPollEvent PollEvent}. */
    @NativeType("uint32_t")
    public int lostEventCount() { return nlostEventCount(address()); }

    /** Sets the specified value to the {@link #type} field. */
    public XrEventDataEventsLost type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_EVENTS_LOST TYPE_EVENT_DATA_EVENTS_LOST} value to the {@link #type} field. */
    public XrEventDataEventsLost type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_EVENTS_LOST); }
    /** Sets the specified value to the {@link #next} field. */
    public XrEventDataEventsLost next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@link #lostEventCount} field. */
    public XrEventDataEventsLost lostEventCount(@NativeType("uint32_t") int value) { nlostEventCount(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEventDataEventsLost set(
        int type,
        long next,
        int lostEventCount
    ) {
        type(type);
        next(next);
        lostEventCount(lostEventCount);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEventDataEventsLost set(XrEventDataEventsLost src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEventDataEventsLost} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEventDataEventsLost malloc() {
        return wrap(XrEventDataEventsLost.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrEventDataEventsLost} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEventDataEventsLost calloc() {
        return wrap(XrEventDataEventsLost.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrEventDataEventsLost} instance allocated with {@link BufferUtils}. */
    public static XrEventDataEventsLost create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrEventDataEventsLost.class, memAddress(container), container);
    }

    /** Returns a new {@code XrEventDataEventsLost} instance for the specified memory address. */
    public static XrEventDataEventsLost create(long address) {
        return wrap(XrEventDataEventsLost.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataEventsLost createSafe(long address) {
        return address == NULL ? null : wrap(XrEventDataEventsLost.class, address);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader} instance to {@code XrEventDataEventsLost}. */
    public static XrEventDataEventsLost create(XrEventDataBaseHeader value) {
        return wrap(XrEventDataEventsLost.class, value);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XrEventDataEventsLost.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrEventDataEventsLost.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    /** Downcasts the specified {@code XrEventDataBaseHeader.Buffer} instance to {@code XrEventDataEventsLost.Buffer}. */
    public static XrEventDataEventsLost.Buffer create(XrEventDataBaseHeader.Buffer value) {
        return wrap(Buffer.class, value);
    }

    /**
     * Returns a new {@code XrEventDataEventsLost} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataEventsLost malloc(MemoryStack stack) {
        return wrap(XrEventDataEventsLost.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrEventDataEventsLost} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEventDataEventsLost calloc(MemoryStack stack) {
        return wrap(XrEventDataEventsLost.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEventDataEventsLost.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEventDataEventsLost.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrEventDataEventsLost.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrEventDataEventsLost.NEXT); }
    /** Unsafe version of {@link #lostEventCount}. */
    public static int nlostEventCount(long struct) { return UNSAFE.getInt(null, struct + XrEventDataEventsLost.LOSTEVENTCOUNT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataEventsLost.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrEventDataEventsLost.NEXT, value); }
    /** Unsafe version of {@link #lostEventCount(int) lostEventCount}. */
    public static void nlostEventCount(long struct, int value) { UNSAFE.putInt(null, struct + XrEventDataEventsLost.LOSTEVENTCOUNT, value); }

    // -----------------------------------

    /** An array of {@link XrEventDataEventsLost} structs. */
    public static class Buffer extends StructBuffer<XrEventDataEventsLost, Buffer> implements NativeResource {

        private static final XrEventDataEventsLost ELEMENT_FACTORY = XrEventDataEventsLost.create(-1L);

        /**
         * Creates a new {@code XrEventDataEventsLost.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEventDataEventsLost#SIZEOF}, and its mark will be undefined.
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
        protected XrEventDataEventsLost getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link XrEventDataEventsLost#type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrEventDataEventsLost.ntype(address()); }
        /** @return the value of the {@link XrEventDataEventsLost#next} field. */
        @NativeType("void const *")
        public long next() { return XrEventDataEventsLost.nnext(address()); }
        /** @return the value of the {@link XrEventDataEventsLost#lostEventCount} field. */
        @NativeType("uint32_t")
        public int lostEventCount() { return XrEventDataEventsLost.nlostEventCount(address()); }

        /** Sets the specified value to the {@link XrEventDataEventsLost#type} field. */
        public XrEventDataEventsLost.Buffer type(@NativeType("XrStructureType") int value) { XrEventDataEventsLost.ntype(address(), value); return this; }
        /** Sets the {@link XR10#XR_TYPE_EVENT_DATA_EVENTS_LOST TYPE_EVENT_DATA_EVENTS_LOST} value to the {@link XrEventDataEventsLost#type} field. */
        public XrEventDataEventsLost.Buffer type$Default() { return type(XR10.XR_TYPE_EVENT_DATA_EVENTS_LOST); }
        /** Sets the specified value to the {@link XrEventDataEventsLost#next} field. */
        public XrEventDataEventsLost.Buffer next(@NativeType("void const *") long value) { XrEventDataEventsLost.nnext(address(), value); return this; }
        /** Sets the specified value to the {@link XrEventDataEventsLost#lostEventCount} field. */
        public XrEventDataEventsLost.Buffer lostEventCount(@NativeType("uint32_t") int value) { XrEventDataEventsLost.nlostEventCount(address(), value); return this; }

    }

}