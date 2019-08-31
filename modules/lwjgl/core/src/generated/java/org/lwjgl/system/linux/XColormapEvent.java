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
 * <li>{@code serial} &ndash; # of last request processed by server</li>
 * <li>{@code send_event} &ndash; true if this came from an {@link X11#XSendEvent} request</li>
 * <li>{@code display} &ndash; {@code Display} the event was read from</li>
 * <li>{@code window} &ndash; window it reported relative to</li>
 * <li>{@code colormap} &ndash; colormap or {@link X11#None}</li>
 * <li>{@code state} &ndash; one of:<br><table><tr><td>{@link X11#ColormapInstalled}</td><td>{@link X11#ColormapUninstalled}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XColormapEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Window window;
 *     Colormap colormap;
 *     int new;
 *     int state;
 * }</code></pre>
 */
public class XColormapEvent extends Struct implements NativeResource {

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
        COLORMAP,
        NEW,
        STATE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(CLONG_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(CLONG_SIZE),
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
        COLORMAP = layout.offsetof(5);
        NEW = layout.offsetof(6);
        STATE = layout.offsetof(7);
    }

    /**
     * Creates a {@code XColormapEvent} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XColormapEvent(ByteBuffer container) {
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
    /** Returns the value of the {@code colormap} field. */
    @NativeType("Colormap")
    public long colormap() { return ncolormap(address()); }
    /** Returns the value of the {@code new} field. */
    public int new$() { return nnew$(address()); }
    /** Returns the value of the {@code state} field. */
    public int state() { return nstate(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XColormapEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XColormapEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XColormapEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XColormapEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public XColormapEvent window(@NativeType("Window") long value) { nwindow(address(), value); return this; }
    /** Sets the specified value to the {@code colormap} field. */
    public XColormapEvent colormap(@NativeType("Colormap") long value) { ncolormap(address(), value); return this; }
    /** Sets the specified value to the {@code new} field. */
    public XColormapEvent new$(int value) { nnew$(address(), value); return this; }
    /** Sets the specified value to the {@code state} field. */
    public XColormapEvent state(int value) { nstate(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XColormapEvent set(
        int type,
        long serial,
        boolean send_event,
        long display,
        long window,
        long colormap,
        int new$,
        int state
    ) {
        type(type);
        serial(serial);
        send_event(send_event);
        display(display);
        window(window);
        colormap(colormap);
        new$(new$);
        state(state);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XColormapEvent set(XColormapEvent src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XColormapEvent} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XColormapEvent malloc() {
        return wrap(XColormapEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XColormapEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XColormapEvent calloc() {
        return wrap(XColormapEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XColormapEvent} instance allocated with {@link BufferUtils}. */
    public static XColormapEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XColormapEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XColormapEvent} instance for the specified memory address. */
    public static XColormapEvent create(long address) {
        return wrap(XColormapEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XColormapEvent createSafe(long address) {
        return address == NULL ? null : wrap(XColormapEvent.class, address);
    }

    /**
     * Returns a new {@link XColormapEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XColormapEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XColormapEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XColormapEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XColormapEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XColormapEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XColormapEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XColormapEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XColormapEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XColormapEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XColormapEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XColormapEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XColormapEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XColormapEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XColormapEvent mallocStack(MemoryStack stack) {
        return wrap(XColormapEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XColormapEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XColormapEvent callocStack(MemoryStack stack) {
        return wrap(XColormapEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XColormapEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XColormapEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XColormapEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XColormapEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XColormapEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XColormapEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XColormapEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XColormapEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XColormapEvent.TYPE); }
    /** Unsafe version of {@link #serial}. */
    public static long nserial(long struct) { return memGetCLong(struct + XColormapEvent.SERIAL); }
    /** Unsafe version of {@link #send_event}. */
    public static int nsend_event(long struct) { return UNSAFE.getInt(null, struct + XColormapEvent.SEND_EVENT); }
    /** Unsafe version of {@link #display}. */
    public static long ndisplay(long struct) { return memGetAddress(struct + XColormapEvent.DISPLAY); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetCLong(struct + XColormapEvent.WINDOW); }
    /** Unsafe version of {@link #colormap}. */
    public static long ncolormap(long struct) { return memGetCLong(struct + XColormapEvent.COLORMAP); }
    /** Unsafe version of {@link #new$}. */
    public static int nnew$(long struct) { return UNSAFE.getInt(null, struct + XColormapEvent.NEW); }
    /** Unsafe version of {@link #state}. */
    public static int nstate(long struct) { return UNSAFE.getInt(null, struct + XColormapEvent.STATE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XColormapEvent.TYPE, value); }
    /** Unsafe version of {@link #serial(long) serial}. */
    public static void nserial(long struct, long value) { memPutCLong(struct + XColormapEvent.SERIAL, value); }
    /** Unsafe version of {@link #send_event(boolean) send_event}. */
    public static void nsend_event(long struct, int value) { UNSAFE.putInt(null, struct + XColormapEvent.SEND_EVENT, value); }
    /** Unsafe version of {@link #display(long) display}. */
    public static void ndisplay(long struct, long value) { memPutAddress(struct + XColormapEvent.DISPLAY, check(value)); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutCLong(struct + XColormapEvent.WINDOW, value); }
    /** Unsafe version of {@link #colormap(long) colormap}. */
    public static void ncolormap(long struct, long value) { memPutCLong(struct + XColormapEvent.COLORMAP, value); }
    /** Unsafe version of {@link #new$(int) new$}. */
    public static void nnew$(long struct, int value) { UNSAFE.putInt(null, struct + XColormapEvent.NEW, value); }
    /** Unsafe version of {@link #state(int) state}. */
    public static void nstate(long struct, int value) { UNSAFE.putInt(null, struct + XColormapEvent.STATE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XColormapEvent.DISPLAY));
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

    /** An array of {@link XColormapEvent} structs. */
    public static class Buffer extends StructBuffer<XColormapEvent, Buffer> implements NativeResource {

        private static final XColormapEvent ELEMENT_FACTORY = XColormapEvent.create(-1L);

        /**
         * Creates a new {@code XColormapEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XColormapEvent#SIZEOF}, and its mark will be undefined.
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
        protected XColormapEvent getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code type} field. */
        public int type() { return XColormapEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XColormapEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XColormapEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XColormapEvent.ndisplay(address()); }
        /** Returns the value of the {@code window} field. */
        @NativeType("Window")
        public long window() { return XColormapEvent.nwindow(address()); }
        /** Returns the value of the {@code colormap} field. */
        @NativeType("Colormap")
        public long colormap() { return XColormapEvent.ncolormap(address()); }
        /** Returns the value of the {@code new} field. */
        public int new$() { return XColormapEvent.nnew$(address()); }
        /** Returns the value of the {@code state} field. */
        public int state() { return XColormapEvent.nstate(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XColormapEvent.Buffer type(int value) { XColormapEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XColormapEvent.Buffer serial(@NativeType("unsigned long") long value) { XColormapEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XColormapEvent.Buffer send_event(@NativeType("Bool") boolean value) { XColormapEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XColormapEvent.Buffer display(@NativeType("Display *") long value) { XColormapEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public XColormapEvent.Buffer window(@NativeType("Window") long value) { XColormapEvent.nwindow(address(), value); return this; }
        /** Sets the specified value to the {@code colormap} field. */
        public XColormapEvent.Buffer colormap(@NativeType("Colormap") long value) { XColormapEvent.ncolormap(address(), value); return this; }
        /** Sets the specified value to the {@code new} field. */
        public XColormapEvent.Buffer new$(int value) { XColormapEvent.nnew$(address(), value); return this; }
        /** Sets the specified value to the {@code state} field. */
        public XColormapEvent.Buffer state(int value) { XColormapEvent.nstate(address(), value); return this; }

    }

}