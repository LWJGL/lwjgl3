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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct Texture_t {
 *     void * handle;
 *     ETextureType {@link #eType};
 *     EColorSpace {@link #eColorSpace};
 * }</code></pre>
 */
@NativeType("struct Texture_t")
public class Texture extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HANDLE,
        ETYPE,
        ECOLORSPACE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HANDLE = layout.offsetof(0);
        ETYPE = layout.offsetof(1);
        ECOLORSPACE = layout.offsetof(2);
    }

    /**
     * Creates a {@code Texture} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public Texture(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code handle} field. */
    @NativeType("void *")
    public long handle() { return nhandle(address()); }
    /** one of:<br><table><tr><td>{@link VR#ETextureType_TextureType_Invalid}</td><td>{@link VR#ETextureType_TextureType_DirectX}</td></tr><tr><td>{@link VR#ETextureType_TextureType_OpenGL}</td><td>{@link VR#ETextureType_TextureType_Vulkan}</td></tr><tr><td>{@link VR#ETextureType_TextureType_IOSurface}</td><td>{@link VR#ETextureType_TextureType_DirectX12}</td></tr><tr><td>{@link VR#ETextureType_TextureType_DXGISharedHandle}</td><td>{@link VR#ETextureType_TextureType_Metal}</td></tr></table> */
    @NativeType("ETextureType")
    public int eType() { return neType(address()); }
    /** one of:<br><table><tr><td>{@link VR#EColorSpace_ColorSpace_Auto}</td><td>{@link VR#EColorSpace_ColorSpace_Gamma}</td></tr><tr><td>{@link VR#EColorSpace_ColorSpace_Linear}</td></tr></table> */
    @NativeType("EColorSpace")
    public int eColorSpace() { return neColorSpace(address()); }

    /** Sets the specified value to the {@code handle} field. */
    public Texture handle(@NativeType("void *") long value) { nhandle(address(), value); return this; }
    /** Sets the specified value to the {@link #eType} field. */
    public Texture eType(@NativeType("ETextureType") int value) { neType(address(), value); return this; }
    /** Sets the specified value to the {@link #eColorSpace} field. */
    public Texture eColorSpace(@NativeType("EColorSpace") int value) { neColorSpace(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public Texture set(
        long handle,
        int eType,
        int eColorSpace
    ) {
        handle(handle);
        eType(eType);
        eColorSpace(eColorSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public Texture set(Texture src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code Texture} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static Texture malloc() {
        return wrap(Texture.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code Texture} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static Texture calloc() {
        return wrap(Texture.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code Texture} instance allocated with {@link BufferUtils}. */
    public static Texture create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(Texture.class, memAddress(container), container);
    }

    /** Returns a new {@code Texture} instance for the specified memory address. */
    public static Texture create(long address) {
        return wrap(Texture.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Texture createSafe(long address) {
        return address == NULL ? null : wrap(Texture.class, address);
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Texture.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Texture.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Texture.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link Texture.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Texture.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static Texture.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static Texture mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static Texture callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static Texture mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static Texture callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static Texture.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static Texture.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static Texture.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static Texture.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code Texture} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static Texture malloc(MemoryStack stack) {
        return wrap(Texture.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code Texture} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static Texture calloc(MemoryStack stack) {
        return wrap(Texture.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Texture.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Texture.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Texture.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #handle}. */
    public static long nhandle(long struct) { return memGetAddress(struct + Texture.HANDLE); }
    /** Unsafe version of {@link #eType}. */
    public static int neType(long struct) { return UNSAFE.getInt(null, struct + Texture.ETYPE); }
    /** Unsafe version of {@link #eColorSpace}. */
    public static int neColorSpace(long struct) { return UNSAFE.getInt(null, struct + Texture.ECOLORSPACE); }

    /** Unsafe version of {@link #handle(long) handle}. */
    public static void nhandle(long struct, long value) { memPutAddress(struct + Texture.HANDLE, check(value)); }
    /** Unsafe version of {@link #eType(int) eType}. */
    public static void neType(long struct, int value) { UNSAFE.putInt(null, struct + Texture.ETYPE, value); }
    /** Unsafe version of {@link #eColorSpace(int) eColorSpace}. */
    public static void neColorSpace(long struct, int value) { UNSAFE.putInt(null, struct + Texture.ECOLORSPACE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + Texture.HANDLE));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link Texture} structs. */
    public static class Buffer extends StructBuffer<Texture, Buffer> implements NativeResource {

        private static final Texture ELEMENT_FACTORY = Texture.create(-1L);

        /**
         * Creates a new {@code Texture.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link Texture#SIZEOF}, and its mark will be undefined.
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
        protected Texture getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code handle} field. */
        @NativeType("void *")
        public long handle() { return Texture.nhandle(address()); }
        /** @return the value of the {@link Texture#eType} field. */
        @NativeType("ETextureType")
        public int eType() { return Texture.neType(address()); }
        /** @return the value of the {@link Texture#eColorSpace} field. */
        @NativeType("EColorSpace")
        public int eColorSpace() { return Texture.neColorSpace(address()); }

        /** Sets the specified value to the {@code handle} field. */
        public Texture.Buffer handle(@NativeType("void *") long value) { Texture.nhandle(address(), value); return this; }
        /** Sets the specified value to the {@link Texture#eType} field. */
        public Texture.Buffer eType(@NativeType("ETextureType") int value) { Texture.neType(address(), value); return this; }
        /** Sets the specified value to the {@link Texture#eColorSpace} field. */
        public Texture.Buffer eColorSpace(@NativeType("EColorSpace") int value) { Texture.neColorSpace(address(), value); return this; }

    }

}