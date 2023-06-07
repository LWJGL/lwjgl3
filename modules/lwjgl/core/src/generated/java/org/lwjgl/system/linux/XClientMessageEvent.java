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
 * Client message event.
 * 
 * <p>The {@code message_type} member is set to an atom that indicates how the data should be interpreted by the receiving client. The {@code format}
 * member is set to 8, 16, or 32 and specifies whether the data should be viewed as a list of bytes, shorts, or longs. The {@code data} member is a
 * union that contains the members {@code b}, {@code s}, and {@code l}. The {@code b}, {@code s}, and {@code l} members represent data of twenty 8-bit
 * values, ten 16-bit values, and five 32-bit values. Particular message types might not make use of all these values. The X server places no
 * interpretation on the values in the {@code window}, {@code message_type}, or {@code data} members.</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XClientMessageEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window {@link #window};
 *     Atom message_type;
 *     int format;
 *     struct {
 *         char b[20];
 *         short s[10];
 *         long l[5];
 *     } data;
 * }</code></pre>
 */
public class XClientMessageEvent extends Struct<XClientMessageEvent> implements NativeResource {

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
        WINDOW,
        MESSAGE_TYPE,
        FORMAT,
        DATA,
            DATA_B,
            DATA_S,
            DATA_L;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(4),
            __struct(
                __array(1, 20),
                __array(2, 10),
                __array(CLONG_SIZE, 5)
            )
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        MESSAGE_TYPE = layout.offsetof(5);
        FORMAT = layout.offsetof(6);
        DATA = layout.offsetof(7);
            DATA_B = layout.offsetof(8);
            DATA_S = layout.offsetof(9);
            DATA_L = layout.offsetof(10);
    }

    protected XClientMessageEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XClientMessageEvent create(long address, @Nullable ByteBuffer container) {
        return new XClientMessageEvent(address, container);
    }

    /**
     * Creates a {@code XClientMessageEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XClientMessageEvent(ByteBuffer container) {
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
    /** window it reported relative to */
    @NativeType("Window")
    public long window() { return nwindow(address()); }
    /** @return the value of the {@code message_type} field. */
    @NativeType("Atom")
    public long message_type() { return nmessage_type(address()); }
    /** @return the value of the {@code format} field. */
    public int format() { return nformat(address()); }
    /** @return a {@link ByteBuffer} view of the {@code data.b} field. */
    @NativeType("char[20]")
    public ByteBuffer data_b() { return ndata_b(address()); }
    /** @return the value at the specified index of the {@code data.b} field. */
    @NativeType("char")
    public byte data_b(int index) { return ndata_b(address(), index); }
    /** @return a {@link ShortBuffer} view of the {@code data.s} field. */
    @NativeType("short[10]")
    public ShortBuffer data_s() { return ndata_s(address()); }
    /** @return the value at the specified index of the {@code data.s} field. */
    public short data_s(int index) { return ndata_s(address(), index); }
    /** @return a {@link CLongBuffer} view of the {@code data.l} field. */
    @NativeType("long[5]")
    public CLongBuffer data_l() { return ndata_l(address()); }
    /** @return the value at the specified index of the {@code data.l} field. */
    public long data_l(int index) { return ndata_l(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public XClientMessageEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XClientMessageEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XClientMessageEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XClientMessageEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XClientMessageEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code message_type} field. */
    public XClientMessageEvent message_type(@NativeType("Atom") long value) { nmessage_type(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public XClientMessageEvent format(int value) { nformat(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code b} field. */
    public XClientMessageEvent data_b(@NativeType("char[20]") ByteBuffer value) { ndata_b(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code b} field. */
    public XClientMessageEvent data_b(int index, @NativeType("char") byte value) { ndata_b(address(), index, value); return this; }
    /** Copies the specified {@link ShortBuffer} to the {@code s} field. */
    public XClientMessageEvent data_s(@NativeType("short[10]") ShortBuffer value) { ndata_s(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code s} field. */
    public XClientMessageEvent data_s(int index, short value) { ndata_s(address(), index, value); return this; }
    /** Copies the specified {@link CLongBuffer} to the {@code l} field. */
    public XClientMessageEvent data_l(@NativeType("long[5]") CLongBuffer value) { ndata_l(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code l} field. */
    public XClientMessageEvent data_l(int index, long value) { ndata_l(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public XClientMessageEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        long message_type,
        int format,
        ByteBuffer data_b,
        ShortBuffer data_s,
        CLongBuffer data_l
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        message_type(message_type);
        format(format);
        data_b(data_b);
        data_s(data_s);
        data_l(data_l);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XClientMessageEvent set(XClientMessageEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XClientMessageEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XClientMessageEvent malloc() {
        return new XClientMessageEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XClientMessageEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XClientMessageEvent calloc() {
        return new XClientMessageEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XClientMessageEvent} instance allocated with {@link BufferUtils}. */
    public static XClientMessageEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XClientMessageEvent(memAddress(container), container);
    }

    /** Returns a new {@code XClientMessageEvent} instance for the specified memory address. */
    public static XClientMessageEvent create(long address) {
        return new XClientMessageEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XClientMessageEvent createSafe(long address) {
        return address == NULL ? null : new XClientMessageEvent(address, null);
    }

    /**
     * Returns a new {@link XClientMessageEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XClientMessageEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XClientMessageEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XClientMessageEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XClientMessageEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XClientMessageEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XClientMessageEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XClientMessageEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XClientMessageEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XClientMessageEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XClientMessageEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XClientMessageEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XClientMessageEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XClientMessageEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XClientMessageEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XClientMessageEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XClientMessageEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XClientMessageEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XClientMessageEvent malloc(MemoryStack stack) {
        return new XClientMessageEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XClientMessageEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XClientMessageEvent calloc(MemoryStack stack) {
        return new XClientMessageEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XClientMessageEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XClientMessageEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XClientMessageEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XClientMessageEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XClientMessageEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XClientMessageEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XClientMessageEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XClientMessageEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XClientMessageEvent.WINDOW); }
    /** Unsafe version of {@link #message_type}. */
    public static long nmessage_type(long struct) { return memGetCLong(struct + XClientMessageEvent.MESSAGE_TYPE); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + XClientMessageEvent.FORMAT); }
    /** Unsafe version of {@link #data_b}. */
    public static ByteBuffer ndata_b(long struct) { return memByteBuffer(struct + XClientMessageEvent.DATA_B, 20); }
    /** Unsafe version of {@link #data_b(int) data_b}. */
    public static byte ndata_b(long struct, int index) {
        return UNSAFE.getByte(null, struct + XClientMessageEvent.DATA_B + check(index, 20) * 1);
    }
    /** Unsafe version of {@link #data_s}. */
    public static ShortBuffer ndata_s(long struct) { return memShortBuffer(struct + XClientMessageEvent.DATA_S, 10); }
    /** Unsafe version of {@link #data_s(int) data_s}. */
    public static short ndata_s(long struct, int index) {
        return UNSAFE.getShort(null, struct + XClientMessageEvent.DATA_S + check(index, 10) * 2);
    }
    /** Unsafe version of {@link #data_l}. */
    public static CLongBuffer ndata_l(long struct) { return memCLongBuffer(struct + XClientMessageEvent.DATA_L, 5); }
    /** Unsafe version of {@link #data_l(int) data_l}. */
    public static long ndata_l(long struct, int index) {
        return memGetCLong(struct + XClientMessageEvent.DATA_L + check(index, 5) * CLONG_SIZE);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XClientMessageEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XClientMessageEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XClientMessageEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XClientMessageEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XClientMessageEvent.WINDOW, value); }
    /** Unsafe version of {@link #message_type(long) message_type}. */
    public static void nmessage_type(long struct, long value) { memPutCLong(struct + XClientMessageEvent.MESSAGE_TYPE, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { UNSAFE.putInt(null, struct + XClientMessageEvent.FORMAT, value); }
    /** Unsafe version of {@link #data_b(ByteBuffer) data_b}. */
    public static void ndata_b(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 20); }
        memCopy(memAddress(value), struct + XClientMessageEvent.DATA_B, value.remaining() * 1);
    }
    /** Unsafe version of {@link #data_b(int, byte) data_b}. */
    public static void ndata_b(long struct, int index, byte value) {
        UNSAFE.putByte(null, struct + XClientMessageEvent.DATA_B + check(index, 20) * 1, value);
    }
    /** Unsafe version of {@link #data_s(ShortBuffer) data_s}. */
    public static void ndata_s(long struct, ShortBuffer value) {
        if (CHECKS) { checkGT(value, 10); }
        memCopy(memAddress(value), struct + XClientMessageEvent.DATA_S, value.remaining() * 2);
    }
    /** Unsafe version of {@link #data_s(int, short) data_s}. */
    public static void ndata_s(long struct, int index, short value) {
        UNSAFE.putShort(null, struct + XClientMessageEvent.DATA_S + check(index, 10) * 2, value);
    }
    /** Unsafe version of {@link #data_l(CLongBuffer) data_l}. */
    public static void ndata_l(long struct, CLongBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + XClientMessageEvent.DATA_L, value.remaining() * CLONG_SIZE);
    }
    /** Unsafe version of {@link #data_l(int, long) data_l}. */
    public static void ndata_l(long struct, int index, long value) {
        memPutCLong(struct + XClientMessageEvent.DATA_L + check(index, 5) * CLONG_SIZE, value);
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XClientMessageEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XClientMessageEvent} structs. */
    public static class Buffer extends StructBuffer<XClientMessageEvent, Buffer> implements NativeResource {

        private static final XClientMessageEvent ELEMENT_FACTORY = XClientMessageEvent.create(-1L);

        /**
         * Creates a new {@code XClientMessageEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XClientMessageEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XClientMessageEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XClientMessageEvent.ntype(address()); }
        /** @return the value of the {@link XClientMessageEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XClientMessageEvent.nserial(address()); }
        /** @return the value of the {@link XClientMessageEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XClientMessageEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XClientMessageEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XClientMessageEvent.ndisplay(address()); }
        /** @return the value of the {@link XClientMessageEvent#window} field. */
        @NativeType("Window")
        public long window() { return XClientMessageEvent.nwindow(address()); }
        /** @return the value of the {@code message_type} field. */
        @NativeType("Atom")
        public long message_type() { return XClientMessageEvent.nmessage_type(address()); }
        /** @return the value of the {@code format} field. */
        public int format() { return XClientMessageEvent.nformat(address()); }
        /** @return a {@link ByteBuffer} view of the {@code data.b} field. */
        @NativeType("char[20]")
        public ByteBuffer data_b() { return XClientMessageEvent.ndata_b(address()); }
        /** @return the value at the specified index of the {@code data.b} field. */
        @NativeType("char")
        public byte data_b(int index) { return XClientMessageEvent.ndata_b(address(), index); }
        /** @return a {@link ShortBuffer} view of the {@code data.s} field. */
        @NativeType("short[10]")
        public ShortBuffer data_s() { return XClientMessageEvent.ndata_s(address()); }
        /** @return the value at the specified index of the {@code data.s} field. */
        public short data_s(int index) { return XClientMessageEvent.ndata_s(address(), index); }
        /** @return a {@link CLongBuffer} view of the {@code data.l} field. */
        @NativeType("long[5]")
        public CLongBuffer data_l() { return XClientMessageEvent.ndata_l(address()); }
        /** @return the value at the specified index of the {@code data.l} field. */
        public long data_l(int index) { return XClientMessageEvent.ndata_l(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public XClientMessageEvent.Buffer type(int value) { XClientMessageEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XClientMessageEvent#serial} field. */
        public XClientMessageEvent.Buffer serial(@NativeType("unsigned long") long value) { XClientMessageEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XClientMessageEvent#send_event} field. */
        public XClientMessageEvent.Buffer send_event(@NativeType("Bool") boolean value) { XClientMessageEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XClientMessageEvent#display} field. */
        public XClientMessageEvent.Buffer display(@NativeType("Display *") long value) { XClientMessageEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XClientMessageEvent#window} field. */
        public XClientMessageEvent.Buffer window(@NativeType("Window") long value) { XClientMessageEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code message_type} field. */
        public XClientMessageEvent.Buffer message_type(@NativeType("Atom") long value) { XClientMessageEvent.nmessage_type(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public XClientMessageEvent.Buffer format(int value) { XClientMessageEvent.nformat(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code b} field. */
        public XClientMessageEvent.Buffer data_b(@NativeType("char[20]") ByteBuffer value) { XClientMessageEvent.ndata_b(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code b} field. */
        public XClientMessageEvent.Buffer data_b(int index, @NativeType("char") byte value) { XClientMessageEvent.ndata_b(address(), index, value); return this; }
        /** Copies the specified {@link ShortBuffer} to the {@code s} field. */
        public XClientMessageEvent.Buffer data_s(@NativeType("short[10]") ShortBuffer value) { XClientMessageEvent.ndata_s(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code s} field. */
        public XClientMessageEvent.Buffer data_s(int index, short value) { XClientMessageEvent.ndata_s(address(), index, value); return this; }
        /** Copies the specified {@link CLongBuffer} to the {@code l} field. */
        public XClientMessageEvent.Buffer data_l(@NativeType("long[5]") CLongBuffer value) { XClientMessageEvent.ndata_l(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code l} field. */
        public XClientMessageEvent.Buffer data_l(int index, long value) { XClientMessageEvent.ndata_l(address(), index, value); return this; }

    }

}