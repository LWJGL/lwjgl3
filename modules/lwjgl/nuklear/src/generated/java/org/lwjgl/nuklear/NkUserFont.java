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
 * struct nk_user_font {
 *     {@link NkHandle nk_handle} {@link #userdata};
 *     float {@link #height};
 *     {@link NkTextWidthCallbackI nk_text_width_f} {@link #width};
 *     {@link NkQueryFontGlyphCallbackI nk_query_font_glyph_f} {@link #query};
 *     {@link NkHandle nk_handle} {@link #texture};
 * }</code></pre>
 */
@NativeType("struct nk_user_font")
public class NkUserFont extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        USERDATA,
        HEIGHT,
        WIDTH,
        QUERY,
        TEXTURE;

    static {
        Layout layout = __struct(
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        USERDATA = layout.offsetof(0);
        HEIGHT = layout.offsetof(1);
        WIDTH = layout.offsetof(2);
        QUERY = layout.offsetof(3);
        TEXTURE = layout.offsetof(4);
    }

    /**
     * Creates a {@code NkUserFont} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkUserFont(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** user provided font handle */
    @NativeType("nk_handle")
    public NkHandle userdata() { return nuserdata(address()); }
    /** max height of the font */
    public float height() { return nheight(address()); }
    /** font string width in pixel callback */
    @Nullable
    @NativeType("nk_text_width_f")
    public NkTextWidthCallback width() { return nwidth(address()); }
    /** font glyph callback to query drawing info */
    @Nullable
    @NativeType("nk_query_font_glyph_f")
    public NkQueryFontGlyphCallback query() { return nquery(address()); }
    /** texture handle to the used font atlas or texture */
    @NativeType("nk_handle")
    public NkHandle texture() { return ntexture(address()); }

    /** Copies the specified {@link NkHandle} to the {@link #userdata} field. */
    public NkUserFont userdata(@NativeType("nk_handle") NkHandle value) { nuserdata(address(), value); return this; }
    /** Passes the {@link #userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkUserFont userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
    /** Sets the specified value to the {@link #height} field. */
    public NkUserFont height(float value) { nheight(address(), value); return this; }
    /** Sets the specified value to the {@link #width} field. */
    public NkUserFont width(@Nullable @NativeType("nk_text_width_f") NkTextWidthCallbackI value) { nwidth(address(), value); return this; }
    /** Sets the specified value to the {@link #query} field. */
    public NkUserFont query(@Nullable @NativeType("nk_query_font_glyph_f") NkQueryFontGlyphCallbackI value) { nquery(address(), value); return this; }
    /** Copies the specified {@link NkHandle} to the {@link #texture} field. */
    public NkUserFont texture(@NativeType("nk_handle") NkHandle value) { ntexture(address(), value); return this; }
    /** Passes the {@link #texture} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkUserFont texture(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(texture()); return this; }

    /** Initializes this struct with the specified values. */
    public NkUserFont set(
        NkHandle userdata,
        float height,
        NkTextWidthCallbackI width,
        NkQueryFontGlyphCallbackI query,
        NkHandle texture
    ) {
        userdata(userdata);
        height(height);
        width(width);
        query(query);
        texture(texture);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkUserFont set(NkUserFont src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkUserFont} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkUserFont malloc() {
        return wrap(NkUserFont.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkUserFont} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkUserFont calloc() {
        return wrap(NkUserFont.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkUserFont} instance allocated with {@link BufferUtils}. */
    public static NkUserFont create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkUserFont.class, memAddress(container), container);
    }

    /** Returns a new {@code NkUserFont} instance for the specified memory address. */
    public static NkUserFont create(long address) {
        return wrap(NkUserFont.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkUserFont createSafe(long address) {
        return address == NULL ? null : wrap(NkUserFont.class, address);
    }

    /**
     * Returns a new {@link NkUserFont.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkUserFont.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkUserFont.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkUserFont.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkUserFont.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkUserFont.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkUserFont.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkUserFont.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkUserFont.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkUserFont mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkUserFont callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static NkUserFont mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static NkUserFont callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkUserFont.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkUserFont.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static NkUserFont.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static NkUserFont.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code NkUserFont} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkUserFont malloc(MemoryStack stack) {
        return wrap(NkUserFont.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkUserFont} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkUserFont calloc(MemoryStack stack) {
        return wrap(NkUserFont.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkUserFont.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkUserFont.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkUserFont.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkUserFont.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #userdata}. */
    public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkUserFont.USERDATA); }
    /** Unsafe version of {@link #height}. */
    public static float nheight(long struct) { return UNSAFE.getFloat(null, struct + NkUserFont.HEIGHT); }
    /** Unsafe version of {@link #width}. */
    @Nullable public static NkTextWidthCallback nwidth(long struct) { return NkTextWidthCallback.createSafe(memGetAddress(struct + NkUserFont.WIDTH)); }
    /** Unsafe version of {@link #query}. */
    @Nullable public static NkQueryFontGlyphCallback nquery(long struct) { return NkQueryFontGlyphCallback.createSafe(memGetAddress(struct + NkUserFont.QUERY)); }
    /** Unsafe version of {@link #texture}. */
    public static NkHandle ntexture(long struct) { return NkHandle.create(struct + NkUserFont.TEXTURE); }

    /** Unsafe version of {@link #userdata(NkHandle) userdata}. */
    public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkUserFont.USERDATA, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #height(float) height}. */
    public static void nheight(long struct, float value) { UNSAFE.putFloat(null, struct + NkUserFont.HEIGHT, value); }
    /** Unsafe version of {@link #width(NkTextWidthCallbackI) width}. */
    public static void nwidth(long struct, @Nullable NkTextWidthCallbackI value) { memPutAddress(struct + NkUserFont.WIDTH, memAddressSafe(value)); }
    /** Unsafe version of {@link #query(NkQueryFontGlyphCallbackI) query}. */
    public static void nquery(long struct, @Nullable NkQueryFontGlyphCallbackI value) { memPutAddress(struct + NkUserFont.QUERY, memAddressSafe(value)); }
    /** Unsafe version of {@link #texture(NkHandle) texture}. */
    public static void ntexture(long struct, NkHandle value) { memCopy(value.address(), struct + NkUserFont.TEXTURE, NkHandle.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkUserFont} structs. */
    public static class Buffer extends StructBuffer<NkUserFont, Buffer> implements NativeResource {

        private static final NkUserFont ELEMENT_FACTORY = NkUserFont.create(-1L);

        /**
         * Creates a new {@code NkUserFont.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkUserFont#SIZEOF}, and its mark will be undefined.
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
        protected NkUserFont getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return a {@link NkHandle} view of the {@link NkUserFont#userdata} field. */
        @NativeType("nk_handle")
        public NkHandle userdata() { return NkUserFont.nuserdata(address()); }
        /** @return the value of the {@link NkUserFont#height} field. */
        public float height() { return NkUserFont.nheight(address()); }
        /** @return the value of the {@link NkUserFont#width} field. */
        @Nullable
        @NativeType("nk_text_width_f")
        public NkTextWidthCallback width() { return NkUserFont.nwidth(address()); }
        /** @return the value of the {@link NkUserFont#query} field. */
        @Nullable
        @NativeType("nk_query_font_glyph_f")
        public NkQueryFontGlyphCallback query() { return NkUserFont.nquery(address()); }
        /** @return a {@link NkHandle} view of the {@link NkUserFont#texture} field. */
        @NativeType("nk_handle")
        public NkHandle texture() { return NkUserFont.ntexture(address()); }

        /** Copies the specified {@link NkHandle} to the {@link NkUserFont#userdata} field. */
        public NkUserFont.Buffer userdata(@NativeType("nk_handle") NkHandle value) { NkUserFont.nuserdata(address(), value); return this; }
        /** Passes the {@link NkUserFont#userdata} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkUserFont.Buffer userdata(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(userdata()); return this; }
        /** Sets the specified value to the {@link NkUserFont#height} field. */
        public NkUserFont.Buffer height(float value) { NkUserFont.nheight(address(), value); return this; }
        /** Sets the specified value to the {@link NkUserFont#width} field. */
        public NkUserFont.Buffer width(@Nullable @NativeType("nk_text_width_f") NkTextWidthCallbackI value) { NkUserFont.nwidth(address(), value); return this; }
        /** Sets the specified value to the {@link NkUserFont#query} field. */
        public NkUserFont.Buffer query(@Nullable @NativeType("nk_query_font_glyph_f") NkQueryFontGlyphCallbackI value) { NkUserFont.nquery(address(), value); return this; }
        /** Copies the specified {@link NkHandle} to the {@link NkUserFont#texture} field. */
        public NkUserFont.Buffer texture(@NativeType("nk_handle") NkHandle value) { NkUserFont.ntexture(address(), value); return this; }
        /** Passes the {@link NkUserFont#texture} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkUserFont.Buffer texture(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(texture()); return this; }

    }

}