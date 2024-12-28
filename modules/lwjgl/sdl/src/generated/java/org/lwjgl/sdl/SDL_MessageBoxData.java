/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.sdl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct SDL_MessageBoxData {
 *     SDL_MessageBoxFlags flags;
 *     SDL_Window * window;
 *     char const * title;
 *     char const * message;
 *     int numbuttons;
 *     {@link SDL_MessageBoxButtonData SDL_MessageBoxButtonData} const * buttons;
 *     {@link SDL_MessageBoxColorScheme SDL_MessageBoxColorScheme} const * colorScheme;
 * }}</pre>
 */
public class SDL_MessageBoxData extends Struct<SDL_MessageBoxData> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        FLAGS,
        WINDOW,
        TITLE,
        MESSAGE,
        NUMBUTTONS,
        BUTTONS,
        COLORSCHEME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        FLAGS = layout.offsetof(0);
        WINDOW = layout.offsetof(1);
        TITLE = layout.offsetof(2);
        MESSAGE = layout.offsetof(3);
        NUMBUTTONS = layout.offsetof(4);
        BUTTONS = layout.offsetof(5);
        COLORSCHEME = layout.offsetof(6);
    }

    protected SDL_MessageBoxData(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected SDL_MessageBoxData create(long address, @Nullable ByteBuffer container) {
        return new SDL_MessageBoxData(address, container);
    }

    /**
     * Creates a {@code SDL_MessageBoxData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public SDL_MessageBoxData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code flags} field. */
    @NativeType("SDL_MessageBoxFlags")
    public int flags() { return nflags(address()); }
    /** @return the value of the {@code window} field. */
    @NativeType("SDL_Window *")
    public long window() { return nwindow(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code title} field. */
    @NativeType("char const *")
    public ByteBuffer title() { return ntitle(address()); }
    /** @return the null-terminated string pointed to by the {@code title} field. */
    @NativeType("char const *")
    public String titleString() { return ntitleString(address()); }
    /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code message} field. */
    @NativeType("char const *")
    public ByteBuffer message() { return nmessage(address()); }
    /** @return the null-terminated string pointed to by the {@code message} field. */
    @NativeType("char const *")
    public String messageString() { return nmessageString(address()); }
    /** @return the value of the {@code numbuttons} field. */
    public int numbuttons() { return nnumbuttons(address()); }
    /** @return a {@link SDL_MessageBoxButtonData.Buffer} view of the struct array pointed to by the {@code buttons} field. */
    @NativeType("SDL_MessageBoxButtonData const *")
    public SDL_MessageBoxButtonData.Buffer buttons() { return nbuttons(address()); }
    /** @return a {@link SDL_MessageBoxColorScheme} view of the struct pointed to by the {@code colorScheme} field. */
    @NativeType("SDL_MessageBoxColorScheme const *")
    public @Nullable SDL_MessageBoxColorScheme colorScheme() { return ncolorScheme(address()); }

    /** Sets the specified value to the {@code flags} field. */
    public SDL_MessageBoxData flags(@NativeType("SDL_MessageBoxFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code window} field. */
    public SDL_MessageBoxData window(@NativeType("SDL_Window *") long value) { nwindow(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code title} field. */
    public SDL_MessageBoxData title(@NativeType("char const *") ByteBuffer value) { ntitle(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code message} field. */
    public SDL_MessageBoxData message(@NativeType("char const *") ByteBuffer value) { nmessage(address(), value); return this; }
    /** Sets the address of the specified {@link SDL_MessageBoxButtonData.Buffer} to the {@code buttons} field. */
    public SDL_MessageBoxData buttons(@NativeType("SDL_MessageBoxButtonData const *") SDL_MessageBoxButtonData.Buffer value) { nbuttons(address(), value); return this; }
    /** Sets the address of the specified {@link SDL_MessageBoxColorScheme} to the {@code colorScheme} field. */
    public SDL_MessageBoxData colorScheme(@Nullable @NativeType("SDL_MessageBoxColorScheme const *") SDL_MessageBoxColorScheme value) { ncolorScheme(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public SDL_MessageBoxData set(
        int flags,
        long window,
        ByteBuffer title,
        ByteBuffer message,
        SDL_MessageBoxButtonData.Buffer buttons,
        @Nullable SDL_MessageBoxColorScheme colorScheme
    ) {
        flags(flags);
        window(window);
        title(title);
        message(message);
        buttons(buttons);
        colorScheme(colorScheme);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public SDL_MessageBoxData set(SDL_MessageBoxData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code SDL_MessageBoxData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static SDL_MessageBoxData malloc() {
        return new SDL_MessageBoxData(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code SDL_MessageBoxData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static SDL_MessageBoxData calloc() {
        return new SDL_MessageBoxData(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code SDL_MessageBoxData} instance allocated with {@link BufferUtils}. */
    public static SDL_MessageBoxData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_MessageBoxData(memAddress(container), container);
    }

    /** Returns a new {@code SDL_MessageBoxData} instance for the specified memory address. */
    public static SDL_MessageBoxData create(long address) {
        return new SDL_MessageBoxData(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable SDL_MessageBoxData createSafe(long address) {
        return address == NULL ? null : new SDL_MessageBoxData(address, null);
    }

    /**
     * Returns a new {@link SDL_MessageBoxData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxData.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxData.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link SDL_MessageBoxData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxData.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static SDL_MessageBoxData.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code SDL_MessageBoxData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MessageBoxData malloc(MemoryStack stack) {
        return new SDL_MessageBoxData(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code SDL_MessageBoxData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static SDL_MessageBoxData calloc(MemoryStack stack) {
        return new SDL_MessageBoxData(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link SDL_MessageBoxData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxData.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link SDL_MessageBoxData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static SDL_MessageBoxData.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + SDL_MessageBoxData.FLAGS); }
    /** Unsafe version of {@link #window}. */
    public static long nwindow(long struct) { return memGetAddress(struct + SDL_MessageBoxData.WINDOW); }
    /** Unsafe version of {@link #title}. */
    public static ByteBuffer ntitle(long struct) { return memByteBufferNT1(memGetAddress(struct + SDL_MessageBoxData.TITLE)); }
    /** Unsafe version of {@link #titleString}. */
    public static String ntitleString(long struct) { return memUTF8(memGetAddress(struct + SDL_MessageBoxData.TITLE)); }
    /** Unsafe version of {@link #message}. */
    public static ByteBuffer nmessage(long struct) { return memByteBufferNT1(memGetAddress(struct + SDL_MessageBoxData.MESSAGE)); }
    /** Unsafe version of {@link #messageString}. */
    public static String nmessageString(long struct) { return memUTF8(memGetAddress(struct + SDL_MessageBoxData.MESSAGE)); }
    /** Unsafe version of {@link #numbuttons}. */
    public static int nnumbuttons(long struct) { return memGetInt(struct + SDL_MessageBoxData.NUMBUTTONS); }
    /** Unsafe version of {@link #buttons}. */
    public static SDL_MessageBoxButtonData.Buffer nbuttons(long struct) { return SDL_MessageBoxButtonData.create(memGetAddress(struct + SDL_MessageBoxData.BUTTONS), nnumbuttons(struct)); }
    /** Unsafe version of {@link #colorScheme}. */
    public static @Nullable SDL_MessageBoxColorScheme ncolorScheme(long struct) { return SDL_MessageBoxColorScheme.createSafe(memGetAddress(struct + SDL_MessageBoxData.COLORSCHEME)); }

    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + SDL_MessageBoxData.FLAGS, value); }
    /** Unsafe version of {@link #window(long) window}. */
    public static void nwindow(long struct, long value) { memPutAddress(struct + SDL_MessageBoxData.WINDOW, value); }
    /** Unsafe version of {@link #title(ByteBuffer) title}. */
    public static void ntitle(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SDL_MessageBoxData.TITLE, memAddress(value));
    }
    /** Unsafe version of {@link #message(ByteBuffer) message}. */
    public static void nmessage(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1(value); }
        memPutAddress(struct + SDL_MessageBoxData.MESSAGE, memAddress(value));
    }
    /** Sets the specified value to the {@code numbuttons} field of the specified {@code struct}. */
    public static void nnumbuttons(long struct, int value) { memPutInt(struct + SDL_MessageBoxData.NUMBUTTONS, value); }
    /** Unsafe version of {@link #buttons(SDL_MessageBoxButtonData.Buffer) buttons}. */
    public static void nbuttons(long struct, SDL_MessageBoxButtonData.Buffer value) { memPutAddress(struct + SDL_MessageBoxData.BUTTONS, value.address()); nnumbuttons(struct, value.remaining()); }
    /** Unsafe version of {@link #colorScheme(SDL_MessageBoxColorScheme) colorScheme}. */
    public static void ncolorScheme(long struct, @Nullable SDL_MessageBoxColorScheme value) { memPutAddress(struct + SDL_MessageBoxData.COLORSCHEME, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + SDL_MessageBoxData.TITLE));
        check(memGetAddress(struct + SDL_MessageBoxData.MESSAGE));
        int numbuttons = nnumbuttons(struct);
        long buttons = memGetAddress(struct + SDL_MessageBoxData.BUTTONS);
        check(buttons);
        validate(buttons, numbuttons, SDL_MessageBoxButtonData.SIZEOF, SDL_MessageBoxButtonData::validate);
    }

    // -----------------------------------

    /** An array of {@link SDL_MessageBoxData} structs. */
    public static class Buffer extends StructBuffer<SDL_MessageBoxData, Buffer> implements NativeResource {

        private static final SDL_MessageBoxData ELEMENT_FACTORY = SDL_MessageBoxData.create(-1L);

        /**
         * Creates a new {@code SDL_MessageBoxData.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link SDL_MessageBoxData#SIZEOF}, and its mark will be undefined.</p>
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
        protected SDL_MessageBoxData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code flags} field. */
        @NativeType("SDL_MessageBoxFlags")
        public int flags() { return SDL_MessageBoxData.nflags(address()); }
        /** @return the value of the {@code window} field. */
        @NativeType("SDL_Window *")
        public long window() { return SDL_MessageBoxData.nwindow(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code title} field. */
        @NativeType("char const *")
        public ByteBuffer title() { return SDL_MessageBoxData.ntitle(address()); }
        /** @return the null-terminated string pointed to by the {@code title} field. */
        @NativeType("char const *")
        public String titleString() { return SDL_MessageBoxData.ntitleString(address()); }
        /** @return a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code message} field. */
        @NativeType("char const *")
        public ByteBuffer message() { return SDL_MessageBoxData.nmessage(address()); }
        /** @return the null-terminated string pointed to by the {@code message} field. */
        @NativeType("char const *")
        public String messageString() { return SDL_MessageBoxData.nmessageString(address()); }
        /** @return the value of the {@code numbuttons} field. */
        public int numbuttons() { return SDL_MessageBoxData.nnumbuttons(address()); }
        /** @return a {@link SDL_MessageBoxButtonData.Buffer} view of the struct array pointed to by the {@code buttons} field. */
        @NativeType("SDL_MessageBoxButtonData const *")
        public SDL_MessageBoxButtonData.Buffer buttons() { return SDL_MessageBoxData.nbuttons(address()); }
        /** @return a {@link SDL_MessageBoxColorScheme} view of the struct pointed to by the {@code colorScheme} field. */
        @NativeType("SDL_MessageBoxColorScheme const *")
        public @Nullable SDL_MessageBoxColorScheme colorScheme() { return SDL_MessageBoxData.ncolorScheme(address()); }

        /** Sets the specified value to the {@code flags} field. */
        public SDL_MessageBoxData.Buffer flags(@NativeType("SDL_MessageBoxFlags") int value) { SDL_MessageBoxData.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code window} field. */
        public SDL_MessageBoxData.Buffer window(@NativeType("SDL_Window *") long value) { SDL_MessageBoxData.nwindow(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code title} field. */
        public SDL_MessageBoxData.Buffer title(@NativeType("char const *") ByteBuffer value) { SDL_MessageBoxData.ntitle(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code message} field. */
        public SDL_MessageBoxData.Buffer message(@NativeType("char const *") ByteBuffer value) { SDL_MessageBoxData.nmessage(address(), value); return this; }
        /** Sets the address of the specified {@link SDL_MessageBoxButtonData.Buffer} to the {@code buttons} field. */
        public SDL_MessageBoxData.Buffer buttons(@NativeType("SDL_MessageBoxButtonData const *") SDL_MessageBoxButtonData.Buffer value) { SDL_MessageBoxData.nbuttons(address(), value); return this; }
        /** Sets the address of the specified {@link SDL_MessageBoxColorScheme} to the {@code colorScheme} field. */
        public SDL_MessageBoxData.Buffer colorScheme(@Nullable @NativeType("SDL_MessageBoxColorScheme const *") SDL_MessageBoxColorScheme value) { SDL_MessageBoxData.ncolorScheme(address(), value); return this; }

    }

}