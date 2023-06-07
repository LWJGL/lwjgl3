/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.fmod;

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
 * struct FMOD_REVERB_PROPERTIES {
 *     float DecayTime;
 *     float EarlyDelay;
 *     float LateDelay;
 *     float HFReference;
 *     float HFDecayRatio;
 *     float Diffusion;
 *     float Density;
 *     float LowShelfFrequency;
 *     float LowShelfGain;
 *     float HighCut;
 *     float EarlyLateMix;
 *     float WetLevel;
 * }</code></pre>
 */
public class FMOD_REVERB_PROPERTIES extends Struct<FMOD_REVERB_PROPERTIES> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        DECAYTIME,
        EARLYDELAY,
        LATEDELAY,
        HFREFERENCE,
        HFDECAYRATIO,
        DIFFUSION,
        DENSITY,
        LOWSHELFFREQUENCY,
        LOWSHELFGAIN,
        HIGHCUT,
        EARLYLATEMIX,
        WETLEVEL;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        DECAYTIME = layout.offsetof(0);
        EARLYDELAY = layout.offsetof(1);
        LATEDELAY = layout.offsetof(2);
        HFREFERENCE = layout.offsetof(3);
        HFDECAYRATIO = layout.offsetof(4);
        DIFFUSION = layout.offsetof(5);
        DENSITY = layout.offsetof(6);
        LOWSHELFFREQUENCY = layout.offsetof(7);
        LOWSHELFGAIN = layout.offsetof(8);
        HIGHCUT = layout.offsetof(9);
        EARLYLATEMIX = layout.offsetof(10);
        WETLEVEL = layout.offsetof(11);
    }

    protected FMOD_REVERB_PROPERTIES(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected FMOD_REVERB_PROPERTIES create(long address, @Nullable ByteBuffer container) {
        return new FMOD_REVERB_PROPERTIES(address, container);
    }

    /**
     * Creates a {@code FMOD_REVERB_PROPERTIES} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public FMOD_REVERB_PROPERTIES(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code DecayTime} field. */
    public float DecayTime() { return nDecayTime(address()); }
    /** @return the value of the {@code EarlyDelay} field. */
    public float EarlyDelay() { return nEarlyDelay(address()); }
    /** @return the value of the {@code LateDelay} field. */
    public float LateDelay() { return nLateDelay(address()); }
    /** @return the value of the {@code HFReference} field. */
    public float HFReference() { return nHFReference(address()); }
    /** @return the value of the {@code HFDecayRatio} field. */
    public float HFDecayRatio() { return nHFDecayRatio(address()); }
    /** @return the value of the {@code Diffusion} field. */
    public float Diffusion() { return nDiffusion(address()); }
    /** @return the value of the {@code Density} field. */
    public float Density() { return nDensity(address()); }
    /** @return the value of the {@code LowShelfFrequency} field. */
    public float LowShelfFrequency() { return nLowShelfFrequency(address()); }
    /** @return the value of the {@code LowShelfGain} field. */
    public float LowShelfGain() { return nLowShelfGain(address()); }
    /** @return the value of the {@code HighCut} field. */
    public float HighCut() { return nHighCut(address()); }
    /** @return the value of the {@code EarlyLateMix} field. */
    public float EarlyLateMix() { return nEarlyLateMix(address()); }
    /** @return the value of the {@code WetLevel} field. */
    public float WetLevel() { return nWetLevel(address()); }

    /** Sets the specified value to the {@code DecayTime} field. */
    public FMOD_REVERB_PROPERTIES DecayTime(float value) { nDecayTime(address(), value); return this; }
    /** Sets the specified value to the {@code EarlyDelay} field. */
    public FMOD_REVERB_PROPERTIES EarlyDelay(float value) { nEarlyDelay(address(), value); return this; }
    /** Sets the specified value to the {@code LateDelay} field. */
    public FMOD_REVERB_PROPERTIES LateDelay(float value) { nLateDelay(address(), value); return this; }
    /** Sets the specified value to the {@code HFReference} field. */
    public FMOD_REVERB_PROPERTIES HFReference(float value) { nHFReference(address(), value); return this; }
    /** Sets the specified value to the {@code HFDecayRatio} field. */
    public FMOD_REVERB_PROPERTIES HFDecayRatio(float value) { nHFDecayRatio(address(), value); return this; }
    /** Sets the specified value to the {@code Diffusion} field. */
    public FMOD_REVERB_PROPERTIES Diffusion(float value) { nDiffusion(address(), value); return this; }
    /** Sets the specified value to the {@code Density} field. */
    public FMOD_REVERB_PROPERTIES Density(float value) { nDensity(address(), value); return this; }
    /** Sets the specified value to the {@code LowShelfFrequency} field. */
    public FMOD_REVERB_PROPERTIES LowShelfFrequency(float value) { nLowShelfFrequency(address(), value); return this; }
    /** Sets the specified value to the {@code LowShelfGain} field. */
    public FMOD_REVERB_PROPERTIES LowShelfGain(float value) { nLowShelfGain(address(), value); return this; }
    /** Sets the specified value to the {@code HighCut} field. */
    public FMOD_REVERB_PROPERTIES HighCut(float value) { nHighCut(address(), value); return this; }
    /** Sets the specified value to the {@code EarlyLateMix} field. */
    public FMOD_REVERB_PROPERTIES EarlyLateMix(float value) { nEarlyLateMix(address(), value); return this; }
    /** Sets the specified value to the {@code WetLevel} field. */
    public FMOD_REVERB_PROPERTIES WetLevel(float value) { nWetLevel(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public FMOD_REVERB_PROPERTIES set(
        float DecayTime,
        float EarlyDelay,
        float LateDelay,
        float HFReference,
        float HFDecayRatio,
        float Diffusion,
        float Density,
        float LowShelfFrequency,
        float LowShelfGain,
        float HighCut,
        float EarlyLateMix,
        float WetLevel
    ) {
        DecayTime(DecayTime);
        EarlyDelay(EarlyDelay);
        LateDelay(LateDelay);
        HFReference(HFReference);
        HFDecayRatio(HFDecayRatio);
        Diffusion(Diffusion);
        Density(Density);
        LowShelfFrequency(LowShelfFrequency);
        LowShelfGain(LowShelfGain);
        HighCut(HighCut);
        EarlyLateMix(EarlyLateMix);
        WetLevel(WetLevel);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public FMOD_REVERB_PROPERTIES set(FMOD_REVERB_PROPERTIES src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code FMOD_REVERB_PROPERTIES} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static FMOD_REVERB_PROPERTIES malloc() {
        return new FMOD_REVERB_PROPERTIES(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code FMOD_REVERB_PROPERTIES} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static FMOD_REVERB_PROPERTIES calloc() {
        return new FMOD_REVERB_PROPERTIES(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code FMOD_REVERB_PROPERTIES} instance allocated with {@link BufferUtils}. */
    public static FMOD_REVERB_PROPERTIES create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new FMOD_REVERB_PROPERTIES(memAddress(container), container);
    }

    /** Returns a new {@code FMOD_REVERB_PROPERTIES} instance for the specified memory address. */
    public static FMOD_REVERB_PROPERTIES create(long address) {
        return new FMOD_REVERB_PROPERTIES(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_REVERB_PROPERTIES createSafe(long address) {
        return address == NULL ? null : new FMOD_REVERB_PROPERTIES(address, null);
    }

    /**
     * Returns a new {@link FMOD_REVERB_PROPERTIES.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_REVERB_PROPERTIES.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link FMOD_REVERB_PROPERTIES.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_REVERB_PROPERTIES.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_REVERB_PROPERTIES.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static FMOD_REVERB_PROPERTIES.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link FMOD_REVERB_PROPERTIES.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static FMOD_REVERB_PROPERTIES.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static FMOD_REVERB_PROPERTIES.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code FMOD_REVERB_PROPERTIES} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_REVERB_PROPERTIES malloc(MemoryStack stack) {
        return new FMOD_REVERB_PROPERTIES(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code FMOD_REVERB_PROPERTIES} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static FMOD_REVERB_PROPERTIES calloc(MemoryStack stack) {
        return new FMOD_REVERB_PROPERTIES(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link FMOD_REVERB_PROPERTIES.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_REVERB_PROPERTIES.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link FMOD_REVERB_PROPERTIES.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static FMOD_REVERB_PROPERTIES.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #DecayTime}. */
    public static float nDecayTime(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.DECAYTIME); }
    /** Unsafe version of {@link #EarlyDelay}. */
    public static float nEarlyDelay(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.EARLYDELAY); }
    /** Unsafe version of {@link #LateDelay}. */
    public static float nLateDelay(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.LATEDELAY); }
    /** Unsafe version of {@link #HFReference}. */
    public static float nHFReference(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.HFREFERENCE); }
    /** Unsafe version of {@link #HFDecayRatio}. */
    public static float nHFDecayRatio(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.HFDECAYRATIO); }
    /** Unsafe version of {@link #Diffusion}. */
    public static float nDiffusion(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.DIFFUSION); }
    /** Unsafe version of {@link #Density}. */
    public static float nDensity(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.DENSITY); }
    /** Unsafe version of {@link #LowShelfFrequency}. */
    public static float nLowShelfFrequency(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.LOWSHELFFREQUENCY); }
    /** Unsafe version of {@link #LowShelfGain}. */
    public static float nLowShelfGain(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.LOWSHELFGAIN); }
    /** Unsafe version of {@link #HighCut}. */
    public static float nHighCut(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.HIGHCUT); }
    /** Unsafe version of {@link #EarlyLateMix}. */
    public static float nEarlyLateMix(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.EARLYLATEMIX); }
    /** Unsafe version of {@link #WetLevel}. */
    public static float nWetLevel(long struct) { return UNSAFE.getFloat(null, struct + FMOD_REVERB_PROPERTIES.WETLEVEL); }

    /** Unsafe version of {@link #DecayTime(float) DecayTime}. */
    public static void nDecayTime(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.DECAYTIME, value); }
    /** Unsafe version of {@link #EarlyDelay(float) EarlyDelay}. */
    public static void nEarlyDelay(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.EARLYDELAY, value); }
    /** Unsafe version of {@link #LateDelay(float) LateDelay}. */
    public static void nLateDelay(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.LATEDELAY, value); }
    /** Unsafe version of {@link #HFReference(float) HFReference}. */
    public static void nHFReference(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.HFREFERENCE, value); }
    /** Unsafe version of {@link #HFDecayRatio(float) HFDecayRatio}. */
    public static void nHFDecayRatio(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.HFDECAYRATIO, value); }
    /** Unsafe version of {@link #Diffusion(float) Diffusion}. */
    public static void nDiffusion(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.DIFFUSION, value); }
    /** Unsafe version of {@link #Density(float) Density}. */
    public static void nDensity(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.DENSITY, value); }
    /** Unsafe version of {@link #LowShelfFrequency(float) LowShelfFrequency}. */
    public static void nLowShelfFrequency(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.LOWSHELFFREQUENCY, value); }
    /** Unsafe version of {@link #LowShelfGain(float) LowShelfGain}. */
    public static void nLowShelfGain(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.LOWSHELFGAIN, value); }
    /** Unsafe version of {@link #HighCut(float) HighCut}. */
    public static void nHighCut(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.HIGHCUT, value); }
    /** Unsafe version of {@link #EarlyLateMix(float) EarlyLateMix}. */
    public static void nEarlyLateMix(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.EARLYLATEMIX, value); }
    /** Unsafe version of {@link #WetLevel(float) WetLevel}. */
    public static void nWetLevel(long struct, float value) { UNSAFE.putFloat(null, struct + FMOD_REVERB_PROPERTIES.WETLEVEL, value); }

    // -----------------------------------

    /** An array of {@link FMOD_REVERB_PROPERTIES} structs. */
    public static class Buffer extends StructBuffer<FMOD_REVERB_PROPERTIES, Buffer> implements NativeResource {

        private static final FMOD_REVERB_PROPERTIES ELEMENT_FACTORY = FMOD_REVERB_PROPERTIES.create(-1L);

        /**
         * Creates a new {@code FMOD_REVERB_PROPERTIES.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link FMOD_REVERB_PROPERTIES#SIZEOF}, and its mark will be undefined.</p>
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
        protected FMOD_REVERB_PROPERTIES getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code DecayTime} field. */
        public float DecayTime() { return FMOD_REVERB_PROPERTIES.nDecayTime(address()); }
        /** @return the value of the {@code EarlyDelay} field. */
        public float EarlyDelay() { return FMOD_REVERB_PROPERTIES.nEarlyDelay(address()); }
        /** @return the value of the {@code LateDelay} field. */
        public float LateDelay() { return FMOD_REVERB_PROPERTIES.nLateDelay(address()); }
        /** @return the value of the {@code HFReference} field. */
        public float HFReference() { return FMOD_REVERB_PROPERTIES.nHFReference(address()); }
        /** @return the value of the {@code HFDecayRatio} field. */
        public float HFDecayRatio() { return FMOD_REVERB_PROPERTIES.nHFDecayRatio(address()); }
        /** @return the value of the {@code Diffusion} field. */
        public float Diffusion() { return FMOD_REVERB_PROPERTIES.nDiffusion(address()); }
        /** @return the value of the {@code Density} field. */
        public float Density() { return FMOD_REVERB_PROPERTIES.nDensity(address()); }
        /** @return the value of the {@code LowShelfFrequency} field. */
        public float LowShelfFrequency() { return FMOD_REVERB_PROPERTIES.nLowShelfFrequency(address()); }
        /** @return the value of the {@code LowShelfGain} field. */
        public float LowShelfGain() { return FMOD_REVERB_PROPERTIES.nLowShelfGain(address()); }
        /** @return the value of the {@code HighCut} field. */
        public float HighCut() { return FMOD_REVERB_PROPERTIES.nHighCut(address()); }
        /** @return the value of the {@code EarlyLateMix} field. */
        public float EarlyLateMix() { return FMOD_REVERB_PROPERTIES.nEarlyLateMix(address()); }
        /** @return the value of the {@code WetLevel} field. */
        public float WetLevel() { return FMOD_REVERB_PROPERTIES.nWetLevel(address()); }

        /** Sets the specified value to the {@code DecayTime} field. */
        public FMOD_REVERB_PROPERTIES.Buffer DecayTime(float value) { FMOD_REVERB_PROPERTIES.nDecayTime(address(), value); return this; }
        /** Sets the specified value to the {@code EarlyDelay} field. */
        public FMOD_REVERB_PROPERTIES.Buffer EarlyDelay(float value) { FMOD_REVERB_PROPERTIES.nEarlyDelay(address(), value); return this; }
        /** Sets the specified value to the {@code LateDelay} field. */
        public FMOD_REVERB_PROPERTIES.Buffer LateDelay(float value) { FMOD_REVERB_PROPERTIES.nLateDelay(address(), value); return this; }
        /** Sets the specified value to the {@code HFReference} field. */
        public FMOD_REVERB_PROPERTIES.Buffer HFReference(float value) { FMOD_REVERB_PROPERTIES.nHFReference(address(), value); return this; }
        /** Sets the specified value to the {@code HFDecayRatio} field. */
        public FMOD_REVERB_PROPERTIES.Buffer HFDecayRatio(float value) { FMOD_REVERB_PROPERTIES.nHFDecayRatio(address(), value); return this; }
        /** Sets the specified value to the {@code Diffusion} field. */
        public FMOD_REVERB_PROPERTIES.Buffer Diffusion(float value) { FMOD_REVERB_PROPERTIES.nDiffusion(address(), value); return this; }
        /** Sets the specified value to the {@code Density} field. */
        public FMOD_REVERB_PROPERTIES.Buffer Density(float value) { FMOD_REVERB_PROPERTIES.nDensity(address(), value); return this; }
        /** Sets the specified value to the {@code LowShelfFrequency} field. */
        public FMOD_REVERB_PROPERTIES.Buffer LowShelfFrequency(float value) { FMOD_REVERB_PROPERTIES.nLowShelfFrequency(address(), value); return this; }
        /** Sets the specified value to the {@code LowShelfGain} field. */
        public FMOD_REVERB_PROPERTIES.Buffer LowShelfGain(float value) { FMOD_REVERB_PROPERTIES.nLowShelfGain(address(), value); return this; }
        /** Sets the specified value to the {@code HighCut} field. */
        public FMOD_REVERB_PROPERTIES.Buffer HighCut(float value) { FMOD_REVERB_PROPERTIES.nHighCut(address(), value); return this; }
        /** Sets the specified value to the {@code EarlyLateMix} field. */
        public FMOD_REVERB_PROPERTIES.Buffer EarlyLateMix(float value) { FMOD_REVERB_PROPERTIES.nEarlyLateMix(address(), value); return this; }
        /** Sets the specified value to the {@code WetLevel} field. */
        public FMOD_REVERB_PROPERTIES.Buffer WetLevel(float value) { FMOD_REVERB_PROPERTIES.nWetLevel(address(), value); return this; }

    }

}