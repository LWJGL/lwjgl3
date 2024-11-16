/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.linux;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Generated on {@code EnterWindow} and {@code FocusIn} when {@code KeyMapState} selected.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XKeymapEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window {@link #window};
 *     char key_vector[32];
 * }</code></pre>
 */
public class XKeymapEvent extends Struct<XKeymapEvent> implements NativeResource {

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
        KEY_VECTOR;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __array(1, 32)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        WINDOW = layout.offsetof(4);
        KEY_VECTOR = layout.offsetof(5);
    }

    protected XKeymapEvent(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XKeymapEvent create(long address, @Nullable ByteBuffer container) {
        return new XKeymapEvent(address, container);
    }

    /**
     * Creates a {@code XKeymapEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XKeymapEvent(ByteBuffer container) {
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
    /** @return a {@link ByteBuffer} view of the {@code key_vector} field. */
    @NativeType("char[32]")
    public ByteBuffer key_vector() { return nkey_vector(address()); }
    /** @return the value at the specified index of the {@code key_vector} field. */
    @NativeType("char")
    public byte key_vector(int index) { return nkey_vector(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public XKeymapEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XKeymapEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XKeymapEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XKeymapEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@link #window} field. */
    public XKeymapEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Copies the specified {@link ByteBuffer} to the {@code key_vector} field. */
    public XKeymapEvent key_vector(@NativeType("char[32]") ByteBuffer value) { nkey_vector(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code key_vector} field. */
    public XKeymapEvent key_vector(int index, @NativeType("char") byte value) { nkey_vector(address(), index, value); return this; }

    /** Initializes this struct with the specified values. */
    public XKeymapEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        ByteBuffer key_vector
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        key_vector(key_vector);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XKeymapEvent set(XKeymapEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XKeymapEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XKeymapEvent malloc() {
        return new XKeymapEvent(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XKeymapEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XKeymapEvent calloc() {
        return new XKeymapEvent(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XKeymapEvent} instance allocated with {@link BufferUtils}. */
    public static XKeymapEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XKeymapEvent(memAddress(container), container);
    }

    /** Returns a new {@code XKeymapEvent} instance for the specified memory address. */
    public static XKeymapEvent create(long address) {
        return new XKeymapEvent(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XKeymapEvent createSafe(long address) {
        return address == NULL ? null : new XKeymapEvent(address, null);
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XKeymapEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XKeymapEvent.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XKeymapEvent mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XKeymapEvent callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static XKeymapEvent mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static XKeymapEvent callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XKeymapEvent.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XKeymapEvent.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static XKeymapEvent.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static XKeymapEvent.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code XKeymapEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XKeymapEvent malloc(MemoryStack stack) {
        return new XKeymapEvent(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XKeymapEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XKeymapEvent calloc(MemoryStack stack) {
        return new XKeymapEvent(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XKeymapEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XKeymapEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return memGetInt(struct + XKeymapEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XKeymapEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XKeymapEvent.WINDOW); }
    /** Unsafe version of {@link #key_vector}. */
    public static ByteBuffer nkey_vector(long struct) { return memByteBuffer(struct + XKeymapEvent.KEY_VECTOR, 32); }
    /** Unsafe version of {@link #key_vector(int) key_vector}. */
    public static byte nkey_vector(long struct, int index) {
        return memGetByte(struct + XKeymapEvent.KEY_VECTOR + check(index, 32) * 1);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XKeymapEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XKeymapEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { memPutInt(struct + XKeymapEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XKeymapEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XKeymapEvent.WINDOW, value); }
    /** Unsafe version of {@link #key_vector(ByteBuffer) key_vector}. */
    public static void nkey_vector(long struct, ByteBuffer value) {
        if (CHECKS) { checkGT(value, 32); }
        memCopy(memAddress(value), struct + XKeymapEvent.KEY_VECTOR, value.remaining() * 1);
    }
    /** Unsafe version of {@link #key_vector(int, byte) key_vector}. */
    public static void nkey_vector(long struct, int index, byte value) {
        memPutByte(struct + XKeymapEvent.KEY_VECTOR + check(index, 32) * 1, value);
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XKeymapEvent.DISPLAY));
    }

    // -----------------------------------

    /** An array of {@link XKeymapEvent} structs. */
    public static class Buffer extends StructBuffer<XKeymapEvent, Buffer> implements NativeResource {

        private static final XKeymapEvent ELEMENT_FACTORY = XKeymapEvent.create(-1L);

        /**
         * Creates a new {@code XKeymapEvent.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XKeymapEvent#SIZEOF}, and its mark will be undefined.</p>
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
        protected XKeymapEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XKeymapEvent.ntype(address()); }
        /** @return the value of the {@link XKeymapEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XKeymapEvent.nserial(address()); }
        /** @return the value of the {@link XKeymapEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XKeymapEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XKeymapEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XKeymapEvent.ndisplay(address()); }
        /** @return the value of the {@link XKeymapEvent#window} field. */
        @NativeType("Window")
        public long window() { return XKeymapEvent.nwindow(address()); }
        /** @return a {@link ByteBuffer} view of the {@code key_vector} field. */
        @NativeType("char[32]")
        public ByteBuffer key_vector() { return XKeymapEvent.nkey_vector(address()); }
        /** @return the value at the specified index of the {@code key_vector} field. */
        @NativeType("char")
        public byte key_vector(int index) { return XKeymapEvent.nkey_vector(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public XKeymapEvent.Buffer type(int value) { XKeymapEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XKeymapEvent#serial} field. */
        public XKeymapEvent.Buffer serial(@NativeType("unsigned long") long value) { XKeymapEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XKeymapEvent#send_event} field. */
        public XKeymapEvent.Buffer send_event(@NativeType("Bool") boolean value) { XKeymapEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XKeymapEvent#display} field. */
        public XKeymapEvent.Buffer display(@NativeType("Display *") long value) { XKeymapEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@link XKeymapEvent#window} field. */
        public XKeymapEvent.Buffer window(@NativeType("Window") long value) { XKeymapEvent.nwindow(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code key_vector} field. */
        public XKeymapEvent.Buffer key_vector(@NativeType("char[32]") ByteBuffer value) { XKeymapEvent.nkey_vector(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code key_vector} field. */
        public XKeymapEvent.Buffer key_vector(int index, @NativeType("char") byte value) { XKeymapEvent.nkey_vector(address(), index, value); return this; }

    }

}