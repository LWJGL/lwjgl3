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
 * <li>{@code major_code} &ndash; core is {@code CopyArea} or {@code CopyPlane}</li>
 * <li>{@code minor_code} &ndash; not defined in the core</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XNoExposeEvent {
 *     int type;
 *     unsigned long serial;
 *     Bool send_event;
 *     Display * display;
 *     Drawable drawable;
 *     int major_code;
 *     int minor_code;
 * }</code></pre>
 */
public class XNoExposeEvent extends Struct implements NativeResource {

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
    /** Returns the value of the {@code drawable} field. */
    @NativeType("Drawable")
    public long drawable() { return ndrawable(address()); }
    /** Returns the value of the {@code major_code} field. */
    public int major_code() { return nmajor_code(address()); }
    /** Returns the value of the {@code minor_code} field. */
    public int minor_code() { return nminor_code(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XNoExposeEvent type(int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code serial} field. */
    public XNoExposeEvent serial(@NativeType("unsigned long") long value) { nserial(address(), value); return this; }
    /** Sets the specified value to the {@code send_event} field. */
    public XNoExposeEvent send_event(@NativeType("Bool") boolean value) { nsend_event(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code display} field. */
    public XNoExposeEvent display(@NativeType("Display *") long value) { ndisplay(address(), value); return this; }
    /** Sets the specified value to the {@code drawable} field. */
    public XNoExposeEvent drawable(@NativeType("Drawable") long value) { ndrawable(address(), value); return this; }
    /** Sets the specified value to the {@code major_code} field. */
    public XNoExposeEvent major_code(int value) { nmajor_code(address(), value); return this; }
    /** Sets the specified value to the {@code minor_code} field. */
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
        return wrap(XNoExposeEvent.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XNoExposeEvent} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XNoExposeEvent calloc() {
        return wrap(XNoExposeEvent.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XNoExposeEvent} instance allocated with {@link BufferUtils}. */
    public static XNoExposeEvent create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XNoExposeEvent.class, memAddress(container), container);
    }

    /** Returns a new {@code XNoExposeEvent} instance for the specified memory address. */
    public static XNoExposeEvent create(long address) {
        return wrap(XNoExposeEvent.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XNoExposeEvent createSafe(long address) {
        return address == NULL ? null : wrap(XNoExposeEvent.class, address);
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link XNoExposeEvent.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XNoExposeEvent.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code XNoExposeEvent} instance allocated on the thread-local {@link MemoryStack}. */
    public static XNoExposeEvent mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code XNoExposeEvent} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static XNoExposeEvent callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code XNoExposeEvent} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XNoExposeEvent mallocStack(MemoryStack stack) {
        return wrap(XNoExposeEvent.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XNoExposeEvent} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XNoExposeEvent callocStack(MemoryStack stack) {
        return wrap(XNoExposeEvent.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XNoExposeEvent.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XNoExposeEvent.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
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

    /** An array of {@link XNoExposeEvent} structs. */
    public static class Buffer extends StructBuffer<XNoExposeEvent, Buffer> implements NativeResource {

        private static final XNoExposeEvent ELEMENT_FACTORY = XNoExposeEvent.create(-1L);

        /**
         * Creates a new {@code XNoExposeEvent.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XNoExposeEvent#SIZEOF}, and its mark will be undefined.
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

        /** Returns the value of the {@code type} field. */
        public int type() { return XNoExposeEvent.ntype(address()); }
        /** Returns the value of the {@code serial} field. */
        @NativeType("unsigned long")
        public long serial() { return XNoExposeEvent.nserial(address()); }
        /** Returns the value of the {@code send_event} field. */
        @NativeType("Bool")
        public boolean send_event() { return XNoExposeEvent.nsend_event(address()) != 0; }
        /** Returns the value of the {@code display} field. */
        @NativeType("Display *")
        public long display() { return XNoExposeEvent.ndisplay(address()); }
        /** Returns the value of the {@code drawable} field. */
        @NativeType("Drawable")
        public long drawable() { return XNoExposeEvent.ndrawable(address()); }
        /** Returns the value of the {@code major_code} field. */
        public int major_code() { return XNoExposeEvent.nmajor_code(address()); }
        /** Returns the value of the {@code minor_code} field. */
        public int minor_code() { return XNoExposeEvent.nminor_code(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XNoExposeEvent.Buffer type(int value) { XNoExposeEvent.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code serial} field. */
        public XNoExposeEvent.Buffer serial(@NativeType("unsigned long") long value) { XNoExposeEvent.nserial(address(), value); return this; }
        /** Sets the specified value to the {@code send_event} field. */
        public XNoExposeEvent.Buffer send_event(@NativeType("Bool") boolean value) { XNoExposeEvent.nsend_event(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code display} field. */
        public XNoExposeEvent.Buffer display(@NativeType("Display *") long value) { XNoExposeEvent.ndisplay(address(), value); return this; }
        /** Sets the specified value to the {@code drawable} field. */
        public XNoExposeEvent.Buffer drawable(@NativeType("Drawable") long value) { XNoExposeEvent.ndrawable(address(), value); return this; }
        /** Sets the specified value to the {@code major_code} field. */
        public XNoExposeEvent.Buffer major_code(int value) { XNoExposeEvent.nmajor_code(address(), value); return this; }
        /** Sets the specified value to the {@code minor_code} field. */
        public XNoExposeEvent.Buffer minor_code(int value) { XNoExposeEvent.nminor_code(address(), value); return this; }

    }

}