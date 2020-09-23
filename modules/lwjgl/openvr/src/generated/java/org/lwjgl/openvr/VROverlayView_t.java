/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

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
 * struct VROverlayView_t {
 *     VROverlayHandle_t overlayHandle;
 *     {@link Texture Texture_t} texture;
 *     {@link VRTextureBounds VRTextureBounds_t} textureBounds;
 * }</code></pre>
 */
public class VROverlayView_t extends Struct implements NativeResource {

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

    /** Returns the value of the {@code overlayHandle} field. */
    @NativeType("VROverlayHandle_t")
    public long overlayHandle() { return noverlayHandle(address()); }
    /** Returns a {@link Texture} view of the {@code texture} field. */
    @NativeType("Texture_t")
    public Texture texture() { return ntexture(address()); }
    /** Returns a {@link VRTextureBounds} view of the {@code textureBounds} field. */
    @NativeType("VRTextureBounds_t")
    public VRTextureBounds textureBounds() { return ntextureBounds(address()); }

    // -----------------------------------

    /** Returns a new {@code VROverlayView_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VROverlayView_t malloc() {
        return wrap(VROverlayView_t.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code VROverlayView_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VROverlayView_t calloc() {
        return wrap(VROverlayView_t.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code VROverlayView_t} instance allocated with {@link BufferUtils}. */
    public static VROverlayView_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(VROverlayView_t.class, memAddress(container), container);
    }

    /** Returns a new {@code VROverlayView_t} instance for the specified memory address. */
    public static VROverlayView_t create(long address) {
        return wrap(VROverlayView_t.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayView_t createSafe(long address) {
        return address == NULL ? null : wrap(VROverlayView_t.class, address);
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link VROverlayView_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VROverlayView_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code VROverlayView_t} instance allocated on the thread-local {@link MemoryStack}. */
    public static VROverlayView_t mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code VROverlayView_t} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VROverlayView_t callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code VROverlayView_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayView_t mallocStack(MemoryStack stack) {
        return wrap(VROverlayView_t.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code VROverlayView_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VROverlayView_t callocStack(MemoryStack stack) {
        return wrap(VROverlayView_t.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VROverlayView_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VROverlayView_t.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #overlayHandle}. */
    public static long noverlayHandle(long struct) { return UNSAFE.getLong(null, struct + VROverlayView_t.OVERLAYHANDLE); }
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
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VROverlayView_t#SIZEOF}, and its mark will be undefined.
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
        protected VROverlayView_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code overlayHandle} field. */
        @NativeType("VROverlayHandle_t")
        public long overlayHandle() { return VROverlayView_t.noverlayHandle(address()); }
        /** Returns a {@link Texture} view of the {@code texture} field. */
        @NativeType("Texture_t")
        public Texture texture() { return VROverlayView_t.ntexture(address()); }
        /** Returns a {@link VRTextureBounds} view of the {@code textureBounds} field. */
        @NativeType("VRTextureBounds_t")
        public VRTextureBounds textureBounds() { return VROverlayView_t.ntextureBounds(address()); }

    }

}