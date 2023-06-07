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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Contains the window class attributes that are registered by the {@link User32#RegisterClassEx} function.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct WNDCLASSEX {
 *     UINT {@link #cbSize};
 *     UINT {@link #style};
 *     {@link WindowProcI WNDPROC} {@link #lpfnWndProc};
 *     int {@link #cbClsExtra};
 *     int {@link #cbWndExtra};
 *     HINSTANCE {@link #hInstance};
 *     HICON {@link #hIcon};
 *     HCURSOR {@link #hCursor};
 *     HBRUSH {@link #hbrBackground};
 *     LPCTSTR {@link #lpszMenuName};
 *     LPCTSTR {@link #lpszClassName};
 *     HICON {@link #hIconSm};
 * }</code></pre>
 */
public class WNDCLASSEX extends Struct<WNDCLASSEX> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CBSIZE,
        STYLE,
        LPFNWNDPROC,
        CBCLSEXTRA,
        CBWNDEXTRA,
        HINSTANCE,
        HICON,
        HCURSOR,
        HBRBACKGROUND,
        LPSZMENUNAME,
        LPSZCLASSNAME,
        HICONSM;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CBSIZE = layout.offsetof(0);
        STYLE = layout.offsetof(1);
        LPFNWNDPROC = layout.offsetof(2);
        CBCLSEXTRA = layout.offsetof(3);
        CBWNDEXTRA = layout.offsetof(4);
        HINSTANCE = layout.offsetof(5);
        HICON = layout.offsetof(6);
        HCURSOR = layout.offsetof(7);
        HBRBACKGROUND = layout.offsetof(8);
        LPSZMENUNAME = layout.offsetof(9);
        LPSZCLASSNAME = layout.offsetof(10);
        HICONSM = layout.offsetof(11);
    }

    protected WNDCLASSEX(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected WNDCLASSEX create(long address, @Nullable ByteBuffer container) {
        return new WNDCLASSEX(address, container);
    }

    /**
     * Creates a {@code WNDCLASSEX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public WNDCLASSEX(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** the size, in bytes, of this structure */
    @NativeType("UINT")
    public int cbSize() { return ncbSize(address()); }
    /** the class style(s) */
    @NativeType("UINT")
    public int style() { return nstyle(address()); }
    /** a pointer to the window procedure */
    @NativeType("WNDPROC")
    public WindowProc lpfnWndProc() { return nlpfnWndProc(address()); }
    /** the number of extra bytes to allocate following the window-class structure. The system initializes the bytes to zero. */
    public int cbClsExtra() { return ncbClsExtra(address()); }
    /** the number of extra bytes to allocate following the window instance. The system initializes the bytes to zero. */
    public int cbWndExtra() { return ncbWndExtra(address()); }
    /** a handle to the instance that contains the window procedure for the class */
    @NativeType("HINSTANCE")
    public long hInstance() { return nhInstance(address()); }
    /** a handle to the class icon. This member must be a handle to an icon resource. If this member is {@code NULL}, the system provides a default icon. */
    @NativeType("HICON")
    public long hIcon() { return nhIcon(address()); }
    /**
     * a handle to the class cursor. This member must be a handle to a cursor resource. If this member is {@code NULL}, an application must explicitly set the cursor
     * shape whenever the mouse moves into the application's window.
     */
    @NativeType("HCURSOR")
    public long hCursor() { return nhCursor(address()); }
    /**
     * a handle to the class background brush. This member can be a handle to the brush to be used for painting the background, or it can be a color value.
     * When this member is {@code NULL}, an application must paint its own background whenever it is requested to paint in its client area.
     */
    @NativeType("HBRUSH")
    public long hbrBackground() { return nhbrBackground(address()); }
    /**
     * pointer to a null-terminated character string that specifies the resource name of the class menu, as the name appears in the resource file.  If this
     * member is {@code NULL}, windows belonging to this class have no default menu.
     */
    @Nullable
    @NativeType("LPCTSTR")
    public ByteBuffer lpszMenuName() { return nlpszMenuName(address()); }
    /**
     * pointer to a null-terminated character string that specifies the resource name of the class menu, as the name appears in the resource file.  If this
     * member is {@code NULL}, windows belonging to this class have no default menu.
     */
    @Nullable
    @NativeType("LPCTSTR")
    public String lpszMenuNameString() { return nlpszMenuNameString(address()); }
    /** a pointer to a null-terminated string or is an atom */
    @NativeType("LPCTSTR")
    public ByteBuffer lpszClassName() { return nlpszClassName(address()); }
    /** a pointer to a null-terminated string or is an atom */
    @NativeType("LPCTSTR")
    public String lpszClassNameString() { return nlpszClassNameString(address()); }
    /**
     * a handle to a small icon that is associated with the window class. If this member is {@code NULL}, the system searches the icon resource specified by the
     * {@code hIcon} member for an icon of the appropriate size to use as the small icon.
     */
    @NativeType("HICON")
    public long hIconSm() { return nhIconSm(address()); }

    /** Sets the specified value to the {@link #cbSize} field. */
    public WNDCLASSEX cbSize(@NativeType("UINT") int value) { ncbSize(address(), value); return this; }
    /** Sets the specified value to the {@link #style} field. */
    public WNDCLASSEX style(@NativeType("UINT") int value) { nstyle(address(), value); return this; }
    /** Sets the specified value to the {@link #lpfnWndProc} field. */
    public WNDCLASSEX lpfnWndProc(@NativeType("WNDPROC") WindowProcI value) { nlpfnWndProc(address(), value); return this; }
    /** Sets the specified value to the {@link #cbClsExtra} field. */
    public WNDCLASSEX cbClsExtra(int value) { ncbClsExtra(address(), value); return this; }
    /** Sets the specified value to the {@link #cbWndExtra} field. */
    public WNDCLASSEX cbWndExtra(int value) { ncbWndExtra(address(), value); return this; }
    /** Sets the specified value to the {@link #hInstance} field. */
    public WNDCLASSEX hInstance(@NativeType("HINSTANCE") long value) { nhInstance(address(), value); return this; }
    /** Sets the specified value to the {@link #hIcon} field. */
    public WNDCLASSEX hIcon(@NativeType("HICON") long value) { nhIcon(address(), value); return this; }
    /** Sets the specified value to the {@link #hCursor} field. */
    public WNDCLASSEX hCursor(@NativeType("HCURSOR") long value) { nhCursor(address(), value); return this; }
    /** Sets the specified value to the {@link #hbrBackground} field. */
    public WNDCLASSEX hbrBackground(@NativeType("HBRUSH") long value) { nhbrBackground(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #lpszMenuName} field. */
    public WNDCLASSEX lpszMenuName(@Nullable @NativeType("LPCTSTR") ByteBuffer value) { nlpszMenuName(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@link #lpszClassName} field. */
    public WNDCLASSEX lpszClassName(@NativeType("LPCTSTR") ByteBuffer value) { nlpszClassName(address(), value); return this; }
    /** Sets the specified value to the {@link #hIconSm} field. */
    public WNDCLASSEX hIconSm(@NativeType("HICON") long value) { nhIconSm(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public WNDCLASSEX set(
        int cbSize,
        int style,
        WindowProcI lpfnWndProc,
        int cbClsExtra,
        int cbWndExtra,
        long hInstance,
        long hIcon,
        long hCursor,
        long hbrBackground,
        @Nullable ByteBuffer lpszMenuName,
        ByteBuffer lpszClassName,
        long hIconSm
    ) {
        cbSize(cbSize);
        style(style);
        lpfnWndProc(lpfnWndProc);
        cbClsExtra(cbClsExtra);
        cbWndExtra(cbWndExtra);
        hInstance(hInstance);
        hIcon(hIcon);
        hCursor(hCursor);
        hbrBackground(hbrBackground);
        lpszMenuName(lpszMenuName);
        lpszClassName(lpszClassName);
        hIconSm(hIconSm);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public WNDCLASSEX set(WNDCLASSEX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code WNDCLASSEX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static WNDCLASSEX malloc() {
        return new WNDCLASSEX(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code WNDCLASSEX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static WNDCLASSEX calloc() {
        return new WNDCLASSEX(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code WNDCLASSEX} instance allocated with {@link BufferUtils}. */
    public static WNDCLASSEX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new WNDCLASSEX(memAddress(container), container);
    }

    /** Returns a new {@code WNDCLASSEX} instance for the specified memory address. */
    public static WNDCLASSEX create(long address) {
        return new WNDCLASSEX(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static WNDCLASSEX createSafe(long address) {
        return address == NULL ? null : new WNDCLASSEX(address, null);
    }

    /**
     * Returns a new {@link WNDCLASSEX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static WNDCLASSEX.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link WNDCLASSEX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static WNDCLASSEX.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link WNDCLASSEX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static WNDCLASSEX.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link WNDCLASSEX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static WNDCLASSEX.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static WNDCLASSEX.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static WNDCLASSEX mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static WNDCLASSEX callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static WNDCLASSEX mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static WNDCLASSEX callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static WNDCLASSEX.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static WNDCLASSEX.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static WNDCLASSEX.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static WNDCLASSEX.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code WNDCLASSEX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static WNDCLASSEX malloc(MemoryStack stack) {
        return new WNDCLASSEX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code WNDCLASSEX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static WNDCLASSEX calloc(MemoryStack stack) {
        return new WNDCLASSEX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link WNDCLASSEX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static WNDCLASSEX.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link WNDCLASSEX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static WNDCLASSEX.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cbSize}. */
    public static int ncbSize(long struct) { return UNSAFE.getInt(null, struct + WNDCLASSEX.CBSIZE); }
    /** Unsafe version of {@link #style}. */
    public static int nstyle(long struct) { return UNSAFE.getInt(null, struct + WNDCLASSEX.STYLE); }
    /** Unsafe version of {@link #lpfnWndProc}. */
    public static WindowProc nlpfnWndProc(long struct) { return WindowProc.create(memGetAddress(struct + WNDCLASSEX.LPFNWNDPROC)); }
    /** Unsafe version of {@link #cbClsExtra}. */
    public static int ncbClsExtra(long struct) { return UNSAFE.getInt(null, struct + WNDCLASSEX.CBCLSEXTRA); }
    /** Unsafe version of {@link #cbWndExtra}. */
    public static int ncbWndExtra(long struct) { return UNSAFE.getInt(null, struct + WNDCLASSEX.CBWNDEXTRA); }
    /** Unsafe version of {@link #hInstance}. */
    public static long nhInstance(long struct) { return memGetAddress(struct + WNDCLASSEX.HINSTANCE); }
    /** Unsafe version of {@link #hIcon}. */
    public static long nhIcon(long struct) { return memGetAddress(struct + WNDCLASSEX.HICON); }
    /** Unsafe version of {@link #hCursor}. */
    public static long nhCursor(long struct) { return memGetAddress(struct + WNDCLASSEX.HCURSOR); }
    /** Unsafe version of {@link #hbrBackground}. */
    public static long nhbrBackground(long struct) { return memGetAddress(struct + WNDCLASSEX.HBRBACKGROUND); }
    /** Unsafe version of {@link #lpszMenuName}. */
    @Nullable public static ByteBuffer nlpszMenuName(long struct) { return memByteBufferNT2Safe(memGetAddress(struct + WNDCLASSEX.LPSZMENUNAME)); }
    /** Unsafe version of {@link #lpszMenuNameString}. */
    @Nullable public static String nlpszMenuNameString(long struct) { return memUTF16Safe(memGetAddress(struct + WNDCLASSEX.LPSZMENUNAME)); }
    /** Unsafe version of {@link #lpszClassName}. */
    public static ByteBuffer nlpszClassName(long struct) { return memByteBufferNT2(memGetAddress(struct + WNDCLASSEX.LPSZCLASSNAME)); }
    /** Unsafe version of {@link #lpszClassNameString}. */
    public static String nlpszClassNameString(long struct) { return memUTF16(memGetAddress(struct + WNDCLASSEX.LPSZCLASSNAME)); }
    /** Unsafe version of {@link #hIconSm}. */
    public static long nhIconSm(long struct) { return memGetAddress(struct + WNDCLASSEX.HICONSM); }

    /** Unsafe version of {@link #cbSize(int) cbSize}. */
    public static void ncbSize(long struct, int value) { UNSAFE.putInt(null, struct + WNDCLASSEX.CBSIZE, value); }
    /** Unsafe version of {@link #style(int) style}. */
    public static void nstyle(long struct, int value) { UNSAFE.putInt(null, struct + WNDCLASSEX.STYLE, value); }
    /** Unsafe version of {@link #lpfnWndProc(WindowProcI) lpfnWndProc}. */
    public static void nlpfnWndProc(long struct, WindowProcI value) { memPutAddress(struct + WNDCLASSEX.LPFNWNDPROC, value.address()); }
    /** Unsafe version of {@link #cbClsExtra(int) cbClsExtra}. */
    public static void ncbClsExtra(long struct, int value) { UNSAFE.putInt(null, struct + WNDCLASSEX.CBCLSEXTRA, value); }
    /** Unsafe version of {@link #cbWndExtra(int) cbWndExtra}. */
    public static void ncbWndExtra(long struct, int value) { UNSAFE.putInt(null, struct + WNDCLASSEX.CBWNDEXTRA, value); }
    /** Unsafe version of {@link #hInstance(long) hInstance}. */
    public static void nhInstance(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HINSTANCE, value); }
    /** Unsafe version of {@link #hIcon(long) hIcon}. */
    public static void nhIcon(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HICON, value); }
    /** Unsafe version of {@link #hCursor(long) hCursor}. */
    public static void nhCursor(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HCURSOR, value); }
    /** Unsafe version of {@link #hbrBackground(long) hbrBackground}. */
    public static void nhbrBackground(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HBRBACKGROUND, value); }
    /** Unsafe version of {@link #lpszMenuName(ByteBuffer) lpszMenuName}. */
    public static void nlpszMenuName(long struct, @Nullable ByteBuffer value) {
        if (CHECKS) { checkNT2Safe(value); }
        memPutAddress(struct + WNDCLASSEX.LPSZMENUNAME, memAddressSafe(value));
    }
    /** Unsafe version of {@link #lpszClassName(ByteBuffer) lpszClassName}. */
    public static void nlpszClassName(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT2(value); }
        memPutAddress(struct + WNDCLASSEX.LPSZCLASSNAME, memAddress(value));
    }
    /** Unsafe version of {@link #hIconSm(long) hIconSm}. */
    public static void nhIconSm(long struct, long value) { memPutAddress(struct + WNDCLASSEX.HICONSM, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + WNDCLASSEX.LPFNWNDPROC));
        check(memGetAddress(struct + WNDCLASSEX.LPSZCLASSNAME));
    }

    // -----------------------------------

    /** An array of {@link WNDCLASSEX} structs. */
    public static class Buffer extends StructBuffer<WNDCLASSEX, Buffer> implements NativeResource {

        private static final WNDCLASSEX ELEMENT_FACTORY = WNDCLASSEX.create(-1L);

        /**
         * Creates a new {@code WNDCLASSEX.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link WNDCLASSEX#SIZEOF}, and its mark will be undefined.</p>
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
        protected WNDCLASSEX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link WNDCLASSEX#cbSize} field. */
        @NativeType("UINT")
        public int cbSize() { return WNDCLASSEX.ncbSize(address()); }
        /** @return the value of the {@link WNDCLASSEX#style} field. */
        @NativeType("UINT")
        public int style() { return WNDCLASSEX.nstyle(address()); }
        /** @return the value of the {@link WNDCLASSEX#lpfnWndProc} field. */
        @NativeType("WNDPROC")
        public WindowProc lpfnWndProc() { return WNDCLASSEX.nlpfnWndProc(address()); }
        /** @return the value of the {@link WNDCLASSEX#cbClsExtra} field. */
        public int cbClsExtra() { return WNDCLASSEX.ncbClsExtra(address()); }
        /** @return the value of the {@link WNDCLASSEX#cbWndExtra} field. */
        public int cbWndExtra() { return WNDCLASSEX.ncbWndExtra(address()); }
        /** @return the value of the {@link WNDCLASSEX#hInstance} field. */
        @NativeType("HINSTANCE")
        public long hInstance() { return WNDCLASSEX.nhInstance(address()); }
        /** @return the value of the {@link WNDCLASSEX#hIcon} field. */
        @NativeType("HICON")
        public long hIcon() { return WNDCLASSEX.nhIcon(address()); }
        /** @return the value of the {@link WNDCLASSEX#hCursor} field. */
        @NativeType("HCURSOR")
        public long hCursor() { return WNDCLASSEX.nhCursor(address()); }
        /** @return the value of the {@link WNDCLASSEX#hbrBackground} field. */
        @NativeType("HBRUSH")
        public long hbrBackground() { return WNDCLASSEX.nhbrBackground(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link WNDCLASSEX#lpszMenuName} field. */
        @Nullable
        @NativeType("LPCTSTR")
        public ByteBuffer lpszMenuName() { return WNDCLASSEX.nlpszMenuName(address()); }
        /** @return the null-terminated string pointed to by the {@link WNDCLASSEX#lpszMenuName} field. */
        @Nullable
        @NativeType("LPCTSTR")
        public String lpszMenuNameString() { return WNDCLASSEX.nlpszMenuNameString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@link WNDCLASSEX#lpszClassName} field. */
        @NativeType("LPCTSTR")
        public ByteBuffer lpszClassName() { return WNDCLASSEX.nlpszClassName(address()); }
        /** @return the null-terminated string pointed to by the {@link WNDCLASSEX#lpszClassName} field. */
        @NativeType("LPCTSTR")
        public String lpszClassNameString() { return WNDCLASSEX.nlpszClassNameString(address()); }
        /** @return the value of the {@link WNDCLASSEX#hIconSm} field. */
        @NativeType("HICON")
        public long hIconSm() { return WNDCLASSEX.nhIconSm(address()); }

        /** Sets the specified value to the {@link WNDCLASSEX#cbSize} field. */
        public WNDCLASSEX.Buffer cbSize(@NativeType("UINT") int value) { WNDCLASSEX.ncbSize(address(), value); return this; }
        /** Sets the specified value to the {@link WNDCLASSEX#style} field. */
        public WNDCLASSEX.Buffer style(@NativeType("UINT") int value) { WNDCLASSEX.nstyle(address(), value); return this; }
        /** Sets the specified value to the {@link WNDCLASSEX#lpfnWndProc} field. */
        public WNDCLASSEX.Buffer lpfnWndProc(@NativeType("WNDPROC") WindowProcI value) { WNDCLASSEX.nlpfnWndProc(address(), value); return this; }
        /** Sets the specified value to the {@link WNDCLASSEX#cbClsExtra} field. */
        public WNDCLASSEX.Buffer cbClsExtra(int value) { WNDCLASSEX.ncbClsExtra(address(), value); return this; }
        /** Sets the specified value to the {@link WNDCLASSEX#cbWndExtra} field. */
        public WNDCLASSEX.Buffer cbWndExtra(int value) { WNDCLASSEX.ncbWndExtra(address(), value); return this; }
        /** Sets the specified value to the {@link WNDCLASSEX#hInstance} field. */
        public WNDCLASSEX.Buffer hInstance(@NativeType("HINSTANCE") long value) { WNDCLASSEX.nhInstance(address(), value); return this; }
        /** Sets the specified value to the {@link WNDCLASSEX#hIcon} field. */
        public WNDCLASSEX.Buffer hIcon(@NativeType("HICON") long value) { WNDCLASSEX.nhIcon(address(), value); return this; }
        /** Sets the specified value to the {@link WNDCLASSEX#hCursor} field. */
        public WNDCLASSEX.Buffer hCursor(@NativeType("HCURSOR") long value) { WNDCLASSEX.nhCursor(address(), value); return this; }
        /** Sets the specified value to the {@link WNDCLASSEX#hbrBackground} field. */
        public WNDCLASSEX.Buffer hbrBackground(@NativeType("HBRUSH") long value) { WNDCLASSEX.nhbrBackground(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link WNDCLASSEX#lpszMenuName} field. */
        public WNDCLASSEX.Buffer lpszMenuName(@Nullable @NativeType("LPCTSTR") ByteBuffer value) { WNDCLASSEX.nlpszMenuName(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@link WNDCLASSEX#lpszClassName} field. */
        public WNDCLASSEX.Buffer lpszClassName(@NativeType("LPCTSTR") ByteBuffer value) { WNDCLASSEX.nlpszClassName(address(), value); return this; }
        /** Sets the specified value to the {@link WNDCLASSEX#hIconSm} field. */
        public WNDCLASSEX.Buffer hIconSm(@NativeType("HICON") long value) { WNDCLASSEX.nhIconSm(address(), value); return this; }

    }

}