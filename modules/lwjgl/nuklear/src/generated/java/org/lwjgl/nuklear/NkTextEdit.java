/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import org.jspecify.annotations.*;

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
public class NkTextEdit extends Struct<NkTextEdit> implements NativeResource {

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

    protected NkTextEdit(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected NkTextEdit create(long address, @Nullable ByteBuffer container) {
        return new NkTextEdit(address, container);
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

    /** @return a {@link NkClipboard} view of the {@code clip} field. */
    @NativeType("struct nk_clipboard")
    public NkClipboard clip() { return nclip(address()); }
    /** @return a {@link NkStr} view of the {@code string} field. */
    @NativeType("struct nk_str")
    public NkStr string() { return nstring(address()); }
    /** @return the value of the {@code filter} field. */
    @NativeType("nk_plugin_filter")
    public @Nullable NkPluginFilter filter() { return nfilter(address()); }
    /** @return a {@link NkVec2} view of the {@code scrollbar} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 scrollbar() { return nscrollbar(address()); }
    /** @return the value of the {@code cursor} field. */
    public int cursor() { return ncursor(address()); }
    /** @return the value of the {@code select_start} field. */
    public int select_start() { return nselect_start(address()); }
    /** @return the value of the {@code select_end} field. */
    public int select_end() { return nselect_end(address()); }
    /** @return the value of the {@code mode} field. */
    @NativeType("unsigned char")
    public byte mode() { return nmode(address()); }
    /** @return the value of the {@code cursor_at_end_of_line} field. */
    @NativeType("bool")
    public boolean cursor_at_end_of_line() { return ncursor_at_end_of_line(address()); }
    /** @return the value of the {@code initialized} field. */
    @NativeType("bool")
    public boolean initialized() { return ninitialized(address()); }
    /** @return the value of the {@code has_preferred_x} field. */
    @NativeType("bool")
    public boolean has_preferred_x() { return nhas_preferred_x(address()); }
    /** @return the value of the {@code single_line} field. */
    @NativeType("bool")
    public boolean single_line() { return nsingle_line(address()); }
    /** @return the value of the {@code active} field. */
    @NativeType("bool")
    public boolean active() { return nactive(address()); }
    /** @return the value of the {@code preferred_x} field. */
    public float preferred_x() { return npreferred_x(address()); }
    /** @return a {@link NkTextUndoState} view of the {@code undo} field. */
    @NativeType("struct nk_text_undo_state")
    public NkTextUndoState undo() { return nundo(address()); }

    // -----------------------------------

    /** Returns a new {@code NkTextEdit} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkTextEdit malloc() {
        return new NkTextEdit(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code NkTextEdit} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkTextEdit calloc() {
        return new NkTextEdit(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code NkTextEdit} instance allocated with {@link BufferUtils}. */
    public static NkTextEdit create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new NkTextEdit(memAddress(container), container);
    }

    /** Returns a new {@code NkTextEdit} instance for the specified memory address. */
    public static NkTextEdit create(long address) {
        return new NkTextEdit(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable NkTextEdit createSafe(long address) {
        return address == NULL ? null : new NkTextEdit(address, null);
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link NkTextEdit.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static NkTextEdit.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkTextEdit mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkTextEdit callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkTextEdit mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkTextEdit callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkTextEdit.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkTextEdit.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkTextEdit.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkTextEdit.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkTextEdit} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkTextEdit malloc(MemoryStack stack) {
        return new NkTextEdit(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code NkTextEdit} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkTextEdit calloc(MemoryStack stack) {
        return new NkTextEdit(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkTextEdit.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkTextEdit.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #clip}. */
    public static NkClipboard nclip(long struct) { return NkClipboard.create(struct + NkTextEdit.CLIP); }
    /** Unsafe version of {@link #string}. */
    public static NkStr nstring(long struct) { return NkStr.create(struct + NkTextEdit.STRING); }
    /** Unsafe version of {@link #filter}. */
    public static @Nullable NkPluginFilter nfilter(long struct) { return NkPluginFilter.createSafe(memGetAddress(struct + NkTextEdit.FILTER)); }
    /** Unsafe version of {@link #scrollbar}. */
    public static NkVec2 nscrollbar(long struct) { return NkVec2.create(struct + NkTextEdit.SCROLLBAR); }
    /** Unsafe version of {@link #cursor}. */
    public static int ncursor(long struct) { return memGetInt(struct + NkTextEdit.CURSOR); }
    /** Unsafe version of {@link #select_start}. */
    public static int nselect_start(long struct) { return memGetInt(struct + NkTextEdit.SELECT_START); }
    /** Unsafe version of {@link #select_end}. */
    public static int nselect_end(long struct) { return memGetInt(struct + NkTextEdit.SELECT_END); }
    /** Unsafe version of {@link #mode}. */
    public static byte nmode(long struct) { return memGetByte(struct + NkTextEdit.MODE); }
    /** Unsafe version of {@link #cursor_at_end_of_line}. */
    public static boolean ncursor_at_end_of_line(long struct) { return memGetByte(struct + NkTextEdit.CURSOR_AT_END_OF_LINE) != 0; }
    /** Unsafe version of {@link #initialized}. */
    public static boolean ninitialized(long struct) { return memGetByte(struct + NkTextEdit.INITIALIZED) != 0; }
    /** Unsafe version of {@link #has_preferred_x}. */
    public static boolean nhas_preferred_x(long struct) { return memGetByte(struct + NkTextEdit.HAS_PREFERRED_X) != 0; }
    /** Unsafe version of {@link #single_line}. */
    public static boolean nsingle_line(long struct) { return memGetByte(struct + NkTextEdit.SINGLE_LINE) != 0; }
    /** Unsafe version of {@link #active}. */
    public static boolean nactive(long struct) { return memGetByte(struct + NkTextEdit.ACTIVE) != 0; }
    /** Unsafe version of {@link #preferred_x}. */
    public static float npreferred_x(long struct) { return memGetFloat(struct + NkTextEdit.PREFERRED_X); }
    /** Unsafe version of {@link #undo}. */
    public static NkTextUndoState nundo(long struct) { return NkTextUndoState.create(struct + NkTextEdit.UNDO); }

    // -----------------------------------

    /** An array of {@link NkTextEdit} structs. */
    public static class Buffer extends StructBuffer<NkTextEdit, Buffer> implements NativeResource {

        private static final NkTextEdit ELEMENT_FACTORY = NkTextEdit.create(-1L);

        /**
         * Creates a new {@code NkTextEdit.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkTextEdit#SIZEOF}, and its mark will be undefined.</p>
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
        protected NkTextEdit getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkClipboard} view of the {@code clip} field. */
        @NativeType("struct nk_clipboard")
        public NkClipboard clip() { return NkTextEdit.nclip(address()); }
        /** @return a {@link NkStr} view of the {@code string} field. */
        @NativeType("struct nk_str")
        public NkStr string() { return NkTextEdit.nstring(address()); }
        /** @return the value of the {@code filter} field. */
        @NativeType("nk_plugin_filter")
        public @Nullable NkPluginFilter filter() { return NkTextEdit.nfilter(address()); }
        /** @return a {@link NkVec2} view of the {@code scrollbar} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 scrollbar() { return NkTextEdit.nscrollbar(address()); }
        /** @return the value of the {@code cursor} field. */
        public int cursor() { return NkTextEdit.ncursor(address()); }
        /** @return the value of the {@code select_start} field. */
        public int select_start() { return NkTextEdit.nselect_start(address()); }
        /** @return the value of the {@code select_end} field. */
        public int select_end() { return NkTextEdit.nselect_end(address()); }
        /** @return the value of the {@code mode} field. */
        @NativeType("unsigned char")
        public byte mode() { return NkTextEdit.nmode(address()); }
        /** @return the value of the {@code cursor_at_end_of_line} field. */
        @NativeType("bool")
        public boolean cursor_at_end_of_line() { return NkTextEdit.ncursor_at_end_of_line(address()); }
        /** @return the value of the {@code initialized} field. */
        @NativeType("bool")
        public boolean initialized() { return NkTextEdit.ninitialized(address()); }
        /** @return the value of the {@code has_preferred_x} field. */
        @NativeType("bool")
        public boolean has_preferred_x() { return NkTextEdit.nhas_preferred_x(address()); }
        /** @return the value of the {@code single_line} field. */
        @NativeType("bool")
        public boolean single_line() { return NkTextEdit.nsingle_line(address()); }
        /** @return the value of the {@code active} field. */
        @NativeType("bool")
        public boolean active() { return NkTextEdit.nactive(address()); }
        /** @return the value of the {@code preferred_x} field. */
        public float preferred_x() { return NkTextEdit.npreferred_x(address()); }
        /** @return a {@link NkTextUndoState} view of the {@code undo} field. */
        @NativeType("struct nk_text_undo_state")
        public NkTextUndoState undo() { return NkTextEdit.nundo(address()); }

    }

}