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
 * Generated on {@code EnterWindow} and {@code FocusIn} when {@code KeyMapState} selected.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code serial} &ndash; # of last request processed by server</li>
 * <li>{@code send_event} &ndash; true if this came from an {@link X11#XSendEvent} request</li>
 * <li>{@code display} &ndash; {@code Display} the event was read from</li>
 * <li>{@code window} &ndash; window it reported relative to</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XKeymapEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Window window;
 *     char key_vector[32];
 * }</code></pre>
 */
public class XKeymapEvent extends Struct implements NativeResource {

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

    /** Returns the value of the {@code type} field. */
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code serial} field. */
    @NativeType("unsigned long")
    public long serial() { return nserial(address()); }
    /** Returns the value of the {@code send_event} field. */
    @NativeType("Bool")
    public boolean send_event() { return nsend_event(address()) != 0; }
    /** Returns the value of the {@code display} field. */
    @NativeType("Display *")
    public long display() { return ndisplay(address()); }
    /** Returns the value of the {@code window} field. */
    @NativeType("Window")
    public long window() { return nwindow(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code key_vector} field. */
    @NativeType("char[32]")
    public ByteBuffer key_vector() { return nkey_vector(address()); }
    /** Returns the value at the specified index of the {@code key_vector} field. */
    @NativeType("char")
    public byte key_vector(int index) { return nkey_vector(address(), index); }

    /** Sets the specified value to the {@code type} field. */
    public XKeymapEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XKeymapEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XKeymapEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XKeymapEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
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
        return wrap(XKeymapEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XKeymapEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XKeymapEvent calloc() {
        return wrap(XKeymapEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XKeymapEvent} instance allocated with {@link BufferUtils}. */
    public static XKeymapEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XKeymapEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XKeymapEvent} instance for the specified memory address. */
    public static XKeymapEvent create(long address) {
        return wrap(XKeymapEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XKeymapEvent createSafe(long address) {
        return address == NULL ? null : wrap(XKeymapEvent.class, address);
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XKeymapEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XKeymapEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XKeymapEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XKeymapEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XKeymapEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XKeymapEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XKeymapEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XKeymapEvent mallocStack(MemoryStack stack) {
        return wrap(XKeymapEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XKeymapEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XKeymapEvent callocStack(MemoryStack stack) {
        return wrap(XKeymapEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XKeymapEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XKeymapEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XKeymapEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XKeymapEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XKeymapEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XKeymapEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XKeymapEvent.WINDOW); }
    /** Unsafe version of {@link #key_vector}. */
    public static ByteBuffer nkey_vector(long struct) { return memByteBuffer(struct + XKeymapEvent.KEY_VECTOR, 32); }
    /** Unsafe version of {@link #key_vector(int) key_vector}. */
    public static byte nkey_vector(long struct, int index) {
        return UNSAFE.getByte(null, struct + XKeymapEvent.KEY_VECTOR + check(index, 32) * 1);
    }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XKeymapEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XKeymapEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XKeymapEvent.SEND_EVENT, value); }
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
        UNSAFE.putByte(null, struct + XKeymapEvent.KEY_VECTOR + check(index, 32) * 1, value);
    }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XKeymapEvent.DISPLAY));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XKeymapEvent} structs. */
    public static class Buffer extends StructBuffer<XKeymapEvent, Buffer> implements NativeResource {

        private static final XKeymapEvent ELEMENT_FACTORY = XKeymapEvent.create(-1L);

        /**
         * Creates a new {@code XKeymapEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XKeymapEvent#SIZEOF}, and its mark will be undefined.
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
        protected XKeymapEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XKeymapEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XKeymapEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XKeymapEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XKeymapEvent.ndisplay(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XKeymapEvent.nwindow(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code key_vector} field. */
        @NativeType("char[32]")
        public ByteBuffer key_vector() { return XKeymapEvent.nkey_vector(address()); }
        /** Returns the value at the specified index of the {@code key_vector} field. */
        @NativeType("char")
        public byte key_vector(int index) { return XKeymapEvent.nkey_vector(address(), index); }

        /** Sets the specified value to the {@code type} field. */
        public XKeymapEvent.Buffer type(int value) { XKeymapEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XKeymapEvent.Buffer serial(@NativeType("unsigned long") long value) { XKeymapEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XKeymapEvent.Buffer send_event(@NativeType("Bool") boolean value) { XKeymapEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XKeymapEvent.Buffer display(@NativeType("Display *") long value) { XKeymapEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XKeymapEvent.Buffer window(@NativeType("Window") long value) { XKeymapEvent.nwindow(address(), value); return this; }
        /** Copies the specified {@link ByteBuffer} to the {@code key_vector} field. */
        public XKeymapEvent.Buffer key_vector(@NativeType("char[32]") ByteBuffer value) { XKeymapEvent.nkey_vector(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code key_vector} field. */
        public XKeymapEvent.Buffer key_vector(int index, @NativeType("char") byte value) { XKeymapEvent.nkey_vector(address(), index, value); return this; }

    }

}