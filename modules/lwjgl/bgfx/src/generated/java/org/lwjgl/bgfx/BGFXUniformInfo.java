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

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Uniform info.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code name[256]} &ndash; uniform name</li>
 * <li>{@code type} &ndash; uniform type</li>
 * <li>{@code num} &ndash; number of elements in array</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct bgfx_uniform_info_t {
 *     char name[256];
 *     bgfx_uniform_type_t type;
 *     uint16_t num;
 * }</code></pre>
 */
@NativeType("struct bgfx_uniform_info_t")
public class BGFXUniformInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        TYPE,
        NUM;

    static {
        Layout layout = __struct(
            __array(1, 256),
            __member(4),
            __member(2)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        NUM = layout.offsetof(2);
    }

    /**
     * Creates a {@code BGFXUniformInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public BGFXUniformInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[256]")
    public ByteBuffer name() { return nname(address()); }
    /** Decodes the null-terminated string stored in the {@code name} field. */
    @NativeType("char[256]")
    public String nameString() { return nnameString(address()); }
    /** Returns the value of the {@code type} field. */
    @NativeType("bgfx_uniform_type_t")
    public int type() { return ntype(address()); }
    /** Returns the value of the {@code num} field. */
    @NativeType("uint16_t")
    public short num() { return nnum(address()); }

    /** Copies the specified encoded string to the {@code name} field. */
    public BGFXUniformInfo name(@NativeType("char[256]") ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the specified value to the {@code type} field. */
    public BGFXUniformInfo type(@NativeType("bgfx_uniform_type_t") int value) { ntype(address(), value); return this; }
    /** Sets the specified value to the {@code num} field. */
    public BGFXUniformInfo num(@NativeType("uint16_t") short value) { nnum(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public BGFXUniformInfo set(
        ByteBuffer name,
        int type,
        short num
    ) {
        name(name);
        type(type);
        num(num);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public BGFXUniformInfo set(BGFXUniformInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code BGFXUniformInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static BGFXUniformInfo malloc() {
        return wrap(BGFXUniformInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code BGFXUniformInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static BGFXUniformInfo calloc() {
        return wrap(BGFXUniformInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code BGFXUniformInfo} instance allocated with {@link BufferUtils}. */
    public static BGFXUniformInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(BGFXUniformInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code BGFXUniformInfo} instance for the specified memory address. */
    public static BGFXUniformInfo create(long address) {
        return wrap(BGFXUniformInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXUniformInfo createSafe(long address) {
        return address == NULL ? null : wrap(BGFXUniformInfo.class, address);
    }

    /**
     * Returns a new {@link BGFXUniformInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXUniformInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link BGFXUniformInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXUniformInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXUniformInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXUniformInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link BGFXUniformInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static BGFXUniformInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static BGFXUniformInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code BGFXUniformInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static BGFXUniformInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code BGFXUniformInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static BGFXUniformInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code BGFXUniformInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXUniformInfo mallocStack(MemoryStack stack) {
        return wrap(BGFXUniformInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code BGFXUniformInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static BGFXUniformInfo callocStack(MemoryStack stack) {
        return wrap(BGFXUniformInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link BGFXUniformInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXUniformInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXUniformInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static BGFXUniformInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link BGFXUniformInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXUniformInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link BGFXUniformInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static BGFXUniformInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + BGFXUniformInfo.NAME, 256); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(struct + BGFXUniformInfo.NAME); }
    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + BGFXUniformInfo.TYPE); }
    /** Unsafe version of {@link #num}. */
    public static short nnum(long struct) { return UNSAFE.getShort(null, struct + BGFXUniformInfo.NUM); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 256);
        }
        memCopy(memAddress(value), struct + BGFXUniformInfo.NAME, value.remaining());
    }
    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + BGFXUniformInfo.TYPE, value); }
    /** Unsafe version of {@link #num(short) num}. */
    public static void nnum(long struct, short value) { UNSAFE.putShort(null, struct + BGFXUniformInfo.NUM, value); }

    // -----------------------------------

    /** An array of {@link BGFXUniformInfo} structs. */
    public static class Buffer extends StructBuffer<BGFXUniformInfo, Buffer> implements NativeResource {

        private static final BGFXUniformInfo ELEMENT_FACTORY = BGFXUniformInfo.create(-1L);

        /**
         * Creates a new {@code BGFXUniformInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link BGFXUniformInfo#SIZEOF}, and its mark will be undefined.
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
        protected BGFXUniformInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[256]")
        public ByteBuffer name() { return BGFXUniformInfo.nname(address()); }
        /** Decodes the null-terminated string stored in the {@code name} field. */
        @NativeType("char[256]")
        public String nameString() { return BGFXUniformInfo.nnameString(address()); }
        /** Returns the value of the {@code type} field. */
        @NativeType("bgfx_uniform_type_t")
        public int type() { return BGFXUniformInfo.ntype(address()); }
        /** Returns the value of the {@code num} field. */
        @NativeType("uint16_t")
        public short num() { return BGFXUniformInfo.nnum(address()); }

        /** Copies the specified encoded string to the {@code name} field. */
        public BGFXUniformInfo.Buffer name(@NativeType("char[256]") ByteBuffer value) { BGFXUniformInfo.nname(address(), value); return this; }
        /** Sets the specified value to the {@code type} field. */
        public BGFXUniformInfo.Buffer type(@NativeType("bgfx_uniform_type_t") int value) { BGFXUniformInfo.ntype(address(), value); return this; }
        /** Sets the specified value to the {@code num} field. */
        public BGFXUniformInfo.Buffer num(@NativeType("uint16_t") short value) { BGFXUniformInfo.nnum(address(), value); return this; }

    }

}