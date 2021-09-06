/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

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
 * struct EXRVersion {
 *     int {@link #version};
 *     int {@link #tiled};
 *     int {@link #long_name};
 *     int {@link #non_image};
 *     int {@link #multipart};
 * }</code></pre>
 */
public class EXRVersion extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        VERSION,
        TILED,
        LONG_NAME,
        NON_IMAGE,
        MULTIPART;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        VERSION = layout.offsetof(0);
        TILED = layout.offsetof(1);
        LONG_NAME = layout.offsetof(2);
        NON_IMAGE = layout.offsetof(3);
        MULTIPART = layout.offsetof(4);
    }

    /**
     * Creates a {@code EXRVersion} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EXRVersion(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** this must be 2 */
    public int version() { return nversion(address()); }
    /** tile format image; not zero for only a single-part "normal" tiled file (according to spec.) */
    @NativeType("int")
    public boolean tiled() { return ntiled(address()) != 0; }
    /** long name attribute */
    @NativeType("int")
    public boolean long_name() { return nlong_name(address()) != 0; }
    /** deep image(EXR 2.0); for a multi-part file, indicates that at least one part is of type {@code deep*} (according to spec.) */
    @NativeType("int")
    public boolean non_image() { return nnon_image(address()) != 0; }
    /** multi-part(EXR 2.0) */
    @NativeType("int")
    public boolean multipart() { return nmultipart(address()) != 0; }

    /** Sets the specified value to the {@link #version} field. */
    public EXRVersion version(int value) { nversion(address(), value); return this; }
    /** Sets the specified value to the {@link #tiled} field. */
    public EXRVersion tiled(@NativeType("int") boolean value) { ntiled(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #long_name} field. */
    public EXRVersion long_name(@NativeType("int") boolean value) { nlong_name(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #non_image} field. */
    public EXRVersion non_image(@NativeType("int") boolean value) { nnon_image(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@link #multipart} field. */
    public EXRVersion multipart(@NativeType("int") boolean value) { nmultipart(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public EXRVersion set(
        int version,
        boolean tiled,
        boolean long_name,
        boolean non_image,
        boolean multipart
    ) {
        version(version);
        tiled(tiled);
        long_name(long_name);
        non_image(non_image);
        multipart(multipart);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public EXRVersion set(EXRVersion src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code EXRVersion} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EXRVersion malloc() {
        return wrap(EXRVersion.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code EXRVersion} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EXRVersion calloc() {
        return wrap(EXRVersion.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code EXRVersion} instance allocated with {@link BufferUtils}. */
    public static EXRVersion create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(EXRVersion.class, memAddress(container), container);
    }

    /** Returns a new {@code EXRVersion} instance for the specified memory address. */
    public static EXRVersion create(long address) {
        return wrap(EXRVersion.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRVersion createSafe(long address) {
        return address == NULL ? null : wrap(EXRVersion.class, address);
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRVersion.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static EXRVersion.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static EXRVersion.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link EXRVersion.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static EXRVersion.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static EXRVersion.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static EXRVersion mallocStack() { return malloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static EXRVersion callocStack() { return calloc(stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(MemoryStack)} instead. */
    @Deprecated public static EXRVersion mallocStack(MemoryStack stack) { return malloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(MemoryStack)} instead. */
    @Deprecated public static EXRVersion callocStack(MemoryStack stack) { return calloc(stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRVersion.Buffer mallocStack(int capacity) { return malloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRVersion.Buffer callocStack(int capacity) { return calloc(capacity, stackGet()); }
    /** Deprecated for removal in 3.4.0. Use {@link #malloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRVersion.Buffer mallocStack(int capacity, MemoryStack stack) { return malloc(capacity, stack); }
    /** Deprecated for removal in 3.4.0. Use {@link #calloc(int, MemoryStack)} instead. */
    @Deprecated public static EXRVersion.Buffer callocStack(int capacity, MemoryStack stack) { return calloc(capacity, stack); }

    /**
     * Returns a new {@code EXRVersion} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRVersion malloc(MemoryStack stack) {
        return wrap(EXRVersion.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code EXRVersion} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRVersion calloc(MemoryStack stack) {
        return wrap(EXRVersion.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRVersion.Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRVersion.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static EXRVersion.Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #version}. */
    public static int nversion(long struct) { return UNSAFE.getInt(null, struct + EXRVersion.VERSION); }
    /** Unsafe version of {@link #tiled}. */
    public static int ntiled(long struct) { return UNSAFE.getInt(null, struct + EXRVersion.TILED); }
    /** Unsafe version of {@link #long_name}. */
    public static int nlong_name(long struct) { return UNSAFE.getInt(null, struct + EXRVersion.LONG_NAME); }
    /** Unsafe version of {@link #non_image}. */
    public static int nnon_image(long struct) { return UNSAFE.getInt(null, struct + EXRVersion.NON_IMAGE); }
    /** Unsafe version of {@link #multipart}. */
    public static int nmultipart(long struct) { return UNSAFE.getInt(null, struct + EXRVersion.MULTIPART); }

    /** Unsafe version of {@link #version(int) version}. */
    public static void nversion(long struct, int value) { UNSAFE.putInt(null, struct + EXRVersion.VERSION, value); }
    /** Unsafe version of {@link #tiled(boolean) tiled}. */
    public static void ntiled(long struct, int value) { UNSAFE.putInt(null, struct + EXRVersion.TILED, value); }
    /** Unsafe version of {@link #long_name(boolean) long_name}. */
    public static void nlong_name(long struct, int value) { UNSAFE.putInt(null, struct + EXRVersion.LONG_NAME, value); }
    /** Unsafe version of {@link #non_image(boolean) non_image}. */
    public static void nnon_image(long struct, int value) { UNSAFE.putInt(null, struct + EXRVersion.NON_IMAGE, value); }
    /** Unsafe version of {@link #multipart(boolean) multipart}. */
    public static void nmultipart(long struct, int value) { UNSAFE.putInt(null, struct + EXRVersion.MULTIPART, value); }

    // -----------------------------------

    /** An array of {@link EXRVersion} structs. */
    public static class Buffer extends StructBuffer<EXRVersion, Buffer> implements NativeResource {

        private static final EXRVersion ELEMENT_FACTORY = EXRVersion.create(-1L);

        /**
         * Creates a new {@code EXRVersion.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EXRVersion#SIZEOF}, and its mark will be undefined.
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
        protected EXRVersion getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@link EXRVersion#version} field. */
        public int version() { return EXRVersion.nversion(address()); }
        /** @return the value of the {@link EXRVersion#tiled} field. */
        @NativeType("int")
        public boolean tiled() { return EXRVersion.ntiled(address()) != 0; }
        /** @return the value of the {@link EXRVersion#long_name} field. */
        @NativeType("int")
        public boolean long_name() { return EXRVersion.nlong_name(address()) != 0; }
        /** @return the value of the {@link EXRVersion#non_image} field. */
        @NativeType("int")
        public boolean non_image() { return EXRVersion.nnon_image(address()) != 0; }
        /** @return the value of the {@link EXRVersion#multipart} field. */
        @NativeType("int")
        public boolean multipart() { return EXRVersion.nmultipart(address()) != 0; }

        /** Sets the specified value to the {@link EXRVersion#version} field. */
        public EXRVersion.Buffer version(int value) { EXRVersion.nversion(address(), value); return this; }
        /** Sets the specified value to the {@link EXRVersion#tiled} field. */
        public EXRVersion.Buffer tiled(@NativeType("int") boolean value) { EXRVersion.ntiled(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link EXRVersion#long_name} field. */
        public EXRVersion.Buffer long_name(@NativeType("int") boolean value) { EXRVersion.nlong_name(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link EXRVersion#non_image} field. */
        public EXRVersion.Buffer non_image(@NativeType("int") boolean value) { EXRVersion.nnon_image(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@link EXRVersion#multipart} field. */
        public EXRVersion.Buffer multipart(@NativeType("int") boolean value) { EXRVersion.nmultipart(address(), value ? 1 : 0); return this; }

    }

}