/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XNoExposeEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Drawable drawable;
 *     int {@link #major_code};
 *     int {@link #minor_code};
 * }</code></pre>
 */
public class XNoExposeEvent extends Struct<XNoExposeEvent> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        SERIAL,
        SEND_EVENT,
        DISPLAY,
        DRAWABLE,
        MAJOR_CODE,
        MINOR_CODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        DRAWABLE = layout.offsetof(4);
        MAJOR_CODE = layout.offsetof(5);
        MINOR_CODE = layout.offsetof(6);
    }

    protected XNoExposeEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XNoExposeEvent create(long address, @Nullable ByteBuffer container) {
        return new XNoExposeEvent(address, container);
    }

    /**
     * Creates a {@code XNoExposeEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XNoExposeEvent(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** # of last request processed by server */
    @NativeType("unsigned long")
    public long serial() { return nserial(address()); }
    /** true if this came from an {@link X11#XSendEvent} request */
    @NativeType("Bool")
    public boolean send_event() { return nsend_event(address()) != 0; }
    /** {@code Display} the event was read from */
    @NativeType("Display *")
    public long display() { return ndisplay(address()); }
    /** @return the value of the {@code drawable} field. */
    @NativeType("Drawable")
    public long drawable() { return ndrawable(address()); }
    /** core is {@code CopyArea} or {@code CopyPlane} */
    public int major_code() { return nmajor_code(address()); }
    /** not defined in the core */
    public int minor_code() { return nminor_code(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XNoExposeEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XNoExposeEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XNoExposeEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XNoExposeEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code drawable} field. */
    public XNoExposeEvent drawable(@NativeType("Drawable") long value) { ndrawable(address(), value); return this; }
    /** Sets the specified value to the {@link #major_code} field. */
    public XNoExposeEvent major_code(int value) { nmajor_code(address(), value); return this; }
    /** Sets the specified value to the {@link #minor_code} field. */
    public XNoExposeEvent minor_code(int value) { nminor_code(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XNoExposeEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long drawable,
        int major_code,
        int minor_code
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        drawable(drawable);
        major_code(major_code);
        minor_code(minor_code);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XNoExposeEvent set(XNoExposeEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XNoExposeEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XNoExposeEvent malloc() {
        return new XNoExposeEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XNoExposeEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XNoExposeEvent calloc() {
        return new XNoExposeEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XNoExposeEvent} instance allocated with {@link BufferUtils}. */
    public static XNoExposeEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XNoExposeEvent(memAddress(container), container);
    }

    /** Returns a new {@code XNoExposeEvent} instance for the specified memory address. */
    public static XNoExposeEvent create(long address) {
        return new XNoExposeEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XNoExposeEvent createSafe(long address) {
        return address == NULL ? null : new XNoExposeEvent(address, null);
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XNoExposeEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XNoExposeEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XNoExposeEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XNoExposeEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XNoExposeEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XNoExposeEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XNoExposeEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XNoExposeEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XNoExposeEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XNoExposeEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XNoExposeEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XNoExposeEvent malloc(MemoryStack stack) {
        return new XNoExposeEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XNoExposeEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XNoExposeEvent calloc(MemoryStack stack) {
        return new XNoExposeEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XNoExposeEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XNoExposeEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XNoExposeEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XNoExposeEvent.DISPLAY); }
    /** Unsafe version of {@link #drawable}. */
    public static long ndrawable(long struct) { return memGetCLong(struct + XNoExposeEvent.DRAWABLE); }
    /** Unsafe version of {@link #major_code}. */
    public static int nmajor_code(long struct) { return UNSAFE.getInt(null, struct + XNoExposeEvent.MAJOR_CODE); }
    /** Unsafe version of {@link #minor_code}. */
    public static int nminor_code(long struct) { return UNSAFE.getInt(null, struct + XNoExposeEvent.MINOR_CODE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XNoExposeEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XNoExposeEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XNoExposeEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XNoExposeEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #drawable(long) drawable}. */
    public static void ndrawable(long struct, long value) { memPutCLong(struct + XNoExposeEvent.DRAWABLE, value); }
    /** Unsafe version of {@link #major_code(int) major_code}. */
    public static void nmajor_code(long struct, int value) { UNSAFE.putInt(null, struct + XNoExposeEvent.MAJOR_CODE, value); }
    /** Unsafe version of {@link #minor_code(int) minor_code}. */
    public static void nminor_code(long struct, int value) { UNSAFE.putInt(null, struct + XNoExposeEvent.MINOR_CODE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XNoExposeEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XNoExposeEvent} structs. */
    public static class Buffer extends StructBuffer<XNoExposeEvent, Buffer> implements NativeResource {

        private static final XNoExposeEvent ELEMENT_FACTORY = XNoExposeEvent.create(-1L);

        /**
         * Creates a new {@code XNoExposeEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XNoExposeEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XNoExposeEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XNoExposeEvent.ntype(address()); }
        /** @return the value of the {@link XNoExposeEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XNoExposeEvent.nserial(address()); }
        /** @return the value of the {@link XNoExposeEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XNoExposeEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XNoExposeEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XNoExposeEvent.ndisplay(address()); }
        /** @return the value of the {@code drawable} field. */
        @NativeType("Drawable")
        public long drawable() { return XNoExposeEvent.ndrawable(address()); }
        /** @return the value of the {@link XNoExposeEvent#major_code} field. */
        public int major_code() { return XNoExposeEvent.nmajor_code(address()); }
        /** @return the value of the {@link XNoExposeEvent#minor_code} field. */
        public int minor_code() { return XNoExposeEvent.nminor_code(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XNoExposeEvent.Buffer type(int value) { XNoExposeEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XNoExposeEvent#serial} field. */
        public XNoExposeEvent.Buffer serial(@NativeType("unsigned long") long value) { XNoExposeEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XNoExposeEvent#send_event} field. */
        public XNoExposeEvent.Buffer send_event(@NativeType("Bool") boolean value) { XNoExposeEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XNoExposeEvent#display} field. */
        public XNoExposeEvent.Buffer display(@NativeType("Display *") long value) { XNoExposeEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code drawable} field. */
        public XNoExposeEvent.Buffer drawable(@NativeType("Drawable") long value) { XNoExposeEvent.ndrawable(address(), value); return this; }
        /** Sets the specified value to the {@link XNoExposeEvent#major_code} field. */
        public XNoExposeEvent.Buffer major_code(int value) { XNoExposeEvent.nmajor_code(address(), value); return this; }
        /** Sets the specified value to the {@link XNoExposeEvent#minor_code} field. */
        public XNoExposeEvent.Buffer minor_code(int value) { XNoExposeEvent.nminor_code(address(), value); return this; }

    }

}