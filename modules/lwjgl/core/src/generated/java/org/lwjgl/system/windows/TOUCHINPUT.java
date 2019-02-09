/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Encapsulates data for touch input.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; the x-coordinate (horizontal point) of the touch input. This member is indicated in hundredths of a pixel of physical screen coordinates.</li>
 * <li>{@code y} &ndash; the y-coordinate (vertical point) of the touch input. This member is indicated in hundredths of a pixel of physical screen coordinates.</li>
 * <li>{@code hSource} &ndash; a device handle for the source input device. Each device is given a unique provider at run time by the touch input provider.</li>
 * <li>{@code dwID} &ndash; 
 * a touch point identifier that distinguishes a particular touch input. This value stays consistent in a touch contact sequence from the point a contact
 * comes down until it comes back up. An ID may be reused later for subsequent contacts.</li>
 * <li>{@code dwFlags} &ndash; 
 * a set of bit flags that specify various aspects of touch point press, release, and motion. The bits in this member can be any reasonable combination of
 * the values in the Remarks section.</li>
 * <li>{@code dwMask} &ndash; 
 * a set of bit flags that specify which of the optional fields in the structure contain valid values. The availability of valid information in the
 * optional fields is device-specific. Applications should use an optional field value only when the corresponding bit is set in {@code dwMask}. This
 * field may contain a combination of the {@code dwMask} flags mentioned in the Remarks section.</li>
 * <li>{@code dwTime} &ndash; 
 * the time stamp for the event, in milliseconds. The consuming application should note that the system performs no validation on this field; when the
 * {@link User32#TOUCHINPUTMASKF_TIMEFROMSYSTEM} flag is not set, the accuracy and sequencing of values in this field are completely dependent on the touch input
 * provider.</li>
 * <li>{@code dwExtraInfo} &ndash; an additional value associated with the touch event.</li>
 * <li>{@code cxContact} &ndash; 
 * the width of the touch contact area in hundredths of a pixel in physical screen coordinates. This value is only valid if the {@code dwMask} member has
 * the {@link User32#TOUCHINPUTMASKF_CONTACTAREA} flag set.</li>
 * <li>{@code cyContact} &ndash; 
 * the height of the touch contact area in hundredths of a pixel in physical screen coordinates. This value is only valid if the {@code dwMask} member has
 * the {@link User32#TOUCHINPUTMASKF_CONTACTAREA} flag set.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct TOUCHINPUT {
 *     LONG x;
 *     LONG y;
 *     HANDLE hSource;
 *     DWORD dwID;
 *     DWORD dwFlags;
 *     DWORD dwMask;
 *     DWORD dwTime;
 *     ULONG_PTR dwExtraInfo;
 *     DWORD cxContact;
 *     DWORD cyContact;
 * }</code></pre>
 */
public class TOUCHINPUT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        HSOURCE,
        DWID,
        DWFLAGS,
        DWMASK,
        DWTIME,
        DWEXTRAINFO,
        CXCONTACT,
        CYCONTACT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        HSOURCE = layout.offsetof(2);
        DWID = layout.offsetof(3);
        DWFLAGS = layout.offsetof(4);
        DWMASK = layout.offsetof(5);
        DWTIME = layout.offsetof(6);
        DWEXTRAINFO = layout.offsetof(7);
        CXCONTACT = layout.offsetof(8);
        CYCONTACT = layout.offsetof(9);
    }

    /**
     * Creates a {@code TOUCHINPUT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TOUCHINPUT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    @NativeType("LONG")
    public int x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    @NativeType("LONG")
    public int y() { return ny(address()); }
    /** Returns the value of the {@code hSource} field. */
    @NativeType("HANDLE")
    public long hSource() { return nhSource(address()); }
    /** Returns the value of the {@code dwID} field. */
    @NativeType("DWORD")
    public int dwID() { return ndwID(address()); }
    /** Returns the value of the {@code dwFlags} field. */
    @NativeType("DWORD")
    public int dwFlags() { return ndwFlags(address()); }
    /** Returns the value of the {@code dwMask} field. */
    @NativeType("DWORD")
    public int dwMask() { return ndwMask(address()); }
    /** Returns the value of the {@code dwTime} field. */
    @NativeType("DWORD")
    public int dwTime() { return ndwTime(address()); }
    /** Returns the value of the {@code dwExtraInfo} field. */
    @NativeType("ULONG_PTR")
    public long dwExtraInfo() { return ndwExtraInfo(address()); }
    /** Returns the value of the {@code cxContact} field. */
    @NativeType("DWORD")
    public int cxContact() { return ncxContact(address()); }
    /** Returns the value of the {@code cyContact} field. */
    @NativeType("DWORD")
    public int cyContact() { return ncyContact(address()); }

    // -----------------------------------

    /** Returns a new {@code TOUCHINPUT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static TOUCHINPUT malloc() {
        return wrap(TOUCHINPUT.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code TOUCHINPUT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static TOUCHINPUT calloc() {
        return wrap(TOUCHINPUT.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code TOUCHINPUT} instance allocated with {@link BufferUtils}. */
    public static TOUCHINPUT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(TOUCHINPUT.class, memAddress(container), container);
    }

    /** Returns a new {@code TOUCHINPUT} instance for the specified memory address. */
    public static TOUCHINPUT create(long address) {
        return wrap(TOUCHINPUT.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TOUCHINPUT createSafe(long address) {
        return address == NULL ? null : wrap(TOUCHINPUT.class, address);
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link TOUCHINPUT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static TOUCHINPUT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code TOUCHINPUT} instance allocated on the thread-local {@link MemoryStack}. */
    public static TOUCHINPUT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code TOUCHINPUT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static TOUCHINPUT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code TOUCHINPUT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static TOUCHINPUT mallocStack(MemoryStack stack) {
        return wrap(TOUCHINPUT.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code TOUCHINPUT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static TOUCHINPUT callocStack(MemoryStack stack) {
        return wrap(TOUCHINPUT.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link TOUCHINPUT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static TOUCHINPUT.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static int nx(long struct) { return UNSAFE.getInt(null, struct + TOUCHINPUT.X); }
    /** Unsafe version of {@link #y}. */
    public static int ny(long struct) { return UNSAFE.getInt(null, struct + TOUCHINPUT.Y); }
    /** Unsafe version of {@link #hSource}. */
    public static long nhSource(long struct) { return memGetAddress(struct + TOUCHINPUT.HSOURCE); }
    /** Unsafe version of {@link #dwID}. */
    public static int ndwID(long struct) { return UNSAFE.getInt(null, struct + TOUCHINPUT.DWID); }
    /** Unsafe version of {@link #dwFlags}. */
    public static int ndwFlags(long struct) { return UNSAFE.getInt(null, struct + TOUCHINPUT.DWFLAGS); }
    /** Unsafe version of {@link #dwMask}. */
    public static int ndwMask(long struct) { return UNSAFE.getInt(null, struct + TOUCHINPUT.DWMASK); }
    /** Unsafe version of {@link #dwTime}. */
    public static int ndwTime(long struct) { return UNSAFE.getInt(null, struct + TOUCHINPUT.DWTIME); }
    /** Unsafe version of {@link #dwExtraInfo}. */
    public static long ndwExtraInfo(long struct) { return memGetAddress(struct + TOUCHINPUT.DWEXTRAINFO); }
    /** Unsafe version of {@link #cxContact}. */
    public static int ncxContact(long struct) { return UNSAFE.getInt(null, struct + TOUCHINPUT.CXCONTACT); }
    /** Unsafe version of {@link #cyContact}. */
    public static int ncyContact(long struct) { return UNSAFE.getInt(null, struct + TOUCHINPUT.CYCONTACT); }

    // -----------------------------------

    /** An array of {@link TOUCHINPUT} structs. */
    public static class Buffer extends StructBuffer<TOUCHINPUT, Buffer> implements NativeResource {

        private static final TOUCHINPUT ELEMENT_FACTORY = TOUCHINPUT.create(-1L);

        /**
         * Creates a new {@code TOUCHINPUT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TOUCHINPUT#SIZEOF}, and its mark will be undefined.
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
        protected TOUCHINPUT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code x} field. */
        @NativeType("LONG")
        public int x() { return TOUCHINPUT.nx(address()); }
        /** Returns the value of the {@code y} field. */
        @NativeType("LONG")
        public int y() { return TOUCHINPUT.ny(address()); }
        /** Returns the value of the {@code hSource} field. */
        @NativeType("HANDLE")
        public long hSource() { return TOUCHINPUT.nhSource(address()); }
        /** Returns the value of the {@code dwID} field. */
        @NativeType("DWORD")
        public int dwID() { return TOUCHINPUT.ndwID(address()); }
        /** Returns the value of the {@code dwFlags} field. */
        @NativeType("DWORD")
        public int dwFlags() { return TOUCHINPUT.ndwFlags(address()); }
        /** Returns the value of the {@code dwMask} field. */
        @NativeType("DWORD")
        public int dwMask() { return TOUCHINPUT.ndwMask(address()); }
        /** Returns the value of the {@code dwTime} field. */
        @NativeType("DWORD")
        public int dwTime() { return TOUCHINPUT.ndwTime(address()); }
        /** Returns the value of the {@code dwExtraInfo} field. */
        @NativeType("ULONG_PTR")
        public long dwExtraInfo() { return TOUCHINPUT.ndwExtraInfo(address()); }
        /** Returns the value of the {@code cxContact} field. */
        @NativeType("DWORD")
        public int cxContact() { return TOUCHINPUT.ncxContact(address()); }
        /** Returns the value of the {@code cyContact} field. */
        @NativeType("DWORD")
        public int cyContact() { return TOUCHINPUT.ncyContact(address()); }

    }

}