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
 * struct b3VisualShapeData {
 *     int m_objectUniqueId;
 *     int m_linkIndex;
 *     int m_visualGeometryType;
 *     double m_dimensions[3];
 *     char m_meshAssetFileName[VISUAL_SHAPE_MAX_PATH_LEN];
 *     double m_localVisualFrame[7];
 *     double m_rgbaColor[4];
 *     int m_tinyRendererTextureId;
 *     int m_textureUniqueId;
 *     int m_openglTextureId;
 * }</code></pre>
 */
@NativeType("struct b3VisualShapeData")
public class B3VisualShapeData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        M_OBJECTUNIQUEID,
        M_LINKINDEX,
        M_VISUALGEOMETRYTYPE,
        M_DIMENSIONS,
        M_MESHASSETFILENAME,
        M_LOCALVISUALFRAME,
        M_RGBACOLOR,
        M_TINYRENDERERTEXTUREID,
        M_TEXTUREUNIQUEID,
        M_OPENGLTEXTUREID;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __array(8, 3),
            __array(1, VISUAL_SHAPE_MAX_PATH_LEN),
            __array(8, 7),
            __array(8, 4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        M_OBJECTUNIQUEID = layout.offsetof(0);
        M_LINKINDEX = layout.offsetof(1);
        M_VISUALGEOMETRYTYPE = layout.offsetof(2);
        M_DIMENSIONS = layout.offsetof(3);
        M_MESHASSETFILENAME = layout.offsetof(4);
        M_LOCALVISUALFRAME = layout.offsetof(5);
        M_RGBACOLOR = layout.offsetof(6);
        M_TINYRENDERERTEXTUREID = layout.offsetof(7);
        M_TEXTUREUNIQUEID = layout.offsetof(8);
        M_OPENGLTEXTUREID = layout.offsetof(9);
    }

    /**
     * Creates a {@code B3VisualShapeData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public B3VisualShapeData(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code m_objectUniqueId} field. */
    public int m_objectUniqueId() { return nm_objectUniqueId(address()); }
    /** Returns the value of the {@code m_linkIndex} field. */
    public int m_linkIndex() { return nm_linkIndex(address()); }
    /** Returns the value of the {@code m_visualGeometryType} field. */
    public int m_visualGeometryType() { return nm_visualGeometryType(address()); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_dimensions} field. */
    @NativeType("double[3]")
    public DoubleBuffer m_dimensions() { return nm_dimensions(address()); }
    /** Returns the value at the specified index of the {@code m_dimensions} field. */
    public double m_dimensions(int index) { return nm_dimensions(address(), index); }
    /** Returns a {@link ByteBuffer} view of the {@code m_meshAssetFileName} field. */
    @NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]")
    public ByteBuffer m_meshAssetFileName() { return nm_meshAssetFileName(address()); }
    /** Decodes the null-terminated string stored in the {@code m_meshAssetFileName} field. */
    @NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]")
    public String m_meshAssetFileNameString() { return nm_meshAssetFileNameString(address()); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_localVisualFrame} field. */
    @NativeType("double[7]")
    public DoubleBuffer m_localVisualFrame() { return nm_localVisualFrame(address()); }
    /** Returns the value at the specified index of the {@code m_localVisualFrame} field. */
    public double m_localVisualFrame(int index) { return nm_localVisualFrame(address(), index); }
    /** Returns a {@link DoubleBuffer} view of the {@code m_rgbaColor} field. */
    @NativeType("double[4]")
    public DoubleBuffer m_rgbaColor() { return nm_rgbaColor(address()); }
    /** Returns the value at the specified index of the {@code m_rgbaColor} field. */
    public double m_rgbaColor(int index) { return nm_rgbaColor(address(), index); }
    /** Returns the value of the {@code m_tinyRendererTextureId} field. */
    public int m_tinyRendererTextureId() { return nm_tinyRendererTextureId(address()); }
    /** Returns the value of the {@code m_textureUniqueId} field. */
    public int m_textureUniqueId() { return nm_textureUniqueId(address()); }
    /** Returns the value of the {@code m_openglTextureId} field. */
    public int m_openglTextureId() { return nm_openglTextureId(address()); }

    /** Sets the specified value to the {@code m_objectUniqueId} field. */
    public B3VisualShapeData m_objectUniqueId(int value) { nm_objectUniqueId(address(), value); return this; }
    /** Sets the specified value to the {@code m_linkIndex} field. */
    public B3VisualShapeData m_linkIndex(int value) { nm_linkIndex(address(), value); return this; }
    /** Sets the specified value to the {@code m_visualGeometryType} field. */
    public B3VisualShapeData m_visualGeometryType(int value) { nm_visualGeometryType(address(), value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_dimensions} field. */
    public B3VisualShapeData m_dimensions(@NativeType("double[3]") DoubleBuffer value) { nm_dimensions(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_dimensions} field. */
    public B3VisualShapeData m_dimensions(int index, double value) { nm_dimensions(address(), index, value); return this; }
    /** Copies the specified encoded string to the {@code m_meshAssetFileName} field. */
    public B3VisualShapeData m_meshAssetFileName(@NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]") ByteBuffer value) { nm_meshAssetFileName(address(), value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_localVisualFrame} field. */
    public B3VisualShapeData m_localVisualFrame(@NativeType("double[7]") DoubleBuffer value) { nm_localVisualFrame(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_localVisualFrame} field. */
    public B3VisualShapeData m_localVisualFrame(int index, double value) { nm_localVisualFrame(address(), index, value); return this; }
    /** Copies the specified {@link DoubleBuffer} to the {@code m_rgbaColor} field. */
    public B3VisualShapeData m_rgbaColor(@NativeType("double[4]") DoubleBuffer value) { nm_rgbaColor(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code m_rgbaColor} field. */
    public B3VisualShapeData m_rgbaColor(int index, double value) { nm_rgbaColor(address(), index, value); return this; }
    /** Sets the specified value to the {@code m_tinyRendererTextureId} field. */
    public B3VisualShapeData m_tinyRendererTextureId(int value) { nm_tinyRendererTextureId(address(), value); return this; }
    /** Sets the specified value to the {@code m_textureUniqueId} field. */
    public B3VisualShapeData m_textureUniqueId(int value) { nm_textureUniqueId(address(), value); return this; }
    /** Sets the specified value to the {@code m_openglTextureId} field. */
    public B3VisualShapeData m_openglTextureId(int value) { nm_openglTextureId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public B3VisualShapeData set(
        int m_objectUniqueId,
        int m_linkIndex,
        int m_visualGeometryType,
        DoubleBuffer m_dimensions,
        ByteBuffer m_meshAssetFileName,
        DoubleBuffer m_localVisualFrame,
        DoubleBuffer m_rgbaColor,
        int m_tinyRendererTextureId,
        int m_textureUniqueId,
        int m_openglTextureId
    ) {
        m_objectUniqueId(m_objectUniqueId);
        m_linkIndex(m_linkIndex);
        m_visualGeometryType(m_visualGeometryType);
        m_dimensions(m_dimensions);
        m_meshAssetFileName(m_meshAssetFileName);
        m_localVisualFrame(m_localVisualFrame);
        m_rgbaColor(m_rgbaColor);
        m_tinyRendererTextureId(m_tinyRendererTextureId);
        m_textureUniqueId(m_textureUniqueId);
        m_openglTextureId(m_openglTextureId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public B3VisualShapeData set(B3VisualShapeData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code B3VisualShapeData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static B3VisualShapeData malloc() {
        return wrap(B3VisualShapeData.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code B3VisualShapeData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static B3VisualShapeData calloc() {
        return wrap(B3VisualShapeData.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code B3VisualShapeData} instance allocated with {@link BufferUtils}. */
    public static B3VisualShapeData create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(B3VisualShapeData.class, memAddress(container), container);
    }

    /** Returns a new {@code B3VisualShapeData} instance for the specified memory address. */
    public static B3VisualShapeData create(long address) {
        return wrap(B3VisualShapeData.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3VisualShapeData createSafe(long address) {
        return address == NULL ? null : wrap(B3VisualShapeData.class, address);
    }

    /**
     * Returns a new {@link B3VisualShapeData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3VisualShapeData.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link B3VisualShapeData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static B3VisualShapeData.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3VisualShapeData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static B3VisualShapeData.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link B3VisualShapeData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static B3VisualShapeData.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static B3VisualShapeData.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code B3VisualShapeData} instance allocated on the thread-local {@link MemoryStack}. */
    public static B3VisualShapeData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code B3VisualShapeData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static B3VisualShapeData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code B3VisualShapeData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static B3VisualShapeData mallocStack(MemoryStack stack) {
        return wrap(B3VisualShapeData.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code B3VisualShapeData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static B3VisualShapeData callocStack(MemoryStack stack) {
        return wrap(B3VisualShapeData.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link B3VisualShapeData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static B3VisualShapeData.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3VisualShapeData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static B3VisualShapeData.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link B3VisualShapeData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3VisualShapeData.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link B3VisualShapeData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static B3VisualShapeData.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #m_objectUniqueId}. */
    public static int nm_objectUniqueId(long struct) { return UNSAFE.getInt(null, struct + B3VisualShapeData.M_OBJECTUNIQUEID); }
    /** Unsafe version of {@link #m_linkIndex}. */
    public static int nm_linkIndex(long struct) { return UNSAFE.getInt(null, struct + B3VisualShapeData.M_LINKINDEX); }
    /** Unsafe version of {@link #m_visualGeometryType}. */
    public static int nm_visualGeometryType(long struct) { return UNSAFE.getInt(null, struct + B3VisualShapeData.M_VISUALGEOMETRYTYPE); }
    /** Unsafe version of {@link #m_dimensions}. */
    public static DoubleBuffer nm_dimensions(long struct) { return memDoubleBuffer(struct + B3VisualShapeData.M_DIMENSIONS, 3); }
    /** Unsafe version of {@link #m_dimensions(int) m_dimensions}. */
    public static double nm_dimensions(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3VisualShapeData.M_DIMENSIONS + check(index, 3) * 8);
    }
    /** Unsafe version of {@link #m_meshAssetFileName}. */
    public static ByteBuffer nm_meshAssetFileName(long struct) { return memByteBuffer(struct + B3VisualShapeData.M_MESHASSETFILENAME, VISUAL_SHAPE_MAX_PATH_LEN); }
    /** Unsafe version of {@link #m_meshAssetFileNameString}. */
    public static String nm_meshAssetFileNameString(long struct) { return memASCII(struct + B3VisualShapeData.M_MESHASSETFILENAME); }
    /** Unsafe version of {@link #m_localVisualFrame}. */
    public static DoubleBuffer nm_localVisualFrame(long struct) { return memDoubleBuffer(struct + B3VisualShapeData.M_LOCALVISUALFRAME, 7); }
    /** Unsafe version of {@link #m_localVisualFrame(int) m_localVisualFrame}. */
    public static double nm_localVisualFrame(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3VisualShapeData.M_LOCALVISUALFRAME + check(index, 7) * 8);
    }
    /** Unsafe version of {@link #m_rgbaColor}. */
    public static DoubleBuffer nm_rgbaColor(long struct) { return memDoubleBuffer(struct + B3VisualShapeData.M_RGBACOLOR, 4); }
    /** Unsafe version of {@link #m_rgbaColor(int) m_rgbaColor}. */
    public static double nm_rgbaColor(long struct, int index) {
        return UNSAFE.getDouble(null, struct + B3VisualShapeData.M_RGBACOLOR + check(index, 4) * 8);
    }
    /** Unsafe version of {@link #m_tinyRendererTextureId}. */
    public static int nm_tinyRendererTextureId(long struct) { return UNSAFE.getInt(null, struct + B3VisualShapeData.M_TINYRENDERERTEXTUREID); }
    /** Unsafe version of {@link #m_textureUniqueId}. */
    public static int nm_textureUniqueId(long struct) { return UNSAFE.getInt(null, struct + B3VisualShapeData.M_TEXTUREUNIQUEID); }
    /** Unsafe version of {@link #m_openglTextureId}. */
    public static int nm_openglTextureId(long struct) { return UNSAFE.getInt(null, struct + B3VisualShapeData.M_OPENGLTEXTUREID); }

    /** Unsafe version of {@link #m_objectUniqueId(int) m_objectUniqueId}. */
    public static void nm_objectUniqueId(long struct, int value) { UNSAFE.putInt(null, struct + B3VisualShapeData.M_OBJECTUNIQUEID, value); }
    /** Unsafe version of {@link #m_linkIndex(int) m_linkIndex}. */
    public static void nm_linkIndex(long struct, int value) { UNSAFE.putInt(null, struct + B3VisualShapeData.M_LINKINDEX, value); }
    /** Unsafe version of {@link #m_visualGeometryType(int) m_visualGeometryType}. */
    public static void nm_visualGeometryType(long struct, int value) { UNSAFE.putInt(null, struct + B3VisualShapeData.M_VISUALGEOMETRYTYPE, value); }
    /** Unsafe version of {@link #m_dimensions(DoubleBuffer) m_dimensions}. */
    public static void nm_dimensions(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 3); }
        memCopy(memAddress(value), struct + B3VisualShapeData.M_DIMENSIONS, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_dimensions(int, double) m_dimensions}. */
    public static void nm_dimensions(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3VisualShapeData.M_DIMENSIONS + check(index, 3) * 8, value);
    }
    /** Unsafe version of {@link #m_meshAssetFileName(ByteBuffer) m_meshAssetFileName}. */
    public static void nm_meshAssetFileName(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, VISUAL_SHAPE_MAX_PATH_LEN);
        }
        memCopy(memAddress(value), struct + B3VisualShapeData.M_MESHASSETFILENAME, value.remaining());
    }
    /** Unsafe version of {@link #m_localVisualFrame(DoubleBuffer) m_localVisualFrame}. */
    public static void nm_localVisualFrame(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 7); }
        memCopy(memAddress(value), struct + B3VisualShapeData.M_LOCALVISUALFRAME, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_localVisualFrame(int, double) m_localVisualFrame}. */
    public static void nm_localVisualFrame(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3VisualShapeData.M_LOCALVISUALFRAME + check(index, 7) * 8, value);
    }
    /** Unsafe version of {@link #m_rgbaColor(DoubleBuffer) m_rgbaColor}. */
    public static void nm_rgbaColor(long struct, DoubleBuffer value) {
        if (CHECKS) { checkGT(value, 4); }
        memCopy(memAddress(value), struct + B3VisualShapeData.M_RGBACOLOR, value.remaining() * 8);
    }
    /** Unsafe version of {@link #m_rgbaColor(int, double) m_rgbaColor}. */
    public static void nm_rgbaColor(long struct, int index, double value) {
        UNSAFE.putDouble(null, struct + B3VisualShapeData.M_RGBACOLOR + check(index, 4) * 8, value);
    }
    /** Unsafe version of {@link #m_tinyRendererTextureId(int) m_tinyRendererTextureId}. */
    public static void nm_tinyRendererTextureId(long struct, int value) { UNSAFE.putInt(null, struct + B3VisualShapeData.M_TINYRENDERERTEXTUREID, value); }
    /** Unsafe version of {@link #m_textureUniqueId(int) m_textureUniqueId}. */
    public static void nm_textureUniqueId(long struct, int value) { UNSAFE.putInt(null, struct + B3VisualShapeData.M_TEXTUREUNIQUEID, value); }
    /** Unsafe version of {@link #m_openglTextureId(int) m_openglTextureId}. */
    public static void nm_openglTextureId(long struct, int value) { UNSAFE.putInt(null, struct + B3VisualShapeData.M_OPENGLTEXTUREID, value); }

    // -----------------------------------

    /** An array of {@link B3VisualShapeData} structs. */
    public static class Buffer extends StructBuffer<B3VisualShapeData, Buffer> implements NativeResource {

        private static final B3VisualShapeData ELEMENT_FACTORY = B3VisualShapeData.create(-1L);

        /**
         * Creates a new {@code B3VisualShapeData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link B3VisualShapeData#SIZEOF}, and its mark will be undefined.
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
        protected B3VisualShapeData getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code m_objectUniqueId} field. */
        public int m_objectUniqueId() { return B3VisualShapeData.nm_objectUniqueId(address()); }
        /** Returns the value of the {@code m_linkIndex} field. */
        public int m_linkIndex() { return B3VisualShapeData.nm_linkIndex(address()); }
        /** Returns the value of the {@code m_visualGeometryType} field. */
        public int m_visualGeometryType() { return B3VisualShapeData.nm_visualGeometryType(address()); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_dimensions} field. */
        @NativeType("double[3]")
        public DoubleBuffer m_dimensions() { return B3VisualShapeData.nm_dimensions(address()); }
        /** Returns the value at the specified index of the {@code m_dimensions} field. */
        public double m_dimensions(int index) { return B3VisualShapeData.nm_dimensions(address(), index); }
        /** Returns a {@link ByteBuffer} view of the {@code m_meshAssetFileName} field. */
        @NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]")
        public ByteBuffer m_meshAssetFileName() { return B3VisualShapeData.nm_meshAssetFileName(address()); }
        /** Decodes the null-terminated string stored in the {@code m_meshAssetFileName} field. */
        @NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]")
        public String m_meshAssetFileNameString() { return B3VisualShapeData.nm_meshAssetFileNameString(address()); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_localVisualFrame} field. */
        @NativeType("double[7]")
        public DoubleBuffer m_localVisualFrame() { return B3VisualShapeData.nm_localVisualFrame(address()); }
        /** Returns the value at the specified index of the {@code m_localVisualFrame} field. */
        public double m_localVisualFrame(int index) { return B3VisualShapeData.nm_localVisualFrame(address(), index); }
        /** Returns a {@link DoubleBuffer} view of the {@code m_rgbaColor} field. */
        @NativeType("double[4]")
        public DoubleBuffer m_rgbaColor() { return B3VisualShapeData.nm_rgbaColor(address()); }
        /** Returns the value at the specified index of the {@code m_rgbaColor} field. */
        public double m_rgbaColor(int index) { return B3VisualShapeData.nm_rgbaColor(address(), index); }
        /** Returns the value of the {@code m_tinyRendererTextureId} field. */
        public int m_tinyRendererTextureId() { return B3VisualShapeData.nm_tinyRendererTextureId(address()); }
        /** Returns the value of the {@code m_textureUniqueId} field. */
        public int m_textureUniqueId() { return B3VisualShapeData.nm_textureUniqueId(address()); }
        /** Returns the value of the {@code m_openglTextureId} field. */
        public int m_openglTextureId() { return B3VisualShapeData.nm_openglTextureId(address()); }

        /** Sets the specified value to the {@code m_objectUniqueId} field. */
        public B3VisualShapeData.Buffer m_objectUniqueId(int value) { B3VisualShapeData.nm_objectUniqueId(address(), value); return this; }
        /** Sets the specified value to the {@code m_linkIndex} field. */
        public B3VisualShapeData.Buffer m_linkIndex(int value) { B3VisualShapeData.nm_linkIndex(address(), value); return this; }
        /** Sets the specified value to the {@code m_visualGeometryType} field. */
        public B3VisualShapeData.Buffer m_visualGeometryType(int value) { B3VisualShapeData.nm_visualGeometryType(address(), value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_dimensions} field. */
        public B3VisualShapeData.Buffer m_dimensions(@NativeType("double[3]") DoubleBuffer value) { B3VisualShapeData.nm_dimensions(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_dimensions} field. */
        public B3VisualShapeData.Buffer m_dimensions(int index, double value) { B3VisualShapeData.nm_dimensions(address(), index, value); return this; }
        /** Copies the specified encoded string to the {@code m_meshAssetFileName} field. */
        public B3VisualShapeData.Buffer m_meshAssetFileName(@NativeType("char[VISUAL_SHAPE_MAX_PATH_LEN]") ByteBuffer value) { B3VisualShapeData.nm_meshAssetFileName(address(), value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_localVisualFrame} field. */
        public B3VisualShapeData.Buffer m_localVisualFrame(@NativeType("double[7]") DoubleBuffer value) { B3VisualShapeData.nm_localVisualFrame(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_localVisualFrame} field. */
        public B3VisualShapeData.Buffer m_localVisualFrame(int index, double value) { B3VisualShapeData.nm_localVisualFrame(address(), index, value); return this; }
        /** Copies the specified {@link DoubleBuffer} to the {@code m_rgbaColor} field. */
        public B3VisualShapeData.Buffer m_rgbaColor(@NativeType("double[4]") DoubleBuffer value) { B3VisualShapeData.nm_rgbaColor(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code m_rgbaColor} field. */
        public B3VisualShapeData.Buffer m_rgbaColor(int index, double value) { B3VisualShapeData.nm_rgbaColor(address(), index, value); return this; }
        /** Sets the specified value to the {@code m_tinyRendererTextureId} field. */
        public B3VisualShapeData.Buffer m_tinyRendererTextureId(int value) { B3VisualShapeData.nm_tinyRendererTextureId(address(), value); return this; }
        /** Sets the specified value to the {@code m_textureUniqueId} field. */
        public B3VisualShapeData.Buffer m_textureUniqueId(int value) { B3VisualShapeData.nm_textureUniqueId(address(), value); return this; }
        /** Sets the specified value to the {@code m_openglTextureId} field. */
        public B3VisualShapeData.Buffer m_openglTextureId(int value) { B3VisualShapeData.nm_openglTextureId(address(), value); return this; }

    }

}