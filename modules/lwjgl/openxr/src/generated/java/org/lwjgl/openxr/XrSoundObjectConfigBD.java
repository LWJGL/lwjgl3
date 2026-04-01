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
 * <pre><code>
 * struct XrSoundObjectConfigBD {
 *     XrStructureType type;
 *     void const * next;
 *     XrBool32 enabled;
 *     {@link XrPosef XrPosef} pose;
 *     XrSpace baseSpace;
 *     float mainVolume;
 *     float reflectionGain;
 *     XrBool32 enableDoppler;
 *     {@link XrSoundObjectDistanceAttenuationBD XrSoundObjectDistanceAttenuationBD} const * directSoundAttenuation;
 *     {@link XrSoundObjectDistanceAttenuationBD XrSoundObjectDistanceAttenuationBD} const * indirectSoundAttenuation;
 * }</code></pre>
 */
public class XrSoundObjectConfigBD extends Struct<XrSoundObjectConfigBD> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        ENABLED,
        POSE,
        BASESPACE,
        MAINVOLUME,
        REFLECTIONGAIN,
        ENABLEDOPPLER,
        DIRECTSOUNDATTENUATION,
        INDIRECTSOUNDATTENUATION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        ENABLED = layout.offsetof(2);
        POSE = layout.offsetof(3);
        BASESPACE = layout.offsetof(4);
        MAINVOLUME = layout.offsetof(5);
        REFLECTIONGAIN = layout.offsetof(6);
        ENABLEDOPPLER = layout.offsetof(7);
        DIRECTSOUNDATTENUATION = layout.offsetof(8);
        INDIRECTSOUNDATTENUATION = layout.offsetof(9);
    }

    protected XrSoundObjectConfigBD(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrSoundObjectConfigBD create(long address, @Nullable ByteBuffer container) {
        return new XrSoundObjectConfigBD(address, container);
    }

    /**
     * Creates a {@code XrSoundObjectConfigBD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrSoundObjectConfigBD(ByteBuffer container) {
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
    /** @return the value of the {@code enabled} field. */
    @NativeType("XrBool32")
    public boolean enabled() { return nenabled(address()) != 0; }
    /** @return a {@link XrPosef} view of the {@code pose} field. */
    public XrPosef pose() { return npose(address()); }
    /** @return the value of the {@code baseSpace} field. */
    @NativeType("XrSpace")
    public long baseSpace() { return nbaseSpace(address()); }
    /** @return the value of the {@code mainVolume} field. */
    public float mainVolume() { return nmainVolume(address()); }
    /** @return the value of the {@code reflectionGain} field. */
    public float reflectionGain() { return nreflectionGain(address()); }
    /** @return the value of the {@code enableDoppler} field. */
    @NativeType("XrBool32")
    public boolean enableDoppler() { return nenableDoppler(address()) != 0; }
    /** @return a {@link XrSoundObjectDistanceAttenuationBD} view of the struct pointed to by the {@code directSoundAttenuation} field. */
    @NativeType("XrSoundObjectDistanceAttenuationBD const *")
    public XrSoundObjectDistanceAttenuationBD directSoundAttenuation() { return ndirectSoundAttenuation(address()); }
    /** @return a {@link XrSoundObjectDistanceAttenuationBD} view of the struct pointed to by the {@code indirectSoundAttenuation} field. */
    @NativeType("XrSoundObjectDistanceAttenuationBD const *")
    public XrSoundObjectDistanceAttenuationBD indirectSoundAttenuation() { return nindirectSoundAttenuation(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrSoundObjectConfigBD type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBJECT_CONFIG_BD TYPE_SOUND_OBJECT_CONFIG_BD} value to the {@code type} field. */
    public XrSoundObjectConfigBD type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBJECT_CONFIG_BD); }
    /** Sets the specified value to the {@code next} field. */
    public XrSoundObjectConfigBD next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Prepends the specified {@link XrSoundObjectDirectivityCardioidBD} value to the {@code next} chain. */
    public XrSoundObjectConfigBD next(XrSoundObjectDirectivityCardioidBD value) { return this.next(value.next(this.next()).address()); }
    /** Prepends the specified {@link XrSoundObjectShapeSphereBD} value to the {@code next} chain. */
    public XrSoundObjectConfigBD next(XrSoundObjectShapeSphereBD value) { return this.next(value.next(this.next()).address()); }
    /** Sets the specified value to the {@code enabled} field. */
    public XrSoundObjectConfigBD enabled(@NativeType("XrBool32") boolean value) { nenabled(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link XrPosef} to the {@code pose} field. */
    public XrSoundObjectConfigBD pose(XrPosef value) { npose(address(), value); return this; }
    /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrSoundObjectConfigBD pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
    /** Sets the specified value to the {@code baseSpace} field. */
    public XrSoundObjectConfigBD baseSpace(XrSpace value) { nbaseSpace(address(), value); return this; }
    /** Sets the specified value to the {@code mainVolume} field. */
    public XrSoundObjectConfigBD mainVolume(float value) { nmainVolume(address(), value); return this; }
    /** Sets the specified value to the {@code reflectionGain} field. */
    public XrSoundObjectConfigBD reflectionGain(float value) { nreflectionGain(address(), value); return this; }
    /** Sets the specified value to the {@code enableDoppler} field. */
    public XrSoundObjectConfigBD enableDoppler(@NativeType("XrBool32") boolean value) { nenableDoppler(address(), value ? 1 : 0); return this; }
    /** Sets the address of the specified {@link XrSoundObjectDistanceAttenuationBD} to the {@code directSoundAttenuation} field. */
    public XrSoundObjectConfigBD directSoundAttenuation(@NativeType("XrSoundObjectDistanceAttenuationBD const *") XrSoundObjectDistanceAttenuationBD value) { ndirectSoundAttenuation(address(), value); return this; }
    /** Sets the address of the specified {@link XrSoundObjectDistanceAttenuationBD} to the {@code indirectSoundAttenuation} field. */
    public XrSoundObjectConfigBD indirectSoundAttenuation(@NativeType("XrSoundObjectDistanceAttenuationBD const *") XrSoundObjectDistanceAttenuationBD value) { nindirectSoundAttenuation(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrSoundObjectConfigBD set(
        int type,
        long next,
        boolean enabled,
        XrPosef pose,
        XrSpace baseSpace,
        float mainVolume,
        float reflectionGain,
        boolean enableDoppler,
        XrSoundObjectDistanceAttenuationBD directSoundAttenuation,
        XrSoundObjectDistanceAttenuationBD indirectSoundAttenuation
    ) {
        type(type);
        next(next);
        enabled(enabled);
        pose(pose);
        baseSpace(baseSpace);
        mainVolume(mainVolume);
        reflectionGain(reflectionGain);
        enableDoppler(enableDoppler);
        directSoundAttenuation(directSoundAttenuation);
        indirectSoundAttenuation(indirectSoundAttenuation);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrSoundObjectConfigBD set(XrSoundObjectConfigBD src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrSoundObjectConfigBD} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrSoundObjectConfigBD malloc() {
        return new XrSoundObjectConfigBD(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObjectConfigBD} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrSoundObjectConfigBD calloc() {
        return new XrSoundObjectConfigBD(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrSoundObjectConfigBD} instance allocated with {@link BufferUtils}. */
    public static XrSoundObjectConfigBD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrSoundObjectConfigBD(memAddress(container), container);
    }

    /** Returns a new {@code XrSoundObjectConfigBD} instance for the specified memory address. */
    public static XrSoundObjectConfigBD create(long address) {
        return new XrSoundObjectConfigBD(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrSoundObjectConfigBD createSafe(long address) {
        return address == NULL ? null : new XrSoundObjectConfigBD(address, null);
    }

    /**
     * Returns a new {@link XrSoundObjectConfigBD.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectConfigBD.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectConfigBD.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectConfigBD.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectConfigBD.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectConfigBD.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrSoundObjectConfigBD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectConfigBD.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrSoundObjectConfigBD.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrSoundObjectConfigBD} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObjectConfigBD malloc(MemoryStack stack) {
        return new XrSoundObjectConfigBD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrSoundObjectConfigBD} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrSoundObjectConfigBD calloc(MemoryStack stack) {
        return new XrSoundObjectConfigBD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrSoundObjectConfigBD.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectConfigBD.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrSoundObjectConfigBD.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrSoundObjectConfigBD.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return memGetInt(struct + XrSoundObjectConfigBD.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrSoundObjectConfigBD.NEXT); }
    /** Unsafe version of {@link #enabled}. */
    public static int nenabled(long struct) { return memGetInt(struct + XrSoundObjectConfigBD.ENABLED); }
    /** Unsafe version of {@link #pose}. */
    public static XrPosef npose(long struct) { return XrPosef.create(struct + XrSoundObjectConfigBD.POSE); }
    /** Unsafe version of {@link #baseSpace}. */
    public static long nbaseSpace(long struct) { return memGetAddress(struct + XrSoundObjectConfigBD.BASESPACE); }
    /** Unsafe version of {@link #mainVolume}. */
    public static float nmainVolume(long struct) { return memGetFloat(struct + XrSoundObjectConfigBD.MAINVOLUME); }
    /** Unsafe version of {@link #reflectionGain}. */
    public static float nreflectionGain(long struct) { return memGetFloat(struct + XrSoundObjectConfigBD.REFLECTIONGAIN); }
    /** Unsafe version of {@link #enableDoppler}. */
    public static int nenableDoppler(long struct) { return memGetInt(struct + XrSoundObjectConfigBD.ENABLEDOPPLER); }
    /** Unsafe version of {@link #directSoundAttenuation}. */
    public static XrSoundObjectDistanceAttenuationBD ndirectSoundAttenuation(long struct) { return XrSoundObjectDistanceAttenuationBD.create(memGetAddress(struct + XrSoundObjectConfigBD.DIRECTSOUNDATTENUATION)); }
    /** Unsafe version of {@link #indirectSoundAttenuation}. */
    public static XrSoundObjectDistanceAttenuationBD nindirectSoundAttenuation(long struct) { return XrSoundObjectDistanceAttenuationBD.create(memGetAddress(struct + XrSoundObjectConfigBD.INDIRECTSOUNDATTENUATION)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { memPutInt(struct + XrSoundObjectConfigBD.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrSoundObjectConfigBD.NEXT, value); }
    /** Unsafe version of {@link #enabled(boolean) enabled}. */
    public static void nenabled(long struct, int value) { memPutInt(struct + XrSoundObjectConfigBD.ENABLED, value); }
    /** Unsafe version of {@link #pose(XrPosef) pose}. */
    public static void npose(long struct, XrPosef value) { memCopy(value.address(), struct + XrSoundObjectConfigBD.POSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #baseSpace(XrSpace) baseSpace}. */
    public static void nbaseSpace(long struct, XrSpace value) { memPutAddress(struct + XrSoundObjectConfigBD.BASESPACE, value.address()); }
    /** Unsafe version of {@link #mainVolume(float) mainVolume}. */
    public static void nmainVolume(long struct, float value) { memPutFloat(struct + XrSoundObjectConfigBD.MAINVOLUME, value); }
    /** Unsafe version of {@link #reflectionGain(float) reflectionGain}. */
    public static void nreflectionGain(long struct, float value) { memPutFloat(struct + XrSoundObjectConfigBD.REFLECTIONGAIN, value); }
    /** Unsafe version of {@link #enableDoppler(boolean) enableDoppler}. */
    public static void nenableDoppler(long struct, int value) { memPutInt(struct + XrSoundObjectConfigBD.ENABLEDOPPLER, value); }
    /** Unsafe version of {@link #directSoundAttenuation(XrSoundObjectDistanceAttenuationBD) directSoundAttenuation}. */
    public static void ndirectSoundAttenuation(long struct, XrSoundObjectDistanceAttenuationBD value) { memPutAddress(struct + XrSoundObjectConfigBD.DIRECTSOUNDATTENUATION, value.address()); }
    /** Unsafe version of {@link #indirectSoundAttenuation(XrSoundObjectDistanceAttenuationBD) indirectSoundAttenuation}. */
    public static void nindirectSoundAttenuation(long struct, XrSoundObjectDistanceAttenuationBD value) { memPutAddress(struct + XrSoundObjectConfigBD.INDIRECTSOUNDATTENUATION, value.address()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrSoundObjectConfigBD.BASESPACE));
        long directSoundAttenuation = memGetAddress(struct + XrSoundObjectConfigBD.DIRECTSOUNDATTENUATION);
        check(directSoundAttenuation);
        XrSoundObjectDistanceAttenuationBD.validate(directSoundAttenuation);
        long indirectSoundAttenuation = memGetAddress(struct + XrSoundObjectConfigBD.INDIRECTSOUNDATTENUATION);
        check(indirectSoundAttenuation);
        XrSoundObjectDistanceAttenuationBD.validate(indirectSoundAttenuation);
    }

    // -----------------------------------

    /** An array of {@link XrSoundObjectConfigBD} structs. */
    public static class Buffer extends StructBuffer<XrSoundObjectConfigBD, Buffer> implements NativeResource {

        private static final XrSoundObjectConfigBD ELEMENT_FACTORY = XrSoundObjectConfigBD.create(-1L);

        /**
         * Creates a new {@code XrSoundObjectConfigBD.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrSoundObjectConfigBD#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrSoundObjectConfigBD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrSoundObjectConfigBD.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrSoundObjectConfigBD.nnext(address()); }
        /** @return the value of the {@code enabled} field. */
        @NativeType("XrBool32")
        public boolean enabled() { return XrSoundObjectConfigBD.nenabled(address()) != 0; }
        /** @return a {@link XrPosef} view of the {@code pose} field. */
        public XrPosef pose() { return XrSoundObjectConfigBD.npose(address()); }
        /** @return the value of the {@code baseSpace} field. */
        @NativeType("XrSpace")
        public long baseSpace() { return XrSoundObjectConfigBD.nbaseSpace(address()); }
        /** @return the value of the {@code mainVolume} field. */
        public float mainVolume() { return XrSoundObjectConfigBD.nmainVolume(address()); }
        /** @return the value of the {@code reflectionGain} field. */
        public float reflectionGain() { return XrSoundObjectConfigBD.nreflectionGain(address()); }
        /** @return the value of the {@code enableDoppler} field. */
        @NativeType("XrBool32")
        public boolean enableDoppler() { return XrSoundObjectConfigBD.nenableDoppler(address()) != 0; }
        /** @return a {@link XrSoundObjectDistanceAttenuationBD} view of the struct pointed to by the {@code directSoundAttenuation} field. */
        @NativeType("XrSoundObjectDistanceAttenuationBD const *")
        public XrSoundObjectDistanceAttenuationBD directSoundAttenuation() { return XrSoundObjectConfigBD.ndirectSoundAttenuation(address()); }
        /** @return a {@link XrSoundObjectDistanceAttenuationBD} view of the struct pointed to by the {@code indirectSoundAttenuation} field. */
        @NativeType("XrSoundObjectDistanceAttenuationBD const *")
        public XrSoundObjectDistanceAttenuationBD indirectSoundAttenuation() { return XrSoundObjectConfigBD.nindirectSoundAttenuation(address()); }

        /** Sets the specified value to the {@code type} field. */
        public XrSoundObjectConfigBD.Buffer type(@NativeType("XrStructureType") int value) { XrSoundObjectConfigBD.ntype(address(), value); return this; }
        /** Sets the {@link BDSpatialAudioRendering#XR_TYPE_SOUND_OBJECT_CONFIG_BD TYPE_SOUND_OBJECT_CONFIG_BD} value to the {@code type} field. */
        public XrSoundObjectConfigBD.Buffer type$Default() { return type(BDSpatialAudioRendering.XR_TYPE_SOUND_OBJECT_CONFIG_BD); }
        /** Sets the specified value to the {@code next} field. */
        public XrSoundObjectConfigBD.Buffer next(@NativeType("void const *") long value) { XrSoundObjectConfigBD.nnext(address(), value); return this; }
        /** Prepends the specified {@link XrSoundObjectDirectivityCardioidBD} value to the {@code next} chain. */
        public XrSoundObjectConfigBD.Buffer next(XrSoundObjectDirectivityCardioidBD value) { return this.next(value.next(this.next()).address()); }
        /** Prepends the specified {@link XrSoundObjectShapeSphereBD} value to the {@code next} chain. */
        public XrSoundObjectConfigBD.Buffer next(XrSoundObjectShapeSphereBD value) { return this.next(value.next(this.next()).address()); }
        /** Sets the specified value to the {@code enabled} field. */
        public XrSoundObjectConfigBD.Buffer enabled(@NativeType("XrBool32") boolean value) { XrSoundObjectConfigBD.nenabled(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link XrPosef} to the {@code pose} field. */
        public XrSoundObjectConfigBD.Buffer pose(XrPosef value) { XrSoundObjectConfigBD.npose(address(), value); return this; }
        /** Passes the {@code pose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrSoundObjectConfigBD.Buffer pose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(pose()); return this; }
        /** Sets the specified value to the {@code baseSpace} field. */
        public XrSoundObjectConfigBD.Buffer baseSpace(XrSpace value) { XrSoundObjectConfigBD.nbaseSpace(address(), value); return this; }
        /** Sets the specified value to the {@code mainVolume} field. */
        public XrSoundObjectConfigBD.Buffer mainVolume(float value) { XrSoundObjectConfigBD.nmainVolume(address(), value); return this; }
        /** Sets the specified value to the {@code reflectionGain} field. */
        public XrSoundObjectConfigBD.Buffer reflectionGain(float value) { XrSoundObjectConfigBD.nreflectionGain(address(), value); return this; }
        /** Sets the specified value to the {@code enableDoppler} field. */
        public XrSoundObjectConfigBD.Buffer enableDoppler(@NativeType("XrBool32") boolean value) { XrSoundObjectConfigBD.nenableDoppler(address(), value ? 1 : 0); return this; }
        /** Sets the address of the specified {@link XrSoundObjectDistanceAttenuationBD} to the {@code directSoundAttenuation} field. */
        public XrSoundObjectConfigBD.Buffer directSoundAttenuation(@NativeType("XrSoundObjectDistanceAttenuationBD const *") XrSoundObjectDistanceAttenuationBD value) { XrSoundObjectConfigBD.ndirectSoundAttenuation(address(), value); return this; }
        /** Sets the address of the specified {@link XrSoundObjectDistanceAttenuationBD} to the {@code indirectSoundAttenuation} field. */
        public XrSoundObjectConfigBD.Buffer indirectSoundAttenuation(@NativeType("XrSoundObjectDistanceAttenuationBD const *") XrSoundObjectDistanceAttenuationBD value) { XrSoundObjectConfigBD.nindirectSoundAttenuation(address(), value); return this; }

    }

}