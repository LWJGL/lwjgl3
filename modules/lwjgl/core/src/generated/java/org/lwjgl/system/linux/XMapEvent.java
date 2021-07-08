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
 * struct XMapEvent {
 *     int type;
 *     unsigned long {@link #serial};
 *     Bool {@link #send_event};
 *     Display * {@link #display};
 *     Window event;
 *     Window window;
 *     int {@link #override_redirect};
 * }</code></pre>
 */
public class XMapEvent extends Struct implements NativeResource {

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
        EVENT,
        WINDOW,
        OVERRIDE_REDIRECT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
            __member(CLONG_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        SERIAL = layout.offsetof(1);
        SEND_EVENT = layout.offsetof(2);
        DISPLAY = layout.offsetof(3);
        EVENT = layout.offsetof(4);
        WINDOW = layout.offsetof(5);
        OVERRIDE_REDIRECT = layout.offsetof(6);
    }

    /**
     * Creates a {@code XMapEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XMapEvent(ByteBuffer container) {
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
    /** @return the value of the {@code event} field. */
    @NativeType("Window")
    public long event() { return nevent(address()); }
    /** @return the value of the {@code window} field. */
    @NativeType("Window")
    public long window() { return nwindow(address()); }
    /** boolean, is override set... */
    public int override_redirect() { return noverride_redirect(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XMapEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@link #serial} field. */
    public XMapEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@link #send_event} field. */
    public XMapEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #display} field. */
    public XMapEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code event} field. */
    public XMapEvent event(@NativeType("Window") long value) { nevent(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XMapEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@link #override_redirect} field. */
    public XMapEvent override_redirect(int value) { noverride_redirect(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XMapEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long event,
        long window,
        int override_redirect
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        event(event);
        window(window);
        override_redirect(override_redirect);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XMapEvent set(XMapEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XMapEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XMapEvent malloc() {
        return wrap(XMapEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XMapEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XMapEvent calloc() {
        return wrap(XMapEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XMapEvent} instance allocated with {@link BufferUtils}. */
    public static XMapEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XMapEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XMapEvent} instance for the specified memory address. */
    public static XMapEvent create(long address) {
        return wrap(XMapEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XMapEvent createSafe(long address) {
        return address == NULL ? null : wrap(XMapEvent.class, address);
    }

    /**
     * Returns a new {@link XMapEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XMapEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XMapEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XMapEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XMapEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XMapEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XMapEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XMapEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XMapEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XMapEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XMapEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XMapEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XMapEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XMapEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XMapEvent mallocStack(MemoryStack stack) {
        return wrap(XMapEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XMapEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XMapEvent callocStack(MemoryStack stack) {
        return wrap(XMapEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XMapEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XMapEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XMapEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XMapEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XMapEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XMapEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XMapEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XMapEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XMapEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XMapEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XMapEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XMapEvent.DISPLAY); }
    /** Unsafe version of {@link #event}. */
    public static long nevent(long struct) { return memGetCLong(struct + XMapEvent.EVENT); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XMapEvent.WINDOW); }
    /** Unsafe version of {@link #override_redirect}. */
    public static int noverride_redirect(long struct) { return UNSAFE.getInt(null, struct + XMapEvent.OVERRIDE_REDIRECT); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XMapEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XMapEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XMapEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XMapEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #event(long) event}. */
    public static void nevent(long struct, long value) { memPutCLong(struct + XMapEvent.EVENT, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XMapEvent.WINDOW, value); }
    /** Unsafe version of {@link #override_redirect(int) override_redirect}. */
    public static void noverride_redirect(long struct, int value) { UNSAFE.putInt(null, struct + XMapEvent.OVERRIDE_REDIRECT, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XMapEvent.DISPLAY));
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

    /** An array of {@link XMapEvent} structs. */
    public static class Buffer extends StructBuffer<XMapEvent, Buffer> implements NativeResource {

        private static final XMapEvent ELEMENT_FACTORY = XMapEvent.create(-1L);

        /**
         * Creates a new {@code XMapEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XMapEvent#SIZEOF}, and its mark will be undefined.
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
        protected XMapEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        public int type() { return XMapEvent.ntype(address()); }
        /** @return the value of the {@link XMapEvent#serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XMapEvent.nserial(address()); }
        /** @return the value of the {@link XMapEvent#send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XMapEvent.nsend_event(address()) != 0; }
        /** @return the value of the {@link XMapEvent#display} field. */
        @NativeType("Display *")
        public long display() { return XMapEvent.ndisplay(address()); }
        /** @return the value of the {@code event} field. */
        @NativeType("Window")
        public long event() { return XMapEvent.nevent(address()); }
        /** @return the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XMapEvent.nwindow(address()); }
        /** @return the value of the {@link XMapEvent#override_redirect} field. */
        public int override_redirect() { return XMapEvent.noverride_redirect(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XMapEvent.Buffer type(int value) { XMapEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@link XMapEvent#serial} field. */
        public XMapEvent.Buffer serial(@NativeType("unsigned long") long value) { XMapEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@link XMapEvent#send_event} field. */
        public XMapEvent.Buffer send_event(@NativeType("Bool") boolean value) { XMapEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link XMapEvent#display} field. */
        public XMapEvent.Buffer display(@NativeType("Display *") long value) { XMapEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code event} field. */
        public XMapEvent.Buffer event(@NativeType("Window") long value) { XMapEvent.nevent(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XMapEvent.Buffer window(@NativeType("Window") long value) { XMapEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@link XMapEvent#override_redirect} field. */
        public XMapEvent.Buffer override_redirect(int value) { XMapEvent.noverride_redirect(address(), value); return this; }

    }

}