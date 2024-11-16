/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

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
 * struct VROverlayView_t {
 *     VROverlayHandle_t overlayHandle;
 *     {@link Texture Texture_t} texture;
 *     {@link VRTextureBounds VRTextureBounds_t} textureBounds;
 * }</code></pre>
 */
public class VROverlayView_t extends Struct<VROverlayView_t> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        OVERLAYHANDLE,
        TEXTURE,
        TEXTUREBOUNDS;

    static {
        Layout layout = __struct(
            __member(8),
            __member(Texture.SIZEOF, Texture.ALIGNOF),
            __member(VRTextureBounds.SIZEOF, VRTextureBounds.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        OVERLAYHANDLE = layout.offsetof(0);
        TEXTURE = layout.offsetof(1);
        TEXTUREBOUNDS = layout.offsetof(2);
    }

    protected VROverlayView_t(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VROverlayView_t create(long address, @Nullable ByteBuffer container) {
        return new VROverlayView_t(address, container);
    }

    /**
     * Creates a {@code VROverlayView_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VROverlayView_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code overlayHandle} field. */
    @NativeType("VROverlayHandle_t")
    public long overlayHandle() { return noverlayHandle(address()); }
    /** @return a {@link Texture} view of the {@code texture} field. */
    @NativeType("Texture_t")
    public Texture texture() { return ntexture(address()); }
    /** @return a {@link VRTextureBounds} view of the {@code textureBounds} field. */
    @NativeType("VRTextureBounds_t")
    public VRTextureBounds textureBounds() { return ntextureBounds(address()); }

    // -----------------------------------

    /** Returns a new {@code VROverlayView_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VROverlayView_t malloc() {
        return new VROverlayView_t(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VROverlayView_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VROverlayView_t calloc() {
        return new VROverlayView_t(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VROverlayView_t} instance allocated with {@link BufferUtils}. */
    public static VROverlayView_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VROverlayView_t(memAddress(container), container);
    }

    /** Returns a new {@code VROverlayView_t} instance for the specified memory address. */
    public static VROverlayView_t create(long address) {
        return new VROverlayView_t(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VROverlayView_t createSafe(long address) {
        return address == NULL ? null : new VROverlayView_t(address, null);
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VROverlayView_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VROverlayView_t.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VROverlayView_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayView_t malloc(MemoryStack stack) {
        return new VROverlayView_t(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VROverlayView_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayView_t calloc(MemoryStack stack) {
        return new VROverlayView_t(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #overlayHandle}. */
    public static long noverlayHandle(long struct) { return memGetLong(struct + VROverlayView_t.OVERLAYHANDLE); }
    /** Unsafe version of {@link #texture}. */
    public static Texture ntexture(long struct) { return Texture.create(struct + VROverlayView_t.TEXTURE); }
    /** Unsafe version of {@link #textureBounds}. */
    public static VRTextureBounds ntextureBounds(long struct) { return VRTextureBounds.create(struct + VROverlayView_t.TEXTUREBOUNDS); }

    // -----------------------------------

    /** An array of {@link VROverlayView_t} structs. */
    public static class Buffer extends StructBuffer<VROverlayView_t, Buffer> implements NativeResource {

        private static final VROverlayView_t ELEMENT_FACTORY = VROverlayView_t.create(-1L);

        /**
         * Creates a new {@code VROverlayView_t.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VROverlayView_t#SIZEOF}, and its mark will be undefined.</p>
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
        protected VROverlayView_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code overlayHandle} field. */
        @NativeType("VROverlayHandle_t")
        public long overlayHandle() { return VROverlayView_t.noverlayHandle(address()); }
        /** @return a {@link Texture} view of the {@code texture} field. */
        @NativeType("Texture_t")
        public Texture texture() { return VROverlayView_t.ntexture(address()); }
        /** @return a {@link VRTextureBounds} view of the {@code textureBounds} field. */
        @NativeType("VRTextureBounds_t")
        public VRTextureBounds textureBounds() { return VROverlayView_t.ntextureBounds(address()); }

    }

}