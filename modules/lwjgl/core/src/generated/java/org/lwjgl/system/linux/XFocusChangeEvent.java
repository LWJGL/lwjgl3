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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code type} &ndash; one of:<br><table><tr><td>{@link X11#FocusIn}</td><td>{@link X11#FocusOut}</td></tr></table></li>
 * <li>{@code serial} &ndash; # of last request processed by server</li>
 * <li>{@code send_event} &ndash; true if this came from an {@link X11#XSendEvent} request</li>
 * <li>{@code display} &ndash; {@code Display} the event was read from</li>
 * <li>{@code window} &ndash; window it reported relative to</li>
 * <li>{@code mode} &ndash; one of:<br><table><tr><td>{@link X11#NotifyNormal}</td><td>{@link X11#NotifyWhileGrabbed}</td><td>{@link X11#NotifyGrab}</td><td>{@link X11#NotifyUngrab}</td></tr></table></li>
 * <li>{@code detail} &ndash; one of:<br><table><tr><td>{@link X11#NotifyAncestor}</td><td>{@link X11#NotifyVirtual}</td><td>{@link X11#NotifyInferior}</td><td>{@link X11#NotifyNonlinear}</td><td>{@link X11#NotifyNonlinearVirtual}</td></tr><tr><td>{@link X11#NotifyPointer}</td><td>{@link X11#NotifyPointerRoot}</td><td>{@link X11#NotifyDetailNone}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XFocusChangeEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Window window;
 *     int mode;
 *     int detail;
 * }</code></pre>
 */
public class XFocusChangeEvent extends Struct implements NativeResource {

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
        MODE,
        DETAIL;

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
        WINDOW = layout.offsetof(4);
        MODE = layout.offsetof(5);
        DETAIL = layout.offsetof(6);
    }

    /**
     * Creates a {@code XFocusChangeEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XFocusChangeEvent(ByteBuffer container) {
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
    /** Returns the value of the {@code mode} field. */
    public int mode() { return nmode(address()); }
    /** Returns the value of the {@code detail} field. */
    public int detail() { return ndetail(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XFocusChangeEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XFocusChangeEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XFocusChangeEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XFocusChangeEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XFocusChangeEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code mode} field. */
    public XFocusChangeEvent mode(int value) { nmode(address(), value); return this; }
    /** Sets the specified value to the {@code detail} field. */
    public XFocusChangeEvent detail(int value) { ndetail(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XFocusChangeEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        int mode,
        int detail
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        mode(mode);
        detail(detail);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XFocusChangeEvent set(XFocusChangeEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XFocusChangeEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XFocusChangeEvent malloc() {
        return wrap(XFocusChangeEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XFocusChangeEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XFocusChangeEvent calloc() {
        return wrap(XFocusChangeEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XFocusChangeEvent} instance allocated with {@link BufferUtils}. */
    public static XFocusChangeEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XFocusChangeEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XFocusChangeEvent} instance for the specified memory address. */
    public static XFocusChangeEvent create(long address) {
        return wrap(XFocusChangeEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XFocusChangeEvent createSafe(long address) {
        return address == NULL ? null : wrap(XFocusChangeEvent.class, address);
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XFocusChangeEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XFocusChangeEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XFocusChangeEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XFocusChangeEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XFocusChangeEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XFocusChangeEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XFocusChangeEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XFocusChangeEvent mallocStack(MemoryStack stack) {
        return wrap(XFocusChangeEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XFocusChangeEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XFocusChangeEvent callocStack(MemoryStack stack) {
        return wrap(XFocusChangeEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XFocusChangeEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XFocusChangeEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XFocusChangeEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XFocusChangeEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XFocusChangeEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XFocusChangeEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XFocusChangeEvent.WINDOW); }
    /** Unsafe version of {@link #mode}. */
    public static int nmode(long struct) { return UNSAFE.getInt(null, struct + XFocusChangeEvent.MODE); }
    /** Unsafe version of {@link #detail}. */
    public static int ndetail(long struct) { return UNSAFE.getInt(null, struct + XFocusChangeEvent.DETAIL); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XFocusChangeEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XFocusChangeEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XFocusChangeEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XFocusChangeEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XFocusChangeEvent.WINDOW, value); }
    /** Unsafe version of {@link #mode(int) mode}. */
    public static void nmode(long struct, int value) { UNSAFE.putInt(null, struct + XFocusChangeEvent.MODE, value); }
    /** Unsafe version of {@link #detail(int) detail}. */
    public static void ndetail(long struct, int value) { UNSAFE.putInt(null, struct + XFocusChangeEvent.DETAIL, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XFocusChangeEvent.DISPLAY));
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

    /** An array of {@link XFocusChangeEvent} structs. */
    public static class Buffer extends StructBuffer<XFocusChangeEvent, Buffer> implements NativeResource {

        private static final XFocusChangeEvent ELEMENT_FACTORY = XFocusChangeEvent.create(-1L);

        /**
         * Creates a new {@code XFocusChangeEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XFocusChangeEvent#SIZEOF}, and its mark will be undefined.
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
        protected XFocusChangeEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XFocusChangeEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XFocusChangeEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XFocusChangeEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XFocusChangeEvent.ndisplay(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XFocusChangeEvent.nwindow(address()); }
        /** Returns the value of the {@code mode} field. */
        public int mode() { return XFocusChangeEvent.nmode(address()); }
        /** Returns the value of the {@code detail} field. */
        public int detail() { return XFocusChangeEvent.ndetail(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XFocusChangeEvent.Buffer type(int value) { XFocusChangeEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XFocusChangeEvent.Buffer serial(@NativeType("unsigned long") long value) { XFocusChangeEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XFocusChangeEvent.Buffer send_event(@NativeType("Bool") boolean value) { XFocusChangeEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XFocusChangeEvent.Buffer display(@NativeType("Display *") long value) { XFocusChangeEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XFocusChangeEvent.Buffer window(@NativeType("Window") long value) { XFocusChangeEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code mode} field. */
        public XFocusChangeEvent.Buffer mode(int value) { XFocusChangeEvent.nmode(address(), value); return this; }
        /** Sets the specified value to the {@code detail} field. */
        public XFocusChangeEvent.Buffer detail(int value) { XFocusChangeEvent.ndetail(address(), value); return this; }

    }

}