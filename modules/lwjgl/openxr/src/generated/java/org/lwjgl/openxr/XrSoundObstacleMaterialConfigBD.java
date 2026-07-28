/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrSoundObstacleMaterialConfigBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrSoundObstacleMaterialTypeBD materialType;
 *     uint32_t bandCount;
 *     float * bandFrequencies;
 *     float * bandAbsorptions;
 *     float * bandScatterings;
 *     float * bandTransmissions;
 * }}</pre>
 */
public class XrSoundObstacleMaterialConfigBD extends Struct<XrSoundObstacleMaterialConfigBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MATERIALTYPE,
        BANDCOUNT,
        BANDFREQUENCIES,
        BANDABSORPTIONS,
        BANDSCATTERINGS,
        BANDTRANSMISSIONS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MATERIALTYPE = layout.offsetof(2);
        BANDCOUNT = layout.offsetof(3);
        BANDFREQUENCIES = layout.offsetof(4);
        BANDABSORPTIONS = layout.offsetof(5);
        BANDSCATTERINGS = layout.offsetof(6);
        BANDTRANSMISSIONS = layout.offsetof(7);
    }

    protected XrSoundObstacleMaterialConfigBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSoundObstacleMaterialConfigBD create(long address, @Nullable ByteBuffer container) {
        return new XrSoundObstacleMaterialConfigBD(address, container);
    }

    /**
     * Creates a {@code XrSoundObstacleMaterialConfigBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSoundObstacleMaterialConfigBD(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code materialType} field. */
    @NativeType("XrSoundObstacleMaterialTypeBD")
    public int materialType() { return nmaterialType(address()); }
    /** @return the value of the {@code bandCount} field. */
    @NativeType("uint32_t")
    public int bandCount() { return nbandCount(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code bandFrequencies} field. */
    @NativeType("float *")
    public FloatBuffer bandFrequencies() { return nbandFrequencies(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code bandAbsorptions} field. */
    @NativeType("float *")
    public FloatBuffer bandAbsorptions() { return nbandAbsorptions(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code bandScatterings} field. */
    @NativeType("float *")
    public FloatBuffer bandScatterings() { return nbandScatterings(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code bandTransmissions} field. */
    @NativeType("float *")
    public FloatBuffer bandTransmissions() { return nbandTransmissions(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSoundObstacleMaterialConfigBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBSTACLE_MATERIAL_CONFIG_BD TYPE_SOUND_OBSTACLE_MATERIAL_CONFIG_BD} value to the {@code type} field. */
    public XrSoundObstacleMaterialConfigBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBSTACLE_MATERIAL_CONFIG_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSoundObstacleMaterialConfigBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code materialType} field. */
    public XrSoundObstacleMaterialConfigBD materialType(@NativeType("XrSoundObstacleMaterialTypeBD") int value) { nmaterialType(address(), value); return this; }
    /** Sets the specified value to the {@code bandCount} field. */
    public XrSoundObstacleMaterialConfigBD bandCount(@NativeType("uint32_t") int value) { nbandCount(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code bandFrequencies} field. */
    public XrSoundObstacleMaterialConfigBD bandFrequencies(@NativeType("float *") FloatBuffer value) { nbandFrequencies(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code bandAbsorptions} field. */
    public XrSoundObstacleMaterialConfigBD bandAbsorptions(@NativeType("float *") FloatBuffer value) { nbandAbsorptions(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code bandScatterings} field. */
    public XrSoundObstacleMaterialConfigBD bandScatterings(@NativeType("float *") FloatBuffer value) { nbandScatterings(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code bandTransmissions} field. */
    public XrSoundObstacleMaterialConfigBD bandTransmissions(@NativeType("float *") FloatBuffer value) { nbandTransmissions(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSoundObstacleMaterialConfigBD set(
        int type,
        long next,
        int materialType,
        int bandCount,
        FloatBuffer bandFrequencies,
        FloatBuffer bandAbsorptions,
        FloatBuffer bandScatterings,
        FloatBuffer bandTransmissions
    ) {
        type(type);
        next(next);
        materialType(materialType);
        bandCount(bandCount);
        bandFrequencies(bandFrequencies);
        bandAbsorptions(bandAbsorptions);
        bandScatterings(bandScatterings);
        bandTransmissions(bandTransmissions);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSoundObstacleMaterialConfigBD set(XrSoundObstacleMaterialConfigBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSoundObstacleMaterialConfigBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSoundObstacleMaterialConfigBD malloc() {
        return new XrSoundObstacleMaterialConfigBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObstacleMaterialConfigBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSoundObstacleMaterialConfigBD calloc() {
        return new XrSoundObstacleMaterialConfigBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObstacleMaterialConfigBD} instance allocated with {@link BufferUtils}. */
    public static XrSoundObstacleMaterialConfigBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSoundObstacleMaterialConfigBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSoundObstacleMaterialConfigBD} instance for the specified memory address. */
    public static XrSoundObstacleMaterialConfigBD create(long address) {
        return new XrSoundObstacleMaterialConfigBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSoundObstacleMaterialConfigBD createSafe(long address) {
        return address == NULL ? null : new XrSoundObstacleMaterialConfigBD(address, null);
    }

    /**
     * Returns a new {@link XrSoundObstacleMaterialConfigBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleMaterialConfigBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSoundObstacleMaterialConfigBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleMaterialConfigBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObstacleMaterialConfigBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleMaterialConfigBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSoundObstacleMaterialConfigBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleMaterialConfigBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSoundObstacleMaterialConfigBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSoundObstacleMaterialConfigBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObstacleMaterialConfigBD malloc(MemoryStack stack) {
        return new XrSoundObstacleMaterialConfigBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSoundObstacleMaterialConfigBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObstacleMaterialConfigBD calloc(MemoryStack stack) {
        return new XrSoundObstacleMaterialConfigBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSoundObstacleMaterialConfigBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleMaterialConfigBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObstacleMaterialConfigBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObstacleMaterialConfigBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSoundObstacleMaterialConfigBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSoundObstacleMaterialConfigBD.NEXT); }
    /** Unsafe version of {@link #materialType}. */
    public static int nmaterialType(long struct) { return memGetInt(struct + XrSoundObstacleMaterialConfigBD.MATERIALTYPE); }
    /** Unsafe version of {@link #bandCount}. */
    public static int nbandCount(long struct) { return memGetInt(struct + XrSoundObstacleMaterialConfigBD.BANDCOUNT); }
    /** Unsafe version of {@link #bandFrequencies() bandFrequencies}. */
    public static FloatBuffer nbandFrequencies(long struct) { return memFloatBuffer(memGetAddress(struct + XrSoundObstacleMaterialConfigBD.BANDFREQUENCIES), nbandCount(struct)); }
    /** Unsafe version of {@link #bandAbsorptions() bandAbsorptions}. */
    public static FloatBuffer nbandAbsorptions(long struct) { return memFloatBuffer(memGetAddress(struct + XrSoundObstacleMaterialConfigBD.BANDABSORPTIONS), nbandCount(struct)); }
    /** Unsafe version of {@link #bandScatterings() bandScatterings}. */
    public static FloatBuffer nbandScatterings(long struct) { return memFloatBuffer(memGetAddress(struct + XrSoundObstacleMaterialConfigBD.BANDSCATTERINGS), nbandCount(struct)); }
    /** Unsafe version of {@link #bandTransmissions() bandTransmissions}. */
    public static FloatBuffer nbandTransmissions(long struct) { return memFloatBuffer(memGetAddress(struct + XrSoundObstacleMaterialConfigBD.BANDTRANSMISSIONS), nbandCount(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSoundObstacleMaterialConfigBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSoundObstacleMaterialConfigBD.NEXT, value); }
    /** Unsafe version of {@link #materialType(int) materialType}. */
    public static void nmaterialType(long struct, int value) { memPutInt(struct + XrSoundObstacleMaterialConfigBD.MATERIALTYPE, value); }
    /** Sets the specified value to the {@code bandCount} field of the specified {@code struct}. */
    public static void nbandCount(long struct, int value) { memPutInt(struct + XrSoundObstacleMaterialConfigBD.BANDCOUNT, value); }
    /** Unsafe version of {@link #bandFrequencies(FloatBuffer) bandFrequencies}. */
    public static void nbandFrequencies(long struct, FloatBuffer value) { memPutAddress(struct + XrSoundObstacleMaterialConfigBD.BANDFREQUENCIES, memAddress(value)); }
    /** Unsafe version of {@link #bandAbsorptions(FloatBuffer) bandAbsorptions}. */
    public static void nbandAbsorptions(long struct, FloatBuffer value) { memPutAddress(struct + XrSoundObstacleMaterialConfigBD.BANDABSORPTIONS, memAddress(value)); }
    /** Unsafe version of {@link #bandScatterings(FloatBuffer) bandScatterings}. */
    public static void nbandScatterings(long struct, FloatBuffer value) { memPutAddress(struct + XrSoundObstacleMaterialConfigBD.BANDSCATTERINGS, memAddress(value)); }
    /** Unsafe version of {@link #bandTransmissions(FloatBuffer) bandTransmissions}. */
    public static void nbandTransmissions(long struct, FloatBuffer value) { memPutAddress(struct + XrSoundObstacleMaterialConfigBD.BANDTRANSMISSIONS, memAddress(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSoundObstacleMaterialConfigBD.BANDFREQUENCIES));
        check(memGetAddress(struct + XrSoundObstacleMaterialConfigBD.BANDABSORPTIONS));
        check(memGetAddress(struct + XrSoundObstacleMaterialConfigBD.BANDSCATTERINGS));
        check(memGetAddress(struct + XrSoundObstacleMaterialConfigBD.BANDTRANSMISSIONS));
    }

    // -----------------------------------

    /** An array of {@link XrSoundObstacleMaterialConfigBD} structs. */
    public static class Buffer extends StructBuffer<XrSoundObstacleMaterialConfigBD, Buffer> implements NativeResource {

        private static final XrSoundObstacleMaterialConfigBD ELEMENT_FACTORY = XrSoundObstacleMaterialConfigBD.create(-1L);

        /**
         * Creates a new {@code XrSoundObstacleMaterialConfigBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSoundObstacleMaterialConfigBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected XrSoundObstacleMaterialConfigBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSoundObstacleMaterialConfigBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSoundObstacleMaterialConfigBD.nnext(address()); }
        /** @return the value of the {@code materialType} field. */
        @NativeType("XrSoundObstacleMaterialTypeBD")
        public int materialType() { return XrSoundObstacleMaterialConfigBD.nmaterialType(address()); }
        /** @return the value of the {@code bandCount} field. */
        @NativeType("uint32_t")
        public int bandCount() { return XrSoundObstacleMaterialConfigBD.nbandCount(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code bandFrequencies} field. */
        @NativeType("float *")
        public FloatBuffer bandFrequencies() { return XrSoundObstacleMaterialConfigBD.nbandFrequencies(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code bandAbsorptions} field. */
        @NativeType("float *")
        public FloatBuffer bandAbsorptions() { return XrSoundObstacleMaterialConfigBD.nbandAbsorptions(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code bandScatterings} field. */
        @NativeType("float *")
        public FloatBuffer bandScatterings() { return XrSoundObstacleMaterialConfigBD.nbandScatterings(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code bandTransmissions} field. */
        @NativeType("float *")
        public FloatBuffer bandTransmissions() { return XrSoundObstacleMaterialConfigBD.nbandTransmissions(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSoundObstacleMaterialConfigBD.Buffer type(@NativeType("XrStructureType") int value) { XrSoundObstacleMaterialConfigBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBSTACLE_MATERIAL_CONFIG_BD TYPE_SOUND_OBSTACLE_MATERIAL_CONFIG_BD} value to the {@code type} field. */
        public XrSoundObstacleMaterialConfigBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBSTACLE_MATERIAL_CONFIG_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSoundObstacleMaterialConfigBD.Buffer next(@NativeType("void const *") long value) { XrSoundObstacleMaterialConfigBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code materialType} field. */
        public XrSoundObstacleMaterialConfigBD.Buffer materialType(@NativeType("XrSoundObstacleMaterialTypeBD") int value) { XrSoundObstacleMaterialConfigBD.nmaterialType(address(), value); return this; }
        /** Sets the specified value to the {@code bandCount} field. */
        public XrSoundObstacleMaterialConfigBD.Buffer bandCount(@NativeType("uint32_t") int value) { XrSoundObstacleMaterialConfigBD.nbandCount(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code bandFrequencies} field. */
        public XrSoundObstacleMaterialConfigBD.Buffer bandFrequencies(@NativeType("float *") FloatBuffer value) { XrSoundObstacleMaterialConfigBD.nbandFrequencies(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code bandAbsorptions} field. */
        public XrSoundObstacleMaterialConfigBD.Buffer bandAbsorptions(@NativeType("float *") FloatBuffer value) { XrSoundObstacleMaterialConfigBD.nbandAbsorptions(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code bandScatterings} field. */
        public XrSoundObstacleMaterialConfigBD.Buffer bandScatterings(@NativeType("float *") FloatBuffer value) { XrSoundObstacleMaterialConfigBD.nbandScatterings(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code bandTransmissions} field. */
        public XrSoundObstacleMaterialConfigBD.Buffer bandTransmissions(@NativeType("float *") FloatBuffer value) { XrSoundObstacleMaterialConfigBD.nbandTransmissions(address(), value); return this; }

    }

}