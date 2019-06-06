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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code texture} &ndash; texture handle to a texture with a white pixel</li>
 * <li>{@code uv} &ndash; coordinates to a white pixel in the texture</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct nk_draw_null_texture {
 *     {@link NkHandle nk_handle} texture;
 *     {@link NkVec2 struct nk_vec2} uv;
 * }</code></pre>
 */
@NativeType("struct nk_draw_null_texture")
public class NkDrawNullTexture extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TEXTURE,
        UV;

    static {
        Layout layout = __struct(
            __member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
            __member(NkVec2.SIZEOF, NkVec2.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TEXTURE = layout.offsetof(0);
        UV = layout.offsetof(1);
    }

    /**
     * Creates a {@code NkDrawNullTexture} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public NkDrawNullTexture(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link NkHandle} view of the {@code texture} field. */
    @NativeType("nk_handle")
    public NkHandle texture() { return ntexture(address()); }
    /** Returns a {@link NkVec2} view of the {@code uv} field. */
    @NativeType("struct nk_vec2")
    public NkVec2 uv() { return nuv(address()); }

    /** Copies the specified {@link NkHandle} to the {@code texture} field. */
    public NkDrawNullTexture texture(@NativeType("nk_handle") NkHandle value) { ntexture(address(), value); return this; }
    /** Passes the {@code texture} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkDrawNullTexture texture(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(texture()); return this; }
    /** Copies the specified {@link NkVec2} to the {@code uv} field. */
    public NkDrawNullTexture uv(@NativeType("struct nk_vec2") NkVec2 value) { nuv(address(), value); return this; }
    /** Passes the {@code uv} field to the specified {@link java.util.function.Consumer Consumer}. */
    public NkDrawNullTexture uv(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(uv()); return this; }

    /** Initializes this struct with the specified values. */
    public NkDrawNullTexture set(
        NkHandle texture,
        NkVec2 uv
    ) {
        texture(texture);
        uv(uv);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public NkDrawNullTexture set(NkDrawNullTexture src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code NkDrawNullTexture} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static NkDrawNullTexture malloc() {
        return wrap(NkDrawNullTexture.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code NkDrawNullTexture} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static NkDrawNullTexture calloc() {
        return wrap(NkDrawNullTexture.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code NkDrawNullTexture} instance allocated with {@link BufferUtils}. */
    public static NkDrawNullTexture create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(NkDrawNullTexture.class, memAddress(container), container);
    }

    /** Returns a new {@code NkDrawNullTexture} instance for the specified memory address. */
    public static NkDrawNullTexture create(long address) {
        return wrap(NkDrawNullTexture.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkDrawNullTexture createSafe(long address) {
        return address == NULL ? null : wrap(NkDrawNullTexture.class, address);
    }

    /**
     * Returns a new {@link NkDrawNullTexture.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawNullTexture.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link NkDrawNullTexture.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawNullTexture.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkDrawNullTexture.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawNullTexture.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link NkDrawNullTexture.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static NkDrawNullTexture.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static NkDrawNullTexture.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code NkDrawNullTexture} instance allocated on the thread-local {@link MemoryStack}. */
    public static NkDrawNullTexture mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code NkDrawNullTexture} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static NkDrawNullTexture callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code NkDrawNullTexture} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static NkDrawNullTexture mallocStack(MemoryStack stack) {
        return wrap(NkDrawNullTexture.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code NkDrawNullTexture} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static NkDrawNullTexture callocStack(MemoryStack stack) {
        return wrap(NkDrawNullTexture.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link NkDrawNullTexture.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawNullTexture.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkDrawNullTexture.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static NkDrawNullTexture.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link NkDrawNullTexture.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkDrawNullTexture.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link NkDrawNullTexture.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static NkDrawNullTexture.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #texture}. */
    public static NkHandle ntexture(long struct) { return NkHandle.create(struct + NkDrawNullTexture.TEXTURE); }
    /** Unsafe version of {@link #uv}. */
    public static NkVec2 nuv(long struct) { return NkVec2.create(struct + NkDrawNullTexture.UV); }

    /** Unsafe version of {@link #texture(NkHandle) texture}. */
    public static void ntexture(long struct, NkHandle value) { memCopy(value.address(), struct + NkDrawNullTexture.TEXTURE, NkHandle.SIZEOF); }
    /** Unsafe version of {@link #uv(NkVec2) uv}. */
    public static void nuv(long struct, NkVec2 value) { memCopy(value.address(), struct + NkDrawNullTexture.UV, NkVec2.SIZEOF); }

    // -----------------------------------

    /** An array of {@link NkDrawNullTexture} structs. */
    public static class Buffer extends StructBuffer<NkDrawNullTexture, Buffer> implements NativeResource {

        private static final NkDrawNullTexture ELEMENT_FACTORY = NkDrawNullTexture.create(-1L);

        /**
         * Creates a new {@code NkDrawNullTexture.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link NkDrawNullTexture#SIZEOF}, and its mark will be undefined.
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
        protected NkDrawNullTexture getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link NkHandle} view of the {@code texture} field. */
        @NativeType("nk_handle")
        public NkHandle texture() { return NkDrawNullTexture.ntexture(address()); }
        /** Returns a {@link NkVec2} view of the {@code uv} field. */
        @NativeType("struct nk_vec2")
        public NkVec2 uv() { return NkDrawNullTexture.nuv(address()); }

        /** Copies the specified {@link NkHandle} to the {@code texture} field. */
        public NkDrawNullTexture.Buffer texture(@NativeType("nk_handle") NkHandle value) { NkDrawNullTexture.ntexture(address(), value); return this; }
        /** Passes the {@code texture} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkDrawNullTexture.Buffer texture(java.util.function.Consumer<NkHandle> consumer) { consumer.accept(texture()); return this; }
        /** Copies the specified {@link NkVec2} to the {@code uv} field. */
        public NkDrawNullTexture.Buffer uv(@NativeType("struct nk_vec2") NkVec2 value) { NkDrawNullTexture.nuv(address(), value); return this; }
        /** Passes the {@code uv} field to the specified {@link java.util.function.Consumer Consumer}. */
        public NkDrawNullTexture.Buffer uv(java.util.function.Consumer<NkVec2> consumer) { consumer.accept(uv()); return this; }

    }

}