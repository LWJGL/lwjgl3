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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre><code>
 * struct XrSoundObjectDistanceAttenuationBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrSoundObjectDistanceAttenuationTypeBD distanceAttenuationType;
 *     float minAttenuationRange;
 *     float maxAttenuationRange;
 *     float referenceDistance;
 *     float rolloffFactor;
 *     {@link XrSoundObjectDistanceAttenuationCurveBD XrSoundObjectDistanceAttenuationCurveBD} * customDistanceAttenuationCurve;
 * }</code></pre>
 */
public class XrSoundObjectDistanceAttenuationBD extends Struct<XrSoundObjectDistanceAttenuationBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        DISTANCEATTENUATIONTYPE,
        MINATTENUATIONRANGE,
        MAXATTENUATIONRANGE,
        REFERENCEDISTANCE,
        ROLLOFFFACTOR,
        CUSTOMDISTANCEATTENUATIONCURVE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        DISTANCEATTENUATIONTYPE = layout.offsetof(2);
        MINATTENUATIONRANGE = layout.offsetof(3);
        MAXATTENUATIONRANGE = layout.offsetof(4);
        REFERENCEDISTANCE = layout.offsetof(5);
        ROLLOFFFACTOR = layout.offsetof(6);
        CUSTOMDISTANCEATTENUATIONCURVE = layout.offsetof(7);
    }

    protected XrSoundObjectDistanceAttenuationBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSoundObjectDistanceAttenuationBD create(long address, @Nullable ByteBuffer container) {
        return new XrSoundObjectDistanceAttenuationBD(address, container);
    }

    /**
     * Creates a {@code XrSoundObjectDistanceAttenuationBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSoundObjectDistanceAttenuationBD(ByteBuffer container) {
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
    /** @return the value of the {@code distanceAttenuationType} field. */
    @NativeType("XrSoundObjectDistanceAttenuationTypeBD")
    public int distanceAttenuationType() { return ndistanceAttenuationType(address()); }
    /** @return the value of the {@code minAttenuationRange} field. */
    public float minAttenuationRange() { return nminAttenuationRange(address()); }
    /** @return the value of the {@code maxAttenuationRange} field. */
    public float maxAttenuationRange() { return nmaxAttenuationRange(address()); }
    /** @return the value of the {@code referenceDistance} field. */
    public float referenceDistance() { return nreferenceDistance(address()); }
    /** @return the value of the {@code rolloffFactor} field. */
    public float rolloffFactor() { return nrolloffFactor(address()); }
    /** @return a {@link XrSoundObjectDistanceAttenuationCurveBD} view of the struct pointed to by the {@code customDistanceAttenuationCurve} field. */
    @NativeType("XrSoundObjectDistanceAttenuationCurveBD *")
    public @Nullable XrSoundObjectDistanceAttenuationCurveBD customDistanceAttenuationCurve() { return ncustomDistanceAttenuationCurve(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSoundObjectDistanceAttenuationBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_BD TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_BD} value to the {@code type} field. */
    public XrSoundObjectDistanceAttenuationBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSoundObjectDistanceAttenuationBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code distanceAttenuationType} field. */
    public XrSoundObjectDistanceAttenuationBD distanceAttenuationType(@NativeType("XrSoundObjectDistanceAttenuationTypeBD") int value) { ndistanceAttenuationType(address(), value); return this; }
    /** Sets the specified value to the {@code minAttenuationRange} field. */
    public XrSoundObjectDistanceAttenuationBD minAttenuationRange(float value) { nminAttenuationRange(address(), value); return this; }
    /** Sets the specified value to the {@code maxAttenuationRange} field. */
    public XrSoundObjectDistanceAttenuationBD maxAttenuationRange(float value) { nmaxAttenuationRange(address(), value); return this; }
    /** Sets the specified value to the {@code referenceDistance} field. */
    public XrSoundObjectDistanceAttenuationBD referenceDistance(float value) { nreferenceDistance(address(), value); return this; }
    /** Sets the specified value to the {@code rolloffFactor} field. */
    public XrSoundObjectDistanceAttenuationBD rolloffFactor(float value) { nrolloffFactor(address(), value); return this; }
    /** Sets the address of the specified {@link XrSoundObjectDistanceAttenuationCurveBD} to the {@code customDistanceAttenuationCurve} field. */
    public XrSoundObjectDistanceAttenuationBD customDistanceAttenuationCurve(@Nullable @NativeType("XrSoundObjectDistanceAttenuationCurveBD *") XrSoundObjectDistanceAttenuationCurveBD value) { ncustomDistanceAttenuationCurve(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSoundObjectDistanceAttenuationBD set(
        int type,
        long next,
        int distanceAttenuationType,
        float minAttenuationRange,
        float maxAttenuationRange,
        float referenceDistance,
        float rolloffFactor,
        @Nullable XrSoundObjectDistanceAttenuationCurveBD customDistanceAttenuationCurve
    ) {
        type(type);
        next(next);
        distanceAttenuationType(distanceAttenuationType);
        minAttenuationRange(minAttenuationRange);
        maxAttenuationRange(maxAttenuationRange);
        referenceDistance(referenceDistance);
        rolloffFactor(rolloffFactor);
        customDistanceAttenuationCurve(customDistanceAttenuationCurve);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSoundObjectDistanceAttenuationBD set(XrSoundObjectDistanceAttenuationBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSoundObjectDistanceAttenuationBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSoundObjectDistanceAttenuationBD malloc() {
        return new XrSoundObjectDistanceAttenuationBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObjectDistanceAttenuationBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSoundObjectDistanceAttenuationBD calloc() {
        return new XrSoundObjectDistanceAttenuationBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObjectDistanceAttenuationBD} instance allocated with {@link BufferUtils}. */
    public static XrSoundObjectDistanceAttenuationBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSoundObjectDistanceAttenuationBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSoundObjectDistanceAttenuationBD} instance for the specified memory address. */
    public static XrSoundObjectDistanceAttenuationBD create(long address) {
        return new XrSoundObjectDistanceAttenuationBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSoundObjectDistanceAttenuationBD createSafe(long address) {
        return address == NULL ? null : new XrSoundObjectDistanceAttenuationBD(address, null);
    }

    /**
     * Returns a new {@link XrSoundObjectDistanceAttenuationBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectDistanceAttenuationBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectDistanceAttenuationBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSoundObjectDistanceAttenuationBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSoundObjectDistanceAttenuationBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSoundObjectDistanceAttenuationBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObjectDistanceAttenuationBD malloc(MemoryStack stack) {
        return new XrSoundObjectDistanceAttenuationBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSoundObjectDistanceAttenuationBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObjectDistanceAttenuationBD calloc(MemoryStack stack) {
        return new XrSoundObjectDistanceAttenuationBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSoundObjectDistanceAttenuationBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectDistanceAttenuationBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectDistanceAttenuationBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSoundObjectDistanceAttenuationBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSoundObjectDistanceAttenuationBD.NEXT); }
    /** Unsafe version of {@link #distanceAttenuationType}. */
    public static int ndistanceAttenuationType(long struct) { return memGetInt(struct + XrSoundObjectDistanceAttenuationBD.DISTANCEATTENUATIONTYPE); }
    /** Unsafe version of {@link #minAttenuationRange}. */
    public static float nminAttenuationRange(long struct) { return memGetFloat(struct + XrSoundObjectDistanceAttenuationBD.MINATTENUATIONRANGE); }
    /** Unsafe version of {@link #maxAttenuationRange}. */
    public static float nmaxAttenuationRange(long struct) { return memGetFloat(struct + XrSoundObjectDistanceAttenuationBD.MAXATTENUATIONRANGE); }
    /** Unsafe version of {@link #referenceDistance}. */
    public static float nreferenceDistance(long struct) { return memGetFloat(struct + XrSoundObjectDistanceAttenuationBD.REFERENCEDISTANCE); }
    /** Unsafe version of {@link #rolloffFactor}. */
    public static float nrolloffFactor(long struct) { return memGetFloat(struct + XrSoundObjectDistanceAttenuationBD.ROLLOFFFACTOR); }
    /** Unsafe version of {@link #customDistanceAttenuationCurve}. */
    public static @Nullable XrSoundObjectDistanceAttenuationCurveBD ncustomDistanceAttenuationCurve(long struct) { return XrSoundObjectDistanceAttenuationCurveBD.createSafe(memGetAddress(struct + XrSoundObjectDistanceAttenuationBD.CUSTOMDISTANCEATTENUATIONCURVE)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSoundObjectDistanceAttenuationBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSoundObjectDistanceAttenuationBD.NEXT, value); }
    /** Unsafe version of {@link #distanceAttenuationType(int) distanceAttenuationType}. */
    public static void ndistanceAttenuationType(long struct, int value) { memPutInt(struct + XrSoundObjectDistanceAttenuationBD.DISTANCEATTENUATIONTYPE, value); }
    /** Unsafe version of {@link #minAttenuationRange(float) minAttenuationRange}. */
    public static void nminAttenuationRange(long struct, float value) { memPutFloat(struct + XrSoundObjectDistanceAttenuationBD.MINATTENUATIONRANGE, value); }
    /** Unsafe version of {@link #maxAttenuationRange(float) maxAttenuationRange}. */
    public static void nmaxAttenuationRange(long struct, float value) { memPutFloat(struct + XrSoundObjectDistanceAttenuationBD.MAXATTENUATIONRANGE, value); }
    /** Unsafe version of {@link #referenceDistance(float) referenceDistance}. */
    public static void nreferenceDistance(long struct, float value) { memPutFloat(struct + XrSoundObjectDistanceAttenuationBD.REFERENCEDISTANCE, value); }
    /** Unsafe version of {@link #rolloffFactor(float) rolloffFactor}. */
    public static void nrolloffFactor(long struct, float value) { memPutFloat(struct + XrSoundObjectDistanceAttenuationBD.ROLLOFFFACTOR, value); }
    /** Unsafe version of {@link #customDistanceAttenuationCurve(XrSoundObjectDistanceAttenuationCurveBD) customDistanceAttenuationCurve}. */
    public static void ncustomDistanceAttenuationCurve(long struct, @Nullable XrSoundObjectDistanceAttenuationCurveBD value) { memPutAddress(struct + XrSoundObjectDistanceAttenuationBD.CUSTOMDISTANCEATTENUATIONCURVE, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        long customDistanceAttenuationCurve = memGetAddress(struct + XrSoundObjectDistanceAttenuationBD.CUSTOMDISTANCEATTENUATIONCURVE);
        if (customDistanceAttenuationCurve != NULL) {
            XrSoundObjectDistanceAttenuationCurveBD.validate(customDistanceAttenuationCurve);
        }
    }

    // -----------------------------------

    /** An array of {@link XrSoundObjectDistanceAttenuationBD} structs. */
    public static class Buffer extends StructBuffer<XrSoundObjectDistanceAttenuationBD, Buffer> implements NativeResource {

        private static final XrSoundObjectDistanceAttenuationBD ELEMENT_FACTORY = XrSoundObjectDistanceAttenuationBD.create(-1L);

        /**
         * Creates a new {@code XrSoundObjectDistanceAttenuationBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSoundObjectDistanceAttenuationBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSoundObjectDistanceAttenuationBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSoundObjectDistanceAttenuationBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSoundObjectDistanceAttenuationBD.nnext(address()); }
        /** @return the value of the {@code distanceAttenuationType} field. */
        @NativeType("XrSoundObjectDistanceAttenuationTypeBD")
        public int distanceAttenuationType() { return XrSoundObjectDistanceAttenuationBD.ndistanceAttenuationType(address()); }
        /** @return the value of the {@code minAttenuationRange} field. */
        public float minAttenuationRange() { return XrSoundObjectDistanceAttenuationBD.nminAttenuationRange(address()); }
        /** @return the value of the {@code maxAttenuationRange} field. */
        public float maxAttenuationRange() { return XrSoundObjectDistanceAttenuationBD.nmaxAttenuationRange(address()); }
        /** @return the value of the {@code referenceDistance} field. */
        public float referenceDistance() { return XrSoundObjectDistanceAttenuationBD.nreferenceDistance(address()); }
        /** @return the value of the {@code rolloffFactor} field. */
        public float rolloffFactor() { return XrSoundObjectDistanceAttenuationBD.nrolloffFactor(address()); }
        /** @return a {@link XrSoundObjectDistanceAttenuationCurveBD} view of the struct pointed to by the {@code customDistanceAttenuationCurve} field. */
        @NativeType("XrSoundObjectDistanceAttenuationCurveBD *")
        public @Nullable XrSoundObjectDistanceAttenuationCurveBD customDistanceAttenuationCurve() { return XrSoundObjectDistanceAttenuationBD.ncustomDistanceAttenuationCurve(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSoundObjectDistanceAttenuationBD.Buffer type(@NativeType("XrStructureType") int value) { XrSoundObjectDistanceAttenuationBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_BD TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_BD} value to the {@code type} field. */
        public XrSoundObjectDistanceAttenuationBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBJECT_DISTANCE_ATTENUATION_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSoundObjectDistanceAttenuationBD.Buffer next(@NativeType("void const *") long value) { XrSoundObjectDistanceAttenuationBD.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code distanceAttenuationType} field. */
        public XrSoundObjectDistanceAttenuationBD.Buffer distanceAttenuationType(@NativeType("XrSoundObjectDistanceAttenuationTypeBD") int value) { XrSoundObjectDistanceAttenuationBD.ndistanceAttenuationType(address(), value); return this; }
        /** Sets the specified value to the {@code minAttenuationRange} field. */
        public XrSoundObjectDistanceAttenuationBD.Buffer minAttenuationRange(float value) { XrSoundObjectDistanceAttenuationBD.nminAttenuationRange(address(), value); return this; }
        /** Sets the specified value to the {@code maxAttenuationRange} field. */
        public XrSoundObjectDistanceAttenuationBD.Buffer maxAttenuationRange(float value) { XrSoundObjectDistanceAttenuationBD.nmaxAttenuationRange(address(), value); return this; }
        /** Sets the specified value to the {@code referenceDistance} field. */
        public XrSoundObjectDistanceAttenuationBD.Buffer referenceDistance(float value) { XrSoundObjectDistanceAttenuationBD.nreferenceDistance(address(), value); return this; }
        /** Sets the specified value to the {@code rolloffFactor} field. */
        public XrSoundObjectDistanceAttenuationBD.Buffer rolloffFactor(float value) { XrSoundObjectDistanceAttenuationBD.nrolloffFactor(address(), value); return this; }
        /** Sets the address of the specified {@link XrSoundObjectDistanceAttenuationCurveBD} to the {@code customDistanceAttenuationCurve} field. */
        public XrSoundObjectDistanceAttenuationBD.Buffer customDistanceAttenuationCurve(@Nullable @NativeType("XrSoundObjectDistanceAttenuationCurveBD *") XrSoundObjectDistanceAttenuationCurveBD value) { XrSoundObjectDistanceAttenuationBD.ncustomDistanceAttenuationCurve(address(), value); return this; }

    }

}