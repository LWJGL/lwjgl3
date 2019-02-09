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

import static org.lwjgl.bullet.PhysicsClient.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct b3CollisionShapeData {
 *     int m_objectUniqueId;
 *     int m_linkIndex;
 *     int m_collisionGeometryType;
 *     double m_dimensions[3];
 *     double m_localCollisionFrame[7];
 *     char m_meshAssetFileName[VISUAL_SHAPE_MAX_PATH_LEN];
 * }</code></pre>
 */
@NativeType("struct b3CollisionShapeData")
public class B3CollisionShapeData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_OBJECTUNIQUEID,
        M_LINKINDEX,
        M_COLLISIONGEOMETRYTYPE,
        M_DIMENSIONS,
        M_LOCALCOLLISIONFRAME,
        M_MESHASSETFILENAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __array(8, 3),
            __array(8, 7),
            __array(1, VISUAL_SHAPE_MAX_PATH_LEN)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_OBJECTUNIQUEID = layout.offsetof(0);
        M_LINKINDEX = layout.offsetof(1);
        M_COLLISIONGEOMETRYTYPE = layout.offsetof(2);
        M_DIMENSIONS = layout.offsetof(3);
        M_LOCALCOLLISIONFRAME = layout.offsetof(4);
        M_MESHASSETFILENAME = layout.offsetof(5);
    }

    /**
     * Creates a {@code B3CollisionShapeData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3CollisionShapeData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_objectUniqueId} field. */
    public int m_objectUniqueId() { return nm_objectUniqueId(address()); }
    /** Returns the value of the {@code m_linkIndex} field. */
    public int m_linkIndex() { return nm_linkIndex(address()); }
    /** Returns the value of the {@code m_collisionGeometryType} field. */
    public int m_collisionGeometryType() { return nm_collisionGeometryType(address()); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_dimensions} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_dimensions() { return nm_dimensions(address()); }
    /** Returns the value at the specified index of the {@code m_dimensions} field. */
    public double m_dimensions(int index) { return nm_dimensions(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_localCollisionFrame} field. */
    @NativeType("double[7]")
    public DoubleBuffer m_localCollisionFrame() { return nm_localCollisionFrame(address()); }
    /** Returns the value at the specified index of the {@code m_localCollisionFrame} field. */
    public double m_localCollisionFrame(int index) { return nm_localCollisionFrame(address(), index); }
    /** Returns a {@link ByteBuffer} view of the {@code m_meshAssetFileName} field. */
    @NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]")
    public ByteBuffer m_meshAssetFileName() { return nm_meshAssetFileName(address()); }
    /** Decodes the null-terminated string stored in the {@code m_meshAssetFileName} field. */
    @NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]")
    public String m_meshAssetFileNameString() { return nm_meshAssetFileNameString(address()); }

    /** Sets the specified value to the {@code m_objectUniqueId} field. */
    public B3CollisionShapeData m_objectUniqueId(int value) { nm_objectUniqueId(address(), value); return this; }
    /** Sets the specified value to the {@code m_linkIndex} field. */
    public B3CollisionShapeData m_linkIndex(int value) { nm_linkIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_collisionGeometryType} field. */
    public B3CollisionShapeData m_collisionGeometryType(int value) { nm_collisionGeometryType(address(), value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_dimensions} field. */
    public B3CollisionShapeData m_dimensions(@NativeType("double[3]") DoubleBuffer value) { nm_dimensions(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_dimensions} field. */
    public B3CollisionShapeData m_dimensions(int index, double value) { nm_dimensions(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_localCollisionFrame} field. */
    public B3CollisionShapeData m_localCollisionFrame(@NativeType("double[7]") DoubleBuffer value) { nm_localCollisionFrame(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_localCollisionFrame} field. */
    public B3CollisionShapeData m_localCollisionFrame(int index, double value) { nm_localCollisionFrame(address(), index, value); return this; }
    /** Copies the specified encoded string to the {@code m_meshAssetFileName} field. */
    public B3CollisionShapeData m_meshAssetFileName(@NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]") ByteBuffer value) { nm_meshAssetFileName(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3CollisionShapeData set(
        int m_objectUniqueId,
        int m_linkIndex,
        int m_collisionGeometryType,
        DoubleBuffer m_dimensions,
        DoubleBuffer m_localCollisionFrame,
        ByteBuffer m_meshAssetFileName
    ) {
        m_objectUniqueId(m_objectUniqueId);
        m_linkIndex(m_linkIndex);
        m_collisionGeometryType(m_collisionGeometryType);
        m_dimensions(m_dimensions);
        m_localCollisionFrame(m_localCollisionFrame);
        m_meshAssetFileName(m_meshAssetFileName);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3CollisionShapeData set(B3CollisionShapeData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3CollisionShapeData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3CollisionShapeData malloc() {
        return wrap(B3CollisionShapeData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3CollisionShapeData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3CollisionShapeData calloc() {
        return wrap(B3CollisionShapeData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3CollisionShapeData} instance allocated with {@link BufferUtils}. */
    public static B3CollisionShapeData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3CollisionShapeData.class, memAddress(container), container);
    }

    /** Returns a new {@code B3CollisionShapeData} instance for the specified memory address. */
    public static B3CollisionShapeData create(long address) {
        return wrap(B3CollisionShapeData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3CollisionShapeData createSafe(long address) {
        return address == NULL ? null : wrap(B3CollisionShapeData.class, address);
    }

    /**
     * Returns a new {@link B3CollisionShapeData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3CollisionShapeData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3CollisionShapeData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3CollisionShapeData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3CollisionShapeData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3CollisionShapeData} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3CollisionShapeData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3CollisionShapeData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3CollisionShapeData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3CollisionShapeData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3CollisionShapeData mallocStack(MemoryStack stack) {
        return wrap(B3CollisionShapeData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3CollisionShapeData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3CollisionShapeData callocStack(MemoryStack stack) {
        return wrap(B3CollisionShapeData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3CollisionShapeData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeData.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3CollisionShapeData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeData.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3CollisionShapeData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeData.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3CollisionShapeData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3CollisionShapeData.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_objectUniqueId}. */
    public static int nm_objectUniqueId(long struct) { return UNSAFE.getInt(null, struct + B3CollisionShapeData.M_OBJECTUNIQUEID); }
    /** Unsafe version of {@link #m_linkIndex}. */
    public static int nm_linkIndex(long struct) { return UNSAFE.getInt(null, struct + B3CollisionShapeData.M_LINKINDEX); }
    /** Unsafe version of {@link #m_collisionGeometryType}. */
    public static int nm_collisionGeometryType(long struct) { return UNSAFE.getInt(null, struct + B3CollisionShapeData.M_COLLISIONGEOMETRYTYPE); }
    /** Unsafe version of {@link #m_dimensions}. */
    public static DoubleBuffer nm_dimensions(long struct) { return memDoubleBuffer(struct + B3CollisionShapeData.M_DIMENSIONS, 3); }
    /** Unsafe version of {@link #m_dimensions(int) m_dimensions}. */
    public static double nm_dimensions(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3CollisionShapeData.M_DIMENSIONS + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_localCollisionFrame}. */
    public static DoubleBuffer nm_localCollisionFrame(long struct) { return memDoubleBuffer(struct + B3CollisionShapeData.M_LOCALCOLLISIONFRAME, 7); }
    /** Unsafe version of {@link #m_localCollisionFrame(int) m_localCollisionFrame}. */
    public static double nm_localCollisionFrame(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3CollisionShapeData.M_LOCALCOLLISIONFRAME + check(index, 7) * 8);
    }
    /** Unsafe version of {@link #m_meshAssetFileName}. */
    public static ByteBuffer nm_meshAssetFileName(long struct) { return memByteBuffer(struct + B3CollisionShapeData.M_MESHASSETFILENAME, VISUAL_SHAPE_MAX_PATH_LEN); }
    /** Unsafe version of {@link #m_meshAssetFileNameString}. */
    public static String nm_meshAssetFileNameString(long struct) { return memASCII(struct + B3CollisionShapeData.M_MESHASSETFILENAME); }

    /** Unsafe version of {@link #m_objectUniqueId(int) m_objectUniqueId}. */
    public static void nm_objectUniqueId(long struct, int value) { UNSAFE.putInt(null, struct + B3CollisionShapeData.M_OBJECTUNIQUEID, value); }
    /** Unsafe version of {@link #m_linkIndex(int) m_linkIndex}. */
    public static void nm_linkIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3CollisionShapeData.M_LINKINDEX, value); }
    /** Unsafe version of {@link #m_collisionGeometryType(int) m_collisionGeometryType}. */
    public static void nm_collisionGeometryType(long struct, int value) { UNSAFE.putInt(null, struct + B3CollisionShapeData.M_COLLISIONGEOMETRYTYPE, value); }
    /** Unsafe version of {@link #m_dimensions(DoubleBuffer) m_dimensions}. */
    public static void nm_dimensions(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3CollisionShapeData.M_DIMENSIONS, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_dimensions(int, double) m_dimensions}. */
    public static void nm_dimensions(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3CollisionShapeData.M_DIMENSIONS + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_localCollisionFrame(DoubleBuffer) m_localCollisionFrame}. */
    public static void nm_localCollisionFrame(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(memAddress(value), struct + B3CollisionShapeData.M_LOCALCOLLISIONFRAME, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_localCollisionFrame(int, double) m_localCollisionFrame}. */
    public static void nm_localCollisionFrame(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3CollisionShapeData.M_LOCALCOLLISIONFRAME + check(index, 7) * 8, value);
    }
    /** Unsafe version of {@link #m_meshAssetFileName(ByteBuffer) m_meshAssetFileName}. */
    public static void nm_meshAssetFileName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, VISUAL_SHAPE_MAX_PATH_LEN);
        }
        memCopy(memAddress(value), struct + B3CollisionShapeData.M_MESHASSETFILENAME, value.remaining());
    }

    // -----------------------------------

    /** An array of {@link B3CollisionShapeData} structs. */
    public static class Buffer extends StructBuffer<B3CollisionShapeData, Buffer> implements NativeResource {

        private static final B3CollisionShapeData ELEMENT_FACTORY = B3CollisionShapeData.create(-1L);

        /**
         * Creates a new {@code B3CollisionShapeData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3CollisionShapeData#SIZEOF}, and its mark will be undefined.
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
        protected B3CollisionShapeData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_objectUniqueId} field. */
        public int m_objectUniqueId() { return B3CollisionShapeData.nm_objectUniqueId(address()); }
        /** Returns the value of the {@code m_linkIndex} field. */
        public int m_linkIndex() { return B3CollisionShapeData.nm_linkIndex(address()); }
        /** Returns the value of the {@code m_collisionGeometryType} field. */
        public int m_collisionGeometryType() { return B3CollisionShapeData.nm_collisionGeometryType(address()); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_dimensions} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_dimensions() { return B3CollisionShapeData.nm_dimensions(address()); }
        /** Returns the value at the specified index of the {@code m_dimensions} field. */
        public double m_dimensions(int index) { return B3CollisionShapeData.nm_dimensions(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_localCollisionFrame} field. */
        @NativeType("double[7]")
        public DoubleBuffer m_localCollisionFrame() { return B3CollisionShapeData.nm_localCollisionFrame(address()); }
        /** Returns the value at the specified index of the {@code m_localCollisionFrame} field. */
        public double m_localCollisionFrame(int index) { return B3CollisionShapeData.nm_localCollisionFrame(address(), index); }
        /** Returns a {@link ByteBuffer} view of the {@code m_meshAssetFileName} field. */
        @NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]")
        public ByteBuffer m_meshAssetFileName() { return B3CollisionShapeData.nm_meshAssetFileName(address()); }
        /** Decodes the null-terminated string stored in the {@code m_meshAssetFileName} field. */
        @NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]")
        public String m_meshAssetFileNameString() { return B3CollisionShapeData.nm_meshAssetFileNameString(address()); }

        /** Sets the specified value to the {@code m_objectUniqueId} field. */
        public B3CollisionShapeData.Buffer m_objectUniqueId(int value) { B3CollisionShapeData.nm_objectUniqueId(address(), value); return this; }
        /** Sets the specified value to the {@code m_linkIndex} field. */
        public B3CollisionShapeData.Buffer m_linkIndex(int value) { B3CollisionShapeData.nm_linkIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_collisionGeometryType} field. */
        public B3CollisionShapeData.Buffer m_collisionGeometryType(int value) { B3CollisionShapeData.nm_collisionGeometryType(address(), value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_dimensions} field. */
        public B3CollisionShapeData.Buffer m_dimensions(@NativeType("double[3]") DoubleBuffer value) { B3CollisionShapeData.nm_dimensions(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_dimensions} field. */
        public B3CollisionShapeData.Buffer m_dimensions(int index, double value) { B3CollisionShapeData.nm_dimensions(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_localCollisionFrame} field. */
        public B3CollisionShapeData.Buffer m_localCollisionFrame(@NativeType("double[7]") DoubleBuffer value) { B3CollisionShapeData.nm_localCollisionFrame(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_localCollisionFrame} field. */
        public B3CollisionShapeData.Buffer m_localCollisionFrame(int index, double value) { B3CollisionShapeData.nm_localCollisionFrame(address(), index, value); return this; }
        /** Copies the specified encoded string to the {@code m_meshAssetFileName} field. */
        public B3CollisionShapeData.Buffer m_meshAssetFileName(@NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]") ByteBuffer value) { B3CollisionShapeData.nm_meshAssetFileName(address(), value); return this; }

    }

}