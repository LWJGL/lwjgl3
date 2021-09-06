/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Frame buffer texture attachment info.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_attachment_t {
 *     bgfx_access_t {@link #access};
 *     bgfx_texture_handle_t {@link #handle};
 *     uint16_t {@link #mip};
 *     uint16_t {@link #layer};
 *     uint16_t {@link #numLayers};
 *     uint8_t {@link #resolve};
 * }</code></pre>
 */
@NativeType("struct bgfx_attachment_t")
public class BGFXAttachment extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ACCESS,
        HANDLE,
        MIP,
        LAYER,
        NUMLAYERS,
        RESOLVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(2),
            __member(2),
            __member(2),
            __member(2),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ACCESS = layout.offsetof(0);
        HANDLE = layout.offsetof(1);
        MIP = layout.offsetof(2);
        LAYER = layout.offsetof(3);
        NUMLAYERS = layout.offsetof(4);
        RESOLVE = layout.offsetof(5);
    }

    /**
     * Creates a {@code BGFXAttachment} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXAttachment(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** attachment access */
    @NativeType("bgfx_access_t")
    public int access() { return naccess(address()); }
    /** render target texture handle */
    @NativeType("bgfx_texture_handle_t")
    public short handle() { return nhandle(address()); }
    /** mip level */
    @NativeType("uint16_t")
    public short mip() { return nmip(address()); }
    /** cubemap side or depth layer/slice to use */
    @NativeType("uint16_t")
    public short layer() { return nlayer(address()); }
    /** number of texture layer/slice(s) in array to use */
    @NativeType("uint16_t")
    public short numLayers() { return nnumLayers(address()); }
    /** resolve flags. One of:<br><table><tr><td>{@link BGFX#BGFX_RESOLVE_NONE RESOLVE_NONE}</td><td>{@link BGFX#BGFX_RESOLVE_AUTO_GEN_MIPS RESOLVE_AUTO_GEN_MIPS}</td></tr></table> */
    @NativeType("uint8_t")
    public byte resolve() { return nresolve(address()); }

    /** Sets the specified value to the {@link #access} field. */
    public BGFXAttachment access(@NativeType("bgfx_access_t") int value) { naccess(address(), value); return this; }
    /** Sets the specified value to the {@link #handle} field. */
    public BGFXAttachment handle(@NativeType("bgfx_texture_handle_t") short value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@link #mip} field. */
    public BGFXAttachment mip(@NativeType("uint16_t") short value) { nmip(address(), value); return this; }
    /** Sets the specified value to the {@link #layer} field. */
    public BGFXAttachment layer(@NativeType("uint16_t") short value) { nlayer(address(), value); return this; }
    /** Sets the specified value to the {@link #numLayers} field. */
    public BGFXAttachment numLayers(@NativeType("uint16_t") short value) { nnumLayers(address(), value); return this; }
    /** Sets the specified value to the {@link #resolve} field. */
    public BGFXAttachment resolve(@NativeType("uint8_t") byte value) { nresolve(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXAttachment set(
        int access,
        short handle,
        short mip,
        short layer,
        short numLayers,
        byte resolve
    ) {
        access(access);
        handle(handle);
        mip(mip);
        layer(layer);
        numLayers(numLayers);
        resolve(resolve);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXAttachment set(BGFXAttachment src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXAttachment} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXAttachment malloc() {
        return wrap(BGFXAttachment.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXAttachment} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXAttachment calloc() {
        return wrap(BGFXAttachment.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXAttachment} instance allocated with {@link BufferUtils}. */
    public static BGFXAttachment create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXAttachment.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXAttachment} instance for the specified memory address. */
    public static BGFXAttachment create(long address) {
        return wrap(BGFXAttachment.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXAttachment createSafe(long address) {
        return address == NULL ? null : wrap(BGFXAttachment.class, address);
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BGFXAttachment.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXAttachment.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAttachment mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAttachment callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAttachment mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static BGFXAttachment callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXAttachment.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXAttachment.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXAttachment.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static BGFXAttachment.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code BGFXAttachment} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAttachment malloc(MemoryStack stack) {
        return wrap(BGFXAttachment.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXAttachment} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXAttachment calloc(MemoryStack stack) {
        return wrap(BGFXAttachment.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXAttachment.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXAttachment.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #access}. */
    public static int naccess(long struct) { return UNSAFE.getInt(null, struct + BGFXAttachment.ACCESS); }
    /** Unsafe version of {@link #handle}. */
    public static short nhandle(long struct) { return UNSAFE.getShort(null, struct + BGFXAttachment.HANDLE); }
    /** Unsafe version of {@link #mip}. */
    public static short nmip(long struct) { return UNSAFE.getShort(null, struct + BGFXAttachment.MIP); }
    /** Unsafe version of {@link #layer}. */
    public static short nlayer(long struct) { return UNSAFE.getShort(null, struct + BGFXAttachment.LAYER); }
    /** Unsafe version of {@link #numLayers}. */
    public static short nnumLayers(long struct) { return UNSAFE.getShort(null, struct + BGFXAttachment.NUMLAYERS); }
    /** Unsafe version of {@link #resolve}. */
    public static byte nresolve(long struct) { return UNSAFE.getByte(null, struct + BGFXAttachment.RESOLVE); }

    /** Unsafe version of {@link #access(int) access}. */
    public static void naccess(long struct, int value) { UNSAFE.putInt(null, struct + BGFXAttachment.ACCESS, value); }
    /** Unsafe version of {@link #handle(short) handle}. */
    public static void nhandle(long struct, short value) { UNSAFE.putShort(null, struct + BGFXAttachment.HANDLE, value); }
    /** Unsafe version of {@link #mip(short) mip}. */
    public static void nmip(long struct, short value) { UNSAFE.putShort(null, struct + BGFXAttachment.MIP, value); }
    /** Unsafe version of {@link #layer(short) layer}. */
    public static void nlayer(long struct, short value) { UNSAFE.putShort(null, struct + BGFXAttachment.LAYER, value); }
    /** Unsafe version of {@link #numLayers(short) numLayers}. */
    public static void nnumLayers(long struct, short value) { UNSAFE.putShort(null, struct + BGFXAttachment.NUMLAYERS, value); }
    /** Unsafe version of {@link #resolve(byte) resolve}. */
    public static void nresolve(long struct, byte value) { UNSAFE.putByte(null, struct + BGFXAttachment.RESOLVE, value); }

    // -----------------------------------

    /** An array of {@link BGFXAttachment} structs. */
    public static class Buffer extends StructBuffer<BGFXAttachment, Buffer> implements NativeResource {

        private static final BGFXAttachment ELEMENT_FACTORY = BGFXAttachment.create(-1L);

        /**
         * Creates a new {@code BGFXAttachment.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXAttachment#SIZEOF}, and its mark will be undefined.
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
        protected BGFXAttachment getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link BGFXAttachment#access} field. */
        @NativeType("bgfx_access_t")
        public int access() { return BGFXAttachment.naccess(address()); }
        /** @return the value of the {@link BGFXAttachment#handle} field. */
        @NativeType("bgfx_texture_handle_t")
        public short handle() { return BGFXAttachment.nhandle(address()); }
        /** @return the value of the {@link BGFXAttachment#mip} field. */
        @NativeType("uint16_t")
        public short mip() { return BGFXAttachment.nmip(address()); }
        /** @return the value of the {@link BGFXAttachment#layer} field. */
        @NativeType("uint16_t")
        public short layer() { return BGFXAttachment.nlayer(address()); }
        /** @return the value of the {@link BGFXAttachment#numLayers} field. */
        @NativeType("uint16_t")
        public short numLayers() { return BGFXAttachment.nnumLayers(address()); }
        /** @return the value of the {@link BGFXAttachment#resolve} field. */
        @NativeType("uint8_t")
        public byte resolve() { return BGFXAttachment.nresolve(address()); }

        /** Sets the specified value to the {@link BGFXAttachment#access} field. */
        public BGFXAttachment.Buffer access(@NativeType("bgfx_access_t") int value) { BGFXAttachment.naccess(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXAttachment#handle} field. */
        public BGFXAttachment.Buffer handle(@NativeType("bgfx_texture_handle_t") short value) { BGFXAttachment.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXAttachment#mip} field. */
        public BGFXAttachment.Buffer mip(@NativeType("uint16_t") short value) { BGFXAttachment.nmip(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXAttachment#layer} field. */
        public BGFXAttachment.Buffer layer(@NativeType("uint16_t") short value) { BGFXAttachment.nlayer(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXAttachment#numLayers} field. */
        public BGFXAttachment.Buffer numLayers(@NativeType("uint16_t") short value) { BGFXAttachment.nnumLayers(address(), value); return this; }
        /** Sets the specified value to the {@link BGFXAttachment#resolve} field. */
        public BGFXAttachment.Buffer resolve(@NativeType("uint8_t") byte value) { BGFXAttachment.nresolve(address(), value); return this; }

    }

}