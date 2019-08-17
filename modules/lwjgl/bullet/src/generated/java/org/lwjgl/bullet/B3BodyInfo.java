/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code m_bodyName[1024]} &ndash; for {@code btRigidBody}, it does not have a base, but can still have a body name from {@code urdf}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct b3BodyInfo {
 *     char m_baseName[1024];
 *     char m_bodyName[1024];
 * }</code></pre>
 */
@NativeType("struct b3BodyInfo")
public class B3BodyInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_BASENAME,
        M_BODYNAME;

    static {
        Layout layout = __struct(
            __array(1, 1024),
            __array(1, 1024)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_BASENAME = layout.offsetof(0);
        M_BODYNAME = layout.offsetof(1);
    }

    /**
     * Creates a {@code B3BodyInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3BodyInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code m_baseName} field. */
    @NativeType("char[1024]")
    public ByteBuffer m_baseName() { return nm_baseName(address()); }
    /** Decodes the null-terminated string stored in the {@code m_baseName} field. */
    @NativeType("char[1024]")
    public String m_baseNameString() { return nm_baseNameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code m_bodyName} field. */
    @NativeType("char[1024]")
    public ByteBuffer m_bodyName() { return nm_bodyName(address()); }
    /** Decodes the null-terminated string stored in the {@code m_bodyName} field. */
    @NativeType("char[1024]")
    public String m_bodyNameString() { return nm_bodyNameString(address()); }

    /** Copies the specified encoded string to the {@code m_baseName} field. */
    public B3BodyInfo m_baseName(@NativeType("char[1024]") ByteBuffer value) { nm_baseName(address(), value); return this; }
    /** Copies the specified encoded string to the {@code m_bodyName} field. */
    public B3BodyInfo m_bodyName(@NativeType("char[1024]") ByteBuffer value) { nm_bodyName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3BodyInfo set(
        ByteBuffer m_baseName,
        ByteBuffer m_bodyName
    ) {
        m_baseName(m_baseName);
        m_bodyName(m_bodyName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3BodyInfo set(B3BodyInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3BodyInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3BodyInfo malloc() {
        return wrap(B3BodyInfo.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3BodyInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3BodyInfo calloc() {
        return wrap(B3BodyInfo.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3BodyInfo} instance allocated with {@link BufferUtils}. */
    public static B3BodyInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3BodyInfo.class, memAddress(container), container);
    }

    /** Returns a new {@code B3BodyInfo} instance for the specified memory address. */
    public static B3BodyInfo create(long address) {
        return wrap(B3BodyInfo.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3BodyInfo createSafe(long address) {
        return address == NULL ? null : wrap(B3BodyInfo.class, address);
    }

    /**
     * Returns a new {@link B3BodyInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3BodyInfo.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3BodyInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3BodyInfo.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3BodyInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3BodyInfo.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3BodyInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3BodyInfo.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3BodyInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3BodyInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3BodyInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3BodyInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3BodyInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3BodyInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3BodyInfo mallocStack(MemoryStack stack) {
        return wrap(B3BodyInfo.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3BodyInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3BodyInfo callocStack(MemoryStack stack) {
        return wrap(B3BodyInfo.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3BodyInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3BodyInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3BodyInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3BodyInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3BodyInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3BodyInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3BodyInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3BodyInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_baseName}. */
    public static ByteBuffer nm_baseName(long struct) { return memByteBuffer(struct + B3BodyInfo.M_BASENAME, 1024); }
    /** Unsafe version of {@link #m_baseNameString}. */
    public static String nm_baseNameString(long struct) { return memASCII(struct + B3BodyInfo.M_BASENAME); }
    /** Unsafe version of {@link #m_bodyName}. */
    public static ByteBuffer nm_bodyName(long struct) { return memByteBuffer(struct + B3BodyInfo.M_BODYNAME, 1024); }
    /** Unsafe version of {@link #m_bodyNameString}. */
    public static String nm_bodyNameString(long struct) { return memASCII(struct + B3BodyInfo.M_BODYNAME); }

    /** Unsafe version of {@link #m_baseName(ByteBuffer) m_baseName}. */
    public static void nm_baseName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 1024);
        }
        memCopy(memAddress(value), struct + B3BodyInfo.M_BASENAME, value.remaining());
    }
    /** Unsafe version of {@link #m_bodyName(ByteBuffer) m_bodyName}. */
    public static void nm_bodyName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 1024);
        }
        memCopy(memAddress(value), struct + B3BodyInfo.M_BODYNAME, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link B3BodyInfo} structs. */
    public static class Buffer extends StructBuffer<B3BodyInfo, Buffer> implements NativeResource {

        private static final B3BodyInfo ELEMENT_FACTORY = B3BodyInfo.create(-1L);

        /**
         * Creates a new {@code B3BodyInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3BodyInfo#SIZEOF}, and its mark will be undefined.
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
        protected B3BodyInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns a {@link ByteBuffer} view of the {@code m_baseName} field. */
        @NativeType("char[1024]")
        public ByteBuffer m_baseName() { return B3BodyInfo.nm_baseName(address()); }
        /** Decodes the null-terminated string stored in the {@code m_baseName} field. */
        @NativeType("char[1024]")
        public String m_baseNameString() { return B3BodyInfo.nm_baseNameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code m_bodyName} field. */
        @NativeType("char[1024]")
        public ByteBuffer m_bodyName() { return B3BodyInfo.nm_bodyName(address()); }
        /** Decodes the null-terminated string stored in the {@code m_bodyName} field. */
        @NativeType("char[1024]")
        public String m_bodyNameString() { return B3BodyInfo.nm_bodyNameString(address()); }

        /** Copies the specified encoded string to the {@code m_baseName} field. */
        public B3BodyInfo.Buffer m_baseName(@NativeType("char[1024]") ByteBuffer value) { B3BodyInfo.nm_baseName(address(), value); return this; }
        /** Copies the specified encoded string to the {@code m_bodyName} field. */
        public B3BodyInfo.Buffer m_bodyName(@NativeType("char[1024]") ByteBuffer value) { B3BodyInfo.nm_bodyName(address(), value); return this; }

    }

}