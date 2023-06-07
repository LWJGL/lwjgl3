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
 * Contains information about the placement of a window on the screen.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct WINDOWPLACEMENT {
 *     UINT {@link #length};
 *     UINT {@link #flags};
 *     UINT {@link #showCmd};
 *     {@link POINT POINT} {@link #ptMinPosition};
 *     {@link POINT POINT} {@link #ptMaxPosition};
 *     {@link RECT RECT} {@link #rcNormalPosition};
 * }</code></pre>
 */
public class WINDOWPLACEMENT extends Struct<WINDOWPLACEMENT> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        LENGTH,
        FLAGS,
        SHOWCMD,
        PTMINPOSITION,
        PTMAXPOSITION,
        RCNORMALPOSITION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(POINT.SIZEOF, POINT.ALIGNOF),
            __member(POINT.SIZEOF, POINT.ALIGNOF),
            __member(RECT.SIZEOF, RECT.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        LENGTH = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        SHOWCMD = layout.offsetof(2);
        PTMINPOSITION = layout.offsetof(3);
        PTMAXPOSITION = layout.offsetof(4);
        RCNORMALPOSITION = layout.offsetof(5);
    }

    protected WINDOWPLACEMENT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected WINDOWPLACEMENT create(long address, @Nullable ByteBuffer container) {
        return new WINDOWPLACEMENT(address, container);
    }

    /**
     * Creates a {@code WINDOWPLACEMENT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public WINDOWPLACEMENT(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /**
     * the length of the structure, in bytes. Before calling the {@link User32#GetWindowPlacement} or {@link User32#SetWindowPlacement} functions, set this member to
     * {@link #SIZEOF}.
     */
    @NativeType("UINT")
    public int length() { return nlength(address()); }
    /** the flags that control the position of the minimized window and the method by which the window is restored. This member can be one or more of thefollowing values:<br>{@link User32#WPF_SETMINPOSITION} {@link User32#WPF_RESTORETOMAXIMIZED} {@link User32#WPF_ASYNCWINDOWPLACEMENT} */
    @NativeType("UINT")
    public int flags() { return nflags(address()); }
    /** the current show state of the window */
    @NativeType("UINT")
    public int showCmd() { return nshowCmd(address()); }
    /** the coordinates of the window's upper-left corner when the window is minimized */
    public POINT ptMinPosition() { return nptMinPosition(address()); }
    /** the coordinates of the window's upper-left corner when the window is maximized */
    public POINT ptMaxPosition() { return nptMaxPosition(address()); }
    /** the window's coordinates when the window is in the restored position */
    public RECT rcNormalPosition() { return nrcNormalPosition(address()); }

    /** Sets the specified value to the {@link #length} field. */
    public WINDOWPLACEMENT length(@NativeType("UINT") int value) { nlength(address(), value); return this; }
    /** Sets the specified value to the {@link #flags} field. */
    public WINDOWPLACEMENT flags(@NativeType("UINT") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@link #showCmd} field. */
    public WINDOWPLACEMENT showCmd(@NativeType("UINT") int value) { nshowCmd(address(), value); return this; }
    /** Copies the specified {@link POINT} to the {@link #ptMinPosition} field. */
    public WINDOWPLACEMENT ptMinPosition(POINT value) { nptMinPosition(address(), value); return this; }
    /** Passes the {@link #ptMinPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
    public WINDOWPLACEMENT ptMinPosition(java.util.function.Consumer<POINT> consumer) { consumer.accept(ptMinPosition()); return this; }
    /** Copies the specified {@link POINT} to the {@link #ptMaxPosition} field. */
    public WINDOWPLACEMENT ptMaxPosition(POINT value) { nptMaxPosition(address(), value); return this; }
    /** Passes the {@link #ptMaxPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
    public WINDOWPLACEMENT ptMaxPosition(java.util.function.Consumer<POINT> consumer) { consumer.accept(ptMaxPosition()); return this; }
    /** Copies the specified {@link RECT} to the {@link #rcNormalPosition} field. */
    public WINDOWPLACEMENT rcNormalPosition(RECT value) { nrcNormalPosition(address(), value); return this; }
    /** Passes the {@link #rcNormalPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
    public WINDOWPLACEMENT rcNormalPosition(java.util.function.Consumer<RECT> consumer) { consumer.accept(rcNormalPosition()); return this; }

    /** Initializes this struct with the specified values. */
    public WINDOWPLACEMENT set(
        int length,
        int flags,
        int showCmd,
        POINT ptMinPosition,
        POINT ptMaxPosition,
        RECT rcNormalPosition
    ) {
        length(length);
        flags(flags);
        showCmd(showCmd);
        ptMinPosition(ptMinPosition);
        ptMaxPosition(ptMaxPosition);
        rcNormalPosition(rcNormalPosition);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public WINDOWPLACEMENT set(WINDOWPLACEMENT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code WINDOWPLACEMENT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static WINDOWPLACEMENT malloc() {
        return new WINDOWPLACEMENT(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code WINDOWPLACEMENT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static WINDOWPLACEMENT calloc() {
        return new WINDOWPLACEMENT(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code WINDOWPLACEMENT} instance allocated with {@link BufferUtils}. */
    public static WINDOWPLACEMENT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new WINDOWPLACEMENT(memAddress(container), container);
    }

    /** Returns a new {@code WINDOWPLACEMENT} instance for the specified memory address. */
    public static WINDOWPLACEMENT create(long address) {
        return new WINDOWPLACEMENT(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static WINDOWPLACEMENT createSafe(long address) {
        return address == NULL ? null : new WINDOWPLACEMENT(address, null);
    }

    /**
     * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static WINDOWPLACEMENT.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static WINDOWPLACEMENT.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static WINDOWPLACEMENT.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link WINDOWPLACEMENT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static WINDOWPLACEMENT.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static WINDOWPLACEMENT.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static WINDOWPLACEMENT mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static WINDOWPLACEMENT callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static WINDOWPLACEMENT mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static WINDOWPLACEMENT callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static WINDOWPLACEMENT.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static WINDOWPLACEMENT.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static WINDOWPLACEMENT.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static WINDOWPLACEMENT.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code WINDOWPLACEMENT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static WINDOWPLACEMENT malloc(MemoryStack stack) {
        return new WINDOWPLACEMENT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code WINDOWPLACEMENT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static WINDOWPLACEMENT calloc(MemoryStack stack) {
        return new WINDOWPLACEMENT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static WINDOWPLACEMENT.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link WINDOWPLACEMENT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static WINDOWPLACEMENT.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #length}. */
    public static int nlength(long struct) { return UNSAFE.getInt(null, struct + WINDOWPLACEMENT.LENGTH); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return UNSAFE.getInt(null, struct + WINDOWPLACEMENT.FLAGS); }
    /** Unsafe version of {@link #showCmd}. */
    public static int nshowCmd(long struct) { return UNSAFE.getInt(null, struct + WINDOWPLACEMENT.SHOWCMD); }
    /** Unsafe version of {@link #ptMinPosition}. */
    public static POINT nptMinPosition(long struct) { return POINT.create(struct + WINDOWPLACEMENT.PTMINPOSITION); }
    /** Unsafe version of {@link #ptMaxPosition}. */
    public static POINT nptMaxPosition(long struct) { return POINT.create(struct + WINDOWPLACEMENT.PTMAXPOSITION); }
    /** Unsafe version of {@link #rcNormalPosition}. */
    public static RECT nrcNormalPosition(long struct) { return RECT.create(struct + WINDOWPLACEMENT.RCNORMALPOSITION); }

    /** Unsafe version of {@link #length(int) length}. */
    public static void nlength(long struct, int value) { UNSAFE.putInt(null, struct + WINDOWPLACEMENT.LENGTH, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { UNSAFE.putInt(null, struct + WINDOWPLACEMENT.FLAGS, value); }
    /** Unsafe version of {@link #showCmd(int) showCmd}. */
    public static void nshowCmd(long struct, int value) { UNSAFE.putInt(null, struct + WINDOWPLACEMENT.SHOWCMD, value); }
    /** Unsafe version of {@link #ptMinPosition(POINT) ptMinPosition}. */
    public static void nptMinPosition(long struct, POINT value) { memCopy(value.address(), struct + WINDOWPLACEMENT.PTMINPOSITION, POINT.SIZEOF); }
    /** Unsafe version of {@link #ptMaxPosition(POINT) ptMaxPosition}. */
    public static void nptMaxPosition(long struct, POINT value) { memCopy(value.address(), struct + WINDOWPLACEMENT.PTMAXPOSITION, POINT.SIZEOF); }
    /** Unsafe version of {@link #rcNormalPosition(RECT) rcNormalPosition}. */
    public static void nrcNormalPosition(long struct, RECT value) { memCopy(value.address(), struct + WINDOWPLACEMENT.RCNORMALPOSITION, RECT.SIZEOF); }

    // -----------------------------------

    /** An array of {@link WINDOWPLACEMENT} structs. */
    public static class Buffer extends StructBuffer<WINDOWPLACEMENT, Buffer> implements NativeResource {

        private static final WINDOWPLACEMENT ELEMENT_FACTORY = WINDOWPLACEMENT.create(-1L);

        /**
         * Creates a new {@code WINDOWPLACEMENT.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link WINDOWPLACEMENT#SIZEOF}, and its mark will be undefined.</p>
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
        protected WINDOWPLACEMENT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link WINDOWPLACEMENT#length} field. */
        @NativeType("UINT")
        public int length() { return WINDOWPLACEMENT.nlength(address()); }
        /** @return the value of the {@link WINDOWPLACEMENT#flags} field. */
        @NativeType("UINT")
        public int flags() { return WINDOWPLACEMENT.nflags(address()); }
        /** @return the value of the {@link WINDOWPLACEMENT#showCmd} field. */
        @NativeType("UINT")
        public int showCmd() { return WINDOWPLACEMENT.nshowCmd(address()); }
        /** @return a {@link POINT} view of the {@link WINDOWPLACEMENT#ptMinPosition} field. */
        public POINT ptMinPosition() { return WINDOWPLACEMENT.nptMinPosition(address()); }
        /** @return a {@link POINT} view of the {@link WINDOWPLACEMENT#ptMaxPosition} field. */
        public POINT ptMaxPosition() { return WINDOWPLACEMENT.nptMaxPosition(address()); }
        /** @return a {@link RECT} view of the {@link WINDOWPLACEMENT#rcNormalPosition} field. */
        public RECT rcNormalPosition() { return WINDOWPLACEMENT.nrcNormalPosition(address()); }

        /** Sets the specified value to the {@link WINDOWPLACEMENT#length} field. */
        public WINDOWPLACEMENT.Buffer length(@NativeType("UINT") int value) { WINDOWPLACEMENT.nlength(address(), value); return this; }
        /** Sets the specified value to the {@link WINDOWPLACEMENT#flags} field. */
        public WINDOWPLACEMENT.Buffer flags(@NativeType("UINT") int value) { WINDOWPLACEMENT.nflags(address(), value); return this; }
        /** Sets the specified value to the {@link WINDOWPLACEMENT#showCmd} field. */
        public WINDOWPLACEMENT.Buffer showCmd(@NativeType("UINT") int value) { WINDOWPLACEMENT.nshowCmd(address(), value); return this; }
        /** Copies the specified {@link POINT} to the {@link WINDOWPLACEMENT#ptMinPosition} field. */
        public WINDOWPLACEMENT.Buffer ptMinPosition(POINT value) { WINDOWPLACEMENT.nptMinPosition(address(), value); return this; }
        /** Passes the {@link WINDOWPLACEMENT#ptMinPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
        public WINDOWPLACEMENT.Buffer ptMinPosition(java.util.function.Consumer<POINT> consumer) { consumer.accept(ptMinPosition()); return this; }
        /** Copies the specified {@link POINT} to the {@link WINDOWPLACEMENT#ptMaxPosition} field. */
        public WINDOWPLACEMENT.Buffer ptMaxPosition(POINT value) { WINDOWPLACEMENT.nptMaxPosition(address(), value); return this; }
        /** Passes the {@link WINDOWPLACEMENT#ptMaxPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
        public WINDOWPLACEMENT.Buffer ptMaxPosition(java.util.function.Consumer<POINT> consumer) { consumer.accept(ptMaxPosition()); return this; }
        /** Copies the specified {@link RECT} to the {@link WINDOWPLACEMENT#rcNormalPosition} field. */
        public WINDOWPLACEMENT.Buffer rcNormalPosition(RECT value) { WINDOWPLACEMENT.nrcNormalPosition(address(), value); return this; }
        /** Passes the {@link WINDOWPLACEMENT#rcNormalPosition} field to the specified {@link java.util.function.Consumer Consumer}. */
        public WINDOWPLACEMENT.Buffer rcNormalPosition(java.util.function.Consumer<RECT> consumer) { consumer.accept(rcNormalPosition()); return this; }

    }

}