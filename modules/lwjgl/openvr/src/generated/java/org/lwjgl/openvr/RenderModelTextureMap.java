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
 * A texture map for use on a render model.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct RenderModel_TextureMap_t {
 *     uint16_t unWidth;
 *     uint16_t {@link #unHeight};
 *     uint8_t const * {@link #rubTextureMapData};
 *     EVRRenderModelTextureFormat {@link #format};
 * }</code></pre>
 */
@NativeType("struct RenderModel_TextureMap_t")
public class RenderModelTextureMap extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        UNWIDTH,
        UNHEIGHT,
        RUBTEXTUREMAPDATA,
        FORMAT;

    static {
        Layout layout = __struct(
            Platform.get() == Platform.LINUX || Platform.get() == Platform.MACOSX ? 4 : DEFAULT_PACK_ALIGNMENT, DEFAULT_ALIGN_AS,
            __member(2),
            __member(2),
            __member(POINTER_SIZE),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        UNWIDTH = layout.offsetof(0);
        UNHEIGHT = layout.offsetof(1);
        RUBTEXTUREMAPDATA = layout.offsetof(2);
        FORMAT = layout.offsetof(3);
    }

    /**
     * Creates a {@code RenderModelTextureMap} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public RenderModelTextureMap(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code unWidth} field. */
    @NativeType("uint16_t")
    public short unWidth() { return nunWidth(address()); }
    /** width and height of the texture map in pixels */
    @NativeType("uint16_t")
    public short unHeight() { return nunHeight(address()); }
    /**
     * @param capacity the number of elements in the returned buffer
     *
     * @return Map texture data.
     */
    @NativeType("uint8_t const *")
    public ByteBuffer rubTextureMapData(int capacity) { return nrubTextureMapData(address(), capacity); }
    /** one of:<br><table><tr><td>{@link VR#EVRRenderModelTextureFormat_VRRenderModelTextureFormat_RGBA8_SRGB}</td></tr><tr><td>{@link VR#EVRRenderModelTextureFormat_VRRenderModelTextureFormat_BC2}</td></tr><tr><td>{@link VR#EVRRenderModelTextureFormat_VRRenderModelTextureFormat_BC4}</td></tr><tr><td>{@link VR#EVRRenderModelTextureFormat_VRRenderModelTextureFormat_BC7}</td></tr><tr><td>{@link VR#EVRRenderModelTextureFormat_VRRenderModelTextureFormat_BC7_SRGB}</td></tr></table> */
    @NativeType("EVRRenderModelTextureFormat")
    public int format() { return nformat(address()); }

    // -----------------------------------

    /** Returns a new {@code RenderModelTextureMap} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static RenderModelTextureMap malloc() {
        return wrap(RenderModelTextureMap.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code RenderModelTextureMap} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static RenderModelTextureMap calloc() {
        return wrap(RenderModelTextureMap.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code RenderModelTextureMap} instance allocated with {@link BufferUtils}. */
    public static RenderModelTextureMap create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(RenderModelTextureMap.class, memAddress(container), container);
    }

    /** Returns a new {@code RenderModelTextureMap} instance for the specified memory address. */
    public static RenderModelTextureMap create(long address) {
        return wrap(RenderModelTextureMap.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModelTextureMap createSafe(long address) {
        return address == NULL ? null : wrap(RenderModelTextureMap.class, address);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link RenderModelTextureMap.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static RenderModelTextureMap.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code RenderModelTextureMap} instance allocated on the thread-local {@link MemoryStack}. */
    public static RenderModelTextureMap mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code RenderModelTextureMap} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static RenderModelTextureMap callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code RenderModelTextureMap} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModelTextureMap mallocStack(MemoryStack stack) {
        return wrap(RenderModelTextureMap.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code RenderModelTextureMap} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static RenderModelTextureMap callocStack(MemoryStack stack) {
        return wrap(RenderModelTextureMap.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link RenderModelTextureMap.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static RenderModelTextureMap.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #unWidth}. */
    public static short nunWidth(long struct) { return UNSAFE.getShort(null, struct + RenderModelTextureMap.UNWIDTH); }
    /** Unsafe version of {@link #unHeight}. */
    public static short nunHeight(long struct) { return UNSAFE.getShort(null, struct + RenderModelTextureMap.UNHEIGHT); }
    /** Unsafe version of {@link #rubTextureMapData(int) rubTextureMapData}. */
    public static ByteBuffer nrubTextureMapData(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + RenderModelTextureMap.RUBTEXTUREMAPDATA), capacity); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return UNSAFE.getInt(null, struct + RenderModelTextureMap.FORMAT); }

    // -----------------------------------

    /** An array of {@link RenderModelTextureMap} structs. */
    public static class Buffer extends StructBuffer<RenderModelTextureMap, Buffer> implements NativeResource {

        private static final RenderModelTextureMap ELEMENT_FACTORY = RenderModelTextureMap.create(-1L);

        /**
         * Creates a new {@code RenderModelTextureMap.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link RenderModelTextureMap#SIZEOF}, and its mark will be undefined.
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
        protected RenderModelTextureMap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code unWidth} field. */
        @NativeType("uint16_t")
        public short unWidth() { return RenderModelTextureMap.nunWidth(address()); }
        /** @return the value of the {@link RenderModelTextureMap#unHeight} field. */
        @NativeType("uint16_t")
        public short unHeight() { return RenderModelTextureMap.nunHeight(address()); }
        /**
         * @return a {@link ByteBuffer} view of the data pointed to by the {@link RenderModelTextureMap#rubTextureMapData} field.
         *
         * @param capacity the number of elements in the returned buffer
         */
        @NativeType("uint8_t const *")
        public ByteBuffer rubTextureMapData(int capacity) { return RenderModelTextureMap.nrubTextureMapData(address(), capacity); }
        /** @return the value of the {@link RenderModelTextureMap#format} field. */
        @NativeType("EVRRenderModelTextureFormat")
        public int format() { return RenderModelTextureMap.nformat(address()); }

    }

}