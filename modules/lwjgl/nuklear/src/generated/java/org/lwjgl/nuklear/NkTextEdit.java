/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_text_edit {
 *     {@link NkClipboard struct nk_clipboard} clip;
 *     {@link NkStr struct nk_str} string;
 *     {@link NkPluginFilterI nk_plugin_filter} filter;
 *     {@link NkVec2 struct nk_vec2} scrollbar;
 *     int cursor;
 *     int select_start;
 *     int select_end;
 *     unsigned char mode;
 *     bool cursor_at_end_of_line;
 *     bool initialized;
 *     bool has_preferred_x;
 *     bool single_line;
 *     bool active;
 *     char[1];
 *     float preferred_x;
 *     {@link NkTextUndoState struct nk_text_undo_state} undo;
 * }</code></pre>
 */
@NativeType("struct nk_text_edit")
public class NkTextEdit extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CLIP,
        STRING,
        FILTER,
        SCROLLBAR,
        CURSOR,
        SELECT_START,
        SELECT_END,
        MODE,
        CURSOR_AT_END_OF_LINE,
        INITIALIZED,
        HAS_PREFERRED_X,
        SINGLE_LINE,
        ACTIVE,
        PREFERRED_X,
        UNDO;

    static {
        Layout layout = __struct(
            __member(NkClipboard.SIZEOF, NkClipboard.ALIGNOF),
            __member(NkStr.SIZEOF, NkStr.ALIGNOF),
            __member(POINTER_SIZE),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __member(1),
            __padding(1, true),
            __member(4),
            __member(NkTextUndoState.SIZEOF, NkTextUndoState.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CLIP = layout.offsetof(0);
        STRING = layout.offsetof(1);
        FILTER = layout.offsetof(2);
        SCROLLBAR = layout.offsetof(3);
        CURSOR = layout.offsetof(4);
        SELECT_START = layout.offsetof(5);
        SELECT_END = layout.offsetof(6);
        MODE = layout.offsetof(7);
        CURSOR_AT_END_OF_LINE = layout.offsetof(8);
        INITIALIZED = layout.offsetof(9);
        HAS_PREFERRED_X = layout.offsetof(10);
        SINGLE_LINE = layout.offsetof(11);
        ACTIVE = layout.offsetof(12);
        PREFERRED_X = layout.offsetof(14);
        UNDO = layout.offsetof(15);
    }

    /**
     * Creates a {@code NkTextEdit} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkTextEdit(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkClipboard} view of the {@code clip} field. */
    @NativeType("struct nk_clipboard")
    public NkClipboard clip() { return nclip(address()); }
    /** Returns a {@link NkStr} view of the {@code string} field. */
    @NativeType("struct nk_str")
    public NkStr string() { return nstring(address()); }
    /** Returns the value of the {@code filter} field. */
    @Nullable
    @NativeType("nk_plugin_filter")
    public NkPluginFilter filter() { return nfilter(address()); }
    /** Returns a {@link NkVec2} view of the {@code scrollbar} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 scrollbar() { return nscrollbar(address()); }
    /** Returns the value of the {@code cursor} field. */
    public int cursor() { return ncursor(address()); }
    /** Returns the value of the {@code select_start} field. */
    public int select_start() { return nselect_start(address()); }
    /** Returns the value of the {@code select_end} field. */
    public int select_end() { return nselect_end(address()); }
    /** Returns the value of the {@code mode} field. */
    @NativeType("unsigned char")
    public byte mode() { return nmode(address()); }
    /** Returns the value of the {@code cursor_at_end_of_line} field. */
    @NativeType("bool")
    public boolean cursor_at_end_of_line() { return ncursor_at_end_of_line(address()); }
    /** Returns the value of the {@code initialized} field. */
    @NativeType("bool")
    public boolean initialized() { return ninitialized(address()); }
    /** Returns the value of the {@code has_preferred_x} field. */
    @NativeType("bool")
    public boolean has_preferred_x() { return nhas_preferred_x(address()); }
    /** Returns the value of the {@code single_line} field. */
    @NativeType("bool")
    public boolean single_line() { return nsingle_line(address()); }
    /** Returns the value of the {@code active} field. */
    @NativeType("bool")
    public boolean active() { return nactive(address()); }
    /** Returns the value of the {@code preferred_x} field. */
    public float preferred_x() { return npreferred_x(address()); }
    /** Returns a {@link NkTextUndoState} view of the {@code undo} field. */
    @NativeType("struct nk_text_undo_state")
    public NkTextUndoState undo() { return nundo(address()); }

    // -----------------------------------

    /** Returns a new {@code NkTextEdit} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkTextEdit malloc() {
        return wrap(NkTextEdit.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkTextEdit} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkTextEdit calloc() {
        return wrap(NkTextEdit.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkTextEdit} instance allocated with {@link BufferUtils}. */
    public static NkTextEdit create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkTextEdit.class, memAddress(container), container);
    }

    /** Returns a new {@code NkTextEdit} instance for the specified memory address. */
    public static NkTextEdit create(long address) {
        return wrap(NkTextEdit.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkTextEdit createSafe(long address) {
        return address == NULL ? null : wrap(NkTextEdit.class, address);
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkTextEdit.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkTextEdit.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkTextEdit} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkTextEdit mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkTextEdit} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkTextEdit callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkTextEdit} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkTextEdit mallocStack(MemoryStack stack) {
        return wrap(NkTextEdit.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkTextEdit} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkTextEdit callocStack(MemoryStack stack) {
        return wrap(NkTextEdit.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #clip}. */
    public static NkClipboard nclip(long struct) { return NkClipboard.create(struct + NkTextEdit.CLIP); }
    /** Unsafe version of {@link #string}. */
    public static NkStr nstring(long struct) { return NkStr.create(struct + NkTextEdit.STRING); }
    /** Unsafe version of {@link #filter}. */
    @Nullable public static NkPluginFilter nfilter(long struct) { return NkPluginFilter.createSafe(memGetAddress(struct + NkTextEdit.FILTER)); }
    /** Unsafe version of {@link #scrollbar}. */
    public static NkVec2 nscrollbar(long struct) { return NkVec2.create(struct + NkTextEdit.SCROLLBAR); }
    /** Unsafe version of {@link #cursor}. */
    public static int ncursor(long struct) { return UNSAFE.getInt(null, struct + NkTextEdit.CURSOR); }
    /** Unsafe version of {@link #select_start}. */
    public static int nselect_start(long struct) { return UNSAFE.getInt(null, struct + NkTextEdit.SELECT_START); }
    /** Unsafe version of {@link #select_end}. */
    public static int nselect_end(long struct) { return UNSAFE.getInt(null, struct + NkTextEdit.SELECT_END); }
    /** Unsafe version of {@link #mode}. */
    public static byte nmode(long struct) { return UNSAFE.getByte(null, struct + NkTextEdit.MODE); }
    /** Unsafe version of {@link #cursor_at_end_of_line}. */
    public static boolean ncursor_at_end_of_line(long struct) { return UNSAFE.getByte(null, struct + NkTextEdit.CURSOR_AT_END_OF_LINE) != 0; }
    /** Unsafe version of {@link #initialized}. */
    public static boolean ninitialized(long struct) { return UNSAFE.getByte(null, struct + NkTextEdit.INITIALIZED) != 0; }
    /** Unsafe version of {@link #has_preferred_x}. */
    public static boolean nhas_preferred_x(long struct) { return UNSAFE.getByte(null, struct + NkTextEdit.HAS_PREFERRED_X) != 0; }
    /** Unsafe version of {@link #single_line}. */
    public static boolean nsingle_line(long struct) { return UNSAFE.getByte(null, struct + NkTextEdit.SINGLE_LINE) != 0; }
    /** Unsafe version of {@link #active}. */
    public static boolean nactive(long struct) { return UNSAFE.getByte(null, struct + NkTextEdit.ACTIVE) != 0; }
    /** Unsafe version of {@link #preferred_x}. */
    public static float npreferred_x(long struct) { return UNSAFE.getFloat(null, struct + NkTextEdit.PREFERRED_X); }
    /** Unsafe version of {@link #undo}. */
    public static NkTextUndoState nundo(long struct) { return NkTextUndoState.create(struct + NkTextEdit.UNDO); }

    // -----------------------------------

    /** An array of {@link NkTextEdit} structs. */
    public static class Buffer extends StructBuffer<NkTextEdit, Buffer> implements NativeResource {

        private static final NkTextEdit ELEMENT_FACTORY = NkTextEdit.create(-1L);

        /**
         * Creates a new {@code NkTextEdit.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkTextEdit#SIZEOF}, and its mark will be undefined.
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
        protected NkTextEdit getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkClipboard} view of the {@code clip} field. */
        @NativeType("struct nk_clipboard")
        public NkClipboard clip() { return NkTextEdit.nclip(address()); }
        /** Returns a {@link NkStr} view of the {@code string} field. */
        @NativeType("struct nk_str")
        public NkStr string() { return NkTextEdit.nstring(address()); }
        /** Returns the value of the {@code filter} field. */
        @Nullable
        @NativeType("nk_plugin_filter")
        public NkPluginFilter filter() { return NkTextEdit.nfilter(address()); }
        /** Returns a {@link NkVec2} view of the {@code scrollbar} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 scrollbar() { return NkTextEdit.nscrollbar(address()); }
        /** Returns the value of the {@code cursor} field. */
        public int cursor() { return NkTextEdit.ncursor(address()); }
        /** Returns the value of the {@code select_start} field. */
        public int select_start() { return NkTextEdit.nselect_start(address()); }
        /** Returns the value of the {@code select_end} field. */
        public int select_end() { return NkTextEdit.nselect_end(address()); }
        /** Returns the value of the {@code mode} field. */
        @NativeType("unsigned char")
        public byte mode() { return NkTextEdit.nmode(address()); }
        /** Returns the value of the {@code cursor_at_end_of_line} field. */
        @NativeType("bool")
        public boolean cursor_at_end_of_line() { return NkTextEdit.ncursor_at_end_of_line(address()); }
        /** Returns the value of the {@code initialized} field. */
        @NativeType("bool")
        public boolean initialized() { return NkTextEdit.ninitialized(address()); }
        /** Returns the value of the {@code has_preferred_x} field. */
        @NativeType("bool")
        public boolean has_preferred_x() { return NkTextEdit.nhas_preferred_x(address()); }
        /** Returns the value of the {@code single_line} field. */
        @NativeType("bool")
        public boolean single_line() { return NkTextEdit.nsingle_line(address()); }
        /** Returns the value of the {@code active} field. */
        @NativeType("bool")
        public boolean active() { return NkTextEdit.nactive(address()); }
        /** Returns the value of the {@code preferred_x} field. */
        public float preferred_x() { return NkTextEdit.npreferred_x(address()); }
        /** Returns a {@link NkTextUndoState} view of the {@code undo} field. */
        @NativeType("struct nk_text_undo_state")
        public NkTextUndoState undo() { return NkTextEdit.nundo(address()); }

    }

}