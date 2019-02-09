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
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct b3RaycastInformation {
 *     int m_numRayHits;
 *     {@link B3RayHitInfo struct b3RayHitInfo} * m_rayHits;
 * }</code></pre>
 */
@NativeType("struct b3RaycastInformation")
public class B3RaycastInformation extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NUMRAYHITS,
        M_RAYHITS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NUMRAYHITS = layout.offsetof(0);
        M_RAYHITS = layout.offsetof(1);
    }

    /**
     * Creates a {@code B3RaycastInformation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3RaycastInformation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_numRayHits} field. */
    public int m_numRayHits() { return nm_numRayHits(address()); }
    /** Returns a {@link B3RayHitInfo.Buffer} view of the struct array pointed to by the {@code m_rayHits} field. */
    @NativeType("struct b3RayHitInfo *")
    public B3RayHitInfo.Buffer m_rayHits() { return nm_rayHits(address()); }

    /** Sets the address of the specified {@link B3RayHitInfo.Buffer} to the {@code m_rayHits} field. */
    public B3RaycastInformation m_rayHits(@NativeType("struct b3RayHitInfo *") B3RayHitInfo.Buffer value) { nm_rayHits(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3RaycastInformation set(B3RaycastInformation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3RaycastInformation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3RaycastInformation malloc() {
        return wrap(B3RaycastInformation.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3RaycastInformation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3RaycastInformation calloc() {
        return wrap(B3RaycastInformation.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3RaycastInformation} instance allocated with {@link BufferUtils}. */
    public static B3RaycastInformation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3RaycastInformation.class, memAddress(container), container);
    }

    /** Returns a new {@code B3RaycastInformation} instance for the specified memory address. */
    public static B3RaycastInformation create(long address) {
        return wrap(B3RaycastInformation.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3RaycastInformation createSafe(long address) {
        return address == NULL ? null : wrap(B3RaycastInformation.class, address);
    }

    /**
     * Returns a new {@link B3RaycastInformation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3RaycastInformation.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3RaycastInformation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3RaycastInformation.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3RaycastInformation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3RaycastInformation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3RaycastInformation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3RaycastInformation.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3RaycastInformation.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3RaycastInformation} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3RaycastInformation mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3RaycastInformation} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3RaycastInformation callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3RaycastInformation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3RaycastInformation mallocStack(MemoryStack stack) {
        return wrap(B3RaycastInformation.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3RaycastInformation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3RaycastInformation callocStack(MemoryStack stack) {
        return wrap(B3RaycastInformation.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3RaycastInformation.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3RaycastInformation.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3RaycastInformation.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3RaycastInformation.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3RaycastInformation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3RaycastInformation.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3RaycastInformation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3RaycastInformation.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_numRayHits}. */
    public static int nm_numRayHits(long struct) { return UNSAFE.getInt(null, struct + B3RaycastInformation.M_NUMRAYHITS); }
    /** Unsafe version of {@link #m_rayHits}. */
    public static B3RayHitInfo.Buffer nm_rayHits(long struct) { return B3RayHitInfo.create(memGetAddress(struct + B3RaycastInformation.M_RAYHITS), nm_numRayHits(struct)); }

    /** Sets the specified value to the {@code m_numRayHits} field of the specified {@code struct}. */
    public static void nm_numRayHits(long struct, int value) { UNSAFE.putInt(null, struct + B3RaycastInformation.M_NUMRAYHITS, value); }
    /** Unsafe version of {@link #m_rayHits(B3RayHitInfo.Buffer) m_rayHits}. */
    public static void nm_rayHits(long struct, B3RayHitInfo.Buffer value) { memPutAddress(struct + B3RaycastInformation.M_RAYHITS, value.address()); nm_numRayHits(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + B3RaycastInformation.M_RAYHITS));
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

    /** An array of {@link B3RaycastInformation} structs. */
    public static class Buffer extends StructBuffer<B3RaycastInformation, Buffer> implements NativeResource {

        private static final B3RaycastInformation ELEMENT_FACTORY = B3RaycastInformation.create(-1L);

        /**
         * Creates a new {@code B3RaycastInformation.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3RaycastInformation#SIZEOF}, and its mark will be undefined.
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
        protected B3RaycastInformation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_numRayHits} field. */
        public int m_numRayHits() { return B3RaycastInformation.nm_numRayHits(address()); }
        /** Returns a {@link B3RayHitInfo.Buffer} view of the struct array pointed to by the {@code m_rayHits} field. */
        @NativeType("struct b3RayHitInfo *")
        public B3RayHitInfo.Buffer m_rayHits() { return B3RaycastInformation.nm_rayHits(address()); }

        /** Sets the address of the specified {@link B3RayHitInfo.Buffer} to the {@code m_rayHits} field. */
        public B3RaycastInformation.Buffer m_rayHits(@NativeType("struct b3RayHitInfo *") B3RayHitInfo.Buffer value) { B3RaycastInformation.nm_rayHits(address(), value); return this; }

    }

}