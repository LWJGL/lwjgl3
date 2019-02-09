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
 * struct b3CollisionShapeInformation {
 *     int m_numCollisionShapes;
 *     {@link B3CollisionShapeData struct b3CollisionShapeData} * m_collisionShapeData;
 * }</code></pre>
 */
@NativeType("struct b3CollisionShapeInformation")
public class B3CollisionShapeInformation extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_NUMCOLLISIONSHAPES,
        M_COLLISIONSHAPEDATA;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_NUMCOLLISIONSHAPES = layout.offsetof(0);
        M_COLLISIONSHAPEDATA = layout.offsetof(1);
    }

    /**
     * Creates a {@code B3CollisionShapeInformation} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3CollisionShapeInformation(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_numCollisionShapes} field. */
    public int m_numCollisionShapes() { return nm_numCollisionShapes(address()); }
    /** Returns a {@link B3CollisionShapeData.Buffer} view of the struct array pointed to by the {@code m_collisionShapeData} field. */
    @NativeType("struct b3CollisionShapeData *")
    public B3CollisionShapeData.Buffer m_collisionShapeData() { return nm_collisionShapeData(address()); }

    /** Sets the address of the specified {@link B3CollisionShapeData.Buffer} to the {@code m_collisionShapeData} field. */
    public B3CollisionShapeInformation m_collisionShapeData(@NativeType("struct b3CollisionShapeData *") B3CollisionShapeData.Buffer value) { nm_collisionShapeData(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3CollisionShapeInformation set(B3CollisionShapeInformation src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3CollisionShapeInformation} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3CollisionShapeInformation malloc() {
        return wrap(B3CollisionShapeInformation.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3CollisionShapeInformation} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3CollisionShapeInformation calloc() {
        return wrap(B3CollisionShapeInformation.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3CollisionShapeInformation} instance allocated with {@link BufferUtils}. */
    public static B3CollisionShapeInformation create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3CollisionShapeInformation.class, memAddress(container), container);
    }

    /** Returns a new {@code B3CollisionShapeInformation} instance for the specified memory address. */
    public static B3CollisionShapeInformation create(long address) {
        return wrap(B3CollisionShapeInformation.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3CollisionShapeInformation createSafe(long address) {
        return address == NULL ? null : wrap(B3CollisionShapeInformation.class, address);
    }

    /**
     * Returns a new {@link B3CollisionShapeInformation.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeInformation.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3CollisionShapeInformation.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeInformation.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3CollisionShapeInformation.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeInformation.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3CollisionShapeInformation.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeInformation.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3CollisionShapeInformation.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3CollisionShapeInformation} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3CollisionShapeInformation mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3CollisionShapeInformation} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3CollisionShapeInformation callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3CollisionShapeInformation} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3CollisionShapeInformation mallocStack(MemoryStack stack) {
        return wrap(B3CollisionShapeInformation.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3CollisionShapeInformation} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3CollisionShapeInformation callocStack(MemoryStack stack) {
        return wrap(B3CollisionShapeInformation.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3CollisionShapeInformation.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeInformation.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3CollisionShapeInformation.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeInformation.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3CollisionShapeInformation.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeInformation.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3CollisionShapeInformation.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeInformation.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_numCollisionShapes}. */
    public static int nm_numCollisionShapes(long struct) { return UNSAFE.getInt(null, struct + B3CollisionShapeInformation.M_NUMCOLLISIONSHAPES); }
    /** Unsafe version of {@link #m_collisionShapeData}. */
    public static B3CollisionShapeData.Buffer nm_collisionShapeData(long struct) { return B3CollisionShapeData.create(memGetAddress(struct + B3CollisionShapeInformation.M_COLLISIONSHAPEDATA), nm_numCollisionShapes(struct)); }

    /** Sets the specified value to the {@code m_numCollisionShapes} field of the specified {@code struct}. */
    public static void nm_numCollisionShapes(long struct, int value) { UNSAFE.putInt(null, struct + B3CollisionShapeInformation.M_NUMCOLLISIONSHAPES, value); }
    /** Unsafe version of {@link #m_collisionShapeData(B3CollisionShapeData.Buffer) m_collisionShapeData}. */
    public static void nm_collisionShapeData(long struct, B3CollisionShapeData.Buffer value) { memPutAddress(struct + B3CollisionShapeInformation.M_COLLISIONSHAPEDATA, value.address()); nm_numCollisionShapes(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + B3CollisionShapeInformation.M_COLLISIONSHAPEDATA));
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

    /** An array of {@link B3CollisionShapeInformation} structs. */
    public static class Buffer extends StructBuffer<B3CollisionShapeInformation, Buffer> implements NativeResource {

        private static final B3CollisionShapeInformation ELEMENT_FACTORY = B3CollisionShapeInformation.create(-1L);

        /**
         * Creates a new {@code B3CollisionShapeInformation.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3CollisionShapeInformation#SIZEOF}, and its mark will be undefined.
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
        protected B3CollisionShapeInformation getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_numCollisionShapes} field. */
        public int m_numCollisionShapes() { return B3CollisionShapeInformation.nm_numCollisionShapes(address()); }
        /** Returns a {@link B3CollisionShapeData.Buffer} view of the struct array pointed to by the {@code m_collisionShapeData} field. */
        @NativeType("struct b3CollisionShapeData *")
        public B3CollisionShapeData.Buffer m_collisionShapeData() { return B3CollisionShapeInformation.nm_collisionShapeData(address()); }

        /** Sets the address of the specified {@link B3CollisionShapeData.Buffer} to the {@code m_collisionShapeData} field. */
        public B3CollisionShapeInformation.Buffer m_collisionShapeData(@NativeType("struct b3CollisionShapeData *") B3CollisionShapeData.Buffer value) { B3CollisionShapeInformation.nm_collisionShapeData(address(), value); return this; }

    }

}