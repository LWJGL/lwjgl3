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
 * struct XGraphicsExposeEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Drawable drawable;
 *     int x;
 *     int y;
 *     int width;
 *     int height;
 *     int {@link #count};
 *     int {@link #major_code};
 *     int {@link #minor_code};
 * }</code></pre>
 */
public class XGraphicsExposeEvent extends Struct<XGraphicsExposeEvent> implements NativeResource {

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
        X,
        Y,
        WIDTH,
        HEIGHT,
        COUNT,
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
            __member(4),
            __member(4),
            __member(4),
            __member(4),
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
        X = layout.offsetof(5);
        Y = layout.offsetof(6);
        WIDTH = layout.offsetof(7);
        HEIGHT = layout.offsetof(8);
        COUNT = layout.offsetof(9);
        MAJOR_CODE = layout.offsetof(10);
        MINOR_CODE = layout.offsetof(11);
    }

    protected XGraphicsExposeEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XGraphicsExposeEvent create(long address, @Nullable ByteBuffer container) {
        return new XGraphicsExposeEvent(address, container);
    }

    /**
     * Creates a {@code XGraphicsExposeEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XGraphicsExposeEvent(ByteBuffer container) {
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
    /** @return the value of the {@code x} field. */
    public int x() { return nx(address()); }
    /** @return the value of the {@code y} field. */
    public int y() { return ny(address()); }
    /** @return the value of the {@code width} field. */
    public int width() { return nwidth(address()); }
    /** @return the value of the {@code height} field. */
    public int height() { return nheight(address()); }
    /** if non-zero, at least this many more */
    public int count() { return ncount(address()); }
    /** core is {@code CopyArea} or {@code CopyPlane} */
    public int major_code() { return nmajor_code(address()); }
    /** not defined in the core */
    public int minor_code() { return nminor_code(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XGraphicsExposeEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XGraphicsExposeEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XGraphicsExposeEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XGraphicsExposeEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code drawable} field. */
    public XGraphicsExposeEvent drawable(@NativeType("Drawable") long value) { ndrawable(address(), value); return this; }
    /** Sets the specified value to the {@code x} field. */
    public XGraphicsExposeEvent x(int value) { nx(address(), value); return this; }
    /** Sets the specified value to the {@code y} field. */
    public XGraphicsExposeEvent y(int value) { ny(address(), value); return this; }
    /** Sets the specified value to the {@code width} field. */
    public XGraphicsExposeEvent width(int value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@code height} field. */
    public XGraphicsExposeEvent height(int value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #count} field. */
    public XGraphicsExposeEvent count(int value) { ncount(address(), value); return this; }
    /** Sets the specified value to the {@link #major_code} field. */
    public XGraphicsExposeEvent major_code(int value) { nmajor_code(address(), value); return this; }
    /** Sets the specified value to the {@link #minor_code} field. */
    public XGraphicsExposeEvent minor_code(int value) { nminor_code(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XGraphicsExposeEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long drawable,
        int x,
        int y,
        int width,
        int height,
        int count,
        int major_code,
        int minor_code
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        drawable(drawable);
        x(x);
        y(y);
        width(width);
        height(height);
        count(count);
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
    public XGraphicsExposeEvent set(XGraphicsExposeEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XGraphicsExposeEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XGraphicsExposeEvent malloc() {
        return new XGraphicsExposeEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XGraphicsExposeEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XGraphicsExposeEvent calloc() {
        return new XGraphicsExposeEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XGraphicsExposeEvent} instance allocated with {@link BufferUtils}. */
    public static XGraphicsExposeEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XGraphicsExposeEvent(memAddress(container), container);
    }

    /** Returns a new {@code XGraphicsExposeEvent} instance for the specified memory address. */
    public static XGraphicsExposeEvent create(long address) {
        return new XGraphicsExposeEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XGraphicsExposeEvent createSafe(long address) {
        return address == NULL ? null : new XGraphicsExposeEvent(address, null);
    }

    /**
     * Returns a new {@link XGraphicsExposeEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XGraphicsExposeEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XGraphicsExposeEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XGraphicsExposeEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XGraphicsExposeEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XGraphicsExposeEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XGraphicsExposeEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XGraphicsExposeEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XGraphicsExposeEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XGraphicsExposeEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XGraphicsExposeEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XGraphicsExposeEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XGraphicsExposeEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XGraphicsExposeEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XGraphicsExposeEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XGraphicsExposeEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XGraphicsExposeEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XGraphicsExposeEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XGraphicsExposeEvent malloc(MemoryStack stack) {
        return new XGraphicsExposeEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XGraphicsExposeEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XGraphicsExposeEvent calloc(MemoryStack stack) {
        return new XGraphicsExposeEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XGraphicsExposeEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XGraphicsExposeEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XGraphicsExposeEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XGraphicsExposeEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XGraphicsExposeEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XGraphicsExposeEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XGraphicsExposeEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XGraphicsExposeEvent.DISPLAY); }
    /** Unsafe version of {@link #drawable}. */
    public static long ndrawable(long struct) { return memGetCLong(struct + XGraphicsExposeEvent.DRAWABLE); }
    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + XGraphicsExposeEvent.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + XGraphicsExposeEvent.Y); }
    /** Unsafe version of {@link #width}. */
    public static int nwidth(long struct) { return UNSAFE.getInt(null, struct + XGraphicsExposeEvent.WIDTH); }
    /** Unsafe version of {@link #height}. */
    public static int nheight(long struct) { return UNSAFE.getInt(null, struct + XGraphicsExposeEvent.HEIGHT); }
    /** Unsafe version of {@link #count}. */
    public static int ncount(long struct) { return UNSAFE.getInt(null, struct + XGraphicsExposeEvent.COUNT); }
    /** Unsafe version of {@link #major_code}. */
    public static int nmajor_code(long struct) { return UNSAFE.getInt(null, struct + XGraphicsExposeEvent.MAJOR_CODE); }
    /** Unsafe version of {@link #minor_code}. */
    public static int nminor_code(long struct) { return UNSAFE.getInt(null, struct + XGraphicsExposeEvent.MINOR_CODE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XGraphicsExposeEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XGraphicsExposeEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XGraphicsExposeEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XGraphicsExposeEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #drawable(long) drawable}. */
    public static void ndrawable(long struct, long value) { memPutCLong(struct + XGraphicsExposeEvent.DRAWABLE, value); }
    /** Unsafe version of {@link #x(int) x}. */
    public static void nx(long struct, int value) { UNSAFE.putInt(null, struct + XGraphicsExposeEvent.X, value); }
    /** Unsafe version of {@link #y(int) y}. */
    public static void ny(long struct, int value) { UNSAFE.putInt(null, struct + XGraphicsExposeEvent.Y, value); }
    /** Unsafe version of {@link #width(int) width}. */
    public static void nwidth(long struct, int value) { UNSAFE.putInt(null, struct + XGraphicsExposeEvent.WIDTH, value); }
    /** Unsafe version of {@link #height(int) height}. */
    public static void nheight(long struct, int value) { UNSAFE.putInt(null, struct + XGraphicsExposeEvent.HEIGHT, value); }
    /** Unsafe version of {@link #count(int) count}. */
    public static void ncount(long struct, int value) { UNSAFE.putInt(null, struct + XGraphicsExposeEvent.COUNT, value); }
    /** Unsafe version of {@link #major_code(int) major_code}. */
    public static void nmajor_code(long struct, int value) { UNSAFE.putInt(null, struct + XGraphicsExposeEvent.MAJOR_CODE, value); }
    /** Unsafe version of {@link #minor_code(int) minor_code}. */
    public static void nminor_code(long struct, int value) { UNSAFE.putInt(null, struct + XGraphicsExposeEvent.MINOR_CODE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XGraphicsExposeEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XGraphicsExposeEvent} structs. */
    public static class Buffer extends StructBuffer<XGraphicsExposeEvent, Buffer> implements NativeResource {

        private static final XGraphicsExposeEvent ELEMENT_FACTORY = XGraphicsExposeEvent.create(-1L);

        /**
         * Creates a new {@code XGraphicsExposeEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XGraphicsExposeEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XGraphicsExposeEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XGraphicsExposeEvent.ntype(address()); }
        /** @return the value of the {@link XGraphicsExposeEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XGraphicsExposeEvent.nserial(address()); }
        /** @return the value of the {@link XGraphicsExposeEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XGraphicsExposeEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XGraphicsExposeEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XGraphicsExposeEvent.ndisplay(address()); }
        /** @return the value of the {@code drawable} field. */
        @NativeType("Drawable")
        public long drawable() { return XGraphicsExposeEvent.ndrawable(address()); }
        /** @return the value of the {@code x} field. */
        public int x() { return XGraphicsExposeEvent.nx(address()); }
        /** @return the value of the {@code y} field. */
        public int y() { return XGraphicsExposeEvent.ny(address()); }
        /** @return the value of the {@code width} field. */
        public int width() { return XGraphicsExposeEvent.nwidth(address()); }
        /** @return the value of the {@code height} field. */
        public int height() { return XGraphicsExposeEvent.nheight(address()); }
        /** @return the value of the {@link XGraphicsExposeEvent#count} field. */
        public int count() { return XGraphicsExposeEvent.ncount(address()); }
        /** @return the value of the {@link XGraphicsExposeEvent#major_code} field. */
        public int major_code() { return XGraphicsExposeEvent.nmajor_code(address()); }
        /** @return the value of the {@link XGraphicsExposeEvent#minor_code} field. */
        public int minor_code() { return XGraphicsExposeEvent.nminor_code(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XGraphicsExposeEvent.Buffer type(int value) { XGraphicsExposeEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XGraphicsExposeEvent#serial} field. */
        public XGraphicsExposeEvent.Buffer serial(@NativeType("unsigned long") long value) { XGraphicsExposeEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XGraphicsExposeEvent#send_event} field. */
        public XGraphicsExposeEvent.Buffer send_event(@NativeType("Bool") boolean value) { XGraphicsExposeEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XGraphicsExposeEvent#display} field. */
        public XGraphicsExposeEvent.Buffer display(@NativeType("Display *") long value) { XGraphicsExposeEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code drawable} field. */
        public XGraphicsExposeEvent.Buffer drawable(@NativeType("Drawable") long value) { XGraphicsExposeEvent.ndrawable(address(), value); return this; }
        /** Sets the specified value to the {@code x} field. */
        public XGraphicsExposeEvent.Buffer x(int value) { XGraphicsExposeEvent.nx(address(), value); return this; }
        /** Sets the specified value to the {@code y} field. */
        public XGraphicsExposeEvent.Buffer y(int value) { XGraphicsExposeEvent.ny(address(), value); return this; }
        /** Sets the specified value to the {@code width} field. */
        public XGraphicsExposeEvent.Buffer width(int value) { XGraphicsExposeEvent.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@code height} field. */
        public XGraphicsExposeEvent.Buffer height(int value) { XGraphicsExposeEvent.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link XGraphicsExposeEvent#count} field. */
        public XGraphicsExposeEvent.Buffer count(int value) { XGraphicsExposeEvent.ncount(address(), value); return this; }
        /** Sets the specified value to the {@link XGraphicsExposeEvent#major_code} field. */
        public XGraphicsExposeEvent.Buffer major_code(int value) { XGraphicsExposeEvent.nmajor_code(address(), value); return this; }
        /** Sets the specified value to the {@link XGraphicsExposeEvent#minor_code} field. */
        public XGraphicsExposeEvent.Buffer minor_code(int value) { XGraphicsExposeEvent.nminor_code(address(), value); return this; }

    }

}